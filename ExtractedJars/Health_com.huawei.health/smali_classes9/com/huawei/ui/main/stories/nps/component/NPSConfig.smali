.class public Lcom/huawei/ui/main/stories/nps/component/NPSConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private batch:I

.field private deviceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private healthVersion:Ljava/lang/String;

.field private needInvestigate:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;[I>;"
        }
    .end annotation
.end field

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->needInvestigate:Ljava/util/Map;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->deviceList:Ljava/util/List;

    .line 17
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->healthVersion:Ljava/lang/String;

    .line 19
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->batch:I

    return-void
.end method


# virtual methods
.method public getBatch()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->batch:I

    return v0
.end method

.method public getDeviceList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->deviceList:Ljava/util/List;

    return-object v0
.end method

.method public getHealthVersion()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->healthVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getNeedInvestigate()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;[I>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->needInvestigate:Ljava/util/Map;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setBatch(I)V
    .locals 0

    .line 58
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->batch:I

    .line 59
    return-void
.end method

.method public setDeviceList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->deviceList:Ljava/util/List;

    .line 43
    return-void
.end method

.method public setHealthVersion(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->healthVersion:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setNeedInvestigate(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;[I>;)V"
        }
    .end annotation

    .line 34
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->needInvestigate:Ljava/util/Map;

    .line 35
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->version:Ljava/lang/String;

    .line 27
    return-void
.end method
