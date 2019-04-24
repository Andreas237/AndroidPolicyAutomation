.class public Lo/bgf;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field private e:Landroid/content/Context;

.field private f:J


# direct methods
.method public constructor <init>(Landroid/content/Context;J)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 46
    iput-object p1, p0, Lo/bgf;->e:Landroid/content/Context;

    .line 47
    iput-wide p2, p0, Lo/bgf;->f:J

    .line 48
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation

    .line 123
    const/4 v3, 0x0

    .line 125
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-wide v1, p0, Lo/bgf;->f:J

    invoke-virtual {v0, v1, v2}, Lo/ast;->a(J)Lo/axv;

    move-result-object v4

    .line 127
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    if-eqz v4, :cond_1

    .line 133
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v4}, Lo/axv;->b()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lo/apm;->a(Ljava/lang/String;J)Ljava/util/ArrayList;

    move-result-object v5

    .line 134
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 136
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 137
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 140
    new-instance v6, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-direct {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;-><init>()V

    .line 141
    const/16 v0, 0x18

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setCardType(I)V

    .line 142
    invoke-virtual {v4}, Lo/axv;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 144
    sget-object v0, Lo/bfp$c;->d:Lo/bfp$c;

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setEventType(Lo/bfp$c;)V

    goto :goto_1

    .line 148
    :cond_0
    sget-object v0, Lo/bfp$c;->f:Lo/bfp$c;

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setEventType(Lo/bfp$c;)V

    .line 149
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    .line 150
    invoke-virtual {v4}, Lo/axv;->b()J

    move-result-wide v1

    .line 149
    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setGroup(Lcom/huawei/health/sns/model/group/Group;)V

    .line 152
    :goto_1
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setHighLightTitle(Z)V

    .line 153
    invoke-virtual {v6, p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setKeyColorText(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v4}, Lo/axv;->f()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setChatType(I)V

    .line 155
    invoke-virtual {v4}, Lo/axv;->b()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserId(J)V

    .line 156
    invoke-virtual {v4}, Lo/axv;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrl(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v4}, Lo/axv;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setOldImageUrl(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v4}, Lo/axv;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageURLDownload(Ljava/lang/String;)V

    .line 159
    invoke-virtual {v4}, Lo/axv;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setTitle(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSubTitle(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setMsg_id(I)V

    .line 163
    invoke-virtual {v4}, Lo/axv;->n()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserType(I)V

    .line 164
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    goto/16 :goto_0

    .line 169
    :cond_1
    return-object v3
.end method


# virtual methods
.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 89
    new-instance v1, Lo/axw;

    invoke-direct {v1}, Lo/axw;-><init>()V

    .line 92
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    invoke-direct {p0, p1}, Lo/bgf;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 96
    invoke-virtual {v1, v2}, Lo/axw;->e(Ljava/util/List;)V

    .line 99
    :cond_0
    return-object v1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2

    .line 107
    iget-object v0, p0, Lo/bgf;->d:Lo/bfq$c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 109
    move-object v1, p1

    check-cast v1, Lo/axw;

    .line 110
    invoke-virtual {p0, v1}, Lo/bgf;->d(Lo/axw;)V

    .line 111
    iget-object v0, p0, Lo/bgf;->d:Lo/bfq$c;

    invoke-interface {v0}, Lo/bfq$c;->b()V

    .line 113
    :cond_0
    return-void
.end method

.method public d(Lo/axw;)V
    .locals 9

    .line 57
    iget-object v0, p0, Lo/bgf;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 59
    invoke-virtual {p1}, Lo/axw;->a()Ljava/util/List;

    move-result-object v5

    .line 62
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 64
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 66
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 67
    new-instance v8, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v8}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 68
    iget-object v0, p0, Lo/bgf;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_search_conversation_count_result:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 69
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 68
    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 70
    const/16 v0, 0x15

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 71
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v7}, Lo/bgf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 75
    const/16 v0, 0x18

    const/16 v1, 0x18

    invoke-virtual {p0, v0, v1, v6, v5}, Lo/bgf;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 78
    :cond_0
    return-void
.end method
