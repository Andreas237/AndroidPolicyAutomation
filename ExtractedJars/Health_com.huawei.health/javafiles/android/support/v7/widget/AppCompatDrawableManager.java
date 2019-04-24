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
	static class AvdcInflateDelegate
		implements InflateDelegate
	{

		public Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		{
			try
			{
				context = ((Context) (AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlpullparser, attributeset, theme)));
		//    0    0:aload_1         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #31  <Method Resources Context.getResources()>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokestatic    #36  <Method AnimatedVectorDrawableCompat AnimatedVectorDrawableCompat.createFromXmlInner(Context, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		//    7   12:astore_1        
			}
		//*   8   13:aload_1         
		//*   9   14:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*  10   15:astore_1        
			{
				Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", ((Throwable) (context)));
		//   11   16:ldc1            #37  <String "AvdcInflateDelegate">
		//   12   18:ldc1            #39  <String "Exception while inflating <animated-vector>">
		//   13   20:aload_1         
		//   14   21:invokestatic    #45  <Method int Log.e(String, String, Throwable)>
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

	static class ColorFilterLruCache extends LruCache
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

	static interface InflateDelegate
	{

		public abstract Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme);
	}

	static class VdcInflateDelegate
		implements InflateDelegate
	{

		public Drawable createFromXmlInner(Context context, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		{
			try
			{
				context = ((Context) (VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlpullparser, attributeset, theme)));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #29  <Method Resources Context.getResources()>
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:aload           4
		//    5    8:invokestatic    #34  <Method VectorDrawableCompat VectorDrawableCompat.createFromXmlInner(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		//    6   11:astore_1        
			}
		//*   7   12:aload_1         
		//*   8   13:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*   9   14:astore_1        
			{
				Log.e("VdcInflateDelegate", "Exception while inflating <vector>", ((Throwable) (context)));
		//   10   15:ldc1            #35  <String "VdcInflateDelegate">
		//   11   17:ldc1            #37  <String "Exception while inflating <vector>">
		//   12   19:aload_1         
		//   13   20:invokestatic    #43  <Method int Log.e(String, String, Throwable)>
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
			break MISSING_BLOCK_LABEL_92;
	//    3    7:aload           7
	//    4    9:ifnull          92
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
		  goto _L1
	//*  39   81:goto            90
		context;
	//   40   84:astore_1        
	//*  41   85:aload           6
		throw context;
	//   42   87:monitorexit     
	//   43   88:aload_1         
	//   44   89:athrow          
_L1:
		return true;
	//   45   90:iconst_1        
	//   46   91:ireturn         
		return false;
	//   47   92:iconst_0        
	//   48   93:ireturn         
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
		SparseArray sparsearray1 = (SparseArray)mTintLists.get(((Object) (context)));
	//    8   18:aload_0         
	//    9   19:getfield        #225 <Field WeakHashMap mTintLists>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//   12   26:checkcast       #228 <Class SparseArray>
	//   13   29:astore          5
		SparseArray sparsearray = sparsearray1;
	//   14   31:aload           5
	//   15   33:astore          4
		if(sparsearray1 == null)
	//*  16   35:aload           5
	//*  17   37:ifnonnull       60
		{
			sparsearray = new SparseArray();
	//   18   40:new             #228 <Class SparseArray>
	//   19   43:dup             
	//   20   44:invokespecial   #229 <Method void SparseArray()>
	//   21   47:astore          4
			mTintLists.put(((Object) (context)), ((Object) (sparsearray)));
	//   22   49:aload_0         
	//   23   50:getfield        #225 <Field WeakHashMap mTintLists>
	//   24   53:aload_1         
	//   25   54:aload           4
	//   26   56:invokevirtual   #212 <Method Object WeakHashMap.put(Object, Object)>
	//   27   59:pop             
		}
		sparsearray.append(i, ((Object) (colorstatelist)));
	//   28   60:aload           4
	//   29   62:iload_2         
	//   30   63:aload_3         
	//   31   64:invokevirtual   #233 <Method void SparseArray.append(int, Object)>
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
		if(context == null || !isVectorDrawable(((Drawable) (context))))
	//*  12   22:aload_1         
	//*  13   23:ifnull          33
	//*  14   26:aload_1         
	//*  15   27:invokestatic    #250 <Method boolean isVectorDrawable(Drawable)>
	//*  16   30:ifne            48
		{
			mHasCheckedVectorDrawableSetup = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #239 <Field boolean mHasCheckedVectorDrawableSetup>
			throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
	//   20   38:new             #252 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc1            #254 <String "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.">
	//   23   44:invokespecial   #257 <Method void IllegalStateException(String)>
	//   24   47:athrow          
		} else
		{
			return;
	//   25   48:return          
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
		int ai[][] = new int[4][];
	//    0    0:iconst_4        
	//    1    1:anewarray       int[][]
	//    2    4:astore          5
		int ai1[] = new int[4];
	//    3    6:iconst_4        
	//    4    7:newarray        int[]
	//    5    9:astore          6
		int j = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlHighlight);
	//    6   11:aload_1         
	//    7   12:getstatic       #270 <Field int android.support.v7.appcompat.R$attr.colorControlHighlight>
	//    8   15:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    9   18:istore_3        
		int k = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal);
	//   10   19:aload_1         
	//   11   20:getstatic       #279 <Field int android.support.v7.appcompat.R$attr.colorButtonNormal>
	//   12   23:invokestatic    #282 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   13   26:istore          4
		ai[0] = ThemeUtils.DISABLED_STATE_SET;
	//   14   28:aload           5
	//   15   30:iconst_0        
	//   16   31:getstatic       #285 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//   17   34:aastore         
		ai1[0] = k;
	//   18   35:aload           6
	//   19   37:iconst_0        
	//   20   38:iload           4
	//   21   40:iastore         
		k = 0 + 1;
	//   22   41:iconst_0        
	//   23   42:iconst_1        
	//   24   43:iadd            
	//   25   44:istore          4
		ai[k] = ThemeUtils.PRESSED_STATE_SET;
	//   26   46:aload           5
	//   27   48:iload           4
	//   28   50:getstatic       #288 <Field int[] ThemeUtils.PRESSED_STATE_SET>
	//   29   53:aastore         
		ai1[k] = ColorUtils.compositeColors(j, i);
	//   30   54:aload           6
	//   31   56:iload           4
	//   32   58:iload_3         
	//   33   59:iload_2         
	//   34   60:invokestatic    #294 <Method int ColorUtils.compositeColors(int, int)>
	//   35   63:iastore         
		k++;
	//   36   64:iload           4
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore          4
		ai[k] = ThemeUtils.FOCUSED_STATE_SET;
	//   40   70:aload           5
	//   41   72:iload           4
	//   42   74:getstatic       #297 <Field int[] ThemeUtils.FOCUSED_STATE_SET>
	//   43   77:aastore         
		ai1[k] = ColorUtils.compositeColors(j, i);
	//   44   78:aload           6
	//   45   80:iload           4
	//   46   82:iload_3         
	//   47   83:iload_2         
	//   48   84:invokestatic    #294 <Method int ColorUtils.compositeColors(int, int)>
	//   49   87:iastore         
		j = k + 1;
	//   50   88:iload           4
	//   51   90:iconst_1        
	//   52   91:iadd            
	//   53   92:istore_3        
		ai[j] = ThemeUtils.EMPTY_STATE_SET;
	//   54   93:aload           5
	//   55   95:iload_3         
	//   56   96:getstatic       #300 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   57   99:aastore         
		ai1[j] = i;
	//   58  100:aload           6
	//   59  102:iload_3         
	//   60  103:iload_2         
	//   61  104:iastore         
		return new ColorStateList(ai, ai1);
	//   62  105:new             #302 <Class ColorStateList>
	//   63  108:dup             
	//   64  109:aload           5
	//   65  111:aload           6
	//   66  113:invokespecial   #305 <Method void ColorStateList(int[][], int[])>
	//   67  116:areturn         
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
	//    4    6:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//    5    9:invokespecial   #263 <Method ColorStateList createButtonColorStateList(Context, int)>
	//    6   12:areturn         
	}

	private ColorStateList createDefaultButtonColorStateList(Context context)
	{
		return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorButtonNormal));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:getstatic       #279 <Field int android.support.v7.appcompat.R$attr.colorButtonNormal>
	//    4    6:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
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

	private static PorterDuffColorFilter createTintFilter(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int ai[])
	{
		if(colorstatelist == null || mode == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return getPorterDuffColorFilter(colorstatelist.getColorForState(ai, 0), mode);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #364 <Method int ColorStateList.getColorForState(int[], int)>
	//   10   16:aload_1         
	//   11   17:invokestatic    #368 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   12   20:areturn         
	}

	public static AppCompatDrawableManager get()
	{
		if(INSTANCE == null)
	//*   0    0:getstatic       #371 <Field AppCompatDrawableManager INSTANCE>
	//*   1    3:ifnonnull       22
		{
			INSTANCE = new AppCompatDrawableManager();
	//    2    6:new             #2   <Class AppCompatDrawableManager>
	//    3    9:dup             
	//    4   10:invokespecial   #372 <Method void AppCompatDrawableManager()>
	//    5   13:putstatic       #371 <Field AppCompatDrawableManager INSTANCE>
			installDefaultInflateDelegates(INSTANCE);
	//    6   16:getstatic       #371 <Field AppCompatDrawableManager INSTANCE>
	//    7   19:invokestatic    #376 <Method void installDefaultInflateDelegates(AppCompatDrawableManager)>
		}
		return INSTANCE;
	//    8   22:getstatic       #371 <Field AppCompatDrawableManager INSTANCE>
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
	//   19   35:invokevirtual   #379 <Method Object LongSparseArray.get(long)>
	//   20   38:checkcast       #214 <Class WeakReference>
	//   21   41:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_84;
	//   22   43:aload           6
	//   23   45:ifnull          84
		obj1 = ((Object) ((android.graphics.drawable.Drawable.ConstantState)((WeakReference) (obj1)).get()));
	//   24   48:aload           6
	//   25   50:invokevirtual   #382 <Method Object WeakReference.get()>
	//   26   53:checkcast       #384 <Class android.graphics.drawable.Drawable$ConstantState>
	//   27   56:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_78;
	//   28   58:aload           6
	//   29   60:ifnull          78
		context = ((Context) (((android.graphics.drawable.Drawable.ConstantState) (obj1)).newDrawable(context.getResources())));
	//   30   63:aload           6
	//   31   65:aload_1         
	//   32   66:invokevirtual   #330 <Method Resources Context.getResources()>
	//   33   69:invokevirtual   #388 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
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
	//   41   81:invokevirtual   #392 <Method void LongSparseArray.delete(long)>
		obj;
	//   42   84:aload           4
		JVM INSTR monitorexit ;
	//   43   86:monitorexit     
		  goto _L1
	//*  44   87:goto            96
		context;
	//   45   90:astore_1        
	//*  46   91:aload           4
		throw context;
	//   47   93:monitorexit     
	//   48   94:aload_1         
	//   49   95:athrow          
_L1:
		return null;
	//   50   96:aconst_null     
	//   51   97:areturn         
	}

	public static PorterDuffColorFilter getPorterDuffColorFilter(int i, android.graphics.PorterDuff.Mode mode)
	{
		PorterDuffColorFilter porterduffcolorfilter1 = COLOR_FILTER_CACHE.get(i, mode);
	//    0    0:getstatic       #77  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
	//    1    3:iload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #394 <Method PorterDuffColorFilter AppCompatDrawableManager$ColorFilterLruCache.get(int, android.graphics.PorterDuff$Mode)>
	//    4    8:astore_3        
		PorterDuffColorFilter porterduffcolorfilter = porterduffcolorfilter1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(porterduffcolorfilter1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       35
		{
			porterduffcolorfilter = new PorterDuffColorFilter(i, mode);
	//    9   15:new             #396 <Class PorterDuffColorFilter>
	//   10   18:dup             
	//   11   19:iload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #399 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   14   24:astore_2        
			COLOR_FILTER_CACHE.put(i, mode, porterduffcolorfilter);
	//   15   25:getstatic       #77  <Field AppCompatDrawableManager$ColorFilterLruCache COLOR_FILTER_CACHE>
	//   16   28:iload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:invokevirtual   #402 <Method PorterDuffColorFilter AppCompatDrawableManager$ColorFilterLruCache.put(int, android.graphics.PorterDuff$Mode, PorterDuffColorFilter)>
	//   20   34:pop             
		}
		return porterduffcolorfilter;
	//   21   35:aload_2         
	//   22   36:areturn         
	}

	private ColorStateList getTintListFromCache(Context context, int i)
	{
		if(mTintLists != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field WeakHashMap mTintLists>
	//*   2    4:ifnull          34
		{
			context = ((Context) ((SparseArray)mTintLists.get(((Object) (context)))));
	//    3    7:aload_0         
	//    4    8:getfield        #225 <Field WeakHashMap mTintLists>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//    7   15:checkcast       #228 <Class SparseArray>
	//    8   18:astore_1        
			if(context != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          32
				return (ColorStateList)((SparseArray) (context)).get(i);
	//   11   23:aload_1         
	//   12   24:iload_2         
	//   13   25:invokevirtual   #406 <Method Object SparseArray.get(int)>
	//   14   28:checkcast       #302 <Class ColorStateList>
	//   15   31:areturn         
			else
				return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		} else
		{
			return null;
	//   18   34:aconst_null     
	//   19   35:areturn         
		}
	}

	static android.graphics.PorterDuff.Mode getTintMode(int i)
	{
		android.graphics.PorterDuff.Mode mode = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*   2    2:iload_0         
	//*   3    3:getstatic       #411 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*   4    6:icmpne          13
			mode = android.graphics.PorterDuff.Mode.MULTIPLY;
	//    5    9:getstatic       #414 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    6   12:astore_1        
		return mode;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	private static void installDefaultInflateDelegates(AppCompatDrawableManager appcompatdrawablemanager)
	{
		if(android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:getstatic       #419 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          44
		{
			appcompatdrawablemanager.addDelegate("vector", ((InflateDelegate) (new VdcInflateDelegate())));
	//    3    8:aload_0         
	//    4    9:ldc2            #421 <String "vector">
	//    5   12:new             #15  <Class AppCompatDrawableManager$VdcInflateDelegate>
	//    6   15:dup             
	//    7   16:invokespecial   #422 <Method void AppCompatDrawableManager$VdcInflateDelegate()>
	//    8   19:invokespecial   #424 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   9   22:getstatic       #419 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   25:bipush          11
	//*  11   27:icmplt          44
				appcompatdrawablemanager.addDelegate("animated-vector", ((InflateDelegate) (new AvdcInflateDelegate())));
	//   12   30:aload_0         
	//   13   31:ldc2            #426 <String "animated-vector">
	//   14   34:new             #6   <Class AppCompatDrawableManager$AvdcInflateDelegate>
	//   15   37:dup             
	//   16   38:invokespecial   #427 <Method void AppCompatDrawableManager$AvdcInflateDelegate()>
	//   17   41:invokespecial   #424 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
		}
	//   18   44:return          
	}

	private static boolean isVectorDrawable(Drawable drawable)
	{
		return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(((Object) (((Object) (drawable)).getClass().getName())));
	//    0    0:aload_0         
	//    1    1:instanceof      #429 <Class VectorDrawableCompat>
	//    2    4:ifne            22
	//    3    7:ldc1            #37  <String "android.graphics.drawable.VectorDrawable">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #433 <Method Class Object.getClass()>
	//    6   13:invokevirtual   #439 <Method String Class.getName()>
	//    7   16:invokevirtual   #445 <Method boolean String.equals(Object)>
	//    8   19:ifeq            24
	//    9   22:iconst_1        
	//   10   23:ireturn         
	//   11   24:iconst_0        
	//   12   25:ireturn         
	}

	private Drawable loadDrawableFromDelegates(Context context, int i)
	{
		long l;
		Object obj;
		Object obj1;
		Drawable drawable;
		TypedValue typedvalue;
		Object obj2;
		if(mDelegates == null || mDelegates.isEmpty())
			break MISSING_BLOCK_LABEL_391;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field ArrayMap mDelegates>
	//    2    4:ifnull          391
	//    3    7:aload_0         
	//    4    8:getfield        #188 <Field ArrayMap mDelegates>
	//    5   11:invokevirtual   #452 <Method boolean ArrayMap.isEmpty()>
	//    6   14:ifne            391
		if(mKnownDrawableIdTags != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #454 <Field SparseArray mKnownDrawableIdTags>
	//*   9   21:ifnull          69
		{
			String s = (String)mKnownDrawableIdTags.get(i);
	//   10   24:aload_0         
	//   11   25:getfield        #454 <Field SparseArray mKnownDrawableIdTags>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #406 <Method Object SparseArray.get(int)>
	//   14   32:checkcast       #441 <Class String>
	//   15   35:astore          6
			if("appcompat_skip_skip".equals(((Object) (s))) || s != null && mDelegates.get(((Object) (s))) == null)
	//*  16   37:ldc1            #40  <String "appcompat_skip_skip">
	//*  17   39:aload           6
	//*  18   41:invokevirtual   #445 <Method boolean String.equals(Object)>
	//*  19   44:ifne            64
	//*  20   47:aload           6
	//*  21   49:ifnull          66
	//*  22   52:aload_0         
	//*  23   53:getfield        #188 <Field ArrayMap mDelegates>
	//*  24   56:aload           6
	//*  25   58:invokevirtual   #455 <Method Object ArrayMap.get(Object)>
	//*  26   61:ifnonnull       66
				return null;
	//   27   64:aconst_null     
	//   28   65:areturn         
		} else
	//*  29   66:goto            80
		{
			mKnownDrawableIdTags = new SparseArray();
	//   30   69:aload_0         
	//   31   70:new             #228 <Class SparseArray>
	//   32   73:dup             
	//   33   74:invokespecial   #229 <Method void SparseArray()>
	//   34   77:putfield        #454 <Field SparseArray mKnownDrawableIdTags>
		}
		if(mTypedValue == null)
	//*  35   80:aload_0         
	//*  36   81:getfield        #323 <Field TypedValue mTypedValue>
	//*  37   84:ifnonnull       98
			mTypedValue = new TypedValue();
	//   38   87:aload_0         
	//   39   88:new             #309 <Class TypedValue>
	//   40   91:dup             
	//   41   92:invokespecial   #324 <Method void TypedValue()>
	//   42   95:putfield        #323 <Field TypedValue mTypedValue>
		typedvalue = mTypedValue;
	//   43   98:aload_0         
	//   44   99:getfield        #323 <Field TypedValue mTypedValue>
	//   45  102:astore          9
		obj2 = ((Object) (context.getResources()));
	//   46  104:aload_1         
	//   47  105:invokevirtual   #330 <Method Resources Context.getResources()>
	//   48  108:astore          10
		((Resources) (obj2)).getValue(i, typedvalue, true);
	//   49  110:aload           10
	//   50  112:iload_2         
	//   51  113:aload           9
	//   52  115:iconst_1        
	//   53  116:invokevirtual   #336 <Method void Resources.getValue(int, TypedValue, boolean)>
		l = createCacheKey(typedvalue);
	//   54  119:aload           9
	//   55  121:invokestatic    #338 <Method long createCacheKey(TypedValue)>
	//   56  124:lstore          4
		drawable = getCachedDrawable(context, l);
	//   57  126:aload_0         
	//   58  127:aload_1         
	//   59  128:lload           4
	//   60  130:invokespecial   #342 <Method Drawable getCachedDrawable(Context, long)>
	//   61  133:astore          8
		if(drawable != null)
	//*  62  135:aload           8
	//*  63  137:ifnull          143
			return drawable;
	//   64  140:aload           8
	//   65  142:areturn         
		obj = ((Object) (drawable));
	//   66  143:aload           8
	//   67  145:astore          6
		if(typedvalue.string == null)
			break MISSING_BLOCK_LABEL_373;
	//   68  147:aload           9
	//   69  149:getfield        #459 <Field CharSequence TypedValue.string>
	//   70  152:ifnull          373
		obj = ((Object) (drawable));
	//   71  155:aload           8
	//   72  157:astore          6
		if(!typedvalue.string.toString().endsWith(".xml"))
			break MISSING_BLOCK_LABEL_373;
	//   73  159:aload           9
	//   74  161:getfield        #459 <Field CharSequence TypedValue.string>
	//   75  164:invokeinterface #464 <Method String CharSequence.toString()>
	//   76  169:ldc2            #466 <String ".xml">
	//   77  172:invokevirtual   #470 <Method boolean String.endsWith(String)>
	//   78  175:ifeq            373
		obj1 = ((Object) (drawable));
	//   79  178:aload           8
	//   80  180:astore          7
		obj2 = ((Object) (((Resources) (obj2)).getXml(i)));
	//   81  182:aload           10
	//   82  184:iload_2         
	//   83  185:invokevirtual   #474 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   84  188:astore          10
		obj1 = ((Object) (drawable));
	//   85  190:aload           8
	//   86  192:astore          7
		AttributeSet attributeset = Xml.asAttributeSet(((XmlPullParser) (obj2)));
	//   87  194:aload           10
	//   88  196:invokestatic    #480 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   89  199:astore          11
_L1:
		obj1 = ((Object) (drawable));
	//   90  201:aload           8
	//   91  203:astore          7
		int j = ((XmlPullParser) (obj2)).next();
	//   92  205:aload           10
	//   93  207:invokeinterface #486 <Method int XmlPullParser.next()>
	//   94  212:istore_3        
		if(j == 2 || j == 1) goto _L2; else goto _L1
	//   95  213:iload_3         
	//   96  214:iconst_2        
	//   97  215:icmpeq          226
	//   98  218:iload_3         
	//   99  219:iconst_1        
	//  100  220:icmpeq          226
	//* 101  223:goto            201
_L2:
		if(j != 2)
	//* 102  226:iload_3         
	//* 103  227:iconst_2        
	//* 104  228:icmpeq          246
		{
			obj1 = ((Object) (drawable));
	//  105  231:aload           8
	//  106  233:astore          7
			InflateDelegate inflatedelegate;
			try
			{
				throw new XmlPullParserException("No start tag found");
	//  107  235:new             #488 <Class XmlPullParserException>
	//  108  238:dup             
	//  109  239:ldc2            #490 <String "No start tag found">
	//  110  242:invokespecial   #491 <Method void XmlPullParserException(String)>
	//  111  245:athrow          
			}
	//* 112  246:aload           8
	//* 113  248:astore          7
	//* 114  250:aload           10
	//* 115  252:invokeinterface #492 <Method String XmlPullParser.getName()>
	//* 116  257:astore          6
	//* 117  259:aload           8
	//* 118  261:astore          7
	//* 119  263:aload_0         
	//* 120  264:getfield        #454 <Field SparseArray mKnownDrawableIdTags>
	//* 121  267:iload_2         
	//* 122  268:aload           6
	//* 123  270:invokevirtual   #233 <Method void SparseArray.append(int, Object)>
	//* 124  273:aload           8
	//* 125  275:astore          7
	//* 126  277:aload_0         
	//* 127  278:getfield        #188 <Field ArrayMap mDelegates>
	//* 128  281:aload           6
	//* 129  283:invokevirtual   #455 <Method Object ArrayMap.get(Object)>
	//* 130  286:checkcast       #12  <Class AppCompatDrawableManager$InflateDelegate>
	//* 131  289:astore          12
	//* 132  291:aload           8
	//* 133  293:astore          6
	//* 134  295:aload           12
	//* 135  297:ifnull          322
	//* 136  300:aload           8
	//* 137  302:astore          7
	//* 138  304:aload           12
	//* 139  306:aload_1         
	//* 140  307:aload           10
	//* 141  309:aload           11
	//* 142  311:aload_1         
	//* 143  312:invokevirtual   #496 <Method android.content.res.Resources$Theme Context.getTheme()>
	//* 144  315:invokeinterface #500 <Method Drawable AppCompatDrawableManager$InflateDelegate.createFromXmlInner(Context, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//* 145  320:astore          6
	//* 146  322:aload           6
	//* 147  324:ifnull          355
	//* 148  327:aload           6
	//* 149  329:astore          7
	//* 150  331:aload           6
	//* 151  333:aload           9
	//* 152  335:getfield        #353 <Field int TypedValue.changingConfigurations>
	//* 153  338:invokevirtual   #356 <Method void Drawable.setChangingConfigurations(int)>
	//* 154  341:aload           6
	//* 155  343:astore          7
	//* 156  345:aload_0         
	//* 157  346:aload_1         
	//* 158  347:lload           4
	//* 159  349:aload           6
	//* 160  351:invokespecial   #358 <Method boolean addDrawableToCache(Context, long, Drawable)>
	//* 161  354:pop             
	//* 162  355:goto            373
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 163  358:astore_1        
			{
				Log.e("AppCompatDrawableManager", "Exception while inflating drawable", ((Throwable) (context)));
	//  164  359:ldc1            #43  <String "AppCompatDrawableManager">
	//  165  361:ldc2            #502 <String "Exception while inflating drawable">
	//  166  364:aload_1         
	//  167  365:invokestatic    #508 <Method int Log.e(String, String, Throwable)>
	//  168  368:pop             
			}
			break MISSING_BLOCK_LABEL_369;
		}
		obj1 = ((Object) (drawable));
		obj = ((Object) (((XmlPullParser) (obj2)).getName()));
		obj1 = ((Object) (drawable));
		mKnownDrawableIdTags.append(i, obj);
		obj1 = ((Object) (drawable));
		inflatedelegate = (InflateDelegate)mDelegates.get(obj);
		obj = ((Object) (drawable));
		if(inflatedelegate == null)
			break MISSING_BLOCK_LABEL_322;
		obj1 = ((Object) (drawable));
		obj = ((Object) (inflatedelegate.createFromXmlInner(context, ((XmlPullParser) (obj2)), attributeset, context.getTheme())));
		if(obj == null)
			break MISSING_BLOCK_LABEL_373;
		obj1 = obj;
		((Drawable) (obj)).setChangingConfigurations(typedvalue.changingConfigurations);
		obj1 = obj;
		addDrawableToCache(context, l, ((Drawable) (obj)));
		break MISSING_BLOCK_LABEL_373;
		obj = obj1;
	//  169  369:aload           7
	//  170  371:astore          6
		if(obj == null)
	//* 171  373:aload           6
	//* 172  375:ifnonnull       388
			mKnownDrawableIdTags.append(i, "appcompat_skip_skip");
	//  173  378:aload_0         
	//  174  379:getfield        #454 <Field SparseArray mKnownDrawableIdTags>
	//  175  382:iload_2         
	//  176  383:ldc1            #40  <String "appcompat_skip_skip">
	//  177  385:invokevirtual   #233 <Method void SparseArray.append(int, Object)>
		return ((Drawable) (obj));
	//  178  388:aload           6
	//  179  390:areturn         
		return null;
	//  180  391:aconst_null     
	//  181  392:areturn         
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
	//*   6   12:invokevirtual   #455 <Method Object ArrayMap.get(Object)>
	//*   7   15:aload_2         
	//*   8   16:if_acmpne       28
			mDelegates.remove(((Object) (s)));
	//    9   19:aload_0         
	//   10   20:getfield        #188 <Field ArrayMap mDelegates>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #512 <Method Object ArrayMap.remove(Object)>
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
	//*   3    3:invokestatic    #519 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*   4    6:ifeq            14
			drawable1 = drawable.mutate();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #523 <Method Drawable Drawable.mutate()>
	//    7   13:astore_3        
		if(mode == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       25
			mode = DEFAULT_MODE;
	//   10   18:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   11   21:astore_2        
	//*  12   22:goto            25
		drawable1.setColorFilter(((android.graphics.ColorFilter) (getPorterDuffColorFilter(i, mode))));
	//   13   25:aload_3         
	//   14   26:iload_1         
	//   15   27:aload_2         
	//   16   28:invokestatic    #368 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   17   31:invokevirtual   #527 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//   18   34:return          
	}

	private Drawable tintDrawable(Context context, int i, boolean flag, Drawable drawable)
	{
		Object obj = ((Object) (getTintList(context, i)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #532 <Method ColorStateList getTintList(Context, int)>
	//    4    6:astore          5
		if(obj != null)
	//*   5    8:aload           5
	//*   6   10:ifnull          60
		{
			context = ((Context) (drawable));
	//    7   13:aload           4
	//    8   15:astore_1        
			if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*   9   16:aload           4
	//*  10   18:invokestatic    #519 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  11   21:ifeq            30
				context = ((Context) (drawable.mutate()));
	//   12   24:aload           4
	//   13   26:invokevirtual   #523 <Method Drawable Drawable.mutate()>
	//   14   29:astore_1        
			context = ((Context) (DrawableCompat.wrap(((Drawable) (context)))));
	//   15   30:aload_1         
	//   16   31:invokestatic    #538 <Method Drawable DrawableCompat.wrap(Drawable)>
	//   17   34:astore_1        
			DrawableCompat.setTintList(((Drawable) (context)), ((ColorStateList) (obj)));
	//   18   35:aload_1         
	//   19   36:aload           5
	//   20   38:invokestatic    #542 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			drawable = ((Drawable) (getTintMode(i)));
	//   21   41:iload_2         
	//   22   42:invokestatic    #544 <Method android.graphics.PorterDuff$Mode getTintMode(int)>
	//   23   45:astore          4
			if(drawable != null)
	//*  24   47:aload           4
	//*  25   49:ifnull          58
				DrawableCompat.setTintMode(((Drawable) (context)), ((android.graphics.PorterDuff.Mode) (drawable)));
	//   26   52:aload_1         
	//   27   53:aload           4
	//   28   55:invokestatic    #548 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			return ((Drawable) (context));
	//   29   58:aload_1         
	//   30   59:areturn         
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_track_material)
	//*  31   60:iload_2         
	//*  32   61:getstatic       #551 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_track_material>
	//*  33   64:icmpne          140
		{
			obj = ((Object) ((LayerDrawable)drawable));
	//   34   67:aload           4
	//   35   69:checkcast       #347 <Class LayerDrawable>
	//   36   72:astore          5
			setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   37   74:aload           5
	//   38   76:ldc2            #552 <Int 0x1020000>
	//   39   79:invokevirtual   #556 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   40   82:aload_1         
	//   41   83:getstatic       #559 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   42   86:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   43   89:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   44   92:invokestatic    #561 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
			setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   45   95:aload           5
	//   46   97:ldc2            #562 <Int 0x102000f>
	//   47  100:invokevirtual   #556 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   48  103:aload_1         
	//   49  104:getstatic       #559 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   50  107:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   51  110:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   52  113:invokestatic    #561 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
			setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   53  116:aload           5
	//   54  118:ldc2            #563 <Int 0x102000d>
	//   55  121:invokevirtual   #556 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   56  124:aload_1         
	//   57  125:getstatic       #566 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   58  128:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   59  131:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   60  134:invokestatic    #561 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
			return drawable;
	//   61  137:aload           4
	//   62  139:areturn         
		}
		if(i == android.support.v7.appcompat.R.drawable.abc_ratingbar_material || i == android.support.v7.appcompat.R.drawable.abc_ratingbar_indicator_material || i == android.support.v7.appcompat.R.drawable.abc_ratingbar_small_material)
	//*  63  140:iload_2         
	//*  64  141:getstatic       #569 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_material>
	//*  65  144:icmpeq          161
	//*  66  147:iload_2         
	//*  67  148:getstatic       #572 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_indicator_material>
	//*  68  151:icmpeq          161
	//*  69  154:iload_2         
	//*  70  155:getstatic       #575 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_small_material>
	//*  71  158:icmpne          234
		{
			obj = ((Object) ((LayerDrawable)drawable));
	//   72  161:aload           4
	//   73  163:checkcast       #347 <Class LayerDrawable>
	//   74  166:astore          5
			setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   75  168:aload           5
	//   76  170:ldc2            #552 <Int 0x1020000>
	//   77  173:invokevirtual   #556 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   78  176:aload_1         
	//   79  177:getstatic       #559 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   80  180:invokestatic    #282 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   81  183:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   82  186:invokestatic    #561 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
			setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   83  189:aload           5
	//   84  191:ldc2            #562 <Int 0x102000f>
	//   85  194:invokevirtual   #556 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   86  197:aload_1         
	//   87  198:getstatic       #566 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   88  201:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   89  204:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   90  207:invokestatic    #561 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
			setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   91  210:aload           5
	//   92  212:ldc2            #563 <Int 0x102000d>
	//   93  215:invokevirtual   #556 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   94  218:aload_1         
	//   95  219:getstatic       #566 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   96  222:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   97  225:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   98  228:invokestatic    #561 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
			return drawable;
	//   99  231:aload           4
	//  100  233:areturn         
		}
		obj = ((Object) (drawable));
	//  101  234:aload           4
	//  102  236:astore          5
		if(!tintDrawableUsingColorFilter(context, i, drawable))
	//* 103  238:aload_1         
	//* 104  239:iload_2         
	//* 105  240:aload           4
	//* 106  242:invokestatic    #579 <Method boolean tintDrawableUsingColorFilter(Context, int, Drawable)>
	//* 107  245:ifne            259
		{
			obj = ((Object) (drawable));
	//  108  248:aload           4
	//  109  250:astore          5
			if(flag)
	//* 110  252:iload_3         
	//* 111  253:ifeq            259
				obj = null;
	//  112  256:aconst_null     
	//  113  257:astore          5
		}
		return ((Drawable) (obj));
	//  114  259:aload           5
	//  115  261:areturn         
	}

	static void tintDrawable(Drawable drawable, TintInfo tintinfo, int ai[])
	{
		if(DrawableUtils.canSafelyMutateDrawable(drawable) && drawable.mutate() != drawable)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #519 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #523 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpeq       25
		{
			Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
	//    7   15:ldc1            #43  <String "AppCompatDrawableManager">
	//    8   17:ldc2            #582 <String "Mutated drawable is not the same instance as the input.">
	//    9   20:invokestatic    #586 <Method int Log.d(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(tintinfo.mHasTintList || tintinfo.mHasTintMode)
	//*  12   25:aload_1         
	//*  13   26:getfield        #591 <Field boolean TintInfo.mHasTintList>
	//*  14   29:ifne            39
	//*  15   32:aload_1         
	//*  16   33:getfield        #594 <Field boolean TintInfo.mHasTintMode>
	//*  17   36:ifeq            88
		{
			ColorStateList colorstatelist;
			if(tintinfo.mHasTintList)
	//*  18   39:aload_1         
	//*  19   40:getfield        #591 <Field boolean TintInfo.mHasTintList>
	//*  20   43:ifeq            54
				colorstatelist = tintinfo.mTintList;
	//   21   46:aload_1         
	//   22   47:getfield        #598 <Field ColorStateList TintInfo.mTintList>
	//   23   50:astore_3        
			else
	//*  24   51:goto            56
				colorstatelist = null;
	//   25   54:aconst_null     
	//   26   55:astore_3        
			if(tintinfo.mHasTintMode)
	//*  27   56:aload_1         
	//*  28   57:getfield        #594 <Field boolean TintInfo.mHasTintMode>
	//*  29   60:ifeq            71
				tintinfo = ((TintInfo) (tintinfo.mTintMode));
	//   30   63:aload_1         
	//   31   64:getfield        #601 <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//   32   67:astore_1        
			else
	//*  33   68:goto            75
				tintinfo = ((TintInfo) (DEFAULT_MODE));
	//   34   71:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   35   74:astore_1        
			drawable.setColorFilter(((android.graphics.ColorFilter) (createTintFilter(colorstatelist, ((android.graphics.PorterDuff.Mode) (tintinfo)), ai))));
	//   36   75:aload_0         
	//   37   76:aload_3         
	//   38   77:aload_1         
	//   39   78:aload_2         
	//   40   79:invokestatic    #603 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode, int[])>
	//   41   82:invokevirtual   #527 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
		} else
	//*  42   85:goto            92
		{
			drawable.clearColorFilter();
	//   43   88:aload_0         
	//   44   89:invokevirtual   #606 <Method void Drawable.clearColorFilter()>
		}
		if(android.os.Build.VERSION.SDK_INT <= 23)
	//*  45   92:getstatic       #419 <Field int android.os.Build$VERSION.SDK_INT>
	//*  46   95:bipush          23
	//*  47   97:icmpgt          104
			drawable.invalidateSelf();
	//   48  100:aload_0         
	//   49  101:invokevirtual   #609 <Method void Drawable.invalidateSelf()>
	//   50  104:return          
	}

	static boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable)
	{
		android.graphics.PorterDuff.Mode mode1 = DEFAULT_MODE;
	//    0    0:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//    1    3:astore          8
		boolean flag = false;
	//    2    5:iconst_0        
	//    3    6:istore_3        
		int j = 0;
	//    4    7:iconst_0        
	//    5    8:istore          4
		byte byte0 = -1;
	//    6   10:iconst_m1       
	//    7   11:istore          6
		int k;
		android.graphics.PorterDuff.Mode mode;
		if(arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i))
	//*   8   13:getstatic       #91  <Field int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL>
	//*   9   16:iload_1         
	//*  10   17:invokestatic    #611 <Method boolean arrayContains(int[], int)>
	//*  11   20:ifeq            41
		{
			j = android.support.v7.appcompat.R.attr.colorControlNormal;
	//   12   23:getstatic       #559 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   13   26:istore          4
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_3        
			mode = mode1;
	//   16   30:aload           8
	//   17   32:astore          7
			k = ((int) (byte0));
	//   18   34:iload           6
	//   19   36:istore          5
		} else
	//*  20   38:goto            157
		if(arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i))
	//*  21   41:getstatic       #146 <Field int[] COLORFILTER_COLOR_CONTROL_ACTIVATED>
	//*  22   44:iload_1         
	//*  23   45:invokestatic    #611 <Method boolean arrayContains(int[], int)>
	//*  24   48:ifeq            69
		{
			j = android.support.v7.appcompat.R.attr.colorControlActivated;
	//   25   51:getstatic       #566 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   26   54:istore          4
			flag = true;
	//   27   56:iconst_1        
	//   28   57:istore_3        
			mode = mode1;
	//   29   58:aload           8
	//   30   60:astore          7
			k = ((int) (byte0));
	//   31   62:iload           6
	//   32   64:istore          5
		} else
	//*  33   66:goto            157
		if(arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i))
	//*  34   69:getstatic       #157 <Field int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY>
	//*  35   72:iload_1         
	//*  36   73:invokestatic    #611 <Method boolean arrayContains(int[], int)>
	//*  37   76:ifeq            98
		{
			j = 0x1010031;
	//   38   79:ldc2            #612 <Int 0x1010031>
	//   39   82:istore          4
			flag = true;
	//   40   84:iconst_1        
	//   41   85:istore_3        
			mode = android.graphics.PorterDuff.Mode.MULTIPLY;
	//   42   86:getstatic       #414 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   43   89:astore          7
			k = ((int) (byte0));
	//   44   91:iload           6
	//   45   93:istore          5
		} else
	//*  46   95:goto            157
		if(i == android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
	//*  47   98:iload_1         
	//*  48   99:getstatic       #615 <Field int android.support.v7.appcompat.R$drawable.abc_list_divider_mtrl_alpha>
	//*  49  102:icmpne          127
		{
			j = 0x1010030;
	//   50  105:ldc2            #616 <Int 0x1010030>
	//   51  108:istore          4
			flag = true;
	//   52  110:iconst_1        
	//   53  111:istore_3        
			k = Math.round(40.8F);
	//   54  112:ldc2            #617 <Float 40.8F>
	//   55  115:invokestatic    #623 <Method int Math.round(float)>
	//   56  118:istore          5
			mode = mode1;
	//   57  120:aload           8
	//   58  122:astore          7
		} else
	//*  59  124:goto            157
		{
			mode = mode1;
	//   60  127:aload           8
	//   61  129:astore          7
			k = ((int) (byte0));
	//   62  131:iload           6
	//   63  133:istore          5
			if(i == android.support.v7.appcompat.R.drawable.abc_dialog_material_background)
	//*  64  135:iload_1         
	//*  65  136:getstatic       #626 <Field int android.support.v7.appcompat.R$drawable.abc_dialog_material_background>
	//*  66  139:icmpne          157
			{
				j = 0x1010031;
	//   67  142:ldc2            #612 <Int 0x1010031>
	//   68  145:istore          4
				flag = true;
	//   69  147:iconst_1        
	//   70  148:istore_3        
				k = ((int) (byte0));
	//   71  149:iload           6
	//   72  151:istore          5
				mode = mode1;
	//   73  153:aload           8
	//   74  155:astore          7
			}
		}
		if(flag)
	//*  75  157:iload_3         
	//*  76  158:ifeq            208
		{
			Drawable drawable1 = drawable;
	//   77  161:aload_2         
	//   78  162:astore          8
			if(DrawableUtils.canSafelyMutateDrawable(drawable))
	//*  79  164:aload_2         
	//*  80  165:invokestatic    #519 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  81  168:ifeq            177
				drawable1 = drawable.mutate();
	//   82  171:aload_2         
	//   83  172:invokevirtual   #523 <Method Drawable Drawable.mutate()>
	//   84  175:astore          8
			drawable1.setColorFilter(((android.graphics.ColorFilter) (getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, j), mode))));
	//   85  177:aload           8
	//   86  179:aload_0         
	//   87  180:iload           4
	//   88  182:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   89  185:aload           7
	//   90  187:invokestatic    #368 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   91  190:invokevirtual   #527 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
			if(k != -1)
	//*  92  193:iload           5
	//*  93  195:iconst_m1       
	//*  94  196:icmpeq          206
				drawable1.setAlpha(k);
	//   95  199:aload           8
	//   96  201:iload           5
	//   97  203:invokevirtual   #629 <Method void Drawable.setAlpha(int)>
			return true;
	//   98  206:iconst_1        
	//   99  207:ireturn         
		} else
		{
			return false;
	//  100  208:iconst_0        
	//  101  209:ireturn         
		}
	}

	public Drawable getDrawable(Context context, int i)
	{
		return getDrawable(context, i, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #632 <Method Drawable getDrawable(Context, int, boolean)>
	//    5    7:areturn         
	}

	Drawable getDrawable(Context context, int i, boolean flag)
	{
		checkVectorDrawableSetup(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #634 <Method void checkVectorDrawableSetup(Context)>
		Drawable drawable1 = loadDrawableFromDelegates(context, i);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #636 <Method Drawable loadDrawableFromDelegates(Context, int)>
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
	//   15   25:invokespecial   #638 <Method Drawable createDrawableIfNeeded(Context, int)>
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
	//   23   41:invokestatic    #641 <Method Drawable ContextCompat.getDrawable(Context, int)>
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
	//   34   61:invokespecial   #643 <Method Drawable tintDrawable(Context, int, boolean, Drawable)>
	//   35   64:astore          4
		if(drawable != null)
	//*  36   66:aload           4
	//*  37   68:ifnull          76
			DrawableUtils.fixDrawable(drawable);
	//   38   71:aload           4
	//   39   73:invokestatic    #647 <Method void DrawableUtils.fixDrawable(Drawable)>
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
	//    3    3:invokespecial   #649 <Method ColorStateList getTintListFromCache(Context, int)>
	//    4    6:astore_3        
		ColorStateList colorstatelist1 = colorstatelist;
	//    5    7:aload_3         
	//    6    8:astore          4
		if(colorstatelist == null)
	//*   7   10:aload_3         
	//*   8   11:ifnonnull       236
		{
			if(i == android.support.v7.appcompat.R.drawable.abc_edit_text_material)
	//*   9   14:iload_2         
	//*  10   15:getstatic       #652 <Field int android.support.v7.appcompat.R$drawable.abc_edit_text_material>
	//*  11   18:icmpne          32
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_edittext);
	//   12   21:aload_1         
	//   13   22:getstatic       #657 <Field int android.support.v7.appcompat.R$color.abc_tint_edittext>
	//   14   25:invokestatic    #662 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   15   28:astore_3        
			else
	//*  16   29:goto            219
			if(i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
	//*  17   32:iload_2         
	//*  18   33:getstatic       #665 <Field int android.support.v7.appcompat.R$drawable.abc_switch_track_mtrl_alpha>
	//*  19   36:icmpne          50
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_switch_track);
	//   20   39:aload_1         
	//   21   40:getstatic       #668 <Field int android.support.v7.appcompat.R$color.abc_tint_switch_track>
	//   22   43:invokestatic    #662 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   23   46:astore_3        
			else
	//*  24   47:goto            219
			if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*  25   50:iload_2         
	//*  26   51:getstatic       #411 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*  27   54:icmpne          68
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_switch_thumb);
	//   28   57:aload_1         
	//   29   58:getstatic       #671 <Field int android.support.v7.appcompat.R$color.abc_tint_switch_thumb>
	//   30   61:invokestatic    #662 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   31   64:astore_3        
			else
	//*  32   65:goto            219
			if(i == android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape)
	//*  33   68:iload_2         
	//*  34   69:getstatic       #674 <Field int android.support.v7.appcompat.R$drawable.abc_btn_default_mtrl_shape>
	//*  35   72:icmpne          84
				colorstatelist = createDefaultButtonColorStateList(context);
	//   36   75:aload_0         
	//   37   76:aload_1         
	//   38   77:invokespecial   #676 <Method ColorStateList createDefaultButtonColorStateList(Context)>
	//   39   80:astore_3        
			else
	//*  40   81:goto            219
			if(i == android.support.v7.appcompat.R.drawable.abc_btn_borderless_material)
	//*  41   84:iload_2         
	//*  42   85:getstatic       #679 <Field int android.support.v7.appcompat.R$drawable.abc_btn_borderless_material>
	//*  43   88:icmpne          100
				colorstatelist = createBorderlessButtonColorStateList(context);
	//   44   91:aload_0         
	//   45   92:aload_1         
	//   46   93:invokespecial   #681 <Method ColorStateList createBorderlessButtonColorStateList(Context)>
	//   47   96:astore_3        
			else
	//*  48   97:goto            219
			if(i == android.support.v7.appcompat.R.drawable.abc_btn_colored_material)
	//*  49  100:iload_2         
	//*  50  101:getstatic       #684 <Field int android.support.v7.appcompat.R$drawable.abc_btn_colored_material>
	//*  51  104:icmpne          116
				colorstatelist = createColoredButtonColorStateList(context);
	//   52  107:aload_0         
	//   53  108:aload_1         
	//   54  109:invokespecial   #686 <Method ColorStateList createColoredButtonColorStateList(Context)>
	//   55  112:astore_3        
			else
	//*  56  113:goto            219
			if(i == android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha || i == android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material)
	//*  57  116:iload_2         
	//*  58  117:getstatic       #689 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_mtrl_am_alpha>
	//*  59  120:icmpeq          130
	//*  60  123:iload_2         
	//*  61  124:getstatic       #692 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_textfield_background_material>
	//*  62  127:icmpne          141
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_spinner);
	//   63  130:aload_1         
	//   64  131:getstatic       #695 <Field int android.support.v7.appcompat.R$color.abc_tint_spinner>
	//   65  134:invokestatic    #662 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   66  137:astore_3        
			else
	//*  67  138:goto            219
			if(arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
	//*  68  141:getstatic       #114 <Field int[] TINT_COLOR_CONTROL_NORMAL>
	//*  69  144:iload_2         
	//*  70  145:invokestatic    #611 <Method boolean arrayContains(int[], int)>
	//*  71  148:ifeq            162
				colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorControlNormal);
	//   72  151:aload_1         
	//   73  152:getstatic       #559 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   74  155:invokestatic    #698 <Method ColorStateList ThemeUtils.getThemeAttrColorStateList(Context, int)>
	//   75  158:astore_3        
			else
	//*  76  159:goto            219
			if(arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
	//*  77  162:getstatic       #165 <Field int[] TINT_COLOR_CONTROL_STATE_LIST>
	//*  78  165:iload_2         
	//*  79  166:invokestatic    #611 <Method boolean arrayContains(int[], int)>
	//*  80  169:ifeq            183
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_default);
	//   81  172:aload_1         
	//   82  173:getstatic       #701 <Field int android.support.v7.appcompat.R$color.abc_tint_default>
	//   83  176:invokestatic    #662 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   84  179:astore_3        
			else
	//*  85  180:goto            219
			if(arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
	//*  86  183:getstatic       #173 <Field int[] TINT_CHECKABLE_BUTTON_LIST>
	//*  87  186:iload_2         
	//*  88  187:invokestatic    #611 <Method boolean arrayContains(int[], int)>
	//*  89  190:ifeq            204
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_btn_checkable);
	//   90  193:aload_1         
	//   91  194:getstatic       #704 <Field int android.support.v7.appcompat.R$color.abc_tint_btn_checkable>
	//   92  197:invokestatic    #662 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   93  200:astore_3        
			else
	//*  94  201:goto            219
			if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_thumb_material)
	//*  95  204:iload_2         
	//*  96  205:getstatic       #707 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_thumb_material>
	//*  97  208:icmpne          219
				colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_seek_thumb);
	//   98  211:aload_1         
	//   99  212:getstatic       #710 <Field int android.support.v7.appcompat.R$color.abc_tint_seek_thumb>
	//  100  215:invokestatic    #662 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//  101  218:astore_3        
			colorstatelist1 = colorstatelist;
	//  102  219:aload_3         
	//  103  220:astore          4
			if(colorstatelist != null)
	//* 104  222:aload_3         
	//* 105  223:ifnull          236
			{
				addTintListToCache(context, i, colorstatelist);
	//  106  226:aload_0         
	//  107  227:aload_1         
	//  108  228:iload_2         
	//  109  229:aload_3         
	//  110  230:invokespecial   #712 <Method void addTintListToCache(Context, int, ColorStateList)>
				colorstatelist1 = colorstatelist;
	//  111  233:aload_3         
	//  112  234:astore          4
			}
		}
		return colorstatelist1;
	//  113  236:aload           4
	//  114  238:areturn         
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
	//   14   24:invokevirtual   #716 <Method void LongSparseArray.clear()>
		obj;
	//   15   27:aload_2         
		JVM INSTR monitorexit ;
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		context;
	//   18   30:astore_1        
	//*  19   31:aload_2         
		throw context;
	//   20   32:monitorexit     
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorenabledtintresources, int i)
	{
		Drawable drawable1 = loadDrawableFromDelegates(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:invokespecial   #636 <Method Drawable loadDrawableFromDelegates(Context, int)>
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
	//   11   19:invokevirtual   #723 <Method Drawable VectorEnabledTintResources.superGetDrawable(int)>
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
	//   20   35:invokespecial   #643 <Method Drawable tintDrawable(Context, int, boolean, Drawable)>
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
	private static final String TAG = "AppCompatDrawableManager";
	private static final int TINT_CHECKABLE_BUTTON_LIST[];
	private static final int TINT_COLOR_CONTROL_NORMAL[];
	private static final int TINT_COLOR_CONTROL_STATE_LIST[];
	private ArrayMap mDelegates;
	private final Object mDrawableCacheLock = new Object();
	private final WeakHashMap mDrawableCaches = new WeakHashMap(0);
	private boolean mHasCheckedVectorDrawableSetup;
	private SparseArray mKnownDrawableIdTags;
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
