.class final Lcom/huawei/qrcode/constant/QrcodeConstant$5;
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

    const-string v0, "com.huawei.wallet"

    iput-object v0, p0, Lcom/huawei/qrcode/constant/QrcodeConstant$5;->pkgName:Ljava/lang/String;

    const-string v0, "http://a.vmall.com/appdl/C10217244"

    iput-object v0, p0, Lcom/huawei/qrcode/constant/QrcodeConstant$5;->downUrl:Ljava/lang/String;

    return-void
.end method
