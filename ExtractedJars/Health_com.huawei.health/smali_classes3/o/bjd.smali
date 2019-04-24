.class public Lo/bjd;
.super Lo/bna;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bjd$a;
    }
.end annotation


# instance fields
.field protected a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field protected c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field protected d:Z

.field protected e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;Z)V"
        }
    .end annotation

    .line 62
    invoke-direct {p0, p1, p2, p3}, Lo/bna;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bjd;->d:Z

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bjd;->e:Z

    .line 63
    return-void
.end method

.method private a(Lo/bjd$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V
    .locals 3

    .line 310
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 312
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 314
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 317
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 321
    :cond_0
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 325
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMatchType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 327
    invoke-virtual {p3}, Lo/bla;->d()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 328
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    goto :goto_1

    .line 332
    :cond_1
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 337
    :cond_2
    iget-object v0, p1, Lo/bjd$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 338
    iget-object v0, p1, Lo/bjd$a;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 340
    :goto_1
    return-void
.end method

.method private a(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V
    .locals 4

    .line 145
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p1, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    iget-object v1, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p1, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 154
    :goto_0
    iget-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 156
    iget-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p1, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 159
    iget-object v0, p1, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_1

    .line 163
    :cond_1
    iget-object v0, p1, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 166
    :cond_2
    :goto_1
    return-void
.end method

.method private d(Lo/bjd$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V
    .locals 3

    .line 351
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 353
    invoke-virtual {p3}, Lo/bla;->c()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 354
    iget-object v0, p1, Lo/bjd$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 355
    goto :goto_0

    .line 359
    :cond_0
    iget-object v0, p1, Lo/bjd$a;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    :goto_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 192
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 194
    const/4 v0, 0x0

    return v0

    .line 196
    :cond_0
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public b(Z)V
    .locals 0

    .line 276
    iput-boolean p1, p0, Lo/bjd;->d:Z

    .line 277
    return-void
.end method

.method public c(JZ)V
    .locals 2

    .line 253
    if-eqz p3, :cond_0

    .line 255
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 257
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 262
    :cond_0
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 267
    :cond_1
    :goto_0
    return-void
.end method

.method public d()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 228
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 230
    iget-object v0, p0, Lo/bjd;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Long;

    .line 233
    iget-object v0, p0, Lo/bjd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/user/User;

    .line 235
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 237
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    goto :goto_2

    .line 240
    :cond_0
    goto :goto_1

    .line 241
    :cond_1
    :goto_2
    goto :goto_0

    .line 242
    :cond_2
    return-object v4
.end method

.method protected d(Lo/bjd$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V
    .locals 2

    .line 296
    new-instance v1, Lo/bla;

    iget-object v0, p0, Lo/bjd;->i:Landroid/content/Context;

    invoke-direct {v1, v0, p2}, Lo/bla;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 297
    invoke-direct {p0, p1, p2, v1}, Lo/bjd;->d(Lo/bjd$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V

    .line 298
    invoke-direct {p0, p1, p2, v1}, Lo/bjd;->a(Lo/bjd$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V

    .line 299
    return-void
.end method

.method protected d(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 135
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 285
    iput-boolean p1, p0, Lo/bjd;->e:Z

    .line 286
    return-void
.end method

.method public e([J)V
    .locals 7

    .line 206
    iget-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 208
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    .line 210
    :cond_0
    iget-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 212
    if-eqz p1, :cond_1

    .line 214
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-wide v5, v2, v4

    .line 216
    iget-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 219
    :cond_1
    return-void
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 68
    invoke-virtual {p0}, Lo/bjd;->getCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 70
    return-object p2

    .line 74
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 76
    iget-object v0, p0, Lo/bjd;->i:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_friendselector_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 77
    new-instance v6, Lo/bjd$a;

    invoke-direct {v6}, Lo/bjd$a;-><init>()V

    .line 78
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lo/bjd$a;->d:Landroid/widget/ImageView;

    .line 79
    sget v0, Lcom/huawei/android/sns/R$id;->txt_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lo/bjd$a;->b:Landroid/widget/TextView;

    .line 80
    sget v0, Lcom/huawei/android/sns/R$id;->txt_extra:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lo/bjd$a;->c:Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/android/sns/R$id;->subtip_textview:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lo/bjd$a;->a:Landroid/widget/TextView;

    .line 82
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v6, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    .line 83
    iget-object v0, v6, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 84
    sget v0, Lcom/huawei/android/sns/R$id;->bottom_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v6, Lo/bjd$a;->i:Landroid/view/View;

    .line 85
    iget-boolean v0, p0, Lo/bjd;->e:Z

    if-eqz v0, :cond_1

    .line 87
    iget-object v0, v6, Lo/bjd$a;->i:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 88
    iget-object v0, p0, Lo/bjd;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_listview_margin_left_right:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, v7, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 89
    iget-object v0, v6, Lo/bjd$a;->i:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    :cond_1
    invoke-virtual {p2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 95
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/bjd$a;

    .line 98
    :goto_0
    invoke-virtual {p0, p1}, Lo/bjd;->b(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 100
    if-eqz v7, :cond_4

    .line 102
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, v6, Lo/bjd$a;->d:Landroid/widget/ImageView;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 103
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 102
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-virtual {p0, v6, v7}, Lo/bjd;->d(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V

    .line 107
    iget-boolean v0, p0, Lo/bjd;->d:Z

    if-nez v0, :cond_3

    .line 109
    invoke-direct {p0, v6, v7}, Lo/bjd;->a(Lo/bjd$a;Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_1

    .line 113
    :cond_3
    iget-object v0, v6, Lo/bjd$a;->e:Landroid/widget/CheckBox;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto :goto_1

    .line 118
    :cond_4
    const-string v0, "SelectorAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is null."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    :goto_1
    return-object p2
.end method

.method public isEnabled(I)Z
    .locals 4

    .line 171
    invoke-virtual {p0, p1}, Lo/bjd;->b(I)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 172
    if-eqz v3, :cond_0

    .line 174
    iget-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Lo/bjd;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    const/4 v0, 0x0

    return v0

    .line 182
    :cond_0
    invoke-super {p0, p1}, Lo/bna;->isEnabled(I)Z

    move-result v0

    return v0
.end method
