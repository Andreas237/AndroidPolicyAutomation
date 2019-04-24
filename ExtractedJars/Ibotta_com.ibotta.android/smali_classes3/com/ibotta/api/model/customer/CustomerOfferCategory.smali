.class public Lcom/ibotta/api/model/customer/CustomerOfferCategory;
.super Ljava/lang/Object;
.source "CustomerOfferCategory.java"

# interfaces
.implements Lcom/ibotta/api/model/customer/ServerCategorySetting;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/api/model/customer/ServerCategorySetting<",
        "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
        ">;"
    }
.end annotation


# instance fields
.field private categoryId:I

.field private sortOrder:S

.field private viewState:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public copy()Lcom/ibotta/api/model/customer/CustomerOfferCategory;
    .locals 2

    .line 55
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;

    invoke-direct {v0}, Lcom/ibotta/api/model/customer/CustomerOfferCategory;-><init>()V

    .line 57
    iget v1, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->categoryId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->setCategoryId(I)V

    .line 58
    iget-object v1, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->viewState:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->setViewState(Ljava/lang/String;)V

    .line 59
    iget-short v1, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->sortOrder:S

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->setSortOrder(S)V

    return-object v0
.end method

.method public bridge synthetic copy()Lcom/ibotta/api/model/customer/ServerCategorySetting;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->copy()Lcom/ibotta/api/model/customer/CustomerOfferCategory;

    move-result-object v0

    return-object v0
.end method

.method public getCategoryId()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->categoryId:I

    return v0
.end method

.method public getSortOrder()S
    .locals 1

    .line 45
    iget-short v0, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->sortOrder:S

    return v0
.end method

.method public getViewState()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->viewState:Ljava/lang/String;

    return-object v0
.end method

.method public getViewStateEnum()Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->viewState:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    move-result-object v0

    return-object v0
.end method

.method public setCategoryId(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->categoryId:I

    return-void
.end method

.method public setSortOrder(S)V
    .locals 0

    .line 50
    iput-short p1, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->sortOrder:S

    return-void
.end method

.method public setViewState(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->viewState:Ljava/lang/String;

    return-void
.end method

.method public setViewStateEnum(Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;)V
    .locals 0

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerOfferCategory;->viewState:Ljava/lang/String;

    return-void
.end method
