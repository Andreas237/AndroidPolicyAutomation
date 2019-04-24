.class public Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;
.super Ljava/lang/Object;
.source "FuzzyCacheKeyMatcher.java"

# interfaces
.implements Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;


# instance fields
.field protected final key:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;->key:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;->key:Ljava/lang/String;

    return-object v0
.end method

.method public isAMatch(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;->key:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isExact()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
