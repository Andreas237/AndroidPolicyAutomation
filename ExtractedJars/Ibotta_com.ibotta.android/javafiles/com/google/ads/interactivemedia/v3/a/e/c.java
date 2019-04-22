// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.e;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.a.c.l;
import java.io.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.e:
//			n, m, f, c

public final class c
	implements n
{
	public static final class a
		implements l
	{

		public abstract long a(long l1);

		public abstract long b();
	}


	public c(Context context, m m1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		a = context.getAssets();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method AssetManager Context.getAssets()>
	//    5    9:putfield        #33  <Field AssetManager a>
		b = m1;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #35  <Field m b>
	//    9   17:return          
	}

	public int a(byte abyte0[], int i, int j)
		throws a
	{
		long l;
		long l2;
		l = e;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long e>
	//    2    4:lstore          4
		if(l == 0L)
	//*   3    6:lload           4
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		if(l == -1L)
	//*   9   15:lload           4
	//*  10   17:ldc2w           #42  <Long -1L>
	//*  11   20:lcmp            
	//*  12   21:ifne            27
			break MISSING_BLOCK_LABEL_40;
	//   13   24:goto            40
		l2 = j;
	//   14   27:iload_3         
	//   15   28:i2l             
	//   16   29:lstore          6
		j = (int)Math.min(l, l2);
	//   17   31:lload           4
	//   18   33:lload           6
	//   19   35:invokestatic    #49  <Method long Math.min(long, long)>
	//   20   38:l2i             
	//   21   39:istore_3        
		i = d.read(abyte0, i, j);
	//   22   40:aload_0         
	//   23   41:getfield        #51  <Field InputStream d>
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:iload_3         
	//   27   47:invokevirtual   #56  <Method int InputStream.read(byte[], int, int)>
	//   28   50:istore_2        
		if(i > 0)
	//*  29   51:iload_2         
	//*  30   52:ifle            95
		{
			long l1 = e;
	//   31   55:aload_0         
	//   32   56:getfield        #41  <Field long e>
	//   33   59:lstore          4
			if(l1 != -1L)
	//*  34   61:lload           4
	//*  35   63:ldc2w           #42  <Long -1L>
	//*  36   66:lcmp            
	//*  37   67:ifeq            79
				e = l1 - (long)i;
	//   38   70:aload_0         
	//   39   71:lload           4
	//   40   73:iload_2         
	//   41   74:i2l             
	//   42   75:lsub            
	//   43   76:putfield        #41  <Field long e>
			abyte0 = ((byte []) (b));
	//   44   79:aload_0         
	//   45   80:getfield        #35  <Field m b>
	//   46   83:astore_1        
			if(abyte0 != null)
	//*  47   84:aload_1         
	//*  48   85:ifnull          95
				((m) (abyte0)).a(i);
	//   49   88:aload_1         
	//   50   89:iload_2         
	//   51   90:invokeinterface #61  <Method void m.a(int)>
		}
		return i;
	//   52   95:iload_2         
	//   53   96:ireturn         
		abyte0;
	//   54   97:astore_1        
		throw new a(((IOException) (abyte0)));
	//   55   98:new             #8   <Class c$a>
	//   56  101:dup             
	//   57  102:aload_1         
	//   58  103:invokespecial   #64  <Method void c$a(IOException)>
	//   59  106:athrow          
	}

	public long a(f f1)
		throws a
	{
		String s;
		String s1;
		c = f1.a.toString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #71  <Field Uri f.a>
	//    3    5:invokevirtual   #77  <Method String Uri.toString()>
	//    4    8:putfield        #79  <Field String c>
		s1 = f1.a.getPath();
	//    5   11:aload_1         
	//    6   12:getfield        #71  <Field Uri f.a>
	//    7   15:invokevirtual   #82  <Method String Uri.getPath()>
	//    8   18:astore_3        
		if(s1.startsWith("/android_asset/"))
	//*   9   19:aload_3         
	//*  10   20:ldc1            #84  <String "/android_asset/">
	//*  11   22:invokevirtual   #90  <Method boolean String.startsWith(String)>
	//*  12   25:ifeq            38
		{
			s = s1.substring(15);
	//   13   28:aload_3         
	//   14   29:bipush          15
	//   15   31:invokevirtual   #94  <Method String String.substring(int)>
	//   16   34:astore_2        
			break MISSING_BLOCK_LABEL_55;
	//   17   35:goto            55
		}
		s = s1;
	//   18   38:aload_3         
	//   19   39:astore_2        
		if(s1.startsWith("/"))
	//*  20   40:aload_3         
	//*  21   41:ldc1            #96  <String "/">
	//*  22   43:invokevirtual   #90  <Method boolean String.startsWith(String)>
	//*  23   46:ifeq            55
			s = s1.substring(1);
	//   24   49:aload_3         
	//   25   50:iconst_1        
	//   26   51:invokevirtual   #94  <Method String String.substring(int)>
	//   27   54:astore_2        
		c = f1.a.toString();
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:getfield        #71  <Field Uri f.a>
	//   31   60:invokevirtual   #77  <Method String Uri.toString()>
	//   32   63:putfield        #79  <Field String c>
		d = a.open(s, 1);
	//   33   66:aload_0         
	//   34   67:aload_0         
	//   35   68:getfield        #33  <Field AssetManager a>
	//   36   71:aload_2         
	//   37   72:iconst_1        
	//   38   73:invokevirtual   #102 <Method InputStream AssetManager.open(String, int)>
	//   39   76:putfield        #51  <Field InputStream d>
		if(d.skip(f1.d) < f1.d)
			break MISSING_BLOCK_LABEL_175;
	//   40   79:aload_0         
	//   41   80:getfield        #51  <Field InputStream d>
	//   42   83:aload_1         
	//   43   84:getfield        #104 <Field long f.d>
	//   44   87:invokevirtual   #108 <Method long InputStream.skip(long)>
	//   45   90:aload_1         
	//   46   91:getfield        #104 <Field long f.d>
	//   47   94:lcmp            
	//   48   95:iflt            175
		if(f1.e != -1L)
	//*  49   98:aload_1         
	//*  50   99:getfield        #109 <Field long f.e>
	//*  51  102:ldc2w           #42  <Long -1L>
	//*  52  105:lcmp            
	//*  53  106:ifeq            120
		{
			e = f1.e;
	//   54  109:aload_0         
	//   55  110:aload_1         
	//   56  111:getfield        #109 <Field long f.e>
	//   57  114:putfield        #41  <Field long e>
			break MISSING_BLOCK_LABEL_150;
	//   58  117:goto            150
		}
		try
		{
			e = d.available();
	//   59  120:aload_0         
	//   60  121:aload_0         
	//   61  122:getfield        #51  <Field InputStream d>
	//   62  125:invokevirtual   #113 <Method int InputStream.available()>
	//   63  128:i2l             
	//   64  129:putfield        #41  <Field long e>
			if(e == 0x7fffffffL)
	//*  65  132:aload_0         
	//*  66  133:getfield        #41  <Field long e>
	//*  67  136:ldc2w           #114 <Long 0x7fffffffL>
	//*  68  139:lcmp            
	//*  69  140:ifne            150
				e = -1L;
	//   70  143:aload_0         
	//   71  144:ldc2w           #42  <Long -1L>
	//   72  147:putfield        #41  <Field long e>
		}
	//*  73  150:aload_0         
	//*  74  151:iconst_1        
	//*  75  152:putfield        #117 <Field boolean f>
	//*  76  155:aload_0         
	//*  77  156:getfield        #35  <Field m b>
	//*  78  159:astore_1        
	//*  79  160:aload_1         
	//*  80  161:ifnull          170
	//*  81  164:aload_1         
	//*  82  165:invokeinterface #119 <Method void m.a()>
	//*  83  170:aload_0         
	//*  84  171:getfield        #41  <Field long e>
	//*  85  174:lreturn         
	//*  86  175:new             #121 <Class EOFException>
	//*  87  178:dup             
	//*  88  179:invokespecial   #122 <Method void EOFException()>
	//*  89  182:athrow          
		// Misplaced declaration of an exception variable
		catch(f f1)
	//*  90  183:astore_1        
		{
			throw new a(((IOException) (f1)));
	//   91  184:new             #8   <Class c$a>
	//   92  187:dup             
	//   93  188:aload_1         
	//   94  189:invokespecial   #64  <Method void c$a(IOException)>
	//   95  192:athrow          
		}
		f = true;
		f1 = ((f) (b));
		if(f1 != null)
			((m) (f1)).a();
		return e;
		throw new EOFException();
	}

	public void a()
		throws a
	{
		InputStream inputstream;
		c = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #79  <Field String c>
		inputstream = d;
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field InputStream d>
	//    5    9:astore_1        
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_99;
	//    6   10:aload_1         
	//    7   11:ifnull          99
		inputstream.close();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #125 <Method void InputStream.close()>
		d = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #51  <Field InputStream d>
		if(f)
	//*  13   23:aload_0         
	//*  14   24:getfield        #117 <Field boolean f>
	//*  15   27:ifeq            99
		{
			f = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #117 <Field boolean f>
			m m1 = b;
	//   19   35:aload_0         
	//   20   36:getfield        #35  <Field m b>
	//   21   39:astore_1        
			if(m1 != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          99
			{
				m1.b();
	//   24   44:aload_1         
	//   25   45:invokeinterface #127 <Method void m.b()>
				return;
	//   26   50:return          
			}
		}
		break MISSING_BLOCK_LABEL_99;
		Object obj;
		obj;
	//   27   51:astore_1        
		break MISSING_BLOCK_LABEL_65;
	//   28   52:goto            65
		obj;
	//   29   55:astore_1        
		throw new a(((IOException) (obj)));
	//   30   56:new             #8   <Class c$a>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #64  <Method void c$a(IOException)>
	//   34   64:athrow          
		d = null;
	//   35   65:aload_0         
	//   36   66:aconst_null     
	//   37   67:putfield        #51  <Field InputStream d>
		if(f)
	//*  38   70:aload_0         
	//*  39   71:getfield        #117 <Field boolean f>
	//*  40   74:ifeq            97
		{
			f = false;
	//   41   77:aload_0         
	//   42   78:iconst_0        
	//   43   79:putfield        #117 <Field boolean f>
			m m2 = b;
	//   44   82:aload_0         
	//   45   83:getfield        #35  <Field m b>
	//   46   86:astore_2        
			if(m2 != null)
	//*  47   87:aload_2         
	//*  48   88:ifnull          97
				m2.b();
	//   49   91:aload_2         
	//   50   92:invokeinterface #127 <Method void m.b()>
		}
		throw obj;
	//   51   97:aload_1         
	//   52   98:athrow          
	//   53   99:return          
	}

	private final AssetManager a;
	private final m b;
	private String c;
	private InputStream d;
	private long e;
	private boolean f;
}
