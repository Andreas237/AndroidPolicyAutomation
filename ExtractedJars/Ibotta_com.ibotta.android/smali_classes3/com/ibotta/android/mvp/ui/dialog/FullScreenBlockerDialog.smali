.class public Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;
.super Landroid/app/Dialog;
.source "FullScreenBlockerDialog.java"


# instance fields
.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;-><init>(Landroid/content/Context;I)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->initLayout()V

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
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 2

    const v0, 0x7f0c00d4

    .line 58
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->setContentView(I)V

    .line 59
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    return-void
.end method


# virtual methods
.method protected onDoneClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090086
        }
    .end annotation

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->dismiss()V

    return-void
.end method

.method public setIcon(I)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->ivIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public setMessage(I)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public updateTitleBarViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/FullScreenBlockerDialog;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-void
.end method
