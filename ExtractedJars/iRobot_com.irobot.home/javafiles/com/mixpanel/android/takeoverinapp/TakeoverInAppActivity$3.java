// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.takeoverinapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.mixpanel.android.a.f;
import com.mixpanel.android.mpmetrics.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.takeoverinapp:
//			TakeoverInAppActivity

class TakeoverInAppActivity$3
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		Object obj;
		String s;
		String s1;
		s1 = a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field InAppButton a>
	//    2    4:invokevirtual   #46  <Method String InAppButton.e()>
	//    3    7:astore          4
		s = null;
	//    4    9:aconst_null     
	//    5   10:astore_3        
		obj = null;
	//    6   11:aconst_null     
	//    7   12:astore_2        
		view = ((View) (s));
	//    8   13:aload_3         
	//    9   14:astore_1        
		if(s1 == null) goto _L2; else goto _L1
	//   10   15:aload           4
	//   11   17:ifnull          105
_L1:
		view = ((View) (s));
	//   12   20:aload_3         
	//   13   21:astore_1        
		if(s1.length() <= 0) goto _L2; else goto _L3
	//   14   22:aload           4
	//   15   24:invokevirtual   #52  <Method int String.length()>
	//   16   27:ifle            105
_L3:
		try
		{
			view = ((View) (Uri.parse(s1)));
	//   17   30:aload           4
	//   18   32:invokestatic    #58  <Method Uri Uri.parse(String)>
	//   19   35:astore_1        
		}
	//*  20   36:new             #60  <Class Intent>
	//*  21   39:dup             
	//*  22   40:ldc1            #62  <String "android.intent.action.VIEW">
	//*  23   42:aload_1         
	//*  24   43:invokespecial   #65  <Method void Intent(String, Uri)>
	//*  25   46:astore_1        
	//*  26   47:aload_0         
	//*  27   48:getfield        #22  <Field TakeoverInAppActivity d>
	//*  28   51:aload_1         
	//*  29   52:invokevirtual   #69  <Method void TakeoverInAppActivity.startActivity(Intent)>
	//*  30   55:goto            65
	//*  31   58:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
	//*  32   60:ldc1            #73  <String "User doesn't have an activity for notification URI">
	//*  33   62:invokestatic    #78  <Method void f.c(String, String)>
	//*  34   65:new             #80  <Class JSONObject>
	//*  35   68:dup             
	//*  36   69:invokespecial   #81  <Method void JSONObject()>
	//*  37   72:astore_1        
	//*  38   73:aload_1         
	//*  39   74:ldc1            #83  <String "url">
	//*  40   76:aload           4
	//*  41   78:invokevirtual   #87  <Method JSONObject JSONObject.put(String, Object)>
	//*  42   81:pop             
	//*  43   82:goto            105
	//*  44   85:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
	//*  45   87:ldc1            #89  <String "Can't put url into json properties">
	//*  46   89:invokestatic    #91  <Method void f.e(String, String)>
	//*  47   92:goto            105
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  48   95:astore_1        
		{
			f.c("MixpanelAPI.TakeoverInAppActivity", "Can't parse notification URI, will not take any action", ((Throwable) (view)));
	//   49   96:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
	//   50   98:ldc1            #93  <String "Can't parse notification URI, will not take any action">
	//   51  100:aload_1         
	//   52  101:invokestatic    #96  <Method void f.c(String, String, Throwable)>
			return;
	//   53  104:return          
		}
		try
		{
			view = ((View) (new Intent("android.intent.action.VIEW", ((Uri) (view)))));
			d.startActivity(((Intent) (view)));
		}
	//*  54  105:ldc1            #98  <String "primary">
	//*  55  107:astore_3        
	//*  56  108:aload_0         
	//*  57  109:getfield        #26  <Field InAppNotification b>
	//*  58  112:checkcast       #100 <Class TakeoverInAppNotification>
	//*  59  115:invokevirtual   #103 <Method int TakeoverInAppNotification.r()>
	//*  60  118:iconst_2        
	//*  61  119:icmpne          138
	//*  62  122:aload_0         
	//*  63  123:getfield        #28  <Field int c>
	//*  64  126:ifne            135
	//*  65  129:ldc1            #105 <String "secondary">
	//*  66  131:astore_3        
	//*  67  132:goto            138
	//*  68  135:ldc1            #98  <String "primary">
	//*  69  137:astore_3        
	//*  70  138:aload_1         
	//*  71  139:astore_2        
	//*  72  140:aload_1         
	//*  73  141:ifnonnull       152
	//*  74  144:new             #80  <Class JSONObject>
	//*  75  147:dup             
	//*  76  148:invokespecial   #81  <Method void JSONObject()>
	//*  77  151:astore_2        
	//*  78  152:aload_2         
	//*  79  153:astore_1        
	//*  80  154:aload_2         
	//*  81  155:ldc1            #107 <String "button">
	//*  82  157:aload_3         
	//*  83  158:invokevirtual   #87  <Method JSONObject JSONObject.put(String, Object)>
	//*  84  161:pop             
	//*  85  162:aload_2         
	//*  86  163:astore_1        
	//*  87  164:goto            174
	//*  88  167:ldc1            #71  <String "MixpanelAPI.TakeoverInAppActivity">
	//*  89  169:ldc1            #109 <String "Can't put button type into json properties">
	//*  90  171:invokestatic    #91  <Method void f.e(String, String)>
	//*  91  174:aload_0         
	//*  92  175:getfield        #22  <Field TakeoverInAppActivity d>
	//*  93  178:invokestatic    #112 <Method j TakeoverInAppActivity.b(TakeoverInAppActivity)>
	//*  94  181:invokevirtual   #117 <Method com.mixpanel.android.mpmetrics.j$c j.c()>
	//*  95  184:ldc1            #119 <String "$campaign_open">
	//*  96  186:aload_0         
	//*  97  187:getfield        #26  <Field InAppNotification b>
	//*  98  190:aload_1         
	//*  99  191:invokeinterface #124 <Method void com.mixpanel.android.mpmetrics.j$c.a(String, InAppNotification, JSONObject)>
	//* 100  196:aload_0         
	//* 101  197:getfield        #22  <Field TakeoverInAppActivity d>
	//* 102  200:invokevirtual   #127 <Method void TakeoverInAppActivity.finish()>
	//* 103  203:aload_0         
	//* 104  204:getfield        #22  <Field TakeoverInAppActivity d>
	//* 105  207:invokestatic    #130 <Method int TakeoverInAppActivity.a(TakeoverInAppActivity)>
	//* 106  210:invokestatic    #135 <Method void UpdateDisplayState.a(int)>
	//* 107  213:return          
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			f.c("MixpanelAPI.TakeoverInAppActivity", "User doesn't have an activity for notification URI");
		}
		view = ((View) (new JSONObject()));
		((JSONObject) (view)).put("url", ((Object) (s1)));
		  goto _L2
