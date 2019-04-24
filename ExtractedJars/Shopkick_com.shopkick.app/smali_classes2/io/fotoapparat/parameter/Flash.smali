.class public abstract Lio/fotoapparat/parameter/Flash;
.super Ljava/lang/Object;
.source "Flash.kt"

# interfaces
.implements Lio/fotoapparat/parameter/Parameter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fotoapparat/parameter/Flash$Off;,
        Lio/fotoapparat/parameter/Flash$On;,
        Lio/fotoapparat/parameter/Flash$Auto;,
        Lio/fotoapparat/parameter/Flash$AutoRedEye;,
        Lio/fotoapparat/parameter/Flash$Torch;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\u0008\t\n\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/fotoapparat/parameter/Flash;",
        "Lio/fotoapparat/parameter/Parameter;",
        "()V",
        "Auto",
        "AutoRedEye",
        "Off",
        "On",
        "Torch",
        "Lio/fotoapparat/parameter/Flash$Off;",
        "Lio/fotoapparat/parameter/Flash$On;",
        "Lio/fotoapparat/parameter/Flash$Auto;",
        "Lio/fotoapparat/parameter/Flash$AutoRedEye;",
        "Lio/fotoapparat/parameter/Flash$Torch;",
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
    invoke-direct {p0}, Lio/fotoapparat/parameter/Flash;-><init>()V

    return-void
.end method
