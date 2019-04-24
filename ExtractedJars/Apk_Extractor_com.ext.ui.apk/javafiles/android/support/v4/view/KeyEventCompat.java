// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.KeyEvent;
import android.view.View;

public final class KeyEventCompat
{

	private KeyEventCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static boolean dispatch(KeyEvent keyevent, android.view.KeyEvent.Callback callback, Object obj, Object obj1)
	{
		return keyevent.dispatch(callback, (android.view.KeyEvent.DispatcherState)obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #14  <Class android.view.KeyEvent$DispatcherState>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #19  <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback, android.view.KeyEvent$DispatcherState, Object)>
	//    6   10:ireturn         
	}

	public static Object getKeyDispatcherState(View view)
	{
		return ((Object) (view.getKeyDispatcherState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//    2    4:areturn         
	}

	public static boolean hasModifiers(KeyEvent keyevent, int i)
	{
		return keyevent.hasModifiers(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #32  <Method boolean KeyEvent.hasModifiers(int)>
	//    3    5:ireturn         
	}

	public static boolean hasNoModifiers(KeyEvent keyevent)
	{
		return keyevent.hasNoModifiers();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method boolean KeyEvent.hasNoModifiers()>
	//    2    4:ireturn         
	}

	public static boolean isCtrlPressed(KeyEvent keyevent)
	{
		return keyevent.isCtrlPressed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method boolean KeyEvent.isCtrlPressed()>
	//    2    4:ireturn         
	}

	public static boolean isTracking(KeyEvent keyevent)
	{
		return keyevent.isTracking();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method boolean KeyEvent.isTracking()>
	//    2    4:ireturn         
	}

	public static boolean metaStateHasModifiers(int i, int j)
	{
		return KeyEvent.metaStateHasModifiers(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #47  <Method boolean KeyEvent.metaStateHasModifiers(int, int)>
	//    3    5:ireturn         
	}

	public static boolean metaStateHasNoModifiers(int i)
	{
		return KeyEvent.metaStateHasNoModifiers(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #50  <Method boolean KeyEvent.metaStateHasNoModifiers(int)>
	//    2    4:ireturn         
	}

	public static int normalizeMetaState(int i)
	{
		return KeyEvent.normalizeMetaState(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #54  <Method int KeyEvent.normalizeMetaState(int)>
	//    2    4:ireturn         
	}

	public static void startTracking(KeyEvent keyevent)
	{
		keyevent.startTracking();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method void KeyEvent.startTracking()>
	//    2    4:return          
	}
}