_L5:
		f.e("MixpanelAPI.TakeoverInAppActivity", "Can't put url into json properties");
_L2:
		s = "primary";
		if(((TakeoverInAppNotification)b).r() == 2)
			if(c == 0)
				s = "secondary";
			else
				s = "primary";
		obj = ((Object) (view));
		if(view != null)
			break MISSING_BLOCK_LABEL_152;
		obj = ((Object) (new JSONObject()));
		view = ((View) (obj));
		((JSONObject) (obj)).put("button", ((Object) (s)));
		view = ((View) (obj));
		  goto _L4
_L6:
		f.e("MixpanelAPI.TakeoverInAppActivity", "Can't put button type into json properties");
_L4:
		TakeoverInAppActivity.b(d).c().a("$campaign_open", b, ((JSONObject) (view)));
		d.finish();
		UpdateDisplayState.a(TakeoverInAppActivity.a(d));
		return;
	//* 108  214:astore_1        
	//* 109  215:goto            58
		view;
	//  110  218:astore_1        
		view = ((View) (obj));
	//  111  219:aload_2         
	//  112  220:astore_1        
		  goto _L5
	//* 113  221:goto            85
		JSONException jsonexception;
		jsonexception;
	//  114  224:astore_2        
		  goto _L5
	//* 115  225:goto            85
		jsonexception;
	//  116  228:astore_2        
		  goto _L6
	//* 117  229:goto            167
	}

	final InAppButton a;
	final InAppNotification b;
	final int c;
	final TakeoverInAppActivity d;

	TakeoverInAppActivity$3(TakeoverInAppActivity takeoverinappactivity, InAppButton inappbutton, InAppNotification inappnotification, int i)
	{
		d = takeoverinappactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field TakeoverInAppActivity d>
		a = inappbutton;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field InAppButton a>
		b = inappnotification;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field InAppNotification b>
		c = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field int c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
