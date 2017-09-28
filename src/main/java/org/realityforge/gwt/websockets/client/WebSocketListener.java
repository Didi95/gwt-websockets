package org.realityforge.gwt.websockets.client;

import com.google.gwt.typedarrays.shared.ArrayBuffer;



/**
 * Interface for receiving WebSocket events.
 */
public interface WebSocketListener
{
  /**
   * Fire a Connected event.
   */
  void onOpen( WebSocket webSocket );

  /**
   * Fire a Close event.
   */
  void onClose( WebSocket webSocket, boolean wasClean, int code, String reason );

  /**
   * Fire a Message event.
   */
  void onMessage( WebSocket webSocket, String data );

  /**
   * Fire a Message event.
   */
  void onMessage( WebSocket webSocket, ArrayBuffer data );

  /**
   * Fire an Error event.
   */
  void onError( WebSocket webSocket );
}
