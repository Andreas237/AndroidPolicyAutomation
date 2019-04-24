.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ORDER_TYPE_CARD_DELETE:Ljava/lang/String; = "5"

.field public static final ORDER_TYPE_CARD_REPAIR:Ljava/lang/String; = "6"

.field public static final ORDER_TYPE_OPEN_CARD:Ljava/lang/String; = "0"

.field public static final ORDER_TYPE_OPEN_CARD_AND_RECHARGE:Ljava/lang/String; = "2"

.field public static final ORDER_TYPE_RECHARGE:Ljava/lang/String; = "1"

.field public static final ORDER_TYPE_TRANSFER_IN:Ljava/lang/String; = "4"

.field public static final ORDER_TYPE_TRANSFER_IN_RECHARGE:Ljava/lang/String; = "7"

.field public static final ORDER_TYPE_TRANSFER_OUT:Ljava/lang/String; = "3"

.field public static final ORDER_TYPE_VIRTY_CARD:Ljava/lang/String; = "8"

.field public static final STATUS_CREATE_SSD_FAIL:Ljava/lang/String; = "801"

.field public static final STATUS_DOWNLOAD_CAP_FAIL:Ljava/lang/String; = "802"

.field public static final STATUS_OPEN_CARD_SUCCESS:Ljava/lang/String; = "804"

.field public static final STATUS_OTHER:Ljava/lang/String; = "999"

.field public static final STATUS_PERSONALIZED_FAIL:Ljava/lang/String; = "803"

.field public static final STATUS_RECHARGE_FAIL:Ljava/lang/String; = "900"

.field public static final STATUS_RECHARGE_SUCCESS:Ljava/lang/String; = "902"

.field public static final STATUS_RECHARGE_UNKNOWN:Ljava/lang/String; = "906"

.field public static final STATUS_REFUNDING:Ljava/lang/String; = "901"

.field public static final STATUS_REFUND_FAIL:Ljava/lang/String; = "903"

.field public static final STATUS_REFUND_SUCCESS:Ljava/lang/String; = "907"

.field public static final STATUS_SNB_ISSUEANDRECHARGE_FAILED:Ljava/lang/String; = "1001"

.field public static final STATUS_SNB_NORMAL:Ljava/lang/String; = "1000"

.field public static final STATUS_SNB_PAYED_BUT_FAILED:Ljava/lang/String; = "1006"

.field public static final STATUS_SNB_RECHARGE_FAILED:Ljava/lang/String; = "1002"

.field public static final STATUS_SNB_RECHARGE_UNKNOW_FAILED:Ljava/lang/String; = "1007"

.field public static final STATUS_SNB_REFUNDING:Ljava/lang/String; = "1004"

.field public static final STATUS_SNB_REFUND_FAILED:Ljava/lang/String; = "1005"

.field public static final STATUS_SNB_REFUND_SUCCESS:Ljava/lang/String; = "1008"

.field public static final STATUS_SNB_SHIT_IN_FAILED:Ljava/lang/String; = "1013"

.field public static final STATUS_SNB_SHIT_IN_RECHARGE_FAILED:Ljava/lang/String; = "1015"

.field public static final STATUS_SNB_SHIT_OUT_FAILED:Ljava/lang/String; = "1011"

.field public static final STATUS_TRANSFER_IN_FAILED:Ljava/lang/String; = "912"

.field public static final STATUS_TRANSFER_IN_RECHARGE_FAILED:Ljava/lang/String; = "913"

.field public static final STATUS_TRANSFER_OUT_FAILED:Ljava/lang/String; = "911"

.field public static final STATUS_VIRTUAL_CONSUME_FAILED:Ljava/lang/String; = "951"

.field public static final STATUS_VIRTUAL_CONSUME_SUCCESS:Ljava/lang/String; = "950"

.field public static final STATUS_VIRTUAL_HAS_APPLYED:Ljava/lang/String; = "953"

.field public static final STATUS_VIRTUAL_HAS_PERSONALIZED:Ljava/lang/String; = "955"

.field public static final STATUS_VIRTUAL_HAS_ROLLBACKED:Ljava/lang/String; = "956"

.field public static final STATUS_VIRTUAL_IS_RESUMING:Ljava/lang/String; = "957"

.field public static final STATUS_VIRTUAL_IS_ROLLBACKING:Ljava/lang/String; = "954"

.field public static final STATUS_VIRTUAL_PERSONALIZED_FAILED:Ljava/lang/String; = "952"

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private amount:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private orderId:Ljava/lang/String;

.field private orderTime:Ljava/lang/String;

.field private orderType:Ljava/lang/String;

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 259
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderId:Ljava/lang/String;

    .line 264
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderType:Ljava/lang/String;

    .line 269
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->issuerId:Ljava/lang/String;

    .line 274
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->status:Ljava/lang/String;

    .line 279
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->currency:Ljava/lang/String;

    .line 284
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderTime:Ljava/lang/String;

    .line 289
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->amount:Ljava/lang/String;

    .line 291
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->cplc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 315
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 365
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 295
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 345
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderTime()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderTime:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderType()Ljava/lang/String;
    .locals 1

    .line 335
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderType:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 355
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->status:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 320
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->amount:Ljava/lang/String;

    .line 321
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 370
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->cplc:Ljava/lang/String;

    .line 371
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 300
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->currency:Ljava/lang/String;

    .line 301
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->issuerId:Ljava/lang/String;

    .line 351
    return-void
.end method

.method public setOrderId(Ljava/lang/String;)V
    .locals 0

    .line 330
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderId:Ljava/lang/String;

    .line 331
    return-void
.end method

.method public setOrderTime(Ljava/lang/String;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderTime:Ljava/lang/String;

    .line 311
    return-void
.end method

.method public setOrderType(Ljava/lang/String;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->orderType:Ljava/lang/String;

    .line 341
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 360
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->status:Ljava/lang/String;

    .line 361
    return-void
.end method
