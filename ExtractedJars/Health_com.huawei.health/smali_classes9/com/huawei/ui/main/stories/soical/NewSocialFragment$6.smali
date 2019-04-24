.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$6;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;
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

    .line 1525
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$6;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1530
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1531
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$6;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$6;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/vu;->i(Landroid/content/Context;)V

    .line 1533
    :cond_0
    return-void
.end method
