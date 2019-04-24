.class synthetic Lcom/shopkick/app/receipts/CameraControllerV2$7;
.super Ljava/lang/Object;
.source "CameraControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 115
    invoke-static {}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->values()[Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_TO_START_PRECAPTURE:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$7;->$SwitchMap$com$shopkick$app$receipts$CameraControllerV2$CameraState:[I

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method
