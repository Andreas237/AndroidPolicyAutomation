.class public Lcom/yandex/metrica/impl/ob/kd;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "20799a27-fa80-4b36-b2db-0f8141f24180"

    .line 29
    invoke-static {p0, v0}, Lcom/yandex/metrica/YandexMetrica;->getReporter(Landroid/content/Context;Ljava/lang/String;)Lcom/yandex/metrica/IReporter;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/b;

    return-object p0
.end method
