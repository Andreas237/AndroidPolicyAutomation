.class Lo/fpo$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fpo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lo/fpo$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fpo$d<TK;TV;>;"
        }
    .end annotation
.end field

.field private b:J

.field private c:Lo/fpo$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/fpo$d<TK;TV;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 442
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 443
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fpo$d;->d:Ljava/lang/Object;

    .line 444
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fpo$d;->e:Ljava/lang/Object;

    .line 445
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/fpo$d;->b:J

    .line 446
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 448
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 449
    iput-object p2, p0, Lo/fpo$d;->e:Ljava/lang/Object;

    .line 450
    iput-object p1, p0, Lo/fpo$d;->d:Ljava/lang/Object;

    .line 451
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fpo$d;->b:J

    .line 452
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lo/fpo$2;)V
    .locals 0

    .line 435
    invoke-direct {p0, p1, p2}, Lo/fpo$d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method synthetic constructor <init>(Lo/fpo$2;)V
    .locals 0

    .line 435
    invoke-direct {p0}, Lo/fpo$d;-><init>()V

    return-void
.end method

.method private a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 459
    iget-object v0, p0, Lo/fpo$d;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lo/fpo$d;)V
    .locals 0

    .line 435
    invoke-direct {p0}, Lo/fpo$d;->e()V

    return-void
.end method

.method static synthetic b(Lo/fpo$d;)Ljava/lang/Object;
    .locals 1

    .line 435
    iget-object v0, p0, Lo/fpo$d;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lo/fpo$d;Lo/fpo$d;)Lo/fpo$d;
    .locals 0

    .line 435
    iput-object p1, p0, Lo/fpo$d;->a:Lo/fpo$d;

    return-object p1
.end method

.method static synthetic b(Lo/fpo$d;J)Z
    .locals 1

    .line 435
    invoke-direct {p0, p1, p2}, Lo/fpo$d;->c(J)Z

    move-result v0

    return v0
.end method

.method private c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 455
    iget-object v0, p0, Lo/fpo$d;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lo/fpo$d;)Ljava/lang/Object;
    .locals 1

    .line 435
    invoke-direct {p0}, Lo/fpo$d;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/fpo$d;Lo/fpo$d;)V
    .locals 0

    .line 435
    invoke-direct {p0, p1}, Lo/fpo$d;->k(Lo/fpo$d;)V

    return-void
.end method

.method private c(J)Z
    .locals 4

    .line 463
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/fpo$d;->b:J

    sub-long/2addr v0, v2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lo/fpo$d;)Lo/fpo$d;
    .locals 1

    .line 435
    iget-object v0, p0, Lo/fpo$d;->a:Lo/fpo$d;

    return-object v0
.end method

.method static synthetic d(Lo/fpo$d;Lo/fpo$d;)Lo/fpo$d;
    .locals 0

    .line 435
    iput-object p1, p0, Lo/fpo$d;->c:Lo/fpo$d;

    return-object p1
.end method

.method static synthetic e(Lo/fpo$d;)Ljava/lang/Object;
    .locals 1

    .line 435
    invoke-direct {p0}, Lo/fpo$d;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 480
    iget-object v0, p0, Lo/fpo$d;->c:Lo/fpo$d;

    iget-object v1, p0, Lo/fpo$d;->a:Lo/fpo$d;

    iput-object v1, v0, Lo/fpo$d;->a:Lo/fpo$d;

    .line 481
    iget-object v0, p0, Lo/fpo$d;->a:Lo/fpo$d;

    iget-object v1, p0, Lo/fpo$d;->c:Lo/fpo$d;

    iput-object v1, v0, Lo/fpo$d;->c:Lo/fpo$d;

    .line 482
    return-void
.end method

.method static synthetic e(Lo/fpo$d;Lo/fpo$d;)V
    .locals 0

    .line 435
    invoke-direct {p0, p1}, Lo/fpo$d;->i(Lo/fpo$d;)V

    return-void
.end method

.method private i(Lo/fpo$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fpo$d<TK;TV;>;)V"
        }
    .end annotation

    .line 473
    iput-object p1, p0, Lo/fpo$d;->a:Lo/fpo$d;

    .line 474
    iget-object v0, p1, Lo/fpo$d;->c:Lo/fpo$d;

    iput-object v0, p0, Lo/fpo$d;->c:Lo/fpo$d;

    .line 475
    iget-object v0, p0, Lo/fpo$d;->c:Lo/fpo$d;

    iput-object p0, v0, Lo/fpo$d;->a:Lo/fpo$d;

    .line 476
    iget-object v0, p0, Lo/fpo$d;->a:Lo/fpo$d;

    iput-object p0, v0, Lo/fpo$d;->c:Lo/fpo$d;

    .line 477
    return-void
.end method

.method private k(Lo/fpo$d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/fpo$d<TK;TV;>;)V"
        }
    .end annotation

    .line 467
    invoke-direct {p0}, Lo/fpo$d;->e()V

    .line 468
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fpo$d;->b:J

    .line 469
    invoke-direct {p0, p1}, Lo/fpo$d;->i(Lo/fpo$d;)V

    .line 470
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 486
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CacheEntry [key: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo/fpo$d;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", last access: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/fpo$d;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
