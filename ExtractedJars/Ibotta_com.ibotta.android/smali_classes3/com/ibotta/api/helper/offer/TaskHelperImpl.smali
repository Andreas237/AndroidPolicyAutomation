.class public Lcom/ibotta/api/helper/offer/TaskHelperImpl;
.super Ljava/lang/Object;
.source "TaskHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/offer/TaskHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findTaskByRewardId(Ljava/util/List;J)Lcom/ibotta/api/model/TaskModel;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/TaskModel;",
            ">;J)",
            "Lcom/ibotta/api/model/TaskModel;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/TaskModel;

    .line 22
    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getRewardId()J

    move-result-wide v2

    cmp-long v4, v2, p2

    if-nez v4, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public isShopNow(Lcom/ibotta/api/model/TaskModel;)Z
    .locals 1

    .line 32
    invoke-interface {p1}, Lcom/ibotta/api/model/TaskModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/TaskModel$Type;->SHOP_NOW:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
