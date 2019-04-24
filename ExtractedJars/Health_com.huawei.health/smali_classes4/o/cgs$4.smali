.class Lo/cgs$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cgs;

.field final synthetic b:Landroid/view/View;


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 234
    iget-object v0, p0, Lo/cgs$4;->a:Lo/cgs;

    iget-object v1, p0, Lo/cgs$4;->b:Landroid/view/View;

    invoke-static {v0, v1}, Lo/cgs;->e(Lo/cgs;Landroid/view/View;)V

    .line 235
    return-void
.end method
