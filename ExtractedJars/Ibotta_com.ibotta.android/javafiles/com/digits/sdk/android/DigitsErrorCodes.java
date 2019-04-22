// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.res.Resources;
import android.util.SparseIntArray;

// Referenced classes of package com.digits.sdk.android:
//			ErrorCodes

class DigitsErrorCodes
	implements ErrorCodes
{

	DigitsErrorCodes(Resources resources1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class SparseIntArray>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:invokespecial   #20  <Method void SparseIntArray(int)>
	//    7   14:putfield        #22  <Field SparseIntArray codeIdMap>
		codeIdMap.put(88, R.string.dgts__confirmation_error_alternative);
	//    8   17:aload_0         
	//    9   18:getfield        #22  <Field SparseIntArray codeIdMap>
	//   10   21:bipush          88
	//   11   23:getstatic       #28  <Field int R$string.dgts__confirmation_error_alternative>
	//   12   26:invokevirtual   #32  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(284, R.string.dgts__network_error);
	//   13   29:aload_0         
	//   14   30:getfield        #22  <Field SparseIntArray codeIdMap>
	//   15   33:sipush          284
	//   16   36:getstatic       #35  <Field int R$string.dgts__network_error>
	//   17   39:invokevirtual   #32  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(302, R.string.dgts__network_error);
	//   18   42:aload_0         
	//   19   43:getfield        #22  <Field SparseIntArray codeIdMap>
	//   20   46:sipush          302
	//   21   49:getstatic       #35  <Field int R$string.dgts__network_error>
	//   22   52:invokevirtual   #32  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(240, R.string.dgts__network_error);
	//   23   55:aload_0         
	//   24   56:getfield        #22  <Field SparseIntArray codeIdMap>
	//   25   59:sipush          240
	//   26   62:getstatic       #35  <Field int R$string.dgts__network_error>
	//   27   65:invokevirtual   #32  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(87, R.string.dgts__network_error);
	//   28   68:aload_0         
	//   29   69:getfield        #22  <Field SparseIntArray codeIdMap>
	//   30   72:bipush          87
	//   31   74:getstatic       #35  <Field int R$string.dgts__network_error>
	//   32   77:invokevirtual   #32  <Method void SparseIntArray.put(int, int)>
		resources = resources1;
	//   33   80:aload_0         
	//   34   81:aload_1         
	//   35   82:putfield        #37  <Field Resources resources>
	//   36   85:return          
	}

	public String getDefaultMessage()
	{
		return resources.getString(R.string.dgts__try_again);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Resources resources>
	//    2    4:getstatic       #43  <Field int R$string.dgts__try_again>
	//    3    7:invokevirtual   #49  <Method String Resources.getString(int)>
	//    4   10:areturn         
	}

	public String getMessage(int i)
	{
		i = codeIdMap.get(i, -1);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SparseIntArray codeIdMap>
	//    2    4:iload_1         
	//    3    5:iconst_m1       
	//    4    6:invokevirtual   #54  <Method int SparseIntArray.get(int, int)>
	//    5    9:istore_1        
		if(i == -1)
	//*   6   10:iload_1         
	//*   7   11:iconst_m1       
	//*   8   12:icmpne          20
			return getDefaultMessage();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #56  <Method String getDefaultMessage()>
	//   11   19:areturn         
		else
			return resources.getString(i);
	//   12   20:aload_0         
	//   13   21:getfield        #37  <Field Resources resources>
	//   14   24:iload_1         
	//   15   25:invokevirtual   #49  <Method String Resources.getString(int)>
	//   16   28:areturn         
	}

	public String getNetworkError()
	{
		return resources.getString(R.string.dgts__network_error);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Resources resources>
	//    2    4:getstatic       #35  <Field int R$string.dgts__network_error>
	//    3    7:invokevirtual   #49  <Method String Resources.getString(int)>
	//    4   10:areturn         
	}

	protected final SparseIntArray codeIdMap = new SparseIntArray(10);
	private final Resources resources;
}
