.class Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aol;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 1773
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 10

    .line 1776
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1777
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupRankList resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1779
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupRankList resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "\n "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "result = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1781
    :goto_0
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_4

    .line 1783
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1784
    const-string v0, "resultCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1785
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 1786
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpPost result:resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1787
    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1788
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0x8006

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1789
    const-string v0, "groupRankList"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 1790
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getGroupRankListFromeCloud  groupRankListJson size is : "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1791
    const/4 v7, 0x0

    .line 1792
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1793
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 1794
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 1795
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0, v9}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    move-result-object v7

    .line 1796
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1793
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 1798
    :cond_1
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getGroupRankListFromeCloud  threadListHealthGroupRanks size is : "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0x8003

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1801
    goto :goto_2

    .line 1802
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0x8005

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1808
    :cond_3
    :goto_2
    goto :goto_3

    .line 1805
    :catch_0
    move-exception v4

    .line 1806
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1807
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0x8004

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1808
    goto :goto_3

    .line 1810
    :cond_4
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupRankList resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1811
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0x8004

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1813
    :goto_3
    return-void
.end method
