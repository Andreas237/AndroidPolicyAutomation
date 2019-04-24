.class public Lo/eal;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 86
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 87
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 88
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1b

    if-ne v0, v1, :cond_1

    .line 89
    const/4 v0, 0x1

    return v0

    .line 91
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 9
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 10
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    .line 12
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 13
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 15
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 37
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 39
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 41
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 77
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1a

    if-ne v0, v1, :cond_1

    .line 80
    const/4 v0, 0x1

    return v0

    .line 82
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 45
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 46
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 47
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x19

    if-ne v0, v1, :cond_1

    .line 48
    const/4 v0, 0x1

    return v0

    .line 50
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/lang/String;)Z
    .locals 1

    .line 70
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getInfoClassify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    const/4 v0, 0x1

    return v0

    .line 73
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static f(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 113
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 114
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 115
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_1

    .line 116
    const/4 v0, 0x1

    return v0

    .line 118
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static h(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 104
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 106
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_1

    .line 107
    const/4 v0, 0x1

    return v0

    .line 109
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static i(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 95
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 96
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_1

    .line 98
    const/4 v0, 0x1

    return v0

    .line 100
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
