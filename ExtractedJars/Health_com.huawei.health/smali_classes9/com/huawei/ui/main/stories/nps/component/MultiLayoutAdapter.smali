.class public Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;,
        Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;,
        Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "NpsUserShowController"


# instance fields
.field private commentString:Ljava/lang/String;

.field private inflater:Landroid/view/LayoutInflater;

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;>;"
        }
    .end annotation
.end field

.field private listener:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;

.field private mContext:Landroid/content/Context;

.field private mDialogScore:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;>;Landroid/content/Context;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->commentString:Ljava/lang/String;

    .line 46
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->list:Ljava/util/List;

    .line 47
    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mContext:Landroid/content/Context;

    .line 48
    iput-object p3, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->listener:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;

    .line 49
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->commentString:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->commentString:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Landroid/content/Context;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->showScorePickerDialog(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Landroid/app/Dialog;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mDialogScore:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->listener:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;

    return-object v0
.end method

.method private initializeScoreDialogLayout(Landroid/view/View;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)Z
    .locals 6

    .line 186
    const-string v0, "NpsUserShowController"

    const-string v1, "initializeScoreDialogLayout()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 189
    const/4 v0, 0x0

    return v0

    .line 192
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->nps_score_lv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ListView;

    .line 193
    const/4 v3, -0x1

    .line 194
    iget-object v0, p2, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;->score:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    .line 195
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 196
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 197
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;

    invoke-direct {v1, p0, v2, v4}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;-><init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Landroid/widget/ListView;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 205
    :cond_1
    new-instance v5, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0, v3}, Lcom/huawei/ui/main/stories/nps/component/ScoreLayoutAdapter;-><init>(Landroid/content/Context;I)V

    .line 206
    invoke-virtual {v2, v5}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 207
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;

    invoke-direct {v0, p0, p2, p3}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;-><init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)V

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 217
    const/4 v0, 0x1

    return v0
.end method

.method private showScorePickerDialog(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)V
    .locals 6

    .line 163
    const-string v0, "NpsUserShowController"

    const-string v1, "showScorePickerDialog()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mContext:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_score_view:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 166
    new-instance v5, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->nps_user_survey_input_score:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 168
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$3;-><init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)V

    .line 169
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 173
    invoke-virtual {v5}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mDialogScore:Landroid/app/Dialog;

    .line 174
    invoke-direct {p0, v4, p1, p2}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->initializeScoreDialogLayout(Landroid/view/View;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    const-string v0, "NpsUserShowController"

    const-string v1, "showScorePickerDialog() dialog layout fail"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mDialogScore:Landroid/app/Dialog;

    .line 178
    return-void

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mDialogScore:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 182
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 63
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "option"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    const/4 v0, 0x0

    return v0

    .line 224
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public getTheScoreComment()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->commentString:Ljava/lang/String;

    return-object v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 79
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->getItemViewType(I)I

    move-result v5

    .line 80
    if-nez p2, :cond_0

    .line 81
    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    .line 83
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->inflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->adapter_item_choose:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 86
    new-instance v3, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;

    invoke-direct {v3}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;-><init>()V

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->scoreLayout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;->scoreLayout:Landroid/widget/RelativeLayout;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->score:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;->score:Landroid/widget/TextView;

    .line 89
    sget v0, Lcom/huawei/ui/main/R$id;->nps_item_choose_tv:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;->tvTitle:Landroid/widget/TextView;

    .line 90
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 91
    goto/16 :goto_1

    .line 93
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->inflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->adapter_item_text:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 95
    sget v0, Lcom/huawei/ui/main/R$id;->nps_item_text_tv:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 96
    sget v0, Lcom/huawei/ui/main/R$id;->nps_item_text_et:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/EditText;

    .line 97
    new-instance v4, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;

    invoke-direct {v4}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;-><init>()V

    .line 98
    iput-object v6, v4, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;->tvTitle:Landroid/widget/TextView;

    .line 99
    iput-object v7, v4, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;->et:Landroid/widget/EditText;

    .line 100
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$1;-><init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)V

    invoke-virtual {v7, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 119
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    goto :goto_1

    .line 122
    :goto_0
    goto :goto_1

    .line 127
    :cond_0
    sparse-switch v5, :sswitch_data_1

    goto :goto_1

    .line 129
    :sswitch_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;

    .line 131
    goto :goto_1

    .line 133
    :sswitch_3
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;

    .line 134
    .line 139
    :goto_1
    sparse-switch v5, :sswitch_data_2

    goto/16 :goto_2

    .line 141
    :sswitch_4
    iget-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;->tvTitle:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->list:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;

    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    move-object v6, v3

    .line 143
    move v7, p1

    .line 144
    iget-object v0, v3, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;->scoreLayout:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;

    invoke-direct {v1, p0, v6, v7}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;-><init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    goto :goto_2

    .line 152
    :sswitch_5
    iget-object v0, v4, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;->tvTitle:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->list:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;

    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    .line 158
    :goto_2
    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x0 -> :sswitch_4
        0x1 -> :sswitch_5
    .end sparse-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 229
    const/4 v0, 0x2

    return v0
.end method
