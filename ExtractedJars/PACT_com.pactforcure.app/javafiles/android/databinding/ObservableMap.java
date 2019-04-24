// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import java.util.Map;

public interface ObservableMap
	extends Map
{
	public static abstract class OnMapChangedCallback
	{

		public abstract void onMapChanged(ObservableMap observablemap, Object obj);

		public OnMapChangedCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract void addOnMapChangedCallback(OnMapChangedCallback onmapchangedcallback);

	public abstract void removeOnMapChangedCallback(OnMapChangedCallback onmapchangedcallback);
}
