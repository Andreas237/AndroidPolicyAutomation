.class public Lo/dzp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(DLandroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 130
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p0, v0

    invoke-static {v0, v1}, Lo/dzr;->d(D)D

    move-result-wide v2

    .line 131
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    const/4 v0, 0x3

    invoke-static {v2, v3, v0}, Lo/cxh;->a(DI)D

    move-result-wide v4

    .line 134
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v4, v5, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 136
    return-object v6

    .line 139
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v2, v3, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 140
    return-object v4
.end method

.method public static c(DLandroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 114
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    const/4 v0, 0x3

    invoke-static {p0, p1, v0}, Lo/cxh;->a(DI)D

    move-result-wide v3

    .line 117
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {v3, v4, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 118
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_hw_show_sport_kms_string_en:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-virtual {p2, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 119
    return-object v6

    .line 122
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    .line 123
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_total_distance_num:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    invoke-virtual {p2, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 124
    return-object v4
.end method

.method public static d(Landroid/content/Context;I)Ljava/lang/String;
    .locals 6

    .line 51
    int-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 52
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_report_best_day_steps_num:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, p1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 53
    return-object v5
.end method

.method public static e(DLandroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 103
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    invoke-static {p0, p1, p2}, Lo/dzp;->c(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 108
    :cond_0
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p0, v0

    invoke-static {v0, v1}, Lo/dzr;->d(D)D

    move-result-wide v2

    .line 109
    invoke-static {v2, v3, p2}, Lo/dzp;->c(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
