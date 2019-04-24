.class Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;
.super Lcom/unionpay/tsmservice/ITsmCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TsmCallback"
.end annotation


# instance fields
.field private mClassLoader:Ljava/lang/ClassLoader;

.field mErrorMsg:Ljava/lang/String;

.field resultCode:I

.field resultObject:Ljava/lang/Object;

.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->this$0:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;

    .line 352
    invoke-direct {p0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;-><init>()V

    .line 353
    return-void
.end method

.method constructor <init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 356
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->this$0:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;

    .line 357
    invoke-direct {p0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;-><init>()V

    .line 358
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->mClassLoader:Ljava/lang/ClassLoader;

    .line 359
    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 364
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "errorInfo, errorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ,errorMsg: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onError threadId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 366
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->this$0:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->access$000(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 368
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    .line 369
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->mErrorMsg:Ljava/lang/String;

    .line 370
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->this$0:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->access$000(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 371
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 372
    :goto_0
    return-void
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 377
    const-string v0, "onResult."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 378
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResult threadId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->this$0:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->access$000(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 381
    const/16 v0, 0x2710

    :try_start_0
    iput v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    .line 382
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->mClassLoader:Ljava/lang/ClassLoader;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->mClassLoader:Ljava/lang/ClassLoader;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 385
    const-string v0, "result"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultObject:Ljava/lang/Object;

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->this$0:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->access$000(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 389
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 390
    :goto_0
    return-void
.end method
