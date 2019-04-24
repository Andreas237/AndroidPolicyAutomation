.class public Lo/cds;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const/4 v0, 0x1

    sput v0, Lo/cds;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)D
    .locals 4

    .line 335
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    .line 336
    const-wide/16 v0, 0x0

    return-wide v0

    .line 339
    :cond_0
    long-to-double v0, p0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static a(F)Ljava/lang/String;
    .locals 1

    .line 66
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lo/cds;->b(FI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 127
    const-string v0, ""

    .line 128
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 130
    :sswitch_0
    const-string v0, "SPORT_TYPE_DEFAULT"

    .line 131
    goto :goto_1

    .line 133
    :sswitch_1
    const-string v0, "SPORT_TYPE_WALK"

    .line 134
    goto :goto_1

    .line 136
    :sswitch_2
    const-string v0, "SPORT_TYPE_RUN"

    .line 137
    goto :goto_1

    .line 139
    :sswitch_3
    const-string v0, "SPORT_TYPE_BIKE"

    .line 140
    goto :goto_1

    .line 142
    :sswitch_4
    const-string v0, "SPORT_TYPE_CLIMB_HILL"

    .line 143
    goto :goto_1

    .line 145
    :sswitch_5
    const-string v0, "SPORT_TYPE_CLIMB_STAIRS"

    .line 146
    goto :goto_1

    .line 148
    :sswitch_6
    const-string v0, "SPORT_TYPE_SWIM"

    .line 149
    goto :goto_1

    .line 151
    :sswitch_7
    const-string v0, "SPORT_TYPE_GOLF"

    .line 152
    goto :goto_1

    .line 154
    :goto_0
    const-string v0, "SPORT_TYPE_DEFAULT"

    .line 158
    :goto_1
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x101 -> :sswitch_1
        0x102 -> :sswitch_2
        0x103 -> :sswitch_3
        0x104 -> :sswitch_4
        0x105 -> :sswitch_5
        0x106 -> :sswitch_6
        0x107 -> :sswitch_7
    .end sparse-switch
.end method

.method public static a(Landroid/content/Context;)V
    .locals 4

    .line 192
    new-instance v1, Lo/dcy;

    invoke-direct {v1}, Lo/dcy;-><init>()V

    .line 193
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 195
    new-instance v3, Lo/cee;

    invoke-direct {v3, p0, v1, v2}, Lo/cee;-><init>(Landroid/content/Context;Lo/dcy;Ljava/lang/String;)V

    .line 197
    invoke-virtual {v3}, Lo/cee;->d()I

    move-result v0

    sput v0, Lo/cds;->d:I

    .line 199
    return-void
.end method

.method public static a()Z
    .locals 2

    .line 107
    sget v0, Lo/cds;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 108
    const/4 v0, 0x1

    return v0

    .line 110
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b(I)D
    .locals 4

    .line 305
    int-to-double v0, p0

    const-wide v2, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static b()Ljava/lang/String;
    .locals 4

    .line 98
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmssSSS"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 99
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gps_maptracking_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(FI)Ljava/lang/String;
    .locals 3

    .line 55
    new-instance v2, Ljava/math/BigDecimal;

    float-to-double v0, p0

    invoke-direct {v2, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 56
    const/4 v0, 0x4

    invoke-virtual {v2, p1, v0}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(J)Ljava/lang/String;
    .locals 2

    .line 295
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x15

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 254
    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v1

    .line 255
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 256
    const/4 v0, 0x0

    return v0

    .line 258
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static final b(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Z
    .locals 3

    .line 410
    if-nez p0, :cond_0

    .line 411
    const/4 v0, 0x0

    return v0

    .line 414
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v1

    .line 415
    if-nez v1, :cond_1

    .line 416
    const/4 v0, 0x0

    return v0

    .line 418
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v2

    .line 419
    const/16 v0, 0x106

    if-eq v2, v0, :cond_2

    const/16 v0, 0x10a

    if-eq v2, v0, :cond_2

    .line 420
    const/4 v0, 0x0

    return v0

    .line 423
    :cond_2
    const-string v0, "swim_pool_length"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, "swim_pull_times"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_3

    .line 424
    const/4 v0, 0x1

    return v0

    .line 426
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 3

    .line 268
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 274
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getCallState()I

    .line 275
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    if-nez v0, :cond_0

    .line 277
    const/4 v0, 0x0

    return v0

    .line 279
    :cond_0
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 281
    const/4 v0, 0x1

    return v0

    .line 283
    :cond_1
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 285
    const/4 v0, 0x2

    return v0

    .line 287
    :cond_2
    const/4 v0, 0x3

    return v0
.end method

.method public static c(F)Ljava/lang/String;
    .locals 1

    .line 61
    const/4 v0, 0x2

    invoke-static {p0, v0}, Lo/cds;->b(FI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(I)Ljava/lang/String;
    .locals 2

    .line 71
    rem-int/lit8 p0, p0, 0x64

    .line 72
    const/16 v0, 0xa

    if-lt p0, v0, :cond_0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static c(Landroid/content/Context;I)Ljava/lang/String;
    .locals 2

    .line 373
    if-nez p0, :cond_0

    .line 374
    const-string v0, ""

    return-object v0

    .line 377
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 379
    :pswitch_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_start_track_sport_type_outdoor_walk:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 381
    :pswitch_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_start_track_sport_type_outdoor_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 383
    :pswitch_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_start_track_sport_type_outdoor_ride:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 385
    :pswitch_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_pool_swim:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 387
    :pswitch_4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_open_water:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 389
    :pswitch_5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_indoor_cycling:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 391
    :pswitch_6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_other:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 393
    :pswitch_7
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_start_track_sport_type_indoor_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 395
    :pswitch_8
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_climb_hill_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 397
    :pswitch_9
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_climb_stairs_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 399
    :pswitch_a
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_golf_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 401
    :pswitch_b
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_cross_country_race:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 403
    :goto_0
    :pswitch_c
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_start_track_sport_type_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_8
        :pswitch_9
        :pswitch_3
        :pswitch_a
        :pswitch_7
        :pswitch_5
        :pswitch_4
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_6
        :pswitch_b
    .end packed-switch
.end method

.method public static c()Z
    .locals 5

    .line 535
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 537
    if-eqz v4, :cond_0

    const-string v0, ""

    .line 538
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "1"

    .line 539
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 540
    :cond_0
    const-string v0, "Track_MapTrackingUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Auto Sync is open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    const/4 v0, 0x1

    return v0

    .line 543
    :cond_1
    const-string v0, "Track_MapTrackingUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Auto Sync is closed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 6

    .line 180
    const-string v4, "([5-9]{1}|[1-9]{1}[0-9]+)\\..*"

    .line 181
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 185
    :cond_1
    invoke-static {v4, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v5

    .line 186
    const-string v0, "Track_MapTrackingUtils"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    return v5
.end method

.method public static d(I)I
    .locals 0

    .line 93
    return p0
.end method

.method public static d(Landroid/content/res/Resources;I)Ljava/lang/String;
    .locals 2

    .line 549
    if-nez p0, :cond_0

    .line 550
    const-string v0, ""

    return-object v0

    .line 553
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 555
    :pswitch_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_backstroke:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 556
    goto :goto_1

    .line 558
    :pswitch_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_breaststroke:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 559
    goto :goto_1

    .line 561
    :pswitch_2
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_butterfly_stroke:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 562
    goto :goto_1

    .line 564
    :pswitch_3
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_freestyle:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 565
    goto :goto_1

    .line 567
    :pswitch_4
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_medley:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 568
    goto :goto_1

    .line 570
    :goto_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_motiontrack_freestyle:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 573
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 85
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "--"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    :cond_0
    const-string v0, "--"

    return-object v0

    .line 88
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/cds;->e(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()Z
    .locals 2

    .line 163
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 164
    const/4 v0, 0x1

    return v0

    .line 166
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 5

    .line 117
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/telephony/TelephonyManager;

    .line 118
    const/4 v4, 0x0

    .line 119
    if-eqz v3, :cond_2

    .line 121
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    or-int v4, v0, v1

    .line 123
    :cond_2
    return v4
.end method

.method public static e(I)Ljava/lang/String;
    .locals 1

    .line 76
    if-eqz p0, :cond_0

    const/16 v0, 0x1770

    if-lt p0, v0, :cond_1

    .line 77
    :cond_0
    const-string v0, "--"

    return-object v0

    .line 80
    :cond_1
    int-to-float v0, p0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(J)Ljava/lang/String;
    .locals 4

    .line 224
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd HHmmss"

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 225
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 226
    const/16 v0, 0x9

    const/16 v1, 0xf

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;I)V
    .locals 4

    .line 367
    sput p1, Lo/cds;->d:I

    .line 368
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "map_type_setting_key"

    sget v2, Lo/cds;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    invoke-static {p0, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 369
    const-string v0, "Track_MapTrackingUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeMapType mapType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lo/cds;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    return-void
.end method

.method public static e()Z
    .locals 4

    .line 207
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/hardware/SensorManager;

    .line 208
    const/16 v0, 0x13

    invoke-virtual {v2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v3

    .line 211
    if-nez v3, :cond_0

    .line 212
    const/4 v0, 0x0

    return v0

    .line 214
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static final e(Landroid/content/Context;)Z
    .locals 7

    .line 492
    if-nez p0, :cond_0

    .line 493
    const/4 v0, 0x0

    return v0

    .line 495
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 496
    const/4 v0, 0x0

    return v0

    .line 498
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 500
    const/4 v5, 0x0

    .line 503
    const-string v0, "com.android.mediacenter"

    const/16 v1, 0x80

    :try_start_0
    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 509
    goto :goto_0

    .line 506
    :catch_0
    move-exception v6

    .line 507
    invoke-virtual {v6}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 508
    const-string v0, "Track_MapTrackingUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    :goto_0
    if-eqz v5, :cond_2

    .line 524
    iget-object v0, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_2

    .line 525
    iget-object v0, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "app-meta-ex-api-support-health"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    .line 526
    const-string v0, "Track_MapTrackingUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "value "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    return v6

    .line 531
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/graphics/Bitmap;I)[B
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .line 438
    const/16 v4, 0x64

    .line 440
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 443
    :cond_0
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 444
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p0, v0, v4, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 445
    add-int/lit8 v4, v4, -0xa

    .line 446
    const-string v0, "Track_MapTrackingUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "options "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " size "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    div-int/lit16 v0, v0, 0x400

    if-le v0, p1, :cond_1

    const/16 v0, 0x14

    if-gt v4, v0, :cond_0

    .line 450
    :cond_1
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public static f(I)I
    .locals 1

    .line 321
    div-int/lit16 v0, p0, 0x3e8

    return v0
.end method

.method public static g(I)Z
    .locals 3

    .line 460
    const/4 v2, 0x0

    .line 462
    const v0, 0x989680

    if-lt p0, v0, :cond_0

    .line 464
    const/4 v2, 0x1

    goto :goto_0

    .line 466
    :cond_0
    const v0, 0xf4240

    if-lt p0, v0, :cond_1

    .line 468
    const/4 v2, 0x2

    .line 473
    :cond_1
    :goto_0
    if-gtz p0, :cond_2

    .line 475
    const/4 v0, 0x0

    return v0

    .line 477
    :cond_2
    const/4 v0, 0x1

    if-ne v2, v0, :cond_3

    const v0, 0x186a0

    div-int v0, p0, v0

    rem-int/lit8 v0, v0, 0x64

    if-eqz v0, :cond_3

    .line 479
    const/4 v0, 0x0

    return v0

    .line 481
    :cond_3
    const/4 v0, 0x2

    if-ne v2, v0, :cond_4

    const v0, 0x186a0

    div-int v0, p0, v0

    div-int/lit8 v0, v0, 0xa

    rem-int/lit8 v0, v0, 0x64

    if-eqz v0, :cond_4

    .line 483
    const/4 v0, 0x0

    return v0

    .line 486
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public static h(I)I
    .locals 4

    .line 325
    int-to-double v0, p0

    const-wide v2, 0x3fe3e245dad5a40cL    # 0.6213712

    mul-double/2addr v0, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public static k(I)D
    .locals 2

    .line 316
    int-to-float v0, p0

    const v1, 0x3f8bfb16    # 1.0936f

    mul-float/2addr v0, v1

    float-to-double v0, v0

    return-wide v0
.end method
