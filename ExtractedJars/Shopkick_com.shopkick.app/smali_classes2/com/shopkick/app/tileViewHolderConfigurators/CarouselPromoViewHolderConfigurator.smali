.class public Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "CarouselPromoViewHolderConfigurator.java"


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/AgeVerificationController;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 0

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0161

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 0

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 38
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/store/CarouselPromoController;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    return-void
.end method

.method public setCarouselPromoController(Lcom/shopkick/app/store/CarouselPromoController;)V
    .locals 1

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->carouselPromoController:Lcom/shopkick/app/store/CarouselPromoController;

    const/16 v0, 0x71

    .line 26
    invoke-virtual {p1, v0}, Lcom/shopkick/app/store/CarouselPromoController;->getPromoConfigurator(I)Lcom/shopkick/app/store/PromoConfigurator;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/store/VideoPromoConfigurator;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/CarouselPromoViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/store/VideoPromoConfigurator;->setAgeVerificationController(Lcom/shopkick/app/account/AgeVerificationController;)V

    return-void
.end method
