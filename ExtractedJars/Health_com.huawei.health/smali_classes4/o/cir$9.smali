.class Lo/cir$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cig$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cir;->w()V
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

    .line 1005
    iput-object p1, p0, Lo/cir$9;->d:Lo/cir;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1008
    iget-object v0, p0, Lo/cir$9;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cir;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1009
    iget-object v0, p0, Lo/cir$9;->d:Lo/cir;

    invoke-static {v0}, Lo/cir;->p(Lo/cir;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1010
    iget-object v0, p0, Lo/cir$9;->d:Lo/cir;

    new-instance v1, Lo/cir$9$4;

    invoke-direct {v1, p0}, Lo/cir$9$4;-><init>(Lo/cir$9;)V

    invoke-static {v0, v1}, Lo/cir;->c(Lo/cir;Landroid/animation/Animator$AnimatorListener;)V

    .line 1042
    :cond_0
    return-void
.end method
