.class Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cgg$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private c:Z

.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V
    .locals 1

    .line 786
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 789
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$2;)V
    .locals 0

    .line 786
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 841
    return-void
.end method

.method public d()V
    .locals 2

    .line 833
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->c:Z

    .line 834
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cbu;->c(Z)V

    .line 835
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cir;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cir;->c(Z)V

    .line 836
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)V

    .line 837
    return-void
.end method

.method public e()V
    .locals 6

    .line 793
    iget-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->c:Z

    if-eqz v0, :cond_0

    .line 794
    return-void

    .line 796
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->c:Z

    .line 797
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cbu;->c(Z)V

    .line 798
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cir;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cir;->c(Z)V

    .line 800
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScreenStateListenerImp onScreenOn"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 803
    invoke-static {}, Lo/dbf;->a()Ljava/lang/String;

    move-result-object v4

    .line 804
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The Phone version "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    invoke-static {v4}, Lo/cds;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 806
    return-void

    .line 809
    :cond_1
    const-string v0, "Track_TrackMainMapActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "To show app lock screen"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 813
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->p()Z

    move-result v0

    if-nez v0, :cond_2

    .line 814
    return-void

    .line 817
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->a(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;Landroid/content/Intent;)Landroid/content/Intent;

    .line 819
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Lo/cbu;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 822
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->o()Landroid/os/Bundle;

    move-result-object v5

    .line 824
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 827
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity$c;->d:Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->e(Landroid/content/Intent;)V

    .line 829
    :cond_3
    return-void
.end method
