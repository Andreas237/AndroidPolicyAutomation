.class public Lcom/ibotta/android/graphql/cache/matchers/ModuleCacheKeyMatcher;
.super Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;
.source "ModuleCacheKeyMatcher.java"


# static fields
.field private static final REGEX_CACHE_KEY_MODULE_QUERY:Ljava/lang/String; = "^module\\([^_]*id:(?<module_id>\\d+).*"

.field private static final REGEX_PART_MODULE_ID:Ljava/lang/String; = "module_id"


# instance fields
.field private final moduleId:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const-string v0, ""

    .line 25
    invoke-direct {p0, v0}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    .line 26
    iput p1, p0, Lcom/ibotta/android/graphql/cache/matchers/ModuleCacheKeyMatcher;->moduleId:I

    return-void
.end method

.method private getModuleIdFromModuleQueryCacheKey(Ljava/lang/String;)I
    .locals 1

    const-string v0, "^module\\([^_]*id:(?<module_id>\\d+).*"

    .line 37
    invoke-static {v0}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "module_id"

    .line 42
    invoke-virtual {p1, v0}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/matchers/ModuleCacheKeyMatcher;->stringToInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 47
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method private stringToInteger(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 59
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to turn String into Integer: %1$s"

    const/4 v2, 0x1

    .line 61
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    const-string v0, "^module\\([^_]*id:(?<module_id>\\d+).*"

    return-object v0
.end method

.method public isAMatch(Ljava/lang/String;)Z
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/matchers/ModuleCacheKeyMatcher;->getModuleIdFromModuleQueryCacheKey(Ljava/lang/String;)I

    move-result p1

    iget v0, p0, Lcom/ibotta/android/graphql/cache/matchers/ModuleCacheKeyMatcher;->moduleId:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
