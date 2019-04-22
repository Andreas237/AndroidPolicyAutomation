// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;

public class MaterialResources
{

	public static ColorStateList getColorStateList(Context context, TypedArray typedarray, int i)
	{
		if(typedarray.hasValue(i))
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #18  <Method boolean TypedArray.hasValue(int)>
	//*   3    5:ifeq            31
		{
			int j = typedarray.getResourceId(i, 0);
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #22  <Method int TypedArray.getResourceId(int, int)>
	//    8   14:istore_3        
			if(j != 0)
	//*   9   15:iload_3         
	//*  10   16:ifeq            31
			{
				context = ((Context) (AppCompatResources.getColorStateList(context, j)));
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:invokestatic    #27  <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   14   24:astore_0        
				if(context != null)
	//*  15   25:aload_0         
	//*  16   26:ifnull          31
					return ((ColorStateList) (context));
	//   17   29:aload_0         
	//   18   30:areturn         
			}
		}
		return typedarray.getColorStateList(i);
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #30  <Method ColorStateList TypedArray.getColorStateList(int)>
	//   22   36:areturn         
	}

	public static Drawable getDrawable(Context context, TypedArray typedarray, int i)
	{
		if(typedarray.hasValue(i))
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #18  <Method boolean TypedArray.hasValue(int)>
	//*   3    5:ifeq            31
		{
			int j = typedarray.getResourceId(i, 0);
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #22  <Method int TypedArray.getResourceId(int, int)>
	//    8   14:istore_3        
			if(j != 0)
	//*   9   15:iload_3         
	//*  10   16:ifeq            31
			{
				context = ((Context) (AppCompatResources.getDrawable(context, j)));
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:invokestatic    #38  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   14   24:astore_0        
				if(context != null)
	//*  15   25:aload_0         
	//*  16   26:ifnull          31
					return ((Drawable) (context));
	//   17   29:aload_0         
	//   18   30:areturn         
			}
		}
		return typedarray.getDrawable(i);
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #41  <Method Drawable TypedArray.getDrawable(int)>
	//   22   36:areturn         
	}

	static int getIndexWithValue(TypedArray typedarray, int i, int j)
	{
		if(typedarray.hasValue(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokevirtual   #18  <Method boolean TypedArray.hasValue(int)>
	//*   3    5:ifeq            10
			return i;
	//    4    8:iload_1         
	//    5    9:ireturn         
		else
			return j;
	//    6   10:iload_2         
	//    7   11:ireturn         
	}
}
