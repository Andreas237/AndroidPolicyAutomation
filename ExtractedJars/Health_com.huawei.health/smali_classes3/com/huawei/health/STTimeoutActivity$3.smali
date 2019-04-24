.class Lcom/huawei/health/STTimeoutActivity$3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/STTimeoutActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/STTimeoutActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/STTimeoutActivity;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/health/STTimeoutActivity$3;->d:Lcom/huawei/health/STTimeoutActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 92
    const-string v0, "Login_STTimeoutActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lcom/huawei/health/STTimeoutActivity$3;->d:Lcom/huawei/health/STTimeoutActivity;

    invoke-virtual {v0}, Lcom/huawei/health/STTimeoutActivity;->finish()V

    .line 94
    return-void
.end method
