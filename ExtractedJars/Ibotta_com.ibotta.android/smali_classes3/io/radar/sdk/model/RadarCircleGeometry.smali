.class public final Lio/radar/sdk/model/RadarCircleGeometry;
.super Lio/radar/sdk/model/RadarGeofenceGeometry;
.source "RadarGeofenceGeometry.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarCircleGeometry;",
        "Lio/radar/sdk/model/RadarGeofenceGeometry;",
        "center",
        "Lio/radar/sdk/model/Coordinate;",
        "radius",
        "",
        "(Lio/radar/sdk/model/Coordinate;D)V",
        "getCenter",
        "()Lio/radar/sdk/model/Coordinate;",
        "getRadius",
        "()D",
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
.field private final center:Lio/radar/sdk/model/Coordinate;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final radius:D


# direct methods
.method public constructor <init>(Lio/radar/sdk/model/Coordinate;D)V
    .locals 1
    .param p1    # Lio/radar/sdk/model/Coordinate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "center"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0}, Lio/radar/sdk/model/RadarGeofenceGeometry;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/radar/sdk/model/RadarCircleGeometry;->center:Lio/radar/sdk/model/Coordinate;

    iput-wide p2, p0, Lio/radar/sdk/model/RadarCircleGeometry;->radius:D

    return-void
.end method
