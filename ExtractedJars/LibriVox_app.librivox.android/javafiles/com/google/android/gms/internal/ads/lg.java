// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			za, ly, mx, bim, 
//			ee, azi

public final class lg
	implements za
{

	public lg(File file)
	{
		this(file, 0x500000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #17  <Int 0x500000>
	//    3    4:invokespecial   #20  <Method void lg(File, int)>
	//    4    7:return          
	}

	public lg(File file, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		a = ((Map) (new LinkedHashMap(16, 0.75F, true)));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:ldc1            #27  <Float 0.75F>
	//    7   13:iconst_1        
	//    8   14:invokespecial   #30  <Method void LinkedHashMap(int, float, boolean)>
	//    9   17:putfield        #32  <Field Map a>
		b = 0L;
	//   10   20:aload_0         
	//   11   21:lconst_0        
	//   12   22:putfield        #34  <Field long b>
		c = file;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #36  <Field File c>
		d = i;
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:putfield        #38  <Field int d>
	//   19   35:return          
	}

	static int a(InputStream inputstream)
	{
		int i = c(inputstream);
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method int c(InputStream)>
	//    2    4:istore_1        
		int j = c(inputstream);
	//    3    5:aload_0         
	//    4    6:invokestatic    #41  <Method int c(InputStream)>
	//    5    9:istore_2        
		int k = c(inputstream);
	//    6   10:aload_0         
	//    7   11:invokestatic    #41  <Method int c(InputStream)>
	//    8   14:istore_3        
		return c(inputstream) << 24 | (i | 0 | j << 8 | k << 16);
	//    9   15:aload_0         
	//   10   16:invokestatic    #41  <Method int c(InputStream)>
	//   11   19:bipush          24
	//   12   21:ishl            
	//   13   22:iload_1         
	//   14   23:iconst_0        
	//   15   24:ior             
	//   16   25:iload_2         
	//   17   26:bipush          8
	//   18   28:ishl            
	//   19   29:ior             
	//   20   30:iload_3         
	//   21   31:bipush          16
	//   22   33:ishl            
	//   23   34:ior             
	//   24   35:ior             
	//   25   36:ireturn         
	}

	private static InputStream a(File file)
	{
		return ((InputStream) (new FileInputStream(file)));
	//    0    0:new             #44  <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #46  <Method void FileInputStream(File)>
	//    4    8:areturn         
	}

	static String a(mx mx1)
	{
		return new String(a(mx1, b(((InputStream) (mx1)))), "UTF-8");
	//    0    0:new             #49  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #52  <Method long b(InputStream)>
	//    5    9:invokestatic    #55  <Method byte[] a(mx, long)>
	//    6   12:ldc1            #57  <String "UTF-8">
	//    7   14:invokespecial   #60  <Method void String(byte[], String)>
	//    8   17:areturn         
	}

	static void a(OutputStream outputstream, int i)
	{
		outputstream.write(i & 0xff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:sipush          255
	//    3    5:iand            
	//    4    6:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(i >> 8 & 0xff);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:bipush          8
	//    8   13:ishr            
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(i >> 16 & 0xff);
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:bipush          16
	//   15   25:ishr            
	//   16   26:sipush          255
	//   17   29:iand            
	//   18   30:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(i >>> 24);
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:bipush          24
	//   22   37:iushr           
	//   23   38:invokevirtual   #67  <Method void OutputStream.write(int)>
	//   24   41:return          
	}

	static void a(OutputStream outputstream, long l)
	{
		outputstream.write(((int) ((byte)(int)l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:l2i             
	//    3    3:int2byte        
	//    4    4:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 8))));
	//    5    7:aload_0         
	//    6    8:lload_1         
	//    7    9:bipush          8
	//    8   11:lushr           
	//    9   12:l2i             
	//   10   13:int2byte        
	//   11   14:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 16))));
	//   12   17:aload_0         
	//   13   18:lload_1         
	//   14   19:bipush          16
	//   15   21:lushr           
	//   16   22:l2i             
	//   17   23:int2byte        
	//   18   24:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 24))));
	//   19   27:aload_0         
	//   20   28:lload_1         
	//   21   29:bipush          24
	//   22   31:lushr           
	//   23   32:l2i             
	//   24   33:int2byte        
	//   25   34:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 32))));
	//   26   37:aload_0         
	//   27   38:lload_1         
	//   28   39:bipush          32
	//   29   41:lushr           
	//   30   42:l2i             
	//   31   43:int2byte        
	//   32   44:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 40))));
	//   33   47:aload_0         
	//   34   48:lload_1         
	//   35   49:bipush          40
	//   36   51:lushr           
	//   37   52:l2i             
	//   38   53:int2byte        
	//   39   54:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 48))));
	//   40   57:aload_0         
	//   41   58:lload_1         
	//   42   59:bipush          48
	//   43   61:lushr           
	//   44   62:l2i             
	//   45   63:int2byte        
	//   46   64:invokevirtual   #67  <Method void OutputStream.write(int)>
		outputstream.write(((int) ((byte)(int)(l >>> 56))));
	//   47   67:aload_0         
	//   48   68:lload_1         
	//   49   69:bipush          56
	//   50   71:lushr           
	//   51   72:l2i             
	//   52   73:int2byte        
	//   53   74:invokevirtual   #67  <Method void OutputStream.write(int)>
	//   54   77:return          
	}

	static void a(OutputStream outputstream, String s)
	{
		s = ((String) (s.getBytes("UTF-8")));
	//    0    0:aload_1         
	//    1    1:ldc1            #57  <String "UTF-8">
	//    2    3:invokevirtual   #73  <Method byte[] String.getBytes(String)>
	//    3    6:astore_1        
		a(outputstream, s.length);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:arraylength     
	//    7   10:i2l             
	//    8   11:invokestatic    #75  <Method void a(OutputStream, long)>
		outputstream.write(((byte []) (s)), 0, s.length);
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:iconst_0        
	//   12   17:aload_1         
	//   13   18:arraylength     
	//   14   19:invokevirtual   #78  <Method void OutputStream.write(byte[], int, int)>
	//   15   22:return          
	}

	private final void a(String s, ly ly1)
	{
		if(!a.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Map a>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #85  <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            29
		{
			b = b + ly1.a;
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #34  <Field long b>
	//    8   18:aload_2         
	//    9   19:getfield        #89  <Field long ly.a>
	//   10   22:ladd            
	//   11   23:putfield        #34  <Field long b>
		} else
	//*  12   26:goto            61
		{
			ly ly2 = (ly)a.get(((Object) (s)));
	//   13   29:aload_0         
	//   14   30:getfield        #32  <Field Map a>
	//   15   33:aload_1         
	//   16   34:invokeinterface #93  <Method Object Map.get(Object)>
	//   17   39:checkcast       #87  <Class ly>
	//   18   42:astore_3        
			b = b + (ly1.a - ly2.a);
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:getfield        #34  <Field long b>
	//   22   48:aload_2         
	//   23   49:getfield        #89  <Field long ly.a>
	//   24   52:aload_3         
	//   25   53:getfield        #89  <Field long ly.a>
	//   26   56:lsub            
	//   27   57:ladd            
	//   28   58:putfield        #34  <Field long b>
		}
		a.put(((Object) (s)), ((Object) (ly1)));
	//   29   61:aload_0         
	//   30   62:getfield        #32  <Field Map a>
	//   31   65:aload_1         
	//   32   66:aload_2         
	//   33   67:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   34   72:pop             
	//   35   73:return          
	}

	private static byte[] a(mx mx1, long l)
	{
		long l1 = mx1.a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method long mx.a()>
	//    2    4:lstore          4
		if(l >= 0L && l <= l1)
	//*   3    6:lload_1         
	//*   4    7:lconst_0        
	//*   5    8:lcmp            
	//*   6    9:iflt            50
	//*   7   12:lload_1         
	//*   8   13:lload           4
	//*   9   15:lcmp            
	//*  10   16:ifgt            50
		{
			int i = (int)l;
	//   11   19:lload_1         
	//   12   20:l2i             
	//   13   21:istore_3        
			if((long)i == l)
	//*  14   22:iload_3         
	//*  15   23:i2l             
	//*  16   24:lload_1         
	//*  17   25:lcmp            
	//*  18   26:ifne            50
			{
				byte abyte0[] = new byte[i];
	//   19   29:iload_3         
	//   20   30:newarray        byte[]
	//   21   32:astore          6
				(new DataInputStream(((InputStream) (mx1)))).readFully(abyte0);
	//   22   34:new             #104 <Class DataInputStream>
	//   23   37:dup             
	//   24   38:aload_0         
	//   25   39:invokespecial   #107 <Method void DataInputStream(InputStream)>
	//   26   42:aload           6
	//   27   44:invokevirtual   #111 <Method void DataInputStream.readFully(byte[])>
				return abyte0;
	//   28   47:aload           6
	//   29   49:areturn         
			}
		}
		mx1 = ((mx) (new StringBuilder(73)));
	//   30   50:new             #113 <Class StringBuilder>
	//   31   53:dup             
	//   32   54:bipush          73
	//   33   56:invokespecial   #115 <Method void StringBuilder(int)>
	//   34   59:astore_0        
		((StringBuilder) (mx1)).append("streamToBytes length=");
	//   35   60:aload_0         
	//   36   61:ldc1            #117 <String "streamToBytes length=">
	//   37   63:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   38   66:pop             
		((StringBuilder) (mx1)).append(l);
	//   39   67:aload_0         
	//   40   68:lload_1         
	//   41   69:invokevirtual   #124 <Method StringBuilder StringBuilder.append(long)>
	//   42   72:pop             
		((StringBuilder) (mx1)).append(", maxLength=");
	//   43   73:aload_0         
	//   44   74:ldc1            #126 <String ", maxLength=">
	//   45   76:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   46   79:pop             
		((StringBuilder) (mx1)).append(l1);
	//   47   80:aload_0         
	//   48   81:lload           4
	//   49   83:invokevirtual   #124 <Method StringBuilder StringBuilder.append(long)>
	//   50   86:pop             
		throw new IOException(((StringBuilder) (mx1)).toString());
	//   51   87:new             #128 <Class IOException>
	//   52   90:dup             
	//   53   91:aload_0         
	//   54   92:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   55   95:invokespecial   #135 <Method void IOException(String)>
	//   56   98:athrow          
	}

	static long b(InputStream inputstream)
	{
		return (long)c(inputstream) & 255L | 0L | ((long)c(inputstream) & 255L) << 8 | ((long)c(inputstream) & 255L) << 16 | ((long)c(inputstream) & 255L) << 24 | ((long)c(inputstream) & 255L) << 32 | ((long)c(inputstream) & 255L) << 40 | ((long)c(inputstream) & 255L) << 48 | (255L & (long)c(inputstream)) << 56;
	//    0    0:aload_0         
	//    1    1:invokestatic    #41  <Method int c(InputStream)>
	//    2    4:i2l             
	//    3    5:ldc2w           #136 <Long 255L>
	//    4    8:land            
	//    5    9:lconst_0        
	//    6   10:lor             
	//    7   11:aload_0         
	//    8   12:invokestatic    #41  <Method int c(InputStream)>
	//    9   15:i2l             
	//   10   16:ldc2w           #136 <Long 255L>
	//   11   19:land            
	//   12   20:bipush          8
	//   13   22:lshl            
	//   14   23:lor             
	//   15   24:aload_0         
	//   16   25:invokestatic    #41  <Method int c(InputStream)>
	//   17   28:i2l             
	//   18   29:ldc2w           #136 <Long 255L>
	//   19   32:land            
	//   20   33:bipush          16
	//   21   35:lshl            
	//   22   36:lor             
	//   23   37:aload_0         
	//   24   38:invokestatic    #41  <Method int c(InputStream)>
	//   25   41:i2l             
	//   26   42:ldc2w           #136 <Long 255L>
	//   27   45:land            
	//   28   46:bipush          24
	//   29   48:lshl            
	//   30   49:lor             
	//   31   50:aload_0         
	//   32   51:invokestatic    #41  <Method int c(InputStream)>
	//   33   54:i2l             
	//   34   55:ldc2w           #136 <Long 255L>
	//   35   58:land            
	//   36   59:bipush          32
	//   37   61:lshl            
	//   38   62:lor             
	//   39   63:aload_0         
	//   40   64:invokestatic    #41  <Method int c(InputStream)>
	//   41   67:i2l             
	//   42   68:ldc2w           #136 <Long 255L>
	//   43   71:land            
	//   44   72:bipush          40
	//   45   74:lshl            
	//   46   75:lor             
	//   47   76:aload_0         
	//   48   77:invokestatic    #41  <Method int c(InputStream)>
	//   49   80:i2l             
	//   50   81:ldc2w           #136 <Long 255L>
	//   51   84:land            
	//   52   85:bipush          48
	//   53   87:lshl            
	//   54   88:lor             
	//   55   89:ldc2w           #136 <Long 255L>
	//   56   92:aload_0         
	//   57   93:invokestatic    #41  <Method int c(InputStream)>
	//   58   96:i2l             
	//   59   97:land            
	//   60   98:bipush          56
	//   61  100:lshl            
	//   62  101:lor             
	//   63  102:lreturn         
	}

	static List b(mx mx1)
	{
		int j = a(((InputStream) (mx1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #140 <Method int a(InputStream)>
	//    2    4:istore_2        
		if(j >= 0)
	//*   3    5:iload_2         
	//*   4    6:iflt            72
		{
			Object obj;
			if(j == 0)
	//*   5    9:iload_2         
	//*   6   10:ifne            20
				obj = ((Object) (Collections.emptyList()));
	//    7   13:invokestatic    #146 <Method List Collections.emptyList()>
	//    8   16:astore_3        
			else
	//*   9   17:goto            28
				obj = ((Object) (new ArrayList()));
	//   10   20:new             #148 <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #149 <Method void ArrayList()>
	//   13   27:astore_3        
			for(int i = 0; i < j; i++)
	//*  14   28:iconst_0        
	//*  15   29:istore_1        
	//*  16   30:iload_1         
	//*  17   31:iload_2         
	//*  18   32:icmpge          70
				((List) (obj)).add(((Object) (new bim(a(mx1).intern(), a(mx1).intern()))));
	//   19   35:aload_3         
	//   20   36:new             #151 <Class bim>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:invokestatic    #153 <Method String a(mx)>
	//   24   44:invokevirtual   #156 <Method String String.intern()>
	//   25   47:aload_0         
	//   26   48:invokestatic    #153 <Method String a(mx)>
	//   27   51:invokevirtual   #156 <Method String String.intern()>
	//   28   54:invokespecial   #159 <Method void bim(String, String)>
	//   29   57:invokeinterface #164 <Method boolean List.add(Object)>
	//   30   62:pop             

	//   31   63:iload_1         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_1        
	//*  35   67:goto            30
			return ((List) (obj));
	//   36   70:aload_3         
	//   37   71:areturn         
		} else
		{
			mx1 = ((mx) (new StringBuilder(31)));
	//   38   72:new             #113 <Class StringBuilder>
	//   39   75:dup             
	//   40   76:bipush          31
	//   41   78:invokespecial   #115 <Method void StringBuilder(int)>
	//   42   81:astore_0        
			((StringBuilder) (mx1)).append("readHeaderList size=");
	//   43   82:aload_0         
	//   44   83:ldc1            #166 <String "readHeaderList size=">
	//   45   85:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   46   88:pop             
			((StringBuilder) (mx1)).append(j);
	//   47   89:aload_0         
	//   48   90:iload_2         
	//   49   91:invokevirtual   #169 <Method StringBuilder StringBuilder.append(int)>
	//   50   94:pop             
			throw new IOException(((StringBuilder) (mx1)).toString());
	//   51   95:new             #128 <Class IOException>
	//   52   98:dup             
	//   53   99:aload_0         
	//   54  100:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   55  103:invokespecial   #135 <Method void IOException(String)>
	//   56  106:athrow          
		}
	}

	private final void b(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		flag = d(s).delete();
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #172 <Method File d(String)>
	//    5    7:invokevirtual   #178 <Method boolean File.delete()>
	//    6   10:istore_2        
		e(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #181 <Method void e(String)>
		if(flag)
			break MISSING_BLOCK_LABEL_40;
	//   10   16:iload_2         
	//   11   17:ifne            40
		ee.b("Could not delete cache entry for key=%s, filename=%s", new Object[] {
			s, c(s)
		});
	//   12   20:ldc1            #183 <String "Could not delete cache entry for key=%s, filename=%s">
	//   13   22:iconst_2        
	//   14   23:anewarray       Object[]
	//   15   26:dup             
	//   16   27:iconst_0        
	//   17   28:aload_1         
	//   18   29:aastore         
	//   19   30:dup             
	//   20   31:iconst_1        
	//   21   32:aload_1         
	//   22   33:invokestatic    #186 <Method String c(String)>
	//   23   36:aastore         
	//   24   37:invokestatic    #191 <Method void ee.b(String, Object[])>
		this;
	//   25   40:aload_0         
		JVM INSTR monitorexit ;
	//   26   41:monitorexit     
		return;
	//   27   42:return          
		s;
	//   28   43:astore_1        
	//*  29   44:aload_0         
		throw s;
	//   30   45:monitorexit     
	//   31   46:aload_1         
	//   32   47:athrow          
	}

	private static int c(InputStream inputstream)
	{
		int i = inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #197 <Method int InputStream.read()>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		else
			throw new EOFException();
	//    8   12:new             #199 <Class EOFException>
	//    9   15:dup             
	//   10   16:invokespecial   #200 <Method void EOFException()>
	//   11   19:athrow          
	}

	private static String c(String s)
	{
		int i = s.length() / 2;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #203 <Method int String.length()>
	//    2    4:iconst_2        
	//    3    5:idiv            
	//    4    6:istore_1        
		String s1 = String.valueOf(((Object) (String.valueOf(s.substring(0, i).hashCode()))));
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:iload_1         
	//    8   10:invokevirtual   #207 <Method String String.substring(int, int)>
	//    9   13:invokevirtual   #210 <Method int String.hashCode()>
	//   10   16:invokestatic    #214 <Method String String.valueOf(int)>
	//   11   19:invokestatic    #217 <Method String String.valueOf(Object)>
	//   12   22:astore_2        
		s = String.valueOf(((Object) (String.valueOf(s.substring(i).hashCode()))));
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #219 <Method String String.substring(int)>
	//   16   28:invokevirtual   #210 <Method int String.hashCode()>
	//   17   31:invokestatic    #214 <Method String String.valueOf(int)>
	//   18   34:invokestatic    #217 <Method String String.valueOf(Object)>
	//   19   37:astore_0        
		if(s.length() != 0)
	//*  20   38:aload_0         
	//*  21   39:invokevirtual   #203 <Method int String.length()>
	//*  22   42:ifeq            51
			return s1.concat(s);
	//   23   45:aload_2         
	//   24   46:aload_0         
	//   25   47:invokevirtual   #222 <Method String String.concat(String)>
	//   26   50:areturn         
		else
			return new String(s1);
	//   27   51:new             #49  <Class String>
	//   28   54:dup             
	//   29   55:aload_2         
	//   30   56:invokespecial   #223 <Method void String(String)>
	//   31   59:areturn         
	}

	private final File d(String s)
	{
		return new File(c, c(s));
	//    0    0:new             #174 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field File c>
	//    4    8:aload_1         
	//    5    9:invokestatic    #186 <Method String c(String)>
	//    6   12:invokespecial   #226 <Method void File(File, String)>
	//    7   15:areturn         
	}

	private final void e(String s)
	{
		s = ((String) ((ly)a.remove(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Map a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #229 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #87  <Class ly>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          31
			b = b - ((ly) (s)).a;
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #34  <Field long b>
	//   11   23:aload_1         
	//   12   24:getfield        #89  <Field long ly.a>
	//   13   27:lsub            
	//   14   28:putfield        #34  <Field long b>
	//   15   31:return          
	}

	public final azi a(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ly ly1 = (ly)a.get(((Object) (s)));
	//    2    2:aload_0         
	//    3    3:getfield        #32  <Field Map a>
	//    4    6:aload_1         
	//    5    7:invokeinterface #93  <Method Object Map.get(Object)>
	//    6   12:checkcast       #87  <Class ly>
	//    7   15:astore          4
		if(ly1 != null)
			break MISSING_BLOCK_LABEL_26;
	//    8   17:aload           4
	//    9   19:ifnonnull       26
		this;
	//   10   22:aload_0         
		JVM INSTR monitorexit ;
	//   11   23:monitorexit     
		return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		File file = d(s);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokespecial   #172 <Method File d(String)>
	//   17   31:astore_2        
		mx mx1 = new mx(((InputStream) (new BufferedInputStream(a(file)))), file.length());
	//   18   32:new             #99  <Class mx>
	//   19   35:dup             
	//   20   36:new             #232 <Class BufferedInputStream>
	//   21   39:dup             
	//   22   40:aload_2         
	//   23   41:invokestatic    #234 <Method InputStream a(File)>
	//   24   44:invokespecial   #235 <Method void BufferedInputStream(InputStream)>
	//   25   47:aload_2         
	//   26   48:invokevirtual   #237 <Method long File.length()>
	//   27   51:invokespecial   #240 <Method void mx(InputStream, long)>
	//   28   54:astore_3        
		ly ly2 = ly.a(mx1);
	//   29   55:aload_3         
	//   30   56:invokestatic    #243 <Method ly ly.a(mx)>
	//   31   59:astore          5
		if(TextUtils.equals(((CharSequence) (s)), ((CharSequence) (ly2.b))))
			break MISSING_BLOCK_LABEL_114;
	//   32   61:aload_1         
	//   33   62:aload           5
	//   34   64:getfield        #246 <Field String ly.b>
	//   35   67:invokestatic    #252 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   36   70:ifne            114
		ee.b("%s: key=%s, found=%s", new Object[] {
			file.getAbsolutePath(), s, ly2.b
		});
	//   37   73:ldc1            #254 <String "%s: key=%s, found=%s">
	//   38   75:iconst_3        
	//   39   76:anewarray       Object[]
	//   40   79:dup             
	//   41   80:iconst_0        
	//   42   81:aload_2         
	//   43   82:invokevirtual   #257 <Method String File.getAbsolutePath()>
	//   44   85:aastore         
	//   45   86:dup             
	//   46   87:iconst_1        
	//   47   88:aload_1         
	//   48   89:aastore         
	//   49   90:dup             
	//   50   91:iconst_2        
	//   51   92:aload           5
	//   52   94:getfield        #246 <Field String ly.b>
	//   53   97:aastore         
	//   54   98:invokestatic    #191 <Method void ee.b(String, Object[])>
		e(s);
	//   55  101:aload_0         
	//   56  102:aload_1         
	//   57  103:invokespecial   #181 <Method void e(String)>
		mx1.close();
	//   58  106:aload_3         
	//   59  107:invokevirtual   #260 <Method void mx.close()>
		this;
	//   60  110:aload_0         
		JVM INSTR monitorexit ;
	//   61  111:monitorexit     
		return null;
	//   62  112:aconst_null     
	//   63  113:areturn         
		azi azi1;
		TreeMap treemap;
		byte abyte0[] = a(mx1, mx1.a());
	//   64  114:aload_3         
	//   65  115:aload_3         
	//   66  116:invokevirtual   #102 <Method long mx.a()>
	//   67  119:invokestatic    #55  <Method byte[] a(mx, long)>
	//   68  122:astore          6
		azi1 = new azi();
	//   69  124:new             #262 <Class azi>
	//   70  127:dup             
	//   71  128:invokespecial   #263 <Method void azi()>
	//   72  131:astore          5
		azi1.a = abyte0;
	//   73  133:aload           5
	//   74  135:aload           6
	//   75  137:putfield        #266 <Field byte[] azi.a>
		azi1.b = ly1.c;
	//   76  140:aload           5
	//   77  142:aload           4
	//   78  144:getfield        #268 <Field String ly.c>
	//   79  147:putfield        #269 <Field String azi.b>
		azi1.c = ly1.d;
	//   80  150:aload           5
	//   81  152:aload           4
	//   82  154:getfield        #271 <Field long ly.d>
	//   83  157:putfield        #273 <Field long azi.c>
		azi1.d = ly1.e;
	//   84  160:aload           5
	//   85  162:aload           4
	//   86  164:getfield        #275 <Field long ly.e>
	//   87  167:putfield        #276 <Field long azi.d>
		azi1.e = ly1.f;
	//   88  170:aload           5
	//   89  172:aload           4
	//   90  174:getfield        #279 <Field long ly.f>
	//   91  177:putfield        #280 <Field long azi.e>
		azi1.f = ly1.g;
	//   92  180:aload           5
	//   93  182:aload           4
	//   94  184:getfield        #283 <Field long ly.g>
	//   95  187:putfield        #284 <Field long azi.f>
		Object obj = ((Object) (ly1.h));
	//   96  190:aload           4
	//   97  192:getfield        #288 <Field List ly.h>
	//   98  195:astore          7
		treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
	//   99  197:new             #290 <Class TreeMap>
	//  100  200:dup             
	//  101  201:getstatic       #294 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//  102  204:invokespecial   #297 <Method void TreeMap(java.util.Comparator)>
	//  103  207:astore          6
		bim bim1;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Map) (treemap)).put(((Object) (bim1.a())), ((Object) (bim1.b()))))
	//* 104  209:aload           7
	//* 105  211:invokeinterface #301 <Method Iterator List.iterator()>
	//* 106  216:astore          7
	//* 107  218:aload           7
	//* 108  220:invokeinterface #306 <Method boolean Iterator.hasNext()>
	//* 109  225:ifeq            261
			bim1 = (bim)((Iterator) (obj)).next();
	//  110  228:aload           7
	//  111  230:invokeinterface #310 <Method Object Iterator.next()>
	//  112  235:checkcast       #151 <Class bim>
	//  113  238:astore          8

	//  114  240:aload           6
	//  115  242:aload           8
	//  116  244:invokevirtual   #312 <Method String bim.a()>
	//  117  247:aload           8
	//  118  249:invokevirtual   #314 <Method String bim.b()>
	//  119  252:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//  120  257:pop             
	//* 121  258:goto            218
		azi1.g = ((Map) (treemap));
	//  122  261:aload           5
	//  123  263:aload           6
	//  124  265:putfield        #316 <Field Map azi.g>
		azi1.h = Collections.unmodifiableList(ly1.h);
	//  125  268:aload           5
	//  126  270:aload           4
	//  127  272:getfield        #288 <Field List ly.h>
	//  128  275:invokestatic    #320 <Method List Collections.unmodifiableList(List)>
	//  129  278:putfield        #321 <Field List azi.h>
		mx1.close();
	//  130  281:aload_3         
	//  131  282:invokevirtual   #260 <Method void mx.close()>
		this;
	//  132  285:aload_0         
		JVM INSTR monitorexit ;
	//  133  286:monitorexit     
		return azi1;
	//  134  287:aload           5
	//  135  289:areturn         
		Exception exception;
		exception;
	//  136  290:astore          4
		mx1.close();
	//  137  292:aload_3         
	//  138  293:invokevirtual   #260 <Method void mx.close()>
		throw exception;
	//  139  296:aload           4
	//  140  298:athrow          
		IOException ioexception;
		ioexception;
	//  141  299:astore_3        
		ee.b("%s: %s", new Object[] {
			file.getAbsolutePath(), ioexception.toString()
		});
	//  142  300:ldc2            #323 <String "%s: %s">
	//  143  303:iconst_2        
	//  144  304:anewarray       Object[]
	//  145  307:dup             
	//  146  308:iconst_0        
	//  147  309:aload_2         
	//  148  310:invokevirtual   #257 <Method String File.getAbsolutePath()>
	//  149  313:aastore         
	//  150  314:dup             
	//  151  315:iconst_1        
	//  152  316:aload_3         
	//  153  317:invokevirtual   #324 <Method String IOException.toString()>
	//  154  320:aastore         
	//  155  321:invokestatic    #191 <Method void ee.b(String, Object[])>
		b(s);
	//  156  324:aload_0         
	//  157  325:aload_1         
	//  158  326:invokespecial   #326 <Method void b(String)>
		this;
	//  159  329:aload_0         
		JVM INSTR monitorexit ;
	//  160  330:monitorexit     
		return null;
	//  161  331:aconst_null     
	//  162  332:areturn         
		s;
	//  163  333:astore_1        
	//* 164  334:aload_0         
		throw s;
	//  165  335:monitorexit     
	//  166  336:aload_1         
	//  167  337:athrow          
	}

	public final void a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = c.exists();
	//    2    2:aload_0         
	//    3    3:getfield        #36  <Field File c>
	//    4    6:invokevirtual   #329 <Method boolean File.exists()>
	//    5    9:istore_3        
		int i;
		i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_49;
	//    8   12:iload_3         
	//    9   13:ifne            49
		if(!c.mkdirs())
	//*  10   16:aload_0         
	//*  11   17:getfield        #36  <Field File c>
	//*  12   20:invokevirtual   #332 <Method boolean File.mkdirs()>
	//*  13   23:ifne            46
			ee.c("Unable to create cache dir %s", new Object[] {
				c.getAbsolutePath()
			});
	//   14   26:ldc2            #334 <String "Unable to create cache dir %s">
	//   15   29:iconst_1        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:aload_0         
	//   20   36:getfield        #36  <Field File c>
	//   21   39:invokevirtual   #257 <Method String File.getAbsolutePath()>
	//   22   42:aastore         
	//   23   43:invokestatic    #336 <Method void ee.c(String, Object[])>
		this;
	//   24   46:aload_0         
		JVM INSTR monitorexit ;
	//   25   47:monitorexit     
		return;
	//   26   48:return          
		File afile[] = c.listFiles();
	//   27   49:aload_0         
	//   28   50:getfield        #36  <Field File c>
	//   29   53:invokevirtual   #340 <Method File[] File.listFiles()>
	//   30   56:astore          6
		if(afile != null)
			break MISSING_BLOCK_LABEL_66;
	//   31   58:aload           6
	//   32   60:ifnonnull       66
		this;
	//   33   63:aload_0         
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
		return;
	//   35   65:return          
		int j = afile.length;
	//   36   66:aload           6
	//   37   68:arraylength     
	//   38   69:istore_2        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   39   70:iload_1         
	//   40   71:iload_2         
	//   41   72:icmpge          167
_L1:
		File file = afile[i];
	//   42   75:aload           6
	//   43   77:iload_1         
	//   44   78:aaload          
	//   45   79:astore          7
		long l;
		mx mx1;
		l = file.length();
	//   46   81:aload           7
	//   47   83:invokevirtual   #237 <Method long File.length()>
	//   48   86:lstore          4
		mx1 = new mx(((InputStream) (new BufferedInputStream(a(file)))), l);
	//   49   88:new             #99  <Class mx>
	//   50   91:dup             
	//   51   92:new             #232 <Class BufferedInputStream>
	//   52   95:dup             
	//   53   96:aload           7
	//   54   98:invokestatic    #234 <Method InputStream a(File)>
	//   55  101:invokespecial   #235 <Method void BufferedInputStream(InputStream)>
	//   56  104:lload           4
	//   57  106:invokespecial   #240 <Method void mx(InputStream, long)>
	//   58  109:astore          8
		ly ly1 = ly.a(mx1);
	//   59  111:aload           8
	//   60  113:invokestatic    #243 <Method ly ly.a(mx)>
	//   61  116:astore          9
		ly1.a = l;
	//   62  118:aload           9
	//   63  120:lload           4
	//   64  122:putfield        #89  <Field long ly.a>
		a(ly1.b, ly1);
	//   65  125:aload_0         
	//   66  126:aload           9
	//   67  128:getfield        #246 <Field String ly.b>
	//   68  131:aload           9
	//   69  133:invokespecial   #342 <Method void a(String, ly)>
		Exception exception1;
		try
		{
			mx1.close();
	//   70  136:aload           8
	//   71  138:invokevirtual   #260 <Method void mx.close()>
		}
	//*  72  141:goto            160
	//*  73  144:astore          9
	//*  74  146:aload           8
	//*  75  148:invokevirtual   #260 <Method void mx.close()>
	//*  76  151:aload           9
	//*  77  153:athrow          
	//*  78  154:aload           7
	//*  79  156:invokevirtual   #178 <Method boolean File.delete()>
	//*  80  159:pop             
	//*  81  160:iload_1         
	//*  82  161:iconst_1        
	//*  83  162:iadd            
	//*  84  163:istore_1        
	//*  85  164:goto            70
	//*  86  167:aload_0         
	//*  87  168:monitorexit     
	//*  88  169:return          
	//*  89  170:astore          6
	//*  90  172:aload_0         
	//*  91  173:monitorexit     
	//*  92  174:aload           6
	//*  93  176:athrow          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			file.delete();
		}
		continue; /* Loop/switch isn't completed */
		exception1;
		mx1.close();
		throw exception1;
		  goto _L3
_L2:
		this;
		JVM INSTR monitorexit ;
		return;
		Exception exception;
		exception;
		IOException ioexception;
		throw exception;
	//*  94  177:astore          8
	//*  95  179:goto            154
	}

	public final void a(String s, azi azi1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		long l;
		i = azi1.a.length;
	//    2    2:aload_2         
	//    3    3:getfield        #266 <Field byte[] azi.a>
	//    4    6:arraylength     
	//    5    7:istore_3        
		l = b;
	//    6    8:aload_0         
	//    7    9:getfield        #34  <Field long b>
	//    8   12:lstore          4
		long l1 = i;
	//    9   14:iload_3         
	//   10   15:i2l             
	//   11   16:lstore          6
		long l2;
		Object obj;
		if(l + l1 < (long)d)
			break MISSING_BLOCK_LABEL_250;
	//   12   18:lload           4
	//   13   20:lload           6
	//   14   22:ladd            
	//   15   23:aload_0         
	//   16   24:getfield        #38  <Field int d>
	//   17   27:i2l             
	//   18   28:lcmp            
	//   19   29:iflt            250
		if(ee.a)
	//*  20   32:getstatic       #346 <Field boolean ee.a>
	//*  21   35:ifeq            48
			ee.a("Pruning old cache entries.", new Object[0]);
	//   22   38:ldc2            #348 <String "Pruning old cache entries.">
	//   23   41:iconst_0        
	//   24   42:anewarray       Object[]
	//   25   45:invokestatic    #350 <Method void ee.a(String, Object[])>
		l = b;
	//   26   48:aload_0         
	//   27   49:getfield        #34  <Field long b>
	//   28   52:lstore          4
		l2 = SystemClock.elapsedRealtime();
	//   29   54:invokestatic    #355 <Method long SystemClock.elapsedRealtime()>
	//   30   57:lstore          8
		obj = ((Object) (a.entrySet().iterator()));
	//   31   59:aload_0         
	//   32   60:getfield        #32  <Field Map a>
	//   33   63:invokeinterface #359 <Method Set Map.entrySet()>
	//   34   68:invokeinterface #362 <Method Iterator Set.iterator()>
	//   35   73:astore          10
		i = 0;
	//   36   75:iconst_0        
	//   37   76:istore_3        
_L2:
		Object obj1;
		if(!((Iterator) (obj)).hasNext())
			break; /* Loop/switch isn't completed */
	//   38   77:aload           10
	//   39   79:invokeinterface #306 <Method boolean Iterator.hasNext()>
	//   40   84:ifeq            392
		obj1 = ((Object) ((ly)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue()));
	//   41   87:aload           10
	//   42   89:invokeinterface #310 <Method Object Iterator.next()>
	//   43   94:checkcast       #364 <Class java.util.Map$Entry>
	//   44   97:invokeinterface #367 <Method Object java.util.Map$Entry.getValue()>
	//   45  102:checkcast       #87  <Class ly>
	//   46  105:astore          11
		if(d(((ly) (obj1)).b).delete())
	//*  47  107:aload_0         
	//*  48  108:aload           11
	//*  49  110:getfield        #246 <Field String ly.b>
	//*  50  113:invokespecial   #172 <Method File d(String)>
	//*  51  116:invokevirtual   #178 <Method boolean File.delete()>
	//*  52  119:ifeq            139
		{
			b = b - ((ly) (obj1)).a;
	//   53  122:aload_0         
	//   54  123:aload_0         
	//   55  124:getfield        #34  <Field long b>
	//   56  127:aload           11
	//   57  129:getfield        #89  <Field long ly.a>
	//   58  132:lsub            
	//   59  133:putfield        #34  <Field long b>
			break MISSING_BLOCK_LABEL_167;
	//   60  136:goto            167
		}
		ee.b("Could not delete cache entry for key=%s, filename=%s", new Object[] {
			((ly) (obj1)).b, c(((ly) (obj1)).b)
		});
	//   61  139:ldc1            #183 <String "Could not delete cache entry for key=%s, filename=%s">
	//   62  141:iconst_2        
	//   63  142:anewarray       Object[]
	//   64  145:dup             
	//   65  146:iconst_0        
	//   66  147:aload           11
	//   67  149:getfield        #246 <Field String ly.b>
	//   68  152:aastore         
	//   69  153:dup             
	//   70  154:iconst_1        
	//   71  155:aload           11
	//   72  157:getfield        #246 <Field String ly.b>
	//   73  160:invokestatic    #186 <Method String c(String)>
	//   74  163:aastore         
	//   75  164:invokestatic    #191 <Method void ee.b(String, Object[])>
		((Iterator) (obj)).remove();
	//   76  167:aload           10
	//   77  169:invokeinterface #369 <Method void Iterator.remove()>
		i++;
	//   78  174:iload_3         
	//   79  175:iconst_1        
	//   80  176:iadd            
	//   81  177:istore_3        
		if((float)(b + l1) >= (float)d * 0.9F) goto _L2; else goto _L1
	//   82  178:aload_0         
	//   83  179:getfield        #34  <Field long b>
	//   84  182:lload           6
	//   85  184:ladd            
	//   86  185:l2f             
	//   87  186:aload_0         
	//   88  187:getfield        #38  <Field int d>
	//   89  190:i2f             
	//   90  191:ldc2            #370 <Float 0.9F>
	//   91  194:fmul            
	//   92  195:fcmpg           
	//   93  196:ifge            389
	//*  94  199:goto            202
_L1:
		if(ee.a)
	//*  95  202:getstatic       #346 <Field boolean ee.a>
	//*  96  205:ifeq            250
			ee.a("pruned %d files, %d bytes, %d ms", new Object[] {
				Integer.valueOf(i), Long.valueOf(b - l), Long.valueOf(SystemClock.elapsedRealtime() - l2)
			});
	//   97  208:ldc2            #372 <String "pruned %d files, %d bytes, %d ms">
	//   98  211:iconst_3        
	//   99  212:anewarray       Object[]
	//  100  215:dup             
	//  101  216:iconst_0        
	//  102  217:iload_3         
	//  103  218:invokestatic    #377 <Method Integer Integer.valueOf(int)>
	//  104  221:aastore         
	//  105  222:dup             
	//  106  223:iconst_1        
	//  107  224:aload_0         
	//  108  225:getfield        #34  <Field long b>
	//  109  228:lload           4
	//  110  230:lsub            
	//  111  231:invokestatic    #382 <Method Long Long.valueOf(long)>
	//  112  234:aastore         
	//  113  235:dup             
	//  114  236:iconst_2        
	//  115  237:invokestatic    #355 <Method long SystemClock.elapsedRealtime()>
	//  116  240:lload           8
	//  117  242:lsub            
	//  118  243:invokestatic    #382 <Method Long Long.valueOf(long)>
	//  119  246:aastore         
	//  120  247:invokestatic    #350 <Method void ee.a(String, Object[])>
		obj = ((Object) (d(s)));
	//  121  250:aload_0         
	//  122  251:aload_1         
	//  123  252:invokespecial   #172 <Method File d(String)>
	//  124  255:astore          10
		obj1 = ((Object) (new BufferedOutputStream(((OutputStream) (new FileOutputStream(((File) (obj))))))));
	//  125  257:new             #384 <Class BufferedOutputStream>
	//  126  260:dup             
	//  127  261:new             #386 <Class FileOutputStream>
	//  128  264:dup             
	//  129  265:aload           10
	//  130  267:invokespecial   #387 <Method void FileOutputStream(File)>
	//  131  270:invokespecial   #390 <Method void BufferedOutputStream(OutputStream)>
	//  132  273:astore          11
		ly ly1 = new ly(s, azi1);
	//  133  275:new             #87  <Class ly>
	//  134  278:dup             
	//  135  279:aload_1         
	//  136  280:aload_2         
	//  137  281:invokespecial   #392 <Method void ly(String, azi)>
	//  138  284:astore          12
		if(!ly1.a(((OutputStream) (obj1))))
			break MISSING_BLOCK_LABEL_320;
	//  139  286:aload           12
	//  140  288:aload           11
	//  141  290:invokevirtual   #395 <Method boolean ly.a(OutputStream)>
	//  142  293:ifeq            320
		((BufferedOutputStream) (obj1)).write(azi1.a);
	//  143  296:aload           11
	//  144  298:aload_2         
	//  145  299:getfield        #266 <Field byte[] azi.a>
	//  146  302:invokevirtual   #397 <Method void BufferedOutputStream.write(byte[])>
		((BufferedOutputStream) (obj1)).close();
	//  147  305:aload           11
	//  148  307:invokevirtual   #398 <Method void BufferedOutputStream.close()>
		a(s, ly1);
	//  149  310:aload_0         
	//  150  311:aload_1         
	//  151  312:aload           12
	//  152  314:invokespecial   #342 <Method void a(String, ly)>
		this;
	//  153  317:aload_0         
		JVM INSTR monitorexit ;
	//  154  318:monitorexit     
		return;
	//  155  319:return          
		try
		{
			((BufferedOutputStream) (obj1)).close();
	//  156  320:aload           11
	//  157  322:invokevirtual   #398 <Method void BufferedOutputStream.close()>
			ee.b("Failed to write header for %s", new Object[] {
				((File) (obj)).getAbsolutePath()
			});
	//  158  325:ldc2            #400 <String "Failed to write header for %s">
	//  159  328:iconst_1        
	//  160  329:anewarray       Object[]
	//  161  332:dup             
	//  162  333:iconst_0        
	//  163  334:aload           10
	//  164  336:invokevirtual   #257 <Method String File.getAbsolutePath()>
	//  165  339:aastore         
	//  166  340:invokestatic    #191 <Method void ee.b(String, Object[])>
			throw new IOException();
	//  167  343:new             #128 <Class IOException>
	//  168  346:dup             
	//  169  347:invokespecial   #401 <Method void IOException()>
	//  170  350:athrow          
		}
	//* 171  351:aload           10
	//* 172  353:invokevirtual   #178 <Method boolean File.delete()>
	//* 173  356:ifne            377
	//* 174  359:ldc2            #403 <String "Could not clean up file %s">
	//* 175  362:iconst_1        
	//* 176  363:anewarray       Object[]
	//* 177  366:dup             
	//* 178  367:iconst_0        
	//* 179  368:aload           10
	//* 180  370:invokevirtual   #257 <Method String File.getAbsolutePath()>
	//* 181  373:aastore         
	//* 182  374:invokestatic    #191 <Method void ee.b(String, Object[])>
	//* 183  377:aload_0         
	//* 184  378:monitorexit     
	//* 185  379:return          
	//* 186  380:astore_1        
	//* 187  381:aload_0         
	//* 188  382:monitorexit     
	//* 189  383:aload_1         
	//* 190  384:athrow          
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//  191  385:astore_1        
		if(!((File) (obj)).delete())
			ee.b("Could not clean up file %s", new Object[] {
				((File) (obj)).getAbsolutePath()
			});
		this;
		JVM INSTR monitorexit ;
		return;
		s;
		throw s;
	//* 192  386:goto            351
	//* 193  389:goto            77
	//* 194  392:goto            202
	}

	private final Map a;
	private long b;
	private final File c;
	private final int d;
}
