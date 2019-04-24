.class public Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;
.super Ljava/lang/Object;
.source "FullScreenImageDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

.field private view7f0901f6:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

    const-string v0, "field \'ivImage\'"

    .line 30
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ad

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->ivImage:Landroid/widget/ImageView;

    const-string v0, "method \'onDialogClicked\'"

    const v1, 0x7f0901f6

    .line 31
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;->view7f0901f6:Landroid/view/View;

    .line 33
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 46
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;

    .line 48
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->ivImage:Landroid/widget/ImageView;

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;->view7f0901f6:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 51
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog_ViewBinding;->view7f0901f6:Landroid/view/View;

    return-void

    .line 45
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
