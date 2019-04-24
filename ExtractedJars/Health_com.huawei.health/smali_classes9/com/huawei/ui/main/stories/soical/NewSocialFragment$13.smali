.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 1144
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(I)V
    .locals 4

    .line 1158
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMoreInfoUrlFromCloud doPostReq onFailed ==> resCode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1159
    return-void
.end method

.method public onSucceed(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1150
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 1152
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SOCIAL_MORE_INFO_URL"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1155
    :cond_0
    return-void
.end method
