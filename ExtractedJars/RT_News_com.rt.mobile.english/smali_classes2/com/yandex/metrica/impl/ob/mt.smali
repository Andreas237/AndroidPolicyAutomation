.class public Lcom/yandex/metrica/impl/ob/mt;
.super Lcom/yandex/metrica/impl/ob/ms;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/ms<",
        "[B>;"
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
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/mt;->a([B)[B

    move-result-object p1

    return-object p1
.end method

.method public a([B)[B
    .locals 6
    .param p1    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 26
    array-length v0, p1

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mt;->a()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 27
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mt;->a()I

    move-result v0

    new-array v0, v0, [B

    .line 28
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mt;->a()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v1

    const-string v3, "\"%s\" %s exceeded limit of %d bytes"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    .line 31
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mt;->b()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x1

    aput-object p1, v4, v2

    const/4 p1, 0x2

    .line 33
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mt;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, p1

    .line 29
    invoke-virtual {v1, v3, v4}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p1, v0

    :cond_0
    return-object p1
.end method
