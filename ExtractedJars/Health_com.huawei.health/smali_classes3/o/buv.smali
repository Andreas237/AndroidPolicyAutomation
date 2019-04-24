.class public abstract Lo/buv;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/buv$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RH:Ljava/lang/Object;>Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bvr;>;"
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<TRH;>;"
        }
    .end annotation
.end field

.field private c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private e:Lo/buv$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const-class v0, Lo/buv;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/buv;->d:Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(Ljava/util/List;[I)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TRH;>;[I)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 23
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/buv;->c:Landroid/util/SparseArray;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/buv;->a:Ljava/util/List;

    .line 34
    const/4 v2, 0x0

    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_0

    .line 35
    iget-object v0, p0, Lo/buv;->c:Landroid/util/SparseArray;

    aget v1, p2, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 34
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 37
    :cond_0
    iput-object p1, p0, Lo/buv;->a:Ljava/util/List;

    .line 38
    return-void
.end method

.method static synthetic b(Lo/buv;)Ljava/util/List;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/buv;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lo/buv;)Lo/buv$b;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/buv;->e:Lo/buv$b;

    return-object v0
.end method

.method private e(I)I
    .locals 1

    .line 70
    iget-object v0, p0, Lo/buv;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TRH;"
        }
    .end annotation

    .line 102
    iget-object v0, p0, Lo/buv;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bvr;I)V
    .locals 2

    .line 83
    iget-object v0, p0, Lo/buv;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lo/buv;->e(Lo/bvr;ILjava/lang/Object;)V

    .line 84
    iget-object v0, p1, Lo/bvr;->itemView:Landroid/view/View;

    new-instance v1, Lo/buv$3;

    invoke-direct {v1, p0, p1, p2}, Lo/buv$3;-><init>(Lo/buv;Lo/bvr;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    return-void
.end method

.method public e(Landroid/view/ViewGroup;I)Lo/bvr;
    .locals 4

    .line 76
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 77
    invoke-direct {p0, p2}, Lo/buv;->e(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 78
    new-instance v0, Lo/bvr;

    invoke-direct {v0, v3}, Lo/bvr;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public e(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TRH;>;)V"
        }
    .end annotation

    .line 111
    iput-object p1, p0, Lo/buv;->a:Ljava/util/List;

    .line 112
    invoke-virtual {p0}, Lo/buv;->notifyDataSetChanged()V

    .line 113
    return-void
.end method

.method public e(Lo/buv$b;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lo/buv;->e:Lo/buv$b;

    .line 126
    return-void
.end method

.method public abstract e(Lo/bvr;ILjava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bvr;ITRH;)V"
        }
    .end annotation
.end method

.method public getItemCount()I
    .locals 1

    .line 98
    iget-object v0, p0, Lo/buv;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 62
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 20
    move-object v0, p1

    check-cast v0, Lo/bvr;

    invoke-virtual {p0, v0, p2}, Lo/buv;->c(Lo/bvr;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 20
    invoke-virtual {p0, p1, p2}, Lo/buv;->e(Landroid/view/ViewGroup;I)Lo/bvr;

    move-result-object v0

    return-object v0
.end method
