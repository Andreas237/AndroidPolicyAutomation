.class Lo/eew$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eew;->e(Landroid/graphics/Bitmap;Lo/efq;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/efq;

.field final synthetic b:Lo/eew;

.field final synthetic c:Z

.field final synthetic e:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lo/eew;Landroid/graphics/Bitmap;Lo/efq;Z)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/eew$1;->b:Lo/eew;

    iput-object p2, p0, Lo/eew$1;->e:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lo/eew$1;->a:Lo/efq;

    iput-boolean p4, p0, Lo/eew$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 96
    iget-object v0, p0, Lo/eew$1;->b:Lo/eew;

    iget v0, v0, Lo/eew;->p:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 97
    iget-object v0, p0, Lo/eew$1;->b:Lo/eew;

    iget-object v1, p0, Lo/eew$1;->e:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lo/eew$1;->a:Lo/efq;

    iget-boolean v3, p0, Lo/eew$1;->c:Z

    invoke-static {v1, v2, v3}, Lo/efl;->c(Landroid/graphics/Bitmap;Lo/efq;Z)I

    move-result v1

    iput v1, v0, Lo/eew;->p:I

    goto :goto_0

    .line 99
    :cond_0
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 100
    iget-object v0, p0, Lo/eew$1;->e:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lo/efl;->d(Landroid/graphics/Bitmap;)V

    .line 102
    :goto_0
    return-void
.end method
