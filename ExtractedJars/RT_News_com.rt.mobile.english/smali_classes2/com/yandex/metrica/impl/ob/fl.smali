.class public abstract Lcom/yandex/metrica/impl/ob/fl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/e;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fn<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/yandex/metrica/impl/ob/e;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public a(Lcom/yandex/metrica/impl/ob/e;)[B
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)[B"
        }
    .end annotation

    .line 19
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/e;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)[B
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 15
    check-cast p1, Lcom/yandex/metrica/impl/ob/e;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fl;->a(Lcom/yandex/metrica/impl/ob/e;)[B

    move-result-object p1

    return-object p1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 15
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/fl;->a()Lcom/yandex/metrica/impl/ob/e;

    move-result-object v0

    return-object v0
.end method
