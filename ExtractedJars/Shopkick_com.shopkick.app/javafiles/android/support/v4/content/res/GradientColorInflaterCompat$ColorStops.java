// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import java.util.List;

// Referenced classes of package android.support.v4.content.res:
//			GradientColorInflaterCompat

static final class GradientColorInflaterCompat$ColorStops
{

	final int mColors[];
	final float mOffsets[] = {
		0.0F, 1.0F
	};

	GradientColorInflaterCompat$ColorStops(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mColors = (new int[] {
			i, j
		});
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:iload_1         
	//    8   11:iastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:iload_2         
	//   12   15:iastore         
	//   13   16:putfield        #19  <Field int[] mColors>
	//   14   19:aload_0         
	//   15   20:iconst_2        
	//   16   21:newarray        float[]
	//   17   23:dup             
	//   18   24:iconst_0        
	//   19   25:fconst_0        
	//   20   26:fastore         
	//   21   27:dup             
	//   22   28:iconst_1        
	//   23   29:fconst_1        
	//   24   30:fastore         
	//   25   31:putfield        #21  <Field float[] mOffsets>
	//   26   34:return          
	}

	GradientColorInflaterCompat$ColorStops(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mColors = (new int[] {
			i, j, k
		});
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:iload_1         
	//    8   11:iastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:iload_2         
	//   12   15:iastore         
	//   13   16:dup             
	//   14   17:iconst_2        
	//   15   18:iload_3         
	//   16   19:iastore         
	//   17   20:putfield        #19  <Field int[] mColors>
	//   18   23:aload_0         
	//   19   24:iconst_3        
	//   20   25:newarray        float[]
	//   21   27:dup             
	//   22   28:iconst_0        
	//   23   29:fconst_0        
	//   24   30:fastore         
	//   25   31:dup             
	//   26   32:iconst_1        
	//   27   33:ldc1            #25  <Float 0.5F>
	//   28   35:fastore         
	//   29   36:dup             
	//   30   37:iconst_2        
	//   31   38:fconst_1        
	//   32   39:fastore         
	//   33   40:putfield        #21  <Field float[] mOffsets>
	//   34   43:return          
	}

	GradientColorInflaterCompat$ColorStops(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		int j = list.size();
	//    2    4:aload_1         
	//    3    5:invokeinterface #33  <Method int List.size()>
	//    4   10:istore          4
		mColors = new int[j];
	//    5   12:aload_0         
	//    6   13:iload           4
	//    7   15:newarray        int[]
	//    8   17:putfield        #19  <Field int[] mColors>
		mOffsets = new float[j];
	//    9   20:aload_0         
	//   10   21:iload           4
	//   11   23:newarray        float[]
	//   12   25:putfield        #21  <Field float[] mOffsets>
		for(int i = 0; i < j; i++)
	//*  13   28:iconst_0        
	//*  14   29:istore_3        
	//*  15   30:iload_3         
	//*  16   31:iload           4
	//*  17   33:icmpge          81
		{
			mColors[i] = ((Integer)list.get(i)).intValue();
	//   18   36:aload_0         
	//   19   37:getfield        #19  <Field int[] mColors>
	//   20   40:iload_3         
	//   21   41:aload_1         
	//   22   42:iload_3         
	//   23   43:invokeinterface #37  <Method Object List.get(int)>
	//   24   48:checkcast       #39  <Class Integer>
	//   25   51:invokevirtual   #42  <Method int Integer.intValue()>
	//   26   54:iastore         
			mOffsets[i] = ((Float)list1.get(i)).floatValue();
	//   27   55:aload_0         
	//   28   56:getfield        #21  <Field float[] mOffsets>
	//   29   59:iload_3         
	//   30   60:aload_2         
	//   31   61:iload_3         
	//   32   62:invokeinterface #37  <Method Object List.get(int)>
	//   33   67:checkcast       #44  <Class Float>
	//   34   70:invokevirtual   #48  <Method float Float.floatValue()>
	//   35   73:fastore         
		}

	//   36   74:iload_3         
	//   37   75:iconst_1        
	//   38   76:iadd            
	//   39   77:istore_3        
	//*  40   78:goto            30
	//   41   81:return          
	}
}
