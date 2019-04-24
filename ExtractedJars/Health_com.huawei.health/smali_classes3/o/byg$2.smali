.class Lo/byg$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byg;->d(FFFFIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lo/byg;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/byg;II)V
    .locals 0

    .line 95
    iput-object p1, p0, Lo/byg$2;->d:Lo/byg;

    iput p2, p0, Lo/byg$2;->e:I

    iput p3, p0, Lo/byg$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 105
    iget-object v0, p0, Lo/byg$2;->d:Lo/byg;

    new-instance v1, Lo/byg$2$3;

    invoke-direct {v1, p0}, Lo/byg$2$3;-><init>(Lo/byg$2;)V

    iget v2, p0, Lo/byg$2;->c:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lo/byg;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 118
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 123
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 99
    return-void
.end method
