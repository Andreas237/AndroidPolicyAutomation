.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;

.field private mExcuteHandler:Landroid/os/Handler;

.field private phoneNum:Ljava/lang/String;

.field private resultCode:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->mExcuteHandler:Landroid/os/Handler;

    .line 49
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;

    .line 50
    return-void
.end method


# virtual methods
.method public notifyRequestResult(ILjava/lang/String;)V
    .locals 1

    .line 60
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->resultCode:I

    .line 61
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->phoneNum:Ljava/lang/String;

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->mExcuteHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 64
    return-void
.end method

.method public run()V
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->resultCode:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->phoneNum:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/RequestVerifyCodeCallback;->requestResultCallback(ILjava/lang/String;)V

    .line 76
    :cond_0
    return-void
.end method
