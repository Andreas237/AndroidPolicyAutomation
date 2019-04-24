.class Lo/ebs$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ebs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lo/ebs;

.field private b:F

.field private c:F

.field private d:F

.field private e:F


# direct methods
.method public constructor <init>(Lo/ebs;FFF)V
    .locals 2

    .line 112
    iput-object p1, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput p2, p0, Lo/ebs$d;->c:F

    .line 114
    iput p3, p0, Lo/ebs$d;->d:F

    .line 115
    iput p4, p0, Lo/ebs$d;->e:F

    .line 116
    invoke-virtual {p1}, Lo/ebs;->getScale()F

    move-result v0

    iget v1, p0, Lo/ebs$d;->c:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 117
    const v0, 0x3f88f5c3    # 1.07f

    iput v0, p0, Lo/ebs$d;->b:F

    goto :goto_0

    .line 119
    :cond_0
    const v0, 0x3f6e147b    # 0.93f

    iput v0, p0, Lo/ebs$d;->b:F

    .line 122
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 127
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-static {v0}, Lo/ebs;->e(Lo/ebs;)Landroid/graphics/Matrix;

    move-result-object v0

    iget v1, p0, Lo/ebs$d;->b:F

    iget v2, p0, Lo/ebs$d;->b:F

    iget v3, p0, Lo/ebs$d;->d:F

    iget v4, p0, Lo/ebs$d;->e:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 128
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-static {v0}, Lo/ebs;->a(Lo/ebs;)V

    .line 129
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    iget-object v1, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-static {v1}, Lo/ebs;->e(Lo/ebs;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ebs;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 131
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-virtual {v0}, Lo/ebs;->getScale()F

    move-result v5

    .line 133
    iget v0, p0, Lo/ebs$d;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget v0, p0, Lo/ebs$d;->c:F

    cmpg-float v0, v5, v0

    if-ltz v0, :cond_1

    :cond_0
    iget v0, p0, Lo/ebs$d;->b:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    iget v0, p0, Lo/ebs$d;->c:F

    cmpg-float v0, v0, v5

    if-gez v0, :cond_2

    .line 135
    :cond_1
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    const-wide/16 v1, 0x10

    invoke-virtual {v0, p0, v1, v2}, Lo/ebs;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 139
    :cond_2
    iget v0, p0, Lo/ebs$d;->c:F

    div-float v6, v0, v5

    .line 140
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-static {v0}, Lo/ebs;->e(Lo/ebs;)Landroid/graphics/Matrix;

    move-result-object v0

    iget v1, p0, Lo/ebs$d;->d:F

    iget v2, p0, Lo/ebs$d;->e:F

    invoke-virtual {v0, v6, v6, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 141
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-static {v0}, Lo/ebs;->a(Lo/ebs;)V

    .line 142
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    iget-object v1, p0, Lo/ebs$d;->a:Lo/ebs;

    invoke-static {v1}, Lo/ebs;->e(Lo/ebs;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ebs;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 143
    iget-object v0, p0, Lo/ebs$d;->a:Lo/ebs;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ebs;->c(Lo/ebs;Z)Z

    .line 146
    :goto_0
    return-void
.end method
