.class public Lcom/huawei/openalliance/ad/download/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/download/e$a;,
        Lcom/huawei/openalliance/ad/download/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lcom/huawei/openalliance/ad/download/e;>;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field private final b:[B

.field private final c:J

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:J

.field private j:Ljava/lang/String;

.field private k:Lcom/huawei/openalliance/ad/download/d;

.field private l:Lcom/huawei/openalliance/ad/download/e$a;

.field private m:Lcom/huawei/openalliance/ad/download/e$b;

.field private n:I

.field private o:I

.field private p:Z

.field private q:Lcom/huawei/openalliance/ad/download/g;

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/e;->a:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->b:[B

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->a:Lcom/huawei/openalliance/ad/download/d;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->k:Lcom/huawei/openalliance/ad/download/d;

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$a;->a:Lcom/huawei/openalliance/ad/download/e$a;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->l:Lcom/huawei/openalliance/ad/download/e$a;

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$b;->a:Lcom/huawei/openalliance/ad/download/e$b;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->m:Lcom/huawei/openalliance/ad/download/e$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/download/e;->s:Z

    sget-object v0, Lcom/huawei/openalliance/ad/download/e;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/download/e;->c:J

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/download/e;)I
    .locals 5

    if-nez p1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, p1, Lcom/huawei/openalliance/ad/download/e;->n:I

    iget v1, p0, Lcom/huawei/openalliance/ad/download/e;->n:I

    sub-int v4, v0, v1

    if-nez v4, :cond_2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/download/e;->c:J

    iget-wide v2, p1, Lcom/huawei/openalliance/ad/download/e;->c:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const/4 v4, -0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    :cond_2
    :goto_0
    return v4
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/download/e;->n:I

    return-void
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/download/e;->h:J

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/d;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->b:[B

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->k:Lcom/huawei/openalliance/ad/download/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/e$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->l:Lcom/huawei/openalliance/ad/download/e$a;

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/e$b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->m:Lcom/huawei/openalliance/ad/download/e$b;

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/g;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->q:Lcom/huawei/openalliance/ad/download/g;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->d:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/download/e;->p:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/download/e;->o:I

    return-void
.end method

.method public b(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/download/e;->i:J

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->e:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/download/e;->s:Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->j:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->j:Ljava/lang/String;

    return-void
.end method

.method c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/download/e;->r:Z

    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e;)I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->f:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->f:Ljava/lang/String;

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->g:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/e;->g:Ljava/lang/String;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    if-ne p0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/huawei/openalliance/ad/download/e;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    :goto_0
    return v2
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/download/e;->h:J

    return-wide v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/download/e;->i:J

    return-wide v0
.end method

.method public h()Lcom/huawei/openalliance/ad/download/d;
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/e;->b:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->k:Lcom/huawei/openalliance/ad/download/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()Lcom/huawei/openalliance/ad/download/e$a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->l:Lcom/huawei/openalliance/ad/download/e$a;

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/download/e;->n:I

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/download/e;->o:I

    return v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/download/e;->c:J

    return-wide v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/e;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/download/e;->p:Z

    return v0
.end method

.method public o()Lcom/huawei/openalliance/ad/download/e$b;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->m:Lcom/huawei/openalliance/ad/download/e$b;

    return-object v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/download/e;->s:Z

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/download/e;->r:Z

    return v0
.end method

.method public r()Lcom/huawei/openalliance/ad/download/g;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/e;->q:Lcom/huawei/openalliance/ad/download/g;

    return-object v0
.end method

.method public s()V
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/download/e;->r()Lcom/huawei/openalliance/ad/download/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/download/g;->a(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_0
    return-void
.end method
