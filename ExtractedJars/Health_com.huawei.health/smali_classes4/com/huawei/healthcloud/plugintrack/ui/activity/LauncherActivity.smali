.class public Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 12
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 16
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 17
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;->requestWindowFeature(I)Z

    .line 18
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->activity_launcher:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;->setContentView(I)V

    .line 19
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;->b:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity$4;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    return-void
.end method
