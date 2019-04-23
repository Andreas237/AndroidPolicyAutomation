// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

public final class DisplayCutoutCompat
{

	public DisplayCutoutCompat(Rect rect, List list)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          21
			rect = ((Rect) (new DisplayCutout(rect, list)));
	//    3    8:new             #16  <Class DisplayCutout>
	//    4   11:dup             
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:invokespecial   #18  <Method void DisplayCutout(Rect, List)>
	//    8   17:astore_1        
		else
	//*   9   18:goto            23
			rect = null;
	//   10   21:aconst_null     
	//   11   22:astore_1        
		this(((Object) (rect)));
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #21  <Method void DisplayCutoutCompat(Object)>
	//   15   28:return          
	}

	private DisplayCutoutCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		mDisplayCutout = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Object mDisplayCutout>
	//    5    9:return          
	}

	static DisplayCutoutCompat wrap(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new DisplayCutoutCompat(obj);
	//    4    6:new             #2   <Class DisplayCutoutCompat>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void DisplayCutoutCompat(Object)>
	//    8   14:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #37  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((DisplayCutoutCompat)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DisplayCutoutCompat>
	//   16   28:astore_1        
			Object obj1 = mDisplayCutout;
	//   17   29:aload_0         
	//   18   30:getfield        #29  <Field Object mDisplayCutout>
	//   19   33:astore_2        
			if(obj1 == null)
	//*  20   34:aload_2         
	//*  21   35:ifnonnull       49
				return ((DisplayCutoutCompat) (obj)).mDisplayCutout == null;
	//   22   38:aload_1         
	//   23   39:getfield        #29  <Field Object mDisplayCutout>
	//   24   42:ifnonnull       47
	//   25   45:iconst_1        
	//   26   46:ireturn         
	//   27   47:iconst_0        
	//   28   48:ireturn         
			else
				return obj1.equals(((DisplayCutoutCompat) (obj)).mDisplayCutout);
	//   29   49:aload_2         
	//   30   50:aload_1         
	//   31   51:getfield        #29  <Field Object mDisplayCutout>
	//   32   54:invokevirtual   #39  <Method boolean Object.equals(Object)>
	//   33   57:ireturn         
		} else
		{
			return false;
	//   34   58:iconst_0        
	//   35   59:ireturn         
		}
	}

	public List getBoundingRects()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          19
			return ((DisplayCutout)mDisplayCutout).getBoundingRects();
	//    3    8:aload_0         
	//    4    9:getfield        #29  <Field Object mDisplayCutout>
	//    5   12:checkcast       #16  <Class DisplayCutout>
	//    6   15:invokevirtual   #43  <Method List DisplayCutout.getBoundingRects()>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public int getSafeInsetBottom()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          19
			return ((DisplayCutout)mDisplayCutout).getSafeInsetBottom();
	//    3    8:aload_0         
	//    4    9:getfield        #29  <Field Object mDisplayCutout>
	//    5   12:checkcast       #16  <Class DisplayCutout>
	//    6   15:invokevirtual   #48  <Method int DisplayCutout.getSafeInsetBottom()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSafeInsetLeft()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          19
			return ((DisplayCutout)mDisplayCutout).getSafeInsetLeft();
	//    3    8:aload_0         
	//    4    9:getfield        #29  <Field Object mDisplayCutout>
	//    5   12:checkcast       #16  <Class DisplayCutout>
	//    6   15:invokevirtual   #51  <Method int DisplayCutout.getSafeInsetLeft()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSafeInsetRight()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          19
			return ((DisplayCutout)mDisplayCutout).getSafeInsetRight();
	//    3    8:aload_0         
	//    4    9:getfield        #29  <Field Object mDisplayCutout>
	//    5   12:checkcast       #16  <Class DisplayCutout>
	//    6   15:invokevirtual   #54  <Method int DisplayCutout.getSafeInsetRight()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSafeInsetTop()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          19
			return ((DisplayCutout)mDisplayCutout).getSafeInsetTop();
	//    3    8:aload_0         
	//    4    9:getfield        #29  <Field Object mDisplayCutout>
	//    5   12:checkcast       #16  <Class DisplayCutout>
	//    6   15:invokevirtual   #57  <Method int DisplayCutout.getSafeInsetTop()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int hashCode()
	{
		Object obj = mDisplayCutout;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mDisplayCutout>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return obj.hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #60  <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DisplayCutoutCompat{");
	//    4    8:aload_1         
	//    5    9:ldc1            #67  <String "DisplayCutoutCompat{">
	//    6   11:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mDisplayCutout);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #29  <Field Object mDisplayCutout>
	//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append("}");
	//   13   24:aload_1         
	//   14   25:ldc1            #76  <String "}">
	//   15   27:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	private final Object mDisplayCutout;
}
