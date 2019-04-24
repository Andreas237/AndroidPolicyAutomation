.class public Lo/flh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Lo/fty;


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Lo/flj$e;

.field private c:Ljava/lang/String;

.field private e:I

.field private g:Lo/fmf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    const-class v0, Lo/flh;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/flh;->d:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 105
    const-string v0, ""

    invoke-direct {p0, v0}, Lo/flh;-><init>(Ljava/lang/String;)V

    .line 106
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    iput-object v0, p0, Lo/flh;->b:Lo/flj$e;

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lo/flh;->e:I

    .line 114
    iput-object p1, p0, Lo/flh;->c:Ljava/lang/String;

    .line 115
    return-void
.end method

.method private a(Lo/fma;)Lo/flk;
    .locals 1

    .line 872
    invoke-virtual {p0, p1}, Lo/flh;->e(Lo/fma;)Lo/fmf;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/flh;->b(Lo/fma;Lo/fmf;)Lo/flk;

    move-result-object v0

    return-object v0
.end method

.method private a()Lo/fma;
    .locals 1

    .line 1112
    invoke-static {}, Lo/fma;->L()Lo/fma;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flh;->b(Lo/fma;)Lo/fma;

    move-result-object v0

    return-object v0
.end method

.method private b(Lo/fma;Lo/fmf;)Lo/flk;
    .locals 6

    .line 885
    :try_start_0
    invoke-virtual {p0}, Lo/flh;->c()Ljava/lang/Long;

    move-result-object v3

    .line 886
    if-nez v3, :cond_0

    .line 887
    invoke-interface {p2}, Lo/fmf;->f()Lo/fmw;

    move-result-object v0

    const-string v1, "EXCHANGE_LIFETIME"

    invoke-virtual {v0, v1}, Lo/fmw;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 889
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/flh;->d(Lo/fma;Lo/fmf;)Lo/fma;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fma;->b(J)Lo/fly;

    move-result-object v4

    .line 890
    if-nez v4, :cond_2

    .line 892
    invoke-virtual {p1}, Lo/fma;->A()V

    .line 893
    invoke-virtual {p1}, Lo/fma;->x()Ljava/lang/Throwable;

    move-result-object v5

    .line 894
    if-eqz v5, :cond_1

    .line 895
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 897
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 899
    :cond_2
    :try_start_1
    new-instance v0, Lo/flk;

    invoke-direct {v0, v4}, Lo/flk;-><init>(Lo/fly;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    .line 901
    :catch_0
    move-exception v3

    .line 902
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private b(Lo/fma;)Lo/fma;
    .locals 1

    .line 1152
    iget-object v0, p0, Lo/flh;->b:Lo/flj$e;

    invoke-virtual {p1, v0}, Lo/fma;->d(Lo/flj$e;)Lo/flq;

    .line 1153
    return-object p1
.end method

.method private static b(Lo/fma;I)Lo/fma;
    .locals 1

    .line 915
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/flr;->e(I)Lo/flr;

    .line 916
    return-object p0
.end method

.method private k()Lo/fma;
    .locals 1

    .line 1121
    invoke-static {}, Lo/fma;->M()Lo/fma;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flh;->b(Lo/fma;)Lo/fma;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public declared-synchronized b()Lo/fmf;
    .locals 2

    monitor-enter p0

    .line 298
    :try_start_0
    iget-object v0, p0, Lo/flh;->g:Lo/fmf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public c()Ljava/lang/Long;
    .locals 1

    .line 154
    iget-object v0, p0, Lo/flh;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lo/flh;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/Long;)Lo/flh;
    .locals 0

    .line 186
    iput-object p1, p0, Lo/flh;->a:Ljava/lang/Long;

    .line 187
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/flh;
    .locals 0

    .line 206
    iput-object p1, p0, Lo/flh;->c:Ljava/lang/String;

    .line 207
    return-object p0
.end method

.method public d(Lo/fmf;)Lo/flh;
    .locals 5

    .line 311
    move-object v3, p0

    monitor-enter v3

    .line 312
    :try_start_0
    iput-object p1, p0, Lo/flh;->g:Lo/fmf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 313
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 314
    :goto_0
    invoke-interface {p1}, Lo/fmf;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    :try_start_1
    invoke-interface {p1}, Lo/fmf;->a()V

    .line 317
    sget-object v0, Lo/flh;->d:Lo/fty;

    const-string v1, "started set client endpoint {}"

    invoke-interface {p1}, Lo/fmf;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 320
    goto :goto_1

    .line 318
    :catch_0
    move-exception v3

    .line 319
    sget-object v0, Lo/flh;->d:Lo/fty;

    const-string v1, "could not set and start client endpoint"

    invoke-interface {v0, v1, v3}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    :cond_0
    :goto_1
    return-object p0
.end method

.method public d(Ljava/lang/String;I)Lo/flk;
    .locals 2

    .line 488
    invoke-direct {p0}, Lo/flh;->k()Lo/fma;

    move-result-object v0

    iget-object v1, p0, Lo/flh;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/fma;->c(Ljava/lang/String;)Lo/fma;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fma;->a(Ljava/lang/String;)Lo/fma;

    move-result-object v0

    invoke-static {v0, p2}, Lo/flh;->b(Lo/fma;I)Lo/fma;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flh;->a(Lo/fma;)Lo/flk;

    move-result-object v0

    return-object v0
.end method

.method protected d(Lo/fma;Lo/fmf;)Lo/fma;
    .locals 5

    .line 1060
    iget v0, p0, Lo/flh;->e:I

    if-eqz v0, :cond_0

    .line 1061
    invoke-virtual {p1}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    new-instance v1, Lo/fll;

    iget v2, p0, Lo/flh;->e:I

    invoke-static {v2}, Lo/fll;->d(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lo/fll;-><init>(IZI)V

    invoke-virtual {v0, v1}, Lo/flr;->e(Lo/fll;)Lo/flr;

    .line 1064
    :cond_0
    invoke-interface {p2, p1}, Lo/fmf;->a(Lo/fma;)V

    .line 1065
    return-object p1
.end method

.method public e()Lo/flk;
    .locals 2

    .line 440
    invoke-direct {p0}, Lo/flh;->a()Lo/fma;

    move-result-object v0

    iget-object v1, p0, Lo/flh;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/fma;->c(Ljava/lang/String;)Lo/fma;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flh;->a(Lo/fma;)Lo/flk;

    move-result-object v0

    return-object v0
.end method

.method protected e(Lo/fma;)Lo/fmf;
    .locals 3

    .line 1078
    invoke-virtual {p0}, Lo/flh;->b()Lo/fmf;

    move-result-object v2

    .line 1081
    if-eqz v2, :cond_0

    .line 1082
    return-object v2

    .line 1084
    :cond_0
    invoke-static {}, Lo/fmd;->d()Lo/fmd;

    move-result-object v0

    invoke-virtual {p1}, Lo/fma;->I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fmd;->e(Ljava/lang/String;)Lo/fmf;

    move-result-object v0

    return-object v0
.end method
