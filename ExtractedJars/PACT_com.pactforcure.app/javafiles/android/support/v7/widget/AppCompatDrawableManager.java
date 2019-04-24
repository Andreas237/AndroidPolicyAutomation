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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int k = ai.length;
	//    2    3:aload_0         
	//    3    4:arraylength     
	//    4    5:istore_3        
		int j = 0;
	//    5    6:iconst_0        
	//    6    7:istore_2        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    7    8:iload           5
	//    8   10:istore          4
				if(j < k)
	//*   9   12:iload_2         
	//*  10   13:iload_3         
	//*  11   14:icmpge          27
				{
					if(ai[j] != i)
						break label0;
	//   12   17:aload_0         
	//   13   18:iload_2         
	//   14   19:iaload          
	//   15   20:iload_1         
	//   16   21:icmpne          30
					flag = true;
	//   17   24:iconst_1        
	//   18   25:istore          4
				}
				return flag;
	//   19   27:iload           4
	//   20   29:ireturn         
			}
			j++;
	//   21   30:iload_2         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_2        
		} while(true);
	//   25   34:goto            8
	}

	private void checkVectorDrawableSetup(Context context)
	{
		if(!mHasCheckedVectorDrawableSetup)
	//*   0    0:aload_0         
	//*   1    1:getfield        #239 <Field boolean mHasCheckedVectorDrawableSetup>
	//*   2    4:ifeq            8
	//*   3    7:return          
		{
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
	//*  16   30:ifne            7
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
			}
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

	private ColorStateList createSwitchThumbColorStateList(Context context)
	{
		int ai[][] = new int[3][];
	//    0    0:iconst_3        
	//    1    1:anewarray       int[][]
	//    2    4:astore_3        
		int ai1[] = new int[3];
	//    3    5:iconst_3        
	//    4    6:newarray        int[]
	//    5    8:astore          4
		ColorStateList colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//    6   10:aload_1         
	//    7   11:getstatic       #362 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//    8   14:invokestatic    #365 <Method ColorStateList ThemeUtils.getThemeAttrColorStateList(Context, int)>
	//    9   17:astore          5
		if(colorstatelist != null && colorstatelist.isStateful())
	//*  10   19:aload           5
	//*  11   21:ifnull          102
	//*  12   24:aload           5
	//*  13   26:invokevirtual   #369 <Method boolean ColorStateList.isStateful()>
	//*  14   29:ifeq            102
		{
			ai[0] = ThemeUtils.DISABLED_STATE_SET;
	//   15   32:aload_3         
	//   16   33:iconst_0        
	//   17   34:getstatic       #285 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//   18   37:aastore         
			ai1[0] = colorstatelist.getColorForState(ai[0], 0);
	//   19   38:aload           4
	//   20   40:iconst_0        
	//   21   41:aload           5
	//   22   43:aload_3         
	//   23   44:iconst_0        
	//   24   45:aaload          
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #373 <Method int ColorStateList.getColorForState(int[], int)>
	//   27   50:iastore         
			int i = 0 + 1;
	//   28   51:iconst_0        
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_2        
			ai[i] = ThemeUtils.CHECKED_STATE_SET;
	//   32   55:aload_3         
	//   33   56:iload_2         
	//   34   57:getstatic       #376 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   35   60:aastore         
			ai1[i] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
	//   36   61:aload           4
	//   37   63:iload_2         
	//   38   64:aload_1         
	//   39   65:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   40   68:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   41   71:iastore         
			i++;
	//   42   72:iload_2         
	//   43   73:iconst_1        
	//   44   74:iadd            
	//   45   75:istore_2        
			ai[i] = ThemeUtils.EMPTY_STATE_SET;
	//   46   76:aload_3         
	//   47   77:iload_2         
	//   48   78:getstatic       #300 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   49   81:aastore         
			ai1[i] = colorstatelist.getDefaultColor();
	//   50   82:aload           4
	//   51   84:iload_2         
	//   52   85:aload           5
	//   53   87:invokevirtual   #383 <Method int ColorStateList.getDefaultColor()>
	//   54   90:iastore         
		} else
	//*  55   91:new             #302 <Class ColorStateList>
	//*  56   94:dup             
	//*  57   95:aload_3         
	//*  58   96:aload           4
	//*  59   98:invokespecial   #305 <Method void ColorStateList(int[][], int[])>
	//*  60  101:areturn         
		{
			ai[0] = ThemeUtils.DISABLED_STATE_SET;
	//   61  102:aload_3         
	//   62  103:iconst_0        
	//   63  104:getstatic       #285 <Field int[] ThemeUtils.DISABLED_STATE_SET>
	//   64  107:aastore         
			ai1[0] = ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//   65  108:aload           4
	//   66  110:iconst_0        
	//   67  111:aload_1         
	//   68  112:getstatic       #362 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//   69  115:invokestatic    #282 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   70  118:iastore         
			int j = 0 + 1;
	//   71  119:iconst_0        
	//   72  120:iconst_1        
	//   73  121:iadd            
	//   74  122:istore_2        
			ai[j] = ThemeUtils.CHECKED_STATE_SET;
	//   75  123:aload_3         
	//   76  124:iload_2         
	//   77  125:getstatic       #376 <Field int[] ThemeUtils.CHECKED_STATE_SET>
	//   78  128:aastore         
			ai1[j] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated);
	//   79  129:aload           4
	//   80  131:iload_2         
	//   81  132:aload_1         
	//   82  133:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   83  136:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   84  139:iastore         
			j++;
	//   85  140:iload_2         
	//   86  141:iconst_1        
	//   87  142:iadd            
	//   88  143:istore_2        
			ai[j] = ThemeUtils.EMPTY_STATE_SET;
	//   89  144:aload_3         
	//   90  145:iload_2         
	//   91  146:getstatic       #300 <Field int[] ThemeUtils.EMPTY_STATE_SET>
	//   92  149:aastore         
			ai1[j] = ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorSwitchThumbNormal);
	//   93  150:aload           4
	//   94  152:iload_2         
	//   95  153:aload_1         
	//   96  154:getstatic       #362 <Field int android.support.v7.appcompat.R$attr.colorSwitchThumbNormal>
	//   97  157:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   98  160:iastore         
		}
		return new ColorStateList(ai, ai1);
	//*  99  161:goto            91
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
	//    9   13:invokevirtual   #373 <Method int ColorStateList.getColorForState(int[], int)>
	//   10   16:aload_1         
	//   11   17:invokestatic    #389 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   12   20:areturn         
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
			break MISSING_BLOCK_LABEL_90;
	//   22   43:aload           6
	//   23   45:ifnull          90
		obj1 = ((Object) ((android.graphics.drawable.Drawable.ConstantState)((WeakReference) (obj1)).get()));
	//   24   48:aload           6
	//   25   50:invokevirtual   #403 <Method Object WeakReference.get()>
	//   26   53:checkcast       #405 <Class android.graphics.drawable.Drawable$ConstantState>
	//   27   56:astore          6
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_84;
	//   28   58:aload           6
	//   29   60:ifnull          84
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
		context;
	//   39   78:astore_1        
		obj;
	//   40   79:aload           4
		JVM INSTR monitorexit ;
	//   41   81:monitorexit     
		throw context;
	//   42   82:aload_1         
	//   43   83:athrow          
		longsparsearray.delete(l);
	//   44   84:aload           5
	//   45   86:lload_2         
	//   46   87:invokevirtual   #413 <Method void LongSparseArray.delete(long)>
		obj;
	//   47   90:aload           4
		JVM INSTR monitorexit ;
	//   48   92:monitorexit     
		return null;
	//   49   93:aconst_null     
	//   50   94:areturn         
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
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		ColorStateList colorstatelist = ((ColorStateList) (obj));
	//    2    3:aload           4
	//    3    5:astore_3        
		if(mTintLists != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #225 <Field WeakHashMap mTintLists>
	//*   6   10:ifnull          41
		{
			context = ((Context) ((SparseArrayCompat)mTintLists.get(((Object) (context)))));
	//    7   13:aload_0         
	//    8   14:getfield        #225 <Field WeakHashMap mTintLists>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #208 <Method Object WeakHashMap.get(Object)>
	//   11   21:checkcast       #228 <Class SparseArrayCompat>
	//   12   24:astore_1        
			colorstatelist = ((ColorStateList) (obj));
	//   13   25:aload           4
	//   14   27:astore_3        
			if(context != null)
	//*  15   28:aload_1         
	//*  16   29:ifnull          41
				colorstatelist = (ColorStateList)((SparseArrayCompat) (context)).get(i);
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:invokevirtual   #427 <Method Object SparseArrayCompat.get(int)>
	//   20   37:checkcast       #302 <Class ColorStateList>
	//   21   40:astore_3        
		}
		return colorstatelist;
	//   22   41:aload_3         
	//   23   42:areturn         
	}

	static android.graphics.PorterDuff.Mode getTintMode(int i)
	{
		android.graphics.PorterDuff.Mode mode = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*   2    2:iload_0         
	//*   3    3:getstatic       #432 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*   4    6:icmpne          13
			mode = android.graphics.PorterDuff.Mode.MULTIPLY;
	//    5    9:getstatic       #435 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    6   12:astore_1        
		return mode;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	private static void installDefaultInflateDelegates(AppCompatDrawableManager appcompatdrawablemanager)
	{
		if(android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:getstatic       #440 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          44
		{
			appcompatdrawablemanager.addDelegate("vector", ((InflateDelegate) (new VdcInflateDelegate())));
	//    3    8:aload_0         
	//    4    9:ldc2            #442 <String "vector">
	//    5   12:new             #15  <Class AppCompatDrawableManager$VdcInflateDelegate>
	//    6   15:dup             
	//    7   16:invokespecial   #443 <Method void AppCompatDrawableManager$VdcInflateDelegate()>
	//    8   19:invokespecial   #445 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   9   22:getstatic       #440 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   25:bipush          11
	//*  11   27:icmplt          44
				appcompatdrawablemanager.addDelegate("animated-vector", ((InflateDelegate) (new AvdcInflateDelegate())));
	//   12   30:aload_0         
	//   13   31:ldc2            #447 <String "animated-vector">
	//   14   34:new             #6   <Class AppCompatDrawableManager$AvdcInflateDelegate>
	//   15   37:dup             
	//   16   38:invokespecial   #448 <Method void AppCompatDrawableManager$AvdcInflateDelegate()>
	//   17   41:invokespecial   #445 <Method void addDelegate(String, AppCompatDrawableManager$InflateDelegate)>
		}
	//   18   44:return          
	}

	private static boolean isVectorDrawable(Drawable drawable)
	{
		return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(((Object) (((Object) (drawable)).getClass().getName())));
	//    0    0:aload_0         
	//    1    1:instanceof      #450 <Class VectorDrawableCompat>
	//    2    4:ifne            22
	//    3    7:ldc1            #37  <String "android.graphics.drawable.VectorDrawable">
	//    4    9:aload_0         
	//    5   10:invokevirtual   #454 <Method Class Object.getClass()>
	//    6   13:invokevirtual   #460 <Method String Class.getName()>
	//    7   16:invokevirtual   #466 <Method boolean String.equals(Object)>
	//    8   19:ifeq            24
	//    9   22:iconst_1        
	//   10   23:ireturn         
	//   11   24:iconst_0        
	//   12   25:ireturn         
	}

	private Drawable loadDrawableFromDelegates(Context context, int i)
	{
		if(mDelegates == null || mDelegates.isEmpty())
			break MISSING_BLOCK_LABEL_408;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field ArrayMap mDelegates>
	//    2    4:ifnull          408
	//    3    7:aload_0         
	//    4    8:getfield        #188 <Field ArrayMap mDelegates>
	//    5   11:invokevirtual   #472 <Method boolean ArrayMap.isEmpty()>
	//    6   14:ifne            408
		if(mKnownDrawableIdTags == null) goto _L2; else goto _L1
	//    7   17:aload_0         
	//    8   18:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//    9   21:ifnull          70
_L1:
		Object obj = ((Object) ((String)mKnownDrawableIdTags.get(i)));
	//   10   24:aload_0         
	//   11   25:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//   12   28:iload_2         
	//   13   29:invokevirtual   #427 <Method Object SparseArrayCompat.get(int)>
	//   14   32:checkcast       #462 <Class String>
	//   15   35:astore          7
		if(!"appcompat_skip_skip".equals(obj) && (obj == null || mDelegates.get(obj) != null)) goto _L4; else goto _L3
	//   16   37:ldc1            #40  <String "appcompat_skip_skip">
	//   17   39:aload           7
	//   18   41:invokevirtual   #466 <Method boolean String.equals(Object)>
	//   19   44:ifne            64
	//   20   47:aload           7
	//   21   49:ifnull          81
	//   22   52:aload_0         
	//   23   53:getfield        #188 <Field ArrayMap mDelegates>
	//   24   56:aload           7
	//   25   58:invokevirtual   #475 <Method Object ArrayMap.get(Object)>
	//   26   61:ifnonnull       81
_L3:
		Object obj1 = null;
	//   27   64:aconst_null     
	//   28   65:astore          8
_L8:
		return ((Drawable) (obj1));
	//   29   67:aload           8
	//   30   69:areturn         
_L2:
		mKnownDrawableIdTags = new SparseArrayCompat();
	//   31   70:aload_0         
	//   32   71:new             #228 <Class SparseArrayCompat>
	//   33   74:dup             
	//   34   75:invokespecial   #229 <Method void SparseArrayCompat()>
	//   35   78:putfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
_L4:
		long l;
		Drawable drawable;
		TypedValue typedvalue;
		Object obj2;
		if(mTypedValue == null)
	//*  36   81:aload_0         
	//*  37   82:getfield        #323 <Field TypedValue mTypedValue>
	//*  38   85:ifnonnull       99
			mTypedValue = new TypedValue();
	//   39   88:aload_0         
	//   40   89:new             #309 <Class TypedValue>
	//   41   92:dup             
	//   42   93:invokespecial   #324 <Method void TypedValue()>
	//   43   96:putfield        #323 <Field TypedValue mTypedValue>
		typedvalue = mTypedValue;
	//   44   99:aload_0         
	//   45  100:getfield        #323 <Field TypedValue mTypedValue>
	//   46  103:astore          10
		obj2 = ((Object) (context.getResources()));
	//   47  105:aload_1         
	//   48  106:invokevirtual   #330 <Method Resources Context.getResources()>
	//   49  109:astore          11
		((Resources) (obj2)).getValue(i, typedvalue, true);
	//   50  111:aload           11
	//   51  113:iload_2         
	//   52  114:aload           10
	//   53  116:iconst_1        
	//   54  117:invokevirtual   #336 <Method void Resources.getValue(int, TypedValue, boolean)>
		l = createCacheKey(typedvalue);
	//   55  120:aload           10
	//   56  122:invokestatic    #338 <Method long createCacheKey(TypedValue)>
	//   57  125:lstore          4
		obj = ((Object) (getCachedDrawable(context, l)));
	//   58  127:aload_0         
	//   59  128:aload_1         
	//   60  129:lload           4
	//   61  131:invokespecial   #342 <Method Drawable getCachedDrawable(Context, long)>
	//   62  134:astore          7
		obj1 = obj;
	//   63  136:aload           7
	//   64  138:astore          8
		if(obj != null)
			continue; /* Loop/switch isn't completed */
	//   65  140:aload           7
	//   66  142:ifnonnull       67
		drawable = ((Drawable) (obj));
	//   67  145:aload           7
	//   68  147:astore          9
		if(typedvalue.string == null)
			break MISSING_BLOCK_LABEL_256;
	//   69  149:aload           10
	//   70  151:getfield        #479 <Field CharSequence TypedValue.string>
	//   71  154:ifnull          256
		drawable = ((Drawable) (obj));
	//   72  157:aload           7
	//   73  159:astore          9
		if(!typedvalue.string.toString().endsWith(".xml"))
			break MISSING_BLOCK_LABEL_256;
	//   74  161:aload           10
	//   75  163:getfield        #479 <Field CharSequence TypedValue.string>
	//   76  166:invokeinterface #484 <Method String CharSequence.toString()>
	//   77  171:ldc2            #486 <String ".xml">
	//   78  174:invokevirtual   #490 <Method boolean String.endsWith(String)>
	//   79  177:ifeq            256
		drawable = ((Drawable) (obj));
	//   80  180:aload           7
	//   81  182:astore          9
		obj2 = ((Object) (((Resources) (obj2)).getXml(i)));
	//   82  184:aload           11
	//   83  186:iload_2         
	//   84  187:invokevirtual   #494 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   85  190:astore          11
		drawable = ((Drawable) (obj));
	//   86  192:aload           7
	//   87  194:astore          9
		AttributeSet attributeset = Xml.asAttributeSet(((XmlPullParser) (obj2)));
	//   88  196:aload           11
	//   89  198:invokestatic    #500 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   90  201:astore          12
_L6:
		drawable = ((Drawable) (obj));
	//   91  203:aload           7
	//   92  205:astore          9
		int j = ((XmlPullParser) (obj2)).next();
	//   93  207:aload           11
	//   94  209:invokeinterface #505 <Method int XmlPullParser.next()>
	//   95  214:istore_3        
		if(j != 2 && j != 1) goto _L6; else goto _L5
	//   96  215:iload_3         
	//   97  216:iconst_2        
	//   98  217:icmpeq          225
	//   99  220:iload_3         
	//  100  221:iconst_1        
	//  101  222:icmpne          203
_L5:
		if(j == 2)
			break; /* Loop/switch isn't completed */
	//  102  225:iload_3         
	//  103  226:iconst_2        
	//  104  227:icmpeq          278
		drawable = ((Drawable) (obj));
	//  105  230:aload           7
	//  106  232:astore          9
		try
		{
			throw new XmlPullParserException("No start tag found");
	//  107  234:new             #507 <Class XmlPullParserException>
	//  108  237:dup             
	//  109  238:ldc2            #509 <String "No start tag found">
	//  110  241:invokespecial   #510 <Method void XmlPullParserException(String)>
	//  111  244:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 112  245:astore_1        
		{
			Log.e("AppCompatDrawableManager", "Exception while inflating drawable", ((Throwable) (context)));
	//  113  246:ldc1            #43  <String "AppCompatDrawableManager">
	//  114  248:ldc2            #512 <String "Exception while inflating drawable">
	//  115  251:aload_1         
	//  116  252:invokestatic    #518 <Method int Log.e(String, String, Throwable)>
	//  117  255:pop             
		}
_L10:
		obj1 = ((Object) (drawable));
	//  118  256:aload           9
	//  119  258:astore          8
		if(drawable == null)
	//* 120  260:aload           9
	//* 121  262:ifnonnull       67
		{
			mKnownDrawableIdTags.append(i, "appcompat_skip_skip");
	//  122  265:aload_0         
	//  123  266:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//  124  269:iload_2         
	//  125  270:ldc1            #40  <String "appcompat_skip_skip">
	//  126  272:invokevirtual   #233 <Method void SparseArrayCompat.append(int, Object)>
			return drawable;
	//  127  275:aload           9
	//  128  277:areturn         
		}
		if(true) goto _L8; else goto _L7
_L7:
		drawable = ((Drawable) (obj));
	//  129  278:aload           7
	//  130  280:astore          9
		obj1 = ((Object) (((XmlPullParser) (obj2)).getName()));
	//  131  282:aload           11
	//  132  284:invokeinterface #519 <Method String XmlPullParser.getName()>
	//  133  289:astore          8
		drawable = ((Drawable) (obj));
	//  134  291:aload           7
	//  135  293:astore          9
		mKnownDrawableIdTags.append(i, obj1);
	//  136  295:aload_0         
	//  137  296:getfield        #474 <Field SparseArrayCompat mKnownDrawableIdTags>
	//  138  299:iload_2         
	//  139  300:aload           8
	//  140  302:invokevirtual   #233 <Method void SparseArrayCompat.append(int, Object)>
		drawable = ((Drawable) (obj));
	//  141  305:aload           7
	//  142  307:astore          9
		InflateDelegate inflatedelegate = (InflateDelegate)mDelegates.get(obj1);
	//  143  309:aload_0         
	//  144  310:getfield        #188 <Field ArrayMap mDelegates>
	//  145  313:aload           8
	//  146  315:invokevirtual   #475 <Method Object ArrayMap.get(Object)>
	//  147  318:checkcast       #12  <Class AppCompatDrawableManager$InflateDelegate>
	//  148  321:astore          13
		obj1 = obj;
	//  149  323:aload           7
	//  150  325:astore          8
		if(inflatedelegate == null)
			break MISSING_BLOCK_LABEL_354;
	//  151  327:aload           13
	//  152  329:ifnull          354
		drawable = ((Drawable) (obj));
	//  153  332:aload           7
	//  154  334:astore          9
		obj1 = ((Object) (inflatedelegate.createFromXmlInner(context, ((XmlPullParser) (obj2)), attributeset, context.getTheme())));
	//  155  336:aload           13
	//  156  338:aload_1         
	//  157  339:aload           11
	//  158  341:aload           12
	//  159  343:aload_1         
	//  160  344:invokevirtual   #523 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  161  347:invokeinterface #527 <Method Drawable AppCompatDrawableManager$InflateDelegate.createFromXmlInner(Context, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//  162  352:astore          8
		drawable = ((Drawable) (obj1));
	//  163  354:aload           8
	//  164  356:astore          9
		if(obj1 == null) goto _L10; else goto _L9
	//  165  358:aload           8
	//  166  360:ifnull          256
_L9:
		drawable = ((Drawable) (obj1));
	//  167  363:aload           8
	//  168  365:astore          9
		((Drawable) (obj1)).setChangingConfigurations(typedvalue.changingConfigurations);
	//  169  367:aload           8
	//  170  369:aload           10
	//  171  371:getfield        #353 <Field int TypedValue.changingConfigurations>
	//  172  374:invokevirtual   #356 <Method void Drawable.setChangingConfigurations(int)>
		drawable = ((Drawable) (obj1));
	//  173  377:aload           8
	//  174  379:astore          9
		boolean flag = addDrawableToCache(context, l, ((Drawable) (obj1)));
	//  175  381:aload_0         
	//  176  382:aload_1         
	//  177  383:lload           4
	//  178  385:aload           8
	//  179  387:invokespecial   #358 <Method boolean addDrawableToCache(Context, long, Drawable)>
	//  180  390:istore          6
		drawable = ((Drawable) (obj1));
	//  181  392:aload           8
	//  182  394:astore          9
		if(flag)
	//* 183  396:iload           6
	//* 184  398:ifeq            256
			drawable = ((Drawable) (obj1));
	//  185  401:aload           8
	//  186  403:astore          9
		  goto _L10
	//* 187  405:goto            256
		return null;
	//  188  408:aconst_null     
	//  189  409:areturn         
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
	//*   6   10:ifnull          67
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
	//*  27   52:ifnull          64
			{
				DrawableCompat.setTintMode(((Drawable) (context)), ((android.graphics.PorterDuff.Mode) (drawable)));
	//   28   55:aload_1         
	//   29   56:aload           4
	//   30   58:invokestatic    #567 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
				obj = ((Object) (context));
	//   31   61:aload_1         
	//   32   62:astore          5
			}
		} else
	//*  33   64:aload           5
	//*  34   66:areturn         
		{
			if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_track_material)
	//*  35   67:iload_2         
	//*  36   68:getstatic       #570 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_track_material>
	//*  37   71:icmpne          147
			{
				obj = ((Object) ((LayerDrawable)drawable));
	//   38   74:aload           4
	//   39   76:checkcast       #347 <Class LayerDrawable>
	//   40   79:astore          5
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   41   81:aload           5
	//   42   83:ldc2            #571 <Int 0x1020000>
	//   43   86:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   44   89:aload_1         
	//   45   90:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   46   93:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   47   96:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   48   99:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   49  102:aload           5
	//   50  104:ldc2            #581 <Int 0x102000f>
	//   51  107:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   52  110:aload_1         
	//   53  111:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   54  114:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   55  117:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   56  120:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   57  123:aload           5
	//   58  125:ldc2            #582 <Int 0x102000d>
	//   59  128:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   60  131:aload_1         
	//   61  132:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   62  135:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   63  138:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   64  141:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				return drawable;
	//   65  144:aload           4
	//   66  146:areturn         
			}
			if(i == android.support.v7.appcompat.R.drawable.abc_ratingbar_material || i == android.support.v7.appcompat.R.drawable.abc_ratingbar_indicator_material || i == android.support.v7.appcompat.R.drawable.abc_ratingbar_small_material)
	//*  67  147:iload_2         
	//*  68  148:getstatic       #585 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_material>
	//*  69  151:icmpeq          168
	//*  70  154:iload_2         
	//*  71  155:getstatic       #588 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_indicator_material>
	//*  72  158:icmpeq          168
	//*  73  161:iload_2         
	//*  74  162:getstatic       #591 <Field int android.support.v7.appcompat.R$drawable.abc_ratingbar_small_material>
	//*  75  165:icmpne          241
			{
				obj = ((Object) ((LayerDrawable)drawable));
	//   76  168:aload           4
	//   77  170:checkcast       #347 <Class LayerDrawable>
	//   78  173:astore          5
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x1020000), ThemeUtils.getDisabledThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlNormal), DEFAULT_MODE);
	//   79  175:aload           5
	//   80  177:ldc2            #571 <Int 0x1020000>
	//   81  180:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   82  183:aload_1         
	//   83  184:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   84  187:invokestatic    #282 <Method int ThemeUtils.getDisabledThemeAttrColor(Context, int)>
	//   85  190:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   86  193:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000f), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   87  196:aload           5
	//   88  198:ldc2            #581 <Int 0x102000f>
	//   89  201:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   90  204:aload_1         
	//   91  205:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   92  208:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//   93  211:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   94  214:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				setPorterDuffColorFilter(((LayerDrawable) (obj)).findDrawableByLayerId(0x102000d), ThemeUtils.getThemeAttrColor(context, android.support.v7.appcompat.R.attr.colorControlActivated), DEFAULT_MODE);
	//   95  217:aload           5
	//   96  219:ldc2            #582 <Int 0x102000d>
	//   97  222:invokevirtual   #575 <Method Drawable LayerDrawable.findDrawableByLayerId(int)>
	//   98  225:aload_1         
	//   99  226:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//  100  229:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//  101  232:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//  102  235:invokestatic    #580 <Method void setPorterDuffColorFilter(Drawable, int, android.graphics.PorterDuff$Mode)>
				return drawable;
	//  103  238:aload           4
	//  104  240:areturn         
			}
			obj = ((Object) (drawable));
	//  105  241:aload           4
	//  106  243:astore          5
			if(!tintDrawableUsingColorFilter(context, i, drawable))
	//* 107  245:aload_1         
	//* 108  246:iload_2         
	//* 109  247:aload           4
	//* 110  249:invokestatic    #595 <Method boolean tintDrawableUsingColorFilter(Context, int, Drawable)>
	//* 111  252:ifne            64
			{
				obj = ((Object) (drawable));
	//  112  255:aload           4
	//  113  257:astore          5
				if(flag)
	//* 114  259:iload_3         
	//* 115  260:ifeq            64
					return null;
	//  116  263:aconst_null     
	//  117  264:areturn         
			}
		}
		return ((Drawable) (obj));
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
			Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
	//    7   15:ldc1            #43  <String "AppCompatDrawableManager">
	//    8   17:ldc2            #598 <String "Mutated drawable is not the same instance as the input.">
	//    9   20:invokestatic    #602 <Method int Log.d(String, String)>
	//   10   23:pop             
		} else
	//*  11   24:return          
		{
			if(tintinfo.mHasTintList || tintinfo.mHasTintMode)
	//*  12   25:aload_1         
	//*  13   26:getfield        #607 <Field boolean TintInfo.mHasTintList>
	//*  14   29:ifne            39
	//*  15   32:aload_1         
	//*  16   33:getfield        #610 <Field boolean TintInfo.mHasTintMode>
	//*  17   36:ifeq            98
			{
				ColorStateList colorstatelist;
				if(tintinfo.mHasTintList)
	//*  18   39:aload_1         
	//*  19   40:getfield        #607 <Field boolean TintInfo.mHasTintList>
	//*  20   43:ifeq            86
					colorstatelist = tintinfo.mTintList;
	//   21   46:aload_1         
	//   22   47:getfield        #614 <Field ColorStateList TintInfo.mTintList>
	//   23   50:astore_3        
				else
	//*  24   51:aload_1         
	//*  25   52:getfield        #610 <Field boolean TintInfo.mHasTintMode>
	//*  26   55:ifeq            91
	//*  27   58:aload_1         
	//*  28   59:getfield        #617 <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//*  29   62:astore_1        
	//*  30   63:aload_0         
	//*  31   64:aload_3         
	//*  32   65:aload_1         
	//*  33   66:aload_2         
	//*  34   67:invokestatic    #619 <Method PorterDuffColorFilter createTintFilter(ColorStateList, android.graphics.PorterDuff$Mode, int[])>
	//*  35   70:invokevirtual   #546 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//*  36   73:getstatic       #440 <Field int android.os.Build$VERSION.SDK_INT>
	//*  37   76:bipush          23
	//*  38   78:icmpgt          24
	//*  39   81:aload_0         
	//*  40   82:invokevirtual   #622 <Method void Drawable.invalidateSelf()>
	//*  41   85:return          
					colorstatelist = null;
	//   42   86:aconst_null     
	//   43   87:astore_3        
				if(tintinfo.mHasTintMode)
					tintinfo = ((TintInfo) (tintinfo.mTintMode));
				else
	//*  44   88:goto            51
					tintinfo = ((TintInfo) (DEFAULT_MODE));
	//   45   91:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//   46   94:astore_1        
				drawable.setColorFilter(((android.graphics.ColorFilter) (createTintFilter(colorstatelist, ((android.graphics.PorterDuff.Mode) (tintinfo)), ai))));
			} else
	//*  47   95:goto            63
			{
				drawable.clearColorFilter();
	//   48   98:aload_0         
	//   49   99:invokevirtual   #625 <Method void Drawable.clearColorFilter()>
			}
			if(android.os.Build.VERSION.SDK_INT <= 23)
			{
				drawable.invalidateSelf();
				return;
			}
		}
	//*  50  102:goto            73
	}

	static boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable)
	{
		Object obj1 = ((Object) (DEFAULT_MODE));
	//    0    0:getstatic       #71  <Field android.graphics.PorterDuff$Mode DEFAULT_MODE>
	//    1    3:astore          8
		boolean flag = false;
	//    2    5:iconst_0        
	//    3    6:istore          4
		int j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		byte byte0 = -1;
	//    6   10:iconst_m1       
	//    7   11:istore          6
		int k;
		Object obj;
		if(arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i))
	//*   8   13:getstatic       #91  <Field int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL>
	//*   9   16:iload_1         
	//*  10   17:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  11   20:ifeq            89
		{
			j = android.support.v7.appcompat.R.attr.colorControlNormal;
	//   12   23:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   13   26:istore_3        
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore          4
			obj = obj1;
	//   16   30:aload           8
	//   17   32:astore          7
			k = ((int) (byte0));
	//   18   34:iload           6
	//   19   36:istore          5
		} else
	//*  20   38:iload           4
	//*  21   40:ifeq            208
	//*  22   43:aload_2         
	//*  23   44:astore          8
	//*  24   46:aload_2         
	//*  25   47:invokestatic    #538 <Method boolean DrawableUtils.canSafelyMutateDrawable(Drawable)>
	//*  26   50:ifeq            59
	//*  27   53:aload_2         
	//*  28   54:invokevirtual   #542 <Method Drawable Drawable.mutate()>
	//*  29   57:astore          8
	//*  30   59:aload           8
	//*  31   61:aload_0         
	//*  32   62:iload_3         
	//*  33   63:invokestatic    #276 <Method int ThemeUtils.getThemeAttrColor(Context, int)>
	//*  34   66:aload           7
	//*  35   68:invokestatic    #389 <Method PorterDuffColorFilter getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//*  36   71:invokevirtual   #546 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//*  37   74:iload           5
	//*  38   76:iconst_m1       
	//*  39   77:icmpeq          87
	//*  40   80:aload           8
	//*  41   82:iload           5
	//*  42   84:invokevirtual   #630 <Method void Drawable.setAlpha(int)>
	//*  43   87:iconst_1        
	//*  44   88:ireturn         
		if(arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i))
	//*  45   89:getstatic       #146 <Field int[] COLORFILTER_COLOR_CONTROL_ACTIVATED>
	//*  46   92:iload_1         
	//*  47   93:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  48   96:ifeq            117
		{
			j = android.support.v7.appcompat.R.attr.colorControlActivated;
	//   49   99:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.colorControlActivated>
	//   50  102:istore_3        
			flag = true;
	//   51  103:iconst_1        
	//   52  104:istore          4
			k = ((int) (byte0));
	//   53  106:iload           6
	//   54  108:istore          5
			obj = obj1;
	//   55  110:aload           8
	//   56  112:astore          7
		} else
	//*  57  114:goto            38
		if(arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i))
	//*  58  117:getstatic       #157 <Field int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY>
	//*  59  120:iload_1         
	//*  60  121:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  61  124:ifeq            146
		{
			j = 0x1010031;
	//   62  127:ldc2            #631 <Int 0x1010031>
	//   63  130:istore_3        
			flag = true;
	//   64  131:iconst_1        
	//   65  132:istore          4
			obj = ((Object) (android.graphics.PorterDuff.Mode.MULTIPLY));
	//   66  134:getstatic       #435 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//   67  137:astore          7
			k = ((int) (byte0));
	//   68  139:iload           6
	//   69  141:istore          5
		} else
	//*  70  143:goto            38
		if(i == android.support.v7.appcompat.R.drawable.abc_list_divider_mtrl_alpha)
	//*  71  146:iload_1         
	//*  72  147:getstatic       #634 <Field int android.support.v7.appcompat.R$drawable.abc_list_divider_mtrl_alpha>
	//*  73  150:icmpne          175
		{
			j = 0x1010030;
	//   74  153:ldc2            #635 <Int 0x1010030>
	//   75  156:istore_3        
			flag = true;
	//   76  157:iconst_1        
	//   77  158:istore          4
			k = Math.round(40.8F);
	//   78  160:ldc2            #636 <Float 40.8F>
	//   79  163:invokestatic    #642 <Method int Math.round(float)>
	//   80  166:istore          5
			obj = obj1;
	//   81  168:aload           8
	//   82  170:astore          7
		} else
	//*  83  172:goto            38
		{
			k = ((int) (byte0));
	//   84  175:iload           6
	//   85  177:istore          5
			obj = obj1;
	//   86  179:aload           8
	//   87  181:astore          7
			if(i == android.support.v7.appcompat.R.drawable.abc_dialog_material_background)
	//*  88  183:iload_1         
	//*  89  184:getstatic       #645 <Field int android.support.v7.appcompat.R$drawable.abc_dialog_material_background>
	//*  90  187:icmpne          38
			{
				j = 0x1010031;
	//   91  190:ldc2            #631 <Int 0x1010031>
	//   92  193:istore_3        
				flag = true;
	//   93  194:iconst_1        
	//   94  195:istore          4
				k = ((int) (byte0));
	//   95  197:iload           6
	//   96  199:istore          5
				obj = obj1;
	//   97  201:aload           8
	//   98  203:astore          7
			}
		}
		if(flag)
		{
			obj1 = ((Object) (drawable));
			if(DrawableUtils.canSafelyMutateDrawable(drawable))
				obj1 = ((Object) (drawable.mutate()));
			((Drawable) (obj1)).setColorFilter(((android.graphics.ColorFilter) (getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, j), ((android.graphics.PorterDuff.Mode) (obj))))));
			if(k != -1)
				((Drawable) (obj1)).setAlpha(k);
			return true;
		} else
	//*  99  205:goto            38
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
		ColorStateList colorstatelist;
		ColorStateList colorstatelist1;
		colorstatelist = getTintListFromCache(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #665 <Method ColorStateList getTintListFromCache(Context, int)>
	//    4    6:astore_3        
		colorstatelist1 = colorstatelist;
	//    5    7:aload_3         
	//    6    8:astore          4
		if(colorstatelist != null) goto _L2; else goto _L1
	//    7   10:aload_3         
	//    8   11:ifnonnull       46
_L1:
		if(i != android.support.v7.appcompat.R.drawable.abc_edit_text_material) goto _L4; else goto _L3
	//    9   14:iload_2         
	//   10   15:getstatic       #668 <Field int android.support.v7.appcompat.R$drawable.abc_edit_text_material>
	//   11   18:icmpne          49
_L3:
		colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_edittext);
	//   12   21:aload_1         
	//   13   22:getstatic       #673 <Field int android.support.v7.appcompat.R$color.abc_tint_edittext>
	//   14   25:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   15   28:astore_3        
