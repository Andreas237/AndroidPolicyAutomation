.class public Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView_ViewBinding;
.super Ljava/lang/Object;
.source "ReceiptCaptureButtonsView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView_ViewBinding;-><init>(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView_ViewBinding;->target:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    const-string v0, "field \'llButtons\'"

    .line 29
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090300

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llButtons:Landroid/widget/LinearLayout;

    const-string v0, "field \'llProgress\'"

    .line 30
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090321

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llProgress:Landroid/widget/LinearLayout;

    const-string v0, "field \'bLeft\'"

    .line 31
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f090090

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bLeft:Landroid/widget/Button;

    const-string v0, "field \'llCenter\'"

    .line 32
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090302

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llCenter:Landroid/widget/LinearLayout;

    const-string v0, "field \'ibCenter\'"

    .line 33
    const-class v1, Landroid/widget/ImageButton;

    const v2, 0x7f09022e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->ibCenter:Landroid/widget/ImageButton;

    const-string v0, "field \'bRight\'"

    .line 34
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f0900a2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bRight:Landroid/widget/Button;

    const-string v0, "field \'tvCenterText\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090508

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->tvCenterText:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView_ViewBinding;->target:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 43
    iput-object v1, p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView_ViewBinding;->target:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llButtons:Landroid/widget/LinearLayout;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llProgress:Landroid/widget/LinearLayout;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bLeft:Landroid/widget/Button;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->llCenter:Landroid/widget/LinearLayout;

    .line 49
    iput-object v1, v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->ibCenter:Landroid/widget/ImageButton;

    .line 50
    iput-object v1, v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->bRight:Landroid/widget/Button;

    .line 51
    iput-object v1, v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;->tvCenterText:Landroid/widget/TextView;

    return-void

    .line 42
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
