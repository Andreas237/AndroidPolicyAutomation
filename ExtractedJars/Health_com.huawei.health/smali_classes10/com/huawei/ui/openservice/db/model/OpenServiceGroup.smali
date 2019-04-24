.class public Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;
    }
.end annotation


# instance fields
.field private isEditModel:Z

.field private openServiceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation
.end field

.field private position:I

.field private serviceTypeDescription:Ljava/lang/String;

.field private serviceTypeID:Ljava/lang/String;

.field private serviceTypeName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->isEditModel:Z

    .line 29
    return-void
.end method

.method public static getGroupByServiceTypeID(Ljava/util/List;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;"
        }
    .end annotation

    .line 148
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 149
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    .line 150
    if-nez v2, :cond_2

    goto :goto_0

    .line 151
    :cond_2
    invoke-virtual {v2}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getServiceTypeID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v2

    .line 152
    :cond_3
    goto :goto_0

    .line 153
    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method public static isEmpty(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;)Z"
        }
    .end annotation

    .line 157
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

.method public static orderGroupService(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;)V"
        }
    .end annotation

    .line 136
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    :cond_0
    return-void

    .line 139
    :cond_1
    new-instance v0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$1;

    invoke-direct {v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$1;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 145
    return-void
.end method


# virtual methods
.method public copy()Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
    .locals 2

    .line 94
    new-instance v1, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;-><init>()V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeID:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setServiceTypeID(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setServiceTypeName(Ljava/lang/String;)V

    .line 97
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->position:I

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setPosition(I)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeDescription:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setServiceTypeDescription(Ljava/lang/String;)V

    .line 99
    return-object v1
.end method

.method public getOpenServiceList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->position:I

    return v0
.end method

.method public getServiceIDs()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 121
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/openservice/db/model/OpenService;

    .line 123
    if-nez v3, :cond_0

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    goto :goto_0

    .line 126
    :cond_1
    return-object v1
.end method

.method public getServiceTypeDescription()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceTypeID()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeID:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceTypeName()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeName:Ljava/lang/String;

    return-object v0
.end method

.method public isEditModel()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->isEditModel:Z

    return v0
.end method

.method public isOutOFHomePageRage()Z
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public orderHomePageService()V
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    new-instance v1, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;-><init>(Z)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 91
    return-void
.end method

.method public orderSubService()V
    .locals 3

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    new-instance v1, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;-><init>(Z)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 86
    return-void
.end method

.method public refreshHomePageOrder()V
    .locals 2

    .line 130
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/model/OpenService;->setHomePagePosition(I)V

    .line 130
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 133
    :cond_0
    return-void
.end method

.method public setEditModel(Z)V
    .locals 0

    .line 52
    iput-boolean p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->isEditModel:Z

    .line 53
    return-void
.end method

.method public setOpenServiceList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)V"
        }
    .end annotation

    .line 36
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->openServiceList:Ljava/util/List;

    .line 37
    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->position:I

    .line 77
    return-void
.end method

.method public setServiceTypeDescription(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeDescription:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setServiceTypeID(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeID:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setServiceTypeName(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->serviceTypeName:Ljava/lang/String;

    .line 61
    return-void
.end method
