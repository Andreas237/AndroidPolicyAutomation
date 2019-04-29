.class public Lcom/yandex/metrica/impl/ob/fm;
.super Lcom/yandex/metrica/impl/ob/fs;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/e;",
        ">",
        "Lcom/yandex/metrica/impl/ob/fs<",
        "TT;>;",
        "Lcom/yandex/metrica/impl/ob/fn<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/fn;Lcom/yandex/metrica/impl/ob/mg;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/fn;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/mg;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/fn<",
            "TT;>;",
            "Lcom/yandex/metrica/impl/ob/mg;",
            ")V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/fs;-><init>(Lcom/yandex/metrica/impl/ob/ft;Lcom/yandex/metrica/impl/ob/mg;)V

    return-void
.end method
