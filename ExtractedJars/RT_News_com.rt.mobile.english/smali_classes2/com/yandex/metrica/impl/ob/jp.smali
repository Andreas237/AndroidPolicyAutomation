.class public Lcom/yandex/metrica/impl/ob/jp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jp;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/jo;)V
    .locals 8
    .param p1    # Lcom/yandex/metrica/impl/ob/jo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.android.installreferrer.api.InstallReferrerClient"

    .line 35
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "newBuilder"

    const/4 v2, 0x1

    .line 36
    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Landroid/content/Context;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 37
    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/jp;->a:Landroid/content/Context;

    aput-object v4, v3, v5

    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "com.android.installreferrer.api.InstallReferrerStateListener"

    .line 38
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "build"

    new-array v6, v5, [Ljava/lang/Class;

    invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    aput-object v1, v4, v5

    new-instance v6, Lcom/yandex/metrica/impl/ob/jl;

    new-instance v7, Lcom/yandex/metrica/impl/ob/jp$1;

    invoke-direct {v7, p1, v0}, Lcom/yandex/metrica/impl/ob/jp$1;-><init>(Lcom/yandex/metrica/impl/ob/jo;Ljava/lang/Object;)V

    invoke-direct {v6, v7}, Lcom/yandex/metrica/impl/ob/jl;-><init>(Lcom/yandex/metrica/impl/ob/jo;)V

    .line 40
    invoke-static {v3, v4, v6}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v3

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "startConnection"

    new-array v7, v2, [Ljava/lang/Class;

    aput-object v1, v7, v5

    invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v3, v2, v5

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 79
    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/jo;->a(Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception v0

    .line 77
    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/jo;->a(Ljava/lang/Throwable;)V

    return-void

    :catch_2
    move-exception v0

    .line 75
    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/jo;->a(Ljava/lang/Throwable;)V

    return-void

    :catch_3
    move-exception v0

    .line 73
    invoke-interface {p1, v0}, Lcom/yandex/metrica/impl/ob/jo;->a(Ljava/lang/Throwable;)V

    return-void
.end method
