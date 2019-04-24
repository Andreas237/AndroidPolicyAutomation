.class public Lcom/ibotta/android/state/app/config/BooleanConfigParser;
.super Lcom/ibotta/android/state/app/config/AbstractConfigParser;
.source "BooleanConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/AbstractConfigParser<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 19
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected getPrefsValue()Ljava/lang/Boolean;
    .locals 3

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic getPrefsValue()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getPrefsValue()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected parseAppConfigValueIntoType()Ljava/lang/Boolean;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic parseAppConfigValueIntoType()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->parseAppConfigValueIntoType()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Boolean;)V
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method protected bridge synthetic putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/app/config/BooleanConfigParser;->putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Boolean;)V

    return-void
.end method
