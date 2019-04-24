.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V
    .locals 0

    .line 286
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 7

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    int-to-long v1, p1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;J)J

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    int-to-long v1, p2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;J)J

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->A:Lo/fbx;

    invoke-virtual {v0, p1, p2}, Lo/fbx;->c(II)Ljava/lang/String;

    move-result-object v6

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    new-instance v1, Ljava/util/Date;

    int-to-long v2, p1

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 296
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCurrentStartDate1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    int-to-long v1, p1

    int-to-long v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;JJ)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    new-instance v1, Ljava/util/Date;

    mul-int/lit8 v2, p1, 0x3c

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    new-instance v1, Ljava/util/Date;

    mul-int/lit8 v2, p2, 0x3c

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    sub-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 301
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mStartDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mCurrentEndDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$1;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    return-void
.end method
