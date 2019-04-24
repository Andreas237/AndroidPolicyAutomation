.class public Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory;
.super Ljava/lang/Object;
.source "MyOffersGalleryViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;ILcom/ibotta/android/content/card/ContentCardReducer;)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/AbstractMyOffersGalleryViewHolder;
    .locals 2

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$gallery$GalleryRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->values()[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v1

    aget-object v1, v1, p2

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 23
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal GalleryRowType value "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->values()[Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0, p3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/MyOffersGalleryRowViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/ItemLevelOfferCardView;Lcom/ibotta/android/content/card/ContentCardReducer;)V

    goto :goto_0

    .line 17
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;

    new-instance p3, Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/holder/TitleBarRowViewHolder;-><init>(Lcom/ibotta/android/views/base/title/TitleBarView;)V

    :goto_0
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
