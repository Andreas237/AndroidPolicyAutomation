.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    .line 78
    iget v2, p1, Landroid/os/Message;->what:I

    .line 79
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    .line 81
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    invoke-static {v0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/List;)V

    .line 83
    goto :goto_0

    .line 85
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 87
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    const/4 v1, 0x1

    invoke-static {v0, v4, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/List;Z)V

    goto :goto_0

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureYearDetailFragment;Ljava/util/List;Z)V

    .line 92
    .line 96
    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3ed -> :sswitch_1
    .end sparse-switch
.end method
