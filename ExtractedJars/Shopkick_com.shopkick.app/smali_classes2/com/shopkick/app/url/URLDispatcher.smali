.class public Lcom/shopkick/app/url/URLDispatcher;
.super Ljava/lang/Object;
.source "URLDispatcher.java"

# interfaces
.implements Lcom/shopkick/app/url/IURLHandlerCallback;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "URLDispatcher"

.field public static final SCHEME_HEADER:Ljava/lang/String; = "sk"

.field private static final SHOPKICK_PYLONS_HOST:Ljava/lang/String; = "app.shopkick.com"


# instance fields
.field private activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

.field private customHandlerCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

.field private handlersByKey:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/url/URLHandler;",
            ">;"
        }
    .end annotation
.end field

.field private urlDispatcherFinishedCallback:Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;

.field private webView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebView;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/url/URLHandler;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/url/URLDispatcher;->webView:Landroid/webkit/WebView;

    .line 29
    iput-object p2, p0, Lcom/shopkick/app/url/URLDispatcher;->handlersByKey:Ljava/util/Map;

    return-void
.end method

.method public static convertAppContextLink(Landroid/net/Uri;)Ljava/lang/String;
    .locals 4

    .line 207
    invoke-static {p0}, Lcom/shopkick/app/url/URLDispatcher;->isShopkickContextLink(Landroid/net/Uri;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 210
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 213
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 215
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string/jumbo v2, "sk"

    .line 216
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 217
    invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    const/4 v0, 0x1

    .line 218
    :goto_0
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 219
    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 221
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 222
    invoke-virtual {p0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_1

    .line 224
    :cond_2
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    return-object v1

    :cond_4
    return-object v1
.end method

.method public static convertDeepLinkToSkUrl(Landroid/net/Uri;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 183
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "sk"

    .line 184
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 186
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string/jumbo v2, "shopkick"

    .line 188
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 190
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string/jumbo v1, "sk"

    .line 191
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 192
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 193
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    .line 194
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/net/Uri$Builder;->encodedQuery(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 195
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static convertDeepLinkToSkUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 171
    invoke-static {p0}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 172
    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lcom/shopkick/app/url/URLDispatcher;->convertDeepLinkToSkUrl(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static createSkURL(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 155
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string/jumbo v1, "sk"

    .line 156
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    if-eqz p1, :cond_0

    .line 158
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 159
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 162
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getUriKey(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "sk"

    .line 147
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    sget-object p0, Lcom/shopkick/app/url/URLDispatcher;->LOG_TAG:Ljava/lang/String;

    const-string/jumbo v0, "url scheme must be \'sk:\'."

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return-object p0

    .line 151
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getUriKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 142
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lcom/shopkick/app/url/URLDispatcher;->getUriKey(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static isShopkickContextLink(Landroid/net/Uri;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 231
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 235
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 236
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p0

    const-string v1, "app.shopkick.com"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v0
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/url/URLDispatcher;->activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {v0}, Lcom/shopkick/app/url/URLHandler;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Lcom/shopkick/app/url/URLDispatcher;->activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

    .line 37
    iput-object v0, p0, Lcom/shopkick/app/url/URLDispatcher;->webView:Landroid/webkit/WebView;

    return-void
.end method

.method public dispatchURL(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 41
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public dispatchURL(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Z
    .locals 7

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 49
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 75
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 76
    invoke-static {v1}, Lcom/shopkick/app/url/URLDispatcher;->getUriKey(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return v0

    .line 82
    :cond_1
    invoke-virtual {v1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    .line 83
    invoke-static {p1}, Lcom/shopkick/app/url/UriUtils;->paramMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    if-eqz p2, :cond_2

    .line 85
    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 87
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/url/URLDispatcher;->customHandlerCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    const/4 v3, 0x1

    if-eqz p2, :cond_3

    .line 88
    invoke-interface {p2, v2, v1, p1}, Lcom/shopkick/app/url/IURLDispatcherCallback;->handleLink(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Z

    move-result p2

    if-eqz p2, :cond_3

    return v3

    .line 93
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/url/URLDispatcher;->handlersByKey:Ljava/util/Map;

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/url/URLHandler;

    if-nez p2, :cond_4

    return v0

    .line 98
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/url/URLDispatcher;->activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

    if-eqz v2, :cond_5

    iget-boolean v2, p2, Lcom/shopkick/app/url/URLHandler;->isAsync:Z

    if-eqz v2, :cond_5

    return v0

    .line 103
    :cond_5
    iget-boolean v0, p2, Lcom/shopkick/app/url/URLHandler;->isAsync:Z

    if-eqz v0, :cond_6

    .line 104
    invoke-virtual {p2}, Lcom/shopkick/app/url/URLHandler;->clone()Lcom/shopkick/app/url/URLHandler;

    move-result-object p2

    .line 105
    iput-object p0, p2, Lcom/shopkick/app/url/URLHandler;->callback:Lcom/shopkick/app/url/IURLHandlerCallback;

    .line 106
    iput-object p2, p0, Lcom/shopkick/app/url/URLDispatcher;->activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

    .line 109
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/url/URLDispatcher;->webView:Landroid/webkit/WebView;

    iput-object v0, p2, Lcom/shopkick/app/url/URLHandler;->webView:Landroid/webkit/WebView;

    .line 110
    iput-object v1, p2, Lcom/shopkick/app/url/URLHandler;->urlPathComponents:Ljava/util/List;

    .line 111
    iput-object p1, p2, Lcom/shopkick/app/url/URLHandler;->params:Ljava/util/Map;

    .line 113
    invoke-virtual {p2}, Lcom/shopkick/app/url/URLHandler;->execute()V

    return v3
.end method

.method public dispatchURL(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 58
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    :cond_0
    if-eqz p3, :cond_1

    const-string v0, "origin_screen"

    .line 60
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p4, :cond_2

    const-string p3, "origin_overlay"

    .line 62
    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p5, :cond_3

    const-string p3, "origin_element"

    .line 64
    invoke-static {p5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-interface {p2, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    if-eqz p6, :cond_4

    const-string p3, "origin_element_id"

    .line 65
    invoke-interface {p2, p3, p6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public getActiveAsyncHandler()Lcom/shopkick/app/url/URLHandler;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/url/URLDispatcher;->activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

    return-object v0
.end method

.method public handlerDidFinish(Lcom/shopkick/app/url/URLHandler;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/url/URLDispatcher;->activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 120
    iput-object p1, v0, Lcom/shopkick/app/url/URLHandler;->callback:Lcom/shopkick/app/url/IURLHandlerCallback;

    .line 121
    iput-object p1, p0, Lcom/shopkick/app/url/URLDispatcher;->activeAsyncHandler:Lcom/shopkick/app/url/URLHandler;

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/url/URLDispatcher;->urlDispatcherFinishedCallback:Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;

    if-eqz p1, :cond_0

    .line 123
    invoke-interface {p1}, Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;->dispatcherDidFinish()V

    :cond_0
    return-void
.end method

.method public setCallback(Lcom/shopkick/app/url/IURLDispatcherCallback;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/shopkick/app/url/URLDispatcher;->customHandlerCallback:Lcom/shopkick/app/url/IURLDispatcherCallback;

    return-void
.end method

.method public setUrlDispatcherFinishedCallback(Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/shopkick/app/url/URLDispatcher;->urlDispatcherFinishedCallback:Lcom/shopkick/app/url/IURLDispatcherFinishedCallback;

    return-void
.end method
