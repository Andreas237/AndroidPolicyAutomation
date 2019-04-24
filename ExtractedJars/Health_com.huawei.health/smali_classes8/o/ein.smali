.class public abstract Lo/ein;
.super Lo/eii;
.source "SourceFile"

# interfaces
.implements Lo/mw;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>Lo/eii<TT;>;Lo/mw<TT;>;"
    }
.end annotation


# instance fields
.field protected q:Z

.field protected u:Z

.field protected v:F

.field protected y:Landroid/graphics/DashPathEffect;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0, p1, p2}, Lo/eii;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 17
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ein;->u:Z

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ein;->q:Z

    .line 21
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lo/ein;->v:F

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ein;->y:Landroid/graphics/DashPathEffect;

    .line 29
    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/ein;->v:F

    .line 30
    return-void
.end method


# virtual methods
.method public T()Z
    .locals 1

    .line 59
    iget-boolean v0, p0, Lo/ein;->u:Z

    return v0
.end method

.method public U()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lo/ein;->q:Z

    return v0
.end method

.method public W()F
    .locals 1

    .line 77
    iget v0, p0, Lo/ein;->v:F

    return v0
.end method

.method public Z()Landroid/graphics/DashPathEffect;
    .locals 1

    .line 112
    iget-object v0, p0, Lo/ein;->y:Landroid/graphics/DashPathEffect;

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lo/ein;->q:Z

    .line 38
    return-void
.end method

.method public f(F)V
    .locals 1

    .line 72
    invoke-static {p1}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/ein;->v:F

    .line 73
    return-void
.end method
