.class public Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;
.super Landroid/app/AlertDialog;

# interfaces
.implements Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg$HwPrivilegedAction;
    }
.end annotation


# static fields
.field private static final DefaultPaddingForEMUI305:I = 0x10

.field private static final TAG:Ljava/lang/String; = "RawDlg"


# instance fields
.field private isCancelable:Z

.field private isCanceledOnTouchOutside:Z

.field private isSearchRequestedModify:Z

.field private isSearchRequestedReturn:Z

.field private mBuilder:Landroid/app/AlertDialog$Builder;

.field private mContext:Landroid/content/Context;

.field private mDialog:Landroid/app/AlertDialog;

.field private mDismissListener:Landroid/content/DialogInterface$OnDismissListener;

.field private mPaddingForEMUI305:I

.field private mShowListener:Landroid/content/DialogInterface$OnShowListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isCancelable:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isCanceledOnTouchOutside:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isSearchRequestedModify:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isSearchRequestedReturn:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mPaddingForEMUI305:I

    iput-object p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mContext:Landroid/content/Context;

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    iget v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mPaddingForEMUI305:I

    if-gez v0, :cond_0

    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v0, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41800000    # 16.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mPaddingForEMUI305:I

    :cond_0
    return-void
.end method

.method public static canCallSuper()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private initContentView(Landroid/view/View;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/huawei/qrcode/widget/WidgetBuilder;->isEmui305()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isReflexCallSuccess(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "RawAndroidDlg reflexCall fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    goto :goto_0

    :cond_0
    const-string v0, "RawAndroidDlg reflexCall success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    :cond_2
    :goto_0
    return-object p0
.end method

.method private isReflexCallSuccess(Landroid/view/View;)Z
    .locals 8

    const/4 v4, 0x0

    const-class v5, Landroid/app/AlertDialog$Builder;

    const-string v0, "setView"

    const/4 v1, 0x5

    :try_start_0
    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/view/View;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    iget v2, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mPaddingForEMUI305:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mPaddingForEMUI305:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v4, 0x1

    goto :goto_0

    :catch_0
    move-exception v7

    const-string v0, "RawAndroidDlg isReflexCallSuccess clazz.getMethod: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_0

    :catch_1
    move-exception v7

    const-string v0, "RawAndroidDlg isReflexCallSuccess invoke: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_0

    :catch_2
    move-exception v7

    const-string v0, "RawAndroidDlg isReflexCallSuccess invoke: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_0

    :catch_3
    move-exception v7

    const-string v0, "RawAndroidDlg isReflexCallSuccess invoke: "

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return v4
.end method


# virtual methods
.method public cancel()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->canCallSuper()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/app/AlertDialog;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    const-string v0, "RawDlg"

    const-string v1, "dimiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public dismiss()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->canCallSuper()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/app/AlertDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    const-string v0, "RawDlg"

    const-string v1, "dimiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public getButton(I)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method

.method public hide()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->hide()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "RawDlg"

    const-string v1, "dimiss failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public isShowing()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public onSearchRequested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isSearchRequestedModify:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isSearchRequestedReturn:Z

    return v0

    :cond_0
    invoke-static {}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->canCallSuper()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/app/AlertDialog;->onSearchRequested()Z

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public setCancelable(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isCancelable:Z

    return-void
.end method

.method public setCanceledOnTouchOutside(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isCanceledOnTouchOutside:Z

    return-void
.end method

.method public setCustomContentView(Landroid/view/View;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->initContentView(Landroid/view/View;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setCustomContentView(I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->initContentView(Landroid/view/View;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    return-void
.end method

.method public setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public setMessage(I)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->setMessage(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setMessage(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_1
    return-object p0
.end method

.method public setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_1
    return-object p0
.end method

.method public setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-void
.end method

.method public setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    return-void
.end method

.method public setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-void
.end method

.method public setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mShowListener:Landroid/content/DialogInterface$OnShowListener;

    return-void
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    return-object v0
.end method

.method public setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_1
    return-object p0
.end method

.method public setSearchRequestedReturn(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isSearchRequestedModify:Z

    iput-boolean p1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isSearchRequestedReturn:Z

    return-void
.end method

.method public final setShowingOnClick(Z)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mShowing"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    new-instance v0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg$HwPrivilegedAction;

    invoke-direct {v0, v2}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg$HwPrivilegedAction;-><init>(Ljava/lang/reflect/Field;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-nez p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "RawDlg"

    const-string v1, "showingDialog"

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "RawDlg"

    const-string v1, "showingDialog"

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_2
    move-exception v3

    const-string v0, "RawDlg"

    const-string v1, "showingDialog"

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-object p0
.end method

.method public setTitle(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    :cond_0
    return-void
.end method

.method public show()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mBuilder:Landroid/app/AlertDialog$Builder;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    iget-boolean v1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isCanceledOnTouchOutside:Z

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    iget-boolean v1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->isCancelable:Z

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mShowListener:Landroid/content/DialogInterface$OnShowListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    iget-object v1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mShowListener:Landroid/content/DialogInterface$OnShowListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    iget-object v1, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->mDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    invoke-static {}, Lcom/huawei/qrcode/widget/hw/dialog/RawAndroidDlg;->canCallSuper()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-super {p0}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "RawDlg"

    const-string v1, "showDialog failed."

    invoke-static {v0, v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
