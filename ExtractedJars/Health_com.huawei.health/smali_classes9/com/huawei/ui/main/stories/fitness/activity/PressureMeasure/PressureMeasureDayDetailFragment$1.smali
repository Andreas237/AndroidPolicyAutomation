.class Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 16

    .line 111
    move-object/from16 v0, p1

    iget v8, v0, Landroid/os/Message;->what:I

    .line 112
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_1

    .line 114
    :pswitch_0
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/util/List;

    .line 115
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0, v9}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;Ljava/util/List;)V

    .line 116
    goto/16 :goto_1

    .line 118
    :pswitch_1
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/util/ArrayList;

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->d:Lo/fca;

    const/16 v1, 0x2711

    invoke-virtual {v0, v10, v1}, Lo/fca;->a(Ljava/util/List;I)V

    .line 120
    goto/16 :goto_1

    .line 122
    :pswitch_2
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0, v11}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;I)V

    .line 124
    goto/16 :goto_1

    .line 126
    :pswitch_3
    invoke-static {}, Lo/fjc;->e()Ljava/lang/String;

    move-result-object v12

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_open_auto_pressure_detector_content:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->i:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1$4;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;)V

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->y:Landroid/widget/RelativeLayout;

    move-object v3, v13

    const-string v4, "pressure_auto_detector_agree_no_again_tip"

    const-string v5, "pressure_auto_detector_dialog_time"

    const-string v6, "pressure_auto_detector_count"

    const-string v7, "pressure_auto_detetor_is_show"

    invoke-static/range {v0 .. v7}, Lo/egp;->e(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/widget/RelativeLayout;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    goto/16 :goto_1

    .line 145
    :pswitch_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 146
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;Ljava/util/Date;)V

    goto/16 :goto_1

    .line 150
    :pswitch_5
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->arg1:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 151
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/util/List;

    .line 152
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 153
    const-string v0, "PressureMeasureDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SCORE = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v14, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v3}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->fetchStress_score()I

    move-result v15

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    invoke-static {v0, v15}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;I)V

    .line 156
    goto :goto_0

    .line 157
    :cond_0
    const-string v0, "PressureMeasureDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SCORE values is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;I)V

    .line 160
    :goto_0
    goto :goto_1

    .line 161
    :cond_1
    const-string v0, "PressureMeasureDayDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get SCORE values err , Code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    iget v3, v3, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment$1;->a:Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDayDetailFragment;I)V

    .line 164
    .line 168
    :cond_2
    :goto_1
    :pswitch_6
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method
