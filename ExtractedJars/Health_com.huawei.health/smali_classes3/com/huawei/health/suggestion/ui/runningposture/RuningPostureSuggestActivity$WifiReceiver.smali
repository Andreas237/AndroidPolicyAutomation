.class public Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "WifiReceiver"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V
    .locals 0

    .line 587
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 591
    const-string v0, "Sug_RuningPostureSuggestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 593
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f()V

    .line 594
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->i(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 595
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$WifiReceiver;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->i(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)[Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v4, v6

    .line 596
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fragment/PostureSuggestBaseFragment;->b()V

    .line 595
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 600
    :cond_0
    return-void
.end method
