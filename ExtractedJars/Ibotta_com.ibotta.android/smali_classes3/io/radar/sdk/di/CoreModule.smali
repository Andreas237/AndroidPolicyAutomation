.class public final Lio/radar/sdk/di/CoreModule;
.super Ljava/lang/Object;
.source "CoreModule.kt"


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
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0002\u001a\u00020\u0003H\u0007J\u0008\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/radar/sdk/di/CoreModule;",
        "",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "deviceHelper",
        "Lio/radar/sdk/util/DeviceHelper;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/di/CoreModule;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final context()Landroid/content/Context;
    .locals 1
    .annotation runtime Lio/radar/shadow/dagger/Provides;
    .end annotation

    .annotation runtime Lio/radar/shadow/javax/inject/Singleton;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lio/radar/sdk/di/CoreModule;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final deviceHelper()Lio/radar/sdk/util/DeviceHelper;
    .locals 1
    .annotation runtime Lio/radar/shadow/dagger/Provides;
    .end annotation

    .annotation runtime Lio/radar/shadow/javax/inject/Singleton;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 22
    sget-object v0, Lio/radar/sdk/util/DeviceHelper;->INSTANCE:Lio/radar/sdk/util/DeviceHelper;

    return-object v0
.end method
