.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 3

    .line 441
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCallBackFail i = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 2

    .line 435
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "GET KEY SUCCESS"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$6;->a:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    const/16 v1, 0x451

    invoke-static {v0, v1, p1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;ILjava/lang/Object;)V

    .line 437
    return-void
.end method
