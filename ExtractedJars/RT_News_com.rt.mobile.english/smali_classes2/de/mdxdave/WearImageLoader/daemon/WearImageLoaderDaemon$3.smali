.class Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;
.super Ljava/lang/Object;
.source "WearImageLoaderDaemon.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->into(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

.field final synthetic val$path:Ljava/lang/String;

.field final synthetic val$tmpUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    iput-object p2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;->val$tmpUrl:Ljava/lang/String;

    iput-object p3, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;->val$path:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 208
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;->val$tmpUrl:Ljava/lang/String;

    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$3;->val$path:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$500(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
