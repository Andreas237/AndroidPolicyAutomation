.class public Lo/bvk;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field c:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private d:I

.field e:Lo/bvf;

.field private i:Z


# direct methods
.method public constructor <init>(Lo/bvf;IIIZ)V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 25
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvk;->i:Z

    .line 29
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/bvk;->c:Ljava/util/LinkedList;

    .line 33
    iput-object p1, p0, Lo/bvk;->e:Lo/bvf;

    .line 34
    iput p2, p0, Lo/bvk;->b:I

    .line 35
    iput p3, p0, Lo/bvk;->d:I

    .line 36
    iput p4, p0, Lo/bvk;->a:I

    .line 37
    iput-boolean p5, p0, Lo/bvk;->i:Z

    .line 38
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 3

    .line 104
    add-int/lit8 v0, p1, 0x1

    invoke-virtual {p0}, Lo/bvk;->getCount()I

    move-result v1

    sub-int v2, v0, v1

    .line 105
    return v2
.end method

.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    .line 86
    move-object v1, p3

    check-cast v1, Landroid/view/View;

    .line 87
    iget-object v0, p0, Lo/bvk;->c:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 89
    return-void
.end method

.method public e(I)I
    .locals 3

    .line 96
    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0}, Lo/bvk;->getCount()I

    move-result v1

    add-int v2, v0, v1

    .line 97
    if-gez v2, :cond_0

    .line 98
    invoke-virtual {p0}, Lo/bvk;->getCount()I

    move-result v2

    .line 100
    :cond_0
    return v2
.end method

.method public getCount()I
    .locals 1

    .line 42
    const/16 v0, 0x168

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 7

    .line 55
    add-int/lit8 v0, p2, 0x1

    invoke-virtual {p0}, Lo/bvk;->getCount()I

    move-result v1

    sub-int v6, v0, v1

    .line 56
    iget-boolean v0, p0, Lo/bvk;->i:Z

    if-eqz v0, :cond_1

    .line 57
    iget-object v0, p0, Lo/bvk;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 58
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_week_calendar_card:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/byj;

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_exercise_history_calendar_card_week:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 61
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_week_calendar_card:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/byj;

    .line 64
    :goto_0
    iget-object v0, p0, Lo/bvk;->e:Lo/bvf;

    iget v1, p0, Lo/bvk;->b:I

    iget v2, p0, Lo/bvk;->d:I

    iget v3, p0, Lo/bvk;->a:I

    invoke-virtual {v0, v1, v2, v3, v6}, Lo/bvf;->b(IIII)V

    .line 65
    iget-object v0, p0, Lo/bvk;->e:Lo/bvf;

    invoke-virtual {v0}, Lo/bvf;->d()[I

    move-result-object v0

    iget-object v1, p0, Lo/bvk;->e:Lo/bvf;

    invoke-virtual {v1}, Lo/bvf;->f()[I

    move-result-object v1

    iget v2, p0, Lo/bvk;->a:I

    invoke-virtual {v4, v0, v1, v2, v6}, Lo/byj;->setWeek([I[III)V

    goto :goto_2

    .line 68
    :cond_1
    iget-object v0, p0, Lo/bvk;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/View;

    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 69
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_calendar_card:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/byj;

    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_exercise_history_calendar_card_month:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 72
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_calendar_card:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/byj;

    .line 75
    :goto_1
    iget-object v0, p0, Lo/bvk;->e:Lo/bvf;

    iget v1, p0, Lo/bvk;->b:I

    iget v2, p0, Lo/bvk;->d:I

    invoke-virtual {v0, v1, v2, v6}, Lo/bvf;->a(III)V

    .line 76
    iget-object v0, p0, Lo/bvk;->e:Lo/bvf;

    invoke-virtual {v0}, Lo/bvf;->a()[[I

    move-result-object v0

    iget v1, p0, Lo/bvk;->a:I

    iget-object v2, p0, Lo/bvk;->e:Lo/bvf;

    invoke-virtual {v2}, Lo/bvf;->c()[[I

    move-result-object v2

    invoke-virtual {v4, v0, v1, v2, v6}, Lo/byj;->setMonth([[II[[II)V

    .line 79
    :goto_2
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 81
    return-object v5
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 48
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
