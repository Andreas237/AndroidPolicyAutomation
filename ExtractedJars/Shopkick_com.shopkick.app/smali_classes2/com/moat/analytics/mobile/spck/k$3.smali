.class Lcom/moat/analytics/mobile/spck/k$3;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/moat/analytics/mobile/spck/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/moat/analytics/mobile/spck/k;


# direct methods
.method constructor <init>(Lcom/moat/analytics/mobile/spck/k;)V
    .locals 0

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/k$3;->a:Lcom/moat/analytics/mobile/spck/k;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    :try_start_0
    iget-object p1, p0, Lcom/moat/analytics/mobile/spck/k$3;->a:Lcom/moat/analytics/mobile/spck/k;

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/k;->g(Lcom/moat/analytics/mobile/spck/k;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
