.class public Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;
.super Landroid/app/Dialog;
.source "RetailerPickerDialog.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;
    }
.end annotation


# instance fields
.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;

.field protected rvRetailers:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903dd
    .end annotation
.end field

.field protected tvOfferAtMultRetailers:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090554
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

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;-><init>(Landroid/content/Context;I)V

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

    .line 57
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->initLayout()V

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

    .line 62
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 67
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;)V

    const/4 v0, 0x1

    .line 69
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->requestWindowFeature(I)Z

    const v0, 0x7f0c00dc

    .line 70
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->setContentView(I)V

    .line 72
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, -0x1

    .line 75
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method static synthetic lambda$setup$0(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;Landroid/content/DialogInterface;)V
    .locals 0

    .line 96
    invoke-interface {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;->notifyRetailerPickerDialogDismissed()V

    return-void
.end method


# virtual methods
.method public onDismissClick()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090233
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;->notifyRetailerPickerDialogDismissClicked()V

    return-void
.end method

.method public onRetailerClicked(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;->notifyRetailerClicked(Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public setup(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->listener:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->tvOfferAtMultRetailers:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const p2, 0x7f1105a0

    invoke-virtual {v1, p2, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    new-instance p2, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {p2, v0, p0, p3}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;-><init>(Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;Ljava/util/List;)V

    .line 87
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->rvRetailers:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 88
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->rvRetailers:Landroid/support/v7/widget/RecyclerView;

    new-instance p3, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 90
    new-instance p2, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const p3, 0x7f060171

    .line 91
    invoke-virtual {p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p2

    check-cast p2, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const p3, 0x7f0701bb

    .line 92
    invoke-virtual {p2, p3}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object p2

    check-cast p2, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 93
    invoke-virtual {p2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object p2

    .line 94
    iget-object p3, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->rvRetailers:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 96
    new-instance p2, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$RetailerPickerDialog$SB1XJtr9V43sL44u7Yqo-R3aBeo;

    invoke-direct {p2, p1}, Lcom/ibotta/android/mvp/ui/dialog/-$$Lambda$RetailerPickerDialog$SB1XJtr9V43sL44u7Yqo-R3aBeo;-><init>(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;)V

    invoke-virtual {p0, p2}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
