.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
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

.field private theoreticalRecharegePayment:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->scene:Ljava/lang/String;

    .line 44
    const-string v0, "CNY"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->currency:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalRecharegePayment:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 88
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->scene:Ljava/lang/String;

    .line 44
    const-string v0, "CNY"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->currency:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalRecharegePayment:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    .line 89
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setIssuerId(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setCplc(Ljava/lang/String;)V

    .line 91
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setAppletAid(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 93
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 95
    iput-object p4, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->scene:Ljava/lang/String;

    .line 96
    return-void
.end method


# virtual methods
.method public getActualIssuePayment()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    return-object v0
.end method

.method public getActualRecharegePayment()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    return-object v0
.end method

.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public getScene()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->scene:Ljava/lang/String;

    return-object v0
.end method

.method public getTheoreticalIssuePayment()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    return-object v0
.end method

.method public getTheoreticalRecharegePayment()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalRecharegePayment:Ljava/lang/String;

    return-object v0
.end method

.method public setActualIssuePayment(Ljava/lang/String;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualIssuePayment:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setActualRecharegePayment(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->actualRecharegePayment:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->appCode:Ljava/lang/String;

    .line 163
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->currency:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->partnerId:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public setScene(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->scene:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setTheoreticalIssuePayment(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalIssuePayment:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setTheoreticalRecharegePayment(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->theoreticalRecharegePayment:Ljava/lang/String;

    .line 145
    return-void
.end method
