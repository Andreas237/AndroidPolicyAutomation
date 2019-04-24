.class public Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;
.super Ljava/lang/Object;
.source "CustomerShoppingListRecommend.java"


# instance fields
.field private id:I

.field private listScore:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;->id:I

    return v0
.end method

.method public getListScore()F
    .locals 1

    .line 19
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;->listScore:F

    return v0
.end method

.method public setId(I)V
    .locals 0

    .line 15
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;->id:I

    return-void
.end method

.method public setListScore(F)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;->listScore:F

    return-void
.end method
