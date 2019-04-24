.class public Lcom/ibotta/api/model/content/SortResultContent;
.super Ljava/lang/Object;
.source "SortResultContent.java"

# interfaces
.implements Lcom/ibotta/api/model/SortResultModel;


# instance fields
.field private name:Ljava/lang/String;

.field private rank:Ljava/lang/String;

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

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/content/SortResultContent;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getRank()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/model/content/SortResultContent;->rank:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/content/SortResultContent;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/model/content/SortResultContent;->name:Ljava/lang/String;

    return-void
.end method

.method public setRank(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/api/model/content/SortResultContent;->rank:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/model/content/SortResultContent;->value:Ljava/lang/String;

    return-void
.end method
