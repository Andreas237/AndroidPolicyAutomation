.class public Lcom/yandex/metrica/impl/ob/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/aa$f;,
        Lcom/yandex/metrica/impl/ob/aa$g;,
        Lcom/yandex/metrica/impl/ob/aa$b;,
        Lcom/yandex/metrica/impl/ob/aa$d;,
        Lcom/yandex/metrica/impl/ob/aa$c;,
        Lcom/yandex/metrica/impl/ob/aa$a;,
        Lcom/yandex/metrica/impl/ob/aa$e;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ab;

.field private final b:Lcom/yandex/metrica/impl/ob/hx;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/aa$f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hx;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    .line 44
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/aa;->b:Lcom/yandex/metrica/impl/ob/hx;

    .line 1049
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/aa;->c:Ljava/util/List;

    .line 1050
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/aa;->c:Ljava/util/List;

    new-instance p2, Lcom/yandex/metrica/impl/ob/aa$b;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/aa;->b:Lcom/yandex/metrica/impl/ob/hx;

    invoke-direct {p2, v0, v1}, Lcom/yandex/metrica/impl/ob/aa$b;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hx;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1051
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/aa;->c:Ljava/util/List;

    new-instance p2, Lcom/yandex/metrica/impl/ob/aa$d;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/aa;->b:Lcom/yandex/metrica/impl/ob/hx;

    invoke-direct {p2, v0, v1}, Lcom/yandex/metrica/impl/ob/aa$d;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hx;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1052
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/aa;->c:Ljava/util/List;

    new-instance p2, Lcom/yandex/metrica/impl/ob/aa$c;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    .line 1053
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ab;->C()Lcom/yandex/metrica/impl/ob/hy;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lcom/yandex/metrica/impl/ob/aa$c;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/hy;)V

    .line 1052
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1054
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/aa;->c:Ljava/util/List;

    new-instance p2, Lcom/yandex/metrica/impl/ob/aa$a;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-direct {p2, v0}, Lcom/yandex/metrica/impl/ob/aa$a;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1055
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/aa;->c:Ljava/util/List;

    new-instance p2, Lcom/yandex/metrica/impl/ob/aa$e;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-direct {p2, v0}, Lcom/yandex/metrica/impl/ob/aa$e;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa;->a:Lcom/yandex/metrica/impl/ob/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ab;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/y;->a()Ljava/lang/String;

    move-result-object v0

    .line 1068
    sget-object v1, Lcom/yandex/metrica/impl/ob/hx;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/aa;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/aa$f;

    .line 62
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/aa$f;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method
