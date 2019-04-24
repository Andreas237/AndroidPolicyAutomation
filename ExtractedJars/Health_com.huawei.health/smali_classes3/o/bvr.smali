.class public Lo/bvr;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Landroid/view/View;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 29
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 30
    new-instance v0, Landroid/util/SparseArray;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lo/bvr;->c:Landroid/util/SparseArray;

    .line 31
    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Landroid/view/View;>(I)TV;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lo/bvr;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    .line 35
    if-nez v1, :cond_0

    .line 36
    iget-object v0, p0, Lo/bvr;->itemView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 37
    iget-object v0, p0, Lo/bvr;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 39
    :cond_0
    return-object v1
.end method

.method public a(ILjava/lang/String;)Lo/bvr;
    .locals 2

    .line 162
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 165
    invoke-virtual {v1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2, v1}, Lo/cam;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 167
    :cond_0
    return-object p0
.end method

.method public a(II)V
    .locals 1

    .line 177
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 178
    return-void
.end method

.method public b(II)Lo/bvr;
    .locals 2

    .line 57
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/efy;

    .line 58
    invoke-virtual {v1}, Lo/efy;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 59
    return-object p0
.end method

.method public b(ILandroid/view/View$OnClickListener;)Lo/bvr;
    .locals 1

    .line 171
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    .line 172
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    return-object p0
.end method

.method public c(ILjava/lang/String;)Lo/bvr;
    .locals 2

    .line 49
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/efy;

    .line 50
    if-eqz v1, :cond_0

    .line 51
    invoke-virtual {v1, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 53
    :cond_0
    return-object p0
.end method

.method public d(II)Lo/bvr;
    .locals 1

    .line 69
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    .line 70
    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    return-object p0
.end method

.method public d(ILjava/lang/String;I)Lo/bvr;
    .locals 2

    .line 93
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 94
    const-string v0, "http"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 98
    invoke-static {p2, v1, p3}, Lo/cam;->c(Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/bvr;->a(ILjava/lang/String;)Lo/bvr;

    .line 103
    :cond_1
    :goto_0
    return-object p0
.end method

.method public d(IZ)V
    .locals 2

    .line 181
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/CompoundButton;

    .line 182
    invoke-virtual {v1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 183
    return-void
.end method

.method public e(II)Lo/bvr;
    .locals 2

    .line 84
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 85
    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 86
    return-object p0
.end method

.method public varargs e(II[Ljava/lang/Object;)Lo/bvr;
    .locals 2

    .line 63
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/efy;

    .line 64
    invoke-virtual {v1}, Lo/efy;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2, p3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 65
    return-object p0
.end method

.method public e(ILandroid/text/SpannableString;)Lo/bvr;
    .locals 2

    .line 43
    invoke-virtual {p0, p1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/efy;

    .line 44
    invoke-virtual {v1, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 45
    return-object p0
.end method
