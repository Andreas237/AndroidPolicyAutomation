.class public Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;
.super Ljava/lang/Object;
.source "ImUiUtilImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final context:Landroid/content/Context;

.field private listener:Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->context:Landroid/content/Context;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method static synthetic lambda$showAreYouSureDialog$0(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 28
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$showAreYouSureDialog$1(Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;ILandroid/content/DialogInterface;I)V
    .locals 0

    .line 30
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    .line 31
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;

    if-eqz p2, :cond_0

    .line 32
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;->onDisconnectConfirmTapped(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public setListener(Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->listener:Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;

    return-void
.end method

.method public showAreYouSureDialog(ILjava/lang/String;)V
    .locals 5

    .line 25
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const v4, 0x7f110380

    .line 26
    invoke-interface {v1, v4, v3}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p2, v3, v2

    const p2, 0x7f11037d

    .line 27
    invoke-interface {v1, p2, v3}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v1, v2, [Ljava/lang/Object;

    const v3, 0x7f11037e

    .line 28
    invoke-interface {v0, v3, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUiUtilImpl$JoRFXbiI5yCS6p-LMixOwqN0RpA;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUiUtilImpl$JoRFXbiI5yCS6p-LMixOwqN0RpA;

    invoke-virtual {p2, v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-array v1, v2, [Ljava/lang/Object;

    const v2, 0x7f11037f

    .line 29
    invoke-interface {v0, v2, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUiUtilImpl$r2EakuTRtZycYj50ZlYCin8xNkI;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/im/-$$Lambda$ImUiUtilImpl$r2EakuTRtZycYj50ZlYCin8xNkI;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;I)V

    invoke-virtual {p2, v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog$Builder;->show()Landroid/support/v7/app/AlertDialog;

    return-void
.end method
