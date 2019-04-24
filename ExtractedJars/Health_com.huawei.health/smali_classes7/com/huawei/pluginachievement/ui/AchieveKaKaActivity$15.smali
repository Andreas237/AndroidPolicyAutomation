.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 453
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 456
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v1

    invoke-virtual {v1}, Lo/dwo;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;J)J

    .line 458
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 459
    return-void
.end method
