.class public Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;
.super Landroid/app/Dialog;
.source "FullScreenImageDialog.java"


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ad
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x103000e

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->initLayout()V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/DialogInterface$OnCancelListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 2

    .line 50
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;)V

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x7f06001c

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const v0, 0x7f0c00d5

    .line 53
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->setContentView(I)V

    .line 54
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method protected onDialogClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0901f6
        }
    .end annotation

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->dismiss()V

    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 4

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenImageDialog;->ivImage:Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->PRODUCT_LARGE:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method
