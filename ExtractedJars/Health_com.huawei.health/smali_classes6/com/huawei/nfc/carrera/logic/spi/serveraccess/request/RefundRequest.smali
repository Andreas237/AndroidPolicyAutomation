.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RefundRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 19
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RefundRequest;->setIssuerId(Ljava/lang/String;)V

    .line 20
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RefundRequest;->setAppletAid(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RefundRequest;->setOrderId(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RefundRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RefundRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RefundRequest;->setCplc(Ljava/lang/String;)V

    .line 25
    return-void
.end method
