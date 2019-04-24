.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->onSuccess(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;)V
    .locals 0

    .line 959
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 4

    .line 962
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save operationResult onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 964
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v2, 0x44c

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 965
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a()V

    .line 966
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 967
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;->a:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2;->e:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 969
    :cond_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 959
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6$2$5;->a(Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method
