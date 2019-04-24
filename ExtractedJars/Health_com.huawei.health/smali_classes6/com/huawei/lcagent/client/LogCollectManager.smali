.class public Lcom/huawei/lcagent/client/LogCollectManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/lcagent/client/LogCollectManager$CallBack;
    }
.end annotation


# static fields
.field public static final ALREADY_DONE:I = 0x1

.field public static final ERROR_OTHER:I = -0x2

.field public static final ERROR_SERVICE_NOT_CONNECTED:I = -0x1

.field public static final FAIL:I = -0x3

.field public static final SUCCESS:I = 0x0

.field private static final TAG:Ljava/lang/String; = "LogCollectManager"


# instance fields
.field protected iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

.field private mCallerCallback:Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

.field private mContext:Landroid/content/Context;

.field protected scLogCollect:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mCallerCallback:Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

    .line 325
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    .line 326
    new-instance v0, Lcom/huawei/lcagent/client/LogCollectManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/lcagent/client/LogCollectManager$1;-><init>(Lcom/huawei/lcagent/client/LogCollectManager;)V

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->scLogCollect:Landroid/content/ServiceConnection;

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 32
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 33
    iput-object p1, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/lcagent/client/LogCollectManager$CallBack;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mCallerCallback:Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

    .line 325
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    .line 326
    new-instance v0, Lcom/huawei/lcagent/client/LogCollectManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/lcagent/client/LogCollectManager$1;-><init>(Lcom/huawei/lcagent/client/LogCollectManager;)V

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->scLogCollect:Landroid/content/ServiceConnection;

    .line 39
    iput-object p2, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mCallerCallback:Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mCallerCallback:Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

    .line 325
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    .line 326
    new-instance v0, Lcom/huawei/lcagent/client/LogCollectManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/lcagent/client/LogCollectManager$1;-><init>(Lcom/huawei/lcagent/client/LogCollectManager;)V

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->scLogCollect:Landroid/content/ServiceConnection;

    .line 46
    if-eqz p2, :cond_0

    .line 47
    iput-object p1, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 48
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    .line 51
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    .line 53
    :goto_0
    return-void
.end method

.method static synthetic access$0(Lcom/huawei/lcagent/client/LogCollectManager;)Lcom/huawei/lcagent/client/LogCollectManager$CallBack;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mCallerCallback:Lcom/huawei/lcagent/client/LogCollectManager$CallBack;

    return-object v0
.end method

.method private unbindToService()V
    .locals 2

    .line 313
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->scLogCollect:Landroid/content/ServiceConnection;

    if-nez v0, :cond_1

    .line 314
    :cond_0
    const-string v0, "LogCollectManager"

    const-string v1, "mContext == null || scLogCollect == null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    return-void

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/lcagent/client/LogCollectManager;->scLogCollect:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 318
    return-void
.end method


# virtual methods
.method public allowUploadAlways(Z)I
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 214
    const/4 v0, -0x1

    return v0

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 218
    const/4 v0, -0x1

    return v0

    .line 220
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->allowUploadAlways(Z)I

    move-result v0

    return v0
.end method

.method public allowUploadInMobileNetwork(Z)I
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    const/4 v0, -0x1

    return v0

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 206
    const/4 v0, -0x1

    return v0

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->allowUploadInMobileNetwork(Z)I

    move-result v0

    return v0
.end method

.method public bindToService(Landroid/content/Context;)Z
    .locals 6

    .line 293
    const-string v0, "LogCollectManager"

    const-string v1, "start to bind to Log Collect service"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 295
    const-string v0, "LogCollectManager"

    const-string v1, "mContext == null"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 296
    const/4 v0, 0x0

    return v0

    .line 298
    :cond_0
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.lcagent.service.ILogCollect"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 301
    const-string v0, "com.huawei.lcagent"

    const-string v1, "com.huawei.lcagent.service.LogCollectService"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 303
    invoke-virtual {p1, v3}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 305
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.lcagent.service.ILogCollect"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 306
    const-string v0, "com.huawei.lcagent"

    const-string v1, "com.huawei.lcagent.service.LogCollectService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 308
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/lcagent/client/LogCollectManager;->scLogCollect:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v5

    .line 309
    return v5
.end method

.method public captureAllLog()Lcom/huawei/lcagent/client/LogMetricInfo;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    const/4 v0, 0x0

    return-object v0

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 177
    const/4 v0, 0x0

    return-object v0

    .line 179
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0}, Lcom/huawei/lcagent/client/ILogCollect;->captureAllLog()Lcom/huawei/lcagent/client/LogMetricInfo;

    move-result-object v0

    return-object v0
