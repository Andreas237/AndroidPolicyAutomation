.class Lcom/huawei/bone/social/manager/util/SocialReceiver$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/manager/util/SocialReceiver;->e(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/bone/social/manager/util/SocialReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/manager/util/SocialReceiver;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$7;->d:Lcom/huawei/bone/social/manager/util/SocialReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 351
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 352
    const-string v0, "main_social_red_dot_friend_dismiss"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 353
    iget-object v0, p0, Lcom/huawei/bone/social/manager/util/SocialReceiver$7;->d:Lcom/huawei/bone/social/manager/util/SocialReceiver;

    invoke-static {v0}, Lcom/huawei/bone/social/manager/util/SocialReceiver;->d(Lcom/huawei/bone/social/manager/util/SocialReceiver;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 354
    return-void
.end method
