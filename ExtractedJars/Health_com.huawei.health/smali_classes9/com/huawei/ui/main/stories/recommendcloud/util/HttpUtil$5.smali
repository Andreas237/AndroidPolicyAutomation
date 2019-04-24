.class final Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->doRefresh(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;->b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;->b:Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->access$000(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    .line 59
    return-void
.end method
