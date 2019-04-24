.class Lo/ejc$5;
.super Lo/eih$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ejc;->d(Landroid/view/MotionEvent;FZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ejc;

.field final synthetic e:F


# direct methods
.method constructor <init>(Lo/ejc;Lo/eih;F)V
    .locals 1

    .line 343
    iput-object p1, p0, Lo/ejc$5;->c:Lo/ejc;

    iput p3, p0, Lo/ejc$5;->e:F

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, p2}, Lo/eih$b;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public b(F)I
    .locals 2

    .line 348
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, p1

    iget v1, p0, Lo/ejc$5;->e:F

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
