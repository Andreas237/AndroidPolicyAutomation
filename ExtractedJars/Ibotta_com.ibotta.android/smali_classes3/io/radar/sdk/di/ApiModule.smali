.class public final Lio/radar/sdk/di/ApiModule;
.super Ljava/lang/Object;
.source "ApiModule.kt"


# annotations
.annotation runtime Lio/radar/shadow/dagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/radar/sdk/di/ApiModule;",
        "",
        "()V",
        "requestQueue",
        "Lcom/android/volley/RequestQueue;",
        "context",
        "Landroid/content/Context;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/radar/sdk/di/ApiModule;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lio/radar/sdk/di/ApiModule;

    invoke-direct {v0}, Lio/radar/sdk/di/ApiModule;-><init>()V

    sput-object v0, Lio/radar/sdk/di/ApiModule;->INSTANCE:Lio/radar/sdk/di/ApiModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final requestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lio/radar/shadow/dagger/Provides;
    .end annotation

    .annotation runtime Lio/radar/shadow/javax/inject/Singleton;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {p0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;

    move-result-object p0

    const-string v0, "Volley.newRequestQueue(context)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
