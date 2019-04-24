.class public Lcom/huawei/up/utils/HttpConnectionAdaptor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;
    }
.end annotation


# static fields
.field private static final DEFAULTHTTPPORT:I = 0x50

.field private static final DEFAULTHTTPSPORT:I = 0x1bb

.field public static final DEFAULT_MAX_CONNECTIONS_LOCAL_ROUTE:I = 0x64

.field public static final DEFAULT_MAX_CONNECTIONS_PER_ROUTE:I = 0x14

.field public static final DEFAULT_MAX_TOTAL_CONNECTIONS:I = 0x320

.field private static final HTTPS_STR:Ljava/lang/String; = "https"

.field private static final HTTP_HOST_NAME:Ljava/lang/String; = "api.vmall.com"

.field private static final LOCK_OBJECT:Ljava/lang/Object;

.field private static final SSL_TYPE:Ljava/lang/String; = "TLS"

.field private static final TAG:Ljava/lang/String; = "HttpConnetionAdaptor"

.field private static httpClient:Lorg/apache/http/client/HttpClient; = null

.field private static httpParams:Lorg/apache/http/params/HttpParams; = null

.field private static limitedHttpClient:Lo/diy; = null

.field private static mContext:Landroid/content/Context; = null

.field private static plainSocketFactory:Lorg/apache/http/conn/scheme/PlainSocketFactory; = null

.field private static service:Lo/djf; = null

.field private static sf:Lorg/apache/http/conn/ssl/SSLSocketFactory; = null

