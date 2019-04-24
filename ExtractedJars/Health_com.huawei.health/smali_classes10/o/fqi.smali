.class public Lo/fqi;
.super Lo/frd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fqi$5;
    }
.end annotation


# static fields
.field private static final H:Lo/fty;


# instance fields
.field private E:Lo/frn;

.field private J:Ljava/security/interfaces/ECPublicKey;

.field private final L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fsf;>;"
        }
    .end annotation
.end field

.field private M:Ljava/security/cert/CertPath;

.field private N:Ljava/security/PublicKey;

.field protected final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fqf$e;>;"
        }
    .end annotation
.end field

.field protected b:Lo/frs;

.field protected c:Lo/fql;

.field protected final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fqf$e;>;"
        }
    .end annotation
.end field

.field protected e:Ljava/lang/Integer;

.field protected f:Lo/frx;

.field protected g:Lo/fqd;

.field protected h:Lo/fqc;

.field protected i:Lo/fqc;

.field protected k:Lo/fqe;

.field protected l:[B

.field protected final m:Lo/frv;

.field protected n:Lo/frz;

.field protected final o:Lo/fso;

.field protected p:Lo/fsr;

.field protected u:Lo/fse;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 71
    const-class v0, Lo/fqi;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqi;->H:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fqr;Lo/frm;Lo/fsb;Lo/fpz;I)V
    .locals 9

    .line 151
    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual {p4}, Lo/fpz;->p()[Ljava/security/cert/X509Certificate;

    move-result-object v5

    move v6, p5

    invoke-virtual {p4}, Lo/fpz;->v()Lo/fsq;

    move-result-object v7

    const/4 v1, 0x1

    invoke-direct/range {v0 .. v7}, Lo/frd;-><init>(ZLo/fqr;Lo/frm;Lo/fsb;[Ljava/security/cert/X509Certificate;ILo/fsq;)V

    .line 75
    new-instance v0, Lo/frn;

    invoke-direct {v0}, Lo/frn;-><init>()V

    iput-object v0, p0, Lo/fqi;->E:Lo/frn;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqi;->c:Lo/fql;

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqi;->i:Lo/fqc;

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqi;->h:Lo/fqc;

    .line 113
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqi;->g:Lo/fqd;

    .line 114
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqi;->k:Lo/fqe;

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqi;->f:Lo/frx;

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqi;->l:[B

    .line 153
    invoke-virtual {p4}, Lo/fpz;->g()Ljava/security/PrivateKey;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->F:Ljava/security/PrivateKey;

    .line 154
    invoke-virtual {p4}, Lo/fpz;->k()[Ljava/security/cert/X509Certificate;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->G:[Ljava/security/cert/X509Certificate;

    .line 155
    invoke-virtual {p4}, Lo/fpz;->o()Ljava/security/PublicKey;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->I:Ljava/security/PublicKey;

    .line 156
    invoke-virtual {p4}, Lo/fpz;->m()Lo/fso;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->o:Lo/fso;

    .line 157
    invoke-virtual {p4}, Lo/fpz;->l()Lo/frv;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->m:Lo/frv;

    .line 158
    invoke-virtual {p4}, Lo/fpz;->h()[Lo/fsf;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->L:Ljava/util/List;

    .line 159
    invoke-virtual {p4}, Lo/fpz;->e()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->e:Ljava/lang/Integer;

    .line 160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqi;->a:Ljava/util/List;

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fqi;->d:Ljava/util/List;

    .line 165
    iget-object v0, p0, Lo/fqi;->L:Ljava/util/List;

    invoke-static {v0}, Lo/fsf;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 168
    iget-object v0, p0, Lo/fqi;->a:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    iget-object v0, p0, Lo/fqi;->z:[Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fqi;->z:[Ljava/security/cert/X509Certificate;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 170
    invoke-virtual {p4}, Lo/fpz;->t()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 171
    :goto_0
    iget-object v0, p0, Lo/fqi;->a:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v8, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 174
    :cond_1
    iget-object v0, p0, Lo/fqi;->F:Ljava/security/PrivateKey;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/fqi;->I:Ljava/security/PublicKey;

    if-eqz v0, :cond_5

    .line 175
    iget-object v0, p0, Lo/fqi;->G:[Ljava/security/cert/X509Certificate;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/fqi;->G:[Ljava/security/cert/X509Certificate;

    array-length v0, v0

    if-nez v0, :cond_3

    .line 176
    :cond_2
    iget-object v0, p0, Lo/fqi;->d:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 177
    :cond_3
    invoke-virtual {p4}, Lo/fpz;->t()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 178
    iget-object v0, p0, Lo/fqi;->d:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    iget-object v0, p0, Lo/fqi;->d:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 181
    :cond_4
    iget-object v0, p0, Lo/fqi;->d:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->c:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    iget-object v0, p0, Lo/fqi;->d:Ljava/util/List;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    :cond_5
    :goto_1
    return-void
.end method

.method private a(Lo/fql;)V
    .locals 2

    .line 698
    iget-object v0, p0, Lo/fqi;->m:Lo/frv;

    if-eqz v0, :cond_0

    .line 699
    iget-object v0, p0, Lo/fqi;->m:Lo/frv;

    iget-object v1, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/frv;->e(Ljava/net/InetSocketAddress;)Lo/fsr;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->p:Lo/fsr;

    .line 700
    iget-object v0, p0, Lo/fqi;->p:Lo/fsr;

    if-eqz v0, :cond_0

    .line 701
    iget-object v0, p0, Lo/fqi;->p:Lo/fsr;

    invoke-static {v0}, Lo/fry;->d(Lo/fsr;)Lo/fry;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/fql;->d(Lo/frf;)V

    .line 704
    :cond_0
    return-void
.end method

.method private a(Lo/frz;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 458
    iget-object v0, p0, Lo/fqi;->n:Lo/frz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fqi;->n:Lo/frz;

    invoke-virtual {v0}, Lo/frz;->s()I

    move-result v0

    invoke-virtual {p1}, Lo/frz;->s()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 460
    return-void

    .line 462
    :cond_0
    iput-object p1, p0, Lo/fqi;->n:Lo/frz;

    .line 463
    new-instance v6, Lo/fqp;

    invoke-virtual {p0}, Lo/fqi;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v6, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 465
    invoke-direct {p0, v6}, Lo/fqi;->c(Lo/fqp;)V

    .line 473
    sget-object v0, Lo/fqi$5;->d:[I

    invoke-virtual {p0}, Lo/fqi;->a()Lo/fsf$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 475
    :pswitch_0
    new-instance v7, Lo/fqs;

    iget-object v0, p0, Lo/fqi;->x:Lo/fsi;

    invoke-virtual {v0}, Lo/fsi;->d()Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    iget-object v1, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-direct {v7, v0, v1}, Lo/fqs;-><init>(Ljava/security/PublicKey;Ljava/net/InetSocketAddress;)V

    .line 476
    iget-object v0, p0, Lo/fqi;->x:Lo/fsi;

    iget-object v1, p0, Lo/fqi;->J:Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0, v1}, Lo/fsi;->e(Ljava/security/PublicKey;)Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v8

    .line 477
    invoke-virtual {p0, v8}, Lo/fqi;->a([B)V

    .line 478
    goto/16 :goto_1

    .line 480
    :pswitch_1
    iget-object v0, p0, Lo/fqi;->o:Lo/fso;

    invoke-virtual {p0}, Lo/fqi;->i()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fso;->d(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    move-result-object v9

    .line 481
    if-nez v9, :cond_1

    .line 482
    new-instance v10, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    iget-object v2, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v10, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 483
    new-instance v0, Lo/fqx;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No Identity found for peer: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lo/fqi;->i()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v10}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 485
    :cond_1
    iget-object v0, p0, Lo/fqi;->o:Lo/fso;

    invoke-interface {v0, v9}, Lo/fso;->c(Ljava/lang/String;)[B

    move-result-object v10

    .line 486
    if-nez v10, :cond_2

    .line 487
    new-instance v11, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    iget-object v2, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v2}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v11, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 488
    new-instance v0, Lo/fqx;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No preshared secret found for identity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v11}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 490
    :cond_2
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    new-instance v1, Lo/fpu;

    invoke-direct {v1, v9}, Lo/fpu;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/fqr;->a(Ljava/security/Principal;)V

    .line 491
    new-instance v7, Lo/frj;

    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v7, v9, v0}, Lo/frj;-><init>(Ljava/lang/String;Ljava/net/InetSocketAddress;)V

    .line 492
    sget-object v0, Lo/fqi;->H:Lo/fty;

    const-string v1, "Using PSK identity: {}"

    invoke-interface {v0, v1, v9}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 493
    invoke-virtual {p0, v10}, Lo/fqi;->b([B)[B

    move-result-object v8

    .line 494
    invoke-virtual {p0, v8}, Lo/fqi;->a([B)V

    .line 496
    goto :goto_1

    .line 499
    :pswitch_2
    new-instance v7, Lo/frk;

    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v7, v0}, Lo/frk;-><init>(Ljava/net/InetSocketAddress;)V

    .line 502
    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Lo/fqi;->a([B)V

    .line 503
    goto :goto_1

    .line 506
    :goto_0
    new-instance v0, Lo/fqx;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown key exchange algorithm: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lo/fqi;->a()Lo/fsf$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    iget-object v5, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v5}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 510
    :goto_1
    invoke-virtual {p0, v7}, Lo/fqi;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 515
    iget-object v0, p0, Lo/fqi;->g:Lo/fqd;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/fqi;->u:Lo/fse;

    if-eqz v0, :cond_3

    .line 517
    iget-object v0, p0, Lo/fqi;->A:[B

    iget-object v1, p0, Lo/fqi;->c:Lo/fql;

    invoke-virtual {v1}, Lo/fql;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 518
    iget-object v0, p0, Lo/fqi;->A:[B

    iget-object v1, p0, Lo/fqi;->b:Lo/frs;

    invoke-virtual {v1}, Lo/frs;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 519
    iget-object v0, p0, Lo/fqi;->A:[B

    iget-object v1, p0, Lo/fqi;->i:Lo/fqc;

    invoke-virtual {v1}, Lo/fqc;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 520
    iget-object v0, p0, Lo/fqi;->A:[B

    iget-object v1, p0, Lo/fqi;->f:Lo/frx;

    invoke-virtual {v1}, Lo/frx;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 521
    iget-object v0, p0, Lo/fqi;->A:[B

    iget-object v1, p0, Lo/fqi;->g:Lo/fqd;

    invoke-virtual {v1}, Lo/fqd;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 522
    iget-object v0, p0, Lo/fqi;->A:[B

    iget-object v1, p0, Lo/fqi;->n:Lo/frz;

    invoke-virtual {v1}, Lo/frz;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 523
    iget-object v0, p0, Lo/fqi;->A:[B

    iget-object v1, p0, Lo/fqi;->h:Lo/fqc;

    invoke-virtual {v1}, Lo/fqc;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 524
    iget-object v0, p0, Lo/fqi;->A:[B

    invoke-virtual {v7}, Lo/fqk;->a()[B

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsp;->c([B[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->A:[B

    .line 526
    new-instance v0, Lo/fqe;

    iget-object v1, p0, Lo/fqi;->u:Lo/fse;

    iget-object v2, p0, Lo/fqi;->F:Ljava/security/PrivateKey;

    iget-object v3, p0, Lo/fqi;->A:[B

    iget-object v4, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v4}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/fqe;-><init>(Lo/fse;Ljava/security/PrivateKey;[BLjava/net/InetSocketAddress;)V

    iput-object v0, p0, Lo/fqi;->k:Lo/fqe;

    .line 528
    iget-object v0, p0, Lo/fqi;->k:Lo/fqe;

    invoke-virtual {p0, v0}, Lo/fqi;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 534
    :cond_3
    new-instance v9, Lo/fqg;

    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-direct {v9, v0}, Lo/fqg;-><init>(Ljava/net/InetSocketAddress;)V

    .line 535
    invoke-virtual {p0, v9}, Lo/fqi;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 536
    invoke-virtual {p0}, Lo/fqi;->b()V

    .line 544
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->c:Lo/fql;

    invoke-virtual {v1}, Lo/fql;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 545
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->b:Lo/frs;

    invoke-virtual {v1}, Lo/frs;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 546
    iget-object v0, p0, Lo/fqi;->i:Lo/fqc;

    if-eqz v0, :cond_4

    .line 547
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->i:Lo/fqc;

    invoke-virtual {v1}, Lo/fqc;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 549
    :cond_4
    iget-object v0, p0, Lo/fqi;->f:Lo/frx;

    if-eqz v0, :cond_5

    .line 550
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->f:Lo/frx;

    invoke-virtual {v1}, Lo/frx;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 552
    :cond_5
    iget-object v0, p0, Lo/fqi;->g:Lo/fqd;

    if-eqz v0, :cond_6

    .line 553
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->g:Lo/fqd;

    invoke-virtual {v1}, Lo/fqd;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 555
    :cond_6
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->n:Lo/frz;

    invoke-virtual {v1}, Lo/frz;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 557
    iget-object v0, p0, Lo/fqi;->h:Lo/fqc;

    if-eqz v0, :cond_7

    .line 558
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->h:Lo/fqc;

    invoke-virtual {v1}, Lo/fqc;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 560
    :cond_7
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    invoke-virtual {v7}, Lo/fqk;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 562
    iget-object v0, p0, Lo/fqi;->k:Lo/fqe;

    if-eqz v0, :cond_8

    .line 563
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    iget-object v1, p0, Lo/fqi;->k:Lo/fqe;

    invoke-virtual {v1}, Lo/fqe;->a()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 566
    :cond_8
    const/4 v10, 0x0

    .line 568
    :try_start_0
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 574
    goto :goto_2

    .line 569
    :catch_0
    move-exception v11

    .line 570
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot create FINISHED message"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-virtual {p1}, Lo/frz;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 576
    :goto_2
    iget-object v0, p0, Lo/fqi;->D:Ljava/security/MessageDigest;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->l:[B

    .line 577
    new-instance v11, Lo/fqw;

    invoke-virtual {p0}, Lo/fqi;->c()[B

    move-result-object v0

    iget-boolean v1, p0, Lo/fqi;->r:Z

    iget-object v2, p0, Lo/fqi;->l:[B

    iget-object v3, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-direct {v11, v0, v1, v2, v3}, Lo/fqw;-><init>([BZ[BLjava/net/InetSocketAddress;)V

    .line 578
    invoke-virtual {p0, v11}, Lo/fqi;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 582
    invoke-virtual {v11}, Lo/fqw;->a()[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 583
    invoke-virtual {v10}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->l:[B

    .line 585
    iget-object v0, p0, Lo/fqi;->y:Lo/frm;

    invoke-interface {v0, v6}, Lo/frm;->d(Lo/fqp;)V

    .line 586
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b(Lo/fqw;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 307
    invoke-virtual {p0}, Lo/fqi;->c()[B

    move-result-object v0

    iget-object v1, p0, Lo/fqi;->l:[B

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Lo/fqw;->a([BZ[B)V

    .line 308
    sget-object v0, Lo/fra;->o:Lo/fra;

    invoke-virtual {v0}, Lo/fra;->c()I

    move-result v0

    iput v0, p0, Lo/fqi;->t:I

    .line 309
    invoke-virtual {p0}, Lo/fqi;->f()V

    .line 310
    invoke-virtual {p0}, Lo/fqi;->l()V

    .line 311
    return-void
.end method

.method private c(Lo/fqp;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 593
    iget-object v0, p0, Lo/fqi;->g:Lo/fqd;

    if-eqz v0, :cond_3

    .line 595
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 596
    const/4 v0, 0x0

    new-array v3, v0, [B

    .line 597
    iget-object v0, p0, Lo/fqi;->g:Lo/fqd;

    invoke-virtual {p0, v0}, Lo/fqi;->a(Lo/fqd;)Ljava/security/PublicKey;

    move-result-object v4

    .line 598
    if-eqz v4, :cond_0

    .line 599
    invoke-interface {v4}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v3

    .line 601
    :cond_0
    sget-object v0, Lo/fqi;->H:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 602
    sget-object v0, Lo/fqi;->H:Lo/fty;

    const-string v1, "sending CERTIFICATE message with client RawPublicKey [{}] to server"

    invoke-static {v3}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 604
    :cond_1
    new-instance v0, Lo/fqc;

    iget-object v1, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Lo/fqc;-><init>([BLjava/net/InetSocketAddress;)V

    iput-object v0, p0, Lo/fqi;->h:Lo/fqc;

    .line 605
    goto :goto_0

    .line 606
    :cond_2
    iget-object v0, p0, Lo/fqi;->g:Lo/fqd;

    invoke-virtual {p0, v0}, Lo/fqi;->b(Lo/fqd;)[Ljava/security/cert/X509Certificate;

    move-result-object v3

    .line 608
    iget-object v0, p0, Lo/fqi;->g:Lo/fqd;

    invoke-virtual {v0, v3}, Lo/fqd;->a([Ljava/security/cert/X509Certificate;)[Ljava/security/cert/X509Certificate;

    move-result-object v4

    .line 609
    sget-object v0, Lo/fqi;->H:Lo/fty;

    const-string v1, "sending CERTIFICATE message with client certificate chain [length: {}] to server"

    array-length v2, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 610
    new-instance v0, Lo/fqc;

    iget-object v1, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-direct {v0, v4, v1}, Lo/fqc;-><init>([Ljava/security/cert/X509Certificate;Ljava/net/InetSocketAddress;)V

    iput-object v0, p0, Lo/fqi;->h:Lo/fqc;

    .line 612
    :goto_0
    iget-object v0, p0, Lo/fqi;->h:Lo/fqc;

    invoke-virtual {p0, v0}, Lo/fqi;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 614
    :cond_3
    return-void
.end method

.method private d(Lo/fqc;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 399
    iget-object v0, p0, Lo/fqi;->i:Lo/fqc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fqi;->i:Lo/fqc;

    invoke-virtual {v0}, Lo/fqc;->s()I

    move-result v0

    invoke-virtual {p1}, Lo/fqc;->s()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 401
    return-void

    .line 404
    :cond_0
    iput-object p1, p0, Lo/fqi;->i:Lo/fqc;

    .line 405
    iget-object v0, p0, Lo/fqi;->i:Lo/fqc;

    invoke-virtual {p0, v0}, Lo/fqi;->a(Lo/fqc;)V

    .line 406
    iget-object v0, p0, Lo/fqi;->i:Lo/fqc;

    invoke-virtual {v0}, Lo/fqc;->h()Ljava/security/PublicKey;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->N:Ljava/security/PublicKey;

    .line 407
    invoke-virtual {p1}, Lo/fqc;->f()Ljava/security/cert/CertPath;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->M:Ljava/security/cert/CertPath;

    .line 408
    return-void
.end method

.method private e(Lo/fqv;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 422
    iget-object v0, p0, Lo/fqi;->f:Lo/frx;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fqi;->f:Lo/frx;

    invoke-virtual {v0}, Lo/frx;->s()I

    move-result v0

    invoke-virtual {p1}, Lo/fqv;->s()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 424
    return-void

    .line 427
    :cond_0
    iput-object p1, p0, Lo/fqi;->f:Lo/frx;

    .line 428
    iget-object v0, p0, Lo/fqi;->N:Ljava/security/PublicKey;

    iget-object v1, p0, Lo/fqi;->q:Lo/fro;

    iget-object v2, p0, Lo/fqi;->v:Lo/fro;

    invoke-virtual {p1, v0, v1, v2}, Lo/fqv;->c(Ljava/security/PublicKey;Lo/fro;Lo/fro;)V

    .line 430
    iget-object v0, p0, Lo/fqi;->M:Ljava/security/cert/CertPath;

    if-eqz v0, :cond_1

    .line 431
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    new-instance v1, Lo/fpx;

    iget-object v2, p0, Lo/fqi;->M:Ljava/security/cert/CertPath;

    invoke-direct {v1, v2}, Lo/fpx;-><init>(Ljava/security/cert/CertPath;)V

    invoke-virtual {v0, v1}, Lo/fqr;->a(Ljava/security/Principal;)V

    goto :goto_0

    .line 433
    :cond_1
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    new-instance v1, Lo/fpv;

    iget-object v2, p0, Lo/fqi;->N:Ljava/security/PublicKey;

    invoke-direct {v1, v2}, Lo/fpv;-><init>(Ljava/security/PublicKey;)V

    invoke-virtual {v0, v1}, Lo/fqr;->a(Ljava/security/Principal;)V

    .line 435
    :goto_0
    invoke-virtual {p1}, Lo/fqv;->k()Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->J:Ljava/security/interfaces/ECPublicKey;

    .line 437
    :try_start_0
    new-instance v0, Lo/fsi;

    iget-object v1, p0, Lo/fqi;->J:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fsi;-><init>(Ljava/security/spec/ECParameterSpec;)V

    iput-object v0, p0, Lo/fqi;->x:Lo/fsi;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 444
    goto :goto_1

    .line 438
    :catch_0
    move-exception v6

    .line 439
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot create ephemeral keys from domain params provided by server: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-virtual {p0}, Lo/fqi;->i()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 445
    :goto_1
    return-void
.end method

.method private m()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 321
    iget v0, p0, Lo/fqi;->t:I

    sget-object v1, Lo/fra;->b:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->c()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 322
    invoke-virtual {p0}, Lo/fqi;->e()V

    .line 326
    :cond_0
    return-void
.end method


# virtual methods
.method a(Lo/fqd;)Ljava/security/PublicKey;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 626
    iget-object v0, p0, Lo/fqi;->I:Ljava/security/PublicKey;

    if-nez v0, :cond_0

    .line 627
    new-instance v0, Lo/fqx;

    const-string v1, "no public key configured"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-virtual {p0}, Lo/fqi;->i()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 630
    :cond_0
    iget-object v0, p0, Lo/fqi;->I:Ljava/security/PublicKey;

    invoke-virtual {p1, v0}, Lo/fqd;->d(Ljava/security/PublicKey;)Lo/fse;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->u:Lo/fse;

    .line 631
    iget-object v0, p0, Lo/fqi;->u:Lo/fse;

    if-nez v0, :cond_1

    .line 632
    const/4 v0, 0x0

    return-object v0

    .line 634
    :cond_1
    iget-object v0, p0, Lo/fqi;->I:Ljava/security/PublicKey;

    return-object v0
.end method

.method protected a(Lo/frs;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 358
    iget-object v0, p0, Lo/fqi;->b:Lo/frs;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo/frs;->s()I

    move-result v0

    iget-object v1, p0, Lo/fqi;->b:Lo/frs;

    invoke-virtual {v1}, Lo/frs;->s()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 360
    return-void

    .line 362
    :cond_0
    iput-object p1, p0, Lo/fqi;->b:Lo/frs;

    .line 365
    invoke-virtual {p1}, Lo/frs;->i()Lo/frn;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->s:Lo/frn;

    .line 366
    invoke-virtual {p1}, Lo/frs;->k()Lo/fro;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->v:Lo/fro;

    .line 367
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {p1}, Lo/frs;->h()Lo/fsa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fqr;->a(Lo/fsa;)V

    .line 368
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {p1}, Lo/frs;->f()Lo/fsf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fqr;->b(Lo/fsf;)V

    .line 369
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {p1}, Lo/frs;->m()Lo/fqh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fqr;->e(Lo/fqh;)V

    .line 370
    invoke-virtual {p1}, Lo/frs;->n()Lo/frh;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 371
    invoke-virtual {p1}, Lo/frs;->n()Lo/frh;

    move-result-object v0

    invoke-virtual {v0}, Lo/frh;->c()Lo/frh$d;

    move-result-object v6

    .line 372
    invoke-virtual {v6}, Lo/frh$d;->a()I

    move-result v0

    iget-object v1, p0, Lo/fqi;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 374
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v6}, Lo/frh$d;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fqr;->d(I)V

    goto :goto_0

    .line 376
    :cond_1
    new-instance v0, Lo/fqx;

    const-string v1, "Server wants to use other max. fragment size than proposed"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->o:Lo/fqb$b;

    invoke-virtual {p1}, Lo/frs;->e()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 384
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    iget-object v2, p0, Lo/fqi;->b:Lo/frs;

    invoke-virtual {v2}, Lo/frs;->p()Lo/fqf$e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/fqf$e;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/fqr;->b(Z)V

    .line 385
    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    sget-object v1, Lo/fqf$e;->e:Lo/fqf$e;

    iget-object v2, p0, Lo/fqi;->b:Lo/frs;

    invoke-virtual {v2}, Lo/frs;->l()Lo/fqf$e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/fqf$e;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/fqr;->d(Z)V

    .line 386
    return-void
.end method

.method protected declared-synchronized b(Lo/fqm;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    .line 199
    :try_start_0
    sget-object v0, Lo/fqi;->H:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    const-string v0, "Processing %s message from peer [%s]"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    sget-object v0, Lo/fqi;->H:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    const-string v0, ":"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 207
    :cond_0
    sget-object v0, Lo/fqi;->H:Lo/fty;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 210
    :cond_1
    sget-object v0, Lo/fqi$5;->c:[I

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 212
    :pswitch_0
    goto/16 :goto_4

    .line 216
    :pswitch_1
    invoke-virtual {p0}, Lo/fqi;->d()V

    .line 217
    sget-object v0, Lo/fqi;->H:Lo/fty;

    const-string v1, "Processed {} message from peer [{}]"

    invoke-interface {p1}, Lo/fqm;->b()Lo/fqn;

    move-result-object v2

    invoke-interface {p1}, Lo/fqm;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    goto/16 :goto_4

    .line 222
    :pswitch_2
    iget-object v0, p0, Lo/fqi;->y:Lo/frm;

    invoke-interface {v0}, Lo/frm;->c()V

    .line 223
    move-object v6, p1

    check-cast v6, Lo/fqy;

    .line 225
    sget-object v0, Lo/fqi$5;->a:[I

    invoke-virtual {v6}, Lo/fqy;->c()Lo/fra;

    move-result-object v1

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_1

    .line 227
    :pswitch_3
    invoke-direct {p0}, Lo/fqi;->m()V

    .line 228
    goto/16 :goto_2

    .line 231
    :pswitch_4
    move-object v0, v6

    check-cast v0, Lo/frc;

    invoke-virtual {p0, v0}, Lo/fqi;->b(Lo/frc;)V

    .line 232
    goto/16 :goto_2

    .line 235
    :pswitch_5
    move-object v0, v6

    check-cast v0, Lo/frs;

    invoke-virtual {p0, v0}, Lo/fqi;->a(Lo/frs;)V

    .line 236
    goto/16 :goto_2

    .line 239
    :pswitch_6
    move-object v0, v6

    check-cast v0, Lo/fqc;

    invoke-direct {p0, v0}, Lo/fqi;->d(Lo/fqc;)V

    .line 240
    goto/16 :goto_2

    .line 244
    :pswitch_7
    sget-object v0, Lo/fqi$5;->d:[I

    invoke-virtual {p0}, Lo/fqi;->a()Lo/fsf$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_2

    goto :goto_0

    .line 246
    :pswitch_8
    move-object v0, v6

    check-cast v0, Lo/fqv;

    invoke-direct {p0, v0}, Lo/fqi;->e(Lo/fqv;)V

    .line 247
    goto/16 :goto_2

    .line 250
    :pswitch_9
    move-object v0, v6

    check-cast v0, Lo/fri;

    iput-object v0, p0, Lo/fqi;->f:Lo/frx;

    .line 251
    goto/16 :goto_2

    .line 254
    :pswitch_a
    sget-object v0, Lo/fqi;->H:Lo/fty;

    const-string v1, "Received unexpected ServerKeyExchange message in NULL key exchange mode."

    invoke-interface {v0, v1}, Lo/fty;->e(Ljava/lang/String;)V

    .line 255
    goto/16 :goto_2

    .line 258
    :goto_0
    new-instance v0, Lo/fqx;

    const-string v1, "Unsupported key exchange algorithm %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/fqi;->a()Lo/fsf$a;

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

    .line 266
    :pswitch_b
    move-object v0, v6

    check-cast v0, Lo/fqd;

    iput-object v0, p0, Lo/fqi;->g:Lo/fqd;

    .line 267
    goto :goto_2

    .line 270
    :pswitch_c
    move-object v0, v6

    check-cast v0, Lo/frz;

    invoke-direct {p0, v0}, Lo/fqi;->a(Lo/frz;)V

    .line 271
    invoke-virtual {p0}, Lo/fqi;->n()V

    .line 272
    goto :goto_2

    .line 275
    :pswitch_d
    move-object v0, v6

    check-cast v0, Lo/fqw;

    invoke-direct {p0, v0}, Lo/fqi;->b(Lo/fqw;)V

    .line 276
    goto :goto_2

    .line 279
    :goto_1
    new-instance v0, Lo/fqx;

    const-string v1, "Received unexpected handshake message [%s] from peer %s"

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

    .line 284
    :goto_2
    invoke-virtual {p0}, Lo/fqi;->g()V

    .line 285
    sget-object v0, Lo/fqi;->H:Lo/fty;

    const-string v1, "Processed {} message with sequence no [{}] from peer [{}]"

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

    invoke-virtual {v6}, Lo/fqy;->e()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    goto :goto_4

    .line 290
    :goto_3
    new-instance v0, Lo/fqx;

    const-string v1, "Received unexpected message [%s] from peer %s"

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

    .line 294
    :goto_4
    monitor-exit p0

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected b(Lo/frc;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 340
    iget-object v0, p0, Lo/fqi;->c:Lo/fql;

    invoke-virtual {p1}, Lo/frc;->f()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fql;->e([B)V

    .line 342
    iget-object v0, p0, Lo/fqi;->c:Lo/fql;

    iget-object v1, p0, Lo/fqi;->c:Lo/fql;

    invoke-virtual {v1}, Lo/fql;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fql;->e(I)V

    .line 344
    new-instance v2, Lo/fqp;

    invoke-virtual {p0}, Lo/fqi;->k()Lo/fqr;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 345
    iget-object v0, p0, Lo/fqi;->c:Lo/fql;

    invoke-virtual {p0, v0}, Lo/fqi;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 346
    iget-object v0, p0, Lo/fqi;->y:Lo/frm;

    invoke-interface {v0, v2}, Lo/frm;->d(Lo/fqp;)V

    .line 347
    return-void
.end method

.method b(Lo/fqd;)[Ljava/security/cert/X509Certificate;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 650
    iget-object v0, p0, Lo/fqi;->G:[Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    .line 651
    new-instance v0, Lo/fqx;

    const-string v1, "no client certificate configured"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-virtual {p0}, Lo/fqi;->i()Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 654
    :cond_0
    iget-object v0, p0, Lo/fqi;->G:[Ljava/security/cert/X509Certificate;

    invoke-virtual {p1, v0}, Lo/fqd;->c([Ljava/security/cert/X509Certificate;)Lo/fse;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->u:Lo/fse;

    .line 655
    iget-object v0, p0, Lo/fqi;->u:Lo/fse;

    if-nez v0, :cond_1

    .line 656
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/security/cert/X509Certificate;

    return-object v0

    .line 658
    :cond_1
    iget-object v0, p0, Lo/fqi;->G:[Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method public e()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 665
    invoke-virtual {p0}, Lo/fqi;->h()V

    .line 667
    new-instance v0, Lo/fql;

    iget-object v1, p0, Lo/fqi;->E:Lo/frn;

    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    iget-object v3, p0, Lo/fqi;->L:Ljava/util/List;

    iget-object v4, p0, Lo/fqi;->d:Ljava/util/List;

    iget-object v5, p0, Lo/fqi;->a:Ljava/util/List;

    iget-object v6, p0, Lo/fqi;->w:Lo/fqr;

    invoke-virtual {v6}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lo/fql;-><init>(Lo/frn;Ljava/security/SecureRandom;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/net/InetSocketAddress;)V

    move-object v7, v0

    .line 672
    invoke-virtual {v7}, Lo/fql;->f()Lo/fro;

    move-result-object v0

    iput-object v0, p0, Lo/fqi;->q:Lo/fro;

    .line 674
    sget-object v0, Lo/fqh;->e:Lo/fqh;

    invoke-virtual {v7, v0}, Lo/fql;->b(Lo/fqh;)V

    .line 675
    iget-object v0, p0, Lo/fqi;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 676
    new-instance v8, Lo/frh;

    iget-object v0, p0, Lo/fqi;->e:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v8, v0}, Lo/frh;-><init>(I)V

    .line 677
    invoke-virtual {v7, v8}, Lo/fql;->d(Lo/frf;)V

    .line 678
    sget-object v0, Lo/fqi;->H:Lo/fty;

    const-string v1, "Indicating max. fragment length [{}] to server [{}]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fqi;->e:Ljava/lang/Integer;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lo/fqi;->i()Ljava/net/InetSocketAddress;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    :cond_0
    invoke-direct {p0, v7}, Lo/fqi;->a(Lo/fql;)V

    .line 686
    invoke-virtual {v7}, Lo/fql;->c()Lo/fra;

    move-result-object v0

    invoke-virtual {v0}, Lo/fra;->c()I

    move-result v0

    iput v0, p0, Lo/fqi;->t:I

    .line 689
    iput-object v7, p0, Lo/fqi;->c:Lo/fql;

    .line 690
    new-instance v8, Lo/fqp;

    iget-object v0, p0, Lo/fqi;->w:Lo/fqr;

    invoke-direct {v8, v0}, Lo/fqp;-><init>(Lo/fqr;)V

    .line 691
    invoke-virtual {p0, v7}, Lo/fqi;->e(Lo/fqm;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fqp;->d(Ljava/util/List;)V

    .line 693
    iget-object v0, p0, Lo/fqi;->y:Lo/frm;

    invoke-interface {v0, v8}, Lo/frm;->d(Lo/fqp;)V

    .line 694
    return-void
.end method
