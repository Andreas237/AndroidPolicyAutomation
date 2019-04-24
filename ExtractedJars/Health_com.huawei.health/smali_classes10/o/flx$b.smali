.class Lo/flx$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fpg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/flx;


# direct methods
.method private constructor <init>(Lo/flx;)V
    .locals 0

    .line 755
    iput-object p1, p0, Lo/flx$b;->d:Lo/flx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/flx;Lo/flx$1;)V
    .locals 0

    .line 755
    invoke-direct {p0, p1}, Lo/flx$b;-><init>(Lo/flx;)V

    return-void
.end method

.method private a(Lo/fly;Lo/fpd;)V
    .locals 5

    .line 871
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->c(Lo/flx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fnj;

    .line 872
    invoke-interface {v4, p1}, Lo/fnj;->b(Lo/fly;)V

    .line 873
    goto :goto_0

    .line 876
    :cond_0
    invoke-virtual {p1}, Lo/fly;->y()Z

    move-result v0

    if-nez v0, :cond_2

    .line 877
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->d(Lo/flx;)Lo/fmo;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fmo;->a(Lo/fly;)Lo/fmb;

    move-result-object v3

    .line 878
    if-eqz v3, :cond_1

    .line 879
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-virtual {v3, v0}, Lo/fmb;->e(Lo/fmf;)V

    .line 880
    invoke-virtual {v3}, Lo/fmb;->p()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lo/fly;->d(J)V

    .line 881
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->a(Lo/flx;)Lo/fnw;

    move-result-object v0

    invoke-interface {v0, v3, p1}, Lo/fnw;->a(Lo/fmb;Lo/fly;)V

    goto :goto_1

    .line 882
    :cond_1
    invoke-virtual {p1}, Lo/fly;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->d:Lo/flj$e;

    if-eq v0, v1, :cond_2

    .line 883
    invoke-static {}, Lo/flx;->h()Lo/fty;

    move-result-object v0

    const-string v1, "rejecting unmatchable response from {}"

    invoke-virtual {p2}, Lo/fpd;->h()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 884
    invoke-direct {p0, p1}, Lo/flx$b;->d(Lo/flq;)V

    .line 887
    :cond_2
    :goto_1
    return-void
.end method

.method private a(Lo/fpd;)V
    .locals 7

    .line 785
    const/4 v5, 0x0

    .line 788
    :try_start_0
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->f(Lo/flx;)Lo/fnh;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fnh;->a(Lo/fpd;)Lo/flq;

    move-result-object v5

    .line 790
    invoke-virtual {v5}, Lo/flq;->e()I

    move-result v0

    invoke-static {v0}, Lo/flj;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 792
    move-object v0, v5

    check-cast v0, Lo/fma;

    invoke-direct {p0, v0, p1}, Lo/flx$b;->c(Lo/fma;Lo/fpd;)V

    goto :goto_0

    .line 794
    :cond_0
    invoke-virtual {v5}, Lo/flq;->e()I

    move-result v0

    invoke-static {v0}, Lo/flj;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 796
    move-object v0, v5

    check-cast v0, Lo/fly;

    invoke-direct {p0, v0, p1}, Lo/flx$b;->a(Lo/fly;Lo/fpd;)V

    goto :goto_0

    .line 798
    :cond_1
    invoke-virtual {v5}, Lo/flq;->e()I

    move-result v0

    invoke-static {v0}, Lo/flj;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 800
    move-object v0, v5

    check-cast v0, Lo/flo;

    invoke-direct {p0, v0, p1}, Lo/flx$b;->b(Lo/flo;Lo/fpd;)V

    goto :goto_0

    .line 803
    :cond_2
    invoke-static {}, Lo/flx;->h()Lo/fty;

    move-result-object v0

    const-string v1, "silently ignoring non-CoAP message from {}"

    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/fln; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lo/flm; {:try_start_0 .. :try_end_0} :catch_1

    .line 822
    :goto_0
    goto :goto_2

    .line 806
    :catch_0
    move-exception v6

    .line 808
    invoke-virtual {v6}, Lo/fln;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v6}, Lo/fln;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 811
    invoke-direct {p0, p1, v6}, Lo/flx$b;->e(Lo/fpd;Lo/fln;)V

    .line 812
    invoke-static {}, Lo/flx;->h()Lo/fty;

    move-result-object v0

    const-string v1, "rejected malformed message from [{}], reason: {}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v6}, Lo/fln;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 816
    :cond_3
    invoke-static {}, Lo/flx;->h()Lo/fty;

    move-result-object v0

    const-string v1, "discarding malformed message from [{}]"

    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 822
    :goto_1
    goto :goto_2

    .line 818
    :catch_1
    move-exception v6

    .line 821
    invoke-static {}, Lo/flx;->h()Lo/fty;

    move-result-object v0

    const-string v1, "discarding malformed message from [{}]"

    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 823
    :goto_2
    return-void
