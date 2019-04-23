// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.*;

// Referenced classes of package android.support.v4.graphics:
//			PathSegment

public final class PathUtils
{

	private PathUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Collection flatten(Path path)
	{
		return flatten(path, 0.5F);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Float 0.5F>
	//    2    3:invokestatic    #19  <Method Collection flatten(Path, float)>
	//    3    6:areturn         
	}

	public static Collection flatten(Path path, float f)
	{
		path = ((Path) (path.approximate(f)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #33  <Method float[] Path.approximate(float)>
	//    3    5:astore_0        
		int j = path.length / 3;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:iconst_3        
	//    7    9:idiv            
	//    8   10:istore          8
		ArrayList arraylist = new ArrayList(j);
	//    9   12:new             #35  <Class ArrayList>
	//   10   15:dup             
	//   11   16:iload           8
	//   12   18:invokespecial   #38  <Method void ArrayList(int)>
	//   13   21:astore          11
		for(int i = 1; i < j; i++)
	//*  14   23:iconst_1        
	//*  15   24:istore          7
	//*  16   26:iload           7
	//*  17   28:iload           8
	//*  18   30:icmpge          156
		{
			int k = i * 3;
	//   19   33:iload           7
	//   20   35:iconst_3        
	//   21   36:imul            
	//   22   37:istore          9
			int l = (i - 1) * 3;
	//   23   39:iload           7
	//   24   41:iconst_1        
	//   25   42:isub            
	//   26   43:iconst_3        
	//   27   44:imul            
	//   28   45:istore          10
			f = path[k];
	//   29   47:aload_0         
	//   30   48:iload           9
	//   31   50:faload          
	//   32   51:fstore_1        
			float f1 = path[k + 1];
	//   33   52:aload_0         
	//   34   53:iload           9
	//   35   55:iconst_1        
	//   36   56:iadd            
	//   37   57:faload          
	//   38   58:fstore_2        
			float f2 = path[k + 2];
	//   39   59:aload_0         
	//   40   60:iload           9
	//   41   62:iconst_2        
	//   42   63:iadd            
	//   43   64:faload          
	//   44   65:fstore_3        
			float f3 = path[l];
	//   45   66:aload_0         
	//   46   67:iload           10
	//   47   69:faload          
	//   48   70:fstore          4
			float f4 = path[l + 1];
	//   49   72:aload_0         
	//   50   73:iload           10
	//   51   75:iconst_1        
	//   52   76:iadd            
	//   53   77:faload          
	//   54   78:fstore          5
			float f5 = path[l + 2];
	//   55   80:aload_0         
	//   56   81:iload           10
	//   57   83:iconst_2        
	//   58   84:iadd            
	//   59   85:faload          
	//   60   86:fstore          6
			if(f != f3 && (f1 != f4 || f2 != f5))
	//*  61   88:fload_1         
	//*  62   89:fload           4
	//*  63   91:fcmpl           
	//*  64   92:ifeq            147
	//*  65   95:fload_2         
	//*  66   96:fload           5
	//*  67   98:fcmpl           
	//*  68   99:ifne            109
	//*  69  102:fload_3         
	//*  70  103:fload           6
	//*  71  105:fcmpl           
	//*  72  106:ifeq            147
				((List) (arraylist)).add(((Object) (new PathSegment(new PointF(f4, f5), f3, new PointF(f1, f2), f))));
	//   73  109:aload           11
	//   74  111:new             #40  <Class PathSegment>
	//   75  114:dup             
	//   76  115:new             #42  <Class PointF>
	//   77  118:dup             
	//   78  119:fload           5
	//   79  121:fload           6
	//   80  123:invokespecial   #45  <Method void PointF(float, float)>
	//   81  126:fload           4
	//   82  128:new             #42  <Class PointF>
	//   83  131:dup             
	//   84  132:fload_2         
	//   85  133:fload_3         
	//   86  134:invokespecial   #45  <Method void PointF(float, float)>
	//   87  137:fload_1         
	//   88  138:invokespecial   #48  <Method void PathSegment(PointF, float, PointF, float)>
	//   89  141:invokeinterface #54  <Method boolean List.add(Object)>
	//   90  146:pop             
		}

	//   91  147:iload           7
	//   92  149:iconst_1        
	//   93  150:iadd            
	//   94  151:istore          7
	//*  95  153:goto            26
		return ((Collection) (arraylist));
	//   96  156:aload           11
	//   97  158:areturn         
	}
}
