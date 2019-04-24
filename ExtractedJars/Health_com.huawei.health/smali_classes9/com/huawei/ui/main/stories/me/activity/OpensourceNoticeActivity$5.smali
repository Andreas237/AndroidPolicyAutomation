.class Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$5;->a:Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 83
    const-string v2, "hwOpenSource.html"

    .line 84
    const/4 v3, 0x0

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$5;->a:Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;

    invoke-static {v0, v2}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->d(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/opensourcenotice/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$5;->a:Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->a(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v4

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity$5;->a:Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;->a(Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 91
    return-void
.end method
