.class public Lo/eqz;
.super Lo/erc;
.source "SourceFile"

# interfaces
.implements Lo/erf$a;


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Lo/erf;

.field private c:Landroid/support/v7/widget/RecyclerView;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;

.field private i:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 2

    .line 33
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 34
    iput-object p2, p0, Lo/eqz;->e:Landroid/content/Context;

    .line 35
    sget v0, Lcom/huawei/ui/homehealth/R$id;->preview_card_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eqz;->a:Landroid/widget/LinearLayout;

    .line 36
    sget v0, Lcom/huawei/ui/homehealth/R$id;->preview_rv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/eqz;->c:Landroid/support/v7/widget/RecyclerView;

    .line 37
    iget-object v0, p0, Lo/eqz;->c:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 38
    iget-object v0, p0, Lo/eqz;->c:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 39
    sget v0, Lcom/huawei/ui/homehealth/R$id;->line_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/eqz;->i:Landroid/view/View;

    .line 40
    return-void
.end method

.method private d()V
    .locals 11

    .line 63
    const/4 v4, 0x0

    .line 65
    :try_start_0
    iget-object v0, p0, Lo/eqz;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lo/eqz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fil;

    .line 67
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 68
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 70
    invoke-virtual {v6}, Lo/fil;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    .line 71
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    .line 72
    invoke-static {v9, v8}, Lo/bzv;->a(Ljava/util/Date;Ljava/util/Date;)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v10

    .line 73
    if-lez v10, :cond_0

    .line 74
    const/4 v4, 0x1

    .line 75
    goto :goto_1

    .line 77
    :cond_0
    goto :goto_0

    .line 81
    :cond_1
    :goto_1
    goto :goto_2

    .line 79
    :catch_0
    move-exception v5

    .line 80
    const-string v0, "PreviewCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkUpData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    :goto_2
    if-eqz v4, :cond_2

    .line 83
    iget-object v0, p0, Lo/eqz;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 85
    :cond_2
    iget-object v0, p0, Lo/eqz;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    :goto_3
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 57
    iget-object v0, p0, Lo/eqz;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 58
    iget-object v0, p0, Lo/eqz;->i:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    invoke-direct {p0}, Lo/eqz;->d()V

    .line 60
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fil;>;)V"
        }
    .end annotation

    .line 43
    iput-object p1, p0, Lo/eqz;->d:Ljava/util/List;

    .line 44
    new-instance v0, Lo/erf;

    iget-object v1, p0, Lo/eqz;->e:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lo/erf;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lo/eqz;->b:Lo/erf;

    .line 45
    iget-object v0, p0, Lo/eqz;->c:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lo/eqz;->b:Lo/erf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 46
    iget-object v0, p0, Lo/eqz;->b:Lo/erf;

    invoke-virtual {v0, p0}, Lo/erf;->a(Lo/erf$a;)V

    .line 47
    return-void
.end method

.method public b()V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/eqz;->b:Lo/erf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqz;->c:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqz;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getRecycledViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/eqz;->c:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getRecycledViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->clear()V

    .line 52
    iget-object v0, p0, Lo/eqz;->b:Lo/erf;

    invoke-virtual {v0}, Lo/erf;->notifyDataSetChanged()V

    .line 54
    :cond_0
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 91
    iget-object v0, p0, Lo/eqz;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eqz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/eqz;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 94
    :cond_0
    return-void
.end method
