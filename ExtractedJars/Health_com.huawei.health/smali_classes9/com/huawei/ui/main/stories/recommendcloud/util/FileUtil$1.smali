.class Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->doDownload(Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;

.field final synthetic i:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->i:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->a:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->i:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->access$000(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "savePath is not sanitze"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->i:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;->e:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->access$100(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    .line 133
    return-void
.end method
