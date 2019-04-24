.class Lo/efw$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/efw;->c(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/efw;

.field final synthetic d:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lo/efw;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 460
    iput-object p1, p0, Lo/efw$7;->c:Lo/efw;

    iput-object p2, p0, Lo/efw$7;->d:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 463
    iget-object v0, p0, Lo/efw$7;->c:Lo/efw;

    invoke-static {v0}, Lo/efw;->p(Lo/efw;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 464
    iget-object v0, p0, Lo/efw$7;->c:Lo/efw;

    iget-object v1, p0, Lo/efw$7;->d:Landroid/graphics/Bitmap;

    invoke-static {}, Lo/efq;->c()Lo/efq;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lo/efl;->c(Landroid/graphics/Bitmap;Lo/efq;Z)I

    move-result v1

    invoke-static {v0, v1}, Lo/efw;->c(Lo/efw;I)I

    .line 466
    :cond_0
    return-void
.end method
