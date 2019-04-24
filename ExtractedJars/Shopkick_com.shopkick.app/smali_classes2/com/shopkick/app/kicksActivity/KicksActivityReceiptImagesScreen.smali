.class public Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "KicksActivityReceiptImagesScreen.java"


# instance fields
.field private imageIndex:I

.field private largeImage:Landroid/support/v4/view/ViewPager;

.field private receiptImageView:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method public static synthetic lambda$createScreen$112(Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;Landroid/view/View;)V
    .locals 0

    .line 50
    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->popScreen()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p2, 0x7f0c0100

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 47
    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->receiptImageView:Landroid/widget/RelativeLayout;

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->receiptImageView:Landroid/widget/RelativeLayout;

    const p2, 0x7f090112

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 50
    new-instance p2, Lcom/shopkick/app/kicksActivity/-$$Lambda$KicksActivityReceiptImagesScreen$e47LchuUPOyS5K_RpZd-ANXrQHw;

    invoke-direct {p2, p0}, Lcom/shopkick/app/kicksActivity/-$$Lambda$KicksActivityReceiptImagesScreen$e47LchuUPOyS5K_RpZd-ANXrQHw;-><init>(Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->receiptImageView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09058a

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v4/view/ViewPager;

    iput-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->largeImage:Landroid/support/v4/view/ViewPager;

    .line 54
    new-instance p1, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/activities/KicksActivity;

    invoke-virtual {p2}, Lcom/shopkick/app/activities/KicksActivity;->getReceiptImageItems()Ljava/util/List;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->receiptImageView:Landroid/widget/RelativeLayout;

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;-><init>(Ljava/util/List;Landroid/view/View;)V

    .line 55
    iget-object p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->largeImage:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p2, p1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 58
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->largeImage:Landroid/support/v4/view/ViewPager;

    iget p2, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->imageIndex:I

    invoke-virtual {p1, p2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->receiptImageView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string p1, "image_index"

    .line 36
    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 37
    invoke-virtual {p0}, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->popScreen()V

    return-void

    :cond_0
    const-string p1, "image_index"

    .line 40
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->imageIndex:I

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/kicksActivity/KicksActivityReceiptImagesScreen;->largeImage:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/kicksActivity/ReceiptImageAdapter;->clear()V

    .line 70
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
