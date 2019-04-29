.class Lcom/yandex/metrica/impl/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/yandex/metrica/impl/i;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method public constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/aj;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    iput-object p1, p0, Lcom/yandex/metrica/impl/aj;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/i;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/yandex/metrica/impl/aj;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/i;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/aj;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    .line 27
    :try_start_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/au;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/au;-><init>()V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    .line 1037
    iget-object v0, p0, Lcom/yandex/metrica/impl/aj;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/i;

    .line 1038
    invoke-virtual {v1, p2}, Lcom/yandex/metrica/impl/i;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/aj;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_1

    .line 31
    iget-object v0, p0, Lcom/yandex/metrica/impl/aj;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    .line 30
    iget-object v1, p0, Lcom/yandex/metrica/impl/aj;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v1, :cond_2

    .line 31
    iget-object v1, p0, Lcom/yandex/metrica/impl/aj;->b:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v1, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 33
    :cond_2
    throw v0
.end method
