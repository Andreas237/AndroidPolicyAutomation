// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;

// Referenced classes of package com.facebook.appevents.internal:
//			AutomaticAnalyticsLogger

private static class AutomaticAnalyticsLogger$PurchaseLoggingParameters
{

	Currency currency;
	Bundle param;
	BigDecimal purchaseAmount;

	AutomaticAnalyticsLogger$PurchaseLoggingParameters(BigDecimal bigdecimal, Currency currency1, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		purchaseAmount = bigdecimal;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field BigDecimal purchaseAmount>
		currency = currency1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field Currency currency>
		param = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Bundle param>
	//   11   19:return          
	}
}
