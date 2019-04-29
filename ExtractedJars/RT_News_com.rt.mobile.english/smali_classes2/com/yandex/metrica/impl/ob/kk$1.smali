.class Lcom/yandex/metrica/impl/ob/kk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/kr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/kk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/kk;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/kk;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kk$1;->a:Lcom/yandex/metrica/impl/ob/kk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/kp;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kk$1;->a:Lcom/yandex/metrica/impl/ob/kk;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/kk;->a(Lcom/yandex/metrica/impl/ob/kk;)Ljava/util/HashMap;

    move-result-object v0

    monitor-enter v0

    .line 59
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kk$1;->a:Lcom/yandex/metrica/impl/ob/kk;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/kk;->b(Lcom/yandex/metrica/impl/ob/kk;)Lcom/yandex/metrica/impl/ob/me;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/me;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p1

    if-nez p1, :cond_0

    .line 62
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    monitor-exit v0

    return-object p1

    .line 65
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 67
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/km;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/km;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 51
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kk$1;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/kp;

    .line 52
    invoke-interface {v0, p2}, Lcom/yandex/metrica/impl/ob/kp;->a(Lcom/yandex/metrica/impl/ob/km;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 44
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kk$1;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/kp;

    .line 45
    invoke-interface {v0, p2}, Lcom/yandex/metrica/impl/ob/kp;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    goto :goto_0

    :cond_0
    return-void
.end method
