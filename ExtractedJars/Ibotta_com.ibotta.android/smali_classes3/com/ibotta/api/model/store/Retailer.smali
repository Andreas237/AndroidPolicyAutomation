.class public Lcom/ibotta/api/model/store/Retailer;
.super Ljava/lang/Object;
.source "Retailer.java"


# instance fields
.field private events:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/store/Event;",
            ">;"
        }
    .end annotation
.end field

.field private id:I

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/store/Retailer;->events:Ljava/util/Map;

    return-void
.end method

.method public static findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/store/Retailer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/store/Retailer;",
            ">;I)",
            "Lcom/ibotta/api/model/store/Retailer;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 50
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/store/Retailer;

    .line 51
    invoke-virtual {v1}, Lcom/ibotta/api/model/store/Retailer;->getId()I

    move-result v2

    if-ne v2, p1, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method


# virtual methods
.method public getEvents()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/store/Event;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/api/model/store/Retailer;->events:Ljava/util/Map;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/ibotta/api/model/store/Retailer;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/api/model/store/Retailer;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setEvents(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/store/Event;",
            ">;)V"
        }
    .end annotation

    .line 40
    iput-object p1, p0, Lcom/ibotta/api/model/store/Retailer;->events:Ljava/util/Map;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/ibotta/api/model/store/Retailer;->id:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/api/model/store/Retailer;->name:Ljava/lang/String;

    return-void
.end method
