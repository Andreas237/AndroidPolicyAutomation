.class public final Lo/fpz$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fpz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private a:Lo/fpz;

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 433
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 434
    new-instance v0, Lo/fpz;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fpz;-><init>(Lo/fpz$2;)V

    iput-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    .line 435
    return-void
.end method

.method private b()V
    .locals 3

    .line 963
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->u(Lo/fpz;)Lo/fso;

    move-result-object v0

    if-nez v0, :cond_0

    .line 964
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PSK store must be set when support for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lo/fsf;->d:Lo/fsf;

    invoke-virtual {v2}, Lo/fsf;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is configured"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 967
    :cond_0
    return-void
.end method

.method private c()Z
    .locals 1

    .line 859
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->d(Lo/fpz;)Ljava/security/PrivateKey;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->b(Lo/fpz;)Ljava/security/PublicKey;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e()V
    .locals 2

    .line 970
    iget-boolean v0, p0, Lo/fpz$e;->e:Z

    if-nez v0, :cond_3

    .line 971
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->g()Ljava/security/PrivateKey;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-virtual {v0}, Lo/fpz;->o()Ljava/security/PublicKey;

    move-result-object v0

    if-nez v0, :cond_1

    .line 972
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Identity must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 973
    :cond_1
    const-string v0, "EC"

    iget-object v1, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v1}, Lo/fpz;->d(Lo/fpz;)Ljava/security/PrivateKey;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/PrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "EC"

    iget-object v1, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-virtual {v1}, Lo/fpz;->o()Ljava/security/PublicKey;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 976
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Keys must be ECDSA capable when support for an ECDHE_ECDSA based cipher suite is configured"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 980
    :cond_3
    return-void
.end method

