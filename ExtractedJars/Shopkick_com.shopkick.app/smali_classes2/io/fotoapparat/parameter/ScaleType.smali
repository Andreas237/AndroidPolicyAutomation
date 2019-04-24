.class public final enum Lio/fotoapparat/parameter/ScaleType;
.super Ljava/lang/Enum;
.source "ScaleType.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/fotoapparat/parameter/ScaleType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0004\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lio/fotoapparat/parameter/ScaleType;",
        "",
        "(Ljava/lang/String;I)V",
        "CenterCrop",
        "CenterInside",
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
.field private static final synthetic $VALUES:[Lio/fotoapparat/parameter/ScaleType;

.field public static final enum CenterCrop:Lio/fotoapparat/parameter/ScaleType;

.field public static final enum CenterInside:Lio/fotoapparat/parameter/ScaleType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lio/fotoapparat/parameter/ScaleType;

    new-instance v1, Lio/fotoapparat/parameter/ScaleType;

    const-string v2, "CenterCrop"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/fotoapparat/parameter/ScaleType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/fotoapparat/parameter/ScaleType;->CenterCrop:Lio/fotoapparat/parameter/ScaleType;

    aput-object v1, v0, v3

    new-instance v1, Lio/fotoapparat/parameter/ScaleType;

    const-string v2, "CenterInside"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lio/fotoapparat/parameter/ScaleType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/fotoapparat/parameter/ScaleType;->CenterInside:Lio/fotoapparat/parameter/ScaleType;

    aput-object v1, v0, v3

    sput-object v0, Lio/fotoapparat/parameter/ScaleType;->$VALUES:[Lio/fotoapparat/parameter/ScaleType;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/fotoapparat/parameter/ScaleType;
    .locals 1

    const-class v0, Lio/fotoapparat/parameter/ScaleType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/fotoapparat/parameter/ScaleType;

    return-object p0
.end method

.method public static values()[Lio/fotoapparat/parameter/ScaleType;
    .locals 1

    sget-object v0, Lio/fotoapparat/parameter/ScaleType;->$VALUES:[Lio/fotoapparat/parameter/ScaleType;

    invoke-virtual {v0}, [Lio/fotoapparat/parameter/ScaleType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/fotoapparat/parameter/ScaleType;

    return-object v0
.end method
