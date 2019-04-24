.class Lcom/huawei/health/MainActivity$11;
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
.field final synthetic c:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 3118
    iput-object p1, p0, Lcom/huawei/health/MainActivity$11;->c:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 3120
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive mRefreshATBroadcast."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3121
    iget-object v0, p0, Lcom/huawei/health/MainActivity$11;->c:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->l(Lcom/huawei/health/MainActivity;)V

    .line 3122
    return-void
.end method
