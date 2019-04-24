.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->saveTrackData(Lcom/huawei/datatype/MotionPathSimplify;Lcom/huawei/datatype/MotionPath;)I
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

    .line 905
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 908
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveTrackData MotionPath onSuccess obj = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", DataItemNum="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    .line 909
    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 908
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$610(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 912
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$600(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 913
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData finished broardCast to health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.workout_record_save_finish"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 915
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 916
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$700(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 917
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$2;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->triggerHiHealthCloutSync()V

    .line 919
    :cond_0
    return-void
.end method
