.class Lo/bdy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bdy;->onDraw(Landroid/graphics/Canvas;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bdy;


# direct methods
.method constructor <init>(Lo/bdy;)V
    .locals 0

    .line 424
    iput-object p1, p0, Lo/bdy$1;->b:Lo/bdy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 427
    iget-object v0, p0, Lo/bdy$1;->b:Lo/bdy;

    invoke-static {v0}, Lo/bdy;->c(Lo/bdy;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 429
    iget-object v0, p0, Lo/bdy$1;->b:Lo/bdy;

    invoke-virtual {v0}, Lo/bdy;->invalidate()V

    .line 431
    :cond_0
    return-void
.end method
