.class public Lcom/huawei/ui/openservice/db/model/SecurityURLList;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private URLList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private serviceID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSecurityURL()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->serviceID:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->URLList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->URLList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 37
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->URLList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 39
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 40
    :cond_2
    new-instance v4, Lcom/huawei/ui/openservice/db/model/SecurityURL;

    invoke-direct {v4}, Lcom/huawei/ui/openservice/db/model/SecurityURL;-><init>()V

    .line 41
    invoke-virtual {v4, v3}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->setUrl(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->serviceID:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->setServiceID(Ljava/lang/String;)V

    .line 43
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return-object v1
.end method

.method public getServiceID()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->serviceID:Ljava/lang/String;

    return-object v0
.end method

.method public getURLList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->URLList:Ljava/util/List;

    return-object v0
.end method

.method public setServiceID(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->serviceID:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public setURLList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->URLList:Ljava/util/List;

    .line 33
    return-void
.end method
