.class public final Lo/fqr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lo/fty;


# instance fields
.field private a:Lo/fsa;

.field private b:I

.field private d:Ljava/security/Principal;

.field private final e:Ljava/net/InetSocketAddress;

.field private f:[B

.field private g:Lo/fsf;

.field private h:Lo/fqh;

.field private final i:Z

.field private k:I

.field private l:Lo/fqo;

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private n:I

.field private o:I

.field private p:Lo/fqo;

.field private volatile q:J

.field private r:Z

.field private volatile s:J

.field private t:Z

.field private volatile u:J

.field private v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 71
    const-class v0, Lo/fqr;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqr;->c:Lo/fty;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;Z)V
    .locals 2

    .line 168
    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lo/fqr;-><init>(Ljava/net/InetSocketAddress;ZJ)V

    .line 169
    return-void
.end method

.method public constructor <init>(Ljava/net/InetSocketAddress;ZJ)V
    .locals 3

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    const/16 v0, 0x4000

    iput v0, p0, Lo/fqr;->b:I

    .line 91
    const/16 v0, 0x578

    iput v0, p0, Lo/fqr;->k:I

    .line 100
    sget-object v0, Lo/fsf;->b:Lo/fsf;

    iput-object v0, p0, Lo/fqr;->g:Lo/fsf;

    .line 102
    sget-object v0, Lo/fqh;->e:Lo/fqh;

    iput-object v0, p0, Lo/fqr;->h:Lo/fqh;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqr;->f:[B

    .line 119
    new-instance v0, Lo/fqo;

    invoke-direct {v0}, Lo/fqo;-><init>()V

    iput-object v0, p0, Lo/fqr;->p:Lo/fqo;

    .line 124
    new-instance v0, Lo/fqo;

    invoke-direct {v0}, Lo/fqo;-><init>()V

    iput-object v0, p0, Lo/fqr;->l:Lo/fqo;

    .line 129
    const/4 v0, 0x0

    iput v0, p0, Lo/fqr;->o:I

    .line 133
    const/4 v0, 0x0

    iput v0, p0, Lo/fqr;->n:I

    .line 138
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/fqr;->m:Ljava/util/Map;

    .line 144
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fqr;->r:Z

    .line 150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fqr;->t:Z

    .line 152
    const-wide/16 v0, 0x3f

    iput-wide v0, p0, Lo/fqr;->u:J

    .line 153
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fqr;->q:J

    .line 154
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fqr;->s:J

    .line 218
    if-nez p1, :cond_0

    .line 219
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Peer address must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p3, v0

    if-ltz v0, :cond_1

    const-wide v0, 0xffffffffffffL

    cmp-long v0, p3, v0

    if-lez v0, :cond_2

    .line 221
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Initial sequence number must be greater than 0 and less than 2^48"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fqr;->v:J

    .line 224
    iput-object p1, p0, Lo/fqr;->e:Ljava/net/InetSocketAddress;

    .line 225
    iput-boolean p2, p0, Lo/fqr;->i:Z

    .line 226
    iget-object v0, p0, Lo/fqr;->m:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    return-void
.end method

.method public constructor <init>(Lo/fsa;Ljava/net/InetSocketAddress;Lo/fsc;J)V
    .locals 1

    .line 194
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p4, p5}, Lo/fqr;-><init>(Ljava/net/InetSocketAddress;ZJ)V

    .line 195
    iput-object p1, p0, Lo/fqr;->a:Lo/fsa;

    .line 196
    invoke-virtual {p3}, Lo/fsc;->d()[B

    move-result-object v0

    iput-object v0, p0, Lo/fqr;->f:[B

    .line 197
    invoke-virtual {p3}, Lo/fsc;->c()Ljava/security/Principal;

    move-result-object v0

    iput-object v0, p0, Lo/fqr;->d:Ljava/security/Principal;

    .line 198
    invoke-virtual {p3}, Lo/fsc;->e()Lo/fsf;

    move-result-object v0

    iput-object v0, p0, Lo/fqr;->g:Lo/fsf;

    .line 199
    invoke-virtual {p3}, Lo/fsc;->a()Lo/fqh;

    move-result-object v0

    iput-object v0, p0, Lo/fqr;->h:Lo/fqh;

    .line 200
    return-void
.end method

.method private a(I)V
    .locals 6

    .line 617
    iget-object v0, p0, Lo/fqr;->l:Lo/fqo;

    invoke-virtual {v0}, Lo/fqo;->k()I

    move-result v0

    add-int/2addr v0, p1

    add-int/lit8 v5, v0, 0x35

    .line 618
    iget v0, p0, Lo/fqr;->k:I

    if-gt v5, v0, :cond_0

    .line 619
    iput p1, p0, Lo/fqr;->b:I

    goto :goto_0

    .line 621
    :cond_0
    iget v0, p0, Lo/fqr;->k:I

    add-int/lit8 v0, v0, -0x35

    iget-object v1, p0, Lo/fqr;->l:Lo/fqo;

    invoke-virtual {v1}, Lo/fqo;->k()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/fqr;->b:I

    .line 623
    :goto_0
    sget-object v0, Lo/fqr;->c:Lo/fty;

    const-string v1, "Setting maximum fragment length for peer [{}] to {} bytes"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fqr;->e:Ljava/net/InetSocketAddress;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lo/fqr;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    return-void
.end method

.method private declared-synchronized u()V
    .locals 3

    monitor-enter p0

    .line 361
    :try_start_0
    invoke-direct {p0}, Lo/fqr;->y()V

    .line 362
    iget v0, p0, Lo/fqr;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fqr;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private declared-synchronized w()V
    .locals 5

    monitor-enter p0

    .line 366
    :try_start_0
    iget v0, p0, Lo/fqr;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fqr;->n:I

    .line 369
    iget-object v0, p0, Lo/fqr;->m:Ljava/util/Map;

    iget v1, p0, Lo/fqr;->n:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v4

    monitor-exit p0

    throw v4
.end method

.method private declared-synchronized y()V
    .locals 3

    monitor-enter p0

    .line 795
    const-wide/16 v0, 0x0

    :try_start_0
    iput-wide v0, p0, Lo/fqr;->s:J

    .line 796
    const-wide/16 v0, 0x3f

    iput-wide v0, p0, Lo/fqr;->u:J

    .line 797
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fqr;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 798
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method


# virtual methods
.method public a()Lo/fou;
    .locals 6

    .line 251
    new-instance v0, Lo/fou;

    iget-object v1, p0, Lo/fqr;->e:Ljava/net/InetSocketAddress;

    iget-object v2, p0, Lo/fqr;->d:Ljava/security/Principal;

    iget-object v3, p0, Lo/fqr;->a:Lo/fsa;

    invoke-virtual {v3}, Lo/fsa;->toString()Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lo/fqr;->o:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/fqr;->g:Lo/fsf;

    invoke-virtual {v5}, Lo/fsf;->name()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/fou;-><init>(Ljava/net/InetSocketAddress;Ljava/security/Principal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method a(Ljava/security/Principal;)V
    .locals 2

    .line 685
    if-nez p1, :cond_0

    .line 686
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Peer identity must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 688
    :cond_0
    iput-object p1, p0, Lo/fqr;->d:Ljava/security/Principal;

    .line 689
    return-void
.end method

.method a(Lo/fsa;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lo/fqr;->a:Lo/fsa;

    .line 243
    return-void
.end method

.method declared-synchronized a(J)Z
    .locals 9

    monitor-enter p0

    .line 741
    :try_start_0
    iget-wide v0, p0, Lo/fqr;->u:J

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 742
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 746
    :cond_0
    iget-wide v0, p0, Lo/fqr;->q:J

    sub-long v5, p1, v0

    .line 748
    long-to-int v0, v5

    const-wide/16 v1, 0x1

    shl-long v7, v1, v0

    .line 749
    sget-object v0, Lo/fqr;->c:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 750
    sget-object v0, Lo/fqr;->c:Lo/fty;

    const-string v1, "Checking sequence no [{}] using bit mask [{}] against received records [{}] with lower boundary [{}]"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v7, v8}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-wide v3, p0, Lo/fqr;->s:J

    invoke-static {v3, v4}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget-wide v3, p0, Lo/fqr;->q:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    :cond_1
    iget-wide v0, p0, Lo/fqr;->s:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-long/2addr v0, v7

    cmp-long v0, v0, v7

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(I)J
    .locals 6

    monitor-enter p0

    .line 395
    :try_start_0
    iget-object v0, p0, Lo/fqr;->m:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 396
    const-wide v0, 0xffffffffffffL

    cmp-long v0, v4, v0

    if-gez v0, :cond_0

    .line 397
    iget-object v0, p0, Lo/fqr;->m:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-wide/16 v2, 0x1

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    monitor-exit p0

    return-wide v4

    .line 403
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Maximum sequence number for epoch has been reached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method b()Lo/fsf;
    .locals 1

    .line 267
    iget-object v0, p0, Lo/fqr;->g:Lo/fsf;

    return-object v0
.end method

.method public declared-synchronized b(JJ)V
    .locals 7

    monitor-enter p0

    .line 772
    :try_start_0
    invoke-virtual {p0}, Lo/fqr;->h()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, p1, v0

    if-nez v0, :cond_1

    .line 773
    iget-wide v0, p0, Lo/fqr;->u:J

    cmp-long v0, p3, v0

    if-lez v0, :cond_0

    .line 774
    iget-wide v0, p0, Lo/fqr;->u:J

    sub-long v5, p3, v0

    .line 775
    iput-wide p3, p0, Lo/fqr;->u:J

    .line 777
    iget-wide v0, p0, Lo/fqr;->s:J

    long-to-int v2, v5

    ushr-long/2addr v0, v2

    iput-wide v0, p0, Lo/fqr;->s:J

    .line 778
    iget-wide v0, p0, Lo/fqr;->u:J

    const-wide/16 v2, 0x40

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lo/fqr;->q:J

    .line 780
    :cond_0
    iget-wide v0, p0, Lo/fqr;->q:J

    sub-long v0, p3, v0

    long-to-int v0, v0

    const-wide/16 v1, 0x1

    shl-long v5, v1, v0

    .line 782
    iget-wide v0, p0, Lo/fqr;->s:J

    or-long/2addr v0, v5

    iput-wide v0, p0, Lo/fqr;->s:J

    .line 783
    sget-object v0, Lo/fqr;->c:Lo/fty;

    const-string v1, "Updated receive window with sequence number [{}]: new upper boundary [{}], new bit vector [{}]"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-wide v3, p0, Lo/fqr;->u:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-wide v3, p0, Lo/fqr;->s:J

    invoke-static {v3, v4}, Ljava/lang/Long;->toBinaryString(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 786
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized b(Lo/fqo;)V
    .locals 3

    monitor-enter p0

    .line 442
    if-nez p1, :cond_0

    .line 443
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Read state must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 445
    :cond_0
    iput-object p1, p0, Lo/fqr;->p:Lo/fqo;

    .line 446
    invoke-direct {p0}, Lo/fqr;->u()V

    .line 447
    sget-object v0, Lo/fqr;->c:Lo/fty;

    const-string v1, "Setting current read state to{}{}"

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 448
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method b(Lo/fsf;)V
    .locals 2

    .line 283
    if-eqz p1, :cond_0

    sget-object v0, Lo/fsf;->b:Lo/fsf;

    if-ne v0, p1, :cond_1

    .line 284
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Negotiated cipher suite must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 286
    :cond_1
    iput-object p1, p0, Lo/fqr;->g:Lo/fsf;

    .line 288
    return-void
.end method

.method b(Z)V
    .locals 0

    .line 648
    iput-boolean p1, p0, Lo/fqr;->r:Z

    .line 649
    return-void
.end method

.method c()Lo/fqh;
    .locals 1

    .line 303
    iget-object v0, p0, Lo/fqr;->h:Lo/fqh;

    return-object v0
.end method

.method c(I)V
    .locals 5

    .line 606
    const/16 v0, 0x3c

    if-ge p1, v0, :cond_0

    .line 607
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MTU must be at least 60 bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 609
    :cond_0
    sget-object v0, Lo/fqr;->c:Lo/fty;

    const-string v1, "Setting MTU for peer [{}] to {} bytes"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fqr;->e:Ljava/net/InetSocketAddress;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    iput p1, p0, Lo/fqr;->k:I

    .line 612
    invoke-direct {p0, p1}, Lo/fqr;->a(I)V

    .line 614
    return-void
.end method

.method public c(JJ)Z
    .locals 4

    .line 706
    invoke-virtual {p0}, Lo/fqr;->h()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    .line 710
    const/4 v0, 0x0

    return v0

    .line 711
    :cond_0
    invoke-virtual {p0}, Lo/fqr;->h()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    .line 715
    const/4 v0, 0x0

    return v0

    .line 717
    :cond_1
    move-object v2, p0

    monitor-enter v2

    .line 718
    :try_start_0
    iget-wide v0, p0, Lo/fqr;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, p3, v0

    if-gez v0, :cond_2

    .line 721
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 723
    :cond_2
    :try_start_1
    invoke-virtual {p0, p3, p4}, Lo/fqr;->a(J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    monitor-exit v2

    return v0

    .line 725
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public d()Lo/fou;
    .locals 6

    .line 246
    new-instance v0, Lo/fou;

    iget-object v1, p0, Lo/fqr;->e:Ljava/net/InetSocketAddress;

    iget-object v2, p0, Lo/fqr;->d:Ljava/security/Principal;

    iget-object v3, p0, Lo/fqr;->a:Lo/fsa;

    invoke-virtual {v3}, Lo/fsa;->toString()Ljava/lang/String;

    move-result-object v3

    iget v4, p0, Lo/fqr;->n:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lo/fqr;->g:Lo/fsf;

    invoke-virtual {v5}, Lo/fsf;->name()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/fou;-><init>(Ljava/net/InetSocketAddress;Ljava/security/Principal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method d(I)V
    .locals 2

    .line 578
    if-ltz p1, :cond_0

    const/16 v0, 0x4000

    if-le p1, v0, :cond_1

    .line 579
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Max. fragment length must be > 0 and < 16384"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 581
    :cond_1
    invoke-direct {p0, p1}, Lo/fqr;->a(I)V

    .line 583
    return-void
.end method

.method d(Z)V
    .locals 0

    .line 656
    iput-boolean p1, p0, Lo/fqr;->t:Z

    .line 657
    return-void
.end method

.method d([B)V
    .locals 5

    .line 547
    iget-object v0, p0, Lo/fqr;->f:[B

    if-nez v0, :cond_2

    .line 548
    if-nez p1, :cond_0

    .line 549
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Master secret must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 550
    :cond_0
    array-length v0, p1

    const/16 v1, 0x30

    if-eq v0, v1, :cond_1

    .line 551
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Master secret must consist of of exactly %d bytes but has %d bytes"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x30

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    array-length v3, p1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 555
    :cond_1
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqr;->f:[B

    .line 558
    :cond_2
    return-void
.end method

.method public e()Lo/fsa;
    .locals 1

    .line 238
    iget-object v0, p0, Lo/fqr;->a:Lo/fsa;

    return-object v0
.end method

.method e(Lo/fqh;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lo/fqr;->h:Lo/fqh;

    .line 319
    return-void
.end method

.method declared-synchronized e(Lo/fqo;)V
    .locals 3

    monitor-enter p0

    .line 495
    if-nez p1, :cond_0

    .line 496
    :try_start_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Write state must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 498
    :cond_0
    iput-object p1, p0, Lo/fqr;->l:Lo/fqo;

    .line 499
    invoke-direct {p0}, Lo/fqr;->w()V

    .line 501
    iget v0, p0, Lo/fqr;->b:I

    invoke-direct {p0, v0}, Lo/fqr;->a(I)V

    .line 502
    sget-object v0, Lo/fqr;->c:Lo/fty;

    const-string v1, "Setting current write state to{}{}"

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 503
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized f()Lo/fqo;
    .locals 2

    monitor-enter p0

    .line 421
    :try_start_0
    iget-object v0, p0, Lo/fqr;->p:Lo/fqo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized g()J
    .locals 3

    monitor-enter p0

    .line 381
    :try_start_0
    iget v0, p0, Lo/fqr;->n:I

    invoke-virtual {p0, v0}, Lo/fqr;->b(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public h()I
    .locals 1

    .line 348
    iget v0, p0, Lo/fqr;->o:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 331
    iget v0, p0, Lo/fqr;->n:I

    return v0
.end method

.method declared-synchronized k()Lo/fqo;
    .locals 2

    monitor-enter p0

    .line 473
    :try_start_0
    iget-object v0, p0, Lo/fqr;->l:Lo/fqo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method l()Z
    .locals 1

    .line 644
    iget-boolean v0, p0, Lo/fqr;->r:Z

    return v0
.end method

.method final m()Lo/fsf$a;
    .locals 2

    .line 515
    iget-object v0, p0, Lo/fqr;->g:Lo/fsf;

    if-nez v0, :cond_0

    .line 516
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cipher suite has not been set (yet)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 518
    :cond_0
    iget-object v0, p0, Lo/fqr;->g:Lo/fsf;

    invoke-virtual {v0}, Lo/fsf;->c()Lo/fsf$a;

    move-result-object v0

    return-object v0
.end method

.method public n()I
    .locals 1

    .line 640
    iget v0, p0, Lo/fqr;->b:I

    return v0
.end method

.method public o()I
    .locals 2

    .line 591
    iget v0, p0, Lo/fqr;->b:I

    iget-object v1, p0, Lo/fqr;->l:Lo/fqo;

    invoke-virtual {v1}, Lo/fqo;->k()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x35

    return v0
.end method

.method p()[B
    .locals 1

    .line 530
    iget-object v0, p0, Lo/fqr;->f:[B

    return-object v0
.end method

.method public q()Ljava/security/Principal;
    .locals 1

    .line 675
    iget-object v0, p0, Lo/fqr;->d:Ljava/security/Principal;

    return-object v0
.end method

.method public r()Lo/fsc;
    .locals 8

    .line 807
    invoke-virtual {p0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 808
    new-instance v0, Lo/fsc;

    new-instance v1, Lo/frn;

    invoke-direct {v1}, Lo/frn;-><init>()V

    invoke-virtual {p0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v2

    invoke-virtual {v2}, Lo/fqo;->e()Lo/fsf;

    move-result-object v2

    invoke-virtual {p0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v3

    invoke-virtual {v3}, Lo/fqo;->b()Lo/fqh;

    move-result-object v3

    invoke-virtual {p0}, Lo/fqr;->p()[B

    move-result-object v4

    invoke-virtual {p0}, Lo/fqr;->q()Ljava/security/Principal;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lo/fsc;-><init>(Lo/frn;Lo/fsf;Lo/fqh;[BLjava/security/Principal;J)V

    return-object v0

    .line 816
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "session has no valid crypto params, not fully negotiated yet?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method s()Z
    .locals 1

    .line 652
    iget-boolean v0, p0, Lo/fqr;->t:Z

    return v0
.end method

.method public t()Ljava/net/InetSocketAddress;
    .locals 1

    .line 665
    iget-object v0, p0, Lo/fqr;->e:Ljava/net/InetSocketAddress;

    return-object v0
.end method
