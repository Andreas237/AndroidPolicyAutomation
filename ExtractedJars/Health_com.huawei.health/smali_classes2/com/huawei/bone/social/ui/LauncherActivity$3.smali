.class Lcom/huawei/bone/social/ui/LauncherActivity$3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/LauncherActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/bone/social/ui/LauncherActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/LauncherActivity;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/huawei/bone/social/ui/LauncherActivity$3;->d:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 187
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$3;->d:Lcom/huawei/bone/social/ui/LauncherActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/LauncherActivity;->d(Lcom/huawei/bone/social/ui/LauncherActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 188
    :cond_0
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter SocialReceiver return 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    return-void

    .line 191
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 192
    if-eqz v4, :cond_4

    .line 193
    const-string v0, "main_social_red_dot_friend_show"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Myyyy testttt Enter MAIN_SOCIAL_RED_DOT_FRIEND_SHOW   dot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$3;->d:Lcom/huawei/bone/social/ui/LauncherActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/bone/social/ui/LauncherActivity;->a(Lcom/huawei/bone/social/ui/LauncherActivity;Z)Z

    goto :goto_0

    .line 196
    :cond_2
    const-string v0, "main_social_red_dot_friend_dismiss"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 197
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Myyyy testttt Enter MAIN_SOCIAL_RED_DOT_FRIEND_DISMISS  hide dot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/bone/social/ui/LauncherActivity$3;->d:Lcom/huawei/bone/social/ui/LauncherActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/bone/social/ui/LauncherActivity;->a(Lcom/huawei/bone/social/ui/LauncherActivity;Z)Z

    goto :goto_0

    .line 200
    :cond_3
    invoke-static {}, Lcom/huawei/bone/social/ui/LauncherActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter SocialReceiver  default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    :cond_4
    :goto_0
    return-void
.end method
