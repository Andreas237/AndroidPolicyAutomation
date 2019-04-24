.class Lcom/huawei/qrcode/CaptureActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/CaptureActivity;->showCoustomPermissionDialog(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/CaptureActivity;

.field final synthetic val$isShowRequestPermission:Z


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/CaptureActivity;Z)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/CaptureActivity$2;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    iput-boolean p2, p0, Lcom/huawei/qrcode/CaptureActivity$2;->val$isShowRequestPermission:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    iget-boolean v0, p0, Lcom/huawei/qrcode/CaptureActivity$2;->val$isShowRequestPermission:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$2;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.CAMERA"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x14

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/CaptureActivity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$2;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/CaptureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/CaptureActivity$2;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v1}, Lcom/huawei/qrcode/CaptureActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/CommonUtil;->showInstalledAppDetails(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    invoke-static {}, Lcom/huawei/qrcode/CaptureActivity;->access$200()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startActivity MANAGE_APP_PERMISSIONS failed! e = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$2;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-static {v0}, Lcom/huawei/qrcode/CaptureActivity;->access$300(Lcom/huawei/qrcode/CaptureActivity;)V

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$2;->this$0:Lcom/huawei/qrcode/CaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/qrcode/CaptureActivity;->finish()V

    :goto_1
    return-void
.end method
