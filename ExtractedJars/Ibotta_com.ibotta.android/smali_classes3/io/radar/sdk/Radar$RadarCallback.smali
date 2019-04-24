.class public interface abstract Lio/radar/sdk/Radar$RadarCallback;
.super Ljava/lang/Object;
.source "Radar.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/Radar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RadarCallback"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/Radar$RadarCallback$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cH&\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/radar/sdk/Radar$RadarCallback;",
        "",
        "onComplete",
        "",
        "status",
        "Lio/radar/sdk/Radar$RadarStatus;",
        "location",
        "Landroid/location/Location;",
        "events",
        "",
        "Lio/radar/sdk/model/RadarEvent;",
        "user",
        "Lio/radar/sdk/model/RadarUser;",
        "(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V",
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
.method public abstract onComplete(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V
    .param p1    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # [Lio/radar/sdk/model/RadarEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lio/radar/sdk/model/RadarUser;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method
