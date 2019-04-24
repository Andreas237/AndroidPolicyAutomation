// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


// Referenced classes of package android.databinding:
//			CallbackRegistry, ObservableMap

public class MapChangeRegistry extends CallbackRegistry
{

	public MapChangeRegistry()
	{
		super(NOTIFIER_CALLBACK);
	//    0    0:aload_0         
	//    1    1:getstatic       #17  <Field CallbackRegistry$NotifierCallback NOTIFIER_CALLBACK>
	//    2    4:invokespecial   #21  <Method void CallbackRegistry(CallbackRegistry$NotifierCallback)>
	//    3    7:return          
	}

	public void notifyChange(ObservableMap observablemap, Object obj)
	{
		notifyCallbacks(((Object) (observablemap)), 0, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_2         
	//    4    4:invokevirtual   #27  <Method void notifyCallbacks(Object, int, Object)>
	//    5    7:return          
	}

	private static CallbackRegistry.NotifierCallback NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback() {

		public void onNotifyCallback(ObservableMap.OnMapChangedCallback onmapchangedcallback, ObservableMap observablemap, int i, Object obj)
		{
			onmapchangedcallback.onMapChanged(observablemap, obj);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload           4
		//    3    4:invokevirtual   #20  <Method void ObservableMap$OnMapChangedCallback.onMapChanged(ObservableMap, Object)>
		//    4    7:return          
		}

		public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
		{
			onNotifyCallback((ObservableMap.OnMapChangedCallback)obj, (ObservableMap)obj1, i, obj2);
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

	}
;

	static 
	{
	//    0    0:new             #7   <Class MapChangeRegistry$1>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void MapChangeRegistry$1()>
	//    3    7:putstatic       #17  <Field CallbackRegistry$NotifierCallback NOTIFIER_CALLBACK>
	//*   4   10:return          
	}
}
