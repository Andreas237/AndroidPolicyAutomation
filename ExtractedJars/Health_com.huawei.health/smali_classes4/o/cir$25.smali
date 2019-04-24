.class Lo/cir$25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->h()V
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

    .line 1363
    iput-object p1, p0, Lo/cir$25;->b:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1366
    iget-object v0, p0, Lo/cir$25;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v0

    invoke-virtual {v0}, Lo/ciq;->d()Landroid/widget/FrameLayout;

    move-result-object v0

    iget-object v1, p0, Lo/cir$25;->b:Lo/cir;

    invoke-static {v1}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$drawable;->run_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1367
    iget-object v0, p0, Lo/cir$25;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->v(Lo/cir;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1368
    iget-object v0, p0, Lo/cir$25;->b:Lo/cir;

    invoke-static {v0}, Lo/cir;->v(Lo/cir;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1370
    :cond_0
    return-void
.end method
