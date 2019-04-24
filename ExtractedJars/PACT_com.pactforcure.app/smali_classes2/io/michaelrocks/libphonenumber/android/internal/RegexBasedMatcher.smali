.class public final Lio/michaelrocks/libphonenumber/android/internal/RegexBasedMatcher;
.super Ljava/lang/Object;
.source "RegexBasedMatcher.java"

# interfaces
.implements Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;


# instance fields
.field private final regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Lio/michaelrocks/libphonenumber/android/RegexCache;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lio/michaelrocks/libphonenumber/android/RegexCache;-><init>(I)V

    iput-object v0, p0, Lio/michaelrocks/libphonenumber/android/internal/RegexBasedMatcher;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    .line 36
    return-void
.end method

.method public static create()Lio/michaelrocks/libphonenumber/android/internal/MatcherApi;
    .locals 1

    .prologue
    .line 31
    new-instance v0, Lio/michaelrocks/libphonenumber/android/internal/RegexBasedMatcher;

    invoke-direct {v0}, Lio/michaelrocks/libphonenumber/android/internal/RegexBasedMatcher;-><init>()V

    return-object v0
.end method


# virtual methods
.method public matchesNationalNumber(Ljava/lang/String;Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;Z)Z
    .locals 3
    .param p1, "nationalNumber"    # Ljava/lang/String;
    .param p2, "numberDesc"    # Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;
    .param p3, "allowPrefixMatch"    # Z

    .prologue
    .line 41
    iget-object v1, p0, Lio/michaelrocks/libphonenumber/android/internal/RegexBasedMatcher;->regexCache:Lio/michaelrocks/libphonenumber/android/RegexCache;

    .line 42
    invoke-virtual {p2}, Lio/michaelrocks/libphonenumber/android/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;

    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Lio/michaelrocks/libphonenumber/android/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 42
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 43
    .local v0, "nationalNumberPatternMatcher":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p3, :cond_1

    .line 44
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    .line 43
    :goto_0
    return v1

    .line 44
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method
