.class public abstract Lo/eij;
.super Lo/ein;
.source "SourceFile"

# interfaces
.implements Lo/my;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>Lo/ein<TT;>;Lo/my<TT;>;"
    }
.end annotation


# instance fields
.field private D:Z

.field protected t:Landroid/graphics/drawable/Drawable;

.field private w:I

.field private x:I

.field private z:F


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Lo/ein;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 25
    const/16 v0, 0x8c

    const/16 v1, 0xea

    const/16 v2, 0xff

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    iput v0, p0, Lo/eij;->x:I

    .line 35
    const/16 v0, 0x55

    iput v0, p0, Lo/eij;->w:I

    .line 40
    const/high16 v0, 0x40200000    # 2.5f

    iput v0, p0, Lo/eij;->z:F

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eij;->D:Z

    .line 50
    return-void
.end method


# virtual methods
.method public O()I
    .locals 1

    .line 54
    iget v0, p0, Lo/eij;->x:I

    return v0
.end method

.method public Q()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/eij;->t:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public S()I
    .locals 1

    .line 85
    iget v0, p0, Lo/eij;->w:I

    return v0
.end method

.method public V()Z
    .locals 1

    .line 125
    iget-boolean v0, p0, Lo/eij;->D:Z

    return v0
.end method

.method public X()F
    .locals 1

    .line 115
    iget v0, p0, Lo/eij;->z:F

    return v0
.end method

.method public c(F)V
    .locals 1

    .line 106
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 107
    const/4 p1, 0x0

    .line 108
    :cond_0
    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 109
    const/high16 p1, 0x41200000    # 10.0f

    .line 110
    :cond_1
    invoke-static {p1}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/eij;->z:F

    .line 111
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 120
    iput-boolean p1, p0, Lo/eij;->D:Z

    .line 121
    return-void
.end method

.method public g(I)V
    .locals 0

    .line 95
    iput p1, p0, Lo/eij;->w:I

    .line 96
    return-void
.end method
