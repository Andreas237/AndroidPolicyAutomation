.class Lcom/yandex/metrica/impl/ob/ev$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ev;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ev;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    .line 66
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ev;->a(Lcom/yandex/metrica/impl/ob/ev;)Ljava/util/Map;

    move-result-object v0

    monitor-enter v0

    .line 72
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ev;->b(Lcom/yandex/metrica/impl/ob/ev;)V

    .line 73
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/ev;->a(Lcom/yandex/metrica/impl/ob/ev;Z)Z

    .line 74
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ev;->a(Lcom/yandex/metrica/impl/ob/ev;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 75
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ev$a;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 79
    monitor-enter p0

    .line 80
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ev;->c(Lcom/yandex/metrica/impl/ob/ev;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    .line 82
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 84
    :catch_0
    :try_start_3
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ev$a;->interrupt()V

    .line 87
    :cond_1
    :goto_1
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ev;->c(Lcom/yandex/metrica/impl/ob/ev;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 88
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ev;->c(Lcom/yandex/metrica/impl/ob/ev;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 89
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 92
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ev$a;->a:Lcom/yandex/metrica/impl/ob/ev;

    invoke-static {v1, v0}, Lcom/yandex/metrica/impl/ob/ev;->a(Lcom/yandex/metrica/impl/ob/ev;Ljava/util/Map;)V

    .line 93
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 89
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_2
    return-void

    :catchall_1
    move-exception v1

    .line 75
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method
