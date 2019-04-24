.class Lcom/moat/analytics/mobile/spck/o$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/moat/analytics/mobile/spck/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/moat/analytics/mobile/spck/o;->a(Ljava/lang/String;)Lcom/moat/analytics/mobile/spck/NativeVideoTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/moat/analytics/mobile/spck/y$a<",
        "Lcom/moat/analytics/mobile/spck/NativeVideoTracker;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/moat/analytics/mobile/spck/o;


# direct methods
.method constructor <init>(Lcom/moat/analytics/mobile/spck/o;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/o$4;->b:Lcom/moat/analytics/mobile/spck/o;

    iput-object p2, p0, Lcom/moat/analytics/mobile/spck/o$4;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/moat/analytics/mobile/spck/a/b/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/moat/analytics/mobile/spck/a/b/a<",
            "Lcom/moat/analytics/mobile/spck/NativeVideoTracker;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/o$4;->a:Ljava/lang/String;

    const/4 v1, 0x3

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Factory"

    const-string v2, "Creating NativeVideo tracker."

    invoke-static {v1, v0, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "[INFO] "

    const-string v1, "Attempting to create NativeVideoTracker"

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/moat/analytics/mobile/spck/v;

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/o$4;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/moat/analytics/mobile/spck/v;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/a/b/a;->a(Ljava/lang/Object;)Lcom/moat/analytics/mobile/spck/a/b/a;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const-string v0, "Factory"

    const-string v2, "partnerCode is null or empty. NativeVideoTracker initialization failed."

    invoke-static {v1, v0, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "[ERROR] "

    const-string v1, "NativeDisplayTracker creation failed, partnerCode is null or empty"

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/q;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/moat/analytics/mobile/spck/a/b/a;->a()Lcom/moat/analytics/mobile/spck/a/b/a;

    move-result-object v0

    return-object v0
.end method
