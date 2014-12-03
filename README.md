
DeepaMehta 4 WebSockets Example
===============================

A simple DeepaMehta 4 plugin that demonstrates the usage of WebSockets.

* Provides a minimal HTML page that acts as a WebSocket client.
* Provides a server-side part that listens to topic update events and pushes them to all connected WebSocket clients.

DeepaMehta 4 is a platform for collaboration and knowledge management.  
<https://github.com/jri/deepamehta>


Install
-------

1. Install the DeepaMehta 4 WebSockets plugin:  
   <https://github.com/jri/dm4-websockets>

2. Install this example plugin.

3. Start DeepaMehta.


Run
---

1. Open the WebSocket client:  
   <http://localhost:8080/de.deepamehta.websockets-example/>

   A simple HTML page appears.  
   It opens a WebSocket connection to `ws://localhost:8081/` and sends a greeting message.

   In the server log you'll see:

        Jan 11, 2014 5:38:26 PM de.deepamehta.plugins.websockets.WebSocketsServer$PluginWebSocket onOpen
        INFO: ### Opening a WebSocket connection for plugin "de.deepamehta.websockets-example"

        Jan 11, 2014 5:38:26 PM de.deepamehta.plugins.websockets.example.WebSocketsExamplePlugin websocketTextMessage
        INFO: ### Receiving message from WebSocket client: "Hello WebSocket server!"

2. In the WebSocket client: open the browser's web console. You'll see:

        Opening WebSocket connection to ws://localhost:8081/

   Further messages will appear here soon.

3. In another browser window (or in another browser): open the DeepaMehta Webclient and log in.  
   <http://localhost:8080/de.deepamehta.webclient/>

4. In the DeepaMehta Webclient: create or edit any topics.  
   All topic update events are broadcasted to all connected WebSocket clients. The events appear in their web consoles.


Version History
---------------

**0.2.2** -- Dec 3, 2014

* Compatible with DeepaMehta 4.4 and DeepaMehta 4 WebSockets 0.2.2

**0.2.1** -- Jun 8, 2014

* Compatible with DeepaMehta 4.3 and DeepaMehta 4 WebSockets 0.2.1

**0.2** -- Feb 18, 2014

* Compatible with DeepaMehta 4.2 and DeepaMehta 4 WebSockets 0.2


------------
Jörg Richter  
Dec 3, 2014
