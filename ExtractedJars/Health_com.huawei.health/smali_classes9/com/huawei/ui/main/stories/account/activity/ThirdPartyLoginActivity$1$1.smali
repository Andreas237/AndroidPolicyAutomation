.class Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;)V
    .locals 0

    .line 281
    iput-object p1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xe

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->a:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1$1;->c:Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity$1;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;->b(Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    return-void
.end method
