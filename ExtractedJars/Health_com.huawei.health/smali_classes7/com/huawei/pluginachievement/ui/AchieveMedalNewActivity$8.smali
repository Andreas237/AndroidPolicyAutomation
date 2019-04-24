.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$8;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 615
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$8;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 623
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareAllMedals:: storage permission denied!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    return-void
.end method

.method public onForeverDenied(Lo/dbr$b;)V
    .locals 4

    .line 628
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shareAllMedals:: storage permission forever denied, show the guide window"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$8;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/ene;->a(Landroid/content/Context;Lo/dbr$b;)V

    .line 630
    return-void
.end method

.method public onGranted()V
    .locals 1

    .line 618
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$8;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    .line 619
    return-void
.end method
