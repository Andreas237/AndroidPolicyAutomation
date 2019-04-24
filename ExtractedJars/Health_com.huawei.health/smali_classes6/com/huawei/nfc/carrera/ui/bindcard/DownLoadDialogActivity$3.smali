.class Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->showDialog()V
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

    .line 132
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 135
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 136
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 137
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 139
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
