// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.app.*;
import android.view.*;
import java.lang.reflect.*;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

public class KeyEventDispatcher
{
	public static interface Component
	{

		public abstract boolean superDispatchKeyEvent(KeyEvent keyevent);
	}


	private KeyEventDispatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private static boolean actionBarOnMenuKeyEventPre28(ActionBar actionbar, KeyEvent keyevent)
	{
		if(!sActionBarFieldsFetched)
	//*   0    0:getstatic       #35  <Field boolean sActionBarFieldsFetched>
	//*   1    3:ifne            31
		{
			boolean flag;
			Method method;
			try
			{
				sActionBarOnMenuKeyMethod = ((Object) (actionbar)).getClass().getMethod("onMenuKeyEvent", new Class[] {
					android/view/KeyEvent
				});
	//    2    6:aload_0         
	//    3    7:invokevirtual   #39  <Method Class Object.getClass()>
	//    4   10:ldc1            #41  <String "onMenuKeyEvent">
	//    5   12:iconst_1        
	//    6   13:anewarray       Class[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:ldc1            #45  <Class KeyEvent>
	//   10   20:aastore         
	//   11   21:invokevirtual   #49  <Method Method Class.getMethod(String, Class[])>
	//   12   24:putstatic       #51  <Field Method sActionBarOnMenuKeyMethod>
			}
	//*  13   27:iconst_1        
	//*  14   28:putstatic       #35  <Field boolean sActionBarFieldsFetched>
	//*  15   31:getstatic       #51  <Field Method sActionBarOnMenuKeyMethod>
	//*  16   34:astore_3        
	//*  17   35:aload_3         
	//*  18   36:ifnull          61
	//*  19   39:aload_3         
	//*  20   40:aload_0         
	//*  21   41:iconst_1        
	//*  22   42:anewarray       Object[]
	//*  23   45:dup             
	//*  24   46:iconst_0        
	//*  25   47:aload_1         
	//*  26   48:aastore         
	//*  27   49:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
	//*  28   52:checkcast       #59  <Class Boolean>
	//*  29   55:invokevirtual   #63  <Method boolean Boolean.booleanValue()>
	//*  30   58:istore_2        
	//*  31   59:iload_2         
	//*  32   60:ireturn         
	//*  33   61:iconst_0        
	//*  34   62:ireturn         
			catch(NoSuchMethodException nosuchmethodexception) { }
	//   35   63:astore_3        
			sActionBarFieldsFetched = true;
		}
		method = sActionBarOnMenuKeyMethod;
		if(method == null)
			break MISSING_BLOCK_LABEL_61;
		try
		{
			flag = ((Boolean)method.invoke(((Object) (actionbar)), new Object[] {
				keyevent
			})).booleanValue();
		}
	//*  36   64:goto            27
		// Misplaced declaration of an exception variable
		catch(ActionBar actionbar)
	//*  37   67:astore_0        
		{
			return false;
	//   38   68:iconst_0        
	//   39   69:ireturn         
		}
		return flag;
		return false;
	}

