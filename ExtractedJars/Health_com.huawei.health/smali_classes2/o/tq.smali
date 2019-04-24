.class final Lo/tq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/ou;

.field private b:Lo/ou;

.field private c:Lo/ou;

.field private d:Lo/qr;

.field private e:Lo/ou;

.field private f:I

.field private g:I

.field private h:I

.field private i:I


# direct methods
.method constructor <init>(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    if-nez p2, :cond_0

    if-eqz p4, :cond_3

    :cond_0
    if-nez p3, :cond_1

    if-eqz p5, :cond_3

    :cond_1
    if-eqz p2, :cond_2

    if-eqz p3, :cond_3

    :cond_2
    if-eqz p4, :cond_4

    if-nez p5, :cond_4

    .line 47
    :cond_3
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 49
    :cond_4
    invoke-direct/range {p0 .. p5}, Lo/tq;->a(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)V

    .line 50
    return-void
.end method

.method constructor <init>(Lo/tq;)V
    .locals 6

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    move-object v0, p0

    iget-object v1, p1, Lo/tq;->d:Lo/qr;

    iget-object v2, p1, Lo/tq;->e:Lo/ou;

    iget-object v3, p1, Lo/tq;->a:Lo/ou;

    iget-object v4, p1, Lo/tq;->c:Lo/ou;

    iget-object v5, p1, Lo/tq;->b:Lo/ou;

    invoke-direct/range {v0 .. v5}, Lo/tq;->a(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)V

    .line 54
    return-void
.end method

.method private a(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lo/tq;->d:Lo/qr;

    .line 62
    iput-object p2, p0, Lo/tq;->e:Lo/ou;

    .line 63
    iput-object p3, p0, Lo/tq;->a:Lo/ou;

    .line 64
    iput-object p4, p0, Lo/tq;->c:Lo/ou;

    .line 65
    iput-object p5, p0, Lo/tq;->b:Lo/ou;

    .line 66
    invoke-direct {p0}, Lo/tq;->h()V

    .line 67
    return-void
.end method

.method static c(Lo/tq;Lo/tq;)Lo/tq;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 70
    if-nez p0, :cond_0

    .line 71
    return-object p1

    .line 73
    :cond_0
    if-nez p1, :cond_1

    .line 74
    return-object p0

    .line 76
    :cond_1
    new-instance v0, Lo/tq;

    iget-object v1, p0, Lo/tq;->d:Lo/qr;

    iget-object v2, p0, Lo/tq;->e:Lo/ou;

    iget-object v3, p0, Lo/tq;->a:Lo/ou;

    iget-object v4, p1, Lo/tq;->c:Lo/ou;

    iget-object v5, p1, Lo/tq;->b:Lo/ou;

    invoke-direct/range {v0 .. v5}, Lo/tq;-><init>(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)V

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 118
    iget-object v0, p0, Lo/tq;->e:Lo/ou;

    if-nez v0, :cond_0

    .line 119
    new-instance v0, Lo/ou;

    iget-object v1, p0, Lo/tq;->c:Lo/ou;

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lo/ou;-><init>(FF)V

    iput-object v0, p0, Lo/tq;->e:Lo/ou;

    .line 120
    new-instance v0, Lo/ou;

    iget-object v1, p0, Lo/tq;->b:Lo/ou;

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lo/ou;-><init>(FF)V

    iput-object v0, p0, Lo/tq;->a:Lo/ou;

    goto :goto_0

    .line 121
    :cond_0
    iget-object v0, p0, Lo/tq;->c:Lo/ou;

    if-nez v0, :cond_1

    .line 122
    new-instance v0, Lo/ou;

    iget-object v1, p0, Lo/tq;->d:Lo/qr;

    invoke-virtual {v1}, Lo/qr;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    iget-object v2, p0, Lo/tq;->e:Lo/ou;

    invoke-virtual {v2}, Lo/ou;->e()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    iput-object v0, p0, Lo/tq;->c:Lo/ou;

    .line 123
    new-instance v0, Lo/ou;

    iget-object v1, p0, Lo/tq;->d:Lo/qr;

    invoke-virtual {v1}, Lo/qr;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    iget-object v2, p0, Lo/tq;->a:Lo/ou;

    invoke-virtual {v2}, Lo/ou;->e()F

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    iput-object v0, p0, Lo/tq;->b:Lo/ou;

    .line 126
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/tq;->e:Lo/ou;

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    iget-object v1, p0, Lo/tq;->a:Lo/ou;

    invoke-virtual {v1}, Lo/ou;->b()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/tq;->f:I

    .line 127
    iget-object v0, p0, Lo/tq;->c:Lo/ou;

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    iget-object v1, p0, Lo/tq;->b:Lo/ou;

    invoke-virtual {v1}, Lo/ou;->b()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/tq;->i:I

    .line 128
    iget-object v0, p0, Lo/tq;->e:Lo/ou;

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    iget-object v1, p0, Lo/tq;->c:Lo/ou;

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/tq;->g:I

    .line 129
    iget-object v0, p0, Lo/tq;->a:Lo/ou;

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    iget-object v1, p0, Lo/tq;->b:Lo/ou;

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/tq;->h:I

    .line 130
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .line 145
    iget v0, p0, Lo/tq;->f:I

    return v0
.end method

.method b()I
    .locals 1

    .line 153
    iget v0, p0, Lo/tq;->g:I

    return v0
.end method

.method c()I
    .locals 1

    .line 157
    iget v0, p0, Lo/tq;->h:I

    return v0
.end method

.method d()Lo/ou;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/tq;->e:Lo/ou;

    return-object v0
.end method

.method e()I
    .locals 1

    .line 149
    iget v0, p0, Lo/tq;->i:I

    return v0
.end method

.method e(IIZ)Lo/tq;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 80
    iget-object v6, p0, Lo/tq;->e:Lo/ou;

    .line 81
    iget-object v7, p0, Lo/tq;->a:Lo/ou;

    .line 82
    iget-object v8, p0, Lo/tq;->c:Lo/ou;

    .line 83
    iget-object v9, p0, Lo/tq;->b:Lo/ou;

    .line 85
    if-lez p1, :cond_3

    .line 86
    if-eqz p3, :cond_0

    iget-object v10, p0, Lo/tq;->e:Lo/ou;

    goto :goto_0

    :cond_0
    iget-object v10, p0, Lo/tq;->c:Lo/ou;

    .line 87
    :goto_0
    invoke-virtual {v10}, Lo/ou;->e()F

    move-result v0

    float-to-int v0, v0

    sub-int v11, v0, p1

    .line 88
    if-gez v11, :cond_1

    .line 89
    const/4 v11, 0x0

    .line 91
    :cond_1
    new-instance v12, Lo/ou;

    invoke-virtual {v10}, Lo/ou;->b()F

    move-result v0

    int-to-float v1, v11

    invoke-direct {v12, v0, v1}, Lo/ou;-><init>(FF)V

    .line 92
    if-eqz p3, :cond_2

    .line 93
    move-object v6, v12

    goto :goto_1

    .line 95
    :cond_2
    move-object v8, v12

    .line 99
    :cond_3
    :goto_1
    if-lez p2, :cond_7

    .line 100
    if-eqz p3, :cond_4

    iget-object v10, p0, Lo/tq;->a:Lo/ou;

    goto :goto_2

    :cond_4
    iget-object v10, p0, Lo/tq;->b:Lo/ou;

    .line 101
    :goto_2
    invoke-virtual {v10}, Lo/ou;->e()F

    move-result v0

    float-to-int v0, v0

    add-int v11, v0, p2

    .line 102
    iget-object v0, p0, Lo/tq;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    if-lt v11, v0, :cond_5

    .line 103
    iget-object v0, p0, Lo/tq;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    add-int/lit8 v11, v0, -0x1

    .line 105
    :cond_5
    new-instance v12, Lo/ou;

    invoke-virtual {v10}, Lo/ou;->b()F

    move-result v0

    int-to-float v1, v11

    invoke-direct {v12, v0, v1}, Lo/ou;-><init>(FF)V

    .line 106
    if-eqz p3, :cond_6

    .line 107
    move-object v7, v12

    goto :goto_3

    .line 109
    :cond_6
    move-object v9, v12

    .line 113
    :cond_7
    :goto_3
    invoke-direct {p0}, Lo/tq;->h()V

    .line 114
    new-instance v0, Lo/tq;

    iget-object v1, p0, Lo/tq;->d:Lo/qr;

    move-object v2, v6

    move-object v3, v7

    move-object v4, v8

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lo/tq;-><init>(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)V

    return-object v0
.end method

.method f()Lo/ou;
    .locals 1

    .line 173
    iget-object v0, p0, Lo/tq;->b:Lo/ou;

    return-object v0
.end method

.method g()Lo/ou;
    .locals 1

    .line 165
    iget-object v0, p0, Lo/tq;->c:Lo/ou;

    return-object v0
.end method

.method i()Lo/ou;
    .locals 1

    .line 169
    iget-object v0, p0, Lo/tq;->a:Lo/ou;

    return-object v0
.end method
