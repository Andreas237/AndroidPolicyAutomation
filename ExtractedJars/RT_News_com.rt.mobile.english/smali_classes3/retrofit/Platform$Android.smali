.class Lretrofit/Platform$Android;
.super Lretrofit/Platform;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Android"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Lretrofit/Platform;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lretrofit/Platform$1;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lretrofit/Platform$Android;-><init>()V

    return-void
.end method


# virtual methods
.method defaultCallbackExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    .line 150
    new-instance v0, Lretrofit/android/MainThreadExecutor;

    invoke-direct {v0}, Lretrofit/android/MainThreadExecutor;-><init>()V

    return-object v0
.end method

.method defaultClient()Lretrofit/client/Client$Provider;
    .locals 2

    .line 122
    invoke-static {}, Lretrofit/Platform;->access$300()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    invoke-static {}, Lretrofit/Platform$OkClientInstantiator;->instantiate()Lretrofit/client/Client;

    move-result-object v0

    goto :goto_0

    .line 124
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_1

    .line 125
    new-instance v0, Lretrofit/android/AndroidApacheClient;

    invoke-direct {v0}, Lretrofit/android/AndroidApacheClient;-><init>()V

    goto :goto_0

    .line 127
    :cond_1
    new-instance v0, Lretrofit/client/UrlConnectionClient;

    invoke-direct {v0}, Lretrofit/client/UrlConnectionClient;-><init>()V

    .line 129
    :goto_0
    new-instance v1, Lretrofit/Platform$Android$1;

    invoke-direct {v1, p0, v0}, Lretrofit/Platform$Android$1;-><init>(Lretrofit/Platform$Android;Lretrofit/client/Client;)V

    return-object v1
.end method

.method defaultConverter()Lretrofit/converter/Converter;
    .locals 2

    .line 117
    new-instance v0, Lretrofit/converter/GsonConverter;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-direct {v0, v1}, Lretrofit/converter/GsonConverter;-><init>(Lcom/google/gson/Gson;)V

    return-object v0
.end method

.method defaultHttpExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    .line 137
    new-instance v0, Lretrofit/Platform$Android$2;

    invoke-direct {v0, p0}, Lretrofit/Platform$Android$2;-><init>(Lretrofit/Platform$Android;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method defaultLog()Lretrofit/RestAdapter$Log;
    .locals 2

    .line 154
    new-instance v0, Lretrofit/android/AndroidLog;

    const-string v1, "Retrofit"

    invoke-direct {v0, v1}, Lretrofit/android/AndroidLog;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
