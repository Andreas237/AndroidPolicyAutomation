.class public Lcom/ibotta/android/routing/urlresolver/SendgridUrlResolver;
.super Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;
.source "SendgridUrlResolver.java"


# static fields
.field private static final REGEX_SENDGRID_EXTERNAL:Ljava/lang/String; = "^http(s)?://email.ibotta.com/wf/.*"

.field private static final REGEX_SENDGRID_IN_APP:Ljava/lang/String; = "^http(s)?://email.ibotta.com/uni/.*"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
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
    const-string v1, "^http(s)?://email.ibotta.com/wf/.*"

    .line 29
    invoke-static {v1}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "^http(s)?://email.ibotta.com/uni/.*"

    .line 30
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
    .locals 4

    const-string v0, "Sendgrid URL originally: %1$s"

    const/4 v1, 0x1

    .line 40
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "Sendgrid URL resolved to: %1$s"

    .line 41
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "^http(s)?://email.ibotta.com/uni/.*"

    .line 43
    invoke-static {v0}, Lcom/google/code/regexp/Pattern;->compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/code/regexp/Pattern;->matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string v0, "Resolved URL is an in-app route"

    .line 46
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v0, "Resolved URL is an external route"

    .line 48
    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eqz p3, :cond_1

    .line 52
    new-instance v0, Lcom/ibotta/android/routing/urlresolver/UrlResolution;

    invoke-direct {v0, p2, p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolution;-><init>(ZLjava/lang/String;)V

    .line 53
    invoke-interface {p3, v0}, Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;->onUrlResolved(Lcom/ibotta/android/routing/urlresolver/UrlResolution;)V

    :cond_1
    return-void
.end method

.method public resolve(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V
    .locals 0

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/routing/urlresolver/SendgridUrlResolver;->fetchResolvedUrl(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V

    return-void
.end method
