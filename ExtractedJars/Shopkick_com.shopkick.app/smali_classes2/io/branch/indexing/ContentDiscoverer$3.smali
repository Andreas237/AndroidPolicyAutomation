.class Lio/branch/indexing/ContentDiscoverer$3;
.super Ljava/lang/Object;
.source "ContentDiscoverer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/indexing/ContentDiscoverer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/branch/indexing/ContentDiscoverer;


# direct methods
.method constructor <init>(Lio/branch/indexing/ContentDiscoverer;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lio/branch/indexing/ContentDiscoverer$3;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 318
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$3;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-static {v0}, Lio/branch/indexing/ContentDiscoverer;->access$900(Lio/branch/indexing/ContentDiscoverer;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
