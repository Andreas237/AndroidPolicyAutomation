.class public Lo/bdm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(Ljava/util/ArrayList;I)J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;I)J"
        }
    .end annotation

    .line 85
    const-wide/16 v2, -0x1

    .line 86
    move v4, p2

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 88
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 89
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSpecFlag()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v2

    .line 92
    goto :goto_1

    .line 86
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 95
    :cond_1
    :goto_1
    return-wide v2
.end method


# virtual methods
.method public e(Ljava/util/ArrayList;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 30
    const-wide/16 v6, -0x1

    .line 31
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_5

    .line 33
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 35
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSpecFlag()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v6

    .line 38
    goto/16 :goto_2

    .line 41
    :cond_0
    if-nez v8, :cond_1

    .line 43
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSpecFlag(Z)V

    .line 44
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v6

    goto :goto_2

    .line 48
    :cond_1
    add-int/lit8 v0, v8, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 49
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setLastMsgType(I)V

    .line 51
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_2

    .line 54
    goto :goto_2

    .line 56
    :cond_2
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v0

    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v2

    move-wide v4, v6

    invoke-static/range {v0 .. v5}, Lo/bog;->b(JJJ)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 58
    invoke-direct {p0, p1, v8}, Lo/bdm;->e(Ljava/util/ArrayList;I)J

    move-result-wide v11

    .line 59
    const-wide/16 v0, -0x1

    cmp-long v0, v11, v0

    if-eqz v0, :cond_3

    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v0

    sub-long v0, v11, v0

    const-wide/32 v2, 0xea60

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 61
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSpecFlag(Z)V

    goto :goto_1

    .line 65
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSpecFlag(Z)V

    .line 66
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v6

    .line 68
    :goto_1
    goto :goto_2

    .line 71
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSpecFlag(Z)V

    .line 31
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 75
    :cond_5
    return-void
.end method
