.class public Lcom/ibotta/api/model/retailer/RetailerPending;
.super Ljava/lang/Object;
.source "RetailerPending.java"


# instance fields
.field private count:I

.field private last:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/ibotta/api/model/retailer/RetailerPending;->count:I

    return v0
.end method

.method public getLast()Ljava/util/Date;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RetailerPending;->last:Ljava/util/Date;

    return-object v0
.end method

.method public setCount(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/ibotta/api/model/retailer/RetailerPending;->count:I

    return-void
.end method

.method public setLast(Ljava/util/Date;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RetailerPending;->last:Ljava/util/Date;

    return-void
.end method
