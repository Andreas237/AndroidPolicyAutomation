.class Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setNegativeButton(Ljava/lang/String;)V
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

    .line 128
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$2;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$2;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->access$200(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$2;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->access$200(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;->onNegativeButtonClick()V

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$2;->this$0:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dismiss()V

    .line 138
    :cond_0
    return-void
.end method
