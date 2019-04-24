.class Lorg/junit/runner/i$a;
.super Lorg/junit/runner/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runner/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation runtime Lorg/junit/runner/b/b$a;
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/runner/i;


# direct methods
.method private constructor <init>(Lorg/junit/runner/i;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/runner/i$a;->a:Lorg/junit/runner/i;

    invoke-direct {p0}, Lorg/junit/runner/b/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/runner/i;Lorg/junit/runner/i$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/junit/runner/i$a;-><init>(Lorg/junit/runner/i;)V

    return-void
.end method


# virtual methods
.method public a(Lorg/junit/runner/b/a;)V
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/i$a;->a:Lorg/junit/runner/i;

    invoke-static {v0}, Lorg/junit/runner/i;->d(Lorg/junit/runner/i;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lorg/junit/runner/i;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Lorg/junit/runner/i$a;->a:Lorg/junit/runner/i;

    invoke-static {p1}, Lorg/junit/runner/i;->b(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p1

    iget-object v2, p0, Lorg/junit/runner/i$a;->a:Lorg/junit/runner/i;

    invoke-static {v2}, Lorg/junit/runner/i;->a(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    return-void
.end method

.method public b(Lorg/junit/runner/b/a;)V
    .locals 0

    return-void
.end method

.method public b(Lorg/junit/runner/c;)V
    .locals 0

    iget-object p1, p0, Lorg/junit/runner/i$a;->a:Lorg/junit/runner/i;

    invoke-static {p1}, Lorg/junit/runner/i;->e(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    return-void
.end method

.method public c(Lorg/junit/runner/c;)V
    .locals 2

    iget-object p1, p0, Lorg/junit/runner/i$a;->a:Lorg/junit/runner/i;

    invoke-static {p1}, Lorg/junit/runner/i;->a(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method

.method public d(Lorg/junit/runner/c;)V
    .locals 0

    iget-object p1, p0, Lorg/junit/runner/i$a;->a:Lorg/junit/runner/i;

    invoke-static {p1}, Lorg/junit/runner/i;->c(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    return-void
.end method