.field private static supportedSchemes:Lorg/apache/http/conn/scheme/SchemeRegistry; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->mContext:Landroid/content/Context;

    .line 74
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 75
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->limitedHttpClient:Lo/diy;

    .line 77
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->sf:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    .line 79
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    .line 92
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->supportedSchemes:Lorg/apache/http/conn/scheme/SchemeRegistry;

    .line 94
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->plainSocketFactory:Lorg/apache/http/conn/scheme/PlainSocketFactory;

    .line 96
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->service:Lo/djf;

    .line 98
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->LOCK_OBJECT:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static SetLimitedScheme(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 198
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getURLInfo(Ljava/lang/String;)Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;

    move-result-object v1

    .line 201
    invoke-static {v1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getSchemeName(Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;)Ljava/lang/String;

    move-result-object v2

    .line 203
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->limitedHttpClient:Lo/diy;

    invoke-virtual {v0}, Lo/diy;->a()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->getSchemeRegistry()Lorg/apache/http/conn/scheme/SchemeRegistry;

    move-result-object v3

    .line 204
    invoke-static {v1, v2, v3}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->judgeRegistryName(Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;Ljava/lang/String;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 205
    return-void
.end method

.method private static SetScheme(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 172
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getURLInfo(Ljava/lang/String;)Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;

    move-result-object v1

    .line 175
    invoke-static {v1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getSchemeName(Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;)Ljava/lang/String;

    move-result-object v2

    .line 177
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpClient:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->getSchemeRegistry()Lorg/apache/http/conn/scheme/SchemeRegistry;

    move-result-object v3

    .line 178
    invoke-static {v1, v2, v3}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->judgeRegistryName(Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;Ljava/lang/String;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 179
    return-void
.end method

.method private static createHttpClient(Landroid/content/Context;)Lorg/apache/http/client/HttpClient;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 222
    :try_start_0
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->initSocketFactory(Landroid/content/Context;)V

    .line 223
    new-instance v3, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    sget-object v1, Lcom/huawei/up/utils/HttpConnectionAdaptor;->supportedSchemes:Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v3, v0, v1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 224
    new-instance v0, Ljava/lang/ref/WeakReference;

    new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;

    sget-object v2, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    invoke-direct {v1, v3, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/client/HttpClient;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 226
    :catch_0
    move-exception v3

    .line 228
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Service unavailable."

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1, v3}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method private static createLimitedHttpClient(Landroid/content/Context;)Lo/diy;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 238
    :try_start_0
    new-instance v0, Lo/djf;

    sget-object v1, Lcom/huawei/up/utils/HttpConnectionAdaptor;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/djf;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->service:Lo/djf;

    .line 239
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->service:Lo/djf;

    invoke-virtual {v0}, Lo/djf;->c()V

    .line 241
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->initSocketFactory(Landroid/content/Context;)V

    .line 242
    new-instance v3, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;

    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    sget-object v1, Lcom/huawei/up/utils/HttpConnectionAdaptor;->supportedSchemes:Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v3, v0, v1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V

    .line 243
    new-instance v0, Ljava/lang/ref/WeakReference;

    new-instance v1, Lo/diy;

    sget-object v2, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    invoke-direct {v1, v3, v2}, Lo/diy;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/diy;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 245
    :catch_0
    move-exception v3

    .line 247
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Service unavailable."

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1, v3}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method

.method public static getHttpClient(Landroid/content/Context;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 138
    sget-object v3, Lcom/huawei/up/utils/HttpConnectionAdaptor;->LOCK_OBJECT:Ljava/lang/Object;

    monitor-enter v3

    .line 139
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->mContext:Landroid/content/Context;

    .line 141
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpClient:Lorg/apache/http/client/HttpClient;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 142
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->createHttpClient(Landroid/content/Context;)Lorg/apache/http/client/HttpClient;

    move-result-object v0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 145
    :cond_0
    invoke-static {p1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->SetScheme(Ljava/lang/String;)V

    .line 147
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpClient:Lorg/apache/http/client/HttpClient;

    invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "accept-encoding"

    const-string v2, "gzip"

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 148
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpClient:Lorg/apache/http/client/HttpClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 149
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public static getHttpHost(Ljava/lang/String;)Lorg/apache/http/HttpHost;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 293
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getURLInfo(Ljava/lang/String;)Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;

    move-result-object v4

    .line 294
    invoke-static {v4}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getSchemeName(Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;)Ljava/lang/String;

    move-result-object v5

    .line 296
    new-instance v0, Ljava/lang/ref/WeakReference;

    new-instance v1, Lorg/apache/http/HttpHost;

    iget-object v2, v4, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->host:Ljava/lang/String;

    iget v3, v4, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->port:I

    invoke-direct {v1, v2, v3, v5}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/HttpHost;

    return-object v0
.end method

.method public static getHttpPost(Ljava/lang/String;IIZ)Lorg/apache/http/client/methods/HttpPost;
    .locals 3

    .line 113
    new-instance v0, Ljava/lang/ref/WeakReference;

    new-instance v1, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v1, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/http/client/methods/HttpPost;

    .line 114
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 115
    const/4 v0, 0x0

    return-object v0

    .line 117
    :cond_0
    invoke-static {v2, p1, p2, p3}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->setHttpParams(Lorg/apache/http/client/methods/HttpRequestBase;IIZ)V

    .line 118
    return-object v2
.end method

.method public static getLimitedHttpClient(Landroid/content/Context;Ljava/lang/String;)Lo/diy;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 155
    sget-object v3, Lcom/huawei/up/utils/HttpConnectionAdaptor;->LOCK_OBJECT:Ljava/lang/Object;

    monitor-enter v3

    .line 156
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->mContext:Landroid/content/Context;

    .line 158
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->limitedHttpClient:Lo/diy;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 159
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->createLimitedHttpClient(Landroid/content/Context;)Lo/diy;

    move-result-object v0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->limitedHttpClient:Lo/diy;

    .line 162
    :cond_0
    invoke-static {p1}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->SetLimitedScheme(Ljava/lang/String;)V

    .line 164
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->limitedHttpClient:Lo/diy;

    invoke-virtual {v0}, Lo/diy;->d()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "accept-encoding"

    const-string v2, "gzip"

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 165
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->limitedHttpClient:Lo/diy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 166
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method private static getSchemeName(Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;)Ljava/lang/String;
    .locals 3

    .line 301
    const-string v2, "https"

    .line 302
    iget-boolean v0, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->isHttps:Z

    if-eqz v0, :cond_0

    .line 304
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 308
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 310
    :goto_0
    return-object v2
.end method

.method private static getURLInfo(Ljava/lang/String;)Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/up/utils/NSPException;
        }
    .end annotation

    .line 315
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    new-instance v0, Lcom/huawei/up/utils/NSPException;

    const-string v1, "Url is empty."

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/up/utils/NSPException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 321
    :cond_0
    new-instance v4, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;-><init>(Lcom/huawei/up/utils/HttpConnectionAdaptor$1;)V

    .line 323
    const/16 v5, 0x1bb

    .line 324
    const-string v6, ""

    .line 327
    :try_start_0
    new-instance v7, Ljava/net/URL;

    invoke-direct {v7, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 329
    invoke-virtual {v7}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 331
    invoke-virtual {v7}, Ljava/net/URL;->getPort()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 336
    goto :goto_0

    .line 333
    :catch_0
    move-exception v7

    .line 335
    const-string v0, "HttpConnetionAdaptor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "EXCEPTION E = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    :goto_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 340
    invoke-static {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor;->getUrlHost(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 343
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    .line 345
    if-gtz v5, :cond_3

    .line 347
    if-eqz v7, :cond_2

    const/16 v5, 0x1bb

    goto :goto_1

    :cond_2
    const/16 v5, 0x50

    .line 351
    :cond_3
    :goto_1
    if-eqz v7, :cond_4

    .line 353
    const/4 v0, 0x1

    iput-boolean v0, v4, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->isHttps:Z

    goto :goto_2

    .line 357
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, v4, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->isHttps:Z

    .line 360
    :goto_2
    iput v5, v4, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->port:I

    .line 362
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 364
    iput-object v6, v4, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->host:Ljava/lang/String;

    .line 367
    :cond_5
    return-object v4
.end method

.method private static getUrlHost(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 373
    const-string v0, "//"

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    .line 374
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    .line 375
    const/4 v2, 0x0

    goto :goto_0

    .line 377
    :cond_0
    add-int/lit8 v2, v2, 0x2

    .line 379
    :goto_0
    const/16 v0, 0x3a

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 380
    const/4 v0, -0x1

    if-ne v3, v0, :cond_2

    .line 381
    const/16 v0, 0x2f

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 382
    if-ltz v3, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_1
    move v3, v0

    .line 385
    :cond_2
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 386
    return-object v1
.end method

.method private static initSocketFactory(Landroid/content/Context;)V
    .locals 7

    .line 257
    :try_start_0
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->sf:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 259
    new-instance v0, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    .line 260
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 261
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/apache/http/params/HttpProtocolParams;->setUseExpectContinue(Lorg/apache/http/params/HttpParams;Z)V

    .line 264
    new-instance v5, Lorg/apache/http/conn/params/ConnPerRouteBean;

    const/16 v0, 0x14

    invoke-direct {v5, v0}, Lorg/apache/http/conn/params/ConnPerRouteBean;-><init>(I)V

    .line 265
    new-instance v6, Lorg/apache/http/HttpHost;

    const-string v0, "localhost"

    const/16 v1, 0x50

    invoke-direct {v6, v0, v1}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V

    .line 266
    new-instance v0, Lorg/apache/http/conn/routing/HttpRoute;

    invoke-direct {v0, v6}, Lorg/apache/http/conn/routing/HttpRoute;-><init>(Lorg/apache/http/HttpHost;)V

    const/16 v1, 0x64

    invoke-virtual {v5, v0, v1}, Lorg/apache/http/conn/params/ConnPerRouteBean;->setMaxForRoute(Lorg/apache/http/conn/routing/HttpRoute;I)V

    .line 268
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    invoke-static {v0, v5}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxConnectionsPerRoute(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/params/ConnPerRoute;)V

    .line 270
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->httpParams:Lorg/apache/http/params/HttpParams;

    const/16 v1, 0x320

    invoke-static {v0, v1}, Lorg/apache/http/conn/params/ConnManagerParams;->setMaxTotalConnections(Lorg/apache/http/params/HttpParams;I)V

    .line 272
    const/4 v0, 0x0

    invoke-static {v0, p0}, Lo/ecm;->d(Ljava/security/KeyStore;Landroid/content/Context;)Lo/ecm;

    move-result-object v0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->sf:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    .line 275
    new-instance v0, Lorg/apache/http/conn/scheme/SchemeRegistry;

    invoke-direct {v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->supportedSchemes:Lorg/apache/http/conn/scheme/SchemeRegistry;

    .line 276
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->supportedSchemes:Lorg/apache/http/conn/scheme/SchemeRegistry;

    new-instance v1, Lorg/apache/http/conn/scheme/Scheme;

    const-string v2, "https"

    sget-object v3, Lcom/huawei/up/utils/HttpConnectionAdaptor;->sf:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    const/16 v4, 0x1bb

    invoke-direct {v1, v2, v3, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 278
    invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;

    move-result-object v0

    sput-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->plainSocketFactory:Lorg/apache/http/conn/scheme/PlainSocketFactory;

    .line 279
    sget-object v0, Lcom/huawei/up/utils/HttpConnectionAdaptor;->supportedSchemes:Lorg/apache/http/conn/scheme/SchemeRegistry;

    new-instance v1, Lorg/apache/http/conn/scheme/Scheme;

    const-string v2, "http"

    sget-object v3, Lcom/huawei/up/utils/HttpConnectionAdaptor;->plainSocketFactory:Lorg/apache/http/conn/scheme/PlainSocketFactory;

    const/16 v4, 0x50

    invoke-direct {v1, v2, v3, v4}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {v0, v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 286
    :cond_0
    goto :goto_0

    .line 283
    :catch_0
    move-exception v5

    .line 285
    const-string v0, "HttpConnetionAdaptor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSLContext initSocketFactory failed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :goto_0
    return-void
.end method

.method private static judgeRegistryName(Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;Ljava/lang/String;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
    .locals 3

    .line 182
    invoke-virtual {p2, p1}, Lorg/apache/http/conn/scheme/SchemeRegistry;->get(Ljava/lang/String;)Lorg/apache/http/conn/scheme/Scheme;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 184
    iget-boolean v0, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->isHttps:Z

    if-eqz v0, :cond_0

    .line 186
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    sget-object v1, Lcom/huawei/up/utils/HttpConnectionAdaptor;->sf:Lorg/apache/http/conn/ssl/SSLSocketFactory;

    iget v2, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->port:I

    invoke-direct {v0, p1, v1, v2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {p2, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    goto :goto_0

    .line 190
    :cond_0
    new-instance v0, Lorg/apache/http/conn/scheme/Scheme;

    sget-object v1, Lcom/huawei/up/utils/HttpConnectionAdaptor;->plainSocketFactory:Lorg/apache/http/conn/scheme/PlainSocketFactory;

    iget v2, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->port:I

    invoke-direct {v0, p1, v1, v2}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V

    invoke-virtual {p2, v0}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;

    .line 193
    :cond_1
    :goto_0
    return-void
.end method

.method private static setHttpParams(Lorg/apache/http/client/methods/HttpRequestBase;IIZ)V
    .locals 3

    .line 400
    invoke-virtual {p0}, Lorg/apache/http/client/methods/HttpRequestBase;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.connection.timeout"

    mul-int/lit16 v2, p1, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 401
    invoke-virtual {p0}, Lorg/apache/http/client/methods/HttpRequestBase;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.timeout"

    mul-int/lit16 v2, p2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 402
    invoke-virtual {p0}, Lorg/apache/http/client/methods/HttpRequestBase;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.protocol.handle-redirects"

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 403
    return-void
.end method