_L6:
		colorstatelist1 = colorstatelist;
	//   16   29:aload_3         
	//   17   30:astore          4
		if(colorstatelist != null)
	//*  18   32:aload_3         
	//*  19   33:ifnull          46
		{
			addTintListToCache(context, i, colorstatelist);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:iload_2         
	//   23   39:aload_3         
	//   24   40:invokespecial   #680 <Method void addTintListToCache(Context, int, ColorStateList)>
			colorstatelist1 = colorstatelist;
	//   25   43:aload_3         
	//   26   44:astore          4
		}
_L2:
		return colorstatelist1;
	//   27   46:aload           4
	//   28   48:areturn         
_L4:
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha)
	//*  29   49:iload_2         
	//*  30   50:getstatic       #683 <Field int android.support.v7.appcompat.R$drawable.abc_switch_track_mtrl_alpha>
	//*  31   53:icmpne          67
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_switch_track);
	//   32   56:aload_1         
	//   33   57:getstatic       #686 <Field int android.support.v7.appcompat.R$color.abc_tint_switch_track>
	//   34   60:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   35   63:astore_3        
		else
	//*  36   64:goto            29
		if(i == android.support.v7.appcompat.R.drawable.abc_switch_thumb_material)
	//*  37   67:iload_2         
	//*  38   68:getstatic       #432 <Field int android.support.v7.appcompat.R$drawable.abc_switch_thumb_material>
	//*  39   71:icmpne          83
			colorstatelist = createSwitchThumbColorStateList(context);
	//   40   74:aload_0         
	//   41   75:aload_1         
	//   42   76:invokespecial   #688 <Method ColorStateList createSwitchThumbColorStateList(Context)>
	//   43   79:astore_3        
		else
	//*  44   80:goto            29
		if(i == android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape)
	//*  45   83:iload_2         
	//*  46   84:getstatic       #691 <Field int android.support.v7.appcompat.R$drawable.abc_btn_default_mtrl_shape>
	//*  47   87:icmpne          99
			colorstatelist = createDefaultButtonColorStateList(context);
	//   48   90:aload_0         
	//   49   91:aload_1         
	//   50   92:invokespecial   #693 <Method ColorStateList createDefaultButtonColorStateList(Context)>
	//   51   95:astore_3        
		else
	//*  52   96:goto            29
		if(i == android.support.v7.appcompat.R.drawable.abc_btn_borderless_material)
	//*  53   99:iload_2         
	//*  54  100:getstatic       #696 <Field int android.support.v7.appcompat.R$drawable.abc_btn_borderless_material>
	//*  55  103:icmpne          115
			colorstatelist = createBorderlessButtonColorStateList(context);
	//   56  106:aload_0         
	//   57  107:aload_1         
	//   58  108:invokespecial   #698 <Method ColorStateList createBorderlessButtonColorStateList(Context)>
	//   59  111:astore_3        
		else
	//*  60  112:goto            29
		if(i == android.support.v7.appcompat.R.drawable.abc_btn_colored_material)
	//*  61  115:iload_2         
	//*  62  116:getstatic       #701 <Field int android.support.v7.appcompat.R$drawable.abc_btn_colored_material>
	//*  63  119:icmpne          131
			colorstatelist = createColoredButtonColorStateList(context);
	//   64  122:aload_0         
	//   65  123:aload_1         
	//   66  124:invokespecial   #703 <Method ColorStateList createColoredButtonColorStateList(Context)>
	//   67  127:astore_3        
		else
	//*  68  128:goto            29
		if(i == android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha || i == android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material)
	//*  69  131:iload_2         
	//*  70  132:getstatic       #706 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_mtrl_am_alpha>
	//*  71  135:icmpeq          145
	//*  72  138:iload_2         
	//*  73  139:getstatic       #709 <Field int android.support.v7.appcompat.R$drawable.abc_spinner_textfield_background_material>
	//*  74  142:icmpne          156
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_spinner);
	//   75  145:aload_1         
	//   76  146:getstatic       #712 <Field int android.support.v7.appcompat.R$color.abc_tint_spinner>
	//   77  149:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   78  152:astore_3        
		else
	//*  79  153:goto            29
		if(arrayContains(TINT_COLOR_CONTROL_NORMAL, i))
	//*  80  156:getstatic       #114 <Field int[] TINT_COLOR_CONTROL_NORMAL>
	//*  81  159:iload_2         
	//*  82  160:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  83  163:ifeq            177
			colorstatelist = ThemeUtils.getThemeAttrColorStateList(context, android.support.v7.appcompat.R.attr.colorControlNormal);
	//   84  166:aload_1         
	//   85  167:getstatic       #578 <Field int android.support.v7.appcompat.R$attr.colorControlNormal>
	//   86  170:invokestatic    #365 <Method ColorStateList ThemeUtils.getThemeAttrColorStateList(Context, int)>
	//   87  173:astore_3        
		else
	//*  88  174:goto            29
		if(arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i))
	//*  89  177:getstatic       #165 <Field int[] TINT_COLOR_CONTROL_STATE_LIST>
	//*  90  180:iload_2         
	//*  91  181:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//*  92  184:ifeq            198
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_default);
	//   93  187:aload_1         
	//   94  188:getstatic       #715 <Field int android.support.v7.appcompat.R$color.abc_tint_default>
	//   95  191:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   96  194:astore_3        
		else
	//*  97  195:goto            29
		if(arrayContains(TINT_CHECKABLE_BUTTON_LIST, i))
	//*  98  198:getstatic       #173 <Field int[] TINT_CHECKABLE_BUTTON_LIST>
	//*  99  201:iload_2         
	//* 100  202:invokestatic    #627 <Method boolean arrayContains(int[], int)>
	//* 101  205:ifeq            219
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_btn_checkable);
	//  102  208:aload_1         
	//  103  209:getstatic       #718 <Field int android.support.v7.appcompat.R$color.abc_tint_btn_checkable>
	//  104  212:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//  105  215:astore_3        
		else
	//* 106  216:goto            29
		if(i == android.support.v7.appcompat.R.drawable.abc_seekbar_thumb_material)
	//* 107  219:iload_2         
	//* 108  220:getstatic       #721 <Field int android.support.v7.appcompat.R$drawable.abc_seekbar_thumb_material>
	//* 109  223:icmpne          29
			colorstatelist = AppCompatResources.getColorStateList(context, android.support.v7.appcompat.R.color.abc_tint_seek_thumb);
	//  110  226:aload_1         
	//  111  227:getstatic       #724 <Field int android.support.v7.appcompat.R$color.abc_tint_seek_thumb>
	//  112  230:invokestatic    #678 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//  113  233:astore_3        
		if(true) goto _L6; else goto _L5
	//  114  234:goto            29
_L5:
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
	private static final String TAG = "AppCompatDrawableManager";
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
