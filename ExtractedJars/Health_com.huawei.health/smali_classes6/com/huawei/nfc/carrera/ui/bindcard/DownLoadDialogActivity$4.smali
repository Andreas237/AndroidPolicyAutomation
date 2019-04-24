.class Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->startAppDownOrInstall(Lo/egv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

.field final synthetic val$dialog:Lo/egv;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Lo/egv;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->val$dialog:Lo/egv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult([I)V
    .locals 2

    .line 158
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p1, v0

    if-nez v0, :cond_0

    .line 161
    const-string v0, "UpgradeDialogActivity install apk read sdcard have permission"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->val$dialog:Lo/egv;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Landroid/content/DialogInterface;)V

    goto :goto_0

    .line 166
    :cond_0
    const-string v0, "UpgradeDialogActivity install apk read sdcard have not permission"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->val$dialog:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 169
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->val$dialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 171
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    sget v1, Lcom/huawei/wallet/R$string;->huaweiwallet_check_sdcard_permissions:I

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 174
    :goto_0
    return-void
.end method
