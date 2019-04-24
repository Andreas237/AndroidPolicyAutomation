.class abstract Lcom/launchdarkly/android/response/BaseUserSharedPreferences;
.super Ljava/lang/Object;
.source "BaseUserSharedPreferences.java"


# instance fields
.field sharedPreferences:Landroid/content/SharedPreferences;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 22
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method extractValueFromPreferences(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonElement;
    .locals 0
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 28
    invoke-virtual {p0, p1}, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;->getValueAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method getValueAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    .line 41
    :try_start_0
    iget-object v1, p0, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    return-object v0

    .line 53
    :cond_0
    new-instance v1, Lcom/google/gson/JsonParser;

    invoke-direct {v1}, Lcom/google/gson/JsonParser;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/gson/JsonParser;->parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    .line 54
    instance-of v1, p1, Lcom/google/gson/JsonObject;

    if-eqz v1, :cond_1

    .line 55
    check-cast p1, Lcom/google/gson/JsonObject;

    return-object p1

    :cond_1
    return-object v0

    .line 45
    :catch_0
    iget-object p1, p0, Lcom/launchdarkly/android/response/BaseUserSharedPreferences;->sharedPreferences:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-object v0
.end method
