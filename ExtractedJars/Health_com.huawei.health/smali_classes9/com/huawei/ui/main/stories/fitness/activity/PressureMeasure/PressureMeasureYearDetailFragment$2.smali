.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 7

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    int-to-long v1, p1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;J)J

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    int-to-long v1, p2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;J)J

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)Lo/fbx;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/fbx;->c(II)Ljava/lang/String;

    move-result-object v6

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    new-instance v1, Ljava/util/Date;

    int-to-long v2, p1

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    new-instance v1, Ljava/util/Date;

    int-to-long v2, p2

    const-wide/16 v4, 0x3c

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)Ljava/util/Date;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    int-to-long v1, p1

    int-to-long v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;JJ)V

    .line 210
    return-void
.end method
