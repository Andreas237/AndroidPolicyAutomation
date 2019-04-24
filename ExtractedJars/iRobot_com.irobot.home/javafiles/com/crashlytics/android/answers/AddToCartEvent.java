// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.math.BigDecimal;
import java.util.Currency;

// Referenced classes of package com.crashlytics.android.answers:
//			PredefinedEvent, AnswersEventValidator, AnswersAttributes

public class AddToCartEvent extends PredefinedEvent
{

	public AddToCartEvent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void PredefinedEvent()>
	//    2    4:return          
	}

	String getPredefinedType()
	{
		return "addToCart";
	//    0    0:ldc1            #26  <String "addToCart">
	//    1    2:areturn         
	}

	long priceToMicros(BigDecimal bigdecimal)
	{
		return MICRO_CONSTANT.multiply(bigdecimal).longValue();
	//    0    0:getstatic       #38  <Field BigDecimal MICRO_CONSTANT>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #50  <Method BigDecimal BigDecimal.multiply(BigDecimal)>
	//    3    7:invokevirtual   #54  <Method long BigDecimal.longValue()>
	//    4   10:lreturn         
	}

	public AddToCartEvent putCurrency(Currency currency)
	{
		if(!validator.isNull(((Object) (currency)), "currency"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field AnswersEventValidator validator>
	//*   2    4:aload_1         
	//*   3    5:ldc1            #9   <String "currency">
	//*   4    7:invokevirtual   #66  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*   5   10:ifne            26
			predefinedAttributes.put("currency", currency.getCurrencyCode());
	//    6   13:aload_0         
	//    7   14:getfield        #70  <Field AnswersAttributes predefinedAttributes>
	//    8   17:ldc1            #9   <String "currency">
	//    9   19:aload_1         
	//   10   20:invokevirtual   #75  <Method String Currency.getCurrencyCode()>
	//   11   23:invokevirtual   #81  <Method void AnswersAttributes.put(String, String)>
		return this;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public AddToCartEvent putItemId(String s)
	{
		predefinedAttributes.put("itemId", s);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #12  <String "itemId">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #81  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public AddToCartEvent putItemName(String s)
	{
		predefinedAttributes.put("itemName", s);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #15  <String "itemName">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #81  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public AddToCartEvent putItemPrice(BigDecimal bigdecimal)
	{
		if(!validator.isNull(((Object) (bigdecimal)), "itemPrice"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field AnswersEventValidator validator>
	//*   2    4:aload_1         
	//*   3    5:ldc1            #18  <String "itemPrice">
	//*   4    7:invokevirtual   #66  <Method boolean AnswersEventValidator.isNull(Object, String)>
	//*   5   10:ifne            30
			predefinedAttributes.put("itemPrice", ((Number) (Long.valueOf(priceToMicros(bigdecimal)))));
	//    6   13:aload_0         
	//    7   14:getfield        #70  <Field AnswersAttributes predefinedAttributes>
	//    8   17:ldc1            #18  <String "itemPrice">
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #88  <Method long priceToMicros(BigDecimal)>
	//   12   24:invokestatic    #93  <Method Long Long.valueOf(long)>
	//   13   27:invokevirtual   #96  <Method void AnswersAttributes.put(String, Number)>
		return this;
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public AddToCartEvent putItemType(String s)
	{
		predefinedAttributes.put("itemType", s);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field AnswersAttributes predefinedAttributes>
	//    2    4:ldc1            #21  <String "itemType">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #81  <Method void AnswersAttributes.put(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	static final String CURRENCY_ATTRIBUTE = "currency";
	static final String ITEM_ID_ATTRIBUTE = "itemId";
	static final String ITEM_NAME_ATTRIBUTE = "itemName";
	static final String ITEM_PRICE_ATTRIBUTE = "itemPrice";
	static final String ITEM_TYPE_ATTRIBUTE = "itemType";
	static final BigDecimal MICRO_CONSTANT = BigDecimal.valueOf(0xf4240L);
	static final String TYPE = "addToCart";

	static 
	{
	//    0    0:ldc2w           #29  <Long 0xf4240L>
	//    1    3:invokestatic    #36  <Method BigDecimal BigDecimal.valueOf(long)>
	//    2    6:putstatic       #38  <Field BigDecimal MICRO_CONSTANT>
	//*   3    9:return          
	}
}
