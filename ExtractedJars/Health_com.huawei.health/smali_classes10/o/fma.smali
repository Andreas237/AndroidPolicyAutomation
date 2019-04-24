.class public Lo/fma;
.super Lo/flq;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/regex/Pattern;


# instance fields
.field private b:Lo/fly;

.field private final c:Lo/flj$d;

.field private e:Ljava/lang/String;

.field private h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private i:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private k:Ljava/net/InetAddress;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 117
    const-string v0, "(\\[[0-9a-f:]+\\]|[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/fma;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lo/flj$d;)V
    .locals 1

    .line 148
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    invoke-direct {p0, p1, v0}, Lo/fma;-><init>(Lo/flj$d;Lo/flj$e;)V

    .line 149
    return-void
.end method

.method public constructor <init>(Lo/flj$d;Lo/flj$e;)V
    .locals 0

    .line 158
    invoke-direct {p0, p2}, Lo/flq;-><init>(Lo/flj$e;)V

    .line 159
    iput-object p1, p0, Lo/fma;->c:Lo/flj$d;

    .line 160
    return-void
.end method

.method public static L()Lo/fma;
    .locals 2

    .line 816
    new-instance v0, Lo/fma;

    sget-object v1, Lo/flj$d;->d:Lo/flj$d;

    invoke-direct {v0, v1}, Lo/fma;-><init>(Lo/flj$d;)V

    return-object v0
.end method

.method public static M()Lo/fma;
    .locals 2

    .line 826
    new-instance v0, Lo/fma;

    sget-object v1, Lo/flj$d;->c:Lo/flj$d;

    invoke-direct {v0, v1}, Lo/fma;-><init>(Lo/flj$d;)V

    return-object v0
.end method


# virtual methods
.method public E()Lo/flj$d;
    .locals 1

    .line 168
    iget-object v0, p0, Lo/fma;->c:Lo/flj$d;

    return-object v0
.end method

.method public final F()Z
    .locals 1

    .line 618
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->N()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public G()V
    .locals 3

    .line 528
    invoke-virtual {p0}, Lo/fma;->u()Lo/fow;

    move-result-object v2

    .line 529
    if-nez v2, :cond_1

    .line 530
    iget-object v0, p0, Lo/fma;->k:Ljava/net/InetAddress;

    if-nez v0, :cond_0

    .line 531
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "missing destination!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 533
    :cond_0
    new-instance v2, Lo/fox;

    iget-object v0, p0, Lo/fma;->k:Ljava/net/InetAddress;

    iget v1, p0, Lo/fma;->i:I

    invoke-direct {v2, v0, v1}, Lo/fox;-><init>(Ljava/net/InetAddress;I)V

    .line 534
    invoke-super {p0, v2}, Lo/flq;->d(Lo/fow;)Lo/flq;

    .line 536
    :cond_1
    return-void
.end method

