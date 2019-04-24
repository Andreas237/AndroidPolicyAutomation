.class public Lcom/huawei/ui/openservice/db/model/ServiceListConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private childServiceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation
.end field

.field private module_name:Ljava/lang/String;

.field private module_type:I

.field private module_ver:Ljava/lang/String;

.field private serviceHomePageCard:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;"
        }
    .end annotation
.end field

.field private serviceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation
.end field

.field private serviceRes:Ljava/lang/String;

.field private serviceRoot:Ljava/lang/String;

.field private serviceTypeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getChildServiceList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->childServiceList:Ljava/util/List;

    return-object v0
.end method

.method public getModule_name()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->module_name:Ljava/lang/String;

    return-object v0
.end method

.method public getModule_type()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->module_type:I

    return v0
.end method

.method public getModule_ver()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->module_ver:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceHomePageCard()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceHomePageCard:Ljava/util/List;

    return-object v0
.end method

.method public getServiceList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceList:Ljava/util/List;

    return-object v0
.end method

.method public getServiceRes()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceRes:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceRoot()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceRoot:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceTypeList:Ljava/util/List;

    return-object v0
.end method

.method public setChildServiceList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;)V"
        }
    .end annotation

    .line 106
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->childServiceList:Ljava/util/List;

    .line 107
    return-void
.end method

.method public setModule_name(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->module_name:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setModule_type(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->module_type:I

    .line 55
    return-void
.end method

.method public setModule_ver(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->module_ver:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setServiceHomePageCard(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;)V"
        }
    .end annotation

    .line 98
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceHomePageCard:Ljava/util/List;

    .line 99
    return-void
.end method

.method public setServiceList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)V"
        }
    .end annotation

    .line 90
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceList:Ljava/util/List;

    .line 91
    return-void
.end method

.method public setServiceRes(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceRes:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public setServiceRoot(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceRoot:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public setServiceTypeList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;)V"
        }
    .end annotation

    .line 82
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->serviceTypeList:Ljava/util/List;

    .line 83
    return-void
.end method
