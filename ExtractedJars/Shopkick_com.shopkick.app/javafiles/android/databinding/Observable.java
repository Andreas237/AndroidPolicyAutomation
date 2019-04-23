// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


public interface Observable
{
	public static abstract class OnPropertyChangedCallback
	{

		public abstract void onPropertyChanged(Observable observable, int i);

		public OnPropertyChangedCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract void addOnPropertyChangedCallback(OnPropertyChangedCallback onpropertychangedcallback);

	public abstract void removeOnPropertyChangedCallback(OnPropertyChangedCallback onpropertychangedcallback);
}
