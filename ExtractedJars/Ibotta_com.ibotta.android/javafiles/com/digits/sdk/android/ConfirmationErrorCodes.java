// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.res.Resources;
import android.util.SparseIntArray;

// Referenced classes of package com.digits.sdk.android:
//			DigitsErrorCodes

class ConfirmationErrorCodes extends DigitsErrorCodes
{

	ConfirmationErrorCodes(Resources resources)
	{
		super(resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void DigitsErrorCodes(Resources)>
		codeIdMap.put(44, R.string.dgts__try_again_confirmation);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field SparseIntArray codeIdMap>
	//    5    9:bipush          44
	//    6   11:getstatic       #18  <Field int R$string.dgts__try_again_confirmation>
	//    7   14:invokevirtual   #24  <Method void SparseIntArray.put(int, int)>
	//    8   17:return          
	}
}
