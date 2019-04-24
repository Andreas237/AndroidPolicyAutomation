.class public Lo/dxw;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dxw$e;,
        Lo/dxw$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dzd;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Landroid/content/Context;

.field private g:Lo/dzj;

.field private k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lo/dzd;>;Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dxw;->b:Ljava/util/ArrayList;

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lo/dxw;->d:I

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxw;->a:Ljava/util/HashMap;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxw;->c:Ljava/util/HashMap;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxw;->k:Ljava/util/HashMap;

    .line 57
    iput-object p1, p0, Lo/dxw;->e:Landroid/content/Context;

    .line 58
    iput-object p2, p0, Lo/dxw;->b:Ljava/util/ArrayList;

    .line 59
    iput-object p3, p0, Lo/dxw;->a:Ljava/util/HashMap;

    .line 60
    iput-object p4, p0, Lo/dxw;->c:Ljava/util/HashMap;

    .line 61
    iput-object p5, p0, Lo/dxw;->k:Ljava/util/HashMap;

    .line 62
    return-void
.end method


# virtual methods
.method public b(Lo/dzj;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/dxw;->g:Lo/dzj;

    .line 91
    return-void
.end method

.method public e(Ljava/util/ArrayList;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/dzd;>;I)V"
        }
    .end annotation

    .line 65
    iput-object p1, p0, Lo/dxw;->b:Ljava/util/ArrayList;

    .line 66
    add-int/lit8 v0, p2, -0x1

    iput v0, p0, Lo/dxw;->d:I

    .line 67
    invoke-virtual {p0}, Lo/dxw;->notifyDataSetChanged()V

    .line 68
    return-void
.end method

