.class public Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;
.super Lcom/ibotta/android/routing/intent/AbstractIntentCreator;
.source "SeasonalIntentCreator.java"


# instance fields
.field private categoryId:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private categoryType:Lcom/ibotta/api/model/retailer/CategoryType;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/routing/intent/AbstractIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->categoryId:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public create()Landroid/content/Intent;
    .locals 3

    .line 43
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->context:Landroid/content/Context;

    const-class v2, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 45
    new-instance v1, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;

    invoke-direct {v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;-><init>()V

    .line 47
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    if-eqz v2, :cond_0

    .line 48
    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setCategoryType(Lcom/ibotta/api/model/retailer/CategoryType;)V

    .line 51
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->categoryId:Ljava/lang/Integer;

    if-eqz v2, :cond_1

    .line 52
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/retailer/RetailerCategoryParcel;->setId(I)V

    :cond_1
    const-string v2, "retailer_category"

    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public forSeasonalCategory(I)Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;
    .locals 0

    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->categoryId:Ljava/lang/Integer;

    .line 37
    sget-object p1, Lcom/ibotta/api/model/retailer/CategoryType;->SEASONAL:Lcom/ibotta/api/model/retailer/CategoryType;

    iput-object p1, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    return-object p0
.end method

.method public forWhatsHot()Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;
    .locals 1

    .line 29
    sget-object v0, Lcom/ibotta/api/model/retailer/CategoryType;->HOT:Lcom/ibotta/api/model/retailer/CategoryType;

    iput-object v0, p0, Lcom/ibotta/android/routing/intent/SeasonalIntentCreator;->categoryType:Lcom/ibotta/api/model/retailer/CategoryType;

    return-object p0
.end method
