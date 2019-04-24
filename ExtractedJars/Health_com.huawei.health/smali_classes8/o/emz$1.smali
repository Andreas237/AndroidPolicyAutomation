.class Lo/emz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emz;->a(Landroid/content/Context;Ljava/lang/String;Lo/emz$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lo/emz$a;

.field final synthetic d:Lo/emz;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/emz;Ljava/lang/String;Lo/emz$a;Landroid/content/Context;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lo/emz$1;->d:Lo/emz;

    iput-object p2, p0, Lo/emz$1;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/emz$1;->c:Lo/emz$a;

    iput-object p4, p0, Lo/emz$1;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 153
    const-string v0, "AsyncImageLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "submit(new Runnable()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lo/emz$1;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 155
    const-string v0, "AsyncImageLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "imageUrl == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-void

    .line 158
    :cond_0
    iget-object v0, p0, Lo/emz$1;->d:Lo/emz;

    iget-object v1, p0, Lo/emz$1;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/emz;->d(Lo/emz;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 160
    if-nez v4, :cond_1

    .line 161
    iget-object v0, p0, Lo/emz$1;->d:Lo/emz;

    invoke-static {v0}, Lo/emz;->a(Lo/emz;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/emz$1$5;

    invoke-direct {v1, p0}, Lo/emz$1$5;-><init>(Lo/emz$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 167
    return-void

    .line 169
    :cond_1
    iget-object v0, p0, Lo/emz$1;->d:Lo/emz;

    iget-object v0, v0, Lo/emz;->d:Ljava/util/Map;

    iget-object v1, p0, Lo/emz$1;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 170
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    iget-object v0, p0, Lo/emz$1;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/emz$1;->e:Ljava/lang/String;

    invoke-static {v0, v1, v4}, Lo/emz;->c(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 173
    iget-object v0, p0, Lo/emz$1;->d:Lo/emz;

    invoke-static {v0}, Lo/emz;->a(Lo/emz;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lo/emz$1$3;

    invoke-direct {v1, p0, v4}, Lo/emz$1$3;-><init>(Lo/emz$1;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 179
    return-void
.end method
