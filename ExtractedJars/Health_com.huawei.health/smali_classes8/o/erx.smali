.class public Lo/erx;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/erx$c;,
        Lo/erx$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/esj;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 36
    invoke-direct {p0, p1}, Lo/erx;->a(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/erx;->c:Landroid/content/Context;

    .line 45
    return-void
.end method

.method private d(Lo/erx$c;Lo/esd;)V
    .locals 4

    .line 187
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 188
    :cond_0
    const-string v0, "SportNounExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "viewholder or data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    return-void

    .line 192
    :cond_1
    invoke-static {p1}, Lo/erx$c;->d(Lo/erx$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/esd;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    invoke-static {p1}, Lo/erx$c;->e(Lo/erx$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lo/esd;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\n"

    const-string v3, "\n"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    return-void
.end method


# virtual methods
.method public e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/esj;>;)V"
        }
    .end annotation

    .line 53
    const-string v0, "SportNounExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resetGroupData  mGroupData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/erx;->a:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 58
    :cond_0
    iput-object p1, p0, Lo/erx;->a:Ljava/util/List;

    .line 61
    return-void
.end method

.method public getChild(II)Ljava/lang/Object;
    .locals 1

    .line 90
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/esj;

    invoke-virtual {v0, p2}, Lo/esj;->c(I)Lo/esd;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .line 100
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 147
    if-nez p4, :cond_0

    .line 148
    new-instance v4, Lo/erx$c;

    invoke-direct {v4}, Lo/erx$c;-><init>()V

    .line 149
    iget-object v0, p0, Lo/erx;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->layout_sport_noun_child_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 154
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_show_sport_noun_child_text_title:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lo/erx$c;->c(Lo/erx$c;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 155
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_show_sport_noun_child_text_content:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lo/erx$c;->e(Lo/erx$c;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 157
    invoke-virtual {p4, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 159
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/erx$c;

    .line 162
    :goto_0
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/esj;

    invoke-virtual {v0, p2}, Lo/esj;->c(I)Lo/esd;

    move-result-object v5

    .line 163
    if-nez v5, :cond_1

    .line 164
    const-string v0, "SportNounExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "child is null\'"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-object p4

    .line 167
    :cond_1
    invoke-direct {p0, v4, v5}, Lo/erx;->d(Lo/erx$c;Lo/esd;)V

    .line 176
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 1

    .line 73
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p1, :cond_1

    .line 74
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 76
    :cond_1
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/esj;

    invoke-virtual {v0}, Lo/esj;->d()I

    move-result v0

    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 1

    .line 81
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 82
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 84
    :cond_1
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .line 65
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 66
    const/4 v0, 0x0

    return v0

    .line 68
    :cond_0
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .line 95
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 111
    if-nez p3, :cond_0

    .line 112
    new-instance v4, Lo/erx$a;

    invoke-direct {v4}, Lo/erx$a;-><init>()V

    .line 113
    iget-object v0, p0, Lo/erx;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->layout_sport_noun_father_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 115
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_show_health_data_sport_noun_father_date:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v4, v0}, Lo/erx$a;->b(Lo/erx$a;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 116
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_show_health_data_sport_noun_father_arrow:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lo/erx$a;->a(Lo/erx$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 117
    sget v0, Lcom/huawei/ui/homehealth/R$id;->hw_show_health_data_sport_noun_father_line:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lo/erx$a;->b(Lo/erx$a;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 120
    invoke-virtual {p3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/erx$a;

    .line 126
    :goto_0
    iget-object v0, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 127
    const-string v0, "SportNounExpandableListAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    return-object p3

    .line 130
    :cond_1
    if-eqz p2, :cond_2

    .line 131
    invoke-static {v4}, Lo/erx$a;->a(Lo/erx$a;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_drop_down_arrow_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 133
    :cond_2
    invoke-static {v4}, Lo/erx$a;->a(Lo/erx$a;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_drop_down_arrow_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 136
    :goto_1
    invoke-static {v4}, Lo/erx$a;->e(Lo/erx$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/erx;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/esj;

    invoke-virtual {v1}, Lo/esj;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    invoke-virtual {p0}, Lo/erx;->getGroupCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_3

    .line 138
    invoke-static {v4}, Lo/erx$a;->b(Lo/erx$a;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 140
    :cond_3
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 105
    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .line 201
    const/4 v0, 0x1

    return v0
.end method
