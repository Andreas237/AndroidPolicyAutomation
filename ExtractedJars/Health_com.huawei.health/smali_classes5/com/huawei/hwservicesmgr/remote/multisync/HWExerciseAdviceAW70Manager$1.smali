.class Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->notifyDetailSyncComplete(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

.field final synthetic val$errCode:I


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;I)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->val$errCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 293
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$200(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$100(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$300(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)V

    .line 296
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->val$errCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 297
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$400(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$500(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;J)V

    goto :goto_0

    .line 299
    :cond_0
    const-string v0, "HWExerciseAdviceAW70Manager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync start device is not same with end device, or gps error,don\'t save timestamp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$602(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;Z)Z

    .line 303
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 304
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;->access$700(Lcom/huawei/hwservicesmgr/remote/multisync/HWExerciseAdviceAW70Manager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "success"

    const-string v2, "syncDeviceWorkoutRecordInfo"

    .line 305
    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 304
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 307
    :cond_2
    return-void
.end method
