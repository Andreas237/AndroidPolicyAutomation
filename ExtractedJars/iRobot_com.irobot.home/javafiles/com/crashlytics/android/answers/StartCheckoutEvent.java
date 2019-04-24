// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersEventValidator, AnswersAttributes

public class StartCheckoutEvent extends PredefinedEvent
{

	public StartCheckoutEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "startCheckout";
	//    0    0:ldc1            #20  <String "startCheckout">
	//    1    2:areturn         
	}

	long priceToMicros(BigDecimal bigdecimal)
	{
		return MICRO_CONSTANT.multiply(bigdecimal).longValue();
	//    0    0:getstatic       #32  <Field BigDecimal MICRO_CONSTANT>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #44  <Method BigDecimal BigDecimal.multiply(BigDecimal)>
	//    3    7:invokevirtual   #48  <Method long BigDecimal.longValue()>
	//    4   10:lreturn         
	}

	public StartCheckoutEvent putCurrency(Currency currency)
	{
		if(!validator.isNull(((Object) (currency)), "currency"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field AnswersEventValidator validator>
	//*   2    4:aload_1         
	//*   3    5:ldc1            #9   <String "currency">
	//*   4    7:invokevirtual   #60  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*   5   10:ifne            26
			predefinedAttributes.put("currency", currency.getCurrencyCode());
	//    6   13:aload_0         
	//    7   14:getfield        #64  <Field AnswersAttributes predefinedAttributes>
	//    8   17:ldc1            #9   <String "currency">
	//    9   19:aload_1         
	//   10   20:invokevirtual   #69  <Method String Currency.getCurrencyCode()>
	//   11   23:invokevirtual   #75  <Method void AnswersAttributes.put(String, String)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public StartCheckoutEvent putItemCount(int i)
	{
		predefinedAttributes.put("itemCount", ((Number) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #12  <String "itemCount">
	//    3    6:iload_1         
	//    4    7:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//    5   10:invokevirtual   #85  <Method void AnswersAttributes.put(String, Number)>
		return this;
	//    6   13:aload_0         
	//    7   14:areturn         
	}

	public StartCheckoutEvent putTotalPrice(BigDecimal bigdecimal)
	{
		if(!validator.isNull(((Object) (bigdecimal)), "totalPrice"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field AnswersEventValidator validator>
	//*   2    4:aload_1         
	//*   3    5:ldc1            #17  <String "totalPrice">
	//*   4    7:invokevirtual   #60  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*   5   10:ifne            30
			predefinedAttributes.put("totalPrice", ((Number) (Long.valueOf(priceToMicros(bigdecimal)))));
	//    6   13:aload_0         
	//    7   14:getfield        #64  <Field AnswersAttributes predefinedAttributes>
	//    8   17:ldc1            #17  <String "totalPrice">
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #89  <Method long priceToMicros(BigDecimal)>
	//   12   24:invokestatic    #94  <Method Long Long.valueOf(long)>
	//   13   27:invokevirtual   #85  <Method void AnswersAttributes.put(String, Number)>
		return this;
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	static final String CURRENCY_ATTRIBUTE = "currency";
	static final String ITEM_COUNT_ATTRIBUTE = "itemCount";
	static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(0xf4240L);
	static final String TOTAL_PRICE_ATTRIBUTE = "totalPrice";
	static final String TYPE = "startCheckout";

	static 
	{
	//    0    0:ldc2w           #23  <Long 0xf4240L>
	//    1    3:invokestatic    #30  <Method BigDecimal BigDecimal.valueOf(long)>
	//    2    6:putstatic       #32  <Field BigDecimal MICRO_CONSTANT>
	//*   3    9:return          
	}
}
