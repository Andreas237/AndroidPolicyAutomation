.class final Lo/fns;
.super Lo/fnr;
.source "SourceFile"


# instance fields
.field private d:Lo/fma;


# direct methods
.method private constructor <init>(II)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Lo/fnr;-><init>(II)V

    .line 37
    return-void
.end method

.method static a(Lo/fmb;Lo/fma;I)Lo/fns;
    .locals 4

    .line 64
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->l()I

    move-result v1

    .line 65
    move v2, p2

    .line 66
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->G()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 69
    :cond_0
    new-instance v3, Lo/fns;

    invoke-direct {v3, v2, v1}, Lo/fns;-><init>(II)V

    .line 70
    iput-object p0, v3, Lo/fns;->b:Lo/fmb;

    .line 71
    invoke-virtual {v3, p1}, Lo/fns;->d(Lo/flq;)V

    .line 72
    return-object v3
.end method

.method static e(Lo/fmb;Lo/fma;I)Lo/fns;
    .locals 3

    .line 48
    new-instance v2, Lo/fns;

    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->l()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {v2, v1, v0}, Lo/fns;-><init>(II)V

    .line 49
    iput-object p1, v2, Lo/fns;->d:Lo/fma;

    .line 50
    iput-object p0, v2, Lo/fns;->b:Lo/fmb;

    .line 51
    invoke-static {p2}, Lo/fll;->d(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lo/fns;->c(I)V

    .line 52
    return-object v2
.end method


# virtual methods
.method declared-synchronized b(II)Lo/fma;
    .locals 2

    monitor-enter p0

    .line 90
    :try_start_0
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    if-nez v0, :cond_0

    .line 91
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no request body"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    invoke-virtual {p0, p1}, Lo/fns;->b(I)V

    .line 95
    invoke-virtual {p0, p2}, Lo/fns;->c(I)V

    .line 96
    invoke-virtual {p0}, Lo/fns;->e()Lo/fma;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method c(Lo/fly;)Z
    .locals 2

    .line 165
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/fly;->k()Lo/flz;

    move-result-object v0

    iget-object v1, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v1}, Lo/fma;->k()Lo/flz;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/flz;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method d()V
    .locals 1

    .line 152
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v0}, Lo/fma;->A()V

    .line 155
    :cond_0
    return-void
.end method

.method declared-synchronized e()Lo/fma;
    .locals 11

    monitor-enter p0

    .line 110
    :try_start_0
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    if-nez v0, :cond_0

    .line 111
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no request body"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 114
    :cond_0
    invoke-virtual {p0}, Lo/fns;->b()I

    move-result v2

    .line 115
    invoke-virtual {p0}, Lo/fns;->h()I

    move-result v3

    .line 117
    new-instance v4, Lo/fma;

    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v0}, Lo/fma;->E()Lo/flj$d;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/fma;-><init>(Lo/flj$d;)V

    .line 119
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v0}, Lo/fma;->b()Lo/flj$e;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fma;->d(Lo/flj$e;)Lo/flq;

    .line 120
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v0}, Lo/fma;->u()Lo/fow;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fma;->e(Lo/fow;)Lo/fma;

    .line 122
    new-instance v0, Lo/flr;

    iget-object v1, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v1}, Lo/fma;->f()Lo/flr;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flr;-><init>(Lo/flr;)V

    invoke-virtual {v4, v0}, Lo/fma;->e(Lo/flr;)Lo/flq;

    .line 125
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v0}, Lo/fma;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fma;->e(Ljava/util/List;)V

    .line 126
    if-nez v2, :cond_1

    .line 128
    invoke-virtual {v4}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    iget-object v1, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v1}, Lo/fma;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/flr;->b(I)Lo/flr;

    .line 131
    :cond_1
    invoke-virtual {p0}, Lo/fns;->k()I

    move-result v5

    .line 132
    mul-int v6, v2, v5

    .line 133
    add-int/lit8 v0, v2, 0x1

    mul-int/2addr v0, v5

    iget-object v1, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v1}, Lo/fma;->g()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 134
    sub-int v8, v7, v6

    .line 135
    new-array v9, v8, [B

    .line 136
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v0}, Lo/fma;->l()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v6, v9, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 137
    invoke-virtual {v4, v9}, Lo/fma;->c([B)Lo/fma;

    .line 139
    iget-object v0, p0, Lo/fns;->d:Lo/fma;

    invoke-virtual {v0}, Lo/fma;->g()I

    move-result v0

    if-ge v7, v0, :cond_2

    const/4 v10, 0x1

    goto :goto_0

    :cond_2
    const/4 v10, 0x0

    .line 140
    :goto_0
    invoke-virtual {v4}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v3, v10, v2}, Lo/flr;->b(IZI)Lo/flr;

    .line 142
    if-nez v10, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Lo/fns;->e(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method
