.class public final Lio/radar/sdk/Radar$RadarCallback$DefaultImpls;
.super Ljava/lang/Object;
.source "Radar.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/Radar$RadarCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# direct methods
.method public static bridge synthetic onComplete$default(Lio/radar/sdk/Radar$RadarCallback;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;ILjava/lang/Object;)V
    .locals 1

    if-nez p6, :cond_3

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    .line 55
    move-object p2, v0

    check-cast p2, Landroid/location/Location;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 56
    move-object p3, v0

    check-cast p3, [Lio/radar/sdk/model/RadarEvent;

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    check-cast p4, Lio/radar/sdk/model/RadarUser;

    :cond_2
    invoke-interface {p0, p1, p2, p3, p4}, Lio/radar/sdk/Radar$RadarCallback;->onComplete(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    return-void

    .line 0
    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onComplete"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
