.class Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;
.super Ljava/lang/Object;
.source "WearImageLoaderDaemon.java"

# interfaces
.implements Lcom/squareup/picasso/Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->sendImage(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

.field final synthetic val$path:Ljava/lang/String;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    iput-object p2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->val$path:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapFailed(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 111
    invoke-static {}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$000()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Picasso "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->val$url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onBitmapLoaded(Landroid/graphics/Bitmap;Lcom/squareup/picasso/Picasso$LoadedFrom;)V
    .locals 2

    .line 105
    invoke-static {}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$000()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Picasso "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->val$url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " loaded"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    iget-object p2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->val$url:Ljava/lang/String;

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$1;->val$path:Ljava/lang/String;

    invoke-static {p2, p1, v0, v1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$100(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onPrepareLoad(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method
