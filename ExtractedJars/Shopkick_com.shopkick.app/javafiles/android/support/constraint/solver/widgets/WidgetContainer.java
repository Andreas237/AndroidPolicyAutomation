// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.Cache;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget, Rectangle, ConstraintWidgetContainer

public class WidgetContainer extends ConstraintWidget
{

	public WidgetContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ConstraintWidget()>
		mChildren = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field ArrayList mChildren>
	//    7   15:return          
	}

	public WidgetContainer(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #20  <Method void ConstraintWidget(int, int)>
		mChildren = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #13  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #14  <Method void ArrayList()>
	//    8   14:putfield        #16  <Field ArrayList mChildren>
	//    9   17:return          
	}

	public WidgetContainer(int i, int j, int k, int l)
	{
		super(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #23  <Method void ConstraintWidget(int, int, int, int)>
		mChildren = new ArrayList();
	//    6    9:aload_0         
	//    7   10:new             #13  <Class ArrayList>
	//    8   13:dup             
	//    9   14:invokespecial   #14  <Method void ArrayList()>
	//   10   17:putfield        #16  <Field ArrayList mChildren>
	//   11   20:return          
	}

	public static Rectangle getBounds(ArrayList arraylist)
	{
		Rectangle rectangle = new Rectangle();
	//    0    0:new             #27  <Class Rectangle>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void Rectangle()>
	//    3    7:astore          11
		if(arraylist.size() == 0)
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #32  <Method int ArrayList.size()>
	//*   6   13:ifne            19
			return rectangle;
	//    7   16:aload           11
	//    8   18:areturn         
		int j2 = arraylist.size();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #32  <Method int ArrayList.size()>
	//   11   23:istore          10
		int l1 = 0x7fffffff;
	//   12   25:ldc1            #33  <Int 0x7fffffff>
	//   13   27:istore          8
		int j = 0;
	//   14   29:iconst_0        
	//   15   30:istore_2        
		int i1 = 0x7fffffff;
	//   16   31:ldc1            #33  <Int 0x7fffffff>
	//   17   33:istore          5
		int k = 0;
	//   18   35:iconst_0        
	//   19   36:istore_3        
		int i;
		int i2;
		for(i = k; j < j2; i = i2)
	//*  20   37:iload_3         
	//*  21   38:istore_1        
	//*  22   39:iload_2         
	//*  23   40:iload           10
	//*  24   42:icmpge          156
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)arraylist.get(j);
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   28   50:checkcast       #4   <Class ConstraintWidget>
	//   29   53:astore          12
			int l = l1;
	//   30   55:iload           8
	//   31   57:istore          4
			if(constraintwidget.getX() < l1)
	//*  32   59:aload           12
	//*  33   61:invokevirtual   #40  <Method int ConstraintWidget.getX()>
	//*  34   64:iload           8
	//*  35   66:icmpge          76
				l = constraintwidget.getX();
	//   36   69:aload           12
	//   37   71:invokevirtual   #40  <Method int ConstraintWidget.getX()>
	//   38   74:istore          4
			int j1 = i1;
	//   39   76:iload           5
	//   40   78:istore          6
			if(constraintwidget.getY() < i1)
	//*  41   80:aload           12
	//*  42   82:invokevirtual   #43  <Method int ConstraintWidget.getY()>
	//*  43   85:iload           5
	//*  44   87:icmpge          97
				j1 = constraintwidget.getY();
	//   45   90:aload           12
	//   46   92:invokevirtual   #43  <Method int ConstraintWidget.getY()>
	//   47   95:istore          6
			int k1 = k;
	//   48   97:iload_3         
	//   49   98:istore          7
			if(constraintwidget.getRight() > k)
	//*  50  100:aload           12
	//*  51  102:invokevirtual   #46  <Method int ConstraintWidget.getRight()>
	//*  52  105:iload_3         
	//*  53  106:icmple          116
				k1 = constraintwidget.getRight();
	//   54  109:aload           12
	//   55  111:invokevirtual   #46  <Method int ConstraintWidget.getRight()>
	//   56  114:istore          7
			i2 = i;
	//   57  116:iload_1         
	//   58  117:istore          9
			if(constraintwidget.getBottom() > i)
	//*  59  119:aload           12
	//*  60  121:invokevirtual   #49  <Method int ConstraintWidget.getBottom()>
	//*  61  124:iload_1         
	//*  62  125:icmple          135
				i2 = constraintwidget.getBottom();
	//   63  128:aload           12
	//   64  130:invokevirtual   #49  <Method int ConstraintWidget.getBottom()>
	//   65  133:istore          9
			j++;
	//   66  135:iload_2         
	//   67  136:iconst_1        
	//   68  137:iadd            
	//   69  138:istore_2        
			l1 = l;
	//   70  139:iload           4
	//   71  141:istore          8
			i1 = j1;
	//   72  143:iload           6
	//   73  145:istore          5
			k = k1;
	//   74  147:iload           7
	//   75  149:istore_3        
		}

	//   76  150:iload           9
	//   77  152:istore_1        
	//*  78  153:goto            39
		rectangle.setBounds(l1, i1, k - l1, i - i1);
	//   79  156:aload           11
	//   80  158:iload           8
	//   81  160:iload           5
	//   82  162:iload_3         
	//   83  163:iload           8
	//   84  165:isub            
	//   85  166:iload_1         
	//   86  167:iload           5
	//   87  169:isub            
	//   88  170:invokevirtual   #52  <Method void Rectangle.setBounds(int, int, int, int)>
		return rectangle;
	//   89  173:aload           11
	//   90  175:areturn         
	}

	public void add(ConstraintWidget constraintwidget)
	{
		mChildren.add(((Object) (constraintwidget)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		if(constraintwidget.getParent() != null)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #63  <Method ConstraintWidget ConstraintWidget.getParent()>
	//*   7   13:ifnull          27
			((WidgetContainer)constraintwidget.getParent()).remove(constraintwidget);
	//    8   16:aload_1         
	//    9   17:invokevirtual   #63  <Method ConstraintWidget ConstraintWidget.getParent()>
	//   10   20:checkcast       #2   <Class WidgetContainer>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #66  <Method void remove(ConstraintWidget)>
		constraintwidget.setParent(((ConstraintWidget) (this)));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #69  <Method void ConstraintWidget.setParent(ConstraintWidget)>
	//   16   32:return          
	}

	public ConstraintWidget findWidget(float f, float f1)
	{
		int i = getDrawX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method int getDrawX()>
	//    2    4:istore_3        
		int j = getDrawY();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #77  <Method int getDrawY()>
	//    5    9:istore          4
		int k = getWidth();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #80  <Method int getWidth()>
	//    8   15:istore          5
		int i1 = getHeight();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #83  <Method int getHeight()>
	//   11   21:istore          6
		Object obj;
		if(f >= (float)i && f <= (float)(k + i) && f1 >= (float)j && f1 <= (float)(i1 + j))
	//*  12   23:fload_1         
	//*  13   24:iload_3         
	//*  14   25:i2f             
	//*  15   26:fcmpl           
	//*  16   27:iflt            65
	//*  17   30:fload_1         
	//*  18   31:iload           5
	//*  19   33:iload_3         
	//*  20   34:iadd            
	//*  21   35:i2f             
	//*  22   36:fcmpg           
	//*  23   37:ifgt            65
	//*  24   40:fload_2         
	//*  25   41:iload           4
	//*  26   43:i2f             
	//*  27   44:fcmpl           
	//*  28   45:iflt            65
	//*  29   48:fload_2         
	//*  30   49:iload           6
	//*  31   51:iload           4
	//*  32   53:iadd            
	//*  33   54:i2f             
	//*  34   55:fcmpg           
	//*  35   56:ifgt            65
			obj = ((Object) (this));
	//   36   59:aload_0         
	//   37   60:astore          9
		else
	//*  38   62:goto            68
			obj = null;
	//   39   65:aconst_null     
	//   40   66:astore          9
		i = 0;
	//   41   68:iconst_0        
	//   42   69:istore_3        
		j = mChildren.size();
	//   43   70:aload_0         
	//   44   71:getfield        #16  <Field ArrayList mChildren>
	//   45   74:invokevirtual   #32  <Method int ArrayList.size()>
	//   46   77:istore          4
		Object obj1;
		for(obj1 = obj; i < j; obj1 = obj)
	//*  47   79:aload           9
	//*  48   81:astore          10
	//*  49   83:iload_3         
	//*  50   84:iload           4
	//*  51   86:icmpge          235
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   52   89:aload_0         
	//   53   90:getfield        #16  <Field ArrayList mChildren>
	//   54   93:iload_3         
	//   55   94:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   56   97:checkcast       #4   <Class ConstraintWidget>
	//   57  100:astore          11
			if(constraintwidget instanceof WidgetContainer)
	//*  58  102:aload           11
	//*  59  104:instanceof      #2   <Class WidgetContainer>
	//*  60  107:ifeq            138
			{
				constraintwidget = ((WidgetContainer)constraintwidget).findWidget(f, f1);
	//   61  110:aload           11
	//   62  112:checkcast       #2   <Class WidgetContainer>
	//   63  115:fload_1         
	//   64  116:fload_2         
	//   65  117:invokevirtual   #85  <Method ConstraintWidget findWidget(float, float)>
	//   66  120:astore          11
				obj = obj1;
	//   67  122:aload           10
	//   68  124:astore          9
				if(constraintwidget != null)
	//*  69  126:aload           11
	//*  70  128:ifnull          224
					obj = ((Object) (constraintwidget));
	//   71  131:aload           11
	//   72  133:astore          9
			} else
	//*  73  135:goto            224
			{
				int l = constraintwidget.getDrawX();
	//   74  138:aload           11
	//   75  140:invokevirtual   #86  <Method int ConstraintWidget.getDrawX()>
	//   76  143:istore          5
				int j1 = constraintwidget.getDrawY();
	//   77  145:aload           11
	//   78  147:invokevirtual   #87  <Method int ConstraintWidget.getDrawY()>
	//   79  150:istore          6
				int k1 = constraintwidget.getWidth();
	//   80  152:aload           11
	//   81  154:invokevirtual   #88  <Method int ConstraintWidget.getWidth()>
	//   82  157:istore          7
				int l1 = constraintwidget.getHeight();
	//   83  159:aload           11
	//   84  161:invokevirtual   #89  <Method int ConstraintWidget.getHeight()>
	//   85  164:istore          8
				obj = obj1;
	//   86  166:aload           10
	//   87  168:astore          9
				if(f >= (float)l)
	//*  88  170:fload_1         
	//*  89  171:iload           5
	//*  90  173:i2f             
	//*  91  174:fcmpl           
	//*  92  175:iflt            224
				{
					obj = obj1;
	//   93  178:aload           10
	//   94  180:astore          9
					if(f <= (float)(k1 + l))
	//*  95  182:fload_1         
	//*  96  183:iload           7
	//*  97  185:iload           5
	//*  98  187:iadd            
	//*  99  188:i2f             
	//* 100  189:fcmpg           
	//* 101  190:ifgt            224
					{
						obj = obj1;
	//  102  193:aload           10
	//  103  195:astore          9
						if(f1 >= (float)j1)
	//* 104  197:fload_2         
	//* 105  198:iload           6
	//* 106  200:i2f             
	//* 107  201:fcmpl           
	//* 108  202:iflt            224
						{
							obj = obj1;
	//  109  205:aload           10
	//  110  207:astore          9
							if(f1 <= (float)(l1 + j1))
	//* 111  209:fload_2         
	//* 112  210:iload           8
	//* 113  212:iload           6
	//* 114  214:iadd            
	//* 115  215:i2f             
	//* 116  216:fcmpg           
	//* 117  217:ifgt            224
								obj = ((Object) (constraintwidget));
	//  118  220:aload           11
	//  119  222:astore          9
						}
					}
				}
			}
			i++;
	//  120  224:iload_3         
	//  121  225:iconst_1        
	//  122  226:iadd            
	//  123  227:istore_3        
		}

	//  124  228:aload           9
	//  125  230:astore          10
	//* 126  232:goto            83
		return ((ConstraintWidget) (obj1));
	//  127  235:aload           10
	//  128  237:areturn         
	}

	public ArrayList findWidgets(int i, int j, int k, int l)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore          5
		Rectangle rectangle = new Rectangle();
	//    4    9:new             #27  <Class Rectangle>
	//    5   12:dup             
	//    6   13:invokespecial   #28  <Method void Rectangle()>
	//    7   16:astore          6
		rectangle.setBounds(i, j, k, l);
	//    8   18:aload           6
	//    9   20:iload_1         
	//   10   21:iload_2         
	//   11   22:iload_3         
	//   12   23:iload           4
	//   13   25:invokevirtual   #52  <Method void Rectangle.setBounds(int, int, int, int)>
		j = mChildren.size();
	//   14   28:aload_0         
	//   15   29:getfield        #16  <Field ArrayList mChildren>
	//   16   32:invokevirtual   #32  <Method int ArrayList.size()>
	//   17   35:istore_2        
		for(i = 0; i < j; i++)
	//*  18   36:iconst_0        
	//*  19   37:istore_1        
	//*  20   38:iload_1         
	//*  21   39:iload_2         
	//*  22   40:icmpge          115
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   23   43:aload_0         
	//   24   44:getfield        #16  <Field ArrayList mChildren>
	//   25   47:iload_1         
	//   26   48:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   27   51:checkcast       #4   <Class ConstraintWidget>
	//   28   54:astore          7
			Rectangle rectangle1 = new Rectangle();
	//   29   56:new             #27  <Class Rectangle>
	//   30   59:dup             
	//   31   60:invokespecial   #28  <Method void Rectangle()>
	//   32   63:astore          8
			rectangle1.setBounds(constraintwidget.getDrawX(), constraintwidget.getDrawY(), constraintwidget.getWidth(), constraintwidget.getHeight());
	//   33   65:aload           8
	//   34   67:aload           7
	//   35   69:invokevirtual   #86  <Method int ConstraintWidget.getDrawX()>
	//   36   72:aload           7
	//   37   74:invokevirtual   #87  <Method int ConstraintWidget.getDrawY()>
	//   38   77:aload           7
	//   39   79:invokevirtual   #88  <Method int ConstraintWidget.getWidth()>
	//   40   82:aload           7
	//   41   84:invokevirtual   #89  <Method int ConstraintWidget.getHeight()>
	//   42   87:invokevirtual   #52  <Method void Rectangle.setBounds(int, int, int, int)>
			if(rectangle.intersects(rectangle1))
	//*  43   90:aload           6
	//*  44   92:aload           8
	//*  45   94:invokevirtual   #95  <Method boolean Rectangle.intersects(Rectangle)>
	//*  46   97:ifeq            108
				arraylist.add(((Object) (constraintwidget)));
	//   47  100:aload           5
	//   48  102:aload           7
	//   49  104:invokevirtual   #59  <Method boolean ArrayList.add(Object)>
	//   50  107:pop             
		}

	//   51  108:iload_1         
	//   52  109:iconst_1        
	//   53  110:iadd            
	//   54  111:istore_1        
	//*  55  112:goto            38
		return arraylist;
	//   56  115:aload           5
	//   57  117:areturn         
	}

	public ArrayList getChildren()
	{
		return mChildren;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:areturn         
	}

	public ConstraintWidgetContainer getRootConstraintContainer()
	{
		ConstraintWidget constraintwidget = ((ConstraintWidget)this).getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #63  <Method ConstraintWidget ConstraintWidget.getParent()>
	//    2    4:astore_1        
		ConstraintWidgetContainer constraintwidgetcontainer;
		if(this instanceof ConstraintWidgetContainer)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #103 <Class ConstraintWidgetContainer>
	//*   5    9:ifeq            20
			constraintwidgetcontainer = (ConstraintWidgetContainer)this;
	//    6   12:aload_0         
	//    7   13:checkcast       #103 <Class ConstraintWidgetContainer>
	//    8   16:astore_2        
		else
	//*   9   17:goto            22
			constraintwidgetcontainer = null;
	//   10   20:aconst_null     
	//   11   21:astore_2        
		while(constraintwidget != null) 
	//*  12   22:aload_1         
	//*  13   23:ifnull          53
		{
			ConstraintWidget constraintwidget1 = constraintwidget.getParent();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #63  <Method ConstraintWidget ConstraintWidget.getParent()>
	//   16   30:astore_3        
			if(constraintwidget instanceof ConstraintWidgetContainer)
	//*  17   31:aload_1         
	//*  18   32:instanceof      #103 <Class ConstraintWidgetContainer>
	//*  19   35:ifeq            48
			{
				constraintwidgetcontainer = (ConstraintWidgetContainer)constraintwidget;
	//   20   38:aload_1         
	//   21   39:checkcast       #103 <Class ConstraintWidgetContainer>
	//   22   42:astore_2        
				constraintwidget = constraintwidget1;
	//   23   43:aload_3         
	//   24   44:astore_1        
			} else
	//*  25   45:goto            22
			{
				constraintwidget = constraintwidget1;
	//   26   48:aload_3         
	//   27   49:astore_1        
			}
		}
	//*  28   50:goto            22
		return constraintwidgetcontainer;
	//   29   53:aload_2         
	//   30   54:areturn         
	}

	public void layout()
	{
		updateDrawPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method void updateDrawPosition()>
		ArrayList arraylist = mChildren;
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ArrayList mChildren>
	//    4    8:astore_3        
		if(arraylist == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       14
			return;
	//    7   13:return          
		int j = arraylist.size();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #32  <Method int ArrayList.size()>
	//   10   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          59
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   16   26:aload_0         
	//   17   27:getfield        #16  <Field ArrayList mChildren>
	//   18   30:iload_1         
	//   19   31:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   20   34:checkcast       #4   <Class ConstraintWidget>
	//   21   37:astore_3        
			if(constraintwidget instanceof WidgetContainer)
	//*  22   38:aload_3         
	//*  23   39:instanceof      #2   <Class WidgetContainer>
	//*  24   42:ifeq            52
				((WidgetContainer)constraintwidget).layout();
	//   25   45:aload_3         
	//   26   46:checkcast       #2   <Class WidgetContainer>
	//   27   49:invokevirtual   #109 <Method void layout()>
		}

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
	//*  32   56:goto            21
	//   33   59:return          
	}

	public void remove(ConstraintWidget constraintwidget)
	{
		mChildren.remove(((Object) (constraintwidget)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #111 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		constraintwidget.setParent(((ConstraintWidget) (null)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #69  <Method void ConstraintWidget.setParent(ConstraintWidget)>
	//    8   14:return          
	}

	public void removeAllChildren()
	{
		mChildren.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:invokevirtual   #115 <Method void ArrayList.clear()>
	//    3    7:return          
	}

	public void reset()
	{
		mChildren.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:invokevirtual   #115 <Method void ArrayList.clear()>
		super.reset();
	//    3    7:aload_0         
	//    4    8:invokespecial   #118 <Method void ConstraintWidget.reset()>
	//    5   11:return          
	}

	public void resetSolverVariables(Cache cache)
	{
		super.resetSolverVariables(cache);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void ConstraintWidget.resetSolverVariables(Cache)>
		int j = mChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field ArrayList mChildren>
	//    5    9:invokevirtual   #32  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((ConstraintWidget)mChildren.get(i)).resetSolverVariables(cache);
	//   12   20:aload_0         
	//   13   21:getfield        #16  <Field ArrayList mChildren>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class ConstraintWidget>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #122 <Method void ConstraintWidget.resetSolverVariables(Cache)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public void setOffset(int i, int j)
	{
		super.setOffset(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #125 <Method void ConstraintWidget.setOffset(int, int)>
		j = mChildren.size();
	//    4    6:aload_0         
	//    5    7:getfield        #16  <Field ArrayList mChildren>
	//    6   10:invokevirtual   #32  <Method int ArrayList.size()>
	//    7   13:istore_2        
		for(i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          50
			((ConstraintWidget)mChildren.get(i)).setOffset(getRootX(), getRootY());
	//   13   21:aload_0         
	//   14   22:getfield        #16  <Field ArrayList mChildren>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #4   <Class ConstraintWidget>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #128 <Method int getRootX()>
	//   20   36:aload_0         
	//   21   37:invokevirtual   #131 <Method int getRootY()>
	//   22   40:invokevirtual   #125 <Method void ConstraintWidget.setOffset(int, int)>

	//   23   43:iload_1         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_1        
	//*  27   47:goto            16
	//   28   50:return          
	}

	public void updateDrawPosition()
	{
		super.updateDrawPosition();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method void ConstraintWidget.updateDrawPosition()>
		ArrayList arraylist = mChildren;
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ArrayList mChildren>
	//    4    8:astore_3        
		if(arraylist == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       14
			return;
	//    7   13:return          
		int j = arraylist.size();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #32  <Method int ArrayList.size()>
	//   10   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          68
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   16   26:aload_0         
	//   17   27:getfield        #16  <Field ArrayList mChildren>
	//   18   30:iload_1         
	//   19   31:invokevirtual   #37  <Method Object ArrayList.get(int)>
	//   20   34:checkcast       #4   <Class ConstraintWidget>
	//   21   37:astore_3        
			constraintwidget.setOffset(getDrawX(), getDrawY());
	//   22   38:aload_3         
	//   23   39:aload_0         
	//   24   40:invokevirtual   #74  <Method int getDrawX()>
	//   25   43:aload_0         
	//   26   44:invokevirtual   #77  <Method int getDrawY()>
	//   27   47:invokevirtual   #125 <Method void ConstraintWidget.setOffset(int, int)>
			if(!(constraintwidget instanceof ConstraintWidgetContainer))
	//*  28   50:aload_3         
	//*  29   51:instanceof      #103 <Class ConstraintWidgetContainer>
	//*  30   54:ifne            61
				constraintwidget.updateDrawPosition();
	//   31   57:aload_3         
	//   32   58:invokevirtual   #132 <Method void ConstraintWidget.updateDrawPosition()>
		}

	//   33   61:iload_1         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_1        
	//*  37   65:goto            21
	//   38   68:return          
	}

	protected ArrayList mChildren;
}
