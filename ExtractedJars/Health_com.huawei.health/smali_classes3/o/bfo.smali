.class public Lo/bfo;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bfo$b;
    }
.end annotation


# instance fields
.field private b:Lo/bfo$b;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    iput-object p1, p0, Lo/bfo;->d:Landroid/content/Context;

    .line 35
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;>;)V"
        }
    .end annotation

    .line 39
    iput-object p1, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    .line 40
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 45
    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 51
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2

    .line 58
    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x14

    if-gt v0, v1, :cond_0

    .line 60
    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 64
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 71
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 77
    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 79
    :cond_0
    return-object p2

    .line 82
    :cond_1
    if-nez p2, :cond_2

    .line 84
    iget-object v0, p0, Lo/bfo;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_item_complain_category:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object p2, v0

    check-cast p2, Landroid/widget/LinearLayout;

    .line 86
    new-instance v0, Lo/bfo$b;

    invoke-direct {v0}, Lo/bfo$b;-><init>()V

    iput-object v0, p0, Lo/bfo;->b:Lo/bfo$b;

    .line 87
    iget-object v0, p0, Lo/bfo;->b:Lo/bfo$b;

    sget v1, Lcom/huawei/android/sns/R$id;->text_complain_category_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lo/bfo$b;->c:Landroid/widget/TextView;

    .line 88
    iget-object v0, p0, Lo/bfo;->b:Lo/bfo$b;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfo$b;

    iput-object v0, p0, Lo/bfo;->b:Lo/bfo$b;

    .line 94
    :goto_0
    iget-object v0, p0, Lo/bfo;->b:Lo/bfo$b;

    iget-object v0, v0, Lo/bfo$b;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bfo;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;

    invoke-virtual {v1}, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    return-object p2
.end method
