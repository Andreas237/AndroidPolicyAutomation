// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.internal:
//			Validate, FragmentWrapper, Utility, DialogPresenter, 
//			CallbackManagerImpl, Logger, AppCall

public abstract class FacebookDialogBase
	implements FacebookDialog
{
	protected abstract class ModeHandler
	{

		public abstract boolean canShow(Object obj, boolean flag);

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
		fragmentWrapper = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #45  <Field FragmentWrapper fragmentWrapper>
		requestCode = i;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:putfield        #47  <Field int requestCode>
	//   14   25:return          
	}

	protected FacebookDialogBase(FragmentWrapper fragmentwrapper, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		Validate.notNull(((Object) (fragmentwrapper)), "fragmentWrapper");
	//    2    4:aload_1         
	//    3    5:ldc1            #49  <String "fragmentWrapper">
	//    4    7:invokestatic    #41  <Method void Validate.notNull(Object, String)>
		fragmentWrapper = fragmentwrapper;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #45  <Field FragmentWrapper fragmentWrapper>
		activity = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #43  <Field Activity activity>
		requestCode = i;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:putfield        #47  <Field int requestCode>
		if(fragmentwrapper.getActivity() != null)
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #55  <Method Activity FragmentWrapper.getActivity()>
	//*  16   29:ifnull          33
			return;
	//   17   32:return          
		else
			throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
	//   18   33:new             #57  <Class IllegalArgumentException>
	//   19   36:dup             
	//   20   37:ldc1            #59  <String "Cannot use a fragment that is not attached to an activity">
	//   21   39:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   22   42:athrow          
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
	//   18   39:ifeq            110
			obj2 = ((Object) ((ModeHandler)iterator.next()));
	//   19   42:aload           6
	//   20   44:invokeinterface #93  <Method Object Iterator.next()>
	//   21   49:checkcast       #9   <Class FacebookDialogBase$ModeHandler>
	//   22   52:astore          4
			if(!flag && !Utility.areObjectsEqual(((ModeHandler) (obj2)).getMode(), obj1) || !((ModeHandler) (obj2)).canShow(obj, true))
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
	//*  33   76:iconst_1        
	//*  34   77:invokevirtual   #106 <Method boolean FacebookDialogBase$ModeHandler.canShow(Object, boolean)>
	//*  35   80:ifne            86
				continue;
	//   36   83:goto            28
			try
			{
				obj2 = ((Object) (((ModeHandler) (obj2)).createAppCall(obj)));
	//   37   86:aload           4
	//   38   88:aload_1         
	//   39   89:invokevirtual   #110 <Method AppCall FacebookDialogBase$ModeHandler.createAppCall(Object)>
	//   40   92:astore          4
			}
	//*  41   94:goto            110
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  42   97:astore_1        
			{
				obj2 = ((Object) (createBaseAppCall()));
	//   43   98:aload_0         
	//   44   99:invokevirtual   #114 <Method AppCall createBaseAppCall()>
	//   45  102:astore          4
				DialogPresenter.setupAppCallForValidationError(((AppCall) (obj2)), ((FacebookException) (obj)));
	//   46  104:aload           4
	//   47  106:aload_1         
	//   48  107:invokestatic    #120 <Method void DialogPresenter.setupAppCallForValidationError(AppCall, FacebookException)>
			}
			break;
		} while(true);
		obj = obj2;
	//   49  110:aload           4
	//   50  112:astore_1        
		if(obj2 == null)
	//*  51  113:aload           4
	//*  52  115:ifnonnull       127
		{
			obj = ((Object) (createBaseAppCall()));
	//   53  118:aload_0         
	//   54  119:invokevirtual   #114 <Method AppCall createBaseAppCall()>
	//   55  122:astore_1        
			DialogPresenter.setupAppCallForCannotShowError(((AppCall) (obj)));
	//   56  123:aload_1         
	//   57  124:invokestatic    #124 <Method void DialogPresenter.setupAppCallForCannotShowError(AppCall)>
		}
		return ((AppCall) (obj));
	//   58  127:aload_1         
	//   59  128:areturn         
	}

	public boolean canShow(Object obj)
	{
		return canShowImpl(obj, BASE_AUTOMATIC_MODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field Object BASE_AUTOMATIC_MODE>
	//    3    5:invokevirtual   #129 <Method boolean canShowImpl(Object, Object)>
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
	//*  14   32:ifeq            78
		{
			ModeHandler modehandler = (ModeHandler)iterator.next();
	//   15   35:aload           4
	//   16   37:invokeinterface #93  <Method Object Iterator.next()>
	//   17   42:checkcast       #9   <Class FacebookDialogBase$ModeHandler>
	//   18   45:astore          5
			if((flag || Utility.areObjectsEqual(modehandler.getMode(), obj1)) && modehandler.canShow(obj, false))
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
	//*  29   69:iconst_0        
	//*  30   70:invokevirtual   #106 <Method boolean FacebookDialogBase$ModeHandler.canShow(Object, boolean)>
	//*  31   73:ifeq            25
				return true;
	//   32   76:iconst_1        
	//   33   77:ireturn         
		}

		return false;
	//   34   78:iconst_0        
	//   35   79:ireturn         
	}

	protected abstract AppCall createBaseAppCall();

	protected Activity getActivityContext()
	{
		Object obj = ((Object) (activity));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Activity activity>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((Activity) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
		obj = ((Object) (fragmentWrapper));
	//    7   11:aload_0         
	//    8   12:getfield        #45  <Field FragmentWrapper fragmentWrapper>
	//    9   15:astore_1        
		if(obj != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          25
			return ((FragmentWrapper) (obj)).getActivity();
	//   12   20:aload_1         
	//   13   21:invokevirtual   #55  <Method Activity FragmentWrapper.getActivity()>
	//   14   24:areturn         
		else
			return null;
	//   15   25:aconst_null     
	//   16   26:areturn         
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
		if(callbackmanager instanceof CallbackManagerImpl)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #138 <Class CallbackManagerImpl>
	//*   2    4:ifeq            17
		{
			registerCallbackImpl((CallbackManagerImpl)callbackmanager, facebookcallback);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #138 <Class CallbackManagerImpl>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #142 <Method void registerCallbackImpl(CallbackManagerImpl, FacebookCallback)>
			return;
	//    8   16:return          
		} else
		{
			throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
	//    9   17:new             #75  <Class FacebookException>
	//   10   20:dup             
	//   11   21:ldc1            #144 <String "Unexpected CallbackManager, please use the provided Factory.">
	//   12   23:invokespecial   #145 <Method void FacebookException(String)>
	//   13   26:athrow          
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
		if(!FacebookSdk.isFacebookRequestCode(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #160 <Method boolean FacebookSdk.isFacebookRequestCode(int)>
	//*   2    4:ifne            13
		{
			requestCode = i;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #47  <Field int requestCode>
			return;
	//    6   12:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #162 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #163 <Method void StringBuilder()>
	//   10   20:astore_2        
			stringbuilder.append("Request code ");
	//   11   21:aload_2         
	//   12   22:ldc1            #165 <String "Request code ">
	//   13   24:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(i);
	//   15   28:aload_2         
	//   16   29:iload_1         
	//   17   30:invokevirtual   #172 <Method StringBuilder StringBuilder.append(int)>
	//   18   33:pop             
			stringbuilder.append(" cannot be within the range reserved by the Facebook SDK.");
	//   19   34:aload_2         
	//   20   35:ldc1            #174 <String " cannot be within the range reserved by the Facebook SDK.">
	//   21   37:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   41:new             #57  <Class IllegalArgumentException>
	//   24   44:dup             
	//   25   45:aload_2         
	//   26   46:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #62  <Method void IllegalArgumentException(String)>
	//   28   52:athrow          
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
	//*   6    8:ifnull          35
		{
			obj1 = ((Object) (fragmentWrapper));
	//    7   11:aload_0         
	//    8   12:getfield        #45  <Field FragmentWrapper fragmentWrapper>
	//    9   15:astore_2        
			if(obj1 != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          26
			{
				DialogPresenter.present(((AppCall) (obj)), ((FragmentWrapper) (obj1)));
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokestatic    #191 <Method void DialogPresenter.present(AppCall, FragmentWrapper)>
				return;
	//   15   25:return          
			} else
			{
				DialogPresenter.present(((AppCall) (obj)), activity);
	//   16   26:aload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #43  <Field Activity activity>
	//   19   31:invokestatic    #194 <Method void DialogPresenter.present(AppCall, Activity)>
				return;
	//   20   34:return          
			}
		}
		Log.e("FacebookDialog", "No code path should ever result in a null appCall");
	//   21   35:ldc1            #16  <String "FacebookDialog">
	//   22   37:ldc1            #196 <String "No code path should ever result in a null appCall">
	//   23   39:invokestatic    #202 <Method int Log.e(String, String)>
	//   24   42:pop             
		if(!FacebookSdk.isDebugEnabled())
	//*  25   43:invokestatic    #205 <Method boolean FacebookSdk.isDebugEnabled()>
	//*  26   46:ifne            50
			return;
	//   27   49:return          
		else
			throw new IllegalStateException("No code path should ever result in a null appCall");
	//   28   50:new             #207 <Class IllegalStateException>
	//   29   53:dup             
	//   30   54:ldc1            #196 <String "No code path should ever result in a null appCall">
	//   31   56:invokespecial   #208 <Method void IllegalStateException(String)>
	//   32   59:athrow          
	}

	protected void startActivityForResult(Intent intent, int i)
	{
label0:
		{
label1:
			{
label2:
				{
					Activity activity1 = activity;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Activity activity>
	//    2    4:astore_3        
					if(activity1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
					{
						activity1.startActivityForResult(intent, i);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #215 <Method void Activity.startActivityForResult(Intent, int)>
					} else
	//*   9   15:goto            71
					{
						FragmentWrapper fragmentwrapper = fragmentWrapper;
	//   10   18:aload_0         
	//   11   19:getfield        #45  <Field FragmentWrapper fragmentWrapper>
	//   12   22:astore_3        
						if(fragmentwrapper == null)
							break label1;
	//   13   23:aload_3         
	//   14   24:ifnull          82
						if(fragmentwrapper.getNativeFragment() != null)
	//*  15   27:aload_3         
	//*  16   28:invokevirtual   #219 <Method Fragment FragmentWrapper.getNativeFragment()>
	//*  17   31:ifnull          49
						{
							fragmentWrapper.getNativeFragment().startActivityForResult(intent, i);
	//   18   34:aload_0         
	//   19   35:getfield        #45  <Field FragmentWrapper fragmentWrapper>
	//   20   38:invokevirtual   #219 <Method Fragment FragmentWrapper.getNativeFragment()>
	//   21   41:aload_1         
	//   22   42:iload_2         
	//   23   43:invokevirtual   #222 <Method void Fragment.startActivityForResult(Intent, int)>
						} else
	//*  24   46:goto            71
						{
							if(fragmentWrapper.getSupportFragment() == null)
								break label2;
	//   25   49:aload_0         
	//   26   50:getfield        #45  <Field FragmentWrapper fragmentWrapper>
	//   27   53:invokevirtual   #226 <Method android.support.v4.app.Fragment FragmentWrapper.getSupportFragment()>
	//   28   56:ifnull          76
							fragmentWrapper.getSupportFragment().startActivityForResult(intent, i);
	//   29   59:aload_0         
	//   30   60:getfield        #45  <Field FragmentWrapper fragmentWrapper>
	//   31   63:invokevirtual   #226 <Method android.support.v4.app.Fragment FragmentWrapper.getSupportFragment()>
	//   32   66:aload_1         
	//   33   67:iload_2         
	//   34   68:invokevirtual   #229 <Method void android.support.v4.app.Fragment.startActivityForResult(Intent, int)>
						}
					}
					intent = null;
	//   35   71:aconst_null     
	//   36   72:astore_1        
					break label0;
	//   37   73:goto            85
				}
				intent = "Failed to find Activity or Fragment to startActivityForResult ";
	//   38   76:ldc1            #231 <String "Failed to find Activity or Fragment to startActivityForResult ">
	//   39   78:astore_1        
				break label0;
	//   40   79:goto            85
			}
			intent = "Failed to find Activity or Fragment to startActivityForResult ";
	//   41   82:ldc1            #231 <String "Failed to find Activity or Fragment to startActivityForResult ">
	//   42   84:astore_1        
		}
		if(intent != null)
	//*  43   85:aload_1         
	//*  44   86:ifnull          105
			Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 6, ((Object)this).getClass().getName(), ((String) (intent)));
	//   45   89:getstatic       #237 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   46   92:bipush          6
	//   47   94:aload_0         
	//   48   95:invokevirtual   #241 <Method Class Object.getClass()>
	//   49   98:invokevirtual   #246 <Method String Class.getName()>
	//   50  101:aload_1         
	//   51  102:invokestatic    #252 <Method void Logger.log(LoggingBehavior, int, String, String)>
	//   52  105:return          
	}

	protected static final Object BASE_AUTOMATIC_MODE = new Object();
	private static final String TAG = "FacebookDialog";
	private final Activity activity;
	private final FragmentWrapper fragmentWrapper;
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
