// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.o;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yy, wx, ov, au

final class pc
	implements yy
{

	pc(ov ov1, boolean flag, double d1, boolean flag1, String s)
	{
		e = ov1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ov e>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		b = d1;
	//    6   10:aload_0         
	//    7   11:dload_3         
	//    8   12:putfield        #23  <Field double b>
		c = flag1;
	//    9   15:aload_0         
	//   10   16:iload           5
	//   11   18:putfield        #25  <Field boolean c>
		d = s;
	//   12   21:aload_0         
	//   13   22:aload           6
	//   14   24:putfield        #27  <Field String d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #30  <Method void Object()>
	//   17   31:return          
	}

	private final au b(InputStream inputstream)
	{
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    0    0:new             #39  <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore          10
		options.inDensity = (int)(b * 160D);
	//    4    9:aload           10
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field double b>
	//    7   15:ldc2w           #41  <Double 160D>
	//    8   18:dmul            
	//    9   19:d2i             
	//   10   20:putfield        #46  <Field int android.graphics.BitmapFactory$Options.inDensity>
		if(!c)
	//*  11   23:aload_0         
	//*  12   24:getfield        #25  <Field boolean c>
	//*  13   27:ifne            38
			options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
	//   14   30:aload           10
	//   15   32:getstatic       #52  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   16   35:putfield        #55  <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
		long l = SystemClock.uptimeMillis();
	//   17   38:invokestatic    #61  <Method long SystemClock.uptimeMillis()>
	//   18   41:lstore          5
		try
		{
			inputstream = ((InputStream) (BitmapFactory.decodeStream(inputstream, ((android.graphics.Rect) (null)), options)));
	//   19   43:aload_1         
	//   20   44:aconst_null     
	//   21   45:aload           10
	//   22   47:invokestatic    #67  <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   23   50:astore_1        
		}
	//*  24   51:goto            63
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  25   54:astore_1        
		{
			wx.b("Error grabbing image.", ((Throwable) (inputstream)));
	//   26   55:ldc1            #69  <String "Error grabbing image.">
	//   27   57:aload_1         
	//   28   58:invokestatic    #74  <Method void wx.b(String, Throwable)>
			inputstream = null;
	//   29   61:aconst_null     
	//   30   62:astore_1        
		}
		if(inputstream == null)
	//*  31   63:aload_1         
	//*  32   64:ifnonnull       81
		{
			e.a(2, a);
	//   33   67:aload_0         
	//   34   68:getfield        #19  <Field ov e>
	//   35   71:iconst_2        
	//   36   72:aload_0         
	//   37   73:getfield        #21  <Field boolean a>
	//   38   76:invokevirtual   #79  <Method void ov.a(int, boolean)>
			return null;
	//   39   79:aconst_null     
	//   40   80:areturn         
		}
		long l1 = SystemClock.uptimeMillis();
	//   41   81:invokestatic    #61  <Method long SystemClock.uptimeMillis()>
	//   42   84:lstore          7
		if(o.f() && wx.a())
	//*  43   86:invokestatic    #85  <Method boolean o.f()>
	//*  44   89:ifeq            235
	//*  45   92:invokestatic    #87  <Method boolean wx.a()>
	//*  46   95:ifeq            235
		{
			int i = ((Bitmap) (inputstream)).getWidth();
	//   47   98:aload_1         
	//   48   99:invokevirtual   #93  <Method int Bitmap.getWidth()>
	//   49  102:istore_2        
			int j = ((Bitmap) (inputstream)).getHeight();
	//   50  103:aload_1         
	//   51  104:invokevirtual   #96  <Method int Bitmap.getHeight()>
	//   52  107:istore_3        
			int k = ((Bitmap) (inputstream)).getAllocationByteCount();
	//   53  108:aload_1         
	//   54  109:invokevirtual   #99  <Method int Bitmap.getAllocationByteCount()>
	//   55  112:istore          4
			boolean flag;
			if(Looper.getMainLooper().getThread() == Thread.currentThread())
	//*  56  114:invokestatic    #105 <Method Looper Looper.getMainLooper()>
	//*  57  117:invokevirtual   #109 <Method Thread Looper.getThread()>
	//*  58  120:invokestatic    #114 <Method Thread Thread.currentThread()>
	//*  59  123:if_acmpne       132
				flag = true;
	//   60  126:iconst_1        
	//   61  127:istore          9
			else
	//*  62  129:goto            135
				flag = false;
	//   63  132:iconst_0        
	//   64  133:istore          9
			StringBuilder stringbuilder = new StringBuilder(108);
	//   65  135:new             #116 <Class StringBuilder>
	//   66  138:dup             
	//   67  139:bipush          108
	//   68  141:invokespecial   #119 <Method void StringBuilder(int)>
	//   69  144:astore          10
			stringbuilder.append("Decoded image w: ");
	//   70  146:aload           10
	//   71  148:ldc1            #121 <String "Decoded image w: ">
	//   72  150:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   73  153:pop             
			stringbuilder.append(i);
	//   74  154:aload           10
	//   75  156:iload_2         
	//   76  157:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   77  160:pop             
			stringbuilder.append(" h:");
	//   78  161:aload           10
	//   79  163:ldc1            #130 <String " h:">
	//   80  165:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   81  168:pop             
			stringbuilder.append(j);
	//   82  169:aload           10
	//   83  171:iload_3         
	//   84  172:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   85  175:pop             
			stringbuilder.append(" bytes: ");
	//   86  176:aload           10
	//   87  178:ldc1            #132 <String " bytes: ">
	//   88  180:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   89  183:pop             
			stringbuilder.append(k);
	//   90  184:aload           10
	//   91  186:iload           4
	//   92  188:invokevirtual   #128 <Method StringBuilder StringBuilder.append(int)>
	//   93  191:pop             
			stringbuilder.append(" time: ");
	//   94  192:aload           10
	//   95  194:ldc1            #134 <String " time: ">
	//   96  196:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   97  199:pop             
			stringbuilder.append(l1 - l);
	//   98  200:aload           10
	//   99  202:lload           7
	//  100  204:lload           5
	//  101  206:lsub            
	//  102  207:invokevirtual   #137 <Method StringBuilder StringBuilder.append(long)>
	//  103  210:pop             
			stringbuilder.append(" on ui thread: ");
	//  104  211:aload           10
	//  105  213:ldc1            #139 <String " on ui thread: ">
	//  106  215:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  107  218:pop             
			stringbuilder.append(flag);
	//  108  219:aload           10
	//  109  221:iload           9
	//  110  223:invokevirtual   #142 <Method StringBuilder StringBuilder.append(boolean)>
	//  111  226:pop             
			wx.a(stringbuilder.toString());
	//  112  227:aload           10
	//  113  229:invokevirtual   #146 <Method String StringBuilder.toString()>
	//  114  232:invokestatic    #149 <Method void wx.a(String)>
		}
		return new au(((android.graphics.drawable.Drawable) (new BitmapDrawable(Resources.getSystem(), ((Bitmap) (inputstream))))), Uri.parse(d), b);
	//  115  235:new             #151 <Class au>
	//  116  238:dup             
	//  117  239:new             #153 <Class BitmapDrawable>
	//  118  242:dup             
	//  119  243:invokestatic    #159 <Method Resources Resources.getSystem()>
	//  120  246:aload_1         
	//  121  247:invokespecial   #162 <Method void BitmapDrawable(Resources, Bitmap)>
	//  122  250:aload_0         
	//  123  251:getfield        #27  <Field String d>
	//  124  254:invokestatic    #168 <Method Uri Uri.parse(String)>
	//  125  257:aload_0         
	//  126  258:getfield        #23  <Field double b>
	//  127  261:invokespecial   #171 <Method void au(android.graphics.drawable.Drawable, Uri, double)>
	//  128  264:areturn         
	}

	public final Object a()
	{
		e.a(2, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ov e>
	//    2    4:iconst_2        
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field boolean a>
	//    5    9:invokevirtual   #79  <Method void ov.a(int, boolean)>
		return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public final Object a(InputStream inputstream)
	{
		return ((Object) (b(inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #176 <Method au b(InputStream)>
	//    3    5:areturn         
	}

	private final boolean a;
	private final double b;
	private final boolean c;
	private final String d;
	private final ov e;
}
