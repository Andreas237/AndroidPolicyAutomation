.class public Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;
.super Ljava/lang/Object;
.source "BaseOfferCardView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    const-string v0, "field \'bvExpiringBanner\'"

    .line 33
    const-class v1, Lcom/ibotta/android/views/offer/badge/BadgeView;

    const v2, 0x7f0900e0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/offer/badge/BadgeView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bvExpiringBanner:Lcom/ibotta/android/views/offer/badge/BadgeView;

    const-string v0, "field \'tvType\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090592

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvType:Landroid/widget/TextView;

    const-string v0, "field \'tvAmount\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904ee

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvAmount:Landroid/widget/TextView;

    const-string v0, "field \'tvDescription\'"

    .line 36
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090515

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvDescription:Landroid/widget/TextView;

    const-string v0, "field \'iibIbottaImageButton\'"

    .line 37
    const-class v1, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const v2, 0x7f090246

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const-string v0, "field \'bvOffer\'"

    .line 38
    const-class v1, Lcom/ibotta/android/views/offer/badge/BadgeView;

    const v2, 0x7f0900de

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/offer/badge/BadgeView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bvOffer:Lcom/ibotta/android/views/offer/badge/BadgeView;

    const-string v0, "field \'ivRetailerStack\'"

    .line 39
    const-class v1, Lcom/ibotta/android/views/spotlight/RetailerStackView;

    const v2, 0x7f0902c3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/spotlight/RetailerStackView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivRetailerStack:Lcom/ibotta/android/views/spotlight/RetailerStackView;

    const-string v0, "field \'ivImage\'"

    .line 40
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902ad

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    const-string v0, "field \'bPayAtRetailer\'"

    .line 41
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f090098

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bPayAtRetailer:Landroid/widget/Button;

    const-string v0, "field \'clWrapper\'"

    .line 42
    const-class v1, Landroid/support/constraint/ConstraintLayout;

    const v2, 0x7f0900fb

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    const-string v0, "field \'lavAddButtonAnimation\'"

    .line 43
    const-class v1, Lcom/airbnb/lottie/LottieAnimationView;

    const v2, 0x7f0902e4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 51
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bvExpiringBanner:Lcom/ibotta/android/views/offer/badge/BadgeView;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvType:Landroid/widget/TextView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvAmount:Landroid/widget/TextView;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->tvDescription:Landroid/widget/TextView;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->iibIbottaImageButton:Lcom/ibotta/android/views/base/button/IbottaImageButton;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bvOffer:Lcom/ibotta/android/views/offer/badge/BadgeView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivRetailerStack:Lcom/ibotta/android/views/spotlight/RetailerStackView;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->ivImage:Landroid/widget/ImageView;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->bPayAtRetailer:Landroid/widget/Button;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->clWrapper:Landroid/support/constraint/ConstraintLayout;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/gallery/BaseOfferCardView;->lavAddButtonAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    return-void

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
