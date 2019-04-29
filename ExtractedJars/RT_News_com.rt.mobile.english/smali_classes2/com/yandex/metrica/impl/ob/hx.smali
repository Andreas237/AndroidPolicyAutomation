.class public Lcom/yandex/metrica/impl/ob/hx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/yandex/metrica/impl/ob/hy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lcom/yandex/metrica/impl/ob/hx$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/hx$1;-><init>()V

    .line 21
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/hx;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/ob/hy;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 40
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hx;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hx;->g()V

    .line 42
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hx;->h()V

    :cond_0
    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/hx;->b(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hx;->g()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 47
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hx;->d()Ljava/lang/String;

    move-result-object v0

    .line 1054
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "DONE"

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    .line 1056
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/hy;->g()Ljava/util/Map;

    move-result-object v2

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/hy;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 1055
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 49
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/hx;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method b(Ljava/lang/String;)V
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/hy;->d(Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 60
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/hx;->e()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/hx;->a(Ljava/lang/String;)V

    return-void
.end method

.method d()Ljava/lang/String;
    .locals 2

    .line 72
    sget-object v0, Lcom/yandex/metrica/impl/ob/hx;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/hy;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method e()Ljava/lang/String;
    .locals 3

    .line 76
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hy;->g()Ljava/util/Map;

    move-result-object v0

    .line 77
    sget-object v1, Lcom/yandex/metrica/impl/ob/hx;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 78
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/hy;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 80
    :cond_0
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 81
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 83
    :try_start_0
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/hy;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    .line 87
    invoke-virtual {v1}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method f()Z
    .locals 2

    .line 93
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/hy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method g()V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hy;->a()V

    return-void
.end method

.method h()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hx;->b:Lcom/yandex/metrica/impl/ob/hy;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/hy;->b()V

    return-void
.end method
