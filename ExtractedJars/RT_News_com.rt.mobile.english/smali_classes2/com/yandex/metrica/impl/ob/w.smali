.class public Lcom/yandex/metrica/impl/ob/w;
.super Lcom/yandex/metrica/impl/ob/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/kw;)V
    .locals 1

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, v0, p2}, Lcom/yandex/metrica/impl/ob/y;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/kw;)V

    return-void
.end method
