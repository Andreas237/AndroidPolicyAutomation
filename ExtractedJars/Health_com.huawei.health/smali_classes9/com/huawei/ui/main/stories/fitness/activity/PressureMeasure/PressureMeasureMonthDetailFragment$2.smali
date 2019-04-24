.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 8

    .line 85
    iget v4, p1, Landroid/os/Message;->what:I

    .line 86
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 88
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;I)V

    .line 90
    goto/16 :goto_0

    .line 92
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v0, v6}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/List;)V

    .line 94
    goto :goto_0

    .line 96
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/ArrayList;

    .line 97
    const-string v0, "PressureMeasureMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "monthList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v0, v7}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/ArrayList;)V

    .line 99
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    const/4 v1, 0x1

    invoke-static {v0, v7, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/List;Z)V

    goto :goto_0

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/List;Z)V

    .line 104
    goto :goto_0

    .line 106
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment$2;->e:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureMonthDetailFragment;Ljava/util/Date;)V

    .line 113
    :cond_1
    :goto_0
    :pswitch_4
    const/4 v0, 0x0

    return v0

    nop

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
