.class public Lo/eyt;
.super Lo/ezj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eyt$b;
    }
.end annotation


# instance fields
.field protected a:Z

.field protected b:Landroid/widget/LinearLayout;

.field protected c:Landroid/widget/LinearLayout;

.field protected d:Lo/ezj;

.field protected e:Lo/ezj;

.field private g:Landroid/view/View;

.field protected k:Lo/eyt$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/ezh;)V
    .locals 2

    .line 34
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lo/ezj;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyt;->a:Z

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyt;->k:Lo/eyt$b;

    .line 35
    invoke-direct {p0}, Lo/eyt;->d()V

    .line 36
    return-void
.end method

.method private b(Z)V
    .locals 0

    .line 210
    iput-boolean p1, p0, Lo/eyt;->a:Z

    .line 211
    return-void
.end method

.method private d()V
    .locals 2

    .line 39
    invoke-virtual {p0}, Lo/eyt;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->double_view_data_observer_view:I

    invoke-static {v0, v1, p0}, Lo/eyt;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 40
    sget v0, Lcom/huawei/ui/main/R$id;->observer_view_first_place:I

    invoke-virtual {p0, v0}, Lo/eyt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eyt;->c:Landroid/widget/LinearLayout;

    .line 41
    sget v0, Lcom/huawei/ui/main/R$id;->observer_view_second_place:I

    invoke-virtual {p0, v0}, Lo/eyt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eyt;->b:Landroid/widget/LinearLayout;

    .line 42
    sget v0, Lcom/huawei/ui/main/R$id;->view_divider_double_data:I

    invoke-virtual {p0, v0}, Lo/eyt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/eyt;->g:Landroid/view/View;

    .line 43
    return-void
.end method

.method private e()V
    .locals 1

    .line 214
    iget-boolean v0, p0, Lo/eyt;->a:Z

    if-eqz v0, :cond_0

    .line 215
    new-instance v0, Lo/eyt$b;

    invoke-direct {v0, p0}, Lo/eyt$b;-><init>(Lo/eyt;)V

    iput-object v0, p0, Lo/eyt;->k:Lo/eyt$b;

    .line 216
    iget-object v0, p0, Lo/eyt;->k:Lo/eyt$b;

    invoke-virtual {v0}, Lo/eyt$b;->g()V

    .line 218
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lo/ezj;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/eyt;->d:Lo/ezj;

    return-object v0
.end method

.method public a(Lo/eih;II)V
    .locals 1

    .line 67
    iget-object v0, p0, Lo/eyt;->e:Lo/ezj;

    invoke-virtual {v0, p1, p2, p3}, Lo/ezj;->a(Lo/eih;II)V

    .line 68
    iget-object v0, p0, Lo/eyt;->d:Lo/ezj;

    invoke-virtual {v0, p1, p2, p3}, Lo/ezj;->a(Lo/eih;II)V

    .line 69
    return-void
.end method

.method public a(Lo/ezj;Lo/ezj;)V
    .locals 1

    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lo/eyt;->a(Lo/ezj;Lo/ezj;Z)V

    .line 55
    return-void
.end method

.method public a(Lo/ezj;Lo/ezj;Z)V
    .locals 1

    .line 46
    iput-object p1, p0, Lo/eyt;->e:Lo/ezj;

    .line 47
    iput-object p2, p0, Lo/eyt;->d:Lo/ezj;

    .line 48
    iget-object v0, p0, Lo/eyt;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 49
    iget-object v0, p0, Lo/eyt;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 50
    invoke-direct {p0, p3}, Lo/eyt;->b(Z)V

    .line 51
    return-void
.end method

.method public b()V
    .locals 0

    .line 222
    invoke-direct {p0}, Lo/eyt;->e()V

    .line 223
    return-void
.end method

.method public d_()Lo/ezj;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/eyt;->e:Lo/ezj;

    return-object v0
.end method
