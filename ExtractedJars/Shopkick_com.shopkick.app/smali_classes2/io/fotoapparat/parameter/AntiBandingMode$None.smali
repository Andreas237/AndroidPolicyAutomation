.class public final Lio/fotoapparat/parameter/AntiBandingMode$None;
.super Lio/fotoapparat/parameter/AntiBandingMode;
.source "AntiBandingMode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fotoapparat/parameter/AntiBandingMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "None"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lio/fotoapparat/parameter/AntiBandingMode$None;",
        "Lio/fotoapparat/parameter/AntiBandingMode;",
        "()V",
        "toString",
        "",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$None;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lio/fotoapparat/parameter/AntiBandingMode$None;

    invoke-direct {v0}, Lio/fotoapparat/parameter/AntiBandingMode$None;-><init>()V

    sput-object v0, Lio/fotoapparat/parameter/AntiBandingMode$None;->INSTANCE:Lio/fotoapparat/parameter/AntiBandingMode$None;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v0}, Lio/fotoapparat/parameter/AntiBandingMode;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "AntiBandingMode.None"

    return-object v0
.end method
