.class Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->showDownloadProgress(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 258
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$5;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V

    .line 262
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
