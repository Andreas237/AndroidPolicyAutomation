.class public Lcom/yandex/metrica/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static cpcwh(Lcom/yandex/metrica/YandexMetricaConfig;Ljava/util/List;)Lcom/yandex/metrica/YandexMetricaConfig;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/YandexMetricaConfig;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/yandex/metrica/YandexMetricaConfig;"
        }
    .end annotation

    .line 16
    invoke-static {p0}, Lcom/yandex/metrica/e;->b(Lcom/yandex/metrica/YandexMetricaConfig;)Lcom/yandex/metrica/e$a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/e$a;->a(Ljava/util/List;)Lcom/yandex/metrica/e$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/e$a;->b()Lcom/yandex/metrica/e;

    move-result-object p0

    return-object p0
.end method
