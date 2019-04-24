.class public Lcom/ibotta/android/state/app/config/FloatConfigParser;
.super Lcom/ibotta/android/state/app/config/AbstractConfigParser;
.source "FloatConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/AbstractConfigParser<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 17
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected getPrefsValue()Ljava/lang/Float;
    .locals 3

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    return-object v0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic getPrefsValue()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getPrefsValue()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method protected parseAppConfigValueIntoType()Ljava/lang/Float;
    .locals 3

    .line 34
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to parse float config value: key="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getAppConfigKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", value="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected bridge synthetic parseAppConfigValueIntoType()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->parseAppConfigValueIntoType()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method protected putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Float;)V
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method protected bridge synthetic putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/app/config/FloatConfigParser;->putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Float;)V

    return-void
.end method
