.class public final Lo/uc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lo/vc;III)Lo/qr;
    .locals 17

    .line 87
    invoke-virtual/range {p0 .. p0}, Lo/vc;->d()Lo/uv;

    move-result-object v2

    .line 88
    if-nez v2, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 91
    :cond_0
    invoke-virtual {v2}, Lo/uv;->a()I

    move-result v3

    .line 92
    invoke-virtual {v2}, Lo/uv;->e()I

    move-result v4

    .line 93
    mul-int/lit8 v0, p3, 0x2

    add-int v5, v3, v0

    .line 94
    mul-int/lit8 v0, p3, 0x2

    add-int v6, v4, v0

    .line 95
    move/from16 v0, p1

    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 96
    move/from16 v0, p2

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 98
    div-int v0, v7, v5

    div-int v1, v8, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 103
    mul-int v0, v3, v9

    sub-int v0, v7, v0

    div-int/lit8 v10, v0, 0x2

    .line 104
    mul-int v0, v4, v9

    sub-int v0, v8, v0

    div-int/lit8 v11, v0, 0x2

    .line 106
    new-instance v12, Lo/qr;

    invoke-direct {v12, v7, v8}, Lo/qr;-><init>(II)V

    .line 108
    const/4 v13, 0x0

    move v14, v11

    :goto_0
    if-ge v13, v4, :cond_3

    .line 110
    const/4 v15, 0x0

    move/from16 v16, v10

    :goto_1
    if-ge v15, v3, :cond_2

    .line 111
    invoke-virtual {v2, v15, v13}, Lo/uv;->e(II)B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 112
    move/from16 v0, v16

    invoke-virtual {v12, v0, v14, v9, v9}, Lo/qr;->c(IIII)V

    .line 110
    :cond_1
    add-int/lit8 v15, v15, 0x1

    add-int v16, v16, v9

    goto :goto_1

    .line 108
    :cond_2
    add-int/lit8 v13, v13, 0x1

    add-int/2addr v14, v9

    goto :goto_0

    .line 117
    :cond_3
    return-object v12
.end method


# virtual methods
.method public a(Ljava/lang/String;Lo/od;IILjava/util/Map;)Lo/qr;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/od;IILjava/util/Map<Lo/oi;*>;)Lo/qr;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Found empty contents"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 58
    :cond_0
    sget-object v0, Lo/od;->p:Lo/od;

    if-eq p2, v0, :cond_1

    .line 59
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can only encode QR_CODE, but got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 62
    :cond_1
    if-ltz p3, :cond_2

    if-gez p4, :cond_3

    .line 63
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested dimensions are too small: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x78

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 67
    :cond_3
    sget-object v3, Lo/ul;->e:Lo/ul;

    .line 68
    const/4 v4, 0x4

    .line 69
    if-eqz p5, :cond_5

    .line 70
    sget-object v0, Lo/oi;->c:Lo/oi;

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ul;

    .line 71
    if-eqz v5, :cond_4

    .line 72
    move-object v3, v5

    .line 74
    :cond_4
    sget-object v0, Lo/oi;->h:Lo/oi;

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    .line 75
    if-eqz v6, :cond_5

    .line 76
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 80
    :cond_5
    invoke-static {p1, v3, p5}, Lo/ux;->d(Ljava/lang/String;Lo/ul;Ljava/util/Map;)Lo/vc;

    move-result-object v5

    .line 81
    invoke-static {v5, p3, p4, v4}, Lo/uc;->a(Lo/vc;III)Lo/qr;

    move-result-object v0

    return-object v0
.end method
