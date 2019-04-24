.class Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setOnKeyListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$3;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 151
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$3;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->access$200(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$3;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dismiss()V

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$3;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->access$200(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;->onKeyBack()V

    .line 157
    const/4 v0, 0x1

    return v0

    .line 160
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
