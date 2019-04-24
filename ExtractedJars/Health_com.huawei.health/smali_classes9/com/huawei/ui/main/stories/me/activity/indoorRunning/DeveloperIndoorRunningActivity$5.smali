.class Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$5;->b:Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    .line 98
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v2

    .line 99
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_running_open_radio_button:I

    if-ne v2, v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$5;->b:Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->b(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;Z)V

    goto :goto_0

    .line 101
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->indoor_running_close_radio_button:I

    if-ne v2, v0, :cond_1

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity$5;->b:Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;->b(Lcom/huawei/ui/main/stories/me/activity/indoorRunning/DeveloperIndoorRunningActivity;Z)V

    .line 104
    :cond_1
    :goto_0
    return-void
.end method
