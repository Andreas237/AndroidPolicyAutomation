.class public Lcom/yandex/metrica/impl/ob/ng;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/nk;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/nk<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/nk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/nk<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/nk;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "TT;>;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ng;->a:Lcom/yandex/metrica/impl/ob/nk;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/yandex/metrica/impl/ob/ni;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ng;->a:Lcom/yandex/metrica/impl/ob/nk;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/nk;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/ni;

    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ni;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 28
    :cond_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/nh;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ni;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/nh;-><init>(Ljava/lang/String;)V

    throw v0
.end method
