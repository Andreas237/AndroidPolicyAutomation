.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 12

    .line 331
    const-string v0, "PressureMeasureDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRangeShow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->C:Lo/fbx;

    invoke-virtual {v0, p1, p2}, Lo/fbx;->c(II)Ljava/lang/String;

    move-result-object v5

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long v6, v0, v2

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->j:Landroid/widget/TextView;

    invoke-static {v6, v7}, Lo/fby;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 336
    const-string v0, "PressureMeasureDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v8

    .line 340
    invoke-virtual {v8, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 341
    const/16 v0, 0xb

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 342
    const/16 v0, 0xc

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v10

    .line 343
    if-nez v9, :cond_0

    if-nez v10, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-nez v0, :cond_1

    .line 344
    :cond_0
    return-void

    .line 349
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0, v6, v7}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;J)J

    .line 351
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0, v11}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$5;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v11}, Lo/dbu;->m(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->b(J)V

    .line 354
    const-string v0, "PressureMeasureDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "begin  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v11}, Lo/dbu;->m(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    return-void
.end method
