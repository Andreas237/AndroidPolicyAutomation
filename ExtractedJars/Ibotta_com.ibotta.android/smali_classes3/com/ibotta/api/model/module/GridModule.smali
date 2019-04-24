.class public Lcom/ibotta/api/model/module/GridModule;
.super Lcom/ibotta/api/model/base/Module;
.source "GridModule.java"


# instance fields
.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/model/base/Module;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/module/GridModule;->categories:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/module/GridModule;->categories:Ljava/util/List;

    return-object v0
.end method

.method public setCategories(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/model/module/GridModule;->categories:Ljava/util/List;

    goto :goto_0

    .line 23
    :cond_0
    iput-object p1, p0, Lcom/ibotta/api/model/module/GridModule;->categories:Ljava/util/List;

    :goto_0
    return-void
.end method
