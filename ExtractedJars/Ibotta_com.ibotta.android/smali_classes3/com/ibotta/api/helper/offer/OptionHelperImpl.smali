.class public Lcom/ibotta/api/helper/offer/OptionHelperImpl;
.super Ljava/lang/Object;
.source "OptionHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/offer/OptionHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findById(Ljava/util/List;J)Lcom/ibotta/api/model/OptionModel;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OptionModel;",
            ">;J)",
            "Lcom/ibotta/api/model/OptionModel;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 19
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OptionModel;

    .line 20
    invoke-interface {v1}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result v2

    int-to-long v2, v2

    cmp-long v4, v2, p2

    if-nez v4, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method
