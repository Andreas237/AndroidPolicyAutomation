.class public final Lo/rc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/op;


# static fields
.field private static final d:[Lo/ou;


# instance fields
.field private final a:Lo/rl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const/4 v0, 0x0

    new-array v0, v0, [Lo/ou;

    sput-object v0, Lo/rc;->d:[Lo/ou;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lo/rl;

    invoke-direct {v0}, Lo/rl;-><init>()V

    iput-object v0, p0, Lo/rc;->a:Lo/rl;

    return-void
.end method

.method private static b(Lo/qr;)Lo/qr;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 104
    invoke-virtual/range {p0 .. p0}, Lo/qr;->d()[I

    move-result-object v2

    .line 105
    invoke-virtual/range {p0 .. p0}, Lo/qr;->c()[I

    move-result-object v3

    .line 106
    if-eqz v2, :cond_0

    if-nez v3, :cond_1

    .line 107
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 110
    :cond_1
    move-object/from16 v0, p0

    invoke-static {v2, v0}, Lo/rc;->d([ILo/qr;)I

    move-result v4

    .line 112
    const/4 v0, 0x1

    aget v5, v2, v0

    .line 113
    const/4 v0, 0x1

    aget v6, v3, v0

    .line 114
    const/4 v0, 0x0

    aget v7, v2, v0

    .line 115
    const/4 v0, 0x0

    aget v8, v3, v0

    .line 117
    sub-int v0, v8, v7

    add-int/lit8 v0, v0, 0x1

    div-int v9, v0, v4

    .line 118
    sub-int v0, v6, v5

    add-int/lit8 v0, v0, 0x1

    div-int v10, v0, v4

    .line 119
    if-lez v9, :cond_2

    if-gtz v10, :cond_3

    .line 120
    :cond_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 126
    :cond_3
    div-int/lit8 v11, v4, 0x2

    .line 127
    add-int/2addr v5, v11

    .line 128
    add-int/2addr v7, v11

    .line 131
    new-instance v12, Lo/qr;

    invoke-direct {v12, v9, v10}, Lo/qr;-><init>(II)V

    .line 132
    const/4 v13, 0x0

    :goto_0
    if-ge v13, v10, :cond_6

    .line 133
    mul-int v0, v13, v4

    add-int v14, v5, v0

    .line 134
    const/4 v15, 0x0

    :goto_1
    if-ge v15, v9, :cond_5

    .line 135
    mul-int v0, v15, v4

    add-int/2addr v0, v7

    move-object/from16 v1, p0

    invoke-virtual {v1, v0, v14}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 136
    invoke-virtual {v12, v15, v13}, Lo/qr;->a(II)V

    .line 134
    :cond_4
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 132
    :cond_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 140
    :cond_6
    return-object v12
.end method

.method private static d([ILo/qr;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 144
    invoke-virtual {p1}, Lo/qr;->a()I

    move-result v1

    .line 145
    const/4 v0, 0x0

    aget v2, p0, v0

    .line 146
    const/4 v0, 0x1

    aget v3, p0, v0

    .line 147
    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2, v3}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 150
    :cond_0
    if-ne v2, v1, :cond_1

    .line 151
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 154
    :cond_1
    const/4 v0, 0x0

    aget v0, p0, v0

    sub-int v4, v2, v0

    .line 155
    if-nez v4, :cond_2

    .line 156
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 158
    :cond_2
    return v4
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 92
    return-void
.end method

.method public e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/oh;,
            Lo/of;
        }
    .end annotation

    .line 67
    if-eqz p2, :cond_0

    sget-object v0, Lo/og;->a:Lo/og;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {p1}, Lo/oj;->d()Lo/qr;

    move-result-object v0

    invoke-static {v0}, Lo/rc;->b(Lo/qr;)Lo/qr;

    move-result-object v5

    .line 69
    iget-object v0, p0, Lo/rc;->a:Lo/rl;

    invoke-virtual {v0, v5}, Lo/rl;->e(Lo/qr;)Lo/qn;

    move-result-object v3

    .line 70
    sget-object v4, Lo/rc;->d:[Lo/ou;

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v0, Lo/rj;

    invoke-virtual {p1}, Lo/oj;->d()Lo/qr;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/rj;-><init>(Lo/qr;)V

    invoke-virtual {v0}, Lo/rj;->d()Lo/qw;

    move-result-object v5

    .line 73
    iget-object v0, p0, Lo/rc;->a:Lo/rl;

    invoke-virtual {v5}, Lo/qw;->d()Lo/qr;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/rl;->e(Lo/qr;)Lo/qn;

    move-result-object v3

    .line 74
    invoke-virtual {v5}, Lo/qw;->c()[Lo/ou;

    move-result-object v4

    .line 76
    :goto_0
    new-instance v5, Lo/or;

    invoke-virtual {v3}, Lo/qn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lo/qn;->d()[B

    move-result-object v1

    sget-object v2, Lo/od;->h:Lo/od;

    invoke-direct {v5, v0, v1, v4, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    .line 78
    invoke-virtual {v3}, Lo/qn;->e()Ljava/util/List;

    move-result-object v6

    .line 79
    if-eqz v6, :cond_1

    .line 80
    sget-object v0, Lo/oq;->c:Lo/oq;

    invoke-virtual {v5, v0, v6}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 82
    :cond_1
    invoke-virtual {v3}, Lo/qn;->a()Ljava/lang/String;

    move-result-object v7

    .line 83
    if-eqz v7, :cond_2

    .line 84
    sget-object v0, Lo/oq;->e:Lo/oq;

    invoke-virtual {v5, v0, v7}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 86
    :cond_2
    return-object v5
.end method
