.class Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)V
    .locals 1

    .line 84
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 85
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 86
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 90
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 91
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x3e9

    if-ne v0, v1, :cond_1

    .line 92
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;

    .line 93
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 94
    const-string v0, "PLGACHIEVE_AchieveLotteryShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refrence of AchieveLotteryShareAcitiviry is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 98
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->share_rlayout:I

    invoke-virtual {v8, v0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 99
    invoke-static {v9}, Lo/dxh;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 100
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    .line 101
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    move-object v4, v10

    sget-object v1, Lo/dae;->aa:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v7}, Lo/dtm;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;)V

    .line 104
    :cond_1
    return-void
.end method
