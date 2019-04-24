.class Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V
    .locals 0

    .line 694
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$10;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 697
    if-nez p1, :cond_1

    .line 698
    if-nez p2, :cond_0

    .line 699
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get userinfo success but obtain null objData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 700
    return-void

    .line 703
    :cond_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 704
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 705
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 706
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$10;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 707
    goto :goto_0

    .line 708
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$10;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->r(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 710
    :goto_0
    return-void
.end method
