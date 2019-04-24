.class public Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final CUP_PPMSG_KEY_AID:Ljava/lang/String; = "aid"

.field static final CUP_PPMSG_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final CUP_PPMSG_KEY_VIRTUAL_CARD_REF_ID:Ljava/lang/String; = "cardRefId"

.field static final CUP_PPMSG_TYPE:Ljava/lang/String; = "personizedPush"


# instance fields
.field private aid:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private virtualCardRefID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAid()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getVirtualCardRefID()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->virtualCardRefID:Ljava/lang/String;

    return-object v0
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->aid:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->cplc:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setVirtualCardRefID(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/lifecycle/push/data/PushCUPPersonalizedMessage;->virtualCardRefID:Ljava/lang/String;

    .line 51
    return-void
.end method
