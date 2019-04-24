.class Lcom/huawei/qrcode/constant/QrcodeConstant$Singletone;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/constant/QrcodeConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Singletone"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/huawei/qrcode/constant/QrcodeConstant;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/qrcode/constant/QrcodeConstant;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/constant/QrcodeConstant;-><init>(Lcom/huawei/qrcode/constant/QrcodeConstant$1;)V

    sput-object v0, Lcom/huawei/qrcode/constant/QrcodeConstant$Singletone;->INSTANCE:Lcom/huawei/qrcode/constant/QrcodeConstant;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
