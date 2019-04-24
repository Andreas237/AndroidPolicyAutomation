.class public abstract Lo/eqv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lo/eqv;>;"
    }
.end annotation


# instance fields
.field private a:Z

.field protected c:Lo/eqw;

.field protected i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eqv;->c:Lo/eqw;

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lo/eqv;->i:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 141
    return-void
.end method

.method public abstract b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
.end method

.method public b(I)V
    .locals 2

    .line 81
    iget-object v0, p0, Lo/eqv;->c:Lo/eqw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 82
    iget-object v0, p0, Lo/eqv;->c:Lo/eqw;

    invoke-interface {v0, p1}, Lo/eqw;->a(I)V

    .line 84
    :cond_0
    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 16
    move-object v0, p1

    check-cast v0, Lo/eqv;

    invoke-virtual {p0, v0}, Lo/eqv;->e(Lo/eqv;)I

    move-result v0

    return v0
.end method

.method public d()V
    .locals 0

    .line 145
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/eqv;->i:I

    .line 110
    return-void
.end method

.method public e(Lo/eqv;)I
    .locals 2
    .param p1    # Lo/eqv;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 149
    invoke-virtual {p0}, Lo/eqv;->l()I

    move-result v0

    invoke-virtual {p1}, Lo/eqv;->l()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 150
    const/4 v0, 0x0

    return v0

    .line 152
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public l()I
    .locals 1

    .line 101
    iget v0, p0, Lo/eqv;->i:I

    return v0
.end method

.method public o()V
    .locals 2

    .line 91
    iget-object v0, p0, Lo/eqv;->c:Lo/eqw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/eqv;->c:Lo/eqw;

    invoke-interface {v0}, Lo/eqw;->e()V

    .line 94
    :cond_0
    return-void
.end method

.method public p()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lo/eqv;->a:Z

    return v0
.end method
