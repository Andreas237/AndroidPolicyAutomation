.class Lo/cir$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 860
    iput-object p1, p0, Lo/cir$2;->d:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 864
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v0

    invoke-virtual {v0}, Lo/chh;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->r()Lo/chh;

    move-result-object v1

    invoke-virtual {v1}, Lo/chh;->getRight()I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v6, v0, 0x2

    .line 865
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getRight()I

    move-result v1

    add-int/2addr v0, v1

    div-int/lit8 v7, v0, 0x2

    .line 866
    sub-int v8, v7, v6

    .line 867
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->m(Lo/cir;)V

    .line 868
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 869
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v0

    invoke-virtual {v0}, Lo/chh;->setProgressZero()V

    .line 870
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/chh;->e(Z)V

    .line 872
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    rsub-int/lit8 v2, v8, 0x0

    iget-object v1, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->q()Landroid/widget/ImageView;

    move-result-object v4

    const/4 v1, 0x0

    const/16 v3, 0xc8

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cir;->c(IIILandroid/view/View;Z)V

    .line 873
    iget-object v0, p0, Lo/cir$2;->d:Lo/cir;

    move v2, v8

    iget-object v1, p0, Lo/cir$2;->d:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->r()Lo/chh;

    move-result-object v4

    const/4 v1, 0x0

    const/16 v3, 0xc8

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/cir;->c(IIILandroid/view/View;Z)V

    .line 874
    return-void
.end method
