.class public final Lio/radar/sdk/model/RadarPolygonGeometry;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0019\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarPolygonGeometry;",
        "Lio/radar/sdk/model/RadarGeofenceGeometry;",
        "coordinates",
        "",
        "Lio/radar/sdk/model/Coordinate;",
        "([Lio/radar/sdk/model/Coordinate;)V",
        "getCoordinates",
        "()[Lio/radar/sdk/model/Coordinate;",
        "[Lio/radar/sdk/model/Coordinate;",
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
.field private final coordinates:[Lio/radar/sdk/model/Coordinate;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>([Lio/radar/sdk/model/Coordinate;)V
    .locals 1
    .param p1    # [Lio/radar/sdk/model/Coordinate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, v0}, Lio/radar/sdk/model/RadarGeofenceGeometry;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/radar/sdk/model/RadarPolygonGeometry;->coordinates:[Lio/radar/sdk/model/Coordinate;

    return-void
.end method
