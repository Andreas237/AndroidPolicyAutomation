.class final Lcom/huawei/qrcode/constant/QrcodeConstant$6;
.super Lcom/huawei/qrcode/constant/QrcodeConstant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/constant/QrcodeConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/constant/QrcodeConstant;-><init>(Lcom/huawei/qrcode/constant/QrcodeConstant$1;)V

    const-string v0, "com.huawei.gamebox"

    iput-object v0, p0, Lcom/huawei/qrcode/constant/QrcodeConstant$6;->pkgName:Ljava/lang/String;

    const-string v0, "http://a.vmall.com/appdl/C10059090"

    iput-object v0, p0, Lcom/huawei/qrcode/constant/QrcodeConstant$6;->downUrl:Ljava/lang/String;

    return-void
.end method
