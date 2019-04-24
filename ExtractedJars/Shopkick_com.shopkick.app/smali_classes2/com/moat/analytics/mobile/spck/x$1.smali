.class Lcom/moat/analytics/mobile/spck/x$1;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/moat/analytics/mobile/spck/x;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/moat/analytics/mobile/spck/x;


# direct methods
.method constructor <init>(Lcom/moat/analytics/mobile/spck/x;J)V
    .locals 0

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/x$1;->b:Lcom/moat/analytics/mobile/spck/x;

    iput-wide p2, p0, Lcom/moat/analytics/mobile/spck/x$1;->a:J

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    invoke-static {}, Landroid/os/Looper;->prepare()V

    new-instance v6, Landroid/os/Handler;

    invoke-direct {v6}, Landroid/os/Handler;-><init>()V

    new-instance v7, Lcom/moat/analytics/mobile/spck/x$a;

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/x$1;->b:Lcom/moat/analytics/mobile/spck/x;

    const-string v2, "SPCK"

    new-instance v4, Lcom/moat/analytics/mobile/spck/x$1$1;

    invoke-direct {v4, p0}, Lcom/moat/analytics/mobile/spck/x$1$1;-><init>(Lcom/moat/analytics/mobile/spck/x$1;)V

    const/4 v5, 0x0

    move-object v0, v7

    move-object v3, v6

    invoke-direct/range {v0 .. v5}, Lcom/moat/analytics/mobile/spck/x$a;-><init>(Lcom/moat/analytics/mobile/spck/x;Ljava/lang/String;Landroid/os/Handler;Lcom/moat/analytics/mobile/spck/x$e;Lcom/moat/analytics/mobile/spck/x$1;)V

    iget-wide v0, p0, Lcom/moat/analytics/mobile/spck/x$1;->a:J

    invoke-virtual {v6, v7, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Landroid/os/Looper;->loop()V

    return-void
.end method
