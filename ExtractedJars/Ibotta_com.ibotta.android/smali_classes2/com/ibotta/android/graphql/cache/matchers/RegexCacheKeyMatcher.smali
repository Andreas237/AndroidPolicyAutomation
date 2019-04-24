.class public Lcom/ibotta/android/graphql/cache/matchers/RegexCacheKeyMatcher;
.super Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;
.source "RegexCacheKeyMatcher.java"


# instance fields
.field private final pattern:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/cache/matchers/FuzzyCacheKeyMatcher;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/matchers/RegexCacheKeyMatcher;->pattern:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public isAMatch(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/matchers/RegexCacheKeyMatcher;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
