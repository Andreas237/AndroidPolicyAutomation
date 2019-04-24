.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo$Commonkey;
    }
.end annotation


# static fields
.field public static final FM_PUBLIC_KEY:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj/CoTrOv5Zq7xIBu8+sIi3L2+m/COLzexllpJXgfk+N6/Fb8mAbVGcBsPV409bEiSzZfBrMuIOLuQOIZAS8+gE20PcAWAhreAkExInlwYw6fCHLH5AZy7K+O6Ae0HOX2sCaAIARLrl+w3/Qff/on95u4VDvn/UV0QBRlWPIymHqbYKDx/sgXzBiwhVq9lUFDyWT4pcy3ipTstHi9akM5gGgeD0byqByU271+ParCu46Ds1GpOAcOtFi7fzC1zXKNBEHienx/Ese8KVlWLmdUWlpqJMzSwcz01sAi9R0NjOvu4jONrXgYGBVibDIBR2QXrsTHgHjXsITvP0IuW+h5dwIDAQAB"

.field public static final FM_PUBLIC_KEY_RLS:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj/CoTrOv5Zq7xIBu8+sIi3L2+m/COLzexllpJXgfk+N6/Fb8mAbVGcBsPV409bEiSzZfBrMuIOLuQOIZAS8+gE20PcAWAhreAkExInlwYw6fCHLH5AZy7K+O6Ae0HOX2sCaAIARLrl+w3/Qff/on95u4VDvn/UV0QBRlWPIymHqbYKDx/sgXzBiwhVq9lUFDyWT4pcy3ipTstHi9akM5gGgeD0byqByU271+ParCu46Ds1GpOAcOtFi7fzC1zXKNBEHienx/Ese8KVlWLmdUWlpqJMzSwcz01sAi9R0NjOvu4jONrXgYGBVibDIBR2QXrsTHgHjXsITvP0IuW+h5dwIDAQAB"

.field public static final FM_PUBLIC_KEY_TEST:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA8GYIbs7HirEkBkzGE9QGuX4dlBEcRU6kHVeN5iss/EIKPiBf9KiA73oJoCKmMv7bqv2snCwdMl2Yfb3zUDeJ6cL/CnC/a/dLYHqemIxrJf9fogTgHMPWqTQGvGGqU7kLMqus4ebtAcSdNS7Y2e4twFQscVztY7BVqJTqsIC3cscszr0e8oCRgcBygmjCkLuEv9vLKeZaMj7SZ3CO56VT8m8r3YJYrfeWkmtfEGC5EhwV8CgniasgsOMSe0rf/ztjYbH6SsTWf1swac22EXGpjFoXk9NopZd60iJtKS7BTuTS9VZHl2E/Lfnzb5RZ/KM5AWcvKYjCqv4v2YABx6ZbTwIDAQAB"

.field public static final PAY_RESULT_CODE_CANCLE:Ljava/lang/String; = "30000"

.field public static final PAY_RESULT_CODE_NET_ERROR:Ljava/lang/String; = "30005"

.field public static final PAY_RESULT_FAILED:Ljava/lang/String; = "-1"

.field public static final PAY_RESULT_SUCCESS:Ljava/lang/String; = "0"

.field public static final SH_PUBLIC_KEY:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmPTm2FTz2kv3FBmYKgI3LC6Q/LCmJnwpaGes6yc7LBQ+ptV/J3TfBBNEPjrr5NQy47FmSiA4xbjlNmfTqoacEHAzNmFE4ER3EANeLl4wGPgqCjnVVqpa0OCSPTaycjNcsSHhrCq31GdLWadn4Zs1OcOLtEHnKS/aOuxw+poHKQtIONK3115T28A0/ithK6lEJDOKyIU9Ofyji9V2hG3s2pEV8h5w/hQmFjRF05QnPUjRZQCeh6zcebt+OPQuU/i1EMytC8GgK+2sh+AzNSB/nc5Va3npjul9HYExRklJVLA9sYCf7U24+4G8Z3BqHrdiVPmhdrFqa5OQbqhmyOw3DQIDAQAB"

