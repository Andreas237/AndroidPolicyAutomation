.class Lo/byg$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/byg$2;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/byg$2;


# direct methods
.method constructor <init>(Lo/byg$2;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/byg$2$3;->e:Lo/byg$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 108
    iget-object v0, p0, Lo/byg$2$3;->e:Lo/byg$2;

    iget v0, v0, Lo/byg$2;->e:I

    if-nez v0, :cond_1

    .line 109
    iget-object v0, p0, Lo/byg$2$3;->e:Lo/byg$2;

    iget-object v0, v0, Lo/byg$2;->d:Lo/byg;

    invoke-static {v0}, Lo/byg;->c(Lo/byg;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 110
    iget-object v0, p0, Lo/byg$2$3;->e:Lo/byg$2;

    iget-object v0, v0, Lo/byg$2;->d:Lo/byg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byg;->setAlpha(F)V

    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p0, Lo/byg$2$3;->e:Lo/byg$2;

    iget-object v0, v0, Lo/byg$2;->d:Lo/byg;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/16 v5, 0x124

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lo/byg;->e(Lo/byg;FFFFIII)V

    .line 115
    :cond_1
    :goto_0
    return-void
.end method
