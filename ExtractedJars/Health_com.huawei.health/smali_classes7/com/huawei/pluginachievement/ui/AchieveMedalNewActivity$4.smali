.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;
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

    .line 182
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 185
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 187
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->g()V

    .line 192
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 193
    return-void
.end method
