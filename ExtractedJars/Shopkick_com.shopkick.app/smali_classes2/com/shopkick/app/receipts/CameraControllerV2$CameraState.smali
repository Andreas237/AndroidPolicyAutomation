.class final enum Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;
.super Ljava/lang/Enum;
.source "CameraControllerV2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "CameraState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_WAITING_FOR_FOCUS_LOCK:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_WAITING_FOR_PRECAPTURE_TO_END:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

.field public static final enum STATE_WAITING_TO_START_PRECAPTURE:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 91
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_INITIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 93
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_READY_TO_TAKE_FIRST_PHOTO"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 95
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_PICTURE_TAKEN"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 97
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_READY_TO_TAKE_ANOTHER_PHOTO"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 99
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_WAITING_FOR_FOCUS_LOCK"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_FOR_FOCUS_LOCK:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 101
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_WAITING_TO_START_PRECAPTURE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_TO_START_PRECAPTURE:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 103
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_WAITING_FOR_PRECAPTURE_TO_END"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_FOR_PRECAPTURE_TO_END:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    .line 105
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const-string v1, "STATE_ERROR"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    const/16 v0, 0x8

    .line 89
    new-array v0, v0, [Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_INITIAL:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_FIRST_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_PICTURE_TAKEN:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_READY_TO_TAKE_ANOTHER_PHOTO:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_FOR_FOCUS_LOCK:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_TO_START_PRECAPTURE:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v7

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_WAITING_FOR_PRECAPTURE_TO_END:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v8

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->STATE_ERROR:Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    aput-object v1, v0, v9

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->$VALUES:[Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 89
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;
    .locals 1

    .line 89
    const-class v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;
    .locals 1

    .line 89
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->$VALUES:[Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    invoke-virtual {v0}, [Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/receipts/CameraControllerV2$CameraState;

    return-object v0
.end method
