.class public Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 60
    invoke-static {p0}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessPrivateBroadcastReceiver;->c(Z)V

    .line 61
    return-void
.end method

.method public static b()V
    .locals 5

    .line 89
    sget-object v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " sending broadcast to notify UI thread ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CORE_SLEEP_DATA_SYNC_COMPLETED"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 91
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 92
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 93
    return-void
.end method

.method public static d()Z
    .locals 1

    .line 56
    invoke-static {}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessPrivateBroadcastReceiver;->d()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 65
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    return-void

    .line 68
    :cond_0
    sget-object v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReceive(): intent.getAction() = "

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

    .line 70
    const-string v0, "com.huawei.hihealth.action_receive_push_restart"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    sget-object v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "starting phoneservice~~~~~~~~~~~~~~~~~"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver$5;

    invoke-direct {v1, p0}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver$5;-><init>(Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 82
    :cond_1
    const-string v0, "com.huawei.bone.action.ACTION_HEALTH_MANUAL_DROP_DO_REFRESH"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dgh;->d(Z)V

    .line 84
    sget-object v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_HEALTH_MANUAL_DROP_DO_REFRESH received~~~"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    :cond_2
    :goto_0
    return-void
.end method
