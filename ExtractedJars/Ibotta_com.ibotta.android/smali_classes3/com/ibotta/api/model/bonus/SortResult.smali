.class public Lcom/ibotta/api/model/bonus/SortResult;
.super Ljava/lang/Object;
.source "SortResult.java"

# interfaces
.implements Lcom/ibotta/api/model/SortResultModel;


# instance fields
.field private name:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/SortResult;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRank()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/model/bonus/SortResult;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/SortResult;->name:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/model/bonus/SortResult;->value:Ljava/lang/String;

    return-void
.end method
