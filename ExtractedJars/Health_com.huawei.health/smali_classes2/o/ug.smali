.class public final Lo/ug;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final d:Lo/re;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Lo/re;

    sget-object v1, Lo/qx;->c:Lo/qx;

    invoke-direct {v0, v1}, Lo/re;-><init>(Lo/qx;)V

    iput-object v0, p0, Lo/ug;->d:Lo/re;

    .line 42
    return-void
.end method

.method private b([BI)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oh;
        }
    .end annotation

    .line 184
    array-length v2, p1

    .line 186
    new-array v3, v2, [I

    .line 187
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 188
    aget-byte v0, p1, v4

    and-int/lit16 v0, v0, 0xff

    aput v0, v3, v4

    .line 187
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 190
    :cond_0
    array-length v0, p1

    sub-int v4, v0, p2

    .line 192
    :try_start_0
    iget-object v0, p0, Lo/ug;->d:Lo/re;

    invoke-virtual {v0, v3, v4}, Lo/re;->c([II)V
    :try_end_0
    .catch Lo/rf; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_1

    .line 193
    :catch_0
    move-exception v5

    .line 194
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 198
    :goto_1
    const/4 v5, 0x0

    :goto_2
    if-ge v5, p2, :cond_1

    .line 199
    aget v0, v3, v5

    int-to-byte v0, v0

    aput-byte v0, p1, v5

    .line 198
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 201
    :cond_1
    return-void
.end method

.method private d(Lo/uh;Ljava/util/Map;)Lo/qn;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/uh;Ljava/util/Map<Lo/og;*>;)Lo/qn;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 145
    invoke-virtual/range {p1 .. p1}, Lo/uh;->a()Lo/un;

    move-result-object v2

    .line 146
    invoke-virtual/range {p1 .. p1}, Lo/uh;->b()Lo/uj;

    move-result-object v0

    invoke-virtual {v0}, Lo/uj;->e()Lo/ul;

    move-result-object v3

    .line 149
    invoke-virtual/range {p1 .. p1}, Lo/uh;->c()[B

    move-result-object v4

    .line 151
    invoke-static {v4, v2, v3}, Lo/ui;->c([BLo/un;Lo/ul;)[Lo/ui;

    move-result-object v5

    .line 154
    const/4 v6, 0x0

    .line 155
    move-object v7, v5

    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_0

    aget-object v10, v7, v9

    .line 156
    invoke-virtual {v10}, Lo/ui;->d()I

    move-result v0

    add-int/2addr v6, v0

    .line 155
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 158
    :cond_0
    new-array v7, v6, [B

    .line 159
    const/4 v8, 0x0

    .line 162
    move-object v9, v5

    array-length v10, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v10, :cond_2

    aget-object v12, v9, v11

    .line 163
    invoke-virtual {v12}, Lo/ui;->b()[B

    move-result-object v13

    .line 164
    invoke-virtual {v12}, Lo/ui;->d()I

    move-result v14

    .line 165
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v14}, Lo/ug;->b([BI)V

    .line 166
    const/4 v15, 0x0

    :goto_2
    if-ge v15, v14, :cond_1

    .line 167
    move v0, v8

    add-int/lit8 v8, v8, 0x1

    aget-byte v1, v13, v15

    aput-byte v1, v7, v0

    .line 166
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 162
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 172
    :cond_2
    move-object/from16 v0, p2

    invoke-static {v7, v2, v3, v0}, Lo/ue;->d([BLo/un;Lo/ul;Ljava/util/Map;)Lo/qn;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e(Lo/qr;Ljava/util/Map;)Lo/qn;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/qr;Ljava/util/Map<Lo/og;*>;)Lo/qn;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 89
    new-instance v2, Lo/uh;

    invoke-direct {v2, p1}, Lo/uh;-><init>(Lo/qr;)V

    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v4, 0x0

    .line 93
    :try_start_0
    invoke-direct {p0, v2, p2}, Lo/ug;->d(Lo/uh;Ljava/util/Map;)Lo/qn;
    :try_end_0
    .catch Lo/of; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lo/oh; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 94
    :catch_0
    move-exception v5

    .line 95
    move-object v3, v5

    .line 98
    goto :goto_0

    .line 96
    :catch_1
    move-exception v5

    .line 97
    move-object v4, v5

    .line 103
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Lo/uh;->e()V

    .line 106
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/uh;->e(Z)V

    .line 109
    invoke-virtual {v2}, Lo/uh;->a()Lo/un;

    .line 112
    invoke-virtual {v2}, Lo/uh;->b()Lo/uj;

    .line 121
    invoke-virtual {v2}, Lo/uh;->d()V

    .line 123
    invoke-direct {p0, v2, p2}, Lo/ug;->d(Lo/uh;Ljava/util/Map;)Lo/qn;

    move-result-object v5

    .line 126
    new-instance v0, Lo/um;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/um;-><init>(Z)V

    invoke-virtual {v5, v0}, Lo/qn;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Lo/of; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lo/oh; {:try_start_1 .. :try_end_1} :catch_2

    .line 128
    return-object v5

    .line 130
    :catch_2
    move-exception v5

    .line 132
    if-eqz v3, :cond_0

    .line 133
    throw v3

    .line 135
    :cond_0
    if-eqz v4, :cond_1

    .line 136
    throw v4

    .line 138
    :cond_1
    throw v5
.end method
