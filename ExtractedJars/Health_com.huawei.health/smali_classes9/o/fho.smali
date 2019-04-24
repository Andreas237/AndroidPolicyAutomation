.class public Lo/fho;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fhr;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Landroid/os/Handler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/fhr;>;Landroid/os/Handler;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 48
    iput-object p1, p0, Lo/fho;->d:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lo/fho;->a:Ljava/util/List;

    .line 50
    iput-object p3, p0, Lo/fho;->e:Landroid/os/Handler;

    .line 51
    return-void
.end method

.method static synthetic b(Lo/fho;)Ljava/util/List;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/fho;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lo/fho;)Landroid/content/Context;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/fho;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lo/fho;)Landroid/os/Handler;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/fho;->e:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 55
    iget-object v0, p0, Lo/fho;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 4

    .line 60
    iget-object v0, p0, Lo/fho;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-gez p1, :cond_1

    .line 61
    :cond_0
    const-string v0, "UIME_PersonalHonorSettingAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getItem = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const/4 v0, 0x0

    return-object v0

    .line 64
    :cond_1
    iget-object v0, p0, Lo/fho;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 70
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 75
    iget-object v0, p0, Lo/fho;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->activity_personal_honor_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 76
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_cumulative_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_cumulative_description:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 78
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_display:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->personal_honor_set_to_home:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    .line 81
    iget-object v0, p0, Lo/fho;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fhr;

    invoke-virtual {v0}, Lo/fhr;->b()Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v0, p0, Lo/fho;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fhr;

    invoke-virtual {v0}, Lo/fhr;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    new-instance v0, Lo/fho$2;

    invoke-direct {v0, p0}, Lo/fho$2;-><init>(Lo/fho;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    iget-object v0, p0, Lo/fho;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fhr;

    invoke-virtual {v0}, Lo/fhr;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 103
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 105
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 106
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 107
    new-instance v0, Lo/fho$1;

    invoke-direct {v0, p0, p1}, Lo/fho$1;-><init>(Lo/fho;I)V

    invoke-virtual {v6, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    :goto_0
    return-object p2
.end method
