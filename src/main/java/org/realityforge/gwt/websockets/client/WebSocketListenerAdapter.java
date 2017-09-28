package org.realityforge.gwt.websockets.client;

import com.google.gwt.typedarrays.shared.ArrayBuffer;



/**
 * Adapter listener to make sub-classing easier.
 */
public abstract class WebSocketListenerAdapter
  implements WebSocketListener
{
  /**
   * {@inheritDoc}
   */
  @Override
  public void onOpen( final WebSocket webSocket )
  {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void onClose( final WebSocket webSocket,
                       final boolean wasClean,
                       final int code,
                       final String reason )
  {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void onMessage( final WebSocket webSocket, final String data )
  {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void onMessage( final WebSocket webSocket, final ArrayBuffer data )
  {
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void onError( final WebSocket webSocket )
  {
  }
}
