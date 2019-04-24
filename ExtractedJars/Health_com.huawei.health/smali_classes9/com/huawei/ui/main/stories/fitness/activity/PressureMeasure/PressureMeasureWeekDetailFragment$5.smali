.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 80
    iget v2, p1, Landroid/os/Message;->what:I

    .line 81
    packed-switch v2, :pswitch_data_0

    goto/16 :goto_0

    .line 83
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v0, v3}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;I)V

    .line 85
    goto :goto_0

    .line 87
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/List;)V

    .line 89
    goto :goto_0

    .line 91
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/ArrayList;

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/ArrayList;)V

    .line 93
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    const/4 v1, 0x1

    invoke-static {v0, v5, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/List;Z)V

    goto :goto_0

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/List;Z)V

    .line 98
    goto :goto_0

    .line 100
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureWeekDetailFragment;Ljava/util/Date;)V

    .line 107
    :cond_1
    :goto_0
    :pswitch_4
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
