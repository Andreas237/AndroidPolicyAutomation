.class public Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/moat/analytics/mobile/spck/MoatPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/moat/analytics/mobile/spck/MoatPlugin<",
        "Lcom/moat/analytics/mobile/spck/ExoVideoTracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;->a:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/moat/analytics/mobile/spck/ExoVideoTracker;
    .locals 2

    new-instance v0, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$1;

    invoke-direct {v0, p0}, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$1;-><init>(Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;)V

    const-class v1, Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    invoke-static {v0, v1}, Lcom/moat/analytics/mobile/spck/y;->a(Lcom/moat/analytics/mobile/spck/y$a;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    return-object v0
.end method

.method public b()Lcom/moat/analytics/mobile/spck/ExoVideoTracker;
    .locals 1

    new-instance v0, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$a;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin$a;-><init>()V

    return-object v0
.end method

.method public synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;->b()Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/moat/analytics/mobile/spck/ExoMoatPlugin;->a()Lcom/moat/analytics/mobile/spck/ExoVideoTracker;

    move-result-object v0

    return-object v0
.end method
