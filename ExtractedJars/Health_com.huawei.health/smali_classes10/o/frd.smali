.class public abstract Lo/frd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/frd$1;,
        Lo/frd$c;
    }
.end annotation


# static fields
.field private static final e:Lo/fty;


# instance fields
.field protected A:[B

.field protected B:Lo/frd$c;

.field protected C:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/SortedSet<Lo/fqz;>;>;"
        }
    .end annotation
.end field

.field protected D:Ljava/security/MessageDigest;

.field protected F:Ljava/security/PrivateKey;

.field protected G:[Ljava/security/cert/X509Certificate;

.field protected I:Ljava/security/PublicKey;

.field private a:Ljavax/crypto/spec/IvParameterSpec;

.field private b:[B

.field private c:Ljavax/crypto/SecretKey;

.field private d:Ljavax/crypto/SecretKey;

.field private f:Ljavax/crypto/SecretKey;

.field private g:Ljavax/crypto/spec/IvParameterSpec;

.field private h:I

.field private i:Ljavax/crypto/SecretKey;

.field protected final j:Lo/fsq;

.field private k:I

.field private m:Z

.field private n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/fsb;>;"
        }
    .end annotation
.end field

.field protected q:Lo/fro;

.field protected final r:Z

.field protected s:Lo/frn;

.field protected t:I

.field protected v:Lo/fro;

.field protected final w:Lo/fqr;

.field protected x:Lo/fsi;

.field protected final y:Lo/frm;

.field protected final z:[Ljava/security/cert/X509Certificate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 87
    const-class v0, Lo/frd;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/frd;->e:Lo/fty;

    return-void
.end method

.method protected constructor <init>(ZILo/fqr;Lo/frm;Lo/fsb;[Ljava/security/cert/X509Certificate;ILo/fsq;)V
    .locals 6

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    const/4 v0, -0x1

    iput v0, p0, Lo/frd;->t:I

    .line 127
    const/4 v0, 0x0

    iput v0, p0, Lo/frd;->k:I

    .line 130
    const/4 v0, 0x0

    iput v0, p0, Lo/frd;->h:I

    .line 136
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/frd;->C:Ljava/util/Map;

    .line 145
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/frd;->A:[B

    .line 156
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lo/frd;->n:Ljava/util/Set;

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/frd;->m:Z

    .line 218
    if-nez p3, :cond_0

    .line 219
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "DTLS Session must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_0
    if-nez p4, :cond_1

    .line 221
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Record layer must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 222
    :cond_1
    if-gez p2, :cond_2

    .line 223
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Initial message sequence number must not be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 225
    :cond_2
    iput-boolean p1, p0, Lo/frd;->r:Z

    .line 226
    iput p2, p0, Lo/frd;->k:I

    .line 227
    iput p2, p0, Lo/frd;->h:I

    .line 228
    iput-object p3, p0, Lo/frd;->w:Lo/fqr;

    .line 229
    iput-object p4, p0, Lo/frd;->y:Lo/frm;

    .line 230
    invoke-virtual {p0, p5}, Lo/frd;->a(Lo/fsb;)V

    .line 231
    if-nez p6, :cond_3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    goto :goto_0

    :cond_3
    move-object v0, p6

    :goto_0
    iput-object v0, p0, Lo/frd;->z:[Ljava/security/cert/X509Certificate;

    .line 232
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0, p7}, Lo/fqr;->c(I)V

    .line 233
    new-instance v0, Lo/frd$c;

    invoke-direct {v0, p0}, Lo/frd$c;-><init>(Lo/frd;)V

    iput-object v0, p0, Lo/frd;->B:Lo/frd$c;

    .line 236
    const-string v0, "SHA-256"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iput-object v0, p0, Lo/frd;->D:Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    goto :goto_1

    .line 237
    :catch_0
    move-exception v5

    .line 240
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Message digest algorithm %s is not available on JVM"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "SHA-256"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :goto_1
    iput-object p8, p0, Lo/frd;->j:Lo/fsq;

    .line 244
    return-void
.end method

.method protected constructor <init>(ZLo/fqr;Lo/frm;Lo/fsb;[Ljava/security/cert/X509Certificate;ILo/fsq;)V
    .locals 9

    .line 184
    move-object v0, p0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v8}, Lo/frd;-><init>(ZILo/fqr;Lo/frm;Lo/fsb;[Ljava/security/cert/X509Certificate;ILo/fsq;)V

    .line 185
    return-void
.end method

.method static synthetic b(Lo/frd;)I
    .locals 1

    .line 84
    iget v0, p0, Lo/frd;->h:I

    return v0
.end method

.method private b(Lo/fqy;)V
    .locals 2

    .line 858
    iget v0, p0, Lo/frd;->k:I

    invoke-virtual {p1, v0}, Lo/fqy;->a(I)V

    .line 859
    iget v0, p0, Lo/frd;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/frd;->k:I

    .line 860
    return-void
.end method

.method private final c(ILjava/util/SortedSet;ILo/fra;Lo/fqr;)Lo/fqy;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/SortedSet<Lo/fqz;>;ILo/fra;Lo/fqr;)Lo/fqy;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 749
    const/4 v7, 0x0

    .line 751
    const/4 v0, 0x0

    new-array v8, v0, [B

    .line 752
    const/4 v9, 0x0

    .line 753
    invoke-interface/range {p2 .. p2}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/fqz;

    .line 755
    invoke-virtual {v11}, Lo/fqz;->q()I

    move-result v12

    .line 756
    invoke-virtual {v11}, Lo/fqz;->x()I

    move-result v13

    .line 758
    if-ne v12, v9, :cond_0

    .line 760
    invoke-virtual {v11}, Lo/fqz;->g()[B

    move-result-object v0

    invoke-static {v8, v0}, Lo/fsp;->c([B[B)[B

    move-result-object v8

    .line 761
    array-length v9, v8

    goto :goto_1

    .line 762
    :cond_0
    if-ge v12, v9, :cond_1

    add-int v0, v12, v13

    if-le v0, v9, :cond_1

    .line 766
    sub-int v14, v9, v12

    .line 767
    sub-int v15, v13, v14

    .line 768
    new-array v0, v15, [B

    move-object/from16 v16, v0

    .line 770
    invoke-virtual {v11}, Lo/fqz;->g()[B

    move-result-object v0

    move-object/from16 v1, v16

    const/4 v2, 0x0

    invoke-static {v0, v14, v1, v2, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 771
    move-object/from16 v0, v16

    invoke-static {v8, v0}, Lo/fsp;->c([B[B)[B

    move-result-object v8

    .line 773
    array-length v9, v8

    .line 775
    :cond_1
    :goto_1
    goto/16 :goto_0

    .line 777
    :cond_2
    array-length v0, v8

    move/from16 v1, p3

    if-ne v0, v1, :cond_4

    .line 779
    new-instance v0, Lo/fqz;

    move-object/from16 v1, p4

    move/from16 v2, p3

    move/from16 v3, p1

    move-object v5, v8

    invoke-virtual/range {p0 .. p0}, Lo/frd;->i()Ljava/net/InetSocketAddress;

    move-result-object v6

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lo/fqz;-><init>(Lo/fra;III[BLjava/net/InetSocketAddress;)V

    move-object v10, v0

    .line 781
    invoke-virtual {v10}, Lo/fqz;->a()[B

    move-result-object v8

    .line 783
    sget-object v11, Lo/fsf$a;->c:Lo/fsf$a;

    .line 784
    const/4 v12, 0x0

    .line 785
    if-eqz p5, :cond_3

    .line 786
    invoke-virtual/range {p5 .. p5}, Lo/fqr;->m()Lo/fsf$a;

    move-result-object v11

    .line 787
    invoke-virtual/range {p5 .. p5}, Lo/fqr;->s()Z

    move-result v12

    .line 789
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lo/frd;->i()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v8, v11, v12, v0}, Lo/fqy;->b([BLo/fsf$a;ZLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v7

    .line 792
    :cond_4
    return-object v7
.end method

.method private d(Lo/fqy;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fqy;)Ljava/util/List<Lo/frl;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 635
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/frd;->b(Lo/fqy;)V

    .line 636
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 637
    invoke-virtual/range {p1 .. p1}, Lo/fqy;->g()[B

    move-result-object v8

    .line 639
    array-length v0, v8

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->n()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 640
    new-instance v0, Lo/frl;

    sget-object v1, Lo/fqn;->a:Lo/fqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->i()I

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->g()J

    move-result-wide v3

    move-object/from16 v5, p0

    iget-object v6, v5, Lo/frd;->w:Lo/fqr;

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v6}, Lo/frl;-><init>(Lo/fqn;IJLo/fqm;Lo/fqr;)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 643
    :cond_0
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Splitting up {} message for [{}] into multiple fragments of max {} bytes"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lo/fqy;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual/range {p1 .. p1}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->n()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    invoke-virtual/range {p1 .. p1}, Lo/fqy;->s()I

    move-result v9

    .line 649
    array-length v0, v8

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->n()I

    move-result v1

    div-int/2addr v0, v1

    add-int/lit8 v10, v0, 0x1

    .line 650
    const/4 v11, 0x0

    .line 651
    const/4 v12, 0x0

    :goto_0
    if-ge v12, v10, :cond_2

    .line 652
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->n()I

    move-result v13

    .line 653
    add-int v0, v11, v13

    array-length v1, v8

    if-le v0, v1, :cond_1

    .line 655
    array-length v0, v8

    sub-int v13, v0, v11

    .line 657
    :cond_1
    new-array v14, v13, [B

    .line 658
    const/4 v0, 0x0

    invoke-static {v8, v11, v14, v0, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 660
    new-instance v0, Lo/fqz;

    move-object v1, v14

    invoke-virtual/range {p1 .. p1}, Lo/fqy;->c()Lo/fra;

    move-result-object v2

    move v3, v11

    array-length v4, v8

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v5}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/fqz;-><init>([BLo/fra;IILjava/net/InetSocketAddress;)V

    move-object v15, v0

    .line 669
    invoke-virtual {v15, v9}, Lo/fqz;->a(I)V

    .line 670
    array-length v0, v14

    add-int/2addr v11, v0

    .line 672
    new-instance v0, Lo/frl;

    sget-object v1, Lo/fqn;->a:Lo/fqn;

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->i()I

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->g()J

    move-result-wide v3

    move-object/from16 v5, p0

    iget-object v6, v5, Lo/frd;->w:Lo/fqr;

    move-object v5, v15

    invoke-direct/range {v0 .. v6}, Lo/frl;-><init>(Lo/fqn;IJLo/fqm;Lo/fqr;)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 651
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 675
    :cond_2
    :goto_1
    return-object v7
.end method

.method private static d([Ljava/security/cert/X509Certificate;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/security/cert/X509Certificate;)Ljava/util/Set<Ljava/security/cert/TrustAnchor;>;"
        }
    .end annotation

    .line 956
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 957
    if-eqz p0, :cond_0

    .line 958
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    .line 959
    new-instance v0, Ljava/security/cert/TrustAnchor;

    const/4 v1, 0x0

    invoke-direct {v0, v6, v1}, Ljava/security/cert/TrustAnchor;-><init>(Ljava/security/cert/X509Certificate;[B)V

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 958
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 962
    :cond_0
    return-object v2
.end method

.method private e([B)[B
    .locals 3

    .line 548
    iget-object v0, p0, Lo/frd;->q:Lo/fro;

    invoke-virtual {v0}, Lo/fro;->b()[B

    move-result-object v0

    iget-object v1, p0, Lo/frd;->v:Lo/fro;

    invoke-virtual {v1}, Lo/fro;->b()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v2

    .line 549
    sget-object v0, Lo/fsm$e;->a:Lo/fsm$e;

    invoke-static {p1, v0, v2}, Lo/fsm;->b([BLo/fsm$e;[B)[B

    move-result-object v0

    return-object v0
.end method

.method static synthetic o()Lo/fty;
    .locals 1

    .line 84
    sget-object v0, Lo/frd;->e:Lo/fty;

    return-object v0
.end method


# virtual methods
.method protected final a()Lo/fsf$a;
    .locals 1

    .line 798
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->m()Lo/fsf$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lo/fqc;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 985
    invoke-virtual {p1}, Lo/fqc;->f()Ljava/security/cert/CertPath;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 987
    iget-object v0, p0, Lo/frd;->z:[Ljava/security/cert/X509Certificate;

    invoke-static {v0}, Lo/frd;->d([Ljava/security/cert/X509Certificate;)Ljava/util/Set;

    move-result-object v3

    .line 990
    :try_start_0
    new-instance v4, Ljava/security/cert/PKIXParameters;

    invoke-direct {v4, v3}, Ljava/security/cert/PKIXParameters;-><init>(Ljava/util/Set;)V

    .line 992
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/security/cert/PKIXParameters;->setRevocationEnabled(Z)V

    .line 994
    const-string v0, "PKIX"

    invoke-static {v0}, Ljava/security/cert/CertPathValidator;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertPathValidator;

    move-result-object v5

    .line 995
    invoke-virtual {p1}, Lo/fqc;->f()Ljava/security/cert/CertPath;

    move-result-object v0

    invoke-virtual {v5, v0, v4}, Ljava/security/cert/CertPathValidator;->validate(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1006
    goto :goto_1

    .line 997
    :catch_0
    move-exception v4

    .line 998
    sget-object v0, Lo/frd;->e:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 999
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Certificate validation failed"

    invoke-interface {v0, v1, v4}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1000
    :cond_0
    sget-object v0, Lo/frd;->e:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1001
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Certificate validation failed due to {}"

    invoke-virtual {v4}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1003
    :cond_1
    :goto_0
    new-instance v5, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->i:Lo/fqb$b;

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 1005
    new-instance v0, Lo/fqx;

    const-string v1, "Certificate chain could not be validated"

    invoke-direct {v0, v1, v5}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 1007
    :goto_1
    goto :goto_2

    .line 1008
    :cond_2
    new-instance v3, Lo/fpv;

    invoke-virtual {p1}, Lo/fqc;->h()Ljava/security/PublicKey;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/fpv;-><init>(Ljava/security/PublicKey;)V

    .line 1009
    iget-object v0, p0, Lo/frd;->j:Lo/fsq;

    invoke-interface {v0, v3}, Lo/fsq;->b(Lo/fpv;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1010
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Certificate validation failed: Raw public key is not trusted"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 1011
    new-instance v4, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->i:Lo/fqb$b;

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v4, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 1013
    new-instance v0, Lo/fqx;

    const-string v1, "Raw public key is not trusted"

    invoke-direct {v0, v1, v4}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 1016
    :cond_3
    :goto_2
    return-void
.end method

.method public final a(Lo/fsb;)V
    .locals 1

    .line 877
    if-eqz p1, :cond_0

    .line 878
    iget-object v0, p0, Lo/frd;->n:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 880
    :cond_0
    return-void
.end method

.method protected final a([B)V
    .locals 2

    .line 487
    invoke-direct {p0, p1}, Lo/frd;->e([B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frd;->b:[B

    .line 488
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    iget-object v1, p0, Lo/frd;->b:[B

    invoke-virtual {v0, v1}, Lo/fqr;->d([B)V

    .line 490
    iget-object v0, p0, Lo/frd;->b:[B

    invoke-virtual {p0, v0}, Lo/frd;->d([B)V

    .line 491
    return-void
.end method

.method public final a(Lo/fqy;)Z
    .locals 1

    .line 931
    invoke-virtual {p0, p1}, Lo/frd;->e(Lo/fqy;)Z

    move-result v0

    return v0
.end method

.method protected final b()V
    .locals 7

    .line 592
    iget-boolean v0, p0, Lo/frd;->r:Z

    if-eqz v0, :cond_0

    .line 593
    new-instance v0, Lo/fqo;

    iget-object v1, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->b()Lo/fsf;

    move-result-object v1

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->c()Lo/fqh;

    move-result-object v2

    iget-object v3, p0, Lo/frd;->i:Ljavax/crypto/SecretKey;

    iget-object v4, p0, Lo/frd;->a:Ljavax/crypto/spec/IvParameterSpec;

    iget-object v5, p0, Lo/frd;->c:Ljavax/crypto/SecretKey;

    invoke-direct/range {v0 .. v5}, Lo/fqo;-><init>(Lo/fsf;Lo/fqh;Ljavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;Ljavax/crypto/SecretKey;)V

    move-object v6, v0

    goto :goto_0

    .line 595
    :cond_0
    new-instance v0, Lo/fqo;

    iget-object v1, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->b()Lo/fsf;

    move-result-object v1

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->c()Lo/fqh;

    move-result-object v2

    iget-object v3, p0, Lo/frd;->f:Ljavax/crypto/SecretKey;

    iget-object v4, p0, Lo/frd;->g:Ljavax/crypto/spec/IvParameterSpec;

    iget-object v5, p0, Lo/frd;->d:Ljavax/crypto/SecretKey;

    invoke-direct/range {v0 .. v5}, Lo/fqo;-><init>(Lo/fsf;Lo/fqh;Ljavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;Ljavax/crypto/SecretKey;)V

    move-object v6, v0

    .line 597
    :goto_0
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0, v6}, Lo/fqr;->e(Lo/fqo;)V

    .line 598
    return-void
.end method

.method protected b(Lo/fqm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 460
    return-void
.end method

.method public final b(Lo/frl;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 414
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {p1}, Lo/frl;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fqr;->a(J)Z

    move-result v0

    if-nez v0, :cond_3

    .line 416
    :try_start_0
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {p1, v0}, Lo/frl;->a(Lo/fqr;)V

    .line 417
    iget-object v0, p0, Lo/frd;->B:Lo/frd$c;

    invoke-virtual {v0, p1}, Lo/frd$c;->b(Lo/frl;)Lo/fqm;

    move-result-object v5

    .line 418
    :goto_0
    if-eqz v5, :cond_2

    .line 419
    instance-of v0, v5, Lo/fqz;

    if-eqz v0, :cond_0

    .line 420
    move-object v0, v5

    check-cast v0, Lo/fqz;

    invoke-virtual {p0, v0}, Lo/frd;->d(Lo/fqz;)Lo/fqy;

    move-result-object v5

    .line 423
    :cond_0
    if-nez v5, :cond_1

    goto :goto_1

    .line 427
    :cond_1
    invoke-virtual {p0, v5}, Lo/frd;->b(Lo/fqm;)V

    .line 431
    :goto_1
    iget-object v0, p0, Lo/frd;->B:Lo/frd$c;

    invoke-virtual {v0}, Lo/frd$c;->c()Lo/fqm;

    move-result-object v5

    goto :goto_0

    .line 433
    :cond_2
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {p1}, Lo/frl;->b()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1}, Lo/frl;->e()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/fqr;->b(JJ)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 439
    goto :goto_2

    .line 434
    :catch_0
    move-exception v5

    .line 435
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Cannot process handshake message from peer [{}] due to [{}]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/frd;->k()Lo/fqr;

    move-result-object v3

    invoke-virtual {v3}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v5, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    new-instance v6, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->y:Lo/fqb$b;

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v6, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 438
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot process handshake message"

    invoke-direct {v0, v1, v6}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 441
    :cond_3
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Discarding duplicate HANDSHAKE message received from peer [{}]:{}{}"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object p1, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    :goto_2
    return-void
.end method

.method protected final b([B)[B
    .locals 6

    .line 567
    array-length v2, p1

    .line 569
    const/4 v0, 0x2

    new-array v3, v0, [B

    .line 570
    shr-int/lit8 v0, v2, 0x8

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v3, v1

    .line 571
    int-to-byte v0, v2

    const/4 v1, 0x1

    aput-byte v0, v3, v1

    .line 573
    const/4 v0, 0x0

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-static {v0, v1, v2}, Lo/fsp;->a([BBI)[B

    move-result-object v4

    .line 575
    invoke-static {v3, p1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    invoke-static {v4, v0}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    invoke-static {v3, v0}, Lo/fsp;->c([B[B)[B

    move-result-object v5

    .line 577
    return-object v5
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 3

    .line 919
    iget-object v0, p0, Lo/frd;->n:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fsb;

    .line 920
    invoke-virtual {p0}, Lo/frd;->i()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-interface {v2, v0, p1}, Lo/fsb;->e(Ljava/net/InetSocketAddress;Ljava/lang/Throwable;)V

    .line 921
    goto :goto_0

    .line 922
    :cond_0
    return-void
.end method

.method final c()[B
    .locals 1

    .line 802
    iget-object v0, p0, Lo/frd;->b:[B

    return-object v0
.end method

.method protected final d(Lo/fqz;)Lo/fqy;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 692
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Processing {} message fragment ..."

    invoke-virtual {p1}, Lo/fqz;->c()Lo/fra;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 693
    const/4 v6, 0x0

    .line 694
    invoke-virtual {p1}, Lo/fqz;->s()I

    move-result v7

    .line 695
    iget-object v0, p0, Lo/frd;->C:Ljava/util/Map;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/SortedSet;

    .line 696
    if-nez v8, :cond_0

    .line 697
    new-instance v8, Ljava/util/TreeSet;

    new-instance v0, Lo/frd$2;

    invoke-direct {v0, p0}, Lo/frd$2;-><init>(Lo/frd;)V

    invoke-direct {v8, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 710
    iget-object v0, p0, Lo/frd;->C:Ljava/util/Map;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    :cond_0
    invoke-interface {v8, p1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 715
    move-object v0, p0

    move v1, v7

    move-object v2, v8

    invoke-virtual {p1}, Lo/fqz;->d()I

    move-result v3

    invoke-virtual {p1}, Lo/fqz;->c()Lo/fra;

    move-result-object v4

    iget-object v5, p0, Lo/frd;->w:Lo/fqr;

    invoke-direct/range {v0 .. v5}, Lo/frd;->c(ILjava/util/SortedSet;ILo/fra;Lo/fqr;)Lo/fqy;

    move-result-object v6

    .line 717
    if-eqz v6, :cond_1

    .line 718
    sget-object v0, Lo/frd;->e:Lo/fty;

    const-string v1, "Successfully re-assembled {} message"

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 719
    iget-object v0, p0, Lo/frd;->C:Ljava/util/Map;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    :cond_1
    return-object v6
.end method

.method protected final d()V
    .locals 7

    .line 582
    iget-boolean v0, p0, Lo/frd;->r:Z

    if-eqz v0, :cond_0

    .line 583
    new-instance v0, Lo/fqo;

    iget-object v1, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->b()Lo/fsf;

    move-result-object v1

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->c()Lo/fqh;

    move-result-object v2

    iget-object v3, p0, Lo/frd;->f:Ljavax/crypto/SecretKey;

    iget-object v4, p0, Lo/frd;->g:Ljavax/crypto/spec/IvParameterSpec;

    iget-object v5, p0, Lo/frd;->d:Ljavax/crypto/SecretKey;

    invoke-direct/range {v0 .. v5}, Lo/fqo;-><init>(Lo/fsf;Lo/fqh;Ljavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;Ljavax/crypto/SecretKey;)V

    move-object v6, v0

    goto :goto_0

    .line 585
    :cond_0
    new-instance v0, Lo/fqo;

    iget-object v1, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->b()Lo/fsf;

    move-result-object v1

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->c()Lo/fqh;

    move-result-object v2

    iget-object v3, p0, Lo/frd;->i:Ljavax/crypto/SecretKey;

    iget-object v4, p0, Lo/frd;->a:Ljavax/crypto/spec/IvParameterSpec;

    iget-object v5, p0, Lo/frd;->c:Ljavax/crypto/SecretKey;

    invoke-direct/range {v0 .. v5}, Lo/fqo;-><init>(Lo/fsf;Lo/fqh;Ljavax/crypto/SecretKey;Ljavax/crypto/spec/IvParameterSpec;Ljavax/crypto/SecretKey;)V

    move-object v6, v0

    .line 587
    :goto_0
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0, v6}, Lo/fqr;->b(Lo/fqo;)V

    .line 588
    return-void
.end method

.method protected d([B)V
    .locals 8

    .line 504
    iget-object v0, p0, Lo/frd;->v:Lo/fro;

    invoke-virtual {v0}, Lo/fro;->b()[B

    move-result-object v0

    iget-object v1, p0, Lo/frd;->q:Lo/fro;

    invoke-virtual {v1}, Lo/fro;->b()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v3

    .line 505
    sget-object v0, Lo/fsm$e;->e:Lo/fsm$e;

    invoke-static {p1, v0, v3}, Lo/fsm;->b([BLo/fsm$e;[B)[B

    move-result-object v4

    .line 518
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->b()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->h()I

    move-result v5

    .line 519
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->b()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->o()I

    move-result v6

    .line 520
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->b()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->l()I

    move-result v7

    .line 522
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "Mac"

    const/4 v2, 0x0

    invoke-direct {v0, v4, v2, v5, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, Lo/frd;->c:Ljavax/crypto/SecretKey;

    .line 523
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "Mac"

    invoke-direct {v0, v4, v5, v5, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, Lo/frd;->d:Ljavax/crypto/SecretKey;

    .line 525
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    mul-int/lit8 v1, v5, 0x2

    const-string v2, "AES"

    invoke-direct {v0, v4, v1, v6, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, Lo/frd;->i:Ljavax/crypto/SecretKey;

    .line 526
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    mul-int/lit8 v1, v5, 0x2

    add-int/2addr v1, v6

    const-string v2, "AES"

    invoke-direct {v0, v4, v1, v6, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    iput-object v0, p0, Lo/frd;->f:Ljavax/crypto/SecretKey;

    .line 528
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    mul-int/lit8 v1, v5, 0x2

    mul-int/lit8 v2, v6, 0x2

    add-int/2addr v1, v2

    invoke-direct {v0, v4, v1, v7}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    iput-object v0, p0, Lo/frd;->a:Ljavax/crypto/spec/IvParameterSpec;

    .line 529
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    mul-int/lit8 v1, v5, 0x2

    mul-int/lit8 v2, v6, 0x2

    add-int/2addr v1, v2

    add-int/2addr v1, v7

    invoke-direct {v0, v4, v1, v7}, Ljavax/crypto/spec/IvParameterSpec;-><init>([BII)V

    iput-object v0, p0, Lo/frd;->g:Ljavax/crypto/spec/IvParameterSpec;

    .line 531
    return-void
.end method

.method protected final e(Lo/fqm;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fqm;)Ljava/util/List<Lo/frl;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 616
    :try_start_0
    sget-object v0, Lo/frd$1;->e:[I

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 618
    :sswitch_0
    move-object v0, p1

    check-cast v0, Lo/fqy;

    invoke-direct {p0, v0}, Lo/frd;->d(Lo/fqy;)Ljava/util/List;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 622
    :goto_0
    :try_start_1
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 623
    new-instance v0, Lo/frl;

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v1

    iget-object v2, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->i()I

    move-result v2

    iget-object v3, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->g()J

    move-result-wide v3

    iget-object v6, p0, Lo/frd;->w:Lo/fqr;

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lo/frl;-><init>(Lo/fqn;IJLo/fqm;Lo/fqr;)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 625
    return-object v7

    .line 627
    :catch_0
    move-exception v7

    .line 628
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot create record"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    iget-object v5, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v5}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public abstract e()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation
.end method

.method protected e(Lo/fqy;)Z
    .locals 1

    .line 935
    const/4 v0, 0x0

    return v0
.end method

.method protected final f()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 901
    iget-object v0, p0, Lo/frd;->n:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fsb;

    .line 902
    invoke-virtual {p0}, Lo/frd;->k()Lo/fqr;

    move-result-object v0

    invoke-interface {v2, p0, v0}, Lo/fsb;->d(Lo/frd;Lo/fqr;)V

    .line 903
    goto :goto_0

    .line 904
    :cond_0
    return-void
.end method

.method final g()V
    .locals 2

    .line 867
    iget v0, p0, Lo/frd;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/frd;->h:I

    .line 868
    return-void
.end method

.method protected final h()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 895
    iget-object v0, p0, Lo/frd;->n:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fsb;

    .line 896
    invoke-interface {v2, p0}, Lo/fsb;->a(Lo/frd;)V

    .line 897
    goto :goto_0

    .line 898
    :cond_0
    return-void
.end method

.method public final i()Ljava/net/InetSocketAddress;
    .locals 1

    .line 845
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lo/fqr;
    .locals 1

    .line 835
    iget-object v0, p0, Lo/frd;->w:Lo/fqr;

    return-object v0
.end method

.method protected final l()V
    .locals 3

    .line 907
    iget-object v0, p0, Lo/frd;->n:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fsb;

    .line 908
    invoke-virtual {p0}, Lo/frd;->i()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-interface {v2, v0}, Lo/fsb;->e(Ljava/net/InetSocketAddress;)V

    .line 909
    goto :goto_0

    .line 910
    :cond_0
    return-void
.end method

.method protected final n()V
    .locals 1

    .line 952
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/frd;->m:Z

    .line 953
    return-void
.end method

.method final p()Z
    .locals 1

    .line 945
    iget-boolean v0, p0, Lo/frd;->m:Z

    return v0
.end method
