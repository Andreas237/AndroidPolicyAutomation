.class final Lio/radar/sdk/Radar$forceTrack$2;
.super Lkotlin/jvm/internal/Lambda;
.source "Radar.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/Radar;->forceTrack(Landroid/location/Location;Lio/radar/sdk/Radar$RadarCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Location;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/location/Location;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field final synthetic $callback:Lio/radar/sdk/Radar$RadarCallback;


# direct methods
.method constructor <init>(Lio/radar/sdk/Radar$RadarCallback;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/Radar$forceTrack$2;->$callback:Lio/radar/sdk/Radar$RadarCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lio/radar/sdk/Radar$forceTrack$2;->invoke(Landroid/location/Location;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/location/Location;)V
    .locals 8
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 482
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {v0, p1}, Lio/radar/sdk/Radar;->handleLocation$sdk_release(Landroid/location/Location;)V

    goto :goto_0

    .line 484
    :cond_0
    iget-object v1, p0, Lio/radar/sdk/Radar$forceTrack$2;->$callback:Lio/radar/sdk/Radar$RadarCallback;

    if-eqz v1, :cond_1

    sget-object v2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lio/radar/sdk/Radar$RadarCallback$DefaultImpls;->onComplete$default(Lio/radar/sdk/Radar$RadarCallback;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;ILjava/lang/Object;)V

    .line 485
    :cond_1
    sget-object p1, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    invoke-static {p1, v0}, Lio/radar/sdk/Radar;->access$broadcastError(Lio/radar/sdk/Radar;Lio/radar/sdk/Radar$RadarStatus;)V

    :goto_0
    return-void
.end method
