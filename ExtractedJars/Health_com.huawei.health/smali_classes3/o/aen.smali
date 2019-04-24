.class public Lo/aen;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(F)F
    .locals 1

    .line 165
    const v0, 0x3ee83d43

    mul-float/2addr v0, p1

    return v0
.end method

.method private b(B)[B
    .locals 3

    .line 138
    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 139
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x7

    if-gt v2, v0, :cond_0

    .line 140
    and-int/lit8 v0, p1, 0x1

    int-to-byte v0, v0

    aput-byte v0, v1, v2

    .line 141
    shr-int/lit8 v0, p1, 0x1

    int-to-byte p1, v0

    .line 139
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 143
    :cond_0
    return-object v1
.end method

.method private c([B)I
    .locals 7

    .line 150
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ahb;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 151
    const/4 v5, 0x0

    .line 153
    if-eqz v4, :cond_0

    .line 154
    const/16 v0, 0x10

    :try_start_0
    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move v5, v0

    goto :goto_0

    .line 156
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the string is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    :goto_0
    goto :goto_1

    .line 158
    :catch_0
    move-exception v6

    .line 159
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WspMeasureDataParser NumberFormatException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    :goto_1
    return v5
.end method


# virtual methods
.method public d([B)Lo/afz;
    .locals 13

    .line 22
    if-nez p1, :cond_0

    .line 23
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_0
    new-instance v4, Lo/agg;

    invoke-direct {v4}, Lo/agg;-><init>()V

    .line 28
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    invoke-direct {p0, v0}, Lo/aen;->b(B)[B

    move-result-object v5

    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v0, 0x2

    new-array v7, v0, [B

    .line 33
    const/4 v0, 0x2

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    aput-byte v0, v7, v1

    .line 34
    aget-byte v0, p1, v6

    const/4 v1, 0x1

    aput-byte v0, v7, v1

    .line 35
    const/4 v0, 0x0

    aget-byte v0, v5, v0

    if-nez v0, :cond_1

    .line 37
    invoke-direct {p0, v7}, Lo/aen;->c([B)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3ba3d70a    # 0.005f

    mul-float v8, v0, v1

    .line 38
    invoke-virtual {v4, v8}, Lo/agg;->e(F)V

    .line 39
    goto :goto_0

    .line 41
    :cond_1
    invoke-direct {p0, v7}, Lo/aen;->c([B)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3c23d70a    # 0.01f

    mul-float v8, v0, v1

    .line 42
    invoke-direct {p0, v8}, Lo/aen;->a(F)F

    move-result v0

    invoke-virtual {v4, v0}, Lo/agg;->e(F)V

    .line 44
    :goto_0
    add-int/lit8 v6, v6, 0x2

    .line 46
    const/4 v0, 0x1

    aget-byte v0, v5, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 47
    const/4 v0, 0x4

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    aput-byte v0, v7, v1

    .line 48
    aget-byte v0, p1, v6

    const/4 v1, 0x1

    aput-byte v0, v7, v1

    .line 49
    invoke-direct {p0, v7}, Lo/aen;->c([B)I

    move-result v8

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x5

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x6

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x7

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x8

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x9

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 52
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 53
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    .line 55
    :try_start_0
    invoke-virtual {v10, v9}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v11, v0

    .line 58
    goto :goto_1

    .line 56
    :catch_0
    move-exception v12

    .line 57
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WspMeasureDataParser ParseException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :goto_1
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/agg;->d(J)V

    .line 60
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/agg;->e(J)V

    .line 61
    add-int/lit8 v6, v6, 0x7

    .line 65
    :cond_2
    return-object v4
.end method

.method public e([B)Lo/afz;
    .locals 14

    .line 71
    if-eqz p1, :cond_0

    array-length v0, p1

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    .line 72
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null or bBuffer.length != 11"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_1
    new-instance v4, Lo/agg;

    invoke-direct {v4}, Lo/agg;-><init>()V

    .line 80
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    invoke-direct {p0, v0}, Lo/aen;->b(B)[B

    move-result-object v5

    .line 81
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    invoke-direct {p0, v0}, Lo/aen;->b(B)[B

    move-result-object v6

    .line 83
    const/4 v7, 0x2

    .line 84
    const/4 v0, 0x2

    new-array v8, v0, [B

    .line 85
    const/4 v0, 0x3

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    aput-byte v0, v8, v1

    .line 86
    aget-byte v0, p1, v7

    const/4 v1, 0x1

    aput-byte v0, v8, v1

    .line 87
    invoke-direct {p0, v8}, Lo/aen;->c([B)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-virtual {v4, v0}, Lo/agg;->b(F)V

    .line 88
    add-int/lit8 v7, v7, 0x2

    .line 90
    const/4 v0, 0x1

    aget-byte v0, v5, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 92
    const/4 v0, 0x5

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    aput-byte v0, v8, v1

    .line 93
    aget-byte v0, p1, v7

    const/4 v1, 0x1

    aput-byte v0, v8, v1

    .line 94
    invoke-direct {p0, v8}, Lo/aen;->c([B)I

    move-result v9

    .line 95
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseData iYear "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x6

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x7

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x8

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x9

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    aget-byte v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 97
    new-instance v11, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 98
    new-instance v12, Ljava/util/Date;

    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    .line 100
    :try_start_0
    invoke-virtual {v11, v10}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v12, v0

    .line 103
    goto :goto_0

    .line 101
    :catch_0
    move-exception v13

    .line 102
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WspMeasureDataParser parseData e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :goto_0
    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/agg;->d(J)V

    .line 105
    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/agg;->e(J)V

    .line 106
    add-int/lit8 v7, v7, 0x7

    .line 109
    :cond_2
    const/4 v0, 0x1

    aget-byte v0, v6, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 111
    add-int/lit8 v0, v7, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    aput-byte v0, v8, v1

    .line 112
    aget-byte v0, p1, v7

    const/4 v1, 0x1

    aput-byte v0, v8, v1

    .line 113
    add-int/lit8 v7, v7, 0x2

    .line 116
    :cond_3
    const/4 v0, 0x2

    aget-byte v0, v6, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 118
    add-int/lit8 v0, v7, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    aput-byte v0, v8, v1

    .line 119
    aget-byte v0, p1, v7

    const/4 v1, 0x1

    aput-byte v0, v8, v1

    .line 120
    const/4 v0, 0x0

    aget-byte v0, v5, v0

    if-nez v0, :cond_4

    .line 122
    invoke-direct {p0, v8}, Lo/aen;->c([B)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3ba3d70a    # 0.005f

    mul-float v9, v0, v1

    .line 123
    invoke-virtual {v4, v9}, Lo/agg;->e(F)V

    .line 124
    goto :goto_1

    .line 126
    :cond_4
    invoke-direct {p0, v8}, Lo/aen;->c([B)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3c23d70a    # 0.01f

    mul-float v9, v0, v1

    .line 127
    invoke-direct {p0, v9}, Lo/aen;->a(F)F

    move-result v0

    invoke-virtual {v4, v0}, Lo/agg;->e(F)V

    .line 129
    :goto_1
    add-int/lit8 v7, v7, 0x2

    .line 132
    :cond_5
    return-object v4
.end method
