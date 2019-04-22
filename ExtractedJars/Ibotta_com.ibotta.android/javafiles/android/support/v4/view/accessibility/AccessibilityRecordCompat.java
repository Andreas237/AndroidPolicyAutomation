// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public class AccessibilityRecordCompat
{

	public static void setMaxScrollX(AccessibilityRecord accessibilityrecord, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          15
	//*   2    5:icmplt          13
			accessibilityrecord.setMaxScrollX(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #19  <Method void AccessibilityRecord.setMaxScrollX(int)>
	//    6   13:return          
	}

	public static void setMaxScrollY(AccessibilityRecord accessibilityrecord, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          15
	//*   2    5:icmplt          13
			accessibilityrecord.setMaxScrollY(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #23  <Method void AccessibilityRecord.setMaxScrollY(int)>
	//    6   13:return          
	}

	public static void setSource(AccessibilityRecord accessibilityrecord, View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
			accessibilityrecord.setSource(view, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokevirtual   #29  <Method void AccessibilityRecord.setSource(View, int)>
	//    7   14:return          
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
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #37  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AccessibilityRecordCompat)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AccessibilityRecordCompat>
	//   18   30:astore_1        
		AccessibilityRecord accessibilityrecord = mRecord;
	//   19   31:aload_0         
	//   20   32:getfield        #39  <Field AccessibilityRecord mRecord>
	//   21   35:astore_2        
		if(accessibilityrecord == null)
	//*  22   36:aload_2         
	//*  23   37:ifnonnull       49
		{
			if(((AccessibilityRecordCompat) (obj)).mRecord != null)
	//*  24   40:aload_1         
	//*  25   41:getfield        #39  <Field AccessibilityRecord mRecord>
	//*  26   44:ifnull          62
				return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		} else
		if(!((Object) (accessibilityrecord)).equals(((Object) (((AccessibilityRecordCompat) (obj)).mRecord))))
	//*  29   49:aload_2         
	//*  30   50:aload_1         
	//*  31   51:getfield        #39  <Field AccessibilityRecord mRecord>
	//*  32   54:invokevirtual   #41  <Method boolean Object.equals(Object)>
	//*  33   57:ifne            62
			return false;
	//   34   60:iconst_0        
	//   35   61:ireturn         
		return true;
	//   36   62:iconst_1        
	//   37   63:ireturn         
	}

	public int hashCode()
	{
		AccessibilityRecord accessibilityrecord = mRecord;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AccessibilityRecord mRecord>
	//    2    4:astore_1        
		if(accessibilityrecord == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return ((Object) (accessibilityrecord)).hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #46  <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	private final AccessibilityRecord mRecord;
}
