.class Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;Z)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iput-boolean p2, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "core_sleep_active_open_control_btn  : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/emu;

    move-result-object v0

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v4

    .line 140
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "switchbutton.ORI : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    if-eqz v4, :cond_0

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->d(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;Z)V

    goto :goto_0

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/emu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 146
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->e(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;Z)Z

    .line 147
    goto :goto_1

    .line 148
    :cond_1
    const-string v0, "CORESLEEPMISSON_CoreSleepSelectorActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "default : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->a:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->e:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3;->a:Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;->c(Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity;)Lo/emu;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/device/activity/core_sleep/CoreSleepSelectorActivity$3$5;->a:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 151
    :goto_1
    return-void
.end method
