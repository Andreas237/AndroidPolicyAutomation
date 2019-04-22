// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.TypedValue;

// Referenced classes of package android.support.v7.widget:
//			AppCompatDrawableManager

public class TintTypedArray
{

	private TintTypedArray(Context context, TypedArray typedarray)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Context mContext>
		mWrapped = typedarray;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field TypedArray mWrapped>
	//    8   14:return          
	}

	public static TintTypedArray obtainStyledAttributes(Context context, int i, int ai[])
	{
		return new TintTypedArray(context, context.obtainStyledAttributes(i, ai));
	//    0    0:new             #2   <Class TintTypedArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #31  <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//    7   11:invokespecial   #33  <Method void TintTypedArray(Context, TypedArray)>
	//    8   14:areturn         
	}

	public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeset, int ai[])
	{
		return new TintTypedArray(context, context.obtainStyledAttributes(attributeset, ai));
	//    0    0:new             #2   <Class TintTypedArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    7   11:invokespecial   #33  <Method void TintTypedArray(Context, TypedArray)>
	//    8   14:areturn         
	}

	public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeset, int ai[], int i, int j)
	{
		return new TintTypedArray(context, context.obtainStyledAttributes(attributeset, ai, i, j));
	//    0    0:new             #2   <Class TintTypedArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokevirtual   #41  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    9   14:invokespecial   #33  <Method void TintTypedArray(Context, TypedArray)>
	//   10   17:areturn         
	}

	public boolean getBoolean(int i, boolean flag)
	{
		return mWrapped.getBoolean(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #47  <Method boolean TypedArray.getBoolean(int, boolean)>
	//    5    9:ireturn         
	}

	public int getColor(int i, int j)
	{
		return mWrapped.getColor(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #51  <Method int TypedArray.getColor(int, int)>
	//    5    9:ireturn         
	}

	public ColorStateList getColorStateList(int i)
	{
		if(mWrapped.hasValue(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field TypedArray mWrapped>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #57  <Method boolean TypedArray.hasValue(int)>
	//*   4    8:ifeq            40
		{
			int j = mWrapped.getResourceId(i, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field TypedArray mWrapped>
	//    7   15:iload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #60  <Method int TypedArray.getResourceId(int, int)>
	//   10   20:istore_2        
			if(j != 0)
	//*  11   21:iload_2         
	//*  12   22:ifeq            40
			{
				ColorStateList colorstatelist = AppCompatResources.getColorStateList(mContext, j);
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Context mContext>
	//   15   29:iload_2         
	//   16   30:invokestatic    #65  <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   17   33:astore_3        
				if(colorstatelist != null)
	//*  18   34:aload_3         
	//*  19   35:ifnull          40
					return colorstatelist;
	//   20   38:aload_3         
	//   21   39:areturn         
			}
		}
		return mWrapped.getColorStateList(i);
	//   22   40:aload_0         
	//   23   41:getfield        #23  <Field TypedArray mWrapped>
	//   24   44:iload_1         
	//   25   45:invokevirtual   #67  <Method ColorStateList TypedArray.getColorStateList(int)>
	//   26   48:areturn         
	}

	public float getDimension(int i, float f)
	{
		return mWrapped.getDimension(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #71  <Method float TypedArray.getDimension(int, float)>
	//    5    9:freturn         
	}

	public int getDimensionPixelOffset(int i, int j)
	{
		return mWrapped.getDimensionPixelOffset(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #74  <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//    5    9:ireturn         
	}

	public int getDimensionPixelSize(int i, int j)
	{
		return mWrapped.getDimensionPixelSize(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #77  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//    5    9:ireturn         
	}

	public Drawable getDrawable(int i)
	{
		if(mWrapped.hasValue(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field TypedArray mWrapped>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #57  <Method boolean TypedArray.hasValue(int)>
	//*   4    8:ifeq            34
		{
			int j = mWrapped.getResourceId(i, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field TypedArray mWrapped>
	//    7   15:iload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #60  <Method int TypedArray.getResourceId(int, int)>
	//   10   20:istore_2        
			if(j != 0)
	//*  11   21:iload_2         
	//*  12   22:ifeq            34
				return AppCompatResources.getDrawable(mContext, j);
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Context mContext>
	//   15   29:iload_2         
	//   16   30:invokestatic    #82  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   17   33:areturn         
		}
		return mWrapped.getDrawable(i);
	//   18   34:aload_0         
	//   19   35:getfield        #23  <Field TypedArray mWrapped>
	//   20   38:iload_1         
	//   21   39:invokevirtual   #84  <Method Drawable TypedArray.getDrawable(int)>
	//   22   42:areturn         
	}

	public Drawable getDrawableIfKnown(int i)
	{
		if(mWrapped.hasValue(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field TypedArray mWrapped>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #57  <Method boolean TypedArray.hasValue(int)>
	//*   4    8:ifeq            38
		{
			i = mWrapped.getResourceId(i, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field TypedArray mWrapped>
	//    7   15:iload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #60  <Method int TypedArray.getResourceId(int, int)>
	//   10   20:istore_1        
			if(i != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            38
				return AppCompatDrawableManager.get().getDrawable(mContext, i, true);
	//   13   25:invokestatic    #91  <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field Context mContext>
	//   16   32:iload_1         
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #94  <Method Drawable AppCompatDrawableManager.getDrawable(Context, int, boolean)>
	//   19   37:areturn         
		}
		return null;
	//   20   38:aconst_null     
	//   21   39:areturn         
	}

	public float getFloat(int i, float f)
	{
		return mWrapped.getFloat(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #97  <Method float TypedArray.getFloat(int, float)>
	//    5    9:freturn         
	}

	public Typeface getFont(int i, int j, android.support.v4.content.res.ResourcesCompat.FontCallback fontcallback)
	{
		i = mWrapped.getResourceId(i, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #60  <Method int TypedArray.getResourceId(int, int)>
	//    5    9:istore_1        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		if(mTypedValue == null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #103 <Field TypedValue mTypedValue>
	//*  12   20:ifnonnull       34
			mTypedValue = new TypedValue();
	//   13   23:aload_0         
	//   14   24:new             #105 <Class TypedValue>
	//   15   27:dup             
	//   16   28:invokespecial   #106 <Method void TypedValue()>
	//   17   31:putfield        #103 <Field TypedValue mTypedValue>
		return ResourcesCompat.getFont(mContext, i, mTypedValue, j, fontcallback);
	//   18   34:aload_0         
	//   19   35:getfield        #21  <Field Context mContext>
	//   20   38:iload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #103 <Field TypedValue mTypedValue>
	//   23   43:iload_2         
	//   24   44:aload_3         
	//   25   45:invokestatic    #111 <Method Typeface ResourcesCompat.getFont(Context, int, TypedValue, int, android.support.v4.content.res.ResourcesCompat$FontCallback)>
	//   26   48:areturn         
	}

	public int getInt(int i, int j)
	{
		return mWrapped.getInt(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #116 <Method int TypedArray.getInt(int, int)>
	//    5    9:ireturn         
	}

	public int getInteger(int i, int j)
	{
		return mWrapped.getInteger(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #119 <Method int TypedArray.getInteger(int, int)>
	//    5    9:ireturn         
	}

	public int getLayoutDimension(int i, int j)
	{
		return mWrapped.getLayoutDimension(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #122 <Method int TypedArray.getLayoutDimension(int, int)>
	//    5    9:ireturn         
	}

	public int getResourceId(int i, int j)
	{
		return mWrapped.getResourceId(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #60  <Method int TypedArray.getResourceId(int, int)>
	//    5    9:ireturn         
	}

	public String getString(int i)
	{
		return mWrapped.getString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #126 <Method String TypedArray.getString(int)>
	//    4    8:areturn         
	}

	public CharSequence getText(int i)
	{
		return mWrapped.getText(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #130 <Method CharSequence TypedArray.getText(int)>
	//    4    8:areturn         
	}

	public CharSequence[] getTextArray(int i)
	{
		return mWrapped.getTextArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #134 <Method CharSequence[] TypedArray.getTextArray(int)>
	//    4    8:areturn         
	}

	public boolean hasValue(int i)
	{
		return mWrapped.hasValue(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #57  <Method boolean TypedArray.hasValue(int)>
	//    4    8:ireturn         
	}

	public void recycle()
	{
		mWrapped.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:invokevirtual   #137 <Method void TypedArray.recycle()>
	//    3    7:return          
	}

	private final Context mContext;
	private TypedValue mTypedValue;
	private final TypedArray mWrapped;
}
