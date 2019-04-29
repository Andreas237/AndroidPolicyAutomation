.class public Lcom/yandex/metrica/impl/ob/mc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/mc$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;)Lcom/yandex/metrica/d;
    .locals 3

    .line 77
    new-instance v0, Lcom/yandex/metrica/d;

    invoke-direct {v0}, Lcom/yandex/metrica/d;-><init>()V

    .line 79
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 81
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "UserInfo.UserId"

    const/4 v2, 0x0

    .line 83
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/d;->a(Ljava/lang/String;)V

    const-string p0, "UserInfo.Type"

    .line 84
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/d;->b(Ljava/lang/String;)V

    const-string p0, "UserInfo.Options"

    .line 85
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    .line 86
    invoke-static {p0}, Lcom/yandex/metrica/impl/ob/lp;->a(Lorg/json/JSONObject;)Ljava/util/HashMap;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/d;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/mc$a;)Ljava/lang/String;
    .locals 2

    .line 97
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "action"

    .line 98
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mc$a;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
