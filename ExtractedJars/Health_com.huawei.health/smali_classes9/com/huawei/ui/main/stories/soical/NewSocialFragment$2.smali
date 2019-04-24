.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

.field final synthetic c:Lcom/huawei/operation/operation/PluginOperation;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lcom/huawei/operation/operation/PluginOperation;)V
    .locals 0

    .line 1407
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$2;->b:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$2;->c:Lcom/huawei/operation/operation/PluginOperation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 1417
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail ACTIVITY_KEY i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1418
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 1410
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess ACTIVITY_KEY url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$2;->c:Lcom/huawei/operation/operation/PluginOperation;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/web/html/activity.html"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 1412
    return-void
.end method
