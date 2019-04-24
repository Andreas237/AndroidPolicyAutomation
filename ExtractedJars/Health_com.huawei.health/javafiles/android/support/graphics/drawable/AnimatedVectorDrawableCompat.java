// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.animation.*;
import android.content.Context;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.ae;
import o.ag;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

public class AnimatedVectorDrawableCompat extends ag
	implements Animatable
{
	static class c extends android.graphics.drawable.Drawable.ConstantState
	{

		public boolean canApplyTheme()
		{
			return e.canApplyTheme();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
		//    2    4:invokevirtual   #21  <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
		//    3    7:ireturn         
		}

		public int getChangingConfigurations()
		{
			return e.getChangingConfigurations();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
		//    2    4:invokevirtual   #25  <Method int android.graphics.drawable.Drawable$ConstantState.getChangingConfigurations()>
		//    3    7:ireturn         
		}

		public Drawable newDrawable()
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
		//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AnimatedVectorDrawableCompat()>
		//    3    7:astore_1        
			animatedvectordrawablecompat.mDelegateDrawable = e.newDrawable();
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
		//    7   13:invokevirtual   #30  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//    8   16:putfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
		//    9   19:aload_1         
		//   10   20:getfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		//   11   23:aload_1         
		//   12   24:getfield        #38  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
		//   13   27:invokevirtual   #44  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			return ((Drawable) (animatedvectordrawablecompat));
		//   14   30:aload_1         
		//   15   31:areturn         
		}

		public Drawable newDrawable(Resources resources)
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
		//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AnimatedVectorDrawableCompat()>
		//    3    7:astore_2        
			animatedvectordrawablecompat.mDelegateDrawable = e.newDrawable(resources);
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #47  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//    9   17:putfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
		//   10   20:aload_2         
		//   11   21:getfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		//   12   24:aload_2         
		//   13   25:getfield        #38  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
		//   14   28:invokevirtual   #44  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			return ((Drawable) (animatedvectordrawablecompat));
		//   15   31:aload_2         
		//   16   32:areturn         
		}

		public Drawable newDrawable(Resources resources, android.content.res.Resources.Theme theme)
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat();
		//    0    0:new             #6   <Class AnimatedVectorDrawableCompat>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AnimatedVectorDrawableCompat()>
		//    3    7:astore_3        
			animatedvectordrawablecompat.mDelegateDrawable = e.newDrawable(resources, theme);
		//    4    8:aload_3         
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokevirtual   #50  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources, android.content.res.Resources$Theme)>
		//   10   18:putfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
		//   11   21:aload_3         
		//   12   22:getfield        #34  <Field Drawable AnimatedVectorDrawableCompat.mDelegateDrawable>
		//   13   25:aload_3         
		//   14   26:getfield        #38  <Field android.graphics.drawable.Drawable$Callback AnimatedVectorDrawableCompat.mCallback>
		//   15   29:invokevirtual   #44  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			return ((Drawable) (animatedvectordrawablecompat));
		//   16   32:aload_3         
		//   17   33:areturn         
		}

		private final android.graphics.drawable.Drawable.ConstantState e;

		public c(android.graphics.drawable.Drawable.ConstantState constantstate)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void android.graphics.drawable.Drawable$ConstantState()>
			e = constantstate;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field android.graphics.drawable.Drawable$ConstantState e>
		//    5    9:return          
		}
	}

	static class d extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return d;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int d>
		//    2    4:ireturn         
		}

		public Drawable newDrawable()
		{
			throw new IllegalStateException("No constant state support for SDK < 24.");
		//    0    0:new             #108 <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #110 <String "No constant state support for SDK < 24.">
		//    3    6:invokespecial   #113 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		public Drawable newDrawable(Resources resources)
		{
			throw new IllegalStateException("No constant state support for SDK < 24.");
		//    0    0:new             #108 <Class IllegalStateException>
		//    1    3:dup             
		//    2    4:ldc1            #110 <String "No constant state support for SDK < 24.">
		//    3    6:invokespecial   #113 <Method void IllegalStateException(String)>
		//    4    9:athrow          
		}

		ArrayMap a;
		VectorDrawableCompat c;
		int d;
		ArrayList e;

		public d(Context context, d d1, android.graphics.drawable.Drawable.Callback callback, Resources resources)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void android.graphics.drawable.Drawable$ConstantState()>
			if(d1 != null)
		//*   2    4:aload_2         
		//*   3    5:ifnull          229
			{
				d = d1.d;
		//    4    8:aload_0         
		//    5    9:aload_2         
		//    6   10:getfield        #23  <Field int d>
		//    7   13:putfield        #23  <Field int d>
				if(d1.c != null)
		//*   8   16:aload_2         
		//*   9   17:getfield        #25  <Field VectorDrawableCompat c>
		//*  10   20:ifnull          107
				{
					context = ((Context) (d1.c.getConstantState()));
		//   11   23:aload_2         
		//   12   24:getfield        #25  <Field VectorDrawableCompat c>
		//   13   27:invokevirtual   #31  <Method android.graphics.drawable.Drawable$ConstantState VectorDrawableCompat.getConstantState()>
		//   14   30:astore_1        
					if(resources != null)
		//*  15   31:aload           4
		//*  16   33:ifnull          52
						c = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable(resources);
		//   17   36:aload_0         
		//   18   37:aload_1         
		//   19   38:aload           4
		//   20   40:invokevirtual   #35  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
		//   21   43:checkcast       #27  <Class VectorDrawableCompat>
		//   22   46:putfield        #25  <Field VectorDrawableCompat c>
					else
		//*  23   49:goto            63
						c = (VectorDrawableCompat)((android.graphics.drawable.Drawable.ConstantState) (context)).newDrawable();
		//   24   52:aload_0         
		//   25   53:aload_1         
		//   26   54:invokevirtual   #38  <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable()>
		//   27   57:checkcast       #27  <Class VectorDrawableCompat>
		//   28   60:putfield        #25  <Field VectorDrawableCompat c>
					c = (VectorDrawableCompat)c.mutate();
		//   29   63:aload_0         
		//   30   64:aload_0         
		//   31   65:getfield        #25  <Field VectorDrawableCompat c>
		//   32   68:invokevirtual   #41  <Method Drawable VectorDrawableCompat.mutate()>
		//   33   71:checkcast       #27  <Class VectorDrawableCompat>
		//   34   74:putfield        #25  <Field VectorDrawableCompat c>
					c.setCallback(callback);
		//   35   77:aload_0         
		//   36   78:getfield        #25  <Field VectorDrawableCompat c>
		//   37   81:aload_3         
		//   38   82:invokevirtual   #45  <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
					c.setBounds(d1.c.getBounds());
		//   39   85:aload_0         
		//   40   86:getfield        #25  <Field VectorDrawableCompat c>
		//   41   89:aload_2         
		//   42   90:getfield        #25  <Field VectorDrawableCompat c>
		//   43   93:invokevirtual   #49  <Method Rect VectorDrawableCompat.getBounds()>
		//   44   96:invokevirtual   #53  <Method void VectorDrawableCompat.setBounds(Rect)>
					c.setAllowCaching(false);
		//   45   99:aload_0         
		//   46  100:getfield        #25  <Field VectorDrawableCompat c>
		//   47  103:iconst_0        
		//   48  104:invokevirtual   #57  <Method void VectorDrawableCompat.setAllowCaching(boolean)>
				}
				if(d1.e != null)
		//*  49  107:aload_2         
		//*  50  108:getfield        #59  <Field ArrayList e>
		//*  51  111:ifnull          229
				{
					int j = d1.e.size();
		//   52  114:aload_2         
		//   53  115:getfield        #59  <Field ArrayList e>
		//   54  118:invokevirtual   #65  <Method int ArrayList.size()>
		//   55  121:istore          6
					e = new ArrayList(j);
		//   56  123:aload_0         
		//   57  124:new             #61  <Class ArrayList>
		//   58  127:dup             
		//   59  128:iload           6
		//   60  130:invokespecial   #68  <Method void ArrayList(int)>
		//   61  133:putfield        #59  <Field ArrayList e>
					a = new ArrayMap(j);
		//   62  136:aload_0         
		//   63  137:new             #70  <Class ArrayMap>
		//   64  140:dup             
		//   65  141:iload           6
		//   66  143:invokespecial   #71  <Method void ArrayMap(int)>
		//   67  146:putfield        #73  <Field ArrayMap a>
					for(int i = 0; i < j; i++)
		//*  68  149:iconst_0        
		//*  69  150:istore          5
		//*  70  152:iload           5
		//*  71  154:iload           6
		//*  72  156:icmpge          229
					{
						callback = ((android.graphics.drawable.Drawable.Callback) ((Animator)d1.e.get(i)));
		//   73  159:aload_2         
		//   74  160:getfield        #59  <Field ArrayList e>
		//   75  163:iload           5
		//   76  165:invokevirtual   #77  <Method Object ArrayList.get(int)>
		//   77  168:checkcast       #79  <Class Animator>
		//   78  171:astore_3        
						context = ((Context) (((Animator) (callback)).clone()));
		//   79  172:aload_3         
		//   80  173:invokevirtual   #83  <Method Animator Animator.clone()>
		//   81  176:astore_1        
						callback = ((android.graphics.drawable.Drawable.Callback) ((String)d1.a.get(((Object) (callback)))));
		//   82  177:aload_2         
		//   83  178:getfield        #73  <Field ArrayMap a>
		//   84  181:aload_3         
		//   85  182:invokevirtual   #86  <Method Object ArrayMap.get(Object)>
		//   86  185:checkcast       #88  <Class String>
		//   87  188:astore_3        
						((Animator) (context)).setTarget(c.getTargetByName(((String) (callback))));
		//   88  189:aload_1         
		//   89  190:aload_0         
		//   90  191:getfield        #25  <Field VectorDrawableCompat c>
		//   91  194:aload_3         
		//   92  195:invokevirtual   #92  <Method Object VectorDrawableCompat.getTargetByName(String)>
		//   93  198:invokevirtual   #96  <Method void Animator.setTarget(Object)>
						e.add(((Object) (context)));
		//   94  201:aload_0         
		//   95  202:getfield        #59  <Field ArrayList e>
		//   96  205:aload_1         
		//   97  206:invokevirtual   #100 <Method boolean ArrayList.add(Object)>
		//   98  209:pop             
						a.put(((Object) (context)), ((Object) (callback)));
		//   99  210:aload_0         
		//  100  211:getfield        #73  <Field ArrayMap a>
		//  101  214:aload_1         
		//  102  215:aload_3         
		//  103  216:invokevirtual   #104 <Method Object ArrayMap.put(Object, Object)>
		//  104  219:pop             
					}

		//  105  220:iload           5
		//  106  222:iconst_1        
		//  107  223:iadd            
		//  108  224:istore          5
				}
			}
		//* 109  226:goto            152
		//  110  229:return          
		}
	}


	AnimatedVectorDrawableCompat()
	{
		this(((Context) (null)), ((d) (null)), ((Resources) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #45  <Method void AnimatedVectorDrawableCompat(Context, AnimatedVectorDrawableCompat$d, Resources)>
	//    5    7:return          
	}

	private AnimatedVectorDrawableCompat(Context context)
	{
		this(context, ((d) (null)), ((Resources) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #45  <Method void AnimatedVectorDrawableCompat(Context, AnimatedVectorDrawableCompat$d, Resources)>
	//    5    7:return          
	}

	private AnimatedVectorDrawableCompat(Context context, d d1, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void ag()>
		mArgbEvaluator = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #53  <Field ArgbEvaluator mArgbEvaluator>
		mCallback = new android.graphics.drawable.Drawable.Callback() {

			public void invalidateDrawable(Drawable drawable)
			{
				c.invalidateSelf();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat c>
			//    2    4:invokevirtual   #23  <Method void AnimatedVectorDrawableCompat.invalidateSelf()>
			//    3    7:return          
			}

			public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
			{
				c.scheduleSelf(runnable, l);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat c>
			//    2    4:aload_2         
			//    3    5:lload_3         
			//    4    6:invokevirtual   #29  <Method void AnimatedVectorDrawableCompat.scheduleSelf(Runnable, long)>
			//    5    9:return          
			}

			public void unscheduleDrawable(Drawable drawable, Runnable runnable)
			{
				c.unscheduleSelf(runnable);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field AnimatedVectorDrawableCompat c>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #35  <Method void AnimatedVectorDrawableCompat.unscheduleSelf(Runnable)>
			//    4    8:return          
			}

			final AnimatedVectorDrawableCompat c;

			
			{
				c = AnimatedVectorDrawableCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AnimatedVectorDrawableCompat c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    5    9:aload_0         
	//    6   10:new             #8   <Class AnimatedVectorDrawableCompat$4>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #56  <Method void AnimatedVectorDrawableCompat$4(AnimatedVectorDrawableCompat)>
	//   10   18:putfield        #58  <Field android.graphics.drawable.Drawable$Callback mCallback>
		mContext = context;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #60  <Field Context mContext>
		if(d1 != null)
	//*  14   26:aload_2         
	//*  15   27:ifnull          36
		{
			mAnimatedVectorState = d1;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
			return;
	//   19   35:return          
		} else
		{
			mAnimatedVectorState = new d(context, d1, mCallback, resources);
	//   20   36:aload_0         
	//   21   37:new             #13  <Class AnimatedVectorDrawableCompat$d>
	//   22   40:dup             
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:aload_0         
	//   26   44:getfield        #58  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   27   47:aload_3         
	//   28   48:invokespecial   #65  <Method void AnimatedVectorDrawableCompat$d(Context, AnimatedVectorDrawableCompat$d, android.graphics.drawable.Drawable$Callback, Resources)>
	//   29   51:putfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
			return;
	//   30   54:return          
		}
	}

	public static AnimatedVectorDrawableCompat create(Context context, int i)
	{
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          64
		{
			AnimatedVectorDrawableCompat animatedvectordrawablecompat = new AnimatedVectorDrawableCompat(context);
	//    3    8:new             #2   <Class AnimatedVectorDrawableCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #81  <Method void AnimatedVectorDrawableCompat(Context)>
	//    7   16:astore_2        
			animatedvectordrawablecompat.mDelegateDrawable = ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
	//    8   17:aload_2         
	//    9   18:aload_0         
	//   10   19:invokevirtual   #87  <Method Resources Context.getResources()>
	//   11   22:iload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #91  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   14   27:invokestatic    #97  <Method Drawable ResourcesCompat.getDrawable(Resources, int, android.content.res.Resources$Theme)>
	//   15   30:putfield        #101 <Field Drawable mDelegateDrawable>
			animatedvectordrawablecompat.mDelegateDrawable.setCallback(animatedvectordrawablecompat.mCallback);
	//   16   33:aload_2         
	//   17   34:getfield        #101 <Field Drawable mDelegateDrawable>
	//   18   37:aload_2         
	//   19   38:getfield        #58  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   20   41:invokevirtual   #107 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			animatedvectordrawablecompat.mCachedConstantStateDelegate = new c(animatedvectordrawablecompat.mDelegateDrawable.getConstantState());
	//   21   44:aload_2         
	//   22   45:new             #10  <Class AnimatedVectorDrawableCompat$c>
	//   23   48:dup             
	//   24   49:aload_2         
	//   25   50:getfield        #101 <Field Drawable mDelegateDrawable>
	//   26   53:invokevirtual   #111 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   27   56:invokespecial   #114 <Method void AnimatedVectorDrawableCompat$c(android.graphics.drawable.Drawable$ConstantState)>
	//   28   59:putfield        #116 <Field AnimatedVectorDrawableCompat$c mCachedConstantStateDelegate>
			return animatedvectordrawablecompat;
	//   29   62:aload_2         
	//   30   63:areturn         
		}
		obj = ((Object) (context.getResources()));
	//   31   64:aload_0         
	//   32   65:invokevirtual   #87  <Method Resources Context.getResources()>
	//   33   68:astore_2        
		AttributeSet attributeset;
		obj = ((Object) (((Resources) (obj)).getXml(i)));
	//   34   69:aload_2         
	//   35   70:iload_1         
	//   36   71:invokevirtual   #122 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   37   74:astore_2        
		attributeset = Xml.asAttributeSet(((XmlPullParser) (obj)));
	//   38   75:aload_2         
	//   39   76:invokestatic    #128 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   40   79:astore_3        
		do
			i = ((XmlPullParser) (obj)).next();
	//   41   80:aload_2         
	//   42   81:invokeinterface #134 <Method int XmlPullParser.next()>
	//   43   86:istore_1        
		while(i != 2 && i != 1);
	//   44   87:iload_1         
	//   45   88:iconst_2        
	//   46   89:icmpeq          100
	//   47   92:iload_1         
	//   48   93:iconst_1        
	//   49   94:icmpeq          100
	//*  50   97:goto            80
		if(i == 2)
			break MISSING_BLOCK_LABEL_115;
	//   51  100:iload_1         
	//   52  101:iconst_2        
	//   53  102:icmpeq          115
		throw new XmlPullParserException("No start tag found");
	//   54  105:new             #71  <Class XmlPullParserException>
	//   55  108:dup             
	//   56  109:ldc1            #136 <String "No start tag found">
	//   57  111:invokespecial   #139 <Method void XmlPullParserException(String)>
	//   58  114:athrow          
		context = ((Context) (createFromXmlInner(context, context.getResources(), ((XmlPullParser) (obj)), attributeset, context.getTheme())));
	//   59  115:aload_0         
	//   60  116:aload_0         
	//   61  117:invokevirtual   #87  <Method Resources Context.getResources()>
	//   62  120:aload_2         
	//   63  121:aload_3         
	//   64  122:aload_0         
	//   65  123:invokevirtual   #91  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   66  126:invokestatic    #143 <Method AnimatedVectorDrawableCompat createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//   67  129:astore_0        
		return ((AnimatedVectorDrawableCompat) (context));
	//   68  130:aload_0         
	//   69  131:areturn         
		context;
	//   70  132:astore_0        
		Log.e("AnimatedVDCompat", "parser error", ((Throwable) (context)));
	//   71  133:ldc1            #27  <String "AnimatedVDCompat">
	//   72  135:ldc1            #145 <String "parser error">
	//   73  137:aload_0         
	//   74  138:invokestatic    #151 <Method int Log.e(String, String, Throwable)>
	//   75  141:pop             
		break MISSING_BLOCK_LABEL_155;
	//   76  142:goto            155
		context;
	//   77  145:astore_0        
		Log.e("AnimatedVDCompat", "parser error", ((Throwable) (context)));
	//   78  146:ldc1            #27  <String "AnimatedVDCompat">
	//   79  148:ldc1            #145 <String "parser error">
	//   80  150:aload_0         
	//   81  151:invokestatic    #151 <Method int Log.e(String, String, Throwable)>
	//   82  154:pop             
		return null;
	//   83  155:aconst_null     
	//   84  156:areturn         
	}

	public static AnimatedVectorDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		context = ((Context) (new AnimatedVectorDrawableCompat(context)));
	//    0    0:new             #2   <Class AnimatedVectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #81  <Method void AnimatedVectorDrawableCompat(Context)>
	//    4    8:astore_0        
		((AnimatedVectorDrawableCompat) (context)).inflate(resources, xmlpullparser, attributeset, theme);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:invokevirtual   #156 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		return ((AnimatedVectorDrawableCompat) (context));
	//   11   18:aload_0         
	//   12   19:areturn         
	}

	private boolean isStarted()
	{
		ArrayList arraylist = mAnimatedVectorState.e;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    2    4:getfield        #162 <Field ArrayList AnimatedVectorDrawableCompat$d.e>
	//    3    7:astore_3        
		if(arraylist == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		int j = arraylist.size();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #167 <Method int ArrayList.size()>
	//   10   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          49
			if(((Animator)arraylist.get(i)).isRunning())
	//*  16   26:aload_3         
	//*  17   27:iload_1         
	//*  18   28:invokevirtual   #171 <Method Object ArrayList.get(int)>
	//*  19   31:checkcast       #173 <Class Animator>
	//*  20   34:invokevirtual   #176 <Method boolean Animator.isRunning()>
	//*  21   37:ifeq            42
				return true;
	//   22   40:iconst_1        
	//   23   41:ireturn         

	//   24   42:iload_1         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_1        
	//*  28   46:goto            21
		return false;
	//   29   49:iconst_0        
	//   30   50:ireturn         
	}

	private void setupAnimatorsForTarget(String s, Animator animator)
	{
		animator.setTarget(mAnimatedVectorState.c.getTargetByName(s));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    3    5:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #187 <Method Object VectorDrawableCompat.getTargetByName(String)>
	//    6   12:invokevirtual   #191 <Method void Animator.setTarget(Object)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   7   15:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   18:bipush          21
	//*   9   20:icmpge          28
			setupColorAnimator(animator);
	//   10   23:aload_0         
	//   11   24:aload_2         
	//   12   25:invokespecial   #195 <Method void setupColorAnimator(Animator)>
		if(mAnimatedVectorState.e == null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//*  15   32:getfield        #162 <Field ArrayList AnimatedVectorDrawableCompat$d.e>
	//*  16   35:ifnonnull       66
		{
			mAnimatedVectorState.e = new ArrayList();
	//   17   38:aload_0         
	//   18   39:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   19   42:new             #164 <Class ArrayList>
	//   20   45:dup             
	//   21   46:invokespecial   #196 <Method void ArrayList()>
	//   22   49:putfield        #162 <Field ArrayList AnimatedVectorDrawableCompat$d.e>
			mAnimatedVectorState.a = new ArrayMap();
	//   23   52:aload_0         
	//   24   53:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   25   56:new             #198 <Class ArrayMap>
	//   26   59:dup             
	//   27   60:invokespecial   #199 <Method void ArrayMap()>
	//   28   63:putfield        #203 <Field ArrayMap AnimatedVectorDrawableCompat$d.a>
		}
		mAnimatedVectorState.e.add(((Object) (animator)));
	//   29   66:aload_0         
	//   30   67:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   31   70:getfield        #162 <Field ArrayList AnimatedVectorDrawableCompat$d.e>
	//   32   73:aload_2         
	//   33   74:invokevirtual   #207 <Method boolean ArrayList.add(Object)>
	//   34   77:pop             
		mAnimatedVectorState.a.put(((Object) (animator)), ((Object) (s)));
	//   35   78:aload_0         
	//   36   79:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   37   82:getfield        #203 <Field ArrayMap AnimatedVectorDrawableCompat$d.a>
	//   38   85:aload_2         
	//   39   86:aload_1         
	//   40   87:invokevirtual   #211 <Method Object ArrayMap.put(Object, Object)>
	//   41   90:pop             
	//   42   91:return          
	}

	private void setupColorAnimator(Animator animator)
	{
		if(animator instanceof AnimatorSet)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #213 <Class AnimatorSet>
	//*   2    4:ifeq            52
		{
			ArrayList arraylist = ((AnimatorSet)animator).getChildAnimations();
	//    3    7:aload_1         
	//    4    8:checkcast       #213 <Class AnimatorSet>
	//    5   11:invokevirtual   #217 <Method ArrayList AnimatorSet.getChildAnimations()>
	//    6   14:astore_3        
			if(arraylist != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          52
			{
				for(int i = 0; i < ((List) (arraylist)).size(); i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:aload_3         
	//*  13   23:invokeinterface #220 <Method int List.size()>
	//*  14   28:icmpge          52
					setupColorAnimator((Animator)((List) (arraylist)).get(i));
	//   15   31:aload_0         
	//   16   32:aload_3         
	//   17   33:iload_2         
	//   18   34:invokeinterface #221 <Method Object List.get(int)>
	//   19   39:checkcast       #173 <Class Animator>
	//   20   42:invokespecial   #195 <Method void setupColorAnimator(Animator)>

	//   21   45:iload_2         
	//   22   46:iconst_1        
	//   23   47:iadd            
	//   24   48:istore_2        
			}
		}
	//*  25   49:goto            21
		if(animator instanceof ObjectAnimator)
	//*  26   52:aload_1         
	//*  27   53:instanceof      #223 <Class ObjectAnimator>
	//*  28   56:ifeq            113
		{
			animator = ((Animator) ((ObjectAnimator)animator));
	//   29   59:aload_1         
	//   30   60:checkcast       #223 <Class ObjectAnimator>
	//   31   63:astore_1        
			String s = ((ObjectAnimator) (animator)).getPropertyName();
	//   32   64:aload_1         
	//   33   65:invokevirtual   #227 <Method String ObjectAnimator.getPropertyName()>
	//   34   68:astore_3        
			if("fillColor".equals(((Object) (s))) || "strokeColor".equals(((Object) (s))))
	//*  35   69:ldc1            #229 <String "fillColor">
	//*  36   71:aload_3         
	//*  37   72:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*  38   75:ifne            87
	//*  39   78:ldc1            #236 <String "strokeColor">
	//*  40   80:aload_3         
	//*  41   81:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*  42   84:ifeq            113
			{
				if(mArgbEvaluator == null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #53  <Field ArgbEvaluator mArgbEvaluator>
	//*  45   91:ifnonnull       105
					mArgbEvaluator = new ArgbEvaluator();
	//   46   94:aload_0         
	//   47   95:new             #238 <Class ArgbEvaluator>
	//   48   98:dup             
	//   49   99:invokespecial   #239 <Method void ArgbEvaluator()>
	//   50  102:putfield        #53  <Field ArgbEvaluator mArgbEvaluator>
				((ObjectAnimator) (animator)).setEvaluator(((android.animation.TypeEvaluator) (mArgbEvaluator)));
	//   51  105:aload_1         
	//   52  106:aload_0         
	//   53  107:getfield        #53  <Field ArgbEvaluator mArgbEvaluator>
	//   54  110:invokevirtual   #243 <Method void ObjectAnimator.setEvaluator(android.animation.TypeEvaluator)>
			}
		}
	//   55  113:return          
	}

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.applyTheme(mDelegateDrawable, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #250 <Method void DrawableCompat.applyTheme(Drawable, android.content.res.Resources$Theme)>
			return;
	//    7   15:return          
		} else
		{
			return;
	//    8   16:return          
		}
	}

	public boolean canApplyTheme()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.canApplyTheme(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #254 <Method boolean DrawableCompat.canApplyTheme(Drawable)>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile void clearColorFilter()
	{
		super.clearColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void ag.clearColorFilter()>
	//    2    4:return          
	}

	public void draw(Canvas canvas)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.draw(canvas);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #261 <Method void Drawable.draw(Canvas)>
			return;
	//    7   15:return          
		}
		mAnimatedVectorState.c.draw(canvas);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #262 <Method void VectorDrawableCompat.draw(Canvas)>
		if(isStarted())
	//*  13   27:aload_0         
	//*  14   28:invokespecial   #264 <Method boolean isStarted()>
	//*  15   31:ifeq            38
			invalidateSelf();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #267 <Method void invalidateSelf()>
	//   18   38:return          
	}

	public int getAlpha()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.getAlpha(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #271 <Method int DrawableCompat.getAlpha(Drawable)>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.c.getAlpha();
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    9   19:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   10   22:invokevirtual   #273 <Method int VectorDrawableCompat.getAlpha()>
	//   11   25:ireturn         
	}

	public int getChangingConfigurations()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getChangingConfigurations();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #276 <Method int Drawable.getChangingConfigurations()>
	//    6   14:ireturn         
		else
			return super.getChangingConfigurations() | mAnimatedVectorState.d;
	//    7   15:aload_0         
	//    8   16:invokespecial   #277 <Method int ag.getChangingConfigurations()>
	//    9   19:aload_0         
	//   10   20:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   11   23:getfield        #279 <Field int AnimatedVectorDrawableCompat$d.d>
	//   12   26:ior             
	//   13   27:ireturn         
	}

	public volatile ColorFilter getColorFilter()
	{
		return super.getColorFilter();
	//    0    0:aload_0         
	//    1    1:invokespecial   #283 <Method ColorFilter ag.getColorFilter()>
	//    2    4:areturn         
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          22
			return ((android.graphics.drawable.Drawable.ConstantState) (new c(mDelegateDrawable.getConstantState())));
	//    3    7:new             #10  <Class AnimatedVectorDrawableCompat$c>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field Drawable mDelegateDrawable>
	//    7   15:invokevirtual   #111 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    8   18:invokespecial   #114 <Method void AnimatedVectorDrawableCompat$c(android.graphics.drawable.Drawable$ConstantState)>
	//    9   21:areturn         
		else
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
	}

	public volatile Drawable getCurrent()
	{
		return super.getCurrent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #287 <Method Drawable ag.getCurrent()>
	//    2    4:areturn         
	}

	public int getIntrinsicHeight()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicHeight();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #290 <Method int Drawable.getIntrinsicHeight()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.c.getIntrinsicHeight();
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    9   19:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   10   22:invokevirtual   #291 <Method int VectorDrawableCompat.getIntrinsicHeight()>
	//   11   25:ireturn         
	}

	public int getIntrinsicWidth()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getIntrinsicWidth();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #294 <Method int Drawable.getIntrinsicWidth()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.c.getIntrinsicWidth();
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    9   19:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   10   22:invokevirtual   #295 <Method int VectorDrawableCompat.getIntrinsicWidth()>
	//   11   25:ireturn         
	}

	public volatile int getMinimumHeight()
	{
		return super.getMinimumHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #298 <Method int ag.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public volatile int getMinimumWidth()
	{
		return super.getMinimumWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #301 <Method int ag.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.getOpacity();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #304 <Method int Drawable.getOpacity()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.c.getOpacity();
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    9   19:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   10   22:invokevirtual   #305 <Method int VectorDrawableCompat.getOpacity()>
	//   11   25:ireturn         
	}

	public volatile boolean getPadding(Rect rect)
	{
		return super.getPadding(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #309 <Method boolean ag.getPadding(Rect)>
	//    3    5:ireturn         
	}

	public volatile int[] getState()
	{
		return super.getState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #313 <Method int[] ag.getState()>
	//    2    4:areturn         
	}

	public volatile Region getTransparentRegion()
	{
		return super.getTransparentRegion();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method Region ag.getTransparentRegion()>
	//    2    4:areturn         
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset)
		throws XmlPullParserException, IOException
	{
		inflate(resources, xmlpullparser, attributeset, ((android.content.res.Resources.Theme) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #156 <Method void inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    6    8:return          
	}

	public void inflate(Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          20
		{
			DrawableCompat.inflate(mDelegateDrawable, resources, xmlpullparser, attributeset, theme);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload           4
	//    9   16:invokestatic    #321 <Method void DrawableCompat.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//   10   19:return          
		}
		int i = xmlpullparser.getEventType();
	//   11   20:aload_2         
	//   12   21:invokeinterface #324 <Method int XmlPullParser.getEventType()>
	//   13   26:istore          5
		for(int j = xmlpullparser.getDepth(); i != 1 && (xmlpullparser.getDepth() >= j + 1 || i != 3); i = xmlpullparser.next())
	//*  14   28:aload_2         
	//*  15   29:invokeinterface #327 <Method int XmlPullParser.getDepth()>
	//*  16   34:istore          6
	//*  17   36:iload           5
	//*  18   38:iconst_1        
	//*  19   39:icmpeq          273
	//*  20   42:aload_2         
	//*  21   43:invokeinterface #327 <Method int XmlPullParser.getDepth()>
	//*  22   48:iload           6
	//*  23   50:iconst_1        
	//*  24   51:iadd            
	//*  25   52:icmpge          61
	//*  26   55:iload           5
	//*  27   57:iconst_3        
	//*  28   58:icmpeq          273
		{
			if(i != 2)
				continue;
	//   29   61:iload           5
	//   30   63:iconst_2        
	//   31   64:icmpne          262
			Object obj = ((Object) (xmlpullparser.getName()));
	//   32   67:aload_2         
	//   33   68:invokeinterface #330 <Method String XmlPullParser.getName()>
	//   34   73:astore          7
			if("animated-vector".equals(obj))
	//*  35   75:ldc1            #21  <String "animated-vector">
	//*  36   77:aload           7
	//*  37   79:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*  38   82:ifeq            174
			{
				obj = ((Object) (ag.obtainAttributes(resources, theme, attributeset, ae.e)));
	//   39   85:aload_1         
	//   40   86:aload           4
	//   41   88:aload_3         
	//   42   89:getstatic       #335 <Field int[] ae.e>
	//   43   92:invokestatic    #339 <Method TypedArray ag.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//   44   95:astore          7
				i = ((TypedArray) (obj)).getResourceId(0, 0);
	//   45   97:aload           7
	//   46   99:iconst_0        
	//   47  100:iconst_0        
	//   48  101:invokevirtual   #345 <Method int TypedArray.getResourceId(int, int)>
	//   49  104:istore          5
				if(i != 0)
	//*  50  106:iload           5
	//*  51  108:ifeq            166
				{
					VectorDrawableCompat vectordrawablecompat = VectorDrawableCompat.create(resources, i, theme);
	//   52  111:aload_1         
	//   53  112:iload           5
	//   54  114:aload           4
	//   55  116:invokestatic    #348 <Method VectorDrawableCompat VectorDrawableCompat.create(Resources, int, android.content.res.Resources$Theme)>
	//   56  119:astore          8
					vectordrawablecompat.setAllowCaching(false);
	//   57  121:aload           8
	//   58  123:iconst_0        
	//   59  124:invokevirtual   #352 <Method void VectorDrawableCompat.setAllowCaching(boolean)>
					vectordrawablecompat.setCallback(mCallback);
	//   60  127:aload           8
	//   61  129:aload_0         
	//   62  130:getfield        #58  <Field android.graphics.drawable.Drawable$Callback mCallback>
	//   63  133:invokevirtual   #353 <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
					if(mAnimatedVectorState.c != null)
	//*  64  136:aload_0         
	//*  65  137:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//*  66  140:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//*  67  143:ifnull          157
						mAnimatedVectorState.c.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   68  146:aload_0         
	//   69  147:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   70  150:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   71  153:aconst_null     
	//   72  154:invokevirtual   #353 <Method void VectorDrawableCompat.setCallback(android.graphics.drawable.Drawable$Callback)>
					mAnimatedVectorState.c = vectordrawablecompat;
	//   73  157:aload_0         
	//   74  158:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   75  161:aload           8
	//   76  163:putfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
				}
				((TypedArray) (obj)).recycle();
	//   77  166:aload           7
	//   78  168:invokevirtual   #356 <Method void TypedArray.recycle()>
				continue;
	//   79  171:goto            262
			}
			if(!"target".equals(obj))
				continue;
	//   80  174:ldc1            #30  <String "target">
	//   81  176:aload           7
	//   82  178:invokevirtual   #234 <Method boolean String.equals(Object)>
	//   83  181:ifeq            262
			obj = ((Object) (resources.obtainAttributes(attributeset, ae.i)));
	//   84  184:aload_1         
	//   85  185:aload_3         
	//   86  186:getstatic       #359 <Field int[] ae.i>
	//   87  189:invokevirtual   #362 <Method TypedArray Resources.obtainAttributes(AttributeSet, int[])>
	//   88  192:astore          7
			String s = ((TypedArray) (obj)).getString(0);
	//   89  194:aload           7
	//   90  196:iconst_0        
	//   91  197:invokevirtual   #366 <Method String TypedArray.getString(int)>
	//   92  200:astore          8
			i = ((TypedArray) (obj)).getResourceId(1, 0);
	//   93  202:aload           7
	//   94  204:iconst_1        
	//   95  205:iconst_0        
	//   96  206:invokevirtual   #345 <Method int TypedArray.getResourceId(int, int)>
	//   97  209:istore          5
			if(i != 0)
	//*  98  211:iload           5
	//*  99  213:ifeq            257
				if(mContext != null)
	//* 100  216:aload_0         
	//* 101  217:getfield        #60  <Field Context mContext>
	//* 102  220:ifnull          241
				{
					setupAnimatorsForTarget(s, AnimatorInflater.loadAnimator(mContext, i));
	//  103  223:aload_0         
	//  104  224:aload           8
	//  105  226:aload_0         
	//  106  227:getfield        #60  <Field Context mContext>
	//  107  230:iload           5
	//  108  232:invokestatic    #372 <Method Animator AnimatorInflater.loadAnimator(Context, int)>
	//  109  235:invokespecial   #374 <Method void setupAnimatorsForTarget(String, Animator)>
				} else
	//* 110  238:goto            257
				{
					((TypedArray) (obj)).recycle();
	//  111  241:aload           7
	//  112  243:invokevirtual   #356 <Method void TypedArray.recycle()>
					throw new IllegalStateException("Context can't be null when inflating animators");
	//  113  246:new             #376 <Class IllegalStateException>
	//  114  249:dup             
	//  115  250:ldc2            #378 <String "Context can't be null when inflating animators">
	//  116  253:invokespecial   #379 <Method void IllegalStateException(String)>
	//  117  256:athrow          
				}
			((TypedArray) (obj)).recycle();
	//  118  257:aload           7
	//  119  259:invokevirtual   #356 <Method void TypedArray.recycle()>
		}

	//  120  262:aload_2         
	//  121  263:invokeinterface #134 <Method int XmlPullParser.next()>
	//  122  268:istore          5
	//* 123  270:goto            36
	//  124  273:return          
	}

	public boolean isAutoMirrored()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return DrawableCompat.isAutoMirrored(mDelegateDrawable);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokestatic    #382 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.c.isAutoMirrored();
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    9   19:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   10   22:invokevirtual   #384 <Method boolean VectorDrawableCompat.isAutoMirrored()>
	//   11   25:ireturn         
	}

	public boolean isRunning()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
			return ((AnimatedVectorDrawable)mDelegateDrawable).isRunning();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #386 <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #387 <Method boolean AnimatedVectorDrawable.isRunning()>
	//    7   17:ireturn         
		ArrayList arraylist = mAnimatedVectorState.e;
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   22:getfield        #162 <Field ArrayList AnimatedVectorDrawableCompat$d.e>
	//   11   25:astore_3        
		int j = arraylist.size();
	//   12   26:aload_3         
	//   13   27:invokevirtual   #167 <Method int ArrayList.size()>
	//   14   30:istore_2        
		for(int i = 0; i < j; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_1        
	//*  17   33:iload_1         
	//*  18   34:iload_2         
	//*  19   35:icmpge          61
			if(((Animator)arraylist.get(i)).isRunning())
	//*  20   38:aload_3         
	//*  21   39:iload_1         
	//*  22   40:invokevirtual   #171 <Method Object ArrayList.get(int)>
	//*  23   43:checkcast       #173 <Class Animator>
	//*  24   46:invokevirtual   #176 <Method boolean Animator.isRunning()>
	//*  25   49:ifeq            54
				return true;
	//   26   52:iconst_1        
	//   27   53:ireturn         

	//   28   54:iload_1         
	//   29   55:iconst_1        
	//   30   56:iadd            
	//   31   57:istore_1        
	//*  32   58:goto            33
		return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
	}

	public boolean isStateful()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			return mDelegateDrawable.isStateful();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #390 <Method boolean Drawable.isStateful()>
	//    6   14:ireturn         
		else
			return mAnimatedVectorState.c.isStateful();
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//    9   19:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   10   22:invokevirtual   #391 <Method boolean VectorDrawableCompat.isStateful()>
	//   11   25:ireturn         
	}

	public volatile void jumpToCurrentState()
	{
		super.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #394 <Method void ag.jumpToCurrentState()>
	//    2    4:return          
	}

	public Drawable mutate()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          15
			mDelegateDrawable.mutate();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:invokevirtual   #397 <Method Drawable Drawable.mutate()>
	//    6   14:pop             
		return ((Drawable) (this));
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public void onBoundsChange(Rect rect)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setBounds(rect);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #402 <Method void Drawable.setBounds(Rect)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.c.setBounds(rect);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #403 <Method void VectorDrawableCompat.setBounds(Rect)>
			return;
	//   13   27:return          
		}
	}

	public boolean onLevelChange(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setLevel(i);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #408 <Method boolean Drawable.setLevel(int)>
	//    7   15:ireturn         
		else
			return mAnimatedVectorState.c.setLevel(i);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #409 <Method boolean VectorDrawableCompat.setLevel(int)>
	//   13   27:ireturn         
	}

	protected boolean onStateChange(int ai[])
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
			return mDelegateDrawable.setState(ai);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #414 <Method boolean Drawable.setState(int[])>
	//    7   15:ireturn         
		else
			return mAnimatedVectorState.c.setState(ai);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #415 <Method boolean VectorDrawableCompat.setState(int[])>
	//   13   27:ireturn         
	}

	public void setAlpha(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setAlpha(i);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #419 <Method void Drawable.setAlpha(int)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.c.setAlpha(i);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #420 <Method void VectorDrawableCompat.setAlpha(int)>
			return;
	//   13   27:return          
		}
	}

	public void setAutoMirrored(boolean flag)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setAutoMirrored(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #423 <Method void Drawable.setAutoMirrored(boolean)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.c.setAutoMirrored(flag);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #424 <Method void VectorDrawableCompat.setAutoMirrored(boolean)>
			return;
	//   13   27:return          
		}
	}

	public volatile void setChangingConfigurations(int i)
	{
		super.setChangingConfigurations(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #427 <Method void ag.setChangingConfigurations(int)>
	//    3    5:return          
	}

	public volatile void setColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		super.setColorFilter(i, mode);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #431 <Method void ag.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    4    6:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			mDelegateDrawable.setColorFilter(colorfilter);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #434 <Method void Drawable.setColorFilter(ColorFilter)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.c.setColorFilter(colorfilter);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #435 <Method void VectorDrawableCompat.setColorFilter(ColorFilter)>
			return;
	//   13   27:return          
		}
	}

	public volatile void setFilterBitmap(boolean flag)
	{
		super.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #438 <Method void ag.setFilterBitmap(boolean)>
	//    3    5:return          
	}

	public volatile void setHotspot(float f, float f1)
	{
		super.setHotspot(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #442 <Method void ag.setHotspot(float, float)>
	//    4    6:return          
	}

	public volatile void setHotspotBounds(int i, int j, int k, int l)
	{
		super.setHotspotBounds(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #446 <Method void ag.setHotspotBounds(int, int, int, int)>
	//    6    9:return          
	}

	public volatile boolean setState(int ai[])
	{
		return super.setState(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #447 <Method boolean ag.setState(int[])>
	//    3    5:ireturn         
	}

	public void setTint(int i)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTint(mDelegateDrawable, i);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:invokestatic    #451 <Method void DrawableCompat.setTint(Drawable, int)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.c.setTint(i);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #453 <Method void VectorDrawableCompat.setTint(int)>
			return;
	//   13   27:return          
		}
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintList(mDelegateDrawable, colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #458 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.c.setTintList(colorstatelist);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #460 <Method void VectorDrawableCompat.setTintList(ColorStateList)>
			return;
	//   13   27:return          
		}
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          16
		{
			DrawableCompat.setTintMode(mDelegateDrawable, mode);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:aload_1         
	//    6   12:invokestatic    #465 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			return;
	//    7   15:return          
		} else
		{
			mAnimatedVectorState.c.setTintMode(mode);
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   20:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #467 <Method void VectorDrawableCompat.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//   13   27:return          
		}
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          17
		{
			return mDelegateDrawable.setVisible(flag, flag1);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #471 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    8   16:ireturn         
		} else
		{
			mAnimatedVectorState.c.setVisible(flag, flag1);
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   11   21:getfield        #181 <Field VectorDrawableCompat AnimatedVectorDrawableCompat$d.c>
	//   12   24:iload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #472 <Method boolean VectorDrawableCompat.setVisible(boolean, boolean)>
	//   15   29:pop             
			return super.setVisible(flag, flag1);
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:iload_2         
	//   19   33:invokespecial   #473 <Method boolean ag.setVisible(boolean, boolean)>
	//   20   36:ireturn         
		}
	}

	public void start()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			((AnimatedVectorDrawable)mDelegateDrawable).start();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #386 <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #476 <Method void AnimatedVectorDrawable.start()>
			return;
	//    7   17:return          
		}
		if(isStarted())
	//*   8   18:aload_0         
	//*   9   19:invokespecial   #264 <Method boolean isStarted()>
	//*  10   22:ifeq            26
			return;
	//   11   25:return          
		ArrayList arraylist = mAnimatedVectorState.e;
	//   12   26:aload_0         
	//   13   27:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   14   30:getfield        #162 <Field ArrayList AnimatedVectorDrawableCompat$d.e>
	//   15   33:astore_3        
		int j = arraylist.size();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #167 <Method int ArrayList.size()>
	//   18   38:istore_2        
		for(int i = 0; i < j; i++)
	//*  19   39:iconst_0        
	//*  20   40:istore_1        
	//*  21   41:iload_1         
	//*  22   42:iload_2         
	//*  23   43:icmpge          64
			((Animator)arraylist.get(i)).start();
	//   24   46:aload_3         
	//   25   47:iload_1         
	//   26   48:invokevirtual   #171 <Method Object ArrayList.get(int)>
	//   27   51:checkcast       #173 <Class Animator>
	//   28   54:invokevirtual   #477 <Method void Animator.start()>

	//   29   57:iload_1         
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore_1        
	//*  33   61:goto            41
		invalidateSelf();
	//   34   64:aload_0         
	//   35   65:invokevirtual   #267 <Method void invalidateSelf()>
	//   36   68:return          
	}

	public void stop()
	{
		if(mDelegateDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mDelegateDrawable>
	//*   2    4:ifnull          18
		{
			((AnimatedVectorDrawable)mDelegateDrawable).stop();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mDelegateDrawable>
	//    5   11:checkcast       #386 <Class AnimatedVectorDrawable>
	//    6   14:invokevirtual   #480 <Method void AnimatedVectorDrawable.stop()>
			return;
	//    7   17:return          
		}
		ArrayList arraylist = mAnimatedVectorState.e;
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field AnimatedVectorDrawableCompat$d mAnimatedVectorState>
	//   10   22:getfield        #162 <Field ArrayList AnimatedVectorDrawableCompat$d.e>
	//   11   25:astore_3        
		int j = arraylist.size();
	//   12   26:aload_3         
	//   13   27:invokevirtual   #167 <Method int ArrayList.size()>
	//   14   30:istore_2        
		for(int i = 0; i < j; i++)
	//*  15   31:iconst_0        
	//*  16   32:istore_1        
	//*  17   33:iload_1         
	//*  18   34:iload_2         
	//*  19   35:icmpge          56
			((Animator)arraylist.get(i)).end();
	//   20   38:aload_3         
	//   21   39:iload_1         
	//   22   40:invokevirtual   #171 <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #173 <Class Animator>
	//   24   46:invokevirtual   #483 <Method void Animator.end()>

	//   25   49:iload_1         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_1        
	//*  29   53:goto            33
	//   30   56:return          
	}

	private static final String ANIMATED_VECTOR = "animated-vector";
	private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
	private static final String LOGTAG = "AnimatedVDCompat";
	private static final String TARGET = "target";
	private d mAnimatedVectorState;
	private ArgbEvaluator mArgbEvaluator;
	c mCachedConstantStateDelegate;
	final android.graphics.drawable.Drawable.Callback mCallback;
	private Context mContext;
}
