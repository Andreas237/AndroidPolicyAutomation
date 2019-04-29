.class public Lcom/yandex/metrica/impl/ob/an;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/an$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/yandex/metrica/impl/ob/as;

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/yandex/metrica/impl/ob/am;",
            "Lcom/yandex/metrica/impl/ob/ao;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/me;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/me<",
            "Lcom/yandex/metrica/impl/ob/an$a;",
            "Lcom/yandex/metrica/impl/ob/am;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private volatile f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/an;->a:Ljava/lang/Object;

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/an;->c:Ljava/util/HashMap;

    .line 34
    new-instance v0, Lcom/yandex/metrica/impl/ob/me;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/me;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/an;->d:Lcom/yandex/metrica/impl/ob/me;

    const/4 v0, 0x0

    .line 37
    iput v0, p0, Lcom/yandex/metrica/impl/ob/an;->f:I

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/an;->e:Landroid/content/Context;

    .line 41
    new-instance v0, Lcom/yandex/metrica/impl/ob/as;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/as;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/an;->b:Lcom/yandex/metrica/impl/ob/as;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 91
    iget v0, p0, Lcom/yandex/metrica/impl/ob/an;->f:I

    return v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/am;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/ao;
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/am;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 48
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/an;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 49
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/an;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/ao;

    if-nez v1, :cond_0

    .line 52
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/am;->a()Lcom/yandex/metrica/impl/ob/ap;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/an;->e:Landroid/content/Context;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/an;->b:Lcom/yandex/metrica/impl/ob/as;

    .line 53
    invoke-interface {v1, v2, v3, p1, p2}, Lcom/yandex/metrica/impl/ob/ap;->a(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/as;Lcom/yandex/metrica/impl/ob/am;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/ao;

    move-result-object v1

    .line 54
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/an;->c:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/an;->d:Lcom/yandex/metrica/impl/ob/me;

    new-instance v2, Lcom/yandex/metrica/impl/ob/an$a;

    invoke-direct {v2, p1}, Lcom/yandex/metrica/impl/ob/an$a;-><init>(Lcom/yandex/metrica/impl/ob/am;)V

    invoke-virtual {p2, v2, p1}, Lcom/yandex/metrica/impl/ob/me;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Collection;

    .line 56
    iget p1, p0, Lcom/yandex/metrica/impl/ob/an;->f:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/yandex/metrica/impl/ob/an;->f:I

    .line 58
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 59
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 1068
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/an;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 1069
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/an;->d:Lcom/yandex/metrica/impl/ob/me;

    new-instance v2, Lcom/yandex/metrica/impl/ob/an$a;

    invoke-direct {v2, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/an$a;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1070
    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/me;->b(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p1

    .line 1071
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 1077
    iget p2, p0, Lcom/yandex/metrica/impl/ob/an;->f:I

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p3

    sub-int/2addr p2, p3

    iput p2, p0, Lcom/yandex/metrica/impl/ob/an;->f:I

    .line 1079
    new-instance p2, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1080
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/yandex/metrica/impl/ob/am;

    .line 1081
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/an;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1083
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/yandex/metrica/impl/ob/ao;

    .line 1084
    invoke-interface {p2}, Lcom/yandex/metrica/impl/ob/ao;->a()V

    goto :goto_1

    .line 1087
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
