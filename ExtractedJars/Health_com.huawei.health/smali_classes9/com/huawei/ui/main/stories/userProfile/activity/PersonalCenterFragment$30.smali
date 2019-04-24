.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 839
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$30;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 842
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$30;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->i(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/os/Handler;

    move-result-object v1

    .line 843
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 844
    const-string v2, "false"

    .line 845
    const/16 v0, 0xcf

    invoke-virtual {v1, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 846
    iput-object v2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 847
    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 849
    :cond_0
    return-void
.end method
