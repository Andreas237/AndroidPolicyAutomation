// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.*;
import android.opengl.GLES20;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.interfaces.IOverlayImage;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.amap.api.mapcore.util:
//			dh, y, s, ab, 
//			fd, hm

public class dp
	implements dh
{

	public dp(TextOptions textoptions, y y1)
		throws RemoteException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
		b = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #65  <Field float b>
		c = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #67  <Field float c>
		d = 4;
	//    8   14:aload_0         
	//    9   15:iconst_4        
	//   10   16:putfield        #69  <Field int d>
		e = 32;
	//   11   19:aload_0         
	//   12   20:bipush          32
	//   13   22:putfield        #71  <Field int e>
		f = FPoint.obtain();
	//   14   25:aload_0         
	//   15   26:invokestatic    #77  <Method FPoint FPoint.obtain()>
	//   16   29:putfield        #79  <Field FPoint f>
		m = 0.5F;
	//   17   32:aload_0         
	//   18   33:ldc1            #80  <Float 0.5F>
	//   19   35:putfield        #82  <Field float m>
		n = 1.0F;
	//   20   38:aload_0         
	//   21   39:fconst_1        
	//   22   40:putfield        #84  <Field float n>
		o = true;
	//   23   43:aload_0         
	//   24   44:iconst_1        
	//   25   45:putfield        #86  <Field boolean o>
		x = new Rect();
	//   26   48:aload_0         
	//   27   49:new             #88  <Class Rect>
	//   28   52:dup             
	//   29   53:invokespecial   #89  <Method void Rect()>
	//   30   56:putfield        #91  <Field Rect x>
		y = new Paint();
	//   31   59:aload_0         
	//   32   60:new             #93  <Class Paint>
	//   33   63:dup             
	//   34   64:invokespecial   #94  <Method void Paint()>
	//   35   67:putfield        #96  <Field Paint y>
		B = false;
	//   36   70:aload_0         
	//   37   71:iconst_0        
	//   38   72:putfield        #98  <Field boolean B>
		C = ((List) (new ArrayList()));
	//   39   75:aload_0         
	//   40   76:new             #100 <Class ArrayList>
	//   41   79:dup             
	//   42   80:invokespecial   #101 <Method void ArrayList()>
	//   43   83:putfield        #103 <Field List C>
		D = false;
	//   44   86:aload_0         
	//   45   87:iconst_0        
	//   46   88:putfield        #105 <Field boolean D>
		E = false;
	//   47   91:aload_0         
	//   48   92:iconst_0        
	//   49   93:putfield        #107 <Field boolean E>
	//   50   96:aload_0         
	//   51   97:bipush          36
	//   52   99:newarray        float[]
	//   53  101:dup             
	//   54  102:iconst_0        
	//   55  103:ldc1            #108 <Float -1F>
	//   56  105:fastore         
	//   57  106:dup             
	//   58  107:iconst_1        
	//   59  108:ldc1            #108 <Float -1F>
	//   60  110:fastore         
	//   61  111:dup             
	//   62  112:iconst_2        
	//   63  113:fconst_0        
	//   64  114:fastore         
	//   65  115:dup             
	//   66  116:iconst_3        
	//   67  117:fconst_0        
	//   68  118:fastore         
	//   69  119:dup             
	//   70  120:iconst_4        
	//   71  121:fconst_0        
	//   72  122:fastore         
	//   73  123:dup             
	//   74  124:iconst_5        
	//   75  125:fconst_1        
	//   76  126:fastore         
	//   77  127:dup             
	//   78  128:bipush          6
	//   79  130:fconst_0        
	//   80  131:fastore         
	//   81  132:dup             
	//   82  133:bipush          7
	//   83  135:fconst_0        
	//   84  136:fastore         
	//   85  137:dup             
	//   86  138:bipush          8
	//   87  140:fconst_1        
	//   88  141:fastore         
	//   89  142:dup             
	//   90  143:bipush          9
	//   91  145:ldc1            #108 <Float -1F>
	//   92  147:fastore         
	//   93  148:dup             
	//   94  149:bipush          10
	//   95  151:fconst_1        
	//   96  152:fastore         
	//   97  153:dup             
	//   98  154:bipush          11
	//   99  156:fconst_0        
	//  100  157:fastore         
	//  101  158:dup             
	//  102  159:bipush          12
	//  103  161:fconst_0        
	//  104  162:fastore         
	//  105  163:dup             
	//  106  164:bipush          13
	//  107  166:fconst_1        
	//  108  167:fastore         
	//  109  168:dup             
	//  110  169:bipush          14
	//  111  171:fconst_1        
	//  112  172:fastore         
	//  113  173:dup             
	//  114  174:bipush          15
	//  115  176:fconst_0        
	//  116  177:fastore         
	//  117  178:dup             
	//  118  179:bipush          16
	//  119  181:fconst_0        
	//  120  182:fastore         
	//  121  183:dup             
	//  122  184:bipush          17
	//  123  186:fconst_1        
	//  124  187:fastore         
	//  125  188:dup             
	//  126  189:bipush          18
	//  127  191:fconst_1        
	//  128  192:fastore         
	//  129  193:dup             
	//  130  194:bipush          19
	//  131  196:fconst_1        
	//  132  197:fastore         
	//  133  198:dup             
	//  134  199:bipush          20
	//  135  201:fconst_0        
	//  136  202:fastore         
	//  137  203:dup             
	//  138  204:bipush          21
	//  139  206:fconst_0        
	//  140  207:fastore         
	//  141  208:dup             
	//  142  209:bipush          22
	//  143  211:fconst_1        
	//  144  212:fastore         
	//  145  213:dup             
	//  146  214:bipush          23
	//  147  216:fconst_0        
	//  148  217:fastore         
	//  149  218:dup             
	//  150  219:bipush          24
	//  151  221:fconst_0        
	//  152  222:fastore         
	//  153  223:dup             
	//  154  224:bipush          25
	//  155  226:fconst_0        
	//  156  227:fastore         
	//  157  228:dup             
	//  158  229:bipush          26
	//  159  231:fconst_1        
	//  160  232:fastore         
	//  161  233:dup             
	//  162  234:bipush          27
	//  163  236:fconst_1        
	//  164  237:fastore         
	//  165  238:dup             
	//  166  239:bipush          28
	//  167  241:ldc1            #108 <Float -1F>
	//  168  243:fastore         
	//  169  244:dup             
	//  170  245:bipush          29
	//  171  247:fconst_0        
	//  172  248:fastore         
	//  173  249:dup             
	//  174  250:bipush          30
	//  175  252:fconst_0        
	//  176  253:fastore         
	//  177  254:dup             
	//  178  255:bipush          31
	//  179  257:fconst_0        
	//  180  258:fastore         
	//  181  259:dup             
	//  182  260:bipush          32
	//  183  262:fconst_0        
	//  184  263:fastore         
	//  185  264:dup             
	//  186  265:bipush          33
	//  187  267:fconst_0        
	//  188  268:fastore         
	//  189  269:dup             
	//  190  270:bipush          34
	//  191  272:fconst_0        
	//  192  273:fastore         
	//  193  274:dup             
	//  194  275:bipush          35
	//  195  277:fconst_1        
	//  196  278:fastore         
	//  197  279:putfield        #110 <Field float[] F>
		p = y1;
	//  198  282:aload_0         
	//  199  283:aload_2         
	//  200  284:putfield        #112 <Field y p>
		if(textoptions.getPosition() != null)
	//* 201  287:aload_1         
	//* 202  288:invokevirtual   #118 <Method LatLng TextOptions.getPosition()>
	//* 203  291:ifnull          302
			l = textoptions.getPosition();
	//  204  294:aload_0         
	//  205  295:aload_1         
	//  206  296:invokevirtual   #118 <Method LatLng TextOptions.getPosition()>
	//  207  299:putfield        #120 <Field LatLng l>
		setAlign(textoptions.getAlignX(), textoptions.getAlignY());
	//  208  302:aload_0         
	//  209  303:aload_1         
	//  210  304:invokevirtual   #124 <Method int TextOptions.getAlignX()>
	//  211  307:aload_1         
	//  212  308:invokevirtual   #127 <Method int TextOptions.getAlignY()>
	//  213  311:invokevirtual   #131 <Method void setAlign(int, int)>
		o = textoptions.isVisible();
	//  214  314:aload_0         
	//  215  315:aload_1         
	//  216  316:invokevirtual   #135 <Method boolean TextOptions.isVisible()>
	//  217  319:putfield        #86  <Field boolean o>
		r = textoptions.getText();
	//  218  322:aload_0         
	//  219  323:aload_1         
	//  220  324:invokevirtual   #139 <Method String TextOptions.getText()>
	//  221  327:putfield        #141 <Field String r>
		s = textoptions.getBackgroundColor();
	//  222  330:aload_0         
	//  223  331:aload_1         
	//  224  332:invokevirtual   #144 <Method int TextOptions.getBackgroundColor()>
	//  225  335:putfield        #146 <Field int s>
		t = textoptions.getFontColor();
	//  226  338:aload_0         
	//  227  339:aload_1         
	//  228  340:invokevirtual   #149 <Method int TextOptions.getFontColor()>
	//  229  343:putfield        #151 <Field int t>
		u = textoptions.getFontSize();
	//  230  346:aload_0         
	//  231  347:aload_1         
	//  232  348:invokevirtual   #154 <Method int TextOptions.getFontSize()>
	//  233  351:putfield        #156 <Field int u>
		q = textoptions.getObject();
	//  234  354:aload_0         
	//  235  355:aload_1         
	//  236  356:invokevirtual   #160 <Method Object TextOptions.getObject()>
	//  237  359:putfield        #162 <Field Object q>
		w = textoptions.getZIndex();
	//  238  362:aload_0         
	//  239  363:aload_1         
	//  240  364:invokevirtual   #166 <Method float TextOptions.getZIndex()>
	//  241  367:putfield        #168 <Field float w>
		v = textoptions.getTypeface();
	//  242  370:aload_0         
	//  243  371:aload_1         
	//  244  372:invokevirtual   #172 <Method Typeface TextOptions.getTypeface()>
	//  245  375:putfield        #174 <Field Typeface v>
		k = getId();
	//  246  378:aload_0         
	//  247  379:aload_0         
	//  248  380:invokevirtual   #177 <Method String getId()>
	//  249  383:putfield        #179 <Field String k>
		setRotateAngle(textoptions.getRotate());
	//  250  386:aload_0         
	//  251  387:aload_1         
	//  252  388:invokevirtual   #182 <Method float TextOptions.getRotate()>
	//  253  391:invokevirtual   #186 <Method void setRotateAngle(float)>
		b();
	//  254  394:aload_0         
	//  255  395:invokespecial   #188 <Method void b()>
		a();
	//  256  398:aload_0         
	//  257  399:invokevirtual   #190 <Method boolean a()>
	//  258  402:pop             
	//  259  403:return          
	}

	private int a(boolean flag, BitmapDescriptor bitmapdescriptor)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		ab ab1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		if(flag)
	//*   4    6:iload_1         
	//*   5    7:ifeq            40
		{
			ab ab2 = p.d().a(bitmapdescriptor);
	//    6   10:aload_0         
	//    7   11:getfield        #112 <Field y p>
	//    8   14:invokevirtual   #197 <Method s y.d()>
	//    9   17:aload_2         
	//   10   18:invokeinterface #202 <Method ab s.a(BitmapDescriptor)>
	//   11   23:astore          6
			ab1 = ab2;
	//   12   25:aload           6
	//   13   27:astore          5
			if(ab2 != null)
	//*  14   29:aload           6
	//*  15   31:ifnull          40
				return ab2.f();
	//   16   34:aload           6
	//   17   36:invokevirtual   #206 <Method int ab.f()>
	//   18   39:ireturn         
		}
		ab ab3 = ab1;
	//   19   40:aload           5
	//   20   42:astore          6
		if(ab1 == null)
	//*  21   44:aload           5
	//*  22   46:ifnonnull       60
			ab3 = new ab(bitmapdescriptor, 0);
	//   23   49:new             #204 <Class ab>
	//   24   52:dup             
	//   25   53:aload_2         
	//   26   54:iconst_0        
	//   27   55:invokespecial   #209 <Method void ab(BitmapDescriptor, int)>
	//   28   58:astore          6
		int i1 = ((int) (flag1));
	//   29   60:iload           4
	//   30   62:istore_3        
		if(true)
	//*  31   63:iconst_0        
	//*  32   64:ifne            137
		{
			bitmapdescriptor = ((BitmapDescriptor) (bitmapdescriptor.getBitmap()));
	//   33   67:aload_2         
	//   34   68:invokevirtual   #215 <Method Bitmap BitmapDescriptor.getBitmap()>
	//   35   71:astore_2        
			i1 = ((int) (flag1));
	//   36   72:iload           4
	//   37   74:istore_3        
			if(bitmapdescriptor != null)
	//*  38   75:aload_2         
	//*  39   76:ifnull          137
			{
				i1 = ((int) (flag1));
	//   40   79:iload           4
	//   41   81:istore_3        
				if(!((Bitmap) (bitmapdescriptor)).isRecycled())
	//*  42   82:aload_2         
	//*  43   83:invokevirtual   #220 <Method boolean Bitmap.isRecycled()>
	//*  44   86:ifne            137
				{
					i1 = d();
	//   45   89:aload_0         
	//   46   90:invokespecial   #222 <Method int d()>
	//   47   93:istore_3        
					ab3.a(i1);
	//   48   94:aload           6
	//   49   96:iload_3         
	//   50   97:invokevirtual   #225 <Method void ab.a(int)>
					if(flag)
	//*  51  100:iload_1         
	//*  52  101:ifeq            118
						p.d().a(ab3);
	//   53  104:aload_0         
	//   54  105:getfield        #112 <Field y p>
	//   55  108:invokevirtual   #197 <Method s y.d()>
	//   56  111:aload           6
	//   57  113:invokeinterface #228 <Method void s.a(ab)>
					C.add(((Object) (ab3)));
	//   58  118:aload_0         
	//   59  119:getfield        #103 <Field List C>
	//   60  122:aload           6
	//   61  124:invokeinterface #234 <Method boolean List.add(Object)>
	//   62  129:pop             
					fd.b(i1, ((Bitmap) (bitmapdescriptor)), true);
	//   63  130:iload_3         
	//   64  131:aload_2         
	//   65  132:iconst_1        
	//   66  133:invokestatic    #239 <Method int fd.b(int, Bitmap, boolean)>
	//   67  136:pop             
				}
			}
		}
		return i1;
	//   68  137:iload_3         
	//   69  138:ireturn         
	}

	private static String a(String s1)
	{
		a++;
	//    0    0:getstatic       #56  <Field int a>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:putstatic       #56  <Field int a>
		return (new StringBuilder()).append(s1).append(a).toString();
	//    4    8:new             #242 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #243 <Method void StringBuilder()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #247 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:getstatic       #56  <Field int a>
	//   10   22:invokevirtual   #250 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #253 <Method String StringBuilder.toString()>
	//   12   28:areturn         
	}

	private void b()
	{
		if(r == null || r.trim().length() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field String r>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #141 <Field String r>
	//*   5   11:invokevirtual   #260 <Method String String.trim()>
	//*   6   14:invokevirtual   #263 <Method int String.length()>
	//*   7   17:ifgt            21
			return;
	//    8   20:return          
		try
		{
			y.setTypeface(v);
	//    9   21:aload_0         
	//   10   22:getfield        #96  <Field Paint y>
	//   11   25:aload_0         
	//   12   26:getfield        #174 <Field Typeface v>
	//   13   29:invokevirtual   #267 <Method Typeface Paint.setTypeface(Typeface)>
	//   14   32:pop             
			y.setSubpixelText(true);
	//   15   33:aload_0         
	//   16   34:getfield        #96  <Field Paint y>
	//   17   37:iconst_1        
	//   18   38:invokevirtual   #271 <Method void Paint.setSubpixelText(boolean)>
			y.setAntiAlias(true);
	//   19   41:aload_0         
	//   20   42:getfield        #96  <Field Paint y>
	//   21   45:iconst_1        
	//   22   46:invokevirtual   #274 <Method void Paint.setAntiAlias(boolean)>
			y.setStrokeWidth(5F);
	//   23   49:aload_0         
	//   24   50:getfield        #96  <Field Paint y>
	//   25   53:ldc2            #275 <Float 5F>
	//   26   56:invokevirtual   #278 <Method void Paint.setStrokeWidth(float)>
			y.setStrokeCap(android.graphics.Paint.Cap.ROUND);
	//   27   59:aload_0         
	//   28   60:getfield        #96  <Field Paint y>
	//   29   63:getstatic       #284 <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
	//   30   66:invokevirtual   #288 <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
			y.setTextSize(u);
	//   31   69:aload_0         
	//   32   70:getfield        #96  <Field Paint y>
	//   33   73:aload_0         
	//   34   74:getfield        #156 <Field int u>
	//   35   77:i2f             
	//   36   78:invokevirtual   #291 <Method void Paint.setTextSize(float)>
			y.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   37   81:aload_0         
	//   38   82:getfield        #96  <Field Paint y>
	//   39   85:getstatic       #297 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   40   88:invokevirtual   #301 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			y.setColor(t);
	//   41   91:aload_0         
	//   42   92:getfield        #96  <Field Paint y>
	//   43   95:aload_0         
	//   44   96:getfield        #151 <Field int t>
	//   45   99:invokevirtual   #304 <Method void Paint.setColor(int)>
			Object obj = ((Object) (y.getFontMetrics()));
	//   46  102:aload_0         
	//   47  103:getfield        #96  <Field Paint y>
	//   48  106:invokevirtual   #308 <Method android.graphics.Paint$FontMetrics Paint.getFontMetrics()>
	//   49  109:astore_3        
			int i1 = (int)(((android.graphics.Paint.FontMetrics) (obj)).descent - ((android.graphics.Paint.FontMetrics) (obj)).ascent);
	//   50  110:aload_3         
	//   51  111:getfield        #313 <Field float android.graphics.Paint$FontMetrics.descent>
	//   52  114:aload_3         
	//   53  115:getfield        #316 <Field float android.graphics.Paint$FontMetrics.ascent>
	//   54  118:fsub            
	//   55  119:f2i             
	//   56  120:istore_1        
			int j1 = (int)(((float)i1 - ((android.graphics.Paint.FontMetrics) (obj)).bottom - ((android.graphics.Paint.FontMetrics) (obj)).top) / 2.0F);
	//   57  121:iload_1         
	//   58  122:i2f             
	//   59  123:aload_3         
	//   60  124:getfield        #319 <Field float android.graphics.Paint$FontMetrics.bottom>
	//   61  127:fsub            
	//   62  128:aload_3         
	//   63  129:getfield        #322 <Field float android.graphics.Paint$FontMetrics.top>
	//   64  132:fsub            
	//   65  133:fconst_2        
	//   66  134:fdiv            
	//   67  135:f2i             
	//   68  136:istore_2        
			y.getTextBounds(r, 0, r.length(), x);
	//   69  137:aload_0         
	//   70  138:getfield        #96  <Field Paint y>
	//   71  141:aload_0         
	//   72  142:getfield        #141 <Field String r>
	//   73  145:iconst_0        
	//   74  146:aload_0         
	//   75  147:getfield        #141 <Field String r>
	//   76  150:invokevirtual   #263 <Method int String.length()>
	//   77  153:aload_0         
	//   78  154:getfield        #91  <Field Rect x>
	//   79  157:invokevirtual   #326 <Method void Paint.getTextBounds(String, int, int, Rect)>
			obj = ((Object) (Bitmap.createBitmap(x.width() + 6, i1, android.graphics.Bitmap.Config.ARGB_8888)));
	//   80  160:aload_0         
	//   81  161:getfield        #91  <Field Rect x>
	//   82  164:invokevirtual   #329 <Method int Rect.width()>
	//   83  167:bipush          6
	//   84  169:iadd            
	//   85  170:iload_1         
	//   86  171:getstatic       #335 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   87  174:invokestatic    #339 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   88  177:astore_3        
			Canvas canvas = new Canvas(((Bitmap) (obj)));
	//   89  178:new             #341 <Class Canvas>
	//   90  181:dup             
	//   91  182:aload_3         
	//   92  183:invokespecial   #344 <Method void Canvas(Bitmap)>
	//   93  186:astore          4
			canvas.drawColor(s);
	//   94  188:aload           4
	//   95  190:aload_0         
	//   96  191:getfield        #146 <Field int s>
	//   97  194:invokevirtual   #347 <Method void Canvas.drawColor(int)>
			canvas.drawText(r, x.centerX() + 3, j1, y);
	//   98  197:aload           4
	//   99  199:aload_0         
	//  100  200:getfield        #141 <Field String r>
	//  101  203:aload_0         
	//  102  204:getfield        #91  <Field Rect x>
	//  103  207:invokevirtual   #350 <Method int Rect.centerX()>
	//  104  210:iconst_3        
	//  105  211:iadd            
	//  106  212:i2f             
	//  107  213:iload_2         
	//  108  214:i2f             
	//  109  215:aload_0         
	//  110  216:getfield        #96  <Field Paint y>
	//  111  219:invokevirtual   #354 <Method void Canvas.drawText(String, float, float, Paint)>
			h = BitmapDescriptorFactory.fromBitmap(((Bitmap) (obj)));
	//  112  222:aload_0         
	//  113  223:aload_3         
	//  114  224:invokestatic    #360 <Method BitmapDescriptor BitmapDescriptorFactory.fromBitmap(Bitmap)>
	//  115  227:putfield        #362 <Field BitmapDescriptor h>
			i = h.getWidth();
	//  116  230:aload_0         
	//  117  231:aload_0         
	//  118  232:getfield        #362 <Field BitmapDescriptor h>
	//  119  235:invokevirtual   #365 <Method int BitmapDescriptor.getWidth()>
	//  120  238:putfield        #367 <Field int i>
			j = h.getHeight();
	//  121  241:aload_0         
	//  122  242:aload_0         
	//  123  243:getfield        #362 <Field BitmapDescriptor h>
	//  124  246:invokevirtual   #370 <Method int BitmapDescriptor.getHeight()>
	//  125  249:putfield        #372 <Field int j>
			return;
	//  126  252:return          
		}
		catch(Throwable throwable)
	//* 127  253:astore_3        
		{
			hm.c(throwable, "TextDelegateImp", "initBitmap");
	//  128  254:aload_3         
	//  129  255:ldc2            #374 <String "TextDelegateImp">
	//  130  258:ldc2            #376 <String "initBitmap">
	//  131  261:invokestatic    #381 <Method void hm.c(Throwable, String, String)>
		}
	//  132  264:return          
	}

	private void b(s s1, float af[], int i1, float f1)
		throws RemoteException
	{
		float f2 = f1 * (float)i;
	//    0    0:fload           4
	//    1    2:aload_0         
	//    2    3:getfield        #367 <Field int i>
	//    3    6:i2f             
	//    4    7:fmul            
	//    5    8:fstore          5
		f1 *= j;
	//    6   10:fload           4
	//    7   12:aload_0         
	//    8   13:getfield        #372 <Field int j>
	//    9   16:i2f             
	//   10   17:fmul            
	//   11   18:fstore          4
		float f3 = f.x;
	//   12   20:aload_0         
	//   13   21:getfield        #79  <Field FPoint f>
	//   14   24:getfield        #384 <Field float FPoint.x>
	//   15   27:fstore          6
		float f4 = f.y;
	//   16   29:aload_0         
	//   17   30:getfield        #79  <Field FPoint f>
	//   18   33:getfield        #386 <Field float FPoint.y>
	//   19   36:fstore          7
		float f5 = s1.getMapConfig().getSC();
	//   20   38:aload_1         
	//   21   39:invokeinterface #390 <Method MapConfig s.getMapConfig()>
	//   22   44:invokevirtual   #395 <Method float MapConfig.getSC()>
	//   23   47:fstore          8
		F[0] = f3 - m * f2;
	//   24   49:aload_0         
	//   25   50:getfield        #110 <Field float[] F>
	//   26   53:iconst_0        
	//   27   54:fload           6
	//   28   56:aload_0         
	//   29   57:getfield        #82  <Field float m>
	//   30   60:fload           5
	//   31   62:fmul            
	//   32   63:fsub            
	//   33   64:fastore         
		F[1] = (1.0F - n) * f1 + f4;
	//   34   65:aload_0         
	//   35   66:getfield        #110 <Field float[] F>
	//   36   69:iconst_1        
	//   37   70:fconst_1        
	//   38   71:aload_0         
	//   39   72:getfield        #84  <Field float n>
	//   40   75:fsub            
	//   41   76:fload           4
	//   42   78:fmul            
	//   43   79:fload           7
	//   44   81:fadd            
	//   45   82:fastore         
		F[2] = f3;
	//   46   83:aload_0         
	//   47   84:getfield        #110 <Field float[] F>
	//   48   87:iconst_2        
	//   49   88:fload           6
	//   50   90:fastore         
		F[3] = f4;
	//   51   91:aload_0         
	//   52   92:getfield        #110 <Field float[] F>
	//   53   95:iconst_3        
	//   54   96:fload           7
	//   55   98:fastore         
		F[6] = b;
	//   56   99:aload_0         
	//   57  100:getfield        #110 <Field float[] F>
	//   58  103:bipush          6
	//   59  105:aload_0         
	//   60  106:getfield        #65  <Field float b>
	//   61  109:fastore         
		F[7] = f5;
	//   62  110:aload_0         
	//   63  111:getfield        #110 <Field float[] F>
	//   64  114:bipush          7
	//   65  116:fload           8
	//   66  118:fastore         
		F[9] = (1.0F - m) * f2 + f3;
	//   67  119:aload_0         
	//   68  120:getfield        #110 <Field float[] F>
	//   69  123:bipush          9
	//   70  125:fconst_1        
	//   71  126:aload_0         
	//   72  127:getfield        #82  <Field float m>
	//   73  130:fsub            
	//   74  131:fload           5
	//   75  133:fmul            
	//   76  134:fload           6
	//   77  136:fadd            
	//   78  137:fastore         
		F[10] = (1.0F - n) * f1 + f4;
	//   79  138:aload_0         
	//   80  139:getfield        #110 <Field float[] F>
	//   81  142:bipush          10
	//   82  144:fconst_1        
	//   83  145:aload_0         
	//   84  146:getfield        #84  <Field float n>
	//   85  149:fsub            
	//   86  150:fload           4
	//   87  152:fmul            
	//   88  153:fload           7
	//   89  155:fadd            
	//   90  156:fastore         
		F[11] = f3;
	//   91  157:aload_0         
	//   92  158:getfield        #110 <Field float[] F>
	//   93  161:bipush          11
	//   94  163:fload           6
	//   95  165:fastore         
		F[12] = f4;
	//   96  166:aload_0         
	//   97  167:getfield        #110 <Field float[] F>
	//   98  170:bipush          12
	//   99  172:fload           7
	//  100  174:fastore         
		F[15] = b;
	//  101  175:aload_0         
	//  102  176:getfield        #110 <Field float[] F>
	//  103  179:bipush          15
	//  104  181:aload_0         
	//  105  182:getfield        #65  <Field float b>
	//  106  185:fastore         
		F[16] = f5;
	//  107  186:aload_0         
	//  108  187:getfield        #110 <Field float[] F>
	//  109  190:bipush          16
	//  110  192:fload           8
	//  111  194:fastore         
		F[18] = (1.0F - m) * f2 + f3;
	//  112  195:aload_0         
	//  113  196:getfield        #110 <Field float[] F>
	//  114  199:bipush          18
	//  115  201:fconst_1        
	//  116  202:aload_0         
	//  117  203:getfield        #82  <Field float m>
	//  118  206:fsub            
	//  119  207:fload           5
	//  120  209:fmul            
	//  121  210:fload           6
	//  122  212:fadd            
	//  123  213:fastore         
		F[19] = f4 - n * f1;
	//  124  214:aload_0         
	//  125  215:getfield        #110 <Field float[] F>
	//  126  218:bipush          19
	//  127  220:fload           7
	//  128  222:aload_0         
	//  129  223:getfield        #84  <Field float n>
	//  130  226:fload           4
	//  131  228:fmul            
	//  132  229:fsub            
	//  133  230:fastore         
		F[20] = f3;
	//  134  231:aload_0         
	//  135  232:getfield        #110 <Field float[] F>
	//  136  235:bipush          20
	//  137  237:fload           6
	//  138  239:fastore         
		F[21] = f4;
	//  139  240:aload_0         
	//  140  241:getfield        #110 <Field float[] F>
	//  141  244:bipush          21
	//  142  246:fload           7
	//  143  248:fastore         
		F[24] = b;
	//  144  249:aload_0         
	//  145  250:getfield        #110 <Field float[] F>
	//  146  253:bipush          24
	//  147  255:aload_0         
	//  148  256:getfield        #65  <Field float b>
	//  149  259:fastore         
		F[25] = f5;
	//  150  260:aload_0         
	//  151  261:getfield        #110 <Field float[] F>
	//  152  264:bipush          25
	//  153  266:fload           8
	//  154  268:fastore         
		F[27] = f3 - m * f2;
	//  155  269:aload_0         
	//  156  270:getfield        #110 <Field float[] F>
	//  157  273:bipush          27
	//  158  275:fload           6
	//  159  277:aload_0         
	//  160  278:getfield        #82  <Field float m>
	//  161  281:fload           5
	//  162  283:fmul            
	//  163  284:fsub            
	//  164  285:fastore         
		F[28] = f4 - n * f1;
	//  165  286:aload_0         
	//  166  287:getfield        #110 <Field float[] F>
	//  167  290:bipush          28
	//  168  292:fload           7
	//  169  294:aload_0         
	//  170  295:getfield        #84  <Field float n>
	//  171  298:fload           4
	//  172  300:fmul            
	//  173  301:fsub            
	//  174  302:fastore         
		F[29] = f3;
	//  175  303:aload_0         
	//  176  304:getfield        #110 <Field float[] F>
	//  177  307:bipush          29
	//  178  309:fload           6
	//  179  311:fastore         
		F[30] = f4;
	//  180  312:aload_0         
	//  181  313:getfield        #110 <Field float[] F>
	//  182  316:bipush          30
	//  183  318:fload           7
	//  184  320:fastore         
		F[33] = b;
	//  185  321:aload_0         
	//  186  322:getfield        #110 <Field float[] F>
	//  187  325:bipush          33
	//  188  327:aload_0         
	//  189  328:getfield        #65  <Field float b>
	//  190  331:fastore         
		F[34] = f5;
	//  191  332:aload_0         
	//  192  333:getfield        #110 <Field float[] F>
	//  193  336:bipush          34
	//  194  338:fload           8
	//  195  340:fastore         
		System.arraycopy(((Object) (F)), 0, ((Object) (af)), i1, F.length);
	//  196  341:aload_0         
	//  197  342:getfield        #110 <Field float[] F>
	//  198  345:iconst_0        
	//  199  346:aload_2         
	//  200  347:iload_3         
	//  201  348:aload_0         
	//  202  349:getfield        #110 <Field float[] F>
	//  203  352:arraylength     
	//  204  353:invokestatic    #401 <Method void System.arraycopy(Object, int, Object, int, int)>
	//  205  356:return          
	}

	private void c()
	{
		if(p.d() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field y p>
	//*   2    4:invokevirtual   #197 <Method s y.d()>
	//*   3    7:ifnull          23
			p.d().setRunLowFrame(false);
	//    4   10:aload_0         
	//    5   11:getfield        #112 <Field y p>
	//    6   14:invokevirtual   #197 <Method s y.d()>
	//    7   17:iconst_0        
	//    8   18:invokeinterface #404 <Method void s.setRunLowFrame(boolean)>
	//    9   23:return          
	}

	private int d()
	{
		int ai[] = new int[1];
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:astore_1        
		int[] _tmp = ai;
	//    3    4:aload_1         
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:iconst_0        
	//    7    8:iastore         
	//    8    9:pop             
		ai[0] = 0;
		GLES20.glGenTextures(1, ai, 0);
	//    9   10:iconst_1        
	//   10   11:aload_1         
	//   11   12:iconst_0        
	//   12   13:invokestatic    #410 <Method void GLES20.glGenTextures(int, int[], int)>
		return ai[0];
	//   13   16:aload_1         
	//   14   17:iconst_0        
	//   15   18:iaload          
	//   16   19:ireturn         
	}

	private void e()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b();
	//    2    2:aload_0         
	//    3    3:invokespecial   #188 <Method void b()>
		E = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #107 <Field boolean E>
		c();
	//    7   11:aload_0         
	//    8   12:invokespecial   #412 <Method void c()>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		Exception exception;
		exception;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw exception;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public void a(s s1)
	{
		if(E)
			break MISSING_BLOCK_LABEL_55;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean E>
	//    2    4:ifne            55
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 12)
	//*   3    7:getstatic       #418 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          12
	//*   5   12:icmplt          56
			flag = true;
	//    6   15:iconst_1        
	//    7   16:istore_2        
		else
	//*   8   17:goto            20
	//*   9   20:aload_0         
	//*  10   21:aload_0         
	//*  11   22:iload_2         
	//*  12   23:aload_0         
	//*  13   24:getfield        #362 <Field BitmapDescriptor h>
	//*  14   27:invokespecial   #420 <Method int a(boolean, BitmapDescriptor)>
	//*  15   30:putfield        #422 <Field int g>
	//*  16   33:aload_0         
	//*  17   34:iconst_1        
	//*  18   35:putfield        #107 <Field boolean E>
	//*  19   38:return          
	//*  20   39:astore_1        
	//*  21   40:aload_1         
	//*  22   41:ldc2            #374 <String "TextDelegateImp">
	//*  23   44:ldc2            #424 <String "loadtexture">
	//*  24   47:invokestatic    #381 <Method void hm.c(Throwable, String, String)>
	//*  25   50:aload_1         
	//*  26   51:invokevirtual   #427 <Method void Throwable.printStackTrace()>
	//*  27   54:return          
	//*  28   55:return          
			flag = false;
	//   29   56:iconst_0        
	//   30   57:istore_2        
		try
		{
			g = a(flag, h);
			E = true;
			return;
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
		{
			hm.c(((Throwable) (s1)), "TextDelegateImp", "loadtexture");
		}
		((Throwable) (s1)).printStackTrace();
		return;
	//*  31   58:goto            20
	}

	public void a(s s1, float af[], int i1, float f1)
	{
		if(!o || D || l == null || h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean o>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #105 <Field boolean D>
	//*   5   11:ifne            28
	//*   6   14:aload_0         
	//*   7   15:getfield        #120 <Field LatLng l>
	//*   8   18:ifnull          28
	//*   9   21:aload_0         
	//*  10   22:getfield        #362 <Field BitmapDescriptor h>
	//*  11   25:ifnonnull       29
			return;
	//   12   28:return          
		f.x = z - s1.getMapConfig().getSX();
	//   13   29:aload_0         
	//   14   30:getfield        #79  <Field FPoint f>
	//   15   33:aload_0         
	//   16   34:getfield        #429 <Field int z>
	//   17   37:aload_1         
	//   18   38:invokeinterface #390 <Method MapConfig s.getMapConfig()>
	//   19   43:invokevirtual   #432 <Method int MapConfig.getSX()>
	//   20   46:isub            
	//   21   47:i2f             
	//   22   48:putfield        #384 <Field float FPoint.x>
		f.y = A - s1.getMapConfig().getSY();
	//   23   51:aload_0         
	//   24   52:getfield        #79  <Field FPoint f>
	//   25   55:aload_0         
	//   26   56:getfield        #434 <Field int A>
	//   27   59:aload_1         
	//   28   60:invokeinterface #390 <Method MapConfig s.getMapConfig()>
	//   29   65:invokevirtual   #437 <Method int MapConfig.getSY()>
	//   30   68:isub            
	//   31   69:i2f             
	//   32   70:putfield        #386 <Field float FPoint.y>
		try
		{
			b(s1, af, i1, f1);
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:aload_2         
	//   36   76:iload_3         
	//   37   77:fload           4
	//   38   79:invokespecial   #439 <Method void b(s, float[], int, float)>
			return;
	//   39   82:return          
		}
		// Misplaced declaration of an exception variable
		catch(s s1)
	//*  40   83:astore_1        
		{
			hm.c(((Throwable) (s1)), "TextDelegateImp", "drawMarker");
	//   41   84:aload_1         
	//   42   85:ldc2            #374 <String "TextDelegateImp">
	//   43   88:ldc2            #441 <String "drawMarker">
	//   44   91:invokestatic    #381 <Method void hm.c(Throwable, String, String)>
		}
	//   45   94:return          
	}

	public boolean a()
	{
		if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field LatLng l>
	//*   2    4:ifnonnull       9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			IPoint ipoint = IPoint.obtain();
	//    5    9:invokestatic    #446 <Method IPoint IPoint.obtain()>
	//    6   12:astore_1        
			GLMapState.lonlat2Geo(l.longitude, l.latitude, ipoint);
	//    7   13:aload_0         
	//    8   14:getfield        #120 <Field LatLng l>
	//    9   17:getfield        #451 <Field double LatLng.longitude>
	//   10   20:aload_0         
	//   11   21:getfield        #120 <Field LatLng l>
	//   12   24:getfield        #454 <Field double LatLng.latitude>
	//   13   27:aload_1         
	//   14   28:invokestatic    #460 <Method void GLMapState.lonlat2Geo(double, double, IPoint)>
			z = ipoint.x;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #462 <Field int IPoint.x>
	//   18   36:putfield        #429 <Field int z>
			A = ipoint.y;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #464 <Field int IPoint.y>
	//   22   44:putfield        #434 <Field int A>
			p.d().a(l.latitude, l.longitude, f);
	//   23   47:aload_0         
	//   24   48:getfield        #112 <Field y p>
	//   25   51:invokevirtual   #197 <Method s y.d()>
	//   26   54:aload_0         
	//   27   55:getfield        #120 <Field LatLng l>
	//   28   58:getfield        #454 <Field double LatLng.latitude>
	//   29   61:aload_0         
	//   30   62:getfield        #120 <Field LatLng l>
	//   31   65:getfield        #451 <Field double LatLng.longitude>
	//   32   68:aload_0         
	//   33   69:getfield        #79  <Field FPoint f>
	//   34   72:invokeinterface #467 <Method void s.a(double, double, FPoint)>
			ipoint.recycle();
	//   35   77:aload_1         
	//   36   78:invokevirtual   #470 <Method void IPoint.recycle()>
			return true;
	//   37   81:iconst_1        
	//   38   82:ireturn         
		}
	}

	public void b(boolean flag)
	{
		B = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field boolean B>
	//    3    5:return          
	}

	public void destroy(boolean flag)
	{
		int i1;
		ab ab1;
		try
		{
			D = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #105 <Field boolean D>
		}
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #474 <Method boolean remove()>
	//*   7   13:pop             
	//*   8   14:aload_0         
	//*   9   15:getfield        #103 <Field List C>
	//*  10   18:ifnull          119
	//*  11   21:aload_0         
	//*  12   22:getfield        #103 <Field List C>
	//*  13   25:invokeinterface #477 <Method int List.size()>
	//*  14   30:ifle            119
	//*  15   33:iconst_0        
	//*  16   34:istore_2        
	//*  17   35:iload_2         
	//*  18   36:aload_0         
	//*  19   37:getfield        #103 <Field List C>
	//*  20   40:invokeinterface #477 <Method int List.size()>
	//*  21   45:icmpge          110
	//*  22   48:aload_0         
	//*  23   49:getfield        #103 <Field List C>
	//*  24   52:iload_2         
	//*  25   53:invokeinterface #481 <Method Object List.get(int)>
	//*  26   58:checkcast       #204 <Class ab>
	//*  27   61:astore_3        
	//*  28   62:aload_3         
	//*  29   63:ifnull          175
	//*  30   66:aload_0         
	//*  31   67:getfield        #112 <Field y p>
	//*  32   70:ifnull          175
	//*  33   73:aload_0         
	//*  34   74:getfield        #112 <Field y p>
	//*  35   77:aload_3         
	//*  36   78:invokevirtual   #482 <Method void y.a(ab)>
	//*  37   81:aload_0         
	//*  38   82:getfield        #112 <Field y p>
	//*  39   85:invokevirtual   #197 <Method s y.d()>
	//*  40   88:ifnull          175
	//*  41   91:aload_0         
	//*  42   92:getfield        #112 <Field y p>
	//*  43   95:invokevirtual   #197 <Method s y.d()>
	//*  44   98:aload_3         
	//*  45   99:invokevirtual   #484 <Method String ab.j()>
	//*  46  102:invokeinterface #487 <Method void s.c(String)>
	//*  47  107:goto            175
	//*  48  110:aload_0         
	//*  49  111:getfield        #103 <Field List C>
	//*  50  114:invokeinterface #490 <Method void List.clear()>
	//*  51  119:aload_0         
	//*  52  120:getfield        #362 <Field BitmapDescriptor h>
	//*  53  123:ifnull          138
	//*  54  126:aload_0         
	//*  55  127:getfield        #362 <Field BitmapDescriptor h>
	//*  56  130:invokevirtual   #491 <Method void BitmapDescriptor.recycle()>
	//*  57  133:aload_0         
	//*  58  134:aconst_null     
	//*  59  135:putfield        #362 <Field BitmapDescriptor h>
	//*  60  138:aload_0         
	//*  61  139:aconst_null     
	//*  62  140:putfield        #120 <Field LatLng l>
	//*  63  143:aload_0         
	//*  64  144:aconst_null     
	//*  65  145:putfield        #162 <Field Object q>
	//*  66  148:return          
		catch(Throwable throwable)
	//*  67  149:astore_3        
		{
			hm.c(throwable, "TextDelegateImp", "destroy");
	//   68  150:aload_3         
	//   69  151:ldc2            #374 <String "TextDelegateImp">
	//   70  154:ldc2            #492 <String "destroy">
	//   71  157:invokestatic    #381 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//   72  160:aload_3         
	//   73  161:invokevirtual   #427 <Method void Throwable.printStackTrace()>
			Log.d("destroy erro", "TextDelegateImp destroy");
	//   74  164:ldc2            #494 <String "destroy erro">
	//   75  167:ldc2            #496 <String "TextDelegateImp destroy">
	//   76  170:invokestatic    #501 <Method int Log.d(String, String)>
	//   77  173:pop             
			return;
	//   78  174:return          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
		remove();
		if(C == null || C.size() <= 0) goto _L2; else goto _L1
_L1:
		i1 = 0;
_L8:
		if(i1 >= C.size()) goto _L4; else goto _L3
_L3:
		ab1 = (ab)C.get(i1);
		if(ab1 == null) goto _L6; else goto _L5
_L5:
		if(p != null)
		{
			p.a(ab1);
			if(p.d() != null)
				p.d().c(ab1.j());
		}
		  goto _L6
_L4:
		C.clear();
_L2:
		if(h != null)
		{
			h.recycle();
			h = null;
		}
		l = null;
		q = null;
		return;
_L6:
		i1++;
	//   79  175:iload_2         
	//   80  176:iconst_1        
	//   81  177:iadd            
	//   82  178:istore_2        
		if(true) goto _L8; else goto _L7
	//   83  179:goto            35
_L7:
	}

	public boolean equalsRemote(IOverlayImage ioverlayimage)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlayimage))) || ioverlayimage.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #506 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #509 <Method String IOverlayImage.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #177 <Method String getId()>
	//    8   18:invokevirtual   #510 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int getAlignX()
		throws RemoteException
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int d>
	//    2    4:ireturn         
	}

	public int getAlignY()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int e>
	//    2    4:ireturn         
	}

	public float getAnchorU()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float m>
	//    2    4:freturn         
	}

	public float getAnchorV()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field float n>
	//    2    4:freturn         
	}

	public int getBackgroundColor()
		throws RemoteException
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field int s>
	//    2    4:ireturn         
	}

	public int getFontColor()
		throws RemoteException
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field int t>
	//    2    4:ireturn         
	}

	public int getFontSize()
		throws RemoteException
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field int u>
	//    2    4:ireturn         
	}

	public String getId()
	{
		if(k == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field String k>
	//*   2    4:ifnonnull       17
			k = a("Text");
	//    3    7:aload_0         
	//    4    8:ldc2            #514 <String "Text">
	//    5   11:invokestatic    #516 <Method String a(String)>
	//    6   14:putfield        #179 <Field String k>
		return k;
	//    7   17:aload_0         
	//    8   18:getfield        #179 <Field String k>
	//    9   21:areturn         
	}

	public Object getObject()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field Object q>
	//    2    4:areturn         
	}

	public LatLng getPosition()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field LatLng l>
	//    2    4:areturn         
	}

	public float getRotateAngle()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float c>
	//    2    4:freturn         
	}

	public String getText()
		throws RemoteException
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field String r>
	//    2    4:areturn         
	}

	public Typeface getTypeface()
		throws RemoteException
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field Typeface v>
	//    2    4:areturn         
	}

	public float getZIndex()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field float w>
	//    2    4:freturn         
	}

	public boolean h()
	{
		Rectangle rectangle = p.d().getMapConfig().getGeoRectangle();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field y p>
	//    2    4:invokevirtual   #197 <Method s y.d()>
	//    3    7:invokeinterface #390 <Method MapConfig s.getMapConfig()>
	//    4   12:invokevirtual   #521 <Method Rectangle MapConfig.getGeoRectangle()>
	//    5   15:astore_1        
		return rectangle != null && rectangle.contains(z, A);
	//    6   16:aload_1         
	//    7   17:ifnull          37
	//    8   20:aload_1         
	//    9   21:aload_0         
	//   10   22:getfield        #429 <Field int z>
	//   11   25:aload_0         
	//   12   26:getfield        #434 <Field int A>
	//   13   29:invokevirtual   #527 <Method boolean Rectangle.contains(int, int)>
	//   14   32:ifeq            37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	public int hashCodeRemote()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #531 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public Rect i()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isInfoWindowShown()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisible()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field boolean o>
	//    2    4:ireturn         
	}

	public boolean j()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int k()
	{
		int i1;
		try
		{
			i1 = g;
	//    0    0:aload_0         
	//    1    1:getfield        #422 <Field int g>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		catch(Throwable throwable)
	//*   5    7:astore_2        
		{
			return 0;
	//    6    8:iconst_0        
	//    7    9:ireturn         
		}
		return i1;
	}

	public boolean l()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean B>
	//    2    4:ireturn         
	}

	public boolean remove()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		c();
	//    2    2:aload_0         
	//    3    3:invokespecial   #412 <Method void c()>
		o = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #86  <Field boolean o>
		flag = p.a(((de) (this)));
	//    7   11:aload_0         
	//    8   12:getfield        #112 <Field y p>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #536 <Method boolean y.a(de)>
	//   11   19:istore_1        
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return flag;
	//   14   22:iload_1         
	//   15   23:ireturn         
		Exception exception;
		exception;
	//   16   24:astore_2        
	//*  17   25:aload_0         
		throw exception;
	//   18   26:monitorexit     
	//   19   27:aload_2         
	//   20   28:athrow          
	}

	public void setAlign(int i1, int j1)
		throws RemoteException
	{
		d = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int d>
		switch(i1)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     1 4: default 36
	//	               1 48
	//	               2 56
	//	               3 64
	//	               4 39
	//*   5   36:goto            64
		case 4: // '\004'
			m = 0.5F;
	//    6   39:aload_0         
	//    7   40:ldc1            #80  <Float 0.5F>
	//    8   42:putfield        #82  <Field float m>
			break;

	//*   9   45:goto            70
		case 1: // '\001'
			m = 0.0F;
	//   10   48:aload_0         
	//   11   49:fconst_0        
	//   12   50:putfield        #82  <Field float m>
			break;

	//*  13   53:goto            70
		case 2: // '\002'
			m = 1.0F;
	//   14   56:aload_0         
	//   15   57:fconst_1        
	//   16   58:putfield        #82  <Field float m>
			break;

	//*  17   61:goto            70
		case 3: // '\003'
		default:
			m = 0.5F;
	//   18   64:aload_0         
	//   19   65:ldc1            #80  <Float 0.5F>
	//   20   67:putfield        #82  <Field float m>
			break;
		}
		e = j1;
	//   21   70:aload_0         
	//   22   71:iload_2         
	//   23   72:putfield        #71  <Field int e>
		switch(j1)
	//*  24   75:iload_2         
		{
	//*  25   76:lookupswitch    3: default 112
	//	               8: 124
	//	               16: 132
	//	               32: 115
	//*  26  112:goto            140
		case 32: // ' '
			n = 0.5F;
	//   27  115:aload_0         
	//   28  116:ldc1            #80  <Float 0.5F>
	//   29  118:putfield        #84  <Field float n>
			break;

	//*  30  121:goto            146
		case 8: // '\b'
			n = 0.0F;
	//   31  124:aload_0         
	//   32  125:fconst_0        
	//   33  126:putfield        #84  <Field float n>
			break;

	//*  34  129:goto            146
		case 16: // '\020'
			n = 1.0F;
	//   35  132:aload_0         
	//   36  133:fconst_1        
	//   37  134:putfield        #84  <Field float n>
			break;

	//*  38  137:goto            146
		default:
			n = 0.5F;
	//   39  140:aload_0         
	//   40  141:ldc1            #80  <Float 0.5F>
	//   41  143:putfield        #84  <Field float n>
			break;
		}
		c();
	//   42  146:aload_0         
	//   43  147:invokespecial   #412 <Method void c()>
	//   44  150:return          
	}

	public void setAnchor(float f1, float f2)
	{
	//    0    0:return          
	}

	public void setBackgroundColor(int i1)
		throws RemoteException
	{
		s = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field int s>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #541 <Method void e()>
	//    5    9:return          
	}

	public void setFontColor(int i1)
		throws RemoteException
	{
		t = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #151 <Field int t>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #541 <Method void e()>
	//    5    9:return          
	}

	public void setFontSize(int i1)
		throws RemoteException
	{
		u = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #156 <Field int u>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #541 <Method void e()>
	//    5    9:return          
	}

	public void setObject(Object obj)
	{
		q = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #162 <Field Object q>
	//    3    5:return          
	}

	public void setPosition(LatLng latlng)
	{
		l = latlng;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field LatLng l>
		a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #190 <Method boolean a()>
	//    5    9:pop             
		c();
	//    6   10:aload_0         
	//    7   11:invokespecial   #412 <Method void c()>
	//    8   14:return          
	}

	public void setRotateAngle(float f1)
	{
		c = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #67  <Field float c>
		b = (-f1 % 360F + 360F) % 360F;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:fneg            
	//    6    8:ldc2            #548 <Float 360F>
	//    7   11:frem            
	//    8   12:ldc2            #548 <Float 360F>
	//    9   15:fadd            
	//   10   16:ldc2            #548 <Float 360F>
	//   11   19:frem            
	//   12   20:putfield        #65  <Field float b>
		c();
	//   13   23:aload_0         
	//   14   24:invokespecial   #412 <Method void c()>
	//   15   27:return          
	}

	public void setText(String s1)
		throws RemoteException
	{
		r = s1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field String r>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #541 <Method void e()>
	//    5    9:return          
	}

	public void setTypeface(Typeface typeface)
		throws RemoteException
	{
		v = typeface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #174 <Field Typeface v>
		e();
	//    3    5:aload_0         
	//    4    6:invokespecial   #541 <Method void e()>
	//    5    9:return          
	}

	public void setVisible(boolean flag)
	{
		if(o == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean o>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			o = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #86  <Field boolean o>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #412 <Method void c()>
			return;
	//   10   18:return          
		}
	}

	public void setZIndex(float f1)
	{
		w = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #168 <Field float w>
		p.g();
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field y p>
	//    5    9:invokevirtual   #554 <Method void y.g()>
	//    6   12:return          
	}

	private static int a = 0;
	private int A;
	private boolean B;
	private List C;
	private boolean D;
	private boolean E;
	private float F[] = {
		-1F, -1F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -1F, 
		1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 
		0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, -1F, 0.0F, 
		0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
	};
	private float b;
	private float c;
	private int d;
	private int e;
	private FPoint f;
	private int g;
	private BitmapDescriptor h;
	private int i;
	private int j;
	private String k;
	private LatLng l;
	private float m;
	private float n;
	private boolean o;
	private y p;
	private Object q;
	private String r;
	private int s;
	private int t;
	private int u;
	private Typeface v;
	private float w;
	private Rect x;
	private Paint y;
	private int z;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #56  <Field int a>
	//*   2    4:return          
	}
}
