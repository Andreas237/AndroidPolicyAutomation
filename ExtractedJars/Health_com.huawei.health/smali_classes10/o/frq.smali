.class public Lo/frq;
.super Lo/frd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/frq$2;
    }
.end annotation


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private E:Lo/fsr;

.field protected final b:Lo/fso;

.field protected c:Lo/fqe;

.field protected d:Lo/fqc;

.field protected e:Lo/fqk;

.field private f:Ljava/security/PublicKey;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fsf;>;"
        }
    .end annotation
.end field

.field private h:Lo/fqp;

.field private i:Ljava/security/cert/CertPath;

.field private k:Z

.field private l:Lo/fqf$e;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fqf$e;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fqf$e;>;"
        }
    .end annotation
.end field

.field private o:Lo/fqf$e;

.field private p:Lo/fsi$d;

.field private u:Lo/fse;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    const-class v0, Lo/frq;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/frq;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>(ILo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V
    .locals 10

    .line 187
    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual {p5}, Lo/fpz;->p()[Ljava/security/cert/X509Certificate;

    move-result-object v6

    move/from16 v7, p6

    invoke-virtual {p5}, Lo/fpz;->v()Lo/fsq;

    move-result-object v8

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v8}, Lo/frd;-><init>(ZILo/fqr;Lo/frm;Lo/fsb;[Ljava/security/cert/X509Certificate;ILo/fsq;)V

    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/frq;->k:Z

    .line 124
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frq;->d:Lo/fqc;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frq;->c:Lo/fqe;

    .line 190
    invoke-virtual {p5}, Lo/fpz;->h()[Lo/fsf;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->g:Ljava/util/List;

    .line 192
    invoke-virtual {p5}, Lo/fpz;->m()Lo/fso;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->b:Lo/fso;

    .line 194
    invoke-virtual {p5}, Lo/fpz;->g()Ljava/security/PrivateKey;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->F:Ljava/security/PrivateKey;

    .line 195
    invoke-virtual {p5}, Lo/fpz;->k()[Ljava/security/cert/X509Certificate;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->G:[Ljava/security/cert/X509Certificate;

    .line 196
    invoke-virtual {p5}, Lo/fpz;->o()Ljava/security/PublicKey;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->I:Ljava/security/PublicKey;

    .line 198
    invoke-virtual {p5}, Lo/fpz;->n()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/frq;->k:Z

    .line 200
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/frq;->n:Ljava/util/List;

    .line 201
    iget-object v0, p0, Lo/frq;->n:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    iget-object v0, p0, Lo/frq;->z:[Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/frq;->z:[Ljava/security/cert/X509Certificate;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 203
    invoke-virtual {p5}, Lo/fpz;->t()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    .line 204
    :goto_0
    iget-object v0, p0, Lo/frq;->n:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v9, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 207
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/frq;->m:Ljava/util/List;

    .line 208
    iget-object v0, p0, Lo/frq;->F:Ljava/security/PrivateKey;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/frq;->I:Ljava/security/PublicKey;

    if-eqz v0, :cond_5

    .line 209
    iget-object v0, p0, Lo/frq;->G:[Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/frq;->G:[Ljava/security/cert/X509Certificate;

    array-length v0, v0

    if-nez v0, :cond_3

    .line 210
    :cond_2
    iget-object v0, p0, Lo/frq;->m:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 211
    :cond_3
    invoke-virtual {p5}, Lo/fpz;->t()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 212
    iget-object v0, p0, Lo/frq;->m:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    iget-object v0, p0, Lo/frq;->m:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 215
    :cond_4
    iget-object v0, p0, Lo/frq;->m:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    iget-object v0, p0, Lo/frq;->m:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    :cond_5
    :goto_1
    return-void
.end method

.method private static a(Lo/fql;)Lo/fsi$d;
    .locals 7

    .line 838
    const/4 v1, 0x0

    .line 839
    invoke-static {}, Lo/fsi$d;->a()Ljava/util/List;

    move-result-object v2

    .line 840
    invoke-virtual {p0}, Lo/fql;->o()Lo/fsj;

    move-result-object v3

    .line 841
    if-nez v3, :cond_0

    .line 844
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 845
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fsi$d;

    goto :goto_1

    .line 848
    :cond_0
    invoke-virtual {v3}, Lo/fsj;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 850
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/fsi$d;->c(I)Lo/fsi$d;

    move-result-object v6

    .line 851
    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lo/fsi$d;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 852
    move-object v1, v6

    .line 853
    goto :goto_1

    .line 855
    :cond_1
    goto :goto_0

    .line 857
    :cond_2
    :goto_1
    return-object v1
.end method

.method private a(Lo/fql;Lo/fqp;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 616
    iget-boolean v0, p0, Lo/frq;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/frq;->u:Lo/fse;

    if-eqz v0, :cond_0

    .line 618
    new-instance v3, Lo/fqd;

    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/fqd;-><init>(Ljava/net/InetSocketAddress;)V

    .line 621
    sget-object v0, Lo/fqd$e;->k:Lo/fqd$e;

    invoke-virtual {v3, v0}, Lo/fqd;->e(Lo/fqd$e;)V

    .line 622
    new-instance v0, Lo/fse;

    iget-object v1, p0, Lo/frq;->u:Lo/fse;

    invoke-virtual {v1}, Lo/fse;->a()Lo/fse$b;

    move-result-object v1

    iget-object v2, p0, Lo/frq;->u:Lo/fse;

    invoke-virtual {v2}, Lo/fse;->c()Lo/fse$a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/fse;-><init>(Lo/fse$b;Lo/fse$a;)V

    invoke-virtual {v3, v0}, Lo/fqd;->a(Lo/fse;)V

    .line 623
    iget-object v0, p0, Lo/frq;->z:[Ljava/security/cert/X509Certificate;

    invoke-virtual {v3, v0}, Lo/fqd;->e([Ljava/security/cert/X509Certificate;)Z

    .line 625
    invoke-virtual {p0, v3}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 626
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {v3}, Lo/fqd;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 627
    iget-object v0, p0, Lo/frq;->A:[B

    invoke-virtual {v3}, Lo/fqd;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 629
    :cond_0
    return-void
.end method

.method private b(Lo/fqc;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 342
    iget-object v0, p0, Lo/frq;->d:Lo/fqc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/frq;->d:Lo/fqc;

    invoke-virtual {v0}, Lo/fqc;->s()I

    move-result v0

    invoke-virtual {p1}, Lo/fqc;->s()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 344
    return-void

    .line 347
    :cond_0
    iput-object p1, p0, Lo/frq;->d:Lo/fqc;

    .line 348
    iget-object v0, p0, Lo/frq;->d:Lo/fqc;

    invoke-virtual {p0, v0}, Lo/frq;->a(Lo/fqc;)V

    .line 349
    iget-object v0, p0, Lo/frq;->d:Lo/fqc;

    invoke-virtual {v0}, Lo/fqc;->h()Ljava/security/PublicKey;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->f:Ljava/security/PublicKey;

    .line 350
    invoke-virtual {p1}, Lo/fqc;->f()Ljava/security/cert/CertPath;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->i:Ljava/security/cert/CertPath;

    .line 352
    iget-object v0, p0, Lo/frq;->A:[B

    iget-object v1, p0, Lo/frq;->d:Lo/fqc;

    invoke-virtual {v1}, Lo/fqc;->z()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 353
    return-void
.end method

.method private b(Lo/fql;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 473
    invoke-virtual {p0}, Lo/frq;->h()V

    .line 474
    new-instance v2, Lo/fqp;

    invoke-virtual {p0}, Lo/frq;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 477
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Lo/fql;->z()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 478
    iget-object v0, p0, Lo/frq;->A:[B

    invoke-virtual {p1}, Lo/fql;->z()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 480
    invoke-direct {p0, p1, v2}, Lo/frq;->d(Lo/fql;Lo/fqp;)V

    .line 482
    invoke-direct {p0, p1, v2}, Lo/frq;->b(Lo/fql;Lo/fqp;)V

    .line 484
    invoke-direct {p0, p1, v2}, Lo/frq;->e(Lo/fql;Lo/fqp;)V

    .line 486
    invoke-direct {p0, p1, v2}, Lo/frq;->a(Lo/fql;Lo/fqp;)V

    .line 491
    new-instance v3, Lo/frz;

    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/frz;-><init>(Ljava/net/InetSocketAddress;)V

    .line 492
    invoke-virtual {p0, v3}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 493
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {v3}, Lo/frz;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 494
    iget-object v0, p0, Lo/frq;->A:[B

    invoke-virtual {v3}, Lo/frz;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 496
    iget-object v0, p0, Lo/frq;->y:Lo/frm;

    invoke-interface {v0, v2}, Lo/frm;->d(Lo/fqp;)V

    .line 497
    return-void
.end method

.method private b(Lo/fql;Lo/fqp;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 556
    const/4 v2, 0x0

    .line 557
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->b()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 558
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 559
    new-instance v2, Lo/fqc;

    iget-object v0, p0, Lo/frq;->I:Ljava/security/PublicKey;

    invoke-interface {v0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    iget-object v1, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lo/fqc;-><init>([BLjava/net/InetSocketAddress;)V

    goto :goto_0

    .line 561
    :cond_0
    new-instance v2, Lo/fqc;

    iget-object v0, p0, Lo/frq;->G:[Ljava/security/cert/X509Certificate;

    iget-object v1, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lo/fqc;-><init>([Ljava/security/cert/X509Certificate;Ljava/net/InetSocketAddress;)V

    .line 564
    :goto_0
    invoke-virtual {p0, v2}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 565
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {v2}, Lo/fqc;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 566
    iget-object v0, p0, Lo/frq;->A:[B

    invoke-virtual {v2}, Lo/fqc;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 568
    :cond_1
    return-void
.end method

.method private b(Lo/fsf;Lo/frb;)V
    .locals 4

    .line 809
    iget-object v0, p0, Lo/frq;->o:Lo/fqf$e;

    if-eqz v0, :cond_0

    .line 810
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    iget-object v2, p0, Lo/frq;->o:Lo/fqf$e;

    invoke-virtual {v1, v2}, Lo/fqf$e;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/fqr;->d(Z)V

    .line 811
    new-instance v3, Lo/fqj;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/fqj;-><init>(Z)V

    .line 812
    iget-object v0, p0, Lo/frq;->o:Lo/fqf$e;

    invoke-virtual {v3, v0}, Lo/fqj;->c(Lo/fqf$e;)V

    .line 813
    invoke-virtual {p2, v3}, Lo/frb;->d(Lo/frf;)V

    .line 815
    :cond_0
    iget-object v0, p0, Lo/frq;->l:Lo/fqf$e;

    if-eqz v0, :cond_1

    .line 816
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    iget-object v2, p0, Lo/frq;->l:Lo/fqf$e;

    invoke-virtual {v1, v2}, Lo/fqf$e;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/fqr;->b(Z)V

    .line 817
    new-instance v3, Lo/fru;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/fru;-><init>(Z)V

    .line 818
    iget-object v0, p0, Lo/frq;->l:Lo/fqf$e;

    invoke-virtual {v3, v0}, Lo/fru;->c(Lo/fqf$e;)V

    .line 819
    invoke-virtual {p2, v3}, Lo/frb;->d(Lo/frf;)V

    .line 821
    :cond_1
    invoke-virtual {p1}, Lo/fsf;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 824
    const/4 v0, 0x1

    new-array v0, v0, [Lo/fsg$a;

    sget-object v1, Lo/fsg$a;->a:Lo/fsg$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 825
    new-instance v0, Lo/fsg;

    invoke-direct {v0, v3}, Lo/fsg;-><init>(Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lo/frb;->d(Lo/frf;)V

    .line 827
    :cond_2
    return-void
.end method

.method private b(Lo/fsf;Lo/fqf$e;Lo/fqf$e;Lo/fsi$d;)Z
    .locals 2

    .line 793
    const/4 v1, 0x1

    .line 794
    invoke-virtual {p1}, Lo/fsf;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 796
    if-eqz p4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, v0, 0x1

    .line 798
    :cond_1
    invoke-virtual {p1}, Lo/fsf;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 800
    if-eqz p2, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    and-int/2addr v1, v0

    .line 801
    iget-boolean v0, p0, Lo/frq;->k:Z

    if-eqz v0, :cond_4

    .line 802
    if-eqz p3, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    and-int/2addr v1, v0

    .line 805
    :cond_4
    return v1
.end method

.method private c(Lo/fql;)Lo/fqf$e;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 876
    invoke-virtual {p1}, Lo/fql;->u()Lo/fru;

    move-result-object v2

    .line 877
    if-eqz v2, :cond_2

    .line 878
    invoke-virtual {v2}, Lo/fru;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fqf$e;

    .line 879
    iget-object v0, p0, Lo/frq;->m:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 880
    return-object v4

    .line 882
    :cond_0
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 883
    :cond_2
    iget-object v0, p0, Lo/frq;->m:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 884
    sget-object v0, Lo/fqf$e;->c:Lo/fqf$e;

    return-object v0

    .line 886
    :cond_3
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private c(Lo/fqe;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 365
    iput-object p1, p0, Lo/frq;->c:Lo/fqe;

    .line 367
    iget-object v0, p0, Lo/frq;->f:Ljava/security/PublicKey;

    iget-object v1, p0, Lo/frq;->A:[B

    invoke-virtual {p1, v0, v1}, Lo/fqe;->b(Ljava/security/PublicKey;[B)V

    .line 369
    iget-object v0, p0, Lo/frq;->i:Ljava/security/cert/CertPath;

    if-eqz v0, :cond_0

    .line 370
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    new-instance v1, Lo/fpx;

    iget-object v2, p0, Lo/frq;->i:Ljava/security/cert/CertPath;

    invoke-direct {v1, v2}, Lo/fpx;-><init>(Ljava/security/cert/CertPath;)V

    invoke-virtual {v0, v1}, Lo/fqr;->a(Ljava/security/Principal;)V

    goto :goto_0

    .line 372
    :cond_0
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    new-instance v1, Lo/fpv;

    iget-object v2, p0, Lo/frq;->f:Ljava/security/PublicKey;

    invoke-direct {v1, v2}, Lo/fpv;-><init>(Ljava/security/PublicKey;)V

    invoke-virtual {v0, v1}, Lo/fqr;->a(Ljava/security/Principal;)V

    .line 374
    :goto_0
    return-void
.end method

.method private c(Lo/fql;Lo/frb;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 767
    invoke-direct {p0, p1}, Lo/frq;->c(Lo/fql;)Lo/fqf$e;

    move-result-object v5

    .line 768
    invoke-direct {p0, p1}, Lo/frq;->e(Lo/fql;)Lo/fqf$e;

    move-result-object v6

    .line 769
    invoke-static {p1}, Lo/frq;->a(Lo/fql;)Lo/fsi$d;

    move-result-object v7

    .line 771
    invoke-virtual {p1}, Lo/fql;->m()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/fsf;

    .line 773
    sget-object v0, Lo/fsf;->b:Lo/fsf;

    if-eq v9, v0, :cond_0

    iget-object v0, p0, Lo/frq;->g:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 774
    invoke-direct {p0, v9, v5, v6, v7}, Lo/frq;->b(Lo/fsf;Lo/fqf$e;Lo/fqf$e;Lo/fsi$d;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 775
    iput-object v5, p0, Lo/frq;->l:Lo/fqf$e;

    .line 776
    iput-object v6, p0, Lo/frq;->o:Lo/fqf$e;

    .line 777
    iput-object v7, p0, Lo/frq;->p:Lo/fsi$d;

    .line 778
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0, v9}, Lo/fqr;->b(Lo/fsf;)V

    .line 779
    invoke-direct {p0, v9, p2}, Lo/frq;->b(Lo/fsf;Lo/frb;)V

    .line 780
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Negotiated cipher suite [{}] with peer [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v9}, Lo/fsf;->name()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lo/frq;->i()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    return-void

    .line 785
    :cond_0
    goto :goto_0

    .line 787
    :cond_1
    new-instance v8, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    iget-object v2, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v8, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 788
    new-instance v0, Lo/fqx;

    const-string v1, "Client proposed unsupported cipher suites only"

    invoke-direct {v0, v1, v8}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0
.end method

.method private c(Lo/frj;)[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 658
    iput-object p1, p0, Lo/frq;->e:Lo/fqk;

    .line 659
    const/4 v6, 0x0

    .line 662
    invoke-virtual {p1}, Lo/frj;->f()Ljava/lang/String;

    move-result-object v7

    .line 664
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Client [{}] uses PSK identity [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/frq;->i()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v7, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    invoke-virtual {p0}, Lo/frq;->m()Lo/fsr;

    move-result-object v0

    if-nez v0, :cond_0

    .line 668
    iget-object v0, p0, Lo/frq;->b:Lo/fso;

    invoke-interface {v0, v7}, Lo/fso;->c(Ljava/lang/String;)[B

    move-result-object v6

    goto :goto_0

    .line 670
    :cond_0
    iget-object v0, p0, Lo/frq;->b:Lo/fso;

    invoke-virtual {p0}, Lo/frq;->m()Lo/fsr;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Lo/fso;->c(Lo/fsr;Ljava/lang/String;)[B

    move-result-object v6

    .line 673
    :goto_0
    if-nez v6, :cond_1

    .line 674
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot authenticate client, identity [%s] is unknown"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    iget-object v5, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v5}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 678
    :cond_1
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    new-instance v1, Lo/fpu;

    invoke-direct {v1, v7}, Lo/fpu;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/fqr;->a(Ljava/security/Principal;)V

    .line 679
    invoke-virtual {p0, v6}, Lo/frq;->b([B)[B

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/fql;Lo/fqp;)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 501
    invoke-virtual {p1}, Lo/fql;->i()Lo/frn;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/frq;->e(Lo/frn;)Lo/frn;

    move-result-object v8

    .line 504
    invoke-virtual {p1}, Lo/fql;->f()Lo/fro;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->q:Lo/fro;

    .line 505
    new-instance v0, Lo/fro;

    invoke-direct {v0}, Lo/fro;-><init>()V

    iput-object v0, p0, Lo/frq;->v:Lo/fro;

    .line 507
    new-instance v9, Lo/fsa;

    invoke-direct {v9}, Lo/fsa;-><init>()V

    .line 508
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0, v9}, Lo/fqr;->a(Lo/fsa;)V

    .line 511
    invoke-virtual {p1}, Lo/fql;->n()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lo/fqh;->e:Lo/fqh;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 513
    new-instance v0, Lo/fqx;

    const-string v1, "Client does not support NULL compression method"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 520
    :cond_0
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    sget-object v1, Lo/fqh;->e:Lo/fqh;

    invoke-virtual {v0, v1}, Lo/fqr;->e(Lo/fqh;)V

    .line 523
    new-instance v10, Lo/frb;

    invoke-direct {v10}, Lo/frb;-><init>()V

    .line 524
    invoke-direct {p0, p1, v10}, Lo/frq;->c(Lo/fql;Lo/frb;)V

    .line 526
    invoke-virtual {p1}, Lo/fql;->t()Lo/frh;

    move-result-object v11

    .line 527
    if-eqz v11, :cond_1

    .line 528
    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v11}, Lo/frh;->c()Lo/frh$d;

    move-result-object v1

    invoke-virtual {v1}, Lo/frh$d;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fqr;->d(I)V

    .line 529
    invoke-virtual {v10, v11}, Lo/frb;->d(Lo/frf;)V

    .line 530
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Negotiated max. fragment length [{} bytes] with peer [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v11}, Lo/frh;->c()Lo/frh$d;

    move-result-object v3

    invoke-virtual {v3}, Lo/frh$d;->e()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    :cond_1
    invoke-virtual {p1}, Lo/fql;->r()Lo/fry;

    move-result-object v12

    .line 536
    if-eqz v12, :cond_2

    .line 538
    invoke-virtual {v12}, Lo/fry;->a()Lo/fsr;

    move-result-object v0

    iput-object v0, p0, Lo/frq;->E:Lo/fsr;

    .line 539
    invoke-static {}, Lo/fry;->c()Lo/fry;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/frb;->d(Lo/frf;)V

    .line 540
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Using server name indication received from peer [{}]"

    invoke-virtual {p1}, Lo/fql;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 545
    :cond_2
    new-instance v0, Lo/frs;

    move-object v1, v8

    iget-object v2, p0, Lo/frq;->v:Lo/fro;

    move-object v3, v9

    iget-object v4, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v4}, Lo/fqr;->b()Lo/fsf;

    move-result-object v4

    iget-object v5, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v5}, Lo/fqr;->c()Lo/fqh;

    move-result-object v5

    move-object v6, v10

    iget-object v7, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v7}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lo/frs;-><init>(Lo/frn;Lo/fro;Lo/fsa;Lo/fsf;Lo/fqh;Lo/frb;Ljava/net/InetSocketAddress;)V

    move-object v13, v0

    .line 547
    invoke-virtual {p0, v13}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 550
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {v13}, Lo/frs;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 551
    iget-object v0, p0, Lo/frq;->A:[B

    invoke-virtual {v13}, Lo/frs;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 552
    return-void
.end method

.method private d(Lo/fqw;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 390
    iget-object v0, p0, Lo/frq;->h:Lo/fqp;

    if-eqz v0, :cond_0

    .line 391
    return-void

    .line 396
    :cond_0
    sget-object v0, Lo/fsf$a;->f:Lo/fsf$a;

    invoke-virtual {p0}, Lo/frq;->a()Lo/fsf$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fsf$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lo/frq;->k:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/frq;->d:Lo/fqc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/frq;->c:Lo/fqe;

    if-nez v0, :cond_2

    .line 399
    :cond_1
    new-instance v3, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    iget-object v2, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v3, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 400
    new-instance v0, Lo/fqx;

    const-string v1, "Client did not send required authentication messages."

    invoke-direct {v0, v1, v3}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 403
    :cond_2
    new-instance v3, Lo/fqp;

    invoke-virtual {p0}, Lo/frq;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 406
    iget-object v0, p0, Lo/frq;->d:Lo/fqc;

    if-eqz v0, :cond_3

    .line 407
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/frq;->d:Lo/fqc;

    invoke-virtual {v1}, Lo/fqc;->z()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 410
    :cond_3
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/frq;->e:Lo/fqk;

    invoke-virtual {v1}, Lo/fqk;->z()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 412
    iget-object v0, p0, Lo/frq;->c:Lo/fqe;

    if-eqz v0, :cond_4

    .line 413
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/frq;->c:Lo/fqe;

    invoke-virtual {v1}, Lo/fqe;->z()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 416
    :cond_4
    const/4 v4, 0x0

    .line 424
    :try_start_0
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/MessageDigest;

    move-object v4, v0

    .line 425
    invoke-virtual {p1}, Lo/fqw;->a()[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->update([B)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 428
    goto :goto_0

    .line 426
    :catch_0
    move-exception v5

    .line 427
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Cannot compute digest for server\'s Finish handshake message"

    invoke-interface {v0, v1, v5}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 431
    :goto_0
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v5

    .line 432
    invoke-virtual {p0}, Lo/frq;->c()[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, v5}, Lo/fqw;->a([BZ[B)V

    .line 437
    new-instance v6, Lo/fqg;

    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/fqg;-><init>(Ljava/net/InetSocketAddress;)V

    .line 438
    invoke-virtual {p0, v6}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 439
    invoke-virtual {p0}, Lo/frq;->b()V

    .line 444
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v5

    .line 445
    new-instance v7, Lo/fqw;

    invoke-virtual {p0}, Lo/frq;->c()[B

    move-result-object v0

    iget-boolean v1, p0, Lo/frq;->r:Z

    iget-object v2, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v7, v0, v1, v5, v2}, Lo/fqw;-><init>([BZ[BLjava/net/InetSocketAddress;)V

    .line 446
    invoke-virtual {p0, v7}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 448
    sget-object v0, Lo/fra;->o:Lo/fra;

    invoke-virtual {v0}, Lo/fra;->c()I

    move-result v0

    iput v0, p0, Lo/frq;->t:I

    .line 450
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/fqp;->a(Z)V

    .line 453
    iput-object v3, p0, Lo/frq;->h:Lo/fqp;

    .line 454
    iget-object v0, p0, Lo/frq;->y:Lo/frm;

    invoke-interface {v0, v3}, Lo/frm;->d(Lo/fqp;)V

    .line 455
    invoke-virtual {p0}, Lo/frq;->f()V

    .line 456
    return-void
.end method

.method private d(Lo/frk;)[B
    .locals 1

    .line 691
    iput-object p1, p0, Lo/frq;->e:Lo/fqk;

    .line 695
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method private e(Lo/fql;)Lo/fqf$e;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 862
    invoke-virtual {p1}, Lo/fql;->p()Lo/fqj;

    move-result-object v2

    .line 863
    if-eqz v2, :cond_2

    .line 864
    invoke-virtual {v2}, Lo/fqj;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fqf$e;

    .line 865
    iget-object v0, p0, Lo/frq;->n:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 866
    return-object v4

    .line 868
    :cond_0
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 869
    :cond_2
    iget-object v0, p0, Lo/frq;->n:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 870
    sget-object v0, Lo/fqf$e;->c:Lo/fqf$e;

    return-object v0

    .line 872
    :cond_3
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private e(Lo/frn;)Lo/frn;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 719
    new-instance v3, Lo/frn;

    invoke-direct {v3}, Lo/frn;-><init>()V

    .line 720
    invoke-virtual {p1, v3}, Lo/frn;->e(Lo/frn;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 721
    new-instance v0, Lo/frn;

    invoke-direct {v0}, Lo/frn;-><init>()V

    return-object v0

    .line 723
    :cond_0
    new-instance v4, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->q:Lo/fqb$b;

    iget-object v2, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v4, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 724
    new-instance v0, Lo/fqx;

    const-string v1, "The server only supports DTLS v1.2"

    invoke-direct {v0, v1, v4}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0
.end method

.method private e(Lo/fql;Lo/fqp;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 576
    const/4 v8, 0x0

    .line 577
    sget-object v0, Lo/frq$2;->d:[I

    invoke-virtual {p0}, Lo/frq;->a()Lo/fsf$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 580
    :sswitch_0
    new-instance v0, Lo/fse;

    sget-object v1, Lo/fse$b;->a:Lo/fse$b;

    sget-object v2, Lo/fse$a;->b:Lo/fse$a;

    invoke-direct {v0, v1, v2}, Lo/fse;-><init>(Lo/fse$b;Lo/fse$a;)V

    iput-object v0, p0, Lo/frq;->u:Lo/fse;

    .line 582
    :try_start_0
    new-instance v0, Lo/fsi;

    iget-object v1, p0, Lo/frq;->p:Lo/fsi$d;

    invoke-virtual {v1}, Lo/fsi$d;->c()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fsi;-><init>(Ljava/security/spec/ECParameterSpec;)V

    iput-object v0, p0, Lo/frq;->x:Lo/fsi;

    .line 583
    new-instance v0, Lo/fqv;

    iget-object v1, p0, Lo/frq;->u:Lo/fse;

    iget-object v2, p0, Lo/frq;->x:Lo/fsi;

    iget-object v3, p0, Lo/frq;->F:Ljava/security/PrivateKey;

    iget-object v4, p0, Lo/frq;->q:Lo/fro;

    iget-object v5, p0, Lo/frq;->v:Lo/fro;

    iget-object v6, p0, Lo/frq;->p:Lo/fsi$d;

    invoke-virtual {v6}, Lo/fsi$d;->d()I

    move-result v6

    iget-object v7, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v7}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lo/fqv;-><init>(Lo/fse;Lo/fsi;Ljava/security/PrivateKey;Lo/fro;Lo/fro;ILjava/net/InetSocketAddress;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v0

    .line 585
    goto :goto_0

    .line 586
    :catch_0
    move-exception v9

    .line 587
    new-instance v0, Lo/fqx;

    const-string v1, "Error performing EC Diffie Hellman key exchange: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-virtual {p0}, Lo/frq;->i()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 600
    .line 607
    :goto_0
    :sswitch_1
    if-eqz v8, :cond_0

    .line 608
    invoke-virtual {p0, v8}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 609
    iget-object v0, p0, Lo/frq;->D:Ljava/security/MessageDigest;

    invoke-virtual {v8}, Lo/frx;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 610
    iget-object v0, p0, Lo/frq;->A:[B

    invoke-virtual {v8}, Lo/frx;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 612
    :cond_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(Lo/fqs;)[B
    .locals 3

    .line 640
    iput-object p1, p0, Lo/frq;->e:Lo/fqk;

    .line 641
    iget-object v0, p0, Lo/frq;->x:Lo/fsi;

    invoke-virtual {p1}, Lo/fqs;->h()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fsi;->d([B)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v2

    .line 643
    return-object v2
.end method


# virtual methods
.method protected declared-synchronized b(Lo/fqm;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    .line 226
    :try_start_0
    iget-object v0, p0, Lo/frq;->h:Lo/fqp;

    if-eqz v0, :cond_0

    .line 230
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Received client\'s ({}) FINISHED message again, retransmitting last flight..."

    invoke-virtual {p0}, Lo/frq;->i()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lo/frq;->h:Lo/fqp;

    invoke-virtual {v0}, Lo/fqp;->a()V

    .line 233
    iget-object v0, p0, Lo/frq;->h:Lo/fqp;

    invoke-virtual {v0}, Lo/fqp;->o()V

    .line 234
    iget-object v0, p0, Lo/frq;->y:Lo/frm;

    iget-object v1, p0, Lo/frq;->h:Lo/fqp;

    invoke-interface {v0, v1}, Lo/frm;->d(Lo/fqp;)V

    .line 235
    monitor-exit p0

    return-void

    .line 240
    :cond_0
    sget-object v0, Lo/frq;->a:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 241
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    const-string v0, "Processing {} message from peer [{}]"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    sget-object v0, Lo/frq;->a:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    const-string v0, ":"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    :cond_1
    sget-object v0, Lo/frq;->a:Lo/fty;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    :cond_2
    sget-object v0, Lo/frq$2;->a:[I

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_4

    .line 252
    :sswitch_0
    invoke-virtual {p0}, Lo/frq;->d()V

    .line 253
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Processed {} message from peer [{}]"

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    goto/16 :goto_5

    .line 258
    :sswitch_1
    iget-object v0, p0, Lo/frq;->y:Lo/frm;

    invoke-interface {v0}, Lo/frm;->c()V

    .line 259
    move-object v6, p1

    check-cast v6, Lo/fqy;

    .line 261
    sget-object v0, Lo/frq$2;->b:[I

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 263
    :pswitch_0
    move-object v0, v6

    check-cast v0, Lo/fql;

    invoke-direct {p0, v0}, Lo/frq;->b(Lo/fql;)V

    .line 264
    goto/16 :goto_3

    .line 267
    :pswitch_1
    move-object v0, v6

    check-cast v0, Lo/fqc;

    invoke-direct {p0, v0}, Lo/frq;->b(Lo/fqc;)V

    .line 268
    goto/16 :goto_3

    .line 272
    :pswitch_2
    sget-object v0, Lo/frq$2;->d:[I

    invoke-virtual {p0}, Lo/frq;->a()Lo/fsf$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 274
    :pswitch_3
    move-object v0, v6

    check-cast v0, Lo/frj;

    invoke-direct {p0, v0}, Lo/frq;->c(Lo/frj;)[B

    move-result-object v7

    .line 275
    invoke-virtual {p0, v7}, Lo/frq;->a([B)V

    .line 276
    goto :goto_1

    .line 279
    :pswitch_4
    move-object v0, v6

    check-cast v0, Lo/fqs;

    invoke-direct {p0, v0}, Lo/frq;->e(Lo/fqs;)[B

    move-result-object v7

    .line 280
    invoke-virtual {p0, v7}, Lo/frq;->a([B)V

    .line 281
    goto :goto_1

    .line 284
    :pswitch_5
    move-object v0, v6

    check-cast v0, Lo/frk;

    invoke-direct {p0, v0}, Lo/frq;->d(Lo/frk;)[B

    move-result-object v7

    .line 285
    invoke-virtual {p0, v7}, Lo/frq;->a([B)V

    .line 286
    goto :goto_1

    .line 289
    :goto_0
    new-instance v0, Lo/fqx;

    const-string v1, "Unsupported key exchange algorithm %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/frq;->a()Lo/fsf$a;

    move-result-object v3

    invoke-virtual {v3}, Lo/fsf$a;->name()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-virtual {v6}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 293
    :goto_1
    iget-object v0, p0, Lo/frq;->A:[B

    iget-object v1, p0, Lo/frq;->e:Lo/fqk;

    invoke-virtual {v1}, Lo/fqk;->z()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frq;->A:[B

    .line 295
    iget-boolean v0, p0, Lo/frq;->k:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lo/frq;->a()Lo/fsf$a;

    move-result-object v0

    sget-object v1, Lo/fsf$a;->f:Lo/fsf$a;

    if-eq v0, v1, :cond_4

    .line 296
    :cond_3
    invoke-virtual {p0}, Lo/frq;->n()V

    goto :goto_3

    .line 301
    :pswitch_6
    move-object v0, v6

    check-cast v0, Lo/fqe;

    invoke-direct {p0, v0}, Lo/frq;->c(Lo/fqe;)V

    .line 302
    invoke-virtual {p0}, Lo/frq;->n()V

    .line 303
    goto :goto_3

    .line 306
    :pswitch_7
    move-object v0, v6

    check-cast v0, Lo/fqw;

    invoke-direct {p0, v0}, Lo/frq;->d(Lo/fqw;)V

    .line 307
    goto :goto_3

    .line 310
    :goto_2
    new-instance v0, Lo/fqx;

    const-string v1, "Received unexpected %s message from peer %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v6}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->a:Lo/fqb$b;

    invoke-virtual {v6}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 315
    :cond_4
    :goto_3
    iget-object v0, p0, Lo/frq;->h:Lo/fqp;

    if-nez v0, :cond_5

    .line 318
    invoke-virtual {p0}, Lo/frq;->g()V

    .line 320
    :cond_5
    sget-object v0, Lo/frq;->a:Lo/fty;

    const-string v1, "Processed {} message with message sequence no [{}] from peer [{}]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v6}, Lo/fqy;->s()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    goto :goto_5

    .line 325
    :goto_4
    new-instance v0, Lo/fqx;

    const-string v1, "Received unexpected %s message from peer %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 329
    :goto_5
    monitor-exit p0

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public e()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 700
    new-instance v1, Lo/fre;

    iget-object v0, p0, Lo/frq;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v1, v0}, Lo/fre;-><init>(Ljava/net/InetSocketAddress;)V

    .line 702
    new-instance v2, Lo/fqp;

    invoke-virtual {p0}, Lo/frq;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 703
    invoke-virtual {p0, v1}, Lo/frq;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 704
    iget-object v0, p0, Lo/frq;->y:Lo/frm;

    invoke-interface {v0, v2}, Lo/frm;->d(Lo/fqp;)V

    .line 705
    return-void
.end method

.method protected e(Lo/fqy;)Z
    .locals 3

    .line 911
    sget-object v0, Lo/fra;->c:Lo/fra;

    invoke-virtual {p1}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fra;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 912
    move-object v0, p1

    check-cast v0, Lo/fql;

    invoke-virtual {v0}, Lo/fql;->f()Lo/fro;

    move-result-object v2

    .line 913
    iget-object v0, p0, Lo/frq;->q:Lo/fro;

    invoke-virtual {v0}, Lo/fro;->b()[B

    move-result-object v0

    invoke-virtual {v2}, Lo/fro;->b()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    return v0

    .line 915
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final m()Lo/fsr;
    .locals 1

    .line 902
    iget-object v0, p0, Lo/frq;->E:Lo/fsr;

    return-object v0
.end method
