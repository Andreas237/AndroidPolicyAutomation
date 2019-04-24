.class public abstract Lo/fgt;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Landroid/widget/BaseAdapter;"
    }
.end annotation


# instance fields
.field protected a:Z

.field private b:I

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<TT;>;"
        }
    .end annotation
.end field

.field protected d:I

.field protected e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgt;->a:Z

    .line 35
    const/4 v0, 0x3

    iput v0, p0, Lo/fgt;->d:I

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fgt;->e:Z

    .line 39
    const/4 v0, -0x1

    iput v0, p0, Lo/fgt;->b:I

    return-void
.end method


# virtual methods
.method protected abstract a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public final a(Z)Lo/fgt;
    .locals 1

    .line 121
    iget-boolean v0, p0, Lo/fgt;->e:Z

    if-eq p1, v0, :cond_0

    .line 122
    iput-boolean p1, p0, Lo/fgt;->e:Z

    .line 123
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 125
    :cond_0
    return-object p0
.end method

.method public areAllItemsEnabled()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Lo/fgt;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public final b(I)Lo/fgt;
    .locals 0

    .line 137
    iput p1, p0, Lo/fgt;->d:I

    .line 138
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 139
    return-object p0
.end method

.method public final c(Ljava/util/List;)Lo/fgt;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)Lo/fgt;"
        }
    .end annotation

    .line 143
    iput-object p1, p0, Lo/fgt;->c:Ljava/util/List;

    .line 144
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 145
    return-object p0
.end method

.method public final c(I)V
    .locals 0

    .line 49
    iput p1, p0, Lo/fgt;->b:I

    .line 50
    return-void
.end method

.method public final d(Z)Lo/fgt;
    .locals 1

    .line 129
    iget-boolean v0, p0, Lo/fgt;->a:Z

    if-eq p1, v0, :cond_0

    .line 130
    iput-boolean p1, p0, Lo/fgt;->a:Z

    .line 131
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 133
    :cond_0
    return-object p0
.end method

.method public final getCount()I
    .locals 2

    .line 54
    iget-boolean v0, p0, Lo/fgt;->a:Z

    if-eqz v0, :cond_0

    .line 55
    const v0, 0x7fffffff

    return v0

    .line 57
    :cond_0
    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-static {v0}, Lo/fgx;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/fgt;->d:I

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-static {v0}, Lo/fgx;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    iget-object v1, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    rem-int v1, p1, v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .line 62
    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-static {v0}, Lo/fgx;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int v0, p1, v0

    int-to-long v0, v0

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    :goto_0
    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 93
    iget-boolean v0, p0, Lo/fgt;->a:Z

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/2addr p1, v0

    goto :goto_0

    .line 96
    :cond_0
    iget v0, p0, Lo/fgt;->d:I

    div-int/lit8 v0, v0, 0x2

    if-ge p1, v0, :cond_1

    .line 97
    const/4 p1, -0x1

    goto :goto_0

    .line 98
    :cond_1
    iget v0, p0, Lo/fgt;->d:I

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    if-lt p1, v0, :cond_2

    .line 99
    const/4 p1, -0x1

    goto :goto_0

    .line 101
    :cond_2
    iget v0, p0, Lo/fgt;->d:I

    div-int/lit8 v0, v0, 0x2

    sub-int/2addr p1, v0

    .line 105
    :goto_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    .line 106
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p2, p3}, Lo/fgt;->a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lo/fgt;->a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 110
    :goto_1
    iget-boolean v0, p0, Lo/fgt;->a:Z

    if-nez v0, :cond_5

    .line 111
    const/4 v0, -0x1

    if-ne p1, v0, :cond_4

    .line 112
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 114
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 117
    :cond_5
    :goto_2
    return-object v2
.end method

.method public isEnabled(I)Z
    .locals 3

    .line 77
    iget-boolean v0, p0, Lo/fgt;->e:Z

    if-eqz v0, :cond_1

    .line 78
    iget-boolean v0, p0, Lo/fgt;->a:Z

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lo/fgt;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int v0, p1, v0

    iget v1, p0, Lo/fgt;->b:I

    if-ne v0, v1, :cond_1

    .line 80
    const/4 v0, 0x1

    return v0

    .line 83
    :cond_0
    iget v0, p0, Lo/fgt;->b:I

    iget v1, p0, Lo/fgt;->d:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    if-ne p1, v0, :cond_1

    .line 84
    const/4 v0, 0x1

    return v0

    .line 88
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final notifyDataSetChanged()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 154
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 155
    return-void
.end method

.method public final notifyDataSetInvalidated()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 163
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 164
    return-void
.end method
