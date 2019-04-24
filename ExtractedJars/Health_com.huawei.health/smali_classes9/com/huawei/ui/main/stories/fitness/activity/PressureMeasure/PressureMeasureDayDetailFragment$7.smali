.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)V
    .locals 0

    .line 473
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$7;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 476
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 477
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 478
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 479
    const/16 v0, 0x3ec

    iput v0, v1, Landroid/os/Message;->what:I

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$7;->b:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->A:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 481
    return-void
.end method
