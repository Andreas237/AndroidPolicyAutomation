.class public Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "RetailerPickerDialogAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;,
        Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private final listener:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;

.field private final retailerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/images/ImageCache;",
            "Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->listener:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->retailerModels:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->retailerModels:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 78
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;I)V
    .locals 5

    const-string v0, ""

    const-string v1, ""

    .line 62
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->retailerModels:Ljava/util/List;

    if-eqz v2, :cond_0

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->retailerModels:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v0

    .line 64
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->retailerModels:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    .line 67
    :cond_0
    iget-object v2, p1, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;->tvRetailerName:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v2

    iget-object v3, p1, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;->ivRetailerLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO_CIRCULAR:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v2, v1, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 70
    iget-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;->llRetailerContainer:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->retailerModels:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 71
    iget-object p2, p1, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;->llRetailerContainer:Landroid/widget/LinearLayout;

    instance-of v0, p2, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    check-cast p2, Landroid/view/View;

    invoke-static {p2, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 72
    :goto_0
    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;->llRetailerContainer:Landroid/widget/LinearLayout;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setFocusable(Z)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->listener:Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;

    if-eqz v0, :cond_0

    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$RetailerPickerDialogAdapterListener;->onRetailerClicked(Lcom/ibotta/api/model/RetailerModel;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;
    .locals 2

    .line 50
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c01b7

    const/4 v1, 0x0

    .line 52
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 54
    new-instance p2, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter$ViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialogAdapter;Landroid/view/View;)V

    return-object p2
.end method
