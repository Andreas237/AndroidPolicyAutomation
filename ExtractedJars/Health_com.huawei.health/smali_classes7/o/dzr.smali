.class public Lo/dzr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 92
    const/16 v0, 0x13

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "A5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "A10"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "A20"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "A40"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "A100"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "B7"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "B21"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "B100"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "A2_10"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "A2_50"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "A2_100"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "C10000"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "C100000"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "C300000"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "C1000000"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "C3000000"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "C5000000"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "C10000000"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "C15000000"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sput-object v0, Lo/dzr;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1135
    const-string v1, ""

    .line 1136
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 1138
    :pswitch_0
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1139
    goto :goto_0

    .line 1141
    :pswitch_1
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1142
    goto :goto_0

    .line 1144
    :pswitch_2
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_hwh_motiontrack_show_speed_pace_mi:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1145
    goto :goto_0

    .line 1147
    :pswitch_3
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1148
    goto :goto_0

    .line 1150
    :pswitch_4
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_steps:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1151
    .line 1155
    :goto_0
    :pswitch_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static a(JI)Ljava/lang/String;
    .locals 4

    .line 1302
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1304
    :pswitch_0
    const/16 v1, 0x34

    .line 1305
    goto :goto_1

    .line 1307
    :pswitch_1
    const/16 v1, 0x18

    .line 1308
    goto :goto_1

    .line 1310
    :pswitch_2
    const v1, 0x20004

    .line 1311
    goto :goto_1

    .line 1313
    :pswitch_3
    const v1, 0x20008

    .line 1314
    goto :goto_1

    .line 1316
    :goto_0
    const/16 v1, 0x14

    .line 1320
    :goto_1
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 1321
    invoke-static {v2, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v3

    .line 1322
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static a(JLjava/lang/String;)Ljava/lang/String;
    .locals 10
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    .line 806
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 807
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "deleteTrackData reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    const/4 v0, 0x0

    return-object v0

    .line 810
    :cond_0
    const/4 v3, 0x0

    .line 812
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 813
    move-object v5, v4

    .line 814
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 815
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 816
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 817
    const-string v0, "startTime"

    invoke-static {v0, v7}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v8

    .line 818
    cmp-long v0, p0, v8

    if-nez v0, :cond_1

    .line 819
    const/4 v3, 0x1

    .line 820
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 815
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 823
    :cond_2
    if-eqz v3, :cond_4

    .line 824
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 825
    const-string v0, ""

    return-object v0

    .line 827
    :cond_3
    :try_start_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    .line 833
    :cond_4
    goto :goto_1

    .line 831
    :catch_0
    move-exception v4

    .line 832
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteTrackData Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 834
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Lo/dyy;)Ljava/lang/String;
    .locals 7

    .line 603
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 604
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "getRefreshJsonStr reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    const-string v0, ""

    return-object v0

    .line 607
    :cond_0
    const-string v3, ""

    .line 609
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 610
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 611
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 612
    instance-of v0, p1, Lo/dyz;

    if-eqz v0, :cond_1

    .line 613
    move-object v6, p1

    check-cast v6, Lo/dyz;

    .line 614
    invoke-static {v6}, Lo/dzr;->c(Lo/dyz;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 615
    goto :goto_0

    :cond_1
    instance-of v0, p1, Lo/dyx;

    if-eqz v0, :cond_2

    .line 616
    move-object v6, p1

    check-cast v6, Lo/dyx;

    .line 617
    invoke-static {v6}, Lo/dzr;->e(Lo/dyx;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 618
    goto :goto_0

    :cond_2
    instance-of v0, p1, Lo/dyv;

    if-eqz v0, :cond_3

    .line 619
    move-object v6, p1

    check-cast v6, Lo/dyv;

    .line 620
    invoke-static {v6}, Lo/dzr;->b(Lo/dyv;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 622
    :cond_3
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 626
    :cond_4
    goto :goto_1

    .line 624
    :catch_0
    move-exception v4

    .line 625
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRefreshJsonStr Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    :goto_1
    return-object v3
.end method

.method public static a(Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/ArrayList<Lo/dyv;>;"
        }
    .end annotation

    .line 449
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 450
    invoke-static/range {p0 .. p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 451
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "parseBestMotionPace reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    return-object v3

    .line 455
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 456
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 457
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 458
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    .line 459
    new-instance v7, Lo/dyv;

    invoke-direct {v7}, Lo/dyv;-><init>()V

    .line 460
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 461
    const-string v0, "value"

    invoke-static {v0, v8}, Lo/dty;->a(Ljava/lang/String;Lorg/json/JSONObject;)D

    move-result-wide v9

    .line 462
    const-string v0, "startTime"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v11

    .line 463
    const-string v0, "endTime"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v13

    .line 464
    const-string v0, "source"

    invoke-static {v0, v8}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v15

    .line 465
    invoke-virtual {v7, v9, v10}, Lo/dyv;->d(D)V

    .line 466
    invoke-virtual {v7, v11, v12}, Lo/dyv;->b(J)V

    .line 467
    invoke-virtual {v7, v13, v14}, Lo/dyv;->a(J)V

    .line 468
    invoke-virtual {v7, v15}, Lo/dyv;->c(I)V

    .line 469
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 472
    :cond_1
    invoke-static {v3}, Lo/dzr;->c(Ljava/util/ArrayList;)V

    .line 473
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, p1

    if-le v0, v1, :cond_2

    .line 475
    move/from16 v0, p1

    invoke-static {v3, v0}, Lo/dzr;->a(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 477
    :cond_2
    return-object v3

    .line 481
    :cond_3
    goto :goto_1

    .line 479
    :catch_0
    move-exception v4

    .line 480
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStartTimeAndEndTime Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    :goto_1
    return-object v3
.end method

.method public static a(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    .locals 5

    .line 531
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getMaxList N:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 533
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_0

    .line 534
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 536
    :cond_0
    return-object v3
.end method

.method public static a(Ljava/lang/String;)Lo/dyx;
    .locals 14

    .line 370
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 371
    const/4 v0, 0x0

    return-object v0

    .line 373
    :cond_0
    new-instance v3, Lo/dyx;

    invoke-direct {v3}, Lo/dyx;-><init>()V

    .line 375
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 376
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 377
    const-wide/16 v5, 0x0

    .line 378
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 379
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 380
    const-string v0, "value"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v9

    .line 381
    const-string v0, "startTime"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v11

    .line 382
    const-string v0, "source"

    invoke-static {v0, v8}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v13

    .line 383
    cmp-long v0, v9, v5

    if-lez v0, :cond_1

    .line 384
    move-wide v5, v9

    .line 385
    invoke-virtual {v3, v9, v10}, Lo/dyx;->c(J)V

    .line 386
    invoke-virtual {v3, v11, v12}, Lo/dyx;->b(J)V

    .line 387
    invoke-virtual {v3, v13}, Lo/dyx;->d(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 378
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 391
    :cond_2
    return-object v3

    .line 395
    :cond_3
    goto :goto_1

    .line 393
    :catch_0
    move-exception v4

    .line 394
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStartTimeAndEndTime Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(I)Z
    .locals 1

    .line 1165
    const/4 v0, 0x1

    if-eq v0, p0, :cond_0

    const/4 v0, 0x3

    if-eq v0, p0, :cond_0

    const/16 v0, 0xa

    if-ne v0, p0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(DD)I
    .locals 4

    .line 769
    sub-double v2, p0, p2

    .line 770
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    cmpg-double v0, v2, v0

    if-gtz v0, :cond_0

    .line 771
    const/4 v0, -0x1

    return v0

    .line 772
    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, v2, v0

    if-ltz v0, :cond_1

    .line 773
    const/4 v0, 0x1

    return v0

    .line 775
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static b(D)Ljava/lang/String;
    .locals 4

    .line 1217
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, p0

    if-eqz v0, :cond_0

    .line 1218
    const-wide v0, 0x40ac200000000000L    # 3600.0

    div-double/2addr v0, p0

    invoke-static {v0, v1}, Lo/dzr;->d(D)D

    move-result-wide v2

    .line 1219
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v2, v3, v0, v1}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1221
    :cond_0
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "getCycleDistanceStr value Invalid"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1222
    const-string v0, ""

    return-object v0
.end method

.method public static b(ILandroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 930
    const-string v3, ""

    .line 931
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 933
    :pswitch_0
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_walk_distance_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 934
    goto/16 :goto_0

    .line 936
    :pswitch_1
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_single_day_most_steps:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 937
    goto/16 :goto_0

    .line 939
    :pswitch_2
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_run_distance_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 940
    goto/16 :goto_0

    .line 942
    :pswitch_3
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_single_day_best_run_match_speed:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 943
    goto/16 :goto_0

    .line 945
    :pswitch_4
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_3km_pace_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 946
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 947
    goto :goto_0

    .line 949
    :pswitch_5
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_3km_pace_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 950
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 951
    goto :goto_0

    .line 953
    :pswitch_6
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_3km_pace_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 954
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 955
    goto :goto_0

    .line 957
    :pswitch_7
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_hm_pace_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 958
    goto :goto_0

    .line 960
    :pswitch_8
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_fm_pace_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 961
    goto :goto_0

    .line 963
    :pswitch_9
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_cycle_distance_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 964
    goto :goto_0

    .line 966
    :pswitch_a
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_cycle_speed_record:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 967
    .line 971
    :goto_0
    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1332
    const-string v2, ""

    .line 1333
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v3, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1335
    :try_start_0
    invoke-virtual {v3, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 1336
    const/16 v0, 0x14

    invoke-static {v4, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 1339
    goto :goto_0

    .line 1337
    :catch_0
    move-exception v4

    .line 1338
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "getStepString ParseException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1340
    :goto_0
    return-object v2
.end method

.method public static b(Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/ArrayList<Lo/dyx;>;"
        }
    .end annotation

    .line 492
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 493
    invoke-static/range {p0 .. p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 494
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "parseBestMotionPace reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    return-object v3

    .line 498
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 499
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 500
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 501
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    .line 502
    new-instance v7, Lo/dyx;

    invoke-direct {v7}, Lo/dyx;-><init>()V

    .line 503
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 504
    const-string v0, "value"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v9

    .line 505
    const-string v0, "startTime"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v11

    .line 506
    const-string v0, "endTime"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v13

    .line 507
    const-string v0, "source"

    invoke-static {v0, v8}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v15

    .line 508
    invoke-virtual {v7, v9, v10}, Lo/dyx;->c(J)V

    .line 509
    invoke-virtual {v7, v11, v12}, Lo/dyx;->b(J)V

    .line 510
    invoke-virtual {v7, v13, v14}, Lo/dyx;->a(J)V

    .line 511
    invoke-virtual {v7, v15}, Lo/dyx;->d(I)V

    .line 512
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 501
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 516
    :cond_1
    invoke-static {v3}, Lo/dzr;->b(Ljava/util/ArrayList;)V

    .line 517
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    move/from16 v1, p1

    if-le v0, v1, :cond_2

    .line 519
    move/from16 v0, p1

    invoke-static {v3, v0}, Lo/dzr;->a(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 521
    :cond_2
    return-object v3

    .line 525
    :cond_3
    goto :goto_1

    .line 523
    :catch_0
    move-exception v4

    .line 524
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStartTimeAndEndTime Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    :goto_1
    return-object v3
.end method

.method public static b(Lo/dyv;)Lorg/json/JSONObject;
    .locals 5

    .line 786
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 788
    const-string v0, "value"

    :try_start_0
    invoke-virtual {p0}, Lo/dyv;->c()D

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 789
    const-string v0, "source"

    invoke-virtual {p0}, Lo/dyv;->a()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 790
    const-string v0, "deviceCode"

    invoke-virtual {p0}, Lo/dyv;->b()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 791
    const-string v0, "startTime"

    invoke-virtual {p0}, Lo/dyv;->d()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 792
    const-string v0, "endTime"

    invoke-virtual {p0}, Lo/dyv;->e()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 793
    return-object v3

    .line 794
    :catch_0
    move-exception v4

    .line 795
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSONException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 797
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 6

    .line 270
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "showNetworkErrorDialog()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 272
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "showNetworkErrorDialog() context is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    return-void

    .line 275
    :cond_0
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 276
    const/4 v4, 0x0

    .line 277
    const/4 v5, 0x0

    .line 278
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_network_error_msg_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_network_error_msg_content_2:I

    .line 279
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_network_error_msg_btn:I

    new-instance v2, Lo/dzr$2;

    invoke-direct {v2, v5}, Lo/dzr$2;-><init>(Lo/egv;)V

    .line 280
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 289
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 290
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 291
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 292
    return-void
.end method

.method public static b(Ljava/util/ArrayList;)V
    .locals 1

    .line 540
    new-instance v0, Lo/dzr$1;

    invoke-direct {v0}, Lo/dzr$1;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 551
    return-void
.end method

.method public static b(I)Z
    .locals 1

    .line 1091
    const/4 v0, 0x4

    if-lt p0, v0, :cond_0

    const/16 v0, 0x9

    if-gt p0, v0, :cond_0

    .line 1092
    const/4 v0, 0x0

    return v0

    .line 1094
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static b([Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 242
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 244
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    const/4 v0, 0x1

    return v0

    .line 248
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static c(J)Ljava/lang/String;
    .locals 3

    .line 1350
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 1351
    const/16 v0, 0x14

    invoke-static {v1, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v2

    .line 1352
    return-object v2
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 8

    .line 640
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 641
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 642
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    .line 643
    invoke-static {p2}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 644
    invoke-static {p0}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v6

    .line 645
    invoke-static {p1}, Lo/dzr;->e(Ljava/lang/String;)Lo/dyv;

    move-result-object v7

    .line 646
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 647
    :cond_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 649
    :cond_1
    :try_start_1
    invoke-virtual {v6}, Lo/dyv;->d()J

    move-result-wide v0

    invoke-virtual {v7}, Lo/dyv;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    invoke-virtual {v6}, Lo/dyv;->a()I

    move-result v0

    if-nez v0, :cond_2

    .line 650
    invoke-virtual {v6}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-virtual {v7}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_2

    .line 651
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "old pace"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    invoke-static {v6}, Lo/dzr;->b(Lo/dyv;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 655
    :cond_2
    goto :goto_0

    :cond_3
    invoke-static {p2}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 656
    invoke-static {p0}, Lo/dzr;->a(Ljava/lang/String;)Lo/dyx;

    move-result-object v6

    .line 657
    invoke-static {p1}, Lo/dzr;->a(Ljava/lang/String;)Lo/dyx;

    move-result-object v7

    .line 658
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    const/4 v0, 0x0

    if-ne v0, v7, :cond_5

    .line 659
    :cond_4
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    .line 661
    :cond_5
    :try_start_2
    invoke-virtual {v6}, Lo/dyx;->a()J

    move-result-wide v0

    invoke-virtual {v7}, Lo/dyx;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    invoke-virtual {v6}, Lo/dyx;->b()I

    move-result v0

    if-nez v0, :cond_6

    .line 662
    invoke-virtual {v6}, Lo/dyx;->c()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {v7}, Lo/dyx;->c()J

    move-result-wide v2

    long-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->e(DD)I

    move-result v0

    if-lez v0, :cond_6

    .line 663
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "old value"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    invoke-static {v6}, Lo/dzr;->e(Lo/dyx;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 668
    :cond_6
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v0

    return-object v0

    .line 672
    :cond_7
    goto :goto_1

    .line 670
    :catch_0
    move-exception v4

    .line 671
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRefreshJsonStr Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 673
    :goto_1
    return-object p1
.end method

.method public static c(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 5

    .line 721
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 723
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v3, v0, p0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 724
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 725
    :catch_0
    move-exception v4

    .line 726
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSONException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    const-string v0, ""

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lo/dyz;
    .locals 10

    .line 568
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 569
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "parseBestStep reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    const/4 v0, 0x0

    return-object v0

    .line 572
    :cond_0
    new-instance v3, Lo/dyz;

    invoke-direct {v3}, Lo/dyz;-><init>()V

    .line 574
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 575
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 576
    const/4 v5, 0x0

    .line 577
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 578
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 579
    const-string v0, "value"

    invoke-static {v0, v7}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v8

    .line 580
    const-string v0, "recordDay"

    invoke-static {v0, v7}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v9

    .line 581
    if-le v8, v5, :cond_1

    .line 582
    move v5, v8

    .line 583
    invoke-virtual {v3, v8}, Lo/dyz;->c(I)V

    .line 584
    invoke-virtual {v3, v9}, Lo/dyz;->e(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 577
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 587
    :cond_2
    return-object v3

    .line 591
    :cond_3
    goto :goto_1

    .line 589
    :catch_0
    move-exception v4

    .line 590
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStartTimeAndEndTime Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Lo/dyz;)Lorg/json/JSONObject;
    .locals 5

    .line 683
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 685
    const-string v0, "value"

    :try_start_0
    invoke-virtual {p0}, Lo/dyz;->d()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 686
    const-string v0, "recordDay"

    invoke-virtual {p0}, Lo/dyz;->b()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 687
    return-object v3

    .line 688
    :catch_0
    move-exception v4

    .line 689
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSONException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 691
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Ljava/util/ArrayList;)V
    .locals 1

    .line 554
    new-instance v0, Lo/dzr$5;

    invoke-direct {v0}, Lo/dzr$5;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 559
    return-void
.end method

.method public static c(I)Z
    .locals 1

    .line 1028
    const/4 v0, 0x3

    if-eq v0, p0, :cond_0

    const/4 v0, 0x4

    if-eq v0, p0, :cond_0

    const/4 v0, 0x2

    if-ne v0, p0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(D)D
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .line 1264
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v2

    .line 1265
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 1266
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 1267
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 1268
    invoke-virtual {v2, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    .line 1269
    const-wide/16 v4, 0x0

    .line 1271
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 1274
    goto :goto_0

    .line 1272
    :catch_0
    move-exception v6

    .line 1273
    const-string v0, "PLGACHIEVE_ReportUtil"

    invoke-virtual {v6}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1275
    :goto_0
    return-wide v4
.end method

.method public static d(J)D
    .locals 6

    .line 1252
    long-to-double v0, p0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v4

    .line 1253
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v4, v0

    invoke-static {v0, v1}, Lo/dzr;->d(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static d(Ljava/lang/String;JJI)Landroid/util/Pair;
    .locals 19
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;JJI)Landroid/util/Pair<Ljava/lang/Double;Ljava/lang/Long;>;"
        }
    .end annotation

    .line 845
    invoke-static/range {p0 .. p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 846
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "parseBestStep reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 847
    const/4 v0, 0x0

    return-object v0

    .line 850
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 851
    const/4 v0, 0x0

    if-eq v0, v4, :cond_b

    .line 852
    const-wide/16 v5, 0x0

    .line 853
    const-wide/16 v7, 0x0

    .line 854
    invoke-static/range {p5 .. p5}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 855
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_3

    .line 856
    invoke-virtual {v4, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 857
    const-string v0, "value"

    invoke-static {v0, v10}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v0

    int-to-double v11, v0

    .line 858
    const-string v0, "startTime"

    invoke-static {v0, v10}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v13

    .line 859
    cmp-long v0, v13, p1

    if-ltz v0, :cond_2

    cmp-long v0, v13, p3

    if-gtz v0, :cond_2

    .line 860
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v5

    if-nez v0, :cond_1

    .line 861
    move-wide v5, v11

    .line 862
    move-wide v7, v13

    .line 864
    :cond_1
    invoke-static {v11, v12, v5, v6}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_2

    .line 865
    move-wide v5, v11

    .line 866
    move-wide v7, v13

    .line 855
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 870
    :cond_3
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v5

    if-eqz v0, :cond_b

    const-wide/16 v0, 0x0

    cmp-long v0, v0, v7

    if-eqz v0, :cond_b

    .line 871
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "showTypeIsPace"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    new-instance v9, Landroid/util/Pair;

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v9, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 873
    return-object v9

    .line 875
    :cond_4
    move/from16 v0, p5

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    .line 876
    const/4 v9, 0x0

    .line 877
    const-wide/16 v10, 0x0

    .line 878
    const/4 v12, 0x0

    :goto_1
    :try_start_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_6

    .line 879
    invoke-virtual {v4, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 880
    const-string v0, "value"

    invoke-static {v0, v13}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v14

    .line 881
    const-string v0, "recordDay"

    invoke-static {v0, v13}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v15

    .line 882
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->i(Ljava/lang/String;)J

    move-result-wide v16

    .line 883
    cmp-long v0, v16, p1

    if-ltz v0, :cond_5

    cmp-long v0, v16, p3

    if-gtz v0, :cond_5

    .line 884
    if-le v14, v9, :cond_5

    .line 885
    move v9, v14

    .line 886
    move-wide/from16 v10, v16

    .line 878
    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 890
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v9, :cond_7

    const-wide/16 v0, 0x0

    cmp-long v0, v0, v10

    if-eqz v0, :cond_7

    .line 891
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "WALK_MOST_KEY"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 892
    new-instance v12, Landroid/util/Pair;

    int-to-double v0, v9

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v12, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 893
    return-object v12

    .line 895
    :cond_7
    goto/16 :goto_3

    :cond_8
    :try_start_2
    invoke-static/range {p5 .. p5}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 896
    const-wide/16 v9, 0x0

    .line 897
    const-wide/16 v11, 0x0

    .line 898
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v13, v0, :cond_a

    .line 899
    invoke-virtual {v4, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v14

    .line 900
    const-string v0, "value"

    invoke-static {v0, v14}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v15

    .line 901
    const-string v0, "startTime"

    invoke-static {v0, v14}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v17

    .line 902
    cmp-long v0, v17, p1

    if-ltz v0, :cond_9

    cmp-long v0, v17, p3

    if-gtz v0, :cond_9

    .line 903
    cmp-long v0, v15, v9

    if-lez v0, :cond_9

    .line 904
    move-wide v9, v15

    .line 905
    move-wide/from16 v11, v17

    .line 898
    :cond_9
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 909
    :cond_a
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v9

    if-eqz v0, :cond_b

    const-wide/16 v0, 0x0

    cmp-long v0, v0, v11

    if-eqz v0, :cond_b

    .line 910
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "RUN_DISTANCE_KEY"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 911
    new-instance v13, Landroid/util/Pair;

    long-to-double v0, v9

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 912
    return-object v13

    .line 918
    :cond_b
    :goto_3
    goto :goto_4

    .line 916
    :catch_0
    move-exception v4

    .line 917
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStartTimeAndEndTime Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 919
    :goto_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(ILandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 123
    const/16 v0, 0xbb8

    if-ge p0, v0, :cond_0

    .line 124
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_1000_title2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 126
    :cond_0
    const/16 v0, 0xbb8

    if-lt p0, v0, :cond_1

    const/16 v0, 0x1388

    if-ge p0, v0, :cond_1

    .line 127
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_3000_title2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 129
    :cond_1
    const/16 v0, 0x1388

    if-lt p0, v0, :cond_2

    const/16 v0, 0x2710

    if-ge p0, v0, :cond_2

    .line 130
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_5000_title2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 132
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_week_10000_title2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1286
    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 1287
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 1290
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 1291
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 1292
    const/16 v0, 0x14

    invoke-static {v4, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 1293
    return-object v5

    .line 1294
    :catch_0
    move-exception v2

    .line 1295
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "setGainTime NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1297
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d()Z
    .locals 3

    .line 354
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 355
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    .line 356
    const-string v0, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "CN"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    const/4 v0, 0x1

    return v0

    .line 359
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(I)Z
    .locals 1

    .line 1175
    invoke-static {p0}, Lo/dzr;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lo/dzr;->g(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(F)D
    .locals 5

    .line 734
    :try_start_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v3

    .line 735
    return-wide v3

    .line 736
    :catch_0
    move-exception v3

    .line 737
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NumberFormatException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static e(J)D
    .locals 4

    .line 1242
    long-to-double v0, p0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dzr;->d(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static e(D)F
    .locals 2

    .line 1232
    const-wide v0, 0x40ac200000000000L    # 3600.0

    div-double/2addr v0, p0

    invoke-static {v0, v1}, Lo/dzr;->d(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public static e(DD)I
    .locals 4

    .line 751
    sub-double v2, p0, p2

    .line 752
    const-wide v0, -0x40af9db22d0e5604L    # -0.001

    cmpg-double v0, v2, v0

    if-gez v0, :cond_0

    .line 753
    const/4 v0, -0x1

    return v0

    .line 754
    :cond_0
    const-wide v0, 0x3f50624dd2f1a9fcL    # 0.001

    cmpl-double v0, v2, v0

    if-lez v0, :cond_1

    .line 755
    const/4 v0, 0x1

    return v0

    .line 757
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(ILandroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1105
    const-string v1, ""

    .line 1106
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 1108
    :pswitch_0
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_km:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1109
    goto :goto_0

    .line 1111
    :pswitch_1
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_km:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1112
    goto :goto_0

    .line 1114
    :pswitch_2
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_km:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1115
    goto :goto_0

    .line 1117
    :pswitch_3
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1118
    goto :goto_0

    .line 1120
    :pswitch_4
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_steps:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1121
    .line 1125
    :goto_0
    :pswitch_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static e(ILo/dwm;)Ljava/lang/String;
    .locals 4

    .line 1037
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1038
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "sRecord null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1039
    const-string v0, ""

    return-object v0

    .line 1042
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1044
    :pswitch_0
    invoke-virtual {p1}, Lo/dwm;->g()Ljava/lang/String;

    move-result-object v3

    .line 1045
    goto :goto_1

    .line 1047
    :pswitch_1
    invoke-virtual {p1}, Lo/dwm;->m()Ljava/lang/String;

    move-result-object v3

    .line 1048
    goto :goto_1

    .line 1050
    :pswitch_2
    invoke-virtual {p1}, Lo/dwm;->f()Ljava/lang/String;

    move-result-object v3

    .line 1051
    goto :goto_1

    .line 1053
    :pswitch_3
    invoke-virtual {p1}, Lo/dwm;->i()Ljava/lang/String;

    move-result-object v3

    .line 1054
    goto :goto_1

    .line 1056
    :pswitch_4
    invoke-virtual {p1}, Lo/dwm;->u()Ljava/lang/String;

    move-result-object v3

    .line 1057
    goto :goto_1

    .line 1059
    :pswitch_5
    invoke-virtual {p1}, Lo/dwm;->t()Ljava/lang/String;

    move-result-object v3

    .line 1060
    goto :goto_1

    .line 1062
    :pswitch_6
    invoke-virtual {p1}, Lo/dwm;->h()Ljava/lang/String;

    move-result-object v3

    .line 1063
    goto :goto_1

    .line 1065
    :pswitch_7
    invoke-virtual {p1}, Lo/dwm;->p()Ljava/lang/String;

    move-result-object v3

    .line 1066
    goto :goto_1

    .line 1068
    :pswitch_8
    invoke-virtual {p1}, Lo/dwm;->n()Ljava/lang/String;

    move-result-object v3

    .line 1069
    goto :goto_1

    .line 1071
    :pswitch_9
    invoke-virtual {p1}, Lo/dwm;->l()Ljava/lang/String;

    move-result-object v3

    .line 1072
    goto :goto_1

    .line 1074
    :pswitch_a
    invoke-virtual {p1}, Lo/dwm;->o()Ljava/lang/String;

    move-result-object v3

    .line 1075
    goto :goto_1

    .line 1077
    :goto_0
    const-string v3, ""

    .line 1080
    :goto_1
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1081
    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static e(ILo/dwm;Ljava/lang/String;)Lo/dwm;
    .locals 2

    .line 983
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 984
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "sRecord null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 985
    const/4 v0, 0x0

    return-object v0

    .line 987
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 989
    :pswitch_0
    invoke-virtual {p1, p2}, Lo/dwm;->e(Ljava/lang/String;)V

    .line 990
    goto :goto_0

    .line 992
    :pswitch_1
    invoke-virtual {p1, p2}, Lo/dwm;->i(Ljava/lang/String;)V

    .line 993
    goto :goto_0

    .line 995
    :pswitch_2
    invoke-virtual {p1, p2}, Lo/dwm;->f(Ljava/lang/String;)V

    .line 996
    goto :goto_0

    .line 998
    :pswitch_3
    invoke-virtual {p1, p2}, Lo/dwm;->o(Ljava/lang/String;)V

    .line 999
    goto :goto_0

    .line 1001
    :pswitch_4
    invoke-virtual {p1, p2}, Lo/dwm;->d(Ljava/lang/String;)V

    .line 1002
    goto :goto_0

    .line 1004
    :pswitch_5
    invoke-virtual {p1, p2}, Lo/dwm;->b(Ljava/lang/String;)V

    .line 1005
    goto :goto_0

    .line 1007
    :pswitch_6
    invoke-virtual {p1, p2}, Lo/dwm;->k(Ljava/lang/String;)V

    .line 1008
    goto :goto_0

    .line 1010
    :pswitch_7
    invoke-virtual {p1, p2}, Lo/dwm;->h(Ljava/lang/String;)V

    .line 1011
    goto :goto_0

    .line 1013
    :pswitch_8
    invoke-virtual {p1, p2}, Lo/dwm;->g(Ljava/lang/String;)V

    .line 1014
    goto :goto_0

    .line 1016
    :pswitch_9
    invoke-virtual {p1, p2}, Lo/dwm;->a(Ljava/lang/String;)V

    .line 1017
    goto :goto_0

    .line 1019
    :pswitch_a
    invoke-virtual {p1, p2}, Lo/dwm;->c(Ljava/lang/String;)V

    .line 1020
    .line 1024
    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public static e(Ljava/lang/String;)Lo/dyv;
    .locals 14

    .line 407
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "parseBestMotionPace reportData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    const/4 v0, 0x0

    return-object v0

    .line 411
    :cond_0
    new-instance v3, Lo/dyv;

    invoke-direct {v3}, Lo/dyv;-><init>()V

    .line 413
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 414
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 415
    const-wide/16 v5, 0x0

    .line 416
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 417
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 418
    const-string v0, "value"

    invoke-static {v0, v8}, Lo/dty;->a(Ljava/lang/String;Lorg/json/JSONObject;)D

    move-result-wide v9

    .line 419
    const-string v0, "startTime"

    invoke-static {v0, v8}, Lo/dty;->c(Ljava/lang/String;Lorg/json/JSONObject;)J

    move-result-wide v11

    .line 420
    const-string v0, "source"

    invoke-static {v0, v8}, Lo/dty;->d(Ljava/lang/String;Lorg/json/JSONObject;)I

    move-result v13

    .line 421
    const-wide/16 v0, 0x0

    cmpl-double v0, v5, v0

    if-nez v0, :cond_1

    .line 422
    move-wide v5, v9

    .line 423
    invoke-virtual {v3, v9, v10}, Lo/dyv;->d(D)V

    .line 424
    invoke-virtual {v3, v11, v12}, Lo/dyv;->b(J)V

    .line 426
    :cond_1
    invoke-static {v9, v10, v5, v6}, Lo/dzr;->e(DD)I

    move-result v0

    if-gez v0, :cond_2

    .line 427
    move-wide v5, v9

    .line 428
    invoke-virtual {v3, v9, v10}, Lo/dyv;->d(D)V

    .line 429
    invoke-virtual {v3, v11, v12}, Lo/dyv;->b(J)V

    .line 430
    invoke-virtual {v3, v13}, Lo/dyv;->c(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 416
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 434
    :cond_3
    return-object v3

    .line 438
    :cond_4
    goto :goto_1

    .line 436
    :catch_0
    move-exception v4

    .line 437
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStartTimeAndEndTime Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Lo/dyx;)Lorg/json/JSONObject;
    .locals 5

    .line 700
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 702
    const-string v0, "value"

    :try_start_0
    invoke-virtual {p0}, Lo/dyx;->c()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 703
    const-string v0, "source"

    invoke-virtual {p0}, Lo/dyx;->b()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 704
    const-string v0, "deviceCode"

    invoke-virtual {p0}, Lo/dyx;->d()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 705
    const-string v0, "startTime"

    invoke-virtual {p0}, Lo/dyx;->a()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 706
    const-string v0, "endTime"

    invoke-virtual {p0}, Lo/dyx;->e()J

    move-result-wide v1

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 707
    return-object v3

    .line 708
    :catch_0
    move-exception v4

    .line 709
    const-string v0, "PLGACHIEVE_ReportUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSONException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 711
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(I)Z
    .locals 1

    .line 1185
    const/4 v0, 0x2

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static f(I)Ljava/lang/String;
    .locals 1

    .line 1392
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 1394
    :pswitch_0
    const-string v0, "3km"

    .line 1395
    goto :goto_1

    .line 1397
    :pswitch_1
    const-string v0, "5km"

    .line 1398
    goto :goto_1

    .line 1400
    :pswitch_2
    const-string v0, "10km"

    .line 1401
    goto :goto_1

    .line 1403
    :pswitch_3
    const-string v0, "21.0975km"

    .line 1404
    goto :goto_1

    .line 1406
    :pswitch_4
    const-string v0, "42.195km"

    .line 1407
    goto :goto_1

    .line 1409
    :goto_0
    const-string v0, ""

    .line 1412
    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static g(I)Z
    .locals 1

    .line 1195
    const/16 v0, 0xb

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static h(I)I
    .locals 1

    .line 1376
    invoke-static {p0}, Lo/dzr;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    if-ne v0, p0, :cond_1

    .line 1377
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$mipmap;->ic_pb_medal_run:I

    return v0

    .line 1378
    :cond_1
    invoke-static {p0}, Lo/dzr;->g(I)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xa

    if-ne v0, p0, :cond_3

    .line 1379
    :cond_2
    sget v0, Lcom/huawei/pluginachievement/R$mipmap;->ic_pb_medal_ride:I

    return v0

    .line 1381
    :cond_3
    sget v0, Lcom/huawei/pluginachievement/R$mipmap;->ic_pb_medal_steps:I

    return v0
.end method

.method public static i(Ljava/lang/String;)J
    .locals 4

    .line 1356
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1357
    const-wide/16 v0, 0x0

    return-wide v0

    .line 1359
    :cond_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1361
    :try_start_0
    invoke-virtual {v2, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 1362
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 1363
    :catch_0
    move-exception v3

    .line 1364
    const-string v0, "PLGACHIEVE_ReportUtil"

    const-string v1, "getStepString ParseException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1366
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static i(I)Ljava/lang/String;
    .locals 1

    .line 1206
    invoke-static {p0}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
