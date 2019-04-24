.class public Lcom/huawei/ui/openservice/db/model/OpenService;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appID:Ljava/lang/String;

.field private authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

.field private description:Ljava/lang/String;

.field private endDate:I

.field private hmsAuth:I

.field private homePageIcon:Ljava/lang/String;

.field private homePagePosition:I

.field private isPlugin:I

.field private isServiceCard:I

.field private label:Ljava/lang/String;

.field private needRecommend:I

.field private pluginUrl:Ljava/lang/String;

.field private productName:Ljava/lang/String;

.field private requiredVersion:Ljava/lang/String;

.field private serviceDetail:Ljava/lang/String;

.field private serviceID:Ljava/lang/String;

.field private serviceIcon:Ljava/lang/String;

.field private serviceMidIcon:Ljava/lang/String;

.field private serviceProvider:Ljava/lang/String;

.field private serviceSource:Ljava/lang/String;

.field private serviceTypeID:Ljava/lang/String;

.field private serviceUrl:Ljava/lang/String;

.field private startDate:I

.field private subPosition:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->isServiceCard:I

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->needRecommend:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->isPlugin:I

    .line 41
    const-string v0, "THIRD_H5"

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceSource:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public static isEmpty(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)Z"
        }
    .end annotation

    .line 264
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

.method public static orderOpenService(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;)V"
        }
    .end annotation

    .line 268
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    :cond_0
    return-void

    .line 271
    :cond_1
    new-instance v0, Lcom/huawei/ui/openservice/db/model/OpenService$1;

    invoke-direct {v0}, Lcom/huawei/ui/openservice/db/model/OpenService$1;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 277
    return-void
.end method


# virtual methods
.method public checkData()Z
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceID:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceTypeID:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 258
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->appID:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    return v0

    .line 259
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceUrl:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    return v0

    .line 260
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public getAppID()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->appID:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthType()Lcom/huawei/ui/openservice/db/model/AuthTypeList;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    return-object v0
.end method

.method public getAuthTypeStr()Ljava/lang/String;
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    invoke-static {v0}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEndDate()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->endDate:I

    return v0
.end method

.method public getHmsAuth()I
    .locals 1

    .line 161
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->hmsAuth:I

    return v0
.end method

.method public getHomePageIcon()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->homePageIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getHomePagePosition()I
    .locals 1

    .line 145
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->homePagePosition:I

    return v0
.end method

.method public getIsPlugin()I
    .locals 1

    .line 211
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->isPlugin:I

    return v0
.end method

.method public getIsServiceCard()I
    .locals 1

    .line 195
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->isServiceCard:I

    return v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getNeedRecommend()I
    .locals 1

    .line 203
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->needRecommend:I

    return v0
.end method

.method public getPluginUrl()Ljava/lang/String;
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->pluginUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public getRequiredVersion()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->requiredVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceDetail()Ljava/lang/String;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceDetail:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceID()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceID:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceIcon()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceMidIcon()Ljava/lang/String;
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceMidIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceProvider()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceProvider:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceSource()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceSource:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceTypeID()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceTypeID:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceUrl()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getStartDate()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->startDate:I

    return v0
.end method

.method public getSubPosition()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->subPosition:I

    return v0
.end method

.method public isDateLegal()Z
    .locals 3

    .line 251
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v2

    .line 252
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->startDate:I

    if-lt v2, v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->endDate:I

    if-gt v2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAppID(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->appID:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setAuthType(Lcom/huawei/ui/openservice/db/model/AuthTypeList;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    .line 174
    return-void
.end method

.method public setAuthType(Ljava/lang/String;)V
    .locals 1

    .line 177
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 178
    :cond_0
    const-class v0, Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    invoke-static {p1, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->authType:Lcom/huawei/ui/openservice/db/model/AuthTypeList;

    .line 179
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->description:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setEndDate(I)V
    .locals 0

    .line 141
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->endDate:I

    .line 142
    return-void
.end method

.method public setHmsAuth(I)V
    .locals 0

    .line 165
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->hmsAuth:I

    .line 166
    return-void
.end method

.method public setHomePageIcon(Ljava/lang/String;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->homePageIcon:Ljava/lang/String;

    .line 158
    return-void
.end method

.method public setHomePagePosition(I)V
    .locals 0

    .line 149
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->homePagePosition:I

    .line 150
    return-void
.end method

.method public setIsPlugin(I)V
    .locals 0

    .line 215
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->isPlugin:I

    .line 216
    return-void
.end method

.method public setIsServiceCard(I)V
    .locals 0

    .line 199
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->isServiceCard:I

    .line 200
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->label:Ljava/lang/String;

    .line 192
    return-void
.end method

.method public setNeedRecommend(I)V
    .locals 0

    .line 207
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->needRecommend:I

    .line 208
    return-void
.end method

.method public setPluginUrl(Ljava/lang/String;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->pluginUrl:Ljava/lang/String;

    .line 224
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->productName:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setRequiredVersion(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->requiredVersion:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setServiceDetail(Ljava/lang/String;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceDetail:Ljava/lang/String;

    .line 240
    return-void
.end method

.method public setServiceID(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceID:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setServiceIcon(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceIcon:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setServiceMidIcon(Ljava/lang/String;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceMidIcon:Ljava/lang/String;

    .line 248
    return-void
.end method

.method public setServiceProvider(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceProvider:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setServiceSource(Ljava/lang/String;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceSource:Ljava/lang/String;

    .line 232
    return-void
.end method

.method public setServiceTypeID(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceTypeID:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setServiceUrl(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->serviceUrl:Ljava/lang/String;

    .line 118
    return-void
.end method

.method public setStartDate(I)V
    .locals 0

    .line 133
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->startDate:I

    .line 134
    return-void
.end method

.method public setSubPosition(I)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenService;->subPosition:I

    .line 86
    return-void
.end method
