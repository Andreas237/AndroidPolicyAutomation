.class public Lcom/ibotta/android/state/app/config/ConfigParserHolder;
.super Ljava/lang/Object;
.source "ConfigParserHolder.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final configHolderMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/ibotta/android/state/app/config/ConfigId;",
            "Lcom/ibotta/android/state/app/config/ConfigParser;",
            ">;"
        }
    .end annotation
.end field

.field private final prefs:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->prefs:Landroid/content/SharedPreferences;

    .line 20
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->configHolderMap:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method protected createConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;
    .locals 6

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/ConfigId;->getAppConfigKey()Ljava/lang/String;

    move-result-object v1

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/ConfigId;->getAppConfigValue()Ljava/lang/String;

    move-result-object v2

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/ConfigId;->getPrefsKey()Ljava/lang/String;

    move-result-object v3

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/ConfigId;->getDefaultValue()Ljava/lang/Object;

    move-result-object v4

    .line 64
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/ConfigId;->getConfigParserType()Lcom/ibotta/android/state/app/config/ConfigParserType;

    move-result-object v0

    iget-object v5, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->prefs:Landroid/content/SharedPreferences;

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/android/state/app/config/ConfigParserType;->createConfigParser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object p1

    return-object p1
.end method

.method public getConfigHolderMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/ibotta/android/state/app/config/ConfigId;",
            "Lcom/ibotta/android/state/app/config/ConfigParser;",
            ">;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->configHolderMap:Ljava/util/HashMap;

    return-object v0
.end method

.method public getConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 36
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->getStashedConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    if-nez v0, :cond_1

    .line 39
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->createConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;

    move-result-object v0

    .line 40
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->putStashedConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;Lcom/ibotta/android/state/app/config/ConfigParser;)V

    :cond_1
    return-object v0
.end method

.method public getPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->prefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method protected getStashedConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;)Lcom/ibotta/android/state/app/config/ConfigParser;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->configHolderMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/ConfigParser;

    return-object p1
.end method

.method protected putStashedConfigParser(Lcom/ibotta/android/state/app/config/ConfigId;Lcom/ibotta/android/state/app/config/ConfigParser;)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->configHolderMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public reset()V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/ConfigParserHolder;->configHolderMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
