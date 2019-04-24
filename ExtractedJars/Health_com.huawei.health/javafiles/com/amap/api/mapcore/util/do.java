// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.ae.gmap.GLMapState;
import com.autonavi.amap.mapcore.*;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLTransformation;
import com.autonavi.amap.mapcore.interfaces.*;
import java.nio.FloatBuffer;

// Referenced classes of package com.amap.api.mapcore.util:
//			av, dd, fd, k, 
//			s, dj, hm, aw, 
//			cv, dr

public class do
	implements av, dd, IInfoWindowManager
{
	static class a extends dr
	{

		int a;
		int b;
		int c;

		a(String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void dr()>
			if(!a(s1))
		//*   2    4:aload_0         
		//*   3    5:aload_1         
		//*   4    6:invokevirtual   #18  <Method boolean a(String)>
		//*   5    9:ifne            13
			{
				return;
		//    6   12:return          
			} else
			{
				a = c("aMVP");
		//    7   13:aload_0         
		//    8   14:aload_0         
		//    9   15:ldc1            #20  <String "aMVP">
		//   10   17:invokevirtual   #23  <Method int c(String)>
		//   11   20:putfield        #25  <Field int a>
				b = b("aVertex");
		//   12   23:aload_0         
		//   13   24:aload_0         
		//   14   25:ldc1            #27  <String "aVertex">
		//   15   27:invokevirtual   #29  <Method int b(String)>
		//   16   30:putfield        #31  <Field int b>
				c = b("aTextureCoord");
		//   17   33:aload_0         
		//   18   34:aload_0         
		//   19   35:ldc1            #33  <String "aTextureCoord">
		//   20   37:invokevirtual   #29  <Method int b(String)>
		//   21   40:putfield        #35  <Field int c>
				return;
		//   22   43:return          
			}
		}
	}


	public do(s s1, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		i = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #70  <Field boolean i>
		j = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #72  <Field int j>
		k = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #74  <Field int k>
		l = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #76  <Field int l>
		m = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #78  <Field int m>
		o = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #80  <Field FloatBuffer o>
		q = true;
	//   20   34:aload_0         
	//   21   35:iconst_1        
	//   22   36:putfield        #82  <Field boolean q>
		s = 0.5F;
	//   23   39:aload_0         
	//   24   40:ldc1            #83  <Float 0.5F>
	//   25   42:putfield        #85  <Field float s>
		t = 1.0F;
	//   26   45:aload_0         
	//   27   46:fconst_1        
	//   28   47:putfield        #87  <Field float t>
		x = new Rect();
	//   29   50:aload_0         
	//   30   51:new             #89  <Class Rect>
	//   31   54:dup             
	//   32   55:invokespecial   #90  <Method void Rect()>
	//   33   58:putfield        #92  <Field Rect x>
		y = 0.0F;
	//   34   61:aload_0         
	//   35   62:fconst_0        
	//   36   63:putfield        #94  <Field float y>
		A = true;
	//   37   66:aload_0         
	//   38   67:iconst_1        
	//   39   68:putfield        #96  <Field boolean A>
		B = null;
	//   40   71:aload_0         
	//   41   72:aconst_null     
	//   42   73:putfield        #98  <Field Bitmap B>
		C = null;
	//   43   76:aload_0         
	//   44   77:aconst_null     
	//   45   78:putfield        #100 <Field Bitmap C>
		D = null;
	//   46   81:aload_0         
	//   47   82:aconst_null     
	//   48   83:putfield        #102 <Field Bitmap D>
		E = null;
	//   49   86:aload_0         
	//   50   87:aconst_null     
	//   51   88:putfield        #104 <Field Bitmap E>
		a = null;
	//   52   91:aload_0         
	//   53   92:aconst_null     
	//   54   93:putfield        #106 <Field s a>
		F = false;
	//   55   96:aload_0         
	//   56   97:iconst_0        
	//   57   98:putfield        #108 <Field boolean F>
		b = new float[12];
	//   58  101:aload_0         
	//   59  102:bipush          12
	//   60  104:newarray        float[]
	//   61  106:putfield        #110 <Field float[] b>
	//   62  109:aload_0         
	//   63  110:bipush          16
	//   64  112:newarray        float[]
	//   65  114:dup             
	//   66  115:iconst_0        
	//   67  116:fconst_1        
	//   68  117:fastore         
	//   69  118:dup             
	//   70  119:iconst_1        
	//   71  120:fconst_0        
	//   72  121:fastore         
	//   73  122:dup             
	//   74  123:iconst_2        
	//   75  124:fconst_0        
	//   76  125:fastore         
	//   77  126:dup             
	//   78  127:iconst_3        
	//   79  128:fconst_0        
	//   80  129:fastore         
	//   81  130:dup             
	//   82  131:iconst_4        
	//   83  132:fconst_0        
	//   84  133:fastore         
	//   85  134:dup             
	//   86  135:iconst_5        
	//   87  136:fconst_1        
	//   88  137:fastore         
	//   89  138:dup             
	//   90  139:bipush          6
	//   91  141:fconst_0        
	//   92  142:fastore         
	//   93  143:dup             
	//   94  144:bipush          7
	//   95  146:fconst_0        
	//   96  147:fastore         
	//   97  148:dup             
	//   98  149:bipush          8
	//   99  151:fconst_0        
	//  100  152:fastore         
	//  101  153:dup             
	//  102  154:bipush          9
	//  103  156:fconst_0        
	//  104  157:fastore         
	//  105  158:dup             
	//  106  159:bipush          10
	//  107  161:fconst_1        
	//  108  162:fastore         
	//  109  163:dup             
	//  110  164:bipush          11
	//  111  166:fconst_0        
	//  112  167:fastore         
	//  113  168:dup             
	//  114  169:bipush          12
	//  115  171:fconst_0        
	//  116  172:fastore         
	//  117  173:dup             
	//  118  174:bipush          13
	//  119  176:fconst_0        
	//  120  177:fastore         
	//  121  178:dup             
	//  122  179:bipush          14
	//  123  181:fconst_0        
	//  124  182:fastore         
	//  125  183:dup             
	//  126  184:bipush          15
	//  127  186:fconst_1        
	//  128  187:fastore         
	//  129  188:putfield        #112 <Field float[] d>
		e = 0L;
	//  130  191:aload_0         
	//  131  192:lconst_0        
	//  132  193:putfield        #114 <Field long e>
		I = false;
	//  133  196:aload_0         
	//  134  197:iconst_0        
	//  135  198:putfield        #116 <Field boolean I>
		J = true;
	//  136  201:aload_0         
	//  137  202:iconst_1        
	//  138  203:putfield        #118 <Field boolean J>
		g = context;
	//  139  206:aload_0         
	//  140  207:aload_2         
	//  141  208:putfield        #120 <Field Context g>
		a = s1;
	//  142  211:aload_0         
	//  143  212:aload_1         
	//  144  213:putfield        #106 <Field s a>
		p = getId();
	//  145  216:aload_0         
	//  146  217:aload_0         
	//  147  218:invokevirtual   #124 <Method String getId()>
	//  148  221:putfield        #126 <Field String p>
	//  149  224:return          
	}

	private Bitmap a(View view)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj = ((Object) (view));
	//    4    6:aload_1         
	//    5    7:astore_2        
		if(view instanceof RelativeLayout)
	//*   6    8:aload_1         
	//*   7    9:instanceof      #130 <Class RelativeLayout>
	//*   8   12:ifeq            46
		{
			obj = ((Object) (view));
	//    9   15:aload_1         
	//   10   16:astore_2        
			if(g != null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #120 <Field Context g>
	//*  13   21:ifnull          46
			{
				obj = ((Object) (new LinearLayout(g)));
	//   14   24:new             #132 <Class LinearLayout>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:getfield        #120 <Field Context g>
	//   18   32:invokespecial   #135 <Method void LinearLayout(Context)>
	//   19   35:astore_2        
				((LinearLayout) (obj)).setOrientation(1);
	//   20   36:aload_2         
	//   21   37:iconst_1        
	//   22   38:invokevirtual   #139 <Method void LinearLayout.setOrientation(int)>
				((LinearLayout) (obj)).addView(view);
	//   23   41:aload_2         
	//   24   42:aload_1         
	//   25   43:invokevirtual   #143 <Method void LinearLayout.addView(View)>
			}
		}
		((View) (obj)).setDrawingCacheEnabled(true);
	//   26   46:aload_2         
	//   27   47:iconst_1        
	//   28   48:invokevirtual   #149 <Method void View.setDrawingCacheEnabled(boolean)>
		((View) (obj)).setDrawingCacheQuality(0);
	//   29   51:aload_2         
	//   30   52:iconst_0        
	//   31   53:invokevirtual   #152 <Method void View.setDrawingCacheQuality(int)>
		return fd.a(((View) (obj)));
	//   32   56:aload_2         
	//   33   57:invokestatic    #156 <Method Bitmap fd.a(View)>
	//   34   60:areturn         
	}

	static GLAnimation a(do do1)
	{
		return do1.G;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field GLAnimation G>
	//    2    4:areturn         
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
		if(c == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #162 <Field do$a c>
	//*   9   17:ifnonnull       24
			g();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #164 <Method void g()>
		c.a();
	//   12   24:aload_0         
	//   13   25:getfield        #162 <Field do$a c>
	//   14   28:invokevirtual   #166 <Method void do$a.a()>
		GLES20.glEnable(3042);
	//   15   31:sipush          3042
	//   16   34:invokestatic    #171 <Method void GLES20.glEnable(int)>
		GLES20.glBlendFunc(1, 771);
	//   17   37:iconst_1        
	//   18   38:sipush          771
	//   19   41:invokestatic    #175 <Method void GLES20.glBlendFunc(int, int)>
		GLES20.glBlendColor(1.0F, 1.0F, 1.0F, 1.0F);
	//   20   44:fconst_1        
	//   21   45:fconst_1        
	//   22   46:fconst_1        
	//   23   47:fconst_1        
	//   24   48:invokestatic    #179 <Method void GLES20.glBlendColor(float, float, float, float)>
		GLES20.glActiveTexture(33984);
	//   25   51:ldc1            #180 <Int 33984>
	//   26   53:invokestatic    #183 <Method void GLES20.glActiveTexture(int)>
		GLES20.glBindTexture(3553, i1);
	//   27   56:sipush          3553
	//   28   59:iload_1         
	//   29   60:invokestatic    #186 <Method void GLES20.glBindTexture(int, int)>
		GLES20.glEnableVertexAttribArray(c.b);
	//   30   63:aload_0         
	//   31   64:getfield        #162 <Field do$a c>
	//   32   67:getfield        #188 <Field int do$a.b>
	//   33   70:invokestatic    #191 <Method void GLES20.glEnableVertexAttribArray(int)>
		GLES20.glVertexAttribPointer(c.b, 3, 5126, false, 12, ((java.nio.Buffer) (floatbuffer)));
	//   34   73:aload_0         
	//   35   74:getfield        #162 <Field do$a c>
	//   36   77:getfield        #188 <Field int do$a.b>
	//   37   80:iconst_3        
	//   38   81:sipush          5126
	//   39   84:iconst_0        
	//   40   85:bipush          12
	//   41   87:aload_2         
	//   42   88:invokestatic    #195 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		GLES20.glEnableVertexAttribArray(c.c);
	//   43   91:aload_0         
	//   44   92:getfield        #162 <Field do$a c>
	//   45   95:getfield        #197 <Field int do$a.c>
	//   46   98:invokestatic    #191 <Method void GLES20.glEnableVertexAttribArray(int)>
		GLES20.glVertexAttribPointer(c.c, 2, 5126, false, 8, ((java.nio.Buffer) (floatbuffer1)));
	//   47  101:aload_0         
	//   48  102:getfield        #162 <Field do$a c>
	//   49  105:getfield        #197 <Field int do$a.c>
	//   50  108:iconst_2        
	//   51  109:sipush          5126
	//   52  112:iconst_0        
	//   53  113:bipush          8
	//   54  115:aload_3         
	//   55  116:invokestatic    #195 <Method void GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer)>
		GLES20.glUniformMatrix4fv(c.a, 1, false, d, 0);
	//   56  119:aload_0         
	//   57  120:getfield        #162 <Field do$a c>
	//   58  123:getfield        #199 <Field int do$a.a>
	//   59  126:iconst_1        
	//   60  127:iconst_0        
	//   61  128:aload_0         
	//   62  129:getfield        #112 <Field float[] d>
	//   63  132:iconst_0        
	//   64  133:invokestatic    #203 <Method void GLES20.glUniformMatrix4fv(int, int, boolean, float[], int)>
		GLES20.glDrawArrays(6, 0, 4);
	//   65  136:bipush          6
	//   66  138:iconst_0        
	//   67  139:iconst_4        
	//   68  140:invokestatic    #207 <Method void GLES20.glDrawArrays(int, int, int)>
		GLES20.glDisableVertexAttribArray(c.b);
	//   69  143:aload_0         
	//   70  144:getfield        #162 <Field do$a c>
	//   71  147:getfield        #188 <Field int do$a.b>
	//   72  150:invokestatic    #210 <Method void GLES20.glDisableVertexAttribArray(int)>
		GLES20.glDisableVertexAttribArray(c.c);
	//   73  153:aload_0         
	//   74  154:getfield        #162 <Field do$a c>
	//   75  157:getfield        #197 <Field int do$a.c>
	//   76  160:invokestatic    #210 <Method void GLES20.glDisableVertexAttribArray(int)>
		GLES20.glBindTexture(3553, 0);
	//   77  163:sipush          3553
	//   78  166:iconst_0        
	//   79  167:invokestatic    #186 <Method void GLES20.glBindTexture(int, int)>
		GLES20.glUseProgram(0);
	//   80  170:iconst_0        
	//   81  171:invokestatic    #213 <Method void GLES20.glUseProgram(int)>
		GLES20.glDisable(3042);
	//   82  174:sipush          3042
	//   83  177:invokestatic    #216 <Method void GLES20.glDisable(int)>
	//   84  180:return          
	}

	static boolean a(do do1, boolean flag)
	{
		do1.I = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field boolean I>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void b(do do1, boolean flag)
	{
		do1.b(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #220 <Method void b(boolean)>
	//    3    5:return          
	}

	private void b(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
		{
			b(k());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokespecial   #223 <Method Bitmap k()>
	//    5    9:invokevirtual   #226 <Method void b(Bitmap)>
			return;
	//    6   12:return          
		} else
		{
			b(l());
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokespecial   #228 <Method Bitmap l()>
	//   10   18:invokevirtual   #226 <Method void b(Bitmap)>
			return;
	//   11   21:return          
		}
	}

	private void c(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_1         
	//    3    3:ifnull          17
		if(!bitmap.isRecycled())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*   6   10:ifne            17
			bitmap.recycle();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #237 <Method void Bitmap.recycle()>
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		bitmap;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw bitmap;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	private void c(boolean flag)
	{
		if(H != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #239 <Field GLAnimation H>
	//*   2    4:ifnull          41
		{
			J = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #118 <Field boolean J>
			I = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #116 <Field boolean I>
			H.startNow();
	//    9   17:aload_0         
	//   10   18:getfield        #239 <Field GLAnimation H>
	//   11   21:invokevirtual   #244 <Method void GLAnimation.startNow()>
			H.setAnimationListener(new com.amap.api.maps.model.animation.Animation.AnimationListener(flag) {

				public void onAnimationEnd()
				{
					if(do.a(b) != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field do b>
				//*   2    4:invokestatic    #29  <Method GLAnimation do.a(do)>
				//*   3    7:ifnull          40
					{
						do.a(b, true);
				//    4   10:aload_0         
				//    5   11:getfield        #19  <Field do b>
				//    6   14:iconst_1        
				//    7   15:invokestatic    #32  <Method boolean do.a(do, boolean)>
				//    8   18:pop             
						do.a(b).startNow();
				//    9   19:aload_0         
				//   10   20:getfield        #19  <Field do b>
				//   11   23:invokestatic    #29  <Method GLAnimation do.a(do)>
				//   12   26:invokevirtual   #37  <Method void GLAnimation.startNow()>
						do.b(b, a);
				//   13   29:aload_0         
				//   14   30:getfield        #19  <Field do b>
				//   15   33:aload_0         
				//   16   34:getfield        #21  <Field boolean a>
				//   17   37:invokestatic    #39  <Method void do.b(do, boolean)>
					}
				//   18   40:return          
				}

				public void onAnimationStart()
				{
				//    0    0:return          
				}

				final boolean a;
				final do b;

			
			{
				b = do.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field do b>
				a = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   12   24:aload_0         
	//   13   25:getfield        #239 <Field GLAnimation H>
	//   14   28:new             #12  <Class do$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:invokespecial   #246 <Method void do$1(do, boolean)>
	//   19   37:invokevirtual   #250 <Method void GLAnimation.setAnimationListener(com.amap.api.maps.model.animation.Animation$AnimationListener)>
			return;
	//   20   40:return          
		}
		if(G != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #159 <Field GLAnimation G>
	//*  23   45:ifnull          66
		{
			I = true;
	//   24   48:aload_0         
	//   25   49:iconst_1        
	//   26   50:putfield        #116 <Field boolean I>
			G.startNow();
	//   27   53:aload_0         
	//   28   54:getfield        #159 <Field GLAnimation G>
	//   29   57:invokevirtual   #244 <Method void GLAnimation.startNow()>
			b(flag);
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:invokespecial   #220 <Method void b(boolean)>
			return;
	//   33   65:return          
		} else
		{
			b(flag);
	//   34   66:aload_0         
	//   35   67:iload_1         
	//   36   68:invokespecial   #220 <Method void b(boolean)>
			return;
	//   37   71:return          
		}
	}

	private void d(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_26;
	//    2    2:aload_1         
	//    3    3:ifnull          26
		if(!bitmap.isRecycled())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*   6   10:ifne            26
		{
			c(C);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #100 <Field Bitmap C>
	//   10   18:invokespecial   #252 <Method void c(Bitmap)>
			C = bitmap;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #100 <Field Bitmap C>
		}
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		bitmap;
	//   17   29:astore_1        
	//*  18   30:aload_0         
		throw bitmap;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	private void e(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_26;
	//    2    2:aload_1         
	//    3    3:ifnull          26
		if(!bitmap.isRecycled())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*   6   10:ifne            26
		{
			c(D);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #102 <Field Bitmap D>
	//   10   18:invokespecial   #252 <Method void c(Bitmap)>
			D = bitmap;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #102 <Field Bitmap D>
		}
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		bitmap;
	//   17   29:astore_1        
	//*  18   30:aload_0         
		throw bitmap;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	private void f(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_26;
	//    2    2:aload_1         
	//    3    3:ifnull          26
		if(!bitmap.isRecycled())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*   6   10:ifne            26
		{
			c(E);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #104 <Field Bitmap E>
	//   10   18:invokespecial   #252 <Method void c(Bitmap)>
			E = bitmap;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #104 <Field Bitmap E>
		}
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		bitmap;
	//   17   29:astore_1        
	//*  18   30:aload_0         
		throw bitmap;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	private boolean g(Bitmap bitmap)
	{
		if(B != null && ((Object) (bitmap)).hashCode() == ((Object) (B)).hashCode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Bitmap B>
	//*   2    4:ifnull          23
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #257 <Method int Object.hashCode()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #98  <Field Bitmap B>
	//*   7   15:invokevirtual   #257 <Method int Object.hashCode()>
	//*   8   18:icmpne          23
			return true;
	//    9   21:iconst_1        
	//   10   22:ireturn         
		if(D != null && ((Object) (bitmap)).hashCode() == ((Object) (D)).hashCode())
	//*  11   23:aload_0         
	//*  12   24:getfield        #102 <Field Bitmap D>
	//*  13   27:ifnull          46
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #257 <Method int Object.hashCode()>
	//*  16   34:aload_0         
	//*  17   35:getfield        #102 <Field Bitmap D>
	//*  18   38:invokevirtual   #257 <Method int Object.hashCode()>
	//*  19   41:icmpne          46
			return true;
	//   20   44:iconst_1        
	//   21   45:ireturn         
		if(C != null && ((Object) (bitmap)).hashCode() == ((Object) (C)).hashCode())
	//*  22   46:aload_0         
	//*  23   47:getfield        #100 <Field Bitmap C>
	//*  24   50:ifnull          69
	//*  25   53:aload_1         
	//*  26   54:invokevirtual   #257 <Method int Object.hashCode()>
	//*  27   57:aload_0         
	//*  28   58:getfield        #100 <Field Bitmap C>
	//*  29   61:invokevirtual   #257 <Method int Object.hashCode()>
	//*  30   64:icmpne          69
			return true;
	//   31   67:iconst_1        
	//   32   68:ireturn         
		return E != null && ((Object) (bitmap)).hashCode() == ((Object) (E)).hashCode();
	//   33   69:aload_0         
	//   34   70:getfield        #104 <Field Bitmap E>
	//   35   73:ifnull          92
	//   36   76:aload_1         
	//   37   77:invokevirtual   #257 <Method int Object.hashCode()>
	//   38   80:aload_0         
	//   39   81:getfield        #104 <Field Bitmap E>
	//   40   84:invokevirtual   #257 <Method int Object.hashCode()>
	//   41   87:icmpne          92
	//   42   90:iconst_1        
	//   43   91:ireturn         
	//   44   92:iconst_0        
	//   45   93:ireturn         
	}

	private Bitmap k()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Bitmap bitmap = B;
	//    2    2:aload_0         
	//    3    3:getfield        #98  <Field Bitmap B>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return bitmap;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	private Bitmap l()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Bitmap bitmap = D;
	//    2    2:aload_0         
	//    3    3:getfield        #102 <Field Bitmap D>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return bitmap;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	private void m()
	{
		if(!J && H != null && !H.hasEnded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field boolean J>
	//*   2    4:ifne            83
	//*   3    7:aload_0         
	//*   4    8:getfield        #239 <Field GLAnimation H>
	//*   5   11:ifnull          83
	//*   6   14:aload_0         
	//*   7   15:getfield        #239 <Field GLAnimation H>
	//*   8   18:invokevirtual   #260 <Method boolean GLAnimation.hasEnded()>
	//*   9   21:ifne            83
		{
			I = true;
	//   10   24:aload_0         
	//   11   25:iconst_1        
	//   12   26:putfield        #116 <Field boolean I>
			GLTransformation gltransformation = new GLTransformation();
	//   13   29:new             #262 <Class GLTransformation>
	//   14   32:dup             
	//   15   33:invokespecial   #263 <Method void GLTransformation()>
	//   16   36:astore_1        
			H.getTransformation(AnimationUtils.currentAnimationTimeMillis(), gltransformation);
	//   17   37:aload_0         
	//   18   38:getfield        #239 <Field GLAnimation H>
	//   19   41:invokestatic    #269 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #273 <Method boolean GLAnimation.getTransformation(long, GLTransformation)>
	//   22   48:pop             
			if(gltransformation != null && !Double.isNaN(gltransformation.scaleX) && !Double.isNaN(gltransformation.scaleY))
	//*  23   49:aload_1         
	//*  24   50:ifnull          82
	//*  25   53:aload_1         
	//*  26   54:getfield        #276 <Field double GLTransformation.scaleX>
	//*  27   57:invokestatic    #282 <Method boolean Double.isNaN(double)>
	//*  28   60:ifne            82
	//*  29   63:aload_1         
	//*  30   64:getfield        #285 <Field double GLTransformation.scaleY>
	//*  31   67:invokestatic    #282 <Method boolean Double.isNaN(double)>
	//*  32   70:ifne            82
				y = (float)gltransformation.scaleX;
	//   33   73:aload_0         
	//   34   74:aload_1         
	//   35   75:getfield        #276 <Field double GLTransformation.scaleX>
	//   36   78:d2f             
	//   37   79:putfield        #94  <Field float y>
			return;
	//   38   82:return          
		}
		if(G != null && !G.hasEnded())
	//*  39   83:aload_0         
	//*  40   84:getfield        #159 <Field GLAnimation G>
	//*  41   87:ifnull          180
	//*  42   90:aload_0         
	//*  43   91:getfield        #159 <Field GLAnimation G>
	//*  44   94:invokevirtual   #260 <Method boolean GLAnimation.hasEnded()>
	//*  45   97:ifne            180
		{
			J = false;
	//   46  100:aload_0         
	//   47  101:iconst_0        
	//   48  102:putfield        #118 <Field boolean J>
			I = true;
	//   49  105:aload_0         
	//   50  106:iconst_1        
	//   51  107:putfield        #116 <Field boolean I>
			j = l;
	//   52  110:aload_0         
	//   53  111:aload_0         
	//   54  112:getfield        #76  <Field int l>
	//   55  115:putfield        #72  <Field int j>
			k = m;
	//   56  118:aload_0         
	//   57  119:aload_0         
	//   58  120:getfield        #78  <Field int m>
	//   59  123:putfield        #74  <Field int k>
			GLTransformation gltransformation1 = new GLTransformation();
	//   60  126:new             #262 <Class GLTransformation>
	//   61  129:dup             
	//   62  130:invokespecial   #263 <Method void GLTransformation()>
	//   63  133:astore_1        
			G.getTransformation(AnimationUtils.currentAnimationTimeMillis(), gltransformation1);
	//   64  134:aload_0         
	//   65  135:getfield        #159 <Field GLAnimation G>
	//   66  138:invokestatic    #269 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   67  141:aload_1         
	//   68  142:invokevirtual   #273 <Method boolean GLAnimation.getTransformation(long, GLTransformation)>
	//   69  145:pop             
			if(gltransformation1 != null && !Double.isNaN(gltransformation1.scaleX) && !Double.isNaN(gltransformation1.scaleY))
	//*  70  146:aload_1         
	//*  71  147:ifnull          179
	//*  72  150:aload_1         
	//*  73  151:getfield        #276 <Field double GLTransformation.scaleX>
	//*  74  154:invokestatic    #282 <Method boolean Double.isNaN(double)>
	//*  75  157:ifne            179
	//*  76  160:aload_1         
	//*  77  161:getfield        #285 <Field double GLTransformation.scaleY>
	//*  78  164:invokestatic    #282 <Method boolean Double.isNaN(double)>
	//*  79  167:ifne            179
				y = (float)gltransformation1.scaleX;
	//   80  170:aload_0         
	//   81  171:aload_1         
	//   82  172:getfield        #276 <Field double GLTransformation.scaleX>
	//   83  175:d2f             
	//   84  176:putfield        #94  <Field float y>
			return;
	//   85  179:return          
		} else
		{
			y = 1.0F;
	//   86  180:aload_0         
	//   87  181:fconst_1        
	//   88  182:putfield        #94  <Field float y>
			I = false;
	//   89  185:aload_0         
	//   90  186:iconst_0        
	//   91  187:putfield        #116 <Field boolean I>
			return;
	//   92  190:return          
		}
	}

	private int n()
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
	//   12   13:invokestatic    #289 <Method void GLES20.glGenTextures(int, int[], int)>
		return ai[0];
	//   13   16:aload_1         
	//   14   17:iconst_0        
	//   15   18:iaload          
	//   16   19:ireturn         
	}

	private void o()
	{
		if(A && v != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field boolean A>
	//*   2    4:ifeq            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #291 <Field Bitmap v>
	//*   5   11:ifnull          22
			c(false);
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:invokespecial   #293 <Method void c(boolean)>
		else
	//*   9   19:goto            30
			b(l());
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokespecial   #228 <Method Bitmap l()>
	//   13   27:invokevirtual   #226 <Method void b(Bitmap)>
		a(false);
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #295 <Method void a(boolean)>
	//   17   35:return          
	}

	private void p()
	{
		if(!A && v != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field boolean A>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #291 <Field Bitmap v>
	//*   5   11:ifnull          22
			c(true);
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:invokespecial   #293 <Method void c(boolean)>
		else
	//*   9   19:goto            30
			b(k());
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:invokespecial   #223 <Method Bitmap k()>
	//   13   27:invokevirtual   #226 <Method void b(Bitmap)>
		a(true);
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #295 <Method void a(boolean)>
	//   17   35:return          
	}

	private void q()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Bitmap bitmap;
		if(v == null)
			break MISSING_BLOCK_LABEL_27;
	//    2    2:aload_0         
	//    3    3:getfield        #291 <Field Bitmap v>
	//    4    6:ifnull          27
		bitmap = v;
	//    5    9:aload_0         
	//    6   10:getfield        #291 <Field Bitmap v>
	//    7   13:astore_1        
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_27;
	//    8   14:aload_1         
	//    9   15:ifnull          27
		bitmap.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #237 <Method void Bitmap.recycle()>
		v = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #291 <Field Bitmap v>
		if(w != null && !w.isRecycled())
	//*  15   27:aload_0         
	//*  16   28:getfield        #297 <Field Bitmap w>
	//*  17   31:ifnull          56
	//*  18   34:aload_0         
	//*  19   35:getfield        #297 <Field Bitmap w>
	//*  20   38:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*  21   41:ifne            56
		{
			w.recycle();
	//   22   44:aload_0         
	//   23   45:getfield        #297 <Field Bitmap w>
	//   24   48:invokevirtual   #237 <Method void Bitmap.recycle()>
			w = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #297 <Field Bitmap w>
		}
		if(B != null && !B.isRecycled())
	//*  28   56:aload_0         
	//*  29   57:getfield        #98  <Field Bitmap B>
	//*  30   60:ifnull          80
	//*  31   63:aload_0         
	//*  32   64:getfield        #98  <Field Bitmap B>
	//*  33   67:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*  34   70:ifne            80
			B.recycle();
	//   35   73:aload_0         
	//   36   74:getfield        #98  <Field Bitmap B>
	//   37   77:invokevirtual   #237 <Method void Bitmap.recycle()>
		if(C != null && !C.isRecycled())
	//*  38   80:aload_0         
	//*  39   81:getfield        #100 <Field Bitmap C>
	//*  40   84:ifnull          104
	//*  41   87:aload_0         
	//*  42   88:getfield        #100 <Field Bitmap C>
	//*  43   91:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*  44   94:ifne            104
			C.recycle();
	//   45   97:aload_0         
	//   46   98:getfield        #100 <Field Bitmap C>
	//   47  101:invokevirtual   #237 <Method void Bitmap.recycle()>
		if(D != null && !D.isRecycled())
	//*  48  104:aload_0         
	//*  49  105:getfield        #102 <Field Bitmap D>
	//*  50  108:ifnull          128
	//*  51  111:aload_0         
	//*  52  112:getfield        #102 <Field Bitmap D>
	//*  53  115:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*  54  118:ifne            128
			D.recycle();
	//   55  121:aload_0         
	//   56  122:getfield        #102 <Field Bitmap D>
	//   57  125:invokevirtual   #237 <Method void Bitmap.recycle()>
		if(E != null && !E.isRecycled())
	//*  58  128:aload_0         
	//*  59  129:getfield        #104 <Field Bitmap E>
	//*  60  132:ifnull          152
	//*  61  135:aload_0         
	//*  62  136:getfield        #104 <Field Bitmap E>
	//*  63  139:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*  64  142:ifne            152
			E.recycle();
	//   65  145:aload_0         
	//   66  146:getfield        #104 <Field Bitmap E>
	//   67  149:invokevirtual   #237 <Method void Bitmap.recycle()>
		this;
	//   68  152:aload_0         
		JVM INSTR monitorexit ;
	//   69  153:monitorexit     
		return;
	//   70  154:return          
		Exception exception;
		exception;
	//   71  155:astore_1        
	//*  72  156:aload_0         
		throw exception;
	//   73  157:monitorexit     
	//   74  158:aload_1         
	//   75  159:athrow          
	}

	private void r()
	{
	//    0    0:return          
	}

	private Rect s()
	{
		return new Rect(x.left, x.top, x.right, x.top + u());
	//    0    0:new             #89  <Class Rect>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #92  <Field Rect x>
	//    4    8:getfield        #301 <Field int Rect.left>
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field Rect x>
	//    7   15:getfield        #304 <Field int Rect.top>
	//    8   18:aload_0         
	//    9   19:getfield        #92  <Field Rect x>
	//   10   22:getfield        #307 <Field int Rect.right>
	//   11   25:aload_0         
	//   12   26:getfield        #92  <Field Rect x>
	//   13   29:getfield        #304 <Field int Rect.top>
	//   14   32:aload_0         
	//   15   33:invokespecial   #309 <Method int u()>
	//   16   36:iadd            
	//   17   37:invokespecial   #312 <Method void Rect(int, int, int, int)>
	//   18   40:areturn         
	}

	private Rect t()
	{
		return new Rect(x.left, x.top, x.right, x.top + v());
	//    0    0:new             #89  <Class Rect>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #92  <Field Rect x>
	//    4    8:getfield        #301 <Field int Rect.left>
	//    5   11:aload_0         
	//    6   12:getfield        #92  <Field Rect x>
	//    7   15:getfield        #304 <Field int Rect.top>
	//    8   18:aload_0         
	//    9   19:getfield        #92  <Field Rect x>
	//   10   22:getfield        #307 <Field int Rect.right>
	//   11   25:aload_0         
	//   12   26:getfield        #92  <Field Rect x>
	//   13   29:getfield        #304 <Field int Rect.top>
	//   14   32:aload_0         
	//   15   33:invokespecial   #314 <Method int v()>
	//   16   36:iadd            
	//   17   37:invokespecial   #312 <Method void Rect(int, int, int, int)>
	//   18   40:areturn         
	}

	private int u()
	{
		if(B == null || B.isRecycled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field Bitmap B>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #98  <Field Bitmap B>
	//*   5   11:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*   6   14:ifeq            19
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		else
			return B.getHeight();
	//    9   19:aload_0         
	//   10   20:getfield        #98  <Field Bitmap B>
	//   11   23:invokevirtual   #317 <Method int Bitmap.getHeight()>
	//   12   26:ireturn         
	}

	private int v()
	{
		if(D == null || D.isRecycled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field Bitmap D>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #102 <Field Bitmap D>
	//*   5   11:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*   6   14:ifeq            19
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		else
			return D.getHeight();
	//    9   19:aload_0         
	//   10   20:getfield        #102 <Field Bitmap D>
	//   11   23:invokevirtual   #317 <Method int Bitmap.getHeight()>
	//   12   26:ireturn         
	}

	public void a(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_1         
	//    3    3:ifnull          18
		if(!bitmap.isRecycled())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*   6   10:ifne            18
			B = bitmap;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #98  <Field Bitmap B>
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return;
	//   12   20:return          
		bitmap;
	//   13   21:astore_1        
	//*  14   22:aload_0         
		throw bitmap;
	//   15   23:monitorexit     
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public void a(aw aw1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		f = aw1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #320 <Field aw f>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		aw1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw aw1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public void a(k k1)
		throws RemoteException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(k1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
	//*   4    6:aload_0         
			return;
	//    5    7:monitorexit     
	//    6    8:return          
		if(k1.isInfoWindowEnable())
			break MISSING_BLOCK_LABEL_19;
	//    7    9:aload_1         
	//    8   10:invokevirtual   #328 <Method boolean k.isInfoWindowEnable()>
	//    9   13:ifne            19
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		if(h != null && !h.getId().equals(((Object) (k1.getId()))))
	//*  13   19:aload_0         
	//*  14   20:getfield        #330 <Field k h>
	//*  15   23:ifnull          47
	//*  16   26:aload_0         
	//*  17   27:getfield        #330 <Field k h>
	//*  18   30:invokevirtual   #331 <Method String k.getId()>
	//*  19   33:aload_1         
	//*  20   34:invokevirtual   #331 <Method String k.getId()>
	//*  21   37:invokevirtual   #337 <Method boolean String.equals(Object)>
	//*  22   40:ifne            47
			a_();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #340 <Method void a_()>
		if(f != null)
	//*  25   47:aload_0         
	//*  26   48:getfield        #320 <Field aw f>
	//*  27   51:ifnull          73
		{
			h = k1;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:putfield        #330 <Field k h>
			k1.a(true);
	//   31   59:aload_1         
	//   32   60:iconst_1        
	//   33   61:invokevirtual   #341 <Method void k.a(boolean)>
			setVisible(true);
	//   34   64:aload_0         
	//   35   65:iconst_1        
	//   36   66:invokevirtual   #344 <Method void setVisible(boolean)>
			j();
	//   37   69:aload_0         
	//   38   70:invokevirtual   #346 <Method void j()>
		}
		this;
	//   39   73:aload_0         
		JVM INSTR monitorexit ;
	//   40   74:monitorexit     
		return;
	//   41   75:return          
		k1;
	//   42   76:astore_1        
	//*  43   77:aload_0         
		throw k1;
	//   44   78:monitorexit     
	//   45   79:aload_1         
	//   46   80:athrow          
	}

	public void a(FPoint fpoint)
	{
		n = fpoint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #350 <Field FPoint n>
	//    3    5:return          
	}

	public void a(MapConfig mapconfig)
		throws RemoteException
	{
	//    0    0:return          
	}

	public void a(boolean flag)
	{
		A = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field boolean A>
	//    3    5:return          
	}

	public boolean a()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(int i1, int j1)
	{
		GLMapState glmapstate = a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field s a>
	//    2    4:invokeinterface #357 <Method GLMapState s.c()>
	//    3    9:astore          7
		if(n == null || glmapstate == null)
	//*   4   11:aload_0         
	//*   5   12:getfield        #350 <Field FPoint n>
	//*   6   15:ifnull          23
	//*   7   18:aload           7
	//*   8   20:ifnonnull       25
			return false;
	//    9   23:iconst_0        
	//   10   24:ireturn         
		IPoint ipoint = IPoint.obtain();
	//   11   25:invokestatic    #363 <Method IPoint IPoint.obtain()>
	//   12   28:astore          8
		MapConfig mapconfig = a.getMapConfig();
	//   13   30:aload_0         
	//   14   31:getfield        #106 <Field s a>
	//   15   34:invokeinterface #367 <Method MapConfig s.getMapConfig()>
	//   16   39:astore          9
		if(mapconfig != null && glmapstate != null)
	//*  17   41:aload           9
	//*  18   43:ifnull          118
	//*  19   46:aload           7
	//*  20   48:ifnull          118
		{
			FPoint fpoint = FPoint.obtain();
	//   21   51:invokestatic    #372 <Method FPoint FPoint.obtain()>
	//   22   54:astore          10
			glmapstate.p20ToScreenPoint(mapconfig.getSX() + (int)n.x, mapconfig.getSY() + (int)n.y, fpoint);
	//   23   56:aload           7
	//   24   58:aload           9
	//   25   60:invokevirtual   #377 <Method int MapConfig.getSX()>
	//   26   63:aload_0         
	//   27   64:getfield        #350 <Field FPoint n>
	//   28   67:getfield        #379 <Field float FPoint.x>
	//   29   70:f2i             
	//   30   71:iadd            
	//   31   72:aload           9
	//   32   74:invokevirtual   #382 <Method int MapConfig.getSY()>
	//   33   77:aload_0         
	//   34   78:getfield        #350 <Field FPoint n>
	//   35   81:getfield        #383 <Field float FPoint.y>
	//   36   84:f2i             
	//   37   85:iadd            
	//   38   86:aload           10
	//   39   88:invokevirtual   #389 <Method void GLMapState.p20ToScreenPoint(int, int, FPoint)>
			ipoint.x = (int)fpoint.x;
	//   40   91:aload           8
	//   41   93:aload           10
	//   42   95:getfield        #379 <Field float FPoint.x>
	//   43   98:f2i             
	//   44   99:putfield        #391 <Field int IPoint.x>
			ipoint.y = (int)fpoint.y;
	//   45  102:aload           8
	//   46  104:aload           10
	//   47  106:getfield        #383 <Field float FPoint.y>
	//   48  109:f2i             
	//   49  110:putfield        #393 <Field int IPoint.y>
			fpoint.recycle();
	//   50  113:aload           10
	//   51  115:invokevirtual   #394 <Method void FPoint.recycle()>
		}
		int i2 = e();
	//   52  118:aload_0         
	//   53  119:invokevirtual   #396 <Method int e()>
	//   54  122:istore          5
		int j2 = f();
	//   55  124:aload_0         
	//   56  125:invokevirtual   #398 <Method int f()>
	//   57  128:istore          6
		int k1 = (int)((float)(ipoint.x + j) - (float)i2 * s);
	//   58  130:aload           8
	//   59  132:getfield        #391 <Field int IPoint.x>
	//   60  135:aload_0         
	//   61  136:getfield        #72  <Field int j>
	//   62  139:iadd            
	//   63  140:i2f             
	//   64  141:iload           5
	//   65  143:i2f             
	//   66  144:aload_0         
	//   67  145:getfield        #85  <Field float s>
	//   68  148:fmul            
	//   69  149:fsub            
	//   70  150:f2i             
	//   71  151:istore_3        
		int l1 = (int)((float)(ipoint.y + k) + (float)j2 * (1.0F - t));
	//   72  152:aload           8
	//   73  154:getfield        #393 <Field int IPoint.y>
	//   74  157:aload_0         
	//   75  158:getfield        #74  <Field int k>
	//   76  161:iadd            
	//   77  162:i2f             
	//   78  163:iload           6
	//   79  165:i2f             
	//   80  166:fconst_1        
	//   81  167:aload_0         
	//   82  168:getfield        #87  <Field float t>
	//   83  171:fsub            
	//   84  172:fmul            
	//   85  173:fadd            
	//   86  174:f2i             
	//   87  175:istore          4
		ipoint.recycle();
	//   88  177:aload           8
	//   89  179:invokevirtual   #399 <Method void IPoint.recycle()>
		if(k1 - i2 > i1 || k1 < -i2 * 2 || l1 < -j2 * 2 || l1 - j2 > j1)
	//*  90  182:iload_3         
	//*  91  183:iload           5
	//*  92  185:isub            
	//*  93  186:iload_1         
	//*  94  187:icmpgt          218
	//*  95  190:iload_3         
	//*  96  191:iload           5
	//*  97  193:ineg            
	//*  98  194:iconst_2        
	//*  99  195:imul            
	//* 100  196:icmplt          218
	//* 101  199:iload           4
	//* 102  201:iload           6
	//* 103  203:ineg            
	//* 104  204:iconst_2        
	//* 105  205:imul            
	//* 106  206:icmplt          218
	//* 107  209:iload           4
	//* 108  211:iload           6
	//* 109  213:isub            
	//* 110  214:iload_2         
	//* 111  215:icmple          220
			return false;
	//  112  218:iconst_0        
	//  113  219:ireturn         
		if(v == null)
	//* 114  220:aload_0         
	//* 115  221:getfield        #291 <Field Bitmap v>
	//* 116  224:ifnonnull       229
			return false;
	//  117  227:iconst_0        
	//  118  228:ireturn         
		i1 = v.getWidth();
	//  119  229:aload_0         
	//  120  230:getfield        #291 <Field Bitmap v>
	//  121  233:invokevirtual   #402 <Method int Bitmap.getWidth()>
	//  122  236:istore_1        
		i2 = v.getHeight();
	//  123  237:aload_0         
	//  124  238:getfield        #291 <Field Bitmap v>
	//  125  241:invokevirtual   #317 <Method int Bitmap.getHeight()>
	//  126  244:istore          5
		if(r == null)
	//* 127  246:aload_0         
	//* 128  247:getfield        #404 <Field FloatBuffer r>
	//* 129  250:ifnonnull       298
			r = fd.a(new float[] {
				0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F
			});
	//  130  253:aload_0         
	//  131  254:bipush          8
	//  132  256:newarray        float[]
	//  133  258:dup             
	//  134  259:iconst_0        
	//  135  260:fconst_0        
	//  136  261:fastore         
	//  137  262:dup             
	//  138  263:iconst_1        
	//  139  264:fconst_1        
	//  140  265:fastore         
	//  141  266:dup             
	//  142  267:iconst_2        
	//  143  268:fconst_1        
	//  144  269:fastore         
	//  145  270:dup             
	//  146  271:iconst_3        
	//  147  272:fconst_1        
	//  148  273:fastore         
	//  149  274:dup             
	//  150  275:iconst_4        
	//  151  276:fconst_1        
	//  152  277:fastore         
	//  153  278:dup             
	//  154  279:iconst_5        
	//  155  280:fconst_0        
	//  156  281:fastore         
	//  157  282:dup             
	//  158  283:bipush          6
	//  159  285:fconst_0        
	//  160  286:fastore         
	//  161  287:dup             
	//  162  288:bipush          7
	//  163  290:fconst_0        
	//  164  291:fastore         
	//  165  292:invokestatic    #407 <Method FloatBuffer fd.a(float[])>
	//  166  295:putfield        #404 <Field FloatBuffer r>
		j2 = (int)((double)(1.0F - y) * 0.5D * (double)i1);
	//  167  298:fconst_1        
	//  168  299:aload_0         
	//  169  300:getfield        #94  <Field float y>
	//  170  303:fsub            
	//  171  304:f2d             
	//  172  305:ldc2w           #408 <Double 0.5D>
	//  173  308:dmul            
	//  174  309:iload_1         
	//  175  310:i2d             
	//  176  311:dmul            
	//  177  312:d2i             
	//  178  313:istore          6
		b[0] = k1 + j2;
	//  179  315:aload_0         
	//  180  316:getfield        #110 <Field float[] b>
	//  181  319:iconst_0        
	//  182  320:iload_3         
	//  183  321:iload           6
	//  184  323:iadd            
	//  185  324:i2f             
	//  186  325:fastore         
		x.left = k1 + j2;
	//  187  326:aload_0         
	//  188  327:getfield        #92  <Field Rect x>
	//  189  330:iload_3         
	//  190  331:iload           6
	//  191  333:iadd            
	//  192  334:putfield        #301 <Field int Rect.left>
		b[1] = j1 - l1;
	//  193  337:aload_0         
	//  194  338:getfield        #110 <Field float[] b>
	//  195  341:iconst_1        
	//  196  342:iload_2         
	//  197  343:iload           4
	//  198  345:isub            
	//  199  346:i2f             
	//  200  347:fastore         
		b[2] = 0.0F;
	//  201  348:aload_0         
	//  202  349:getfield        #110 <Field float[] b>
	//  203  352:iconst_2        
	//  204  353:fconst_0        
	//  205  354:fastore         
		b[3] = (k1 + i1) - j2;
	//  206  355:aload_0         
	//  207  356:getfield        #110 <Field float[] b>
	//  208  359:iconst_3        
	//  209  360:iload_3         
	//  210  361:iload_1         
	//  211  362:iadd            
	//  212  363:iload           6
	//  213  365:isub            
	//  214  366:i2f             
	//  215  367:fastore         
		b[4] = j1 - l1;
	//  216  368:aload_0         
	//  217  369:getfield        #110 <Field float[] b>
	//  218  372:iconst_4        
	//  219  373:iload_2         
	//  220  374:iload           4
	//  221  376:isub            
	//  222  377:i2f             
	//  223  378:fastore         
		x.top = l1 - i2;
	//  224  379:aload_0         
	//  225  380:getfield        #92  <Field Rect x>
	//  226  383:iload           4
	//  227  385:iload           5
	//  228  387:isub            
	//  229  388:putfield        #304 <Field int Rect.top>
		b[5] = 0.0F;
	//  230  391:aload_0         
	//  231  392:getfield        #110 <Field float[] b>
	//  232  395:iconst_5        
	//  233  396:fconst_0        
	//  234  397:fastore         
		b[6] = (k1 + i1) - j2;
	//  235  398:aload_0         
	//  236  399:getfield        #110 <Field float[] b>
	//  237  402:bipush          6
	//  238  404:iload_3         
	//  239  405:iload_1         
	//  240  406:iadd            
	//  241  407:iload           6
	//  242  409:isub            
	//  243  410:i2f             
	//  244  411:fastore         
		x.right = k1 + i1;
	//  245  412:aload_0         
	//  246  413:getfield        #92  <Field Rect x>
	//  247  416:iload_3         
	//  248  417:iload_1         
	//  249  418:iadd            
	//  250  419:putfield        #307 <Field int Rect.right>
		b[7] = (j1 - l1) + i2;
	//  251  422:aload_0         
	//  252  423:getfield        #110 <Field float[] b>
	//  253  426:bipush          7
	//  254  428:iload_2         
	//  255  429:iload           4
	//  256  431:isub            
	//  257  432:iload           5
	//  258  434:iadd            
	//  259  435:i2f             
	//  260  436:fastore         
		x.bottom = l1;
	//  261  437:aload_0         
	//  262  438:getfield        #92  <Field Rect x>
	//  263  441:iload           4
	//  264  443:putfield        #412 <Field int Rect.bottom>
		b[8] = 0.0F;
	//  265  446:aload_0         
	//  266  447:getfield        #110 <Field float[] b>
	//  267  450:bipush          8
	//  268  452:fconst_0        
	//  269  453:fastore         
		b[9] = k1 + j2;
	//  270  454:aload_0         
	//  271  455:getfield        #110 <Field float[] b>
	//  272  458:bipush          9
	//  273  460:iload_3         
	//  274  461:iload           6
	//  275  463:iadd            
	//  276  464:i2f             
	//  277  465:fastore         
		b[10] = (j1 - l1) + i2;
	//  278  466:aload_0         
	//  279  467:getfield        #110 <Field float[] b>
	//  280  470:bipush          10
	//  281  472:iload_2         
	//  282  473:iload           4
	//  283  475:isub            
	//  284  476:iload           5
	//  285  478:iadd            
	//  286  479:i2f             
	//  287  480:fastore         
		b[11] = 0.0F;
	//  288  481:aload_0         
	//  289  482:getfield        #110 <Field float[] b>
	//  290  485:bipush          11
	//  291  487:fconst_0        
	//  292  488:fastore         
		if(o == null)
	//* 293  489:aload_0         
	//* 294  490:getfield        #80  <Field FloatBuffer o>
	//* 295  493:ifnonnull       510
			o = fd.a(b);
	//  296  496:aload_0         
	//  297  497:aload_0         
	//  298  498:getfield        #110 <Field float[] b>
	//  299  501:invokestatic    #407 <Method FloatBuffer fd.a(float[])>
	//  300  504:putfield        #80  <Field FloatBuffer o>
		else
	//* 301  507:goto            525
			o = fd.a(b, o);
	//  302  510:aload_0         
	//  303  511:aload_0         
	//  304  512:getfield        #110 <Field float[] b>
	//  305  515:aload_0         
	//  306  516:getfield        #80  <Field FloatBuffer o>
	//  307  519:invokestatic    #415 <Method FloatBuffer fd.a(float[], FloatBuffer)>
	//  308  522:putfield        #80  <Field FloatBuffer o>
		return true;
	//  309  525:iconst_1        
	//  310  526:ireturn         
	}

	public boolean a(MotionEvent motionevent)
	{
		if(!q || h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean q>
	//*   2    4:ifeq            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #330 <Field k h>
	//*   5   11:ifnonnull       16
			return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		return fd.a(x, (int)motionevent.getX(), (int)motionevent.getY());
	//    8   16:aload_0         
	//    9   17:getfield        #92  <Field Rect x>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #422 <Method float MotionEvent.getX()>
	//   12   24:f2i             
	//   13   25:aload_1         
	//   14   26:invokevirtual   #425 <Method float MotionEvent.getY()>
	//   15   29:f2i             
	//   16   30:invokestatic    #428 <Method boolean fd.a(Rect, int, int)>
	//   17   33:ifeq            38
	//   18   36:iconst_1        
	//   19   37:ireturn         
	//   20   38:iconst_0        
	//   21   39:ireturn         
	}

	public void a_()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		setVisible(false);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #344 <Method void setVisible(boolean)>
		q();
	//    5    7:aload_0         
	//    6    8:invokespecial   #430 <Method void q()>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Exception exception;
		exception;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public void b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(h != null && h.h())
			break MISSING_BLOCK_LABEL_27;
	//    2    2:aload_0         
	//    3    3:getfield        #330 <Field k h>
	//    4    6:ifnull          19
	//    5    9:aload_0         
	//    6   10:getfield        #330 <Field k h>
	//    7   13:invokevirtual   #434 <Method boolean k.h()>
	//    8   16:ifne            27
		setVisible(false);
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #344 <Method void setVisible(boolean)>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		this;
	//   15   27:aload_0         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		  goto _L1
	//*  17   29:goto            39
		Exception exception;
		exception;
	//   18   32:astore          5
	//*  19   34:aload_0         
		throw exception;
	//   20   35:monitorexit     
	//   21   36:aload           5
	//   22   38:athrow          
_L1:
		int j1;
		int k1;
		Rect rect;
		setVisible(true);
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:invokevirtual   #344 <Method void setVisible(boolean)>
		rect = h.i();
	//   26   44:aload_0         
	//   27   45:getfield        #330 <Field k h>
	//   28   48:invokevirtual   #436 <Method Rect k.i()>
	//   29   51:astore          5
		k1 = h.e() + h.c();
	//   30   53:aload_0         
	//   31   54:getfield        #330 <Field k h>
	//   32   57:invokevirtual   #437 <Method int k.e()>
	//   33   60:aload_0         
	//   34   61:getfield        #330 <Field k h>
	//   35   64:invokevirtual   #439 <Method int k.c()>
	//   36   67:iadd            
	//   37   68:istore_3        
		j1 = h.f() + h.d() + 2;
	//   38   69:aload_0         
	//   39   70:getfield        #330 <Field k h>
	//   40   73:invokevirtual   #440 <Method int k.f()>
	//   41   76:aload_0         
	//   42   77:getfield        #330 <Field k h>
	//   43   80:invokevirtual   #442 <Method int k.d()>
	//   44   83:iadd            
	//   45   84:iconst_2        
	//   46   85:iadd            
	//   47   86:istore_2        
		if(!(h instanceof dj)) goto _L3; else goto _L2
	//   48   87:aload_0         
	//   49   88:getfield        #330 <Field k h>
	//   50   91:instanceof      #444 <Class dj>
	//   51   94:ifeq            402
_L2:
		this;
	//   52   97:aload_0         
		JVM INSTR monitorenter ;
	//   53   98:monitorenter    
		int i1;
		int l1;
		Object obj;
		IMarkerAction imarkeraction;
		Rect rect1;
		Rect rect2;
		if(!i() || v == null && (B != null || D != null))
	//*  54   99:aload_0         
	//*  55  100:invokevirtual   #446 <Method boolean i()>
	//*  56  103:ifeq            481
	//*  57  106:aload_0         
	//*  58  107:getfield        #291 <Field Bitmap v>
	//*  59  110:ifnonnull       486
	//*  60  113:aload_0         
	//*  61  114:getfield        #98  <Field Bitmap B>
	//*  62  117:ifnonnull       481
	//*  63  120:aload_0         
	//*  64  121:getfield        #102 <Field Bitmap D>
	//*  65  124:ifnull          486
	//*  66  127:goto            481
	//*  67  130:iload_1         
	//*  68  131:ifeq            390
	//*  69  134:aload_0         
	//*  70  135:getfield        #330 <Field k h>
	//*  71  138:checkcast       #444 <Class dj>
	//*  72  141:invokevirtual   #450 <Method IMarkerAction dj.getIMarkerAction()>
	//*  73  144:astore          6
	//*  74  146:aload           6
	//*  75  148:ifnull          169
	//*  76  151:aload           6
	//*  77  153:invokeinterface #453 <Method boolean IMarkerAction.isInfoWindowEnable()>
	//*  78  158:ifne            169
	//*  79  161:aload_0         
	//*  80  162:iconst_0        
	//*  81  163:invokevirtual   #344 <Method void setVisible(boolean)>
	//*  82  166:aload_0         
	//*  83  167:monitorexit     
	//*  84  168:return          
	//*  85  169:aload_0         
	//*  86  170:iconst_1        
	//*  87  171:invokevirtual   #344 <Method void setVisible(boolean)>
	//*  88  174:aload           6
	//*  89  176:ifnull          369
	//*  90  179:aload           6
	//*  91  181:invokeinterface #456 <Method boolean IMarkerAction.isInfoWindowAutoOverturn()>
	//*  92  186:ifeq            369
	//*  93  189:aload_0         
	//*  94  190:invokespecial   #458 <Method Rect s()>
	//*  95  193:astore          7
	//*  96  195:aload_0         
	//*  97  196:invokespecial   #460 <Method Rect t()>
	//*  98  199:astore          8
	//*  99  201:aload_0         
	//* 100  202:invokevirtual   #462 <Method boolean d()>
	//* 101  205:ifeq            230
	//* 102  208:aload           8
	//* 103  210:iconst_0        
	//* 104  211:aload           5
	//* 105  213:invokevirtual   #465 <Method int Rect.height()>
	//* 106  216:aload           7
	//* 107  218:invokevirtual   #465 <Method int Rect.height()>
	//* 108  221:iadd            
	//* 109  222:iconst_2        
	//* 110  223:iadd            
	//* 111  224:invokevirtual   #468 <Method void Rect.offset(int, int)>
	//* 112  227:goto            250
	//* 113  230:aload           7
	//* 114  232:iconst_0        
	//* 115  233:aload           5
	//* 116  235:invokevirtual   #465 <Method int Rect.height()>
	//* 117  238:aload           7
	//* 118  240:invokevirtual   #465 <Method int Rect.height()>
	//* 119  243:iadd            
	//* 120  244:iconst_2        
	//* 121  245:iadd            
	//* 122  246:ineg            
	//* 123  247:invokevirtual   #468 <Method void Rect.offset(int, int)>
	//* 124  250:aload_0         
	//* 125  251:getfield        #106 <Field s a>
	//* 126  254:aload           6
	//* 127  256:aload           7
	//* 128  258:invokeinterface #471 <Method int s.a(IMarkerAction, Rect)>
	//* 129  263:istore_1        
	//* 130  264:aload_0         
	//* 131  265:getfield        #106 <Field s a>
	//* 132  268:aload           6
	//* 133  270:aload           8
	//* 134  272:invokeinterface #471 <Method int s.a(IMarkerAction, Rect)>
	//* 135  277:istore          4
	//* 136  279:iload_1         
	//* 137  280:ifle            496
	//* 138  283:iload           4
	//* 139  285:ifeq            491
	//* 140  288:iload           4
	//* 141  290:ifle            496
	//* 142  293:iload_1         
	//* 143  294:iload           4
	//* 144  296:icmpge          496
	//* 145  299:goto            491
	//* 146  302:iload_1         
	//* 147  303:ifeq            343
	//* 148  306:aload_0         
	//* 149  307:getfield        #330 <Field k h>
	//* 150  310:invokevirtual   #440 <Method int k.f()>
	//* 151  313:aload_0         
	//* 152  314:getfield        #330 <Field k h>
	//* 153  317:invokevirtual   #442 <Method int k.d()>
	//* 154  320:iadd            
	//* 155  321:iconst_2        
	//* 156  322:iadd            
	//* 157  323:aload           5
	//* 158  325:invokevirtual   #465 <Method int Rect.height()>
	//* 159  328:iadd            
	//* 160  329:aload           8
	//* 161  331:invokevirtual   #465 <Method int Rect.height()>
	//* 162  334:iadd            
	//* 163  335:istore_1        
	//* 164  336:aload_0         
	//* 165  337:invokespecial   #473 <Method void o()>
	//* 166  340:goto            349
	//* 167  343:aload_0         
	//* 168  344:invokespecial   #475 <Method void p()>
	//* 169  347:iload_2         
	//* 170  348:istore_1        
	//* 171  349:aload_0         
	//* 172  350:aload_0         
	//* 173  351:getfield        #330 <Field k h>
	//* 174  354:invokevirtual   #477 <Method FPoint k.a()>
	//* 175  357:invokevirtual   #479 <Method void a(FPoint)>
	//* 176  360:aload_0         
	//* 177  361:iload_3         
	//* 178  362:iload_1         
	//* 179  363:invokevirtual   #481 <Method void c(int, int)>
	//* 180  366:goto            390
	//* 181  369:aload_0         
	//* 182  370:aload_0         
	//* 183  371:getfield        #330 <Field k h>
	//* 184  374:invokevirtual   #477 <Method FPoint k.a()>
	//* 185  377:invokevirtual   #479 <Method void a(FPoint)>
	//* 186  380:aload_0         
	//* 187  381:iload_3         
	//* 188  382:iload_2         
	//* 189  383:invokevirtual   #481 <Method void c(int, int)>
	//* 190  386:aload_0         
	//* 191  387:invokespecial   #475 <Method void p()>
	//* 192  390:aload_0         
	//* 193  391:monitorexit     
	//* 194  392:goto            501
	//* 195  395:astore          5
	//* 196  397:aload_0         
	//* 197  398:monitorexit     
	//* 198  399:aload           5
	//* 199  401:athrow          
	//* 200  402:aload_0         
	//* 201  403:invokevirtual   #446 <Method boolean i()>
	//* 202  406:ifeq            430
	//* 203  409:aload_0         
	//* 204  410:getfield        #291 <Field Bitmap v>
	//* 205  413:ifnonnull       472
	//* 206  416:aload_0         
	//* 207  417:getfield        #98  <Field Bitmap B>
	//* 208  420:ifnonnull       430
	//* 209  423:aload_0         
	//* 210  424:getfield        #102 <Field Bitmap D>
	//* 211  427:ifnull          472
	//* 212  430:aload_0         
	//* 213  431:getfield        #330 <Field k h>
	//* 214  434:invokevirtual   #328 <Method boolean k.isInfoWindowEnable()>
	//* 215  437:ifne            446
	//* 216  440:aload_0         
	//* 217  441:iconst_0        
	//* 218  442:invokevirtual   #344 <Method void setVisible(boolean)>
	//* 219  445:return          
	//* 220  446:aload_0         
	//* 221  447:iconst_1        
	//* 222  448:invokevirtual   #344 <Method void setVisible(boolean)>
	//* 223  451:aload_0         
	//* 224  452:aload_0         
	//* 225  453:getfield        #330 <Field k h>
	//* 226  456:invokevirtual   #477 <Method FPoint k.a()>
	//* 227  459:invokevirtual   #479 <Method void a(FPoint)>
	//* 228  462:aload_0         
	//* 229  463:iload_3         
	//* 230  464:iload_2         
	//* 231  465:invokevirtual   #481 <Method void c(int, int)>
	//* 232  468:aload_0         
	//* 233  469:invokespecial   #475 <Method void p()>
	//* 234  472:return          
	//* 235  473:astore          5
	//* 236  475:aload           5
	//* 237  477:invokevirtual   #484 <Method void Throwable.printStackTrace()>
	//* 238  480:return          
			i1 = 1;
	//  239  481:iconst_1        
	//  240  482:istore_1        
		else
	//* 241  483:goto            130
			i1 = 0;
	//  242  486:iconst_0        
	//  243  487:istore_1        
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_390;
		imarkeraction = ((dj)h).getIMarkerAction();
		if(imarkeraction == null)
			break MISSING_BLOCK_LABEL_169;
		if(imarkeraction.isInfoWindowEnable())
			break MISSING_BLOCK_LABEL_169;
		setVisible(false);
		this;
		JVM INSTR monitorexit ;
		return;
		setVisible(true);
		if(imarkeraction == null)
			break MISSING_BLOCK_LABEL_369;
		if(!imarkeraction.isInfoWindowAutoOverturn())
			break MISSING_BLOCK_LABEL_369;
		rect1 = s();
		rect2 = t();
		if(d())
		{
			rect2.offset(0, rect.height() + rect1.height() + 2);
			break MISSING_BLOCK_LABEL_250;
		}
		rect1.offset(0, -(rect.height() + rect1.height() + 2));
		i1 = a.a(imarkeraction, rect1);
		l1 = a.a(imarkeraction, rect2);
		if(i1 > 0 && (l1 == 0 || l1 > 0 && i1 < l1))
	//* 244  488:goto            130
			i1 = 1;
	//  245  491:iconst_1        
	//  246  492:istore_1        
		else
	//* 247  493:goto            302
			i1 = 0;
	//  248  496:iconst_0        
	//  249  497:istore_1        
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_343;
		i1 = h.f() + h.d() + 2 + rect.height() + rect2.height();
		o();
		break MISSING_BLOCK_LABEL_349;
		p();
		i1 = j1;
		a(h.a());
		c(k1, i1);
		break MISSING_BLOCK_LABEL_390;
		a(h.a());
		c(k1, j1);
		p();
		this;
		JVM INSTR monitorexit ;
		  goto _L4
		obj;
		throw obj;
_L3:
		if(i() && (v != null || B == null && D == null)) goto _L6; else goto _L5
_L5:
		if(!h.isInfoWindowEnable())
		{
			setVisible(false);
			return;
		}
		setVisible(true);
		a(h.a());
		c(k1, j1);
		p();
_L6:
		return;
		obj;
		((Throwable) (obj)).printStackTrace();
		return;
	//* 250  498:goto            302
_L4:
	//  251  501:return          
	}

	public void b(int i1, int j1)
	{
label0:
		{
			if(!q || n == null || v == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean q>
	//*   2    4:ifeq            21
	//*   3    7:aload_0         
	//*   4    8:getfield        #350 <Field FPoint n>
	//*   5   11:ifnull          21
	//*   6   14:aload_0         
	//*   7   15:getfield        #291 <Field Bitmap v>
	//*   8   18:ifnonnull       22
				return;
	//    9   21:return          
			h();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #486 <Method void h()>
			v.isRecycled();
	//   12   26:aload_0         
	//   13   27:getfield        #291 <Field Bitmap v>
	//   14   30:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//   15   33:pop             
			if(F || v.isRecycled())
				break label0;
	//   16   34:aload_0         
	//   17   35:getfield        #108 <Field boolean F>
	//   18   38:ifne            138
	//   19   41:aload_0         
	//   20   42:getfield        #291 <Field Bitmap v>
	//   21   45:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//   22   48:ifne            138
			try
			{
				if(z != 0)
	//*  23   51:aload_0         
	//*  24   52:getfield        #488 <Field int z>
	//*  25   55:ifeq            76
				{
					GLES20.glDeleteTextures(1, new int[] {
						z
					}, 0);
	//   26   58:iconst_1        
	//   27   59:iconst_1        
	//   28   60:newarray        int[]
	//   29   62:dup             
	//   30   63:iconst_0        
	//   31   64:aload_0         
	//   32   65:getfield        #488 <Field int z>
	//   33   68:iastore         
	//   34   69:iconst_0        
	//   35   70:invokestatic    #491 <Method void GLES20.glDeleteTextures(int, int[], int)>
					break MISSING_BLOCK_LABEL_84;
	//   36   73:goto            84
				}
			}
	//*  37   76:aload_0         
	//*  38   77:aload_0         
	//*  39   78:invokespecial   #493 <Method int n()>
	//*  40   81:putfield        #488 <Field int z>
	//*  41   84:aload_0         
	//*  42   85:getfield        #291 <Field Bitmap v>
	//*  43   88:ifnull          119
	//*  44   91:aload_0         
	//*  45   92:getfield        #291 <Field Bitmap v>
	//*  46   95:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//*  47   98:ifne            119
	//*  48  101:aload_0         
	//*  49  102:getfield        #488 <Field int z>
	//*  50  105:aload_0         
	//*  51  106:getfield        #291 <Field Bitmap v>
	//*  52  109:iconst_0        
	//*  53  110:invokestatic    #496 <Method int fd.b(int, Bitmap, boolean)>
	//*  54  113:pop             
	//*  55  114:aload_0         
	//*  56  115:iconst_1        
	//*  57  116:putfield        #108 <Field boolean F>
	//*  58  119:goto            138
			catch(Throwable throwable)
	//*  59  122:astore_3        
			{
				hm.c(throwable, "PopupOverlay", "drawMarker");
	//   60  123:aload_3         
	//   61  124:ldc2            #498 <String "PopupOverlay">
	//   62  127:ldc2            #500 <String "drawMarker">
	//   63  130:invokestatic    #505 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//   64  133:aload_3         
	//   65  134:invokevirtual   #484 <Method void Throwable.printStackTrace()>
				return;
	//   66  137:return          
			}
		}
		z = n();
		if(v != null && !v.isRecycled())
		{
			fd.b(z, v, false);
			F = true;
		}
		break label0;
		m();
	//   67  138:aload_0         
	//   68  139:invokespecial   #507 <Method void m()>
		if(a(i1, j1))
	//*  69  142:aload_0         
	//*  70  143:iload_1         
	//*  71  144:iload_2         
	//*  72  145:invokevirtual   #509 <Method boolean a(int, int)>
	//*  73  148:ifeq            209
		{
			Matrix.setIdentityM(d, 0);
	//   74  151:aload_0         
	//   75  152:getfield        #112 <Field float[] d>
	//   76  155:iconst_0        
	//   77  156:invokestatic    #515 <Method void Matrix.setIdentityM(float[], int)>
			Matrix.orthoM(d, 0, 0.0F, i1, 0.0F, j1, 1.0F, -1F);
	//   78  159:aload_0         
	//   79  160:getfield        #112 <Field float[] d>
	//   80  163:iconst_0        
	//   81  164:fconst_0        
	//   82  165:iload_1         
	//   83  166:i2f             
	//   84  167:fconst_0        
	//   85  168:iload_2         
	//   86  169:i2f             
	//   87  170:fconst_1        
	//   88  171:ldc2            #516 <Float -1F>
	//   89  174:invokestatic    #520 <Method void Matrix.orthoM(float[], int, float, float, float, float, float, float)>
			a(z, o, r);
	//   90  177:aload_0         
	//   91  178:aload_0         
	//   92  179:getfield        #488 <Field int z>
	//   93  182:aload_0         
	//   94  183:getfield        #80  <Field FloatBuffer o>
	//   95  186:aload_0         
	//   96  187:getfield        #404 <Field FloatBuffer r>
	//   97  190:invokespecial   #522 <Method void a(int, FloatBuffer, FloatBuffer)>
			if(u)
	//*  98  193:aload_0         
	//*  99  194:getfield        #524 <Field boolean u>
	//* 100  197:ifeq            209
			{
				u = false;
	//  101  200:aload_0         
	//  102  201:iconst_0        
	//  103  202:putfield        #524 <Field boolean u>
				r();
	//  104  205:aload_0         
	//  105  206:invokespecial   #526 <Method void r()>
			}
		}
		return;
	//  106  209:return          
	}

	public void b(Bitmap bitmap)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(bitmap == null)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_1         
	//    3    3:ifnull          17
		int i1;
		int j1;
		boolean flag;
		try
		{
			flag = bitmap.isRecycled();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//    6   10:istore          4
		}
	//*   7   12:iload           4
	//*   8   14:ifeq            20
	//*   9   17:aload_0         
	//*  10   18:monitorexit     
	//*  11   19:return          
	//*  12   20:aload_0         
	//*  13   21:getfield        #291 <Field Bitmap v>
	//*  14   24:ifnull          48
	//*  15   27:aload_0         
	//*  16   28:getfield        #291 <Field Bitmap v>
	//*  17   31:invokevirtual   #257 <Method int Object.hashCode()>
	//*  18   34:istore_2        
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #257 <Method int Object.hashCode()>
	//*  21   39:istore_3        
	//*  22   40:iload_2         
	//*  23   41:iload_3         
	//*  24   42:icmpne          48
	//*  25   45:aload_0         
	//*  26   46:monitorexit     
	//*  27   47:return          
	//*  28   48:aload_0         
	//*  29   49:getfield        #291 <Field Bitmap v>
	//*  30   52:ifnull          129
	//*  31   55:aload_0         
	//*  32   56:getfield        #98  <Field Bitmap B>
	//*  33   59:ifnonnull       102
	//*  34   62:aload_0         
	//*  35   63:getfield        #100 <Field Bitmap C>
	//*  36   66:ifnonnull       102
	//*  37   69:aload_0         
	//*  38   70:getfield        #102 <Field Bitmap D>
	//*  39   73:ifnonnull       102
	//*  40   76:aload_0         
	//*  41   77:getfield        #104 <Field Bitmap E>
	//*  42   80:ifnonnull       102
	//*  43   83:aload_0         
	//*  44   84:aload_0         
	//*  45   85:getfield        #297 <Field Bitmap w>
	//*  46   88:invokespecial   #252 <Method void c(Bitmap)>
	//*  47   91:aload_0         
	//*  48   92:aload_0         
	//*  49   93:getfield        #291 <Field Bitmap v>
	//*  50   96:putfield        #297 <Field Bitmap w>
	//*  51   99:goto            129
	//*  52  102:aload_0         
	//*  53  103:aload_0         
	//*  54  104:getfield        #291 <Field Bitmap v>
	//*  55  107:invokespecial   #528 <Method boolean g(Bitmap)>
	//*  56  110:ifne            129
	//*  57  113:aload_0         
	//*  58  114:aload_0         
	//*  59  115:getfield        #297 <Field Bitmap w>
	//*  60  118:invokespecial   #252 <Method void c(Bitmap)>
	//*  61  121:aload_0         
	//*  62  122:aload_0         
	//*  63  123:getfield        #291 <Field Bitmap v>
	//*  64  126:putfield        #297 <Field Bitmap w>
	//*  65  129:aload_0         
	//*  66  130:iconst_0        
	//*  67  131:putfield        #108 <Field boolean F>
	//*  68  134:aload_0         
	//*  69  135:aload_1         
	//*  70  136:putfield        #291 <Field Bitmap v>
	//*  71  139:goto            143
		// Misplaced declaration of an exception variable
		catch(Bitmap bitmap)
	//*  72  142:astore_1        
	//*  73  143:aload_0         
		{
			return;
	//   74  144:monitorexit     
	//   75  145:return          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_20;
		this;
		JVM INSTR monitorexit ;
		return;
		if(v == null)
			break MISSING_BLOCK_LABEL_48;
		i1 = ((Object) (v)).hashCode();
		j1 = ((Object) (bitmap)).hashCode();
		if(i1 != j1)
			break MISSING_BLOCK_LABEL_48;
		this;
		JVM INSTR monitorexit ;
		return;
		if(v == null)
			break MISSING_BLOCK_LABEL_129;
		if(B == null && C == null && D == null && E == null)
		{
			c(w);
			w = v;
			break MISSING_BLOCK_LABEL_129;
		}
		if(!g(v))
		{
			c(w);
			w = v;
		}
		F = false;
		v = bitmap;
		break MISSING_BLOCK_LABEL_143;
		bitmap;
	//   76  146:astore_1        
	//*  77  147:aload_0         
		throw bitmap;
	//   78  148:monitorexit     
	//   79  149:aload_1         
	//   80  150:athrow          
	}

	public void c(int i1, int j1)
		throws RemoteException
	{
		if(I)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field boolean I>
	//*   2    4:ifeq            18
		{
			l = i1;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #76  <Field int l>
			m = j1;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #78  <Field int m>
			return;
	//    9   17:return          
		} else
		{
			j = i1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #72  <Field int j>
			k = j1;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #74  <Field int k>
			l = i1;
	//   16   28:aload_0         
	//   17   29:iload_1         
	//   18   30:putfield        #76  <Field int l>
			m = j1;
	//   19   33:aload_0         
	//   20   34:iload_2         
	//   21   35:putfield        #78  <Field int m>
			return;
	//   22   38:return          
		}
	}

	public boolean c()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean d()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field boolean A>
	//    2    4:ireturn         
	}

	public void destroy()
	{
		if(i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean i>
	//*   2    4:ifeq            81
			try
			{
				remove();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #532 <Method void remove()>
				q();
	//    5   11:aload_0         
	//    6   12:invokespecial   #430 <Method void q()>
				if(r != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #404 <Field FloatBuffer r>
	//*   9   19:ifnull          35
				{
					r.clear();
	//   10   22:aload_0         
	//   11   23:getfield        #404 <Field FloatBuffer r>
	//   12   26:invokevirtual   #538 <Method java.nio.Buffer FloatBuffer.clear()>
	//   13   29:pop             
					r = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #404 <Field FloatBuffer r>
				}
				if(o != null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #80  <Field FloatBuffer o>
	//*  19   39:ifnull          55
				{
					o.clear();
	//   20   42:aload_0         
	//   21   43:getfield        #80  <Field FloatBuffer o>
	//   22   46:invokevirtual   #538 <Method java.nio.Buffer FloatBuffer.clear()>
	//   23   49:pop             
					o = null;
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:putfield        #80  <Field FloatBuffer o>
				}
				n = null;
	//   27   55:aload_0         
	//   28   56:aconst_null     
	//   29   57:putfield        #350 <Field FPoint n>
				z = 0;
	//   30   60:aload_0         
	//   31   61:iconst_0        
	//   32   62:putfield        #488 <Field int z>
				return;
	//   33   65:return          
			}
			catch(Throwable throwable)
	//*  34   66:astore_1        
			{
				hm.c(throwable, "PopupOverlay", "realDestroy");
	//   35   67:aload_1         
	//   36   68:ldc2            #498 <String "PopupOverlay">
	//   37   71:ldc2            #540 <String "realDestroy">
	//   38   74:invokestatic    #505 <Method void hm.c(Throwable, String, String)>
				throwable.printStackTrace();
	//   39   77:aload_1         
	//   40   78:invokevirtual   #484 <Method void Throwable.printStackTrace()>
			}
	//   41   81:return          
	}

	public int e()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i1;
		if(v == null || v.isRecycled())
			break MISSING_BLOCK_LABEL_31;
	//    2    2:aload_0         
	//    3    3:getfield        #291 <Field Bitmap v>
	//    4    6:ifnull          31
	//    5    9:aload_0         
	//    6   10:getfield        #291 <Field Bitmap v>
	//    7   13:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//    8   16:ifne            31
		i1 = v.getWidth();
	//    9   19:aload_0         
	//   10   20:getfield        #291 <Field Bitmap v>
	//   11   23:invokevirtual   #402 <Method int Bitmap.getWidth()>
	//   12   26:istore_1        
	//*  13   27:aload_0         
	//*  14   28:monitorexit     
		return i1;
	//   15   29:iload_1         
	//   16   30:ireturn         
		this;
	//   17   31:aload_0         
		JVM INSTR monitorexit ;
	//   18   32:monitorexit     
		  goto _L1
	//*  19   33:goto            41
		Exception exception;
		exception;
	//   20   36:astore_2        
	//*  21   37:aload_0         
		try
	//*  22   38:monitorexit     
		{
			throw exception;
	//   23   39:aload_2         
	//   24   40:athrow          
		}
	//*  25   41:goto            47
		catch(Throwable throwable)
	//*  26   44:astore_2        
		{
			return 0;
	//   27   45:iconst_0        
	//   28   46:ireturn         
		}
_L1:
		return 0;
	//   29   47:iconst_0        
	//   30   48:ireturn         
	}

	public boolean equalsRemote(IOverlay ioverlay)
		throws RemoteException
	{
		return ((Object)this).equals(((Object) (ioverlay))) || ioverlay.getId().equals(((Object) (getId())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #543 <Method boolean Object.equals(Object)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:invokeinterface #546 <Method String IOverlay.getId()>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #124 <Method String getId()>
	//    8   18:invokevirtual   #337 <Method boolean String.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int f()
	{
label0:
		{
			int i1;
			try
			{
				if(v == null || v.isRecycled())
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field Bitmap v>
	//    2    4:ifnull          27
	//    3    7:aload_0         
	//    4    8:getfield        #291 <Field Bitmap v>
	//    5   11:invokevirtual   #234 <Method boolean Bitmap.isRecycled()>
	//    6   14:ifne            27
				i1 = v.getHeight();
	//    7   17:aload_0         
	//    8   18:getfield        #291 <Field Bitmap v>
	//    9   21:invokevirtual   #317 <Method int Bitmap.getHeight()>
	//   10   24:istore_1        
			}
	//*  11   25:iload_1         
	//*  12   26:ireturn         
	//*  13   27:goto            33
			catch(Throwable throwable)
	//*  14   30:astore_2        
			{
				return 0;
	//   15   31:iconst_0        
	//   16   32:ireturn         
			}
			return i1;
		}
		return 0;
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	public void g()
	{
		c = new a("texture.glsl");
	//    0    0:aload_0         
	//    1    1:new             #14  <Class do$a>
	//    2    4:dup             
	//    3    5:ldc2            #548 <String "texture.glsl">
	//    4    8:invokespecial   #551 <Method void do$a(String)>
	//    5   11:putfield        #162 <Field do$a c>
	//    6   14:return          
	}

	public String getId()
	{
		if(p == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field String p>
	//*   2    4:ifnonnull       14
			p = "PopupOverlay";
	//    3    7:aload_0         
	//    4    8:ldc2            #498 <String "PopupOverlay">
	//    5   11:putfield        #126 <Field String p>
		return p;
	//    6   14:aload_0         
	//    7   15:getfield        #126 <Field String p>
	//    8   18:areturn         
	}

	public float getZIndex()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	protected void h()
	{
		long l1 = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_1        
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		long l2;
		if(f == null)
			break MISSING_BLOCK_LABEL_103;
	//    4    4:aload_0         
	//    5    5:getfield        #320 <Field aw f>
	//    6    8:ifnull          103
		if(h instanceof dj)
	//*   7   11:aload_0         
	//*   8   12:getfield        #330 <Field k h>
	//*   9   15:instanceof      #444 <Class dj>
	//*  10   18:ifeq            50
		{
			Marker marker = new Marker((IMarker)h);
	//   11   21:new             #554 <Class Marker>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #330 <Field k h>
	//   15   29:checkcast       #556 <Class IMarker>
	//   16   32:invokespecial   #559 <Method void Marker(IMarker)>
	//   17   35:astore          5
			l2 = f.c(((com.amap.api.maps.model.BasePointOverlay) (marker)));
	//   18   37:aload_0         
	//   19   38:getfield        #320 <Field aw f>
	//   20   41:aload           5
	//   21   43:invokevirtual   #564 <Method long aw.c(com.amap.api.maps.model.BasePointOverlay)>
	//   22   46:lstore_3        
			break MISSING_BLOCK_LABEL_76;
	//   23   47:goto            76
		}
		GL3DModel gl3dmodel = new GL3DModel(((com.autonavi.amap.mapcore.interfaces.IglModel) ((cv)h)));
	//   24   50:new             #566 <Class GL3DModel>
	//   25   53:dup             
	//   26   54:aload_0         
	//   27   55:getfield        #330 <Field k h>
	//   28   58:checkcast       #568 <Class cv>
	//   29   61:invokespecial   #571 <Method void GL3DModel(com.autonavi.amap.mapcore.interfaces.IglModel)>
	//   30   64:astore          5
		l2 = f.c(((com.amap.api.maps.model.BasePointOverlay) (gl3dmodel)));
	//   31   66:aload_0         
	//   32   67:getfield        #320 <Field aw f>
	//   33   70:aload           5
	//   34   72:invokevirtual   #564 <Method long aw.c(com.amap.api.maps.model.BasePointOverlay)>
	//   35   75:lstore_3        
		if(l2 <= 0L)
	//*  36   76:lload_3         
	//*  37   77:lconst_0        
	//*  38   78:lcmp            
	//*  39   79:ifgt            89
		{
			l1 = 0xffffffffL;
	//   40   82:ldc2w           #572 <Long 0xffffffffL>
	//   41   85:lstore_1        
		} else
	//*  42   86:goto            103
		{
			l1 = l2;
	//   43   89:lload_3         
	//   44   90:lstore_1        
			if(l2 <= 100L)
	//*  45   91:lload_3         
	//*  46   92:ldc2w           #574 <Long 100L>
	//*  47   95:lcmp            
	//*  48   96:ifgt            103
				l1 = 100L;
	//   49   99:ldc2w           #574 <Long 100L>
	//   50  102:lstore_1        
		}
		this;
	//   51  103:aload_0         
		JVM INSTR monitorexit ;
	//   52  104:monitorexit     
		  goto _L1
	//*  53  105:goto            115
		Exception exception;
		exception;
	//   54  108:astore          5
	//*  55  110:aload_0         
		throw exception;
	//   56  111:monitorexit     
	//   57  112:aload           5
	//   58  114:athrow          
_L1:
		long l3 = System.currentTimeMillis();
	//   59  115:invokestatic    #580 <Method long System.currentTimeMillis()>
	//   60  118:lstore_3        
		if(l3 - e > l1)
	//*  61  119:lload_3         
	//*  62  120:aload_0         
	//*  63  121:getfield        #114 <Field long e>
	//*  64  124:lsub            
	//*  65  125:lload_1         
	//*  66  126:lcmp            
	//*  67  127:ifle            162
		{
			if(e != 0L)
	//*  68  130:aload_0         
	//*  69  131:getfield        #114 <Field long e>
	//*  70  134:lconst_0        
	//*  71  135:lcmp            
	//*  72  136:ifeq            157
				try
				{
					a(h);
	//   73  139:aload_0         
	//   74  140:aload_0         
	//   75  141:getfield        #330 <Field k h>
	//   76  144:invokevirtual   #582 <Method void a(k)>
				}
	//*  77  147:goto            157
				catch(RemoteException remoteexception)
	//*  78  150:astore          5
				{
					remoteexception.printStackTrace();
	//   79  152:aload           5
	//   80  154:invokevirtual   #583 <Method void RemoteException.printStackTrace()>
				}
			e = l3;
	//   81  157:aload_0         
	//   82  158:lload_3         
	//   83  159:putfield        #114 <Field long e>
		}
		return;
	//   84  162:return          
	}

	public int hashCodeRemote()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public boolean i()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field boolean I>
	//    2    4:ireturn         
	}

	public boolean isAboveMaskLayer()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisible()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field boolean q>
	//    2    4:ireturn         
	}

	protected void j()
	{
		Bitmap bitmap1;
		Object obj;
		if(!(h instanceof dj))
			break MISSING_BLOCK_LABEL_151;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field k h>
	//    2    4:instanceof      #444 <Class dj>
	//    3    7:ifeq            151
		obj = ((Object) (new Marker((IMarker)h)));
	//    4   10:new             #554 <Class Marker>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:getfield        #330 <Field k h>
	//    8   18:checkcast       #556 <Class IMarker>
	//    9   21:invokespecial   #559 <Method void Marker(IMarker)>
	//   10   24:astore_3        
		if(f == null)
			break MISSING_BLOCK_LABEL_253;
	//   11   25:aload_0         
	//   12   26:getfield        #320 <Field aw f>
	//   13   29:ifnull          253
		bitmap1 = a(f.a(((com.amap.api.maps.model.BasePointOverlay) (obj))));
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #320 <Field aw f>
	//   17   37:aload_3         
	//   18   38:invokevirtual   #589 <Method View aw.a(com.amap.api.maps.model.BasePointOverlay)>
	//   19   41:invokespecial   #590 <Method Bitmap a(View)>
	//   20   44:astore_2        
		Bitmap bitmap = bitmap1;
	//   21   45:aload_2         
	//   22   46:astore_1        
		if(bitmap1 != null)
			break MISSING_BLOCK_LABEL_95;
	//   23   47:aload_2         
	//   24   48:ifnonnull       95
		View view;
		try
		{
			view = f.b(((com.amap.api.maps.model.BasePointOverlay) (obj)));
	//   25   51:aload_0         
	//   26   52:getfield        #320 <Field aw f>
	//   27   55:aload_3         
	//   28   56:invokevirtual   #592 <Method View aw.b(com.amap.api.maps.model.BasePointOverlay)>
	//   29   59:astore          4
		}
	//*  30   61:aload_2         
	//*  31   62:astore_1        
	//*  32   63:aload           4
	//*  33   65:ifnull          95
	//*  34   68:aload           4
	//*  35   70:invokevirtual   #596 <Method android.graphics.drawable.Drawable View.getBackground()>
	//*  36   73:ifnonnull       88
	//*  37   76:aload           4
	//*  38   78:aload_0         
	//*  39   79:getfield        #320 <Field aw f>
	//*  40   82:invokevirtual   #598 <Method android.graphics.drawable.Drawable aw.f()>
	//*  41   85:invokevirtual   #602 <Method void View.setBackground(android.graphics.drawable.Drawable)>
	//*  42   88:aload_0         
	//*  43   89:aload           4
	//*  44   91:invokespecial   #590 <Method Bitmap a(View)>
	//*  45   94:astore_1        
	//*  46   95:aload_0         
	//*  47   96:aload_1         
	//*  48   97:invokevirtual   #604 <Method void a(Bitmap)>
	//*  49  100:aload_0         
	//*  50  101:aload_0         
	//*  51  102:aload_0         
	//*  52  103:getfield        #320 <Field aw f>
	//*  53  106:aload_3         
	//*  54  107:invokevirtual   #607 <Method View aw.a(Marker)>
	//*  55  110:invokespecial   #590 <Method Bitmap a(View)>
	//*  56  113:invokespecial   #609 <Method void d(Bitmap)>
	//*  57  116:aload_0         
	//*  58  117:aload_0         
	//*  59  118:aload_0         
	//*  60  119:getfield        #320 <Field aw f>
	//*  61  122:aload_3         
	//*  62  123:invokevirtual   #611 <Method View aw.b(Marker)>
	//*  63  126:invokespecial   #590 <Method Bitmap a(View)>
	//*  64  129:invokespecial   #613 <Method void e(Bitmap)>
	//*  65  132:aload_0         
	//*  66  133:aload_0         
	//*  67  134:aload_0         
	//*  68  135:getfield        #320 <Field aw f>
	//*  69  138:aload_3         
	//*  70  139:invokevirtual   #615 <Method View aw.c(Marker)>
	//*  71  142:invokespecial   #590 <Method Bitmap a(View)>
	//*  72  145:invokespecial   #617 <Method void f(Bitmap)>
	//*  73  148:goto            253
	//*  74  151:aload_0         
	//*  75  152:getfield        #320 <Field aw f>
	//*  76  155:ifnull          236
	//*  77  158:new             #566 <Class GL3DModel>
	//*  78  161:dup             
	//*  79  162:aload_0         
	//*  80  163:getfield        #330 <Field k h>
	//*  81  166:checkcast       #568 <Class cv>
	//*  82  169:invokespecial   #571 <Method void GL3DModel(com.autonavi.amap.mapcore.interfaces.IglModel)>
	//*  83  172:astore_3        
	//*  84  173:aload_0         
	//*  85  174:aload_0         
	//*  86  175:getfield        #320 <Field aw f>
	//*  87  178:aload_3         
	//*  88  179:invokevirtual   #589 <Method View aw.a(com.amap.api.maps.model.BasePointOverlay)>
	//*  89  182:invokespecial   #590 <Method Bitmap a(View)>
	//*  90  185:astore_2        
	//*  91  186:aload_2         
	//*  92  187:astore_1        
	//*  93  188:aload_2         
	//*  94  189:ifnonnull       231
	//*  95  192:aload_0         
	//*  96  193:getfield        #320 <Field aw f>
	//*  97  196:aload_3         
	//*  98  197:invokevirtual   #592 <Method View aw.b(com.amap.api.maps.model.BasePointOverlay)>
	//*  99  200:astore_3        
	//* 100  201:aload_2         
	//* 101  202:astore_1        
	//* 102  203:aload_3         
	//* 103  204:ifnull          231
	//* 104  207:aload_3         
	//* 105  208:invokevirtual   #596 <Method android.graphics.drawable.Drawable View.getBackground()>
	//* 106  211:ifnonnull       225
	//* 107  214:aload_3         
	//* 108  215:aload_0         
	//* 109  216:getfield        #320 <Field aw f>
	//* 110  219:invokevirtual   #598 <Method android.graphics.drawable.Drawable aw.f()>
	//* 111  222:invokevirtual   #602 <Method void View.setBackground(android.graphics.drawable.Drawable)>
	//* 112  225:aload_0         
	//* 113  226:aload_3         
	//* 114  227:invokespecial   #590 <Method Bitmap a(View)>
	//* 115  230:astore_1        
	//* 116  231:aload_0         
	//* 117  232:aload_1         
	//* 118  233:invokevirtual   #604 <Method void a(Bitmap)>
	//* 119  236:return          
		catch(Throwable throwable)
	//* 120  237:astore_1        
		{
			hm.c(throwable, "PopupOverlay", "getInfoWindow");
	//  121  238:aload_1         
	//  122  239:ldc2            #498 <String "PopupOverlay">
	//  123  242:ldc2            #619 <String "getInfoWindow">
	//  124  245:invokestatic    #505 <Method void hm.c(Throwable, String, String)>
			throwable.printStackTrace();
	//  125  248:aload_1         
	//  126  249:invokevirtual   #484 <Method void Throwable.printStackTrace()>
			return;
	//  127  252:return          
		}
		bitmap = bitmap1;
		if(view == null)
			break MISSING_BLOCK_LABEL_95;
		if(view.getBackground() == null)
			view.setBackground(f.f());
		bitmap = a(view);
		a(bitmap);
		d(a(f.a(((Marker) (obj)))));
		e(a(f.b(((Marker) (obj)))));
		f(a(f.c(((Marker) (obj)))));
		break MISSING_BLOCK_LABEL_253;
		if(f == null)
			break MISSING_BLOCK_LABEL_236;
		obj = ((Object) (new GL3DModel(((com.autonavi.amap.mapcore.interfaces.IglModel) ((cv)h)))));
		bitmap1 = a(f.a(((com.amap.api.maps.model.BasePointOverlay) (obj))));
		bitmap = bitmap1;
		if(bitmap1 != null)
			break MISSING_BLOCK_LABEL_231;
		obj = ((Object) (f.b(((com.amap.api.maps.model.BasePointOverlay) (obj)))));
		bitmap = bitmap1;
		if(obj == null)
			break MISSING_BLOCK_LABEL_231;
		if(((View) (obj)).getBackground() == null)
			((View) (obj)).setBackground(f.f());
		bitmap = a(((View) (obj)));
		a(bitmap);
		return;
	//  128  253:return          
	}

	public void remove()
		throws RemoteException
	{
	//    0    0:return          
	}

	public void setAboveMaskLayer(boolean flag)
	{
	//    0    0:return          
	}

	public void setInfoWindowAnimation(Animation animation, com.amap.api.maps.model.animation.Animation.AnimationListener animationlistener)
	{
	//    0    0:return          
	}

	public void setInfoWindowAppearAnimation(Animation animation)
	{
		if(H != null && ((Object) (H)).equals(((Object) (animation.glAnimation))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #239 <Field GLAnimation H>
	//*   2    4:ifnull          45
	//*   3    7:aload_0         
	//*   4    8:getfield        #239 <Field GLAnimation H>
	//*   5   11:aload_1         
	//*   6   12:getfield        #629 <Field GLAnimation Animation.glAnimation>
	//*   7   15:invokevirtual   #543 <Method boolean Object.equals(Object)>
	//*   8   18:ifeq            45
		{
			try
			{
				G = animation.glAnimation.clone();
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:getfield        #629 <Field GLAnimation Animation.glAnimation>
	//   12   26:invokevirtual   #633 <Method GLAnimation GLAnimation.clone()>
	//   13   29:putfield        #159 <Field GLAnimation G>
				return;
	//   14   32:return          
			}
			// Misplaced declaration of an exception variable
			catch(Animation animation)
	//*  15   33:astore_1        
			{
				hm.c(((Throwable) (animation)), "PopupOverlay", "setInfoWindowDisappearAnimation");
	//   16   34:aload_1         
	//   17   35:ldc2            #498 <String "PopupOverlay">
	//   18   38:ldc2            #635 <String "setInfoWindowDisappearAnimation">
	//   19   41:invokestatic    #505 <Method void hm.c(Throwable, String, String)>
			}
			return;
	//   20   44:return          
		} else
		{
			G = animation.glAnimation;
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:getfield        #629 <Field GLAnimation Animation.glAnimation>
	//   24   50:putfield        #159 <Field GLAnimation G>
			return;
	//   25   53:return          
		}
	}

	public void setInfoWindowBackColor(int i1)
	{
	//    0    0:return          
	}

	public void setInfoWindowBackEnable(boolean flag)
	{
	//    0    0:return          
	}

	public void setInfoWindowBackScale(float f1, float f2)
	{
	//    0    0:return          
	}

	public void setInfoWindowDisappearAnimation(Animation animation)
	{
		if(G != null && ((Object) (G)).equals(((Object) (animation.glAnimation))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field GLAnimation G>
	//*   2    4:ifnull          45
	//*   3    7:aload_0         
	//*   4    8:getfield        #159 <Field GLAnimation G>
	//*   5   11:aload_1         
	//*   6   12:getfield        #629 <Field GLAnimation Animation.glAnimation>
	//*   7   15:invokevirtual   #543 <Method boolean Object.equals(Object)>
	//*   8   18:ifeq            45
		{
			try
			{
				H = animation.glAnimation.clone();
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:getfield        #629 <Field GLAnimation Animation.glAnimation>
	//   12   26:invokevirtual   #633 <Method GLAnimation GLAnimation.clone()>
	//   13   29:putfield        #239 <Field GLAnimation H>
				return;
	//   14   32:return          
			}
			// Misplaced declaration of an exception variable
			catch(Animation animation)
	//*  15   33:astore_1        
			{
				hm.c(((Throwable) (animation)), "PopupOverlay", "setInfoWindowDisappearAnimation");
	//   16   34:aload_1         
	//   17   35:ldc2            #498 <String "PopupOverlay">
	//   18   38:ldc2            #635 <String "setInfoWindowDisappearAnimation">
	//   19   41:invokestatic    #505 <Method void hm.c(Throwable, String, String)>
			}
			return;
	//   20   44:return          
		} else
		{
			H = animation.glAnimation;
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:getfield        #629 <Field GLAnimation Animation.glAnimation>
	//   24   50:putfield        #239 <Field GLAnimation H>
			return;
	//   25   53:return          
		}
	}

	public void setInfoWindowMovingAnimation(Animation animation)
	{
	//    0    0:return          
	}

	public void setVisible(boolean flag)
	{
		if(!q && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field boolean q>
	//*   2    4:ifne            16
	//*   3    7:iload_1         
	//*   4    8:ifeq            16
			u = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #524 <Field boolean u>
		q = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #82  <Field boolean q>
	//   11   21:return          
	}

	public void setZIndex(float f1)
	{
	//    0    0:return          
	}

	public void startAnimation()
	{
	//    0    0:return          
	}

	private boolean A;
	private Bitmap B;
	private Bitmap C;
	private Bitmap D;
	private Bitmap E;
	private boolean F;
	private GLAnimation G;
	private GLAnimation H;
	private boolean I;
	private boolean J;
	s a;
	float b[];
	a c;
	float d[] = {
		1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
		1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
	};
	long e;
	aw f;
	private Context g;
	private k h;
	private boolean i;
	private int j;
	private int k;
	private int l;
	private int m;
	private FPoint n;
	private FloatBuffer o;
	private String p;
	private boolean q;
	private FloatBuffer r;
	private float s;
	private float t;
	private boolean u;
	private Bitmap v;
	private Bitmap w;
	private Rect x;
	private float y;
	private int z;
}
