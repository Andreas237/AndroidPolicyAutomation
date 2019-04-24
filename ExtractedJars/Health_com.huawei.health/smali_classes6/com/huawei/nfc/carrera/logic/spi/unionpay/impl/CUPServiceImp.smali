.class public Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/spi/unionpay/CUPService;
.implements Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;
    }
.end annotation


# static fields
.field private static final BINDING_TIME_OUT:I = 0x7d0

.field private static final CUP_TSM_APP_PACKAGE_NAME:Ljava/lang/String; = "com.unionpay.tsmbleuniteservice"


# instance fields
.field private final initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

.field private final interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

.field private final lock:Ljava/lang/Object;

.field private final mContext:Landroid/content/Context;

.field private final mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mContext:Landroid/content/Context;

    .line 68
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    .line 69
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;-><init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getInstance(Landroid/content/Context;)Lcom/unionpay/tsmservice/UPTsmAddon;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 71
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0, p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->addConnectionListener(Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;)V

    .line 72
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)Ljava/lang/Object;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    return-object v0
.end method

.method private initUPTsmAddon()I
    .locals 6

    .line 268
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    monitor-enter v3

    .line 270
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mContext:Landroid/content/Context;

    const-string v1, "com.unionpay.tsmbleuniteservice"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/PackageUtil;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 272
    const-string v0, "initUPTsmAddon, but package is not installed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 273
    monitor-exit v3

    const/4 v0, -0x1

    return v0

    .line 276
    :cond_0
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    if-nez v0, :cond_2

    .line 278
    const-string v0, "initUPTsmAddon, bind tsm addon now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->bind()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 288
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initUPTsmAddon threadId: "

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

    .line 289
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    .line 290
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 292
    monitor-exit v3

    const/4 v0, -0x5

    return v0

    .line 298
    :cond_1
    goto :goto_0

    .line 295
    :catch_0
    move-exception v4

    .line 297
    const-string v0, "initUPTsmAddon, interruptedException."

    :try_start_3
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 298
    goto :goto_0

    .line 301
    :cond_2
    monitor-exit v3

    const/4 v0, 0x0

    return v0

    .line 302
    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method


