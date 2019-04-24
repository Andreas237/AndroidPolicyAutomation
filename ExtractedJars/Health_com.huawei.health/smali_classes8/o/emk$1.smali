.class Lo/emk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eim$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emk;->a(Lo/emi;Lo/elb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/emk;

.field final synthetic c:Lo/emi;


# direct methods
.method constructor <init>(Lo/emk;Lo/emi;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lo/emk$1;->b:Lo/emk;

    iput-object p2, p0, Lo/emk$1;->c:Lo/emi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 2

    .line 32
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 33
    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 35
    iget-object v0, p0, Lo/emk$1;->c:Lo/emi;

    invoke-virtual {v0}, Lo/emi;->getViewPortHandler()Lo/oa;

    move-result-object v0

    invoke-virtual {v0}, Lo/oa;->m()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    neg-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 36
    return-object p1
.end method
