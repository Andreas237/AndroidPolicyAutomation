.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 7

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    int-to-long v1, p1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;J)J

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    int-to-long v1, p2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;J)J

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)Lo/fbx;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/fbx;->c(II)Ljava/lang/String;

    move-result-object v6

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    new-instance v1, Ljava/util/Date;

    int-to-long v2, p1

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    int-to-long v1, p1

    int-to-long v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;JJ)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    new-instance v1, Ljava/util/Date;

    mul-int/lit8 v2, p2, 0x3c

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    sub-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    new-instance v1, Ljava/util/Date;

    mul-int/lit8 v2, p1, 0x3c

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    new-instance v1, Ljava/util/Date;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)Lo/fbx;

    move-result-object v2

    invoke-virtual {v2}, Lo/fbx;->J()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 317
    return-void
.end method
