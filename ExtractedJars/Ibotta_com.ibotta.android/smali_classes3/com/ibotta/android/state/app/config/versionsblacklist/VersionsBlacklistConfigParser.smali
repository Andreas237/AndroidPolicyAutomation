.class public Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;
.super Lcom/ibotta/android/state/app/config/ListConfigParser;
.source "VersionsBlacklistConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/ListConfigParser<",
        "Lcom/vdurmont/semver4j/Semver;",
        ">;"
    }
.end annotation


# static fields
.field private static final NAME_FOR_EXCEPTION:Ljava/lang/String; = "versions blacklist"


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
            "Lcom/vdurmont/semver4j/Semver;",
            ">;",
            "Landroid/content/SharedPreferences;",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Lcom/ibotta/android/util/SemverFactory;",
            ")V"
        }
    .end annotation

    .line 27
    invoke-direct/range {p0 .. p7}, Lcom/ibotta/android/state/app/config/ListConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/content/SharedPreferences;Lcom/ibotta/android/json/IbottaJson;Lcom/ibotta/android/util/SemverFactory;)V

    return-void
.end method

.method public static synthetic lambda$parseValueToList$0(Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;Ljava/lang/String;)Z
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;->getSemverFactory()Lcom/ibotta/android/util/SemverFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/util/SemverFactory;->create(Ljava/lang/String;)Lcom/vdurmont/semver4j/Semver;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$parseValueToList$1(Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;Ljava/lang/String;)Lcom/vdurmont/semver4j/Semver;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;->getSemverFactory()Lcom/ibotta/android/util/SemverFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/util/SemverFactory;->create(Ljava/lang/String;)Lcom/vdurmont/semver4j/Semver;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected getNameForException()Ljava/lang/String;
    .locals 1

    const-string v0, "versions blacklist"

    return-object v0
.end method

.method protected parseValueToList(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/vdurmont/semver4j/Semver;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/json/IbottaJsonException;
        }
    .end annotation

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;->getIbottaJson()Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    const-class v1, Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/state/app/config/versionsblacklist/-$$Lambda$VersionsBlacklistConfigParser$pRCdlssONQhCYTFOvAmYDDMJCgM;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/config/versionsblacklist/-$$Lambda$VersionsBlacklistConfigParser$pRCdlssONQhCYTFOvAmYDDMJCgM;-><init>(Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;)V

    .line 33
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/state/app/config/versionsblacklist/-$$Lambda$VersionsBlacklistConfigParser$V3NpUq3LfhZxfd1gkwoeBAr308A;

    invoke-direct {v0, p0}, Lcom/ibotta/android/state/app/config/versionsblacklist/-$$Lambda$VersionsBlacklistConfigParser$V3NpUq3LfhZxfd1gkwoeBAr308A;-><init>(Lcom/ibotta/android/state/app/config/versionsblacklist/VersionsBlacklistConfigParser;)V

    .line 34
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 35
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
