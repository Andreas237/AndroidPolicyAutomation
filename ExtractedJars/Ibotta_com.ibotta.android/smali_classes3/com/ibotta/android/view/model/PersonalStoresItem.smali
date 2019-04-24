.class public Lcom/ibotta/android/view/model/PersonalStoresItem;
.super Ljava/lang/Object;
.source "PersonalStoresItem.java"


# instance fields
.field private index:I

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private selected:Z


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/RetailerModel;ZI)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/view/model/PersonalStoresItem;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 18
    iput-boolean p2, p0, Lcom/ibotta/android/view/model/PersonalStoresItem;->selected:Z

    .line 19
    iput p3, p0, Lcom/ibotta/android/view/model/PersonalStoresItem;->index:I

    return-void
.end method


# virtual methods
.method public getIndex()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/ibotta/android/view/model/PersonalStoresItem;->index:I

    return v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/view/model/PersonalStoresItem;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public isSelected()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/ibotta/android/view/model/PersonalStoresItem;->selected:Z

    return v0
.end method

.method public setSelected(Z)V
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/ibotta/android/view/model/PersonalStoresItem;->selected:Z

    return-void
.end method
