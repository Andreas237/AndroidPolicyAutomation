// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.text.TextUtils;

// Referenced classes of package android.support.v7.preference:
//			PreferenceGroupAdapter

private static class PreferenceGroupAdapter$PreferenceLayout
{

	public boolean equals(Object obj)
	{
		if(obj instanceof PreferenceGroupAdapter$PreferenceLayout)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class PreferenceGroupAdapter$PreferenceLayout>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class PreferenceGroupAdapter$PreferenceLayout>
	//*   7   13:astore_1        
			if(resId == ((PreferenceGroupAdapter$PreferenceLayout) (obj = ((Object) ((PreferenceGroupAdapter$PreferenceLayout)obj)))).resId && widgetResId == ((PreferenceGroupAdapter$PreferenceLayout) (obj)).widgetResId && TextUtils.equals(((CharSequence) (name)), ((CharSequence) (((PreferenceGroupAdapter$PreferenceLayout) (obj)).name))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #20  <Field int resId>
	//*  10   18:aload_1         
	//*  11   19:getfield        #20  <Field int resId>
	//*  12   22:icmpne          7
	//*  13   25:aload_0         
	//*  14   26:getfield        #22  <Field int widgetResId>
	//*  15   29:aload_1         
	//*  16   30:getfield        #22  <Field int widgetResId>
	//*  17   33:icmpne          7
	//*  18   36:aload_0         
	//*  19   37:getfield        #24  <Field String name>
	//*  20   40:aload_1         
	//*  21   41:getfield        #24  <Field String name>
	//*  22   44:invokestatic    #39  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*  23   47:ifeq            7
				return true;
	//   24   50:iconst_1        
	//   25   51:ireturn         
		return false;
	}

	public int hashCode()
	{
		return ((resId + 527) * 31 + widgetResId) * 31 + name.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int resId>
	//    2    4:sipush          527
	//    3    7:iadd            
	//    4    8:bipush          31
	//    5   10:imul            
	//    6   11:aload_0         
	//    7   12:getfield        #22  <Field int widgetResId>
	//    8   15:iadd            
	//    9   16:bipush          31
	//   10   18:imul            
	//   11   19:aload_0         
	//   12   20:getfield        #24  <Field String name>
	//   13   23:invokevirtual   #45  <Method int String.hashCode()>
	//   14   26:iadd            
	//   15   27:ireturn         
	}

	private String name;
	private int resId;
	private int widgetResId;


/*
	static String access$102(PreferenceGroupAdapter$PreferenceLayout preferencegroupadapter$preferencelayout, String s)
	{
		preferencegroupadapter$preferencelayout.name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String name>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static int access$200(PreferenceGroupAdapter$PreferenceLayout preferencegroupadapter$preferencelayout)
	{
		return preferencegroupadapter$preferencelayout.resId;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int resId>
	//    2    4:ireturn         
	}

*/


/*
	static int access$202(PreferenceGroupAdapter$PreferenceLayout preferencegroupadapter$preferencelayout, int i)
	{
		preferencegroupadapter$preferencelayout.resId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int resId>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static int access$300(PreferenceGroupAdapter$PreferenceLayout preferencegroupadapter$preferencelayout)
	{
		return preferencegroupadapter$preferencelayout.widgetResId;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int widgetResId>
	//    2    4:ireturn         
	}

*/


/*
	static int access$302(PreferenceGroupAdapter$PreferenceLayout preferencegroupadapter$preferencelayout, int i)
	{
		preferencegroupadapter$preferencelayout.widgetResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int widgetResId>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	public PreferenceGroupAdapter$PreferenceLayout()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public PreferenceGroupAdapter$PreferenceLayout(PreferenceGroupAdapter$PreferenceLayout preferencegroupadapter$preferencelayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		resId = preferencegroupadapter$preferencelayout.resId;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #20  <Field int resId>
	//    5    9:putfield        #20  <Field int resId>
		widgetResId = preferencegroupadapter$preferencelayout.widgetResId;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #22  <Field int widgetResId>
	//    9   17:putfield        #22  <Field int widgetResId>
		name = preferencegroupadapter$preferencelayout.name;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #24  <Field String name>
	//   13   25:putfield        #24  <Field String name>
	//   14   28:return          
	}
}
