.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# instance fields
.field private flag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->flag:Ljava/lang/String;

    .line 24
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->setIssuerId(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->setCplc(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->setAppletAid(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 30
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->flag:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public getFlag()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->flag:Ljava/lang/String;

    return-object v0
.end method

.method public setFlag(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;->flag:Ljava/lang/String;

    .line 41
    return-void
.end method
