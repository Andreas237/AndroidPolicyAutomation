.class Lcom/yandex/metrica/impl/ob/es$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/es;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/es;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/ContentValues;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/er;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/es;)V
    .locals 0

    .line 593
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/es$a;->a:Lcom/yandex/metrica/impl/ob/es;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 594
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/es$a;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method declared-synchronized a()V
    .locals 1

    monitor-enter p0

    .line 623
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/es$a;->interrupt()V

    const/4 v0, 0x0

    .line 624
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/es$a;->c:Lcom/yandex/metrica/impl/ob/er;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 625
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 622
    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/yandex/metrica/impl/ob/er;)V
    .locals 0

    monitor-enter p0

    .line 628
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/es$a;->c:Lcom/yandex/metrica/impl/ob/er;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 629
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 627
    monitor-exit p0

    throw p1
.end method

.method declared-synchronized b()V
    .locals 1

    monitor-enter p0

    .line 632
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es$a;->c:Lcom/yandex/metrica/impl/ob/er;

    if-eqz v0, :cond_0

    .line 633
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es$a;->c:Lcom/yandex/metrica/impl/ob/er;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/er;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 635
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 631
    monitor-exit p0

    throw v0
.end method

.method public run()V
    .locals 3

    .line 599
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_1

    .line 601
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 602
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es$a;->a:Lcom/yandex/metrica/impl/ob/es;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/es;->a(Lcom/yandex/metrica/impl/ob/es;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 603
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    .line 605
    :cond_0
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 607
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 610
    :goto_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/es$a;->a:Lcom/yandex/metrica/impl/ob/es;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/es;->b(Lcom/yandex/metrica/impl/ob/es;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 611
    :try_start_3
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 612
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es$a;->b:Ljava/util/List;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es$a;->a:Lcom/yandex/metrica/impl/ob/es;

    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/es;->c(Lcom/yandex/metrica/impl/ob/es;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 613
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es$a;->a:Lcom/yandex/metrica/impl/ob/es;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/es;->c(Lcom/yandex/metrica/impl/ob/es;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 614
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/es$a;->a:Lcom/yandex/metrica/impl/ob/es;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/es$a;->b:Ljava/util/List;

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/es;->a(Lcom/yandex/metrica/impl/ob/es;Ljava/util/List;)V

    .line 615
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 618
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/es$a;->b()V

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 615
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :cond_1
    return-void
.end method
