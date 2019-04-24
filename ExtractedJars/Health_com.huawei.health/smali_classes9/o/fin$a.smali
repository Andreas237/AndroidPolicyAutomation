.class public Lo/fin$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 331
    instance-of v0, p1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    if-eqz v0, :cond_2

    instance-of v0, p2, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    if-eqz v0, :cond_2

    .line 332
    move-object v4, p1

    check-cast v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 333
    move-object v5, p2

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 334
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getWeight()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getWeight()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 335
    const/4 v0, 0x1

    return v0

    .line 336
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getWeight()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getWeight()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 337
    const/4 v0, -0x1

    return v0

    .line 339
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getBeginTime()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getBeginTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    move-result v0

    return v0

    .line 342
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
