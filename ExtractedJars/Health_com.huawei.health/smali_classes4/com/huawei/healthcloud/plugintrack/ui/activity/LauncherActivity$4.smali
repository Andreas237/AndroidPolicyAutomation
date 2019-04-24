.class Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity$4;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity$4;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LauncherActivity;->finish()V

    .line 23
    return-void
.end method
