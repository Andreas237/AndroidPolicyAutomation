.class public Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/motiondetection/motionrelay/IRelay;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "RelayBroadcast"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mRHandler:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;

.field private mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

.field private mRelayReceiver:Lcom/huawei/motiondetection/motionrelay/RelayReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRHandler:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayReceiver:Lcom/huawei/motiondetection/motionrelay/RelayReceiver;

    .line 68
    iput-object p1, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    .line 69
    new-instance v0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;

    invoke-direct {v0, p0}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;-><init>(Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;)V

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRHandler:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;

    .line 70
    new-instance v0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;

    iget-object v1, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRHandler:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;

    invoke-direct {v0, v1}, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayReceiver:Lcom/huawei/motiondetection/motionrelay/RelayReceiver;

    .line 72
    invoke-direct {p0}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->initReceiver()V

    .line 73
    return-void
.end method

.method static synthetic access$0(Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;Landroid/content/Intent;)V
    .locals 0

    .line 225
    invoke-direct {p0, p1}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->processMotionRecoResult(Landroid/content/Intent;)V

    return-void
.end method

.method private doModtionReco(II)V
    .locals 5

    .line 175
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.action_MOTIONOPERATE"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 176
    const-string v0, "app_motion_type"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 177
    const-string v0, "app_operation_type"

    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 179
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->getCurProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 180
    const-string v0, "app_process_name"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    const-string v0, "app_pkg_name"

    iget-object v1, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    const-string v0, "app_class_name"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 192
    const-string v0, "RelayBroadcast"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "doModtionReco sendBroadcast motionType: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  operateType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 193
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 192
    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    .line 197
    const-string v1, "com.huawei.motion.permission.MOTION_ACTION_OPERATE"

    .line 196
    invoke-virtual {v0, v3, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 199
    return-void
.end method

.method private getCurProcessName(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 208
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    .line 209
    const-string v0, "RelayBroadcast"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getCurProcessName pid: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/ActivityManager;

    .line 211
    invoke-virtual {v4}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 212
    iget v0, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v0, v3, :cond_1

    .line 213
    iget-object v0, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    return-object v0

    .line 211
    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    const-string v0, ""

    return-object v0
.end method

.method private initReceiver()V
    .locals 5

    .line 157
    :try_start_0
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.action_MOTIONRECOGNITION"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayReceiver:Lcom/huawei/motiondetection/motionrelay/RelayReceiver;

    .line 160
    const-string v2, "com.huawei.motion.permission.MOTION_ACTION_RECOGNITION"

    .line 159
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 162
    :catch_0
    move-exception v4

    .line 163
    const-string v0, "RelayBroadcast"

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    :goto_0
    return-void
.end method

.method private processMotionRecoResult(Landroid/content/Intent;)V
    .locals 3

    .line 228
    :try_start_0
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 230
    const/4 v1, 0x1

    invoke-interface {v0, v1, p1}, Lcom/huawei/motiondetection/motionrelay/RelayListener;->notifyResult(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 232
    :catch_0
    move-exception v2

    .line 233
    const-string v0, "RelayBroadcast"

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayReceiver:Lcom/huawei/motiondetection/motionrelay/RelayReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayReceiver:Lcom/huawei/motiondetection/motionrelay/RelayReceiver;

    invoke-virtual {v0}, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->destroy()V

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayReceiver:Lcom/huawei/motiondetection/motionrelay/RelayReceiver;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRHandler:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    .line 92
    return-void
.end method

.method public setRelayListener(Lcom/huawei/motiondetection/motionrelay/RelayListener;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 149
    return-void
.end method

.method public startMotionReco(I)V
    .locals 1

    .line 128
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->doModtionReco(II)V

    .line 129
    return-void
.end method

.method public startMotionService()V
    .locals 3

    .line 100
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.action_MOTION"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 101
    const-string v0, "com.huawei.motionservice"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    const/16 v0, 0x20

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 104
    const-string v0, "motion_service_start_type"

    .line 104
    .line 105
    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 106
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 107
    return-void
.end method

.method public stopMotionReco(I)V
    .locals 1

    .line 138
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->doModtionReco(II)V

    .line 139
    return-void
.end method

.method public stopMotionService()V
    .locals 2

    .line 114
    new-instance v1, Landroid/content/Intent;

    const-string v0, "com.huawei.action_MOTION"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 116
    const-string v0, "com.huawei.motionservice"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 119
    return-void
.end method
