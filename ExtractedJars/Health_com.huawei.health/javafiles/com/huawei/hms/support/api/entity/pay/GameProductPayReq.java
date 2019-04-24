// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;


// Referenced classes of package com.huawei.hms.support.api.entity.pay:
//			ProductPayRequest

public class GameProductPayReq extends ProductPayRequest
{

	public GameProductPayReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ProductPayRequest()>
	//    2    4:return          
	}

	public GameProductPayReq(ProductPayRequest productpayrequest, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ProductPayRequest()>
		sdkVersionName = "2.6.1.300";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "2.6.1.300">
	//    4    7:putfield        #19  <Field String sdkVersionName>
		cpId = s;
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:putfield        #21  <Field String cpId>
		expireTime = productpayrequest.expireTime;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #24  <Field String ProductPayRequest.expireTime>
	//   11   20:putfield        #25  <Field String expireTime>
		validTime = productpayrequest.validTime;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #29  <Field int ProductPayRequest.validTime>
	//   15   28:putfield        #30  <Field int validTime>
		applicationID = productpayrequest.applicationID;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #33  <Field String ProductPayRequest.applicationID>
	//   19   36:putfield        #34  <Field String applicationID>
		extReserved = productpayrequest.extReserved;
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:getfield        #37  <Field String ProductPayRequest.extReserved>
	//   23   44:putfield        #38  <Field String extReserved>
		merchantId = productpayrequest.merchantId;
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:getfield        #41  <Field String ProductPayRequest.merchantId>
	//   27   52:putfield        #42  <Field String merchantId>
		merchantName = productpayrequest.merchantName;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:getfield        #45  <Field String ProductPayRequest.merchantName>
	//   31   60:putfield        #46  <Field String merchantName>
		requestId = productpayrequest.requestId;
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:getfield        #49  <Field String ProductPayRequest.requestId>
	//   35   68:putfield        #50  <Field String requestId>
		sdkChannel = productpayrequest.sdkChannel;
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:getfield        #53  <Field int ProductPayRequest.sdkChannel>
	//   39   76:putfield        #54  <Field int sdkChannel>
		serviceCatalog = productpayrequest.serviceCatalog;
	//   40   79:aload_0         
	//   41   80:aload_1         
	//   42   81:getfield        #57  <Field String ProductPayRequest.serviceCatalog>
	//   43   84:putfield        #58  <Field String serviceCatalog>
		sign = productpayrequest.sign;
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:getfield        #61  <Field String ProductPayRequest.sign>
	//   47   92:putfield        #62  <Field String sign>
		url = productpayrequest.url;
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:getfield        #65  <Field String ProductPayRequest.url>
	//   51  100:putfield        #66  <Field String url>
		urlVer = productpayrequest.urlVer;
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:getfield        #69  <Field String ProductPayRequest.urlVer>
	//   55  108:putfield        #70  <Field String urlVer>
		productNo = productpayrequest.productNo;
	//   56  111:aload_0         
	//   57  112:aload_1         
	//   58  113:getfield        #73  <Field String ProductPayRequest.productNo>
	//   59  116:putfield        #74  <Field String productNo>
	//   60  119:return          
	}

	public String getChannelId()
	{
		return channelId;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String channelId>
	//    2    4:areturn         
	}

	public String getCpID()
	{
		return cpId;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String cpId>
	//    2    4:areturn         
	}

	public String getSdkVersionName()
	{
		return sdkVersionName;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String sdkVersionName>
	//    2    4:areturn         
	}

	public String channelId;
	public String cpId;
	public String sdkVersionName;
}
