.class public Lcom/huawei/health/suggestion/data/DBFactory$LocaleChangeBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LocaleChangeBroadcastReceiver"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 579
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 583
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 584
    const-string v0, "LocaleChangeReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Language change"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->u()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 586
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->u()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->c(Lcom/huawei/health/suggestion/data/DBFactory;)V

    .line 589
    :cond_0
    return-void
.end method
