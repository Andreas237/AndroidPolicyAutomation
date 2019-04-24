.class Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->downloadBatch(Ljava/util/List;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

.field final synthetic d:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

.field final synthetic e:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->e:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->d:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponce(ILjava/lang/String;)V
    .locals 4

    .line 157
    const-string v0, "UIDV_RecommendCloud"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doDownload:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "resCode = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " result = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "success"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->e:Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;->access$100(Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->d:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->doUnZip(Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->d:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->d:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getFileId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x4

    invoke-interface {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    goto :goto_0

    .line 164
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/RecommendCloud$5;->b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    const-string v1, ""

    const/4 v2, -0x4

    invoke-interface {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    .line 167
    :goto_0
    return-void
.end method
