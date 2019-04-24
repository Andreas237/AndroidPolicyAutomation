.class public Lcom/huawei/ui/openservice/db/model/SecurityURL;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private serviceID:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isEmpty(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;)Z"
        }
    .end annotation

    .line 33
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public getServiceID()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURL;->serviceID:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURL;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setServiceID(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURL;->serviceID:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURL;->url:Ljava/lang/String;

    .line 30
    return-void
.end method
