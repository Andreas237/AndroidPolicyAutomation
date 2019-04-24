.class public Lcom/ibotta/android/routing/cleaner/RouteCleaner;
.super Ljava/lang/Object;
.source "RouteCleaner.java"


# static fields
.field private static final APP_PATH:Ljava/lang/String; = "/app"

.field public static final SCHEME_APP:Ljava/lang/String; = "ibotta-app://"

.field public static final SCHEME_HTTP:Ljava/lang/String; = "http://"

.field public static final SCHEME_HTTPS:Ljava/lang/String; = "https://"

.field private static final TUNE_GARBAGE:Ljava/lang/String; = "?mat_click_id="


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final formatting:Lcom/ibotta/android/util/Formatting;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->formatting:Lcom/ibotta/android/util/Formatting;

    return-void
.end method

.method private isWebAddress(Landroid/net/Uri;)Z
    .locals 2

    .line 132
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "https://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public cleanUp(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 39
    invoke-direct {p0, v0}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->isWebAddress(Landroid/net/Uri;)Z

    move-result v1

    .line 41
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_1

    .line 45
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_1
    const/4 v4, 0x0

    if-nez v2, :cond_2

    if-nez v3, :cond_2

    :try_start_0
    const-string v5, "UTF-8"

    .line 53
    invoke-static {p1, v5}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v5, "Failed to URL encode route."

    .line 57
    new-array v6, v4, [Ljava/lang/Object;

    invoke-static {p1, v5, v6}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1, v2}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 66
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_3
    :try_start_1
    const-string p1, "UTF-8"

    .line 71
    invoke-static {v3, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p1, "ibotta-app://"

    .line 73
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "ibotta-app://"

    const-string v2, ""

    .line 74
    invoke-virtual {v3, p1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    :cond_4
    const-string p1, "http://"

    .line 76
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "http://"

    const-string v2, ""

    .line 77
    invoke-virtual {v3, p1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    :cond_5
    const-string p1, "https://"

    .line 79
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "https://"

    const-string v2, ""

    .line 80
    invoke-virtual {v3, p1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    :cond_6
    const-string p1, "?mat_click_id="

    .line 82
    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "?mat_click_id="

    .line 83
    invoke-virtual {v3, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v3, v4, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    :cond_7
    const-string p1, "/app"

    .line 85
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "/app"

    const-string v2, ""

    .line 86
    invoke-virtual {v3, p1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    .line 89
    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string p1, "/"

    .line 90
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 91
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 94
    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    :cond_9
    :goto_1
    if-nez v1, :cond_a

    .line 100
    iget-object p1, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1, v0}, Lcom/ibotta/android/util/Formatting;->getEncodedQueryParams(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_a
    return-object v3
.end method

.method public ensureIbottaScheme(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 111
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->ensureIbottaScheme(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public ensureIbottaScheme(Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "http://"

    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "https://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "ibotta-app://"

    .line 124
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ibotta-app://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 128
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1

    .line 121
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->parseUriQuiet(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method
