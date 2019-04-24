.class Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Landroid/content/Context;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)V
    .locals 0

    .line 1302
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 1305
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1306
    return-void

    .line 1308
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I

    .line 1309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I

    .line 1311
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1312
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1313
    const/4 v5, 0x0

    .line 1314
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 1315
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v5, v0

    .line 1314
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1317
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->e(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I

    .line 1318
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStepDataByMonth data1 is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , mCurrentDayValueMinimum is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->w(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1321
    :cond_2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_3

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1322
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 1323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->b(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;I)I

    .line 1324
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStepDataByMonth data2 is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " , mYearValidSize is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->v(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1328
    :cond_3
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 1329
    const/16 v0, 0x66

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1330
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;->y(Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1332
    const-string v0, "SCUI_FitnessStepDetailActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readStepDataByMonth data is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Landroid/util/SparseArray;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1334
    return-void
.end method
