.class public Lo/ezz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 39
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 42
    const/4 v6, 0x0

    :goto_0
    const/16 v0, 0x30

    if-gt v6, v0, :cond_1

    .line 43
    const-string v7, ""

    .line 44
    rem-int/lit8 v0, v6, 0xc

    if-nez v0, :cond_0

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    div-int/lit8 v3, v6, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%02d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 53
    :cond_0
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 55
    :cond_1
    return-object v5
.end method

.method public static b(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 105
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    :goto_0
    const/16 v0, 0x1e

    if-ge v8, v0, :cond_2

    .line 108
    const-string v9, ""

    .line 109
    add-int/lit8 v0, v8, -0x1

    rem-int/lit8 v0, v0, 0x7

    if-nez v0, :cond_1

    .line 110
    invoke-static {p1, v8}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v10

    .line 111
    invoke-static {v10}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v11

    .line 112
    invoke-static {v10}, Lo/dbu;->c(Ljava/util/Date;)I

    move-result v12

    .line 113
    const-string v0, "M/d"

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v9

    .line 114
    if-eq v7, v11, :cond_0

    .line 115
    move v7, v11

    goto :goto_1

    .line 117
    :cond_0
    move-object v0, p0

    int-to-double v1, v12

    const-string v3, "d"

    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lo/ezz;->e(Landroid/content/Context;DLjava/lang/String;J)Ljava/lang/String;

    move-result-object v9

    .line 120
    :cond_1
    :goto_1
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 122
    :cond_2
    return-object v6
.end method

.method public static d(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 131
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 133
    const/4 v7, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v7, v0, :cond_0

    .line 134
    invoke-static {p1, v7}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v8

    .line 135
    invoke-static {v8}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v9

    .line 136
    move-object v0, p0

    int-to-double v1, v9

    const-string v3, "M"

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lo/ezz;->e(Landroid/content/Context;DLjava/lang/String;J)Ljava/lang/String;

    move-result-object v10

    .line 137
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 139
    :cond_0
    return-object v6
.end method

.method private static e(Landroid/content/Context;DLjava/lang/String;J)Ljava/lang/String;
    .locals 3

    .line 179
    const-string v2, ""

    .line 180
    invoke-static {p0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 183
    :cond_0
    invoke-static {p3, p4, p5}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v2

    .line 185
    :goto_0
    return-object v2
.end method

.method public static e(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Date;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 81
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    :goto_0
    const/4 v0, 0x7

    if-ge v8, v0, :cond_1

    .line 84
    invoke-static {p1, v8}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v9

    .line 85
    invoke-static {v9}, Lo/dbu;->e(Ljava/util/Date;)I

    move-result v10

    .line 86
    invoke-static {v9}, Lo/dbu;->c(Ljava/util/Date;)I

    move-result v11

    .line 87
    const-string v0, "M/d"

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/cxh;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v12

    .line 88
    if-eq v7, v10, :cond_0

    .line 89
    move v7, v10

    goto :goto_1

    .line 91
    :cond_0
    move-object v0, p0

    int-to-double v1, v11

    const-string v3, "d"

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Lo/ezz;->e(Landroid/content/Context;DLjava/lang/String;J)Ljava/lang/String;

    move-result-object v12

    .line 93
    :goto_1
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 95
    :cond_1
    return-object v6
.end method
