.class public Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "CategoryGalleryIntentCreator.java"


# instance fields
.field private final retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

.field private tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 23
    new-instance p1, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-direct {p1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    .line 24
    iget-object p1, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setId(I)V

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->getDefaultTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->getDefaultTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-void
.end method

.method private getDefaultTabContext()Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;
    .locals 1

    .line 41
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->FEATURED:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object v0
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 46
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/category/CategoryGalleryActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "tab_context"

    .line 47
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "retailer_category"

    .line 48
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->retailerCategoryParcel:Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public tabContext(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;)Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/CategoryGalleryIntentCreator;->tabContext:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonType;

    return-object p0
.end method
