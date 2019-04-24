.class public final enum Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;
.super Ljava/lang/Enum;
.source "CameraControllerV3.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CameraState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;",
        "",
        "(Ljava/lang/String;I)V",
        "STATE_INITIAL",
        "STATE_READY_TO_TAKE_FIRST_PHOTO",
        "STATE_PICTURE_TAKEN",
        "STATE_READY_TO_TAKE_ANOTHER_PHOTO",
        "STATE_ERROR",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

.field public static final enum STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

.field public static final enum STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

.field public static final enum STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

.field public static final enum STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

.field public static final enum STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    new-instance v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    const-string v2, "STATE_INITIAL"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    const-string v2, "STATE_READY_TO_TAKE_FIRST_PHOTO"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    const-string v2, "STATE_PICTURE_TAKEN"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    const-string v2, "STATE_READY_TO_TAKE_ANOTHER_PHOTO"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    const-string v2, "STATE_ERROR"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->$VALUES:[Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;
    .locals 1

    const-class v0, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;
    .locals 1

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->$VALUES:[Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-virtual {v0}, [Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    return-object v0
.end method
