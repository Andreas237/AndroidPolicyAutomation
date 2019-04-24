.class public Lo/epv;
.super Lo/ept;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public d:Lo/eqb;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lo/ept;-><init>(Landroid/content/Context;)V

    .line 23
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 56
    invoke-super {p0}, Lo/ept;->a()V

    .line 57
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    invoke-virtual {v0}, Lo/eqb;->c()V

    .line 59
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    invoke-virtual {v0}, Lo/eqb;->d()V

    .line 60
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    invoke-virtual {v0}, Lo/eqb;->b()V

    .line 62
    :cond_0
    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 2

    .line 27
    const-string v0, "FunctionSetCardData"

    const-string v1, "-getCardViewHolder enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-super {p0, p1, p2}, Lo/ept;->b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    check-cast v0, Lo/eqb;

    iput-object v0, p0, Lo/epv;->d:Lo/eqb;

    .line 29
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    invoke-virtual {v0}, Lo/eqb;->a()V

    .line 30
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    invoke-virtual {v0}, Lo/eqb;->e()V

    .line 31
    const-string v0, "FunctionSetCardData"

    const-string v1, "-getCardViewHolder end"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 47
    invoke-super {p0}, Lo/ept;->d()V

    .line 48
    const-string v0, "FunctionSetCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetCardData : onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter into"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/epv;->d:Lo/eqb;

    invoke-virtual {v0}, Lo/eqb;->i()V

    .line 52
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 38
    return-void
.end method
