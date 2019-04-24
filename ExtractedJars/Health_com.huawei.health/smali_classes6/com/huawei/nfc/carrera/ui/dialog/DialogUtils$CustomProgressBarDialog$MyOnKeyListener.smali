.class Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog$MyOnKeyListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "MyOnKeyListener"
.end annotation


# instance fields
.field private mListener:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;


# direct methods
.method private constructor <init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;)V
    .locals 0

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 274
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog$MyOnKeyListener;->mListener:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;

    .line 275
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V
    .locals 0

    .line 267
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog$MyOnKeyListener;-><init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;)V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 280
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 282
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog$MyOnKeyListener;->mListener:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;->onKeyBack()V

    .line 284
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
