.class public Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;

.field private mHandler:Landroid/os/Handler;

.field private resultIdentifyCode:I


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->mHandler:Landroid/os/Handler;

    .line 38
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;

    .line 39
    return-void
.end method


# virtual methods
.method public notifyInitEseResult(I)V
    .locals 2

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyInitEseResult, resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 47
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->resultIdentifyCode:I

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    return-void
.end method

.method public run()V
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->mCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/init/HandleInitEseResultTask;->resultIdentifyCode:I

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitEseResultCallback;->initEseResult(I)V

    .line 59
    :cond_0
    return-void
.end method
