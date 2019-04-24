.class public Lo/eqs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 15
    instance-of v0, p1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    if-eqz v0, :cond_2

    instance-of v0, p2, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    if-eqz v0, :cond_2

    .line 16
    move-object v4, p1

    check-cast v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 17
    move-object v5, p2

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 18
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 19
    const/4 v0, 0x1

    return v0

    .line 20
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 21
    const/4 v0, -0x1

    return v0

    .line 23
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    return v0

    .line 26
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