.field public static final SH_PUBLIC_KEY_RLS:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmPTm2FTz2kv3FBmYKgI3LC6Q/LCmJnwpaGes6yc7LBQ+ptV/J3TfBBNEPjrr5NQy47FmSiA4xbjlNmfTqoacEHAzNmFE4ER3EANeLl4wGPgqCjnVVqpa0OCSPTaycjNcsSHhrCq31GdLWadn4Zs1OcOLtEHnKS/aOuxw+poHKQtIONK3115T28A0/ithK6lEJDOKyIU9Ofyji9V2hG3s2pEV8h5w/hQmFjRF05QnPUjRZQCeh6zcebt+OPQuU/i1EMytC8GgK+2sh+AzNSB/nc5Va3npjul9HYExRklJVLA9sYCf7U24+4G8Z3BqHrdiVPmhdrFqa5OQbqhmyOw3DQIDAQAB"

.field public static final SH_PUBLIC_KEY_TEST:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA8GYIbs7HirEkBkzGE9QGuX4dlBEcRU6kHVeN5iss/EIKPiBf9KiA73oJoCKmMv7bqv2snCwdMl2Yfb3zUDeJ6cL/CnC/a/dLYHqemIxrJf9fogTgHMPWqTQGvGGqU7kLMqus4ebtAcSdNS7Y2e4twFQscVztY7BVqJTqsIC3cscszr0e8oCRgcBygmjCkLuEv9vLKeZaMj7SZ3CO56VT8m8r3YJYrfeWkmtfEGC5EhwV8CgniasgsOMSe0rf/ztjYbH6SsTWf1swac22EXGpjFoXk9NopZd60iJtKS7BTuTS9VZHl2E/Lfnzb5RZ/KM5AWcvKYjCqv4v2YABx6ZbTwIDAQAB"

.field public static final SNB_PUBLIC_KEY:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsiHAdMr5lpTnfz4P6IFb3Cf8F3tTPzVuLZcX/YzcdQAo1eYF5IO6KX+kY2F0HiR8U3zQm30wZjSqtsK8QGXC1gl23Dn9Dkz3/CiK84xoxpNr8zT9ouKcf1XY0EOOLZnZexNsqW9bgwf6sRKXVObT+QPKdsi76lv1cgpB6HKoHgfB5Z+srRgf0GSkPDAbezWmMsbCyt2TpQ6ddcUKFniER0dXoeM5Rtsz+myTWjwVEvQx+dE+aocjt9KttL20XZit6UB5IShDh6kT1gjIJmZyXMljTRm59AOxng8TBph1Ty3769r/qogO8aDCz17l9q8HdYHRZJden9/5aP+DDXKhYwIDAQAB"

.field private static final TAG:Ljava/lang/String; = "PayInfo"


# instance fields
.field private amount:Ljava/lang/String;

.field private applicationID:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private notifyUrl:Ljava/lang/String;

.field private productDesc:Ljava/lang/String;

.field private productName:Ljava/lang/String;

.field private pubKey:Ljava/lang/String;

.field private requestId:Ljava/lang/String;

.field private sdkChannel:I

.field private serviceCatalog:Ljava/lang/String;

.field private sign:Ljava/lang/String;

.field private signType:Ljava/lang/String;

.field private urlVer:Ljava/lang/String;

.field private userID:Ljava/lang/String;

.field private userName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sdkChannel:I

    return-void
.end method

