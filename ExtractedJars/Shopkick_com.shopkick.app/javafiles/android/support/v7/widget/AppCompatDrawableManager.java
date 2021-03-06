// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.*;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.graphics.drawable.AnimatedStateListDrawableCompat;
import android.util.*;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.widget:
//			ThemeUtils, DrawableUtils, TintInfo, VectorEnabledTintResources

public final class AppCompatDrawableManager
{
	static class AsldcInflateDelegate
		implements InflateDelegate
	{

		public Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		{
			try
			{
				context = ((Context) (AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlpullparser, attributeset, theme)));
		//    0    0:aload_1         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method Resources Context.getResources()>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokestatic    #34  <Method AnimatedStateListDrawableCompat AnimatedStateListDrawableCompat.createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		//    7   12:astore_1        
			}
		//*   8   13:aload_1         
		//*   9   14:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*  10   15:astore_1        
			{
				Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", ((Throwable) (context)));
		//   11   16:ldc1            #35  <String "AsldcInflateDelegate">
		//   12   18:ldc1            #37  <String "Exception while inflating <animated-selector>">
		//   13   20:aload_1         
		//   14   21:invokestatic    #43  <Method int Log.e(String, String, Throwable)>
		//   15   24:pop             
				return null;
		//   16   25:aconst_null     
		//   17   26:areturn         
			}
			return ((Drawable) (context));
		}

		AsldcInflateDelegate()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class AvdcInflateDelegate
		implements InflateDelegate
	{

		public Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		{
			try
			{
				context = ((Context) (AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlpullparser, attributeset, theme)));
		//    0    0:aload_1         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method Resources Context.getResources()>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokestatic    #31  <Method AnimatedVectorDrawableCompat AnimatedVectorDrawableCompat.createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		//    7   12:astore_1        
			}
		//*   8   13:aload_1         
		//*   9   14:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*  10   15:astore_1        
			{
				Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", ((Throwable) (context)));
		//   11   16:ldc1            #32  <String "AvdcInflateDelegate">
		//   12   18:ldc1            #34  <String "Exception while inflating <animated-vector>">
		//   13   20:aload_1         
		//   14   21:invokestatic    #40  <Method int Log.e(String, String, Throwable)>
		//   15   24:pop             
				return null;
		//   16   25:aconst_null     
		//   17   26:areturn         
			}
			return ((Drawable) (context));
		}

		AvdcInflateDelegate()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ColorFilterLruCache extends LruCache
	{

		private static int generateCacheKey(int i, android.graphics.PorterDuff.Mode mode)
		{
			return (i + 31) * 31 + mode.hashCode();
		//    0    0:iload_0         
		//    1    1:bipush          31
		//    2    3:iadd            
		//    3    4:bipush          31
		//    4    6:imul            
		//    5    7:aload_1         
		//    6    8:invokevirtual   #21  <Method int android.graphics.PorterDuff$Mode.hashCode()>
		//    7   11:iadd            
		//    8   12:ireturn         
		}

		PorterDuffColorFilter get(int i, android.graphics.PorterDuff.Mode mode)
		{
			return (PorterDuffColorFilter)get(((Object) (Integer.valueOf(generateCacheKey(i, mode)))));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #25  <Method int generateCacheKey(int, android.graphics.PorterDuff$Mode)>
		//    4    6:invokestatic    #31  <Method Integer Integer.valueOf(int)>
		//    5    9:invokevirtual   #34  <Method Object get(Object)>
		//    6   12:checkcast       #36  <Class PorterDuffColorFilter>
		//    7   15:areturn         
		}

		PorterDuffColorFilter put(int i, android.graphics.PorterDuff.Mode mode, PorterDuffColorFilter porterduffcolorfilter)
		{
			return (PorterDuffColorFilter)put(((Object) (Integer.valueOf(generateCacheKey(i, mode)))), ((Object) (porterduffcolorfilter)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #25  <Method int generateCacheKey(int, android.graphics.PorterDuff$Mode)>
		//    4    6:invokestatic    #31  <Method Integer Integer.valueOf(int)>
		//    5    9:aload_3         
		//    6   10:invokevirtual   #41  <Method Object put(Object, Object)>
		//    7   13:checkcast       #36  <Class PorterDuffColorFilter>
		//    8   16:areturn         
		}

		public ColorFilterLruCache(int i)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #12  <Method void LruCache(int)>
		//    3    5:return          
		}
	}

	private static interface InflateDelegate
	{

		public abstract Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme);
	}

