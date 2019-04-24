.class public Lcom/ibotta/android/state/app/config/StringConfigParser;
.super Lcom/ibotta/android/state/app/config/AbstractConfigParser;
.source "StringConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/AbstractConfigParser<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 19
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic getPrefsValue()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getPrefsValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getPrefsValue()Ljava/lang/String;
    .locals 3

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic parseAppConfigValueIntoType()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->parseAppConfigValueIntoType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected parseAppConfigValueIntoType()Ljava/lang/String;
    .locals 1

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/app/config/StringConfigParser;->putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V

    return-void
.end method

.method protected putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)V
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/StringConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method
