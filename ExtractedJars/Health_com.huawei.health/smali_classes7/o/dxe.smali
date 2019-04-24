.class public Lo/dxe;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(JD)Ljava/lang/String;
    .locals 4

    .line 266
    const-string v0, "[{\"startTime\":%d,\"deviceCode\":231378400,\"endTime\":%d,\"source\":1,\"value\":%f}]"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;)Z
    .locals 18

    .line 186
    invoke-static/range {p0 .. p0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v7

    .line 187
    new-instance v8, Lo/dvr;

    invoke-direct {v8}, Lo/dvr;-><init>()V

    .line 188
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 191
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 192
    const/4 v12, 0x0

    :goto_0
    const/16 v0, 0x1e

    if-ge v12, v0, :cond_3

    .line 194
    new-instance v13, Ljava/security/SecureRandom;

    invoke-direct {v13}, Ljava/security/SecureRandom;-><init>()V

    .line 195
    const/16 v0, 0x9

    invoke-virtual {v13, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    add-int/lit8 v14, v0, 0x1

    .line 196
    const/4 v0, 0x5

    invoke-virtual {v13, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v15, v0, 0x5

    .line 197
    const/4 v0, 0x5

    invoke-virtual {v13, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    mul-int/lit8 v1, v12, 0x14

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x3b

    mul-int/lit8 v0, v0, 0x3b

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    sub-long v16, v10, v0

    .line 200
    const/4 v0, 0x6

    if-ne v14, v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :cond_0
    move v0, v14

    :goto_1
    move v14, v0

    .line 203
    const/4 v0, 0x3

    if-eq v14, v0, :cond_1

    const/16 v0, 0x9

    if-ne v14, v0, :cond_2

    .line 204
    :cond_1
    neg-int v15, v15

    .line 206
    :cond_2
    new-instance v0, Lo/dvo;

    move-wide v1, v10

    move v3, v14

    move v4, v15

    move-wide/from16 v5, v16

    invoke-direct/range {v0 .. v6}, Lo/dvo;-><init>(JIIJ)V

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 208
    :cond_3
    invoke-virtual {v8, v9}, Lo/dvr;->b(Ljava/util/List;)V

    .line 209
    const/16 v0, 0xa

    invoke-virtual {v8, v0}, Lo/dvr;->a(I)V

    .line 210
    invoke-virtual {v7, v8}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 43
    move-object v1, p1

    .line 44
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 46
    :sswitch_0
    const-string v0, "personal_preset_data.txt"

    invoke-static {v0}, Lo/dxe;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 47
    goto :goto_0

    .line 49
    :sswitch_1
    const-string v0, "kaka_task_preset_data.txt"

    invoke-static {v0}, Lo/dxe;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    goto :goto_0

    .line 52
    :sswitch_2
    const-string v0, "level_preset_data.txt"

    invoke-static {v0}, Lo/dxe;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 53
    goto :goto_0

    .line 55
    :sswitch_3
    const-string v0, "get_medal_preset_data.txt"

    invoke-static {v0}, Lo/dxe;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    .line 60
    :goto_0
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_3
        0xb -> :sswitch_1
        0xd -> :sswitch_2
    .end sparse-switch
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 70
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readPresetData start:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const-string v4, ""

    .line 72
    const/4 v5, 0x0

    .line 74
    const-string v0, "achievement"

    :try_start_0
    invoke-static {v0, p0}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 75
    if-eqz v5, :cond_1

    .line 76
    invoke-virtual {v5}, Ljava/io/InputStream;->available()I

    move-result v6

    .line 77
    new-array v7, v6, [B

    .line 78
    invoke-virtual {v5, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    .line 79
    if-lez v8, :cond_0

    .line 80
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v4, v0

    .line 82
    :cond_0
    goto :goto_0

    .line 83
    :cond_1
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFileInputStream failed :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :goto_0
    if-eqz v5, :cond_3

    .line 90
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 93
    goto :goto_2

    .line 91
    :catch_0
    move-exception v6

    .line 92
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readPreset DatainputStream.close() failed :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    goto :goto_2

    .line 85
    :catch_1
    move-exception v6

    .line 86
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readPresetData failed :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    if-eqz v5, :cond_3

    .line 90
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 93
    goto :goto_2

    .line 91
    :catch_2
    move-exception v6

    .line 92
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readPreset DatainputStream.close() failed :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    goto :goto_2

    .line 88
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_2

    .line 90
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 93
    goto :goto_1

    .line 91
    :catch_3
    move-exception v10

    .line 92
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readPreset DatainputStream.close() failed :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :cond_2
    :goto_1
    throw v9

    .line 96
    :cond_3
    :goto_2
    return-object v4
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    .line 105
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertStoreDemoAchieveData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 107
    new-instance v0, Lo/dxe$5;

    invoke-direct {v0, p0}, Lo/dxe$5;-><init>(Landroid/content/Context;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 118
    return-void
.end method

.method private static c(Landroid/content/Context;)Z
    .locals 4

    .line 126
    invoke-static {p0}, Lo/dxe;->i(Landroid/content/Context;)V

    .line 129
    invoke-static {p0}, Lo/dxe;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo insertKakaRecord failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    const/4 v0, 0x0

    return v0

    .line 135
    :cond_0
    invoke-static {p0}, Lo/dxe;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 136
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo insertKakaRecord failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    const/4 v0, 0x0

    return v0

    .line 141
    :cond_1
    invoke-static {p0}, Lo/dxe;->g(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 142
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo insertKakaRecord failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v0, 0x0

    return v0

    .line 147
    :cond_2
    invoke-static {p0}, Lo/dxe;->k(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 148
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo insertSingleDayRecord failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const/4 v0, 0x0

    return v0

    .line 153
    :cond_3
    invoke-static {p0}, Lo/dxe;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 154
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo insertRecentWeekRecord failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_4
    invoke-static {p0}, Lo/dxe;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 160
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo insertRecentMonthRecord failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x0

    return v0

    .line 163
    :cond_5
    const-string v0, "AchievementMockUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert storedemo achievement pass"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v0, 0x1

    return v0
.end method

.method private static d(Landroid/content/Context;)Z
    .locals 4

    .line 171
    invoke-static {p0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v2

    .line 172
    new-instance v3, Lo/dvh;

    invoke-direct {v3}, Lo/dvh;-><init>()V

    .line 173
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lo/dvh;->e(I)V

    .line 174
    const/16 v0, 0x3c

    invoke-virtual {v3, v0}, Lo/dvh;->d(I)V

    .line 175
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-virtual {v3, v0, v1}, Lo/dvh;->b(D)V

    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dvh;->c(J)V

    .line 177
    const-string v0, ""

    invoke-virtual {v3, v0}, Lo/dvh;->c(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v2, v3}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method private static e(I)J
    .locals 6

    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    int-to-long v2, p0

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method static synthetic e(Landroid/content/Context;)Z
    .locals 1

    .line 32
    invoke-static {p0}, Lo/dxe;->c(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method private static f(Landroid/content/Context;)Z
    .locals 6

    .line 294
    invoke-static {p0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v4

    .line 295
    new-instance v5, Lo/dwd;

    invoke-direct {v5}, Lo/dwd;-><init>()V

    .line 296
    const-wide v0, 0x4110f45000000000L    # 277780.0

    invoke-virtual {v5, v0, v1}, Lo/dwd;->b(D)V

    .line 297
    const-wide v0, 0x4051ef5c28f5c28fL    # 71.74

    invoke-virtual {v5, v0, v1}, Lo/dwd;->a(D)V

    .line 298
    const/16 v0, 0xc8

    invoke-virtual {v5, v0}, Lo/dwd;->e(I)V

    .line 299
    const-wide v0, 0x404e9d70a3d70a3dL    # 61.23

    invoke-virtual {v5, v0, v1}, Lo/dwd;->d(D)V

    .line 300
    const-wide v0, 0x404bd47ae147ae14L    # 55.66

    invoke-virtual {v5, v0, v1}, Lo/dwd;->e(D)V

    .line 301
    const/16 v0, 0x3c

    invoke-virtual {v5, v0}, Lo/dwd;->d(I)V

    .line 302
    const/16 v0, 0x1e

    invoke-virtual {v5, v0}, Lo/dwd;->c(I)V

    .line 303
    const-string v0, ""

    invoke-virtual {v5, v0}, Lo/dwd;->b(Ljava/lang/String;)V

    .line 304
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x95586c00L

    sub-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Lo/dwd;->d(J)V

    .line 305
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwd;->e(J)V

    .line 306
    const/16 v0, 0x64

    invoke-virtual {v5, v0}, Lo/dwd;->a(I)V

    .line 307
    const-string v0, "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19"

    invoke-virtual {v5, v0}, Lo/dwd;->b(Ljava/lang/String;)V

    .line 308
    invoke-virtual {v4, v5}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method private static g(Landroid/content/Context;)Z
    .locals 6

    .line 217
    invoke-static {p0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v4

    .line 218
    new-instance v5, Lo/dwj;

    invoke-direct {v5}, Lo/dwj;-><init>()V

    .line 219
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x95586c00L

    sub-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Lo/dwj;->c(J)V

    .line 220
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwj;->b(J)V

    .line 221
    const/16 v0, 0x1e

    invoke-virtual {v5, v0}, Lo/dwj;->b(I)V

    .line 222
    const-wide v0, 0x4051ef5c28f5c28fL    # 71.74

    invoke-virtual {v5, v0, v1}, Lo/dwj;->b(D)V

    .line 223
    const-wide v0, 0x4110f45000000000L    # 277780.0

    invoke-virtual {v5, v0, v1}, Lo/dwj;->e(D)V

    .line 224
    const-wide v0, 0x415ad04200000000L    # 7029000.0

    invoke-virtual {v5, v0, v1}, Lo/dwj;->d(D)V

    .line 225
    const-wide v0, 0x3ff599999999999aL    # 1.35

    invoke-virtual {v5, v0, v1}, Lo/dwj;->c(D)V

    .line 226
    invoke-virtual {v4, v5}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method private static h(Landroid/content/Context;)Z
    .locals 6

    .line 273
    invoke-static {p0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v4

    .line 274
    new-instance v5, Lo/dwh;

    invoke-direct {v5}, Lo/dwh;-><init>()V

    .line 275
    const-wide v0, 0x40f0f54000000000L    # 69460.0

    invoke-virtual {v5, v0, v1}, Lo/dwh;->a(D)V

    .line 276
    const-wide v0, 0x4028cccccccccccdL    # 12.4

    invoke-virtual {v5, v0, v1}, Lo/dwh;->b(D)V

    .line 277
    const-wide v0, 0x4046f70a3d70a3d7L    # 45.93

    invoke-virtual {v5, v0, v1}, Lo/dwh;->c(D)V

    .line 278
    const/16 v0, 0x65

    invoke-virtual {v5, v0}, Lo/dwh;->c(I)V

    .line 279
    const-wide v0, 0x404ab47ae147ae14L    # 53.41

    invoke-virtual {v5, v0, v1}, Lo/dwh;->e(D)V

    .line 280
    const/16 v0, 0x2d

    invoke-virtual {v5, v0}, Lo/dwh;->d(I)V

    .line 281
    const/16 v0, 0x1e

    invoke-virtual {v5, v0}, Lo/dwh;->b(I)V

    .line 282
    const-string v0, ""

    invoke-virtual {v5, v0}, Lo/dwh;->b(Ljava/lang/String;)V

    .line 283
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x1ee62800

    sub-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Lo/dwh;->c(J)V

    .line 284
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dwh;->e(J)V

    .line 285
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/dwh;->a(I)V

    .line 286
    const-string v0, "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19"

    invoke-virtual {v5, v0}, Lo/dwh;->b(Ljava/lang/String;)V

    .line 287
    invoke-virtual {v4, v5}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method private static i(Landroid/content/Context;)V
    .locals 2

    .line 315
    invoke-static {p0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v1

    .line 316
    new-instance v0, Lo/dvh;

    invoke-direct {v0}, Lo/dvh;-><init>()V

    invoke-virtual {v1, v0}, Lo/dwn;->e(Lo/dvf;)Z

    .line 317
    new-instance v0, Lo/dvr;

    invoke-direct {v0}, Lo/dvr;-><init>()V

    invoke-virtual {v1, v0}, Lo/dwn;->e(Lo/dvf;)Z

    .line 318
    new-instance v0, Lo/dwm;

    invoke-direct {v0}, Lo/dwm;-><init>()V

    invoke-virtual {v1, v0}, Lo/dwn;->e(Lo/dvf;)Z

    .line 319
    new-instance v0, Lo/dwd;

    invoke-direct {v0}, Lo/dwd;-><init>()V

    invoke-virtual {v1, v0}, Lo/dwn;->e(Lo/dvf;)Z

    .line 320
    new-instance v0, Lo/dwh;

    invoke-direct {v0}, Lo/dwh;-><init>()V

    invoke-virtual {v1, v0}, Lo/dwn;->e(Lo/dvf;)Z

    .line 321
    return-void
.end method

.method private static k(Landroid/content/Context;)Z
    .locals 7

    .line 233
    invoke-static {p0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v4

    .line 234
    new-instance v5, Lo/dwm;

    invoke-direct {v5}, Lo/dwm;-><init>()V

    .line 237
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 238
    const-string v0, "[{\"recordDay\":%s,\"value\":25160}]"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x13

    invoke-static {v2}, Lo/dxe;->e(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->i(Ljava/lang/String;)V

    .line 239
    const/4 v0, 0x5

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x40a0900000000000L    # 2120.0

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->e(Ljava/lang/String;)V

    .line 242
    const/16 v0, 0x13

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x40d5cc0000000000L    # 22320.0

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->f(Ljava/lang/String;)V

    .line 243
    const/4 v0, 0x4

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x4075500000000000L    # 341.0

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->o(Ljava/lang/String;)V

    .line 246
    const/16 v0, 0xe

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x4094380000000000L    # 1294.0

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->d(Ljava/lang/String;)V

    .line 247
    const/4 v0, 0x7

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x40a4700000000000L    # 2616.0

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->b(Ljava/lang/String;)V

    .line 248
    const/16 v0, 0x13

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x40bff30000000000L    # 8179.0

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->h(Ljava/lang/String;)V

    .line 251
    const/16 v0, 0x1b

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x40bed20000000000L    # 7890.0

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->a(Ljava/lang/String;)V

    .line 252
    const/16 v0, 0xb

    invoke-static {v0}, Lo/dxe;->e(I)J

    move-result-wide v0

    const-wide v2, 0x4071940000000000L    # 281.25

    invoke-static {v0, v1, v2, v3}, Lo/dxe;->a(JD)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dwm;->c(Ljava/lang/String;)V

    .line 254
    invoke-virtual {v4, v5}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method
