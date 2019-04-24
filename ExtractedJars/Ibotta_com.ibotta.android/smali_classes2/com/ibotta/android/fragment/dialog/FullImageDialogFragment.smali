.class public Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "FullImageDialogFragment.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final KEY_IMAGE_URL:Ljava/lang/String; = "image_url"


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onCreateView$0(Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->dismissAllowingStateLoss()V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;
    .locals 3

    .line 27
    new-instance v0, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;-><init>()V

    .line 29
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "image_url"

    .line 30
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->dismiss()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 38
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x1030009

    .line 39
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->setStyle(II)V

    .line 40
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const p3, 0x7f0c00ef

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const-string p3, "image_url"

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const p3, 0x7f0902ad

    .line 50
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->PRODUCT_LARGE:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p2, p3, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 53
    new-instance p2, Lcom/ibotta/android/fragment/dialog/-$$Lambda$FullImageDialogFragment$OaHXdmfXBIKKTZi3KxIYnaBtvRs;

    invoke-direct {p2, p0}, Lcom/ibotta/android/fragment/dialog/-$$Lambda$FullImageDialogFragment$OaHXdmfXBIKKTZi3KxIYnaBtvRs;-><init>(Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;)V

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p3, p1

    check-cast p3, Landroid/view/View;

    invoke-static {p3, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 55
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/FullImageDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    const p3, 0x7f06001b

    invoke-virtual {p2, p3}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    return-object p1
.end method
