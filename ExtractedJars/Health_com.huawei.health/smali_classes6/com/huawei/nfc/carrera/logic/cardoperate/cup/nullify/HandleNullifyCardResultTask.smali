.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mExcuteHandler:Landroid/os/Handler;

.field private mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;

.field private resultCode:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->mExcuteHandler:Landroid/os/Handler;

    .line 36
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;

    .line 37
    return-void
.end method


# virtual methods
.method public notifyNullifyResult(I)V
    .locals 1

    .line 47
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->resultCode:I

    .line 48
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->mExcuteHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    return-void
.end method

.method public run()V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->resultCode:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/NullifyCardResultCallback;->nullifyResultCallback(I)V

    .line 62
    :cond_0
    return-void
.end method
