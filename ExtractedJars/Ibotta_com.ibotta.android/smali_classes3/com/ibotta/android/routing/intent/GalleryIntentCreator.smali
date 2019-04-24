.class public Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "GalleryIntentCreator.java"


# instance fields
.field private bringToFront:Z

.field private clearTop:Z

.field protected pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private pwiRouteToGallery:Z

.field private retailerCategoryId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private search:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private selectedCategoryId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 48
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->selectedCategoryId:Ljava/lang/Integer;

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->search:Ljava/lang/String;

    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->clearTop:Z

    .line 36
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->bringToFront:Z

    .line 37
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->pwiRouteToGallery:Z

    .line 49
    new-instance p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 50
    iget-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->setId(I)V

    .line 51
    invoke-direct {p0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->getDefaultTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->selectedCategoryId:Ljava/lang/Integer;

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->search:Ljava/lang/String;

    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->clearTop:Z

    .line 36
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->bringToFront:Z

    .line 37
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->pwiRouteToGallery:Z

    .line 43
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->getDefaultTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-void
.end method

.method private getDefaultTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 55
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/routing/intent/GalleryIntentCreator;)V

    .line 56
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method


# virtual methods
.method public bringToFront(Z)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 0

    .line 85
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->bringToFront:Z

    return-object p0
.end method

.method public clearTop(Z)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 0

    .line 80
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->clearTop:Z

    return-object p0
.end method

.method public create()Landroid/content/Intent;
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->pwiRetailersHolder:Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/pwi/PwiRetailersHolder;->getPwiRetailers()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->pwiRouteToGallery:Z

    if-nez v0, :cond_0

    .line 111
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/pwi/routing/PwiRoutingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "activity"

    .line 112
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_0

    .line 114
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 117
    :goto_0
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->clearTop:Z

    if-eqz v1, :cond_1

    const/high16 v1, 0x4000000

    .line 118
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 121
    :cond_1
    iget-boolean v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->bringToFront:Z

    if-eqz v1, :cond_2

    const/high16 v1, 0x20000

    .line 122
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_2
    const-string v1, "tab_context"

    .line 126
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "retailer"

    .line 127
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    const-string v2, "retailer_category_id"

    .line 130
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 133
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->selectedCategoryId:Ljava/lang/Integer;

    if-eqz v1, :cond_4

    const-string v2, "selected_category_id"

    .line 134
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 137
    :cond_4
    iget-object v1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->search:Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v2, "search"

    .line 138
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_5
    return-object v0
.end method

.method public galleryIntentCreatorBundle(Landroid/os/Bundle;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 3

    const-string v0, "tab_context"

    .line 95
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    const-string v0, "retailer_category_id"

    const/4 v1, -0x1

    .line 96
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    const-string v0, "retailer_category_id"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    const-string v0, "selected_category_id"

    .line 97
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v1, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    const-string v0, "selected_category_id"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->selectedCategoryId:Ljava/lang/Integer;

    const-string v0, "search"

    .line 98
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->search:Ljava/lang/String;

    return-object p0
.end method

.method public pwiRouteToGallery(Z)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 0

    .line 90
    iput-boolean p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->pwiRouteToGallery:Z

    return-object p0
.end method

.method public retailerCategoryId(I)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 0

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->retailerCategoryId:Ljava/lang/Integer;

    return-object p0
.end method

.method public search(Ljava/lang/String;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->search:Ljava/lang/String;

    return-object p0
.end method

.method public selectedCategoryId(I)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 0

    .line 70
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->selectedCategoryId:Ljava/lang/Integer;

    return-object p0
.end method

.method public tabContext(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)Lcom/ibotta/android/routing/intent/GalleryIntentCreator;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/GalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object p0
.end method
