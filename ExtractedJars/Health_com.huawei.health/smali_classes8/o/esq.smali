.class public Lo/esq;
.super Lo/erc;
.source "SourceFile"


# instance fields
.field public a:Landroid/widget/TextView;

.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/TextView;

.field public g:Landroid/view/View;

.field private h:Landroid/content/Context;

.field public i:Landroid/widget/ImageView;

.field public k:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 2

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 42
    iput-object p2, p0, Lo/esq;->h:Landroid/content/Context;

    .line 43
    iput-object p1, p0, Lo/esq;->g:Landroid/view/View;

    .line 44
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_date_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/esq;->c:Landroid/widget/TextView;

    .line 45
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/esq;->d:Landroid/widget/TextView;

    .line 46
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_unity:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/esq;->b:Landroid/widget/TextView;

    .line 47
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_speed:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/esq;->e:Landroid/widget/TextView;

    .line 48
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_keeptime:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/esq;->a:Landroid/widget/TextView;

    .line 49
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_speed_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/esq;->f:Landroid/widget/TextView;

    .line 50
    sget v0, Lcom/huawei/ui/homehealth/R$id;->sport_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/esq;->i:Landroid/widget/ImageView;

    .line 51
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_red_dot:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/esq;->k:Landroid/widget/ImageView;

    .line 52
    iget-object v0, p0, Lo/esq;->g:Landroid/view/View;

    new-instance v1, Lo/esq$1;

    invoke-direct {v1, p0}, Lo/esq$1;-><init>(Lo/esq;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    return-void
.end method

.method static synthetic a(Lo/esq;)Landroid/content/Context;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/esq;->h:Landroid/content/Context;

    return-object v0
.end method
