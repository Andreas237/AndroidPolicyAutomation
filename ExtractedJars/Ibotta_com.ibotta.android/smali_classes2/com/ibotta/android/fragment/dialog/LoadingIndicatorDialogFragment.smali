.class public Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "LoadingIndicatorDialogFragment.java"


# static fields
.field private static final KEY_FULL_SCREEN:Ljava/lang/String; = "full_screen"

.field private static final KEY_MESSAGE:Ljava/lang/String; = "message"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    return-void
.end method

.method private createLoadingIndicatorViewState(Landroid/os/Bundle;)Lcom/ibotta/android/views/base/loading/LoadingIndicatorViewState;
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 84
    sget-object v0, Lcom/ibotta/android/views/base/loading/LoadingIndicatorViewState;->EMPTY:Lcom/ibotta/android/views/base/loading/LoadingIndicatorViewState;

    if-eqz p1, :cond_0

    const-string v0, "message"

    const-string v1, ""

    .line 87
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 88
    new-instance v0, Lcom/ibotta/android/views/base/loading/LoadingIndicatorViewState;

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/base/loading/LoadingIndicatorViewState;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public static newInstance()Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;
    .locals 2

    const-string v0, ""

    const/4 v1, 0x0

    .line 29
    invoke-static {v0, v1}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->newInstance(Ljava/lang/String;Z)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;

    move-result-object v0

    return-object v0
.end method

.method public static newInstance(Ljava/lang/Integer;)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;
    .locals 1
    .param p0    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation

        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 33
    invoke-static {p0, v0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->newInstance(Ljava/lang/Integer;Z)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance(Ljava/lang/Integer;Z)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;
    .locals 1
    .param p0    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation

        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p0, :cond_0

    .line 41
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/App;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    .line 42
    :goto_0
    invoke-static {p0, p1}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->newInstance(Ljava/lang/String;Z)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-static {p0, v0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->newInstance(Ljava/lang/String;Z)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static newInstance(Ljava/lang/String;Z)Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;
    .locals 3

    .line 46
    new-instance v0, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;-><init>()V

    .line 48
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "message"

    .line 49
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "full_screen"

    .line 50
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 51
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 58
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x103005a

    .line 59
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const/4 p3, 0x0

    const v0, 0x7f0c00f0

    .line 64
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 70
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v0, "full_screen"

    .line 71
    invoke-virtual {p2, v0, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p3

    invoke-virtual {p3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p3

    const/16 v0, 0x400

    invoke-virtual {p3, v0, v0}, Landroid/view/Window;->setFlags(II)V

    :cond_1
    const p3, 0x7f0902f8

    .line 77
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/views/base/loading/LoadingIndicatorView;

    .line 78
    invoke-direct {p0, p2}, Lcom/ibotta/android/fragment/dialog/LoadingIndicatorDialogFragment;->createLoadingIndicatorViewState(Landroid/os/Bundle;)Lcom/ibotta/android/views/base/loading/LoadingIndicatorViewState;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/ibotta/android/views/base/loading/LoadingIndicatorView;->updateViewState(Lcom/ibotta/android/views/base/loading/LoadingIndicatorViewState;)V

    return-object p1
.end method
