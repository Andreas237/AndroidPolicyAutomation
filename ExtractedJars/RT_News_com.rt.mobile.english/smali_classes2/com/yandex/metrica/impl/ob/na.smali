.class public Lcom/yandex/metrica/impl/ob/na;
.super Lcom/yandex/metrica/impl/ob/ms;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/ms<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ms;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()I
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
        otherwise = 0x3
    .end annotation

    .line 16
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/ms;->a()I

    move-result v0

    return v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 16
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/na;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-eqz p1, :cond_0

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/na;->a()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 26
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/na;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v2

    const-string v3, "\"%s\" %s size exceeded limit of %d characters"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    .line 29
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/na;->b()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    const/4 v1, 0x1

    aput-object p1, v4, v1

    const/4 p1, 0x2

    .line 31
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/na;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, p1

    .line 27
    invoke-virtual {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_0
    return-object p1
.end method
