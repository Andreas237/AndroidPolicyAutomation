.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private excuteHandler:Landroid/os/Handler;

.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;Landroid/os/Handler;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;

    .line 39
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;->excuteHandler:Landroid/os/Handler;

    .line 40
    return-void
.end method


# virtual methods
.method public notifyCheckFinished()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;->excuteHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    return-void
.end method

.method public run()V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;->checkFinished()V

    .line 62
    :cond_0
    return-void
.end method
