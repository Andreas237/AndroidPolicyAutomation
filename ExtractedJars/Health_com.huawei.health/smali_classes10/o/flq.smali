.class public abstract Lo/flq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final a:Lo/fty;


# instance fields
.field private volatile b:Lo/flz;

.field private c:Lo/flr;

.field private d:Lo/flj$e;

.field private volatile e:I

.field private volatile f:Lo/fow;

.field private g:[B

.field private volatile h:Z

.field private volatile i:Z

.field private volatile k:Lo/fow;

.field private volatile l:Z

.field private volatile m:Z

.field private volatile n:Ljava/lang/Throwable;

.field private volatile o:Z

.field private volatile p:Z

.field private volatile r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fls;>;"
        }
    .end annotation
.end field

.field private volatile t:[B

.field private final u:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Ljava/util/List<Lo/fls;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 81
    const-class v0, Lo/flq;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/flq;->a:Lo/fty;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    const/4 v0, -0x1

    iput v0, p0, Lo/flq;->e:I

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flq;->b:Lo/flz;

    .line 154
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/flq;->u:Ljava/util/concurrent/atomic/AtomicReference;

    .line 162
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flq;->r:Ljava/util/List;

    .line 174
    return-void
.end method

.method public constructor <init>(Lo/flj$e;)V
    .locals 1

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    const/4 v0, -0x1

    iput v0, p0, Lo/flq;->e:I

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flq;->b:Lo/flz;

    .line 154
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/flq;->u:Ljava/util/concurrent/atomic/AtomicReference;

    .line 162
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flq;->r:Ljava/util/List;

    .line 184
    iput-object p1, p0, Lo/flq;->d:Lo/flj$e;

    .line 185
    return-void
.end method

.method private G()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fls;>;"
        }
    .end annotation

    .line 905
    iget-object v0, p0, Lo/flq;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 906
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 907
    iget-object v0, p0, Lo/flq;->u:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 908
    iget-object v0, p0, Lo/flq;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 909
    if-eqz v4, :cond_0

    .line 910
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flq;->r:Ljava/util/List;

    .line 913
    :cond_0
    return-object v3
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 825
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/flq;->e(Z)V

    .line 826
    return-void
.end method

.method public B()V
    .locals 5

    .line 833
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fls;

    .line 836
    :try_start_0
    invoke-interface {v3}, Lo/fls;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 839
    goto :goto_1

    .line 837
    :catch_0
    move-exception v4

    .line 838
    sget-object v0, Lo/flq;->a:Lo/fty;

    const-string v1, "Faulty MessageObserver for retransmitting events"

    invoke-interface {v0, v1, v4}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 840
    :goto_1
    goto :goto_0

    .line 841
    :cond_0
    return-void
.end method