.method public H()Ljava/lang/String;
    .locals 13

    .line 400
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->a()Ljava/lang/String;

    move-result-object v8

    .line 401
    if-nez v8, :cond_1

    .line 402
    invoke-virtual {p0}, Lo/fma;->p()Ljava/net/InetAddress;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 403
    invoke-virtual {p0}, Lo/fma;->p()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 406
    :cond_0
    const-string v8, "localhost"

    .line 410
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->g()Ljava/lang/Integer;

    move-result-object v9

    .line 411
    if-nez v9, :cond_2

    .line 412
    invoke-virtual {p0}, Lo/fma;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 414
    :cond_2
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_3

    .line 415
    invoke-virtual {p0}, Lo/fma;->I()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/flj;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 416
    invoke-virtual {p0}, Lo/fma;->I()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/flj;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 417
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_1

    .line 421
    :cond_3
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 425
    :cond_4
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v1

    invoke-virtual {v1}, Lo/flr;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 426
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->r()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0}, Lo/flr;->u()Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :cond_5
    const/4 v11, 0x0

    .line 428
    :goto_2
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-virtual {p0}, Lo/fma;->I()Ljava/lang/String;

    move-result-object v1

    move-object v3, v8

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object v5, v10

    move-object v6, v11

    const/4 v2, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v0

    .line 430
    invoke-virtual {v12}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 431
    :catch_0
    move-exception v12

    .line 432
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot create URI from request"

    invoke-direct {v0, v1, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public I()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lo/fma;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "coap"

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fma;->e:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public N()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 777
    iget-object v0, p0, Lo/fma;->h:Ljava/util/Map;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lo/fma;
    .locals 1

    .line 219
    invoke-super {p0, p1}, Lo/flq;->e(Ljava/lang/String;)Lo/flq;

    .line 220
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lo/fma;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/fma;"
        }
    .end annotation

    .line 787
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 788
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/fma;->h:Ljava/util/Map;

    goto :goto_0

    .line 790
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/fma;->h:Ljava/util/Map;

    .line 792
    :goto_0
    return-object p0
.end method

.method public a(Z)V
    .locals 2

    .line 728
    invoke-super {p0, p1}, Lo/flq;->a(Z)V

    .line 729
    if-eqz p1, :cond_0

    .line 730
    move-object v0, p0

    monitor-enter v0

    .line 731
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 732
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 734
    :cond_0
    :goto_0
    return-void
.end method

.method public b(I)Lo/flq;
    .locals 2

    .line 497
    invoke-virtual {p0}, Lo/fma;->u()Lo/fow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 498
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "destination context already set!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 500
    :cond_0
    iput p1, p0, Lo/fma;->i:I

    .line 501
    return-object p0
.end method

.method public b(Ljava/net/InetAddress;)Lo/flq;
    .locals 2

    .line 463
    invoke-virtual {p0}, Lo/fma;->u()Lo/fow;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 464
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "destination context already set!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 466
    :cond_0
    iput-object p1, p0, Lo/fma;->k:Ljava/net/InetAddress;

    .line 467
    return-object p0
.end method

.method public b(J)Lo/fly;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 698
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    .line 699
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    add-long v5, v3, p1

    goto :goto_0

    :cond_0
    const-wide/16 v5, 0x0

    .line 700
    :goto_0
    move-wide v7, p1

    .line 701
    move-object v9, p0

    monitor-enter v9

    .line 702
    :goto_1
    :try_start_0
    iget-object v0, p0, Lo/fma;->b:Lo/fly;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lo/fma;->y()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lo/fma;->v()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lo/fma;->w()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lo/fma;->x()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_2

    .line 703
    invoke-virtual {p0, v7, v8}, Ljava/lang/Object;->wait(J)V

    .line 704
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v10

    .line 706
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    .line 707
    sub-long v7, v5, v10

    .line 708
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v7

    if-ltz v0, :cond_1

    .line 710
    goto :goto_2

    .line 713
    :cond_1
    goto :goto_1

    .line 714
    :cond_2
    :goto_2
    iget-object v10, p0, Lo/fma;->b:Lo/fly;

    .line 715
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fma;->b:Lo/fly;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 716
    monitor-exit v9

    return-object v10

    .line 717
    :catchall_0
    move-exception v12

    monitor-exit v9

    throw v12
.end method