.end method

.method public captureLogMetric(I)Lcom/huawei/lcagent/client/LogMetricInfo;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 161
    const/4 v0, 0x0

    return-object v0

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 165
    const/4 v0, 0x0

    return-object v0

    .line 167
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->captureLogMetric(I)Lcom/huawei/lcagent/client/LogMetricInfo;

    move-result-object v0

    return-object v0
.end method

.method public clearLogMetric(J)V
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 186
    return-void

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 190
    return-void

    .line 192
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2}, Lcom/huawei/lcagent/client/ILogCollect;->clearLogMetric(J)V

    .line 193
    return-void
.end method

.method public configure(Ljava/lang/String;)I
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    const/4 v0, -0x1

    return v0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 272
    const/4 v0, -0x1

    return v0

    .line 274
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->configure(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public configureAPlogs(I)I
    .locals 1

    .line 418
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 419
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    const/4 v0, -0x1

    return v0

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 424
    const/4 v0, -0x1

    return v0

    .line 426
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->configureAPlogs(I)I

    move-result v0

    return v0
.end method

.method public configureBluetoothlogcat(ILjava/lang/String;)I
    .locals 1

    .line 394
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 395
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 396
    const/4 v0, -0x1

    return v0

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 400
    const/4 v0, -0x1

    return v0

    .line 402
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2}, Lcom/huawei/lcagent/client/ILogCollect;->configureBluetoothlogcat(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public configureCoredump(I)I
    .locals 1

    .line 430
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 432
    const/4 v0, -0x1

    return v0

    .line 435
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 436
    const/4 v0, -0x1

    return v0

    .line 438
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->configureCoredump(I)I

    move-result v0

    return v0
.end method

.method public configureGPS(I)I
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 444
    const/4 v0, -0x1

    return v0

    .line 447
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 448
    const/4 v0, -0x1

    return v0

    .line 450
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->configureGPS(I)I

    move-result v0

    return v0
.end method

.method public configureLogcat(ILjava/lang/String;)I
    .locals 1

    .line 406
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 407
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    const/4 v0, -0x1

    return v0

    .line 411
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 412
    const/4 v0, -0x1

    return v0

    .line 414
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2}, Lcom/huawei/lcagent/client/ILogCollect;->configureLogcat(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public configureModemlogcat(ILjava/lang/String;)I
    .locals 1

    .line 382
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 383
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 384
    const/4 v0, -0x1

    return v0

    .line 387
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 388
    const/4 v0, -0x1

    return v0

    .line 390
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2}, Lcom/huawei/lcagent/client/ILogCollect;->configureModemlogcat(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public configureUserType(I)I
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    const/4 v0, -0x1

    return v0

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 230
    const/4 v0, -0x1

    return v0

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1}, Lcom/huawei/lcagent/client/ILogCollect;->configureUserType(I)I

    move-result v0

    return v0
.end method

.method public feedbackUploadResult(JI)I
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    const/4 v0, -0x1

    return v0

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 258
    const/4 v0, -0x1

    return v0

    .line 260
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/lcagent/client/ILogCollect;->feedbackUploadResult(JI)I

    move-result v0

    return v0
.end method

.method protected finalize()V
    .locals 0

    .line 322
    invoke-direct {p0}, Lcom/huawei/lcagent/client/LogCollectManager;->unbindToService()V

    .line 323
    return-void
.end method

.method public forceUpload()I
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 238
    const/4 v0, -0x1

    return v0

    .line 241
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 242
    const/4 v0, -0x1

    return v0

    .line 244
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0}, Lcom/huawei/lcagent/client/ILogCollect;->forceUpload()I

    move-result v0

    return v0
.end method

.method public getCompressInfo()Lcom/huawei/lcagent/client/CompressInfo;
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 455
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 456
    const/4 v0, 0x0

    return-object v0

    .line 459
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 460
    const/4 v0, 0x0

    return-object v0

    .line 462
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0}, Lcom/huawei/lcagent/client/ILogCollect;->getCompressInfo()Lcom/huawei/lcagent/client/CompressInfo;

    move-result-object v0

    return-object v0
.end method

.method public getFirstErrorTime()J
    .locals 2

    .line 346
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 347
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 348
    const-wide/16 v0, -0x1

    return-wide v0

    .line 351
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 352
    const-wide/16 v0, -0x1

    return-wide v0

    .line 354
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0}, Lcom/huawei/lcagent/client/ILogCollect;->getFirstErrorTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getFirstErrorType()Ljava/lang/String;
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 371
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 372
    const/4 v0, 0x0

    return-object v0

    .line 375
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 376
    const/4 v0, 0x0

    return-object v0

    .line 378
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0}, Lcom/huawei/lcagent/client/ILogCollect;->getFirstErrorType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUserType()I
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 282
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    const/4 v0, -0x1

    return v0

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 287
    const/4 v0, -0x1

    return v0

    .line 289
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0}, Lcom/huawei/lcagent/client/ILogCollect;->getUserType()I

    move-result v0

    return v0
