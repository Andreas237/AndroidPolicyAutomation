// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.gl.Crossing;
import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			Shape, PathIterator, IllegalPathStateException, Point2D, 
//			Rectangle2D, FlatteningPathIterator, AffineTransform, Rectangle

public final class GeneralPath
	implements Shape, Cloneable
{
	class Iterator
		implements PathIterator
	{

		public int currentSegment(double ad[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #38  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #40  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #42  <String "awt.4B">
		//    6   13:invokestatic    #48  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #51  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			byte byte0 = p.types[typeIndex];
		//    9   20:aload_0         
		//   10   21:getfield        #30  <Field GeneralPath p>
		//   11   24:getfield        #55  <Field byte[] GeneralPath.types>
		//   12   27:aload_0         
		//   13   28:getfield        #57  <Field int typeIndex>
		//   14   31:baload          
		//   15   32:istore_3        
			int j = GeneralPath.pointShift[byte0];
		//   16   33:getstatic       #61  <Field int[] GeneralPath.pointShift>
		//   17   36:iload_3         
		//   18   37:iaload          
		//   19   38:istore          4
			for(int i = 0; i < j; i++)
		//*  20   40:iconst_0        
		//*  21   41:istore_2        
		//*  22   42:iload_2         
		//*  23   43:iload           4
		//*  24   45:icmpge          73
				ad[i] = p.points[pointIndex + i];
		//   25   48:aload_1         
		//   26   49:iload_2         
		//   27   50:aload_0         
		//   28   51:getfield        #30  <Field GeneralPath p>
		//   29   54:getfield        #65  <Field float[] GeneralPath.points>
		//   30   57:aload_0         
		//   31   58:getfield        #67  <Field int pointIndex>
		//   32   61:iload_2         
		//   33   62:iadd            
		//   34   63:faload          
		//   35   64:f2d             
		//   36   65:dastore         

		//   37   66:iload_2         
		//   38   67:iconst_1        
		//   39   68:iadd            
		//   40   69:istore_2        
		//*  41   70:goto            42
			if(t != null)
		//*  42   73:aload_0         
		//*  43   74:getfield        #32  <Field AffineTransform t>
		//*  44   77:ifnull          95
				t.transform(ad, 0, ad, 0, j / 2);
		//   45   80:aload_0         
		//   46   81:getfield        #32  <Field AffineTransform t>
		//   47   84:aload_1         
		//   48   85:iconst_0        
		//   49   86:aload_1         
		//   50   87:iconst_0        
		//   51   88:iload           4
		//   52   90:iconst_2        
		//   53   91:idiv            
		//   54   92:invokevirtual   #73  <Method void AffineTransform.transform(double[], int, double[], int, int)>
			pointIndex = pointIndex + j;
		//   55   95:aload_0         
		//   56   96:aload_0         
		//   57   97:getfield        #67  <Field int pointIndex>
		//   58  100:iload           4
		//   59  102:iadd            
		//   60  103:putfield        #67  <Field int pointIndex>
			return ((int) (byte0));
		//   61  106:iload_3         
		//   62  107:ireturn         
		}

		public int currentSegment(float af[])
		{
			if(isDone())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #38  <Method boolean isDone()>
		//*   2    4:ifeq            20
				throw new NoSuchElementException(Messages.getString("awt.4B"));
		//    3    7:new             #40  <Class NoSuchElementException>
		//    4   10:dup             
		//    5   11:ldc1            #42  <String "awt.4B">
		//    6   13:invokestatic    #48  <Method String Messages.getString(String)>
		//    7   16:invokespecial   #51  <Method void NoSuchElementException(String)>
		//    8   19:athrow          
			byte byte0 = p.types[typeIndex];
		//    9   20:aload_0         
		//   10   21:getfield        #30  <Field GeneralPath p>
		//   11   24:getfield        #55  <Field byte[] GeneralPath.types>
		//   12   27:aload_0         
		//   13   28:getfield        #57  <Field int typeIndex>
		//   14   31:baload          
		//   15   32:istore_2        
			int i = GeneralPath.pointShift[byte0];
		//   16   33:getstatic       #61  <Field int[] GeneralPath.pointShift>
		//   17   36:iload_2         
		//   18   37:iaload          
		//   19   38:istore_3        
			System.arraycopy(((Object) (p.points)), pointIndex, ((Object) (af)), 0, i);
		//   20   39:aload_0         
		//   21   40:getfield        #30  <Field GeneralPath p>
		//   22   43:getfield        #65  <Field float[] GeneralPath.points>
		//   23   46:aload_0         
		//   24   47:getfield        #67  <Field int pointIndex>
		//   25   50:aload_1         
		//   26   51:iconst_0        
		//   27   52:iload_3         
		//   28   53:invokestatic    #80  <Method void System.arraycopy(Object, int, Object, int, int)>
			if(t != null)
		//*  29   56:aload_0         
		//*  30   57:getfield        #32  <Field AffineTransform t>
		//*  31   60:ifnull          77
				t.transform(af, 0, af, 0, i / 2);
		//   32   63:aload_0         
		//   33   64:getfield        #32  <Field AffineTransform t>
		//   34   67:aload_1         
		//   35   68:iconst_0        
		//   36   69:aload_1         
		//   37   70:iconst_0        
		//   38   71:iload_3         
		//   39   72:iconst_2        
		//   40   73:idiv            
		//   41   74:invokevirtual   #83  <Method void AffineTransform.transform(float[], int, float[], int, int)>
			pointIndex = pointIndex + i;
		//   42   77:aload_0         
		//   43   78:aload_0         
		//   44   79:getfield        #67  <Field int pointIndex>
		//   45   82:iload_3         
		//   46   83:iadd            
		//   47   84:putfield        #67  <Field int pointIndex>
			return ((int) (byte0));
		//   48   87:iload_2         
		//   49   88:ireturn         
		}

		public int getWindingRule()
		{
			return p.getWindingRule();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field GeneralPath p>
		//    2    4:invokevirtual   #87  <Method int GeneralPath.getWindingRule()>
		//    3    7:ireturn         
		}

		public boolean isDone()
		{
			return typeIndex >= p.typeSize;
		//    0    0:aload_0         
		//    1    1:getfield        #57  <Field int typeIndex>
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field GeneralPath p>
		//    4    8:getfield        #90  <Field int GeneralPath.typeSize>
		//    5   11:icmplt          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public void next()
		{
			typeIndex = typeIndex + 1;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #57  <Field int typeIndex>
		//    3    5:iconst_1        
		//    4    6:iadd            
		//    5    7:putfield        #57  <Field int typeIndex>
		//    6   10:return          
		}

		GeneralPath p;
		int pointIndex;
		AffineTransform t;
		final GeneralPath this$0;
		int typeIndex;

		Iterator(GeneralPath generalpath1)
		{
			this(generalpath1, ((AffineTransform) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aconst_null     
		//    4    4:invokespecial   #22  <Method void GeneralPath$Iterator(GeneralPath, GeneralPath, AffineTransform)>
		//    5    7:return          
		}

		Iterator(GeneralPath generalpath1, AffineTransform affinetransform)
		{
			this$0 = GeneralPath.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field GeneralPath this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void Object()>
			p = generalpath1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field GeneralPath p>
			t = affinetransform;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #32  <Field AffineTransform t>
		//   11   19:return          
		}
	}


	public GeneralPath()
	{
		this(1, 10);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:bipush          10
	//    3    4:invokespecial   #37  <Method void GeneralPath(int, int)>
	//    4    7:return          
	}

	public GeneralPath(int i)
	{
		this(i, 10);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          10
	//    3    4:invokespecial   #37  <Method void GeneralPath(int, int)>
	//    4    7:return          
	}

	public GeneralPath(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		setWindingRule(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #43  <Method void setWindingRule(int)>
		types = new byte[j];
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:newarray        byte[]
	//    8   13:putfield        #45  <Field byte[] types>
		points = new float[j * 2];
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:iconst_2        
	//   12   19:imul            
	//   13   20:newarray        float[]
	//   14   22:putfield        #47  <Field float[] points>
	//   15   25:return          
	}

	public GeneralPath(Shape shape)
	{
		this(1, 10);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:bipush          10
	//    3    4:invokespecial   #37  <Method void GeneralPath(int, int)>
		shape = ((Shape) (shape.getPathIterator(((AffineTransform) (null)))));
	//    4    7:aload_1         
	//    5    8:aconst_null     
	//    6    9:invokeinterface #52  <Method PathIterator Shape.getPathIterator(AffineTransform)>
	//    7   14:astore_1        
		setWindingRule(((PathIterator) (shape)).getWindingRule());
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokeinterface #58  <Method int PathIterator.getWindingRule()>
	//   11   22:invokevirtual   #43  <Method void setWindingRule(int)>
		append(((PathIterator) (shape)), false);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #62  <Method void append(PathIterator, boolean)>
	//   16   31:return          
	}

	public void append(PathIterator pathiterator, boolean flag)
	{
_L7:
		float af[];
		if(pathiterator.isDone())
			break MISSING_BLOCK_LABEL_206;
	//    0    0:aload_1         
	//    1    1:invokeinterface #66  <Method boolean PathIterator.isDone()>
	//    2    6:ifne            206
		af = new float[6];
	//    3    9:bipush          6
	//    4   11:newarray        float[]
	//    5   13:astore_3        
		pathiterator.currentSegment(af);
	//    6   14:aload_1         
	//    7   15:aload_3         
	//    8   16:invokeinterface #70  <Method int PathIterator.currentSegment(float[])>
		JVM INSTR tableswitch 0 4: default 56
	//	               0 67
	//	               1 142
	//	               2 155
	//	               3 174
	//	               4 199;
	//    9   21:tableswitch     0 4: default 56
	//	               0 67
	//	               1 142
	//	               2 155
	//	               3 174
	//	               4 199
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		break; /* Loop/switch isn't completed */
_L6:
		break MISSING_BLOCK_LABEL_199;
_L10:
		pathiterator.next();
	//   10   56:aload_1         
	//   11   57:invokeinterface #73  <Method void PathIterator.next()>
		flag = false;
	//   12   62:iconst_0        
	//   13   63:istore_2        
		  goto _L7
	//*  14   64:goto            0
_L2:
		if(flag && typeSize != 0) goto _L9; else goto _L8
	//   15   67:iload_2         
	//   16   68:ifeq            78
	//   17   71:aload_0         
	//   18   72:getfield        #75  <Field int typeSize>
	//   19   75:ifne            91
_L8:
		moveTo(af[0], af[1]);
	//   20   78:aload_0         
	//   21   79:aload_3         
	//   22   80:iconst_0        
	//   23   81:faload          
	//   24   82:aload_3         
	//   25   83:iconst_1        
	//   26   84:faload          
	//   27   85:invokevirtual   #79  <Method void moveTo(float, float)>
		  goto _L10
	//*  28   88:goto            56
_L9:
		if(types[typeSize - 1] != 4 && points[pointSize - 2] == af[0] && points[pointSize - 1] == af[1]) goto _L10; else goto _L3
	//   29   91:aload_0         
	//   30   92:getfield        #45  <Field byte[] types>
	//   31   95:aload_0         
	//   32   96:getfield        #75  <Field int typeSize>
	//   33   99:iconst_1        
	//   34  100:isub            
	//   35  101:baload          
	//   36  102:iconst_4        
	//   37  103:icmpeq          142
	//   38  106:aload_0         
	//   39  107:getfield        #47  <Field float[] points>
	//   40  110:aload_0         
	//   41  111:getfield        #81  <Field int pointSize>
	//   42  114:iconst_2        
	//   43  115:isub            
	//   44  116:faload          
	//   45  117:aload_3         
	//   46  118:iconst_0        
	//   47  119:faload          
	//   48  120:fcmpl           
	//   49  121:ifne            142
	//   50  124:aload_0         
	//   51  125:getfield        #47  <Field float[] points>
	//   52  128:aload_0         
	//   53  129:getfield        #81  <Field int pointSize>
	//   54  132:iconst_1        
	//   55  133:isub            
	//   56  134:faload          
	//   57  135:aload_3         
	//   58  136:iconst_1        
	//   59  137:faload          
	//   60  138:fcmpl           
	//   61  139:ifeq            56
_L3:
		lineTo(af[0], af[1]);
	//   62  142:aload_0         
	//   63  143:aload_3         
	//   64  144:iconst_0        
	//   65  145:faload          
	//   66  146:aload_3         
	//   67  147:iconst_1        
	//   68  148:faload          
	//   69  149:invokevirtual   #84  <Method void lineTo(float, float)>
		  goto _L10
	//*  70  152:goto            56
_L4:
		quadTo(af[0], af[1], af[2], af[3]);
	//   71  155:aload_0         
	//   72  156:aload_3         
	//   73  157:iconst_0        
	//   74  158:faload          
	//   75  159:aload_3         
	//   76  160:iconst_1        
	//   77  161:faload          
	//   78  162:aload_3         
	//   79  163:iconst_2        
	//   80  164:faload          
	//   81  165:aload_3         
	//   82  166:iconst_3        
	//   83  167:faload          
	//   84  168:invokevirtual   #88  <Method void quadTo(float, float, float, float)>
		  goto _L10
	//*  85  171:goto            56
_L5:
		curveTo(af[0], af[1], af[2], af[3], af[4], af[5]);
	//   86  174:aload_0         
	//   87  175:aload_3         
	//   88  176:iconst_0        
	//   89  177:faload          
	//   90  178:aload_3         
	//   91  179:iconst_1        
	//   92  180:faload          
	//   93  181:aload_3         
	//   94  182:iconst_2        
	//   95  183:faload          
	//   96  184:aload_3         
	//   97  185:iconst_3        
	//   98  186:faload          
	//   99  187:aload_3         
	//  100  188:iconst_4        
	//  101  189:faload          
	//  102  190:aload_3         
	//  103  191:iconst_5        
	//  104  192:faload          
	//  105  193:invokevirtual   #92  <Method void curveTo(float, float, float, float, float, float)>
		  goto _L10
	//* 106  196:goto            56
		closePath();
	//  107  199:aload_0         
	//  108  200:invokevirtual   #95  <Method void closePath()>
		  goto _L10
	//* 109  203:goto            56
	//  110  206:return          
	}

	public void append(Shape shape, boolean flag)
	{
		append(shape.getPathIterator(((AffineTransform) (null))), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokeinterface #52  <Method PathIterator Shape.getPathIterator(AffineTransform)>
	//    4    8:iload_2         
	//    5    9:invokevirtual   #62  <Method void append(PathIterator, boolean)>
	//    6   12:return          
	}

	void checkBuf(int i, boolean flag)
	{
		if(flag && typeSize == 0)
	//*   0    0:iload_2         
	//*   1    1:ifeq            24
	//*   2    4:aload_0         
	//*   3    5:getfield        #75  <Field int typeSize>
	//*   4    8:ifne            24
			throw new IllegalPathStateException(Messages.getString("awt.20A"));
	//    5   11:new             #100 <Class IllegalPathStateException>
	//    6   14:dup             
	//    7   15:ldc1            #102 <String "awt.20A">
	//    8   17:invokestatic    #108 <Method String Messages.getString(String)>
	//    9   20:invokespecial   #111 <Method void IllegalPathStateException(String)>
	//   10   23:athrow          
		if(typeSize == types.length)
	//*  11   24:aload_0         
	//*  12   25:getfield        #75  <Field int typeSize>
	//*  13   28:aload_0         
	//*  14   29:getfield        #45  <Field byte[] types>
	//*  15   32:arraylength     
	//*  16   33:icmpne          65
		{
			byte abyte0[] = new byte[typeSize + 10];
	//   17   36:aload_0         
	//   18   37:getfield        #75  <Field int typeSize>
	//   19   40:bipush          10
	//   20   42:iadd            
	//   21   43:newarray        byte[]
	//   22   45:astore_3        
			System.arraycopy(((Object) (types)), 0, ((Object) (abyte0)), 0, typeSize);
	//   23   46:aload_0         
	//   24   47:getfield        #45  <Field byte[] types>
	//   25   50:iconst_0        
	//   26   51:aload_3         
	//   27   52:iconst_0        
	//   28   53:aload_0         
	//   29   54:getfield        #75  <Field int typeSize>
	//   30   57:invokestatic    #117 <Method void System.arraycopy(Object, int, Object, int, int)>
			types = abyte0;
	//   31   60:aload_0         
	//   32   61:aload_3         
	//   33   62:putfield        #45  <Field byte[] types>
		}
		if(pointSize + i > points.length)
	//*  34   65:aload_0         
	//*  35   66:getfield        #81  <Field int pointSize>
	//*  36   69:iload_1         
	//*  37   70:iadd            
	//*  38   71:aload_0         
	//*  39   72:getfield        #47  <Field float[] points>
	//*  40   75:arraylength     
	//*  41   76:icmple          112
		{
			float af[] = new float[pointSize + Math.max(20, i)];
	//   42   79:aload_0         
	//   43   80:getfield        #81  <Field int pointSize>
	//   44   83:bipush          20
	//   45   85:iload_1         
	//   46   86:invokestatic    #123 <Method int Math.max(int, int)>
	//   47   89:iadd            
	//   48   90:newarray        float[]
	//   49   92:astore_3        
			System.arraycopy(((Object) (points)), 0, ((Object) (af)), 0, pointSize);
	//   50   93:aload_0         
	//   51   94:getfield        #47  <Field float[] points>
	//   52   97:iconst_0        
	//   53   98:aload_3         
	//   54   99:iconst_0        
	//   55  100:aload_0         
	//   56  101:getfield        #81  <Field int pointSize>
	//   57  104:invokestatic    #117 <Method void System.arraycopy(Object, int, Object, int, int)>
			points = af;
	//   58  107:aload_0         
	//   59  108:aload_3         
	//   60  109:putfield        #47  <Field float[] points>
		}
	//   61  112:return          
	}

	public Object clone()
	{
		GeneralPath generalpath;
		try
		{
			generalpath = (GeneralPath)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class GeneralPath>
	//    3    7:astore_1        
			generalpath.types = (byte[])((byte []) (types)).clone();
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field byte[] types>
	//    7   13:invokevirtual   #131 <Method Object _5B_B.clone()>
	//    8   16:checkcast       #130 <Class byte[]>
	//    9   19:putfield        #45  <Field byte[] types>
			generalpath.points = (float[])((float []) (points)).clone();
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field float[] points>
	//   13   27:invokevirtual   #133 <Method Object _5B_F.clone()>
	//   14   30:checkcast       #132 <Class float[]>
	//   15   33:putfield        #47  <Field float[] points>
		}
	//*  16   36:aload_1         
	//*  17   37:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  18   38:astore_1        
		{
			throw new InternalError();
	//   19   39:new             #135 <Class InternalError>
	//   20   42:dup             
	//   21   43:invokespecial   #136 <Method void InternalError()>
	//   22   46:athrow          
		}
		return ((Object) (generalpath));
	}

	public void closePath()
	{
		if(typeSize == 0 || types[typeSize - 1] != 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int typeSize>
	//*   2    4:ifeq            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field byte[] types>
	//*   5   11:aload_0         
	//*   6   12:getfield        #75  <Field int typeSize>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:baload          
	//*  10   18:iconst_4        
	//*  11   19:icmpeq          49
		{
			checkBuf(0, true);
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:iconst_1        
	//   15   25:invokevirtual   #138 <Method void checkBuf(int, boolean)>
			byte abyte0[] = types;
	//   16   28:aload_0         
	//   17   29:getfield        #45  <Field byte[] types>
	//   18   32:astore_2        
			int i = typeSize;
	//   19   33:aload_0         
	//   20   34:getfield        #75  <Field int typeSize>
	//   21   37:istore_1        
			typeSize = i + 1;
	//   22   38:aload_0         
	//   23   39:iload_1         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:putfield        #75  <Field int typeSize>
			abyte0[i] = 4;
	//   27   45:aload_2         
	//   28   46:iload_1         
	//   29   47:iconst_4        
	//   30   48:bastore         
		}
	//   31   49:return          
	}

	public boolean contains(double d, double d1)
	{
		return isInside(Crossing.crossShape(((Shape) (this)), d, d1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:dload_1         
	//    3    3:dload_3         
	//    4    4:invokestatic    #146 <Method int Crossing.crossShape(Shape, double, double)>
	//    5    7:invokevirtual   #150 <Method boolean isInside(int)>
	//    6   10:ireturn         
	}

	public boolean contains(double d, double d1, double d2, double d3)
	{
		int i = Crossing.intersectShape(((Shape) (this)), d, d1, d2, d3);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dload           5
	//    4    5:dload           7
	//    5    7:invokestatic    #155 <Method int Crossing.intersectShape(Shape, double, double, double, double)>
	//    6   10:istore          9
		return i != 255 && isInside(i);
	//    7   12:iload           9
	//    8   14:sipush          255
	//    9   17:icmpeq          31
	//   10   20:aload_0         
	//   11   21:iload           9
	//   12   23:invokevirtual   #150 <Method boolean isInside(int)>
	//   13   26:ifeq            31
	//   14   29:iconst_1        
	//   15   30:ireturn         
	//   16   31:iconst_0        
	//   17   32:ireturn         
	}

	public boolean contains(Point2D point2d)
	{
		return contains(point2d.getX(), point2d.getY());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #162 <Method double Point2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #165 <Method double Point2D.getY()>
	//    5    9:invokevirtual   #167 <Method boolean contains(double, double)>
	//    6   12:ireturn         
	}

	public boolean contains(Rectangle2D rectangle2d)
	{
		return contains(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #172 <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #175 <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #178 <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #180 <Method boolean contains(double, double, double, double)>
	//   10   20:ireturn         
	}

	public Shape createTransformedShape(AffineTransform affinetransform)
	{
		GeneralPath generalpath = (GeneralPath)clone();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method Object clone()>
	//    2    4:checkcast       #2   <Class GeneralPath>
	//    3    7:astore_2        
		if(affinetransform != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			generalpath.transform(affinetransform);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #187 <Method void transform(AffineTransform)>
		return ((Shape) (generalpath));
	//    9   17:aload_2         
	//   10   18:areturn         
	}

	public void curveTo(float f, float f1, float f2, float f3, float f4, float f5)
	{
		checkBuf(6, true);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #138 <Method void checkBuf(int, boolean)>
		float af[] = ((float []) (types));
	//    4    7:aload_0         
	//    5    8:getfield        #45  <Field byte[] types>
	//    6   11:astore          8
		int i = typeSize;
	//    7   13:aload_0         
	//    8   14:getfield        #75  <Field int typeSize>
	//    9   17:istore          7
		typeSize = i + 1;
	//   10   19:aload_0         
	//   11   20:iload           7
	//   12   22:iconst_1        
	//   13   23:iadd            
	//   14   24:putfield        #75  <Field int typeSize>
		af[i] = 3;
	//   15   27:aload           8
	//   16   29:iload           7
	//   17   31:iconst_3        
	//   18   32:bastore         
		af = points;
	//   19   33:aload_0         
	//   20   34:getfield        #47  <Field float[] points>
	//   21   37:astore          8
		i = pointSize;
	//   22   39:aload_0         
	//   23   40:getfield        #81  <Field int pointSize>
	//   24   43:istore          7
		pointSize = i + 1;
	//   25   45:aload_0         
	//   26   46:iload           7
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:putfield        #81  <Field int pointSize>
		af[i] = f;
	//   30   53:aload           8
	//   31   55:iload           7
	//   32   57:fload_1         
	//   33   58:fastore         
		af = points;
	//   34   59:aload_0         
	//   35   60:getfield        #47  <Field float[] points>
	//   36   63:astore          8
		i = pointSize;
	//   37   65:aload_0         
	//   38   66:getfield        #81  <Field int pointSize>
	//   39   69:istore          7
		pointSize = i + 1;
	//   40   71:aload_0         
	//   41   72:iload           7
	//   42   74:iconst_1        
	//   43   75:iadd            
	//   44   76:putfield        #81  <Field int pointSize>
		af[i] = f1;
	//   45   79:aload           8
	//   46   81:iload           7
	//   47   83:fload_2         
	//   48   84:fastore         
		af = points;
	//   49   85:aload_0         
	//   50   86:getfield        #47  <Field float[] points>
	//   51   89:astore          8
		i = pointSize;
	//   52   91:aload_0         
	//   53   92:getfield        #81  <Field int pointSize>
	//   54   95:istore          7
		pointSize = i + 1;
	//   55   97:aload_0         
	//   56   98:iload           7
	//   57  100:iconst_1        
	//   58  101:iadd            
	//   59  102:putfield        #81  <Field int pointSize>
		af[i] = f2;
	//   60  105:aload           8
	//   61  107:iload           7
	//   62  109:fload_3         
	//   63  110:fastore         
		af = points;
	//   64  111:aload_0         
	//   65  112:getfield        #47  <Field float[] points>
	//   66  115:astore          8
		i = pointSize;
	//   67  117:aload_0         
	//   68  118:getfield        #81  <Field int pointSize>
	//   69  121:istore          7
		pointSize = i + 1;
	//   70  123:aload_0         
	//   71  124:iload           7
	//   72  126:iconst_1        
	//   73  127:iadd            
	//   74  128:putfield        #81  <Field int pointSize>
		af[i] = f3;
	//   75  131:aload           8
	//   76  133:iload           7
	//   77  135:fload           4
	//   78  137:fastore         
		af = points;
	//   79  138:aload_0         
	//   80  139:getfield        #47  <Field float[] points>
	//   81  142:astore          8
		i = pointSize;
	//   82  144:aload_0         
	//   83  145:getfield        #81  <Field int pointSize>
	//   84  148:istore          7
		pointSize = i + 1;
	//   85  150:aload_0         
	//   86  151:iload           7
	//   87  153:iconst_1        
	//   88  154:iadd            
	//   89  155:putfield        #81  <Field int pointSize>
		af[i] = f4;
	//   90  158:aload           8
	//   91  160:iload           7
	//   92  162:fload           5
	//   93  164:fastore         
		af = points;
	//   94  165:aload_0         
	//   95  166:getfield        #47  <Field float[] points>
	//   96  169:astore          8
		i = pointSize;
	//   97  171:aload_0         
	//   98  172:getfield        #81  <Field int pointSize>
	//   99  175:istore          7
		pointSize = i + 1;
	//  100  177:aload_0         
	//  101  178:iload           7
	//  102  180:iconst_1        
	//  103  181:iadd            
	//  104  182:putfield        #81  <Field int pointSize>
		af[i] = f5;
	//  105  185:aload           8
	//  106  187:iload           7
	//  107  189:fload           6
	//  108  191:fastore         
	//  109  192:return          
	}

	public Rectangle getBounds()
	{
		return getBounds2D().getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #193 <Method Rectangle2D getBounds2D()>
	//    2    4:invokevirtual   #195 <Method Rectangle Rectangle2D.getBounds()>
	//    3    7:areturn         
	}

	public Rectangle2D getBounds2D()
	{
		if(pointSize != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int pointSize>
	//    2    4:ifne            41
_L1:
		float f4;
		float f5;
		float f6;
		float f7;
		f4 = 0.0F;
	//    3    7:fconst_0        
	//    4    8:fstore          5
		f6 = 0.0F;
	//    5   10:fconst_0        
	//    6   11:fstore          7
		f5 = 0.0F;
	//    7   13:fconst_0        
	//    8   14:fstore          6
		f7 = 0.0F;
	//    9   16:fconst_0        
	//   10   17:fstore          8
_L4:
		return ((Rectangle2D) (new Rectangle2D.Float(f7, f5, f6 - f7, f4 - f5)));
	//   11   19:new             #197 <Class Rectangle2D$Float>
	//   12   22:dup             
	//   13   23:fload           8
	//   14   25:fload           6
	//   15   27:fload           7
	//   16   29:fload           8
	//   17   31:fsub            
	//   18   32:fload           5
	//   19   34:fload           6
	//   20   36:fsub            
	//   21   37:invokespecial   #199 <Method void Rectangle2D$Float(float, float, float, float)>
	//   22   40:areturn         
_L2:
		int i = pointSize - 1;
	//   23   41:aload_0         
	//   24   42:getfield        #81  <Field int pointSize>
	//   25   45:iconst_1        
	//   26   46:isub            
	//   27   47:istore          9
		float af[] = points;
	//   28   49:aload_0         
	//   29   50:getfield        #47  <Field float[] points>
	//   30   53:astore          12
		int j = i - 1;
	//   31   55:iload           9
	//   32   57:iconst_1        
	//   33   58:isub            
	//   34   59:istore          10
		float f = af[i];
	//   35   61:aload           12
	//   36   63:iload           9
	//   37   65:faload          
	//   38   66:fstore_1        
		float f1 = f;
	//   39   67:fload_1         
	//   40   68:fstore_2        
		float f2 = points[j];
	//   41   69:aload_0         
	//   42   70:getfield        #47  <Field float[] points>
	//   43   73:iload           10
	//   44   75:faload          
	//   45   76:fstore_3        
		float f3 = f2;
	//   46   77:fload_3         
	//   47   78:fstore          4
		i = j - 1;
	//   48   80:iload           10
	//   49   82:iconst_1        
	//   50   83:isub            
	//   51   84:istore          9
		do
		{
			f7 = f3;
	//   52   86:fload           4
	//   53   88:fstore          8
			f6 = f2;
	//   54   90:fload_3         
	//   55   91:fstore          7
			f5 = f1;
	//   56   93:fload_2         
	//   57   94:fstore          6
			f4 = f;
	//   58   96:fload_1         
	//   59   97:fstore          5
			if(i <= 0)
				continue;
	//   60   99:iload           9
	//   61  101:ifle            19
			float af1[] = points;
	//   62  104:aload_0         
	//   63  105:getfield        #47  <Field float[] points>
	//   64  108:astore          12
			int l = i - 1;
	//   65  110:iload           9
	//   66  112:iconst_1        
	//   67  113:isub            
	//   68  114:istore          11
			f6 = af1[i];
	//   69  116:aload           12
	//   70  118:iload           9
	//   71  120:faload          
	//   72  121:fstore          7
			af1 = points;
	//   73  123:aload_0         
	//   74  124:getfield        #47  <Field float[] points>
	//   75  127:astore          12
			int k = l - 1;
	//   76  129:iload           11
	//   77  131:iconst_1        
	//   78  132:isub            
	//   79  133:istore          10
			f7 = af1[l];
	//   80  135:aload           12
	//   81  137:iload           11
	//   82  139:faload          
	//   83  140:fstore          8
			if(f7 < f3)
	//*  84  142:fload           8
	//*  85  144:fload           4
	//*  86  146:fcmpg           
	//*  87  147:ifge            181
			{
				f4 = f7;
	//   88  150:fload           8
	//   89  152:fstore          5
				f5 = f2;
	//   90  154:fload_3         
	//   91  155:fstore          6
			} else
	//*  92  157:fload           7
	//*  93  159:fload_2         
	//*  94  160:fcmpg           
	//*  95  161:ifge            206
	//*  96  164:fload           7
	//*  97  166:fstore_2        
	//*  98  167:iload           10
	//*  99  169:istore          9
	//* 100  171:fload           5
	//* 101  173:fstore          4
	//* 102  175:fload           6
	//* 103  177:fstore_3        
	//* 104  178:goto            86
			{
				f4 = f3;
	//  105  181:fload           4
	//  106  183:fstore          5
				f5 = f2;
	//  107  185:fload_3         
	//  108  186:fstore          6
				if(f7 > f2)
	//* 109  188:fload           8
	//* 110  190:fload_3         
	//* 111  191:fcmpl           
	//* 112  192:ifle            157
				{
					f5 = f7;
	//  113  195:fload           8
	//  114  197:fstore          6
					f4 = f3;
	//  115  199:fload           4
	//  116  201:fstore          5
				}
			}
			if(f6 < f1)
			{
				f1 = f6;
				i = k;
				f3 = f4;
				f2 = f5;
			} else
	//* 117  203:goto            157
			{
				i = k;
	//  118  206:iload           10
	//  119  208:istore          9
				f3 = f4;
	//  120  210:fload           5
	//  121  212:fstore          4
				f2 = f5;
	//  122  214:fload           6
	//  123  216:fstore_3        
				if(f6 > f)
	//* 124  217:fload           7
	//* 125  219:fload_1         
	//* 126  220:fcmpl           
	//* 127  221:ifle            86
				{
					f = f6;
	//  128  224:fload           7
	//  129  226:fstore_1        
					i = k;
	//  130  227:iload           10
	//  131  229:istore          9
					f3 = f4;
	//  132  231:fload           5
	//  133  233:fstore          4
					f2 = f5;
	//  134  235:fload           6
	//  135  237:fstore_3        
				}
			}
		} while(true);
	//  136  238:goto            86
		if(true) goto _L4; else goto _L3
_L3:
	}

	public Point2D getCurrentPoint()
	{
		int i;
		int k;
		if(typeSize == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int typeSize>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		i = pointSize - 2;
	//    5    9:aload_0         
	//    6   10:getfield        #81  <Field int pointSize>
	//    7   13:iconst_2        
	//    8   14:isub            
	//    9   15:istore_1        
		k = i;
	//   10   16:iload_1         
	//   11   17:istore_3        
		if(types[typeSize - 1] != 4) goto _L2; else goto _L1
	//   12   18:aload_0         
	//   13   19:getfield        #45  <Field byte[] types>
	//   14   22:aload_0         
	//   15   23:getfield        #75  <Field int typeSize>
	//   16   26:iconst_1        
	//   17   27:isub            
	//   18   28:baload          
	//   19   29:iconst_4        
	//   20   30:icmpne          59
_L1:
		int j = typeSize - 2;
	//   21   33:aload_0         
	//   22   34:getfield        #75  <Field int typeSize>
	//   23   37:iconst_2        
	//   24   38:isub            
	//   25   39:istore_2        
_L7:
		k = i;
	//   26   40:iload_1         
	//   27   41:istore_3        
		if(j <= 0) goto _L2; else goto _L3
	//   28   42:iload_2         
	//   29   43:ifle            59
_L3:
		k = ((int) (types[j]));
	//   30   46:aload_0         
	//   31   47:getfield        #45  <Field byte[] types>
	//   32   50:iload_2         
	//   33   51:baload          
	//   34   52:istore_3        
		if(k != 0) goto _L5; else goto _L4
	//   35   53:iload_3         
	//   36   54:ifne            81
_L4:
		k = i;
	//   37   57:iload_1         
	//   38   58:istore_3        
_L2:
		return ((Point2D) (new Point2D.Float(points[k], points[k + 1])));
	//   39   59:new             #203 <Class Point2D$Float>
	//   40   62:dup             
	//   41   63:aload_0         
	//   42   64:getfield        #47  <Field float[] points>
	//   43   67:iload_3         
	//   44   68:faload          
	//   45   69:aload_0         
	//   46   70:getfield        #47  <Field float[] points>
	//   47   73:iload_3         
	//   48   74:iconst_1        
	//   49   75:iadd            
	//   50   76:faload          
	//   51   77:invokespecial   #205 <Method void Point2D$Float(float, float)>
	//   52   80:areturn         
_L5:
		i -= pointShift[k];
	//   53   81:iload_1         
	//   54   82:getstatic       #32  <Field int[] pointShift>
	//   55   85:iload_3         
	//   56   86:iaload          
	//   57   87:isub            
	//   58   88:istore_1        
		j--;
	//   59   89:iload_2         
	//   60   90:iconst_1        
	//   61   91:isub            
	//   62   92:istore_2        
		if(true) goto _L7; else goto _L6
	//   63   93:goto            40
_L6:
	}

	public PathIterator getPathIterator(AffineTransform affinetransform)
	{
		return ((PathIterator) (new Iterator(this, affinetransform)));
	//    0    0:new             #10  <Class GeneralPath$Iterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #208 <Method void GeneralPath$Iterator(GeneralPath, GeneralPath, AffineTransform)>
	//    6   10:areturn         
	}

	public PathIterator getPathIterator(AffineTransform affinetransform, double d)
	{
		return ((PathIterator) (new FlatteningPathIterator(getPathIterator(affinetransform), d)));
	//    0    0:new             #211 <Class FlatteningPathIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #212 <Method PathIterator getPathIterator(AffineTransform)>
	//    5    9:dload_2         
	//    6   10:invokespecial   #215 <Method void FlatteningPathIterator(PathIterator, double)>
	//    7   13:areturn         
	}

	public int getWindingRule()
	{
		return rule;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field int rule>
	//    2    4:ireturn         
	}

	public boolean intersects(double d, double d1, double d2, double d3)
	{
		int i = Crossing.intersectShape(((Shape) (this)), d, d1, d2, d3);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:dload_3         
	//    3    3:dload           5
	//    4    5:dload           7
	//    5    7:invokestatic    #155 <Method int Crossing.intersectShape(Shape, double, double, double, double)>
	//    6   10:istore          9
		return i == 255 || isInside(i);
	//    7   12:iload           9
	//    8   14:sipush          255
	//    9   17:icmpeq          29
	//   10   20:aload_0         
	//   11   21:iload           9
	//   12   23:invokevirtual   #150 <Method boolean isInside(int)>
	//   13   26:ifeq            31
	//   14   29:iconst_1        
	//   15   30:ireturn         
	//   16   31:iconst_0        
	//   17   32:ireturn         
	}

	public boolean intersects(Rectangle2D rectangle2d)
	{
		return intersects(rectangle2d.getX(), rectangle2d.getY(), rectangle2d.getWidth(), rectangle2d.getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #171 <Method double Rectangle2D.getX()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #172 <Method double Rectangle2D.getY()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #175 <Method double Rectangle2D.getWidth()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #178 <Method double Rectangle2D.getHeight()>
	//    9   17:invokevirtual   #220 <Method boolean intersects(double, double, double, double)>
	//   10   20:ireturn         
	}

	boolean isInside(int i)
	{
		if(rule == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field int rule>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return Crossing.isInsideNonZero(i);
	//    4    8:iload_1         
	//    5    9:invokestatic    #223 <Method boolean Crossing.isInsideNonZero(int)>
	//    6   12:ireturn         
		else
			return Crossing.isInsideEvenOdd(i);
	//    7   13:iload_1         
	//    8   14:invokestatic    #226 <Method boolean Crossing.isInsideEvenOdd(int)>
	//    9   17:ireturn         
	}

	public void lineTo(float f, float f1)
	{
		checkBuf(2, true);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #138 <Method void checkBuf(int, boolean)>
		float af[] = ((float []) (types));
	//    4    6:aload_0         
	//    5    7:getfield        #45  <Field byte[] types>
	//    6   10:astore          4
		int i = typeSize;
	//    7   12:aload_0         
	//    8   13:getfield        #75  <Field int typeSize>
	//    9   16:istore_3        
		typeSize = i + 1;
	//   10   17:aload_0         
	//   11   18:iload_3         
	//   12   19:iconst_1        
	//   13   20:iadd            
	//   14   21:putfield        #75  <Field int typeSize>
		af[i] = 1;
	//   15   24:aload           4
	//   16   26:iload_3         
	//   17   27:iconst_1        
	//   18   28:bastore         
		af = points;
	//   19   29:aload_0         
	//   20   30:getfield        #47  <Field float[] points>
	//   21   33:astore          4
		i = pointSize;
	//   22   35:aload_0         
	//   23   36:getfield        #81  <Field int pointSize>
	//   24   39:istore_3        
		pointSize = i + 1;
	//   25   40:aload_0         
	//   26   41:iload_3         
	//   27   42:iconst_1        
	//   28   43:iadd            
	//   29   44:putfield        #81  <Field int pointSize>
		af[i] = f;
	//   30   47:aload           4
	//   31   49:iload_3         
	//   32   50:fload_1         
	//   33   51:fastore         
		af = points;
	//   34   52:aload_0         
	//   35   53:getfield        #47  <Field float[] points>
	//   36   56:astore          4
		i = pointSize;
	//   37   58:aload_0         
	//   38   59:getfield        #81  <Field int pointSize>
	//   39   62:istore_3        
		pointSize = i + 1;
	//   40   63:aload_0         
	//   41   64:iload_3         
	//   42   65:iconst_1        
	//   43   66:iadd            
	//   44   67:putfield        #81  <Field int pointSize>
		af[i] = f1;
	//   45   70:aload           4
	//   46   72:iload_3         
	//   47   73:fload_2         
	//   48   74:fastore         
	//   49   75:return          
	}

	public void moveTo(float f, float f1)
	{
		if(typeSize > 0 && types[typeSize - 1] == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int typeSize>
	//*   2    4:ifle            46
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field byte[] types>
	//*   5   11:aload_0         
	//*   6   12:getfield        #75  <Field int typeSize>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:baload          
	//*  10   18:ifne            46
		{
			points[pointSize - 2] = f;
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field float[] points>
	//   13   25:aload_0         
	//   14   26:getfield        #81  <Field int pointSize>
	//   15   29:iconst_2        
	//   16   30:isub            
	//   17   31:fload_1         
	//   18   32:fastore         
			points[pointSize - 1] = f1;
	//   19   33:aload_0         
	//   20   34:getfield        #47  <Field float[] points>
	//   21   37:aload_0         
	//   22   38:getfield        #81  <Field int pointSize>
	//   23   41:iconst_1        
	//   24   42:isub            
	//   25   43:fload_2         
	//   26   44:fastore         
			return;
	//   27   45:return          
		} else
		{
			checkBuf(2, false);
	//   28   46:aload_0         
	//   29   47:iconst_2        
	//   30   48:iconst_0        
	//   31   49:invokevirtual   #138 <Method void checkBuf(int, boolean)>
			float af[] = ((float []) (types));
	//   32   52:aload_0         
	//   33   53:getfield        #45  <Field byte[] types>
	//   34   56:astore          4
			int i = typeSize;
	//   35   58:aload_0         
	//   36   59:getfield        #75  <Field int typeSize>
	//   37   62:istore_3        
			typeSize = i + 1;
	//   38   63:aload_0         
	//   39   64:iload_3         
	//   40   65:iconst_1        
	//   41   66:iadd            
	//   42   67:putfield        #75  <Field int typeSize>
			af[i] = 0;
	//   43   70:aload           4
	//   44   72:iload_3         
	//   45   73:iconst_0        
	//   46   74:bastore         
			af = points;
	//   47   75:aload_0         
	//   48   76:getfield        #47  <Field float[] points>
	//   49   79:astore          4
			i = pointSize;
	//   50   81:aload_0         
	//   51   82:getfield        #81  <Field int pointSize>
	//   52   85:istore_3        
			pointSize = i + 1;
	//   53   86:aload_0         
	//   54   87:iload_3         
	//   55   88:iconst_1        
	//   56   89:iadd            
	//   57   90:putfield        #81  <Field int pointSize>
			af[i] = f;
	//   58   93:aload           4
	//   59   95:iload_3         
	//   60   96:fload_1         
	//   61   97:fastore         
			af = points;
	//   62   98:aload_0         
	//   63   99:getfield        #47  <Field float[] points>
	//   64  102:astore          4
			i = pointSize;
	//   65  104:aload_0         
	//   66  105:getfield        #81  <Field int pointSize>
	//   67  108:istore_3        
			pointSize = i + 1;
	//   68  109:aload_0         
	//   69  110:iload_3         
	//   70  111:iconst_1        
	//   71  112:iadd            
	//   72  113:putfield        #81  <Field int pointSize>
			af[i] = f1;
	//   73  116:aload           4
	//   74  118:iload_3         
	//   75  119:fload_2         
	//   76  120:fastore         
			return;
	//   77  121:return          
		}
	}

	public void quadTo(float f, float f1, float f2, float f3)
	{
		checkBuf(4, true);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #138 <Method void checkBuf(int, boolean)>
		float af[] = ((float []) (types));
	//    4    6:aload_0         
	//    5    7:getfield        #45  <Field byte[] types>
	//    6   10:astore          6
		int i = typeSize;
	//    7   12:aload_0         
	//    8   13:getfield        #75  <Field int typeSize>
	//    9   16:istore          5
		typeSize = i + 1;
	//   10   18:aload_0         
	//   11   19:iload           5
	//   12   21:iconst_1        
	//   13   22:iadd            
	//   14   23:putfield        #75  <Field int typeSize>
		af[i] = 2;
	//   15   26:aload           6
	//   16   28:iload           5
	//   17   30:iconst_2        
	//   18   31:bastore         
		af = points;
	//   19   32:aload_0         
	//   20   33:getfield        #47  <Field float[] points>
	//   21   36:astore          6
		i = pointSize;
	//   22   38:aload_0         
	//   23   39:getfield        #81  <Field int pointSize>
	//   24   42:istore          5
		pointSize = i + 1;
	//   25   44:aload_0         
	//   26   45:iload           5
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:putfield        #81  <Field int pointSize>
		af[i] = f;
	//   30   52:aload           6
	//   31   54:iload           5
	//   32   56:fload_1         
	//   33   57:fastore         
		af = points;
	//   34   58:aload_0         
	//   35   59:getfield        #47  <Field float[] points>
	//   36   62:astore          6
		i = pointSize;
	//   37   64:aload_0         
	//   38   65:getfield        #81  <Field int pointSize>
	//   39   68:istore          5
		pointSize = i + 1;
	//   40   70:aload_0         
	//   41   71:iload           5
	//   42   73:iconst_1        
	//   43   74:iadd            
	//   44   75:putfield        #81  <Field int pointSize>
		af[i] = f1;
	//   45   78:aload           6
	//   46   80:iload           5
	//   47   82:fload_2         
	//   48   83:fastore         
		af = points;
	//   49   84:aload_0         
	//   50   85:getfield        #47  <Field float[] points>
	//   51   88:astore          6
		i = pointSize;
	//   52   90:aload_0         
	//   53   91:getfield        #81  <Field int pointSize>
	//   54   94:istore          5
		pointSize = i + 1;
	//   55   96:aload_0         
	//   56   97:iload           5
	//   57   99:iconst_1        
	//   58  100:iadd            
	//   59  101:putfield        #81  <Field int pointSize>
		af[i] = f2;
	//   60  104:aload           6
	//   61  106:iload           5
	//   62  108:fload_3         
	//   63  109:fastore         
		af = points;
	//   64  110:aload_0         
	//   65  111:getfield        #47  <Field float[] points>
	//   66  114:astore          6
		i = pointSize;
	//   67  116:aload_0         
	//   68  117:getfield        #81  <Field int pointSize>
	//   69  120:istore          5
		pointSize = i + 1;
	//   70  122:aload_0         
	//   71  123:iload           5
	//   72  125:iconst_1        
	//   73  126:iadd            
	//   74  127:putfield        #81  <Field int pointSize>
		af[i] = f3;
	//   75  130:aload           6
	//   76  132:iload           5
	//   77  134:fload           4
	//   78  136:fastore         
	//   79  137:return          
	}

	public void reset()
	{
		typeSize = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #75  <Field int typeSize>
		pointSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #81  <Field int pointSize>
	//    6   10:return          
	}

	public void setWindingRule(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            22
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          22
		{
			throw new IllegalArgumentException(Messages.getString("awt.209"));
	//    5    9:new             #229 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #231 <String "awt.209">
	//    8   15:invokestatic    #108 <Method String Messages.getString(String)>
	//    9   18:invokespecial   #232 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		} else
		{
			rule = i;
	//   11   22:aload_0         
	//   12   23:iload_1         
	//   13   24:putfield        #217 <Field int rule>
			return;
	//   14   27:return          
		}
	}

	public void transform(AffineTransform affinetransform)
	{
		affinetransform.transform(points, 0, points, 0, pointSize / 2);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field float[] points>
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field float[] points>
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:getfield        #81  <Field int pointSize>
	//    9   15:iconst_2        
	//   10   16:idiv            
	//   11   17:invokevirtual   #237 <Method void AffineTransform.transform(float[], int, float[], int, int)>
	//   12   20:return          
	}

	private static final int BUFFER_CAPACITY = 10;
	private static final int BUFFER_SIZE = 10;
	public static final int WIND_EVEN_ODD = 0;
	public static final int WIND_NON_ZERO = 1;
	static int pointShift[] = {
		2, 2, 4, 6, 0
	};
	int pointSize;
	float points[];
	int rule;
	int typeSize;
	byte types[];

	static 
	{
	//    0    0:iconst_5        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_2        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_2        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:iconst_4        
	//   13   14:iastore         
	//   14   15:dup             
	//   15   16:iconst_3        
	//   16   17:bipush          6
	//   17   19:iastore         
	//   18   20:dup             
	//   19   21:iconst_4        
	//   20   22:iconst_0        
	//   21   23:iastore         
	//   22   24:putstatic       #32  <Field int[] pointShift>
	//*  23   27:return          
	}
}
