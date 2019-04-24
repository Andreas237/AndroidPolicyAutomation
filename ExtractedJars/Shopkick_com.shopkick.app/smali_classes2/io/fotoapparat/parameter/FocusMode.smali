.class public abstract Lio/fotoapparat/parameter/FocusMode;
.super Ljava/lang/Object;
.source "FocusMode.kt"

# interfaces
.implements Lio/fotoapparat/parameter/Parameter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/parameter/FocusMode$Fixed;,
        Lio/fotoapparat/parameter/FocusMode$Infinity;,
        Lio/fotoapparat/parameter/FocusMode$Macro;,
        Lio/fotoapparat/parameter/FocusMode$Auto;,
        Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;,
        Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;,
        Lio/fotoapparat/parameter/FocusMode$Edof;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\u0008\tB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\u000c\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/fotoapparat/parameter/FocusMode;",
        "Lio/fotoapparat/parameter/Parameter;",
        "()V",
        "Auto",
        "ContinuousFocusPicture",
        "ContinuousFocusVideo",
        "Edof",
        "Fixed",
        "Infinity",
        "Macro",
        "Lio/fotoapparat/parameter/FocusMode$Fixed;",
        "Lio/fotoapparat/parameter/FocusMode$Infinity;",
        "Lio/fotoapparat/parameter/FocusMode$Macro;",
        "Lio/fotoapparat/parameter/FocusMode$Auto;",
        "Lio/fotoapparat/parameter/FocusMode$ContinuousFocusPicture;",
        "Lio/fotoapparat/parameter/FocusMode$ContinuousFocusVideo;",
        "Lio/fotoapparat/parameter/FocusMode$Edof;",
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
    invoke-direct {p0}, Lio/fotoapparat/parameter/FocusMode;-><init>()V

    return-void
.end method
