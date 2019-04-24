.class Lo/emz$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emz$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/emz$1;

.field final synthetic e:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lo/emz$1;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lo/emz$1$3;->a:Lo/emz$1;

    iput-object p2, p0, Lo/emz$1$3;->e:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 175
    iget-object v0, p0, Lo/emz$1$3;->a:Lo/emz$1;

    iget-object v0, v0, Lo/emz$1;->c:Lo/emz$a;

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lo/emz$1$3;->a:Lo/emz$1;

    iget-object v0, v0, Lo/emz$1;->c:Lo/emz$a;

    iget-object v1, p0, Lo/emz$1$3;->e:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lo/emz$a;->c(Landroid/graphics/Bitmap;)V

    .line 177
    :cond_0
    return-void
.end method
