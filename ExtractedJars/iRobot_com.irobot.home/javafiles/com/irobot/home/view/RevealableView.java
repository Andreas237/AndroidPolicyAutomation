// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.*;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.security.InvalidParameterException;
import java.util.Locale;

public class RevealableView extends FrameLayout
{
	public static class a
	{

		public a a(int i)
		{
			a.a = i;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field RevealableView$c a>
		//    2    4:iload_1         
		//    3    5:putfield        #35  <Field int RevealableView$c.a>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		public a a(b b1)
		{
			c.a(a, b1);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field RevealableView$c a>
		//    2    4:aload_1         
		//    3    5:invokestatic    #39  <Method RevealableView$b RevealableView$c.a(RevealableView$c, RevealableView$b)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public RevealableView a()
		{
			RevealableView revealableview = new RevealableView(b);
		//    0    0:new             #6   <Class RevealableView>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field Context b>
		//    4    8:invokespecial   #41  <Method void RevealableView(Context)>
		//    5   11:astore_1        
			RevealableView.a(revealableview, a);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #23  <Field RevealableView$c a>
		//    9   17:invokestatic    #44  <Method void RevealableView.a(RevealableView, RevealableView$c)>
			return revealableview;
		//   10   20:aload_1         
		//   11   21:areturn         
		}

		public a b(int i)
		{
			a.b = i;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field RevealableView$c a>
		//    2    4:iload_1         
		//    3    5:putfield        #46  <Field int RevealableView$c.b>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
		}

		private c a;
		private final Context b;

		public a(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			b = context;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field Context b>
			if(b != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #17  <Field Context b>
		//*   7   13:ifnull          29
			{
				a = new c(context);
		//    8   16:aload_0         
		//    9   17:new             #19  <Class RevealableView$c>
		//   10   20:dup             
		//   11   21:aload_1         
		//   12   22:invokespecial   #21  <Method void RevealableView$c(Context)>
		//   13   25:putfield        #23  <Field RevealableView$c a>
				return;
		//   14   28:return          
			} else
			{
				throw new InvalidParameterException("RevealableView must have a non-null context and a view holder as parent view");
		//   15   29:new             #25  <Class InvalidParameterException>
		//   16   32:dup             
		//   17   33:ldc1            #27  <String "RevealableView must have a non-null context and a view holder as parent view">
		//   18   35:invokespecial   #30  <Method void InvalidParameterException(String)>
		//   19   38:athrow          
			}
		}
	}

	public static interface b
	{

		public abstract void a(int i);
	}

	private static class c
	{

		static b a(c c1)
		{
			return c1.e;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field RevealableView$b e>
		//    2    4:areturn         
		}

		static b a(c c1, b b1)
		{
			c1.e = b1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field RevealableView$b e>
			return b1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		static String b(c c1)
		{
			return c1.d;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field String d>
		//    2    4:areturn         
		}

		int a;
		int b;
		private Context c;
		private String d;
		private b e;

		c(Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			b = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #22  <Field int b>
			c = context;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #24  <Field Context c>
		//    8   14:return          
		}
	}


	protected RevealableView(Context context)
	{
		super(context, ((android.util.AttributeSet) (null)), 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iconst_0        
	//    4    4:invokespecial   #25  <Method void FrameLayout(Context, android.util.AttributeSet, int)>
	//    5    7:aload_0         
	//    6    8:ldc1            #2   <Class RevealableView>
	//    7   10:invokevirtual   #31  <Method String Class.getSimpleName()>
	//    8   13:invokestatic    #37  <Method String j.r(String)>
	//    9   16:putfield        #39  <Field String a>
	//   10   19:aload_0         
	//   11   20:ldc1            #40  <Float 0.66F>
	//   12   22:putfield        #42  <Field float e>
	//   13   25:return          
	}

	private void a(Canvas canvas, int i, float f, android.support.v7.widget.RecyclerView.u u, boolean flag)
	{
		if(u == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       15
		{
			o.e(a, "Parent view is missing! Cannot draw text on revealable view");
	//    2    5:aload_0         
	//    3    6:getfield        #39  <Field String a>
	//    4    9:ldc1            #46  <String "Parent view is missing! Cannot draw text on revealable view">
	//    5   11:invokestatic    #51  <Method void o.e(String, String)>
			return;
	//    6   14:return          
		}
		String s = c.b(c);
	//    7   15:aload_0         
	//    8   16:getfield        #53  <Field RevealableView$c c>
	//    9   19:invokestatic    #56  <Method String RevealableView$c.b(RevealableView$c)>
	//   10   22:astore          11
		if(s == null)
	//*  11   24:aload           11
	//*  12   26:ifnonnull       39
		{
			o.e(a, "Text has not been defined for revealed area! NEED ATTENTION!");
	//   13   29:aload_0         
	//   14   30:getfield        #39  <Field String a>
	//   15   33:ldc1            #58  <String "Text has not been defined for revealed area! NEED ATTENTION!">
	//   16   35:invokestatic    #51  <Method void o.e(String, String)>
			return;
	//   17   38:return          
		}
		d = u.e();
	//   18   39:aload_0         
	//   19   40:aload           4
	//   20   42:invokevirtual   #63  <Method int android.support.v7.widget.RecyclerView$u.e()>
	//   21   45:putfield        #65  <Field int d>
		float f1 = u.a.getRight();
	//   22   48:aload           4
	//   23   50:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   24   53:invokevirtual   #73  <Method int View.getRight()>
	//   25   56:i2f             
	//   26   57:fstore          6
		float f2 = u.a.getTop();
	//   27   59:aload           4
	//   28   61:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   29   64:invokevirtual   #76  <Method int View.getTop()>
	//   30   67:i2f             
	//   31   68:fstore          7
		float f3 = u.a.getBottom();
	//   32   70:aload           4
	//   33   72:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   34   75:invokevirtual   #79  <Method int View.getBottom()>
	//   35   78:i2f             
	//   36   79:fstore          8
		RectF rectf = new RectF(f1 - f, f2, f1, f3);
	//   37   81:new             #81  <Class RectF>
	//   38   84:dup             
	//   39   85:fload           6
	//   40   87:fload_3         
	//   41   88:fsub            
	//   42   89:fload           7
	//   43   91:fload           6
	//   44   93:fload           8
	//   45   95:invokespecial   #84  <Method void RectF(float, float, float, float)>
	//   46   98:astore          13
		b = rectf;
	//   47  100:aload_0         
	//   48  101:aload           13
	//   49  103:putfield        #86  <Field RectF b>
		Paint paint = new Paint();
	//   50  106:new             #88  <Class Paint>
	//   51  109:dup             
	//   52  110:invokespecial   #91  <Method void Paint()>
	//   53  113:astore          12
		paint.setColor(getContext().getResources().getColor(c.a));
	//   54  115:aload           12
	//   55  117:aload_0         
	//   56  118:invokevirtual   #95  <Method Context getContext()>
	//   57  121:invokevirtual   #101 <Method Resources Context.getResources()>
	//   58  124:aload_0         
	//   59  125:getfield        #53  <Field RevealableView$c c>
	//   60  128:getfield        #103 <Field int RevealableView$c.a>
	//   61  131:invokevirtual   #109 <Method int Resources.getColor(int)>
	//   62  134:invokevirtual   #113 <Method void Paint.setColor(int)>
		canvas.drawRect(rectf, paint);
	//   63  137:aload_1         
	//   64  138:aload           13
	//   65  140:aload           12
	//   66  142:invokevirtual   #119 <Method void Canvas.drawRect(RectF, Paint)>
		boolean flag1;
		if(u.d() == 0)
	//*  67  145:aload           4
	//*  68  147:invokevirtual   #121 <Method int android.support.v7.widget.RecyclerView$u.d()>
	//*  69  150:ifne            159
			flag1 = true;
	//   70  153:iconst_1        
	//   71  154:istore          9
		else
	//*  72  156:goto            162
			flag1 = false;
	//   73  159:iconst_0        
	//   74  160:istore          9
		int k = (int)((f3 - f2) / 2.0F + f2);
	//   75  162:fload           8
	//   76  164:fload           7
	//   77  166:fsub            
	//   78  167:fconst_2        
	//   79  168:fdiv            
	//   80  169:fload           7
	//   81  171:fadd            
	//   82  172:f2i             
	//   83  173:istore          10
		if(flag1)
	//*  84  175:iload           9
	//*  85  177:ifeq            194
			i = u.a.getRight() - i;
	//   86  180:aload           4
	//   87  182:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   88  185:invokevirtual   #73  <Method int View.getRight()>
	//   89  188:iload_2         
	//   90  189:isub            
	//   91  190:istore_2        
		else
	//*  92  191:goto            205
			i = u.a.getLeft() + i;
	//   93  194:aload           4
	//   94  196:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   95  199:invokevirtual   #124 <Method int View.getLeft()>
	//   96  202:iload_2         
	//   97  203:iadd            
	//   98  204:istore_2        
		u = ((android.support.v7.widget.RecyclerView.u) (new Rect()));
	//   99  205:new             #126 <Class Rect>
	//  100  208:dup             
	//  101  209:invokespecial   #127 <Method void Rect()>
	//  102  212:astore          4
		paint.setColor(-1);
	//  103  214:aload           12
	//  104  216:iconst_m1       
	//  105  217:invokevirtual   #113 <Method void Paint.setColor(int)>
		paint.setTextSize(getContext().getResources().getDimensionPixelSize(0x7f07019c));
	//  106  220:aload           12
	//  107  222:aload_0         
	//  108  223:invokevirtual   #95  <Method Context getContext()>
	//  109  226:invokevirtual   #101 <Method Resources Context.getResources()>
	//  110  229:ldc1            #128 <Int 0x7f07019c>
	//  111  231:invokevirtual   #131 <Method int Resources.getDimensionPixelSize(int)>
	//  112  234:i2f             
	//  113  235:invokevirtual   #135 <Method void Paint.setTextSize(float)>
		paint.getTextBounds(s, 0, s.length(), ((Rect) (u)));
	//  114  238:aload           12
	//  115  240:aload           11
	//  116  242:iconst_0        
	//  117  243:aload           11
	//  118  245:invokevirtual   #140 <Method int String.length()>
	//  119  248:aload           4
	//  120  250:invokevirtual   #144 <Method void Paint.getTextBounds(String, int, int, Rect)>
		if(flag1)
	//* 121  253:iload           9
	//* 122  255:ifeq            266
			u = ((android.support.v7.widget.RecyclerView.u) (android.graphics.Paint.Align.RIGHT));
	//  123  258:getstatic       #150 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  124  261:astore          4
		else
	//* 125  263:goto            271
			u = ((android.support.v7.widget.RecyclerView.u) (android.graphics.Paint.Align.LEFT));
	//  126  266:getstatic       #153 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  127  269:astore          4
		paint.setTextAlign(((android.graphics.Paint.Align) (u)));
	//  128  271:aload           12
	//  129  273:aload           4
	//  130  275:invokevirtual   #157 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		canvas.drawText(s, i, k, paint);
	//  131  278:aload_1         
	//  132  279:aload           11
	//  133  281:iload_2         
	//  134  282:i2f             
	//  135  283:iload           10
	//  136  285:i2f             
	//  137  286:aload           12
	//  138  288:invokevirtual   #161 <Method void Canvas.drawText(String, float, float, Paint)>
	//  139  291:return          
	}

	private void a(c c1)
	{
		c = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field RevealableView$c c>
	//    3    5:return          
	}

	static void a(RevealableView revealableview, c c1)
	{
		revealableview.a(c1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #165 <Method void a(RevealableView$c)>
	//    3    5:return          
	}

	private void b(Canvas canvas, int i, float f, android.support.v7.widget.RecyclerView.u u, boolean flag)
	{
		if(u != null) goto _L2; else goto _L1
	//    0    0:aload           4
	//    1    2:ifnonnull       21
_L1:
		canvas = ((Canvas) (a));
	//    2    5:aload_0         
	//    3    6:getfield        #39  <Field String a>
	//    4    9:astore_1        
		u = "Parent view is missing! Cannot draw icon on revealable view";
	//    5   10:ldc1            #167 <String "Parent view is missing! Cannot draw icon on revealable view">
	//    6   12:astore          4
_L4:
		o.e(((String) (canvas)), ((String) (u)));
	//    7   14:aload_1         
	//    8   15:aload           4
	//    9   17:invokestatic    #51  <Method void o.e(String, String)>
		return;
	//   10   20:return          
_L2:
		if(c.b != -1)
			break; /* Loop/switch isn't completed */
	//   11   21:aload_0         
	//   12   22:getfield        #53  <Field RevealableView$c c>
	//   13   25:getfield        #169 <Field int RevealableView$c.b>
	//   14   28:iconst_m1       
	//   15   29:icmpne          44
		canvas = ((Canvas) (a));
	//   16   32:aload_0         
	//   17   33:getfield        #39  <Field String a>
	//   18   36:astore_1        
		u = "Icon has not been defined for revealed area! NEED ATTENTION!";
	//   19   37:ldc1            #171 <String "Icon has not been defined for revealed area! NEED ATTENTION!">
	//   20   39:astore          4
		if(true) goto _L4; else goto _L3
	//   21   41:goto            14
_L3:
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), c.b);
	//   22   44:aload_0         
	//   23   45:invokevirtual   #172 <Method Resources getResources()>
	//   24   48:aload_0         
	//   25   49:getfield        #53  <Field RevealableView$c c>
	//   26   52:getfield        #169 <Field int RevealableView$c.b>
	//   27   55:invokestatic    #178 <Method Bitmap BitmapFactory.decodeResource(Resources, int)>
	//   28   58:astore          9
		d = u.e();
	//   29   60:aload_0         
	//   30   61:aload           4
	//   31   63:invokevirtual   #63  <Method int android.support.v7.widget.RecyclerView$u.e()>
	//   32   66:putfield        #65  <Field int d>
		float f1 = u.a.getRight();
	//   33   69:aload           4
	//   34   71:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   35   74:invokevirtual   #73  <Method int View.getRight()>
	//   36   77:i2f             
	//   37   78:fstore          6
		float f3 = u.a.getTop();
	//   38   80:aload           4
	//   39   82:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   40   85:invokevirtual   #76  <Method int View.getTop()>
	//   41   88:i2f             
	//   42   89:fstore          7
		float f4 = u.a.getBottom();
	//   43   91:aload           4
	//   44   93:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//   45   96:invokevirtual   #79  <Method int View.getBottom()>
	//   46   99:i2f             
	//   47  100:fstore          8
		b = new RectF(f1 - f, f3, f1, f4);
	//   48  102:aload_0         
	//   49  103:new             #81  <Class RectF>
	//   50  106:dup             
	//   51  107:fload           6
	//   52  109:fload_3         
	//   53  110:fsub            
	//   54  111:fload           7
	//   55  113:fload           6
	//   56  115:fload           8
	//   57  117:invokespecial   #84  <Method void RectF(float, float, float, float)>
	//   58  120:putfield        #86  <Field RectF b>
		Paint paint = new Paint();
	//   59  123:new             #88  <Class Paint>
	//   60  126:dup             
	//   61  127:invokespecial   #91  <Method void Paint()>
	//   62  130:astore          10
		paint.setColor(getContext().getResources().getColor(c.a));
	//   63  132:aload           10
	//   64  134:aload_0         
	//   65  135:invokevirtual   #95  <Method Context getContext()>
	//   66  138:invokevirtual   #101 <Method Resources Context.getResources()>
	//   67  141:aload_0         
	//   68  142:getfield        #53  <Field RevealableView$c c>
	//   69  145:getfield        #103 <Field int RevealableView$c.a>
	//   70  148:invokevirtual   #109 <Method int Resources.getColor(int)>
	//   71  151:invokevirtual   #113 <Method void Paint.setColor(int)>
		canvas.drawRect(b, paint);
	//   72  154:aload_1         
	//   73  155:aload_0         
	//   74  156:getfield        #86  <Field RectF b>
	//   75  159:aload           10
	//   76  161:invokevirtual   #119 <Method void Canvas.drawRect(RectF, Paint)>
		paint.setColor(-1);
	//   77  164:aload           10
	//   78  166:iconst_m1       
	//   79  167:invokevirtual   #113 <Method void Paint.setColor(int)>
		if((float)bitmap.getWidth() < f)
	//*  80  170:aload           9
	//*  81  172:invokevirtual   #183 <Method int Bitmap.getWidth()>
	//*  82  175:i2f             
	//*  83  176:fload_3         
	//*  84  177:fcmpg           
	//*  85  178:ifge            331
		{
			float f2 = (int)((f4 - f3) / 2.0F + f3) - bitmap.getHeight() / 2;
	//   86  181:fload           8
	//   87  183:fload           7
	//   88  185:fsub            
	//   89  186:fconst_2        
	//   90  187:fdiv            
	//   91  188:fload           7
	//   92  190:fadd            
	//   93  191:f2i             
	//   94  192:aload           9
	//   95  194:invokevirtual   #186 <Method int Bitmap.getHeight()>
	//   96  197:iconst_2        
	//   97  198:idiv            
	//   98  199:isub            
	//   99  200:i2f             
	//  100  201:fstore          6
			if(f > (float)u.a.getWidth() * 0.66F)
	//* 101  203:fload_3         
	//* 102  204:aload           4
	//* 103  206:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//* 104  209:invokevirtual   #187 <Method int View.getWidth()>
	//* 105  212:i2f             
	//* 106  213:ldc1            #40  <Float 0.66F>
	//* 107  215:fmul            
	//* 108  216:fcmpl           
	//* 109  217:ifle            268
			{
				if(flag)
	//* 110  220:iload           5
	//* 111  222:ifeq            250
					f = ((float)u.a.getLeft() + f) - (float)i - (float)bitmap.getWidth();
	//  112  225:aload           4
	//  113  227:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//  114  230:invokevirtual   #124 <Method int View.getLeft()>
	//  115  233:i2f             
	//  116  234:fload_3         
	//  117  235:fadd            
	//  118  236:iload_2         
	//  119  237:i2f             
	//  120  238:fsub            
	//  121  239:aload           9
	//  122  241:invokevirtual   #183 <Method int Bitmap.getWidth()>
	//  123  244:i2f             
	//  124  245:fsub            
	//  125  246:fstore_3        
				else
	//* 126  247:goto            310
					f = ((float)u.a.getRight() - f) + (float)i;
	//  127  250:aload           4
	//  128  252:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//  129  255:invokevirtual   #73  <Method int View.getRight()>
	//  130  258:i2f             
	//  131  259:fload_3         
	//  132  260:fsub            
	//  133  261:iload_2         
	//  134  262:i2f             
	//  135  263:fadd            
	//  136  264:fstore_3        
			} else
	//* 137  265:goto            310
			{
				if(flag)
	//* 138  268:iload           5
	//* 139  270:ifeq            290
					i = u.a.getLeft() + i;
	//  140  273:aload           4
	//  141  275:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//  142  278:invokevirtual   #124 <Method int View.getLeft()>
	//  143  281:iload_2         
	//  144  282:iadd            
	//  145  283:istore_2        
				else
	//* 146  284:iload_2         
	//* 147  285:i2f             
	//* 148  286:fstore_3        
	//* 149  287:goto            310
					i = u.a.getRight() - i - bitmap.getWidth();
	//  150  290:aload           4
	//  151  292:getfield        #68  <Field View android.support.v7.widget.RecyclerView$u.a>
	//  152  295:invokevirtual   #73  <Method int View.getRight()>
	//  153  298:iload_2         
	//  154  299:isub            
	//  155  300:aload           9
	//  156  302:invokevirtual   #183 <Method int Bitmap.getWidth()>
	//  157  305:isub            
	//  158  306:istore_2        
				f = i;
			}
	//* 159  307:goto            284
			canvas.drawBitmap(bitmap, f, f2, paint);
	//  160  310:aload_1         
	//  161  311:aload           9
	//  162  313:fload_3         
	//  163  314:fload           6
	//  164  316:aload           10
	//  165  318:invokevirtual   #191 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			if(bitmap != null)
	//* 166  321:aload           9
	//* 167  323:ifnull          331
				bitmap.recycle();
	//  168  326:aload           9
	//  169  328:invokevirtual   #194 <Method void Bitmap.recycle()>
		}
		return;
	//  170  331:return          
	}

	public void a()
	{
		if(c != null && c.a(c) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field RevealableView$c c>
	//*   2    4:ifnull          33
	//*   3    7:aload_0         
	//*   4    8:getfield        #53  <Field RevealableView$c c>
	//*   5   11:invokestatic    #197 <Method RevealableView$b RevealableView$c.a(RevealableView$c)>
	//*   6   14:ifnull          33
			c.a(c).a(d);
	//    7   17:aload_0         
	//    8   18:getfield        #53  <Field RevealableView$c c>
	//    9   21:invokestatic    #197 <Method RevealableView$b RevealableView$c.a(RevealableView$c)>
	//   10   24:aload_0         
	//   11   25:getfield        #65  <Field int d>
	//   12   28:invokeinterface #199 <Method void RevealableView$b.a(int)>
	//   13   33:return          
	}

	public void a(Canvas canvas, int i, float f, android.support.v7.widget.RecyclerView.u u)
	{
		boolean flag;
		if(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1)
	//*   0    0:invokestatic    #206 <Method Locale Locale.getDefault()>
	//*   1    3:invokestatic    #212 <Method int TextUtils.getLayoutDirectionFromLocale(Locale)>
	//*   2    6:iconst_1        
	//*   3    7:icmpne          16
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore          5
		else
	//*   6   13:goto            19
			flag = false;
	//    7   16:iconst_0        
	//    8   17:istore          5
		if(c != null && c.b(c) != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #53  <Field RevealableView$c c>
	//*  11   23:ifnull          48
	//*  12   26:aload_0         
	//*  13   27:getfield        #53  <Field RevealableView$c c>
	//*  14   30:invokestatic    #56  <Method String RevealableView$c.b(RevealableView$c)>
	//*  15   33:ifnull          48
		{
			a(canvas, i, f, u, flag);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iload_2         
	//   19   39:fload_3         
	//   20   40:aload           4
	//   21   42:iload           5
	//   22   44:invokespecial   #214 <Method void a(Canvas, int, float, android.support.v7.widget.RecyclerView$u, boolean)>
			return;
	//   23   47:return          
		}
		if(c != null && c.b != -1)
	//*  24   48:aload_0         
	//*  25   49:getfield        #53  <Field RevealableView$c c>
	//*  26   52:ifnull          77
	//*  27   55:aload_0         
	//*  28   56:getfield        #53  <Field RevealableView$c c>
	//*  29   59:getfield        #169 <Field int RevealableView$c.b>
	//*  30   62:iconst_m1       
	//*  31   63:icmpeq          77
			b(canvas, i, f, u, flag);
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:iload_2         
	//   35   69:fload_3         
	//   36   70:aload           4
	//   37   72:iload           5
	//   38   74:invokespecial   #216 <Method void b(Canvas, int, float, android.support.v7.widget.RecyclerView$u, boolean)>
	//   39   77:return          
	}

	public boolean a(float f, float f1)
	{
		if(b != null && b.contains(f, f1) && c.a(c) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field RectF b>
	//*   2    4:ifnull          47
	//*   3    7:aload_0         
	//*   4    8:getfield        #86  <Field RectF b>
	//*   5   11:fload_1         
	//*   6   12:fload_2         
	//*   7   13:invokevirtual   #220 <Method boolean RectF.contains(float, float)>
	//*   8   16:ifeq            47
	//*   9   19:aload_0         
	//*  10   20:getfield        #53  <Field RevealableView$c c>
	//*  11   23:invokestatic    #197 <Method RevealableView$b RevealableView$c.a(RevealableView$c)>
	//*  12   26:ifnull          47
		{
			c.a(c).a(d);
	//   13   29:aload_0         
	//   14   30:getfield        #53  <Field RevealableView$c c>
	//   15   33:invokestatic    #197 <Method RevealableView$b RevealableView$c.a(RevealableView$c)>
	//   16   36:aload_0         
	//   17   37:getfield        #65  <Field int d>
	//   18   40:invokeinterface #199 <Method void RevealableView$b.a(int)>
			return true;
	//   19   45:iconst_1        
	//   20   46:ireturn         
		} else
		{
			return false;
	//   21   47:iconst_0        
	//   22   48:ireturn         
		}
	}

	private final String a = j.r(((Class) (com/irobot/home/view/RevealableView)).getSimpleName());
	private RectF b;
	private c c;
	private int d;
	private final float e = 0.66F;
}
