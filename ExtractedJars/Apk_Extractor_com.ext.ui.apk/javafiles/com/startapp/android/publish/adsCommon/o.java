// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public class o
{

	public o()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void Rect()>
	//    6   12:putfield        #15  <Field Rect a>
	//    7   15:return          
	}

	private boolean a(View view)
	{
		return android.os.Build.VERSION.SDK_INT >= 11 && view.getAlpha() == 0.0F;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          11
	//    2    5:icmplt          19
	//    3    8:aload_1         
	//    4    9:invokevirtual   #29  <Method float View.getAlpha()>
	//    5   12:fconst_0        
	//    6   13:fcmpl           
	//    7   14:ifne            19
	//    8   17:iconst_1        
	//    9   18:ireturn         
	//   10   19:iconst_0        
	//   11   20:ireturn         
	}

	private static boolean a(View view, View view1, int i)
	{
		int ai1[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore          12
		int ai[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore          11
		view.getLocationOnScreen(ai1);
	//    6   10:aload_0         
	//    7   11:aload           12
	//    8   13:invokevirtual   #34  <Method void View.getLocationOnScreen(int[])>
		view1.getLocationOnScreen(ai);
	//    9   16:aload_1         
	//   10   17:aload           11
	//   11   19:invokevirtual   #34  <Method void View.getLocationOnScreen(int[])>
		Rect rect = new Rect(ai1[0], ai1[1], ai1[0] + view.getWidth(), ai1[1] + view.getHeight());
	//   12   22:new             #12  <Class Rect>
	//   13   25:dup             
	//   14   26:aload           12
	//   15   28:iconst_0        
	//   16   29:iaload          
	//   17   30:aload           12
	//   18   32:iconst_1        
	//   19   33:iaload          
	//   20   34:aload           12
	//   21   36:iconst_0        
	//   22   37:iaload          
	//   23   38:aload_0         
	//   24   39:invokevirtual   #38  <Method int View.getWidth()>
	//   25   42:iadd            
	//   26   43:aload           12
	//   27   45:iconst_1        
	//   28   46:iaload          
	//   29   47:aload_0         
	//   30   48:invokevirtual   #41  <Method int View.getHeight()>
	//   31   51:iadd            
	//   32   52:invokespecial   #44  <Method void Rect(int, int, int, int)>
	//   33   55:astore          12
		view1 = ((View) (new Rect(ai[0], ai[1], ai[0] + view1.getWidth(), ai[1] + view1.getHeight())));
	//   34   57:new             #12  <Class Rect>
	//   35   60:dup             
	//   36   61:aload           11
	//   37   63:iconst_0        
	//   38   64:iaload          
	//   39   65:aload           11
	//   40   67:iconst_1        
	//   41   68:iaload          
	//   42   69:aload           11
	//   43   71:iconst_0        
	//   44   72:iaload          
	//   45   73:aload_1         
	//   46   74:invokevirtual   #38  <Method int View.getWidth()>
	//   47   77:iadd            
	//   48   78:aload           11
	//   49   80:iconst_1        
	//   50   81:iaload          
	//   51   82:aload_1         
	//   52   83:invokevirtual   #41  <Method int View.getHeight()>
	//   53   86:iadd            
	//   54   87:invokespecial   #44  <Method void Rect(int, int, int, int)>
	//   55   90:astore_1        
		int j = Math.max(0, Math.min(rect.right, ((Rect) (view1)).right) - Math.max(rect.left, ((Rect) (view1)).left));
	//   56   91:iconst_0        
	//   57   92:aload           12
	//   58   94:getfield        #47  <Field int Rect.right>
	//   59   97:aload_1         
	//   60   98:getfield        #47  <Field int Rect.right>
	//   61  101:invokestatic    #53  <Method int Math.min(int, int)>
	//   62  104:aload           12
	//   63  106:getfield        #56  <Field int Rect.left>
	//   64  109:aload_1         
	//   65  110:getfield        #56  <Field int Rect.left>
	//   66  113:invokestatic    #59  <Method int Math.max(int, int)>
	//   67  116:isub            
	//   68  117:invokestatic    #59  <Method int Math.max(int, int)>
	//   69  120:istore_3        
		int k = Math.max(0, Math.min(rect.bottom, ((Rect) (view1)).bottom) - Math.max(rect.top, ((Rect) (view1)).top));
	//   70  121:iconst_0        
	//   71  122:aload           12
	//   72  124:getfield        #62  <Field int Rect.bottom>
	//   73  127:aload_1         
	//   74  128:getfield        #62  <Field int Rect.bottom>
	//   75  131:invokestatic    #53  <Method int Math.min(int, int)>
	//   76  134:aload           12
	//   77  136:getfield        #65  <Field int Rect.top>
	//   78  139:aload_1         
	//   79  140:getfield        #65  <Field int Rect.top>
	//   80  143:invokestatic    #59  <Method int Math.max(int, int)>
	//   81  146:isub            
	//   82  147:invokestatic    #59  <Method int Math.max(int, int)>
	//   83  150:istore          4
		long l = j;
	//   84  152:iload_3         
	//   85  153:i2l             
	//   86  154:lstore          5
		l = (long)k * l;
	//   87  156:iload           4
	//   88  158:i2l             
	//   89  159:lload           5
	//   90  161:lmul            
	//   91  162:lstore          5
		long l1 = view.getHeight();
	//   92  164:aload_0         
	//   93  165:invokevirtual   #41  <Method int View.getHeight()>
	//   94  168:i2l             
	//   95  169:lstore          7
		long l2 = view.getWidth();
	//   96  171:aload_0         
	//   97  172:invokevirtual   #38  <Method int View.getWidth()>
	//   98  175:i2l             
	//   99  176:lstore          9
		return l > 0L && l * 100L > l1 * l2 * (long)i;
	//  100  178:lload           5
	//  101  180:lconst_0        
	//  102  181:lcmp            
	//  103  182:ifle            205
	//  104  185:lload           5
	//  105  187:ldc2w           #66  <Long 100L>
	//  106  190:lmul            
	//  107  191:lload           7
	//  108  193:lload           9
	//  109  195:lmul            
	//  110  196:iload_2         
	//  111  197:i2l             
	//  112  198:lmul            
	//  113  199:lcmp            
	//  114  200:ifle            205
	//  115  203:iconst_1        
	//  116  204:ireturn         
	//  117  205:iconst_0        
	//  118  206:ireturn         
	}

	public boolean a(View view, int i)
	{
	//*   0    0:aload_1         
	//*   1    1:ifnull          43
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #73  <Method boolean View.hasWindowFocus()>
	//*   4    8:ifeq            43
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #76  <Method boolean View.isShown()>
	//*   7   15:ifeq            43
	//*   8   18:aload_0         
	//*   9   19:aload_1         
	//*  10   20:invokespecial   #78  <Method boolean a(View)>
	//*  11   23:ifne            43
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #82  <Method View View.getRootView()>
	//*  14   30:ifnull          43
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #82  <Method View View.getRootView()>
	//*  17   37:invokevirtual   #86  <Method android.view.ViewParent View.getParent()>
	//*  18   40:ifnonnull       45
_L2:
		return false;
	//   19   43:iconst_0        
	//   20   44:ireturn         
		if(view == null || !view.hasWindowFocus() || !view.isShown() || a(view) || view.getRootView() == null || view.getRootView().getParent() == null || !view.getGlobalVisibleRect(a)) goto _L2; else goto _L1
	//   21   45:aload_1         
	//   22   46:aload_0         
	//   23   47:getfield        #15  <Field Rect a>
	//   24   50:invokevirtual   #90  <Method boolean View.getGlobalVisibleRect(Rect)>
	//   25   53:ifeq            43
_L1:
label0:
		{
			if(!(view.getParent() instanceof ViewGroup))
				break label0;
	//   26   56:aload_1         
	//   27   57:invokevirtual   #86  <Method android.view.ViewParent View.getParent()>
	//   28   60:instanceof      #92  <Class ViewGroup>
	//   29   63:ifeq            126
			ViewGroup viewgroup = (ViewGroup)view.getParent();
	//   30   66:aload_1         
	//   31   67:invokevirtual   #86  <Method android.view.ViewParent View.getParent()>
	//   32   70:checkcast       #92  <Class ViewGroup>
	//   33   73:astore          11
			int j = viewgroup.indexOfChild(view) + 1;
	//   34   75:aload           11
	//   35   77:aload_1         
	//   36   78:invokevirtual   #96  <Method int ViewGroup.indexOfChild(View)>
	//   37   81:iconst_1        
	//   38   82:iadd            
	//   39   83:istore_3        
			do
			{
				if(j >= viewgroup.getChildCount())
					break label0;
	//   40   84:iload_3         
	//   41   85:aload           11
	//   42   87:invokevirtual   #99  <Method int ViewGroup.getChildCount()>
	//   43   90:icmpge          126
				View view1 = viewgroup.getChildAt(j);
	//   44   93:aload           11
	//   45   95:iload_3         
	//   46   96:invokevirtual   #103 <Method View ViewGroup.getChildAt(int)>
	//   47   99:astore          12
				if(view1.getVisibility() == 0 && a(view, view1, 0))
					break;
	//   48  101:aload           12
	//   49  103:invokevirtual   #106 <Method int View.getVisibility()>
	//   50  106:ifne            119
	//   51  109:aload_1         
	//   52  110:aload           12
	//   53  112:iconst_0        
	//   54  113:invokestatic    #108 <Method boolean a(View, View, int)>
	//   55  116:ifne            43
				j++;
	//   56  119:iload_3         
	//   57  120:iconst_1        
	//   58  121:iadd            
	//   59  122:istore_3        
			} while(true);
	//   60  123:goto            84
		}
		if(true) goto _L2; else goto _L3
_L3:
		long l = a.height();
	//   61  126:aload_0         
	//   62  127:getfield        #15  <Field Rect a>
	//   63  130:invokevirtual   #111 <Method int Rect.height()>
	//   64  133:i2l             
	//   65  134:lstore          4
		long l1 = a.width();
	//   66  136:aload_0         
	//   67  137:getfield        #15  <Field Rect a>
	//   68  140:invokevirtual   #114 <Method int Rect.width()>
	//   69  143:i2l             
	//   70  144:lstore          6
		long l2 = (long)view.getHeight() * (long)view.getWidth();
	//   71  146:aload_1         
	//   72  147:invokevirtual   #41  <Method int View.getHeight()>
	//   73  150:i2l             
	//   74  151:aload_1         
	//   75  152:invokevirtual   #38  <Method int View.getWidth()>
	//   76  155:i2l             
	//   77  156:lmul            
	//   78  157:lstore          8
		boolean flag;
		if(l2 > 0L && l * l1 * 100L >= l2 * (long)i)
	//*  79  159:lload           8
	//*  80  161:lconst_0        
	//*  81  162:lcmp            
	//*  82  163:ifle            190
	//*  83  166:lload           4
	//*  84  168:lload           6
	//*  85  170:lmul            
	//*  86  171:ldc2w           #66  <Long 100L>
	//*  87  174:lmul            
	//*  88  175:lload           8
	//*  89  177:iload_2         
	//*  90  178:i2l             
	//*  91  179:lmul            
	//*  92  180:lcmp            
	//*  93  181:iflt            190
			flag = true;
	//   94  184:iconst_1        
	//   95  185:istore          10
		else
	//*  96  187:iload           10
	//*  97  189:ireturn         
			flag = false;
	//   98  190:iconst_0        
	//   99  191:istore          10
		return flag;
	//* 100  193:goto            187
	}

	private final Rect a = new Rect();
}
