.class public Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessPrivateBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessPrivateBroadcastReceiver;->d:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static c(Z)V
    .locals 0

    .line 41
    sput-boolean p0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessPrivateBroadcastReceiver;->d:Z

    .line 42
    return-void
.end method

.method public static d()Z
    .locals 1

    .line 37
    sget-boolean v0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessPrivateBroadcastReceiver;->d:Z

    return v0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 46
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    return-void

    .line 49
    :cond_0
    const-string v0, "SyncFitnessPrivateBroadcastReceiver"

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

    .line 51
    const-string v0, "com.huawei.bone.action.force_stop"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    const-string v0, "SyncFitnessPrivateBroadcastReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "com.huawei.phoneservice was stopped unusually."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    new-instance v5, Lo/dct;

    invoke-direct {v5}, Lo/dct;-><init>()V

    .line 54
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "security_setting"

    const-string v2, "popup_flag"

    const-string v3, "true"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 55
    goto :goto_0

    :cond_1
    const-string v0, "com.huawei.bone.core_sleep_sync"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    const-string v0, "SyncFitnessPrivateBroadcastReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter ACTION_CORE_SLEEP_SYNC."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-static {p1}, Lo/dgh;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 58
    :cond_2
    const-string v0, "com.huawei.bone.stress_and_relax_sync"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 59
    const-string v0, "SyncFitnessPrivateBroadcastReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter ACTION_STRESS_AND_RELAX_SYNC."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const-string v0, "SyncFitnessPrivateBroadcastReceiver"

    invoke-static {v0}, Lo/dgh;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 61
    :cond_3
    const-string v0, "com.huawei.bone.action.open_gps"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 62
    const-string v0, "SyncFitnessPrivateBroadcastReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_OPEN_GPS~~~"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessPrivateBroadcastReceiver;->c(Z)V

    .line 65
    :cond_4
    :goto_0
    return-void
.end method
