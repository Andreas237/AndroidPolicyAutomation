// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.TileOverlayOptions;
import com.amap.api.maps.model.TileProvider;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.ITileOverlay;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import java.util.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			di, fd, af, s, 
//			fe, ew, hm, fg, 
//			ed

public class dq
	implements di
{
	public static class a
		implements Cloneable
	{

		public a a()
		{
			try
			{
				a a1 = (a)super.clone();
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method Object Object.clone()>
		//    2    4:checkcast       #2   <Class dq$a>
		//    3    7:astore_1        
				a1.a = a;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #50  <Field int a>
		//    7   13:putfield        #50  <Field int a>
				a1.b = b;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #52  <Field int b>
		//   11   21:putfield        #52  <Field int b>
				a1.c = c;
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #54  <Field int c>
		//   15   29:putfield        #54  <Field int c>
				a1.d = d;
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #56  <Field int d>
		//   19   37:putfield        #56  <Field int d>
				a1.e = (IPoint)e.clone();
		//   20   40:aload_1         
		//   21   41:aload_0         
		//   22   42:getfield        #66  <Field IPoint e>
		//   23   45:invokevirtual   #76  <Method Object IPoint.clone()>
		//   24   48:checkcast       #75  <Class IPoint>
		//   25   51:putfield        #66  <Field IPoint e>
				a1.h = h.asReadOnlyBuffer();
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
			return new a(this);
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
			if(!(obj instanceof a))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class dq$a>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			obj = ((Object) ((a)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class dq$a>
		//   12   20:astore_1        
			return a == ((a) (obj)).a && b == ((a) (obj)).b && c == ((a) (obj)).c && d == ((a) (obj)).d;
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
		public fg.a j;
		public int k;
		private s l;
		private af m;
		private fe n;

		public a(int i1, int j1, int k1, int l1, s s1, af af1, fe fe1)
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

		public a(a a1)
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
			a = a1.a;
		//   20   34:aload_0         
		//   21   35:aload_1         
		//   22   36:getfield        #50  <Field int a>
		//   23   39:putfield        #50  <Field int a>
			b = a1.b;
		//   24   42:aload_0         
		//   25   43:aload_1         
		//   26   44:getfield        #52  <Field int b>
		//   27   47:putfield        #52  <Field int b>
			c = a1.c;
		//   28   50:aload_0         
		//   29   51:aload_1         
		//   30   52:getfield        #54  <Field int c>
		//   31   55:putfield        #54  <Field int c>
			d = a1.d;
		//   32   58:aload_0         
		//   33   59:aload_1         
		//   34   60:getfield        #56  <Field int d>
		//   35   63:putfield        #56  <Field int d>
			e = a1.e;
		//   36   66:aload_0         
		//   37   67:aload_1         
		//   38   68:getfield        #66  <Field IPoint e>
		//   39   71:putfield        #66  <Field IPoint e>
			h = a1.h;
		//   40   74:aload_0         
		//   41   75:aload_1         
		//   42   76:getfield        #42  <Field FloatBuffer h>
		//   43   79:putfield        #42  <Field FloatBuffer h>
			k = 0;
		//   44   82:aload_0         
		//   45   83:iconst_0        
		//   46   84:putfield        #48  <Field int k>
			m = a1.m;
		//   47   87:aload_0         
		//   48   88:aload_1         
		//   49   89:getfield        #60  <Field af m>
		//   50   92:putfield        #60  <Field af m>
			l = a1.l;
		//   51   95:aload_0         
		//   52   96:aload_1         
		//   53   97:getfield        #58  <Field s l>
		//   54  100:putfield        #58  <Field s l>
			n = a1.n;
		//   55  103:aload_0         
		//   56  104:aload_1         
		//   57  105:getfield        #62  <Field fe n>
		//   58  108:putfield        #62  <Field fe n>
		//   59  111:return          
		}
	}

	static class b extends ed
	{

		protected volatile Object a(Object aobj[])
		{
			return ((Object) (a((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #61  <Class Void[]>
		//    3    5:invokevirtual   #64  <Method List a(Void[])>
		//    4    8:areturn         
		}

		protected transient List a(Void avoid[])
		{
			int i1;
			int j1;
			try
			{
				avoid = ((Void []) ((s)i.get()));
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field WeakReference i>
		//    2    4:invokevirtual   #70  <Method Object WeakReference.get()>
		//    3    7:checkcast       #72  <Class s>
		//    4   10:astore_1        
			}
		//*   5   11:aload_1         
		//*   6   12:ifnonnull       17
		//*   7   15:aconst_null     
		//*   8   16:areturn         
		//*   9   17:aload_1         
		//*  10   18:invokeinterface #76  <Method int s.getMapWidth()>
		//*  11   23:istore_2        
		//*  12   24:aload_1         
		//*  13   25:invokeinterface #79  <Method int s.getMapHeight()>
		//*  14   30:istore_3        
		//*  15   31:aload_0         
		//*  16   32:aload_1         
		//*  17   33:invokeinterface #82  <Method float s.g()>
		//*  18   38:f2i             
		//*  19   39:putfield        #84  <Field int d>
		//*  20   42:iload_2         
		//*  21   43:ifle            50
		//*  22   46:iload_3         
		//*  23   47:ifgt            52
		//*  24   50:aconst_null     
		//*  25   51:areturn         
		//*  26   52:aload_1         
		//*  27   53:aload_0         
		//*  28   54:getfield        #84  <Field int d>
		//*  29   57:aload_0         
		//*  30   58:getfield        #33  <Field int f>
		//*  31   61:aload_0         
		//*  32   62:getfield        #35  <Field int g>
		//*  33   65:aload_0         
		//*  34   66:getfield        #37  <Field int h>
		//*  35   69:aload_0         
		//*  36   70:getfield        #52  <Field WeakReference l>
		//*  37   73:invokevirtual   #70  <Method Object WeakReference.get()>
		//*  38   76:checkcast       #86  <Class af>
		//*  39   79:aload_0         
		//*  40   80:getfield        #54  <Field WeakReference m>
		//*  41   83:invokevirtual   #70  <Method Object WeakReference.get()>
		//*  42   86:checkcast       #88  <Class fe>
		//*  43   89:invokestatic    #91  <Method ArrayList dq.a(s, int, int, int, int, af, fe)>
		//*  44   92:astore_1        
		//*  45   93:aload_1         
		//*  46   94:areturn         
			// Misplaced declaration of an exception variable
			catch(Void avoid[])
		//*  47   95:astore_1        
			{
				((Throwable) (avoid)).printStackTrace();
		//   48   96:aload_1         
		//   49   97:invokevirtual   #94  <Method void Throwable.printStackTrace()>
				return null;
		//   50  100:aconst_null     
		//   51  101:areturn         
			}
			if(avoid == null)
				return null;
			i1 = ((s) (avoid)).getMapWidth();
			j1 = ((s) (avoid)).getMapHeight();
			d = (int)((s) (avoid)).g();
			if(i1 <= 0 || j1 <= 0)
				return null;
			avoid = ((Void []) (dq.a(((s) (avoid)), d, f, g, h, (af)l.get(), (fe)m.get())));
			return ((List) (avoid));
		}

		protected volatile void a(Object obj)
		{
			a((List)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #97  <Class List>
		//    3    5:invokevirtual   #100 <Method void a(List)>
		//    4    8:return          
		}

		protected void a(List list)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			int i1 = list.size();
		//    3    5:aload_1         
		//    4    6:invokeinterface #103 <Method int List.size()>
		//    5   11:istore_2        
			if(i1 <= 0)
		//*   6   12:iload_2         
		//*   7   13:ifgt            17
				return;
		//    8   16:return          
			try
			{
				dq.a((s)i.get(), list, d, e, j, k, (af)l.get(), (fe)m.get());
		//    9   17:aload_0         
		//   10   18:getfield        #46  <Field WeakReference i>
		//   11   21:invokevirtual   #70  <Method Object WeakReference.get()>
		//   12   24:checkcast       #72  <Class s>
		//   13   27:aload_1         
		//   14   28:aload_0         
		//   15   29:getfield        #84  <Field int d>
		//   16   32:aload_0         
		//   17   33:getfield        #39  <Field boolean e>
		//   18   36:aload_0         
		//   19   37:getfield        #48  <Field List j>
		//   20   40:aload_0         
		//   21   41:getfield        #50  <Field boolean k>
		//   22   44:aload_0         
		//   23   45:getfield        #52  <Field WeakReference l>
		//   24   48:invokevirtual   #70  <Method Object WeakReference.get()>
		//   25   51:checkcast       #86  <Class af>
		//   26   54:aload_0         
		//   27   55:getfield        #54  <Field WeakReference m>
		//   28   58:invokevirtual   #70  <Method Object WeakReference.get()>
		//   29   61:checkcast       #88  <Class fe>
		//   30   64:invokestatic    #106 <Method boolean dq.a(s, List, int, boolean, List, boolean, af, fe)>
		//   31   67:pop             
				list.clear();
		//   32   68:aload_1         
		//   33   69:invokeinterface #109 <Method void List.clear()>
				return;
		//   34   74:return          
			}
			// Misplaced declaration of an exception variable
			catch(List list)
		//*  35   75:astore_1        
			{
				((Throwable) (list)).printStackTrace();
		//   36   76:aload_1         
		//   37   77:invokevirtual   #94  <Method void Throwable.printStackTrace()>
			}
			return;
		//   38   80:return          
		}

		private int d;
		private boolean e;
		private int f;
		private int g;
		private int h;
		private WeakReference i;
		private List j;
		private boolean k;
		private WeakReference l;
		private WeakReference m;

		public b(boolean flag, s s1, int i1, int j1, int k1, List list, boolean flag1, 
				af af1, fe fe1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void ed()>
			f = 256;
		//    2    4:aload_0         
		//    3    5:sipush          256
		//    4    8:putfield        #33  <Field int f>
			g = 256;
		//    5   11:aload_0         
		//    6   12:sipush          256
		//    7   15:putfield        #35  <Field int g>
			h = 0;
		//    8   18:aload_0         
		//    9   19:iconst_0        
		//   10   20:putfield        #37  <Field int h>
			e = flag;
		//   11   23:aload_0         
		//   12   24:iload_1         
		//   13   25:putfield        #39  <Field boolean e>
			i = new WeakReference(((Object) (s1)));
		//   14   28:aload_0         
		//   15   29:new             #41  <Class WeakReference>
		//   16   32:dup             
		//   17   33:aload_2         
		//   18   34:invokespecial   #44  <Method void WeakReference(Object)>
		//   19   37:putfield        #46  <Field WeakReference i>
			f = i1;
		//   20   40:aload_0         
		//   21   41:iload_3         
		//   22   42:putfield        #33  <Field int f>
			g = j1;
		//   23   45:aload_0         
		//   24   46:iload           4
		//   25   48:putfield        #35  <Field int g>
			h = k1;
		//   26   51:aload_0         
		//   27   52:iload           5
		//   28   54:putfield        #37  <Field int h>
			j = list;
		//   29   57:aload_0         
		//   30   58:aload           6
		//   31   60:putfield        #48  <Field List j>
			k = flag1;
		//   32   63:aload_0         
		//   33   64:iload           7
		//   34   66:putfield        #50  <Field boolean k>
			l = new WeakReference(((Object) (af1)));
		//   35   69:aload_0         
		//   36   70:new             #41  <Class WeakReference>
		//   37   73:dup             
		//   38   74:aload           8
		//   39   76:invokespecial   #44  <Method void WeakReference(Object)>
		//   40   79:putfield        #52  <Field WeakReference l>
			m = new WeakReference(((Object) (fe1)));
		//   41   82:aload_0         
		//   42   83:new             #41  <Class WeakReference>
		//   43   86:dup             
		//   44   87:aload           9
		//   45   89:invokespecial   #44  <Method void WeakReference(Object)>
		//   46   92:putfield        #54  <Field WeakReference m>
		//   47   95:return          
		}
	}


	public dq(TileOverlayOptions tileoverlayoptions, af af1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #55  <Field boolean f>
		i = 256;
	//    5    9:aload_0         
	//    6   10:sipush          256
	//    7   13:putfield        #57  <Field int i>
		j = 256;
	//    8   16:aload_0         
	//    9   17:sipush          256
	//   10   20:putfield        #59  <Field int j>
		k = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #61  <Field int k>
		m = ((List) (new ArrayList()));
	//   14   28:aload_0         
	//   15   29:new             #63  <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #64  <Method void ArrayList()>
	//   18   36:putfield        #66  <Field List m>
		n = false;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #68  <Field boolean n>
		o = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #70  <Field dq$b o>
		p = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #72  <Field String p>
		q = null;
	//   28   54:aload_0         
	//   29   55:aconst_null     
	//   30   56:putfield        #74  <Field FloatBuffer q>
		b = af1;
	//   31   59:aload_0         
	//   32   60:aload_2         
	//   33   61:putfield        #76  <Field af b>
		c = tileoverlayoptions.getTileProvider();
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:invokevirtual   #82  <Method TileProvider TileOverlayOptions.getTileProvider()>
	//   37   69:putfield        #84  <Field TileProvider c>
		i = c.getTileWidth();
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #84  <Field TileProvider c>
	//   41   77:invokeinterface #90  <Method int TileProvider.getTileWidth()>
	//   42   82:putfield        #57  <Field int i>
		j = c.getTileHeight();
	//   43   85:aload_0         
	//   44   86:aload_0         
	//   45   87:getfield        #84  <Field TileProvider c>
	//   46   90:invokeinterface #93  <Method int TileProvider.getTileHeight()>
	//   47   95:putfield        #59  <Field int j>
		q = fd.a(new float[] {
			0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F
		});
	//   48   98:aload_0         
	//   49   99:bipush          8
	//   50  101:newarray        float[]
	//   51  103:dup             
	//   52  104:iconst_0        
	//   53  105:fconst_0        
	//   54  106:fastore         
	//   55  107:dup             
	//   56  108:iconst_1        
	//   57  109:fconst_1        
	//   58  110:fastore         
	//   59  111:dup             
	//   60  112:iconst_2        
	//   61  113:fconst_1        
	//   62  114:fastore         
	//   63  115:dup             
	//   64  116:iconst_3        
	//   65  117:fconst_1        
	//   66  118:fastore         
	//   67  119:dup             
	//   68  120:iconst_4        
	//   69  121:fconst_1        
	//   70  122:fastore         
	//   71  123:dup             
	//   72  124:iconst_5        
	//   73  125:fconst_0        
	//   74  126:fastore         
	//   75  127:dup             
	//   76  128:bipush          6
	//   77  130:fconst_0        
	//   78  131:fastore         
	//   79  132:dup             
	//   80  133:bipush          7
	//   81  135:fconst_0        
	//   82  136:fastore         
	//   83  137:invokestatic    #98  <Method FloatBuffer fd.a(float[])>
	//   84  140:putfield        #74  <Field FloatBuffer q>
		d = Float.valueOf(tileoverlayoptions.getZIndex());
	//   85  143:aload_0         
	//   86  144:aload_1         
	//   87  145:invokevirtual   #102 <Method float TileOverlayOptions.getZIndex()>
	//   88  148:invokestatic    #108 <Method Float Float.valueOf(float)>
	//   89  151:putfield        #110 <Field Float d>
		e = tileoverlayoptions.isVisible();
	//   90  154:aload_0         
	//   91  155:aload_1         
	//   92  156:invokevirtual   #114 <Method boolean TileOverlayOptions.isVisible()>
	//   93  159:putfield        #116 <Field boolean e>
		f = flag;
	//   94  162:aload_0         
	//   95  163:iload_3         
	//   96  164:putfield        #55  <Field boolean f>
		if(f)
	//*  97  167:aload_0         
	//*  98  168:getfield        #55  <Field boolean f>
	//*  99  171:ifeq            183
			p = "TileOverlay0";
	//  100  174:aload_0         
	//  101  175:ldc1            #118 <String "TileOverlay0">
	//  102  177:putfield        #72  <Field String p>
		else
	//* 103  180:goto            191
			p = getId();
	//  104  183:aload_0         
	//  105  184:aload_0         
	//  106  185:invokevirtual   #122 <Method String getId()>
	//  107  188:putfield        #72  <Field String p>
		g = b.a();
	//  108  191:aload_0         
	//  109  192:aload_0         
	//  110  193:getfield        #76  <Field af b>
	//  111  196:invokevirtual   #127 <Method s af.a()>
	//  112  199:putfield        #129 <Field s g>
		k = Integer.parseInt(p.substring("TileOverlay".length()));
	//  113  202:aload_0         
	//  114  203:aload_0         
	//  115  204:getfield        #72  <Field String p>
	//  116  207:ldc1            #131 <String "TileOverlay">
	//  117  209:invokevirtual   #136 <Method int String.length()>
	//  118  212:invokevirtual   #140 <Method String String.substring(int)>
	//  119  215:invokestatic    #146 <Method int Integer.parseInt(String)>
	//  120  218:putfield        #61  <Field int k>
		if(flag)
	//* 121  221:iload_3         
	//* 122  222:ifeq            259
		{
			try
			{
				af1 = ((af) (new fh.a(b.e(), p, af1.a().getMapConfig().getMapLanguage())));
	//  123  225:new             #148 <Class fh$a>
	//  124  228:dup             
	//  125  229:aload_0         
	//  126  230:getfield        #76  <Field af b>
	//  127  233:invokevirtual   #151 <Method android.content.Context af.e()>
	//  128  236:aload_0         
	//  129  237:getfield        #72  <Field String p>
	//  130  240:aload_2         
	//  131  241:invokevirtual   #127 <Method s af.a()>
	//  132  244:invokeinterface #157 <Method MapConfig s.getMapConfig()>
	//  133  249:invokevirtual   #162 <Method String MapConfig.getMapLanguage()>
	//  134  252:invokespecial   #165 <Method void fh$a(android.content.Context, String, String)>
	//  135  255:astore_2        
			}
	//* 136  256:goto            278
	//* 137  259:new             #148 <Class fh$a>
	//* 138  262:dup             
	//* 139  263:aload_0         
	//* 140  264:getfield        #76  <Field af b>
	//* 141  267:invokevirtual   #151 <Method android.content.Context af.e()>
	//* 142  270:aload_0         
	//* 143  271:getfield        #72  <Field String p>
	//* 144  274:invokespecial   #168 <Method void fh$a(android.content.Context, String)>
	//* 145  277:astore_2        
	//* 146  278:aload_2         
	//* 147  279:aload_1         
	//* 148  280:invokevirtual   #171 <Method boolean TileOverlayOptions.getMemoryCacheEnabled()>
	//* 149  283:invokevirtual   #174 <Method void fh$a.a(boolean)>
	//* 150  286:aload_0         
	//* 151  287:getfield        #55  <Field boolean f>
	//* 152  290:ifeq            298
	//* 153  293:aload_2         
	//* 154  294:iconst_0        
	//* 155  295:putfield        #176 <Field boolean fh$a.i>
	//* 156  298:aload_2         
	//* 157  299:aload_1         
	//* 158  300:invokevirtual   #179 <Method boolean TileOverlayOptions.getDiskCacheEnabled()>
	//* 159  303:invokevirtual   #181 <Method void fh$a.b(boolean)>
	//* 160  306:aload_2         
	//* 161  307:aload_1         
	//* 162  308:invokevirtual   #184 <Method int TileOverlayOptions.getMemCacheSize()>
	//* 163  311:invokevirtual   #187 <Method void fh$a.a(int)>
	//* 164  314:aload_2         
	//* 165  315:aload_1         
	//* 166  316:invokevirtual   #191 <Method long TileOverlayOptions.getDiskCacheSize()>
	//* 167  319:invokevirtual   #194 <Method void fh$a.a(long)>
	//* 168  322:aload_1         
	//* 169  323:invokevirtual   #197 <Method String TileOverlayOptions.getDiskCacheDir()>
	//* 170  326:astore_1        
	//* 171  327:aload_1         
	//* 172  328:ifnull          345
	//* 173  331:ldc1            #199 <String "">
	//* 174  333:aload_1         
	//* 175  334:invokevirtual   #203 <Method boolean String.equals(Object)>
	//* 176  337:ifne            345
	//* 177  340:aload_2         
	//* 178  341:aload_1         
	//* 179  342:invokevirtual   #206 <Method void fh$a.a(String)>
	//* 180  345:aload_0         
	//* 181  346:new             #208 <Class fe>
	//* 182  349:dup             
	//* 183  350:aload_0         
	//* 184  351:getfield        #76  <Field af b>
	//* 185  354:invokevirtual   #151 <Method android.content.Context af.e()>
	//* 186  357:aload_0         
	//* 187  358:getfield        #57  <Field int i>
	//* 188  361:aload_0         
	//* 189  362:getfield        #59  <Field int j>
	//* 190  365:invokespecial   #211 <Method void fe(android.content.Context, int, int)>
	//* 191  368:putfield        #213 <Field fe l>
	//* 192  371:aload_0         
	//* 193  372:getfield        #213 <Field fe l>
	//* 194  375:aload_0         
	//* 195  376:getfield        #84  <Field TileProvider c>
	//* 196  379:invokevirtual   #216 <Method void fe.a(TileProvider)>
	//* 197  382:aload_0         
	//* 198  383:getfield        #213 <Field fe l>
	//* 199  386:aload_2         
	//* 200  387:invokevirtual   #219 <Method void fe.a(fh$a)>
	//* 201  390:aload_0         
	//* 202  391:getfield        #213 <Field fe l>
	//* 203  394:new             #8   <Class dq$1>
	//* 204  397:dup             
	//* 205  398:aload_0         
	//* 206  399:invokespecial   #222 <Method void dq$1(dq)>
	//* 207  402:invokevirtual   #225 <Method void fe.a(fg$c)>
	//* 208  405:return          
			// Misplaced declaration of an exception variable
			catch(TileOverlayOptions tileoverlayoptions)
	//* 209  406:astore_1        
			{
				((Throwable) (tileoverlayoptions)).printStackTrace();
	//  210  407:aload_1         
	//  211  408:invokevirtual   #228 <Method void Throwable.printStackTrace()>
				return;
	//  212  411:return          
			}
			break MISSING_BLOCK_LABEL_278;
		}
		af1 = ((af) (new fh.a(b.e(), p)));
		((fh.a) (af1)).a(tileoverlayoptions.getMemoryCacheEnabled());
		if(f)
			af1.i = false;
		((fh.a) (af1)).b(tileoverlayoptions.getDiskCacheEnabled());
		((fh.a) (af1)).a(tileoverlayoptions.getMemCacheSize());
		((fh.a) (af1)).a(tileoverlayoptions.getDiskCacheSize());
		tileoverlayoptions = ((TileOverlayOptions) (tileoverlayoptions.getDiskCacheDir()));
		if(tileoverlayoptions == null)
			break MISSING_BLOCK_LABEL_345;
		if(!"".equals(((Object) (tileoverlayoptions))))
			((fh.a) (af1)).a(((String) (tileoverlayoptions)));
		l = new fe(b.e(), i, j);
		l.a(c);
		l.a(((fh.a) (af1)));
		l.a(new fg.c() {

			public void a()
			{
				dq.a(a).r();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field dq a>
			//    2    4:invokestatic    #23  <Method s dq.a(dq)>
			//    3    7:invokeinterface #28  <Method void s.r()>
			//    4   12:return          
			}

			final dq a;

			
			{
				a = dq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field dq a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
		return;
	}

	static s a(dq dq1)
	{
		return dq1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field s g>
	//    2    4:areturn         
	}

	static ArrayList a(s s1, int i1, int j1, int k1, int l1, af af1, fe fe1)
	{
		return b(s1, i1, j1, k1, l1, af1, fe1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokestatic    #232 <Method ArrayList b(s, int, int, int, int, af, fe)>
	//    8   13:areturn         
	}

	private void a(int i1, FloatBuffer floatbuffer, FloatBuffer floatbuffer1)
	{
		if(floatbuffer == null || floatbuffer1 == null || i1 == 0)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
	//*   2    4:aload_3         
	//*   3    5:ifnull          12
	//*   4    8:iload_1         
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(a == null || a.c())
	//*   7   13:aload_0         
	//*   8   14:getfield        #235 <Field ds$f a>
	//*   9   17:ifnull          30
	//*  10   20:aload_0         
	//*  11   21:getfield        #235 <Field ds$f a>
	//*  12   24:invokevirtual   #239 <Method boolean ds$f.c()>
	//*  13   27:ifeq            34
			e();
	//   14   30:aload_0         
	//   15   31:invokespecial   #241 <Method void e()>
		a.a();
	//   16   34:aload_0         
	//   17   35:getfield        #235 <Field ds$f a>
	//   18   38:invokevirtual   #243 <Method void ds$f.a()>
		GLES20.glEnable(3042);
	//   19   41:sipush          3042
	//   20   44:invokestatic    #248 <Method void GLES20.glEnable(int)>
		GLES20.glBlendFunc(1, 771);
	//   21   47:iconst_1        
	//   22   48:sipush          771
	//   23   51:invokestatic    #252 <Method void GLES20.glBlendFunc(int, int)>
		GLES20.glBlendColor(1.0F, 1.0F, 1.0F, 1.0F);
	//   24   54:fconst_1        
	//   25   55:fconst_1        
	//   26   56:fconst_1        
	//   27   57:fconst_1        
	//   28   58:invokestatic    #256 <Method void GLES20.glBlendColor(float, float, float, float)>
		GLES20.glActiveTexture(33984);
	//   29   61:ldc2            #257 <Int 33984>
	//   30   64:invokestatic    #260 <Method void GLES20.glActiveTexture(int)>
		GLES20.glBindTexture(3553, i1);
	//   31   67:sipush          3553
	//   32   70:iload_1         
	//   33   71:invokestatic    #263 <Method void GLES20.glBindTexture(int, int)>
		GLES20.glEnableVertexAttribArray(a.b);
	//   34   74:aload_0         
	//   35   75:getfield        #235 <Field ds$f a>
	//   36   78:getfield        #265 <Field int ds$f.b>
	//   37   81:invokestatic    #268 <Method void GLES20.glEnableVertexAttribArray(int)>
		GLES20.glVertexAttribPointer(a.b, 3, 5126, false, 12, ((java.nio.Buffer) (floatbuffer)));
	//   38   84:aload_0         
	//   39   85:getfield        #235 <Field ds$f a>
	//   40   88:getfield        #265 <Field int ds$f.b>
	//   41   91:iconst_3        
	//   42   92:sipush          5126
	//   43   95:iconst_0        
	//   44   96:bipush          12
	//   45   98:aload_2         
	//   46   99:invokestatic    #272 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		GLES20.glEnableVertexAttribArray(a.c);
	//   47  102:aload_0         
	//   48  103:getfield        #235 <Field ds$f a>
	//   49  106:getfield        #274 <Field int ds$f.c>
	//   50  109:invokestatic    #268 <Method void GLES20.glEnableVertexAttribArray(int)>
		GLES20.glVertexAttribPointer(a.c, 2, 5126, false, 8, ((java.nio.Buffer) (floatbuffer1)));
	//   51  112:aload_0         
	//   52  113:getfield        #235 <Field ds$f a>
	//   53  116:getfield        #274 <Field int ds$f.c>
	//   54  119:iconst_2        
	//   55  120:sipush          5126
	//   56  123:iconst_0        
	//   57  124:bipush          8
	//   58  126:aload_3         
	//   59  127:invokestatic    #272 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		GLES20.glUniformMatrix4fv(a.a, 1, false, b.g(), 0);
	//   60  130:aload_0         
	//   61  131:getfield        #235 <Field ds$f a>
	//   62  134:getfield        #276 <Field int ds$f.a>
	//   63  137:iconst_1        
	//   64  138:iconst_0        
	//   65  139:aload_0         
	//   66  140:getfield        #76  <Field af b>
	//   67  143:invokevirtual   #279 <Method float[] af.g()>
	//   68  146:iconst_0        
	//   69  147:invokestatic    #283 <Method void GLES20.glUniformMatrix4fv(int, int, boolean, float[], int)>
		GLES20.glDrawArrays(6, 0, 4);
	//   70  150:bipush          6
	//   71  152:iconst_0        
	//   72  153:iconst_4        
	//   73  154:invokestatic    #287 <Method void GLES20.glDrawArrays(int, int, int)>
		GLES20.glDisableVertexAttribArray(a.b);
	//   74  157:aload_0         
	//   75  158:getfield        #235 <Field ds$f a>
	//   76  161:getfield        #265 <Field int ds$f.b>
	//   77  164:invokestatic    #290 <Method void GLES20.glDisableVertexAttribArray(int)>
		GLES20.glDisableVertexAttribArray(a.c);
	//   78  167:aload_0         
	//   79  168:getfield        #235 <Field ds$f a>
	//   80  171:getfield        #274 <Field int ds$f.c>
	//   81  174:invokestatic    #290 <Method void GLES20.glDisableVertexAttribArray(int)>
		GLES20.glBindTexture(3553, 0);
	//   82  177:sipush          3553
	//   83  180:iconst_0        
	//   84  181:invokestatic    #263 <Method void GLES20.glBindTexture(int, int)>
		GLES20.glUseProgram(0);
	//   85  184:iconst_0        
	//   86  185:invokestatic    #293 <Method void GLES20.glUseProgram(int)>
		GLES20.glDisable(3042);
	//   87  188:sipush          3042
	//   88  191:invokestatic    #296 <Method void GLES20.glDisable(int)>
	//   89  194:return          
	}

	private boolean a(a a1)
	{
		float f1 = a1.c;
	//    0    0:aload_1         
	//    1    1:getfield        #298 <Field int dq$a.c>
	//    2    4:i2f             
	//    3    5:fstore_2        
		int i1 = i;
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field int i>
	//    6   10:istore_3        
		int j1 = j;
	//    7   11:aload_0         
	//    8   12:getfield        #59  <Field int j>
	//    9   15:istore          4
		int k1 = a1.e.x;
	//   10   17:aload_1         
	//   11   18:getfield        #301 <Field IPoint dq$a.e>
	//   12   21:getfield        #306 <Field int IPoint.x>
	//   13   24:istore          5
		int l1 = a1.e.y + (1 << 20 - (int)f1) * j1;
	//   14   26:aload_1         
	//   15   27:getfield        #301 <Field IPoint dq$a.e>
	//   16   30:getfield        #309 <Field int IPoint.y>
	//   17   33:iconst_1        
	//   18   34:bipush          20
	//   19   36:fload_2         
	//   20   37:f2i             
	//   21   38:isub            
	//   22   39:ishl            
	//   23   40:iload           4
	//   24   42:imul            
	//   25   43:iadd            
	//   26   44:istore          6
		MapConfig mapconfig = g.getMapConfig();
	//   27   46:aload_0         
	//   28   47:getfield        #129 <Field s g>
	//   29   50:invokeinterface #157 <Method MapConfig s.getMapConfig()>
	//   30   55:astore          7
		float af1[] = new float[12];
	//   31   57:bipush          12
	//   32   59:newarray        float[]
	//   33   61:astore          8
		af1[0] = k1 - mapconfig.getSX();
	//   34   63:aload           8
	//   35   65:iconst_0        
	//   36   66:iload           5
	//   37   68:aload           7
	//   38   70:invokevirtual   #312 <Method int MapConfig.getSX()>
	//   39   73:isub            
	//   40   74:i2f             
	//   41   75:fastore         
		af1[1] = l1 - mapconfig.getSY();
	//   42   76:aload           8
	//   43   78:iconst_1        
	//   44   79:iload           6
	//   45   81:aload           7
	//   46   83:invokevirtual   #315 <Method int MapConfig.getSY()>
	//   47   86:isub            
	//   48   87:i2f             
	//   49   88:fastore         
		af1[2] = 0.0F;
	//   50   89:aload           8
	//   51   91:iconst_2        
	//   52   92:fconst_0        
	//   53   93:fastore         
		af1[3] = ((1 << 20 - (int)f1) * i1 + k1) - mapconfig.getSX();
	//   54   94:aload           8
	//   55   96:iconst_3        
	//   56   97:iconst_1        
	//   57   98:bipush          20
	//   58  100:fload_2         
	//   59  101:f2i             
	//   60  102:isub            
	//   61  103:ishl            
	//   62  104:iload_3         
	//   63  105:imul            
	//   64  106:iload           5
	//   65  108:iadd            
	//   66  109:aload           7
	//   67  111:invokevirtual   #312 <Method int MapConfig.getSX()>
	//   68  114:isub            
	//   69  115:i2f             
	//   70  116:fastore         
		af1[4] = l1 - mapconfig.getSY();
	//   71  117:aload           8
	//   72  119:iconst_4        
	//   73  120:iload           6
	//   74  122:aload           7
	//   75  124:invokevirtual   #315 <Method int MapConfig.getSY()>
	//   76  127:isub            
	//   77  128:i2f             
	//   78  129:fastore         
		af1[5] = 0.0F;
	//   79  130:aload           8
	//   80  132:iconst_5        
	//   81  133:fconst_0        
	//   82  134:fastore         
		af1[6] = ((1 << 20 - (int)f1) * i1 + k1) - mapconfig.getSX();
	//   83  135:aload           8
	//   84  137:bipush          6
	//   85  139:iconst_1        
	//   86  140:bipush          20
	//   87  142:fload_2         
	//   88  143:f2i             
	//   89  144:isub            
	//   90  145:ishl            
	//   91  146:iload_3         
	//   92  147:imul            
	//   93  148:iload           5
	//   94  150:iadd            
	//   95  151:aload           7
	//   96  153:invokevirtual   #312 <Method int MapConfig.getSX()>
	//   97  156:isub            
	//   98  157:i2f             
	//   99  158:fastore         
		af1[7] = l1 - (1 << 20 - (int)f1) * j1 - mapconfig.getSY();
	//  100  159:aload           8
	//  101  161:bipush          7
	//  102  163:iload           6
	//  103  165:iconst_1        
	//  104  166:bipush          20
	//  105  168:fload_2         
	//  106  169:f2i             
	//  107  170:isub            
	//  108  171:ishl            
	//  109  172:iload           4
	//  110  174:imul            
	//  111  175:isub            
	//  112  176:aload           7
	//  113  178:invokevirtual   #315 <Method int MapConfig.getSY()>
	//  114  181:isub            
	//  115  182:i2f             
	//  116  183:fastore         
		af1[8] = 0.0F;
	//  117  184:aload           8
	//  118  186:bipush          8
	//  119  188:fconst_0        
	//  120  189:fastore         
		af1[9] = k1 - mapconfig.getSX();
	//  121  190:aload           8
	//  122  192:bipush          9
	//  123  194:iload           5
	//  124  196:aload           7
	//  125  198:invokevirtual   #312 <Method int MapConfig.getSX()>
	//  126  201:isub            
	//  127  202:i2f             
	//  128  203:fastore         
		af1[10] = l1 - (1 << 20 - (int)f1) * j1 - mapconfig.getSY();
	//  129  204:aload           8
	//  130  206:bipush          10
	//  131  208:iload           6
	//  132  210:iconst_1        
	//  133  211:bipush          20
	//  134  213:fload_2         
	//  135  214:f2i             
	//  136  215:isub            
	//  137  216:ishl            
	//  138  217:iload           4
	//  139  219:imul            
	//  140  220:isub            
	//  141  221:aload           7
	//  142  223:invokevirtual   #315 <Method int MapConfig.getSY()>
	//  143  226:isub            
	//  144  227:i2f             
	//  145  228:fastore         
		af1[11] = 0.0F;
	//  146  229:aload           8
	//  147  231:bipush          11
	//  148  233:fconst_0        
	//  149  234:fastore         
		if(a1.h == null)
	//* 150  235:aload_1         
	//* 151  236:getfield        #317 <Field FloatBuffer dq$a.h>
	//* 152  239:ifnonnull       254
			a1.h = fd.a(af1);
	//  153  242:aload_1         
	//  154  243:aload           8
	//  155  245:invokestatic    #98  <Method FloatBuffer fd.a(float[])>
	//  156  248:putfield        #317 <Field FloatBuffer dq$a.h>
		else
	//* 157  251:goto            267
			a1.h = fd.a(af1, a1.h);
	//  158  254:aload_1         
	//  159  255:aload           8
	//  160  257:aload_1         
	//  161  258:getfield        #317 <Field FloatBuffer dq$a.h>
	//  162  261:invokestatic    #320 <Method FloatBuffer fd.a(float[], FloatBuffer)>
	//  163  264:putfield        #317 <Field FloatBuffer dq$a.h>
		return true;
	//  164  267:iconst_1        
	//  165  268:ireturn         
	}

	static boolean a(s s1, List list, int i1, boolean flag, List list1, boolean flag1, af af1, fe fe1)
	{
		return b(s1, list, i1, flag, list1, flag1, af1, fe1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokestatic    #323 <Method boolean b(s, List, int, boolean, List, boolean, af, fe)>
	//    9   15:ireturn         
	}

	private static String b(String s1)
	{
		h++;
	//    0    0:getstatic       #46  <Field int h>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:putstatic       #46  <Field int h>
		return (new StringBuilder()).append(s1).append(h).toString();
	//    4    8:new             #326 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #327 <Method void StringBuilder()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #331 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:getstatic       #46  <Field int h>
	//   10   22:invokevirtual   #334 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #337 <Method String StringBuilder.toString()>
	//   12   28:areturn         
	}

	private static ArrayList b(s s1, int i1, int j1, int k1, int l1, af af1, fe fe1)
	{
		Object obj1 = ((Object) (s1.c()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #340 <Method GLMapState s.c()>
	//    2    6:astore          20
		Rect rect = s1.getMapConfig().getGeoRectangle().getRect();
	//    3    8:aload_0         
	//    4    9:invokeinterface #157 <Method MapConfig s.getMapConfig()>
	//    5   14:invokevirtual   #344 <Method Rectangle MapConfig.getGeoRectangle()>
	//    6   17:invokevirtual   #350 <Method Rect Rectangle.getRect()>
	//    7   20:astore          21
		Object obj = ((Object) (IPoint.obtain()));
	//    8   22:invokestatic    #354 <Method IPoint IPoint.obtain()>
	//    9   25:astore          18
		IPoint ipoint = IPoint.obtain();
	//   10   27:invokestatic    #354 <Method IPoint IPoint.obtain()>
	//   11   30:astore          19
		obj.x = rect.left;
	//   12   32:aload           18
	//   13   34:aload           21
	//   14   36:getfield        #359 <Field int Rect.left>
	//   15   39:putfield        #306 <Field int IPoint.x>
		obj.y = rect.top;
	//   16   42:aload           18
	//   17   44:aload           21
	//   18   46:getfield        #362 <Field int Rect.top>
	//   19   49:putfield        #309 <Field int IPoint.y>
		int j2 = Math.min(0x7fffffff, ((IPoint) (obj)).x);
	//   20   52:ldc2            #363 <Int 0x7fffffff>
	//   21   55:aload           18
	//   22   57:getfield        #306 <Field int IPoint.x>
	//   23   60:invokestatic    #369 <Method int Math.min(int, int)>
	//   24   63:istore          8
		int k2 = Math.max(0, ((IPoint) (obj)).x);
	//   25   65:iconst_0        
	//   26   66:aload           18
	//   27   68:getfield        #306 <Field int IPoint.x>
	//   28   71:invokestatic    #372 <Method int Math.max(int, int)>
	//   29   74:istore          9
		int l2 = Math.min(0x7fffffff, ((IPoint) (obj)).y);
	//   30   76:ldc2            #363 <Int 0x7fffffff>
	//   31   79:aload           18
	//   32   81:getfield        #309 <Field int IPoint.y>
	//   33   84:invokestatic    #369 <Method int Math.min(int, int)>
	//   34   87:istore          10
		int i2 = Math.max(0, ((IPoint) (obj)).y);
	//   35   89:iconst_0        
	//   36   90:aload           18
	//   37   92:getfield        #309 <Field int IPoint.y>
	//   38   95:invokestatic    #372 <Method int Math.max(int, int)>
	//   39   98:istore          7
		obj.x = rect.right;
	//   40  100:aload           18
	//   41  102:aload           21
	//   42  104:getfield        #375 <Field int Rect.right>
	//   43  107:putfield        #306 <Field int IPoint.x>
		obj.y = rect.top;
	//   44  110:aload           18
	//   45  112:aload           21
	//   46  114:getfield        #362 <Field int Rect.top>
	//   47  117:putfield        #309 <Field int IPoint.y>
		j2 = Math.min(j2, ((IPoint) (obj)).x);
	//   48  120:iload           8
	//   49  122:aload           18
	//   50  124:getfield        #306 <Field int IPoint.x>
	//   51  127:invokestatic    #369 <Method int Math.min(int, int)>
	//   52  130:istore          8
		k2 = Math.max(k2, ((IPoint) (obj)).x);
	//   53  132:iload           9
	//   54  134:aload           18
	//   55  136:getfield        #306 <Field int IPoint.x>
	//   56  139:invokestatic    #372 <Method int Math.max(int, int)>
	//   57  142:istore          9
		l2 = Math.min(l2, ((IPoint) (obj)).y);
	//   58  144:iload           10
	//   59  146:aload           18
	//   60  148:getfield        #309 <Field int IPoint.y>
	//   61  151:invokestatic    #369 <Method int Math.min(int, int)>
	//   62  154:istore          10
		i2 = Math.max(i2, ((IPoint) (obj)).y);
	//   63  156:iload           7
	//   64  158:aload           18
	//   65  160:getfield        #309 <Field int IPoint.y>
	//   66  163:invokestatic    #372 <Method int Math.max(int, int)>
	//   67  166:istore          7
		obj.x = rect.left;
	//   68  168:aload           18
	//   69  170:aload           21
	//   70  172:getfield        #359 <Field int Rect.left>
	//   71  175:putfield        #306 <Field int IPoint.x>
		obj.y = rect.bottom;
	//   72  178:aload           18
	//   73  180:aload           21
	//   74  182:getfield        #378 <Field int Rect.bottom>
	//   75  185:putfield        #309 <Field int IPoint.y>
		j2 = Math.min(j2, ((IPoint) (obj)).x);
	//   76  188:iload           8
	//   77  190:aload           18
	//   78  192:getfield        #306 <Field int IPoint.x>
	//   79  195:invokestatic    #369 <Method int Math.min(int, int)>
	//   80  198:istore          8
		k2 = Math.max(k2, ((IPoint) (obj)).x);
	//   81  200:iload           9
	//   82  202:aload           18
	//   83  204:getfield        #306 <Field int IPoint.x>
	//   84  207:invokestatic    #372 <Method int Math.max(int, int)>
	//   85  210:istore          9
		l2 = Math.min(l2, ((IPoint) (obj)).y);
	//   86  212:iload           10
	//   87  214:aload           18
	//   88  216:getfield        #309 <Field int IPoint.y>
	//   89  219:invokestatic    #369 <Method int Math.min(int, int)>
	//   90  222:istore          10
		i2 = Math.max(i2, ((IPoint) (obj)).y);
	//   91  224:iload           7
	//   92  226:aload           18
	//   93  228:getfield        #309 <Field int IPoint.y>
	//   94  231:invokestatic    #372 <Method int Math.max(int, int)>
	//   95  234:istore          7
		obj.x = rect.right;
	//   96  236:aload           18
	//   97  238:aload           21
	//   98  240:getfield        #375 <Field int Rect.right>
	//   99  243:putfield        #306 <Field int IPoint.x>
		obj.y = rect.bottom;
	//  100  246:aload           18
	//  101  248:aload           21
	//  102  250:getfield        #378 <Field int Rect.bottom>
	//  103  253:putfield        #309 <Field int IPoint.y>
		j2 = Math.min(j2, ((IPoint) (obj)).x);
	//  104  256:iload           8
	//  105  258:aload           18
	//  106  260:getfield        #306 <Field int IPoint.x>
	//  107  263:invokestatic    #369 <Method int Math.min(int, int)>
	//  108  266:istore          8
		int k3 = Math.max(k2, ((IPoint) (obj)).x);
	//  109  268:iload           9
	//  110  270:aload           18
	//  111  272:getfield        #306 <Field int IPoint.x>
	//  112  275:invokestatic    #372 <Method int Math.max(int, int)>
	//  113  278:istore          11
		k2 = Math.min(l2, ((IPoint) (obj)).y);
	//  114  280:iload           10
	//  115  282:aload           18
	//  116  284:getfield        #309 <Field int IPoint.y>
	//  117  287:invokestatic    #369 <Method int Math.min(int, int)>
	//  118  290:istore          9
		int l3 = Math.max(i2, ((IPoint) (obj)).y);
	//  119  292:iload           7
	//  120  294:aload           18
	//  121  296:getfield        #309 <Field int IPoint.y>
	//  122  299:invokestatic    #372 <Method int Math.max(int, int)>
	//  123  302:istore          12
		int i4 = j2 - (1 << 20 - i1) * j1;
	//  124  304:iload           8
	//  125  306:iconst_1        
	//  126  307:bipush          20
	//  127  309:iload_1         
	//  128  310:isub            
	//  129  311:ishl            
	//  130  312:iload_2         
	//  131  313:imul            
	//  132  314:isub            
	//  133  315:istore          13
		int j4 = k2 - (1 << 20 - i1) * k1;
	//  134  317:iload           9
	//  135  319:iconst_1        
	//  136  320:bipush          20
	//  137  322:iload_1         
	//  138  323:isub            
	//  139  324:ishl            
	//  140  325:iload_3         
	//  141  326:imul            
	//  142  327:isub            
	//  143  328:istore          14
		((GLMapState) (obj1)).getMapGeoCenter(ipoint);
	//  144  330:aload           20
	//  145  332:aload           19
	//  146  334:invokevirtual   #384 <Method void GLMapState.getMapGeoCenter(IPoint)>
		int k4 = (ipoint.x >> 20 - i1) / j1;
	//  147  337:aload           19
	//  148  339:getfield        #306 <Field int IPoint.x>
	//  149  342:bipush          20
	//  150  344:iload_1         
	//  151  345:isub            
	//  152  346:ishr            
	//  153  347:iload_2         
	//  154  348:idiv            
	//  155  349:istore          15
		int l4 = (ipoint.y >> 20 - i1) / k1;
	//  156  351:aload           19
	//  157  353:getfield        #309 <Field int IPoint.y>
	//  158  356:bipush          20
	//  159  358:iload_1         
	//  160  359:isub            
	//  161  360:ishr            
	//  162  361:iload_3         
	//  163  362:idiv            
	//  164  363:istore          16
		obj1 = ((Object) (new a(k4, l4, i1, l1, s1, af1, fe1)));
	//  165  365:new             #10  <Class dq$a>
	//  166  368:dup             
	//  167  369:iload           15
	//  168  371:iload           16
	//  169  373:iload_1         
	//  170  374:iload           4
	//  171  376:aload_0         
	//  172  377:aload           5
	//  173  379:aload           6
	//  174  381:invokespecial   #387 <Method void dq$a(int, int, int, int, s, af, fe)>
	//  175  384:astore          20
		obj1.e = IPoint.obtain((k4 << 20 - i1) * j1, (l4 << 20 - i1) * k1);
	//  176  386:aload           20
	//  177  388:iload           15
	//  178  390:bipush          20
	//  179  392:iload_1         
	//  180  393:isub            
	//  181  394:ishl            
	//  182  395:iload_2         
	//  183  396:imul            
	//  184  397:iload           16
	//  185  399:bipush          20
	//  186  401:iload_1         
	//  187  402:isub            
	//  188  403:ishl            
	//  189  404:iload_3         
	//  190  405:imul            
	//  191  406:invokestatic    #390 <Method IPoint IPoint.obtain(int, int)>
	//  192  409:putfield        #301 <Field IPoint dq$a.e>
		((IPoint) (obj)).recycle();
	//  193  412:aload           18
	//  194  414:invokevirtual   #393 <Method void IPoint.recycle()>
		ipoint.recycle();
	//  195  417:aload           19
	//  196  419:invokevirtual   #393 <Method void IPoint.recycle()>
		obj = ((Object) (new ArrayList()));
	//  197  422:new             #63  <Class ArrayList>
	//  198  425:dup             
	//  199  426:invokespecial   #64  <Method void ArrayList()>
	//  200  429:astore          18
		((ArrayList) (obj)).add(obj1);
	//  201  431:aload           18
	//  202  433:aload           20
	//  203  435:invokevirtual   #396 <Method boolean ArrayList.add(Object)>
	//  204  438:pop             
		k2 = 1;
	//  205  439:iconst_1        
	//  206  440:istore          9
		do
		{
			boolean flag = false;
	//  207  442:iconst_0        
	//  208  443:istore          7
			for(int i3 = k4 - k2; i3 <= k4 + k2; i3++)
	//* 209  445:iload           15
	//* 210  447:iload           9
	//* 211  449:isub            
	//* 212  450:istore          10
	//* 213  452:iload           10
	//* 214  454:iload           15
	//* 215  456:iload           9
	//* 216  458:iadd            
	//* 217  459:icmpgt          747
			{
				int i5 = l4 + k2;
	//  218  462:iload           16
	//  219  464:iload           9
	//  220  466:iadd            
	//  221  467:istore          17
				IPoint ipoint1 = new IPoint((i3 << 20 - i1) * j1, (i5 << 20 - i1) * k1);
	//  222  469:new             #303 <Class IPoint>
	//  223  472:dup             
	//  224  473:iload           10
	//  225  475:bipush          20
	//  226  477:iload_1         
	//  227  478:isub            
	//  228  479:ishl            
	//  229  480:iload_2         
	//  230  481:imul            
	//  231  482:iload           17
	//  232  484:bipush          20
	//  233  486:iload_1         
	//  234  487:isub            
	//  235  488:ishl            
	//  236  489:iload_3         
	//  237  490:imul            
	//  238  491:invokespecial   #398 <Method void IPoint(int, int)>
	//  239  494:astore          19
				boolean flag2 = flag;
	//  240  496:iload           7
	//  241  498:istore          8
				if(ipoint1.x < k3)
	//* 242  500:aload           19
	//* 243  502:getfield        #306 <Field int IPoint.x>
	//* 244  505:iload           11
	//* 245  507:icmpge          600
				{
					flag2 = flag;
	//  246  510:iload           7
	//  247  512:istore          8
					if(ipoint1.x > i4)
	//* 248  514:aload           19
	//* 249  516:getfield        #306 <Field int IPoint.x>
	//* 250  519:iload           13
	//* 251  521:icmple          600
					{
						flag2 = flag;
	//  252  524:iload           7
	//  253  526:istore          8
						if(ipoint1.y < l3)
	//* 254  528:aload           19
	//* 255  530:getfield        #309 <Field int IPoint.y>
	//* 256  533:iload           12
	//* 257  535:icmpge          600
						{
							flag2 = flag;
	//  258  538:iload           7
	//  259  540:istore          8
							if(ipoint1.y > j4)
	//* 260  542:aload           19
	//* 261  544:getfield        #309 <Field int IPoint.y>
	//* 262  547:iload           14
	//* 263  549:icmple          600
							{
								flag2 = flag;
	//  264  552:iload           7
	//  265  554:istore          8
								if(!flag)
	//* 266  556:iload           7
	//* 267  558:ifne            564
									flag2 = true;
	//  268  561:iconst_1        
	//  269  562:istore          8
								a a1 = new a(i3, i5, i1, l1, s1, af1, fe1);
	//  270  564:new             #10  <Class dq$a>
	//  271  567:dup             
	//  272  568:iload           10
	//  273  570:iload           17
	//  274  572:iload_1         
	//  275  573:iload           4
	//  276  575:aload_0         
	//  277  576:aload           5
	//  278  578:aload           6
	//  279  580:invokespecial   #387 <Method void dq$a(int, int, int, int, s, af, fe)>
	//  280  583:astore          20
								a1.e = ipoint1;
	//  281  585:aload           20
	//  282  587:aload           19
	//  283  589:putfield        #301 <Field IPoint dq$a.e>
								((ArrayList) (obj)).add(((Object) (a1)));
	//  284  592:aload           18
	//  285  594:aload           20
	//  286  596:invokevirtual   #396 <Method boolean ArrayList.add(Object)>
	//  287  599:pop             
							}
						}
					}
				}
				i5 = l4 - k2;
	//  288  600:iload           16
	//  289  602:iload           9
	//  290  604:isub            
	//  291  605:istore          17
				ipoint1 = new IPoint((i3 << 20 - i1) * j1, (i5 << 20 - i1) * k1);
	//  292  607:new             #303 <Class IPoint>
	//  293  610:dup             
	//  294  611:iload           10
	//  295  613:bipush          20
	//  296  615:iload_1         
	//  297  616:isub            
	//  298  617:ishl            
	//  299  618:iload_2         
	//  300  619:imul            
	//  301  620:iload           17
	//  302  622:bipush          20
	//  303  624:iload_1         
	//  304  625:isub            
	//  305  626:ishl            
	//  306  627:iload_3         
	//  307  628:imul            
	//  308  629:invokespecial   #398 <Method void IPoint(int, int)>
	//  309  632:astore          19
				flag = flag2;
	//  310  634:iload           8
	//  311  636:istore          7
				if(ipoint1.x >= k3)
					continue;
	//  312  638:aload           19
	//  313  640:getfield        #306 <Field int IPoint.x>
	//  314  643:iload           11
	//  315  645:icmpge          738
				flag = flag2;
	//  316  648:iload           8
	//  317  650:istore          7
				if(ipoint1.x <= i4)
					continue;
	//  318  652:aload           19
	//  319  654:getfield        #306 <Field int IPoint.x>
	//  320  657:iload           13
	//  321  659:icmple          738
				flag = flag2;
	//  322  662:iload           8
	//  323  664:istore          7
				if(ipoint1.y >= l3)
					continue;
	//  324  666:aload           19
	//  325  668:getfield        #309 <Field int IPoint.y>
	//  326  671:iload           12
	//  327  673:icmpge          738
				flag = flag2;
	//  328  676:iload           8
	//  329  678:istore          7
				if(ipoint1.y <= j4)
					continue;
	//  330  680:aload           19
	//  331  682:getfield        #309 <Field int IPoint.y>
	//  332  685:iload           14
	//  333  687:icmple          738
				flag = flag2;
	//  334  690:iload           8
	//  335  692:istore          7
				if(!flag2)
	//* 336  694:iload           8
	//* 337  696:ifne            702
					flag = true;
	//  338  699:iconst_1        
	//  339  700:istore          7
				a a2 = new a(i3, i5, i1, l1, s1, af1, fe1);
	//  340  702:new             #10  <Class dq$a>
	//  341  705:dup             
	//  342  706:iload           10
	//  343  708:iload           17
	//  344  710:iload_1         
	//  345  711:iload           4
	//  346  713:aload_0         
	//  347  714:aload           5
	//  348  716:aload           6
	//  349  718:invokespecial   #387 <Method void dq$a(int, int, int, int, s, af, fe)>
	//  350  721:astore          20
				a2.e = ipoint1;
	//  351  723:aload           20
	//  352  725:aload           19
	//  353  727:putfield        #301 <Field IPoint dq$a.e>
				((ArrayList) (obj)).add(((Object) (a2)));
	//  354  730:aload           18
	//  355  732:aload           20
	//  356  734:invokevirtual   #396 <Method boolean ArrayList.add(Object)>
	//  357  737:pop             
			}

	//  358  738:iload           10
	//  359  740:iconst_1        
	//  360  741:iadd            
	//  361  742:istore          10
	//* 362  744:goto            452
			int j3 = (l4 + k2) - 1;
	//  363  747:iload           16
	//  364  749:iload           9
	//  365  751:iadd            
	//  366  752:iconst_1        
	//  367  753:isub            
	//  368  754:istore          10
			boolean flag3 = flag;
	//  369  756:iload           7
	//  370  758:istore          8
			for(; j3 > l4 - k2; j3--)
	//* 371  760:iload           10
	//* 372  762:iload           16
	//* 373  764:iload           9
	//* 374  766:isub            
	//* 375  767:icmple          1055
			{
				int j5 = k4 + k2;
	//  376  770:iload           15
	//  377  772:iload           9
	//  378  774:iadd            
	//  379  775:istore          17
				IPoint ipoint2 = new IPoint((j5 << 20 - i1) * j1, (j3 << 20 - i1) * k1);
	//  380  777:new             #303 <Class IPoint>
	//  381  780:dup             
	//  382  781:iload           17
	//  383  783:bipush          20
	//  384  785:iload_1         
	//  385  786:isub            
	//  386  787:ishl            
	//  387  788:iload_2         
	//  388  789:imul            
	//  389  790:iload           10
	//  390  792:bipush          20
	//  391  794:iload_1         
	//  392  795:isub            
	//  393  796:ishl            
	//  394  797:iload_3         
	//  395  798:imul            
	//  396  799:invokespecial   #398 <Method void IPoint(int, int)>
	//  397  802:astore          19
				boolean flag1 = flag3;
	//  398  804:iload           8
	//  399  806:istore          7
				if(ipoint2.x < k3)
	//* 400  808:aload           19
	//* 401  810:getfield        #306 <Field int IPoint.x>
	//* 402  813:iload           11
	//* 403  815:icmpge          908
				{
					flag1 = flag3;
	//  404  818:iload           8
	//  405  820:istore          7
					if(ipoint2.x > i4)
	//* 406  822:aload           19
	//* 407  824:getfield        #306 <Field int IPoint.x>
	//* 408  827:iload           13
	//* 409  829:icmple          908
					{
						flag1 = flag3;
	//  410  832:iload           8
	//  411  834:istore          7
						if(ipoint2.y < l3)
	//* 412  836:aload           19
	//* 413  838:getfield        #309 <Field int IPoint.y>
	//* 414  841:iload           12
	//* 415  843:icmpge          908
						{
							flag1 = flag3;
	//  416  846:iload           8
	//  417  848:istore          7
							if(ipoint2.y > j4)
	//* 418  850:aload           19
	//* 419  852:getfield        #309 <Field int IPoint.y>
	//* 420  855:iload           14
	//* 421  857:icmple          908
							{
								flag1 = flag3;
	//  422  860:iload           8
	//  423  862:istore          7
								if(!flag3)
	//* 424  864:iload           8
	//* 425  866:ifne            872
									flag1 = true;
	//  426  869:iconst_1        
	//  427  870:istore          7
								a a3 = new a(j5, j3, i1, l1, s1, af1, fe1);
	//  428  872:new             #10  <Class dq$a>
	//  429  875:dup             
	//  430  876:iload           17
	//  431  878:iload           10
	//  432  880:iload_1         
	//  433  881:iload           4
	//  434  883:aload_0         
	//  435  884:aload           5
	//  436  886:aload           6
	//  437  888:invokespecial   #387 <Method void dq$a(int, int, int, int, s, af, fe)>
	//  438  891:astore          20
								a3.e = ipoint2;
	//  439  893:aload           20
	//  440  895:aload           19
	//  441  897:putfield        #301 <Field IPoint dq$a.e>
								((ArrayList) (obj)).add(((Object) (a3)));
	//  442  900:aload           18
	//  443  902:aload           20
	//  444  904:invokevirtual   #396 <Method boolean ArrayList.add(Object)>
	//  445  907:pop             
							}
						}
					}
				}
				j5 = k4 - k2;
	//  446  908:iload           15
	//  447  910:iload           9
	//  448  912:isub            
	//  449  913:istore          17
				ipoint2 = new IPoint((j5 << 20 - i1) * j1, (j3 << 20 - i1) * k1);
	//  450  915:new             #303 <Class IPoint>
	//  451  918:dup             
	//  452  919:iload           17
	//  453  921:bipush          20
	//  454  923:iload_1         
	//  455  924:isub            
	//  456  925:ishl            
	//  457  926:iload_2         
	//  458  927:imul            
	//  459  928:iload           10
	//  460  930:bipush          20
	//  461  932:iload_1         
	//  462  933:isub            
	//  463  934:ishl            
	//  464  935:iload_3         
	//  465  936:imul            
	//  466  937:invokespecial   #398 <Method void IPoint(int, int)>
	//  467  940:astore          19
				flag3 = flag1;
	//  468  942:iload           7
	//  469  944:istore          8
				if(ipoint2.x >= k3)
					continue;
	//  470  946:aload           19
	//  471  948:getfield        #306 <Field int IPoint.x>
	//  472  951:iload           11
	//  473  953:icmpge          1046
				flag3 = flag1;
	//  474  956:iload           7
	//  475  958:istore          8
				if(ipoint2.x <= i4)
					continue;
	//  476  960:aload           19
	//  477  962:getfield        #306 <Field int IPoint.x>
	//  478  965:iload           13
	//  479  967:icmple          1046
				flag3 = flag1;
	//  480  970:iload           7
	//  481  972:istore          8
				if(ipoint2.y >= l3)
					continue;
	//  482  974:aload           19
	//  483  976:getfield        #309 <Field int IPoint.y>
	//  484  979:iload           12
	//  485  981:icmpge          1046
				flag3 = flag1;
	//  486  984:iload           7
	//  487  986:istore          8
				if(ipoint2.y <= j4)
					continue;
	//  488  988:aload           19
	//  489  990:getfield        #309 <Field int IPoint.y>
	//  490  993:iload           14
	//  491  995:icmple          1046
				flag3 = flag1;
	//  492  998:iload           7
	//  493 1000:istore          8
				if(!flag1)
	//* 494 1002:iload           7
	//* 495 1004:ifne            1010
					flag3 = true;
	//  496 1007:iconst_1        
	//  497 1008:istore          8
				a a4 = new a(j5, j3, i1, l1, s1, af1, fe1);
	//  498 1010:new             #10  <Class dq$a>
	//  499 1013:dup             
	//  500 1014:iload           17
	//  501 1016:iload           10
	//  502 1018:iload_1         
	//  503 1019:iload           4
	//  504 1021:aload_0         
	//  505 1022:aload           5
	//  506 1024:aload           6
	//  507 1026:invokespecial   #387 <Method void dq$a(int, int, int, int, s, af, fe)>
	//  508 1029:astore          20
				a4.e = ipoint2;
	//  509 1031:aload           20
	//  510 1033:aload           19
	//  511 1035:putfield        #301 <Field IPoint dq$a.e>
				((ArrayList) (obj)).add(((Object) (a4)));
	//  512 1038:aload           18
	//  513 1040:aload           20
	//  514 1042:invokevirtual   #396 <Method boolean ArrayList.add(Object)>
	//  515 1045:pop             
			}

	//  516 1046:iload           10
	//  517 1048:iconst_1        
	//  518 1049:isub            
	//  519 1050:istore          10
	//* 520 1052:goto            760
			if(!flag3)
	//* 521 1055:iload           8
	//* 522 1057:ifne            1063
				return ((ArrayList) (obj));
	//  523 1060:aload           18
	//  524 1062:areturn         
			k2++;
	//  525 1063:iload           9
	//  526 1065:iconst_1        
	//  527 1066:iadd            
	//  528 1067:istore          9
		} while(true);
	//  529 1069:goto            442
	}

	private static boolean b(s s1, List list, int i1, boolean flag, List list1, boolean flag1, af af1, fe fe1)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(list1 == null)
	//*   4    6:aload           4
	//*   5    8:ifnonnull       13
			return false;
	//    6   11:iconst_0        
	//    7   12:ireturn         
		list1;
	//    8   13:aload           4
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
		Iterator iterator = list1.iterator();
	//   10   16:aload           4
	//   11   18:invokeinterface #406 <Method Iterator List.iterator()>
	//   12   23:astore          10
_L6:
		a a1;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_141;
	//   13   25:aload           10
	//   14   27:invokeinterface #411 <Method boolean Iterator.hasNext()>
	//   15   32:ifeq            141
		a1 = (a)iterator.next();
	//   16   35:aload           10
	//   17   37:invokeinterface #415 <Method Object Iterator.next()>
	//   18   42:checkcast       #10  <Class dq$a>
	//   19   45:astore          11
		boolean flag3 = false;
	//   20   47:iconst_0        
	//   21   48:istore          9
		Iterator iterator1 = list.iterator();
	//   22   50:aload_1         
	//   23   51:invokeinterface #406 <Method Iterator List.iterator()>
	//   24   56:astore          12
_L4:
		boolean flag2 = flag3;
	//   25   58:iload           9
	//   26   60:istore          8
		if(!iterator1.hasNext()) goto _L2; else goto _L1
	//   27   62:aload           12
	//   28   64:invokeinterface #411 <Method boolean Iterator.hasNext()>
	//   29   69:ifeq            128
_L1:
		a a2 = (a)iterator1.next();
	//   30   72:aload           12
	//   31   74:invokeinterface #415 <Method Object Iterator.next()>
	//   32   79:checkcast       #10  <Class dq$a>
	//   33   82:astore          13
		if(!a1.equals(((Object) (a2))) || !a1.g) goto _L4; else goto _L3
	//   34   84:aload           11
	//   35   86:aload           13
	//   36   88:invokevirtual   #416 <Method boolean dq$a.equals(Object)>
	//   37   91:ifeq            364
	//   38   94:aload           11
	//   39   96:getfield        #418 <Field boolean dq$a.g>
	//   40   99:ifeq            364
_L3:
		a2.g = a1.g;
	//   41  102:aload           13
	//   42  104:aload           11
	//   43  106:getfield        #418 <Field boolean dq$a.g>
	//   44  109:putfield        #418 <Field boolean dq$a.g>
		a2.f = a1.f;
	//   45  112:aload           13
	//   46  114:aload           11
	//   47  116:getfield        #420 <Field int dq$a.f>
	//   48  119:putfield        #420 <Field int dq$a.f>
		flag2 = true;
	//   49  122:iconst_1        
	//   50  123:istore          8
	//*  51  125:goto            128
_L2:
		if(flag2) goto _L6; else goto _L5
	//   52  128:iload           8
	//   53  130:ifne            367
_L5:
		a1.b();
	//   54  133:aload           11
	//   55  135:invokevirtual   #422 <Method void dq$a.b()>
		  goto _L6
	//*  56  138:goto            367
		list1.clear();
	//   57  141:aload           4
	//   58  143:invokeinterface #425 <Method void List.clear()>
		list1;
	//   59  148:aload           4
		JVM INSTR monitorexit ;
	//   60  150:monitorexit     
		  goto _L7
	//*  61  151:goto            160
		s1;
	//   62  154:astore_0        
	//*  63  155:aload           4
		throw s1;
	//   64  157:monitorexit     
	//   65  158:aload_0         
	//   66  159:athrow          
_L7:
		if(i1 > (int)s1.getMaxZoomLevel() || i1 < (int)s1.getMinZoomLevel())
	//*  67  160:iload_2         
	//*  68  161:aload_0         
	//*  69  162:invokeinterface #428 <Method float s.getMaxZoomLevel()>
	//*  70  167:f2i             
	//*  71  168:icmpgt          182
	//*  72  171:iload_2         
	//*  73  172:aload_0         
	//*  74  173:invokeinterface #431 <Method float s.getMinZoomLevel()>
	//*  75  178:f2i             
	//*  76  179:icmpge          184
			return false;
	//   77  182:iconst_0        
	//   78  183:ireturn         
		int j1 = list.size();
	//   79  184:aload_1         
	//   80  185:invokeinterface #434 <Method int List.size()>
	//   81  190:istore          8
		if(j1 <= 0)
	//*  82  192:iload           8
	//*  83  194:ifgt            199
			return false;
	//   84  197:iconst_0        
	//   85  198:ireturn         
		for(i1 = 0; i1 < j1; i1++)
	//*  86  199:iconst_0        
	//*  87  200:istore_2        
	//*  88  201:iload_2         
	//*  89  202:iload           8
	//*  90  204:icmpge          362
		{
			s1 = ((s) ((a)list.get(i1)));
	//   91  207:aload_1         
	//   92  208:iload_2         
	//   93  209:invokeinterface #438 <Method Object List.get(int)>
	//   94  214:checkcast       #10  <Class dq$a>
	//   95  217:astore_0        
			if(s1 == null || flag1 && (af1.a().getMapConfig().getMapLanguage().equals("zh_cn") ? !MapsInitializer.isLoadWorldGridMap() || ((a) (s1)).c < 7 || ew.a(((a) (s1)).a, ((a) (s1)).b, ((a) (s1)).c) : !MapsInitializer.isLoadWorldGridMap() && ((a) (s1)).c >= 7 && !ew.a(((a) (s1)).a, ((a) (s1)).b, ((a) (s1)).c)))
	//*  96  218:aload_0         
	//*  97  219:ifnonnull       225
	//*  98  222:goto            355
	//*  99  225:iload           5
	//* 100  227:ifeq            327
	//* 101  230:aload           6
	//* 102  232:invokevirtual   #127 <Method s af.a()>
	//* 103  235:invokeinterface #157 <Method MapConfig s.getMapConfig()>
	//* 104  240:invokevirtual   #162 <Method String MapConfig.getMapLanguage()>
	//* 105  243:ldc2            #440 <String "zh_cn">
	//* 106  246:invokevirtual   #203 <Method boolean String.equals(Object)>
	//* 107  249:ifeq            291
	//* 108  252:invokestatic    #445 <Method boolean MapsInitializer.isLoadWorldGridMap()>
	//* 109  255:ifne            261
	//* 110  258:goto            355
	//* 111  261:aload_0         
	//* 112  262:getfield        #298 <Field int dq$a.c>
	//* 113  265:bipush          7
	//* 114  267:icmplt          355
	//* 115  270:aload_0         
	//* 116  271:getfield        #446 <Field int dq$a.a>
	//* 117  274:aload_0         
	//* 118  275:getfield        #447 <Field int dq$a.b>
	//* 119  278:aload_0         
	//* 120  279:getfield        #298 <Field int dq$a.c>
	//* 121  282:invokestatic    #452 <Method boolean ew.a(int, int, int)>
	//* 122  285:ifeq            327
	//* 123  288:goto            355
	//* 124  291:invokestatic    #445 <Method boolean MapsInitializer.isLoadWorldGridMap()>
	//* 125  294:ifne            327
	//* 126  297:aload_0         
	//* 127  298:getfield        #298 <Field int dq$a.c>
	//* 128  301:bipush          7
	//* 129  303:icmplt          327
	//* 130  306:aload_0         
	//* 131  307:getfield        #446 <Field int dq$a.a>
	//* 132  310:aload_0         
	//* 133  311:getfield        #447 <Field int dq$a.b>
	//* 134  314:aload_0         
	//* 135  315:getfield        #298 <Field int dq$a.c>
	//* 136  318:invokestatic    #452 <Method boolean ew.a(int, int, int)>
	//* 137  321:ifne            327
				continue;
	//  138  324:goto            355
			list1.add(((Object) (s1)));
	//  139  327:aload           4
	//  140  329:aload_0         
	//  141  330:invokeinterface #453 <Method boolean List.add(Object)>
	//  142  335:pop             
			if(!((a) (s1)).g && fe1 != null)
	//* 143  336:aload_0         
	//* 144  337:getfield        #418 <Field boolean dq$a.g>
	//* 145  340:ifne            355
	//* 146  343:aload           7
	//* 147  345:ifnull          355
				fe1.a(flag, ((a) (s1)));
	//  148  348:aload           7
	//  149  350:iload_3         
	//  150  351:aload_0         
	//  151  352:invokevirtual   #456 <Method void fe.a(boolean, dq$a)>
		}

	//  152  355:iload_2         
	//  153  356:iconst_1        
	//  154  357:iadd            
	//  155  358:istore_2        
	//* 156  359:goto            201
		return true;
	//  157  362:iconst_1        
	//  158  363:ireturn         
	//* 159  364:goto            58
	//* 160  367:goto            25
	}

	private void c(boolean flag)
	{
		o = new b(flag, g, i, j, k, m, f, b, l);
	//    0    0:aload_0         
	//    1    1:new             #13  <Class dq$b>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #129 <Field s g>
	//    6   10:aload_0         
	//    7   11:getfield        #57  <Field int i>
	//    8   14:aload_0         
	//    9   15:getfield        #59  <Field int j>
	//   10   18:aload_0         
	//   11   19:getfield        #61  <Field int k>
	//   12   22:aload_0         
	//   13   23:getfield        #66  <Field List m>
	//   14   26:aload_0         
	//   15   27:getfield        #55  <Field boolean f>
	//   16   30:aload_0         
	//   17   31:getfield        #76  <Field af b>
	//   18   34:aload_0         
	//   19   35:getfield        #213 <Field fe l>
	//   20   38:invokespecial   #460 <Method void dq$b(boolean, s, int, int, int, List, boolean, af, fe)>
	//   21   41:putfield        #70  <Field dq$b o>
		o.c(((Object []) (new Void[0])));
	//   22   44:aload_0         
	//   23   45:getfield        #70  <Field dq$b o>
	//   24   48:iconst_0        
	//   25   49:anewarray       Void[]
	//   26   52:invokevirtual   #465 <Method ed dq$b.c(Object[])>
	//   27   55:pop             
	//   28   56:return          
	}

	private void d()
	{
		if(o != null && o.a() == ed.e.b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field dq$b o>
	//*   2    4:ifnull          29
	//*   3    7:aload_0         
	//*   4    8:getfield        #70  <Field dq$b o>
	//*   5   11:invokevirtual   #468 <Method ed$e dq$b.a()>
	//*   6   14:getstatic       #473 <Field ed$e ed$e.b>
	//*   7   17:if_acmpne       29
			o.a(true);
	//    8   20:aload_0         
	//    9   21:getfield        #70  <Field dq$b o>
	//   10   24:iconst_1        
	//   11   25:invokevirtual   #476 <Method boolean dq$b.a(boolean)>
	//   12   28:pop             
	//   13   29:return          
	}

	private void e()
	{
		if(b != null && b.a() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field af b>
	//*   2    4:ifnull          37
	//*   3    7:aload_0         
	//*   4    8:getfield        #76  <Field af b>
	//*   5   11:invokevirtual   #127 <Method s af.a()>
	//*   6   14:ifnull          37
			a = (ds.f)b.a().t(0);
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #76  <Field af b>
	//   10   22:invokevirtual   #127 <Method s af.a()>
	//   11   25:iconst_0        
	//   12   26:invokeinterface #480 <Method dr s.t(int)>
	//   13   31:checkcast       #237 <Class ds$f>
	//   14   34:putfield        #235 <Field ds$f a>
	//   15   37:return          
	}

	public void a()
	{
		if(m == null)
			break MISSING_BLOCK_LABEL_208;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field List m>
	//    2    4:ifnull          208
		List list = m;
	//    3    7:aload_0         
	//    4    8:getfield        #66  <Field List m>
	//    5   11:astore          4
		list;
	//    6   13:aload           4
		JVM INSTR monitorenter ;
	//    7   15:monitorenter    
		int i1 = m.size();
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field List m>
	//   10   20:invokeinterface #434 <Method int List.size()>
	//   11   25:istore_1        
		if(i1 != 0)
			break MISSING_BLOCK_LABEL_34;
	//   12   26:iload_1         
	//   13   27:ifne            34
		list;
	//   14   30:aload           4
		JVM INSTR monitorexit ;
	//   15   32:monitorexit     
		return;
	//   16   33:return          
		int j1 = m.size();
	//   17   34:aload_0         
	//   18   35:getfield        #66  <Field List m>
	//   19   38:invokeinterface #434 <Method int List.size()>
	//   20   43:istore_2        
		i1 = 0;
	//   21   44:iconst_0        
	//   22   45:istore_1        
_L3:
		if(i1 >= j1) goto _L2; else goto _L1
	//   23   46:iload_1         
	//   24   47:iload_2         
	//   25   48:icmpge          196
_L1:
		boolean flag;
		a a1;
		a1 = (a)m.get(i1);
	//   26   51:aload_0         
	//   27   52:getfield        #66  <Field List m>
	//   28   55:iload_1         
	//   29   56:invokeinterface #438 <Method Object List.get(int)>
	//   30   61:checkcast       #10  <Class dq$a>
	//   31   64:astore          5
		flag = a1.g;
	//   32   66:aload           5
	//   33   68:getfield        #418 <Field boolean dq$a.g>
	//   34   71:istore_3        
		if(flag)
			break MISSING_BLOCK_LABEL_156;
	//   35   72:iload_3         
	//   36   73:ifne            156
		IPoint ipoint = a1.e;
	//   37   76:aload           5
	//   38   78:getfield        #301 <Field IPoint dq$a.e>
	//   39   81:astore          6
		if(a1.i == null || a1.i.isRecycled() || ipoint == null)
			break MISSING_BLOCK_LABEL_156;
	//   40   83:aload           5
	//   41   85:getfield        #483 <Field Bitmap dq$a.i>
	//   42   88:ifnull          140
	//   43   91:aload           5
	//   44   93:getfield        #483 <Field Bitmap dq$a.i>
	//   45   96:invokevirtual   #488 <Method boolean Bitmap.isRecycled()>
	//   46   99:ifne            140
	//   47  102:aload           6
	//   48  104:ifnull          140
		a1.f = fd.a(a1.i);
	//   49  107:aload           5
	//   50  109:aload           5
	//   51  111:getfield        #483 <Field Bitmap dq$a.i>
	//   52  114:invokestatic    #491 <Method int fd.a(Bitmap)>
	//   53  117:putfield        #420 <Field int dq$a.f>
		if(a1.f != 0)
	//*  54  120:aload           5
	//*  55  122:getfield        #420 <Field int dq$a.f>
	//*  56  125:ifeq            134
			a1.g = true;
	//   57  128:aload           5
	//   58  130:iconst_1        
	//   59  131:putfield        #418 <Field boolean dq$a.g>
		a1.i = null;
	//   60  134:aload           5
	//   61  136:aconst_null     
	//   62  137:putfield        #483 <Field Bitmap dq$a.i>
		break MISSING_BLOCK_LABEL_156;
	//   63  140:goto            156
		Throwable throwable;
		throwable;
	//   64  143:astore          6
		hm.c(throwable, "TileOverlayDelegateImp", "drawTiles");
	//   65  145:aload           6
	//   66  147:ldc2            #493 <String "TileOverlayDelegateImp">
	//   67  150:ldc2            #495 <String "drawTiles">
	//   68  153:invokestatic    #500 <Method void hm.c(Throwable, String, String)>
		if(a1.g)
	//*  69  156:aload           5
	//*  70  158:getfield        #418 <Field boolean dq$a.g>
	//*  71  161:ifeq            189
		{
			a(a1);
	//   72  164:aload_0         
	//   73  165:aload           5
	//   74  167:invokespecial   #502 <Method boolean a(dq$a)>
	//   75  170:pop             
			a(a1.f, a1.h, q);
	//   76  171:aload_0         
	//   77  172:aload           5
	//   78  174:getfield        #420 <Field int dq$a.f>
	//   79  177:aload           5
	//   80  179:getfield        #317 <Field FloatBuffer dq$a.h>
	//   81  182:aload_0         
	//   82  183:getfield        #74  <Field FloatBuffer q>
	//   83  186:invokespecial   #504 <Method void a(int, FloatBuffer, FloatBuffer)>
		}
		i1++;
	//   84  189:iload_1         
	//   85  190:iconst_1        
	//   86  191:iadd            
	//   87  192:istore_1        
		  goto _L3
	//*  88  193:goto            46
	//*  89  196:aload           4
_L2:
		return;
	//   90  198:monitorexit     
	//   91  199:return          
		Exception exception;
		exception;
	//   92  200:astore          5
	//*  93  202:aload           4
		throw exception;
	//   94  204:monitorexit     
	//   95  205:aload           5
	//   96  207:athrow          
	//   97  208:return          
	}

	public void a(String s1)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #506 <Method void d()>
		b();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #507 <Method void b()>
		if(l != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #213 <Field fe l>
	//*   6   12:ifnull          39
		{
			l.a(true);
	//    7   15:aload_0         
	//    8   16:getfield        #213 <Field fe l>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #508 <Method void fe.a(boolean)>
			l.a(s1);
	//   11   23:aload_0         
	//   12   24:getfield        #213 <Field fe l>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #509 <Method void fe.a(String)>
			l.a(false);
	//   15   31:aload_0         
	//   16   32:getfield        #213 <Field fe l>
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #508 <Method void fe.a(boolean)>
		}
		c(true);
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:invokespecial   #511 <Method void c(boolean)>
	//   22   44:return          
	}

	public void a(boolean flag)
	{
		if(n)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean n>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			d();
	//    4    8:aload_0         
	//    5    9:invokespecial   #506 <Method void d()>
			c(flag);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #511 <Method void c(boolean)>
			return;
	//    9   17:return          
		}
	}

	public void b()
	{
		if(m == null)
			break MISSING_BLOCK_LABEL_31;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field List m>
	//    2    4:ifnull          31
		List list = m;
	//    3    7:aload_0         
	//    4    8:getfield        #66  <Field List m>
	//    5   11:astore_1        
		list;
	//    6   12:aload_1         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		m.clear();
	//    8   14:aload_0         
	//    9   15:getfield        #66  <Field List m>
	//   10   18:invokeinterface #425 <Method void List.clear()>
		list;
	//   11   23:aload_1         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		Exception exception;
		exception;
	//   14   26:astore_2        
	//*  15   27:aload_1         
		throw exception;
	//   16   28:monitorexit     
	//   17   29:aload_2         
	//   18   30:athrow          
	//   19   31:return          
	}

	public void b(boolean flag)
	{
		if(n != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean n>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          28
		{
			n = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #68  <Field boolean n>
			if(l != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #213 <Field fe l>
	//*   9   17:ifnull          28
				l.a(flag);
	//   10   20:aload_0         
	//   11   21:getfield        #213 <Field fe l>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #508 <Method void fe.a(boolean)>
		}
	//   14   28:return          
	}

	public void c()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #506 <Method void d()>
		List list = m;
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field List m>
	//    4    8:astore_3        
		list;
	//    5    9:aload_3         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		int j1 = m.size();
	//    7   11:aload_0         
	//    8   12:getfield        #66  <Field List m>
	//    9   15:invokeinterface #434 <Method int List.size()>
	//   10   20:istore_2        
		int i1 = 0;
	//   11   21:iconst_0        
	//   12   22:istore_1        
_L2:
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:icmpge          51
		((a)m.get(i1)).b();
	//   16   28:aload_0         
	//   17   29:getfield        #66  <Field List m>
	//   18   32:iload_1         
	//   19   33:invokeinterface #438 <Method Object List.get(int)>
	//   20   38:checkcast       #10  <Class dq$a>
	//   21   41:invokevirtual   #422 <Method void dq$a.b()>
		i1++;
	//   22   44:iload_1         
	//   23   45:iconst_1        
	//   24   46:iadd            
	//   25   47:istore_1        
		if(true) goto _L2; else goto _L1
	//   26   48:goto            23
_L1:
		m.clear();
	//   27   51:aload_0         
	//   28   52:getfield        #66  <Field List m>
	//   29   55:invokeinterface #425 <Method void List.clear()>
		list;
	//   30   60:aload_3         
		JVM INSTR monitorexit ;
	//   31   61:monitorexit     
		return;
	//   32   62:return          
		Exception exception;
		exception;
	//   33   63:astore          4
	//*  34   65:aload_3         
		throw exception;
	//   35   66:monitorexit     
	//   36   67:aload           4
	//   37   69:athrow          
	}

	public void clearTileCache()
	{
		if(l != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #213 <Field fe l>
	//*   2    4:ifnull          14
			l.f();
	//    3    7:aload_0         
	//    4    8:getfield        #213 <Field fe l>
	//    5   11:invokevirtual   #514 <Method void fe.f()>
	//    6   14:return          
	}

	public void destroy(boolean flag)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #506 <Method void d()>
		List list = m;
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field List m>
	//    4    8:astore          4
		list;
	//    5   10:aload           4
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		int j1 = m.size();
	//    7   13:aload_0         
	//    8   14:getfield        #66  <Field List m>
	//    9   17:invokeinterface #434 <Method int List.size()>
	//   10   22:istore_3        
		int i1 = 0;
	//   11   23:iconst_0        
	//   12   24:istore_2        
_L2:
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
	//   13   25:iload_2         
	//   14   26:iload_3         
	//   15   27:icmpge          53
		((a)m.get(i1)).b();
	//   16   30:aload_0         
	//   17   31:getfield        #66  <Field List m>
	//   18   34:iload_2         
	//   19   35:invokeinterface #438 <Method Object List.get(int)>
	//   20   40:checkcast       #10  <Class dq$a>
	//   21   43:invokevirtual   #422 <Method void dq$a.b()>
		i1++;
	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:iadd            
	//   25   49:istore_2        
		if(true) goto _L2; else goto _L1
	//   26   50:goto            25
_L1:
		m.clear();
	//   27   53:aload_0         
	//   28   54:getfield        #66  <Field List m>
	//   29   57:invokeinterface #425 <Method void List.clear()>
		list;
	//   30   62:aload           4
		JVM INSTR monitorexit ;
	//   31   64:monitorexit     
		  goto _L3
	//*  32   65:goto            76
		Exception exception;
		exception;
	//   33   68:astore          5
	//*  34   70:aload           4
		throw exception;
	//   35   72:monitorexit     
	//   36   73:aload           5
	//   37   75:athrow          
_L3:
		if(l != null)
	//*  38   76:aload_0         
	//*  39   77:getfield        #213 <Field fe l>
	//*  40   80:ifnull          107
		{
			l.c(flag);
	//   41   83:aload_0         
	//   42   84:getfield        #213 <Field fe l>
	//   43   87:iload_1         
	//   44   88:invokevirtual   #516 <Method void fe.c(boolean)>
			l.a(true);
	//   45   91:aload_0         
	//   46   92:getfield        #213 <Field fe l>
	//   47   95:iconst_1        
	//   48   96:invokevirtual   #508 <Method void fe.a(boolean)>
			l.a(((TileProvider) (null)));
	//   49   99:aload_0         
	//   50  100:getfield        #213 <Field fe l>
	//   51  103:aconst_null     
	//   52  104:invokevirtual   #216 <Method void fe.a(TileProvider)>
		}
		return;
	//   53  107:return          
	}

	public boolean equalsRemote(ITileOverlay itileoverlay)
	{
		return ((Object)this).equals(((Object) (itileoverlay))) || itileoverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #519 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #522 <Method String ITileOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #122 <Method String getId()>
	//    8   18:invokevirtual   #203 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public String getId()
	{
		if(p == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field String p>
	//*   2    4:ifnonnull       16
			p = b("TileOverlay");
	//    3    7:aload_0         
	//    4    8:ldc1            #131 <String "TileOverlay">
	//    5   10:invokestatic    #524 <Method String b(String)>
	//    6   13:putfield        #72  <Field String p>
		return p;
	//    7   16:aload_0         
	//    8   17:getfield        #72  <Field String p>
	//    9   20:areturn         
	}

	public float getZIndex()
	{
		return d.floatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Float d>
	//    2    4:invokevirtual   #527 <Method float Float.floatValue()>
	//    3    7:freturn         
	}

	public int hashCodeRemote()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #531 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public boolean isVisible()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field boolean e>
	//    2    4:ireturn         
	}

	public void remove()
	{
		b.b(((di) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field af b>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #535 <Method boolean af.b(di)>
	//    4    8:pop             
		g.setRunLowFrame(false);
	//    5    9:aload_0         
	//    6   10:getfield        #129 <Field s g>
	//    7   13:iconst_0        
	//    8   14:invokeinterface #538 <Method void s.setRunLowFrame(boolean)>
	//    9   19:return          
	}

	public void setVisible(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field boolean e>
		g.setRunLowFrame(false);
	//    3    5:aload_0         
	//    4    6:getfield        #129 <Field s g>
	//    5    9:iconst_0        
	//    6   10:invokeinterface #538 <Method void s.setRunLowFrame(boolean)>
		if(flag)
	//*   7   15:iload_1         
	//*   8   16:ifeq            24
			a(true);
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #540 <Method void a(boolean)>
	//   12   24:return          
	}

	public void setZIndex(float f1)
	{
		d = Float.valueOf(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #108 <Method Float Float.valueOf(float)>
	//    3    5:putfield        #110 <Field Float d>
		b.d();
	//    4    8:aload_0         
	//    5    9:getfield        #76  <Field af b>
	//    6   12:invokevirtual   #543 <Method void af.d()>
	//    7   15:return          
	}

	private static int h = 0;
	ds.f a;
	private af b;
	private TileProvider c;
	private Float d;
	private boolean e;
	private boolean f;
	private s g;
	private int i;
	private int j;
	private int k;
	private fe l;
	private List m;
	private boolean n;
	private b o;
	private String p;
	private FloatBuffer q;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #46  <Field int h>
	//*   2    4:return          
	}
}
