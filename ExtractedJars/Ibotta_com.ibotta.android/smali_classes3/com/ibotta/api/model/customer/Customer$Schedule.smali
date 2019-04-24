.class public Lcom/ibotta/api/model/customer/Customer$Schedule;
.super Ljava/lang/Object;
.source "Customer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/customer/Customer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Schedule"
.end annotation


# instance fields
.field private count:I

.field private event:Ljava/lang/String;

.field private sinceLast:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 682
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static findByEvent(Ljava/util/List;Lcom/ibotta/api/model/customer/Customer$Event;)Lcom/ibotta/api/model/customer/Customer$Schedule;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/Customer$Schedule;",
            ">;",
            "Lcom/ibotta/api/model/customer/Customer$Event;",
            ")",
            "Lcom/ibotta/api/model/customer/Customer$Schedule;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 716
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    .line 721
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/customer/Customer$Schedule;

    .line 722
    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer$Schedule;->getEventEnum()Lcom/ibotta/api/model/customer/Customer$Event;

    move-result-object v2

    if-eqz v2, :cond_1

    if-ne p1, v2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 700
    iget v0, p0, Lcom/ibotta/api/model/customer/Customer$Schedule;->count:I

    return v0
.end method

.method public getEvent()Ljava/lang/String;
    .locals 1

    .line 688
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$Schedule;->event:Ljava/lang/String;

    return-object v0
.end method

.method public getEventEnum()Lcom/ibotta/api/model/customer/Customer$Event;
    .locals 1

    .line 696
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Customer$Schedule;->event:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/Customer$Event;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/Customer$Event;

    move-result-object v0

    return-object v0
.end method

.method public getSinceLast()J
    .locals 2

    .line 708
    iget-wide v0, p0, Lcom/ibotta/api/model/customer/Customer$Schedule;->sinceLast:J

    return-wide v0
.end method

.method public setCount(I)V
    .locals 0

    .line 704
    iput p1, p0, Lcom/ibotta/api/model/customer/Customer$Schedule;->count:I

    return-void
.end method

.method public setEvent(Ljava/lang/String;)V
    .locals 0

    .line 692
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Customer$Schedule;->event:Ljava/lang/String;

    return-void
.end method

.method public setSinceLast(J)V
    .locals 0

    .line 712
    iput-wide p1, p0, Lcom/ibotta/api/model/customer/Customer$Schedule;->sinceLast:J

    return-void
.end method
