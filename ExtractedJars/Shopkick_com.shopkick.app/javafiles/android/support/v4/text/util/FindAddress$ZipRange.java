// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text.util;


// Referenced classes of package android.support.v4.text.util:
//			FindAddress

private static class FindAddress$ZipRange
{

	boolean matches(String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = Integer.parseInt(s.substring(0, 2));
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:iconst_2        
	//    5    5:invokevirtual   #34  <Method String String.substring(int, int)>
	//    6    8:invokestatic    #40  <Method int Integer.parseInt(String)>
	//    7   11:istore_2        
		if(mLow <= i && i <= mHigh || i == mException1 || i == mException2)
	//*   8   12:aload_0         
	//*   9   13:getfield        #19  <Field int mLow>
	//*  10   16:iload_2         
	//*  11   17:icmpgt          28
	//*  12   20:iload_2         
	//*  13   21:aload_0         
	//*  14   22:getfield        #21  <Field int mHigh>
	//*  15   25:icmple          44
	//*  16   28:iload_2         
	//*  17   29:aload_0         
	//*  18   30:getfield        #23  <Field int mException1>
	//*  19   33:icmpeq          44
	//*  20   36:iload_2         
	//*  21   37:aload_0         
	//*  22   38:getfield        #25  <Field int mException2>
	//*  23   41:icmpne          46
			flag = true;
	//   24   44:iconst_1        
	//   25   45:istore_3        
		return flag;
	//   26   46:iload_3         
	//   27   47:ireturn         
	}

	int mException1;
	int mException2;
	int mHigh;
	int mLow;

	FindAddress$ZipRange(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mLow = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int mLow>
		mHigh = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int mHigh>
		mException1 = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int mException1>
		mException2 = k;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #25  <Field int mException2>
	//   14   24:return          
	}
}
