.class Lcom/ibotta/android/view/common/CategorySectionAdapter$CategorySectionizer;
.super Ljava/lang/Object;
.source "CategorySectionAdapter.java"

# interfaces
.implements Lcom/mobsandgeeks/adapters/Sectionizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/common/CategorySectionAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CategorySectionizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/mobsandgeeks/adapters/Sectionizer<",
        "Lcom/ibotta/android/view/common/CategoryOfferPair;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/view/common/CategorySectionAdapter$1;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/view/common/CategorySectionAdapter$CategorySectionizer;-><init>()V

    return-void
.end method


# virtual methods
.method public getSectionTitleForItem(Lcom/ibotta/android/view/common/CategoryOfferPair;)Ljava/lang/String;
    .locals 0

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getCategory()Lcom/ibotta/api/model/offer/Category;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/Category;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getSectionTitleForItem(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 40
    check-cast p1, Lcom/ibotta/android/view/common/CategoryOfferPair;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/CategorySectionAdapter$CategorySectionizer;->getSectionTitleForItem(Lcom/ibotta/android/view/common/CategoryOfferPair;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
