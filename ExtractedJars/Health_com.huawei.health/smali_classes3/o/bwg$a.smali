.class Lo/bwg$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bwg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:F

.field final synthetic b:Lo/bwg;

.field c:F

.field d:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lo/bwg;FF)V
    .locals 4

    .line 229
    iput-object p1, p0, Lo/bwg$a;->b:Lo/bwg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    iput p2, p0, Lo/bwg$a;->a:F

    .line 231
    iput p3, p0, Lo/bwg$a;->c:F

    .line 232
    new-instance v0, Landroid/graphics/RectF;

    add-float v1, p2, p3

    invoke-static {p1}, Lo/bwg;->c(Lo/bwg;)I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-direct {v0, p2, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/bwg$a;->d:Landroid/graphics/RectF;

    .line 233
    return-void
.end method


# virtual methods
.method public b()F
    .locals 1

    .line 240
    iget v0, p0, Lo/bwg$a;->a:F

    return v0
.end method

.method public d()F
    .locals 1

    .line 244
    iget v0, p0, Lo/bwg$a;->c:F

    return v0
.end method
