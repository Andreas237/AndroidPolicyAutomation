// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			MapChangeRegistry, ObservableMap

static final class MapChangeRegistry$1 extends ifierCallback
{

	public void onNotifyCallback(hangedCallback hangedcallback, ObservableMap observablemap, int i, Object obj)
	{
		hangedcallback.onMapChanged(observablemap, obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload           4
	//    3    4:invokevirtual   #20  <Method void ObservableMap$OnMapChangedCallback.onMapChanged(ObservableMap, Object)>
	//    4    7:return          
	}

	public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
	{
		onNotifyCallback((hangedCallback)obj, (ObservableMap)obj1, i, obj2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class ObservableMap$OnMapChangedCallback>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class ObservableMap>
	//    5    9:iload_3         
	//    6   10:aload           4
	//    7   12:invokevirtual   #25  <Method void onNotifyCallback(ObservableMap$OnMapChangedCallback, ObservableMap, int, Object)>
	//    8   15:return          
	}

	MapChangeRegistry$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void CallbackRegistry$NotifierCallback()>
	//    2    4:return          
	}
}
