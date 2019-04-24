.class Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$2;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 137
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 138
    return-void

    .line 140
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 141
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$2;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V

    goto :goto_0

    .line 142
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 143
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$2;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V

    .line 145
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 146
    return-void
.end method
