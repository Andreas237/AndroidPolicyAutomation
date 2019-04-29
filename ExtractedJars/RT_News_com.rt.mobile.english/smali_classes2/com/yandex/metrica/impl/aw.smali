.class public Lcom/yandex/metrica/impl/aw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)Ljava/lang/String;
    .locals 0

    .line 14
    invoke-static {p0}, Lcom/yandex/metrica/impl/bi;->a(I)Lcom/yandex/metrica/impl/bi$a;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 15
    iget-object p0, p0, Lcom/yandex/metrica/impl/bi$a;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    sget-object p0, Lcom/yandex/metrica/impl/bi;->a:Lcom/yandex/metrica/impl/bi$a;

    iget-object p0, p0, Lcom/yandex/metrica/impl/bi$a;->a:Ljava/lang/String;

    return-object p0
.end method
