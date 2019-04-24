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
import com.google.android.gms.common.util.PlatformVersion;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzalz, zzakb, zzabv, zzon

final class zzacb
	implements zzalz
{

	zzacb(zzabv zzabv1, boolean flag, double d, boolean flag1, String s)
	{
		zzcal = zzabv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzabv zzcal>
		zzcav = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field boolean zzcav>
		zzcaw = d;
	//    6   10:aload_0         
	//    7   11:dload_3         
	//    8   12:putfield        #24  <Field double zzcaw>
		zzcax = flag1;
	//    9   15:aload_0         
	//   10   16:iload           5
	//   11   18:putfield        #26  <Field boolean zzcax>
		zzbwo = s;
	//   12   21:aload_0         
	//   13   22:aload           6
	//   14   24:putfield        #28  <Field String zzbwo>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #31  <Method void Object()>
	//   17   31:return          
	}

	private final zzon zzd(InputStream inputstream)
	{
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//    0    0:new             #41  <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore          10
		options.inDensity = (int)(160D * zzcaw);
	//    4    9:aload           10
	//    5   11:ldc2w           #43  <Double 160D>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field double zzcaw>
	//    8   18:dmul            
	//    9   19:d2i             
	//   10   20:putfield        #48  <Field int android.graphics.BitmapFactory$Options.inDensity>
		if(!zzcax)
	//*  11   23:aload_0         
	//*  12   24:getfield        #26  <Field boolean zzcax>
	//*  13   27:ifne            38
			options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
	//   14   30:aload           10
	//   15   32:getstatic       #54  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   16   35:putfield        #57  <Field android.graphics.Bitmap$Config android.graphics.BitmapFactory$Options.inPreferredConfig>
		long l = SystemClock.uptimeMillis();
	//   17   38:invokestatic    #63  <Method long SystemClock.uptimeMillis()>
	//   18   41:lstore          5
		try
		{
			inputstream = ((InputStream) (BitmapFactory.decodeStream(inputstream, ((android.graphics.Rect) (null)), options)));
	//   19   43:aload_1         
	//   20   44:aconst_null     
	//   21   45:aload           10
	//   22   47:invokestatic    #69  <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   23   50:astore_1        
		}
	//*  24   51:goto            63
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  25   54:astore_1        
		{
			zzakb.zzb("Error grabbing image.", ((Throwable) (inputstream)));
	//   26   55:ldc1            #71  <String "Error grabbing image.">
	//   27   57:aload_1         
	//   28   58:invokestatic    #77  <Method void zzakb.zzb(String, Throwable)>
			inputstream = null;
	//   29   61:aconst_null     
	//   30   62:astore_1        
		}
		if(inputstream == null)
	//*  31   63:aload_1         
	//*  32   64:ifnonnull       81
		{
			zzcal.zzd(2, zzcav);
	//   33   67:aload_0         
	//   34   68:getfield        #20  <Field zzabv zzcal>
	//   35   71:iconst_2        
	//   36   72:aload_0         
	//   37   73:getfield        #22  <Field boolean zzcav>
	//   38   76:invokevirtual   #82  <Method void zzabv.zzd(int, boolean)>
			return null;
	//   39   79:aconst_null     
	//   40   80:areturn         
		}
		long l1 = SystemClock.uptimeMillis();
	//   41   81:invokestatic    #63  <Method long SystemClock.uptimeMillis()>
	//   42   84:lstore          7
		if(PlatformVersion.isAtLeastKitKat() && zzakb.zzqp())
	//*  43   86:invokestatic    #88  <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*  44   89:ifeq            235
	//*  45   92:invokestatic    #91  <Method boolean zzakb.zzqp()>
	//*  46   95:ifeq            235
		{
			int i = ((Bitmap) (inputstream)).getWidth();
	//   47   98:aload_1         
	//   48   99:invokevirtual   #97  <Method int Bitmap.getWidth()>
	//   49  102:istore_2        
			int j = ((Bitmap) (inputstream)).getHeight();
	//   50  103:aload_1         
	//   51  104:invokevirtual   #100 <Method int Bitmap.getHeight()>
	//   52  107:istore_3        
			int k = ((Bitmap) (inputstream)).getAllocationByteCount();
	//   53  108:aload_1         
	//   54  109:invokevirtual   #103 <Method int Bitmap.getAllocationByteCount()>
	//   55  112:istore          4
			boolean flag;
			if(Looper.getMainLooper().getThread() == Thread.currentThread())
	//*  56  114:invokestatic    #109 <Method Looper Looper.getMainLooper()>
	//*  57  117:invokevirtual   #113 <Method Thread Looper.getThread()>
	//*  58  120:invokestatic    #118 <Method Thread Thread.currentThread()>
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
	//   65  135:new             #120 <Class StringBuilder>
	//   66  138:dup             
	//   67  139:bipush          108
	//   68  141:invokespecial   #123 <Method void StringBuilder(int)>
	//   69  144:astore          10
			stringbuilder.append("Decoded image w: ");
	//   70  146:aload           10
	//   71  148:ldc1            #125 <String "Decoded image w: ">
	//   72  150:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   73  153:pop             
			stringbuilder.append(i);
	//   74  154:aload           10
	//   75  156:iload_2         
	//   76  157:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   77  160:pop             
			stringbuilder.append(" h:");
	//   78  161:aload           10
	//   79  163:ldc1            #134 <String " h:">
	//   80  165:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   81  168:pop             
			stringbuilder.append(j);
	//   82  169:aload           10
	//   83  171:iload_3         
	//   84  172:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   85  175:pop             
			stringbuilder.append(" bytes: ");
	//   86  176:aload           10
	//   87  178:ldc1            #136 <String " bytes: ">
	//   88  180:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   89  183:pop             
			stringbuilder.append(k);
	//   90  184:aload           10
	//   91  186:iload           4
	//   92  188:invokevirtual   #132 <Method StringBuilder StringBuilder.append(int)>
	//   93  191:pop             
			stringbuilder.append(" time: ");
	//   94  192:aload           10
	//   95  194:ldc1            #138 <String " time: ">
	//   96  196:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   97  199:pop             
			stringbuilder.append(l1 - l);
	//   98  200:aload           10
	//   99  202:lload           7
	//  100  204:lload           5
	//  101  206:lsub            
	//  102  207:invokevirtual   #141 <Method StringBuilder StringBuilder.append(long)>
	//  103  210:pop             
			stringbuilder.append(" on ui thread: ");
	//  104  211:aload           10
	//  105  213:ldc1            #143 <String " on ui thread: ">
	//  106  215:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//  107  218:pop             
			stringbuilder.append(flag);
	//  108  219:aload           10
	//  109  221:iload           9
	//  110  223:invokevirtual   #146 <Method StringBuilder StringBuilder.append(boolean)>
	//  111  226:pop             
			zzakb.v(stringbuilder.toString());
	//  112  227:aload           10
	//  113  229:invokevirtual   #150 <Method String StringBuilder.toString()>
	//  114  232:invokestatic    #154 <Method void zzakb.v(String)>
		}
		return new zzon(((android.graphics.drawable.Drawable) (new BitmapDrawable(Resources.getSystem(), ((Bitmap) (inputstream))))), Uri.parse(zzbwo), zzcaw);
	//  115  235:new             #156 <Class zzon>
	//  116  238:dup             
	//  117  239:new             #158 <Class BitmapDrawable>
	//  118  242:dup             
	//  119  243:invokestatic    #164 <Method Resources Resources.getSystem()>
	//  120  246:aload_1         
	//  121  247:invokespecial   #167 <Method void BitmapDrawable(Resources, Bitmap)>
	//  122  250:aload_0         
	//  123  251:getfield        #28  <Field String zzbwo>
	//  124  254:invokestatic    #173 <Method Uri Uri.parse(String)>
	//  125  257:aload_0         
	//  126  258:getfield        #24  <Field double zzcaw>
	//  127  261:invokespecial   #176 <Method void zzon(android.graphics.drawable.Drawable, Uri, double)>
	//  128  264:areturn         
	}

	public final Object zze(InputStream inputstream)
	{
		return ((Object) (zzd(inputstream)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method zzon zzd(InputStream)>
	//    3    5:areturn         
	}

	public final Object zzny()
	{
		zzcal.zzd(2, zzcav);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzabv zzcal>
	//    2    4:iconst_2        
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field boolean zzcav>
	//    5    9:invokevirtual   #82  <Method void zzabv.zzd(int, boolean)>
		return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	private final String zzbwo;
	private final zzabv zzcal;
	private final boolean zzcav;
	private final double zzcaw;
	private final boolean zzcax;
}
