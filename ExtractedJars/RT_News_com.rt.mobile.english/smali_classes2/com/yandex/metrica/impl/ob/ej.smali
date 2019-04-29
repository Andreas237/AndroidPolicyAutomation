.class public Lcom/yandex/metrica/impl/ob/ej;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/yandex/metrica/impl/ob/em;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final b:Lcom/yandex/metrica/impl/ob/ei;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final d:Z


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "package_name"

    .line 34
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "clte"

    .line 35
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "flcc"

    .line 36
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v4, v3

    goto :goto_0

    .line 1077
    :cond_0
    new-instance v4, Lcom/yandex/metrica/impl/ob/em;

    invoke-direct {v4, v2}, Lcom/yandex/metrica/impl/ob/em;-><init>(Landroid/os/Bundle;)V

    :goto_0
    const-string v2, "blcc"

    .line 38
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 1082
    :cond_1
    new-instance v3, Lcom/yandex/metrica/impl/ob/ei;

    invoke-direct {v3, p1}, Lcom/yandex/metrica/impl/ob/ei;-><init>(Landroid/os/Bundle;)V

    .line 33
    :goto_1
    invoke-direct {p0, v0, v1, v4, v3}, Lcom/yandex/metrica/impl/ob/ej;-><init>(Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/em;Lcom/yandex/metrica/impl/ob/ei;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/em;Lcom/yandex/metrica/impl/ob/ei;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/em;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ei;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ej;->c:Ljava/lang/String;

    .line 119
    iput-boolean p2, p0, Lcom/yandex/metrica/impl/ob/ej;->d:Z

    .line 120
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/ej;->a:Lcom/yandex/metrica/impl/ob/em;

    .line 121
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 5
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "package_name"

    const/4 v1, 0x0

    .line 45
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "clte"

    const/4 v3, 0x1

    .line 46
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const-string v3, "flcc"

    .line 47
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 1089
    new-instance v4, Lcom/yandex/metrica/impl/ob/em;

    invoke-direct {v4, v3}, Lcom/yandex/metrica/impl/ob/em;-><init>(Lorg/json/JSONObject;)V

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    const-string v3, "blcc"

    .line 49
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1098
    new-instance v1, Lcom/yandex/metrica/impl/ob/ei;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/ei;-><init>(Lorg/json/JSONObject;)V

    .line 44
    :cond_1
    invoke-direct {p0, v0, v2, v4, v1}, Lcom/yandex/metrica/impl/ob/ej;-><init>(Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/em;Lcom/yandex/metrica/impl/ob/ei;)V

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 56
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "package_name"

    .line 58
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ej;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "clte"

    .line 59
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/ej;->d:Z

    .line 60
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 59
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    if-eqz v1, :cond_0

    const-string v1, "blcc"

    .line 62
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    .line 63
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/ei;->a()Lorg/json/JSONObject;

    move-result-object v2

    .line 62
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ej;->a:Lcom/yandex/metrica/impl/ob/em;

    if-eqz v1, :cond_1

    const-string v1, "flcc"

    .line 66
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ej;->a:Lcom/yandex/metrica/impl/ob/em;

    .line 67
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/em;->a()Lorg/json/JSONObject;

    move-result-object v2

    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClientConfig{foregroundConfig="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ej;->a:Lcom/yandex/metrica/impl/ob/em;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ej;->b:Lcom/yandex/metrica/impl/ob/ei;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", packageName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ej;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", mLocationTrackingEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/ej;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
