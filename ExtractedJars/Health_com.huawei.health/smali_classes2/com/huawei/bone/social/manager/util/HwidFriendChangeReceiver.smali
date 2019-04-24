.class public Lcom/huawei/bone/social/manager/util/HwidFriendChangeReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 16
    const-class v0, Lcom/huawei/bone/social/manager/util/HwidFriendChangeReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/util/HwidFriendChangeReceiver;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 20
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/HwidFriendChangeReceiver;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter HwidFriendChangeReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 22
    :cond_0
    return-void

    .line 24
    :cond_1
    const-string v0, "com.huawei.android.sns.action.FRIENDLIST_UPDATE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 25
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/HwidFriendChangeReceiver;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Send broadcast to FriendChangeReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    invoke-static {p1}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/vu;->f(Landroid/content/Context;)V

    .line 28
    :cond_2
    return-void
.end method
