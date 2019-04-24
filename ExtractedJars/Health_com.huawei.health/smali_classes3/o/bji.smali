.class public Lo/bji;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;"
        }
    .end annotation

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 29
    if-nez p1, :cond_0

    .line 31
    return-object v2

    .line 33
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareType()Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    move-result-object v3

    .line 34
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareText()Ljava/lang/String;

    move-result-object v4

    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->isHasUrl()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 38
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareTitle()Ljava/lang/String;

    move-result-object v6

    .line 39
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    move-object v6, v4

    .line 43
    :cond_1
    new-instance v5, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    const/16 v0, 0x8

    invoke-direct {v5, v0, v6}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;-><init>(ILjava/lang/String;)V

    .line 44
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    if-ne v3, v0, :cond_3

    .line 48
    new-instance v5, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    const/4 v0, 0x1

    invoke-direct {v5, v0, v4}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;-><init>(ILjava/lang/String;)V

    .line 49
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 51
    :cond_3
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    if-ne v3, v0, :cond_5

    .line 53
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getSharePicList()Ljava/util/ArrayList;

    move-result-object v6

    .line 54
    if-eqz v6, :cond_5

    .line 56
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/net/Uri;

    .line 58
    new-instance v5, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    const/16 v0, 0x3e7

    invoke-direct {v5, v0, v8}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;-><init>(ILandroid/net/Uri;)V

    .line 59
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x9

    if-le v0, v1, :cond_4

    .line 63
    goto :goto_1

    .line 65
    :cond_4
    goto :goto_0

    .line 69
    :cond_5
    :goto_1
    return-object v2
.end method

.method public c(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;"
        }
    .end annotation

    .line 80
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 81
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkMessageTip()Ljava/lang/String;

    move-result-object v2

    .line 82
    new-instance v3, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    const/16 v0, 0x8

    invoke-direct {v3, v0, v2}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;-><init>(ILjava/lang/String;)V

    .line 83
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    return-object v1
.end method

.method public e(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;"
        }
    .end annotation

    .line 95
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 96
    new-instance v2, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    const/4 v0, 0x2

    invoke-direct {v2, v0, p1}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;-><init>(ILjava/lang/String;)V

    .line 97
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    return-object v1
.end method
