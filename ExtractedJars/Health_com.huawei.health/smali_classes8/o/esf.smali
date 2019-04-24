.class public Lo/esf;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/esf$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/esd;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/esd;>;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/esf;->c:Ljava/util/List;

    .line 32
    iput-object p1, p0, Lo/esf;->a:Landroid/content/Context;

    .line 33
    if-eqz p2, :cond_0

    .line 34
    iput-object p2, p0, Lo/esf;->c:Ljava/util/List;

    .line 36
    :cond_0
    return-void
.end method

.method private c(Lo/esf$a;Lo/esd;)V
    .locals 4

    .line 79
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 80
    :cond_0
    const-string v0, "SportNounExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "viewholder or data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return-void

    .line 84
    :cond_1
    invoke-static {p1}, Lo/esf$a;->c(Lo/esf$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/esd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    invoke-static {p1}, Lo/esf$a;->b(Lo/esf$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/esd;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\n"

    const-string v3, "\n"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 40
    iget-object v0, p0, Lo/esf;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/esf;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 50
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 56
    if-nez p2, :cond_0

    .line 57
    new-instance v4, Lo/esf$a;

    invoke-direct {v4}, Lo/esf$a;-><init>()V

    .line 58
    iget-object v0, p0, Lo/esf;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->layout_sport_noun_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 60
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_show_sport_noun_text_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lo/esf$a;->e(Lo/esf$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_show_sport_noun_text_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lo/esf$a;->c(Lo/esf$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 63
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/esf$a;

    .line 68
    :goto_0
    iget-object v0, p0, Lo/esf;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/esd;

    .line 69
    if-nez v5, :cond_1

    .line 70
    const-string v0, "SportNounExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "child is null\'"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    return-object p2

    .line 73
    :cond_1
    invoke-direct {p0, v4, v5}, Lo/esf;->c(Lo/esf$a;Lo/esd;)V

    .line 75
    return-object p2
.end method
