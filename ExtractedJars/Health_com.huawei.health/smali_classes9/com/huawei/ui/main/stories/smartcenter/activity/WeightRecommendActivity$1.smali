.class Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 242
    const-string v0, "WeightRecommendActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCommodityView url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/fhv;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 244
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 245
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->e:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 246
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x3

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->a(Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity$1;->a:Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/smartcenter/activity/WeightRecommendActivity;->finish()V

    .line 249
    return-void
.end method
