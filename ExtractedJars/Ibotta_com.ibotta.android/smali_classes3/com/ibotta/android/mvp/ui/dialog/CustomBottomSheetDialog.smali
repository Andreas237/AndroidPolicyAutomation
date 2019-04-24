.class public Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;
.super Landroid/support/design/widget/BottomSheetDialog;
.source "CustomBottomSheetDialog.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;,
        Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;

.field protected llOptions:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09031b
    .end annotation
.end field

.field private options:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;",
            ">;"
        }
    .end annotation
.end field

.field protected tvTitle:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090587
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 79
    invoke-direct {p0, p1}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->initLayout()V

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

    .line 84
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;I)V

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->initLayout()V

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

    .line 90
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->initLayout()V

    return-void
.end method

.method private createDivider()Landroid/view/View;
    .locals 4

    .line 145
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fc

    .line 146
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 148
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 149
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07015d

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 150
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private createOptionView(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;
    .locals 4

    .line 131
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;-><init>(Landroid/content/Context;)V

    .line 132
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getIconResId()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getOptionTextResId()I

    move-result v2

    if-eqz v2, :cond_0

    .line 133
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->getOptionTextResId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;->access$000(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)Ljava/lang/String;

    move-result-object v2

    .line 132
    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setup(ILjava/lang/String;)V

    .line 135
    new-instance v1, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$CustomBottomSheetDialog$IlNX39KLW4gSnqnGQQqJRL0B478;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$CustomBottomSheetDialog$IlNX39KLW4gSnqnGQQqJRL0B478;-><init>(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    move-object p1, v0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 137
    :goto_1
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 139
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private initLayout()V
    .locals 1

    const v0, 0x7f0c00d3

    .line 95
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->setContentView(I)V

    .line 96
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    return-void
.end method

.method public static synthetic lambda$createOptionView$0(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;Landroid/view/View;)V
    .locals 0

    .line 135
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->onOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V

    return-void
.end method

.method private onOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;

    if-eqz v0, :cond_0

    .line 157
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;->onActionSheetOptionClicked(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)V

    .line 160
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->dismiss()V

    return-void
.end method

.method private onOptionsSet()V
    .locals 3

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->llOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    .line 119
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->options:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->options:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;

    .line 122
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->llOptions:Landroid/widget/LinearLayout;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->createOptionView(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;)Lcom/ibotta/android/mvp/ui/view/dialog/BottomSheetOptionView;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 124
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->options:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->llOptions:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->createDivider()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method protected onBackgroundClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0901f6
        }
    .end annotation

    .line 165
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->dismiss()V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$ActionSheetDialogListener;

    return-void
.end method

.method public setOptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog$CustomBottomSheetOption;",
            ">;)V"
        }
    .end annotation

    .line 111
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->options:Ljava/util/List;

    .line 113
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->onOptionsSet()V

    return-void
.end method

.method public setTitle(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 102
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/CustomBottomSheetDialog;->tvTitle:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method
