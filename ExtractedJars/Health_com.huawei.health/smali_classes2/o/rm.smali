.class public final Lo/rm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/op;


# static fields
.field private static final a:[Lo/ou;


# instance fields
.field private final d:Lo/rn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    const/4 v0, 0x0

    new-array v0, v0, [Lo/ou;

    sput-object v0, Lo/rm;->a:[Lo/ou;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Lo/rn;

    invoke-direct {v0}, Lo/rn;-><init>()V

    iput-object v0, p0, Lo/rm;->d:Lo/rn;

    return-void
.end method

.method private static a(Lo/qr;)Lo/qr;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 102
    invoke-virtual {p0}, Lo/qr;->b()[I

    move-result-object v3

    .line 103
    if-nez v3, :cond_0

    .line 104
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 107
    :cond_0
    const/4 v0, 0x0

    aget v4, v3, v0

    .line 108
    const/4 v0, 0x1

    aget v5, v3, v0

    .line 109
    const/4 v0, 0x2

    aget v6, v3, v0

    .line 110
    const/4 v0, 0x3

    aget v7, v3, v0

    .line 113
    new-instance v8, Lo/qr;

    const/16 v0, 0x1e

    const/16 v1, 0x21

    invoke-direct {v8, v0, v1}, Lo/qr;-><init>(II)V

    .line 114
    const/4 v9, 0x0

    :goto_0
    const/16 v0, 0x21

    if-ge v9, v0, :cond_3

    .line 115
    mul-int v0, v9, v7

    div-int/lit8 v1, v7, 0x2

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x21

    add-int v10, v5, v0

    .line 116
    const/4 v11, 0x0

    :goto_1
    const/16 v0, 0x1e

    if-ge v11, v0, :cond_2

    .line 117
    mul-int v0, v11, v6

    div-int/lit8 v1, v6, 0x2

    add-int/2addr v0, v1

    and-int/lit8 v1, v9, 0x1

    mul-int/2addr v1, v6

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x1e

    add-int v12, v4, v0

    .line 118
    invoke-virtual {p0, v12, v10}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 119
    invoke-virtual {v8, v11, v9}, Lo/qr;->a(II)V

    .line 116
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 114
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 123
    :cond_3
    return-object v8
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 89
    return-void
.end method

.method public e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 7
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

    .line 69
    if-eqz p2, :cond_0

    sget-object v0, Lo/og;->a:Lo/og;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p1}, Lo/oj;->d()Lo/qr;

    move-result-object v0

    invoke-static {v0}, Lo/rm;->a(Lo/qr;)Lo/qr;

    move-result-object v4

    .line 71
    iget-object v0, p0, Lo/rm;->d:Lo/rn;

    invoke-virtual {v0, v4, p2}, Lo/rn;->e(Lo/qr;Ljava/util/Map;)Lo/qn;

    move-result-object v3

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 76
    :goto_0
    sget-object v4, Lo/rm;->a:[Lo/ou;

    .line 77
    new-instance v5, Lo/or;

    invoke-virtual {v3}, Lo/qn;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lo/qn;->d()[B

    move-result-object v1

    sget-object v2, Lo/od;->i:Lo/od;

    invoke-direct {v5, v0, v1, v4, v2}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    .line 79
    invoke-virtual {v3}, Lo/qn;->a()Ljava/lang/String;

    move-result-object v6

    .line 80
    if-eqz v6, :cond_1

    .line 81
    sget-object v0, Lo/oq;->e:Lo/oq;

    invoke-virtual {v5, v0, v6}, Lo/or;->e(Lo/oq;Ljava/lang/Object;)V

    .line 83
    :cond_1
    return-object v5
.end method
