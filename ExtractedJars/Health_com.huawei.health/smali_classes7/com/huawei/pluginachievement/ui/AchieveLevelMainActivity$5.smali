.class Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 97
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 98
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lo/dzc;

    .line 99
    invoke-virtual {v3}, Lo/dzc;->a()Lo/dzj;

    move-result-object v4

    .line 100
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-virtual {v3}, Lo/dzc;->e()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 101
    const-string v0, "PLGACHIEVE_AchieveLevelMainActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CurrentLevel = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lo/dzj;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/dxw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dxw;->b(Lo/dzj;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/dxw;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v4}, Lo/dzj;->d()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/dxw;->e(Ljava/util/ArrayList;I)V

    .line 104
    const-string v0, "PLGACHIEVE_AchieveLevelMainActivity"

    const-string v1, "CurrentForTest ----"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/emr;

    move-result-object v0

    invoke-virtual {v4}, Lo/dzj;->d()I

    move-result v1

    invoke-static {v1}, Lo/dzt;->d(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleBarBackgroundColor(I)V

    .line 108
    goto :goto_0

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_1

    .line 109
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    .line 111
    const-string v0, "PLGACHIEVE_AchieveLevelMainActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dou ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0, v3, v4}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;D)V

    .line 114
    goto :goto_0

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    .line 115
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lo/dze;

    .line 116
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0, v3}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;Lo/dze;)V

    .line 118
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 119
    return-void
.end method
