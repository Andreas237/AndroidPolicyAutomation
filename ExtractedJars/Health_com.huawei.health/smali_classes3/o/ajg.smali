.class public Lo/ajg;
.super Lo/flh;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/flh;-><init>()V

    .line 31
    return-void
.end method

.method private a(Lo/fma;Lo/fmf;)Lo/aji;
    .locals 4

    .line 94
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lo/ajg;->d(Lo/fma;Lo/fmf;)Lo/fma;

    move-result-object v0

    invoke-virtual {p0}, Lo/ajg;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fma;->b(J)Lo/fly;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 95
    if-nez v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 96
    :cond_0
    :try_start_1
    new-instance v0, Lo/aji;

    invoke-direct {v0, v3}, Lo/aji;-><init>(Lo/fly;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 97
    :catch_0
    move-exception v3

    .line 98
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private c(Lo/fma;)Lo/aji;
    .locals 1

    .line 89
    invoke-virtual {p0, p1}, Lo/ajg;->e(Lo/fma;)Lo/fmf;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/ajg;->a(Lo/fma;Lo/fmf;)Lo/aji;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo/ail;I)Lo/aji;
    .locals 10

    .line 34
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    instance-of v0, p1, Lo/ait;

    if-nez v0, :cond_1

    .line 35
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 37
    :cond_1
    invoke-static {}, Lo/fma;->M()Lo/fma;

    move-result-object v0

    invoke-super {p0}, Lo/flh;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fma;->c(Ljava/lang/String;)Lo/fma;

    move-result-object v0

    invoke-virtual {p1}, Lo/ail;->b()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fma;->c([B)Lo/fma;

    move-result-object v4

    .line 38
    move-object v5, p1

    check-cast v5, Lo/ait;

    .line 39
    invoke-virtual {v5}, Lo/ait;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 40
    new-instance v6, Lo/flt;

    invoke-direct {v6}, Lo/flt;-><init>()V

    .line 41
    const/16 v0, 0x800

    invoke-virtual {v6, v0}, Lo/flt;->d(I)V

    .line 42
    invoke-virtual {v5}, Lo/ait;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/flt;->e(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v4}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/flr;->e(Lo/flt;)Lo/flr;

    .line 45
    :cond_2
    new-instance v6, Lo/flt;

    invoke-direct {v6}, Lo/flt;-><init>()V

    .line 46
    const/16 v0, 0x805

    invoke-virtual {v6, v0}, Lo/flt;->d(I)V

    .line 47
    invoke-virtual {v5}, Lo/ait;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-virtual {v6, v0, v1}, Lo/flt;->b(J)V

    .line 48
    invoke-virtual {v4}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/flr;->e(Lo/flt;)Lo/flr;

    .line 50
    invoke-virtual {v4}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/flr;->e(I)Lo/flr;

    .line 52
    invoke-virtual {v5}, Lo/ait;->k()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/fma;->d([B)Lo/flq;

    .line 55
    invoke-virtual {v5}, Lo/ait;->h()[B

    move-result-object v8

    .line 56
    if-eqz v8, :cond_3

    .line 57
    invoke-virtual {v5}, Lo/ait;->h()[B

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v7

    .line 58
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 60
    const/16 v0, 0x10

    :try_start_0
    invoke-static {v7, v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/fma;->d(I)Lo/flq;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    goto :goto_0

    .line 61
    :catch_0
    move-exception v9

    .line 62
    const-string v0, "MyCoapClient"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :cond_3
    :goto_0
    invoke-direct {p0, v4}, Lo/ajg;->c(Lo/fma;)Lo/aji;

    move-result-object v0

    return-object v0
.end method
