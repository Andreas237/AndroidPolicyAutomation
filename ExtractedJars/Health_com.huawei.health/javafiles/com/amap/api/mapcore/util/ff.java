// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileDescriptor;

// Referenced classes of package com.amap.api.mapcore.util:
//			fg, fh

public class ff extends fg
{

	public ff(Context context, int i, int j)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void fg(Context)>
		a(i, j);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #15  <Method void a(int, int)>
	//    7   11:return          
	}

	public static int a(android.graphics.BitmapFactory.Options options, int i, int j)
	{
		int i1 = options.outHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int android.graphics.BitmapFactory$Options.outHeight>
	//    2    4:istore          7
		int j1 = options.outWidth;
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field int android.graphics.BitmapFactory$Options.outWidth>
	//    5   10:istore          8
		int l = 1;
	//    6   12:iconst_1        
	//    7   13:istore          6
		if(i1 > j || j1 > i)
	//*   8   15:iload           7
	//*   9   17:iload_2         
	//*  10   18:icmpgt          27
	//*  11   21:iload           8
	//*  12   23:iload_1         
	//*  13   24:icmple          105
		{
			int k = Math.round((float)i1 / (float)j);
	//   14   27:iload           7
	//   15   29:i2f             
	//   16   30:iload_2         
	//   17   31:i2f             
	//   18   32:fdiv            
	//   19   33:invokestatic    #31  <Method int Math.round(float)>
	//   20   36:istore          5
			l = Math.round((float)j1 / (float)i);
	//   21   38:iload           8
	//   22   40:i2f             
	//   23   41:iload_1         
	//   24   42:i2f             
	//   25   43:fdiv            
	//   26   44:invokestatic    #31  <Method int Math.round(float)>
	//   27   47:istore          6
			if(k >= l)
	//*  28   49:iload           5
	//*  29   51:iload           6
	//*  30   53:icmpge          59
	//*  31   56:goto            63
				k = l;
	//   32   59:iload           6
	//   33   61:istore          5
			float f = j1 * i1;
	//   34   63:iload           8
	//   35   65:iload           7
	//   36   67:imul            
	//   37   68:i2f             
	//   38   69:fstore_3        
			float f1 = i * j * 2;
	//   39   70:iload_1         
	//   40   71:iload_2         
	//   41   72:imul            
	//   42   73:iconst_2        
	//   43   74:imul            
	//   44   75:i2f             
	//   45   76:fstore          4
			do
			{
				l = k;
	//   46   78:iload           5
	//   47   80:istore          6
				if(f / (float)(k * k) <= f1)
					break;
	//   48   82:fload_3         
	//   49   83:iload           5
	//   50   85:iload           5
	//   51   87:imul            
	//   52   88:i2f             
	//   53   89:fdiv            
	//   54   90:fload           4
	//   55   92:fcmpl           
	//   56   93:ifle            105
				k++;
	//   57   96:iload           5
	//   58   98:iconst_1        
	//   59   99:iadd            
	//   60  100:istore          5
			} while(true);
	//   61  102:goto            78
		}
		return l;
	//   62  105:iload           6
	//   63  107:ireturn         
	}

	private Bitmap a(int i)
	{
		return a(d, i, a, b, a());
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resources d>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field int a>
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field int b>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #43  <Method fh a()>
	//    9   17:invokestatic    #46  <Method Bitmap a(Resources, int, int, int, fh)>
	//   10   20:areturn         
	}

	public static Bitmap a(Resources resources, int i, int j, int k, fh fh)
	{
		fh = ((fh) (new android.graphics.BitmapFactory.Options()));
	//    0    0:new             #19  <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore          4
		fh.inJustDecodeBounds = true;
	//    4    9:aload           4
	//    5   11:iconst_1        
	//    6   12:putfield        #53  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		BitmapFactory.decodeResource(resources, i, ((android.graphics.BitmapFactory.Options) (fh)));
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload           4
	//   10   19:invokestatic    #59  <Method Bitmap BitmapFactory.decodeResource(Resources, int, android.graphics.BitmapFactory$Options)>
	//   11   22:pop             
		fh.inSampleSize = a(((android.graphics.BitmapFactory.Options) (fh)), j, k);
	//   12   23:aload           4
	//   13   25:aload           4
	//   14   27:iload_2         
	//   15   28:iload_3         
	//   16   29:invokestatic    #61  <Method int a(android.graphics.BitmapFactory$Options, int, int)>
	//   17   32:putfield        #64  <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		fh.inJustDecodeBounds = false;
	//   18   35:aload           4
	//   19   37:iconst_0        
	//   20   38:putfield        #53  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		return BitmapFactory.decodeResource(resources, i, ((android.graphics.BitmapFactory.Options) (fh)));
	//   21   41:aload_0         
	//   22   42:iload_1         
	//   23   43:aload           4
	//   24   45:invokestatic    #59  <Method Bitmap BitmapFactory.decodeResource(Resources, int, android.graphics.BitmapFactory$Options)>
	//   25   48:areturn         
	}

	public static Bitmap a(FileDescriptor filedescriptor, int i, int j, fh fh)
	{
		fh = ((fh) (new android.graphics.BitmapFactory.Options()));
	//    0    0:new             #19  <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore_3        
		fh.inJustDecodeBounds = true;
	//    4    8:aload_3         
	//    5    9:iconst_1        
	//    6   10:putfield        #53  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		BitmapFactory.decodeFileDescriptor(filedescriptor, ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (fh)));
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:aload_3         
	//   10   16:invokestatic    #69  <Method Bitmap BitmapFactory.decodeFileDescriptor(FileDescriptor, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   11   19:pop             
		fh.inSampleSize = a(((android.graphics.BitmapFactory.Options) (fh)), i, j);
	//   12   20:aload_3         
	//   13   21:aload_3         
	//   14   22:iload_1         
	//   15   23:iload_2         
	//   16   24:invokestatic    #61  <Method int a(android.graphics.BitmapFactory$Options, int, int)>
	//   17   27:putfield        #64  <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		fh.inJustDecodeBounds = false;
	//   18   30:aload_3         
	//   19   31:iconst_0        
	//   20   32:putfield        #53  <Field boolean android.graphics.BitmapFactory$Options.inJustDecodeBounds>
		return BitmapFactory.decodeFileDescriptor(filedescriptor, ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (fh)));
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:aload_3         
	//   24   38:invokestatic    #69  <Method Bitmap BitmapFactory.decodeFileDescriptor(FileDescriptor, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   25   41:areturn         
	}

	protected Bitmap a(Object obj)
	{
		return a(Integer.parseInt(String.valueOf(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #76  <Method String String.valueOf(Object)>
	//    3    5:invokestatic    #82  <Method int Integer.parseInt(String)>
	//    4    8:invokespecial   #84  <Method Bitmap a(int)>
	//    5   11:areturn         
	}

	public void a(int i, int j)
	{
		a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int a>
		b = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #40  <Field int b>
	//    6   10:return          
	}

	protected int a;
	protected int b;
}
