.class Lo/emz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emz;->b(Landroid/content/Context;Ljava/lang/String;Lo/emz$a;)Landroid/graphics/Bitmap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/emz;

.field final synthetic b:Ljava/lang/ref/WeakReference;

.field final synthetic e:Lo/emz$a;


# direct methods
.method constructor <init>(Lo/emz;Lo/emz$a;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lo/emz$4;->a:Lo/emz;

    iput-object p2, p0, Lo/emz$4;->e:Lo/emz$a;

    iput-object p3, p0, Lo/emz$4;->b:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 129
    iget-object v0, p0, Lo/emz$4;->e:Lo/emz$a;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lo/emz$4;->e:Lo/emz$a;

    iget-object v1, p0, Lo/emz$4;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lo/emz$a;->c(Landroid/graphics/Bitmap;)V

    .line 131
    :cond_0
    return-void
.end method
