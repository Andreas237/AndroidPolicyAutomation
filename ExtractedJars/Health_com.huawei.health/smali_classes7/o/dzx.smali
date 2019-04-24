.class public Lo/dzx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 8

    .line 85
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->d()D

    move-result-wide v4

    .line 89
    invoke-static {v4, v5}, Lo/dzy;->b(D)Ljava/lang/String;

    move-result-object v6

    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_total_distance_desc:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 91
    return-object v7
.end method

.method public static a()Lo/dwj;
    .locals 3

    .line 137
    new-instance v2, Lo/dwj;

    invoke-direct {v2}, Lo/dwj;-><init>()V

    .line 138
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/dwj;->b(I)V

    .line 139
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lo/dwj;->b(D)V

    .line 140
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lo/dwj;->c(J)V

    .line 141
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lo/dwj;->e(D)V

    .line 142
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lo/dwj;->c(D)V

    .line 143
    const-wide/16 v0, 0x0

    invoke-virtual {v2, v0, v1}, Lo/dwj;->d(D)V

    .line 145
    return-object v2
.end method

.method public static b(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 9

    .line 28
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 29
    const/4 v0, 0x0

    return-object v0

    .line 31
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->c()I

    move-result v3

    .line 32
    invoke-virtual {p1}, Lo/dwj;->a()J

    move-result-wide v4

    .line 33
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 34
    const/16 v0, 0x14

    invoke-static {v6, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v7

    .line 35
    if-lez v3, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-gtz v0, :cond_2

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_sync_data_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 38
    :cond_2
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_now:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 39
    return-object v8
.end method

.method public static c(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 9

    .line 45
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->c()I

    move-result v7

    .line 49
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_days:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, v7

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v7, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 50
    return-object v8
.end method

.method public static d(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 9

    .line 95
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 96
    const/4 v0, 0x0

    return-object v0

    .line 98
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->e()D

    move-result-wide v5

    .line 99
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v5, v6, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 100
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_report_best_day_steps_num:I

    double-to-int v2, v5

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 102
    return-object v8
.end method

.method public static e(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 9

    .line 65
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->d()D

    move-result-wide v3

    .line 69
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    const/4 v0, 0x3

    invoke-static {v3, v4, v0}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 73
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v5, v6, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 74
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string_en:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 75
    return-object v8

    .line 78
    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v3, v4, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 79
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_total_distance_num:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 80
    return-object v6
.end method

.method public static f(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 7

    .line 106
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 107
    const/4 v0, 0x0

    return-object v0

    .line 109
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->f()D

    move-result-wide v3

    .line 110
    const/4 v0, 0x2

    const/4 v1, 0x2

    invoke-static {v3, v4, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 111
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_total_steps_desc:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 112
    return-object v6
.end method

.method public static g(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 11

    .line 155
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 156
    const/4 v0, 0x0

    return-object v0

    .line 158
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->d()D

    move-result-wide v5

    .line 159
    const-wide v0, 0x404518f5c28f5c29L    # 42.195

    div-double v7, v5, v0

    .line 160
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-static {v7, v8, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 161
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_marathon_desc:I

    double-to-int v2, v7

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v9, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 162
    return-object v10
.end method

.method public static i(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 10

    .line 126
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 127
    const/4 v0, 0x0

    return-object v0

    .line 129
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->g()D

    move-result-wide v6

    .line 130
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v6, v0

    const-wide v2, 0x4072c00000000000L    # 300.0

    div-double/2addr v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 131
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_report_total_wasted_calorie_desc:I

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double v2, v6, v2

    const-wide v4, 0x4072c00000000000L    # 300.0

    div-double/2addr v2, v4

    double-to-int v2, v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 133
    return-object v9
.end method

.method public static k(Landroid/content/Context;Lo/dwj;)Ljava/lang/String;
    .locals 8

    .line 116
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 117
    const/4 v0, 0x0

    return-object v0

    .line 119
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->g()D

    move-result-wide v4

    .line 120
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v4, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 121
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_total_calorie_kCal_num:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 122
    return-object v7
.end method
