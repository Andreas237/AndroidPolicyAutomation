.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 222
    iget v2, p1, Landroid/os/Message;->what:I

    .line 223
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    .line 225
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$1;->c:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment;->i:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$1$1;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/BasePressureMeasureFragment$1;)V

    invoke-static {v0, v1}, Lo/fbw;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 242
    .line 246
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
    .end sparse-switch
.end method
