.class public Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;
.super Landroid/app/Dialog;
.source "UnlockAnimationDialog.java"

# interfaces
.implements Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;


# instance fields
.field protected uavUnlockAnimation:Lcom/ibotta/android/view/UnlockAnimationView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905a3
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x103005a

    .line 25
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;-><init>(Landroid/content/Context;I)V

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

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->initLayout()V

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

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 2

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const v0, 0x7f0c00dd

    .line 42
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->setContentView(I)V

    .line 43
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->uavUnlockAnimation:Lcom/ibotta/android/view/UnlockAnimationView;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/view/UnlockAnimationView;->setListener(Lcom/ibotta/android/view/UnlockAnimationView$AnimationResponseListener;)V

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->uavUnlockAnimation:Lcom/ibotta/android/view/UnlockAnimationView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/UnlockAnimationView;->startAnimation()V

    return-void
.end method


# virtual methods
.method public onAnimationFinished()V
    .locals 0

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/UnlockAnimationDialog;->dismiss()V

    return-void
.end method
