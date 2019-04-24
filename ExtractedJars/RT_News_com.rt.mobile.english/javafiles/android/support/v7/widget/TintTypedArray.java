// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.*;
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

	public int getChangingConfigurations()
	{
		return mWrapped.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:invokevirtual   #53  <Method int TypedArray.getChangingConfigurations()>
	//    3    7:ireturn         
	}

	public int getColor(int i, int j)
	{
		return mWrapped.getColor(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #58  <Method int TypedArray.getColor(int, int)>
	//    5    9:ireturn         
	}

	public ColorStateList getColorStateList(int i)
	{
		if(mWrapped.hasValue(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field TypedArray mWrapped>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #64  <Method boolean TypedArray.hasValue(int)>
	//*   4    8:ifeq            40
		{
			int j = mWrapped.getResourceId(i, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field TypedArray mWrapped>
	//    7   15:iload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #67  <Method int TypedArray.getResourceId(int, int)>
	//   10   20:istore_2        
			if(j != 0)
	//*  11   21:iload_2         
	//*  12   22:ifeq            40
			{
				ColorStateList colorstatelist = AppCompatResources.getColorStateList(mContext, j);
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Context mContext>
	//   15   29:iload_2         
	//   16   30:invokestatic    #72  <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
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
	//   25   45:invokevirtual   #74  <Method ColorStateList TypedArray.getColorStateList(int)>
	//   26   48:areturn         
	}

	public float getDimension(int i, float f)
	{
		return mWrapped.getDimension(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #78  <Method float TypedArray.getDimension(int, float)>
	//    5    9:freturn         
	}

	public int getDimensionPixelOffset(int i, int j)
	{
		return mWrapped.getDimensionPixelOffset(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #81  <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//    5    9:ireturn         
	}

	public int getDimensionPixelSize(int i, int j)
	{
		return mWrapped.getDimensionPixelSize(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #84  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//    5    9:ireturn         
	}

	public Drawable getDrawable(int i)
	{
		if(mWrapped.hasValue(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field TypedArray mWrapped>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #64  <Method boolean TypedArray.hasValue(int)>
	//*   4    8:ifeq            34
		{
			int j = mWrapped.getResourceId(i, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field TypedArray mWrapped>
	//    7   15:iload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #67  <Method int TypedArray.getResourceId(int, int)>
	//   10   20:istore_2        
			if(j != 0)
	//*  11   21:iload_2         
	//*  12   22:ifeq            34
				return AppCompatResources.getDrawable(mContext, j);
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field Context mContext>
	//   15   29:iload_2         
	//   16   30:invokestatic    #89  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   17   33:areturn         
		}
		return mWrapped.getDrawable(i);
	//   18   34:aload_0         
	//   19   35:getfield        #23  <Field TypedArray mWrapped>
	//   20   38:iload_1         
	//   21   39:invokevirtual   #91  <Method Drawable TypedArray.getDrawable(int)>
	//   22   42:areturn         
	}

	public Drawable getDrawableIfKnown(int i)
	{
		if(mWrapped.hasValue(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field TypedArray mWrapped>
	//*   2    4:iload_1         
	//*   3    5:invokevirtual   #64  <Method boolean TypedArray.hasValue(int)>
	//*   4    8:ifeq            38
		{
			i = mWrapped.getResourceId(i, 0);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field TypedArray mWrapped>
	//    7   15:iload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #67  <Method int TypedArray.getResourceId(int, int)>
	//   10   20:istore_1        
			if(i != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            38
				return AppCompatDrawableManager.get().getDrawable(mContext, i, true);
	//   13   25:invokestatic    #98  <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field Context mContext>
	//   16   32:iload_1         
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #101 <Method Drawable AppCompatDrawableManager.getDrawable(Context, int, boolean)>
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
	//    4    6:invokevirtual   #104 <Method float TypedArray.getFloat(int, float)>
	//    5    9:freturn         
	}

	public Typeface getFont(int i, int j, android.support.v4.content.res.ResourcesCompat.FontCallback fontcallback)
	{
		i = mWrapped.getResourceId(i, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #67  <Method int TypedArray.getResourceId(int, int)>
	//    5    9:istore_1        
		if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		if(mTypedValue == null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #110 <Field TypedValue mTypedValue>
	//*  12   20:ifnonnull       34
			mTypedValue = new TypedValue();
	//   13   23:aload_0         
	//   14   24:new             #112 <Class TypedValue>
	//   15   27:dup             
	//   16   28:invokespecial   #113 <Method void TypedValue()>
	//   17   31:putfield        #110 <Field TypedValue mTypedValue>
		return ResourcesCompat.getFont(mContext, i, mTypedValue, j, fontcallback);
	//   18   34:aload_0         
	//   19   35:getfield        #21  <Field Context mContext>
	//   20   38:iload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #110 <Field TypedValue mTypedValue>
	//   23   43:iload_2         
	//   24   44:aload_3         
	//   25   45:invokestatic    #118 <Method Typeface ResourcesCompat.getFont(Context, int, TypedValue, int, android.support.v4.content.res.ResourcesCompat$FontCallback)>
	//   26   48:areturn         
	}

	public float getFraction(int i, int j, int k, float f)
	{
		return mWrapped.getFraction(i, j, k, f);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:fload           4
	//    6    9:invokevirtual   #123 <Method float TypedArray.getFraction(int, int, int, float)>
	//    7   12:freturn         
	}

	public int getIndex(int i)
	{
		return mWrapped.getIndex(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #127 <Method int TypedArray.getIndex(int)>
	//    4    8:ireturn         
	}

	public int getIndexCount()
	{
		return mWrapped.getIndexCount();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:invokevirtual   #130 <Method int TypedArray.getIndexCount()>
	//    3    7:ireturn         
	}

	public int getInt(int i, int j)
	{
		return mWrapped.getInt(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #133 <Method int TypedArray.getInt(int, int)>
	//    5    9:ireturn         
	}

	public int getInteger(int i, int j)
	{
		return mWrapped.getInteger(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #136 <Method int TypedArray.getInteger(int, int)>
	//    5    9:ireturn         
	}

	public int getLayoutDimension(int i, int j)
	{
		return mWrapped.getLayoutDimension(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #139 <Method int TypedArray.getLayoutDimension(int, int)>
	//    5    9:ireturn         
	}

	public int getLayoutDimension(int i, String s)
	{
		return mWrapped.getLayoutDimension(i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #142 <Method int TypedArray.getLayoutDimension(int, String)>
	//    5    9:ireturn         
	}

	public String getNonResourceString(int i)
	{
		return mWrapped.getNonResourceString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #146 <Method String TypedArray.getNonResourceString(int)>
	//    4    8:areturn         
	}

	public String getPositionDescription()
	{
		return mWrapped.getPositionDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:invokevirtual   #150 <Method String TypedArray.getPositionDescription()>
	//    3    7:areturn         
	}

	public int getResourceId(int i, int j)
	{
		return mWrapped.getResourceId(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #67  <Method int TypedArray.getResourceId(int, int)>
	//    5    9:ireturn         
	}

	public Resources getResources()
	{
		return mWrapped.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:invokevirtual   #154 <Method Resources TypedArray.getResources()>
	//    3    7:areturn         
	}

	public String getString(int i)
	{
		return mWrapped.getString(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #157 <Method String TypedArray.getString(int)>
	//    4    8:areturn         
	}

	public CharSequence getText(int i)
	{
		return mWrapped.getText(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #161 <Method CharSequence TypedArray.getText(int)>
	//    4    8:areturn         
	}

	public CharSequence[] getTextArray(int i)
	{
		return mWrapped.getTextArray(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #165 <Method CharSequence[] TypedArray.getTextArray(int)>
	//    4    8:areturn         
	}

	public int getType(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #172 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return mWrapped.getType(i);
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field TypedArray mWrapped>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #174 <Method int TypedArray.getType(int)>
	//    7   16:ireturn         
		if(mTypedValue == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #110 <Field TypedValue mTypedValue>
	//*  10   21:ifnonnull       35
			mTypedValue = new TypedValue();
	//   11   24:aload_0         
	//   12   25:new             #112 <Class TypedValue>
	//   13   28:dup             
	//   14   29:invokespecial   #113 <Method void TypedValue()>
	//   15   32:putfield        #110 <Field TypedValue mTypedValue>
		mWrapped.getValue(i, mTypedValue);
	//   16   35:aload_0         
	//   17   36:getfield        #23  <Field TypedArray mWrapped>
	//   18   39:iload_1         
	//   19   40:aload_0         
	//   20   41:getfield        #110 <Field TypedValue mTypedValue>
	//   21   44:invokevirtual   #178 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   22   47:pop             
		return mTypedValue.type;
	//   23   48:aload_0         
	//   24   49:getfield        #110 <Field TypedValue mTypedValue>
	//   25   52:getfield        #181 <Field int TypedValue.type>
	//   26   55:ireturn         
	}

	public boolean getValue(int i, TypedValue typedvalue)
	{
		return mWrapped.getValue(i, typedvalue);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #178 <Method boolean TypedArray.getValue(int, TypedValue)>
	//    5    9:ireturn         
	}

	public boolean hasValue(int i)
	{
		return mWrapped.hasValue(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #64  <Method boolean TypedArray.hasValue(int)>
	//    4    8:ireturn         
	}

	public int length()
	{
		return mWrapped.length();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:invokevirtual   #184 <Method int TypedArray.length()>
	//    3    7:ireturn         
	}

	public TypedValue peekValue(int i)
	{
		return mWrapped.peekValue(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #188 <Method TypedValue TypedArray.peekValue(int)>
	//    4    8:areturn         
	}

	public void recycle()
	{
		mWrapped.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TypedArray mWrapped>
	//    2    4:invokevirtual   #191 <Method void TypedArray.recycle()>
	//    3    7:return          
	}

	private final Context mContext;
	private TypedValue mTypedValue;
	private final TypedArray mWrapped;
}
