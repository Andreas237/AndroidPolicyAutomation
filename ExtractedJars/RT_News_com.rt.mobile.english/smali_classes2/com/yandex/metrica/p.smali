.class public final Lcom/yandex/metrica/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/yandex/metrica/IIdentifierCallback;)V
    .locals 1

    .line 1029
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->b()Lcom/yandex/metrica/impl/bv;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/bv;->a(Lcom/yandex/metrica/IIdentifierCallback;)V

    return-void
.end method

.method public static cpcwh(Lcom/yandex/metrica/YandexMetricaConfig;Ljava/lang/String;)Lcom/yandex/metrica/YandexMetricaConfig;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 80
    invoke-static {p0}, Lcom/yandex/metrica/e;->b(Lcom/yandex/metrica/YandexMetricaConfig;)Lcom/yandex/metrica/e$a;

    move-result-object p0

    .line 81
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/e$a;->a(Ljava/util/List;)Lcom/yandex/metrica/e$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/e$a;->b()Lcom/yandex/metrica/e;

    move-result-object p0

    return-object p0
.end method

.method public static gbc(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 101
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 4049
    invoke-static {p0}, Lcom/yandex/metrica/impl/as;->c(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static gcni(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 3045
    new-instance v0, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/interact/CellularNetworkInfo;->getCelluralInfo()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static gdi(Landroid/content/Context;)Lcom/yandex/metrica/impl/interact/DeviceInfo;
    .locals 0

    .line 3041
    invoke-static {p0}, Lcom/yandex/metrica/impl/interact/DeviceInfo;->getInstance(Landroid/content/Context;)Lcom/yandex/metrica/impl/interact/DeviceInfo;

    move-result-object p0

    return-object p0
.end method

.method public static glkl(Landroid/content/Context;)Landroid/location/Location;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 96
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/gy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gy;->d()Landroid/location/Location;

    move-result-object p0

    return-object p0
.end method

.method public static gmsvn(I)Ljava/lang/String;
    .locals 0

    .line 75
    invoke-static {p0}, Lcom/yandex/metrica/impl/aw;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static guid()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3054
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->b()Lcom/yandex/metrica/impl/bv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/bv;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static guid(Landroid/content/Context;)Ljava/lang/String;
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 3058
    invoke-static {p0}, Lcom/yandex/metrica/impl/bv;->b(Landroid/content/Context;)Lcom/yandex/metrica/impl/bv;

    move-result-object p0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/bv;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static iifa()Z
    .locals 1

    .line 39
    invoke-static {}, Lcom/yandex/metrica/impl/bu;->a()Z

    move-result v0

    return v0
.end method

.method public static mpn(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 3062
    invoke-static {p0}, Lcom/yandex/metrica/impl/bl;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static pgai()Ljava/lang/String;
    .locals 1

    .line 2077
    invoke-static {}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static plat()Ljava/lang/Boolean;
    .locals 1

    .line 1073
    invoke-static {}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->c()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public static rce(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3069
    invoke-static {}, Lcom/yandex/metrica/impl/bv;->c()Lcom/yandex/metrica/impl/ab;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/yandex/metrica/impl/ab;->a(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static rolu(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 86
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/gy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gy;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static u(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 31
    invoke-static {p0}, Lcom/yandex/metrica/impl/bj;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static urolu(Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 91
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/gy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/gy;->b(Ljava/lang/Object;)V

    return-void
.end method
