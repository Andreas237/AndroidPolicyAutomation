.class Lcom/moat/analytics/mobile/spck/n;
.super Ljava/lang/Exception;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/Exception;)V
    .locals 1

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object v0

    iget-boolean v0, v0, Lcom/moat/analytics/mobile/spck/x;->b:Z

    if-eqz v0, :cond_0

    const-string v0, "MoatException"

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
