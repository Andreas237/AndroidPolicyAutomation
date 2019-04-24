.class public Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final DEVICE_TRIGGER_GET_LOG:Ljava/lang/String; = "com.huawei.bone.dfx.device_trigger_log"

.field private static final TAG:Ljava/lang/String; = "DeviceTriggerDFXReceiver"


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver;->mContext:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver;)Landroid/content/Context;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private isSupport()Z
    .locals 5

    .line 65
    invoke-static {}, Lo/dgk;->d()Z

    move-result v4

    .line 67
    const-string v0, "DeviceTriggerDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BuildConfig.SUPPORT_LOG_FEEDBACK false,experence = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    if-eqz v4, :cond_0

    const/16 v0, 0x30

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    .line 71
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 30
    const-string v0, "DeviceTriggerDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceTriggerDFXReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver;->mContext:Landroid/content/Context;

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver;->isSupport()Z

    move-result v0

    if-nez v0, :cond_0

    .line 33
    const-string v0, "DeviceTriggerDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not support DXF"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void

    .line 37
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 38
    const-string v0, "DeviceTriggerDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == intent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    return-void

    .line 41
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 42
    const-string v0, "isUploadAppLog"

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 43
    const-string v0, "DeviceTriggerDFXReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceTriggerDFXReceiver action: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    const-string v0, "com.huawei.bone.dfx.device_trigger_log"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    invoke-static {p1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver$1;

    invoke-direct {v1, p0, v5}, Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver$1;-><init>(Lcom/huawei/hwdevicedfxmanager/receiver/DeviceTriggerDFXReceiver;I)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getMaintanceFileNoRestrict(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V

    .line 62
    :cond_2
    return-void
.end method
