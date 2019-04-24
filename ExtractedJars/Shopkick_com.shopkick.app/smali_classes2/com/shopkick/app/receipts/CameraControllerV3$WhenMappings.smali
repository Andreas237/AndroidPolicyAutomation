.class public final synthetic Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->values()[Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1

    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV3$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV3$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1

    return-void
.end method
