.class public abstract Lio/fotoapparat/characteristic/LensPosition;
.super Ljava/lang/Object;
.source "LensPosition.kt"

# interfaces
.implements Lio/fotoapparat/characteristic/Characteristic;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/characteristic/LensPosition$Back;,
        Lio/fotoapparat/characteristic/LensPosition$Front;,
        Lio/fotoapparat/characteristic/LensPosition$External;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lio/fotoapparat/characteristic/LensPosition;",
        "Lio/fotoapparat/characteristic/Characteristic;",
        "()V",
        "Back",
        "External",
        "Front",
        "Lio/fotoapparat/characteristic/LensPosition$Back;",
        "Lio/fotoapparat/characteristic/LensPosition$Front;",
        "Lio/fotoapparat/characteristic/LensPosition$External;",
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
.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lio/fotoapparat/characteristic/LensPosition;-><init>()V

    return-void
.end method