	private static boolean activitySuperDispatchKeyEventPre28(Activity activity, KeyEvent keyevent)
	{
		activity.onUserInteraction();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method void Activity.onUserInteraction()>
		Object obj = ((Object) (activity.getWindow()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #74  <Method Window Activity.getWindow()>
	//    4    8:astore_2        
		if(((Window) (obj)).hasFeature(8))
	//*   5    9:aload_2         
	//*   6   10:bipush          8
	//*   7   12:invokevirtual   #80  <Method boolean Window.hasFeature(int)>
	//*   8   15:ifeq            46
		{
			ActionBar actionbar = activity.getActionBar();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #84  <Method ActionBar Activity.getActionBar()>
	//   11   22:astore_3        
			if(keyevent.getKeyCode() == 82 && actionbar != null && actionBarOnMenuKeyEventPre28(actionbar, keyevent))
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #88  <Method int KeyEvent.getKeyCode()>
	//*  14   27:bipush          82
	//*  15   29:icmpne          46
	//*  16   32:aload_3         
	//*  17   33:ifnull          46
	//*  18   36:aload_3         
	//*  19   37:aload_1         
	//*  20   38:invokestatic    #90  <Method boolean actionBarOnMenuKeyEventPre28(ActionBar, KeyEvent)>
	//*  21   41:ifeq            46
				return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
		}
		if(((Window) (obj)).superDispatchKeyEvent(keyevent))
	//*  24   46:aload_2         
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #94  <Method boolean Window.superDispatchKeyEvent(KeyEvent)>
	//*  27   51:ifeq            56
			return true;
	//   28   54:iconst_1        
	//   29   55:ireturn         
		obj = ((Object) (((Window) (obj)).getDecorView()));
	//   30   56:aload_2         
	//   31   57:invokevirtual   #98  <Method View Window.getDecorView()>
	//   32   60:astore_2        
		if(ViewCompat.dispatchUnhandledKeyEventBeforeCallback(((View) (obj)), keyevent))
	//*  33   61:aload_2         
	//*  34   62:aload_1         
	//*  35   63:invokestatic    #104 <Method boolean ViewCompat.dispatchUnhandledKeyEventBeforeCallback(View, KeyEvent)>
	//*  36   66:ifeq            71
			return true;
	//   37   69:iconst_1        
	//   38   70:ireturn         
		if(obj != null)
	//*  39   71:aload_2         
	//*  40   72:ifnull          83
			obj = ((Object) (((View) (obj)).getKeyDispatcherState()));
	//   41   75:aload_2         
	//   42   76:invokevirtual   #110 <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   43   79:astore_2        
		else
	//*  44   80:goto            85
			obj = null;
	//   45   83:aconst_null     
	//   46   84:astore_2        
		return keyevent.dispatch(((android.view.KeyEvent.Callback) (activity)), ((android.view.KeyEvent.DispatcherState) (obj)), ((Object) (activity)));
	//   47   85:aload_1         
	//   48   86:aload_0         
	//   49   87:aload_2         
	//   50   88:aload_0         
	//   51   89:invokevirtual   #114 <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback, android.view.KeyEvent$DispatcherState, Object)>
	//   52   92:ireturn         
	}

	private static boolean dialogSuperDispatchKeyEventPre28(Dialog dialog, KeyEvent keyevent)
	{
		Object obj = ((Object) (getDialogKeyListenerPre28(dialog)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #120 <Method android.content.DialogInterface$OnKeyListener getDialogKeyListenerPre28(Dialog)>
	//    2    4:astore_2        
		if(obj != null && ((android.content.DialogInterface.OnKeyListener) (obj)).onKey(((android.content.DialogInterface) (dialog)), keyevent.getKeyCode(), keyevent))
	//*   3    5:aload_2         
	//*   4    6:ifnull          26
	//*   5    9:aload_2         
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #88  <Method int KeyEvent.getKeyCode()>
	//*   9   15:aload_1         
	//*  10   16:invokeinterface #126 <Method boolean android.content.DialogInterface$OnKeyListener.onKey(android.content.DialogInterface, int, KeyEvent)>
	//*  11   21:ifeq            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		obj = ((Object) (dialog.getWindow()));
	//   14   26:aload_0         
	//   15   27:invokevirtual   #129 <Method Window Dialog.getWindow()>
	//   16   30:astore_2        
		if(((Window) (obj)).superDispatchKeyEvent(keyevent))
	//*  17   31:aload_2         
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #94  <Method boolean Window.superDispatchKeyEvent(KeyEvent)>
	//*  20   36:ifeq            41
			return true;
	//   21   39:iconst_1        
	//   22   40:ireturn         
		obj = ((Object) (((Window) (obj)).getDecorView()));
	//   23   41:aload_2         
	//   24   42:invokevirtual   #98  <Method View Window.getDecorView()>
	//   25   45:astore_2        
		if(ViewCompat.dispatchUnhandledKeyEventBeforeCallback(((View) (obj)), keyevent))
	//*  26   46:aload_2         
	//*  27   47:aload_1         
	//*  28   48:invokestatic    #104 <Method boolean ViewCompat.dispatchUnhandledKeyEventBeforeCallback(View, KeyEvent)>
	//*  29   51:ifeq            56
			return true;
	//   30   54:iconst_1        
	//   31   55:ireturn         
		if(obj != null)
	//*  32   56:aload_2         
	//*  33   57:ifnull          68
			obj = ((Object) (((View) (obj)).getKeyDispatcherState()));
	//   34   60:aload_2         
	//   35   61:invokevirtual   #110 <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   36   64:astore_2        
		else
	//*  37   65:goto            70
			obj = null;
	//   38   68:aconst_null     
	//   39   69:astore_2        
		return keyevent.dispatch(((android.view.KeyEvent.Callback) (dialog)), ((android.view.KeyEvent.DispatcherState) (obj)), ((Object) (dialog)));
	//   40   70:aload_1         
	//   41   71:aload_0         
	//   42   72:aload_2         
	//   43   73:aload_0         
	//   44   74:invokevirtual   #114 <Method boolean KeyEvent.dispatch(android.view.KeyEvent$Callback, android.view.KeyEvent$DispatcherState, Object)>
	//   45   77:ireturn         
	}

	public static boolean dispatchBeforeHierarchy(View view, KeyEvent keyevent)
	{
		return ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(view, keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #134 <Method boolean ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(View, KeyEvent)>
	//    3    5:ireturn         
	}

	public static boolean dispatchKeyEvent(Component component, View view, android.view.Window.Callback callback, KeyEvent keyevent)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(component == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       9
			return false;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   6    9:getstatic       #144 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   12:bipush          28
	//*   8   14:icmplt          25
			return component.superDispatchKeyEvent(keyevent);
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokeinterface #145 <Method boolean KeyEventDispatcher$Component.superDispatchKeyEvent(KeyEvent)>
	//   12   24:ireturn         
		if(callback instanceof Activity)
	//*  13   25:aload_2         
	//*  14   26:instanceof      #67  <Class Activity>
	//*  15   29:ifeq            41
			return activitySuperDispatchKeyEventPre28((Activity)callback, keyevent);
	//   16   32:aload_2         
	//   17   33:checkcast       #67  <Class Activity>
	//   18   36:aload_3         
	//   19   37:invokestatic    #147 <Method boolean activitySuperDispatchKeyEventPre28(Activity, KeyEvent)>
	//   20   40:ireturn         
		if(callback instanceof Dialog)
	//*  21   41:aload_2         
	//*  22   42:instanceof      #128 <Class Dialog>
	//*  23   45:ifeq            57
			return dialogSuperDispatchKeyEventPre28((Dialog)callback, keyevent);
	//   24   48:aload_2         
	//   25   49:checkcast       #128 <Class Dialog>
	//   26   52:aload_3         
	//   27   53:invokestatic    #149 <Method boolean dialogSuperDispatchKeyEventPre28(Dialog, KeyEvent)>
	//   28   56:ireturn         
		if(view != null && ViewCompat.dispatchUnhandledKeyEventBeforeCallback(view, keyevent) || component.superDispatchKeyEvent(keyevent))
	//*  29   57:aload_1         
	//*  30   58:ifnull          69
	//*  31   61:aload_1         
	//*  32   62:aload_3         
	//*  33   63:invokestatic    #104 <Method boolean ViewCompat.dispatchUnhandledKeyEventBeforeCallback(View, KeyEvent)>
	//*  34   66:ifne            79
	//*  35   69:aload_0         
	//*  36   70:aload_3         
	//*  37   71:invokeinterface #145 <Method boolean KeyEventDispatcher$Component.superDispatchKeyEvent(KeyEvent)>
	//*  38   76:ifeq            82
			flag = true;
	//   39   79:iconst_1        
	//   40   80:istore          4
		return flag;
	//   41   82:iload           4
	//   42   84:ireturn         
	}

	private static android.content.DialogInterface.OnKeyListener getDialogKeyListenerPre28(Dialog dialog)
	{
		if(!sDialogFieldsFetched)
	//*   0    0:getstatic       #153 <Field boolean sDialogFieldsFetched>
	//*   1    3:ifne            27
		{
			Field field;
			try
			{
				sDialogKeyListenerField = ((Class) (android/app/Dialog)).getDeclaredField("mOnKeyListener");
	//    2    6:ldc1            #128 <Class Dialog>
	//    3    8:ldc1            #155 <String "mOnKeyListener">
	//    4   10:invokevirtual   #159 <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #161 <Field Field sDialogKeyListenerField>
				sDialogKeyListenerField.setAccessible(true);
	//    6   16:getstatic       #161 <Field Field sDialogKeyListenerField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #167 <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:iconst_1        
	//*  10   24:putstatic       #153 <Field boolean sDialogFieldsFetched>
	//*  11   27:getstatic       #161 <Field Field sDialogKeyListenerField>
	//*  12   30:astore_1        
	//*  13   31:aload_1         
	//*  14   32:ifnull          46
	//*  15   35:aload_1         
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #171 <Method Object Field.get(Object)>
	//*  18   40:checkcast       #122 <Class android.content.DialogInterface$OnKeyListener>
	//*  19   43:astore_0        
	//*  20   44:aload_0         
	//*  21   45:areturn         
	//*  22   46:aconst_null     
	//*  23   47:areturn         
			catch(NoSuchFieldException nosuchfieldexception) { }
	//   24   48:astore_1        
			sDialogFieldsFetched = true;
		}
		field = sDialogKeyListenerField;
		if(field == null)
			break MISSING_BLOCK_LABEL_46;
		dialog = ((Dialog) ((android.content.DialogInterface.OnKeyListener)field.get(((Object) (dialog)))));
		return ((android.content.DialogInterface.OnKeyListener) (dialog));
_L2:
		return null;
	//*  25   49:goto            23
		dialog;
	//   26   52:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  27   53:goto            46
	}

	private static boolean sActionBarFieldsFetched = false;
	private static Method sActionBarOnMenuKeyMethod;
	private static boolean sDialogFieldsFetched = false;
	private static Field sDialogKeyListenerField;

	static 
	{
	//    0    0:return          
	}
}
