.class public Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final RECIVE_GET_BETA_INFO:Ljava/lang/String; = "com.huawei.bone.action.GET_BETA_INFO"

.field public static final RECIVE_GET_BETA_LOG:Ljava/lang/String; = "com.huawei.bone.action.GET_BETA_LOG"

.field public static final SEND_GET_BETA_INFO:Ljava/lang/String; = "com.huawei.crowdtest.action.GET_BETA_INFO"

.field public static final SEND_GET_BETA_LOG:Ljava/lang/String; = "com.huawei.crowdtest.action.GET_BETA_LOG"

.field private static final TAG:Ljava/lang/String; = "DeviceDFXReceiver"


# instance fields
.field private logLevel:I

.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->mContext:Landroid/content/Context;

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->logLevel:I

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private broadcastMaintResult()V
    .locals 6

    .line 82
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastMaintResult SEND_GET_BETA_LOG = com.huawei.crowdtest.action.GET_BETA_LOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.crowdtest.action.GET_BETA_LOG"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 84
    new-instance v5, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;

    invoke-direct {v5}, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;-><init>()V

    .line 85
    const/16 v0, 0xc8

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->setResponseCode(I)V

    .line 86
    const-string v0, "Request"

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 88
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastCrowdDeviceInfoResult: send result!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    return-void
.end method

.method private isSupport()Z
    .locals 5

    .line 93
    invoke-static {}, Lo/dgk;->d()Z

    move-result v4

    .line 94
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BuildConfig.SUPPORT_LOG_FEEDBACK false,experence =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",Utils.isOversea() =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/czu;->e()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    if-eqz v4, :cond_0

    const/16 v0, 0x30

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    .line 98
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 39
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 40
    :cond_0
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void

    .line 43
    :cond_1
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->mContext:Landroid/content/Context;

    .line 44
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->isSupport()Z

    move-result v0

    if-nez v0, :cond_2

    .line 45
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support DFX"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void

    .line 48
    :cond_2
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceDFXReceiver, intent.getAction() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    const-string v0, "com.huawei.bone.action.GET_BETA_INFO"

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 51
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceDFXReceiver, RECIVE_GET_BETA_INFO getFirmwareVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getCrowdFirmwareVersion()V

    .line 55
    :cond_3
    const-string v0, "com.huawei.bone.action.GET_BETA_LOG"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 56
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceDFXReceiver startMainteFile: logLevel = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->logLevel:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->broadcastMaintResult()V

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;->logLevel:I

    new-instance v2, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver$1;

    invoke-direct {v2, p0}, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver$1;-><init>(Lcom/huawei/hwdevicedfxmanager/receiver/DeviceDFXReceiver;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getCrowdTestAndMaint(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :cond_4
    goto :goto_0

    .line 76
    :catch_0
    move-exception v4

    .line 77
    const-string v0, "DeviceDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_0
    return-void
.end method
