.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.source "SourceFile"


# instance fields
.field private cardId:Ljava/lang/String;

.field private nextStep:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCardId()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->cardId:Ljava/lang/String;

    return-object v0
.end method

.method public getNextStep()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->nextStep:Ljava/lang/String;

    return-object v0
.end method

.method public setCardId(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->cardId:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public setNextStep(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->nextStep:Ljava/lang/String;

    .line 34
    return-void
.end method