# virtual methods
.method public encryptCardInfo(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;
    .locals 12

    .line 134
    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    monitor-enter v4

    .line 136
    const-string v0, "encryptCardInfo now."

    :try_start_0
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 137
    new-instance v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;-><init>()V

    .line 138
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const-string v0, "encryptCardInfo, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 141
    const/4 v0, -0x2

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    monitor-exit v4

    return-object v5

    .line 145
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->init()I

    move-result v6

    .line 146
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encryptCardInfo, init response error code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 149
    iput v6, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    monitor-exit v4

    return-object v5

    .line 155
    :cond_1
    :try_start_2
    new-instance v7, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;

    invoke-direct {v7}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;-><init>()V

    .line 156
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 157
    invoke-interface {v8, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    invoke-virtual {v7, v8}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->setData(Ljava/util/List;)V

    .line 159
    new-instance v9, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    const-class v0, Lcom/unionpay/tsmservice/result/EncryptDataResult;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-direct {v9, p0, v0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;-><init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;Ljava/lang/ClassLoader;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0, v7, v9}, Lcom/unionpay/tsmservice/UPTsmAddon;->encryptData(Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 162
    :goto_0
    iget v0, v9, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encryptCardInfo threadId: "

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

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    goto :goto_0

    .line 168
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    iget v1, v9, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    const-string v2, "encryptCardInfo"

    iget-object v3, v9, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->mErrorMsg:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;->translateReponseCode(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    goto :goto_1

    .line 175
    :cond_3
    const-string v0, "cup tsm service killed, when encrypting."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    const-string v1, "encryptCardInfo"

    .line 177
    const v2, 0x1869f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;->translateReponseCode(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    .line 180
    :goto_1
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    iget-object v0, v9, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultObject:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 183
    iget-object v0, v9, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultObject:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lcom/unionpay/tsmservice/result/EncryptDataResult;

    .line 184
    invoke-virtual {v10}, Lcom/unionpay/tsmservice/result/EncryptDataResult;->getEncryptData()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->encrytedStr:Ljava/lang/String;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 196
    :cond_4
    goto :goto_2

    .line 187
    :catch_0
    move-exception v7

    .line 189
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encryptCardInfo, remote exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 190
    const/16 v0, -0x63

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    .line 196
    goto :goto_2

    .line 192
    :catch_1
    move-exception v7

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encryptCardInfo, interrupted exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 195
    const/16 v0, -0x63

    iput v0, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    .line 198
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encryptCardInfo result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v5, Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPEncryptResponse;->responseCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    monitor-exit v4

    return-object v5

    .line 200
    :catchall_0
    move-exception v11

    monitor-exit v4

    throw v11
.end method

.method public excuteCMD(Ljava/lang/String;Ljava/lang/String;)I
    .locals 10

    .line 206
    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    monitor-enter v4

    .line 208
    const-string v0, "excuteCMD"

    :try_start_0
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 209
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    :cond_0
    const-string v0, "excuteCMD, params illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    monitor-exit v4

    const/4 v0, -0x2

    return v0

    .line 215
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->init()I

    move-result v5

    .line 216
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteCMD, init response error code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    monitor-exit v4

    return v5

    .line 222
    :cond_2
    const/16 v6, -0x63

    .line 225
    :try_start_2
    new-instance v7, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;

    invoke-direct {v7}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;-><init>()V

    .line 226
    invoke-virtual {v7, p2}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->setSign(Ljava/lang/String;)V

    .line 227
    invoke-virtual {v7, p1}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->setSsid(Ljava/lang/String;)V

    .line 228
    new-instance v8, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    invoke-direct {v8, p0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;-><init>(Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    const/4 v1, 0x0

    invoke-virtual {v0, v7, v8, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->executeCmd(Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    .line 231
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, v8, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteCMD threadId: "

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

    .line 234
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    goto :goto_0

    .line 237
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 239
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    iget v1, v8, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    const-string v2, "excuteCMD"

    iget-object v3, v8, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->mErrorMsg:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;->translateReponseCode(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    move v6, v0

    goto :goto_1

    .line 244
    :cond_4
    const-string v0, "cup tsm service killed, when excuteCMDing."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    const-string v1, "excuteCMD"

    const v2, 0x1869f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;->translateReponseCode(ILjava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    move v6, v0

    .line 256
    :goto_1
    goto :goto_2

    .line 249
    :catch_0
    move-exception v7

    .line 251
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteCMD, remote exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 256
    goto :goto_2

    .line 253
    :catch_1
    move-exception v7

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteCMD, interrupted exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 258
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteCMD responseCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 259
    monitor-exit v4

    return v6

    .line 260
    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9
.end method

.method public init()I
    .locals 9

    .line 77
    iget-object v4, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    monitor-enter v4

    .line 79
    const-string v0, "initService now."

    :try_start_0
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 80
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initUPTsmAddon()I

    move-result v5

    .line 81
    if-eqz v5, :cond_0

    .line 83
    const-string v0, "initService, init up tsm addon failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    monitor-exit v4

    return v5

    .line 87
    :cond_0
    const/16 v6, -0x63

    .line 90
    :try_start_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    iget v0, v0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    const/16 v1, 0x2710

    if-eq v0, v1, :cond_1

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    const/4 v1, 0x0

    iput v1, v0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    .line 93
    new-instance v7, Lcom/unionpay/tsmservice/request/InitRequestParams;

    invoke-direct {v7}, Lcom/unionpay/tsmservice/request/InitRequestParams;-><init>()V

    .line 94
    const/4 v0, 0x3

    invoke-virtual {v7, v0}, Lcom/unionpay/tsmservice/request/InitRequestParams;->setType(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    invoke-virtual {v0, v7, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->init(Lcom/unionpay/tsmservice/request/InitRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123====initResult.resultCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    iget v1, v1, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 97
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    iget v0, v0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initService threadId: "

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

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->mUPTsmAddon:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    iget v1, v1, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    const-string v2, "initService"

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    iget-object v3, v3, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->mErrorMsg:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;->translateReponseCode(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    move v6, v0

    goto :goto_1

    .line 111
    :cond_2
    const-string v0, "cup tsm exception, when initing."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->interpreter:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;

    const-string v1, "initService"

    const v2, 0x1869f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPResponseCodeInterpreter;->translateReponseCode(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    move v6, v0

    .line 116
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initService responseCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    goto :goto_2

    .line 118
    :catch_0
    move-exception v7

    .line 120
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initService, remote exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 125
    goto :goto_2

    .line 122
    :catch_1
    move-exception v7

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initService, interrupted exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    :goto_2
    monitor-exit v4

    return v6

    .line 128
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public onTsmConnected()V
    .locals 5

    .line 308
    const-string v0, "UPTsmAddon connected."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 309
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTsmConnected threadId: "

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

    .line 310
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    monitor-enter v3

    .line 312
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 314
    :goto_0
    return-void
.end method

.method public onTsmDisconnected()V
    .locals 5

    .line 319
    const-string v0, "UPTsmAddon disconnected."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 320
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTsmDisconnected threadId: "

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

    .line 321
    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    monitor-enter v3

    .line 323
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->initResult:Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;

    const v1, 0x1869f

    iput v1, v0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp$TsmCallback;->resultCode:I

    .line 324
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/unionpay/impl/CUPServiceImp;->lock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 325
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 326
    :goto_0
    return-void
.end method
