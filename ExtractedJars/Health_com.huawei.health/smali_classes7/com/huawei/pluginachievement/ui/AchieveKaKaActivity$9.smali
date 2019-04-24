.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 354
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Lo/dwr;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 355
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 356
    move-object v5, v4

    check-cast v5, Lo/dvh;

    .line 357
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-virtual {v5}, Lo/dvh;->b()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;J)J

    .line 358
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData achieveInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData mSyncTimestamp="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-virtual {v5}, Lo/dvh;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;ILjava/lang/Object;)V

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 366
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v1

    invoke-virtual {v1}, Lo/dwo;->a()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;J)J

    .line 367
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 368
    return-void
.end method
