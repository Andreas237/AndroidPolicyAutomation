// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;


// Referenced classes of package com.huawei.hms.support.api.entity.pay:
//			PurchaseInfoRequest

public class PurchaseInfoInnerRequest extends PurchaseInfoRequest
{

	public PurchaseInfoInnerRequest()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PurchaseInfoRequest()>
		hmsSdkVersionName = "2.6.1.300";
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <String "2.6.1.300">
	//    4    7:putfield        #15  <Field String hmsSdkVersionName>
	//    5   10:return          
	}

	public PurchaseInfoInnerRequest(PurchaseInfoRequest purchaseinforequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PurchaseInfoRequest()>
		setSign(purchaseinforequest.getSign());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #21  <Method String PurchaseInfoRequest.getSign()>
	//    5    9:invokevirtual   #25  <Method void setSign(String)>
		setTs(purchaseinforequest.getTs());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method long PurchaseInfoRequest.getTs()>
	//    9   17:invokevirtual   #33  <Method void setTs(long)>
		setPageNo(purchaseinforequest.getPageNo());
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #36  <Method long PurchaseInfoRequest.getPageNo()>
	//   13   25:invokevirtual   #39  <Method void setPageNo(long)>
		setPriceType(purchaseinforequest.getPriceType());
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #42  <Method String PurchaseInfoRequest.getPriceType()>
	//   17   33:invokevirtual   #45  <Method void setPriceType(String)>
		setAppId(purchaseinforequest.getAppId());
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #48  <Method String PurchaseInfoRequest.getAppId()>
	//   21   41:invokevirtual   #51  <Method void setAppId(String)>
		setMerchantId(purchaseinforequest.getMerchantId());
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #54  <Method String PurchaseInfoRequest.getMerchantId()>
	//   25   49:invokevirtual   #57  <Method void setMerchantId(String)>
		setProductId(purchaseinforequest.getProductId());
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #60  <Method String PurchaseInfoRequest.getProductId()>
	//   29   57:invokevirtual   #63  <Method void setProductId(String)>
		hmsSdkVersionName = "2.6.1.300";
	//   30   60:aload_0         
	//   31   61:ldc1            #13  <String "2.6.1.300">
	//   32   63:putfield        #15  <Field String hmsSdkVersionName>
	//   33   66:return          
	}

	public String getHmsSdkVersionName()
	{
		return hmsSdkVersionName;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field String hmsSdkVersionName>
	//    2    4:areturn         
	}

	public void setHmsSdkVersionName(String s)
	{
		hmsSdkVersionName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field String hmsSdkVersionName>
	//    3    5:return          
	}

	private String hmsSdkVersionName;
}
