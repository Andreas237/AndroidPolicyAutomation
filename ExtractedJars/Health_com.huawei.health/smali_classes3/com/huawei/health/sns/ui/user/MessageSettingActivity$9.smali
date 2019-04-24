.class final Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Landroid/os/Handler;Landroid/content/Intent;Landroid/content/Context;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Handler;

.field final synthetic d:Landroid/content/Intent;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/content/Context;Landroid/os/Handler;)V
    .locals 0

    .line 760
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->d:Landroid/content/Intent;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->e:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 760
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 764
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->d:Landroid/content/Intent;

    const-string v1, "android.intent.extra.ringtone.PICKED_URI"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/Uri;

    .line 765
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 767
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->d:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 769
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->d:Landroid/content/Intent;

    const-string v1, "is_follow_notification"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v5

    .line 771
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isFollowNotification"

    invoke-virtual {v0, v1, v5}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 774
    if-eqz v4, :cond_1

    .line 776
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v6

    .line 778
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->e:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/bcc;->b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v7

    .line 779
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_file_name"

    invoke-virtual {v0, v1, v7}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 780
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_uri"

    invoke-virtual {v0, v1, v6}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 781
    goto :goto_0

    .line 785
    :cond_1
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_file_name"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 786
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_uri"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Ljava/lang/String;)Z

    .line 789
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;->a:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 790
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
