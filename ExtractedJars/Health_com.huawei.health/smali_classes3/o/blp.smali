.class public Lo/blp;
.super Lo/blk;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/RelativeLayout;

.field private h:Landroid/view/View;

.field private k:Landroid/widget/LinearLayout;

.field private m:Lo/egd;

.field private o:Lcom/huawei/health/sns/model/user/UserNotify$b;

.field private p:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V
    .locals 1

    .line 82
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lo/blk;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0}, Lo/blp;->f()V

    .line 84
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .line 220
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 223
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_notify_sensitive_tip_node:I

    iget-object v1, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 224
    sget v0, Lcom/huawei/android/sns/R$id;->sensitive_tip_textview:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 225
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    iget-object v0, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 228
    :cond_0
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;
    .locals 6

    .line 240
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 241
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 242
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_black_50_percent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v5, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 243
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-virtual {v4, v5, v1, v0, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 244
    return-object v4
.end method

.method private f()V
    .locals 5

    .line 89
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->notify_relative_layout_divider:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/blp;->h:Landroid/view/View;

    .line 90
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->notify_relative_layout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/blp;->f:Landroid/widget/RelativeLayout;

    .line 92
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->replay_layout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    .line 94
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->notify_replay_button:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/blp;->m:Lo/egd;

    .line 95
    iget-object v0, p0, Lo/blp;->m:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lo/blp;->m:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 100
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_button_width_emui_five:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 101
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_button_height_emui_five:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 102
    iget-object v0, p0, Lo/blp;->m:Lo/egd;

    invoke-virtual {v0, v4}, Lo/egd;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    iget-object v0, p0, Lo/blp;->m:Lo/egd;

    iget-object v1, p0, Lo/blp;->e:Landroid/app/Activity;

    iget-object v2, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$dimen;->sns_button_text_size_dp:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-static {v1, v2}, Lo/boi;->a(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/egd;->setTextSize(F)V

    .line 104
    iget-object v0, p0, Lo/blp;->m:Lo/egd;

    iget-object v1, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_contact_btn_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 106
    :cond_0
    return-void
.end method

.method private h()V
    .locals 1

    .line 292
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-static {v0, p0}, Lo/awm;->b(Landroid/content/Context;Lo/awm$c;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/blp;->i:Landroid/app/AlertDialog;

    .line 293
    return-void
.end method

.method private i()V
    .locals 8

    .line 300
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_button_reply:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 301
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    move-object v1, v7

    const-string v2, ""

    const-string v3, ""

    sget v4, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v5, Lcom/huawei/android/sns/R$string;->sns_button_send:I

    new-instance v6, Lo/blp$3;

    invoke-direct {v6, p0}, Lo/blp$3;-><init>(Lo/blp;)V

    invoke-static/range {v0 .. v6}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILo/boj$e;)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/blp;->i:Landroid/app/AlertDialog;

    .line 323
    return-void
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 39
    invoke-super {p0}, Lo/blk;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 39
    invoke-super {p0, p1}, Lo/blk;->a(I)V

    return-void
.end method

.method public bridge synthetic a(JI)V
    .locals 0

    .line 39
    invoke-super {p0, p1, p2, p3}, Lo/blk;->a(JI)V

    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 111
    invoke-super {p0, p1}, Lo/blk;->a(Lcom/huawei/health/sns/model/user/User;)V

    .line 112
    return-void
.end method

.method public bridge synthetic a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-super {p0, p1, p2}, Lo/blk;->a(Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 254
    iput-boolean p1, p0, Lo/blp;->g:Z

    .line 255
    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 256
    :goto_0
    iget-object v0, p0, Lo/blp;->h:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 258
    iget-object v0, p0, Lo/blp;->h:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 260
    :cond_1
    iget-object v0, p0, Lo/blp;->f:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 262
    iget-object v0, p0, Lo/blp;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 264
    :cond_2
    return-void
.end method

.method public bridge synthetic b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;
    .locals 1

    .line 39
    invoke-super {p0, p1, p2}, Lo/blk;->b(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()V
    .locals 0

    .line 39
    invoke-super {p0}, Lo/blk;->b()V

    return-void
.end method

.method public bridge synthetic b(Lo/aws;)V
    .locals 0

    .line 39
    invoke-super {p0, p1}, Lo/blk;->b(Lo/aws;)V

    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 39
    invoke-super {p0}, Lo/blk;->c()V

    return-void
.end method

.method public bridge synthetic c(I)V
    .locals 0

    .line 39
    invoke-super {p0, p1}, Lo/blk;->c(I)V

    return-void
.end method

.method public bridge synthetic c(ILjava/lang/String;)V
    .locals 0

    .line 39
    invoke-super {p0, p1, p2}, Lo/blk;->c(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 1

    .line 39
    invoke-super {p0, p1, p2}, Lo/blk;->d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()V
    .locals 0

    .line 39
    invoke-super {p0}, Lo/blk;->e()V

    return-void
.end method

.method public e(I)V
    .locals 0

    .line 121
    iput p1, p0, Lo/blp;->p:I

    .line 122
    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 39
    invoke-super {p0, p1}, Lo/blk;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/user/UserNotify$b;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/blp;->o:Lcom/huawei/health/sns/model/user/UserNotify$b;

    .line 142
    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/server/user/AddFriendRequest;ILjava/lang/String;)V
    .locals 0

    .line 39
    invoke-super {p0, p1, p2, p3}, Lo/blk;->e(Lcom/huawei/health/sns/server/user/AddFriendRequest;ILjava/lang/String;)V

    return-void
.end method

.method public e(Ljava/util/List;Ljava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 160
    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 162
    const-string v0, "DetailNotifyView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "shownNoteList.size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    iget-object v0, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 166
    iget-object v0, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 170
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .line 171
    if-lez v3, :cond_1

    .line 173
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/blp;->a(Z)V

    .line 176
    :cond_1
    add-int/lit8 v4, v3, -0x1

    :goto_0
    if-ltz v4, :cond_4

    .line 178
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    .line 179
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_notify_node_item:I

    iget-object v1, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v5, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 180
    sget v0, Lcom/huawei/android/sns/R$id;->notify_textview:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 182
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    .line 184
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v0

    if-nez v0, :cond_2

    .line 187
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_text_me:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_blank_space:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 192
    :cond_2
    iget-object v0, p0, Lo/blp;->c:Lcom/huawei/health/sns/model/user/User;

    iget-object v1, p0, Lo/blp;->e:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    .line 193
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    iget-object v0, p0, Lo/blp;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_blank_space:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    :goto_1
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getNote()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/blp;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;

    move-result-object v10

    .line 197
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v0, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 201
    iget-object v0, p0, Lo/blp;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 176
    :cond_3
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_0

    .line 204
    :cond_4
    invoke-direct {p0, p2}, Lo/blp;->a(Ljava/lang/String;)V

    .line 205
    goto :goto_2

    .line 208
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/blp;->a(Z)V

    .line 210
    :goto_2
    return-void
.end method

.method public g()I
    .locals 1

    .line 131
    iget v0, p0, Lo/blp;->p:I

    return v0
.end method

.method public k()Lcom/huawei/health/sns/model/user/UserNotify$b;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/blp;->o:Lcom/huawei/health/sns/model/user/UserNotify$b;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 270
    invoke-virtual {p0}, Lo/blp;->k()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_0

    .line 272
    invoke-direct {p0}, Lo/blp;->h()V

    goto :goto_0

    .line 275
    :cond_0
    invoke-virtual {p0}, Lo/blp;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 277
    invoke-direct {p0}, Lo/blp;->i()V

    goto :goto_0

    .line 283
    :cond_1
    invoke-direct {p0}, Lo/blp;->h()V

    .line 285
    :goto_0
    return-void
.end method
