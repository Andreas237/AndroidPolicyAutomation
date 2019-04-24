.class public final Lo/qq;
.super Lo/qu;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/qu;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/qr;IIFFFFFFFFFFFFFFFF)Lo/qr;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 39
    invoke-static/range {p4 .. p19}, Lo/qv;->d(FFFFFFFFFFFFFFFF)Lo/qv;

    move-result-object v1

    .line 43
    invoke-virtual {p0, p1, p2, p3, v1}, Lo/qq;->d(Lo/qr;IILo/qv;)Lo/qr;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/qr;IILo/qv;)Lo/qr;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 51
    if-lez p2, :cond_0

    if-gtz p3, :cond_1

    .line 52
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 54
    :cond_1
    new-instance v2, Lo/qr;

    invoke-direct {v2, p2, p3}, Lo/qr;-><init>(II)V

    .line 55
    mul-int/lit8 v0, p2, 0x2

    new-array v3, v0, [F

    .line 56
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p3, :cond_5

    .line 57
    array-length v5, v3

    .line 58
    int-to-float v0, v4

    const/high16 v1, 0x3f000000    # 0.5f

    add-float v6, v0, v1

    .line 59
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_2

    .line 60
    div-int/lit8 v0, v7, 0x2

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    aput v0, v3, v7

    .line 61
    add-int/lit8 v0, v7, 0x1

    aput v6, v3, v0

    .line 59
    add-int/lit8 v7, v7, 0x2

    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {p4, v3}, Lo/qv;->d([F)V

    .line 66
    invoke-static {p1, v3}, Lo/qq;->b(Lo/qr;[F)V

    .line 68
    const/4 v7, 0x0

    :goto_2
    if-ge v7, v5, :cond_4

    .line 69
    :try_start_0
    aget v0, v3, v7

    float-to-int v0, v0

    add-int/lit8 v1, v7, 0x1

    aget v1, v3, v1

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 71
    div-int/lit8 v0, v7, 0x2

    invoke-virtual {v2, v0, v4}, Lo/qr;->a(II)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :cond_3
    add-int/lit8 v7, v7, 0x2

    goto :goto_2

    .line 83
    :cond_4
    goto :goto_3

    .line 74
    :catch_0
    move-exception v7

    .line 82
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 56
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 85
    :cond_5
    return-object v2
.end method
