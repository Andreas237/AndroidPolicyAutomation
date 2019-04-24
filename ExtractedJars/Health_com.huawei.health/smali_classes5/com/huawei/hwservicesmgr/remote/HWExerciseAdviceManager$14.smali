.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->triggerHiHealthCloutSync()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)V
    .locals 0

    .line 4061
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$14;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 4064
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggerHiHealthCloutSync enter thread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4065
    new-instance v4, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 4066
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 4067
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 4068
    const/16 v0, 0x4e20

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 4069
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 4070
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 4071
    return-void
.end method
