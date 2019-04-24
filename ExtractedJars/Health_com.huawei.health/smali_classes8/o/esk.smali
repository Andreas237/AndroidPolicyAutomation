.class public Lo/esk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 111
    if-nez p0, :cond_0

    .line 112
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getVo2MaxAvgFormatString context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    return-object p3

    .line 116
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_avg_vo2max_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    double-to-int v2, p1

    .line 118
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_health_vo2max_unit:I

    .line 119
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 116
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 161
    if-nez p0, :cond_0

    .line 162
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAvgPaceAvgFormatString context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    return-object p3

    .line 165
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_user_profile_achieve_num_day:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 166
    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 165
    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 167
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_avg_pace_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    sget v2, Lcom/huawei/ui/homehealth/R$string;->sug_pace_mile:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 172
    const/4 v4, 0x3

    invoke-static {p1, p2, v4}, Lo/cxh;->d(DI)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v4}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 171
    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 168
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 175
    :cond_1
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_avg_pace_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    sget v2, Lcom/huawei/ui/homehealth/R$string;->sug_event_time_formart:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    double-to-float v4, p1

    .line 178
    invoke-static {v4}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 175
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Landroid/content/Context;IDLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 78
    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 79
    invoke-static {p0, p2, p3, p4}, Lo/esk;->a(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 80
    :cond_0
    const/4 v0, 0x7

    if-ne p1, v0, :cond_1

    .line 81
    invoke-static {p0, p2, p3, p4}, Lo/esk;->b(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 83
    :cond_1
    return-object p4
.end method

.method public static b(Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 10

    .line 20
    if-nez p0, :cond_0

    .line 21
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildRecommendDescription sportLevel is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-object p1

    .line 25
    :cond_0
    if-nez p2, :cond_1

    .line 26
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildRecommendDescription context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    return-object p1

    .line 32
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v7

    .line 33
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireReason()I

    move-result v8

    .line 34
    const/4 v0, -0x1

    if-ne v7, v0, :cond_3

    .line 35
    const/4 v0, 0x4

    if-ne v8, v0, :cond_2

    .line 36
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_user_profile_achieve_num_day:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 37
    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 36
    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 38
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_no_run_history_tip:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v9, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-virtual {p2, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 40
    :cond_2
    return-object p1

    .line 45
    :cond_3
    const/4 v0, 0x6

    if-ne v8, v0, :cond_4

    .line 46
    return-object p1

    .line 49
    :cond_4
    packed-switch v7, :pswitch_data_0

    goto :goto_0

    .line 52
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireValue()D

    move-result-wide v0

    invoke-static {p2, v8, v0, v1, p1}, Lo/esk;->d(Landroid/content/Context;IDLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 55
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireValue()D

    move-result-wide v0

    invoke-static {p2, v8, v0, v1, p1}, Lo/esk;->b(Landroid/content/Context;IDLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 58
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireValue()D

    move-result-wide v0

    invoke-static {p2, v8, v0, v1, p1}, Lo/esk;->e(Landroid/content/Context;IDLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 60
    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private static c(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 98
    if-nez p0, :cond_0

    .line 99
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getVo2MaxPoorFormatString context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-object p3

    .line 103
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_poor_vo2max_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    double-to-int v2, p1

    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_health_vo2max_unit:I

    .line 106
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 103
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 137
    if-nez p0, :cond_0

    .line 138
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAvgPacePoorFormatString context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    return-object p3

    .line 141
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_user_profile_achieve_num_day:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 142
    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 141
    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 143
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_poor_pace_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    sget v2, Lcom/huawei/ui/homehealth/R$string;->sug_pace_mile:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 148
    const/4 v4, 0x3

    invoke-static {p1, p2, v4}, Lo/cxh;->d(DI)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v4}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 147
    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 144
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 151
    :cond_1
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_poor_pace_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    sget v2, Lcom/huawei/ui/homehealth/R$string;->sug_event_time_formart:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    double-to-float v4, p1

    .line 154
    invoke-static {v4}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 151
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/content/Context;IDLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 68
    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 69
    invoke-static {p0, p2, p3, p4}, Lo/esk;->c(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 70
    :cond_0
    const/4 v0, 0x7

    if-ne p1, v0, :cond_1

    .line 71
    invoke-static {p0, p2, p3, p4}, Lo/esk;->d(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 73
    :cond_1
    return-object p4
.end method

.method private static e(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 124
    if-nez p0, :cond_0

    .line 125
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getVo2MaxGoodFormatString context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-object p3

    .line 129
    :cond_0
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_good_vo2max_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    double-to-int v2, p1

    .line 131
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_health_vo2max_unit:I

    .line 132
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 129
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(Landroid/content/Context;IDLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 88
    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 89
    invoke-static {p0, p2, p3, p4}, Lo/esk;->e(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 90
    :cond_0
    const/4 v0, 0x7

    if-ne p1, v0, :cond_1

    .line 91
    invoke-static {p0, p2, p3, p4}, Lo/esk;->k(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 93
    :cond_1
    return-object p4
.end method

.method private static k(Landroid/content/Context;DLjava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 185
    if-nez p0, :cond_0

    .line 186
    const-string v0, "Track_RecommendDescriptionUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAvgPaceGoodFormatString context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    return-object p3

    .line 189
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$plurals;->IDS_user_profile_achieve_num_day:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 190
    const-wide/high16 v3, 0x403e000000000000L    # 30.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 189
    const/16 v3, 0x1e

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 191
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_good_pace_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    sget v2, Lcom/huawei/ui/homehealth/R$string;->sug_pace_mile:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 196
    const/4 v4, 0x3

    invoke-static {p1, p2, v4}, Lo/cxh;->d(DI)D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v4}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 195
    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 192
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 199
    :cond_1
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_good_pace_tip:I

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    sget v2, Lcom/huawei/ui/homehealth/R$string;->sug_event_time_formart:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    double-to-float v4, p1

    .line 202
    invoke-static {v4}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p3, v1, v2

    .line 199
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
