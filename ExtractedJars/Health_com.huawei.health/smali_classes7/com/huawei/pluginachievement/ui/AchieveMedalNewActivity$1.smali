.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b()V
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

    .line 250
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 3

    .line 266
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "in onPageScrollStateChanged"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 3

    .line 253
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPageScrolled position "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/emq;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 255
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 259
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Ljava/lang/String;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$1;->a:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/emq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/emq;->setSubTabSelected(I)V

    .line 261
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPageSelected position "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    return-void
.end method
