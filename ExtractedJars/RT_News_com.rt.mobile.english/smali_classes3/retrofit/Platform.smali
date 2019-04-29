.class abstract Lretrofit/Platform;
.super Ljava/lang/Object;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/Platform$OkClientInstantiator;,
        Lretrofit/Platform$AppEngine;,
        Lretrofit/Platform$Android;,
        Lretrofit/Platform$Base;
    }
.end annotation


# static fields
.field static final HAS_RX_JAVA:Z

.field private static final PLATFORM:Lretrofit/Platform;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    invoke-static {}, Lretrofit/Platform;->findPlatform()Lretrofit/Platform;

    move-result-object v0

    sput-object v0, Lretrofit/Platform;->PLATFORM:Lretrofit/Platform;

    .line 40
    invoke-static {}, Lretrofit/Platform;->hasRxJavaOnClasspath()Z

    move-result v0

    sput-boolean v0, Lretrofit/Platform;->HAS_RX_JAVA:Z

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$300()Z
    .locals 1

    .line 37
    invoke-static {}, Lretrofit/Platform;->hasOkHttpOnClasspath()Z

    move-result v0

    return v0
.end method

.method private static findPlatform()Lretrofit/Platform;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "android.os.Build"

    .line 48
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 49
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-eqz v1, :cond_0

    .line 50
    new-instance v1, Lretrofit/Platform$Android;

    invoke-direct {v1, v0}, Lretrofit/Platform$Android;-><init>(Lretrofit/Platform$1;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :cond_0
    const-string v1, "com.google.appengine.runtime.version"

    .line 55
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 56
    new-instance v1, Lretrofit/Platform$AppEngine;

    invoke-direct {v1, v0}, Lretrofit/Platform$AppEngine;-><init>(Lretrofit/Platform$1;)V

    return-object v1

    .line 59
    :cond_1
    new-instance v1, Lretrofit/Platform$Base;

    invoke-direct {v1, v0}, Lretrofit/Platform$Base;-><init>(Lretrofit/Platform$1;)V

    return-object v1
.end method

.method static get()Lretrofit/Platform;
    .locals 1

    .line 43
    sget-object v0, Lretrofit/Platform;->PLATFORM:Lretrofit/Platform;

    return-object v0
.end method

.method private static hasOkHttpOnClasspath()Z
    .locals 1

    :try_start_0
    const-string v0, "com.squareup.okhttp.OkHttpClient"

    .line 172
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method private static hasRxJavaOnClasspath()Z
    .locals 1

    :try_start_0
    const-string v0, "rx.Observable"

    .line 191
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method abstract defaultCallbackExecutor()Ljava/util/concurrent/Executor;
.end method

.method abstract defaultClient()Lretrofit/client/Client$Provider;
.end method

.method abstract defaultConverter()Lretrofit/converter/Converter;
.end method

.method abstract defaultHttpExecutor()Ljava/util/concurrent/Executor;
.end method

.method abstract defaultLog()Lretrofit/RestAdapter$Log;
.end method
