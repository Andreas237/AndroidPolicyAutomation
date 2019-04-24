.class public Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 57
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->c:Ljava/lang/String;

    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 2

    .line 241
    iget v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 242
    const/high16 v0, 0x70000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 244
    :cond_0
    return-void
.end method

.method private e(II)V
    .locals 6

    .line 252
    iget v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 253
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 254
    sget-object v0, Lo/dae;->bQ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 255
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    const-string v0, "type"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 258
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->c:Ljava/lang/String;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v4

    .line 261
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v5

    .line 262
    const/4 v0, 0x0

    invoke-virtual {v5, v4, v3, v2, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 263
    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 264
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 265
    sget-object v0, Lo/dae;->bE:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 266
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    const-string v0, "module"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    const-string v0, "type"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 270
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->c:Ljava/lang/String;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v4

    .line 273
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v5

    .line 274
    const/4 v0, 0x0

    invoke-virtual {v5, v4, v3, v2, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 276
    :cond_3
    :goto_0
    return-void
.end method

.method private e(IILjava/lang/String;)V
    .locals 19

    .line 81
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 82
    const-string v0, "status"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 83
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    move/from16 v1, p1

    invoke-virtual {v0, v1, v7}, Lo/dln;->d(ILandroid/content/ContentValues;)Z

    .line 84
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 85
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "skipToTargetActivity, msgType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_1

    .line 88
    :sswitch_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    move/from16 v2, p2

    move-object/from16 v3, p3

    invoke-static {v0, v1, v2, v3}, Lo/fhx;->b(ILandroid/content/Context;ILjava/lang/String;)V

    .line 89
    move-object/from16 v0, p0

    const/16 v1, 0x2710

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 90
    goto/16 :goto_1

    .line 92
    :sswitch_1
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    move/from16 v2, p2

    move-object/from16 v3, p3

    invoke-static {v0, v1, v2, v3}, Lo/fhx;->b(ILandroid/content/Context;ILjava/lang/String;)V

    .line 93
    move-object/from16 v0, p0

    const/16 v1, 0x2710

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 94
    goto/16 :goto_1

    .line 96
    :sswitch_2
    invoke-static/range {p3 .. p3}, Lo/fhx;->e(Ljava/lang/String;)V

    .line 97
    move-object/from16 v0, p0

    const/16 v1, 0x2710

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 98
    goto/16 :goto_1

    .line 100
    :sswitch_3
    move-object/from16 v0, p0

    const/16 v1, 0x4e20

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 101
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/me/activity/MyTargetActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 102
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 103
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 104
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 105
    goto/16 :goto_1

    .line 107
    :sswitch_4
    move-object/from16 v0, p0

    const/16 v1, 0x4e20

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 108
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 110
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 111
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 112
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 113
    goto/16 :goto_1

    .line 115
    :sswitch_5
    move-object/from16 v0, p0

    const/16 v1, 0x4e20

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 116
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    move-object/from16 v2, p3

    invoke-virtual {v0, v2, v1}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    .line 117
    invoke-virtual {v9}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v10

    .line 118
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/brt;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 119
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 120
    goto/16 :goto_1

    .line 122
    :sswitch_6
    move-object/from16 v0, p0

    const/16 v1, 0x4e20

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 123
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 124
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 125
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 127
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 128
    goto/16 :goto_1

    .line 130
    :sswitch_7
    move-object/from16 v0, p0

    const/16 v1, 0x7530

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 132
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 134
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 135
    goto/16 :goto_1

    .line 144
    :sswitch_8
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/fhx;->d(ILandroid/content/Context;Ljava/lang/String;)V

    .line 145
    move-object/from16 v0, p0

    const v1, 0x9c40

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 146
    goto/16 :goto_1

    .line 149
    :sswitch_9
    move-object/from16 v0, p0

    const v1, 0xc350

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 150
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/fhx;->b(ILandroid/content/Context;Ljava/lang/String;)V

    .line 151
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 152
    goto/16 :goto_1

    .line 154
    :sswitch_a
    move-object/from16 v0, p0

    const v1, 0xea60

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 156
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 157
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 158
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 159
    goto/16 :goto_1

    .line 161
    :sswitch_b
    move-object/from16 v0, p0

    const v1, 0x11170

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 163
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 164
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 165
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 166
    goto/16 :goto_1

    .line 170
    :sswitch_c
    move-object/from16 v0, p0

    const v1, 0x13880

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 171
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    move-object/from16 v2, p3

    invoke-static {v0, v1, v2}, Lo/fhx;->c(ILandroid/content/Context;Ljava/lang/String;)V

    .line 172
    goto/16 :goto_1

    .line 174
    :sswitch_d
    move-object/from16 v0, p0

    const v1, 0x13880

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 175
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 176
    const-string v0, "core_sleep_skip_sign"

    const/16 v1, 0x2711

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 177
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 178
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 179
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 180
    goto/16 :goto_1

    .line 182
    :sswitch_e
    move-object/from16 v0, p0

    const v1, 0x13880

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 183
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/FitnessSleepDetailActivity;

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 184
    const-string v0, "core_sleep_skip_sign"

    const/16 v1, 0x2712

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 185
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->b(Landroid/content/Intent;)V

    .line 186
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 187
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 188
    goto/16 :goto_1

    .line 190
    :sswitch_f
    move-object/from16 v0, p0

    const v1, 0x15f91

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 192
    :try_start_0
    new-instance v11, Lorg/json/JSONObject;

    move-object/from16 v0, p3

    invoke-direct {v11, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 193
    const-string v0, "msgDetailUrl"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 194
    const-string v0, " "

    invoke-virtual {v12, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 195
    if-eqz v13, :cond_0

    array-length v0, v13

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 196
    :cond_0
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can\'t resolve trackUrl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 197
    return-void

    .line 199
    :cond_1
    const-wide/16 v14, 0x0

    .line 200
    const-wide/16 v16, 0x0

    .line 202
    const/4 v0, 0x0

    :try_start_1
    aget-object v0, v13, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v14, v0

    .line 203
    const/4 v0, 0x1

    aget-object v0, v13, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-wide v0

    move-wide/from16 v16, v0

    .line 208
    goto :goto_0

    .line 204
    :catch_0
    move-exception v18

    .line 205
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    goto :goto_0

    .line 206
    :catch_1
    move-exception v18

    .line 207
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v14, v0

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x0

    cmp-long v0, v16, v0

    if-eqz v0, :cond_2

    .line 210
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-wide v1, v14

    move-wide/from16 v3, v16

    new-instance v5, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity$1;

    move-object/from16 v6, p0

    invoke-direct {v5, v6}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity$1;-><init>(Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;)V

    invoke-virtual/range {v0 .. v5}, Lo/dgu;->c(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 223
    :cond_2
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msgContent: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 228
    goto :goto_1

    .line 226
    :catch_2
    move-exception v11

    .line 227
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "track content parse error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    goto :goto_1

    .line 231
    :sswitch_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lo/fhx;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 232
    move-object/from16 v0, p0

    const v1, 0x186a0

    move/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(II)V

    .line 233
    .line 238
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2710 -> :sswitch_0
        0x2711 -> :sswitch_1
        0x2712 -> :sswitch_2
        0x4e20 -> :sswitch_3
        0x4e25 -> :sswitch_4
        0x4e26 -> :sswitch_5
        0x4e27 -> :sswitch_6
        0x7531 -> :sswitch_7
        0x9c40 -> :sswitch_8
        0x9c41 -> :sswitch_8
        0x9c42 -> :sswitch_8
        0x9c43 -> :sswitch_8
        0x9c44 -> :sswitch_8
        0x9c45 -> :sswitch_8
        0x9c46 -> :sswitch_8
        0x9c47 -> :sswitch_8
        0xc350 -> :sswitch_9
        0xc351 -> :sswitch_9
        0xea60 -> :sswitch_a
        0x11171 -> :sswitch_b
        0x13880 -> :sswitch_c
        0x13881 -> :sswitch_c
        0x13882 -> :sswitch_d
        0x13883 -> :sswitch_e
        0x13884 -> :sswitch_c
        0x15f91 -> :sswitch_f
        0x186a0 -> :sswitch_10
    .end sparse-switch
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 62
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    iput-object p0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->d:Landroid/content/Context;

    .line 64
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 65
    if-nez v4, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 67
    return-void

    .line 69
    :cond_0
    const-string v0, "id"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    .line 70
    const-string v0, "msgType"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 71
    const-string v0, "msgContent"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 72
    const-string v0, "msgTitle"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->c:Ljava/lang/String;

    .line 73
    const-string v0, "from"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e:I

    .line 74
    const-string v0, "SmartMsgSkipActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SmartCard_mSmartMsgKeyId3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    invoke-direct {p0, v5, v6, v7}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->e(IILjava/lang/String;)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;->finish()V

    .line 77
    return-void
.end method
