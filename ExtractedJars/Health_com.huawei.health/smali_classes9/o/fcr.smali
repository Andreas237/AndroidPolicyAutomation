.class public Lo/fcr;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcr$d;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acu;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/acu;>;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 25
    const/4 v0, -0x1

    iput v0, p0, Lo/fcr;->b:I

    .line 27
    const/4 v0, -0x1

    iput v0, p0, Lo/fcr;->c:I

    .line 30
    iput-object p2, p0, Lo/fcr;->d:Ljava/util/List;

    .line 31
    iput-object p1, p0, Lo/fcr;->a:Landroid/content/Context;

    .line 32
    return-void
.end method

.method static synthetic c(Lo/fcr;I)I
    .locals 0

    .line 21
    iput p1, p0, Lo/fcr;->c:I

    return p1
.end method

.method static synthetic d(Lo/fcr;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/fcr;->c:I

    return v0
.end method

.method static synthetic e(Lo/fcr;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/fcr;->b:I

    return v0
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 96
    iget v0, p0, Lo/fcr;->c:I

    return v0
.end method

.method public d(I)V
    .locals 1

    .line 35
    iput p1, p0, Lo/fcr;->b:I

    .line 36
    iget v0, p0, Lo/fcr;->b:I

    iput v0, p0, Lo/fcr;->c:I

    .line 37
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 41
    iget-object v0, p0, Lo/fcr;->d:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fcr;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/fcr;->d:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fcr;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acu;

    :goto_0
    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 51
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 57
    if-nez p2, :cond_0

    .line 58
    new-instance v5, Lo/fcr$d;

    invoke-direct {v5}, Lo/fcr$d;-><init>()V

    .line 59
    iget-object v0, p0, Lo/fcr;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_single_select:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 60
    sget v0, Lcom/huawei/ui/main/R$id;->tv_claim_weight_data_select_user:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lo/fcr$d;->e:Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/huawei/ui/main/R$id;->rb_claim_weight_data_select_user:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, v5, Lo/fcr$d;->b:Landroid/widget/RadioButton;

    .line 62
    invoke-virtual {p2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fcr$d;

    .line 67
    :goto_0
    iget v0, p0, Lo/fcr;->b:I

    if-ne v0, p1, :cond_1

    .line 68
    iget-object v0, p0, Lo/fcr;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_current_user:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/fcr;->d:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/acu;

    invoke-virtual {v3}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 69
    iget-object v0, v5, Lo/fcr$d;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    iget-object v0, v5, Lo/fcr$d;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcr;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acu;

    invoke-virtual {v1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    :goto_1
    iget-object v0, v5, Lo/fcr$d;->b:Landroid/widget/RadioButton;

    new-instance v1, Lo/fcr$2;

    invoke-direct {v1, p0, p1}, Lo/fcr$2;-><init>(Lo/fcr;I)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    iget v0, p0, Lo/fcr;->c:I

    if-ne p1, v0, :cond_2

    .line 86
    iget-object v0, v5, Lo/fcr$d;->b:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_2

    .line 88
    :cond_2
    iget-object v0, v5, Lo/fcr$d;->b:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 91
    :goto_2
    return-object p2
.end method