	private static class VdcInflateDelegate
		implements InflateDelegate
	{

		public Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		{
			try
			{
				context = ((Context) (VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlpullparser, attributeset, theme)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #26  <Method Resources Context.getResources()>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:aload           4
		//    5    8:invokestatic    #31  <Method VectorDrawableCompat VectorDrawableCompat.createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		//    6   11:astore_1        
			}
		//*   7   12:aload_1         
		//*   8   13:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*   9   14:astore_1        
			{
				Log.e("VdcInflateDelegate", "Exception while inflating <vector>", ((Throwable) (context)));
		//   10   15:ldc1            #32  <String "VdcInflateDelegate">
		//   11   17:ldc1            #34  <String "Exception while inflating <vector>">
		//   12   19:aload_1         
		//   13   20:invokestatic    #40  <Method int Log.e(String, String, Throwable)>
		//   14   23:pop             
				return null;
		//   15   24:aconst_null     
		//   16   25:areturn         
			}
			return ((Drawable) (context));
		}

		VdcInflateDelegate()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public AppCompatDrawableManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #179 <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #180 <Method void WeakHashMap(int)>
	//    7   13:putfield        #182 <Field WeakHashMap mDrawableCaches>
	//    8   16:return          
	}

	private void addDelegate(String s, InflateDelegate inflatedelegate)
	{
		if(mDelegates == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #187 <Field ArrayMap mDelegates>
	//*   2    4:ifnonnull       18
			mDelegates = new ArrayMap();
	//    3    7:aload_0         
	//    4    8:new             #189 <Class ArrayMap>
	//    5   11:dup             
	//    6   12:invokespecial   #190 <Method void ArrayMap()>
	//    7   15:putfield        #187 <Field ArrayMap mDelegates>
		mDelegates.put(((Object) (s)), ((Object) (inflatedelegate)));
	//    8   18:aload_0         
	//    9   19:getfield        #187 <Field ArrayMap mDelegates>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #194 <Method Object ArrayMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	private boolean addDrawableToCache(Context context, long l, Drawable drawable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		android.graphics.drawable.Drawable.ConstantState constantstate = drawable.getConstantState();
	//    2    2:aload           4
	//    3    4:invokevirtual   #203 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    4    7:astore          6
		if(constantstate == null)
			break MISSING_BLOCK_LABEL_75;
	//    5    9:aload           6
	//    6   11:ifnull          75
		LongSparseArray longsparsearray = (LongSparseArray)mDrawableCaches.get(((Object) (context)));
	//    7   14:aload_0         
	//    8   15:getfield        #182 <Field WeakHashMap mDrawableCaches>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #207 <Method Object WeakHashMap.get(Object)>
	//   11   22:checkcast       #209 <Class LongSparseArray>
	//   12   25:astore          5
		drawable = ((Drawable) (longsparsearray));
	//   13   27:aload           5
	//   14   29:astore          4
		if(longsparsearray != null)
			break MISSING_BLOCK_LABEL_56;
	//   15   31:aload           5
	//   16   33:ifnonnull       56
		drawable = ((Drawable) (new LongSparseArray()));
	//   17   36:new             #209 <Class LongSparseArray>
	//   18   39:dup             
	//   19   40:invokespecial   #210 <Method void LongSparseArray()>
	//   20   43:astore          4
		mDrawableCaches.put(((Object) (context)), ((Object) (drawable)));
	//   21   45:aload_0         
	//   22   46:getfield        #182 <Field WeakHashMap mDrawableCaches>
	//   23   49:aload_1         
	//   24   50:aload           4
	//   25   52:invokevirtual   #211 <Method Object WeakHashMap.put(Object, Object)>
	//   26   55:pop             
		((LongSparseArray) (drawable)).put(l, ((Object) (new WeakReference(((Object) (constantstate))))));
	//   27   56:aload           4
	//   28   58:lload_2         
	//   29   59:new             #213 <Class WeakReference>
	//   30   62:dup             
	//   31   63:aload           6
	//   32   65:invokespecial   #216 <Method void WeakReference(Object)>
	//   33   68:invokevirtual   #219 <Method void LongSparseArray.put(long, Object)>
		this;
	//   34   71:aload_0         
		JVM INSTR monitorexit ;
	//   35   72:monitorexit     
		return true;
	//   36   73:iconst_1        
	//   37   74:ireturn         
		this;
	//   38   75:aload_0         
		JVM INSTR monitorexit ;
	//   39   76:monitorexit     
		return false;
	//   40   77:iconst_0        
	//   41   78:ireturn         
		context;
	//   42   79:astore_1        
	//*  43   80:aload_0         
		throw context;
	//   44   81:monitorexit     
	//   45   82:aload_1         
	//   46   83:athrow          
	}

	private void addTintListToCache(Context context, int i, ColorStateList colorstatelist)
	{
		if(mTintLists == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field WeakHashMap mTintLists>
	//*   2    4:ifnonnull       18
			mTintLists = new WeakHashMap();
	//    3    7:aload_0         
	//    4    8:new             #179 <Class WeakHashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #225 <Method void WeakHashMap()>
	//    7   15:putfield        #224 <Field WeakHashMap mTintLists>
		SparseArrayCompat sparsearraycompat1 = (SparseArrayCompat)mTintLists.get(((Object) (context)));
	//    8   18:aload_0         
	//    9   19:getfield        #224 <Field WeakHashMap mTintLists>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #207 <Method Object WeakHashMap.get(Object)>
	//   12   26:checkcast       #227 <Class SparseArrayCompat>
	//   13   29:astore          5
		SparseArrayCompat sparsearraycompat = sparsearraycompat1;
	//   14   31:aload           5
	//   15   33:astore          4
		if(sparsearraycompat1 == null)
	//*  16   35:aload           5
	//*  17   37:ifnonnull       60
		{
			sparsearraycompat = new SparseArrayCompat();
	//   18   40:new             #227 <Class SparseArrayCompat>
	//   19   43:dup             
	//   20   44:invokespecial   #228 <Method void SparseArrayCompat()>
	//   21   47:astore          4
			mTintLists.put(((Object) (context)), ((Object) (sparsearraycompat)));
	//   22   49:aload_0         
	//   23   50:getfield        #224 <Field WeakHashMap mTintLists>
	//   24   53:aload_1         
	//   25   54:aload           4
	//   26   56:invokevirtual   #211 <Method Object WeakHashMap.put(Object, Object)>
	//   27   59:pop             
		}
		sparsearraycompat.append(i, ((Object) (colorstatelist)));
	//   28   60:aload           4
	//   29   62:iload_2         
	//   30   63:aload_3         
	//   31   64:invokevirtual   #232 <Method void SparseArrayCompat.append(int, Object)>
	//   32   67:return          
	}

	private static boolean arrayContains(int ai[], int i)
	{
		int k = ai.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int j = 0; j < k; j++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          26
			if(ai[j] == i)
	//*   8   10:aload_0         
	//*   9   11:iload_2         
	//*  10   12:iaload          
	//*  11   13:iload_1         
	//*  12   14:icmpne          19
				return true;
	//   13   17:iconst_1        
	//   14   18:ireturn         

	//   15   19:iload_2         
	//   16   20:iconst_1        
	//   17   21:iadd            
	//   18   22:istore_2        
	//*  19   23:goto            5
		return false;
	//   20   26:iconst_0        
	//   21   27:ireturn         
	}

	private void checkVectorDrawableSetup(Context context)
	{
		if(mHasCheckedVectorDrawableSetup)
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field boolean mHasCheckedVectorDrawableSetup>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mHasCheckedVectorDrawableSetup = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #238 <Field boolean mHasCheckedVectorDrawableSetup>
		context = ((Context) (getDrawable(context, android.support.v7.appcompat.R.drawable.abc_vector_test)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getstatic       #241 <Field int android.support.v7.appcompat.R$drawable.abc_vector_test>
	//   10   18:invokevirtual   #245 <Method Drawable getDrawable(Context, int)>
	//   11   21:astore_1        
		if(context != null && isVectorDrawable(((Drawable) (context))))
	//*  12   22:aload_1         
	//*  13   23:ifnull          34
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #249 <Method boolean isVectorDrawable(Drawable)>
	//*  16   30:ifeq            34
		{
			return;
	//   17   33:return          
		} else
		{
			mHasCheckedVectorDrawableSetup = false;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #238 <Field boolean mHasCheckedVectorDrawableSetup>
			throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
	//   21   39:new             #251 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:ldc1            #253 <String "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.">
	//   24   45:invokespecial   #256 <Method void IllegalStateException(String)>
	//   25   48:athrow          
		}
	}

	private ColorStateList createBorderlessButtonColorStateList(Context context)
	{
		return createButtonColorStateList(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #262 <Method ColorStateList createButtonColorStateList(Context, int)>
	//    4    6:areturn         
	}

	private ColorStateList createButtonColorStateList(Context context, int i)
	{
		int l = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlHighlight);
	//    0    0:aload_1         
	//    1    1:getstatic       #268 <Field int android.support.v7.appcompat.R$attr.colorControlHighlight>
	//    2    4:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    3    7:istore          5
		int j = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal);
	//    4    9:aload_1         
	//    5   10:getstatic       #277 <Field int android.support.v7.appcompat.R$attr.colorButtonNormal>
	//    6   13:invokestatic    #280 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//    7   16:istore_3        
		context = ((Context) (ThemeUtils.DISABLED_STATE_SET));
	//    8   17:getstatic       #283 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//    9   20:astore_1        
		int ai[] = ThemeUtils.PRESSED_STATE_SET;
	//   10   21:getstatic       #286 <Field int[] ThemeUtils.PRESSED_STATE_SET>
	//   11   24:astore          6
		int k = ColorUtils.compositeColors(l, i);
	//   12   26:iload           5
	//   13   28:iload_2         
	//   14   29:invokestatic    #292 <Method int ColorUtils.compositeColors(int, int)>
	//   15   32:istore          4
		int ai1[] = ThemeUtils.FOCUSED_STATE_SET;
	//   16   34:getstatic       #295 <Field int[] ThemeUtils.FOCUSED_STATE_SET>
	//   17   37:astore          7
		l = ColorUtils.compositeColors(l, i);
	//   18   39:iload           5
	//   19   41:iload_2         
	//   20   42:invokestatic    #292 <Method int ColorUtils.compositeColors(int, int)>
	//   21   45:istore          5
		return new ColorStateList(new int[][] {
			context, ai, ai1, ThemeUtils.EMPTY_STATE_SET
		}, new int[] {
			j, k, l, i
		});
	//   22   47:new             #297 <Class ColorStateList>
	//   23   50:dup             
	//   24   51:iconst_4        
	//   25   52:anewarray       int[][]
	//   26   55:dup             
	//   27   56:iconst_0        
	//   28   57:aload_1         
	//   29   58:aastore         
	//   30   59:dup             
	//   31   60:iconst_1        
	//   32   61:aload           6
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_2        
	//   36   66:aload           7
	//   37   68:aastore         
	//   38   69:dup             
	//   39   70:iconst_3        
	//   40   71:getstatic       #301 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   41   74:aastore         
	//   42   75:iconst_4        
	//   43   76:newarray        int[]
	//   44   78:dup             
	//   45   79:iconst_0        
	//   46   80:iload_3         
	//   47   81:iastore         
	//   48   82:dup             
	//   49   83:iconst_1        
	//   50   84:iload           4
	//   51   86:iastore         
	//   52   87:dup             
	//   53   88:iconst_2        
	//   54   89:iload           5
	//   55   91:iastore         
	//   56   92:dup             
	//   57   93:iconst_3        
	//   58   94:iload_2         
	//   59   95:iastore         
	//   60   96:invokespecial   #304 <Method void ColorStateList(int[][], int[])>
	//   61   99:areturn         
	}

	private static long createCacheKey(TypedValue typedvalue)
	{
		return (long)typedvalue.assetCookie << 32 | (long)typedvalue.data;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field int TypedValue.assetCookie>
	//    2    4:i2l             
	//    3    5:bipush          32
	//    4    7:lshl            
	//    5    8:aload_0         
	//    6    9:getfield        #314 <Field int TypedValue.data>
	//    7   12:i2l             
	//    8   13:lor             
	//    9   14:lreturn         
	}

	private ColorStateList createColoredButtonColorStateList(Context context)
	{
		return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorAccent));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getstatic       #318 <Field int android.support.v7.appcompat.R$attr.colorAccent>
	//    4    6:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    5    9:invokespecial   #262 <Method ColorStateList createButtonColorStateList(Context, int)>
	//    6   12:areturn         
	}

	private ColorStateList createDefaultButtonColorStateList(Context context)
	{
		return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getstatic       #277 <Field int android.support.v7.appcompat.R$attr.colorButtonNormal>
	//    4    6:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    5    9:invokespecial   #262 <Method ColorStateList createButtonColorStateList(Context, int)>
	//    6   12:areturn         
	}

	private Drawable createDrawableIfNeeded(Context context, int i)
	{
		if(mTypedValue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field TypedValue mTypedValue>
	//*   2    4:ifnonnull       18
			mTypedValue = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #308 <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #323 <Method void TypedValue()>
	//    7   15:putfield        #322 <Field TypedValue mTypedValue>
		TypedValue typedvalue = mTypedValue;
	//    8   18:aload_0         
	//    9   19:getfield        #322 <Field TypedValue mTypedValue>
	//   10   22:astore          6
		context.getResources().getValue(i, typedvalue, true);
	//   11   24:aload_1         
	//   12   25:invokevirtual   #329 <Method Resources Context.getResources()>
	//   13   28:iload_2         
	//   14   29:aload           6
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #335 <Method void Resources.getValue(int, TypedValue, boolean)>
		long l = createCacheKey(typedvalue);
	//   17   35:aload           6
	//   18   37:invokestatic    #337 <Method long createCacheKey(TypedValue)>
	//   19   40:lstore_3        
		Object obj = ((Object) (getCachedDrawable(context, l)));
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:lload_3         
	//   23   44:invokespecial   #341 <Method Drawable getCachedDrawable(Context, long)>
	//   24   47:astore          5
		if(obj != null)
	//*  25   49:aload           5
	//*  26   51:ifnull          57
			return ((Drawable) (obj));
	//   27   54:aload           5
	//   28   56:areturn         
		if(i == android.support.v7.appcompat.R.drawable.abc_cab_background_top_material)
	//*  29   57:iload_2         
	//*  30   58:getstatic       #344 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_top_material>
	//*  31   61:icmpne          99
			obj = ((Object) (new LayerDrawable(new Drawable[] {
				getDrawable(context, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg), getDrawable(context, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha)
			})));
	//   32   64:new             #346 <Class LayerDrawable>
	//   33   67:dup             
	//   34   68:iconst_2        
	//   35   69:anewarray       Drawable[]
	//   36   72:dup             
	//   37   73:iconst_0        
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:getstatic       #153 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_internal_bg>
	//   41   79:invokevirtual   #245 <Method Drawable getDrawable(Context, int)>
	//   42   82:aastore         
	//   43   83:dup             
	//   44   84:iconst_1        
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:getstatic       #124 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_top_mtrl_alpha>
	//   48   90:invokevirtual   #245 <Method Drawable getDrawable(Context, int)>
	//   49   93:aastore         
	//   50   94:invokespecial   #349 <Method void LayerDrawable(Drawable[])>
	//   51   97:astore          5
		if(obj != null)
	//*  52   99:aload           5
	//*  53  101:ifnull          123
		{
			((Drawable) (obj)).setChangingConfigurations(typedvalue.changingConfigurations);
	//   54  104:aload           5
	//   55  106:aload           6
	//   56  108:getfield        #352 <Field int TypedValue.changingConfigurations>
	//   57  111:invokevirtual   #355 <Method void Drawable.setChangingConfigurations(int)>
			addDrawableToCache(context, l, ((Drawable) (obj)));
	//   58  114:aload_0         
	//   59  115:aload_1         
	//   60  116:lload_3         
	//   61  117:aload           5
	//   62  119:invokespecial   #357 <Method boolean addDrawableToCache(Context, long, Drawable)>
	//   63  122:pop             
		}
		return ((Drawable) (obj));
	//   64  123:aload           5
	//   65  125:areturn         
	}

	private ColorStateList createSwitchThumbColorStateList(Context context)
	{
		int ai[][] = new int[3][];
	//    0    0:iconst_3        
	//    1    1:anewarray       int[][]
	//    2    4:astore_2        
		int ai1[] = new int[3];
	//    3    5:iconst_3        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		ColorStateList colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//    6    9:aload_1         
	//    7   10:getstatic       #361 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//    8   13:invokestatic    #364 <Method ColorStateList ThemeUtils.getThemeAttrColorStateList(Context, int)>
	//    9   16:astore          4
		if(colorstatelist != null && colorstatelist.isStateful())
	//*  10   18:aload           4
	//*  11   20:ifnull          82
	//*  12   23:aload           4
	//*  13   25:invokevirtual   #368 <Method boolean ColorStateList.isStateful()>
	//*  14   28:ifeq            82
		{
			ai[0] = ThemeUtils.DISABLED_STATE_SET;
	//   15   31:aload_2         
	//   16   32:iconst_0        
	//   17   33:getstatic       #283 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//   18   36:aastore         
			ai1[0] = colorstatelist.getColorForState(ai[0], 0);
	//   19   37:aload_3         
	//   20   38:iconst_0        
	//   21   39:aload           4
	//   22   41:aload_2         
	//   23   42:iconst_0        
	//   24   43:aaload          
	//   25   44:iconst_0        
	//   26   45:invokevirtual   #372 <Method int ColorStateList.getColorForState(int[], int)>
	//   27   48:iastore         
			ai[1] = ThemeUtils.CHECKED_STATE_SET;
	//   28   49:aload_2         
	//   29   50:iconst_1        
	//   30   51:getstatic       #375 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   31   54:aastore         
			ai1[1] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
	//   32   55:aload_3         
	//   33   56:iconst_1        
	//   34   57:aload_1         
	//   35   58:getstatic       #378 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   36   61:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   37   64:iastore         
			ai[2] = ThemeUtils.EMPTY_STATE_SET;
	//   38   65:aload_2         
	//   39   66:iconst_2        
	//   40   67:getstatic       #301 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   41   70:aastore         
			ai1[2] = colorstatelist.getDefaultColor();
	//   42   71:aload_3         
	//   43   72:iconst_2        
	//   44   73:aload           4
	//   45   75:invokevirtual   #382 <Method int ColorStateList.getDefaultColor()>
	//   46   78:iastore         
		} else
	//*  47   79:goto            130
		{
			ai[0] = ThemeUtils.DISABLED_STATE_SET;
	//   48   82:aload_2         
	//   49   83:iconst_0        
	//   50   84:getstatic       #283 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//   51   87:aastore         
			ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//   52   88:aload_3         
	//   53   89:iconst_0        
	//   54   90:aload_1         
	//   55   91:getstatic       #361 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//   56   94:invokestatic    #280 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   57   97:iastore         
			ai[1] = ThemeUtils.CHECKED_STATE_SET;
	//   58   98:aload_2         
	//   59   99:iconst_1        
	//   60  100:getstatic       #375 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   61  103:aastore         
			ai1[1] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
	//   62  104:aload_3         
	//   63  105:iconst_1        
	//   64  106:aload_1         
	//   65  107:getstatic       #378 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   66  110:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   67  113:iastore         
			ai[2] = ThemeUtils.EMPTY_STATE_SET;
	//   68  114:aload_2         
	//   69  115:iconst_2        
	//   70  116:getstatic       #301 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   71  119:aastore         
			ai1[2] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//   72  120:aload_3         
	//   73  121:iconst_2        
	//   74  122:aload_1         
	//   75  123:getstatic       #361 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//   76  126:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   77  129:iastore         
		}
		return new ColorStateList(ai, ai1);
	//   78  130:new             #297 <Class ColorStateList>
	//   79  133:dup             
	//   80  134:aload_2         
	//   81  135:aload_3         
	//   82  136:invokespecial   #304 <Method void ColorStateList(int[][], int[])>
	//   83  139:areturn         
	}

	private static PorterDuffColorFilter createTintFilter(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int ai[])
	{
		if(colorstatelist != null && mode != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            22
			return getPorterDuffColorFilter(colorstatelist.getColorForState(ai, 0), mode);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #372 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   17:aload_1         
	//   10   18:invokestatic    #388 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   11   21:areturn         
		else
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
	}

	public static AppCompatDrawableManager get()
	{
		android/support/v7/widget/AppCompatDrawableManager;
	//    0    0:ldc1            #2   <Class AppCompatDrawableManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		AppCompatDrawableManager appcompatdrawablemanager;
		if(INSTANCE == null)
	//*   2    3:getstatic       #391 <Field AppCompatDrawableManager INSTANCE>
	//*   3    6:ifnonnull       25
		{
			INSTANCE = new AppCompatDrawableManager();
	//    4    9:new             #2   <Class AppCompatDrawableManager>
	//    5   12:dup             
	//    6   13:invokespecial   #392 <Method void AppCompatDrawableManager()>
	//    7   16:putstatic       #391 <Field AppCompatDrawableManager INSTANCE>
			installDefaultInflateDelegates(INSTANCE);
	//    8   19:getstatic       #391 <Field AppCompatDrawableManager INSTANCE>
	//    9   22:invokestatic    #396 <Method void installDefaultInflateDelegates(AppCompatDrawableManager)>
		}
		appcompatdrawablemanager = INSTANCE;
	//   10   25:getstatic       #391 <Field AppCompatDrawableManager INSTANCE>
	//   11   28:astore_0        
		android/support/v7/widget/AppCompatDrawableManager;
	//   12   29:ldc1            #2   <Class AppCompatDrawableManager>
		JVM INSTR monitorexit ;
	//   13   31:monitorexit     
		return appcompatdrawablemanager;
	//   14   32:aload_0         
	//   15   33:areturn         
		Exception exception;
		exception;
	//   16   34:astore_0        
	//*  17   35:ldc1            #2   <Class AppCompatDrawableManager>
		throw exception;
	//   18   37:monitorexit     
	//   19   38:aload_0         
	//   20   39:athrow          
	}

	private Drawable getCachedDrawable(Context context, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		LongSparseArray longsparsearray = (LongSparseArray)mDrawableCaches.get(((Object) (context)));
	//    2    2:aload_0         
	//    3    3:getfield        #182 <Field WeakHashMap mDrawableCaches>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #207 <Method Object WeakHashMap.get(Object)>
	//    6   10:checkcast       #209 <Class LongSparseArray>
	//    7   13:astore          4
		if(longsparsearray != null)
			break MISSING_BLOCK_LABEL_24;
	//    8   15:aload           4
	//    9   17:ifnonnull       24
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		Object obj = ((Object) ((WeakReference)longsparsearray.get(l)));
	//   14   24:aload           4
	//   15   26:lload_2         
	//   16   27:invokevirtual   #399 <Method Object LongSparseArray.get(long)>
	//   17   30:checkcast       #213 <Class WeakReference>
	//   18   33:astore          5
		if(obj == null)
			break MISSING_BLOCK_LABEL_75;
	//   19   35:aload           5
	//   20   37:ifnull          75
		obj = ((Object) ((android.graphics.drawable.Drawable.ConstantState)((WeakReference) (obj)).get()));
	//   21   40:aload           5
	//   22   42:invokevirtual   #402 <Method Object WeakReference.get()>
	//   23   45:checkcast       #404 <Class android.graphics.drawable.Drawable$ConstantState>
	//   24   48:astore          5
		if(obj == null)
			break MISSING_BLOCK_LABEL_69;
	//   25   50:aload           5
	//   26   52:ifnull          69
		context = ((Context) (((android.graphics.drawable.Drawable.ConstantState) (obj)).newDrawable(context.getResources())));
	//   27   55:aload           5
	//   28   57:aload_1         
	//   29   58:invokevirtual   #329 <Method Resources Context.getResources()>
	//   30   61:invokevirtual   #408 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   31   64:astore_1        
		this;
	//   32   65:aload_0         
		JVM INSTR monitorexit ;
	//   33   66:monitorexit     
		return ((Drawable) (context));
	//   34   67:aload_1         
	//   35   68:areturn         
		longsparsearray.delete(l);
	//   36   69:aload           4
	//   37   71:lload_2         
	//   38   72:invokevirtual   #412 <Method void LongSparseArray.delete(long)>
		this;
	//   39   75:aload_0         
		JVM INSTR monitorexit ;
	//   40   76:monitorexit     
		return null;
	//   41   77:aconst_null     
	//   42   78:areturn         
		context;
	//   43   79:astore_1        
	//*  44   80:aload_0         
		throw context;
	//   45   81:monitorexit     
	//   46   82:aload_1         
	//   47   83:athrow          
	}

	public static PorterDuffColorFilter getPorterDuffColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		android/support/v7/widget/AppCompatDrawableManager;
	//    0    0:ldc1            #2   <Class AppCompatDrawableManager>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		PorterDuffColorFilter porterduffcolorfilter1 = COLOR_FILTER_CACHE.get(i, mode);
	//    2    3:getstatic       #78  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
	//    3    6:iload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #414 <Method PorterDuffColorFilter AppCompatDrawableManager$ColorFilterLruCache.get(int, android.graphics.PorterDuff$Mode)>
	//    6   11:astore_3        
		PorterDuffColorFilter porterduffcolorfilter;
		porterduffcolorfilter = porterduffcolorfilter1;
	//    7   12:aload_3         
	//    8   13:astore_2        
		if(porterduffcolorfilter1 != null)
			break MISSING_BLOCK_LABEL_38;
	//    9   14:aload_3         
	//   10   15:ifnonnull       38
		porterduffcolorfilter = new PorterDuffColorFilter(i, mode);
	//   11   18:new             #416 <Class PorterDuffColorFilter>
	//   12   21:dup             
	//   13   22:iload_0         
	//   14   23:aload_1         
	//   15   24:invokespecial   #419 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   16   27:astore_2        
		COLOR_FILTER_CACHE.put(i, mode, porterduffcolorfilter);
	//   17   28:getstatic       #78  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
	//   18   31:iload_0         
	//   19   32:aload_1         
	//   20   33:aload_2         
	//   21   34:invokevirtual   #422 <Method PorterDuffColorFilter AppCompatDrawableManager$ColorFilterLruCache.put(int, android.graphics.PorterDuff$Mode, PorterDuffColorFilter)>
	//   22   37:pop             
		android/support/v7/widget/AppCompatDrawableManager;
	//   23   38:ldc1            #2   <Class AppCompatDrawableManager>
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return porterduffcolorfilter;
	//   25   41:aload_2         
	//   26   42:areturn         
		mode;
	//   27   43:astore_1        
	//*  28   44:ldc1            #2   <Class AppCompatDrawableManager>
		throw mode;
	//   29   46:monitorexit     
	//   30   47:aload_1         
	//   31   48:athrow          
	}

	private ColorStateList getTintListFromCache(Context context, int i)
	{
		Object obj1 = ((Object) (mTintLists));
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field WeakHashMap mTintLists>
	//    2    4:astore          4
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		if(obj1 != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          43
		{
			obj1 = ((Object) ((SparseArrayCompat)((WeakHashMap) (obj1)).get(((Object) (context)))));
	//    7   13:aload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #207 <Method Object WeakHashMap.get(Object)>
	//   10   19:checkcast       #227 <Class SparseArrayCompat>
	//   11   22:astore          4
			context = ((Context) (obj));
	//   12   24:aload_3         
	//   13   25:astore_1        
			if(obj1 != null)
	//*  14   26:aload           4
	//*  15   28:ifnull          41
				context = ((Context) ((ColorStateList)((SparseArrayCompat) (obj1)).get(i)));
	//   16   31:aload           4
	//   17   33:iload_2         
	//   18   34:invokevirtual   #426 <Method Object SparseArrayCompat.get(int)>
	//   19   37:checkcast       #297 <Class ColorStateList>
	//   20   40:astore_1        
			return ((ColorStateList) (context));
	//   21   41:aload_1         
	//   22   42:areturn         
		} else
		{
			return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
		}
	}

	static android.graphics.PorterDuff.Mode getTintMode(int i)
	{
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*   0    0:iload_0         
	//*   1    1:getstatic       #431 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*   2    4:icmpne          11
			return android.graphics.PorterDuff.Mode.MULTIPLY;
	//    3    7:getstatic       #434 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    4   10:areturn         
		else
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
	}

	private static void installDefaultInflateDelegates(AppCompatDrawableManager appcompatdrawablemanager)
	{
		if(android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:getstatic       #439 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          50
		{
			appcompatdrawablemanager.addDelegate("vector", ((InflateDelegate) (new VdcInflateDelegate())));
	//    3    8:aload_0         
	//    4    9:ldc2            #441 <String "vector">
	//    5   12:new             #18  <Class AppCompatDrawableManager$VdcInflateDelegate>
	//    6   15:dup             
	//    7   16:invokespecial   #442 <Method void AppCompatDrawableManager$VdcInflateDelegate()>
	//    8   19:invokespecial   #444 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
			appcompatdrawablemanager.addDelegate("animated-vector", ((InflateDelegate) (new AvdcInflateDelegate())));
	//    9   22:aload_0         
	//   10   23:ldc2            #446 <String "animated-vector">
	//   11   26:new             #9   <Class AppCompatDrawableManager$AvdcInflateDelegate>
	//   12   29:dup             
	//   13   30:invokespecial   #447 <Method void AppCompatDrawableManager$AvdcInflateDelegate()>
	//   14   33:invokespecial   #444 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
			appcompatdrawablemanager.addDelegate("animated-selector", ((InflateDelegate) (new AsldcInflateDelegate())));
	//   15   36:aload_0         
	//   16   37:ldc2            #449 <String "animated-selector">
	//   17   40:new             #6   <Class AppCompatDrawableManager$AsldcInflateDelegate>
	//   18   43:dup             
	//   19   44:invokespecial   #450 <Method void AppCompatDrawableManager$AsldcInflateDelegate()>
	//   20   47:invokespecial   #444 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
		}
	//   21   50:return          
	}

	private static boolean isVectorDrawable(Drawable drawable)
	{
		return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(((Object) (((Object) (drawable)).getClass().getName())));
	//    0    0:aload_0         
	//    1    1:instanceof      #452 <Class VectorDrawableCompat>
	//    2    4:ifne            27
	//    3    7:ldc1            #40  <String "android.graphics.drawable.VectorDrawable">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #456 <Method Class Object.getClass()>
	//    6   13:invokevirtual   #462 <Method String Class.getName()>
	//    7   16:invokevirtual   #468 <Method boolean String.equals(Object)>
	//    8   19:ifeq            25
	//    9   22:goto            27
	//   10   25:iconst_0        
	//   11   26:ireturn         
	//   12   27:iconst_1        
	//   13   28:ireturn         
	}

	private Drawable loadDrawableFromDelegates(Context context, int i)
	{
		long l;
		Object obj;
		Drawable drawable;
		Drawable drawable1;
		TypedValue typedvalue;
		obj = ((Object) (mDelegates));
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field ArrayMap mDelegates>
	//    2    4:astore          6
		if(obj == null || ((ArrayMap) (obj)).isEmpty())
			break MISSING_BLOCK_LABEL_396;
	//    3    6:aload           6
	//    4    8:ifnull          396
	//    5   11:aload           6
	//    6   13:invokevirtual   #474 <Method boolean ArrayMap.isEmpty()>
	//    7   16:ifne            396
		obj = ((Object) (mKnownDrawableIdTags));
	//    8   19:aload_0         
	//    9   20:getfield        #476 <Field SparseArrayCompat mKnownDrawableIdTags>
	//   10   23:astore          6
		if(obj != null)
	//*  11   25:aload           6
	//*  12   27:ifnull          70
		{
			obj = ((Object) ((String)((SparseArrayCompat) (obj)).get(i)));
	//   13   30:aload           6
	//   14   32:iload_2         
	//   15   33:invokevirtual   #426 <Method Object SparseArrayCompat.get(int)>
	//   16   36:checkcast       #464 <Class String>
	//   17   39:astore          6
			if("appcompat_skip_skip".equals(obj) || obj != null && mDelegates.get(obj) == null)
	//*  18   41:ldc1            #43  <String "appcompat_skip_skip">
	//*  19   43:aload           6
	//*  20   45:invokevirtual   #468 <Method boolean String.equals(Object)>
	//*  21   48:ifne            68
	//*  22   51:aload           6
	//*  23   53:ifnull          81
	//*  24   56:aload_0         
	//*  25   57:getfield        #187 <Field ArrayMap mDelegates>
	//*  26   60:aload           6
	//*  27   62:invokevirtual   #477 <Method Object ArrayMap.get(Object)>
	//*  28   65:ifnonnull       81
				return null;
	//   29   68:aconst_null     
	//   30   69:areturn         
		} else
		{
			mKnownDrawableIdTags = new SparseArrayCompat();
	//   31   70:aload_0         
	//   32   71:new             #227 <Class SparseArrayCompat>
	//   33   74:dup             
	//   34   75:invokespecial   #228 <Method void SparseArrayCompat()>
	//   35   78:putfield        #476 <Field SparseArrayCompat mKnownDrawableIdTags>
		}
		if(mTypedValue == null)
	//*  36   81:aload_0         
	//*  37   82:getfield        #322 <Field TypedValue mTypedValue>
	//*  38   85:ifnonnull       99
			mTypedValue = new TypedValue();
	//   39   88:aload_0         
	//   40   89:new             #308 <Class TypedValue>
	//   41   92:dup             
	//   42   93:invokespecial   #323 <Method void TypedValue()>
	//   43   96:putfield        #322 <Field TypedValue mTypedValue>
		typedvalue = mTypedValue;
	//   44   99:aload_0         
	//   45  100:getfield        #322 <Field TypedValue mTypedValue>
	//   46  103:astore          9
		obj = ((Object) (context.getResources()));
	//   47  105:aload_1         
	//   48  106:invokevirtual   #329 <Method Resources Context.getResources()>
	//   49  109:astore          6
		((Resources) (obj)).getValue(i, typedvalue, true);
	//   50  111:aload           6
	//   51  113:iload_2         
	//   52  114:aload           9
	//   53  116:iconst_1        
	//   54  117:invokevirtual   #335 <Method void Resources.getValue(int, TypedValue, boolean)>
		l = createCacheKey(typedvalue);
	//   55  120:aload           9
	//   56  122:invokestatic    #337 <Method long createCacheKey(TypedValue)>
	//   57  125:lstore          4
		drawable1 = getCachedDrawable(context, l);
	//   58  127:aload_0         
	//   59  128:aload_1         
	//   60  129:lload           4
	//   61  131:invokespecial   #341 <Method Drawable getCachedDrawable(Context, long)>
	//   62  134:astore          8
		if(drawable1 != null)
	//*  63  136:aload           8
	//*  64  138:ifnull          144
			return drawable1;
	//   65  141:aload           8
	//   66  143:areturn         
		drawable = drawable1;
	//   67  144:aload           8
	//   68  146:astore          7
		if(typedvalue.string == null)
			break MISSING_BLOCK_LABEL_378;
	//   69  148:aload           9
	//   70  150:getfield        #481 <Field CharSequence TypedValue.string>
	//   71  153:ifnull          378
		drawable = drawable1;
	//   72  156:aload           8
	//   73  158:astore          7
		if(!typedvalue.string.toString().endsWith(".xml"))
			break MISSING_BLOCK_LABEL_378;
	//   74  160:aload           9
	//   75  162:getfield        #481 <Field CharSequence TypedValue.string>
	//   76  165:invokeinterface #486 <Method String CharSequence.toString()>
	//   77  170:ldc2            #488 <String ".xml">
	//   78  173:invokevirtual   #492 <Method boolean String.endsWith(String)>
	//   79  176:ifeq            378
		drawable = drawable1;
	//   80  179:aload           8
	//   81  181:astore          7
		android.content.res.XmlResourceParser xmlresourceparser = ((Resources) (obj)).getXml(i);
	//   82  183:aload           6
	//   83  185:iload_2         
	//   84  186:invokevirtual   #496 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   85  189:astore          10
		drawable = drawable1;
	//   86  191:aload           8
	//   87  193:astore          7
		AttributeSet attributeset = Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser)));
	//   88  195:aload           10
	//   89  197:invokestatic    #502 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   90  200:astore          11
_L1:
		drawable = drawable1;
	//   91  202:aload           8
	//   92  204:astore          7
		int j = ((XmlPullParser) (xmlresourceparser)).next();
	//   93  206:aload           10
	//   94  208:invokeinterface #507 <Method int XmlPullParser.next()>
	//   95  213:istore_3        
		if(j == 2 || j == 1) goto _L2; else goto _L1
	//   96  214:iload_3         
	//   97  215:iconst_2        
	//   98  216:icmpeq          227
	//   99  219:iload_3         
	//  100  220:iconst_1        
	//  101  221:icmpeq          227
	//* 102  224:goto            202
_L2:
		if(j != 2)
			break MISSING_BLOCK_LABEL_352;
	//  103  227:iload_3         
	//  104  228:iconst_2        
	//  105  229:icmpne          352
		drawable = drawable1;
	//  106  232:aload           8
	//  107  234:astore          7
		obj = ((Object) (((XmlPullParser) (xmlresourceparser)).getName()));
	//  108  236:aload           10
	//  109  238:invokeinterface #508 <Method String XmlPullParser.getName()>
	//  110  243:astore          6
		drawable = drawable1;
	//  111  245:aload           8
	//  112  247:astore          7
		mKnownDrawableIdTags.append(i, obj);
	//  113  249:aload_0         
	//  114  250:getfield        #476 <Field SparseArrayCompat mKnownDrawableIdTags>
	//  115  253:iload_2         
	//  116  254:aload           6
	//  117  256:invokevirtual   #232 <Method void SparseArrayCompat.append(int, Object)>
		drawable = drawable1;
	//  118  259:aload           8
	//  119  261:astore          7
		InflateDelegate inflatedelegate = (InflateDelegate)mDelegates.get(obj);
	//  120  263:aload_0         
	//  121  264:getfield        #187 <Field ArrayMap mDelegates>
	//  122  267:aload           6
	//  123  269:invokevirtual   #477 <Method Object ArrayMap.get(Object)>
	//  124  272:checkcast       #15  <Class AppCompatDrawableManager$InflateDelegate>
	//  125  275:astore          12
		obj = ((Object) (drawable1));
	//  126  277:aload           8
	//  127  279:astore          6
		if(inflatedelegate == null)
			break MISSING_BLOCK_LABEL_308;
	//  128  281:aload           12
	//  129  283:ifnull          308
		drawable = drawable1;
	//  130  286:aload           8
	//  131  288:astore          7
		obj = ((Object) (inflatedelegate.createFromXmlInner(context, ((XmlPullParser) (xmlresourceparser)), attributeset, context.getTheme())));
	//  132  290:aload           12
	//  133  292:aload_1         
	//  134  293:aload           10
	//  135  295:aload           11
	//  136  297:aload_1         
	//  137  298:invokevirtual   #512 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  138  301:invokeinterface #516 <Method Drawable AppCompatDrawableManager$InflateDelegate.createFromXmlInner(Context, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//  139  306:astore          6
		drawable = ((Drawable) (obj));
	//  140  308:aload           6
	//  141  310:astore          7
		if(obj == null)
			break MISSING_BLOCK_LABEL_378;
	//  142  312:aload           6
	//  143  314:ifnull          378
		drawable = ((Drawable) (obj));
	//  144  317:aload           6
	//  145  319:astore          7
		((Drawable) (obj)).setChangingConfigurations(typedvalue.changingConfigurations);
	//  146  321:aload           6
	//  147  323:aload           9
	//  148  325:getfield        #352 <Field int TypedValue.changingConfigurations>
	//  149  328:invokevirtual   #355 <Method void Drawable.setChangingConfigurations(int)>
		drawable = ((Drawable) (obj));
	//  150  331:aload           6
	//  151  333:astore          7
		addDrawableToCache(context, l, ((Drawable) (obj)));
	//  152  335:aload_0         
	//  153  336:aload_1         
	//  154  337:lload           4
	//  155  339:aload           6
	//  156  341:invokespecial   #357 <Method boolean addDrawableToCache(Context, long, Drawable)>
	//  157  344:pop             
		drawable = ((Drawable) (obj));
	//  158  345:aload           6
	//  159  347:astore          7
		break MISSING_BLOCK_LABEL_378;
	//  160  349:goto            378
		drawable = drawable1;
	//  161  352:aload           8
	//  162  354:astore          7
		try
		{
			throw new XmlPullParserException("No start tag found");
	//  163  356:new             #518 <Class XmlPullParserException>
	//  164  359:dup             
	//  165  360:ldc2            #520 <String "No start tag found">
	//  166  363:invokespecial   #521 <Method void XmlPullParserException(String)>
	//  167  366:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 168  367:astore_1        
		{
			Log.e("AppCompatDrawableManag", "Exception while inflating drawable", ((Throwable) (context)));
	//  169  368:ldc1            #46  <String "AppCompatDrawableManag">
	//  170  370:ldc2            #523 <String "Exception while inflating drawable">
	//  171  373:aload_1         
	//  172  374:invokestatic    #529 <Method int Log.e(String, String, Throwable)>
	//  173  377:pop             
		}
		if(drawable == null)
	//* 174  378:aload           7
	//* 175  380:ifnonnull       393
			mKnownDrawableIdTags.append(i, "appcompat_skip_skip");
	//  176  383:aload_0         
	//  177  384:getfield        #476 <Field SparseArrayCompat mKnownDrawableIdTags>
	//  178  387:iload_2         
	//  179  388:ldc1            #43  <String "appcompat_skip_skip">
	//  180  390:invokevirtual   #232 <Method void SparseArrayCompat.append(int, Object)>
		return drawable;
	//  181  393:aload           7
	//  182  395:areturn         
		return null;
	//  183  396:aconst_null     
	//  184  397:areturn         
	}

	private void removeDelegate(String s, InflateDelegate inflatedelegate)
	{
		ArrayMap arraymap = mDelegates;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field ArrayMap mDelegates>
	//    2    4:astore_3        
		if(arraymap != null && arraymap.get(((Object) (s))) == inflatedelegate)
	//*   3    5:aload_3         
	//*   4    6:ifnull          27
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #477 <Method Object ArrayMap.get(Object)>
	//*   8   14:aload_2         
	//*   9   15:if_acmpne       27
			mDelegates.remove(((Object) (s)));
	//   10   18:aload_0         
	//   11   19:getfield        #187 <Field ArrayMap mDelegates>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #533 <Method Object ArrayMap.remove(Object)>
	//   14   26:pop             
	//   15   27:return          
	}

	private static void setPorterDuffColorFilter(Drawable drawable, int i, android.graphics.PorterDuff.Mode mode)
	{
		Drawable drawable1 = drawable;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #540 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*   4    6:ifeq            14
			drawable1 = drawable.mutate();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #544 <Method Drawable Drawable.mutate()>
	//    7   13:astore_3        
		drawable = ((Drawable) (mode));
	//    8   14:aload_2         
	//    9   15:astore_0        
		if(mode == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       24
			drawable = ((Drawable) (DEFAULT_MODE));
	//   12   20:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   13   23:astore_0        
		drawable1.setColorFilter(((android.graphics.ColorFilter) (getPorterDuffColorFilter(i, ((android.graphics.PorterDuff.Mode) (drawable))))));
	//   14   24:aload_3         
	//   15   25:iload_1         
	//   16   26:aload_0         
	//   17   27:invokestatic    #388 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   18   30:invokevirtual   #548 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//   19   33:return          
	}

	private Drawable tintDrawable(Context context, int i, boolean flag, Drawable drawable)
	{
		Object obj = ((Object) (getTintList(context, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #553 <Method ColorStateList getTintList(Context, int)>
	//    4    6:astore          5
		if(obj != null)
	//*   5    8:aload           5
	//*   6   10:ifnull          63
		{
			context = ((Context) (drawable));
	//    7   13:aload           4
	//    8   15:astore_1        
			if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*   9   16:aload           4
	//*  10   18:invokestatic    #540 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  11   21:ifeq            30
				context = ((Context) (drawable.mutate()));
	//   12   24:aload           4
	//   13   26:invokevirtual   #544 <Method Drawable Drawable.mutate()>
	//   14   29:astore_1        
			context = ((Context) (DrawableCompat.wrap(((Drawable) (context)))));
	//   15   30:aload_1         
	//   16   31:invokestatic    #559 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   17   34:astore_1        
			DrawableCompat.setTintList(((Drawable) (context)), ((ColorStateList) (obj)));
	//   18   35:aload_1         
	//   19   36:aload           5
	//   20   38:invokestatic    #563 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			drawable = ((Drawable) (getTintMode(i)));
	//   21   41:iload_2         
	//   22   42:invokestatic    #565 <Method android.graphics.PorterDuff$Mode getTintMode(int)>
	//   23   45:astore          4
			obj = ((Object) (context));
	//   24   47:aload_1         
	//   25   48:astore          5
			if(drawable != null)
	//*  26   50:aload           4
	//*  27   52:ifnull          265
			{
				DrawableCompat.setTintMode(((Drawable) (context)), ((android.graphics.PorterDuff.Mode) (drawable)));
	//   28   55:aload_1         
	//   29   56:aload           4
	//   30   58:invokestatic    #569 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
				return ((Drawable) (context));
	//   31   61:aload_1         
	//   32   62:areturn         
			}
		} else
		{
			if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_track_material)
	//*  33   63:iload_2         
	//*  34   64:getstatic       #572 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_track_material>
	//*  35   67:icmpne          143
			{
				obj = ((Object) ((LayerDrawable)drawable));
	//   36   70:aload           4
	//   37   72:checkcast       #346 <Class LayerDrawable>
	//   38   75:astore          5
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   39   77:aload           5
	//   40   79:ldc2            #573 <Int 0x1020000>
	//   41   82:invokevirtual   #577 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   42   85:aload_1         
	//   43   86:getstatic       #580 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   44   89:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   45   92:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   46   95:invokestatic    #582 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   47   98:aload           5
	//   48  100:ldc2            #583 <Int 0x102000f>
	//   49  103:invokevirtual   #577 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   50  106:aload_1         
	//   51  107:getstatic       #580 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   52  110:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   53  113:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   54  116:invokestatic    #582 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   55  119:aload           5
	//   56  121:ldc2            #584 <Int 0x102000d>
	//   57  124:invokevirtual   #577 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   58  127:aload_1         
	//   59  128:getstatic       #378 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   60  131:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   61  134:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   62  137:invokestatic    #582 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				return drawable;
	//   63  140:aload           4
	//   64  142:areturn         
			}
			if(i != android.support.v7.appcompat.R.drawable.abc_ratingbar_material && i != android.support.v7.appcompat.R.drawable.abc_ratingbar_indicator_material && i != android.support.v7.appcompat.R.drawable.abc_ratingbar_small_material)
	//*  65  143:iload_2         
	//*  66  144:getstatic       #587 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_material>
	//*  67  147:icmpeq          191
	//*  68  150:iload_2         
	//*  69  151:getstatic       #590 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_indicator_material>
	//*  70  154:icmpeq          191
	//*  71  157:iload_2         
	//*  72  158:getstatic       #593 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_small_material>
	//*  73  161:icmpne          167
	//*  74  164:goto            191
			{
				obj = ((Object) (drawable));
	//   75  167:aload           4
	//   76  169:astore          5
				if(!tintDrawableUsingColorFilter(context, i, drawable))
	//*  77  171:aload_1         
	//*  78  172:iload_2         
	//*  79  173:aload           4
	//*  80  175:invokestatic    #597 <Method boolean tintDrawableUsingColorFilter(Context, int, Drawable)>
	//*  81  178:ifne            265
				{
					obj = ((Object) (drawable));
	//   82  181:aload           4
	//   83  183:astore          5
					if(flag)
	//*  84  185:iload_3         
	//*  85  186:ifeq            265
						return null;
	//   86  189:aconst_null     
	//   87  190:areturn         
				}
			} else
			{
				obj = ((Object) ((LayerDrawable)drawable));
	//   88  191:aload           4
	//   89  193:checkcast       #346 <Class LayerDrawable>
	//   90  196:astore          5
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   91  198:aload           5
	//   92  200:ldc2            #573 <Int 0x1020000>
	//   93  203:invokevirtual   #577 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   94  206:aload_1         
	//   95  207:getstatic       #580 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   96  210:invokestatic    #280 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   97  213:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   98  216:invokestatic    #582 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   99  219:aload           5
	//  100  221:ldc2            #583 <Int 0x102000f>
	//  101  224:invokevirtual   #577 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//  102  227:aload_1         
	//  103  228:getstatic       #378 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//  104  231:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//  105  234:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//  106  237:invokestatic    #582 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//  107  240:aload           5
	//  108  242:ldc2            #584 <Int 0x102000d>
	//  109  245:invokevirtual   #577 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//  110  248:aload_1         
	//  111  249:getstatic       #378 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//  112  252:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//  113  255:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//  114  258:invokestatic    #582 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				obj = ((Object) (drawable));
	//  115  261:aload           4
	//  116  263:astore          5
			}
		}
		return ((Drawable) (obj));
	//  117  265:aload           5
	//  118  267:areturn         
	}

	static void tintDrawable(Drawable drawable, TintInfo tintinfo, int ai[])
	{
		if(DrawableUtils.canSafelyMutateDrawable(drawable) && drawable.mutate() != drawable)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #540 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #544 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpeq       25
		{
			Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
	//    7   15:ldc1            #46  <String "AppCompatDrawableManag">
	//    8   17:ldc2            #600 <String "Mutated drawable is not the same instance as the input.">
	//    9   20:invokestatic    #604 <Method int Log.d(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(!tintinfo.mHasTintList && !tintinfo.mHasTintMode)
	//*  12   25:aload_1         
	//*  13   26:getfield        #609 <Field boolean TintInfo.mHasTintList>
	//*  14   29:ifne            49
	//*  15   32:aload_1         
	//*  16   33:getfield        #612 <Field boolean TintInfo.mHasTintMode>
	//*  17   36:ifeq            42
	//*  18   39:goto            49
		{
			drawable.clearColorFilter();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #615 <Method void Drawable.clearColorFilter()>
		} else
	//*  21   46:goto            95
		{
			ColorStateList colorstatelist;
			if(tintinfo.mHasTintList)
	//*  22   49:aload_1         
	//*  23   50:getfield        #609 <Field boolean TintInfo.mHasTintList>
	//*  24   53:ifeq            64
				colorstatelist = tintinfo.mTintList;
	//   25   56:aload_1         
	//   26   57:getfield        #619 <Field ColorStateList TintInfo.mTintList>
	//   27   60:astore_3        
			else
	//*  28   61:goto            66
				colorstatelist = null;
	//   29   64:aconst_null     
	//   30   65:astore_3        
			if(tintinfo.mHasTintMode)
	//*  31   66:aload_1         
	//*  32   67:getfield        #612 <Field boolean TintInfo.mHasTintMode>
	//*  33   70:ifeq            81
				tintinfo = ((TintInfo) (tintinfo.mTintMode));
	//   34   73:aload_1         
	//   35   74:getfield        #622 <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//   36   77:astore_1        
			else
	//*  37   78:goto            85
				tintinfo = ((TintInfo) (DEFAULT_MODE));
	//   38   81:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   39   84:astore_1        
			drawable.setColorFilter(((android.graphics.ColorFilter) (createTintFilter(colorstatelist, ((android.graphics.PorterDuff.Mode) (tintinfo)), ai))));
	//   40   85:aload_0         
	//   41   86:aload_3         
	//   42   87:aload_1         
	//   43   88:aload_2         
	//   44   89:invokestatic    #624 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode, int[])>
	//   45   92:invokevirtual   #548 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		}
		if(android.os.Build.VERSION.SDK_INT <= 23)
	//*  46   95:getstatic       #439 <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   98:bipush          23
	//*  48  100:icmpgt          107
			drawable.invalidateSelf();
	//   49  103:aload_0         
	//   50  104:invokevirtual   #627 <Method void Drawable.invalidateSelf()>
	//   51  107:return          
	}

	static boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable)
	{
		android.graphics.PorterDuff.Mode mode = DEFAULT_MODE;
	//    0    0:getstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//    1    3:astore          6
		boolean flag1 = arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i);
	//    2    5:getstatic       #92  <Field int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL>
	//    3    8:iload_1         
	//    4    9:invokestatic    #629 <Method boolean arrayContains(int[], int)>
	//    5   12:istore          5
		int j = 0x1010031;
	//    6   14:ldc2            #630 <Int 0x1010031>
	//    7   17:istore          4
		boolean flag;
		if(flag1)
	//*   8   19:iload           5
	//*   9   21:ifeq            36
		{
			j = android.support.v7.appcompat.R.attr.colorControlNormal;
	//   10   24:getstatic       #580 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   11   27:istore          4
			i = -1;
	//   12   29:iconst_m1       
	//   13   30:istore_1        
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore_3        
		} else
	//*  16   33:goto            125
		if(arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i))
	//*  17   36:getstatic       #147 <Field int[] COLORFILTER_COLOR_CONTROL_ACTIVATED>
	//*  18   39:iload_1         
	//*  19   40:invokestatic    #629 <Method boolean arrayContains(int[], int)>
	//*  20   43:ifeq            58
		{
			j = android.support.v7.appcompat.R.attr.colorControlActivated;
	//   21   46:getstatic       #378 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   22   49:istore          4
			i = -1;
	//   23   51:iconst_m1       
	//   24   52:istore_1        
			flag = true;
	//   25   53:iconst_1        
	//   26   54:istore_3        
		} else
	//*  27   55:goto            125
		if(arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i))
	//*  28   58:getstatic       #158 <Field int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY>
	//*  29   61:iload_1         
	//*  30   62:invokestatic    #629 <Method boolean arrayContains(int[], int)>
	//*  31   65:ifeq            80
		{
			mode = android.graphics.PorterDuff.Mode.MULTIPLY;
	//   32   68:getstatic       #434 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   33   71:astore          6
			i = -1;
	//   34   73:iconst_m1       
	//   35   74:istore_1        
			flag = true;
	//   36   75:iconst_1        
	//   37   76:istore_3        
		} else
	//*  38   77:goto            125
		if(i == android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
	//*  39   80:iload_1         
	//*  40   81:getstatic       #633 <Field int android.support.v7.appcompat.R$drawable.abc_list_divider_mtrl_alpha>
	//*  41   84:icmpne          104
		{
			j = 0x1010030;
	//   42   87:ldc2            #634 <Int 0x1010030>
	//   43   90:istore          4
			i = Math.round(40.8F);
	//   44   92:ldc2            #635 <Float 40.8F>
	//   45   95:invokestatic    #641 <Method int Math.round(float)>
	//   46   98:istore_1        
			flag = true;
	//   47   99:iconst_1        
	//   48  100:istore_3        
		} else
	//*  49  101:goto            125
		if(i == android.support.v7.appcompat.R.drawable.abc_dialog_material_background)
	//*  50  104:iload_1         
	//*  51  105:getstatic       #644 <Field int android.support.v7.appcompat.R$drawable.abc_dialog_material_background>
	//*  52  108:icmpne          118
		{
			i = -1;
	//   53  111:iconst_m1       
	//   54  112:istore_1        
			flag = true;
	//   55  113:iconst_1        
	//   56  114:istore_3        
		} else
	//*  57  115:goto            125
		{
			i = -1;
	//   58  118:iconst_m1       
	//   59  119:istore_1        
			flag = false;
	//   60  120:iconst_0        
	//   61  121:istore_3        
			j = ((int) (flag));
	//   62  122:iload_3         
	//   63  123:istore          4
		}
		if(flag)
	//*  64  125:iload_3         
	//*  65  126:ifeq            174
		{
			Drawable drawable1 = drawable;
	//   66  129:aload_2         
	//   67  130:astore          7
			if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*  68  132:aload_2         
	//*  69  133:invokestatic    #540 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  70  136:ifeq            145
				drawable1 = drawable.mutate();
	//   71  139:aload_2         
	//   72  140:invokevirtual   #544 <Method Drawable Drawable.mutate()>
	//   73  143:astore          7
			drawable1.setColorFilter(((android.graphics.ColorFilter) (getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, j), mode))));
	//   74  145:aload           7
	//   75  147:aload_0         
	//   76  148:iload           4
	//   77  150:invokestatic    #274 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   78  153:aload           6
	//   79  155:invokestatic    #388 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   80  158:invokevirtual   #548 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			if(i != -1)
	//*  81  161:iload_1         
	//*  82  162:iconst_m1       
	//*  83  163:icmpeq          172
				drawable1.setAlpha(i);
	//   84  166:aload           7
	//   85  168:iload_1         
	//   86  169:invokevirtual   #647 <Method void Drawable.setAlpha(int)>
			return true;
	//   87  172:iconst_1        
	//   88  173:ireturn         
		} else
		{
			return false;
	//   89  174:iconst_0        
	//   90  175:ireturn         
		}
	}

	public Drawable getDrawable(Context context, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		context = ((Context) (getDrawable(context, i, false)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:iconst_0        
	//    6    6:invokevirtual   #650 <Method Drawable getDrawable(Context, int, boolean)>
	//    7    9:astore_1        
		this;
	//    8   10:aload_0         
		JVM INSTR monitorexit ;
	//    9   11:monitorexit     
		return ((Drawable) (context));
	//   10   12:aload_1         
	//   11   13:areturn         
		context;
	//   12   14:astore_1        
	//*  13   15:aload_0         
		throw context;
	//   14   16:monitorexit     
	//   15   17:aload_1         
	//   16   18:athrow          
	}

	Drawable getDrawable(Context context, int i, boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Drawable drawable1;
		checkVectorDrawableSetup(context);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #652 <Method void checkVectorDrawableSetup(Context)>
		drawable1 = loadDrawableFromDelegates(context, i);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:iload_2         
	//    8   10:invokespecial   #654 <Method Drawable loadDrawableFromDelegates(Context, int)>
	//    9   13:astore          5
		Drawable drawable;
		drawable = drawable1;
	//   10   15:aload           5
	//   11   17:astore          4
		if(drawable1 != null)
			break MISSING_BLOCK_LABEL_32;
	//   12   19:aload           5
	//   13   21:ifnonnull       32
		drawable = createDrawableIfNeeded(context, i);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokespecial   #656 <Method Drawable createDrawableIfNeeded(Context, int)>
	//   18   30:astore          4
		drawable1 = drawable;
	//   19   32:aload           4
	//   20   34:astore          5
		if(drawable != null)
			break MISSING_BLOCK_LABEL_48;
	//   21   36:aload           4
	//   22   38:ifnonnull       48
		drawable1 = ContextCompat.getDrawable(context, i);
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokestatic    #659 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   26   46:astore          5
		drawable = drawable1;
	//   27   48:aload           5
	//   28   50:astore          4
		if(drawable1 == null)
			break MISSING_BLOCK_LABEL_68;
	//   29   52:aload           5
	//   30   54:ifnull          68
		drawable = tintDrawable(context, i, flag, drawable1);
	//   31   57:aload_0         
	//   32   58:aload_1         
	//   33   59:iload_2         
	//   34   60:iload_3         
	//   35   61:aload           5
	//   36   63:invokespecial   #661 <Method Drawable tintDrawable(Context, int, boolean, Drawable)>
	//   37   66:astore          4
		if(drawable == null)
			break MISSING_BLOCK_LABEL_78;
	//   38   68:aload           4
	//   39   70:ifnull          78
		DrawableUtils.fixDrawable(drawable);
	//   40   73:aload           4
	//   41   75:invokestatic    #665 <Method void DrawableUtils.fixDrawable(Drawable)>
		this;
	//   42   78:aload_0         
		JVM INSTR monitorexit ;
	//   43   79:monitorexit     
		return drawable;
	//   44   80:aload           4
	//   45   82:areturn         
		context;
	//   46   83:astore_1        
	//*  47   84:aload_0         
		throw context;
	//   48   85:monitorexit     
	//   49   86:aload_1         
	//   50   87:athrow          
	}

	ColorStateList getTintList(Context context, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ColorStateList colorstatelist = getTintListFromCache(context, i);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_2         
	//    5    5:invokespecial   #667 <Method ColorStateList getTintListFromCache(Context, int)>
	//    6    8:astore_3        
		ColorStateList colorstatelist1;
		colorstatelist1 = colorstatelist;
	//    7    9:aload_3         
	//    8   10:astore          4
		if(colorstatelist != null)
			break MISSING_BLOCK_LABEL_239;
	//    9   12:aload_3         
	//   10   13:ifnonnull       239
		if(i == android.support.v7.appcompat.R.drawable.abc_edit_text_material)
	//*  11   16:iload_2         
	//*  12   17:getstatic       #670 <Field int android.support.v7.appcompat.R$drawable.abc_edit_text_material>
	//*  13   20:icmpne          34
		{
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_edittext);
	//   14   23:aload_1         
	//   15   24:getstatic       #675 <Field int android.support.v7.appcompat.R$color.abc_tint_edittext>
	//   16   27:invokestatic    #680 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   17   30:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   18   31:goto            222
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
	//*  19   34:iload_2         
	//*  20   35:getstatic       #683 <Field int android.support.v7.appcompat.R$drawable.abc_switch_track_mtrl_alpha>
	//*  21   38:icmpne          52
		{
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_switch_track);
	//   22   41:aload_1         
	//   23   42:getstatic       #686 <Field int android.support.v7.appcompat.R$color.abc_tint_switch_track>
	//   24   45:invokestatic    #680 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   25   48:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   26   49:goto            222
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*  27   52:iload_2         
	//*  28   53:getstatic       #431 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*  29   56:icmpne          68
		{
			colorstatelist = createSwitchThumbColorStateList(context);
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:invokespecial   #688 <Method ColorStateList createSwitchThumbColorStateList(Context)>
	//   33   64:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   34   65:goto            222
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape)
	//*  35   68:iload_2         
	//*  36   69:getstatic       #691 <Field int android.support.v7.appcompat.R$drawable.abc_btn_default_mtrl_shape>
	//*  37   72:icmpne          84
		{
			colorstatelist = createDefaultButtonColorStateList(context);
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:invokespecial   #693 <Method ColorStateList createDefaultButtonColorStateList(Context)>
	//   41   80:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   42   81:goto            222
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_btn_borderless_material)
	//*  43   84:iload_2         
	//*  44   85:getstatic       #696 <Field int android.support.v7.appcompat.R$drawable.abc_btn_borderless_material>
	//*  45   88:icmpne          100
		{
			colorstatelist = createBorderlessButtonColorStateList(context);
	//   46   91:aload_0         
	//   47   92:aload_1         
	//   48   93:invokespecial   #698 <Method ColorStateList createBorderlessButtonColorStateList(Context)>
	//   49   96:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   50   97:goto            222
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_btn_colored_material)
	//*  51  100:iload_2         
	//*  52  101:getstatic       #701 <Field int android.support.v7.appcompat.R$drawable.abc_btn_colored_material>
	//*  53  104:icmpne          116
		{
			colorstatelist = createColoredButtonColorStateList(context);
	//   54  107:aload_0         
	//   55  108:aload_1         
	//   56  109:invokespecial   #703 <Method ColorStateList createColoredButtonColorStateList(Context)>
	//   57  112:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   58  113:goto            222
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha || i == android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material)
	//*  59  116:iload_2         
	//*  60  117:getstatic       #706 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_mtrl_am_alpha>
	//*  61  120:icmpeq          214
	//*  62  123:iload_2         
	//*  63  124:getstatic       #709 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_textfield_background_material>
	//*  64  127:icmpne          133
			break MISSING_BLOCK_LABEL_214;
	//   65  130:goto            214
		if(arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
	//*  66  133:getstatic       #115 <Field int[] TINT_COLOR_CONTROL_NORMAL>
	//*  67  136:iload_2         
	//*  68  137:invokestatic    #629 <Method boolean arrayContains(int[], int)>
	//*  69  140:ifeq            154
		{
			colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorControlNormal);
	//   70  143:aload_1         
	//   71  144:getstatic       #580 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   72  147:invokestatic    #364 <Method ColorStateList ThemeUtils.getThemeAttrColorStateList(Context, int)>
	//   73  150:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   74  151:goto            222
		}
		if(arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
	//*  75  154:getstatic       #166 <Field int[] TINT_COLOR_CONTROL_STATE_LIST>
	//*  76  157:iload_2         
	//*  77  158:invokestatic    #629 <Method boolean arrayContains(int[], int)>
	//*  78  161:ifeq            175
		{
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_default);
	//   79  164:aload_1         
	//   80  165:getstatic       #712 <Field int android.support.v7.appcompat.R$color.abc_tint_default>
	//   81  168:invokestatic    #680 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   82  171:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   83  172:goto            222
		}
		if(arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
	//*  84  175:getstatic       #174 <Field int[] TINT_CHECKABLE_BUTTON_LIST>
	//*  85  178:iload_2         
	//*  86  179:invokestatic    #629 <Method boolean arrayContains(int[], int)>
	//*  87  182:ifeq            196
		{
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_btn_checkable);
	//   88  185:aload_1         
	//   89  186:getstatic       #715 <Field int android.support.v7.appcompat.R$color.abc_tint_btn_checkable>
	//   90  189:invokestatic    #680 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   91  192:astore_3        
			break MISSING_BLOCK_LABEL_222;
	//   92  193:goto            222
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_thumb_material)
	//*  93  196:iload_2         
	//*  94  197:getstatic       #718 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_thumb_material>
	//*  95  200:icmpne          222
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_seek_thumb);
	//   96  203:aload_1         
	//   97  204:getstatic       #721 <Field int android.support.v7.appcompat.R$color.abc_tint_seek_thumb>
	//   98  207:invokestatic    #680 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   99  210:astore_3        
		break MISSING_BLOCK_LABEL_222;
	//  100  211:goto            222
		colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_spinner);
	//  101  214:aload_1         
	//  102  215:getstatic       #724 <Field int android.support.v7.appcompat.R$color.abc_tint_spinner>
	//  103  218:invokestatic    #680 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//  104  221:astore_3        
		colorstatelist1 = colorstatelist;
	//  105  222:aload_3         
	//  106  223:astore          4
		if(colorstatelist == null)
			break MISSING_BLOCK_LABEL_239;
	//  107  225:aload_3         
	//  108  226:ifnull          239
		addTintListToCache(context, i, colorstatelist);
	//  109  229:aload_0         
	//  110  230:aload_1         
	//  111  231:iload_2         
	//  112  232:aload_3         
	//  113  233:invokespecial   #726 <Method void addTintListToCache(Context, int, ColorStateList)>
		colorstatelist1 = colorstatelist;
	//  114  236:aload_3         
	//  115  237:astore          4
		this;
	//  116  239:aload_0         
		JVM INSTR monitorexit ;
	//  117  240:monitorexit     
		return colorstatelist1;
	//  118  241:aload           4
	//  119  243:areturn         
		context;
	//  120  244:astore_1        
	//* 121  245:aload_0         
		throw context;
	//  122  246:monitorexit     
	//  123  247:aload_1         
	//  124  248:athrow          
	}

	public void onConfigurationChanged(Context context)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		context = ((Context) ((LongSparseArray)mDrawableCaches.get(((Object) (context)))));
	//    2    2:aload_0         
	//    3    3:getfield        #182 <Field WeakHashMap mDrawableCaches>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #207 <Method Object WeakHashMap.get(Object)>
	//    6   10:checkcast       #209 <Class LongSparseArray>
	//    7   13:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_22;
	//    8   14:aload_1         
	//    9   15:ifnull          22
		((LongSparseArray) (context)).clear();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #730 <Method void LongSparseArray.clear()>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		context;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw context;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorenabledtintresources, int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Drawable drawable1 = loadDrawableFromDelegates(context, i);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:iload_3         
	//    5    5:invokespecial   #654 <Method Drawable loadDrawableFromDelegates(Context, int)>
	//    6    8:astore          5
		Drawable drawable;
		drawable = drawable1;
	//    7   10:aload           5
	//    8   12:astore          4
		if(drawable1 != null)
			break MISSING_BLOCK_LABEL_26;
	//    9   14:aload           5
	//   10   16:ifnonnull       26
		drawable = vectorenabledtintresources.superGetDrawable(i);
	//   11   19:aload_2         
	//   12   20:iload_3         
	//   13   21:invokevirtual   #737 <Method Drawable VectorEnabledTintResources.superGetDrawable(int)>
	//   14   24:astore          4
		if(drawable == null)
			break MISSING_BLOCK_LABEL_45;
	//   15   26:aload           4
	//   16   28:ifnull          45
		context = ((Context) (tintDrawable(context, i, false, drawable)));
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:iload_3         
	//   20   34:iconst_0        
	//   21   35:aload           4
	//   22   37:invokespecial   #661 <Method Drawable tintDrawable(Context, int, boolean, Drawable)>
	//   23   40:astore_1        
		this;
	//   24   41:aload_0         
		JVM INSTR monitorexit ;
	//   25   42:monitorexit     
		return ((Drawable) (context));
	//   26   43:aload_1         
	//   27   44:areturn         
		this;
	//   28   45:aload_0         
		JVM INSTR monitorexit ;
	//   29   46:monitorexit     
		return null;
	//   30   47:aconst_null     
	//   31   48:areturn         
		context;
	//   32   49:astore_1        
	//*  33   50:aload_0         
		throw context;
	//   34   51:monitorexit     
	//   35   52:aload_1         
	//   36   53:athrow          
	}

	private static final int COLORFILTER_COLOR_BACKGROUND_MULTIPLY[];
	private static final int COLORFILTER_COLOR_CONTROL_ACTIVATED[];
	private static final int COLORFILTER_TINT_COLOR_CONTROL_NORMAL[];
	private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
	private static final boolean DEBUG = false;
	private static final android.graphics.PorterDuff.Mode DEFAULT_MODE;
	private static AppCompatDrawableManager INSTANCE;
	private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
	private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
	private static final String TAG = "AppCompatDrawableManag";
	private static final int TINT_CHECKABLE_BUTTON_LIST[];
	private static final int TINT_COLOR_CONTROL_NORMAL[];
	private static final int TINT_COLOR_CONTROL_STATE_LIST[];
	private ArrayMap mDelegates;
	private final WeakHashMap mDrawableCaches = new WeakHashMap(0);
	private boolean mHasCheckedVectorDrawableSetup;
	private SparseArrayCompat mKnownDrawableIdTags;
	private WeakHashMap mTintLists;
	private TypedValue mTypedValue;

	static 
	{
		DEFAULT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #70  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #72  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//    2    6:new             #12  <Class AppCompatDrawableManager$ColorFilterLruCache>
	//    3    9:dup             
	//    4   10:bipush          6
	//    5   12:invokespecial   #76  <Method void AppCompatDrawableManager$ColorFilterLruCache(int)>
	//    6   15:putstatic       #78  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
		COLORFILTER_TINT_COLOR_CONTROL_NORMAL = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_textfield_search_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha
		});
	//    7   18:iconst_3        
	//    8   19:newarray        int[]
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:getstatic       #84  <Field int android.support.v7.appcompat.R$drawable.abc_textfield_search_default_mtrl_alpha>
	//   12   26:iastore         
	//   13   27:dup             
	//   14   28:iconst_1        
	//   15   29:getstatic       #87  <Field int android.support.v7.appcompat.R$drawable.abc_textfield_default_mtrl_alpha>
	//   16   32:iastore         
	//   17   33:dup             
	//   18   34:iconst_2        
	//   19   35:getstatic       #90  <Field int android.support.v7.appcompat.R$drawable.abc_ab_share_pack_mtrl_alpha>
	//   20   38:iastore         
	//   21   39:putstatic       #92  <Field int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL>
		TINT_COLOR_CONTROL_NORMAL = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_seekbar_tick_mark_material, android.support.v7.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_cut_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_paste_mtrl_am_alpha
		});
	//   22   42:bipush          7
	//   23   44:newarray        int[]
	//   24   46:dup             
	//   25   47:iconst_0        
	//   26   48:getstatic       #95  <Field int android.support.v7.appcompat.R$drawable.abc_ic_commit_search_api_mtrl_alpha>
	//   27   51:iastore         
	//   28   52:dup             
	//   29   53:iconst_1        
	//   30   54:getstatic       #98  <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_tick_mark_material>
	//   31   57:iastore         
	//   32   58:dup             
	//   33   59:iconst_2        
	//   34   60:getstatic       #101 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_share_mtrl_alpha>
	//   35   63:iastore         
	//   36   64:dup             
	//   37   65:iconst_3        
	//   38   66:getstatic       #104 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_copy_mtrl_am_alpha>
	//   39   69:iastore         
	//   40   70:dup             
	//   41   71:iconst_4        
	//   42   72:getstatic       #107 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_cut_mtrl_alpha>
	//   43   75:iastore         
	//   44   76:dup             
	//   45   77:iconst_5        
	//   46   78:getstatic       #110 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_selectall_mtrl_alpha>
	//   47   81:iastore         
	//   48   82:dup             
	//   49   83:bipush          6
	//   50   85:getstatic       #113 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_paste_mtrl_am_alpha>
	//   51   88:iastore         
	//   52   89:putstatic       #115 <Field int[] TINT_COLOR_CONTROL_NORMAL>
		COLORFILTER_COLOR_CONTROL_ACTIVATED = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_text_cursor_material, android.support.v7.appcompat.R.drawable.abc_text_select_handle_left_mtrl_dark, android.support.v7.appcompat.R.drawable.abc_text_select_handle_middle_mtrl_dark, android.support.v7.appcompat.R.drawable.abc_text_select_handle_right_mtrl_dark, android.support.v7.appcompat.R.drawable.abc_text_select_handle_left_mtrl_light, android.support.v7.appcompat.R.drawable.abc_text_select_handle_middle_mtrl_light, android.support.v7.appcompat.R.drawable.abc_text_select_handle_right_mtrl_light
		});
	//   53   92:bipush          10
	//   54   94:newarray        int[]
	//   55   96:dup             
	//   56   97:iconst_0        
	//   57   98:getstatic       #118 <Field int android.support.v7.appcompat.R$drawable.abc_textfield_activated_mtrl_alpha>
	//   58  101:iastore         
	//   59  102:dup             
	//   60  103:iconst_1        
	//   61  104:getstatic       #121 <Field int android.support.v7.appcompat.R$drawable.abc_textfield_search_activated_mtrl_alpha>
	//   62  107:iastore         
	//   63  108:dup             
	//   64  109:iconst_2        
	//   65  110:getstatic       #124 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_top_mtrl_alpha>
	//   66  113:iastore         
	//   67  114:dup             
	//   68  115:iconst_3        
	//   69  116:getstatic       #127 <Field int android.support.v7.appcompat.R$drawable.abc_text_cursor_material>
	//   70  119:iastore         
	//   71  120:dup             
	//   72  121:iconst_4        
	//   73  122:getstatic       #130 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_left_mtrl_dark>
	//   74  125:iastore         
	//   75  126:dup             
	//   76  127:iconst_5        
	//   77  128:getstatic       #133 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_middle_mtrl_dark>
	//   78  131:iastore         
	//   79  132:dup             
	//   80  133:bipush          6
	//   81  135:getstatic       #136 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_right_mtrl_dark>
	//   82  138:iastore         
	//   83  139:dup             
	//   84  140:bipush          7
	//   85  142:getstatic       #139 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_left_mtrl_light>
	//   86  145:iastore         
	//   87  146:dup             
	//   88  147:bipush          8
	//   89  149:getstatic       #142 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_middle_mtrl_light>
	//   90  152:iastore         
	//   91  153:dup             
	//   92  154:bipush          9
	//   93  156:getstatic       #145 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_right_mtrl_light>
	//   94  159:iastore         
	//   95  160:putstatic       #147 <Field int[] COLORFILTER_COLOR_CONTROL_ACTIVATED>
		COLORFILTER_COLOR_BACKGROUND_MULTIPLY = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_popup_background_mtrl_mult, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg, android.support.v7.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult
		});
	//   96  163:iconst_3        
	//   97  164:newarray        int[]
	//   98  166:dup             
	//   99  167:iconst_0        
	//  100  168:getstatic       #150 <Field int android.support.v7.appcompat.R$drawable.abc_popup_background_mtrl_mult>
	//  101  171:iastore         
	//  102  172:dup             
	//  103  173:iconst_1        
	//  104  174:getstatic       #153 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_internal_bg>
	//  105  177:iastore         
	//  106  178:dup             
	//  107  179:iconst_2        
	//  108  180:getstatic       #156 <Field int android.support.v7.appcompat.R$drawable.abc_menu_hardkey_panel_mtrl_mult>
	//  109  183:iastore         
	//  110  184:putstatic       #158 <Field int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY>
		TINT_COLOR_CONTROL_STATE_LIST = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_tab_indicator_material, android.support.v7.appcompat.R.drawable.abc_textfield_search_material
		});
	//  111  187:iconst_2        
	//  112  188:newarray        int[]
	//  113  190:dup             
	//  114  191:iconst_0        
	//  115  192:getstatic       #161 <Field int android.support.v7.appcompat.R$drawable.abc_tab_indicator_material>
	//  116  195:iastore         
	//  117  196:dup             
	//  118  197:iconst_1        
	//  119  198:getstatic       #164 <Field int android.support.v7.appcompat.R$drawable.abc_textfield_search_material>
	//  120  201:iastore         
	//  121  202:putstatic       #166 <Field int[] TINT_COLOR_CONTROL_STATE_LIST>
		TINT_CHECKABLE_BUTTON_LIST = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_btn_check_material, android.support.v7.appcompat.R.drawable.abc_btn_radio_material
		});
	//  122  205:iconst_2        
	//  123  206:newarray        int[]
	//  124  208:dup             
	//  125  209:iconst_0        
	//  126  210:getstatic       #169 <Field int android.support.v7.appcompat.R$drawable.abc_btn_check_material>
	//  127  213:iastore         
	//  128  214:dup             
	//  129  215:iconst_1        
	//  130  216:getstatic       #172 <Field int android.support.v7.appcompat.R$drawable.abc_btn_radio_material>
	//  131  219:iastore         
	//  132  220:putstatic       #174 <Field int[] TINT_CHECKABLE_BUTTON_LIST>
	//* 133  223:return          
	}
}
