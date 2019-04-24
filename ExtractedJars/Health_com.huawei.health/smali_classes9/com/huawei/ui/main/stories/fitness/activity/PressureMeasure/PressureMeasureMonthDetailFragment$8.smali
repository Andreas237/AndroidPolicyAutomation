.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(JJ)V
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

    .line 403
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 406
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$8;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3ed

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 409
    :cond_0
    return-void
.end method
