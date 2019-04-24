.class public Lcom/ibotta/android/state/app/config/cache/CacheOverridesConfigParser;
.super Lcom/ibotta/android/state/app/config/JsonConfigParser;
.source "CacheOverridesConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/JsonConfigParser<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Landroid/content/SharedPreferences;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;",
            ">;",
            "Landroid/content/SharedPreferences;",
            ")V"
        }
    .end annotation

    .line 22
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/JsonConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic parseJsonValueIntoObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 15
    invoke-virtual {p0, p1}, Lcom/ibotta/android/state/app/config/cache/CacheOverridesConfigParser;->parseJsonValueIntoObject(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected parseJsonValueIntoObject(Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/cache/CacheOverridesConfigParser;->getIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    const-class v1, Ljava/lang/String;

    const-class v2, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;

    invoke-interface {v0, p1, v1, v2}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToHashMap(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/HashMap;

    move-result-object p1

    return-object p1
.end method