.method private static e([Ljava/security/cert/Certificate;)[Ljava/security/cert/X509Certificate;
    .locals 7

    .line 772
    new-instance v2, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 773
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 774
    const-class v0, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 775
    move-object v0, v6

    check-cast v0, Ljava/security/cert/X509Certificate;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 777
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "can only process X.509 certificates"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 773
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 780
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    invoke-interface {v2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 985
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 986
    invoke-direct {p0}, Lo/fpz$e;->c()Z

    move-result v3

    .line 987
    if-nez v3, :cond_2

    iget-boolean v0, p0, Lo/fpz$e;->e:Z

    if-eqz v0, :cond_2

    .line 988
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->n(Lo/fpz;)Lo/fsq;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->a(Lo/fpz;)[Ljava/security/cert/X509Certificate;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->a(Lo/fpz;)[Ljava/security/cert/X509Certificate;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_1

    :cond_0
    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 992
    :cond_2
    :goto_0
    if-eqz v3, :cond_3

    .line 993
    sget-object v0, Lo/fsf;->a:Lo/fsf;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 994
    sget-object v0, Lo/fsf;->e:Lo/fsf;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 997
    :cond_3
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->u(Lo/fpz;)Lo/fso;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 998
    sget-object v0, Lo/fsf;->d:Lo/fsf;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 999
    sget-object v0, Lo/fsf;->c:Lo/fsf;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1002
    :cond_4
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/4 v1, 0x0

    new-array v1, v1, [Lo/fsf;

    invoke-interface {v2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lo/fsf;

    invoke-static {v0, v1}, Lo/fpz;->e(Lo/fpz;[Lo/fsf;)[Lo/fsf;

    .line 1003
    return-void
.end method


# virtual methods
.method public a()Lo/fpz$e;
    .locals 1

    .line 475
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fpz$e;->e:Z

    .line 476
    return-object p0
.end method

.method public a([Ljava/security/cert/Certificate;)Lo/fpz$e;
    .locals 2

    .line 751
    if-nez p1, :cond_0

    .line 752
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Trust store must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 754
    :cond_0
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {p1}, Lo/fpz$e;->e([Ljava/security/cert/Certificate;)[Ljava/security/cert/X509Certificate;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->b(Lo/fpz;[Ljava/security/cert/X509Certificate;)[Ljava/security/cert/X509Certificate;

    .line 755
    return-object p0
.end method

.method public b(Lo/fso;)Lo/fpz$e;
    .locals 1

    .line 656
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0, p1}, Lo/fpz;->d(Lo/fpz;Lo/fso;)Lo/fso;

    .line 657
    return-object p0
.end method

.method public c([Lo/fsf;)Lo/fpz$e;
    .locals 6

    .line 574
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 575
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Connector must support at least one cipher suite"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 577
    :cond_1
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 578
    sget-object v0, Lo/fsf;->b:Lo/fsf;

    invoke-virtual {v0, v5}, Lo/fsf;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 579
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "NULL Cipher Suite is not supported by connector"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 577
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 582
    :cond_3
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lo/fsf;

    invoke-static {v0, v1}, Lo/fpz;->e(Lo/fpz;[Lo/fsf;)[Lo/fsf;

    .line 583
    return-object p0
.end method

.method public d(Ljava/net/InetSocketAddress;)Lo/fpz$e;
    .locals 2

    .line 444
    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->isUnresolved()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Bind address must not be unresolved"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 447
    :cond_0
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0, p1}, Lo/fpz;->e(Lo/fpz;Ljava/net/InetSocketAddress;)Ljava/net/InetSocketAddress;

    .line 448
    return-object p0
.end method

.method public d()Lo/fpz;
    .locals 7

    .line 896
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->e(Lo/fpz;)Ljava/net/InetSocketAddress;

    move-result-object v0

    if-nez v0, :cond_0

    .line 897
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    new-instance v1, Ljava/net/InetSocketAddress;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/net/InetSocketAddress;-><init>(I)V

    invoke-static {v0, v1}, Lo/fpz;->e(Lo/fpz;Ljava/net/InetSocketAddress;)Ljava/net/InetSocketAddress;

    .line 899
    :cond_0
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->c(Lo/fpz;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_1

    .line 900
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->d(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 902
    :cond_1
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->a(Lo/fpz;)[Ljava/security/cert/X509Certificate;

    move-result-object v0

    if-nez v0, :cond_2

    .line 903
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/security/cert/X509Certificate;

    invoke-static {v0, v1}, Lo/fpz;->b(Lo/fpz;[Ljava/security/cert/X509Certificate;)[Ljava/security/cert/X509Certificate;

    .line 905
    :cond_2
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->h(Lo/fpz;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_3

    .line 906
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->c(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 908
    :cond_3
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->k(Lo/fpz;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_4

    .line 909
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/16 v1, 0x3e8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->a(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 911
    :cond_4
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->g(Lo/fpz;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_5

    .line 912
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->d(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 914
    :cond_5
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->f(Lo/fpz;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_6

    .line 915
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->a(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 917
    :cond_6
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->i(Lo/fpz;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_7

    .line 918
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->b(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    .line 920
    :cond_7
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->l(Lo/fpz;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_8

    .line 921
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const v1, 0x186a0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->c(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 923
    :cond_8
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->p(Lo/fpz;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_9

    .line 924
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const v1, 0x249f0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->b(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 926
    :cond_9
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->m(Lo/fpz;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_a

    .line 927
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    const-wide/16 v1, 0x708

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fpz;->e(Lo/fpz;Ljava/lang/Long;)Ljava/lang/Long;

    .line 929
    :cond_a
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->o(Lo/fpz;)[Lo/fsf;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->o(Lo/fpz;)[Lo/fsf;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_c

    .line 930
    :cond_b
    invoke-direct {p0}, Lo/fpz$e;->f()V

    .line 932
    :cond_c
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->n(Lo/fpz;)Lo/fsq;

    move-result-object v0

    if-nez v0, :cond_d

    .line 936
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    new-instance v1, Lo/fsn;

    invoke-direct {v1}, Lo/fsn;-><init>()V

    invoke-static {v0, v1}, Lo/fpz;->a(Lo/fpz;Lo/fsq;)Lo/fsq;

    .line 940
    :cond_d
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->o(Lo/fpz;)[Lo/fsf;

    move-result-object v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->o(Lo/fpz;)[Lo/fsf;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_f

    .line 941
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Supported cipher suites must be set either explicitly or implicitly by means of setting the identity or PSK store"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 944
    :cond_f
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    invoke-static {v0}, Lo/fpz;->o(Lo/fpz;)[Lo/fsf;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_10

    aget-object v6, v3, v5

    .line 945
    sget-object v0, Lo/fpz$2;->e:[I

    invoke-virtual {v6}, Lo/fsf;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 948
    :pswitch_0
    invoke-direct {p0}, Lo/fpz$e;->b()V

    .line 949
    goto :goto_1

    .line 952
    :pswitch_1
    invoke-direct {p0}, Lo/fpz$e;->e()V

    .line 944
    .line 953
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 959
    :cond_10
    iget-object v0, p0, Lo/fpz$e;->a:Lo/fpz;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
