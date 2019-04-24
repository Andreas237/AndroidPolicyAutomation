.class public Lo/bjg;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bjg$c;
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    .line 45
    iput-object p1, p0, Lo/bjg;->c:Landroid/content/Context;

    .line 46
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/Group;>;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    .line 51
    invoke-virtual {p0}, Lo/bjg;->notifyDataSetChanged()V

    .line 52
    return-void
.end method

.method public e(I)Lcom/huawei/health/sns/model/group/Group;
    .locals 2

    .line 67
    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 69
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_1
    if-ltz p1, :cond_2

    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_3

    .line 74
    :cond_2
    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_3
    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 57
    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 59
    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0, p1}, Lo/bjg;->e(I)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 82
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 88
    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 90
    :cond_0
    return-object p2

    .line 93
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 95
    new-instance v3, Lo/bjg$c;

    invoke-direct {v3}, Lo/bjg$c;-><init>()V

    .line 96
    iget-object v0, p0, Lo/bjg;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_group_selector_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 97
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lo/bjg$c;->e:Landroid/widget/ImageView;

    .line 98
    sget v0, Lcom/huawei/android/sns/R$id;->text_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/bjg$c;->d:Landroid/widget/TextView;

    .line 99
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bjg$c;

    .line 106
    :goto_0
    iget-object v0, p0, Lo/bjg;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/Group;

    .line 107
    iget-object v0, v3, Lo/bjg$c;->d:Landroid/widget/TextView;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v0, v3, Lo/bjg$c;->e:Landroid/widget/ImageView;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 111
    return-object p2
.end method
