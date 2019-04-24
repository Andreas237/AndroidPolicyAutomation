.class public final Lcom/squareup/haha/trove/THashMap$KeyView;
.super Lcom/squareup/haha/trove/THashMap$MapBackedView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/THashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "KeyView"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/trove/THashMap<TK;TV;>.MapBackedView<TK;>;"
    }
.end annotation


# instance fields
.field private synthetic this$0:Lcom/squareup/haha/trove/THashMap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/THashMap;)V
    .locals 0

    .line 722
    iput-object p1, p0, Lcom/squareup/haha/trove/THashMap$KeyView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {p0, p1}, Lcom/squareup/haha/trove/THashMap$MapBackedView;-><init>(Lcom/squareup/haha/trove/THashMap;)V

    .line 723
    return-void
.end method


# virtual methods
.method public final containsElement(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 737
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$KeyView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/THashMap;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<TK;>;"
        }
    .end annotation

    .line 727
    new-instance v0, Lcom/squareup/haha/trove/TObjectHashIterator;

    iget-object v1, p0, Lcom/squareup/haha/trove/THashMap$KeyView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {v0, v1}, Lcom/squareup/haha/trove/TObjectHashIterator;-><init>(Lcom/squareup/haha/trove/TObjectHash;)V

    return-object v0
.end method

.method public final removeElement(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 732
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$KeyView;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/THashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
