.class public Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;
.super Landroid/app/ProgressDialog;

# interfaces
.implements Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog$HwPrivilegedAction;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "RawProgressDialog"


# instance fields
.field private isSearchRequestedModify:Z

.field private isSearchRequestedReturn:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;->isSearchRequestedModify:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;->isSearchRequestedReturn:Z

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 3

    :try_start_0
    invoke-super {p0}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "RawProgressDialog"

    const-string v1, "dismiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public getMax()I
    .locals 1

    invoke-super {p0}, Landroid/app/ProgressDialog;->getMax()I

    move-result v0

    return v0
.end method

.method public getProgress()I
    .locals 1

    invoke-super {p0}, Landroid/app/ProgressDialog;->getProgress()I

    move-result v0

    return v0
.end method

.method public getSecondaryProgress()I
    .locals 1

    invoke-super {p0}, Landroid/app/ProgressDialog;->getSecondaryProgress()I

    move-result v0

    return v0
.end method

.method public incrementProgressBy(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->incrementProgressBy(I)V

    return-void
.end method

.method public incrementSecondaryProgressBy(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->incrementSecondaryProgressBy(I)V

    return-void
.end method

.method public isIndeterminate()Z
    .locals 1

    invoke-super {p0}, Landroid/app/ProgressDialog;->isIndeterminate()Z

    move-result v0

    return v0
.end method

.method public onSearchRequested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;->isSearchRequestedModify:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;->isSearchRequestedReturn:Z

    return v0

    :cond_0
    invoke-super {p0}, Landroid/app/ProgressDialog;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public setIndeterminate(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    return-void
.end method

.method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setMax(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setMax(I)V

    return-void
.end method

.method public setMessage(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setProgress(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setProgress(I)V

    return-void
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setProgressNumberFormat(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setProgressNumberFormat(Ljava/lang/String;)V

    return-void
.end method

.method public setProgressPercentFormat(Ljava/text/NumberFormat;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setProgressPercentFormat(Ljava/text/NumberFormat;)V

    return-void
.end method

.method public setProgressStyle(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    return-void
.end method

.method public setSearchRequestedReturn(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;->isSearchRequestedModify:Z

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog;->isSearchRequestedReturn:Z

    return-void
.end method

.method public setSecondaryProgress(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setSecondaryProgress(I)V

    return-void
.end method

.method public final setShowingOnClick(Z)V
    .locals 4

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mShowing"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    new-instance v0, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog$HwPrivilegedAction;

    invoke-direct {v0, v2}, Lcom/huawei/qrcode/widget/hw/dialog/RawProgressDialog$HwPrivilegedAction;-><init>(Ljava/lang/reflect/Field;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "RawProgressDialog"

    const-string v1, "showingDialog"

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "RawProgressDialog"

    const-string v1, "showingDialog"

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_2
    move-exception v3

    const-string v0, "RawProgressDialog"

    const-string v1, "showingDialog"

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setView(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/ProgressDialog;->setView(Landroid/view/View;)V

    return-void
.end method

.method public show()V
    .locals 3

    :try_start_0
    invoke-super {p0}, Landroid/app/ProgressDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "RawProgressDialog"

    const-string v1, "show failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
