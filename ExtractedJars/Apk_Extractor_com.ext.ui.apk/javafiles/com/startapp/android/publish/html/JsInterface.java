// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.html;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.a.g;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class JsInterface
{

	public JsInterface(Context context, Runnable runnable, b b)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		processed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean processed>
		inAppBrowserEnabled = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #24  <Field boolean inAppBrowserEnabled>
		closeCallback = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #26  <Field Runnable closeCallback>
		clickCallback = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #28  <Field Runnable clickCallback>
		enableScrollCallback = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #30  <Field Runnable enableScrollCallback>
		closeCallback = runnable;
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:putfield        #26  <Field Runnable closeCallback>
		mContext = context;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:putfield        #32  <Field Context mContext>
		params = b;
	//   23   39:aload_0         
	//   24   40:aload_3         
	//   25   41:putfield        #34  <Field b params>
	//   26   44:return          
	}

	public JsInterface(Context context, Runnable runnable, b b, boolean flag)
	{
		this(context, runnable, b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #38  <Method void JsInterface(Context, Runnable, b)>
		inAppBrowserEnabled = flag;
	//    5    7:aload_0         
	//    6    8:iload           4
	//    7   10:putfield        #24  <Field boolean inAppBrowserEnabled>
	//    8   13:return          
	}

	public JsInterface(Context context, Runnable runnable, Runnable runnable1, b b)
	{
		this(context, runnable, b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #38  <Method void JsInterface(Context, Runnable, b)>
		clickCallback = runnable1;
	//    5    8:aload_0         
	//    6    9:aload_3         
	//    7   10:putfield        #28  <Field Runnable clickCallback>
	//    8   13:return          
	}

	public JsInterface(Context context, Runnable runnable, Runnable runnable1, Runnable runnable2, b b, boolean flag)
	{
		this(context, runnable, b, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           5
	//    4    5:iload           6
	//    5    7:invokespecial   #42  <Method void JsInterface(Context, Runnable, b, boolean)>
		clickCallback = runnable1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Runnable clickCallback>
		enableScrollCallback = runnable2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field Runnable enableScrollCallback>
	//   12   21:return          
	}

	public void closeAd()
	{
		if(processed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean processed>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			processed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #22  <Field boolean processed>
			closeCallback.run();
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field Runnable closeCallback>
	//    9   17:invokeinterface #49  <Method void Runnable.run()>
			return;
	//   10   22:return          
		}
	}

	public void enableScroll(String s)
	{
		if(enableScrollCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field Runnable enableScrollCallback>
	//*   2    4:ifnull          16
			enableScrollCallback.run();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field Runnable enableScrollCallback>
	//    5   11:invokeinterface #49  <Method void Runnable.run()>
	//    6   16:return          
	}

	public void externalLinks(String s)
	{
		if(inAppBrowserEnabled && i.a(256L))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean inAppBrowserEnabled>
	//*   2    4:ifeq            26
	//*   3    7:ldc2w           #54  <Long 256L>
	//*   4   10:invokestatic    #61  <Method boolean i.a(long)>
	//*   5   13:ifeq            26
		{
			c.b(mContext, s, ((String) (null)));
	//    6   16:aload_0         
	//    7   17:getfield        #32  <Field Context mContext>
	//    8   20:aload_1         
	//    9   21:aconst_null     
	//   10   22:invokestatic    #67  <Method void c.b(Context, String, String)>
			return;
	//   11   25:return          
		} else
		{
			c.c(mContext, s);
	//   12   26:aload_0         
	//   13   27:getfield        #32  <Field Context mContext>
	//   14   30:aload_1         
	//   15   31:invokestatic    #71  <Method void c.c(Context, String)>
			return;
	//   16   34:return          
		}
	}

	public void openApp(String s, String s1, String s2)
	{
		if(s != null && !TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #83  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    8:ifne            23
			c.b(mContext, s, params);
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field Context mContext>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #34  <Field b params>
	//   10   20:invokestatic    #86  <Method void c.b(Context, String, b)>
		s1 = ((String) (mContext.getPackageManager().getLaunchIntentForPackage(s1)));
	//   11   23:aload_0         
	//   12   24:getfield        #32  <Field Context mContext>
	//   13   27:invokevirtual   #92  <Method PackageManager Context.getPackageManager()>
	//   14   30:aload_2         
	//   15   31:invokevirtual   #98  <Method Intent PackageManager.getLaunchIntentForPackage(String)>
	//   16   34:astore_2        
		if(s2 != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          104
			try
			{
				s2 = ((String) (new JSONObject(s2)));
	//   19   39:new             #100 <Class JSONObject>
	//   20   42:dup             
	//   21   43:aload_3         
	//   22   44:invokespecial   #102 <Method void JSONObject(String)>
	//   23   47:astore_3        
				String s3;
				for(Iterator iterator = ((JSONObject) (s2)).keys(); iterator.hasNext(); ((Intent) (s1)).putExtra(s3, String.valueOf(((JSONObject) (s2)).get(s3))))
	//*  24   48:aload_3         
	//*  25   49:invokevirtual   #106 <Method Iterator JSONObject.keys()>
	//*  26   52:astore          4
	//*  27   54:aload           4
	//*  28   56:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//*  29   61:ifeq            104
					s3 = String.valueOf(iterator.next());
	//   30   64:aload           4
	//   31   66:invokeinterface #116 <Method Object Iterator.next()>
	//   32   71:invokestatic    #122 <Method String String.valueOf(Object)>
	//   33   74:astore          5

	//   34   76:aload_2         
	//   35   77:aload           5
	//   36   79:aload_3         
	//   37   80:aload           5
	//   38   82:invokevirtual   #126 <Method Object JSONObject.get(String)>
	//   39   85:invokestatic    #122 <Method String String.valueOf(Object)>
	//   40   88:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//   41   91:pop             
			}
	//*  42   92:goto            54
			// Misplaced declaration of an exception variable
			catch(String s2)
	//*  43   95:astore_3        
			{
				g.a(6, "Couldn't parse intent details json!", ((Throwable) (s2)));
	//   44   96:bipush          6
	//   45   98:ldc1            #134 <String "Couldn't parse intent details json!">
	//   46  100:aload_3         
	//   47  101:invokestatic    #139 <Method void g.a(int, String, Throwable)>
			}
		try
		{
			mContext.startActivity(((Intent) (s1)));
	//   48  104:aload_0         
	//   49  105:getfield        #32  <Field Context mContext>
	//   50  108:aload_2         
	//   51  109:invokevirtual   #143 <Method void Context.startActivity(Intent)>
		}
	//*  52  112:aload_0         
	//*  53  113:getfield        #28  <Field Runnable clickCallback>
	//*  54  116:ifnull          128
	//*  55  119:aload_0         
	//*  56  120:getfield        #28  <Field Runnable clickCallback>
	//*  57  123:invokeinterface #49  <Method void Runnable.run()>
	//*  58  128:return          
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  59  129:astore_2        
		{
			s2 = c.a(s, ((String) (null)));
	//   60  130:aload_1         
	//   61  131:aconst_null     
	//   62  132:invokestatic    #146 <Method String c.a(String, String)>
	//   63  135:astore_3        
			f.a(mContext, d.b, "JsInterface.openApp - Couldn't start activity", ((Exception) (s1)).getMessage(), s2);
	//   64  136:aload_0         
	//   65  137:getfield        #32  <Field Context mContext>
	//   66  140:getstatic       #151 <Field d d.b>
	//   67  143:ldc1            #153 <String "JsInterface.openApp - Couldn't start activity">
	//   68  145:aload_2         
	//   69  146:invokevirtual   #157 <Method String Exception.getMessage()>
	//   70  149:aload_3         
	//   71  150:invokestatic    #162 <Method void f.a(Context, d, String, String, String)>
			g.a(6, (new StringBuilder()).append("Cannot find activity to handle url: [").append(s).append("]").toString());
	//   72  153:bipush          6
	//   73  155:new             #164 <Class StringBuilder>
	//   74  158:dup             
	//   75  159:invokespecial   #165 <Method void StringBuilder()>
	//   76  162:ldc1            #167 <String "Cannot find activity to handle url: [">
	//   77  164:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   78  167:aload_1         
	//   79  168:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   80  171:ldc1            #173 <String "]">
	//   81  173:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   82  176:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   83  179:invokestatic    #179 <Method void g.a(int, String)>
		}
		if(clickCallback != null)
			clickCallback.run();
	//*  84  182:goto            112
	}

	private Runnable clickCallback;
	private Runnable closeCallback;
	private Runnable enableScrollCallback;
	protected boolean inAppBrowserEnabled;
	protected Context mContext;
	private b params;
	private boolean processed;
}
