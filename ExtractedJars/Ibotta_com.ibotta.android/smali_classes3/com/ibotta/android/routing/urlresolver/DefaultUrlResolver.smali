.class public Lcom/ibotta/android/routing/urlresolver/DefaultUrlResolver;
.super Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;
.source "DefaultUrlResolver.java"


# static fields
.field private static final REGEX_LINKS_SUBDOMAIN:Ljava/lang/String; = "^http(s)?://links.ibotta.com/.*"

.field private static final REGEX_O_SUBDOMAIN:Ljava/lang/String; = "^http(s)?://o.ibotta.com/.*"

.field private static final REGEX_S_SUBDOMAIN:Ljava/lang/String; = "^http(s)?://s.ibotta.com/.*"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;-><init>()V

    return-void
.end method


# virtual methods
.method public isResolveable(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const-string v1, "^http(s)?://s.ibotta.com/.*"

    .line 25
    invoke-static {v1}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "^http(s)?://o.ibotta.com/.*"

    .line 26
    invoke-static {v1}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "^http(s)?://links.ibotta.com/.*"

    .line 27
    invoke-static {v1}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method protected onUrlResolved(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V
    .locals 1

    if-eqz p3, :cond_0

    .line 38
    new-instance p2, Lcom/ibotta/android/routing/urlresolver/UrlResolution;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolution;-><init>(ZLjava/lang/String;)V

    .line 39
    invoke-interface {p3, p2}, Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;->onUrlResolved(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V

    :cond_0
    return-void
.end method

.method public resolve(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V
    .locals 0

    .line 32
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/routing/urlresolver/DefaultUrlResolver;->fetchResolvedUrl(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V

    return-void
.end method
