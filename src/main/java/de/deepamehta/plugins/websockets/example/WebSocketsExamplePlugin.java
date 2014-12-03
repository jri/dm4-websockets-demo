package de.deepamehta.plugins.websockets.example;

import de.deepamehta.plugins.websockets.event.WebsocketTextMessageListener;
import de.deepamehta.plugins.websockets.service.WebSocketsService;

import de.deepamehta.core.Topic;
import de.deepamehta.core.model.TopicModel;
import de.deepamehta.core.osgi.PluginActivator;
import de.deepamehta.core.service.Inject;
import de.deepamehta.core.service.event.PostUpdateTopicListener;

import java.util.logging.Logger;



public class WebSocketsExamplePlugin extends PluginActivator implements PostUpdateTopicListener,
                                                                        WebsocketTextMessageListener {

    // ---------------------------------------------------------------------------------------------- Instance Variables

    @Inject
    private WebSocketsService webSocketsService;

    private Logger logger = Logger.getLogger(getClass().getName());

    // -------------------------------------------------------------------------------------------------- Public Methods

    // *** Listener Implementations ***

    @Override
    public void postUpdateTopic(Topic topic, TopicModel newModel, TopicModel oldModel) {
        webSocketsService.broadcast(getUri(), topic.toJSON().toString());
    }

    @Override
    public void websocketTextMessage(String message) {
        logger.info("### Receiving message from WebSocket client: \"" + message + "\"");
    }
}
