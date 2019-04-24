.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SetDefaultCardCallbackTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

.field private setDefaultResult:Z


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;Z)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SetDefaultCardCallbackTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

    .line 37
    iput-boolean p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SetDefaultCardCallbackTask;->setDefaultResult:Z

    .line 38
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SetDefaultCardCallbackTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;

    iget-boolean v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SetDefaultCardCallbackTask;->setDefaultResult:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;->setResultCallback(I)V

    .line 48
    return-void
.end method
