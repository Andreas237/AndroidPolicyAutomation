// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.*;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.h;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.r;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xw, zo, zp, zm, 
//			zq, wx

public class xu extends xw
{

	public xu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void xw()>
	//    2    4:return          
	}

	public final Drawable a(Context context, Bitmap bitmap, boolean flag, float f)
	{
		RuntimeException runtimeexception;
		if(flag && f > 0.0F && f <= 25F)
	//*   0    0:iload_3         
	//*   1    1:ifeq            139
	//*   2    4:fload           4
	//*   3    6:fconst_0        
	//*   4    7:fcmpg           
	//*   5    8:ifle            139
	//*   6   11:fload           4
	//*   7   13:ldc1            #17  <Float 25F>
	//*   8   15:fcmpl           
	//*   9   16:ifle            22
	//*  10   19:goto            139
		{
			Object obj;
			try
			{
				Object obj2 = ((Object) (Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false)));
	//   11   22:aload_2         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #23  <Method int Bitmap.getWidth()>
	//   14   27:aload_2         
	//   15   28:invokevirtual   #26  <Method int Bitmap.getHeight()>
	//   16   31:iconst_0        
	//   17   32:invokestatic    #30  <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   18   35:astore          8
				obj = ((Object) (Bitmap.createBitmap(((Bitmap) (obj2)))));
	//   19   37:aload           8
	//   20   39:invokestatic    #34  <Method Bitmap Bitmap.createBitmap(Bitmap)>
	//   21   42:astore          5
				Object obj1 = ((Object) (RenderScript.create(context)));
	//   22   44:aload_1         
	//   23   45:invokestatic    #40  <Method RenderScript RenderScript.create(Context)>
	//   24   48:astore          7
				ScriptIntrinsicBlur scriptintrinsicblur = ScriptIntrinsicBlur.create(((RenderScript) (obj1)), Element.U8_4(((RenderScript) (obj1))));
	//   25   50:aload           7
	//   26   52:aload           7
	//   27   54:invokestatic    #46  <Method Element Element.U8_4(RenderScript)>
	//   28   57:invokestatic    #51  <Method ScriptIntrinsicBlur ScriptIntrinsicBlur.create(RenderScript, Element)>
	//   29   60:astore          6
				obj2 = ((Object) (Allocation.createFromBitmap(((RenderScript) (obj1)), ((Bitmap) (obj2)))));
	//   30   62:aload           7
	//   31   64:aload           8
	//   32   66:invokestatic    #57  <Method Allocation Allocation.createFromBitmap(RenderScript, Bitmap)>
	//   33   69:astore          8
				obj1 = ((Object) (Allocation.createFromBitmap(((RenderScript) (obj1)), ((Bitmap) (obj)))));
	//   34   71:aload           7
	//   35   73:aload           5
	//   36   75:invokestatic    #57  <Method Allocation Allocation.createFromBitmap(RenderScript, Bitmap)>
	//   37   78:astore          7
				scriptintrinsicblur.setRadius(f);
	//   38   80:aload           6
	//   39   82:fload           4
	//   40   84:invokevirtual   #61  <Method void ScriptIntrinsicBlur.setRadius(float)>
				scriptintrinsicblur.setInput(((Allocation) (obj2)));
	//   41   87:aload           6
	//   42   89:aload           8
	//   43   91:invokevirtual   #65  <Method void ScriptIntrinsicBlur.setInput(Allocation)>
				scriptintrinsicblur.forEach(((Allocation) (obj1)));
	//   44   94:aload           6
	//   45   96:aload           7
	//   46   98:invokevirtual   #68  <Method void ScriptIntrinsicBlur.forEach(Allocation)>
				((Allocation) (obj1)).copyTo(((Bitmap) (obj)));
	//   47  101:aload           7
	//   48  103:aload           5
	//   49  105:invokevirtual   #72  <Method void Allocation.copyTo(Bitmap)>
				obj = ((Object) (new BitmapDrawable(context.getResources(), ((Bitmap) (obj)))));
	//   50  108:new             #74  <Class BitmapDrawable>
	//   51  111:dup             
	//   52  112:aload_1         
	//   53  113:invokevirtual   #80  <Method android.content.res.Resources Context.getResources()>
	//   54  116:aload           5
	//   55  118:invokespecial   #83  <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//   56  121:astore          5
			}
	//*  57  123:aload           5
	//*  58  125:areturn         
	//*  59  126:new             #74  <Class BitmapDrawable>
	//*  60  129:dup             
	//*  61  130:aload_1         
	//*  62  131:invokevirtual   #80  <Method android.content.res.Resources Context.getResources()>
	//*  63  134:aload_2         
	//*  64  135:invokespecial   #83  <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//*  65  138:areturn         
	//*  66  139:new             #74  <Class BitmapDrawable>
	//*  67  142:dup             
	//*  68  143:aload_1         
	//*  69  144:invokevirtual   #80  <Method android.content.res.Resources Context.getResources()>
	//*  70  147:aload_2         
	//*  71  148:invokespecial   #83  <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//*  72  151:areturn         
			// Misplaced declaration of an exception variable
			catch(RuntimeException runtimeexception)
			{
				return ((Drawable) (new BitmapDrawable(context.getResources(), bitmap)));
			}
			return ((Drawable) (obj));
		} else
		{
			return ((Drawable) (new BitmapDrawable(context.getResources(), bitmap)));
		}
	//*  73  152:astore          5
	//*  74  154:goto            126
	}

	public final String a(Context context)
	{
		zo zo1 = zo.a();
	//    0    0:invokestatic    #89  <Method zo zo.a()>
	//    1    3:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (zo1.a))))
	//*   2    4:aload_2         
	//*   3    5:getfield        #92  <Field String zo.a>
	//*   4    8:invokestatic    #98  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifeq            66
		{
			if(d.a())
	//*   6   14:invokestatic    #103 <Method boolean d.a()>
	//*   7   17:ifeq            40
				context = ((Context) ((String)zm.a(context, ((java.util.concurrent.Callable) (new zp(zo1, context))))));
	//    8   20:aload_1         
	//    9   21:new             #105 <Class zp>
	//   10   24:dup             
	//   11   25:aload_2         
	//   12   26:aload_1         
	//   13   27:invokespecial   #108 <Method void zp(zo, Context)>
	//   14   30:invokestatic    #113 <Method Object zm.a(Context, java.util.concurrent.Callable)>
	//   15   33:checkcast       #115 <Class String>
	//   16   36:astore_1        
			else
	//*  17   37:goto            61
				context = ((Context) ((String)zm.a(context, ((java.util.concurrent.Callable) (new zq(zo1, h.getRemoteContext(context), context))))));
	//   18   40:aload_1         
	//   19   41:new             #117 <Class zq>
	//   20   44:dup             
	//   21   45:aload_2         
	//   22   46:aload_1         
	//   23   47:invokestatic    #123 <Method Context h.getRemoteContext(Context)>
	//   24   50:aload_1         
	//   25   51:invokespecial   #126 <Method void zq(zo, Context, Context)>
	//   26   54:invokestatic    #113 <Method Object zm.a(Context, java.util.concurrent.Callable)>
	//   27   57:checkcast       #115 <Class String>
	//   28   60:astore_1        
			zo1.a = ((String) (context));
	//   29   61:aload_2         
	//   30   62:aload_1         
	//   31   63:putfield        #92  <Field String zo.a>
		}
		return zo1.a;
	//   32   66:aload_2         
	//   33   67:getfield        #92  <Field String zo.a>
	//   34   70:areturn         
	}

	public final boolean a(Context context, WebSettings websettings)
	{
		super.a(context, websettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #129 <Method boolean xw.a(Context, WebSettings)>
	//    4    6:pop             
		websettings.setMediaPlaybackRequiresUserGesture(false);
	//    5    7:aload_2         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #135 <Method void WebSettings.setMediaPlaybackRequiresUserGesture(boolean)>
		return true;
	//    8   12:iconst_1        
	//    9   13:ireturn         
	}

	public final void b(Context context)
	{
		zo zo1 = zo.a();
	//    0    0:invokestatic    #89  <Method zo zo.a()>
	//    1    3:astore_2        
		wx.a("Updating user agent.");
	//    2    4:ldc1            #139 <String "Updating user agent.">
	//    3    6:invokestatic    #144 <Method void wx.a(String)>
		String s = WebSettings.getDefaultUserAgent(context);
	//    4    9:aload_1         
	//    5   10:invokestatic    #147 <Method String WebSettings.getDefaultUserAgent(Context)>
	//    6   13:astore_3        
		if(!s.equals(((Object) (zo1.a))))
	//*   7   14:aload_3         
	//*   8   15:aload_2         
	//*   9   16:getfield        #92  <Field String zo.a>
	//*  10   19:invokevirtual   #151 <Method boolean String.equals(Object)>
	//*  11   22:ifne            99
		{
			Context context1 = h.getRemoteContext(context);
	//   12   25:aload_1         
	//   13   26:invokestatic    #123 <Method Context h.getRemoteContext(Context)>
	//   14   29:astore          4
			if(d.a() || context1 == null)
	//*  15   31:invokestatic    #103 <Method boolean d.a()>
	//*  16   34:ifne            42
	//*  17   37:aload           4
	//*  18   39:ifnonnull       94
			{
				Object obj = ((Object) (WebSettings.getDefaultUserAgent(context)));
	//   19   42:aload_1         
	//   20   43:invokestatic    #147 <Method String WebSettings.getDefaultUserAgent(Context)>
	//   21   46:astore          5
				obj = ((Object) (context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", ((String) (obj)))));
	//   22   48:aload_1         
	//   23   49:ldc1            #153 <String "admob_user_agent">
	//   24   51:iconst_0        
	//   25   52:invokevirtual   #157 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   26   55:invokeinterface #163 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   27   60:ldc1            #165 <String "user_agent">
	//   28   62:aload           5
	//   29   64:invokeinterface #171 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   30   69:astore          5
				if(context1 == null)
	//*  31   71:aload           4
	//*  32   73:ifnonnull       86
					((android.content.SharedPreferences.Editor) (obj)).apply();
	//   33   76:aload           5
	//   34   78:invokeinterface #174 <Method void android.content.SharedPreferences$Editor.apply()>
				else
	//*  35   83:goto            94
					r.a(context, ((android.content.SharedPreferences.Editor) (obj)), "admob_user_agent");
	//   36   86:aload_1         
	//   37   87:aload           5
	//   38   89:ldc1            #153 <String "admob_user_agent">
	//   39   91:invokestatic    #179 <Method void r.a(Context, android.content.SharedPreferences$Editor, String)>
			}
			zo1.a = s;
	//   40   94:aload_2         
	//   41   95:aload_3         
	//   42   96:putfield        #92  <Field String zo.a>
		}
		wx.a("User agent is updated.");
	//   43   99:ldc1            #181 <String "User agent is updated.">
	//   44  101:invokestatic    #144 <Method void wx.a(String)>
	//   45  104:return          
	}
}
