.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;

.field private mExcuteHandler:Landroid/os/Handler;

.field private resultCode:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->mExcuteHandler:Landroid/os/Handler;

    .line 44
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;

    .line 45
    return-void
.end method


# virtual methods
.method public notifyActiveResult(I)V
    .locals 1

    .line 55
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->resultCode:I

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->mExcuteHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    return-void
.end method

.method public run()V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->resultCode:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/ActiveCardCallback;->activeResultCallback(I)V

    .line 70
    :cond_0
    return-void
.end method
