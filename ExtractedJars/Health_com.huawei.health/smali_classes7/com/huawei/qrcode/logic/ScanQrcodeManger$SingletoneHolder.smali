.class Lcom/huawei/qrcode/logic/ScanQrcodeManger$SingletoneHolder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/logic/ScanQrcodeManger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SingletoneHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/huawei/qrcode/logic/ScanQrcodeManger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/logic/ScanQrcodeManger;-><init>(Lcom/huawei/qrcode/logic/ScanQrcodeManger$1;)V

    sput-object v0, Lcom/huawei/qrcode/logic/ScanQrcodeManger$SingletoneHolder;->INSTANCE:Lcom/huawei/qrcode/logic/ScanQrcodeManger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
