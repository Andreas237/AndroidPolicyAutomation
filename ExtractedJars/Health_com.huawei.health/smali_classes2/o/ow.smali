.class public final Lo/ow;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/op;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 115
    return-void
.end method

.method public e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 59
    const/4 v3, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    new-instance v5, Lo/oz;

    invoke-virtual {p1}, Lo/oj;->d()Lo/qr;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/oz;-><init>(Lo/qr;)V

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 65
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v5, v0}, Lo/oz;->d(Z)Lo/ov;

    move-result-object v8

    .line 66
    invoke-virtual {v8}, Lo/ov;->c()[Lo/ou;

    move-result-object v0

    move-object v6, v0

    .line 67
    new-instance v0, Lo/pd;

    invoke-direct {v0}, Lo/pd;-><init>()V

    invoke-virtual {v0, v8}, Lo/pd;->e(Lo/ov;)Lo/qn;
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lo/of; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v7, v0

    .line 72
    goto :goto_0

    .line 68
    :catch_0
    move-exception v8

    .line 69
    move-object v3, v8

    .line 72
    goto :goto_0

    .line 70
    :catch_1
    move-exception v8

    .line 71
    move-object v4, v8

    .line 73
    :goto_0
    if-nez v7, :cond_2

    .line 75
    const/4 v0, 0x1

    :try_start_1
    invoke-virtual {v5, v0}, Lo/oz;->d(Z)Lo/ov;

    move-result-object v8

    .line 76
    invoke-virtual {v8}, Lo/ov;->c()[Lo/ou;

    move-result-object v6

    .line 77
    new-instance v0, Lo/pd;

    invoke-direct {v0}, Lo/pd;-><init>()V

    invoke-virtual {v0, v8}, Lo/pd;->e(Lo/ov;)Lo/qn;
    :try_end_1
    .catch Lo/oo; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lo/of; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v7

    .line 86
    goto :goto_1

    .line 78
    :catch_2
    move-exception v8

    .line 79
    if-eqz v3, :cond_0

    .line 80
    throw v3

    .line 82
    :cond_0
    if-eqz v4, :cond_1

    .line 83
    throw v4

    .line 85
    :cond_1
    throw v8

    .line 89
    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    .line 90
    sget-object v0, Lo/og;->h:Lo/og;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/oy;

    .line 91
    if-eqz v8, :cond_3

    .line 92
    move-object v9, v6

    array-length v10, v9

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v10, :cond_3

    aget-object v12, v9, v11

    .line 93
    invoke-interface {v8, v12}, Lo/oy;->foundPossibleResultPoint(Lo/ou;)V

    .line 92
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 98
    :cond_3
    new-instance v8, Lo/or;

    invoke-virtual {v7}, Lo/qn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/qn;->d()[B

    move-result-object v1

    sget-object v2, Lo/od;->a:Lo/od;

    invoke-direct {v8, v0, v1, v6, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    .line 100
    invoke-virtual {v7}, Lo/qn;->e()Ljava/util/List;

    move-result-object v9

    .line 101
    if-eqz v9, :cond_4

    .line 102
    sget-object v0, Lo/oq;->c:Lo/oq;

    invoke-virtual {v8, v0, v9}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 104
    :cond_4
    invoke-virtual {v7}, Lo/qn;->a()Ljava/lang/String;

    move-result-object v10

    .line 105
    if-eqz v10, :cond_5

    .line 106
    sget-object v0, Lo/oq;->e:Lo/oq;

    invoke-virtual {v8, v0, v10}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 109
    :cond_5
    return-object v8
.end method
