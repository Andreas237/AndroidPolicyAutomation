.class Lcom/moat/analytics/mobile/spck/x$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/moat/analytics/mobile/spck/x$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/moat/analytics/mobile/spck/m;

.field final synthetic b:Lcom/moat/analytics/mobile/spck/x$a;


# direct methods
.method constructor <init>(Lcom/moat/analytics/mobile/spck/x$a;Lcom/moat/analytics/mobile/spck/m;)V
    .locals 0

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/x$a$1;->b:Lcom/moat/analytics/mobile/spck/x$a;

    iput-object p2, p0, Lcom/moat/analytics/mobile/spck/x$a$1;->a:Lcom/moat/analytics/mobile/spck/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/x$a$1;->b:Lcom/moat/analytics/mobile/spck/x$a;

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/x$a;->a(Lcom/moat/analytics/mobile/spck/x$a;)Lcom/moat/analytics/mobile/spck/x$e;

    move-result-object v0

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/x$a$1;->a:Lcom/moat/analytics/mobile/spck/m;

    invoke-interface {v0, v1}, Lcom/moat/analytics/mobile/spck/x$e;->a(Lcom/moat/analytics/mobile/spck/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
