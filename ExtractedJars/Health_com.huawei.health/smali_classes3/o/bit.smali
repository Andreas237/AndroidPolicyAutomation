.class public Lo/bit;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lo/bit;->d:Landroid/content/Context;

    .line 43
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 53
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    return-object v5

    .line 59
    :cond_0
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0}, Lo/ast;->c()Ljava/util/ArrayList;

    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 61
    const/4 v8, 0x0

    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v7, :cond_5

    .line 65
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/axv;

    .line 66
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    if-eqz v8, :cond_4

    .line 71
    invoke-virtual {v8}, Lo/axv;->n()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 73
    goto/16 :goto_3

    .line 76
    :cond_1
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    .line 77
    invoke-virtual {v8}, Lo/axv;->b()J

    move-result-wide v1

    .line 76
    invoke-virtual {v0, p1, v1, v2}, Lo/apm;->a(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v11

    .line 78
    if-eqz v11, :cond_4

    .line 80
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 81
    if-lez v9, :cond_4

    .line 84
    new-instance v12, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-direct {v12}, Lcom/huawei/health/sns/model/search/SNSSearchBean;-><init>()V

    .line 85
    const/16 v0, 0x18

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setCardType(I)V

    .line 86
    const/4 v0, 0x4

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setBeanType(I)V

    .line 87
    invoke-virtual {v8}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 89
    sget-object v0, Lo/bfp$c;->d:Lo/bfp$c;

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setEventType(Lo/bfp$c;)V

    goto :goto_1

    .line 93
    :cond_2
    sget-object v0, Lo/bfp$c;->f:Lo/bfp$c;

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setEventType(Lo/bfp$c;)V

    .line 94
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    .line 95
    invoke-virtual {v8}, Lo/axv;->b()J

    move-result-wide v1

    .line 94
    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setGroup(Lcom/huawei/health/sns/model/group/Group;)V

    .line 97
    :goto_1
    invoke-virtual {v12, p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setKeyColorText(Ljava/lang/String;)V

    .line 98
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setHighLightTitle(Z)V

    .line 99
    invoke-virtual {v8}, Lo/axv;->f()I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setChatType(I)V

    .line 100
    invoke-virtual {v8}, Lo/axv;->b()J

    move-result-wide v0

    invoke-virtual {v12, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserId(J)V

    .line 101
    invoke-virtual {v8}, Lo/axv;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrl(Ljava/lang/String;)V

    .line 102
    invoke-virtual {v8}, Lo/axv;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setOldImageUrl(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v8}, Lo/axv;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageURLDownload(Ljava/lang/String;)V

    .line 104
    invoke-virtual {v8}, Lo/axv;->n()I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserType(I)V

    .line 105
    invoke-virtual {v8}, Lo/axv;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setTitle(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v12, v9}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMsgCounts(I)V

    .line 108
    const/4 v0, 0x1

    if-ne v9, v0, :cond_3

    .line 111
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitle(Ljava/lang/String;)V

    .line 112
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMsg_id(I)V

    goto :goto_2

    .line 116
    :cond_3
    iget-object v0, p0, Lo/bit;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_search_conversation_count_result:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 117
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 116
    invoke-virtual {v0, v1, v9, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitle(Ljava/lang/String;)V

    .line 119
    :goto_2
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_4
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 124
    :cond_5
    return-object v5
.end method
