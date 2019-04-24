.class public Lo/dtx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 4

    .line 129
    const/4 v2, 0x0

    .line 131
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 134
    goto :goto_0

    .line 132
    :catch_0
    move-exception v3

    .line 133
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :goto_0
    const/16 v0, 0x13

    if-gt v2, v0, :cond_0

    .line 136
    const/4 v0, 0x1

    return v0

    .line 138
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 149
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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

.method public static b(Ljava/lang/String;Landroid/content/Context;)V
    .locals 4

    .line 73
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 74
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "refreshTextureSharePrefrence context is null"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    return-void

    .line 77
    :cond_0
    const-string v0, "_medalTextureDownload"

    invoke-static {p1, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 78
    invoke-static {v2, p0}, Lo/dxc;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 79
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 80
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "refreshTextureSharePrefrence failed"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    return-void

    .line 83
    :cond_1
    const-string v0, "_medalTextureDownload"

    invoke-static {p1, v0, v3}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method public static c(Ljava/lang/String;Landroid/content/Context;)V
    .locals 4

    .line 53
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 54
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "refreshSharePrefrence context is null"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    return-void

    .line 57
    :cond_0
    const-string v0, "_medalPngStatusDownload"

    invoke-static {p1, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-static {v2, p0}, Lo/dxc;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 59
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 60
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "refreshSharePrefrence failed"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    return-void

    .line 63
    :cond_1
    const-string v0, "_medalPngStatusDownload"

    invoke-static {p1, v0, v3}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    return-void
.end method

.method public static d(Landroid/content/Context;Ljava/util/HashMap;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 33
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 34
    :cond_0
    return-void

    .line 36
    :cond_1
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 37
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 39
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 40
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 41
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refreshFirstTabRedPointSP firstabname ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " newMedal ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-static {p0, v5, v6}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 89
    const/4 v4, 0x0

    .line 91
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 94
    goto :goto_0

    .line 92
    :catch_0
    move-exception v5

    .line 93
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_0
    const/16 v0, 0x56

    if-gt v4, v0, :cond_0

    .line 96
    const/4 v0, 0x0

    return v0

    .line 98
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 99
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 101
    :try_start_1
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 102
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long/2addr v2, v5

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 103
    const/4 v0, 0x0

    return v0

    .line 107
    :cond_1
    goto :goto_1

    .line 105
    :catch_1
    move-exception v5

    .line 106
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 112
    :cond_3
    :try_start_2
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 113
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-wide v0

    cmp-long v0, v0, v5

    if-lez v0, :cond_4

    .line 114
    const/4 v0, 0x0

    return v0

    .line 118
    :cond_4
    goto :goto_2

    .line 116
    :catch_2
    move-exception v5

    .line 117
    const-string v0, "PLGACHIEVE_AchieveMedalParserUtil"

    const-string v1, "NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :goto_2
    const/4 v0, 0x1

    return v0
.end method
