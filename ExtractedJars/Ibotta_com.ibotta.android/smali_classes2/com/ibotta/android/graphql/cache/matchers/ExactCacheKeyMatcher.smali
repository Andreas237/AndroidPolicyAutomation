.class public Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;
.super Ljava/lang/Object;
.source "ExactCacheKeyMatcher.java"

# interfaces
.implements Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;


# instance fields
.field private final key:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->key:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->key:Ljava/lang/String;

    return-object v0
.end method

.method public isAMatch(Ljava/lang/String;)Z
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/matchers/ExactCacheKeyMatcher;->key:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isExact()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
