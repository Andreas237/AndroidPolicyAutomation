.class public Lcom/ibotta/api/model/customer/CustomerLoyalty;
.super Ljava/lang/Object;
.source "CustomerLoyalty.java"


# annotations
.annotation runtime Lcom/ibotta/api/security/Confidential;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
    }
.end annotation


# instance fields
.field private displayValue:Ljava/lang/String;

.field private id:I

.field private retailerId:I

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDisplayValue()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->displayValue:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->id:I

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->retailerId:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setDisplayValue(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->displayValue:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->id:I

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->retailerId:I

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerLoyalty;->value:Ljava/lang/String;

    return-void
.end method
