.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_ViewBinding;
.super Ljava/lang/Object;
.source "EarningsOfferRowView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    const-string v0, "field \'vTopDivider\'"

    const v1, 0x7f0905bc

    .line 27
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vTopDivider:Landroid/view/View;

    const-string v0, "field \'ivOfferImage\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b9

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->ivOfferImage:Landroid/widget/ImageView;

    const-string v0, "field \'tvOfferTitle\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090555

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvOfferAmountEarned\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090553

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferAmountEarned:Landroid/widget/TextView;

    const-string v0, "field \'vBottomSpace\'"

    const v1, 0x7f0905ad

    .line 31
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vBottomSpace:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vTopDivider:Landroid/view/View;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->ivOfferImage:Landroid/widget/ImageView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferTitle:Landroid/widget/TextView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->tvOfferAmountEarned:Landroid/widget/TextView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsOfferRowView;->vBottomSpace:Landroid/view/View;

    return-void

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
