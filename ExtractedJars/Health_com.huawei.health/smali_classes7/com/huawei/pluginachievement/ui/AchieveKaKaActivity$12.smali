.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 474
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$12;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 4

    .line 477
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "called by counterpartAdapter"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 479
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "called by counterpartAdapter,but obj == null!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    const/16 v0, 0x8

    if-ne v0, p1, :cond_0

    .line 481
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$12;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->m(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 483
    :cond_0
    return-void

    .line 485
    :cond_1
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dzs;->n(Ljava/lang/String;)I

    move-result v3

    .line 486
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the original calories from account studio is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$12;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0, v3}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;I)V

    .line 488
    return-void
.end method
