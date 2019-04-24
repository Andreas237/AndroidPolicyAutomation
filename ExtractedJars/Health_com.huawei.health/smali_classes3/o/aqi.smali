.class Lo/aqi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Lo/apo;


# direct methods
.method constructor <init>(Lo/apo;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aqi;->c:Lo/apo;

    .line 25
    iput-object p1, p0, Lo/aqi;->c:Lo/apo;

    .line 26
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;)Ljava/lang/String;
    .locals 5

    .line 79
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    const-string v0, ""

    return-object v0

    .line 84
    :cond_0
    const-string v2, ""

    .line 85
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v3

    .line 86
    const/4 v0, 0x1

    if-ne v3, v0, :cond_1

    .line 88
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 90
    :cond_1
    const/16 v0, 0x8

    if-ne v3, v0, :cond_2

    .line 92
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 93
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 95
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkBrief()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 100
    :cond_2
    :goto_0
    return-object v2
.end method


# virtual methods
.method c(JILjava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JILjava/util/List<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 38
    invoke-static {}, Lcom/huawei/health/sns/model/chat/MessageItem;->newComparator()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 44
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setFromUID(J)V

    .line 45
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 46
    :goto_1
    invoke-virtual {v5, v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setFromGroup(Z)V

    .line 47
    invoke-virtual {v5, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 48
    invoke-virtual {v5, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 49
    invoke-virtual {v5, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 52
    invoke-direct {p0, v5}, Lo/aqi;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)Ljava/lang/String;

    move-result-object v7

    .line 53
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v7}, Lo/bap;->c(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 54
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 57
    if-nez v3, :cond_0

    .line 60
    const/4 v3, 0x1

    .line 61
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v9

    .line 62
    invoke-static {v9, v8}, Lo/brh;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 63
    goto :goto_0

    .line 67
    :cond_2
    iget-object v0, p0, Lo/aqi;->c:Lo/apo;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v5, v1, v2}, Lo/apo;->d(Lcom/huawei/health/sns/model/chat/MessageItem;IZ)V

    .line 68
    goto/16 :goto_0

    .line 69
    :cond_3
    return-void
.end method
