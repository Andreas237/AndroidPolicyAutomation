// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.internal.aw;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ni, afn, xg, bzl, 
//			wi, nc, nd

public final class nb extends ni
{

	public nb(afn afn1, Map map)
	{
		super(afn1, "storePicture");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #13  <String "storePicture">
	//    3    4:invokespecial   #16  <Method void ni(afn, String)>
		a = map;
	//    4    7:aload_0         
	//    5    8:aload_2         
	//    6    9:putfield        #18  <Field Map a>
		b = ((Context) (afn1.d()));
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:invokeinterface #24  <Method android.app.Activity afn.d()>
	//   10   19:putfield        #26  <Field Context b>
	//   11   22:return          
	}

	static Context a(nb nb1)
	{
		return nb1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Context b>
	//    2    4:areturn         
	}

	public final void a()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Context b>
	//*   2    4:ifnonnull       14
		{
			((ni)this).a("Activity context is not available");
	//    3    7:aload_0         
	//    4    8:ldc1            #31  <String "Activity context is not available">
	//    5   10:invokevirtual   #34  <Method void ni.a(String)>
			return;
	//    6   13:return          
		}
		aw.e();
	//    7   14:invokestatic    #40  <Method xg aw.e()>
	//    8   17:pop             
		if(!xg.f(b).c())
	//*   9   18:aload_0         
	//*  10   19:getfield        #26  <Field Context b>
	//*  11   22:invokestatic    #46  <Method bzl xg.f(Context)>
	//*  12   25:invokevirtual   #52  <Method boolean bzl.c()>
	//*  13   28:ifne            38
		{
			((ni)this).a("Feature is not supported by the device.");
	//   14   31:aload_0         
	//   15   32:ldc1            #54  <String "Feature is not supported by the device.">
	//   16   34:invokevirtual   #34  <Method void ni.a(String)>
			return;
	//   17   37:return          
		}
		String s3 = (String)a.get("iurl");
	//   18   38:aload_0         
	//   19   39:getfield        #18  <Field Map a>
	//   20   42:ldc1            #56  <String "iurl">
	//   21   44:invokeinterface #62  <Method Object Map.get(Object)>
	//   22   49:checkcast       #64  <Class String>
	//   23   52:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (s3))))
	//*  24   53:aload_3         
	//*  25   54:invokestatic    #70  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   57:ifeq            67
		{
			((ni)this).a("Image url cannot be empty.");
	//   27   60:aload_0         
	//   28   61:ldc1            #72  <String "Image url cannot be empty.">
	//   29   63:invokevirtual   #34  <Method void ni.a(String)>
			return;
	//   30   66:return          
		}
		if(!URLUtil.isValidUrl(s3))
	//*  31   67:aload_3         
	//*  32   68:invokestatic    #78  <Method boolean URLUtil.isValidUrl(String)>
	//*  33   71:ifne            112
		{
			String s = String.valueOf(((Object) (s3)));
	//   34   74:aload_3         
	//   35   75:invokestatic    #82  <Method String String.valueOf(Object)>
	//   36   78:astore_1        
			if(s.length() != 0)
	//*  37   79:aload_1         
	//*  38   80:invokevirtual   #86  <Method int String.length()>
	//*  39   83:ifeq            96
				s = "Invalid image url: ".concat(s);
	//   40   86:ldc1            #88  <String "Invalid image url: ">
	//   41   88:aload_1         
	//   42   89:invokevirtual   #92  <Method String String.concat(String)>
	//   43   92:astore_1        
			else
	//*  44   93:goto            106
				s = new String("Invalid image url: ");
	//   45   96:new             #64  <Class String>
	//   46   99:dup             
	//   47  100:ldc1            #88  <String "Invalid image url: ">
	//   48  102:invokespecial   #94  <Method void String(String)>
	//   49  105:astore_1        
			((ni)this).a(s);
	//   50  106:aload_0         
	//   51  107:aload_1         
	//   52  108:invokevirtual   #34  <Method void ni.a(String)>
			return;
	//   53  111:return          
		}
		String s4 = Uri.parse(s3).getLastPathSegment();
	//   54  112:aload_3         
	//   55  113:invokestatic    #100 <Method Uri Uri.parse(String)>
	//   56  116:invokevirtual   #104 <Method String Uri.getLastPathSegment()>
	//   57  119:astore          4
		aw.e();
	//   58  121:invokestatic    #40  <Method xg aw.e()>
	//   59  124:pop             
		if(!xg.c(s4))
	//*  60  125:aload           4
	//*  61  127:invokestatic    #106 <Method boolean xg.c(String)>
	//*  62  130:ifne            172
		{
			String s1 = String.valueOf(((Object) (s4)));
	//   63  133:aload           4
	//   64  135:invokestatic    #82  <Method String String.valueOf(Object)>
	//   65  138:astore_1        
			if(s1.length() != 0)
	//*  66  139:aload_1         
	//*  67  140:invokevirtual   #86  <Method int String.length()>
	//*  68  143:ifeq            156
				s1 = "Image type not recognized: ".concat(s1);
	//   69  146:ldc1            #108 <String "Image type not recognized: ">
	//   70  148:aload_1         
	//   71  149:invokevirtual   #92  <Method String String.concat(String)>
	//   72  152:astore_1        
			else
	//*  73  153:goto            166
				s1 = new String("Image type not recognized: ");
	//   74  156:new             #64  <Class String>
	//   75  159:dup             
	//   76  160:ldc1            #108 <String "Image type not recognized: ">
	//   77  162:invokespecial   #94  <Method void String(String)>
	//   78  165:astore_1        
			((ni)this).a(s1);
	//   79  166:aload_0         
	//   80  167:aload_1         
	//   81  168:invokevirtual   #34  <Method void ni.a(String)>
			return;
	//   82  171:return          
		}
		Resources resources = aw.i().g();
	//   83  172:invokestatic    #112 <Method wi aw.i()>
	//   84  175:invokevirtual   #118 <Method Resources wi.g()>
	//   85  178:astore          5
		aw.e();
	//   86  180:invokestatic    #40  <Method xg aw.e()>
	//   87  183:pop             
		android.app.AlertDialog.Builder builder = xg.e(b);
	//   88  184:aload_0         
	//   89  185:getfield        #26  <Field Context b>
	//   90  188:invokestatic    #121 <Method android.app.AlertDialog$Builder xg.e(Context)>
	//   91  191:astore_2        
		String s2;
		if(resources != null)
	//*  92  192:aload           5
	//*  93  194:ifnull          209
			s2 = resources.getString(b.s1);
	//   94  197:aload           5
	//   95  199:getstatic       #127 <Field int b.s1>
	//   96  202:invokevirtual   #133 <Method String Resources.getString(int)>
	//   97  205:astore_1        
		else
	//*  98  206:goto            212
			s2 = "Save image";
	//   99  209:ldc1            #135 <String "Save image">
	//  100  211:astore_1        
		builder.setTitle(((CharSequence) (s2)));
	//  101  212:aload_2         
	//  102  213:aload_1         
	//  103  214:invokevirtual   #141 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//  104  217:pop             
		if(resources != null)
	//* 105  218:aload           5
	//* 106  220:ifnull          235
			s2 = resources.getString(b.s2);
	//  107  223:aload           5
	//  108  225:getstatic       #144 <Field int b.s2>
	//  109  228:invokevirtual   #133 <Method String Resources.getString(int)>
	//  110  231:astore_1        
		else
	//* 111  232:goto            238
			s2 = "Allow Ad to store image in Picture gallery?";
	//  112  235:ldc1            #146 <String "Allow Ad to store image in Picture gallery?">
	//  113  237:astore_1        
		builder.setMessage(((CharSequence) (s2)));
	//  114  238:aload_2         
	//  115  239:aload_1         
	//  116  240:invokevirtual   #149 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//  117  243:pop             
		if(resources != null)
	//* 118  244:aload           5
	//* 119  246:ifnull          261
			s2 = resources.getString(b.s3);
	//  120  249:aload           5
	//  121  251:getstatic       #152 <Field int b.s3>
	//  122  254:invokevirtual   #133 <Method String Resources.getString(int)>
	//  123  257:astore_1        
		else
	//* 124  258:goto            264
			s2 = "Accept";
	//  125  261:ldc1            #154 <String "Accept">
	//  126  263:astore_1        
		builder.setPositiveButton(((CharSequence) (s2)), ((android.content.DialogInterface.OnClickListener) (new nc(this, s3, s4))));
	//  127  264:aload_2         
	//  128  265:aload_1         
	//  129  266:new             #156 <Class nc>
	//  130  269:dup             
	//  131  270:aload_0         
	//  132  271:aload_3         
	//  133  272:aload           4
	//  134  274:invokespecial   #159 <Method void nc(nb, String, String)>
	//  135  277:invokevirtual   #163 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  136  280:pop             
		if(resources != null)
	//* 137  281:aload           5
	//* 138  283:ifnull          298
			s2 = resources.getString(b.s4);
	//  139  286:aload           5
	//  140  288:getstatic       #166 <Field int b.s4>
	//  141  291:invokevirtual   #133 <Method String Resources.getString(int)>
	//  142  294:astore_1        
		else
	//* 143  295:goto            301
			s2 = "Decline";
	//  144  298:ldc1            #168 <String "Decline">
	//  145  300:astore_1        
		builder.setNegativeButton(((CharSequence) (s2)), ((android.content.DialogInterface.OnClickListener) (new nd(this))));
	//  146  301:aload_2         
	//  147  302:aload_1         
	//  148  303:new             #170 <Class nd>
	//  149  306:dup             
	//  150  307:aload_0         
	//  151  308:invokespecial   #173 <Method void nd(nb)>
	//  152  311:invokevirtual   #176 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  153  314:pop             
		builder.create().show();
	//  154  315:aload_2         
	//  155  316:invokevirtual   #180 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//  156  319:invokevirtual   #185 <Method void AlertDialog.show()>
	//  157  322:return          
	}

	private final Map a;
	private final Context b;
}
