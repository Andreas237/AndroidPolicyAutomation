.class public Lcom/ibotta/android/view/graph/DataSet;
.super Ljava/util/ArrayList;
.source "DataSet.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lcom/ibotta/android/view/graph/DataPoint;",
        ">;"
    }
.end annotation


# instance fields
.field private colorId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/ibotta/android/view/graph/DataPoint;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public get(I)Lcom/ibotta/android/view/graph/DataPoint;
    .locals 1

    if-ltz p1, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 50
    invoke-super {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/view/graph/DataPoint;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/graph/DataSet;->get(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object p1

    return-object p1
.end method

.method public getColorId()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/ibotta/android/view/graph/DataSet;->colorId:I

    return v0
.end method

.method public getLast()Lcom/ibotta/android/view/graph/DataPoint;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/view/graph/DataSet;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/graph/DataSet;->get(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object v0

    return-object v0
.end method

.method public getNext(I)Lcom/ibotta/android/view/graph/DataPoint;
    .locals 0

    add-int/lit8 p1, p1, 0x1

    .line 40
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/graph/DataSet;->get(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object p1

    return-object p1
.end method

.method public getPrevious(I)Lcom/ibotta/android/view/graph/DataPoint;
    .locals 0

    add-int/lit8 p1, p1, -0x1

    .line 35
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/graph/DataSet;->get(I)Lcom/ibotta/android/view/graph/DataPoint;

    move-result-object p1

    return-object p1
.end method

.method public setColorId(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/ibotta/android/view/graph/DataSet;->colorId:I

    return-void
.end method
