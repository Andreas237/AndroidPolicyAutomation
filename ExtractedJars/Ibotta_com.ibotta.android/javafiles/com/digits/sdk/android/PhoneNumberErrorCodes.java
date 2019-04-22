// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.res.Resources;
import android.util.SparseIntArray;

// Referenced classes of package com.digits.sdk.android:
//			DigitsErrorCodes

class PhoneNumberErrorCodes extends DigitsErrorCodes
{

	PhoneNumberErrorCodes(Resources resources)
	{
		super(resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void DigitsErrorCodes(Resources)>
		codeIdMap.put(44, R.string.dgts__try_again_phone_number);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field SparseIntArray codeIdMap>
	//    5    9:bipush          44
	//    6   11:getstatic       #18  <Field int R$string.dgts__try_again_phone_number>
	//    7   14:invokevirtual   #24  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(300, R.string.dgts__try_again_phone_number);
	//    8   17:aload_0         
	//    9   18:getfield        #12  <Field SparseIntArray codeIdMap>
	//   10   21:sipush          300
	//   11   24:getstatic       #18  <Field int R$string.dgts__try_again_phone_number>
	//   12   27:invokevirtual   #24  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(303, R.string.dgts__try_again_phone_number);
	//   13   30:aload_0         
	//   14   31:getfield        #12  <Field SparseIntArray codeIdMap>
	//   15   34:sipush          303
	//   16   37:getstatic       #18  <Field int R$string.dgts__try_again_phone_number>
	//   17   40:invokevirtual   #24  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(285, R.string.dgts__confirmation_error_alternative);
	//   18   43:aload_0         
	//   19   44:getfield        #12  <Field SparseIntArray codeIdMap>
	//   20   47:sipush          285
	//   21   50:getstatic       #27  <Field int R$string.dgts__confirmation_error_alternative>
	//   22   53:invokevirtual   #24  <Method void SparseIntArray.put(int, int)>
		codeIdMap.put(286, R.string.dgts__unsupported_operator_error);
	//   23   56:aload_0         
	//   24   57:getfield        #12  <Field SparseIntArray codeIdMap>
	//   25   60:sipush          286
	//   26   63:getstatic       #30  <Field int R$string.dgts__unsupported_operator_error>
	//   27   66:invokevirtual   #24  <Method void SparseIntArray.put(int, int)>
	//   28   69:return          
	}
}
