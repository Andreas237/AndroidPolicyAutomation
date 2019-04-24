// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.support.v4.app.FragmentActivity;
import com.gigya.socialize.*;
import com.gigya.socialize.android.event.GSConnectUIListener;
import com.gigya.socialize.android.event.GSLoginUIListener;
import com.gigya.socialize.android.event.GSUIListener;
import com.gigya.socialize.android.login.ProviderSelection;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$5
	implements com.gigya.socialize.android.login.Selection.ProviderSelectionHandler
{

	public void onCancel(ProviderSelection providerselection, FragmentActivity fragmentactivity)
	{
		fragmentactivity.finish();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #50  <Method void FragmentActivity.finish()>
		if(val$uiListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field GSUIListener val$uiListener>
	//*   4    8:ifnull          25
			val$uiListener.onClose(true, val$context);
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field GSUIListener val$uiListener>
	//    7   15:iconst_1        
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Object val$context>
	//   10   20:invokeinterface #56  <Method void GSUIListener.onClose(boolean, Object)>
	//   11   25:return          
	}

	public void onError(ProviderSelection providerselection, FragmentActivity fragmentactivity, GSObject gsobject)
	{
		fragmentactivity.finish();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #50  <Method void FragmentActivity.finish()>
		if(val$uiListener != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #33  <Field GSUIListener val$uiListener>
	//*   4    8:ifnull          25
			val$uiListener.onClose(false, val$context);
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field GSUIListener val$uiListener>
	//    7   15:iconst_0        
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field Object val$context>
	//   10   20:invokeinterface #56  <Method void GSUIListener.onClose(boolean, Object)>
	//   11   25:return          
	}

	public void onSelect(final ProviderSelection selector, FragmentActivity fragmentactivity, final String provider, String s)
	{
		if(provider == null)
			break MISSING_BLOCK_LABEL_154;
	//    0    0:aload_3         
	//    1    1:ifnull          154
		if(provider.length() == 0)
	//*   2    4:aload_3         
	//*   3    5:invokevirtual   #68  <Method int String.length()>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		selector.showProgressDialog("Logging In");
	//    6   12:aload_1         
	//    7   13:ldc1            #70  <String "Logging In">
	//    8   15:invokevirtual   #76  <Method void ProviderSelection.showProgressDialog(String)>
		selector.setDisableSelection(true);
	//    9   18:aload_1         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #80  <Method void ProviderSelection.setDisableSelection(boolean)>
		val$params.put("provider", provider);
	//   12   23:aload_0         
	//   13   24:getfield        #31  <Field GSObject val$params>
	//   14   27:ldc1            #82  <String "provider">
	//   15   29:aload_3         
	//   16   30:invokevirtual   #88  <Method void GSObject.put(String, String)>
		val$params.put("captionText", s);
	//   17   33:aload_0         
	//   18   34:getfield        #31  <Field GSObject val$params>
	//   19   37:ldc1            #90  <String "captionText">
	//   20   39:aload           4
	//   21   41:invokevirtual   #88  <Method void GSObject.put(String, String)>
		provider = ((String) (new GSResponseListener() {

			public void onGSResponse(String s1, GSResponse gsresponse, Object obj)
			{
				selector.dismissProgressDialog();
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field ProviderSelection val$selector>
			//    2    4:invokevirtual   #36  <Method void ProviderSelection.dismissProgressDialog()>
				boolean flag;
				if(gsresponse.getErrorCode() == 0x30d41)
			//*   3    7:aload_2         
			//*   4    8:invokevirtual   #42  <Method int GSResponse.getErrorCode()>
			//*   5   11:ldc1            #43  <Int 0x30d41>
			//*   6   13:icmpne          22
					flag = true;
			//    7   16:iconst_1        
			//    8   17:istore          4
				else
			//*   9   19:goto            25
					flag = false;
			//   10   22:iconst_0        
			//   11   23:istore          4
				if(flag)
			//*  12   25:iload           4
			//*  13   27:ifeq            40
				{
					selector.show();
			//   14   30:aload_0         
			//   15   31:getfield        #23  <Field ProviderSelection val$selector>
			//   16   34:invokevirtual   #46  <Method void ProviderSelection.show()>
				} else
			//*  17   37:goto            71
				{
					selector.finish();
			//   18   40:aload_0         
			//   19   41:getfield        #23  <Field ProviderSelection val$selector>
			//   20   44:invokevirtual   #49  <Method void ProviderSelection.finish()>
					if(uiListener != null)
			//*  21   47:aload_0         
			//*  22   48:getfield        #21  <Field GSAPI$5 this$1>
			//*  23   51:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
			//*  24   54:ifnull          71
						uiListener.onClose(false, obj);
			//   25   57:aload_0         
			//   26   58:getfield        #21  <Field GSAPI$5 this$1>
			//   27   61:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
			//   28   64:iconst_0        
			//   29   65:aload_3         
			//   30   66:invokeinterface #59  <Method void GSUIListener.onClose(boolean, Object)>
				}
				if(uiListener != null)
			//*  31   71:aload_0         
			//*  32   72:getfield        #21  <Field GSAPI$5 this$1>
			//*  33   75:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
			//*  34   78:ifnull          187
					if(gsresponse.getErrorCode() == 0)
			//*  35   81:aload_2         
			//*  36   82:invokevirtual   #42  <Method int GSResponse.getErrorCode()>
			//*  37   85:ifne            168
					{
						if(mode == GSLoginRequest.LoginRequestType.login)
			//*  38   88:aload_0         
			//*  39   89:getfield        #21  <Field GSAPI$5 this$1>
			//*  40   92:getfield        #63  <Field GSLoginRequest$LoginRequestType GSAPI$5.val$mode>
			//*  41   95:getstatic       #68  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
			//*  42   98:if_acmpne       128
							((GSLoginUIListener)uiListener).onLogin(provider, gsresponse.getData(), obj);
			//   43  101:aload_0         
			//   44  102:getfield        #21  <Field GSAPI$5 this$1>
			//   45  105:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
			//   46  108:checkcast       #70  <Class GSLoginUIListener>
			//   47  111:aload_0         
			//   48  112:getfield        #25  <Field String val$provider>
			//   49  115:aload_2         
			//   50  116:invokevirtual   #74  <Method GSObject GSResponse.getData()>
			//   51  119:aload_3         
			//   52  120:invokeinterface #78  <Method void GSLoginUIListener.onLogin(String, GSObject, Object)>
						else
			//*  53  125:goto            187
						if(mode == GSLoginRequest.LoginRequestType.addConnection)
			//*  54  128:aload_0         
			//*  55  129:getfield        #21  <Field GSAPI$5 this$1>
			//*  56  132:getfield        #63  <Field GSLoginRequest$LoginRequestType GSAPI$5.val$mode>
			//*  57  135:getstatic       #81  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
			//*  58  138:if_acmpne       187
							((GSConnectUIListener)uiListener).onConnectionAdded(provider, gsresponse.getData(), obj);
			//   59  141:aload_0         
			//   60  142:getfield        #21  <Field GSAPI$5 this$1>
			//   61  145:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
			//   62  148:checkcast       #83  <Class GSConnectUIListener>
			//   63  151:aload_0         
			//   64  152:getfield        #25  <Field String val$provider>
			//   65  155:aload_2         
			//   66  156:invokevirtual   #74  <Method GSObject GSResponse.getData()>
			//   67  159:aload_3         
			//   68  160:invokeinterface #86  <Method void GSConnectUIListener.onConnectionAdded(String, GSObject, Object)>
					} else
			//*  69  165:goto            187
					if(!flag)
			//*  70  168:iload           4
			//*  71  170:ifne            187
						uiListener.onError(gsresponse, obj);
			//   72  173:aload_0         
			//   73  174:getfield        #21  <Field GSAPI$5 this$1>
			//   74  177:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
			//   75  180:aload_2         
			//   76  181:aload_3         
			//   77  182:invokeinterface #90  <Method void GSUIListener.onError(GSResponse, Object)>
				selector.setDisableSelection(false);
			//   78  187:aload_0         
			//   79  188:getfield        #23  <Field ProviderSelection val$selector>
			//   80  191:iconst_0        
			//   81  192:invokevirtual   #94  <Method void ProviderSelection.setDisableSelection(boolean)>
			//   82  195:return          
			}

			final GSAPI._cls5 this$1;
			final String val$provider;
			final ProviderSelection val$selector;

			
			{
				this$1 = GSAPI._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSAPI$5 this$1>
				selector = providerselection;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ProviderSelection val$selector>
				provider = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$provider>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//   22   44:new             #13  <Class GSAPI$5$1>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:aload_3         
	//   27   51:invokespecial   #93  <Method void GSAPI$5$1(GSAPI$5, ProviderSelection, String)>
	//   28   54:astore_3        
		if(val$mode == equest.LoginRequestType.addConnection)
	//*  29   55:aload_0         
	//*  30   56:getfield        #35  <Field GSLoginRequest$LoginRequestType val$mode>
	//*  31   59:getstatic       #98  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
	//*  32   62:if_acmpne       84
		{
			addConnection(((android.app.Activity) (fragmentactivity)), val$params, ((GSResponseListener) (provider)), val$context);
	//   33   65:aload_0         
	//   34   66:getfield        #29  <Field GSAPI this$0>
	//   35   69:aload_2         
	//   36   70:aload_0         
	//   37   71:getfield        #31  <Field GSObject val$params>
	//   38   74:aload_3         
	//   39   75:aload_0         
	//   40   76:getfield        #37  <Field Object val$context>
	//   41   79:invokevirtual   #101 <Method GSLoginRequest GSAPI.addConnection(android.app.Activity, GSObject, GSResponseListener, Object)>
	//   42   82:pop             
			return;
	//   43   83:return          
		}
		try
		{
			login(((android.app.Activity) (fragmentactivity)), val$params, ((GSResponseListener) (provider)), val$context);
	//   44   84:aload_0         
	//   45   85:getfield        #29  <Field GSAPI this$0>
	//   46   88:aload_2         
	//   47   89:aload_0         
	//   48   90:getfield        #31  <Field GSObject val$params>
	//   49   93:aload_3         
	//   50   94:aload_0         
	//   51   95:getfield        #37  <Field Object val$context>
	//   52   98:invokevirtual   #104 <Method GSLoginRequest GSAPI.login(android.app.Activity, GSObject, GSResponseListener, Object)>
	//   53  101:pop             
			return;
	//   54  102:return          
		}
	//*  55  103:aload_0         
	//*  56  104:getfield        #33  <Field GSUIListener val$uiListener>
	//*  57  107:ifnull          149
	//*  58  110:aload_0         
	//*  59  111:getfield        #33  <Field GSUIListener val$uiListener>
	//*  60  114:new             #106 <Class GSResponse>
	//*  61  117:dup             
	//*  62  118:aload_0         
	//*  63  119:getfield        #39  <Field String val$method>
	//*  64  122:new             #84  <Class GSObject>
	//*  65  125:dup             
	//*  66  126:invokespecial   #107 <Method void GSObject()>
	//*  67  129:ldc1            #108 <Int 0x7a121>
	//*  68  131:ldc1            #108 <Int 0x7a121>
	//*  69  133:invokestatic    #112 <Method String GSResponse.getErrorMessage(int)>
	//*  70  136:aconst_null     
	//*  71  137:invokespecial   #115 <Method void GSResponse(String, GSObject, int, String, com.gigya.socialize.GSLogger)>
	//*  72  140:aload_0         
	//*  73  141:getfield        #37  <Field Object val$context>
	//*  74  144:invokeinterface #118 <Method void GSUIListener.onError(GSResponse, Object)>
	//*  75  149:aload_1         
	//*  76  150:iconst_0        
	//*  77  151:invokevirtual   #80  <Method void ProviderSelection.setDisableSelection(boolean)>
	//*  78  154:return          
		// Misplaced declaration of an exception variable
		catch(FragmentActivity fragmentactivity) { }
	//   79  155:astore_2        
		if(val$uiListener != null)
			val$uiListener.onError(new GSResponse(val$method, new GSObject(), 0x7a121, GSResponse.getErrorMessage(0x7a121), ((com.gigya.socialize.GSLogger) (null))), val$context);
		selector.setDisableSelection(false);
	//*  80  156:goto            103
	}

	public void onShow(ProviderSelection providerselection, FragmentActivity fragmentactivity)
	{
		if(val$uiListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field GSUIListener val$uiListener>
	//*   2    4:ifnull          20
			val$uiListener.onLoad(val$context);
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field GSUIListener val$uiListener>
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field Object val$context>
	//    7   15:invokeinterface #123 <Method void GSUIListener.onLoad(Object)>
	//    8   20:return          
	}

	final GSAPI this$0;
	final Object val$context;
	final String val$method;
	final equest.LoginRequestType val$mode;
	final GSObject val$params;
	final GSUIListener val$uiListener;

	GSAPI$5()
	{
		this$0 = final_gsapi;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field GSAPI this$0>
		val$params = gsobject;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #31  <Field GSObject val$params>
		val$uiListener = gsuilistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #33  <Field GSUIListener val$uiListener>
		val$mode = loginrequesttype;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #35  <Field GSLoginRequest$LoginRequestType val$mode>
		val$context = obj;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #37  <Field Object val$context>
		val$method = String.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #39  <Field String val$method>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #42  <Method void Object()>
	//   20   37:return          
	}
}
