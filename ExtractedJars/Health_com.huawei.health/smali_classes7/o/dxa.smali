.class public Lo/dxa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;Landroid/content/Context;)V
    .locals 12

    .line 42
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 43
    return-void

    .line 45
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 46
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 47
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object p1

    .line 49
    :cond_1
    const/16 v0, 0x9

    invoke-virtual {p1, v0, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 50
    invoke-virtual {p1}, Lo/dwr;->t()Ljava/util/ArrayList;

    move-result-object v5

    .line 51
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 52
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    .line 53
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_5

    .line 54
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dvf;

    .line 55
    instance-of v0, v8, Lo/dvu;

    if-eqz v0, :cond_4

    .line 56
    move-object v9, v8

    check-cast v9, Lo/dvu;

    .line 57
    invoke-virtual {v9}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v10

    .line 58
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v10}, Lo/dzs;->k(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_4

    .line 62
    invoke-virtual {v9}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v11

    .line 63
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 64
    invoke-static {v9, p0, p1}, Lo/dxa;->c(Lo/dvu;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V

    goto :goto_1

    .line 66
    :cond_3
    const-string v0, "PLGACHIEVE_AchieveTrackMedalService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "light="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 72
    :cond_5
    return-void
.end method

.method private static c(Lo/dvu;Lcom/huawei/pluginachievement/manager/model/TrackData;Lo/dwr;)V
    .locals 8

    .line 75
    invoke-static {p0, p1}, Lo/dxa;->c(Lo/dvu;Lcom/huawei/pluginachievement/manager/model/TrackData;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    return-void

    .line 78
    :cond_0
    invoke-virtual {p0}, Lo/dvu;->j()I

    move-result v2

    .line 79
    invoke-virtual {p0}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v3

    .line 80
    invoke-virtual {p0}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v4

    .line 81
    invoke-virtual {p0}, Lo/dvu;->C()I

    move-result v5

    .line 82
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireDistance()F

    move-result v0

    float-to-long v0, v0

    invoke-static {v0, v1}, Lo/dzr;->e(J)D

    move-result-wide v6

    .line 83
    const/4 v0, 0x3

    if-eq v0, v2, :cond_1

    const/16 v0, 0xb

    if-ne v0, v2, :cond_3

    .line 84
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireType()I

    move-result v0

    const/16 v1, 0x102

    if-eq v1, v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireType()I

    move-result v0

    const/16 v1, 0x108

    if-ne v1, v0, :cond_5

    :cond_2
    int-to-double v0, v5

    cmpl-double v0, v6, v0

    if-ltz v0, :cond_5

    .line 85
    invoke-virtual {p2, v3, v4, v5}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 87
    :cond_3
    const/4 v0, 0x4

    if-eq v0, v2, :cond_4

    const/16 v0, 0xc

    if-ne v0, v2, :cond_5

    .line 88
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireType()I

    move-result v0

    const/16 v1, 0x103

    if-ne v1, v0, :cond_5

    int-to-double v0, v5

    cmpl-double v0, v6, v0

    if-ltz v0, :cond_5

    .line 89
    invoke-virtual {p2, v3, v4, v5}, Lo/dwr;->d(Ljava/lang/String;Ljava/lang/String;I)V

    .line 92
    :cond_5
    :goto_0
    return-void
.end method

.method private static c(Lo/dvu;Lcom/huawei/pluginachievement/manager/model/TrackData;)Z
    .locals 7

    .line 96
    const-wide/16 v2, 0x0

    .line 97
    const-wide/16 v4, 0x0

    .line 98
    invoke-virtual {p0}, Lo/dvu;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxc;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dxc;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    :try_start_0
    invoke-virtual {p0}, Lo/dvu;->q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v2, v0

    .line 101
    invoke-virtual {p0}, Lo/dvu;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 104
    goto :goto_0

    .line 102
    :catch_0
    move-exception v6

    .line 103
    const-string v0, "PLGACHIEVE_AchieveTrackMedalService"

    const-string v1, "requestSportData NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    goto :goto_0

    .line 106
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 108
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/pluginachievement/manager/model/TrackData;->acquireTrackTime()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 109
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 111
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
