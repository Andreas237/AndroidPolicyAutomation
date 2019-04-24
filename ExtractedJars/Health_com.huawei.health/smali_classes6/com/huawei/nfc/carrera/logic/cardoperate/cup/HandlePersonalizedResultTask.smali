.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private excuteHandler:Landroid/os/Handler;

.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;

.field private resultCode:I


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;Landroid/os/Handler;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;

    .line 44
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->excuteHandler:Landroid/os/Handler;

    .line 45
    return-void
.end method


# virtual methods
.method public notifyHandleResult(I)V
    .locals 1

    .line 54
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->resultCode:I

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->excuteHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    return-void
.end method

.method public run()V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/HandlePersonalizedResultTask;->resultCode:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;->handleResultCallback(I)V

    .line 71
    :cond_0
    return-void
.end method
