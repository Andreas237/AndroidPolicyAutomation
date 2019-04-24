.class final Lorg/junit/runner/b/e;
.super Lorg/junit/runner/b/b;


# annotations
.annotation runtime Lorg/junit/runner/b/b$a;
.end annotation


# instance fields
.field private final a:Lorg/junit/runner/b/b;

.field private final b:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lorg/junit/runner/b/b;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lorg/junit/runner/b/b;-><init>()V

    iput-object p1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    iput-object p2, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lorg/junit/runner/b/a;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1, p1}, Lorg/junit/runner/b/b;->a(Lorg/junit/runner/b/a;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lorg/junit/runner/c;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1, p1}, Lorg/junit/runner/b/b;->a(Lorg/junit/runner/c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lorg/junit/runner/i;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1, p1}, Lorg/junit/runner/b/b;->a(Lorg/junit/runner/i;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Lorg/junit/runner/b/a;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1, p1}, Lorg/junit/runner/b/b;->b(Lorg/junit/runner/b/a;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Lorg/junit/runner/c;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1, p1}, Lorg/junit/runner/b/b;->b(Lorg/junit/runner/c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Lorg/junit/runner/c;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1, p1}, Lorg/junit/runner/b/b;->c(Lorg/junit/runner/c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d(Lorg/junit/runner/c;)V
    .locals 2

    iget-object v0, p0, Lorg/junit/runner/b/e;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1, p1}, Lorg/junit/runner/b/b;->d(Lorg/junit/runner/c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lorg/junit/runner/b/e;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lorg/junit/runner/b/e;

    iget-object v0, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    iget-object p1, p1, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/junit/runner/b/e;->a:Lorg/junit/runner/b/b;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (with synchronization wrapper)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
