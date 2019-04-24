.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

.field private d:I

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)V
    .locals 1

    .line 1355
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1352
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 1356
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 1357
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->d:I

    .line 1358
    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 1395
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->d:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1397
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/fbs;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbs;->a()V

    .line 1398
    goto :goto_1

    .line 1400
    :goto_0
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGoal fectch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1404
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 1362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    .line 1363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 1364
    :cond_0
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mActivity or data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1365
    return-void

    .line 1367
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->d:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 1369
    :sswitch_0
    const/4 v4, 0x0

    .line 1371
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 1374
    goto :goto_0

    .line 1372
    :catch_0
    move-exception v5

    .line 1373
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1376
    :goto_0
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 1377
    :cond_2
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Step Goal fectch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1378
    return-void

    .line 1380
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I

    .line 1381
    goto :goto_2

    .line 1383
    :sswitch_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1384
    const-string v0, "value"

    invoke-interface {v5, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$a;->a:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->r(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Lo/fbs;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/fbs;->e(Ljava/util/Map;)V

    .line 1386
    goto :goto_2

    .line 1388
    :goto_1
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "type is unkown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1391
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
