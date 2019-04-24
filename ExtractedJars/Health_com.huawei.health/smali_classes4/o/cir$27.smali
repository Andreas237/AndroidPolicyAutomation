.class Lo/cir$27;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 1802
    iput-object p1, p0, Lo/cir$27;->b:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1805
    iget-object v0, p0, Lo/cir$27;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->q()Landroid/widget/ImageView;

    move-result-object v2

    .line 1806
    iget-object v0, p0, Lo/cir$27;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v3

    .line 1807
    iget-object v0, p0, Lo/cir$27;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v4

    .line 1810
    iget-object v0, p0, Lo/cir$27;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->b(Lo/cir;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v5

    .line 1811
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v6

    .line 1812
    div-int/lit8 v7, v6, 0x2

    .line 1813
    invoke-virtual {v4}, Landroid/widget/ImageView;->getTop()I

    move-result v8

    .line 1814
    invoke-virtual {v4}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v7, v0

    invoke-static {v2, v0, v8}, Lo/cir;->e(Landroid/view/View;II)V

    .line 1815
    invoke-virtual {v4}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v7, v0

    invoke-static {v3, v0, v8}, Lo/cir;->e(Landroid/view/View;II)V

    .line 1816
    invoke-virtual {v4}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v7, v0

    invoke-static {v4, v0, v8}, Lo/cir;->e(Landroid/view/View;II)V

    .line 1817
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1818
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1819
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Lo/chh;->setVisibility(I)V

    .line 1820
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/chh;->e(Z)V

    .line 1821
    iget-object v0, p0, Lo/cir$27;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->m(Lo/cir;)V

    .line 1822
    iget-object v0, p0, Lo/cir$27;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1825
    invoke-virtual {v2}, Landroid/widget/ImageView;->invalidate()V

    .line 1826
    invoke-virtual {v3}, Lo/chh;->invalidate()V

    .line 1827
    invoke-virtual {v4}, Landroid/widget/ImageView;->invalidate()V

    .line 1828
    return-void
.end method
