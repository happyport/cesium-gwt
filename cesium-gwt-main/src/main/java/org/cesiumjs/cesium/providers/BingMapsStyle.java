package org.cesiumjs.cesium.providers;

import com.google.gwt.core.client.JavaScriptObject;

public final class BingMapsStyle extends JavaScriptObject {

  public final static String AERIAL = init("AERIAL");
  public final static String AERIAL_WITH_LABELS = init("AERIAL_WITH_LABELS");
  public final static String COLLINS_BART = init("COLLINS_BART");
  public final static String ORDNANCE_SURVEY = init("ORDNANCE_SURVEY");
  public final static String ROAD = init("ROAD");

  private final native static String init(String constName) /*-{
    return Cesium.BingMapsStyle[constName];
  }-*/;
  
  protected BingMapsStyle(){}
}
