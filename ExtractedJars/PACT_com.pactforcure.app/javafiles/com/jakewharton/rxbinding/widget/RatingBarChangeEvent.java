// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class RatingBarChangeEvent extends ViewEvent
{

	private RatingBarChangeEvent(RatingBar ratingbar, float f, boolean flag)
	{
		super(((android.view.View) (ratingbar)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void ViewEvent(android.view.View)>
		rating = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #17  <Field float rating>
		fromUser = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #19  <Field boolean fromUser>
	//    9   15:return          
	}

	public static RatingBarChangeEvent create(RatingBar ratingbar, float f, boolean flag)
	{
		return new RatingBarChangeEvent(ratingbar, f, flag);
	//    0    0:new             #2   <Class RatingBarChangeEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #26  <Method void RatingBarChangeEvent(RatingBar, float, boolean)>
	//    6   10:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof RatingBarChangeEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class RatingBarChangeEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((RatingBarChangeEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class RatingBarChangeEvent>
	//   12   20:astore_1        
			if(((RatingBarChangeEvent) (obj)).view() != view() || ((RatingBarChangeEvent) (obj)).rating != rating || ((RatingBarChangeEvent) (obj)).fromUser != fromUser)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #33  <Method android.view.View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #33  <Method android.view.View view()>
	//*  17   29:if_acmpne       55
	//*  18   32:aload_1         
	//*  19   33:getfield        #17  <Field float rating>
	//*  20   36:aload_0         
	//*  21   37:getfield        #17  <Field float rating>
	//*  22   40:fcmpl           
	//*  23   41:ifne            55
	//*  24   44:aload_1         
	//*  25   45:getfield        #19  <Field boolean fromUser>
	//*  26   48:aload_0         
	//*  27   49:getfield        #19  <Field boolean fromUser>
	//*  28   52:icmpeq          5
				return false;
	//   29   55:iconst_0        
	//   30   56:ireturn         
		}
		return true;
	}

	public boolean fromUser()
	{
		return fromUser;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean fromUser>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		int j = ((Object) ((RatingBar)view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method android.view.View view()>
	//    2    4:checkcast       #38  <Class RatingBar>
	//    3    7:invokevirtual   #42  <Method int Object.hashCode()>
	//    4   10:istore_2        
		int k = Float.floatToIntBits(rating);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field float rating>
	//    7   15:invokestatic    #48  <Method int Float.floatToIntBits(float)>
	//    8   18:istore_3        
		int i;
		if(fromUser)
	//*   9   19:aload_0         
	//*  10   20:getfield        #19  <Field boolean fromUser>
	//*  11   23:ifeq            44
			i = 1;
	//   12   26:iconst_1        
	//   13   27:istore_1        
		else
	//*  14   28:iload_2         
	//*  15   29:sipush          629
	//*  16   32:iadd            
	//*  17   33:bipush          37
	//*  18   35:imul            
	//*  19   36:iload_3         
	//*  20   37:iadd            
	//*  21   38:bipush          37
	//*  22   40:imul            
	//*  23   41:iload_1         
	//*  24   42:iadd            
	//*  25   43:ireturn         
			i = 0;
	//   26   44:iconst_0        
	//   27   45:istore_1        
		return ((j + 629) * 37 + k) * 37 + i;
	//*  28   46:goto            28
	}

	public float rating()
	{
		return rating;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field float rating>
	//    2    4:freturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("RatingBarChangeEvent{view=").append(((Object) (view()))).append(", rating=").append(rating).append(", fromUser=").append(fromUser).append('}').toString();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void StringBuilder()>
	//    3    7:ldc1            #58  <String "RatingBarChangeEvent{view=">
	//    4    9:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #33  <Method android.view.View view()>
	//    7   16:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #67  <String ", rating=">
	//    9   21:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field float rating>
	//   12   28:invokevirtual   #70  <Method StringBuilder StringBuilder.append(float)>
	//   13   31:ldc1            #72  <String ", fromUser=">
	//   14   33:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #19  <Field boolean fromUser>
	//   17   40:invokevirtual   #75  <Method StringBuilder StringBuilder.append(boolean)>
	//   18   43:bipush          125
	//   19   45:invokevirtual   #78  <Method StringBuilder StringBuilder.append(char)>
	//   20   48:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private final boolean fromUser;
	private final float rating;
}
