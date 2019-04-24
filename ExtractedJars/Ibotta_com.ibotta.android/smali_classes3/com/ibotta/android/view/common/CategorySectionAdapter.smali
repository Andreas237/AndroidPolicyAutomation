.class public Lcom/ibotta/android/view/common/CategorySectionAdapter;
.super Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;
.source "CategorySectionAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/common/CategorySectionAdapter$CategorySectionizer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/mobsandgeeks/adapters/SimpleSectionAdapter<",
        "Lcom/ibotta/android/view/common/CategoryOfferPair;",
        ">;"
    }
.end annotation


# instance fields
.field private adapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Lcom/ibotta/android/view/common/CategoryOfferPair;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ArrayAdapter;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/ArrayAdapter<",
            "Lcom/ibotta/android/view/common/CategoryOfferPair;",
            ">;)V"
        }
    .end annotation

    .line 19
    new-instance v5, Lcom/ibotta/android/view/common/CategorySectionAdapter$CategorySectionizer;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lcom/ibotta/android/view/common/CategorySectionAdapter$CategorySectionizer;-><init>(Lcom/ibotta/android/view/common/CategorySectionAdapter$1;)V

    const v3, 0x7f0c01c3

    const v4, 0x7f090571

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;-><init>(Landroid/content/Context;Landroid/widget/BaseAdapter;IILcom/mobsandgeeks/adapters/Sectionizer;)V

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/view/common/CategorySectionAdapter;->adapter:Landroid/widget/ArrayAdapter;

    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 30
    invoke-super {p0, p1, p2, p3}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    const p3, 0x7f0905bc

    .line 32
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_1

    if-nez p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    invoke-virtual {p3, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-object p2
.end method

.method public getWrappedAdapter()Landroid/widget/ArrayAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/widget/ArrayAdapter<",
            "Lcom/ibotta/android/view/common/CategoryOfferPair;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/view/common/CategorySectionAdapter;->adapter:Landroid/widget/ArrayAdapter;

    return-object v0
.end method
