.class public abstract Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;
.super Lio/fotoapparat/hardware/orientation/Orientation;
.source "Orientation.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fotoapparat/hardware/orientation/Orientation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Horizontal"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$Landscape;,
        Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$ReverseLandscape;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;",
        "Lio/fotoapparat/hardware/orientation/Orientation;",
        "degrees",
        "",
        "(I)V",
        "Landscape",
        "ReverseLandscape",
        "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$Landscape;",
        "Lio/fotoapparat/hardware/orientation/Orientation$Horizontal$ReverseLandscape;",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, p1, v0}, Lio/fotoapparat/hardware/orientation/Orientation;-><init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Lio/fotoapparat/hardware/orientation/Orientation$Horizontal;-><init>(I)V

    return-void
.end method