.method public e(Lo/dxw$b;Lo/dzj;)V
    .locals 16

    .line 164
    if-eqz p2, :cond_2

    invoke-static/range {p1 .. p1}, Lo/dxw$b;->b(Lo/dxw$b;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 165
    invoke-virtual/range {p2 .. p2}, Lo/dzj;->d()I

    move-result v6

    .line 166
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->c(Lo/dxw$b;)Landroid/widget/ImageView;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dxw;->a:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 167
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_value_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 168
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->a(Lo/dxw$b;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    add-int/lit8 v0, v6, 0x1

    const/16 v1, 0x14

    if-gt v0, v1, :cond_0

    .line 170
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->e(Lo/dxw$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 171
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->d(Lo/dxw$b;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lo/dzj;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 172
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->d(Lo/dxw$b;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lo/dzj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dxw;->k:Ljava/util/HashMap;

    add-int/lit8 v2, v6, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 174
    invoke-virtual/range {p2 .. p2}, Lo/dzj;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual/range {p2 .. p2}, Lo/dzj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 175
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    .line 176
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_level_rule_gap:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v10, v2, v3

    const/4 v3, 0x1

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v9, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 177
    new-instance v12, Landroid/text/SpannableString;

    invoke-direct {v12, v11}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 178
    invoke-virtual {v11, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    .line 179
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v14

    .line 180
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    sub-int v15, v0, v1

    .line 181
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const-string v1, "#ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int v1, v13, v14

    const/16 v2, 0x22

    invoke-virtual {v12, v0, v13, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 182
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    add-int v1, v13, v14

    const/16 v2, 0x22

    invoke-virtual {v12, v0, v13, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 183
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const-string v1, "#ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v12}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/16 v2, 0x11

    invoke-virtual {v12, v0, v15, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 184
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v12}, Landroid/text/SpannableString;->length()I

    move-result v1

    const/16 v2, 0x11

    invoke-virtual {v12, v0, v15, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 185
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->e(Lo/dxw$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    goto/16 :goto_0

    .line 187
    :cond_0
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->e(Lo/dxw$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 188
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->d(Lo/dxw$b;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 189
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->d(Lo/dxw$b;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 190
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_msg_tip_l1_pre:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dxw;->k:Ljava/util/HashMap;

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 192
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v9, v0, v1

    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 193
    new-instance v11, Landroid/text/SpannableString;

    invoke-direct {v11, v10}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 194
    invoke-virtual {v10, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v12

    .line 195
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v13

    .line 196
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const-string v1, "#ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    add-int v1, v12, v13

    const/16 v2, 0x22

    invoke-virtual {v11, v0, v12, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 197
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    add-int v1, v12, v13

    const/16 v2, 0x22

    invoke-virtual {v11, v0, v12, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 198
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->e(Lo/dxw$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_rule_number:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 201
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_rule_number_less_than:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 202
    invoke-virtual/range {p2 .. p2}, Lo/dzj;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 203
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->g(Lo/dxw$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 205
    :cond_1
    invoke-static/range {p1 .. p1}, Lo/dxw$b;->g(Lo/dxw$b;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lo/dzj;->b()I

    move-result v2

    int-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    :cond_2
    :goto_1
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 72
    iget-object v0, p0, Lo/dxw;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2

    .line 77
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 78
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 80
    :cond_0
    iget-object v0, p0, Lo/dxw;->b:Ljava/util/ArrayList;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 86
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 213
    if-nez p1, :cond_0

    .line 214
    const/4 v0, 0x0

    return v0

    .line 216
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 14

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 99
    invoke-virtual {p0, p1}, Lo/dxw;->getItemViewType(I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    .line 101
    :sswitch_0
    new-instance v6, Lo/dxw$b;

    invoke-direct {v6}, Lo/dxw$b;-><init>()V

    .line 102
    if-nez p2, :cond_0

    .line 103
    iget-object v0, p0, Lo/dxw;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_level_layout_header:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 104
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_header:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v6, v0}, Lo/dxw$b;->d(Lo/dxw$b;Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    .line 105
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_image:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v6, v0}, Lo/dxw$b;->e(Lo/dxw$b;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 106
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_text:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v6, v0}, Lo/dxw$b;->a(Lo/dxw$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 107
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_progress:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-static {v6, v0}, Lo/dxw$b;->a(Lo/dxw$b;Landroid/widget/ProgressBar;)Landroid/widget/ProgressBar;

    .line 108
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_des:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v6, v0}, Lo/dxw$b;->d(Lo/dxw$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 109
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_person_count:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v6, v0}, Lo/dxw$b;->c(Lo/dxw$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 111
    move-object/from16 v0, p2

    invoke-virtual {v0, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dxw$b;

    .line 115
    :goto_0
    const-string v0, "AchieveLevelAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "position = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    iget v0, p0, Lo/dxw;->d:I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lo/dzt;->d(I)I

    move-result v0

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 117
    iget-object v0, p0, Lo/dxw;->g:Lo/dzj;

    invoke-virtual {p0, v6, v0}, Lo/dxw;->e(Lo/dxw$b;Lo/dzj;)V

    .line 118
    goto/16 :goto_3

    .line 120
    :sswitch_1
    const-string v0, "AchieveLevelAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "position = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    new-instance v7, Lo/dxw$e;

    invoke-direct {v7}, Lo/dxw$e;-><init>()V

    .line 122
    if-nez p2, :cond_1

    .line 123
    iget-object v0, p0, Lo/dxw;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_level_listview_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 124
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_listview_iv:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v7, v0}, Lo/dxw$e;->a(Lo/dxw$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 125
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_listview_tv:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v7, v0}, Lo/dxw$e;->e(Lo/dxw$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 126
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_listview_content_tv:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v7, v0}, Lo/dxw$e;->b(Lo/dxw$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 127
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_listview_person_count:I

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v7, v0}, Lo/dxw$e;->a(Lo/dxw$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 129
    move-object/from16 v0, p2

    invoke-virtual {v0, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_1

    .line 131
    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dxw$e;

    .line 133
    :goto_1
    iget-object v0, p0, Lo/dxw;->b:Ljava/util/ArrayList;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/dzd;

    .line 134
    if-eqz v8, :cond_4

    .line 135
    invoke-virtual {v8}, Lo/dzd;->e()I

    move-result v9

    .line 136
    add-int/lit8 v0, p1, -0x1

    iget v1, p0, Lo/dxw;->d:I

    if-gt v0, v1, :cond_2

    .line 137
    invoke-static {v7}, Lo/dxw$e;->b(Lo/dxw$e;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/dxw;->a:Ljava/util/HashMap;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 139
    :cond_2
    invoke-static {v7}, Lo/dxw$e;->b(Lo/dxw$e;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/dxw;->c:Ljava/util/HashMap;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 141
    :goto_2
    iget-object v0, p0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_value_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 142
    invoke-static {v7}, Lo/dxw$e;->a(Lo/dxw$e;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v8}, Lo/dzd;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/dzt;->a(Landroid/content/Context;I)Landroid/text/SpannableString;

    move-result-object v11

    .line 144
    invoke-static {v7}, Lo/dxw$e;->d(Lo/dxw$e;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_rule_number:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 146
    iget-object v0, p0, Lo/dxw;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_level_rule_number_less_than:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 147
    invoke-virtual {v8}, Lo/dzd;->d()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 148
    invoke-static {v7}, Lo/dxw$e;->e(Lo/dxw$e;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 150
    :cond_3
    invoke-static {v7}, Lo/dxw$e;->e(Lo/dxw$e;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Lo/dzd;->d()I

    move-result v2

    int-to-double v2, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    .line 157
    :cond_4
    :goto_3
    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 223
    const/4 v0, 0x2

    return v0
.end method
