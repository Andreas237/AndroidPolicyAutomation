.class public Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;
.super Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;
.source "OfferCacheKeyMatcher.java"


# static fields
.field private static final CACHE_KEY_OFFER:Ljava/lang/String; = "Offer.%1$d"

.field private static final REGEX_CACHE_KEY_OFFERS_QUERY:Ljava/lang/String; = "^offers\\(.*ids:\\[(?<offer_ids>.*)\\].*"

.field private static final REGEX_CACHE_KEY_OFFER_QUERY:Ljava/lang/String; = "^offer\\(.*id: (?<offer_id>\\d+).*"

.field private static final REGEX_PART_OFFER_ID:Ljava/lang/String; = "offer_id"

.field private static final REGEX_PART_OFFER_IDS:Ljava/lang/String; = "offer_ids"


# instance fields
.field private final offerId:I

.field private final offerQueryPattern:Lcom/google/code/regexp/Pattern;

.field private final offersQueryPattern:Lcom/google/code/regexp/Pattern;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const-string v0, ""

    .line 35
    invoke-direct {p0, v0}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    .line 36
    iput p1, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offerId:I

    const-string p1, "^offer\\(.*id: (?<offer_id>\\d+).*"

    .line 37
    invoke-static {p1}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offerQueryPattern:Lcom/google/code/regexp/Pattern;

    const-string p1, "^offers\\(.*ids:\\[(?<offer_ids>.*)\\].*"

    .line 38
    invoke-static {p1}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offersQueryPattern:Lcom/google/code/regexp/Pattern;

    return-void
.end method

.method private getOfferIdsFromCacheKey(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 53
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->getOfferIdsFromOfferQueryCacheKey(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 56
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->getOfferIdsFromOffersQueryCacheKey(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private getOfferIdsFromOfferQueryCacheKey(Ljava/lang/String;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 63
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 64
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offerQueryPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v1, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "offer_id"

    .line 67
    invoke-virtual {p1, v1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->stringToInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 72
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method private getOfferIdsFromOffersQueryCacheKey(Ljava/lang/String;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 80
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offersQueryPattern:Lcom/google/code/regexp/Pattern;

    invoke-virtual {v1, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "offer_ids"

    .line 84
    invoke-virtual {p1, v1}, Lcom/google/code/regexp/Matcher;->group(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 86
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, " "

    const-string v2, ""

    .line 87
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v1, ","

    .line 88
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 90
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 91
    invoke-direct {p0, v3}, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->stringToInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 94
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private stringToInteger(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 108
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

    .line 110
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
    .locals 5

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Offer.%1$d"

    const/4 v2, 0x1

    .line 119
    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " OR "

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "^offer\\(.*id: (?<offer_id>\\d+).*"

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " OR "

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "^offers\\(.*ids:\\[(?<offer_ids>.*)\\].*"

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAMatch(Ljava/lang/String;)Z
    .locals 5

    const-string v0, "Offer.%1$d"

    const/4 v1, 0x1

    .line 43
    new-array v2, v1, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 47
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->getOfferIdsFromCacheKey(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    iget v0, p0, Lcom/ibotta/android/graphql/cache/matchers/OfferCacheKeyMatcher;->offerId:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
