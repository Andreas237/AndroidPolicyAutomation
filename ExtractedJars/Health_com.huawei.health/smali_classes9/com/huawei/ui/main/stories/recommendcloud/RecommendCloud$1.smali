.class Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->doRefreshBatch(Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

.field final synthetic e:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;->c:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponce(ILjava/lang/String;)V
    .locals 5

    .line 97
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullRefresh resCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 99
    invoke-static {p2}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudParse;->parseResult(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;->c:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    invoke-static {v0, v4, v1}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->access$000(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;Ljava/util/List;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$1;->c:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    const-string v1, ""

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    .line 105
    :goto_0
    return-void
.end method