.method public static build(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;
    .locals 2

    .line 271
    if-nez p0, :cond_0

    .line 273
    const-string v0, "build PayInfo err, applyOrder is null!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 274
    const/4 v0, 0x0

    return-object v0

    .line 277
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;-><init>()V

    .line 278
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->setRequestId(Ljava/lang/String;)V

    .line 279
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getAmount()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->amount:Ljava/lang/String;

    .line 280
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->applicationID:Ljava/lang/String;

    .line 281
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->notifyUrl:Ljava/lang/String;

    .line 282
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getMerchantName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userName:Ljava/lang/String;

    .line 283
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getSPMerchantId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userID:Ljava/lang/String;

    .line 284
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getSignType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->signType:Ljava/lang/String;

    .line 285
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getSign()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sign:Ljava/lang/String;

    .line 286
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getServiceCatalog()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->serviceCatalog:Ljava/lang/String;

    .line 287
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getProductName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productName:Ljava/lang/String;

    .line 288
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getProductDesc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productDesc:Ljava/lang/String;

    .line 289
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getUrlVer()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->urlVer:Ljava/lang/String;

    .line 290
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getCurrency()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->currency:Ljava/lang/String;

    .line 291
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getSdkChannel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sdkChannel:I

    .line 292
    return-object v1
.end method

.method public static build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;
    .locals 1

    .line 259
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->buildForCommon(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v0

    return-object v0
.end method

.method public static build(Ljava/lang/String;Z)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;
    .locals 1

    .line 263
    if-eqz p1, :cond_0

    .line 264
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->buildForSNB(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v0

    return-object v0

    .line 266
    :cond_0
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->buildForCommon(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    move-result-object v0

    return-object v0
.end method

.method private static buildForCommon(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;
    .locals 6

    .line 396
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildForCommon son = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 398
    const/4 v0, 0x0

    return-object v0

    .line 402
    :cond_0
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;-><init>()V

    .line 404
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 405
    const-string v0, "merchantName"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userName:Ljava/lang/String;

    .line 406
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userName:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    .line 407
    const/4 v0, 0x0

    return-object v0

    .line 409
    :cond_1
    const-string v0, "merchantId"

    :try_start_1
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userID:Ljava/lang/String;

    .line 410
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userID:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v0, :cond_2

    .line 411
    const/4 v0, 0x0

    return-object v0

    .line 413
    :cond_2
    const-string v0, "applicationID"

    :try_start_2
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->applicationID:Ljava/lang/String;

    .line 414
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->applicationID:Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    if-nez v0, :cond_3

    .line 415
    const/4 v0, 0x0

    return-object v0

    .line 417
    :cond_3
    const-string v0, "productName"

    :try_start_3
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productName:Ljava/lang/String;

    .line 418
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productName:Ljava/lang/String;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    if-nez v0, :cond_4

    .line 419
    const/4 v0, 0x0

    return-object v0

    .line 421
    :cond_4
    const-string v0, "amount"

    .line 422
    :try_start_4
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 421
    invoke-static {v0}, Lo/dtk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->amount:Ljava/lang/String;

    .line 423
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->amount:Ljava/lang/String;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    if-nez v0, :cond_5

    .line 424
    const/4 v0, 0x0

    return-object v0

    .line 426
    :cond_5
    const-string v0, "productDesc"

    :try_start_5
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productDesc:Ljava/lang/String;

    .line 427
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productDesc:Ljava/lang/String;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    if-nez v0, :cond_6

    .line 428
    const/4 v0, 0x0

    return-object v0

    .line 430
    :cond_6
    const-string v0, "requestId"

    :try_start_6
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->requestId:Ljava/lang/String;

    .line 431
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->requestId:Ljava/lang/String;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    if-nez v0, :cond_7

    .line 432
    const/4 v0, 0x0

    return-object v0

    .line 434
    :cond_7
    const-string v0, "serviceCatalog"

    :try_start_7
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->serviceCatalog:Ljava/lang/String;

    .line 435
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->serviceCatalog:Ljava/lang/String;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    if-nez v0, :cond_8

    .line 436
    const/4 v0, 0x0

    return-object v0

    .line 438
    :cond_8
    const-string v0, "sign"

    :try_start_8
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sign:Ljava/lang/String;

    .line 439
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sign:Ljava/lang/String;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    if-nez v0, :cond_9

    .line 440
    const/4 v0, 0x0

    return-object v0

    .line 447
    :cond_9
    const-string v0, "RSA256"

    :try_start_9
    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->signType:Ljava/lang/String;

    .line 448
    const-string v0, "url"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->notifyUrl:Ljava/lang/String;

    .line 449
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->notifyUrl:Ljava/lang/String;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    if-nez v0, :cond_a

    .line 450
    const/4 v0, 0x0

    return-object v0

    .line 452
    :cond_a
    const-string v0, "urlver"

    :try_start_a
    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->urlVer:Ljava/lang/String;

    .line 453
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->urlVer:Ljava/lang/String;
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_0

    if-nez v0, :cond_b

    .line 454
    const/4 v0, 0x0

    return-object v0

    .line 456
    :cond_b
    const-string v0, "sdkChannel"

    const/4 v1, -0x1

    :try_start_b
    invoke-static {v5, v0, v1}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    iput v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sdkChannel:I
    :try_end_b
    .catch Lorg/json/JSONException; {:try_start_b .. :try_end_b} :catch_0

    .line 460
    goto :goto_0

    .line 457
    :catch_0
    move-exception v5

    .line 458
    const-string v0, "PayInfo, JSONException"

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 459
    const/4 v0, 0x0

    return-object v0

    .line 462
    :goto_0
    return-object v4
.end method

.method private static buildForSNB(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;
    .locals 8

    .line 296
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "json="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    const/4 v0, 0x0

    return-object v0

    .line 300
    :cond_0
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;-><init>()V

    .line 303
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 304
    const-string v0, "signedData"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 305
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "json1="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 307
    const-string v0, "merchantName"

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userName:Ljava/lang/String;

    .line 308
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userName:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 309
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userName is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    const/4 v0, 0x0

    return-object v0

    .line 312
    :cond_1
    const-string v0, "merchantId"

    :try_start_1
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userID:Ljava/lang/String;

    .line 313
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userID:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 314
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 315
    const/4 v0, 0x0

    return-object v0

    .line 317
    :cond_2
    const-string v0, "applicationID"

    :try_start_2
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->applicationID:Ljava/lang/String;

    .line 318
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->applicationID:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 319
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "applicationID is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 320
    const/4 v0, 0x0

    return-object v0

    .line 322
    :cond_3
    const-string v0, "productName"

    :try_start_3
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productName:Ljava/lang/String;

    .line 323
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productName:Ljava/lang/String;

    if-nez v0, :cond_4

    .line 324
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productName is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 325
    const/4 v0, 0x0

    return-object v0

    .line 327
    :cond_4
    const-string v0, "amount"

    :try_start_4
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dtk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->amount:Ljava/lang/String;

    .line 328
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->amount:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 329
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "amount is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    .line 330
    const/4 v0, 0x0

    return-object v0

    .line 332
    :cond_5
    const-string v0, "productDesc"

    :try_start_5
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productDesc:Ljava/lang/String;

    .line 333
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productDesc:Ljava/lang/String;

    if-nez v0, :cond_6

    .line 334
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productDesc is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    .line 335
    const/4 v0, 0x0

    return-object v0

    .line 337
    :cond_6
    const-string v0, "requestId"

    :try_start_6
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->requestId:Ljava/lang/String;

    .line 338
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->requestId:Ljava/lang/String;

    if-nez v0, :cond_7

    .line 339
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 340
    const/4 v0, 0x0

    return-object v0

    .line 342
    :cond_7
    const-string v0, "serviceCatalog"

    :try_start_7
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->serviceCatalog:Ljava/lang/String;

    .line 343
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->serviceCatalog:Ljava/lang/String;

    if-nez v0, :cond_8

    .line 344
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "serviceCatalog is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_0

    .line 345
    const/4 v0, 0x0

    return-object v0

    .line 347
    :cond_8
    const-string v0, "sign"

    :try_start_8
    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sign:Ljava/lang/String;

    .line 348
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sign:Ljava/lang/String;

    if-nez v0, :cond_9

    .line 349
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sign is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    .line 350
    const/4 v0, 0x0

    return-object v0

    .line 352
    :cond_9
    const-string v0, "RSA256"

    :try_start_9
    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->signType:Ljava/lang/String;

    .line 359
    const-string v0, "url"

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->notifyUrl:Ljava/lang/String;

    .line 360
    iget-object v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->notifyUrl:Ljava/lang/String;

    if-nez v0, :cond_a

    .line 361
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyUrl is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_0

    .line 362
    const/4 v0, 0x0

    return-object v0

    .line 365
    :cond_a
    const-string v0, "sdkChannel"

    const/4 v1, -0x1

    :try_start_a
    invoke-static {v7, v0, v1}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    iput v0, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sdkChannel:I
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_0

    .line 369
    goto :goto_0

    .line 366
    :catch_0
    move-exception v5

    .line 367
    const-string v0, "PayInfo, JSONException"

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 368
    const/4 v0, 0x0

    return-object v0

    .line 371
    :goto_0
    return-object v4
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationID()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->applicationID:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getNotifyUrl()Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->notifyUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getProductDesc()Ljava/lang/String;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public getPubKey()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->pubKey:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->requestId:Ljava/lang/String;

    return-object v0
.end method

.method public getSdkChannel()I
    .locals 1

    .line 251
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sdkChannel:I

    return v0
.end method

.method public getServiceCatalog()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->serviceCatalog:Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public getSignType()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->signType:Ljava/lang/String;

    return-object v0
.end method

.method public getUrlVer()Ljava/lang/String;
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->urlVer:Ljava/lang/String;

    return-object v0
.end method

.method public getUserID()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userID:Ljava/lang/String;

    return-object v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public makePayReq()Lcom/huawei/hms/support/api/entity/pay/PayReq;
    .locals 5

    .line 473
    new-instance v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;

    invoke-direct {v4}, Lcom/huawei/hms/support/api/entity/pay/PayReq;-><init>()V

    .line 474
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getProductName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->productName:Ljava/lang/String;

    .line 475
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.productName ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->productName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getProductDesc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->productDesc:Ljava/lang/String;

    .line 478
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.productDesc ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->productDesc:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getUserID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->merchantId:Ljava/lang/String;

    .line 481
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.merchantId ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->merchantId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getApplicationID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->applicationID:Ljava/lang/String;

    .line 484
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.applicationID ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->applicationID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getAmount()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->amount:Ljava/lang/String;

    .line 487
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.amount ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->amount:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getRequestId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->requestId:Ljava/lang/String;

    .line 492
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.requestId ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->requestId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getNotifyUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->url:Ljava/lang/String;

    .line 497
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.url ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->url:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getSdkChannel()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 500
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getSdkChannel()I

    move-result v0

    iput v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->sdkChannel:I

    .line 502
    :cond_0
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.sdkChannel ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->sdkChannel:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getUrlVer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getUrlVer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 505
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getUrlVer()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->urlVer:Ljava/lang/String;

    .line 506
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.urlVer ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->urlVer:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getCurrency()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 513
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getCurrency()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->currency:Ljava/lang/String;

    .line 526
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getSign()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->sign:Ljava/lang/String;

    .line 527
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.sign ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->sign:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getUserName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->merchantName:Ljava/lang/String;

    .line 530
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.merchantName ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->merchantName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->getServiceCatalog()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->serviceCatalog:Ljava/lang/String;

    .line 549
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.serviceCatalog ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->serviceCatalog:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    const-string v0, "cp private data"

    iput-object v0, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->extReserved:Ljava/lang/String;

    .line 552
    const-string v0, "PayInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " payReq.extReserved ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v4, Lcom/huawei/hms/support/api/entity/pay/PayReq;->extReserved:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    return-object v4
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->amount:Ljava/lang/String;

    .line 200
    return-void
.end method

.method public setApplicationID(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->applicationID:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->currency:Ljava/lang/String;

    .line 145
    return-void
.end method

.method public setNotifyUrl(Ljava/lang/String;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->notifyUrl:Ljava/lang/String;

    .line 240
    return-void
.end method

.method public setProductDesc(Ljava/lang/String;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productDesc:Ljava/lang/String;

    .line 216
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->productName:Ljava/lang/String;

    .line 208
    return-void
.end method

.method public setPubKey(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->pubKey:Ljava/lang/String;

    .line 160
    return-void
.end method

.method public setRequestId(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->requestId:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setSdkChannel(I)V
    .locals 0

    .line 255
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sdkChannel:I

    .line 256
    return-void
.end method

.method public setServiceCatalog(Ljava/lang/String;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->serviceCatalog:Ljava/lang/String;

    .line 168
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->sign:Ljava/lang/String;

    .line 224
    return-void
.end method

.method public setSignType(Ljava/lang/String;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->signType:Ljava/lang/String;

    .line 232
    return-void
.end method

.method public setUrlVer(Ljava/lang/String;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->urlVer:Ljava/lang/String;

    .line 248
    return-void
.end method

.method public setUserID(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userID:Ljava/lang/String;

    .line 184
    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/PayInfo;->userName:Ljava/lang/String;

    .line 176
    return-void
.end method
