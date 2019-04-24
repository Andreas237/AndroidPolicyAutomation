.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.source "SourceFile"


# static fields
.field public static final CURRENCY_CNY:Ljava/lang/String; = "CNY"

.field public static final SCENE_OPEN_CARD:Ljava/lang/String; = "0"

.field public static final SCENE_OPEN_CARD_AND_RECHARGE:Ljava/lang/String; = "2"

.field public static final SCENE_RECHARGE:Ljava/lang/String; = "1"


# instance fields
.field private actualIssuePayment:Ljava/lang/String;

.field private actualRecharegePayment:Ljava/lang/String;

.field private appCode:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private scene:Ljava/lang/String;

.field private theoreticalIssuePayment:Ljava/lang/String;

.field private theoreticalRechargePayment:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 80
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->scene:Ljava/lang/String;

    .line 44
    const-string v0, "CNY"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->currency:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalRechargePayment:Ljava/lang/String;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 85
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->scene:Ljava/lang/String;

    .line 44
    const-string v0, "CNY"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->currency:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalRechargePayment:Ljava/lang/String;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    .line 86
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setIssuerId(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setCplc(Ljava/lang/String;)V

    .line 88
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setAppletAid(Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 92
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->scene:Ljava/lang/String;

    .line 93
    return-void
.end method


# virtual methods
.method public getActualIssuePayment()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    return-object v0
.end method

.method public getActualRecharegePayment()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    return-object v0
.end method

.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public getScene()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->scene:Ljava/lang/String;

    return-object v0
.end method

.method public getTheoreticalIssuePayment()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    return-object v0
.end method

.method public getTheoreticalRecharegePayment()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalRechargePayment:Ljava/lang/String;

    return-object v0
.end method

.method public getTheoreticalRechargePayment()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalRechargePayment:Ljava/lang/String;

    return-object v0
.end method

.method public setActualIssuePayment(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    .line 113
    return-void
.end method

.method public setActualRecharegePayment(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->appCode:Ljava/lang/String;

    .line 169
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->currency:Ljava/lang/String;

    .line 153
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->partnerId:Ljava/lang/String;

    .line 177
    return-void
.end method

.method public setScene(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->scene:Ljava/lang/String;

    .line 103
    return-void
.end method

.method public setTheoreticalIssuePayment(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setTheoreticalRecharegePayment(Ljava/lang/String;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalRechargePayment:Ljava/lang/String;

    .line 143
    return-void
.end method

.method public setTheoreticalRechargePayment(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->theoreticalRechargePayment:Ljava/lang/String;

    .line 162
    return-void
.end method
