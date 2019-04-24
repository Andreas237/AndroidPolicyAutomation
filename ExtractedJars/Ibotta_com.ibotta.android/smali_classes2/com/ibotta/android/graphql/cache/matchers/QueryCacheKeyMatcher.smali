.class public Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;
.super Ljava/lang/Object;
.source "QueryCacheKeyMatcher.java"

# interfaces
.implements Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;


# static fields
.field private static final ARGUMENT_NAME_VALUE:Ljava/lang/String; = "%1$s:%2$s"

.field private static final QUERY_PREFIX:Ljava/lang/String; = "%1$s("

.field private static final TRAILING_CHAR_CLOSE_PAREN:C = ')'

.field private static final TRAILING_CHAR_COMMA:C = ','


# instance fields
.field private final argumentsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final queryName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->queryName:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 29
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->argumentsMap:Ljava/util/Map;

    .line 31
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 32
    iget-object p3, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->argumentsMap:Ljava/util/Map;

    invoke-interface {p3, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 35
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->argumentsMap:Ljava/util/Map;

    :cond_1
    return-void
.end method

.method private isFollowedByClosingChar(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 75
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 76
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr v0, p2

    const/4 p2, 0x0

    if-ltz v0, :cond_3

    .line 79
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 80
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2c

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 81
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v0, 0x29

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-nez v1, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    const/4 p2, 0x1

    :cond_3
    return p2
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public isAMatch(Ljava/lang/String;)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    const-string v1, "%1$s("

    const/4 v2, 0x1

    .line 46
    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->queryName:Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_3

    .line 52
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->argumentsMap:Ljava/util/Map;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 54
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->argumentsMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    .line 56
    iget-object v3, p0, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->argumentsMap:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 57
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 58
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_2

    const-string v5, "null"

    goto :goto_1

    :cond_2
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_1
    const-string v7, "%1$s:%2$s"

    const/4 v8, 0x2

    .line 59
    new-array v8, v8, [Ljava/lang/Object;

    aput-object v6, v8, v0

    aput-object v5, v8, v2

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 61
    invoke-virtual {p1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-direct {p0, p1, v5}, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;->isFollowedByClosingChar(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-ne v4, v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :cond_5
    :goto_2
    return v2

    :cond_6
    :goto_3
    return v0
.end method

.method public isExact()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
