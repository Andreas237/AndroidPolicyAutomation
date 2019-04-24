.class public Lcom/ibotta/api/model/retailer/RetailerCategorySetting;
.super Ljava/lang/Object;
.source "RetailerCategorySetting.java"

# interfaces
.implements Lcom/ibotta/api/model/customer/ServerCategorySetting;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/api/model/customer/ServerCategorySetting<",
        "Lcom/ibotta/api/model/retailer/RetailerCategorySetting;",
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

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic copy()Lcom/ibotta/api/model/customer/ServerCategorySetting;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->copy()Lcom/ibotta/api/model/retailer/RetailerCategorySetting;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/ibotta/api/model/retailer/RetailerCategorySetting;
    .locals 2

    .line 58
    new-instance v0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;-><init>()V

    .line 60
    iget v1, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->categoryId:I

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->setCategoryId(I)V

    .line 61
    iget-object v1, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->viewState:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->setViewState(Ljava/lang/String;)V

    .line 62
    iget-short v1, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->sortOrder:S

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->setSortOrder(S)V

    return-object v0
.end method

.method public getCategoryId()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->categoryId:I

    return v0
.end method

.method public getSortOrder()S
    .locals 1

    .line 48
    iget-short v0, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->sortOrder:S

    return v0
.end method

.method public getViewState()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->viewState:Ljava/lang/String;

    return-object v0
.end method

.method public getViewStateEnum()Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->viewState:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;

    move-result-object v0

    return-object v0
.end method

.method public setCategoryId(I)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->categoryId:I

    return-void
.end method

.method public setSortOrder(S)V
    .locals 0

    .line 53
    iput-short p1, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->sortOrder:S

    return-void
.end method

.method public setViewState(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->viewState:Ljava/lang/String;

    return-void
.end method

.method public setViewStateEnum(Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;)V
    .locals 0

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/ServerCategorySettingViewState;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerCategorySetting;->viewState:Ljava/lang/String;

    return-void
.end method
