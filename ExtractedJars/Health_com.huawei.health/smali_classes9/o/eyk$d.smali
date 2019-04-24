.class Lo/eyk$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ezv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/eic;Lo/eyk$h;>;"
        }
    .end annotation
.end field

.field private c:Lo/eic;

.field final synthetic d:Lo/eyk;

.field private e:Lo/eic;


# direct methods
.method public constructor <init>(Lo/eyk;)V
    .locals 1

    .line 382
    iput-object p1, p0, Lo/eyk$d;->d:Lo/eyk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 378
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/eyk$d;->b:Ljava/util/Map;

    .line 379
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk$d;->c:Lo/eic;

    .line 380
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk$d;->e:Lo/eic;

    .line 383
    return-void
.end method

.method static synthetic a(Lo/eyk$d;)Lo/eic;
    .locals 1

    .line 376
    iget-object v0, p0, Lo/eyk$d;->c:Lo/eic;

    return-object v0
.end method

.method static synthetic a(Lo/eyk$d;Lo/eic;)Lo/eic;
    .locals 0

    .line 376
    iput-object p1, p0, Lo/eyk$d;->e:Lo/eic;

    return-object p1
.end method

.method static synthetic b(Lo/eyk$d;)Ljava/util/Map;
    .locals 1

    .line 376
    iget-object v0, p0, Lo/eyk$d;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public b(Lo/eic;)V
    .locals 2

    .line 450
    iget-object v0, p0, Lo/eyk$d;->d:Lo/eyk;

    monitor-enter v0

    .line 451
    :try_start_0
    iput-object p1, p0, Lo/eyk$d;->e:Lo/eic;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 452
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 453
    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 386
    iget-object v0, p0, Lo/eyk$d;->d:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->a(Lo/eyk;)Lo/faa;

    move-result-object v0

    new-instance v1, Lo/eyk$d$3;

    invoke-direct {v1, p0}, Lo/eyk$d$3;-><init>(Lo/eyk$d;)V

    invoke-virtual {v0, v1}, Lo/faa;->b(Lo/faa$b;)V

    .line 418
    return-void
.end method

.method public d(Lo/eic;IILo/eie;)V
    .locals 4

    .line 431
    iget-object v1, p0, Lo/eyk$d;->d:Lo/eyk;

    monitor-enter v1

    .line 432
    :try_start_0
    new-instance v2, Lo/eyk$h;

    invoke-direct {v2, p1, p2, p3, p4}, Lo/eyk$h;-><init>(Lo/eic;IILo/eie;)V

    .line 433
    iget-object v0, p0, Lo/eyk$d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    iput-object p1, p0, Lo/eyk$d;->c:Lo/eic;

    .line 435
    iget-object v0, p0, Lo/eyk$d;->e:Lo/eic;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lo/eyk$d;->d:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->h(Lo/eyk;)Lo/ezv;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Lo/eyk$d;->d:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->h(Lo/eyk;)Lo/ezv;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lo/ezv;->d(Lo/eic;IILo/eie;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 438
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3

    .line 439
    :goto_0
    return-void
.end method

.method public e()V
    .locals 3

    .line 442
    iget-object v1, p0, Lo/eyk$d;->d:Lo/eyk;

    monitor-enter v1

    .line 443
    :try_start_0
    iget-object v0, p0, Lo/eyk$d;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 444
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk$d;->e:Lo/eic;

    .line 445
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyk$d;->c:Lo/eic;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 446
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 447
    :goto_0
    return-void
.end method