.method public C()[B
    .locals 1

    .line 771
    iget-object v0, p0, Lo/flq;->t:[B

    return-object v0
.end method

.method public D()Z
    .locals 1

    .line 751
    iget-boolean v0, p0, Lo/flq;->o:Z

    return v0
.end method

.method public a()I
    .locals 1

    .line 246
    iget v0, p0, Lo/flq;->e:I

    return v0
.end method

.method public a(Z)V
    .locals 3

    .line 651
    iput-boolean p1, p0, Lo/flq;->p:Z

    .line 652
    if-eqz p1, :cond_0

    .line 653
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

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

    check-cast v2, Lo/fls;

    .line 654
    invoke-interface {v2}, Lo/fls;->c()V

    .line 655
    goto :goto_0

    .line 657
    :cond_0
    return-void
.end method

.method public a([B)V
    .locals 0

    .line 782
    iput-object p1, p0, Lo/flq;->t:[B

    .line 783
    return-void
.end method

.method public b()Lo/flj$e;
    .locals 1

    .line 195
    iget-object v0, p0, Lo/flq;->d:Lo/flj$e;

    return-object v0
.end method

.method public b(Lo/fls;)V
    .locals 2

    .line 891
    if-nez p1, :cond_0

    .line 892
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 894
    :cond_0
    iget-object v0, p0, Lo/flq;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 895
    if-eqz v1, :cond_1

    .line 896
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 898
    :cond_1
    return-void
.end method

.method public b(Z)V
    .locals 3

    .line 601
    iput-boolean p1, p0, Lo/flq;->h:Z

    .line 602
    if-eqz p1, :cond_0

    .line 603
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

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

    check-cast v2, Lo/fls;

    .line 604
    invoke-interface {v2}, Lo/fls;->d()V

    .line 605
    goto :goto_0

    .line 607
    :cond_0
    return-void
.end method

.method public c(Lo/fow;)Lo/flq;
    .locals 0

    .line 580
    iput-object p1, p0, Lo/flq;->f:Lo/fow;

    .line 581
    return-object p0
.end method

.method public c(Lo/fls;)V
    .locals 1

    .line 863
    if-nez p1, :cond_0

    .line 864
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 866
    :cond_0
    invoke-direct {p0}, Lo/flq;->G()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 867
    return-void
.end method

.method public c(Z)V
    .locals 3

    .line 626
    iput-boolean p1, p0, Lo/flq;->m:Z

    .line 627
    if-eqz p1, :cond_0

    .line 628
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

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

    check-cast v2, Lo/fls;

    .line 629
    invoke-interface {v2}, Lo/fls;->b()V

    .line 630
    goto :goto_0

    .line 632
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 2

    .line 217
    invoke-virtual {p0}, Lo/flq;->b()Lo/flj$e;

    move-result-object v0

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(I)Lo/flq;
    .locals 3

    .line 270
    const v0, 0xffff

    if-gt p1, v0, :cond_0

    const/4 v0, -0x1

    if-ge p1, v0, :cond_1

    .line 271
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The MID must be an unsigned 16-bit number but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 273
    :cond_1
    iput p1, p0, Lo/flq;->e:I

    .line 274
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flq;->t:[B

    .line 275
    return-object p0
.end method

.method public d(Lo/flj$e;)Lo/flq;
    .locals 0

    .line 207
    iput-object p1, p0, Lo/flq;->d:Lo/flj$e;

    .line 208
    return-object p0
.end method

.method public d(Lo/fow;)Lo/flq;
    .locals 0

    .line 567
    iput-object p1, p0, Lo/flq;->k:Lo/fow;

    .line 568
    return-object p0
.end method

.method public d([B)Lo/flq;
    .locals 2

    .line 334
    const/4 v1, 0x0

    .line 335
    if-eqz p1, :cond_0

    .line 336
    new-instance v1, Lo/flz;

    invoke-direct {v1, p1}, Lo/flz;-><init>([B)V

    .line 338
    :cond_0
    invoke-virtual {p0, v1}, Lo/flq;->e(Lo/flz;)Lo/flq;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 3

    .line 737
    iput-object p1, p0, Lo/flq;->n:Ljava/lang/Throwable;

    .line 738
    if-eqz p1, :cond_0

    .line 739
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

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

    check-cast v2, Lo/fls;

    .line 740
    invoke-interface {v2, p1}, Lo/fls;->d(Ljava/lang/Throwable;)V

    .line 741
    goto :goto_0

    .line 743
    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 3

    .line 712
    iput-boolean p1, p0, Lo/flq;->i:Z

    .line 713
    if-eqz p1, :cond_0

    .line 714
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

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

    check-cast v2, Lo/fls;

    .line 715
    invoke-interface {v2}, Lo/fls;->i()V

    .line 716
    goto :goto_0

    .line 718
    :cond_0
    return-void
.end method

.method public d()Z
    .locals 2

    .line 255
    iget v0, p0, Lo/flq;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract e()I
.end method

.method public e(Ljava/lang/String;)Lo/flq;
    .locals 1

    .line 461
    if-nez p1, :cond_0

    .line 462
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flq;->g:[B

    goto :goto_0

    .line 464
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flq;->e([B)Lo/flq;

    .line 466
    :goto_0
    return-object p0
.end method

.method public e(Lo/flr;)Lo/flq;
    .locals 1

    .line 380
    new-instance v0, Lo/flr;

    invoke-direct {v0, p1}, Lo/flr;-><init>(Lo/flr;)V

    iput-object v0, p0, Lo/flq;->c:Lo/flr;

    .line 381
    return-object p0
.end method

.method public e(Lo/flz;)Lo/flq;
    .locals 1

    .line 352
    iput-object p1, p0, Lo/flq;->b:Lo/flz;

    .line 353
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flq;->t:[B

    .line 354
    return-object p0
.end method

.method public e([B)Lo/flq;
    .locals 0

    .line 478
    iput-object p1, p0, Lo/flq;->g:[B

    .line 479
    return-object p0
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fls;>;)V"
        }
    .end annotation

    .line 876
    if-nez p1, :cond_0

    .line 877
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 879
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 880
    invoke-direct {p0}, Lo/flq;->G()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 882
    :cond_1
    return-void
.end method

.method public e(Z)V
    .locals 3

    .line 676
    iput-boolean p1, p0, Lo/flq;->l:Z

    .line 677
    if-eqz p1, :cond_0

    .line 678
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

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

    check-cast v2, Lo/fls;

    .line 679
    invoke-interface {v2}, Lo/fls;->a()V

    .line 680
    goto :goto_0

    .line 682
    :cond_0
    return-void
.end method

.method public e(Lo/fll;)Z
    .locals 2

    .line 794
    invoke-virtual {p0}, Lo/flq;->g()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    invoke-virtual {p1}, Lo/fll;->f()I

    move-result v0

    invoke-virtual {p0}, Lo/flq;->g()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Lo/flr;
    .locals 1

    .line 364
    iget-object v0, p0, Lo/flq;->c:Lo/flr;

    if-nez v0, :cond_0

    .line 365
    new-instance v0, Lo/flr;

    invoke-direct {v0}, Lo/flr;-><init>()V

    iput-object v0, p0, Lo/flq;->c:Lo/flr;

    .line 367
    :cond_0
    iget-object v0, p0, Lo/flq;->c:Lo/flr;

    return-object v0
.end method

.method public g()I
    .locals 1

    .line 391
    iget-object v0, p0, Lo/flq;->g:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/flq;->g:[B

    array-length v0, v0

    :goto_0
    return v0
.end method

.method public h(Z)V
    .locals 0

    .line 762
    iput-boolean p1, p0, Lo/flq;->o:Z

    .line 763
    return-void
.end method

.method public h()Z
    .locals 1

    .line 292
    iget-object v0, p0, Lo/flq;->b:Lo/flz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/flq;->b:Lo/flz;

    invoke-virtual {v0}, Lo/flz;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 319
    iget-object v0, p0, Lo/flq;->b:Lo/flz;

    if-nez v0, :cond_0

    const-string v0, "null"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/flq;->b:Lo/flz;

    invoke-virtual {v0}, Lo/flz;->e()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/fls;>;"
        }
    .end annotation

    .line 849
    iget-object v0, p0, Lo/flq;->r:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 850
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 852
    :cond_0
    iget-object v0, p0, Lo/flq;->r:Ljava/util/List;

    return-object v0
.end method

.method public k()Lo/flz;
    .locals 1

    .line 301
    iget-object v0, p0, Lo/flq;->b:Lo/flz;

    return-object v0
.end method

.method public l()[B
    .locals 1

    .line 400
    iget-object v0, p0, Lo/flq;->g:[B

    return-object v0
.end method

.method public m()I
    .locals 2

    .line 503
    iget-object v1, p0, Lo/flq;->k:Lo/fow;

    .line 504
    if-nez v1, :cond_0

    .line 505
    const/4 v0, -0x1

    return v0

    .line 507
    :cond_0
    invoke-interface {v1}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 3

    .line 410
    iget-object v0, p0, Lo/flq;->g:[B

    if-nez v0, :cond_0

    .line 411
    const-string v0, ""

    return-object v0

    .line 413
    :cond_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/flq;->g:[B

    sget-object v2, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method protected o()Ljava/lang/String;
    .locals 7

    .line 418
    iget-object v0, p0, Lo/flq;->g:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/flq;->g:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 419
    :cond_0
    const-string v0, "no payload"

    return-object v0

    .line 421
    :cond_1
    const/4 v2, 0x1

    .line 422
    iget-object v3, p0, Lo/flq;->g:[B

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-byte v6, v3, v5

    .line 423
    const/16 v0, 0x20

    if-le v0, v6, :cond_2

    .line 424
    packed-switch v6, :pswitch_data_0

    goto :goto_1

    .line 428
    :pswitch_0
    goto :goto_2

    .line 430
    :goto_1
    :pswitch_1
    const/4 v2, 0x0

    .line 431
    goto :goto_3

    .line 422
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 434
    :cond_3
    :goto_3
    if-eqz v2, :cond_5

    .line 435
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v3

    .line 436
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {v3, v0}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 437
    sget-object v0, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {v3, v0}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    .line 438
    iget-object v0, p0, Lo/flq;->g:[B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 439
    const/16 v0, 0x18

    invoke-static {v0}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v5

    .line 440
    const/4 v0, 0x1

    invoke-virtual {v3, v4, v5, v0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v6

    .line 441
    invoke-virtual {v3, v5}, Ljava/nio/charset/CharsetDecoder;->flush(Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;

    .line 442
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    .line 443
    sget-object v0, Ljava/nio/charset/CoderResult;->OVERFLOW:Ljava/nio/charset/CoderResult;

    if-ne v0, v6, :cond_4

    .line 444
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\".. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/flq;->g:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 445
    :cond_4
    invoke-virtual {v6}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v0

    if-nez v0, :cond_5

    .line 446
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 449
    :cond_5
    iget-object v0, p0, Lo/flq;->g:[B

    const/16 v1, 0x100

    invoke-static {v0, v1}, Lo/fli;->e([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p()Ljava/net/InetAddress;
    .locals 2

    .line 489
    iget-object v1, p0, Lo/flq;->k:Lo/fow;

    .line 490
    if-nez v1, :cond_0

    .line 491
    const/4 v0, 0x0

    return-object v0

    .line 493
    :cond_0
    invoke-interface {v1}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/net/InetAddress;
    .locals 2

    .line 517
    iget-object v1, p0, Lo/flq;->f:Lo/fow;

    .line 518
    if-nez v1, :cond_0

    .line 519
    const/4 v0, 0x0

    return-object v0

    .line 521
    :cond_0
    invoke-interface {v1}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0
.end method

.method public r()Lo/fow;
    .locals 1

    .line 555
    iget-object v0, p0, Lo/flq;->f:Lo/fow;

    return-object v0
.end method

.method public s()I
    .locals 2

    .line 531
    iget-object v1, p0, Lo/flq;->f:Lo/fow;

    .line 532
    if-nez v1, :cond_0

    .line 533
    const/4 v0, -0x1

    return v0

    .line 535
    :cond_0
    invoke-interface {v1}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0
.end method

.method public t()Z
    .locals 1

    .line 590
    iget-boolean v0, p0, Lo/flq;->h:Z

    return v0
.end method

.method public u()Lo/fow;
    .locals 1

    .line 546
    iget-object v0, p0, Lo/flq;->k:Lo/fow;

    return-object v0
.end method

.method public v()Z
    .locals 1

    .line 641
    iget-boolean v0, p0, Lo/flq;->p:Z

    return v0
.end method

.method public w()Z
    .locals 1

    .line 615
    iget-boolean v0, p0, Lo/flq;->m:Z

    return v0
.end method

.method public x()Ljava/lang/Throwable;
    .locals 1

    .line 726
    iget-object v0, p0, Lo/flq;->n:Ljava/lang/Throwable;

    return-object v0
.end method

.method public y()Z
    .locals 1

    .line 665
    iget-boolean v0, p0, Lo/flq;->l:Z

    return v0
.end method

.method public z()V
    .locals 3

    .line 690
    invoke-virtual {p0}, Lo/flq;->j()Ljava/util/List;

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

    check-cast v2, Lo/fls;

    .line 691
    invoke-interface {v2}, Lo/fls;->h()V

    .line 692
    goto :goto_0

    .line 693
    :cond_0
    return-void
.end method
