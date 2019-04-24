.class Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver$5;->c:Lcom/huawei/hwfitnessmgr/receiver/SyncFitnessDetailDataBroadcastReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 75
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 76
    const-string v0, "com.huawei.bone.action.StartPhoneService"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 77
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 79
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    .line 80
    return-void
.end method
