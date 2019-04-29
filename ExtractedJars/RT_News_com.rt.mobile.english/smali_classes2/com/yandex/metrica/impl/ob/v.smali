.class public Lcom/yandex/metrica/impl/ob/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/v;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/fh;)Lcom/yandex/metrica/impl/a;
    .locals 4

    monitor-enter p0

    .line 23
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/v;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/a;

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/fh;->a()Lcom/yandex/metrica/impl/a$a;

    move-result-object p2

    .line 27
    new-instance v0, Lcom/yandex/metrica/impl/a;

    iget-object v1, p2, Lcom/yandex/metrica/impl/a$a;->a:Ljava/lang/String;

    iget-wide v2, p2, Lcom/yandex/metrica/impl/a$a;->b:J

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/a;-><init>(Ljava/lang/String;J)V

    .line 28
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/v;->a:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p0

    throw p1
.end method

.method public a(Lcom/yandex/metrica/impl/a$a;Lcom/yandex/metrica/impl/ob/fh;)Z
    .locals 5

    .line 36
    iget-wide v0, p1, Lcom/yandex/metrica/impl/a$a;->b:J

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/fh;->a()Lcom/yandex/metrica/impl/a$a;

    move-result-object v2

    iget-wide v2, v2, Lcom/yandex/metrica/impl/a$a;->b:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 37
    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/ob/fh;->a(Lcom/yandex/metrica/impl/a$a;)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fh;->i()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public declared-synchronized b(Lcom/yandex/metrica/impl/a$a;Lcom/yandex/metrica/impl/ob/fh;)V
    .locals 0

    monitor-enter p0

    .line 46
    :try_start_0
    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/ob/fh;->a(Lcom/yandex/metrica/impl/a$a;)Lcom/yandex/metrica/impl/ob/fh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fh;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 45
    monitor-exit p0

    throw p1
.end method
