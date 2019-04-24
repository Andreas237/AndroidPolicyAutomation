.class final enum Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/decode/CaptureActivityHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

.field public static final enum DONE:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

.field public static final enum PREVIEW:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

.field public static final enum SUCCESS:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    const-string v1, "PREVIEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->PREVIEW:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    new-instance v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->SUCCESS:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    new-instance v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->DONE:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    sget-object v1, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->PREVIEW:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->SUCCESS:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->DONE:Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->$VALUES:[Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;
    .locals 1

    const-class v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    return-object v0
.end method

.method public static values()[Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->$VALUES:[Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    invoke-virtual {v0}, [Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/qrcode/decode/CaptureActivityHandler$State;

    return-object v0
.end method
