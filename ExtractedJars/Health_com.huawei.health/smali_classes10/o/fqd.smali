.class public final Lo/fqd;
.super Lo/fqy;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fqd$e;
    }
.end annotation


# static fields
.field private static final e:Lo/fty;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fqd$e;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fse;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljavax/security/auth/x500/X500Principal;>;"
        }
    .end annotation
.end field

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const-class v0, Lo/fqd;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqd;->e:Lo/fty;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;)V
    .locals 1

    .line 95
    invoke-direct {p0, p1}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqd;->c:Ljava/util/List;

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lo/fqd;->d:I

    .line 96
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/net/InetSocketAddress;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fqd$e;>;Ljava/util/List<Lo/fse;>;Ljava/util/List<Ljavax/security/auth/x500/X500Principal;>;Ljava/net/InetSocketAddress;)V"
        }
    .end annotation

    .line 114
    invoke-direct {p0, p4}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqd;->c:Ljava/util/List;

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lo/fqd;->d:I

    .line 115
    if-eqz p1, :cond_0

    .line 116
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 118
    :cond_0
    if-eqz p2, :cond_1

    .line 119
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 121
    :cond_1
    if-eqz p3, :cond_2

    .line 122
    invoke-direct {p0, p3}, Lo/fqd;->b(Ljava/util/List;)Z

    .line 124
    :cond_2
    return-void
.end method

