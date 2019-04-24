.class Lo/ezi$e;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# static fields
.field static final synthetic c:Z


# instance fields
.field final synthetic d:Lo/ezi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 81
    const-class v0, Lo/ezi;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/ezi$e;->c:Z

    return-void
.end method

.method private constructor <init>(Lo/ezi;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/ezi;Lo/ezi$2;)V
    .locals 0

    .line 81
    invoke-direct {p0, p1}, Lo/ezi$e;-><init>(Lo/ezi;)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 3

    .line 125
    iget-object v0, p0, Lo/ezi$e;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/ezi$e;->d:Lo/ezi;

    iget-object v1, v1, Lo/ezi;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 131
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lo/ezi$e;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 132
    :cond_0
    const/4 v0, 0x2

    return v0

    .line 136
    :cond_1
    if-ltz p1, :cond_2

    rem-int/lit8 v0, p1, 0x2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 138
    const/4 v0, 0x1

    return v0

    .line 140
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 4

    .line 105
    sget-boolean v0, Lo/ezi$e;->c:Z

    if-nez v0, :cond_1

    if-ltz p2, :cond_0

    invoke-virtual {p0}, Lo/ezi$e;->getItemCount()I

    move-result v0

    if-lt p2, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 106
    :cond_1
    invoke-virtual {p0, p2}, Lo/ezi$e;->getItemViewType(I)I

    move-result v3

    .line 107
    if-nez v3, :cond_3

    .line 108
    sget-boolean v0, Lo/ezi$e;->c:Z

    if-nez v0, :cond_2

    instance-of v0, p1, Lo/ezi$b;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 109
    :cond_2
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v1, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v1}, Lo/ezi;->a(Lo/ezi;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMinimumWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 110
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v1, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v1}, Lo/ezi;->a(Lo/ezi;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMinimumHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    goto :goto_0

    .line 111
    :cond_3
    const/4 v0, 0x2

    if-ne v3, v0, :cond_5

    .line 112
    sget-boolean v0, Lo/ezi$e;->c:Z

    if-nez v0, :cond_4

    instance-of v0, p1, Lo/ezi$a;

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 113
    :cond_4
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v1, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v1}, Lo/ezi;->c(Lo/ezi;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMinimumWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 114
    iget-object v0, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    iget-object v1, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v1}, Lo/ezi;->c(Lo/ezi;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMinimumHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    goto :goto_0

    .line 116
    :cond_5
    sget-boolean v0, Lo/ezi$e;->c:Z

    if-nez v0, :cond_6

    instance-of v0, p1, Lo/ezi$c;

    if-nez v0, :cond_6

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 117
    :cond_6
    move-object v0, p1

    check-cast v0, Lo/ezi$c;

    iget-object v1, p0, Lo/ezi$e;->d:Lo/ezi;

    iget-object v1, v1, Lo/ezi;->a:Ljava/util/List;

    div-int/lit8 v2, p2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ezj;

    invoke-virtual {v0, v1}, Lo/ezi$c;->b(Lo/ezj;)V

    .line 120
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 5

    .line 89
    if-nez p2, :cond_0

    .line 90
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-virtual {v0}, Lo/ezi;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 91
    iget-object v0, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->a(Lo/ezi;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 92
    iget-object v0, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->a(Lo/ezi;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 93
    new-instance v0, Lo/ezi$b;

    invoke-direct {v0, v4}, Lo/ezi$b;-><init>(Landroid/view/View;)V

    return-object v0

    .line 94
    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 95
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-virtual {v0}, Lo/ezi;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 96
    iget-object v0, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->c(Lo/ezi;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 97
    iget-object v0, p0, Lo/ezi$e;->d:Lo/ezi;

    invoke-static {v0}, Lo/ezi;->c(Lo/ezi;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 98
    new-instance v0, Lo/ezi$a;

    invoke-direct {v0, v4}, Lo/ezi$a;-><init>(Landroid/view/View;)V

    return-object v0

    .line 100
    :cond_1
    new-instance v0, Lo/ezi$c;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$layout;->multi_view_data_observer_view_item:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ezi$c;-><init>(Landroid/view/View;)V

    return-object v0
.end method
