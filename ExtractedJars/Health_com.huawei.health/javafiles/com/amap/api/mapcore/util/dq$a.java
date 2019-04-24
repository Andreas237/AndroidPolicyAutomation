// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import com.autonavi.amap.mapcore.IPoint;
import java.nio.FloatBuffer;

// Referenced classes of package com.amap.api.mapcore.util:
//			dq, s, hm, fe, 
//			fg, af

public static class dq$a
	implements Cloneable
{

	public dq$a a()
	{
		try
		{
			dq$a dq$a1 = (dq$a)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class dq$a>
	//    3    7:astore_1        
			dq$a1.a = a;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field int a>
	//    7   13:putfield        #50  <Field int a>
			dq$a1.b = b;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field int b>
	//   11   21:putfield        #52  <Field int b>
			dq$a1.c = c;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #54  <Field int c>
	//   15   29:putfield        #54  <Field int c>
			dq$a1.d = d;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #56  <Field int d>
	//   19   37:putfield        #56  <Field int d>
			dq$a1.e = (IPoint)e.clone();
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #66  <Field IPoint e>
	//   23   45:invokevirtual   #76  <Method Object IPoint.clone()>
	//   24   48:checkcast       #75  <Class IPoint>
	//   25   51:putfield        #66  <Field IPoint e>
			dq$a1.h = h.asReadOnlyBuffer();
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #42  <Field FloatBuffer h>
	//   29   59:invokevirtual   #82  <Method FloatBuffer FloatBuffer.asReadOnlyBuffer()>
	//   30   62:putfield        #42  <Field FloatBuffer h>
			k = 0;
	//   31   65:aload_0         
	//   32   66:iconst_0        
	//   33   67:putfield        #48  <Field int k>
		}
	//*  34   70:goto            78
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  35   73:astore_1        
		{
			clonenotsupportedexception.printStackTrace();
	//   36   74:aload_1         
	//   37   75:invokevirtual   #85  <Method void CloneNotSupportedException.printStackTrace()>
		}
		return new dq$a(this);
	//   38   78:new             #2   <Class dq$a>
	//   39   81:dup             
	//   40   82:aload_0         
	//   41   83:invokespecial   #87  <Method void dq$a(dq$a)>
	//   42   86:areturn         
	}

	public void a(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_88;
	//    2    2:aload_1         
	//    3    3:ifnull          88
		boolean flag = bitmap.isRecycled();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #96  <Method boolean Bitmap.isRecycled()>
	//    6   10:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_88;
	//    7   11:iload_2         
	//    8   12:ifne            88
		try
		{
			j = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #46  <Field fg$a j>
			i = bitmap;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #44  <Field Bitmap i>
			l.setRunLowFrame(false);
	//   15   25:aload_0         
	//   16   26:getfield        #58  <Field s l>
	//   17   29:iconst_0        
	//   18   30:invokeinterface #102 <Method void s.setRunLowFrame(boolean)>
			break MISSING_BLOCK_LABEL_122;
	//   19   35:goto            122
		}
		// Misplaced declaration of an exception variable
		catch(Bitmap bitmap) { }
	//   20   38:astore_1        
		hm.c(((Throwable) (bitmap)), "TileOverlayDelegateImp", "setBitmap");
	//   21   39:aload_1         
	//   22   40:ldc1            #104 <String "TileOverlayDelegateImp">
	//   23   42:ldc1            #106 <String "setBitmap">
	//   24   44:invokestatic    #111 <Method void hm.c(Throwable, String, String)>
		((Throwable) (bitmap)).printStackTrace();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #112 <Method void Throwable.printStackTrace()>
		if(k < 3)
	//*  27   51:aload_0         
	//*  28   52:getfield        #48  <Field int k>
	//*  29   55:iconst_3        
	//*  30   56:icmpge          130
		{
			k = k + 1;
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #48  <Field int k>
	//   34   64:iconst_1        
	//   35   65:iadd            
	//   36   66:putfield        #48  <Field int k>
			if(n != null)
	//*  37   69:aload_0         
	//*  38   70:getfield        #62  <Field fe n>
	//*  39   73:ifnull          130
				n.a(true, this);
	//   40   76:aload_0         
	//   41   77:getfield        #62  <Field fe n>
	//   42   80:iconst_1        
	//   43   81:aload_0         
	//   44   82:invokevirtual   #117 <Method void fe.a(boolean, dq$a)>
		}
		break MISSING_BLOCK_LABEL_122;
	//   45   85:goto            130
		if(k < 3)
	//*  46   88:aload_0         
	//*  47   89:getfield        #48  <Field int k>
	//*  48   92:iconst_3        
	//*  49   93:icmpge          122
		{
			k = k + 1;
	//   50   96:aload_0         
	//   51   97:aload_0         
	//   52   98:getfield        #48  <Field int k>
	//   53  101:iconst_1        
	//   54  102:iadd            
	//   55  103:putfield        #48  <Field int k>
			if(n != null)
	//*  56  106:aload_0         
	//*  57  107:getfield        #62  <Field fe n>
	//*  58  110:ifnull          122
				n.a(true, this);
	//   59  113:aload_0         
	//   60  114:getfield        #62  <Field fe n>
	//   61  117:iconst_1        
	//   62  118:aload_0         
	//   63  119:invokevirtual   #117 <Method void fe.a(boolean, dq$a)>
		}
		this;
	//   64  122:aload_0         
		JVM INSTR monitorexit ;
	//   65  123:monitorexit     
		return;
	//   66  124:return          
		bitmap;
	//   67  125:astore_1        
	//*  68  126:aload_0         
		throw bitmap;
	//   69  127:monitorexit     
	//   70  128:aload_1         
	//   71  129:athrow          
	//*  72  130:goto            122
	}

	public void b()
	{
		try
		{
			fg.a(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #121 <Method void fg.a(dq$a)>
			if(g)
	//*   2    4:aload_0         
	//*   3    5:getfield        #40  <Field boolean g>
	//*   4    8:ifeq            22
				m.a(f);
	//    5   11:aload_0         
	//    6   12:getfield        #60  <Field af m>
	//    7   15:aload_0         
	//    8   16:getfield        #38  <Field int f>
	//    9   19:invokevirtual   #126 <Method void af.a(int)>
			g = false;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #40  <Field boolean g>
			f = 0;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #38  <Field int f>
			if(i != null && !i.isRecycled())
	//*  16   32:aload_0         
	//*  17   33:getfield        #44  <Field Bitmap i>
	//*  18   36:ifnull          56
	//*  19   39:aload_0         
	//*  20   40:getfield        #44  <Field Bitmap i>
	//*  21   43:invokevirtual   #96  <Method boolean Bitmap.isRecycled()>
	//*  22   46:ifne            56
				i.recycle();
	//   23   49:aload_0         
	//   24   50:getfield        #44  <Field Bitmap i>
	//   25   53:invokevirtual   #129 <Method void Bitmap.recycle()>
			i = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #44  <Field Bitmap i>
			if(h != null)
	//*  29   61:aload_0         
	//*  30   62:getfield        #42  <Field FloatBuffer h>
	//*  31   65:ifnull          76
				h.clear();
	//   32   68:aload_0         
	//   33   69:getfield        #42  <Field FloatBuffer h>
	//   34   72:invokevirtual   #133 <Method java.nio.Buffer FloatBuffer.clear()>
	//   35   75:pop             
			h = null;
	//   36   76:aload_0         
	//   37   77:aconst_null     
	//   38   78:putfield        #42  <Field FloatBuffer h>
			j = null;
	//   39   81:aload_0         
	//   40   82:aconst_null     
	//   41   83:putfield        #46  <Field fg$a j>
			k = 0;
	//   42   86:aload_0         
	//   43   87:iconst_0        
	//   44   88:putfield        #48  <Field int k>
			return;
	//   45   91:return          
		}
		catch(Throwable throwable)
	//*  46   92:astore_1        
		{
			throwable.printStackTrace();
	//   47   93:aload_1         
	//   48   94:invokevirtual   #112 <Method void Throwable.printStackTrace()>
		}
	//   49   97:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method dq$a a()>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof dq$a))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class dq$a>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((dq$a)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class dq$a>
	//   12   20:astore_1        
		return a == ((dq$a) (obj)).a && b == ((dq$a) (obj)).b && c == ((dq$a) (obj)).c && d == ((dq$a) (obj)).d;
	//   13   21:aload_0         
	//   14   22:getfield        #50  <Field int a>
	//   15   25:aload_1         
	//   16   26:getfield        #50  <Field int a>
	//   17   29:icmpne          67
	//   18   32:aload_0         
	//   19   33:getfield        #52  <Field int b>
	//   20   36:aload_1         
	//   21   37:getfield        #52  <Field int b>
	//   22   40:icmpne          67
	//   23   43:aload_0         
	//   24   44:getfield        #54  <Field int c>
	//   25   47:aload_1         
	//   26   48:getfield        #54  <Field int c>
	//   27   51:icmpne          67
	//   28   54:aload_0         
	//   29   55:getfield        #56  <Field int d>
	//   30   58:aload_1         
	//   31   59:getfield        #56  <Field int d>
	//   32   62:icmpne          67
	//   33   65:iconst_1        
	//   34   66:ireturn         
	//   35   67:iconst_0        
	//   36   68:ireturn         
	}

	public int hashCode()
	{
		return a * 7 + b * 11 + c * 13 + d;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int a>
	//    2    4:bipush          7
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #52  <Field int b>
	//    6   11:bipush          11
	//    7   13:imul            
	//    8   14:iadd            
	//    9   15:aload_0         
	//   10   16:getfield        #54  <Field int c>
	//   11   19:bipush          13
	//   12   21:imul            
	//   13   22:iadd            
	//   14   23:aload_0         
	//   15   24:getfield        #56  <Field int d>
	//   16   27:iadd            
	//   17   28:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #144 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field int a>
	//    7   13:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		stringbuilder.append("-");
	//    9   17:aload_1         
	//   10   18:ldc1            #151 <String "-">
	//   11   20:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(b);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #52  <Field int b>
	//   16   29:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		stringbuilder.append("-");
	//   18   33:aload_1         
	//   19   34:ldc1            #151 <String "-">
	//   20   36:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(c);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #54  <Field int c>
	//   25   45:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   26   48:pop             
		stringbuilder.append("-");
	//   27   49:aload_1         
	//   28   50:ldc1            #151 <String "-">
	//   29   52:invokevirtual   #154 <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(d);
	//   31   56:aload_1         
	//   32   57:aload_0         
	//   33   58:getfield        #56  <Field int d>
	//   34   61:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   35   64:pop             
		return stringbuilder.toString();
	//   36   65:aload_1         
	//   37   66:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   38   69:areturn         
	}

	public int a;
	public int b;
	public int c;
	public int d;
	public IPoint e;
	public int f;
	public boolean g;
	public FloatBuffer h;
	public Bitmap i;
	public fg$a j;
	public int k;
	private s l;
	private af m;
	private fe n;

	public dq$a(int i1, int j1, int k1, int l1, s s1, af af1, fe fe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		f = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #38  <Field int f>
		g = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #40  <Field boolean g>
		h = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #42  <Field FloatBuffer h>
		i = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #44  <Field Bitmap i>
		j = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #46  <Field fg$a j>
		k = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #48  <Field int k>
		a = i1;
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:putfield        #50  <Field int a>
		b = j1;
	//   23   39:aload_0         
	//   24   40:iload_2         
	//   25   41:putfield        #52  <Field int b>
		c = k1;
	//   26   44:aload_0         
	//   27   45:iload_3         
	//   28   46:putfield        #54  <Field int c>
		d = l1;
	//   29   49:aload_0         
	//   30   50:iload           4
	//   31   52:putfield        #56  <Field int d>
		l = s1;
	//   32   55:aload_0         
	//   33   56:aload           5
	//   34   58:putfield        #58  <Field s l>
		m = af1;
	//   35   61:aload_0         
	//   36   62:aload           6
	//   37   64:putfield        #60  <Field af m>
		n = fe1;
	//   38   67:aload_0         
	//   39   68:aload           7
	//   40   70:putfield        #62  <Field fe n>
	//   41   73:return          
	}

	public dq$a(dq$a dq$a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		f = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #38  <Field int f>
		g = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #40  <Field boolean g>
		h = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #42  <Field FloatBuffer h>
		i = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #44  <Field Bitmap i>
		j = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #46  <Field fg$a j>
		k = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #48  <Field int k>
		a = dq$a1.a;
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:getfield        #50  <Field int a>
	//   23   39:putfield        #50  <Field int a>
		b = dq$a1.b;
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:getfield        #52  <Field int b>
	//   27   47:putfield        #52  <Field int b>
		c = dq$a1.c;
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:getfield        #54  <Field int c>
	//   31   55:putfield        #54  <Field int c>
		d = dq$a1.d;
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:getfield        #56  <Field int d>
	//   35   63:putfield        #56  <Field int d>
		e = dq$a1.e;
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:getfield        #66  <Field IPoint e>
	//   39   71:putfield        #66  <Field IPoint e>
		h = dq$a1.h;
	//   40   74:aload_0         
	//   41   75:aload_1         
	//   42   76:getfield        #42  <Field FloatBuffer h>
	//   43   79:putfield        #42  <Field FloatBuffer h>
		k = 0;
	//   44   82:aload_0         
	//   45   83:iconst_0        
	//   46   84:putfield        #48  <Field int k>
		m = dq$a1.m;
	//   47   87:aload_0         
	//   48   88:aload_1         
	//   49   89:getfield        #60  <Field af m>
	//   50   92:putfield        #60  <Field af m>
		l = dq$a1.l;
	//   51   95:aload_0         
	//   52   96:aload_1         
	//   53   97:getfield        #58  <Field s l>
	//   54  100:putfield        #58  <Field s l>
		n = dq$a1.n;
	//   55  103:aload_0         
	//   56  104:aload_1         
	//   57  105:getfield        #62  <Field fe n>
	//   58  108:putfield        #62  <Field fe n>
	//   59  111:return          
	}
}
