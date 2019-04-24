.class public Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private choiceNum:I

.field private mInflater:Landroid/view/LayoutInflater;

.field private scoreArray:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 22
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 19
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "10"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "9"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "8"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "7"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "6"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "5"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "4"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "3"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "2"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "1"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "0"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->scoreArray:[Ljava/lang/String;

    .line 23
    iput p2, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->choiceNum:I

    .line 24
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 25
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->scoreArray:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->scoreArray:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 39
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 46
    if-nez p2, :cond_0

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->mInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->adapter_item_score:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 49
    new-instance v3, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;-><init>(Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$1;)V

    .line 51
    sget v0, Lcom/huawei/ui/main/R$id;->settings_score_text:I

    .line 52
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;->score:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->settings_score_imgview:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;->scoreImg:Landroid/widget/ImageView;

    .line 54
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;

    .line 59
    :goto_0
    iget-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;->score:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->scoreArray:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->choiceNum:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;->scoreArray:[Ljava/lang/String;

    array-length v1, v1

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_1

    .line 61
    iget-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;->scoreImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 63
    :cond_1
    iget-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter$ViewHolder;->scoreImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 66
    :goto_1
    return-object p2
.end method
