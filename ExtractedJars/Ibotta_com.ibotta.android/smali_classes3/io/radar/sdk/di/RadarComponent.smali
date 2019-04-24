.class public interface abstract Lio/radar/sdk/di/RadarComponent;
.super Ljava/lang/Object;
.source "RadarComponent.kt"


# annotations
.annotation runtime Lio/radar/shadow/dagger/Component;
    modules = {
        Lio/radar/sdk/di/CoreModule;,
        Lio/radar/sdk/di/ApiModule;,
        Lio/radar/sdk/di/LocationModule;
    }
.end annotation

.annotation runtime Lio/radar/shadow/javax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/radar/sdk/di/RadarComponent;",
        "",
        "inject",
        "",
        "radar",
        "Lio/radar/sdk/Radar;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# virtual methods
.method public abstract inject(Lio/radar/sdk/Radar;)V
    .param p1    # Lio/radar/sdk/Radar;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
