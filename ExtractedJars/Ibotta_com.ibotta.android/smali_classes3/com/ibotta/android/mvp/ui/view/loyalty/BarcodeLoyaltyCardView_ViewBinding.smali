.class public Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView_ViewBinding;
.super Ljava/lang/Object;
.source "BarcodeLoyaltyCardView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    const-string v0, "field \'bivBarcode\'"

    .line 26
    const-class v1, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    const v2, 0x7f0900b8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->bivBarcode:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    const-string v0, "field \'tvCardName\'"

    .line 27
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090504

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardName:Landroid/widget/TextView;

    const-string v0, "field \'tvCardNumber\'"

    .line 28
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090505

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    const-string v0, "field \'tvCardNumberName\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090506

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumberName:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 37
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->bivBarcode:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardName:Landroid/widget/TextView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumberName:Landroid/widget/TextView;

    return-void

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
