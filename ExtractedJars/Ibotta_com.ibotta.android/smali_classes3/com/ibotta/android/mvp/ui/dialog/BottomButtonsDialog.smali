.class public Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;
.super Landroid/support/design/widget/BottomSheetDialog;
.source "BottomButtonsDialog.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;,
        Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;

.field protected llOptions:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09031b
    .end annotation
.end field

.field private options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f120162

    .line 56
    invoke-direct {p0, p1, v0}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;I)V

    .line 57
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->initLayout()V

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

    .line 61
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;I)V

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->initLayout()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->onOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V

    return-void
.end method

.method private createOptionView(Landroid/widget/Button;Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)Landroid/widget/Button;
    .locals 1

    .line 93
    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->getButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 94
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$1;

    invoke-direct {v0, p0, p2}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$1;-><init>(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V

    instance-of p2, p1, Landroid/view/View;

    if-nez p2, :cond_0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p2, p1

    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-object p1
.end method

.method private initLayout()V
    .locals 1

    const v0, 0x7f0c014e

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->setContentView(I)V

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;

    if-eqz v0, :cond_0

    .line 106
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;->onBottomButtonsDialogOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V

    .line 108
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->dismiss()V

    return-void
.end method

.method private onOptionsSet()V
    .locals 6

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->llOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    .line 83
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->options:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->options:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c014f

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->llOptions:Landroid/widget/LinearLayout;

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 86
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->llOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 88
    invoke-direct {p0, v2, v1}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->createOptionView(Landroid/widget/Button;Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)Landroid/widget/Button;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method protected onCancelClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007f
        }
    .end annotation

    .line 113
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->dismiss()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonsDialogListener;

    return-void
.end method

.method public setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;",
            ">;)V"
        }
    .end annotation

    .line 75
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->options:Ljava/util/List;

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->onOptionsSet()V

    return-void
.end method
