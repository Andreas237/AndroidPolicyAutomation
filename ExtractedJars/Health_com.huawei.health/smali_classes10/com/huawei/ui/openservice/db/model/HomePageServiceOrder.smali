.class public Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private huid:Ljava/lang/String;

.field private position:I

.field private serviceID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    return-void
.end method

.method public static setHuidToList(Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 48
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 49
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;

    .line 50
    if-nez v2, :cond_2

    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {v2, p1}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setHuid(Ljava/lang/String;)V

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
.end method


# virtual methods
.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->position:I

    return v0
.end method

.method public getServiceID()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->serviceID:Ljava/lang/String;

    return-object v0
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->huid:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->position:I

    .line 37
    return-void
.end method

.method public setServiceID(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->serviceID:Ljava/lang/String;

    .line 29
    return-void
.end method
