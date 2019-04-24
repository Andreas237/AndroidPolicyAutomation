.class public Lo/dxk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)D
    .locals 8

    .line 117
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    const-wide/16 v0, 0x0

    return-wide v0

    .line 120
    :cond_0
    const-wide/16 v3, 0x0

    .line 122
    :try_start_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v3, v0

    .line 125
    goto :goto_0

    .line 123
    :catch_0
    move-exception v5

    .line 124
    const-string v0, "PLGACHIEVE_AchieveAnnualUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "string2Int e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    :goto_0
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v5

    .line 127
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 128
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 129
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 130
    invoke-virtual {v5, v3, v4}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v6

    .line 132
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v0

    move-wide v3, v0

    .line 135
    goto :goto_1

    .line 133
    :catch_1
    move-exception v7

    .line 134
    const-string v0, "PLGACHIEVE_AchieveAnnualUtils"

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :goto_1
    return-wide v3
.end method

.method public static b(II)Z
    .locals 2

    .line 70
    div-int/lit16 v1, p1, 0x2710

    .line 71
    if-ne p0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(D)I
    .locals 5

    .line 147
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v2

    .line 148
    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 149
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 150
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 151
    invoke-virtual {v2, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v3

    .line 153
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide p0, v0

    .line 156
    goto :goto_0

    .line 154
    :catch_0
    move-exception v4

    .line 155
    const-string v0, "PLGACHIEVE_AchieveAnnualUtils"

    invoke-virtual {v4}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    :goto_0
    double-to-int v0, p0

    return v0
.end method

.method public static c(J)I
    .locals 6

    .line 181
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 182
    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    .line 183
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 185
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 186
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 187
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 188
    mul-int/lit16 v0, v3, 0x2710

    mul-int/lit8 v1, v4, 0x64

    add-int/2addr v0, v1

    add-int/2addr v0, v5

    return v0
.end method

.method public static c(Ljava/lang/String;)J
    .locals 4

    .line 99
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const-wide/16 v0, 0x0

    return-wide v0

    .line 103
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 104
    :catch_0
    move-exception v3

    .line 105
    const-string v0, "PLGACHIEVE_AchieveAnnualUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "string2Int e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static d(Ljava/lang/String;)I
    .locals 4

    .line 81
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    const/4 v0, 0x0

    return v0

    .line 85
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 86
    :catch_0
    move-exception v3

    .line 87
    const-string v0, "PLGACHIEVE_AchieveAnnualUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "string2Int e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const/4 v0, 0x0

    return v0
.end method

.method public static d(IZ)J
    .locals 8

    .line 32
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 33
    if-eqz p1, :cond_0

    .line 34
    move-object v0, v7

    move v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 35
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v7, v0, p0}, Ljava/util/Calendar;->set(II)V

    .line 38
    const/4 v0, 0x2

    const/16 v1, 0xb

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 39
    const/4 v0, 0x5

    const/16 v1, 0x1f

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 40
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 41
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 42
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 43
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 45
    :goto_0
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(IJ)Z
    .locals 3

    .line 56
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 57
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 58
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 59
    if-ne p0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
