.class Lcom/google/dexmaker/dx/util/ListIntSet$1;
.super Ljava/lang/Object;
.source "ListIntSet.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/IntIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/dexmaker/dx/util/ListIntSet;->iterator()Lcom/google/dexmaker/dx/util/IntIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private idx:I

.field final synthetic this$0:Lcom/google/dexmaker/dx/util/ListIntSet;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/util/ListIntSet;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/google/dexmaker/dx/util/ListIntSet$1;->this$0:Lcom/google/dexmaker/dx/util/ListIntSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 110
    iput p1, p0, Lcom/google/dexmaker/dx/util/ListIntSet$1;->idx:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 114
    iget v0, p0, Lcom/google/dexmaker/dx/util/ListIntSet$1;->idx:I

    iget-object v1, p0, Lcom/google/dexmaker/dx/util/ListIntSet$1;->this$0:Lcom/google/dexmaker/dx/util/ListIntSet;

    iget-object v1, v1, Lcom/google/dexmaker/dx/util/ListIntSet;->ints:Lcom/google/dexmaker/dx/util/IntList;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/util/IntList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()I
    .locals 3

    .line 119
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ListIntSet$1;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ListIntSet$1;->this$0:Lcom/google/dexmaker/dx/util/ListIntSet;

    iget-object v0, v0, Lcom/google/dexmaker/dx/util/ListIntSet;->ints:Lcom/google/dexmaker/dx/util/IntList;

    iget v1, p0, Lcom/google/dexmaker/dx/util/ListIntSet$1;->idx:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/dexmaker/dx/util/ListIntSet$1;->idx:I

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/util/IntList;->get(I)I

    move-result v0

    return v0

    .line 120
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
