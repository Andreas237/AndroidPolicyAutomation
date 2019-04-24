.class public Lo/eth;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eth$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/etb;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/etg;>;"
        }
    .end annotation
.end field

.field private b:Lo/eth$b;

.field private d:Landroid/content/Context;

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/etg;>;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eth;->a:Ljava/util/List;

    .line 30
    iput-object p1, p0, Lo/eth;->d:Landroid/content/Context;

    .line 31
    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 33
    const-string v0, "TodoCardRecyAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTodoCardRecyModels"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void
.end method

.method static synthetic c(Lo/eth;)Lo/eth$b;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/eth;->b:Lo/eth$b;

    return-object v0
.end method


# virtual methods
.method public a(Lo/eth$b;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lo/eth;->b:Lo/eth$b;

    .line 85
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/etg;>;)V"
        }
    .end annotation

    .line 78
    const-string v0, "TodoCardRecyAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save todoCardRecyModels.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 80
    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 81
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lo/etb;
    .locals 5

    .line 38
    const-string v0, "TodoCardRecyAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    new-instance v0, Lo/etb;

    iget-object v1, p0, Lo/eth;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/huawei/ui/homehealth/R$layout;->home_todo_recy_item:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/etb;-><init>(Landroid/content/Context;Landroid/view/View;)V

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 74
    iput p1, p0, Lo/eth;->e:I

    .line 75
    return-void
.end method

.method public d(Lo/etb;I)V
    .locals 5

    .line 45
    const-string v0, "TodoCardRecyAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBindViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 47
    iget-object v0, p1, Lo/etb;->itemView:Landroid/view/View;

    new-instance v1, Lo/eth$1;

    invoke-direct {v1, p0, p2}, Lo/eth$1;-><init>(Lo/eth;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 56
    invoke-virtual {p1}, Lo/etb;->c()V

    .line 58
    :cond_0
    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/etg;

    .line 59
    invoke-virtual {p1, v4}, Lo/etb;->c(Lo/etg;)V

    .line 61
    :cond_1
    return-void
.end method

.method public getItemCount()I
    .locals 4

    .line 65
    iget v0, p0, Lo/eth;->e:I

    iget-object v1, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 66
    iget v0, p0, Lo/eth;->e:I

    return v0

    .line 68
    :cond_0
    const-string v0, "TodoCardRecyAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mShowCount should not > "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget-object v0, p0, Lo/eth;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lo/etb;

    invoke-virtual {p0, v0, p2}, Lo/eth;->d(Lo/etb;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 22
    invoke-virtual {p0, p1, p2}, Lo/eth;->d(Landroid/view/ViewGroup;I)Lo/etb;

    move-result-object v0

    return-object v0
.end method
