.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e(ILo/dwk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dvp;

.field final synthetic b:I

.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Lo/dvp;I)V
    .locals 0

    .line 641
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->a:Lo/dvp;

    iput p3, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 644
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->a:Lo/dvp;

    invoke-virtual {v0}, Lo/dvp;->b()Ljava/lang/String;

    move-result-object v3

    .line 645
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChange UPDATE_TASK_STATUS taskIdTemp ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 646
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v3, v1}, Lo/dwo;->e(Ljava/lang/String;I)V

    .line 647
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 648
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;->b:I

    invoke-virtual {v0, v1}, Lo/dwo;->d(I)V

    .line 649
    return-void
.end method
