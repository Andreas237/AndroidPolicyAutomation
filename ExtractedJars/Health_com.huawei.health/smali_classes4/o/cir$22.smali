.class Lo/cir$22;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cir;


# direct methods
.method constructor <init>(Lo/cir;)V
    .locals 0

    .line 1764
    iput-object p1, p0, Lo/cir$22;->e:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1767
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->q()Landroid/widget/ImageView;

    move-result-object v3

    .line 1768
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->r()Lo/chh;

    move-result-object v4

    .line 1769
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v5

    .line 1772
    const/4 v7, -0x1

    .line 1773
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1774
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->t()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->o()Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getRight()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int v6, v0, v1

    .line 1775
    const/4 v7, 0x1

    goto :goto_0

    .line 1777
    :cond_0
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->o()Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getLeft()I

    move-result v0

    iget-object v1, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->t()Landroid/widget/ImageButton;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getRight()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v1}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->s()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    sub-int v6, v0, v1

    .line 1780
    :goto_0
    div-int/lit8 v0, v6, 0x6

    invoke-virtual {v5}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v8, v0, v1

    .line 1782
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->b(Lo/cir;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackMainMapActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v9

    .line 1783
    invoke-interface {v9}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v10

    .line 1784
    div-int/lit8 v11, v10, 0x2

    .line 1785
    invoke-virtual {v5}, Landroid/widget/ImageView;->getTop()I

    move-result v12

    .line 1788
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1789
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1790
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/chh;->setVisibility(I)V

    .line 1791
    iget-object v0, p0, Lo/cir$22;->e:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v0

    mul-int v1, v7, v8

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTranslationX(F)V

    .line 1792
    invoke-virtual {v5}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v11, v0

    add-int/2addr v0, v8

    invoke-static {v3, v0, v12}, Lo/cir;->e(Landroid/view/View;II)V

    .line 1793
    invoke-virtual {v5}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v11, v0

    sub-int/2addr v0, v8

    invoke-static {v4, v0, v12}, Lo/cir;->e(Landroid/view/View;II)V

    .line 1794
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/chh;->e(Z)V

    .line 1795
    invoke-virtual {v3}, Landroid/widget/ImageView;->invalidate()V

    .line 1796
    invoke-virtual {v4}, Lo/chh;->invalidate()V

    .line 1797
    return-void
.end method
