.class final enum Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;
.super Ljava/lang/Enum;
.source "CameraControllerV1.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/CameraControllerV1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "CameraState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

.field public static final enum PREVIEW:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

.field public static final enum TAKE:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

.field public static final enum TAKE_ANOTHER:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 68
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    const-string v1, "TAKE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    .line 70
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    const-string v1, "PREVIEW"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->PREVIEW:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    .line 72
    new-instance v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    const-string v1, "TAKE_ANOTHER"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE_ANOTHER:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    const/4 v0, 0x3

    .line 66
    new-array v0, v0, [Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->PREVIEW:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->TAKE_ANOTHER:Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->$VALUES:[Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 66
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;
    .locals 1

    .line 66
    const-class v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;
    .locals 1

    .line 66
    sget-object v0, Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->$VALUES:[Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    invoke-virtual {v0}, [Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/receipts/CameraControllerV1$CameraState;

    return-object v0
.end method
