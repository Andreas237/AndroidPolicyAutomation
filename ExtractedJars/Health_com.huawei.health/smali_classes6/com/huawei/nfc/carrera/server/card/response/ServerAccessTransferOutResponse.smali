.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.source "SourceFile"


# instance fields
.field private nextStep:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getNextStep()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->nextStep:Ljava/lang/String;

    return-object v0
.end method

.method public setNextStep(Ljava/lang/String;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->nextStep:Ljava/lang/String;

    .line 13
    return-void
.end method
