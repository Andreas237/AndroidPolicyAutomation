.class Lcom/huawei/health/MainActivity$9;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 3107
    iput-object p1, p0, Lcom/huawei/health/MainActivity$9;->d:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 3109
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive the not static BroadcastReceiver , logout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3110
    invoke-static {}, Lo/cbi;->b()Lo/cbi;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cbi;->c(Landroid/content/Context;Landroid/content/Intent;)V

    .line 3111
    iget-object v0, p0, Lcom/huawei/health/MainActivity$9;->d:Lcom/huawei/health/MainActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;Z)Z

    .line 3112
    iget-object v0, p0, Lcom/huawei/health/MainActivity$9;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    const-string v2, "0"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcy;Lo/dcx;)V

    .line 3113
    return-void
.end method
