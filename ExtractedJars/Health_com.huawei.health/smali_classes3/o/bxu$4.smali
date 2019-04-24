.class Lo/bxu$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxu;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bxu;


# direct methods
.method constructor <init>(Lo/bxu;)V
    .locals 0

    .line 416
    iput-object p1, p0, Lo/bxu$4;->a:Lo/bxu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 2

    .line 419
    iget-object v0, p0, Lo/bxu$4;->a:Lo/bxu;

    invoke-static {v0}, Lo/bxu;->b(Lo/bxu;)Lo/byr;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/byr;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 421
    iget-object v0, p0, Lo/bxu$4;->a:Lo/bxu;

    invoke-static {v0}, Lo/bxu;->b(Lo/bxu;)Lo/byr;

    move-result-object v0

    invoke-virtual {v0}, Lo/byr;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Lo/bxu$4;->a:Lo/bxu;

    invoke-static {v0}, Lo/bxu;->b(Lo/bxu;)Lo/byr;

    move-result-object v0

    new-instance v1, Lo/bxu$4$3;

    invoke-direct {v1, p0}, Lo/bxu$4$3;-><init>(Lo/bxu$4;)V

    invoke-virtual {v0, v1}, Lo/byr;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 429
    :cond_0
    return-void
.end method
