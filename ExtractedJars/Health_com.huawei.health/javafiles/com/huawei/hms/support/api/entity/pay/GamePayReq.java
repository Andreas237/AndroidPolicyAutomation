// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hms.support.api.entity.pay;


// Referenced classes of package com.huawei.hms.support.api.entity.pay:
//			PayReq

public class GamePayReq extends PayReq
{

	public GamePayReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void PayReq()>
	//    2    4:return          
	}

	public GamePayReq(PayReq payreq, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void PayReq()>
		sdkVersionName = "2.6.1.300";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "2.6.1.300">
	//    4    7:putfield        #19  <Field String sdkVersionName>
		cpId = s;
	//    5   10:aload_0         
	//    6   11:aload_2         
	//    7   12:putfield        #21  <Field String cpId>
		amount = payreq.amount;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:getfield        #24  <Field String PayReq.amount>
	//   11   20:putfield        #25  <Field String amount>
		country = payreq.country;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:getfield        #28  <Field String PayReq.country>
	//   15   28:putfield        #29  <Field String country>
		currency = payreq.currency;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:getfield        #32  <Field String PayReq.currency>
	//   19   36:putfield        #33  <Field String currency>
		expireTime = payreq.expireTime;
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:getfield        #36  <Field String PayReq.expireTime>
	//   23   44:putfield        #37  <Field String expireTime>
		partnerIDs = payreq.partnerIDs;
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:getfield        #40  <Field String PayReq.partnerIDs>
	//   27   52:putfield        #41  <Field String partnerIDs>
		productDesc = payreq.productDesc;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:getfield        #44  <Field String PayReq.productDesc>
	//   31   60:putfield        #45  <Field String productDesc>
		productName = payreq.productName;
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:getfield        #48  <Field String PayReq.productName>
	//   35   68:putfield        #49  <Field String productName>
		validTime = payreq.validTime;
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:getfield        #53  <Field int PayReq.validTime>
	//   39   76:putfield        #54  <Field int validTime>
		applicationID = payreq.applicationID;
	//   40   79:aload_0         
	//   41   80:aload_1         
	//   42   81:getfield        #57  <Field String PayReq.applicationID>
	//   43   84:putfield        #58  <Field String applicationID>
		merchantName = payreq.merchantName;
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:getfield        #61  <Field String PayReq.merchantName>
	//   47   92:putfield        #62  <Field String merchantName>
		requestId = payreq.requestId;
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:getfield        #65  <Field String PayReq.requestId>
	//   51  100:putfield        #66  <Field String requestId>
		extReserved = payreq.extReserved;
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:getfield        #69  <Field String PayReq.extReserved>
	//   55  108:putfield        #70  <Field String extReserved>
		merchantId = payreq.merchantId;
	//   56  111:aload_0         
	//   57  112:aload_1         
	//   58  113:getfield        #73  <Field String PayReq.merchantId>
	//   59  116:putfield        #74  <Field String merchantId>
		sign = payreq.sign;
	//   60  119:aload_0         
	//   61  120:aload_1         
	//   62  121:getfield        #77  <Field String PayReq.sign>
	//   63  124:putfield        #78  <Field String sign>
		url = payreq.url;
	//   64  127:aload_0         
	//   65  128:aload_1         
	//   66  129:getfield        #81  <Field String PayReq.url>
	//   67  132:putfield        #82  <Field String url>
		sdkChannel = payreq.sdkChannel;
	//   68  135:aload_0         
	//   69  136:aload_1         
	//   70  137:getfield        #85  <Field int PayReq.sdkChannel>
	//   71  140:putfield        #86  <Field int sdkChannel>
		serviceCatalog = payreq.serviceCatalog;
	//   72  143:aload_0         
	//   73  144:aload_1         
	//   74  145:getfield        #89  <Field String PayReq.serviceCatalog>
	//   75  148:putfield        #90  <Field String serviceCatalog>
		urlVer = payreq.urlVer;
	//   76  151:aload_0         
	//   77  152:aload_1         
	//   78  153:getfield        #93  <Field String PayReq.urlVer>
	//   79  156:putfield        #94  <Field String urlVer>
	//   80  159:return          
	}

	public String getChannelId()
	{
		return channelId;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String channelId>
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
