.class public Lo/art;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;>;)Ljava/util/List<Lcom/huawei/health/sns/model/circle/CircleActionParam;>;"
        }
    .end annotation

    .line 88
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 90
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    const/4 v2, 0x0

    .line 96
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;

    .line 98
    new-instance v2, Lcom/huawei/health/sns/model/circle/CircleActionParam;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/circle/CircleActionParam;-><init>()V

    .line 99
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;->getName_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->setActionParamKey(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;->getValue_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/circle/CircleActionParam;->setActionParamValue(Ljava/lang/String;)V

    .line 101
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    return-object v1
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;>;)Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircleContent;>;"
        }
    .end annotation

    .line 54
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 56
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 60
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;

    .line 64
    new-instance v3, Lcom/huawei/health/sns/model/circle/UserCircleContent;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/circle/UserCircleContent;-><init>()V

    .line 65
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->getCircle_type_()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->setCircleType(I)V

    .line 66
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->getCircle_type_()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 68
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->getImage_url_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->setCircleContent(Ljava/lang/String;)V

    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->getCircle_type_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 72
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$CircleContent;->getHtml_content_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->setCircleContent(Ljava/lang/String;)V

    .line 74
    :cond_3
    :goto_1
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    goto :goto_0

    .line 76
    :cond_4
    return-object v2
.end method


# virtual methods
.method public e(JLcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;)Lcom/huawei/health/sns/model/circle/UserCircle;
    .locals 10

    .line 32
    new-instance v9, Lcom/huawei/health/sns/model/circle/UserCircle;

    invoke-direct {v9}, Lcom/huawei/health/sns/model/circle/UserCircle;-><init>()V

    .line 33
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getCircle_name_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->isShow_download_()Z

    move-result v1

    invoke-virtual {v9, p1, p2, v0, v1}, Lcom/huawei/health/sns/model/circle/UserCircle;->setUserData(JLjava/lang/String;Z)V

    .line 34
    move-object v0, v9

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getApp_package_()Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getApp_name_()Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getApp_version_()J

    move-result-wide v3

    .line 37
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getApp_id_()Ljava/lang/String;

    move-result-object v5

    .line 38
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->isApp_redirect_()Z

    move-result v6

    .line 39
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getRedirect_url_()Ljava/lang/String;

    move-result-object v7

    .line 40
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getRedirect_action_()Ljava/lang/String;

    move-result-object v8

    .line 34
    invoke-virtual/range {v0 .. v8}, Lcom/huawei/health/sns/model/circle/UserCircle;->setAppData(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getAction_param_()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/art;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/circle/UserCircle;->setActionParam(Ljava/util/List;)V

    .line 42
    invoke-virtual {p3}, Lcom/huawei/health/sns/server/circle/GetCircleResponse$Circle;->getCircle_content_()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/art;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/circle/UserCircle;->setCircleContent(Ljava/util/List;)V

    .line 43
    return-object v9
.end method
