.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 728
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$10;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 731
    if-nez p1, :cond_1

    .line 732
    if-nez p2, :cond_0

    .line 733
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get userinfo success but obtain null objData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    return-void

    .line 737
    :cond_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 738
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 739
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 740
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$10;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 741
    goto :goto_0

    .line 742
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$10;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 744
    :goto_0
    return-void
.end method
