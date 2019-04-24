.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Landroid/content/Context;

.field private d:Ljava/util/concurrent/ExecutorService;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Landroid/content/Context;)V
    .locals 0

    .line 3748
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3749
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->e:Ljava/lang/String;

    .line 3750
    iput-object p2, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->d:Ljava/util/concurrent/ExecutorService;

    .line 3751
    iput-object p3, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->a:Landroid/os/Handler;

    .line 3752
    iput-object p4, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->b:Landroid/content/Context;

    .line 3753
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 3756
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/cyw;->d(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 3757
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 3758
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "it\'s overwhelmingly horrible, we can even get the head image from nowhere!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3759
    return-void

    .line 3763
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->a:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 3764
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->a:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 3765
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get remote head img success send message to update ui"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3768
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$a;->b:Landroid/content/Context;

    invoke-direct {v1, v2, v4}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$c;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 3769
    return-void
.end method
