.class Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/moat/analytics/mobile/spck/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;->a()Lcom/moat/analytics/mobile/spck/ExoVideoTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/moat/analytics/mobile/spck/y$a<",
        "Lcom/moat/analytics/mobile/spck/ExoVideoTracker;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;


# direct methods
.method constructor <init>(Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;)V
    .locals 0

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$1;->a:Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/moat/analytics/mobile/spck/a/b/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/moat/analytics/mobile/spck/a/b/a<",
            "Lcom/moat/analytics/mobile/spck/ExoVideoTracker;",
            ">;"
        }
    .end annotation

    const-string v0, "[INFO] "

    const-string v1, "Attempting to create ExoVideoTracker"

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/moat/analytics/mobile/spck/f;

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$1;->a:Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;

    invoke-static {v1}, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;->a(Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/moat/analytics/mobile/spck/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/a/b/a;->a(Ljava/lang/Object;)Lcom/moat/analytics/mobile/spck/a/b/a;

    move-result-object v0

    return-object v0
.end method