.method private b(Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljavax/security/auth/x500/X500Principal;>;)Z"
        }
    .end annotation

    .line 373
    const/4 v5, 0x0

    .line 374
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljavax/security/auth/x500/X500Principal;

    .line 375
    invoke-virtual {p0, v7}, Lo/fqd;->e(Ljavax/security/auth/x500/X500Principal;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 376
    sget-object v0, Lo/fqd;->e:Lo/fty;

    const-string v1, "could add only {} of {} certificate authorities, max length exceeded"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    const/4 v0, 0x0

    return v0

    .line 380
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 382
    goto :goto_0

    .line 383
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static e([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 10

    .line 207
    new-instance v3, Lo/fpq;

    invoke-direct {v3, p0}, Lo/fpq;-><init>([B)V

    .line 209
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Lo/fpq;->c(I)I

    move-result v4

    .line 210
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 211
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    .line 212
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Lo/fpq;->c(I)I

    move-result v7

    .line 213
    invoke-static {v7}, Lo/fqd$e;->e(I)Lo/fqd$e;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 216
    :cond_0
    const/16 v0, 0x10

    invoke-virtual {v3, v0}, Lo/fpq;->c(I)I

    move-result v4

    .line 217
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 218
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v4, :cond_1

    .line 219
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 220
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Lo/fpq;->c(I)I

    move-result v9

    .line 221
    new-instance v0, Lo/fse;

    invoke-static {v8}, Lo/fse$b;->d(I)Lo/fse$b;

    move-result-object v1

    invoke-static {v9}, Lo/fse$a;->c(I)Lo/fse$a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/fse;-><init>(Lo/fse$b;Lo/fse$a;)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    add-int/lit8 v7, v7, 0x2

    goto :goto_1

    .line 225
    :cond_1
    const/16 v0, 0x10

    invoke-virtual {v3, v0}, Lo/fpq;->c(I)I

    move-result v4

    .line 226
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 227
    :goto_2
    if-lez v4, :cond_2

    .line 228
    const/16 v0, 0x10

    invoke-virtual {v3, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 229
    invoke-virtual {v3, v8}, Lo/fpq;->d(I)[B

    move-result-object v9

    .line 230
    new-instance v0, Ljavax/security/auth/x500/X500Principal;

    invoke-direct {v0, v9}, Ljavax/security/auth/x500/X500Principal;-><init>([B)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    array-length v0, v9

    add-int/lit8 v0, v0, 0x2

    sub-int/2addr v4, v0

    .line 233
    goto :goto_2

    .line 235
    :cond_2
    new-instance v0, Lo/fqd;

    invoke-direct {v0, v5, v6, v7, p1}, Lo/fqd;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public a(Lo/fse;)V
    .locals 1

    .line 343
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 344
    return-void
.end method

.method public a([Ljava/security/cert/X509Certificate;)[Ljava/security/cert/X509Certificate;
    .locals 3

    .line 546
    if-nez p1, :cond_0

    .line 547
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "certificate chain must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 548
    :cond_0
    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 549
    const/4 v2, 0x1

    .line 550
    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_2

    .line 551
    iget-object v0, p0, Lo/fqd;->c:Ljava/util/List;

    aget-object v1, p1, v2

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 552
    goto :goto_1

    .line 550
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 555
    :cond_2
    :goto_1
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/cert/X509Certificate;

    return-object v0

    .line 557
    :cond_3
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method b(Ljava/security/PublicKey;)Lo/fse;
    .locals 4

    .line 524
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fse;

    .line 526
    :try_start_0
    invoke-virtual {v2}, Lo/fse;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v3

    .line 527
    invoke-virtual {v3, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    .line 528
    return-object v2

    .line 529
    :catch_0
    move-exception v3

    .line 532
    goto :goto_0

    .line 533
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method b([Ljava/security/cert/X509Certificate;)Z
    .locals 7

    .line 502
    const/4 v2, 0x0

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_3

    .line 503
    aget-object v3, p1, v2

    .line 504
    const/4 v4, 0x0

    .line 505
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fse;

    .line 508
    invoke-virtual {v6}, Lo/fse;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/security/cert/X509Certificate;->getSigAlgName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 509
    const/4 v4, 0x1

    .line 510
    goto :goto_2

    .line 512
    :cond_0
    goto :goto_1

    .line 513
    :cond_1
    :goto_2
    if-nez v4, :cond_2

    .line 514
    sget-object v0, Lo/fqd;->e:Lo/fty;

    const-string v1, "certificate chain is NOT signed with supported algorithm(s)"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 515
    const/4 v0, 0x0

    return v0

    .line 502
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 518
    :cond_3
    sget-object v0, Lo/fqd;->e:Lo/fty;

    const-string v1, "certificate chain is signed with supported algorithm(s)"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 519
    const/4 v0, 0x1

    return v0
.end method

.method public c()Lo/fra;
    .locals 1

    .line 130
    sget-object v0, Lo/fra;->k:Lo/fra;

    return-object v0
.end method

.method public c([Ljava/security/cert/X509Certificate;)Lo/fse;
    .locals 1

    .line 485
    invoke-virtual {p0, p1}, Lo/fqd;->b([Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-virtual {p0, v0}, Lo/fqd;->e(Ljava/security/cert/X509Certificate;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 487
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/fqd;->b(Ljava/security/PublicKey;)Lo/fse;

    move-result-object v0

    return-object v0

    .line 490
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method c(Ljava/security/PublicKey;)Z
    .locals 3

    .line 428
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fqd$e;

    .line 429
    invoke-interface {p1}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fqd$e;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    const/4 v0, 0x1

    return v0

    .line 432
    :cond_0
    goto :goto_0

    .line 433
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 3

    .line 139
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/fqd;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public d(Ljava/security/PublicKey;)Lo/fse;
    .locals 1

    .line 468
    invoke-virtual {p0, p1}, Lo/fqd;->c(Ljava/security/PublicKey;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 469
    invoke-virtual {p0, p1}, Lo/fqd;->b(Ljava/security/PublicKey;)Lo/fse;

    move-result-object v0

    return-object v0

    .line 471
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lo/fqd$e;)V
    .locals 1

    .line 331
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    return-void
.end method

.method e(Ljava/security/cert/X509Certificate;)Z
    .locals 9

    .line 444
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fqd$e;

    .line 445
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fqd$e;->d(Ljava/lang/String;)Z

    move-result v7

    .line 446
    invoke-virtual {v6}, Lo/fqd$e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Lo/fqd$e;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_1

    :cond_0
    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    .line 448
    :goto_1
    sget-object v0, Lo/fqd;->e:Lo/fty;

    const-string v1, "type: {}, isCompatibleWithKeyAlgorithm[{}]: {}, meetsSigningRequirements: {}"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    invoke-interface {v3}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    if-eqz v7, :cond_2

    if-eqz v8, :cond_2

    .line 451
    const/4 v0, 0x1

    return v0

    .line 453
    :cond_2
    goto/16 :goto_0

    .line 454
    :cond_3
    sget-object v0, Lo/fqd;->e:Lo/fty;

    const-string v1, "certificate [{}] is not of any supported type"

    invoke-interface {v0, v1, p1}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 455
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljavax/security/auth/x500/X500Principal;)Z
    .locals 3

    .line 357
    if-nez p1, :cond_0

    .line 358
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "authority must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 360
    :cond_0
    invoke-virtual {p1}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v2, v0, 0x2

    .line 362
    iget v0, p0, Lo/fqd;->d:I

    add-int/2addr v0, v2

    const v1, 0xffff

    if-gt v0, v1, :cond_1

    .line 363
    iget-object v0, p0, Lo/fqd;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 364
    iget v0, p0, Lo/fqd;->d:I

    add-int/2addr v0, v2

    iput v0, p0, Lo/fqd;->d:I

    .line 365
    const/4 v0, 0x1

    return v0

    .line 367
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e([Ljava/security/cert/X509Certificate;)Z
    .locals 10

    .line 397
    if-eqz p1, :cond_1

    .line 398
    const/4 v5, 0x0

    .line 399
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 400
    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/fqd;->e(Ljavax/security/auth/x500/X500Principal;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 401
    sget-object v0, Lo/fqd;->e:Lo/fty;

    const-string v1, "could add only {} of {} certificate authorities, max length exceeded"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    array-length v3, p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    const/4 v0, 0x0

    return v0

    .line 405
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 399
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 409
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public g()[B
    .locals 6

    .line 175
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 177
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 178
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fqd$e;

    .line 179
    invoke-virtual {v4}, Lo/fqd$e;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 180
    goto :goto_0

    .line 182
    :cond_0
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 183
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fse;

    .line 184
    invoke-virtual {v4}, Lo/fse;->a()Lo/fse$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/fse$b;->c()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 185
    invoke-virtual {v4}, Lo/fse;->c()Lo/fse$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/fse$a;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 186
    goto :goto_1

    .line 188
    :cond_1
    iget v0, p0, Lo/fqd;->d:I

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 189
    iget-object v0, p0, Lo/fqd;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/security/auth/x500/X500Principal;

    .line 191
    invoke-virtual {v4}, Ljavax/security/auth/x500/X500Principal;->getEncoded()[B

    move-result-object v5

    .line 192
    array-length v0, v5

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 193
    invoke-virtual {v2, v5}, Lo/fpp;->e([B)V

    .line 194
    goto :goto_2

    .line 196
    :cond_2
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lo/fqy;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    const-string v0, "\t\tClient certificate type:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    iget-object v0, p0, Lo/fqd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fqd$e;

    .line 153
    const-string v0, "\t\t\t"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 157
    const-string v0, "\t\tSignature and hash algorithm:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    iget-object v0, p0, Lo/fqd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fse;

    .line 159
    const-string v0, "\t\t\t"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/fse;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    goto :goto_1

    .line 162
    :cond_1
    iget-object v0, p0, Lo/fqd;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 163
    const-string v0, "\t\tCertificate authorities:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    iget-object v0, p0, Lo/fqd;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/security/auth/x500/X500Principal;

    .line 165
    const-string v0, "\t\t\t"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    goto :goto_2

    .line 168
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
