.class public abstract Lcom/ibotta/android/state/app/config/ListConfigParser;
.super Lcom/ibotta/android/state/app/config/AbstractConfigParser;
.source "ListConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/ibotta/android/state/app/config/AbstractConfigParser<",
        "Ljava/util/List<",
        "TT;>;>;"
    }
.end annotation


# instance fields
.field private final ibottaJson:Lcom/ibotta/android/json/IbottaJson;

.field private final semverFactory:Lcom/ibotta/android/util/SemverFactory;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;Lcom/ibotta/android/util/SemverFactory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "TT;>;",
            "Landroid/content/SharedPreferences;",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Lcom/ibotta/android/util/SemverFactory;",
            ")V"
        }
    .end annotation

    .line 30
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    .line 31
    iput-object p6, p0, Lcom/ibotta/android/state/app/config/ListConfigParser;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    .line 32
    iput-object p7, p0, Lcom/ibotta/android/state/app/config/ListConfigParser;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    return-void
.end method

.method private parseList(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 82
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/ListConfigParser;->parseValueToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 84
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 66
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/app/config/ListConfigParser;->parseList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 68
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/app/config/ListConfigParser;->trackException(Ljava/lang/Exception;)V

    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_0

    .line 72
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private trackException(Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "Failed to parse %s."

    const/4 v1, 0x1

    .line 91
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getNameForException()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method protected getIbottaJson()Lcom/ibotta/android/json/IbottaJson;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ListConfigParser;->ibottaJson:Lcom/ibotta/android/json/IbottaJson;

    return-object v0
.end method

.method protected abstract getNameForException()Ljava/lang/String;
.end method

.method protected bridge synthetic getPrefsValue()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getPrefsValue()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getPrefsValue()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getSemverFactory()Lcom/ibotta/android/util/SemverFactory;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ListConfigParser;->semverFactory:Lcom/ibotta/android/util/SemverFactory;

    return-object v0
.end method

.method protected bridge synthetic parseAppConfigValueIntoType()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->parseAppConfigValueIntoType()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected parseAppConfigValueIntoType()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected abstract parseValueToList(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation
.end method

.method protected bridge synthetic putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/app/config/ListConfigParser;->putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/util/List;)V

    return-void
.end method

.method protected putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences$Editor;",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/ListConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method
