.class public Lcom/ibotta/api/model/category/Category;
.super Ljava/lang/Object;
.source "Category.java"


# instance fields
.field private id:I

.field private name:Ljava/lang/String;

.field private terms:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/category/Term;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/category/Category;->terms:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/ibotta/api/model/category/Category;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/category/Category;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getTerms()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/category/Term;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/category/Category;->terms:Ljava/util/List;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/ibotta/api/model/category/Category;->id:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/model/category/Category;->name:Ljava/lang/String;

    return-void
.end method

.method public setTerms(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/category/Term;",
            ">;)V"
        }
    .end annotation

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/category/Category;->terms:Ljava/util/List;

    return-void
.end method