.end method

.method private b(Lo/flo;Lo/fpd;)V
    .locals 5

    .line 896
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->c(Lo/flx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fnj;

    .line 897
    invoke-interface {v4, p1}, Lo/fnj;->e(Lo/flo;)V

    .line 898
    goto :goto_0

    .line 901
    :cond_0
    invoke-virtual {p1}, Lo/flo;->y()Z

    move-result v0

    if-nez v0, :cond_3

    .line 903
    invoke-virtual {p1}, Lo/flo;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lo/flo;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->e:Lo/flj$e;

    if-ne v0, v1, :cond_2

    .line 904
    :cond_1
    invoke-static {}, Lo/flx;->h()Lo/fty;

    move-result-object v0

    const-string v1, "responding to ping from {}"

    invoke-virtual {p2}, Lo/fpd;->h()Lo/fow;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 905
    invoke-direct {p0, p1}, Lo/flx$b;->d(Lo/flq;)V

    goto :goto_1

    .line 907
    :cond_2
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->d(Lo/flx;)Lo/fmo;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fmo;->b(Lo/flo;)Lo/fmb;

    move-result-object v3

    .line 908
    if-eqz v3, :cond_3

    .line 909
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-virtual {v3, v0}, Lo/fmb;->e(Lo/fmf;)V

    .line 910
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->a(Lo/flx;)Lo/fnw;

    move-result-object v0

    invoke-interface {v0, v3, p1}, Lo/fnw;->d(Lo/fmb;Lo/flo;)V

    .line 914
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/flx$b;Lo/fpd;)V
    .locals 0

    .line 755
    invoke-direct {p0, p1}, Lo/flx$b;->a(Lo/fpd;)V

    return-void
.end method

.method private c(Lo/fma;Lo/fpd;)V
    .locals 3

    .line 843
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->i(Lo/flx;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/fma;->b(Ljava/lang/String;)V

    .line 850
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->c(Lo/flx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fnj;

    .line 851
    invoke-interface {v2, p1}, Lo/fnj;->b(Lo/fma;)V

    .line 852
    goto :goto_0

    .line 855
    :cond_0
    invoke-virtual {p1}, Lo/fma;->y()Z

    move-result v0

    if-nez v0, :cond_1

    .line 856
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->d(Lo/flx;)Lo/fmo;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/fmo;->b(Lo/fma;)Lo/fmb;

    move-result-object v1

    .line 857
    if-eqz v1, :cond_1

    .line 858
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-virtual {v1, v0}, Lo/fmb;->e(Lo/fmf;)V

    .line 859
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->a(Lo/flx;)Lo/fnw;

    move-result-object v0

    invoke-interface {v0, v1, p1}, Lo/fnw;->e(Lo/fmb;Lo/fma;)V

    .line 862
    :cond_1
    return-void
.end method

.method private d(Lo/flq;)V
    .locals 3

    .line 836
    invoke-static {p1}, Lo/flo;->d(Lo/flq;)Lo/flo;

    move-result-object v2

    .line 837
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->a(Lo/flx;)Lo/fnw;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, v2}, Lo/fnw;->b(Lo/fmb;Lo/flo;)V

    .line 838
    return-void
.end method

.method private e(Lo/fpd;Lo/fln;)V
    .locals 3

    .line 828
    new-instance v2, Lo/flo;

    sget-object v0, Lo/flj$e;->b:Lo/flj$e;

    invoke-direct {v2, v0}, Lo/flo;-><init>(Lo/flj$e;)V

    .line 829
    invoke-virtual {p2}, Lo/fln;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Lo/flo;->d(I)Lo/flq;

    .line 830
    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/flo;->d(Lo/fow;)Lo/flq;

    .line 832
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    invoke-static {v0}, Lo/flx;->a(Lo/flx;)Lo/fnw;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1, v2}, Lo/fnw;->b(Lo/fmb;Lo/flo;)V

    .line 833
    return-void
.end method


# virtual methods
.method public c(Lo/fpd;)V
    .locals 2

    .line 759
    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    if-nez v0, :cond_0

    .line 760
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "received message that does not have a endpoint context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 761
    :cond_0
    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    if-nez v0, :cond_1

    .line 762
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "received message that does not have a source address"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 763
    :cond_1
    invoke-virtual {p1}, Lo/fpd;->h()Lo/fow;

    move-result-object v0

    invoke-interface {v0}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    if-nez v0, :cond_2

    .line 764
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "received message that does not have a source port"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 768
    :cond_2
    iget-object v0, p0, Lo/flx$b;->d:Lo/flx;

    new-instance v1, Lo/flx$b$5;

    invoke-direct {v1, p0, p1}, Lo/flx$b$5;-><init>(Lo/flx$b;Lo/fpd;)V

    invoke-static {v0, v1}, Lo/flx;->a(Lo/flx;Ljava/lang/Runnable;)V

    .line 775
    return-void
.end method
