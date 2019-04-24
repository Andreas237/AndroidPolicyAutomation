.class public Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog_ViewBinding;
.super Ljava/lang/Object;
.source "NotificationDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;

    const-string v0, "field \'flRoot\'"

    .line 29
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901f6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->flRoot:Landroid/widget/FrameLayout;

    const-string v0, "field \'ibDismiss\'"

    .line 30
    const-class v1, Landroid/widget/ImageButton;

    const v2, 0x7f090233

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->ibDismiss:Landroid/widget/ImageButton;

    const-string v0, "field \'tvMessage\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090548

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->tvMessage:Landroid/widget/TextView;

    const-string v0, "field \'ivStar\'"

    .line 32
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902c9

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->ivStar:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->flRoot:Landroid/widget/FrameLayout;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->ibDismiss:Landroid/widget/ImageButton;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->tvMessage:Landroid/widget/TextView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/NotificationDialog;->ivStar:Landroid/widget/ImageView;

    return-void

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
