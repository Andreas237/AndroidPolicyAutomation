.class public abstract Lokhttp3/internal/Internal;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static instance:Lokhttp3/internal/Internal;

.field public static final logger:Ljava/util/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const-class v0, Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/Internal;->logger:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static initializeInstanceForTests()V
    .locals 1

    .line 42
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    .line 43
    return-void
.end method


# virtual methods
.method public abstract addLenient(Lokhttp3/Headers$Builder;Ljava/lang/String;)V
.end method

.method public abstract addLenient(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract apply(Lokhttp3/ConnectionSpec;Ljavax/net/ssl/SSLSocket;Z)V
.end method

.method public abstract callEngineGetStreamAllocation(Lokhttp3/Call;)Lokhttp3/internal/http/StreamAllocation;
.end method

.method public abstract callEnqueue(Lokhttp3/Call;Lokhttp3/Callback;Z)V
.end method

.method public abstract connectionBecameIdle(Lokhttp3/ConnectionPool;Lokhttp3/internal/io/RealConnection;)Z
.end method

.method public abstract get(Lokhttp3/ConnectionPool;Lokhttp3/Address;Lokhttp3/internal/http/StreamAllocation;)Lokhttp3/internal/io/RealConnection;
.end method

.method public abstract getHttpUrlChecked(Ljava/lang/String;)Lokhttp3/HttpUrl;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/net/UnknownHostException;
        }
    .end annotation
.end method

.method public abstract internalCache(Lokhttp3/OkHttpClient;)Lokhttp3/internal/InternalCache;
.end method

.method public abstract put(Lokhttp3/ConnectionPool;Lokhttp3/internal/io/RealConnection;)V
.end method

.method public abstract routeDatabase(Lokhttp3/ConnectionPool;)Lokhttp3/internal/RouteDatabase;
.end method

.method public abstract setCache(Lokhttp3/OkHttpClient$Builder;Lokhttp3/internal/InternalCache;)V
.end method
