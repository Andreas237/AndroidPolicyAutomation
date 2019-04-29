.class public final Lcom/yandex/metrica/impl/ob/lj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/lf;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ky;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/li;Lcom/yandex/metrica/impl/ob/li;Lcom/yandex/metrica/impl/ob/li;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/li;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/li;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/li;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/li<",
            "Lcom/yandex/metrica/impl/ob/ky;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/li<",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/lf;",
            ">;>;",
            "Lcom/yandex/metrica/impl/ob/li<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/li;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/ky;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lj;->b:Lcom/yandex/metrica/impl/ob/ky;

    .line 29
    invoke-interface {p2}, Lcom/yandex/metrica/impl/ob/li;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lj;->a:Ljava/util/List;

    .line 30
    invoke-interface {p3}, Lcom/yandex/metrica/impl/ob/li;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lj;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/lf;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lj;->a:Ljava/util/List;

    return-object v0
.end method

.method public b()Lcom/yandex/metrica/impl/ob/ky;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lj;->b:Lcom/yandex/metrica/impl/ob/ky;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lj;->c:Ljava/util/List;

    return-object v0
.end method
