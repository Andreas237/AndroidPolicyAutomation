.class Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/view/View;

.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;Landroid/view/View;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;->e:Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 175
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;->e:Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 176
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;->e:Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 177
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 178
    return-void
.end method
