.class public final Lo/fpz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fpz$2;,
        Lo/fpz$e;
    }
.end annotation


# instance fields
.field private a:Ljava/net/InetSocketAddress;

.field private b:[Ljava/security/cert/X509Certificate;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/Boolean;

.field private f:Ljava/lang/Boolean;

.field private g:Ljava/lang/Integer;

.field private h:Lo/fso;

.field private i:Ljava/lang/Integer;

.field private k:Ljava/lang/Boolean;

.field private l:Ljava/security/PublicKey;

.field private m:Lo/fsq;

.field private n:Ljava/security/PrivateKey;

.field private o:[Ljava/security/cert/X509Certificate;

.field private p:[Lo/fsf;

.field private q:Lo/frv;

.field private r:Ljava/lang/Integer;

.field private s:Ljava/lang/Long;

.field private t:Ljava/lang/Integer;

.field private u:Ljava/lang/Integer;

.field private x:Ljava/lang/Long;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    return-void
.end method

.method synthetic constructor <init>(Lo/fpz$2;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lo/fpz;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->k:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic a(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->g:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic a(Lo/fpz;Lo/fsq;)Lo/fsq;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->m:Lo/fsq;

    return-object p1
.end method

.method static synthetic a(Lo/fpz;)[Ljava/security/cert/X509Certificate;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->b:[Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method static synthetic b(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->f:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic b(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->t:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic b(Lo/fpz;)Ljava/security/PublicKey;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->l:Ljava/security/PublicKey;

    return-object v0
.end method

.method static synthetic b(Lo/fpz;[Ljava/security/cert/X509Certificate;)[Ljava/security/cert/X509Certificate;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->b:[Ljava/security/cert/X509Certificate;

    return-object p1
.end method

.method static synthetic c(Lo/fpz;)Ljava/lang/Boolean;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method static synthetic c(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->e:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic c(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->u:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic d(Lo/fpz;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->d:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic d(Lo/fpz;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->i:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic d(Lo/fpz;)Ljava/security/PrivateKey;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->n:Ljava/security/PrivateKey;

    return-object v0
.end method

.method static synthetic d(Lo/fpz;Lo/fso;)Lo/fso;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->h:Lo/fso;

    return-object p1
.end method

.method static synthetic e(Lo/fpz;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->s:Ljava/lang/Long;

    return-object p1
.end method

.method static synthetic e(Lo/fpz;)Ljava/net/InetSocketAddress;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->a:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method static synthetic e(Lo/fpz;Ljava/net/InetSocketAddress;)Ljava/net/InetSocketAddress;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->a:Ljava/net/InetSocketAddress;

    return-object p1
.end method

.method static synthetic e(Lo/fpz;[Lo/fsf;)[Lo/fsf;
    .locals 0

    .line 62
    iput-object p1, p0, Lo/fpz;->p:[Lo/fsf;

    return-object p1
.end method

.method static synthetic f(Lo/fpz;)Ljava/lang/Boolean;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->k:Ljava/lang/Boolean;

    return-object v0
.end method

.method static synthetic g(Lo/fpz;)Ljava/lang/Integer;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic h(Lo/fpz;)Ljava/lang/Boolean;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method static synthetic i(Lo/fpz;)Ljava/lang/Boolean;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->f:Ljava/lang/Boolean;

    return-object v0
.end method

.method static synthetic k(Lo/fpz;)Ljava/lang/Integer;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic l(Lo/fpz;)Ljava/lang/Integer;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->u:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic m(Lo/fpz;)Ljava/lang/Long;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->s:Ljava/lang/Long;

    return-object v0
.end method

.method static synthetic n(Lo/fpz;)Lo/fsq;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->m:Lo/fsq;

    return-object v0
.end method

.method static synthetic o(Lo/fpz;)[Lo/fsf;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->p:[Lo/fsf;

    return-object v0
.end method

.method static synthetic p(Lo/fpz;)Ljava/lang/Integer;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->t:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic u(Lo/fpz;)Lo/fso;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/fpz;->h:Lo/fso;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    .line 184
    iget-object v0, p0, Lo/fpz;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public b()Ljava/lang/Boolean;
    .locals 1

    .line 199
    iget-object v0, p0, Lo/fpz;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public c()Ljava/lang/Boolean;
    .locals 1

    .line 192
    iget-object v0, p0, Lo/fpz;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public d()Ljava/lang/Integer;
    .locals 1

    .line 174
    iget-object v0, p0, Lo/fpz;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    .line 161
    iget-object v0, p0, Lo/fpz;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public f()Ljava/lang/Integer;
    .locals 1

    .line 209
    iget-object v0, p0, Lo/fpz;->u:Ljava/lang/Integer;

    return-object v0
.end method

.method public g()Ljava/security/PrivateKey;
    .locals 1

    .line 257
    iget-object v0, p0, Lo/fpz;->n:Ljava/security/PrivateKey;

    return-object v0
.end method

.method public h()[Lo/fsf;
    .locals 2

    .line 243
    iget-object v0, p0, Lo/fpz;->p:[Lo/fsf;

    if-nez v0, :cond_0

    .line 244
    const/4 v0, 0x0

    new-array v0, v0, [Lo/fsf;

    return-object v0

    .line 246
    :cond_0
    iget-object v0, p0, Lo/fpz;->p:[Lo/fsf;

    iget-object v1, p0, Lo/fpz;->p:[Lo/fsf;

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsf;

    return-object v0
.end method

.method public i()Ljava/net/InetSocketAddress;
    .locals 1

    .line 218
    iget-object v0, p0, Lo/fpz;->a:Ljava/net/InetSocketAddress;

    return-object v0
.end method

.method public k()[Ljava/security/cert/X509Certificate;
    .locals 2

    .line 229
    iget-object v0, p0, Lo/fpz;->o:[Ljava/security/cert/X509Certificate;

    if-nez v0, :cond_0

    .line 230
    const/4 v0, 0x0

    return-object v0

    .line 232
    :cond_0
    iget-object v0, p0, Lo/fpz;->o:[Ljava/security/cert/X509Certificate;

    iget-object v1, p0, Lo/fpz;->o:[Ljava/security/cert/X509Certificate;

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method public l()Lo/frv;
    .locals 1

    .line 283
    iget-object v0, p0, Lo/fpz;->q:Lo/frv;

    return-object v0
.end method

.method public m()Lo/fso;
    .locals 1

    .line 267
    iget-object v0, p0, Lo/fpz;->h:Lo/fso;

    return-object v0
.end method

.method public n()Ljava/lang/Boolean;
    .locals 1

    .line 313
    iget-object v0, p0, Lo/fpz;->k:Ljava/lang/Boolean;

    return-object v0
.end method

.method public o()Ljava/security/PublicKey;
    .locals 1

    .line 293
    iget-object v0, p0, Lo/fpz;->l:Ljava/security/PublicKey;

    return-object v0
.end method

.method public p()[Ljava/security/cert/X509Certificate;
    .locals 1

    .line 303
    iget-object v0, p0, Lo/fpz;->b:[Ljava/security/cert/X509Certificate;

    return-object v0
.end method

.method public q()Ljava/lang/Long;
    .locals 1

    .line 379
    iget-object v0, p0, Lo/fpz;->x:Ljava/lang/Long;

    return-object v0
.end method

.method public r()Ljava/lang/Integer;
    .locals 1

    .line 365
    iget-object v0, p0, Lo/fpz;->r:Ljava/lang/Integer;

    return-object v0
.end method

.method public s()Ljava/lang/Long;
    .locals 1

    .line 354
    iget-object v0, p0, Lo/fpz;->s:Ljava/lang/Long;

    return-object v0
.end method

.method public t()Ljava/lang/Boolean;
    .locals 1

    .line 327
    iget-object v0, p0, Lo/fpz;->f:Ljava/lang/Boolean;

    return-object v0
.end method

.method public u()Ljava/lang/Integer;
    .locals 1

    .line 341
    iget-object v0, p0, Lo/fpz;->t:Ljava/lang/Integer;

    return-object v0
.end method

.method public v()Lo/fsq;
    .locals 1

    .line 387
    iget-object v0, p0, Lo/fpz;->m:Lo/fsq;

    return-object v0
.end method
