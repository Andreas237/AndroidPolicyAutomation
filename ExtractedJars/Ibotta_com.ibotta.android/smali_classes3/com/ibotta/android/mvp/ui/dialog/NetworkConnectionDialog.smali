.class public Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;
.super Landroid/app/Dialog;
.source "NetworkConnectionDialog.java"


# instance fields
.field protected bConnectionErrorCta:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090083
    .end annotation
.end field

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 29
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->initLayout()V

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

    .line 34
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->initLayout()V

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

    .line 39
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 2

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x7f0800c1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    :cond_0
    const v0, 0x7f0c0183

    .line 49
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->setContentView(I)V

    .line 50
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->bConnectionErrorCta:Landroid/widget/Button;

    const v1, 0x7f110145

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->tvMessage:Landroid/widget/TextView;

    const v1, 0x7f11027f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method


# virtual methods
.method protected onCtaButtonClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090083
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->dismiss()V

    return-void
.end method