.end method

.method public resetFirstErrorTime()I
    .locals 1

    .line 358
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 359
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 360
    const/4 v0, -0x1

    return v0

    .line 363
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 364
    const/4 v0, -0x1

    return v0

    .line 366
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0}, Lcom/huawei/lcagent/client/ILogCollect;->resetFirstErrorTime()I

    move-result v0

    return v0
.end method

.method public setMetricCommonHeader(I[B)I
    .locals 1

    .line 119
    array-length v0, p2

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->setMetricCommonHeader(I[BI)I

    move-result v0

    return v0
.end method

.method public setMetricCommonHeader(I[BI)I
    .locals 1

    .line 103
    if-eqz p2, :cond_0

    array-length v0, p2

    if-ge v0, p3, :cond_1

    .line 104
    :cond_0
    const/4 v0, -0x2

    return v0

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_2

    .line 108
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 109
    const/4 v0, -0x1

    return v0

    .line 112
    :cond_2
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_3

    .line 113
    const/4 v0, -0x1

    return v0

    .line 115
    :cond_3
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/lcagent/client/ILogCollect;->setMetricCommonHeader(I[BI)I

    move-result v0

    return v0
.end method

.method public setMetricStoargeHeader(I[B)I
    .locals 1

    .line 79
    array-length v0, p2

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->setMetricStoargeHeader(I[BI)I

    move-result v0

    return v0
.end method

.method public setMetricStoargeHeader(I[BI)I
    .locals 1

    .line 61
    if-eqz p2, :cond_0

    array-length v0, p2

    if-ge v0, p3, :cond_1

    .line 62
    :cond_0
    const/4 v0, -0x2

    return v0

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_2

    .line 66
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 67
    const/4 v0, -0x1

    return v0

    .line 71
    :cond_2
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_3

    .line 72
    const/4 v0, -0x1

    return v0

    .line 75
    :cond_3
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/lcagent/client/ILogCollect;->setMetricStoargeHeader(I[BI)I

    move-result v0

    return v0
.end method

.method public setMetricStoargeTail(I[B)I
    .locals 1

    .line 99
    array-length v0, p2

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->setMetricStoargeTail(I[BI)I

    move-result v0

    return v0
.end method

.method public setMetricStoargeTail(I[BI)I
    .locals 1

    .line 83
    if-eqz p2, :cond_0

    array-length v0, p2

    if-ge v0, p3, :cond_1

    .line 84
    :cond_0
    const/4 v0, -0x2

    return v0

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_2

    .line 88
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 89
    const/4 v0, -0x1

    return v0

    .line 92
    :cond_2
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_3

    .line 93
    const/4 v0, -0x1

    return v0

    .line 95
    :cond_3
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/lcagent/client/ILogCollect;->setMetricStoargeTail(I[BI)I

    move-result v0

    return v0
.end method

.method public shouldSubmitMetric(II)Z
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    const/4 v0, 0x0

    return v0

    .line 149
    :cond_0
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_1

    .line 150
    const/4 v0, 0x0

    return v0

    .line 152
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2}, Lcom/huawei/lcagent/client/ILogCollect;->shouldSubmitMetric(II)Z

    move-result v0

    return v0
.end method

.method public submitMetric(II[B)I
    .locals 1

    .line 140
    array-length v0, p3

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->submitMetric(II[BI)I

    move-result v0

    return v0
.end method

.method public submitMetric(II[BI)I
    .locals 1

    .line 124
    if-eqz p3, :cond_0

    array-length v0, p3

    if-ge v0, p4, :cond_1

    .line 125
    :cond_0
    const/4 v0, -0x2

    return v0

    .line 128
    :cond_1
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_2

    .line 129
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/lcagent/client/LogCollectManager;->bindToService(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 130
    const/4 v0, -0x1

    return v0

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    if-nez v0, :cond_3

    .line 134
    const/4 v0, -0x1

    return v0

    .line 136
    :cond_3
    iget-object v0, p0, Lcom/huawei/lcagent/client/LogCollectManager;->iLogCollect:Lcom/huawei/lcagent/client/ILogCollect;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/huawei/lcagent/client/ILogCollect;->submitMetric(II[BI)I

    move-result v0

    return v0
.end method
