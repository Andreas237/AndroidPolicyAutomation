.class Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getSectionList(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

.field final synthetic val$errorCode:I

.field final synthetic val$mSectionIndex:I

.field final synthetic val$workout_record_id:I


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;III)V
    .locals 0

    .line 3558
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$mSectionIndex:I

    iput p3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$workout_record_id:I

    iput p4, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$errorCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 3561
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter getSectionList().onResponse()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3563
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/Map;

    .line 3564
    const-string v0, "value"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 3565
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3566
    const-string v0, "section_struct"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONArray;

    .line 3567
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3568
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4408(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3569
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3570
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sectionIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$mSectionIndex:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mSectionListdStatisticIndex = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4400(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mSectionRecordsStatisticJsonObjects.size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4100(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3571
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$workout_record_id:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$mSectionIndex:I

    iget v3, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$errorCode:I

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;III)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3578
    goto :goto_0

    .line 3573
    :catch_0
    move-exception v4

    .line 3574
    const-string v0, "HWExerciseAdviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3575
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4408(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;)I

    .line 3577
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->this$0:Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$workout_record_id:I

    iget v2, p0, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager$9;->val$mSectionIndex:I

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->access$4200(Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;III)V

    .line 3579
    :goto_0
    return-void
.end method
