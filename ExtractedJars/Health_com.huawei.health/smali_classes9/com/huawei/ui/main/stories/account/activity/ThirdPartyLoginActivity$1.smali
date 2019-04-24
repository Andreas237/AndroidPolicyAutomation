.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lo/eui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 279
    const-string v0, "Login_ThirdPartyLoginActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateDialog ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->d(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;-><init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 289
    :cond_0
    return-void
.end method
