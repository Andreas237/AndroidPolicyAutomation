.class final enum Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

.field public static final enum b:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

.field public static final enum c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

.field public static final enum d:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 50
    new-instance v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    const-string v1, "PREVIEW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    new-instance v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    const-string v1, "SUCCESS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->d:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    new-instance v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->b:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    .line 49
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    sget-object v1, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->c:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->d:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->b:Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->a:[Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;
    .locals 1

    .line 49
    const-class v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    return-object v0
.end method

.method public static values()[Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;
    .locals 1

    .line 49
    sget-object v0, Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->a:[Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    invoke-virtual {v0}, [Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/sim/esim/qrcode/decoding/CaptureActivityHandler$e;

    return-object v0
.end method
