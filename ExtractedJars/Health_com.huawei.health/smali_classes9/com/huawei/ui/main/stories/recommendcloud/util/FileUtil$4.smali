.class Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->doUnZip(Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

.field final synthetic d:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

.field final synthetic e:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->d:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->c:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    iput-object p5, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->e:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 266
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "zipFileString :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " outPathString :"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->b:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " RecommendCloudObject :"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->c:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->d:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->c:Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;->e:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->access$200(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    .line 268
    return-void
.end method
