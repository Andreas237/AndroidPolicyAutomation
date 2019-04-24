.class public Lcom/huawei/ui/openservice/db/model/ChildService;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

.field private description:Ljava/lang/String;

.field private endDate:I

.field private hmsAuth:I

.field private imageUrl:Ljava/lang/String;

.field private location:Ljava/lang/String;

.field private position:I

.field private serviceID:Ljava/lang/String;

.field private serviceName:Ljava/lang/String;

.field private startDate:I

.field private subType:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAuthTypeStr()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    invoke-static {v0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEndDate()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->endDate:I

    return v0
.end method

.method public getHmsAuth()I
    .locals 1

    .line 93
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->hmsAuth:I

    return v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->location:Ljava/lang/String;

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->position:I

    return v0
.end method

.method public getServiceID()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->serviceID:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->serviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getStartDate()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->startDate:I

    return v0
.end method

.method public getSubType()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->subType:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setAuthType(Ljava/lang/String;)V
    .locals 1

    .line 101
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 102
    :cond_0
    const-class v0, Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    invoke-static {p1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    .line 103
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->description:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setEndDate(I)V
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->endDate:I

    .line 90
    return-void
.end method

.method public setHmsAuth(I)V
    .locals 0

    .line 97
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->hmsAuth:I

    .line 98
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->imageUrl:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->location:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->position:I

    .line 50
    return-void
.end method

.method public setServiceID(Ljava/lang/String;)V
    .locals 1

    .line 33
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->serviceID:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public setServiceName(Ljava/lang/String;)V
    .locals 1

    .line 115
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->serviceName:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setStartDate(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->startDate:I

    .line 82
    return-void
.end method

.method public setSubType(Ljava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->subType:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/ChildService;->url:Ljava/lang/String;

    .line 74
    return-void
.end method
