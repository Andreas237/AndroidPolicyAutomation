.class public Lcom/yandex/metrica/impl/ob/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ad;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CU::",
        "Lcom/yandex/metrica/impl/ob/ao;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/ad<",
        "TCU;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TCU;>;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/z;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TCU;>;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/z;->a:Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ao;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ao;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCU;)V"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/z;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 31
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/z;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/z;->b:Z

    :cond_0
    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/ao;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ao;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TCU;)V"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/z;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/z;->b:Z

    return v0
.end method
