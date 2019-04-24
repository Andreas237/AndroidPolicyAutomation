.class public Lo/bke;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 35
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 36
    const/4 v4, 0x0

    .line 37
    sget v0, Lcom/huawei/android/sns/R$string;->sns_phone_number:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 38
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/user/User;

    .line 40
    new-instance v4, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-direct {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;-><init>()V

    .line 41
    const/16 v0, 0x18

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setCardType(I)V

    .line 42
    sget-object v0, Lo/bfp$c;->d:Lo/bfp$c;

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setEventType(Lo/bfp$c;)V

    .line 43
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setTitle(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrl(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setOldImageUrl(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageURLDownload(Ljava/lang/String;)V

    .line 47
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setHighLightTitle(Z)V

    .line 48
    invoke-virtual {v4, p3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setKeyColorText(Ljava/lang/String;)V

    .line 49
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitle(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserId(J)V

    .line 51
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    goto/16 :goto_0

    .line 54
    :cond_0
    return-object v3
.end method
