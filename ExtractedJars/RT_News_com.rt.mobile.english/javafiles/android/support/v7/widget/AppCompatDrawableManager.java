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
import android.util.*;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v7.widget:
//			ThemeUtils, DrawableUtils, TintInfo, VectorEnabledTintResources

public final class AppCompatDrawableManager
{
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
		//    2    2:invokevirtual   #29  <Method Resources Context.getResources()>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokestatic    #34  <Method AnimatedVectorDrawableCompat AnimatedVectorDrawableCompat.createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		//    7   12:astore_1        
			}
		//*   8   13:aload_1         
		//*   9   14:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*  10   15:astore_1        
			{
				Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", ((Throwable) (context)));
		//   11   16:ldc1            #35  <String "AvdcInflateDelegate">
		//   12   18:ldc1            #37  <String "Exception while inflating <animated-vector>">
		//   13   20:aload_1         
		//   14   21:invokestatic    #43  <Method int Log.e(String, String, Throwable)>
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
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class ColorFilterLruCache extends LruCache
	{

		private static int generateCacheKey(int i, android.graphics.PorterDuff.Mode mode)
		{
			return 31 * (i + 31) + mode.hashCode();
		//    0    0:bipush          31
		//    1    2:iload_0         
		//    2    3:bipush          31
		//    3    5:iadd            
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
	//    1    1:invokespecial   #176 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #176 <Method void Object()>
	//    6   12:putfield        #178 <Field Object mDrawableCacheLock>
	//    7   15:aload_0         
	//    8   16:new             #180 <Class WeakHashMap>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #181 <Method void WeakHashMap(int)>
	//   12   24:putfield        #183 <Field WeakHashMap mDrawableCaches>
	//   13   27:return          
	}

	private void addDelegate(String s, InflateDelegate inflatedelegate)
	{
		if(mDelegates == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field ArrayMap mDelegates>
	//*   2    4:ifnonnull       18
			mDelegates = new ArrayMap();
	//    3    7:aload_0         
	//    4    8:new             #190 <Class ArrayMap>
	//    5   11:dup             
	//    6   12:invokespecial   #191 <Method void ArrayMap()>
	//    7   15:putfield        #188 <Field ArrayMap mDelegates>
		mDelegates.put(((Object) (s)), ((Object) (inflatedelegate)));
	//    8   18:aload_0         
	//    9   19:getfield        #188 <Field ArrayMap mDelegates>
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:invokevirtual   #195 <Method Object ArrayMap.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	private boolean addDrawableToCache(Context context, long l, Drawable drawable)
	{
		android.graphics.drawable.Drawable.ConstantState constantstate;
		constantstate = drawable.getConstantState();
	//    0    0:aload           4
	//    1    2:invokevirtual   #204 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//    2    5:astore          7
		if(constantstate == null)
			break MISSING_BLOCK_LABEL_89;
	//    3    7:aload           7
	//    4    9:ifnull          89
		Object obj = mDrawableCacheLock;
	//    5   12:aload_0         
	//    6   13:getfield        #178 <Field Object mDrawableCacheLock>
	//    7   16:astore          6
		obj;
	//    8   18:aload           6
		JVM INSTR monitorenter ;
	//    9   20:monitorenter    
		LongSparseArray longsparsearray = (LongSparseArray)mDrawableCaches.get(((Object) (context)));
	//   10   21:aload_0         
	//   11   22:getfield        #183 <Field WeakHashMap mDrawableCaches>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//   14   29:checkcast       #210 <Class LongSparseArray>
	//   15   32:astore          5
		drawable = ((Drawable) (longsparsearray));
	//   16   34:aload           5
	//   17   36:astore          4
		if(longsparsearray != null)
			break MISSING_BLOCK_LABEL_63;
	//   18   38:aload           5
	//   19   40:ifnonnull       63
		drawable = ((Drawable) (new LongSparseArray()));
	//   20   43:new             #210 <Class LongSparseArray>
	//   21   46:dup             
	//   22   47:invokespecial   #211 <Method void LongSparseArray()>
	//   23   50:astore          4
		mDrawableCaches.put(((Object) (context)), ((Object) (drawable)));
	//   24   52:aload_0         
	//   25   53:getfield        #183 <Field WeakHashMap mDrawableCaches>
	//   26   56:aload_1         
	//   27   57:aload           4
	//   28   59:invokevirtual   #212 <Method Object WeakHashMap.put(Object, Object)>
	//   29   62:pop             
		((LongSparseArray) (drawable)).put(l, ((Object) (new WeakReference(((Object) (constantstate))))));
	//   30   63:aload           4
	//   31   65:lload_2         
	//   32   66:new             #214 <Class WeakReference>
	//   33   69:dup             
	//   34   70:aload           7
	//   35   72:invokespecial   #217 <Method void WeakReference(Object)>
	//   36   75:invokevirtual   #220 <Method void LongSparseArray.put(long, Object)>
		obj;
	//   37   78:aload           6
		JVM INSTR monitorexit ;
	//   38   80:monitorexit     
		return true;
	//   39   81:iconst_1        
	//   40   82:ireturn         
		context;
	//   41   83:astore_1        
		obj;
	//   42   84:aload           6
		JVM INSTR monitorexit ;
	//   43   86:monitorexit     
		throw context;
	//   44   87:aload_1         
	//   45   88:athrow          
		return false;
	//   46   89:iconst_0        
	//   47   90:ireturn         
	}

	private void addTintListToCache(Context context, int i, ColorStateList colorstatelist)
	{
		if(mTintLists == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field WeakHashMap mTintLists>
	//*   2    4:ifnonnull       18
			mTintLists = new WeakHashMap();
	//    3    7:aload_0         
	//    4    8:new             #180 <Class WeakHashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #226 <Method void WeakHashMap()>
	//    7   15:putfield        #225 <Field WeakHashMap mTintLists>
		SparseArrayCompat sparsearraycompat1 = (SparseArrayCompat)mTintLists.get(((Object) (context)));
	//    8   18:aload_0         
	//    9   19:getfield        #225 <Field WeakHashMap mTintLists>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//   12   26:checkcast       #228 <Class SparseArrayCompat>
	//   13   29:astore          5
		SparseArrayCompat sparsearraycompat = sparsearraycompat1;
	//   14   31:aload           5
	//   15   33:astore          4
		if(sparsearraycompat1 == null)
	//*  16   35:aload           5
	//*  17   37:ifnonnull       60
		{
			sparsearraycompat = new SparseArrayCompat();
	//   18   40:new             #228 <Class SparseArrayCompat>
	//   19   43:dup             
	//   20   44:invokespecial   #229 <Method void SparseArrayCompat()>
	//   21   47:astore          4
			mTintLists.put(((Object) (context)), ((Object) (sparsearraycompat)));
	//   22   49:aload_0         
	//   23   50:getfield        #225 <Field WeakHashMap mTintLists>
	//   24   53:aload_1         
	//   25   54:aload           4
	//   26   56:invokevirtual   #212 <Method Object WeakHashMap.put(Object, Object)>
	//   27   59:pop             
		}
		sparsearraycompat.append(i, ((Object) (colorstatelist)));
	//   28   60:aload           4
	//   29   62:iload_2         
	//   30   63:aload_3         
	//   31   64:invokevirtual   #233 <Method void SparseArrayCompat.append(int, Object)>
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
	//*   1    1:getfield        #239 <Field boolean mHasCheckedVectorDrawableSetup>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mHasCheckedVectorDrawableSetup = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #239 <Field boolean mHasCheckedVectorDrawableSetup>
		context = ((Context) (getDrawable(context, android.support.v7.appcompat.R.drawable.abc_vector_test)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getstatic       #242 <Field int android.support.v7.appcompat.R$drawable.abc_vector_test>
	//   10   18:invokevirtual   #246 <Method Drawable getDrawable(Context, int)>
	//   11   21:astore_1        
		if(context != null && isVectorDrawable(((Drawable) (context))))
	//*  12   22:aload_1         
	//*  13   23:ifnull          37
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #250 <Method boolean isVectorDrawable(Drawable)>
	//*  16   30:ifne            36
	//*  17   33:goto            37
		{
			return;
	//   18   36:return          
		} else
		{
			mHasCheckedVectorDrawableSetup = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #239 <Field boolean mHasCheckedVectorDrawableSetup>
			throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
	//   22   42:new             #252 <Class IllegalStateException>
	//   23   45:dup             
	//   24   46:ldc1            #254 <String "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.">
	//   25   48:invokespecial   #257 <Method void IllegalStateException(String)>
	//   26   51:athrow          
		}
	}

	private ColorStateList createBorderlessButtonColorStateList(Context context)
	{
		return createButtonColorStateList(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #263 <Method ColorStateList createButtonColorStateList(Context, int)>
	//    4    6:areturn         
	}

	private ColorStateList createButtonColorStateList(Context context, int i)
	{
		int l = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlHighlight);
	//    0    0:aload_1         
	//    1    1:getstatic       #269 <Field int android.support.v7.appcompat.R$attr.colorControlHighlight>
	//    2    4:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    3    7:istore          5
		int j = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal);
	//    4    9:aload_1         
	//    5   10:getstatic       #278 <Field int android.support.v7.appcompat.R$attr.colorButtonNormal>
	//    6   13:invokestatic    #281 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//    7   16:istore_3        
		context = ((Context) (ThemeUtils.DISABLED_STATE_SET));
	//    8   17:getstatic       #284 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//    9   20:astore_1        
		int ai[] = ThemeUtils.PRESSED_STATE_SET;
	//   10   21:getstatic       #287 <Field int[] ThemeUtils.PRESSED_STATE_SET>
	//   11   24:astore          6
		int k = ColorUtils.compositeColors(l, i);
	//   12   26:iload           5
	//   13   28:iload_2         
	//   14   29:invokestatic    #293 <Method int ColorUtils.compositeColors(int, int)>
	//   15   32:istore          4
		int ai1[] = ThemeUtils.FOCUSED_STATE_SET;
	//   16   34:getstatic       #296 <Field int[] ThemeUtils.FOCUSED_STATE_SET>
	//   17   37:astore          7
		l = ColorUtils.compositeColors(l, i);
	//   18   39:iload           5
	//   19   41:iload_2         
	//   20   42:invokestatic    #293 <Method int ColorUtils.compositeColors(int, int)>
	//   21   45:istore          5
		return new ColorStateList(new int[][] {
			context, ai, ai1, ThemeUtils.EMPTY_STATE_SET
		}, new int[] {
			j, k, l, i
		});
	//   22   47:new             #298 <Class ColorStateList>
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
	//   40   71:getstatic       #302 <Field int[] ThemeUtils.EMPTY_STATE_SET>
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
	//   60   96:invokespecial   #305 <Method void ColorStateList(int[][], int[])>
	//   61   99:areturn         
	}

	private static long createCacheKey(TypedValue typedvalue)
	{
		return (long)typedvalue.assetCookie << 32 | (long)typedvalue.data;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field int TypedValue.assetCookie>
	//    2    4:i2l             
	//    3    5:bipush          32
	//    4    7:lshl            
	//    5    8:aload_0         
	//    6    9:getfield        #315 <Field int TypedValue.data>
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
	//    3    3:getstatic       #319 <Field int android.support.v7.appcompat.R$attr.colorAccent>
	//    4    6:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    5    9:invokespecial   #263 <Method ColorStateList createButtonColorStateList(Context, int)>
	//    6   12:areturn         
	}

	private ColorStateList createDefaultButtonColorStateList(Context context)
	{
		return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getstatic       #278 <Field int android.support.v7.appcompat.R$attr.colorButtonNormal>
	//    4    6:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    5    9:invokespecial   #263 <Method ColorStateList createButtonColorStateList(Context, int)>
	//    6   12:areturn         
	}

	private Drawable createDrawableIfNeeded(Context context, int i)
	{
		if(mTypedValue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field TypedValue mTypedValue>
	//*   2    4:ifnonnull       18
			mTypedValue = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #309 <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #324 <Method void TypedValue()>
	//    7   15:putfield        #323 <Field TypedValue mTypedValue>
		TypedValue typedvalue = mTypedValue;
	//    8   18:aload_0         
	//    9   19:getfield        #323 <Field TypedValue mTypedValue>
	//   10   22:astore          6
		context.getResources().getValue(i, typedvalue, true);
	//   11   24:aload_1         
	//   12   25:invokevirtual   #330 <Method Resources Context.getResources()>
	//   13   28:iload_2         
	//   14   29:aload           6
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #336 <Method void Resources.getValue(int, TypedValue, boolean)>
		long l = createCacheKey(typedvalue);
	//   17   35:aload           6
	//   18   37:invokestatic    #338 <Method long createCacheKey(TypedValue)>
	//   19   40:lstore_3        
		Object obj = ((Object) (getCachedDrawable(context, l)));
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:lload_3         
	//   23   44:invokespecial   #342 <Method Drawable getCachedDrawable(Context, long)>
	//   24   47:astore          5
		if(obj != null)
	//*  25   49:aload           5
	//*  26   51:ifnull          57
			return ((Drawable) (obj));
	//   27   54:aload           5
	//   28   56:areturn         
		if(i == android.support.v7.appcompat.R.drawable.abc_cab_background_top_material)
	//*  29   57:iload_2         
	//*  30   58:getstatic       #345 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_top_material>
	//*  31   61:icmpne          99
			obj = ((Object) (new LayerDrawable(new Drawable[] {
				getDrawable(context, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg), getDrawable(context, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha)
			})));
	//   32   64:new             #347 <Class LayerDrawable>
	//   33   67:dup             
	//   34   68:iconst_2        
	//   35   69:anewarray       Drawable[]
	//   36   72:dup             
	//   37   73:iconst_0        
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:getstatic       #152 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_internal_bg>
	//   41   79:invokevirtual   #246 <Method Drawable getDrawable(Context, int)>
	//   42   82:aastore         
	//   43   83:dup             
	//   44   84:iconst_1        
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:getstatic       #123 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_top_mtrl_alpha>
	//   48   90:invokevirtual   #246 <Method Drawable getDrawable(Context, int)>
	//   49   93:aastore         
	//   50   94:invokespecial   #350 <Method void LayerDrawable(Drawable[])>
	//   51   97:astore          5
		if(obj != null)
	//*  52   99:aload           5
	//*  53  101:ifnull          123
		{
			((Drawable) (obj)).setChangingConfigurations(typedvalue.changingConfigurations);
	//   54  104:aload           5
	//   55  106:aload           6
	//   56  108:getfield        #353 <Field int TypedValue.changingConfigurations>
	//   57  111:invokevirtual   #356 <Method void Drawable.setChangingConfigurations(int)>
			addDrawableToCache(context, l, ((Drawable) (obj)));
	//   58  114:aload_0         
	//   59  115:aload_1         
	//   60  116:lload_3         
	//   61  117:aload           5
	//   62  119:invokespecial   #358 <Method boolean addDrawableToCache(Context, long, Drawable)>
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
	//    7   10:getstatic       #362 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//    8   13:invokestatic    #365 <Method ColorStateList ThemeUtils.getThemeAttrColorStateList(Context, int)>
	//    9   16:astore          4
		if(colorstatelist != null && colorstatelist.isStateful())
	//*  10   18:aload           4
	//*  11   20:ifnull          82
	//*  12   23:aload           4
	//*  13   25:invokevirtual   #369 <Method boolean ColorStateList.isStateful()>
	//*  14   28:ifeq            82
		{
			ai[0] = ThemeUtils.DISABLED_STATE_SET;
	//   15   31:aload_2         
	//   16   32:iconst_0        
	//   17   33:getstatic       #284 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//   18   36:aastore         
			ai1[0] = colorstatelist.getColorForState(ai[0], 0);
	//   19   37:aload_3         
	//   20   38:iconst_0        
	//   21   39:aload           4
	//   22   41:aload_2         
	//   23   42:iconst_0        
	//   24   43:aaload          
	//   25   44:iconst_0        
	//   26   45:invokevirtual   #373 <Method int ColorStateList.getColorForState(int[], int)>
	//   27   48:iastore         
			ai[1] = ThemeUtils.CHECKED_STATE_SET;
	//   28   49:aload_2         
	//   29   50:iconst_1        
	//   30   51:getstatic       #376 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   31   54:aastore         
			ai1[1] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
	//   32   55:aload_3         
	//   33   56:iconst_1        
	//   34   57:aload_1         
	//   35   58:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   36   61:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   37   64:iastore         
			ai[2] = ThemeUtils.EMPTY_STATE_SET;
	//   38   65:aload_2         
	//   39   66:iconst_2        
	//   40   67:getstatic       #302 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   41   70:aastore         
			ai1[2] = colorstatelist.getDefaultColor();
	//   42   71:aload_3         
	//   43   72:iconst_2        
	//   44   73:aload           4
	//   45   75:invokevirtual   #383 <Method int ColorStateList.getDefaultColor()>
	//   46   78:iastore         
		} else
	//*  47   79:goto            130
		{
			ai[0] = ThemeUtils.DISABLED_STATE_SET;
	//   48   82:aload_2         
	//   49   83:iconst_0        
	//   50   84:getstatic       #284 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//   51   87:aastore         
			ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//   52   88:aload_3         
	//   53   89:iconst_0        
	//   54   90:aload_1         
	//   55   91:getstatic       #362 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//   56   94:invokestatic    #281 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   57   97:iastore         
			ai[1] = ThemeUtils.CHECKED_STATE_SET;
	//   58   98:aload_2         
	//   59   99:iconst_1        
	//   60  100:getstatic       #376 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   61  103:aastore         
			ai1[1] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
	//   62  104:aload_3         
	//   63  105:iconst_1        
	//   64  106:aload_1         
	//   65  107:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   66  110:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   67  113:iastore         
			ai[2] = ThemeUtils.EMPTY_STATE_SET;
	//   68  114:aload_2         
	//   69  115:iconst_2        
	//   70  116:getstatic       #302 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   71  119:aastore         
			ai1[2] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//   72  120:aload_3         
	//   73  121:iconst_2        
	//   74  122:aload_1         
	//   75  123:getstatic       #362 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//   76  126:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   77  129:iastore         
		}
		return new ColorStateList(ai, ai1);
	//   78  130:new             #298 <Class ColorStateList>
	//   79  133:dup             
	//   80  134:aload_2         
	//   81  135:aload_3         
	//   82  136:invokespecial   #305 <Method void ColorStateList(int[][], int[])>
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
	//    8   14:invokevirtual   #373 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   17:aload_1         
	//   10   18:invokestatic    #389 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   11   21:areturn         
		else
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
	}

	public static AppCompatDrawableManager get()
	{
		if(INSTANCE == null)
	//*   0    0:getstatic       #392 <Field AppCompatDrawableManager INSTANCE>
	//*   1    3:ifnonnull       22
		{
			INSTANCE = new AppCompatDrawableManager();
	//    2    6:new             #2   <Class AppCompatDrawableManager>
	//    3    9:dup             
	//    4   10:invokespecial   #393 <Method void AppCompatDrawableManager()>
	//    5   13:putstatic       #392 <Field AppCompatDrawableManager INSTANCE>
			installDefaultInflateDelegates(INSTANCE);
	//    6   16:getstatic       #392 <Field AppCompatDrawableManager INSTANCE>
	//    7   19:invokestatic    #397 <Method void installDefaultInflateDelegates(AppCompatDrawableManager)>
		}
		return INSTANCE;
	//    8   22:getstatic       #392 <Field AppCompatDrawableManager INSTANCE>
	//    9   25:areturn         
	}

	private Drawable getCachedDrawable(Context context, long l)
	{
		Object obj = mDrawableCacheLock;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Object mDrawableCacheLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		LongSparseArray longsparsearray = (LongSparseArray)mDrawableCaches.get(((Object) (context)));
	//    5    9:aload_0         
	//    6   10:getfield        #183 <Field WeakHashMap mDrawableCaches>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//    9   17:checkcast       #210 <Class LongSparseArray>
	//   10   20:astore          5
		if(longsparsearray != null)
			break MISSING_BLOCK_LABEL_32;
	//   11   22:aload           5
	//   12   24:ifnonnull       32
		obj;
	//   13   27:aload           4
		JVM INSTR monitorexit ;
	//   14   29:monitorexit     
		return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
		Object obj1 = ((Object) ((WeakReference)longsparsearray.get(l)));
	//   17   32:aload           5
	//   18   34:lload_2         
	//   19   35:invokevirtual   #400 <Method Object LongSparseArray.get(long)>
	//   20   38:checkcast       #214 <Class WeakReference>
	//   21   41:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_84;
	//   22   43:aload           6
	//   23   45:ifnull          84
		obj1 = ((Object) ((android.graphics.drawable.Drawable.ConstantState)((WeakReference) (obj1)).get()));
	//   24   48:aload           6
	//   25   50:invokevirtual   #403 <Method Object WeakReference.get()>
	//   26   53:checkcast       #405 <Class android.graphics.drawable.Drawable$ConstantState>
	//   27   56:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_78;
	//   28   58:aload           6
	//   29   60:ifnull          78
		context = ((Context) (((android.graphics.drawable.Drawable.ConstantState) (obj1)).newDrawable(context.getResources())));
	//   30   63:aload           6
	//   31   65:aload_1         
	//   32   66:invokevirtual   #330 <Method Resources Context.getResources()>
	//   33   69:invokevirtual   #409 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   34   72:astore_1        
		obj;
	//   35   73:aload           4
		JVM INSTR monitorexit ;
	//   36   75:monitorexit     
		return ((Drawable) (context));
	//   37   76:aload_1         
	//   38   77:areturn         
		longsparsearray.delete(l);
	//   39   78:aload           5
	//   40   80:lload_2         
	//   41   81:invokevirtual   #413 <Method void LongSparseArray.delete(long)>
		obj;
	//   42   84:aload           4
		JVM INSTR monitorexit ;
	//   43   86:monitorexit     
		return null;
	//   44   87:aconst_null     
	//   45   88:areturn         
		context;
	//   46   89:astore_1        
		obj;
	//   47   90:aload           4
		JVM INSTR monitorexit ;
	//   48   92:monitorexit     
		throw context;
	//   49   93:aload_1         
	//   50   94:athrow          
	}

	public static PorterDuffColorFilter getPorterDuffColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		PorterDuffColorFilter porterduffcolorfilter1 = COLOR_FILTER_CACHE.get(i, mode);
	//    0    0:getstatic       #77  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
	//    1    3:iload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #415 <Method PorterDuffColorFilter AppCompatDrawableManager$ColorFilterLruCache.get(int, android.graphics.PorterDuff$Mode)>
	//    4    8:astore_3        
		PorterDuffColorFilter porterduffcolorfilter = porterduffcolorfilter1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(porterduffcolorfilter1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       35
		{
			porterduffcolorfilter = new PorterDuffColorFilter(i, mode);
	//    9   15:new             #417 <Class PorterDuffColorFilter>
	//   10   18:dup             
	//   11   19:iload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #420 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   14   24:astore_2        
			COLOR_FILTER_CACHE.put(i, mode, porterduffcolorfilter);
	//   15   25:getstatic       #77  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
	//   16   28:iload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:invokevirtual   #423 <Method PorterDuffColorFilter AppCompatDrawableManager$ColorFilterLruCache.put(int, android.graphics.PorterDuff$Mode, PorterDuffColorFilter)>
	//   20   34:pop             
		}
		return porterduffcolorfilter;
	//   21   35:aload_2         
	//   22   36:areturn         
	}

	private ColorStateList getTintListFromCache(Context context, int i)
	{
		WeakHashMap weakhashmap = mTintLists;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field WeakHashMap mTintLists>
	//    2    4:astore          4
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		if(weakhashmap != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          45
		{
			SparseArrayCompat sparsearraycompat = (SparseArrayCompat)mTintLists.get(((Object) (context)));
	//    7   13:aload_0         
	//    8   14:getfield        #225 <Field WeakHashMap mTintLists>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//   11   21:checkcast       #228 <Class SparseArrayCompat>
	//   12   24:astore          4
			context = ((Context) (obj));
	//   13   26:aload_3         
	//   14   27:astore_1        
			if(sparsearraycompat != null)
	//*  15   28:aload           4
	//*  16   30:ifnull          43
				context = ((Context) ((ColorStateList)sparsearraycompat.get(i)));
	//   17   33:aload           4
	//   18   35:iload_2         
	//   19   36:invokevirtual   #427 <Method Object SparseArrayCompat.get(int)>
	//   20   39:checkcast       #298 <Class ColorStateList>
	//   21   42:astore_1        
			return ((ColorStateList) (context));
	//   22   43:aload_1         
	//   23   44:areturn         
		} else
		{
			return null;
	//   24   45:aconst_null     
	//   25   46:areturn         
		}
	}

	static android.graphics.PorterDuff.Mode getTintMode(int i)
	{
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*   0    0:iload_0         
	//*   1    1:getstatic       #432 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*   2    4:icmpne          11
			return android.graphics.PorterDuff.Mode.MULTIPLY;
	//    3    7:getstatic       #435 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    4   10:areturn         
		else
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
	}

	private static void installDefaultInflateDelegates(AppCompatDrawableManager appcompatdrawablemanager)
	{
		if(android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:getstatic       #440 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          36
		{
			appcompatdrawablemanager.addDelegate("vector", ((InflateDelegate) (new VdcInflateDelegate())));
	//    3    8:aload_0         
	//    4    9:ldc2            #442 <String "vector">
	//    5   12:new             #15  <Class AppCompatDrawableManager$VdcInflateDelegate>
	//    6   15:dup             
	//    7   16:invokespecial   #443 <Method void AppCompatDrawableManager$VdcInflateDelegate()>
	//    8   19:invokespecial   #445 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
			appcompatdrawablemanager.addDelegate("animated-vector", ((InflateDelegate) (new AvdcInflateDelegate())));
	//    9   22:aload_0         
	//   10   23:ldc2            #447 <String "animated-vector">
	//   11   26:new             #6   <Class AppCompatDrawableManager$AvdcInflateDelegate>
	//   12   29:dup             
	//   13   30:invokespecial   #448 <Method void AppCompatDrawableManager$AvdcInflateDelegate()>
	//   14   33:invokespecial   #445 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
		}
	//   15   36:return          
	}

	private static boolean isVectorDrawable(Drawable drawable)
	{
		return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(((Object) (((Object) (drawable)).getClass().getName())));
	//    0    0:aload_0         
	//    1    1:instanceof      #450 <Class VectorDrawableCompat>
	//    2    4:ifne            27
	//    3    7:ldc1            #37  <String "android.graphics.drawable.VectorDrawable">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #454 <Method Class Object.getClass()>
	//    6   13:invokevirtual   #460 <Method String Class.getName()>
	//    7   16:invokevirtual   #466 <Method boolean String.equals(Object)>
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
		Resources resources;
		Drawable drawable;
		Drawable drawable1;
		TypedValue typedvalue;
		if(mDelegates == null || mDelegates.isEmpty())
			break MISSING_BLOCK_LABEL_392;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field ArrayMap mDelegates>
	//    2    4:ifnull          392
	//    3    7:aload_0         
	//    4    8:getfield        #188 <Field ArrayMap mDelegates>
	//    5   11:invokevirtual   #472 <Method boolean ArrayMap.isEmpty()>
	//    6   14:ifne            392
		if(mKnownDrawableIdTags != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//*   9   21:ifnull          66
		{
			String s = (String)mKnownDrawableIdTags.get(i);
	//   10   24:aload_0         
	//   11   25:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #427 <Method Object SparseArrayCompat.get(int)>
	//   14   32:checkcast       #462 <Class String>
	//   15   35:astore          6
			if("appcompat_skip_skip".equals(((Object) (s))) || s != null && mDelegates.get(((Object) (s))) == null)
	//*  16   37:ldc1            #40  <String "appcompat_skip_skip">
	//*  17   39:aload           6
	//*  18   41:invokevirtual   #466 <Method boolean String.equals(Object)>
	//*  19   44:ifne            64
	//*  20   47:aload           6
	//*  21   49:ifnull          77
	//*  22   52:aload_0         
	//*  23   53:getfield        #188 <Field ArrayMap mDelegates>
	//*  24   56:aload           6
	//*  25   58:invokevirtual   #475 <Method Object ArrayMap.get(Object)>
	//*  26   61:ifnonnull       77
				return null;
	//   27   64:aconst_null     
	//   28   65:areturn         
		} else
		{
			mKnownDrawableIdTags = new SparseArrayCompat();
	//   29   66:aload_0         
	//   30   67:new             #228 <Class SparseArrayCompat>
	//   31   70:dup             
	//   32   71:invokespecial   #229 <Method void SparseArrayCompat()>
	//   33   74:putfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
		}
		if(mTypedValue == null)
	//*  34   77:aload_0         
	//*  35   78:getfield        #323 <Field TypedValue mTypedValue>
	//*  36   81:ifnonnull       95
			mTypedValue = new TypedValue();
	//   37   84:aload_0         
	//   38   85:new             #309 <Class TypedValue>
	//   39   88:dup             
	//   40   89:invokespecial   #324 <Method void TypedValue()>
	//   41   92:putfield        #323 <Field TypedValue mTypedValue>
		typedvalue = mTypedValue;
	//   42   95:aload_0         
	//   43   96:getfield        #323 <Field TypedValue mTypedValue>
	//   44   99:astore          9
		resources = context.getResources();
	//   45  101:aload_1         
	//   46  102:invokevirtual   #330 <Method Resources Context.getResources()>
	//   47  105:astore          6
		resources.getValue(i, typedvalue, true);
	//   48  107:aload           6
	//   49  109:iload_2         
	//   50  110:aload           9
	//   51  112:iconst_1        
	//   52  113:invokevirtual   #336 <Method void Resources.getValue(int, TypedValue, boolean)>
		l = createCacheKey(typedvalue);
	//   53  116:aload           9
	//   54  118:invokestatic    #338 <Method long createCacheKey(TypedValue)>
	//   55  121:lstore          4
		drawable1 = getCachedDrawable(context, l);
	//   56  123:aload_0         
	//   57  124:aload_1         
	//   58  125:lload           4
	//   59  127:invokespecial   #342 <Method Drawable getCachedDrawable(Context, long)>
	//   60  130:astore          8
		if(drawable1 != null)
	//*  61  132:aload           8
	//*  62  134:ifnull          140
			return drawable1;
	//   63  137:aload           8
	//   64  139:areturn         
		drawable = drawable1;
	//   65  140:aload           8
	//   66  142:astore          7
		if(typedvalue.string == null)
			break MISSING_BLOCK_LABEL_374;
	//   67  144:aload           9
	//   68  146:getfield        #479 <Field CharSequence TypedValue.string>
	//   69  149:ifnull          374
		drawable = drawable1;
	//   70  152:aload           8
	//   71  154:astore          7
		if(!typedvalue.string.toString().endsWith(".xml"))
			break MISSING_BLOCK_LABEL_374;
	//   72  156:aload           9
	//   73  158:getfield        #479 <Field CharSequence TypedValue.string>
	//   74  161:invokeinterface #484 <Method String CharSequence.toString()>
	//   75  166:ldc2            #486 <String ".xml">
	//   76  169:invokevirtual   #490 <Method boolean String.endsWith(String)>
	//   77  172:ifeq            374
		drawable = drawable1;
	//   78  175:aload           8
	//   79  177:astore          7
		android.content.res.XmlResourceParser xmlresourceparser = resources.getXml(i);
	//   80  179:aload           6
	//   81  181:iload_2         
	//   82  182:invokevirtual   #494 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   83  185:astore          10
		drawable = drawable1;
	//   84  187:aload           8
	//   85  189:astore          7
		AttributeSet attributeset = Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser)));
	//   86  191:aload           10
	//   87  193:invokestatic    #500 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   88  196:astore          11
_L1:
		drawable = drawable1;
	//   89  198:aload           8
	//   90  200:astore          7
		int j = ((XmlPullParser) (xmlresourceparser)).next();
	//   91  202:aload           10
	//   92  204:invokeinterface #505 <Method int XmlPullParser.next()>
	//   93  209:istore_3        
		if(j == 2 || j == 1) goto _L2; else goto _L1
	//   94  210:iload_3         
	//   95  211:iconst_2        
	//   96  212:icmpeq          223
	//   97  215:iload_3         
	//   98  216:iconst_1        
	//   99  217:icmpeq          223
	//* 100  220:goto            198
_L2:
		if(j != 2)
	//* 101  223:iload_3         
	//* 102  224:iconst_2        
	//* 103  225:icmpeq          243
		{
			drawable = drawable1;
	//  104  228:aload           8
	//  105  230:astore          7
			Object obj;
			InflateDelegate inflatedelegate;
			try
			{
				throw new XmlPullParserException("No start tag found");
	//  106  232:new             #507 <Class XmlPullParserException>
	//  107  235:dup             
	//  108  236:ldc2            #509 <String "No start tag found">
	//  109  239:invokespecial   #510 <Method void XmlPullParserException(String)>
	//  110  242:athrow          
			}
	//* 111  243:aload           8
	//* 112  245:astore          7
	//* 113  247:aload           10
	//* 114  249:invokeinterface #511 <Method String XmlPullParser.getName()>
	//* 115  254:astore          6
	//* 116  256:aload           8
	//* 117  258:astore          7
	//* 118  260:aload_0         
	//* 119  261:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//* 120  264:iload_2         
	//* 121  265:aload           6
	//* 122  267:invokevirtual   #233 <Method void SparseArrayCompat.append(int, Object)>
	//* 123  270:aload           8
	//* 124  272:astore          7
	//* 125  274:aload_0         
	//* 126  275:getfield        #188 <Field ArrayMap mDelegates>
	//* 127  278:aload           6
	//* 128  280:invokevirtual   #475 <Method Object ArrayMap.get(Object)>
	//* 129  283:checkcast       #12  <Class AppCompatDrawableManager$InflateDelegate>
	//* 130  286:astore          12
	//* 131  288:aload           8
	//* 132  290:astore          6
	//* 133  292:aload           12
	//* 134  294:ifnull          319
	//* 135  297:aload           8
	//* 136  299:astore          7
	//* 137  301:aload           12
	//* 138  303:aload_1         
	//* 139  304:aload           10
	//* 140  306:aload           11
	//* 141  308:aload_1         
	//* 142  309:invokevirtual   #515 <Method android.content.res.Resources$Theme Context.getTheme()>
	//* 143  312:invokeinterface #519 <Method Drawable AppCompatDrawableManager$InflateDelegate.createFromXmlInner(Context, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//* 144  317:astore          6
	//* 145  319:aload           6
	//* 146  321:astore          7
	//* 147  323:aload           6
	//* 148  325:ifnull          374
	//* 149  328:aload           6
	//* 150  330:astore          7
	//* 151  332:aload           6
	//* 152  334:aload           9
	//* 153  336:getfield        #353 <Field int TypedValue.changingConfigurations>
	//* 154  339:invokevirtual   #356 <Method void Drawable.setChangingConfigurations(int)>
	//* 155  342:aload           6
	//* 156  344:astore          7
	//* 157  346:aload_0         
	//* 158  347:aload_1         
	//* 159  348:lload           4
	//* 160  350:aload           6
	//* 161  352:invokespecial   #358 <Method boolean addDrawableToCache(Context, long, Drawable)>
	//* 162  355:pop             
	//* 163  356:aload           6
	//* 164  358:astore          7
	//* 165  360:goto            374
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 166  363:astore_1        
			{
				Log.e("AppCompatDrawableManag", "Exception while inflating drawable", ((Throwable) (context)));
	//  167  364:ldc1            #43  <String "AppCompatDrawableManag">
	//  168  366:ldc2            #521 <String "Exception while inflating drawable">
	//  169  369:aload_1         
	//  170  370:invokestatic    #527 <Method int Log.e(String, String, Throwable)>
	//  171  373:pop             
			}
			break MISSING_BLOCK_LABEL_374;
		}
		drawable = drawable1;
		obj = ((Object) (((XmlPullParser) (xmlresourceparser)).getName()));
		drawable = drawable1;
		mKnownDrawableIdTags.append(i, obj);
		drawable = drawable1;
		inflatedelegate = (InflateDelegate)mDelegates.get(obj);
		obj = ((Object) (drawable1));
		if(inflatedelegate == null)
			break MISSING_BLOCK_LABEL_319;
		drawable = drawable1;
		obj = ((Object) (inflatedelegate.createFromXmlInner(context, ((XmlPullParser) (xmlresourceparser)), attributeset, context.getTheme())));
		drawable = ((Drawable) (obj));
		if(obj == null)
			break MISSING_BLOCK_LABEL_374;
		drawable = ((Drawable) (obj));
		((Drawable) (obj)).setChangingConfigurations(typedvalue.changingConfigurations);
		drawable = ((Drawable) (obj));
		addDrawableToCache(context, l, ((Drawable) (obj)));
		drawable = ((Drawable) (obj));
		if(drawable == null)
	//* 172  374:aload           7
	//* 173  376:ifnonnull       389
			mKnownDrawableIdTags.append(i, "appcompat_skip_skip");
	//  174  379:aload_0         
	//  175  380:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//  176  383:iload_2         
	//  177  384:ldc1            #40  <String "appcompat_skip_skip">
	//  178  386:invokevirtual   #233 <Method void SparseArrayCompat.append(int, Object)>
		return drawable;
	//  179  389:aload           7
	//  180  391:areturn         
		return null;
	//  181  392:aconst_null     
	//  182  393:areturn         
	}

	private void removeDelegate(String s, InflateDelegate inflatedelegate)
	{
		if(mDelegates != null && mDelegates.get(((Object) (s))) == inflatedelegate)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field ArrayMap mDelegates>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #188 <Field ArrayMap mDelegates>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #475 <Method Object ArrayMap.get(Object)>
	//*   7   15:aload_2         
	//*   8   16:if_acmpne       28
			mDelegates.remove(((Object) (s)));
	//    9   19:aload_0         
	//   10   20:getfield        #188 <Field ArrayMap mDelegates>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #531 <Method Object ArrayMap.remove(Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	private static void setPorterDuffColorFilter(Drawable drawable, int i, android.graphics.PorterDuff.Mode mode)
	{
		Drawable drawable1 = drawable;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #538 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*   4    6:ifeq            14
			drawable1 = drawable.mutate();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #542 <Method Drawable Drawable.mutate()>
	//    7   13:astore_3        
		drawable = ((Drawable) (mode));
	//    8   14:aload_2         
	//    9   15:astore_0        
		if(mode == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       24
			drawable = ((Drawable) (DEFAULT_MODE));
	//   12   20:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   13   23:astore_0        
		drawable1.setColorFilter(((android.graphics.ColorFilter) (getPorterDuffColorFilter(i, ((android.graphics.PorterDuff.Mode) (drawable))))));
	//   14   24:aload_3         
	//   15   25:iload_1         
	//   16   26:aload_0         
	//   17   27:invokestatic    #389 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   18   30:invokevirtual   #546 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//   19   33:return          
	}

	private Drawable tintDrawable(Context context, int i, boolean flag, Drawable drawable)
	{
		Object obj = ((Object) (getTintList(context, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #551 <Method ColorStateList getTintList(Context, int)>
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
	//*  10   18:invokestatic    #538 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  11   21:ifeq            30
				context = ((Context) (drawable.mutate()));
	//   12   24:aload           4
	//   13   26:invokevirtual   #542 <Method Drawable Drawable.mutate()>
	//   14   29:astore_1        
			context = ((Context) (DrawableCompat.wrap(((Drawable) (context)))));
	//   15   30:aload_1         
	//   16   31:invokestatic    #557 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   17   34:astore_1        
			DrawableCompat.setTintList(((Drawable) (context)), ((ColorStateList) (obj)));
	//   18   35:aload_1         
	//   19   36:aload           5
	//   20   38:invokestatic    #561 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			drawable = ((Drawable) (getTintMode(i)));
	//   21   41:iload_2         
	//   22   42:invokestatic    #563 <Method android.graphics.PorterDuff$Mode getTintMode(int)>
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
	//   30   58:invokestatic    #567 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
				return ((Drawable) (context));
	//   31   61:aload_1         
	//   32   62:areturn         
			}
		} else
		{
			if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_track_material)
	//*  33   63:iload_2         
	//*  34   64:getstatic       #570 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_track_material>
	//*  35   67:icmpne          143
			{
				obj = ((Object) ((LayerDrawable)drawable));
	//   36   70:aload           4
	//   37   72:checkcast       #347 <Class LayerDrawable>
	//   38   75:astore          5
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   39   77:aload           5
	//   40   79:ldc2            #571 <Int 0x1020000>
	//   41   82:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   42   85:aload_1         
	//   43   86:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   44   89:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   45   92:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   46   95:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   47   98:aload           5
	//   48  100:ldc2            #581 <Int 0x102000f>
	//   49  103:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   50  106:aload_1         
	//   51  107:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   52  110:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   53  113:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   54  116:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   55  119:aload           5
	//   56  121:ldc2            #582 <Int 0x102000d>
	//   57  124:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   58  127:aload_1         
	//   59  128:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   60  131:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   61  134:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   62  137:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				return drawable;
	//   63  140:aload           4
	//   64  142:areturn         
			}
			if(i != android.support.v7.appcompat.R.drawable.abc_ratingbar_material && i != android.support.v7.appcompat.R.drawable.abc_ratingbar_indicator_material && i != android.support.v7.appcompat.R.drawable.abc_ratingbar_small_material)
	//*  65  143:iload_2         
	//*  66  144:getstatic       #585 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_material>
	//*  67  147:icmpeq          191
	//*  68  150:iload_2         
	//*  69  151:getstatic       #588 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_indicator_material>
	//*  70  154:icmpeq          191
	//*  71  157:iload_2         
	//*  72  158:getstatic       #591 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_small_material>
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
	//*  80  175:invokestatic    #595 <Method boolean tintDrawableUsingColorFilter(Context, int, Drawable)>
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
	//   89  193:checkcast       #347 <Class LayerDrawable>
	//   90  196:astore          5
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   91  198:aload           5
	//   92  200:ldc2            #571 <Int 0x1020000>
	//   93  203:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   94  206:aload_1         
	//   95  207:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   96  210:invokestatic    #281 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   97  213:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   98  216:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   99  219:aload           5
	//  100  221:ldc2            #581 <Int 0x102000f>
	//  101  224:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//  102  227:aload_1         
	//  103  228:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//  104  231:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//  105  234:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//  106  237:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//  107  240:aload           5
	//  108  242:ldc2            #582 <Int 0x102000d>
	//  109  245:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//  110  248:aload_1         
	//  111  249:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//  112  252:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//  113  255:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//  114  258:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
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
	//*   1    1:invokestatic    #538 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #542 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpeq       25
		{
			Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
	//    7   15:ldc1            #43  <String "AppCompatDrawableManag">
	//    8   17:ldc2            #598 <String "Mutated drawable is not the same instance as the input.">
	//    9   20:invokestatic    #602 <Method int Log.d(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(!tintinfo.mHasTintList && !tintinfo.mHasTintMode)
	//*  12   25:aload_1         
	//*  13   26:getfield        #607 <Field boolean TintInfo.mHasTintList>
	//*  14   29:ifne            49
	//*  15   32:aload_1         
	//*  16   33:getfield        #610 <Field boolean TintInfo.mHasTintMode>
	//*  17   36:ifeq            42
	//*  18   39:goto            49
		{
			drawable.clearColorFilter();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #613 <Method void Drawable.clearColorFilter()>
		} else
	//*  21   46:goto            95
		{
			ColorStateList colorstatelist;
			if(tintinfo.mHasTintList)
	//*  22   49:aload_1         
	//*  23   50:getfield        #607 <Field boolean TintInfo.mHasTintList>
	//*  24   53:ifeq            64
				colorstatelist = tintinfo.mTintList;
	//   25   56:aload_1         
	//   26   57:getfield        #617 <Field ColorStateList TintInfo.mTintList>
	//   27   60:astore_3        
			else
	//*  28   61:goto            66
				colorstatelist = null;
	//   29   64:aconst_null     
	//   30   65:astore_3        
			if(tintinfo.mHasTintMode)
	//*  31   66:aload_1         
	//*  32   67:getfield        #610 <Field boolean TintInfo.mHasTintMode>
	//*  33   70:ifeq            81
				tintinfo = ((TintInfo) (tintinfo.mTintMode));
	//   34   73:aload_1         
	//   35   74:getfield        #620 <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//   36   77:astore_1        
			else
	//*  37   78:goto            85
				tintinfo = ((TintInfo) (DEFAULT_MODE));
	//   38   81:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   39   84:astore_1        
			drawable.setColorFilter(((android.graphics.ColorFilter) (createTintFilter(colorstatelist, ((android.graphics.PorterDuff.Mode) (tintinfo)), ai))));
	//   40   85:aload_0         
	//   41   86:aload_3         
	//   42   87:aload_1         
	//   43   88:aload_2         
	//   44   89:invokestatic    #622 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode, int[])>
	//   45   92:invokevirtual   #546 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		}
		if(android.os.Build.VERSION.SDK_INT <= 23)
	//*  46   95:getstatic       #440 <Field int android.os.Build$VERSION.SDK_INT>
	//*  47   98:bipush          23
	//*  48  100:icmpgt          107
			drawable.invalidateSelf();
	//   49  103:aload_0         
	//   50  104:invokevirtual   #625 <Method void Drawable.invalidateSelf()>
	//   51  107:return          
	}

	static boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable)
	{
		int j;
		boolean flag1;
		android.graphics.PorterDuff.Mode mode;
		mode = DEFAULT_MODE;
	//    0    0:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//    1    3:astore          6
		flag1 = arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i);
	//    2    5:getstatic       #91  <Field int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL>
	//    3    8:iload_1         
	//    4    9:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//    5   12:istore          5
		j = 0x1010031;
	//    6   14:ldc2            #628 <Int 0x1010031>
	//    7   17:istore_3        
		if(!flag1) goto _L2; else goto _L1
	//    8   18:iload           5
	//    9   20:ifeq            35
_L1:
		i = android.support.v7.appcompat.R.attr.colorControlNormal;
	//   10   23:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   11   26:istore_1        
_L6:
		j = -1;
	//   12   27:iconst_m1       
	//   13   28:istore_3        
_L4:
		boolean flag;
		flag = true;
	//   14   29:iconst_1        
	//   15   30:istore          4
		break MISSING_BLOCK_LABEL_113;
	//   16   32:goto            113
_L2:
		if(arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i))
	//*  17   35:getstatic       #146 <Field int[] COLORFILTER_COLOR_CONTROL_ACTIVATED>
	//*  18   38:iload_1         
	//*  19   39:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  20   42:ifeq            52
		{
			i = android.support.v7.appcompat.R.attr.colorControlActivated;
	//   21   45:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   22   48:istore_1        
			continue; /* Loop/switch isn't completed */
	//   23   49:goto            27
		}
		if(arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i))
	//*  24   52:getstatic       #157 <Field int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY>
	//*  25   55:iload_1         
	//*  26   56:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  27   59:ifeq            72
		{
			mode = android.graphics.PorterDuff.Mode.MULTIPLY;
	//   28   62:getstatic       #435 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   29   65:astore          6
			i = j;
	//   30   67:iload_3         
	//   31   68:istore_1        
			continue; /* Loop/switch isn't completed */
	//   32   69:goto            27
		}
		if(i != android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
			break; /* Loop/switch isn't completed */
	//   33   72:iload_1         
	//   34   73:getstatic       #631 <Field int android.support.v7.appcompat.R$drawable.abc_list_divider_mtrl_alpha>
	//   35   76:icmpne          93
		i = 0x1010030;
	//   36   79:ldc2            #632 <Int 0x1010030>
	//   37   82:istore_1        
		j = Math.round(40.8F);
	//   38   83:ldc2            #633 <Float 40.8F>
	//   39   86:invokestatic    #639 <Method int Math.round(float)>
	//   40   89:istore_3        
		if(true) goto _L4; else goto _L3
	//   41   90:goto            29
_L3:
		if(i != android.support.v7.appcompat.R.drawable.abc_dialog_material_background)
			break; /* Loop/switch isn't completed */
	//   42   93:iload_1         
	//   43   94:getstatic       #642 <Field int android.support.v7.appcompat.R$drawable.abc_dialog_material_background>
	//   44   97:icmpne          105
		i = j;
	//   45  100:iload_3         
	//   46  101:istore_1        
		if(true) goto _L6; else goto _L5
	//   47  102:goto            27
_L5:
		j = -1;
	//   48  105:iconst_m1       
	//   49  106:istore_3        
		flag = false;
	//   50  107:iconst_0        
	//   51  108:istore          4
		i = ((int) (flag));
	//   52  110:iload           4
	//   53  112:istore_1        
		if(flag)
	//*  54  113:iload           4
	//*  55  115:ifeq            162
		{
			Drawable drawable1 = drawable;
	//   56  118:aload_2         
	//   57  119:astore          7
			if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*  58  121:aload_2         
	//*  59  122:invokestatic    #538 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  60  125:ifeq            134
				drawable1 = drawable.mutate();
	//   61  128:aload_2         
	//   62  129:invokevirtual   #542 <Method Drawable Drawable.mutate()>
	//   63  132:astore          7
			drawable1.setColorFilter(((android.graphics.ColorFilter) (getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i), mode))));
	//   64  134:aload           7
	//   65  136:aload_0         
	//   66  137:iload_1         
	//   67  138:invokestatic    #275 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   68  141:aload           6
	//   69  143:invokestatic    #389 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   70  146:invokevirtual   #546 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			if(j != -1)
	//*  71  149:iload_3         
	//*  72  150:iconst_m1       
	//*  73  151:icmpeq          160
				drawable1.setAlpha(j);
	//   74  154:aload           7
	//   75  156:iload_3         
	//   76  157:invokevirtual   #645 <Method void Drawable.setAlpha(int)>
			return true;
	//   77  160:iconst_1        
	//   78  161:ireturn         
		} else
		{
			return false;
	//   79  162:iconst_0        
	//   80  163:ireturn         
		}
	}

	public Drawable getDrawable(Context context, int i)
	{
		return getDrawable(context, i, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #648 <Method Drawable getDrawable(Context, int, boolean)>
	//    5    7:areturn         
	}

	Drawable getDrawable(Context context, int i, boolean flag)
	{
		checkVectorDrawableSetup(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #650 <Method void checkVectorDrawableSetup(Context)>
		Drawable drawable1 = loadDrawableFromDelegates(context, i);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #652 <Method Drawable loadDrawableFromDelegates(Context, int)>
	//    7   11:astore          5
		Drawable drawable = drawable1;
	//    8   13:aload           5
	//    9   15:astore          4
		if(drawable1 == null)
	//*  10   17:aload           5
	//*  11   19:ifnonnull       30
			drawable = createDrawableIfNeeded(context, i);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokespecial   #654 <Method Drawable createDrawableIfNeeded(Context, int)>
	//   16   28:astore          4
		drawable1 = drawable;
	//   17   30:aload           4
	//   18   32:astore          5
		if(drawable == null)
	//*  19   34:aload           4
	//*  20   36:ifnonnull       46
			drawable1 = ContextCompat.getDrawable(context, i);
	//   21   39:aload_1         
	//   22   40:iload_2         
	//   23   41:invokestatic    #657 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   24   44:astore          5
		drawable = drawable1;
	//   25   46:aload           5
	//   26   48:astore          4
		if(drawable1 != null)
	//*  27   50:aload           5
	//*  28   52:ifnull          66
			drawable = tintDrawable(context, i, flag, drawable1);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:iload_3         
	//   33   59:aload           5
	//   34   61:invokespecial   #659 <Method Drawable tintDrawable(Context, int, boolean, Drawable)>
	//   35   64:astore          4
		if(drawable != null)
	//*  36   66:aload           4
	//*  37   68:ifnull          76
			DrawableUtils.fixDrawable(drawable);
	//   38   71:aload           4
	//   39   73:invokestatic    #663 <Method void DrawableUtils.fixDrawable(Drawable)>
		return drawable;
	//   40   76:aload           4
	//   41   78:areturn         
	}

	ColorStateList getTintList(Context context, int i)
	{
		ColorStateList colorstatelist = getTintListFromCache(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #665 <Method ColorStateList getTintListFromCache(Context, int)>
	//    4    6:astore_3        
		ColorStateList colorstatelist1 = colorstatelist;
	//    5    7:aload_3         
	//    6    8:astore          4
		if(colorstatelist == null)
	//*   7   10:aload_3         
	//*   8   11:ifnonnull       237
		{
			if(i == android.support.v7.appcompat.R.drawable.abc_edit_text_material)
	//*   9   14:iload_2         
	//*  10   15:getstatic       #668 <Field int android.support.v7.appcompat.R$drawable.abc_edit_text_material>
	//*  11   18:icmpne          32
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_edittext);
	//   12   21:aload_1         
	//   13   22:getstatic       #673 <Field int android.support.v7.appcompat.R$color.abc_tint_edittext>
	//   14   25:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   15   28:astore_3        
			else
	//*  16   29:goto            220
			if(i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
	//*  17   32:iload_2         
	//*  18   33:getstatic       #681 <Field int android.support.v7.appcompat.R$drawable.abc_switch_track_mtrl_alpha>
	//*  19   36:icmpne          50
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_switch_track);
	//   20   39:aload_1         
	//   21   40:getstatic       #684 <Field int android.support.v7.appcompat.R$color.abc_tint_switch_track>
	//   22   43:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   23   46:astore_3        
			else
	//*  24   47:goto            220
			if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*  25   50:iload_2         
	//*  26   51:getstatic       #432 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*  27   54:icmpne          66
				colorstatelist = createSwitchThumbColorStateList(context);
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:invokespecial   #686 <Method ColorStateList createSwitchThumbColorStateList(Context)>
	//   31   62:astore_3        
			else
	//*  32   63:goto            220
			if(i == android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape)
	//*  33   66:iload_2         
	//*  34   67:getstatic       #689 <Field int android.support.v7.appcompat.R$drawable.abc_btn_default_mtrl_shape>
	//*  35   70:icmpne          82
				colorstatelist = createDefaultButtonColorStateList(context);
	//   36   73:aload_0         
	//   37   74:aload_1         
	//   38   75:invokespecial   #691 <Method ColorStateList createDefaultButtonColorStateList(Context)>
	//   39   78:astore_3        
			else
	//*  40   79:goto            220
			if(i == android.support.v7.appcompat.R.drawable.abc_btn_borderless_material)
	//*  41   82:iload_2         
	//*  42   83:getstatic       #694 <Field int android.support.v7.appcompat.R$drawable.abc_btn_borderless_material>
	//*  43   86:icmpne          98
				colorstatelist = createBorderlessButtonColorStateList(context);
	//   44   89:aload_0         
	//   45   90:aload_1         
	//   46   91:invokespecial   #696 <Method ColorStateList createBorderlessButtonColorStateList(Context)>
	//   47   94:astore_3        
			else
	//*  48   95:goto            220
			if(i == android.support.v7.appcompat.R.drawable.abc_btn_colored_material)
	//*  49   98:iload_2         
	//*  50   99:getstatic       #699 <Field int android.support.v7.appcompat.R$drawable.abc_btn_colored_material>
	//*  51  102:icmpne          114
				colorstatelist = createColoredButtonColorStateList(context);
	//   52  105:aload_0         
	//   53  106:aload_1         
	//   54  107:invokespecial   #701 <Method ColorStateList createColoredButtonColorStateList(Context)>
	//   55  110:astore_3        
			else
	//*  56  111:goto            220
			if(i != android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha && i != android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material)
	//*  57  114:iload_2         
	//*  58  115:getstatic       #704 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_mtrl_am_alpha>
	//*  59  118:icmpeq          212
	//*  60  121:iload_2         
	//*  61  122:getstatic       #707 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_textfield_background_material>
	//*  62  125:icmpne          131
	//*  63  128:goto            212
			{
				if(arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
	//*  64  131:getstatic       #114 <Field int[] TINT_COLOR_CONTROL_NORMAL>
	//*  65  134:iload_2         
	//*  66  135:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  67  138:ifeq            152
					colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorControlNormal);
	//   68  141:aload_1         
	//   69  142:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   70  145:invokestatic    #365 <Method ColorStateList ThemeUtils.getThemeAttrColorStateList(Context, int)>
	//   71  148:astore_3        
				else
	//*  72  149:goto            220
				if(arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
	//*  73  152:getstatic       #165 <Field int[] TINT_COLOR_CONTROL_STATE_LIST>
	//*  74  155:iload_2         
	//*  75  156:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  76  159:ifeq            173
					colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_default);
	//   77  162:aload_1         
	//   78  163:getstatic       #710 <Field int android.support.v7.appcompat.R$color.abc_tint_default>
	//   79  166:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   80  169:astore_3        
				else
	//*  81  170:goto            220
				if(arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
	//*  82  173:getstatic       #173 <Field int[] TINT_CHECKABLE_BUTTON_LIST>
	//*  83  176:iload_2         
	//*  84  177:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  85  180:ifeq            194
					colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_btn_checkable);
	//   86  183:aload_1         
	//   87  184:getstatic       #713 <Field int android.support.v7.appcompat.R$color.abc_tint_btn_checkable>
	//   88  187:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   89  190:astore_3        
				else
	//*  90  191:goto            220
				if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_thumb_material)
	//*  91  194:iload_2         
	//*  92  195:getstatic       #716 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_thumb_material>
	//*  93  198:icmpne          220
					colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_seek_thumb);
	//   94  201:aload_1         
	//   95  202:getstatic       #719 <Field int android.support.v7.appcompat.R$color.abc_tint_seek_thumb>
	//   96  205:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   97  208:astore_3        
			} else
	//*  98  209:goto            220
			{
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_spinner);
	//   99  212:aload_1         
	//  100  213:getstatic       #722 <Field int android.support.v7.appcompat.R$color.abc_tint_spinner>
	//  101  216:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//  102  219:astore_3        
			}
			colorstatelist1 = colorstatelist;
	//  103  220:aload_3         
	//  104  221:astore          4
			if(colorstatelist != null)
	//* 105  223:aload_3         
	//* 106  224:ifnull          237
			{
				addTintListToCache(context, i, colorstatelist);
	//  107  227:aload_0         
	//  108  228:aload_1         
	//  109  229:iload_2         
	//  110  230:aload_3         
	//  111  231:invokespecial   #724 <Method void addTintListToCache(Context, int, ColorStateList)>
				colorstatelist1 = colorstatelist;
	//  112  234:aload_3         
	//  113  235:astore          4
			}
		}
		return colorstatelist1;
	//  114  237:aload           4
	//  115  239:areturn         
	}

	public void onConfigurationChanged(Context context)
	{
		Object obj = mDrawableCacheLock;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Object mDrawableCacheLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		context = ((Context) ((LongSparseArray)mDrawableCaches.get(((Object) (context)))));
	//    5    7:aload_0         
	//    6    8:getfield        #183 <Field WeakHashMap mDrawableCaches>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//    9   15:checkcast       #210 <Class LongSparseArray>
	//   10   18:astore_1        
		if(context == null)
			break MISSING_BLOCK_LABEL_27;
	//   11   19:aload_1         
	//   12   20:ifnull          27
		((LongSparseArray) (context)).clear();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #728 <Method void LongSparseArray.clear()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		context;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw context;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorenabledtintresources, int i)
	{
		Drawable drawable1 = loadDrawableFromDelegates(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #652 <Method Drawable loadDrawableFromDelegates(Context, int)>
	//    4    6:astore          5
		Drawable drawable = drawable1;
	//    5    8:aload           5
	//    6   10:astore          4
		if(drawable1 == null)
	//*   7   12:aload           5
	//*   8   14:ifnonnull       24
			drawable = vectorenabledtintresources.superGetDrawable(i);
	//    9   17:aload_2         
	//   10   18:iload_3         
	//   11   19:invokevirtual   #735 <Method Drawable VectorEnabledTintResources.superGetDrawable(int)>
	//   12   22:astore          4
		if(drawable != null)
	//*  13   24:aload           4
	//*  14   26:ifnull          39
			return tintDrawable(context, i, false, drawable);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:iload_3         
	//   18   32:iconst_0        
	//   19   33:aload           4
	//   20   35:invokespecial   #659 <Method Drawable tintDrawable(Context, int, boolean, Drawable)>
	//   21   38:areturn         
		else
			return null;
	//   22   39:aconst_null     
	//   23   40:areturn         
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
	private final Object mDrawableCacheLock = new Object();
	private final WeakHashMap mDrawableCaches = new WeakHashMap(0);
	private boolean mHasCheckedVectorDrawableSetup;
	private SparseArrayCompat mKnownDrawableIdTags;
	private WeakHashMap mTintLists;
	private TypedValue mTypedValue;

	static 
	{
		DEFAULT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
	//    0    0:getstatic       #69  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    1    3:putstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//    2    6:new             #9   <Class AppCompatDrawableManager$ColorFilterLruCache>
	//    3    9:dup             
	//    4   10:bipush          6
	//    5   12:invokespecial   #75  <Method void AppCompatDrawableManager$ColorFilterLruCache(int)>
	//    6   15:putstatic       #77  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
		COLORFILTER_TINT_COLOR_CONTROL_NORMAL = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_textfield_search_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_default_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha
		});
	//    7   18:iconst_3        
	//    8   19:newarray        int[]
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:getstatic       #83  <Field int android.support.v7.appcompat.R$drawable.abc_textfield_search_default_mtrl_alpha>
	//   12   26:iastore         
	//   13   27:dup             
	//   14   28:iconst_1        
	//   15   29:getstatic       #86  <Field int android.support.v7.appcompat.R$drawable.abc_textfield_default_mtrl_alpha>
	//   16   32:iastore         
	//   17   33:dup             
	//   18   34:iconst_2        
	//   19   35:getstatic       #89  <Field int android.support.v7.appcompat.R$drawable.abc_ab_share_pack_mtrl_alpha>
	//   20   38:iastore         
	//   21   39:putstatic       #91  <Field int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL>
		TINT_COLOR_CONTROL_NORMAL = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_seekbar_tick_mark_material, android.support.v7.appcompat.R.drawable.abc_ic_menu_share_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_cut_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_ic_menu_paste_mtrl_am_alpha
		});
	//   22   42:bipush          7
	//   23   44:newarray        int[]
	//   24   46:dup             
	//   25   47:iconst_0        
	//   26   48:getstatic       #94  <Field int android.support.v7.appcompat.R$drawable.abc_ic_commit_search_api_mtrl_alpha>
	//   27   51:iastore         
	//   28   52:dup             
	//   29   53:iconst_1        
	//   30   54:getstatic       #97  <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_tick_mark_material>
	//   31   57:iastore         
	//   32   58:dup             
	//   33   59:iconst_2        
	//   34   60:getstatic       #100 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_share_mtrl_alpha>
	//   35   63:iastore         
	//   36   64:dup             
	//   37   65:iconst_3        
	//   38   66:getstatic       #103 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_copy_mtrl_am_alpha>
	//   39   69:iastore         
	//   40   70:dup             
	//   41   71:iconst_4        
	//   42   72:getstatic       #106 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_cut_mtrl_alpha>
	//   43   75:iastore         
	//   44   76:dup             
	//   45   77:iconst_5        
	//   46   78:getstatic       #109 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_selectall_mtrl_alpha>
	//   47   81:iastore         
	//   48   82:dup             
	//   49   83:bipush          6
	//   50   85:getstatic       #112 <Field int android.support.v7.appcompat.R$drawable.abc_ic_menu_paste_mtrl_am_alpha>
	//   51   88:iastore         
	//   52   89:putstatic       #114 <Field int[] TINT_COLOR_CONTROL_NORMAL>
		COLORFILTER_COLOR_CONTROL_ACTIVATED = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_textfield_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_textfield_search_activated_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha, android.support.v7.appcompat.R.drawable.abc_text_cursor_material, android.support.v7.appcompat.R.drawable.abc_text_select_handle_left_mtrl_dark, android.support.v7.appcompat.R.drawable.abc_text_select_handle_middle_mtrl_dark, android.support.v7.appcompat.R.drawable.abc_text_select_handle_right_mtrl_dark, android.support.v7.appcompat.R.drawable.abc_text_select_handle_left_mtrl_light, android.support.v7.appcompat.R.drawable.abc_text_select_handle_middle_mtrl_light, android.support.v7.appcompat.R.drawable.abc_text_select_handle_right_mtrl_light
		});
	//   53   92:bipush          10
	//   54   94:newarray        int[]
	//   55   96:dup             
	//   56   97:iconst_0        
	//   57   98:getstatic       #117 <Field int android.support.v7.appcompat.R$drawable.abc_textfield_activated_mtrl_alpha>
	//   58  101:iastore         
	//   59  102:dup             
	//   60  103:iconst_1        
	//   61  104:getstatic       #120 <Field int android.support.v7.appcompat.R$drawable.abc_textfield_search_activated_mtrl_alpha>
	//   62  107:iastore         
	//   63  108:dup             
	//   64  109:iconst_2        
	//   65  110:getstatic       #123 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_top_mtrl_alpha>
	//   66  113:iastore         
	//   67  114:dup             
	//   68  115:iconst_3        
	//   69  116:getstatic       #126 <Field int android.support.v7.appcompat.R$drawable.abc_text_cursor_material>
	//   70  119:iastore         
	//   71  120:dup             
	//   72  121:iconst_4        
	//   73  122:getstatic       #129 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_left_mtrl_dark>
	//   74  125:iastore         
	//   75  126:dup             
	//   76  127:iconst_5        
	//   77  128:getstatic       #132 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_middle_mtrl_dark>
	//   78  131:iastore         
	//   79  132:dup             
	//   80  133:bipush          6
	//   81  135:getstatic       #135 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_right_mtrl_dark>
	//   82  138:iastore         
	//   83  139:dup             
	//   84  140:bipush          7
	//   85  142:getstatic       #138 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_left_mtrl_light>
	//   86  145:iastore         
	//   87  146:dup             
	//   88  147:bipush          8
	//   89  149:getstatic       #141 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_middle_mtrl_light>
	//   90  152:iastore         
	//   91  153:dup             
	//   92  154:bipush          9
	//   93  156:getstatic       #144 <Field int android.support.v7.appcompat.R$drawable.abc_text_select_handle_right_mtrl_light>
	//   94  159:iastore         
	//   95  160:putstatic       #146 <Field int[] COLORFILTER_COLOR_CONTROL_ACTIVATED>
		COLORFILTER_COLOR_BACKGROUND_MULTIPLY = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_popup_background_mtrl_mult, android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg, android.support.v7.appcompat.R.drawable.abc_menu_hardkey_panel_mtrl_mult
		});
	//   96  163:iconst_3        
	//   97  164:newarray        int[]
	//   98  166:dup             
	//   99  167:iconst_0        
	//  100  168:getstatic       #149 <Field int android.support.v7.appcompat.R$drawable.abc_popup_background_mtrl_mult>
	//  101  171:iastore         
	//  102  172:dup             
	//  103  173:iconst_1        
	//  104  174:getstatic       #152 <Field int android.support.v7.appcompat.R$drawable.abc_cab_background_internal_bg>
	//  105  177:iastore         
	//  106  178:dup             
	//  107  179:iconst_2        
	//  108  180:getstatic       #155 <Field int android.support.v7.appcompat.R$drawable.abc_menu_hardkey_panel_mtrl_mult>
	//  109  183:iastore         
	//  110  184:putstatic       #157 <Field int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY>
		TINT_COLOR_CONTROL_STATE_LIST = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_tab_indicator_material, android.support.v7.appcompat.R.drawable.abc_textfield_search_material
		});
	//  111  187:iconst_2        
	//  112  188:newarray        int[]
	//  113  190:dup             
	//  114  191:iconst_0        
	//  115  192:getstatic       #160 <Field int android.support.v7.appcompat.R$drawable.abc_tab_indicator_material>
	//  116  195:iastore         
	//  117  196:dup             
	//  118  197:iconst_1        
	//  119  198:getstatic       #163 <Field int android.support.v7.appcompat.R$drawable.abc_textfield_search_material>
	//  120  201:iastore         
	//  121  202:putstatic       #165 <Field int[] TINT_COLOR_CONTROL_STATE_LIST>
		TINT_CHECKABLE_BUTTON_LIST = (new int[] {
			android.support.v7.appcompat.R.drawable.abc_btn_check_material, android.support.v7.appcompat.R.drawable.abc_btn_radio_material
		});
	//  122  205:iconst_2        
	//  123  206:newarray        int[]
	//  124  208:dup             
	//  125  209:iconst_0        
	//  126  210:getstatic       #168 <Field int android.support.v7.appcompat.R$drawable.abc_btn_check_material>
	//  127  213:iastore         
	//  128  214:dup             
	//  129  215:iconst_1        
	//  130  216:getstatic       #171 <Field int android.support.v7.appcompat.R$drawable.abc_btn_radio_material>
	//  131  219:iastore         
	//  132  220:putstatic       #173 <Field int[] TINT_CHECKABLE_BUTTON_LIST>
	//* 133  223:return          
	}
}
