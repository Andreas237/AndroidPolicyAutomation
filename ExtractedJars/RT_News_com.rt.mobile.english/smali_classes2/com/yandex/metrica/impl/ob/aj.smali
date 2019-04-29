.class public Lcom/yandex/metrica/impl/ob/aj;
.super Lcom/yandex/metrica/impl/ob/w;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 18
    new-instance v0, Lcom/yandex/metrica/impl/ob/ku;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/ku;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/w;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/kw;)V

    return-void
.end method
