.class Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 248
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fat$d;

    .line 249
    iget v0, v5, Lo/fat$d;->c:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 251
    :pswitch_0
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 252
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 253
    const-string v0, "intent_key_query_start_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 254
    const-string v0, "FitnessdataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startActivity CALORIE mQueryStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/calorie/FitnessCalorieDetailActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 257
    const-string v0, "bundle_key_data"

    invoke-virtual {v6, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 259
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->startActivity(Landroid/content/Intent;)V

    .line 260
    goto/16 :goto_0

    .line 262
    :pswitch_1
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 263
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 264
    const-string v0, "intent_key_query_start_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v1

    invoke-virtual {v9, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 265
    const-string v0, "FitnessdataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startActivity STEP mQueryStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/step/FitnessStepDetailActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 268
    const-string v0, "bundle_key_data"

    invoke-virtual {v8, v0, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 269
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-virtual {v0, v8}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->startActivity(Landroid/content/Intent;)V

    .line 270
    goto/16 :goto_0

    .line 272
    :pswitch_2
    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 273
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 274
    const-string v0, "intent_key_query_start_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v1

    invoke-virtual {v11, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 275
    const-string v0, "FitnessdataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startActivity DISTANCE mQueryStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/distance/FitnessDistanceDetailActivity;

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 278
    const-string v0, "bundle_key_data"

    invoke-virtual {v10, v0, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 279
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-virtual {v0, v10}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->startActivity(Landroid/content/Intent;)V

    .line 280
    goto/16 :goto_0

    .line 282
    :pswitch_3
    new-instance v12, Landroid/content/Intent;

    invoke-direct {v12}, Landroid/content/Intent;-><init>()V

    .line 283
    new-instance v13, Landroid/os/Bundle;

    invoke-direct {v13}, Landroid/os/Bundle;-><init>()V

    .line 284
    const-string v0, "intent_key_query_start_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v1

    invoke-virtual {v13, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 286
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 287
    const-string v0, "bundle_key_data"

    invoke-virtual {v12, v0, v13}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 288
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-virtual {v0, v12}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->startActivity(Landroid/content/Intent;)V

    .line 290
    goto/16 :goto_0

    .line 292
    :pswitch_4
    new-instance v14, Landroid/content/Intent;

    invoke-direct {v14}, Landroid/content/Intent;-><init>()V

    .line 293
    new-instance v15, Landroid/os/Bundle;

    invoke-direct {v15}, Landroid/os/Bundle;-><init>()V

    .line 294
    const-string v0, "intent_key_query_start_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v1

    invoke-virtual {v15, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/climb/FitnessClimbDetailActivity;

    invoke-virtual {v14, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 296
    const-string v0, "bundle_key_data"

    invoke-virtual {v14, v0, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 297
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-virtual {v0, v14}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->startActivity(Landroid/content/Intent;)V

    .line 299
    goto :goto_0

    .line 301
    :pswitch_5
    new-instance v16, Landroid/content/Intent;

    invoke-direct/range {v16 .. v16}, Landroid/content/Intent;-><init>()V

    .line 302
    new-instance v17, Landroid/os/Bundle;

    invoke-direct/range {v17 .. v17}, Landroid/os/Bundle;-><init>()V

    .line 303
    const-string v0, "intent_key_query_start_time"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;)J

    move-result-wide v1

    move-object/from16 v3, v17

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 304
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDetailActivity;

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 305
    const-string v0, "bundle_key_data"

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 306
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity$1;->e:Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/fitnessdata/FitnessdataActivity;->startActivity(Landroid/content/Intent;)V

    .line 308
    .line 312
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
