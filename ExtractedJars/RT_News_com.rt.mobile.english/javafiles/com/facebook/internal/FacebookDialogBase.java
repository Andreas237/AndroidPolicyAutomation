// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.facebook.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.internal:
//			Validate, Utility, DialogPresenter, CallbackManagerImpl, 
//			AppCall

public abstract class FacebookDialogBase
	implements FacebookDialog
{
	protected abstract class ModeHandler
	{

		public abstract boolean canShow(Object obj);

		public abstract AppCall createAppCall(Object obj);

		public Object getMode()
		{
			return FacebookDialogBase.BASE_AUTOMATIC_MODE;
		//    0    0:getstatic       #27  <Field Object FacebookDialogBase.BASE_AUTOMATIC_MODE>
		//    1    3:areturn         
		}

		final FacebookDialogBase this$0;

		protected ModeHandler()
		{
			this$0 = FacebookDialogBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field FacebookDialogBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Object()>
		//    5    9:return          
		}
	}


	protected FacebookDialogBase(Activity activity1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		Validate.notNull(((Object) (activity1)), "activity");
	//    2    4:aload_1         
	//    3    5:ldc1            #35  <String "activity">
	//    4    7:invokestatic    #41  <Method void Validate.notNull(Object, String)>
		activity = activity1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #43  <Field Activity activity>
		fragment = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #45  <Field Fragment fragment>
		requestCode = i;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:putfield        #47  <Field int requestCode>
	//   14   25:return          
	}

	protected FacebookDialogBase(Fragment fragment1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		Validate.notNull(((Object) (fragment1)), "fragment");
	//    2    4:aload_1         
	//    3    5:ldc1            #49  <String "fragment">
	//    4    7:invokestatic    #41  <Method void Validate.notNull(Object, String)>
		fragment = fragment1;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #45  <Field Fragment fragment>
		activity = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #43  <Field Activity activity>
		requestCode = i;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:putfield        #47  <Field int requestCode>
		if(fragment1.getActivity() == null)
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #55  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
	//*  16   29:ifnonnull       42
			throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
	//   17   32:new             #57  <Class IllegalArgumentException>
	//   18   35:dup             
	//   19   36:ldc1            #59  <String "Cannot use a fragment that is not attached to an activity">
	//   20   38:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   21   41:athrow          
		else
			return;
	//   22   42:return          
	}

	private List cachedModeHandlers()
	{
		if(modeHandlers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field List modeHandlers>
	//*   2    4:ifnonnull       15
			modeHandlers = getOrderedModeHandlers();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method List getOrderedModeHandlers()>
	//    6   12:putfield        #66  <Field List modeHandlers>
		return modeHandlers;
	//    7   15:aload_0         
	//    8   16:getfield        #66  <Field List modeHandlers>
	//    9   19:areturn         
	}

	private AppCall createAppCallForMode(Object obj, Object obj1)
	{
		boolean flag;
		if(obj1 == BASE_AUTOMATIC_MODE)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #32  <Field Object BASE_AUTOMATIC_MODE>
	//*   2    4:if_acmpne       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Object obj3 = null;
	//    8   14:aconst_null     
	//    9   15:astore          5
		Iterator iterator = cachedModeHandlers().iterator();
	//   10   17:aload_0         
	//   11   18:invokespecial   #77  <Method List cachedModeHandlers()>
	//   12   21:invokeinterface #83  <Method Iterator List.iterator()>
	//   13   26:astore          6
		Object obj2;
		do
		{
			obj2 = ((Object) (obj3));
	//   14   28:aload           5
	//   15   30:astore          4
			if(!iterator.hasNext())
				break;
	//   16   32:aload           6
	//   17   34:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//   18   39:ifeq            109
			obj2 = ((Object) ((ModeHandler)iterator.next()));
	//   19   42:aload           6
	//   20   44:invokeinterface #93  <Method Object Iterator.next()>
	//   21   49:checkcast       #9   <Class FacebookDialogBase$ModeHandler>
	//   22   52:astore          4
			if(!flag && !Utility.areObjectsEqual(((ModeHandler) (obj2)).getMode(), obj1) || !((ModeHandler) (obj2)).canShow(obj))
	//*  23   54:iload_3         
	//*  24   55:ifne            73
	//*  25   58:aload           4
	//*  26   60:invokevirtual   #96  <Method Object FacebookDialogBase$ModeHandler.getMode()>
	//*  27   63:aload_2         
	//*  28   64:invokestatic    #102 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  29   67:ifne            73
	//*  30   70:goto            28
	//*  31   73:aload           4
	//*  32   75:aload_1         
	//*  33   76:invokevirtual   #106 <Method boolean FacebookDialogBase$ModeHandler.canShow(Object)>
	//*  34   79:ifne            85
				continue;
	//   35   82:goto            28
			try
			{
				obj2 = ((Object) (((ModeHandler) (obj2)).createAppCall(obj)));
	//   36   85:aload           4
	//   37   87:aload_1         
	//   38   88:invokevirtual   #110 <Method AppCall FacebookDialogBase$ModeHandler.createAppCall(Object)>
	//   39   91:astore          4
			}
	//*  40   93:goto            109
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  41   96:astore_1        
			{
				obj2 = ((Object) (createBaseAppCall()));
	//   42   97:aload_0         
	//   43   98:invokevirtual   #114 <Method AppCall createBaseAppCall()>
	//   44  101:astore          4
				DialogPresenter.setupAppCallForValidationError(((AppCall) (obj2)), ((FacebookException) (obj)));
	//   45  103:aload           4
	//   46  105:aload_1         
	//   47  106:invokestatic    #120 <Method void DialogPresenter.setupAppCallForValidationError(AppCall, FacebookException)>
			}
			break;
		} while(true);
		obj = obj2;
	//   48  109:aload           4
	//   49  111:astore_1        
		if(obj2 == null)
	//*  50  112:aload           4
	//*  51  114:ifnonnull       126
		{
			obj = ((Object) (createBaseAppCall()));
	//   52  117:aload_0         
	//   53  118:invokevirtual   #114 <Method AppCall createBaseAppCall()>
	//   54  121:astore_1        
			DialogPresenter.setupAppCallForCannotShowError(((AppCall) (obj)));
	//   55  122:aload_1         
	//   56  123:invokestatic    #124 <Method void DialogPresenter.setupAppCallForCannotShowError(AppCall)>
		}
		return ((AppCall) (obj));
	//   57  126:aload_1         
	//   58  127:areturn         
	}

	public boolean canShow(Object obj)
	{
		return canShowImpl(obj, BASE_AUTOMATIC_MODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field Object BASE_AUTOMATIC_MODE>
	//    3    5:invokevirtual   #128 <Method boolean canShowImpl(Object, Object)>
	//    4    8:ireturn         
	}

	protected boolean canShowImpl(Object obj, Object obj1)
	{
		boolean flag;
		if(obj1 == BASE_AUTOMATIC_MODE)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #32  <Field Object BASE_AUTOMATIC_MODE>
	//*   2    4:if_acmpne       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		for(Iterator iterator = cachedModeHandlers().iterator(); iterator.hasNext();)
	//*   8   14:aload_0         
	//*   9   15:invokespecial   #77  <Method List cachedModeHandlers()>
	//*  10   18:invokeinterface #83  <Method Iterator List.iterator()>
	//*  11   23:astore          4
	//*  12   25:aload           4
	//*  13   27:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//*  14   32:ifeq            77
		{
			ModeHandler modehandler = (ModeHandler)iterator.next();
	//   15   35:aload           4
	//   16   37:invokeinterface #93  <Method Object Iterator.next()>
	//   17   42:checkcast       #9   <Class FacebookDialogBase$ModeHandler>
	//   18   45:astore          5
			if((flag || Utility.areObjectsEqual(modehandler.getMode(), obj1)) && modehandler.canShow(obj))
	//*  19   47:iload_3         
	//*  20   48:ifne            66
	//*  21   51:aload           5
	//*  22   53:invokevirtual   #96  <Method Object FacebookDialogBase$ModeHandler.getMode()>
	//*  23   56:aload_2         
	//*  24   57:invokestatic    #102 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  25   60:ifne            66
	//*  26   63:goto            25
	//*  27   66:aload           5
	//*  28   68:aload_1         
	//*  29   69:invokevirtual   #106 <Method boolean FacebookDialogBase$ModeHandler.canShow(Object)>
	//*  30   72:ifeq            25
				return true;
	//   31   75:iconst_1        
	//   32   76:ireturn         
		}

		return false;
	//   33   77:iconst_0        
	//   34   78:ireturn         
	}

	protected abstract AppCall createBaseAppCall();

	protected Activity getActivityContext()
	{
		if(activity != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Activity activity>
	//*   2    4:ifnull          12
			return activity;
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field Activity activity>
	//    5   11:areturn         
		if(fragment != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #45  <Field Fragment fragment>
	//*   8   16:ifnull          27
			return ((Activity) (fragment.getActivity()));
	//    9   19:aload_0         
	//   10   20:getfield        #45  <Field Fragment fragment>
	//   11   23:invokevirtual   #55  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	protected abstract List getOrderedModeHandlers();

	public int getRequestCode()
	{
		return requestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int requestCode>
	//    2    4:ireturn         
	}

	public final void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback)
	{
		if(!(callbackmanager instanceof CallbackManagerImpl))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #138 <Class CallbackManagerImpl>
	//*   2    4:ifne            17
		{
			throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
	//    3    7:new             #75  <Class FacebookException>
	//    4   10:dup             
	//    5   11:ldc1            #140 <String "Unexpected CallbackManager, please use the provided Factory.">
	//    6   13:invokespecial   #141 <Method void FacebookException(String)>
	//    7   16:athrow          
		} else
		{
			registerCallbackImpl((CallbackManagerImpl)callbackmanager, facebookcallback);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:checkcast       #138 <Class CallbackManagerImpl>
	//   11   22:aload_2         
	//   12   23:invokevirtual   #145 <Method void registerCallbackImpl(CallbackManagerImpl, FacebookCallback)>
			return;
	//   13   26:return          
		}
	}

	public final void registerCallback(CallbackManager callbackmanager, FacebookCallback facebookcallback, int i)
	{
		setRequestCode(i);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #151 <Method void setRequestCode(int)>
		registerCallback(callbackmanager, facebookcallback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #153 <Method void registerCallback(CallbackManager, FacebookCallback)>
	//    7   11:return          
	}

	protected abstract void registerCallbackImpl(CallbackManagerImpl callbackmanagerimpl, FacebookCallback facebookcallback);

	protected void setRequestCode(int i)
	{
		if(FacebookSdk.isFacebookRequestCode(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #160 <Method boolean FacebookSdk.isFacebookRequestCode(int)>
	//*   2    4:ifeq            47
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #162 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #163 <Method void StringBuilder()>
	//    6   14:astore_2        
			stringbuilder.append("Request code ");
	//    7   15:aload_2         
	//    8   16:ldc1            #165 <String "Request code ">
	//    9   18:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(i);
	//   11   22:aload_2         
	//   12   23:iload_1         
	//   13   24:invokevirtual   #172 <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
			stringbuilder.append(" cannot be within the range reserved by the Facebook SDK.");
	//   15   28:aload_2         
	//   16   29:ldc1            #174 <String " cannot be within the range reserved by the Facebook SDK.">
	//   17   31:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   19   35:new             #57  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_2         
	//   22   40:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			requestCode = i;
	//   25   47:aload_0         
	//   26   48:iload_1         
	//   27   49:putfield        #47  <Field int requestCode>
			return;
	//   28   52:return          
		}
	}

	public void show(Object obj)
	{
		showImpl(obj, BASE_AUTOMATIC_MODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field Object BASE_AUTOMATIC_MODE>
	//    3    5:invokevirtual   #184 <Method void showImpl(Object, Object)>
	//    4    8:return          
	}

	protected void showImpl(Object obj, Object obj1)
	{
		obj = ((Object) (createAppCallForMode(obj, obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #187 <Method AppCall createAppCallForMode(Object, Object)>
	//    4    6:astore_1        
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          36
			if(fragment != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #45  <Field Fragment fragment>
	//*   9   15:ifnull          27
			{
				DialogPresenter.present(((AppCall) (obj)), fragment);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #45  <Field Fragment fragment>
	//   13   23:invokestatic    #191 <Method void DialogPresenter.present(AppCall, Fragment)>
				return;
	//   14   26:return          
			} else
			{
				DialogPresenter.present(((AppCall) (obj)), activity);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #43  <Field Activity activity>
	//   18   32:invokestatic    #194 <Method void DialogPresenter.present(AppCall, Activity)>
				return;
	//   19   35:return          
			}
		Log.e("FacebookDialog", "No code path should ever result in a null appCall");
	//   20   36:ldc1            #16  <String "FacebookDialog">
	//   21   38:ldc1            #196 <String "No code path should ever result in a null appCall">
	//   22   40:invokestatic    #202 <Method int Log.e(String, String)>
	//   23   43:pop             
		if(FacebookSdk.isDebugEnabled())
	//*  24   44:invokestatic    #205 <Method boolean FacebookSdk.isDebugEnabled()>
	//*  25   47:ifeq            60
			throw new IllegalStateException("No code path should ever result in a null appCall");
	//   26   50:new             #207 <Class IllegalStateException>
	//   27   53:dup             
	//   28   54:ldc1            #196 <String "No code path should ever result in a null appCall">
	//   29   56:invokespecial   #208 <Method void IllegalStateException(String)>
	//   30   59:athrow          
		else
			return;
	//   31   60:return          
	}

	protected static final Object BASE_AUTOMATIC_MODE = new Object();
	private static final String TAG = "FacebookDialog";
	private final Activity activity;
	private final Fragment fragment;
	private List modeHandlers;
	private int requestCode;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Object()>
	//    3    7:putstatic       #32  <Field Object BASE_AUTOMATIC_MODE>
	//*   4   10:return          
	}
}