.method public b(Ljava/net/URI;)Lo/fma;
    .locals 6

    .line 323
    if-nez p1, :cond_0

    .line 324
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "URI must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 325
    :cond_0
    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/flj;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 326
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unsupported URI scheme: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 327
    :cond_1
    invoke-virtual {p1}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 328
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "URI must not contain a fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 329
    :cond_2
    invoke-virtual {p0}, Lo/fma;->p()Ljava/net/InetAddress;

    move-result-object v0

    if-nez v0, :cond_3

    .line 330
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "destination address must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_3
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 334
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 335
    sget-object v0, Lo/fma;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 336
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 340
    :try_start_0
    invoke-static {v3}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v5

    .line 341
    invoke-virtual {p0}, Lo/fma;->p()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 342
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "URI\'s literal host IP address does not match request\'s destination address"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    :cond_4
    goto :goto_0

    .line 345
    :catch_0
    move-exception v5

    .line 348
    sget-object v0, Lo/fma;->a:Lo/fty;

    const-string v1, "could not parse IP address of URI despite successful IP address pattern matching"

    invoke-interface {v0, v1}, Lo/fty;->b(Ljava/lang/String;)V

    .line 349
    goto :goto_0

    .line 353
    :cond_5
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/flr;->d(Ljava/lang/String;)Lo/flr;

    .line 357
    :cond_6
    :goto_0
    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/fma;->e:Ljava/lang/String;

    .line 360
    invoke-virtual {p1}, Ljava/net/URI;->getPort()I

    move-result v3

    .line 361
    if-gtz v3, :cond_7

    .line 362
    iget-object v0, p0, Lo/fma;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/flj;->d(Ljava/lang/String;)I

    move-result v3

    .line 365
    :cond_7
    invoke-virtual {p0, v3}, Lo/fma;->b(I)Lo/flq;

    .line 370
    invoke-virtual {p1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v4

    .line 371
    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_8

    .line 372
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/flr;->c(Ljava/lang/String;)Lo/flr;

    .line 376
    :cond_8
    invoke-virtual {p1}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object v5

    .line 377
    if-eqz v5, :cond_9

    .line 378
    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/flr;->e(Ljava/lang/String;)Lo/flr;

    .line 381
    :cond_9
    return-object p0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lo/fma;->e:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public b(Lo/fly;)V
    .locals 3

    .line 654
    move-object v1, p0

    monitor-enter v1

    .line 655
    :try_start_0
    iput-object p1, p0, Lo/fma;->b:Lo/fly;

    .line 656
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 657
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 659
    :goto_0
    invoke-virtual {p0}, Lo/fma;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fls;

    .line 660
    invoke-interface {v2, p1}, Lo/fls;->a(Lo/fly;)V

    .line 661
    goto :goto_1

    .line 662
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)Lo/fma;
    .locals 4

    .line 248
    if-nez p1, :cond_0

    .line 249
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "URI must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 253
    :cond_0
    move-object v3, p1

    .line 254
    const-string v0, "://"

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 255
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "coap://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 256
    sget-object v0, Lo/fma;->a:Lo/fty;

    const-string v1, "update your code to supply an RFC 7252 compliant URI including a scheme"

    invoke-interface {v0, v1}, Lo/fty;->b(Ljava/lang/String;)V

    .line 258
    :cond_1
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lo/fma;->c(Ljava/net/URI;)Lo/fma;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 259
    :catch_0
    move-exception v3

    .line 260
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "invalid uri: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public c(Ljava/net/URI;)Lo/fma;
    .locals 10

    .line 280
    if-nez p1, :cond_0

    .line 281
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "URI must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 284
    :cond_0
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v8, "localhost"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v8

    .line 287
    :goto_0
    :try_start_0
    invoke-static {v8}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v9

    .line 288
    invoke-virtual {p0, v9}, Lo/fma;->b(Ljava/net/InetAddress;)Lo/flq;

    .line 290
    new-instance v0, Ljava/net/URI;

    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/net/URI;->getPort()I

    move-result v4

    invoke-virtual {p1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x0

    move-object v3, v8

    invoke-direct/range {v0 .. v7}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lo/fma;->b(Ljava/net/URI;)Lo/fma;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 293
    :catch_0
    move-exception v9

    .line 294
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot resolve host name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 295
    :catch_1
    move-exception v9

    .line 298
    sget-object v0, Lo/fma;->a:Lo/fty;

    const-string v1, "cannot set URI on request"

    invoke-interface {v0, v1, v9}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 299
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public c([B)Lo/fma;
    .locals 1

    .line 230
    invoke-super {p0, p1}, Lo/flq;->e([B)Lo/flq;

    .line 231
    return-object p0
.end method

.method public c(Z)V
    .locals 2

    .line 754
    invoke-super {p0, p1}, Lo/flq;->c(Z)V

    .line 755
    if-eqz p1, :cond_0

    .line 756
    move-object v0, p0

    monitor-enter v0

    .line 757
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 758
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 760
    :cond_0
    :goto_0
    return-void
.end method

.method public synthetic d(Lo/fow;)Lo/flq;
    .locals 1

    .line 115
    invoke-virtual {p0, p1}, Lo/fma;->e(Lo/fow;)Lo/fma;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 2

    .line 764
    invoke-super {p0, p1}, Lo/flq;->d(Ljava/lang/Throwable;)V

    .line 765
    if-eqz p1, :cond_0

    .line 766
    move-object v0, p0

    monitor-enter v0

    .line 767
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 768
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 770
    :cond_0
    :goto_0
    return-void
.end method

.method public e()I
    .locals 1

    .line 173
    iget-object v0, p0, Lo/fma;->c:Lo/flj$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fma;->c:Lo/flj$d;

    iget v0, v0, Lo/flj$d;->b:I

    :goto_0
    return v0
.end method

.method public synthetic e(Ljava/lang/String;)Lo/flq;
    .locals 1

    .line 115
    invoke-virtual {p0, p1}, Lo/fma;->a(Ljava/lang/String;)Lo/fma;

    move-result-object v0

    return-object v0
.end method

.method public synthetic e([B)Lo/flq;
    .locals 1

    .line 115
    invoke-virtual {p0, p1}, Lo/fma;->c([B)Lo/fma;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/fow;)Lo/fma;
    .locals 2

    .line 547
    iget-object v0, p0, Lo/fma;->k:Ljava/net/InetAddress;

    if-eqz v0, :cond_0

    .line 548
    iget-object v0, p0, Lo/fma;->k:Ljava/net/InetAddress;

    invoke-interface {p1}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/net/InetAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 549
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "different destination!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 552
    :cond_0
    invoke-super {p0, p1}, Lo/flq;->d(Lo/fow;)Lo/flq;

    .line 553
    return-object p0
.end method

.method public e(Z)V
    .locals 2

    .line 744
    invoke-super {p0, p1}, Lo/flq;->e(Z)V

    .line 745
    if-eqz p1, :cond_0

    .line 746
    move-object v0, p0

    monitor-enter v0

    .line 747
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 748
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 750
    :cond_0
    :goto_0
    return-void
.end method

.method public m()I
    .locals 2

    .line 477
    invoke-virtual {p0}, Lo/fma;->u()Lo/fow;

    move-result-object v1

    .line 478
    if-eqz v1, :cond_0

    .line 479
    invoke-interface {v1}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0

    .line 481
    :cond_0
    iget v0, p0, Lo/fma;->i:I

    return v0
.end method

.method public p()Ljava/net/InetAddress;
    .locals 2

    .line 443
    invoke-virtual {p0}, Lo/fma;->u()Lo/fow;

    move-result-object v1

    .line 444
    if-eqz v1, :cond_0

    .line 445
    invoke-interface {v1}, Lo/fow;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    return-object v0

    .line 447
    :cond_0
    iget-object v0, p0, Lo/fma;->k:Ljava/net/InetAddress;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 802
    invoke-virtual {p0}, Lo/fma;->o()Ljava/lang/String;

    move-result-object v4

    .line 803
    const-string v0, "%s-%-6s MID=%5d, Token=%s, OptionSet=%s, %s"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lo/fma;->b()Lo/flj$e;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fma;->E()Lo/flj$d;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fma;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fma;->i()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/fma;->f()Lo/flr;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
