.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->b(JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 441
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$6;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->D:Landroid/os/Handler;

    const/16 v1, 0x3ed

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 444
    :cond_0
    return-void
.end method
