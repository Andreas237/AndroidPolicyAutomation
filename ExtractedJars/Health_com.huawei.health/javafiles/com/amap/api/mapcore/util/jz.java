// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.amap.api.mapcore.util:
//			kb, gz, gt, go, 
//			hm

public class jz extends kb
{

	public jz(Context context, kb kb1)
	{
		super(kb1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #21  <Method void kb(kb)>
		e = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #23  <Field Context e>
	//    6   10:return          
	}

	private byte[] a(Context context)
	{
		Object obj = ((Object) (new ByteArrayOutputStream()));
	//    0    0:new             #28  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		gz.a(((ByteArrayOutputStream) (obj)), (new StringBuilder()).append("1.2.").append(a).append(".").append(b).toString());
	//    4    8:aload_2         
	//    5    9:new             #32  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #33  <Method void StringBuilder()>
	//    8   16:ldc1            #35  <String "1.2.">
	//    9   18:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:getstatic       #13  <Field int a>
	//   11   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   12   27:ldc1            #44  <String ".">
	//   13   29:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:getstatic       #15  <Field int b>
	//   15   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   16   38:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   17   41:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), "Android");
	//   18   44:aload_2         
	//   19   45:ldc1            #55  <String "Android">
	//   20   47:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), gt.t(context));
	//   21   50:aload_2         
	//   22   51:aload_1         
	//   23   52:invokestatic    #61  <Method String gt.t(Context)>
	//   24   55:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), gt.l(context));
	//   25   58:aload_2         
	//   26   59:aload_1         
	//   27   60:invokestatic    #64  <Method String gt.l(Context)>
	//   28   63:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), gt.h(context));
	//   29   66:aload_2         
	//   30   67:aload_1         
	//   31   68:invokestatic    #67  <Method String gt.h(Context)>
	//   32   71:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), Build.MANUFACTURER);
	//   33   74:aload_2         
	//   34   75:getstatic       #73  <Field String Build.MANUFACTURER>
	//   35   78:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), Build.MODEL);
	//   36   81:aload_2         
	//   37   82:getstatic       #76  <Field String Build.MODEL>
	//   38   85:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), Build.DEVICE);
	//   39   88:aload_2         
	//   40   89:getstatic       #79  <Field String Build.DEVICE>
	//   41   92:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), gt.u(context));
	//   42   95:aload_2         
	//   43   96:aload_1         
	//   44   97:invokestatic    #82  <Method String gt.u(Context)>
	//   45  100:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), go.c(context));
	//   46  103:aload_2         
	//   47  104:aload_1         
	//   48  105:invokestatic    #87  <Method String go.c(Context)>
	//   49  108:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), go.d(context));
	//   50  111:aload_2         
	//   51  112:aload_1         
	//   52  113:invokestatic    #90  <Method String go.d(Context)>
	//   53  116:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		gz.a(((ByteArrayOutputStream) (obj)), go.f(context));
	//   54  119:aload_2         
	//   55  120:aload_1         
	//   56  121:invokestatic    #93  <Method String go.f(Context)>
	//   57  124:invokestatic    #53  <Method void gz.a(ByteArrayOutputStream, String)>
		((ByteArrayOutputStream) (obj)).write(new byte[] {
			0
		});
	//   58  127:aload_2         
	//   59  128:iconst_1        
	//   60  129:newarray        byte[]
	//   61  131:dup             
	//   62  132:iconst_0        
	//   63  133:ldc1            #94  <Int 0>
	//   64  135:bastore         
	//   65  136:invokevirtual   #98  <Method void ByteArrayOutputStream.write(byte[])>
		context = ((Context) (((ByteArrayOutputStream) (obj)).toByteArray()));
	//   66  139:aload_2         
	//   67  140:invokevirtual   #102 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   68  143:astore_1        
		try
		{
			((ByteArrayOutputStream) (obj)).close();
	//   69  144:aload_2         
	//   70  145:invokevirtual   #105 <Method void ByteArrayOutputStream.close()>
		}
	//*  71  148:goto            156
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  72  151:astore_2        
		{
			((Throwable) (obj)).printStackTrace();
	//   73  152:aload_2         
	//   74  153:invokevirtual   #108 <Method void Throwable.printStackTrace()>
		}
		return ((byte []) (context));
	//   75  156:aload_1         
	//   76  157:areturn         
		context;
	//   77  158:astore_1        
		hm.c(((Throwable) (context)), "sm", "gh");
	//   78  159:aload_1         
	//   79  160:ldc1            #110 <String "sm">
	//   80  162:ldc1            #112 <String "gh">
	//   81  164:invokestatic    #117 <Method void hm.c(Throwable, String, String)>
		try
		{
			((ByteArrayOutputStream) (obj)).close();
	//   82  167:aload_2         
	//   83  168:invokevirtual   #105 <Method void ByteArrayOutputStream.close()>
		}
	//*  84  171:goto            179
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  85  174:astore_1        
		{
			((Throwable) (context)).printStackTrace();
	//   86  175:aload_1         
	//   87  176:invokevirtual   #108 <Method void Throwable.printStackTrace()>
		}
		return new byte[0];
	//   88  179:iconst_0        
	//   89  180:newarray        byte[]
	//   90  182:areturn         
		context;
	//   91  183:astore_1        
		try
		{
			((ByteArrayOutputStream) (obj)).close();
	//   92  184:aload_2         
	//   93  185:invokevirtual   #105 <Method void ByteArrayOutputStream.close()>
		}
	//*  94  188:goto            196
		catch(Throwable throwable)
	//*  95  191:astore_2        
		{
			throwable.printStackTrace();
	//   96  192:aload_2         
	//   97  193:invokevirtual   #108 <Method void Throwable.printStackTrace()>
		}
		throw context;
	//   98  196:aload_1         
	//   99  197:athrow          
	}

	protected byte[] a(byte abyte0[])
	{
		byte abyte1[] = a(e);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field Context e>
	//    3    5:invokespecial   #120 <Method byte[] a(Context)>
	//    4    8:astore_2        
		byte abyte2[] = new byte[abyte1.length + abyte0.length];
	//    5    9:aload_2         
	//    6   10:arraylength     
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:iadd            
	//   10   14:newarray        byte[]
	//   11   16:astore_3        
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte2)), 0, abyte1.length);
	//   12   17:aload_2         
	//   13   18:iconst_0        
	//   14   19:aload_3         
	//   15   20:iconst_0        
	//   16   21:aload_2         
	//   17   22:arraylength     
	//   18   23:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte2)), abyte1.length, abyte0.length);
	//   19   26:aload_1         
	//   20   27:iconst_0        
	//   21   28:aload_3         
	//   22   29:aload_2         
	//   23   30:arraylength     
	//   24   31:aload_1         
	//   25   32:arraylength     
	//   26   33:invokestatic    #126 <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte2;
	//   27   36:aload_3         
	//   28   37:areturn         
	}

	public static int a = 13;
	public static int b = 6;
	private Context e;

	static 
	{
	//    0    0:bipush          13
	//    1    2:putstatic       #13  <Field int a>
	//    2    5:bipush          6
	//    3    7:putstatic       #15  <Field int b>
	//*   4   10:return          
	}
}
