.class Lo/bwa$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;Landroid/view/View;)V
    .locals 0

    .line 1547
    iput-object p1, p0, Lo/bwa$14;->c:Lo/bwa;

    iput-object p2, p0, Lo/bwa$14;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 1554
    iget-object v0, p0, Lo/bwa$14;->b:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1555
    iget-object v0, p0, Lo/bwa$14;->c:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->d(Lo/bwa;)V

    .line 1556
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1561
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1550
    return-void
.end method
