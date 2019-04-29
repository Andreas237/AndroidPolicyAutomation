.class public Lcom/yandex/metrica/impl/at;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/PreloadInfo;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/PreloadInfo;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 37
    invoke-virtual {p1}, Lcom/yandex/metrica/PreloadInfo;->getTrackingId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object p1

    const-string v0, "Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped."

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/lv;->c(Ljava/lang/String;)V

    return-void

    .line 41
    :cond_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/at;->a:Lcom/yandex/metrica/PreloadInfo;

    :cond_1
    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 3

    .line 74
    iget-object v0, p0, Lcom/yandex/metrica/impl/at;->a:Lcom/yandex/metrica/PreloadInfo;

    if-eqz v0, :cond_0

    .line 75
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "preloadInfo"

    .line 77
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/at;->b()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public b()Lorg/json/JSONObject;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/yandex/metrica/impl/at;->a:Lcom/yandex/metrica/PreloadInfo;

    if-eqz v0, :cond_1

    .line 90
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "trackingId"

    .line 92
    iget-object v2, p0, Lcom/yandex/metrica/impl/at;->a:Lcom/yandex/metrica/PreloadInfo;

    .line 93
    invoke-virtual {v2}, Lcom/yandex/metrica/PreloadInfo;->getTrackingId()Ljava/lang/String;

    move-result-object v2

    .line 92
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    iget-object v1, p0, Lcom/yandex/metrica/impl/at;->a:Lcom/yandex/metrica/PreloadInfo;

    invoke-virtual {v1}, Lcom/yandex/metrica/PreloadInfo;->getAdditionalParams()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 96
    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/yandex/metrica/impl/at;->a:Lcom/yandex/metrica/PreloadInfo;

    invoke-virtual {v2}, Lcom/yandex/metrica/PreloadInfo;->getAdditionalParams()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v2, "additionalParams"

    .line 97
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
