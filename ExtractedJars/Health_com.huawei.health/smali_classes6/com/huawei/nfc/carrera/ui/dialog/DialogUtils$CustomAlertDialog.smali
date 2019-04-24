.class public Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CustomAlertDialog"
.end annotation


# instance fields
.field private dialog:Lo/yr;

.field private mListener:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    invoke-static {p1}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    .line 84
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->mListener:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;

    .line 85
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V
    .locals 0

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->mListener:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;

    return-object v0
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 203
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->dismiss()V

    .line 207
    :cond_0
    return-void
.end method

.method public getDialogObject()Lo/yr;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    return-object v0
.end method

.method public setCancelable(Z)V
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0, p1}, Lo/yr;->setCancelable(Z)V

    .line 168
    return-void
.end method

.method public setCanceledOnTouchOutside(Z)V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0, p1}, Lo/yr;->setCanceledOnTouchOutside(Z)V

    .line 173
    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 1

    .line 97
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0, p1}, Lo/yr;->c(Ljava/lang/String;)Lo/yr;

    .line 101
    :cond_0
    return-void
.end method

.method public setNegativeButton(Ljava/lang/String;)V
    .locals 2

    .line 125
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$2;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$2;-><init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)V

    invoke-interface {v0, p1, v1}, Lo/yr;->a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 141
    :cond_0
    return-void
.end method

.method public setOnKeyListener()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$3;-><init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)V

    invoke-interface {v0, v1}, Lo/yr;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 163
    return-void
.end method

.method public setPositiveButton(Ljava/lang/String;)V
    .locals 2

    .line 105
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$1;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog$1;-><init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;)V

    invoke-interface {v0, p1, v1}, Lo/yr;->c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 121
    :cond_0
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 89
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0, p1}, Lo/yr;->a(Ljava/lang/String;)Lo/yr;

    .line 93
    :cond_0
    return-void
.end method

.method public show()V
    .locals 3

    .line 182
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 184
    return-void

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    return-void

    .line 192
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    goto :goto_0

    .line 194
    :catch_0
    move-exception v2

    .line 196
    const-string v0, "show CustomAlertDialog failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 199
    :goto_0
    return-void
.end method
