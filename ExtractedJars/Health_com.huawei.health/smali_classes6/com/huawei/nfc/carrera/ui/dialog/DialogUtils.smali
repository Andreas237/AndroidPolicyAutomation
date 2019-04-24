.class public Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;,
        Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;,
        Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;,
        Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;,
        Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createAlertDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;
    .locals 2

    .line 42
    new-instance v1, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    const/4 v0, 0x0

    invoke-direct {v1, p0, p6, v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V

    .line 43
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setTitle(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v1, p2}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setMessage(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v1, p3}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setPositiveButton(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v1, p4}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setNegativeButton(Ljava/lang/String;)V

    .line 47
    if-eqz p5, :cond_0

    .line 49
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setOnKeyListener()V

    .line 51
    :cond_0
    invoke-virtual {v1, p5}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setCancelable(Z)V

    .line 52
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 53
    return-object v1
.end method

.method public static createProgressBarDialog(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;
    .locals 2

    .line 213
    new-instance v0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V

    return-object v0
.end method

.method public static createProgressDialog(Landroid/content/Context;I)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;
    .locals 2

    .line 58
    new-instance v0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;-><init>(Landroid/content/Context;ILcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V

    return-object v0
.end method
