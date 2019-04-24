.class public Lo/ekp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;Lo/lm;)V
    .locals 4

    .line 16
    const/16 v0, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/lm;->b(I)V

    .line 17
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {p1, v0}, Lo/lm;->k(F)V

    .line 19
    sget-object v0, Lo/lm$a;->d:Lo/lm$a;

    invoke-virtual {p1, v0}, Lo/lm;->a(Lo/lm$a;)V

    .line 20
    sget-object v0, Lo/lm$k;->c:Lo/lm$k;

    invoke-virtual {p1, v0}, Lo/lm;->c(Lo/lm$k;)V

    .line 21
    sget-object v0, Lo/lm$d;->c:Lo/lm$d;

    invoke-virtual {p1, v0}, Lo/lm;->b(Lo/lm$d;)V

    .line 22
    return-void
.end method
