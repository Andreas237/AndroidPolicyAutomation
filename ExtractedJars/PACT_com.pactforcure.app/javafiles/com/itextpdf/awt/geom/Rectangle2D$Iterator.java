// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;

import com.itextpdf.awt.geom.misc.Messages;
import java.util.NoSuchElementException;

// Referenced classes of package com.itextpdf.awt.geom:
//			PathIterator, Rectangle2D, AffineTransform

class Rectangle2D$Iterator
	implements PathIterator
{

	public int currentSegment(double ad[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #59  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #61  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #63  <String "awt.4B">
	//    6   13:invokestatic    #69  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #72  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		if(index != 5) goto _L2; else goto _L1
	//    9   20:aload_0         
	//   10   21:getfield        #52  <Field int index>
	//   11   24:iconst_5        
	//   12   25:icmpne          32
_L1:
		int j = 4;
	//   13   28:iconst_4        
	//   14   29:istore_3        
_L4:
		return j;
	//   15   30:iload_3         
	//   16   31:ireturn         
_L2:
		int i;
		if(index != 0)
			break; /* Loop/switch isn't completed */
	//   17   32:aload_0         
	//   18   33:getfield        #52  <Field int index>
	//   19   36:ifne            78
		i = 0;
	//   20   39:iconst_0        
	//   21   40:istore_2        
		ad[0] = x;
	//   22   41:aload_1         
	//   23   42:iconst_0        
	//   24   43:aload_0         
	//   25   44:getfield        #33  <Field double x>
	//   26   47:dastore         
		ad[1] = y;
	//   27   48:aload_1         
	//   28   49:iconst_1        
	//   29   50:aload_0         
	//   30   51:getfield        #38  <Field double y>
	//   31   54:dastore         
_L6:
		j = i;
	//   32   55:iload_2         
	//   33   56:istore_3        
		if(t != null)
	//*  34   57:aload_0         
	//*  35   58:getfield        #50  <Field AffineTransform t>
	//*  36   61:ifnull          30
		{
			t.transform(ad, 0, ad, 0, 1);
	//   37   64:aload_0         
	//   38   65:getfield        #50  <Field AffineTransform t>
	//   39   68:aload_1         
	//   40   69:iconst_0        
	//   41   70:aload_1         
	//   42   71:iconst_0        
	//   43   72:iconst_1        
	//   44   73:invokevirtual   #78  <Method void AffineTransform.transform(double[], int, double[], int, int)>
			return i;
	//   45   76:iload_2         
	//   46   77:ireturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		i = 1;
	//   47   78:iconst_1        
	//   48   79:istore_2        
		switch(index)
	//*  49   80:aload_0         
	//*  50   81:getfield        #52  <Field int index>
		{
	//*  51   84:tableswitch     1 4: default 116
	//	               1 119
	//	               2 141
	//	               3 168
	//	               4 190
	//*  52  116:goto            55
		case 1: // '\001'
			ad[0] = x + width;
	//   53  119:aload_1         
	//   54  120:iconst_0        
	//   55  121:aload_0         
	//   56  122:getfield        #33  <Field double x>
	//   57  125:aload_0         
	//   58  126:getfield        #43  <Field double width>
	//   59  129:dadd            
	//   60  130:dastore         
			ad[1] = y;
	//   61  131:aload_1         
	//   62  132:iconst_1        
	//   63  133:aload_0         
	//   64  134:getfield        #38  <Field double y>
	//   65  137:dastore         
			break;

	//*  66  138:goto            55
		case 2: // '\002'
			ad[0] = x + width;
	//   67  141:aload_1         
	//   68  142:iconst_0        
	//   69  143:aload_0         
	//   70  144:getfield        #33  <Field double x>
	//   71  147:aload_0         
	//   72  148:getfield        #43  <Field double width>
	//   73  151:dadd            
	//   74  152:dastore         
			ad[1] = y + height;
	//   75  153:aload_1         
	//   76  154:iconst_1        
	//   77  155:aload_0         
	//   78  156:getfield        #38  <Field double y>
	//   79  159:aload_0         
	//   80  160:getfield        #48  <Field double height>
	//   81  163:dadd            
	//   82  164:dastore         
			break;

	//*  83  165:goto            55
		case 3: // '\003'
			ad[0] = x;
	//   84  168:aload_1         
	//   85  169:iconst_0        
	//   86  170:aload_0         
	//   87  171:getfield        #33  <Field double x>
	//   88  174:dastore         
			ad[1] = y + height;
	//   89  175:aload_1         
	//   90  176:iconst_1        
	//   91  177:aload_0         
	//   92  178:getfield        #38  <Field double y>
	//   93  181:aload_0         
	//   94  182:getfield        #48  <Field double height>
	//   95  185:dadd            
	//   96  186:dastore         
			break;

	//*  97  187:goto            55
		case 4: // '\004'
			ad[0] = x;
	//   98  190:aload_1         
	//   99  191:iconst_0        
	//  100  192:aload_0         
	//  101  193:getfield        #33  <Field double x>
	//  102  196:dastore         
			ad[1] = y;
	//  103  197:aload_1         
	//  104  198:iconst_1        
	//  105  199:aload_0         
	//  106  200:getfield        #38  <Field double y>
	//  107  203:dastore         
			break;
		}
		if(true) goto _L6; else goto _L5
_L5:
	//* 108  204:goto            55
	}

	public int currentSegment(float af[])
	{
		if(isDone())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #59  <Method boolean isDone()>
	//*   2    4:ifeq            20
			throw new NoSuchElementException(Messages.getString("awt.4B"));
	//    3    7:new             #61  <Class NoSuchElementException>
	//    4   10:dup             
	//    5   11:ldc1            #63  <String "awt.4B">
	//    6   13:invokestatic    #69  <Method String Messages.getString(String)>
	//    7   16:invokespecial   #72  <Method void NoSuchElementException(String)>
	//    8   19:athrow          
		if(index != 5) goto _L2; else goto _L1
	//    9   20:aload_0         
	//   10   21:getfield        #52  <Field int index>
	//   11   24:iconst_5        
	//   12   25:icmpne          32
_L1:
		int j = 4;
	//   13   28:iconst_4        
	//   14   29:istore_3        
_L4:
		return j;
	//   15   30:iload_3         
	//   16   31:ireturn         
_L2:
		int i;
		if(index != 0)
			break; /* Loop/switch isn't completed */
	//   17   32:aload_0         
	//   18   33:getfield        #52  <Field int index>
	//   19   36:ifne            80
		af[0] = (float)x;
	//   20   39:aload_1         
	//   21   40:iconst_0        
	//   22   41:aload_0         
	//   23   42:getfield        #33  <Field double x>
	//   24   45:d2f             
	//   25   46:fastore         
		af[1] = (float)y;
	//   26   47:aload_1         
	//   27   48:iconst_1        
	//   28   49:aload_0         
	//   29   50:getfield        #38  <Field double y>
	//   30   53:d2f             
	//   31   54:fastore         
		i = 0;
	//   32   55:iconst_0        
	//   33   56:istore_2        
_L6:
		j = i;
	//   34   57:iload_2         
	//   35   58:istore_3        
		if(t != null)
	//*  36   59:aload_0         
	//*  37   60:getfield        #50  <Field AffineTransform t>
	//*  38   63:ifnull          30
		{
			t.transform(af, 0, af, 0, 1);
	//   39   66:aload_0         
	//   40   67:getfield        #50  <Field AffineTransform t>
	//   41   70:aload_1         
	//   42   71:iconst_0        
	//   43   72:aload_1         
	//   44   73:iconst_0        
	//   45   74:iconst_1        
	//   46   75:invokevirtual   #82  <Method void AffineTransform.transform(float[], int, float[], int, int)>
			return i;
	//   47   78:iload_2         
	//   48   79:ireturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		i = 1;
	//   49   80:iconst_1        
	//   50   81:istore_2        
		switch(index)
	//*  51   82:aload_0         
	//*  52   83:getfield        #52  <Field int index>
		{
	//*  53   86:tableswitch     1 4: default 116
	//	               1 119
	//	               2 143
	//	               3 172
	//	               4 196
	//*  54  116:goto            57
		case 1: // '\001'
			af[0] = (float)(x + width);
	//   55  119:aload_1         
	//   56  120:iconst_0        
	//   57  121:aload_0         
	//   58  122:getfield        #33  <Field double x>
	//   59  125:aload_0         
	//   60  126:getfield        #43  <Field double width>
	//   61  129:dadd            
	//   62  130:d2f             
	//   63  131:fastore         
			af[1] = (float)y;
	//   64  132:aload_1         
	//   65  133:iconst_1        
	//   66  134:aload_0         
	//   67  135:getfield        #38  <Field double y>
	//   68  138:d2f             
	//   69  139:fastore         
			break;

	//*  70  140:goto            57
		case 2: // '\002'
			af[0] = (float)(x + width);
	//   71  143:aload_1         
	//   72  144:iconst_0        
	//   73  145:aload_0         
	//   74  146:getfield        #33  <Field double x>
	//   75  149:aload_0         
	//   76  150:getfield        #43  <Field double width>
	//   77  153:dadd            
	//   78  154:d2f             
	//   79  155:fastore         
			af[1] = (float)(y + height);
	//   80  156:aload_1         
	//   81  157:iconst_1        
	//   82  158:aload_0         
	//   83  159:getfield        #38  <Field double y>
	//   84  162:aload_0         
	//   85  163:getfield        #48  <Field double height>
	//   86  166:dadd            
	//   87  167:d2f             
	//   88  168:fastore         
			break;

	//*  89  169:goto            57
		case 3: // '\003'
			af[0] = (float)x;
	//   90  172:aload_1         
	//   91  173:iconst_0        
	//   92  174:aload_0         
	//   93  175:getfield        #33  <Field double x>
	//   94  178:d2f             
	//   95  179:fastore         
			af[1] = (float)(y + height);
	//   96  180:aload_1         
	//   97  181:iconst_1        
	//   98  182:aload_0         
	//   99  183:getfield        #38  <Field double y>
	//  100  186:aload_0         
	//  101  187:getfield        #48  <Field double height>
	//  102  190:dadd            
	//  103  191:d2f             
	//  104  192:fastore         
			break;

	//* 105  193:goto            57
		case 4: // '\004'
			af[0] = (float)x;
	//  106  196:aload_1         
	//  107  197:iconst_0        
	//  108  198:aload_0         
	//  109  199:getfield        #33  <Field double x>
	//  110  202:d2f             
	//  111  203:fastore         
			af[1] = (float)y;
	//  112  204:aload_1         
	//  113  205:iconst_1        
	//  114  206:aload_0         
	//  115  207:getfield        #38  <Field double y>
	//  116  210:d2f             
	//  117  211:fastore         
			break;
		}
		if(true) goto _L6; else goto _L5
_L5:
	//* 118  212:goto            57
	}

	public int getWindingRule()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isDone()
	{
		return index > 5;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int index>
	//    2    4:iconst_5        
	//    3    5:icmple          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void next()
	{
		index = index + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field int index>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #52  <Field int index>
	//    6   10:return          
	}

	double height;
	int index;
	AffineTransform t;
	final Rectangle2D this$0;
	double width;
	double x;
	double y;

	Rectangle2D$Iterator(Rectangle2D rectangle2d1, AffineTransform affinetransform)
	{
		this$0 = Rectangle2D.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Rectangle2D this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void Object()>
		x = rectangle2d1.getX();
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #31  <Method double Rectangle2D.getX()>
	//    8   14:putfield        #33  <Field double x>
		y = rectangle2d1.getY();
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #36  <Method double Rectangle2D.getY()>
	//   12   22:putfield        #38  <Field double y>
		width = rectangle2d1.getWidth();
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #41  <Method double Rectangle2D.getWidth()>
	//   16   30:putfield        #43  <Field double width>
		height = rectangle2d1.getHeight();
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #46  <Method double Rectangle2D.getHeight()>
	//   20   38:putfield        #48  <Field double height>
		t = affinetransform;
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:putfield        #50  <Field AffineTransform t>
		if(width < 0.0D || height < 0.0D)
	//*  24   46:aload_0         
	//*  25   47:getfield        #43  <Field double width>
	//*  26   50:dconst_0        
	//*  27   51:dcmpg           
	//*  28   52:iflt            64
	//*  29   55:aload_0         
	//*  30   56:getfield        #48  <Field double height>
	//*  31   59:dconst_0        
	//*  32   60:dcmpg           
	//*  33   61:ifge            70
			index = 6;
	//   34   64:aload_0         
	//   35   65:bipush          6
	//   36   67:putfield        #52  <Field int index>
	//   37   70:return          
	}
}
