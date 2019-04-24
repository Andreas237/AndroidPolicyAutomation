.class public Lo/ezr;
.super Lo/ezj;
.source "SourceFile"


# instance fields
.field private a:Lo/ezj;

.field private d:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 19
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lo/ezj;-><init>(Landroid/content/Context;Lo/ezh;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Lo/ezr;->e()V

    .line 21
    return-void
.end method

.method private e()V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lo/ezr;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->single_view_data_observer_view:I

    invoke-static {v0, v1, p0}, Lo/ezr;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    sget v0, Lcom/huawei/ui/main/R$id;->observer_view_place:I

    invoke-virtual {p0, v0}, Lo/ezr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ezr;->d:Landroid/widget/LinearLayout;

    .line 26
    return-void
.end method


# virtual methods
.method public a(Lo/eih;II)V
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ezr;->a:Lo/ezj;

    invoke-virtual {v0, p1, p2, p3}, Lo/ezj;->a(Lo/eih;II)V

    .line 41
    return-void
.end method

.method public c(Lo/ezj;)V
    .locals 1

    .line 29
    iput-object p1, p0, Lo/ezr;->a:Lo/ezj;

    .line 30
    iget-object v0, p0, Lo/ezr;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 31
    return-void
.end method

.method public d()Lo/ezj;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/ezr;->a:Lo/ezj;

    return-object v0
.end method
