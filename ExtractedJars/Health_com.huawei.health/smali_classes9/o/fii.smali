.class public Lo/fii;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fii$e;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Z

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation
.end field

.field private f:Landroid/widget/TextView;

.field private g:Landroid/support/v7/widget/RecyclerView;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/ImageView;

.field private n:Lo/bym;

.field private o:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 68
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 69
    invoke-direct {p0, p1}, Lo/fii;->d(Landroid/content/Context;)V

    .line 70
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 73
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 74
    invoke-direct {p0, p1}, Lo/fii;->d(Landroid/content/Context;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 78
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 79
    invoke-direct {p0, p1}, Lo/fii;->d(Landroid/content/Context;)V

    .line 80
    return-void
.end method

.method private d()V
    .locals 8

    .line 221
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 222
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    if-eqz v0, :cond_6

    .line 223
    const-string v0, "SocialRecyclerview"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5f00\u59cb\u7b5b\u9009\u6570\u636e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMessageExtList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->e:Ljava/util/List;

    .line 225
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 227
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    goto/16 :goto_2

    .line 228
    :cond_0
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    if-eqz v0, :cond_6

    .line 230
    const-string v0, "SocialRecyclerview"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u53bb\u9664\u65e0\u6548\u6570\u636e\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 232
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 233
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 234
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 235
    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getBeginTime()J

    move-result-wide v0

    cmp-long v0, v0, v5

    if-gtz v0, :cond_1

    invoke-virtual {v7}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getEndTime()J

    move-result-wide v0

    cmp-long v0, v0, v5

    if-gez v0, :cond_2

    .line 236
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 238
    :cond_2
    goto :goto_0

    .line 240
    :cond_3
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 241
    const-string v0, "SocialRecyclerview"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6309\u6743\u91cd\u548c\u751f\u6548\u65f6\u95f4\u6392\u5e8f:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    new-instance v1, Lo/fii$e;

    invoke-direct {v1}, Lo/fii$e;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 244
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getLayout()I

    move-result v7

    .line 245
    packed-switch v7, :pswitch_data_0

    goto/16 :goto_1

    .line 247
    :pswitch_0
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_6

    .line 248
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 249
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 250
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    goto/16 :goto_2

    .line 252
    :cond_4
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    goto/16 :goto_2

    .line 257
    :pswitch_1
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_6

    .line 258
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 259
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    goto/16 :goto_2

    .line 263
    :pswitch_2
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_6

    .line 264
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 265
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    goto :goto_2

    .line 269
    :pswitch_3
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_6

    .line 270
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 271
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    goto :goto_2

    .line 275
    :pswitch_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 276
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    .line 277
    goto :goto_2

    .line 279
    :goto_1
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_6

    .line 280
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fii;->d:Z

    .line 281
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 282
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    goto :goto_2

    .line 284
    :cond_5
    iget-object v0, p0, Lo/fii;->e:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/fii;->b:Ljava/util/List;

    .line 292
    :cond_6
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    .line 83
    iput-object p1, p0, Lo/fii;->c:Landroid/content/Context;

    .line 84
    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->recycler_view_social:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_title:I

    invoke-virtual {p0, v0}, Lo/fii;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fii;->f:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_more:I

    invoke-virtual {p0, v0}, Lo/fii;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fii;->i:Landroid/widget/TextView;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_arrow:I

    invoke-virtual {p0, v0}, Lo/fii;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/fii;->k:Landroid/widget/ImageView;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_view:I

    invoke-virtual {p0, v0}, Lo/fii;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    .line 89
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_title_layout:I

    invoke-virtual {p0, v0}, Lo/fii;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/fii;->h:Landroid/widget/RelativeLayout;

    .line 90
    iget-object v0, p0, Lo/fii;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    sget v0, Lcom/huawei/ui/main/R$id;->social_recycler_view_horizontal:I

    invoke-virtual {p0, v0}, Lo/fii;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/fii;->o:Landroid/support/v7/widget/RecyclerView;

    .line 92
    sget v0, Lcom/huawei/ui/main/R$id;->social_scrollView_horizontal:I

    invoke-virtual {p0, v0}, Lo/fii;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bym;

    iput-object v0, p0, Lo/fii;->n:Lo/bym;

    .line 94
    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/fii;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, p0, Lo/fii;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 100
    :goto_0
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 101
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 103
    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 8

    .line 109
    iput-object p1, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 111
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/fii;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 113
    iget-object v0, p0, Lo/fii;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 116
    :cond_0
    invoke-direct {p0}, Lo/fii;->d()V

    .line 117
    iget-boolean v0, p0, Lo/fii;->d:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    if-eqz v0, :cond_4

    .line 118
    iget-object v0, p0, Lo/fii;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    new-instance v5, Lo/fig;

    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/fii;->b:Ljava/util/List;

    iget-object v2, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getLayout()I

    move-result v2

    iget-object v3, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v3

    invoke-direct {v5, v0, v1, v2, v3}, Lo/fig;-><init>(Landroid/content/Context;Ljava/util/List;II)V

    .line 120
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getLayout()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 122
    :pswitch_0
    iget-object v0, p0, Lo/fii;->o:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lo/fii;->c:Landroid/content/Context;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 123
    iget-object v0, p0, Lo/fii;->o:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 124
    iget-object v0, p0, Lo/fii;->n:Lo/bym;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bym;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 126
    goto/16 :goto_2

    .line 130
    :pswitch_1
    const/4 v6, 0x0

    .line 131
    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 132
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getLayout()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 133
    new-instance v6, Lo/fii$2;

    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    const/4 v1, 0x4

    invoke-direct {v6, p0, v0, v1}, Lo/fii$2;-><init>(Lo/fii;Landroid/content/Context;I)V

    goto :goto_0

    .line 144
    :cond_1
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getLayout()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 145
    new-instance v6, Lo/fii$5;

    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    const/4 v1, 0x3

    invoke-direct {v6, p0, v0, v1}, Lo/fii$5;-><init>(Lo/fii;Landroid/content/Context;I)V

    goto :goto_0

    .line 157
    :cond_2
    new-instance v6, Lo/fii$4;

    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {v6, p0, v0, v1}, Lo/fii$4;-><init>(Lo/fii;Landroid/content/Context;I)V

    goto :goto_0

    .line 170
    :cond_3
    new-instance v6, Lo/fii$3;

    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {v6, p0, v0, v1}, Lo/fii$3;-><init>(Lo/fii;Landroid/content/Context;I)V

    .line 182
    :goto_0
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 183
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 184
    iget-object v0, p0, Lo/fii;->n:Lo/bym;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bym;->setVisibility(I)V

    .line 185
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 186
    goto :goto_2

    .line 188
    :pswitch_2
    new-instance v7, Lo/fii$1;

    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    invoke-direct {v7, p0, v0}, Lo/fii$1;-><init>(Lo/fii;Landroid/content/Context;)V

    .line 199
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v7}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 200
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 201
    iget-object v0, p0, Lo/fii;->n:Lo/bym;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bym;->setVisibility(I)V

    .line 202
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 203
    goto :goto_2

    .line 205
    :goto_1
    iget-object v0, p0, Lo/fii;->o:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lo/fii;->c:Landroid/content/Context;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 206
    iget-object v0, p0, Lo/fii;->o:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 207
    iget-object v0, p0, Lo/fii;->n:Lo/bym;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bym;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 212
    :cond_4
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getRecyclerView()Landroid/support/v7/widget/RecyclerView;
    .locals 1

    .line 309
    iget-object v0, p0, Lo/fii;->g:Landroid/support/v7/widget/RecyclerView;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 314
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 315
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 316
    const-string v0, "url"

    iget-object v1, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 317
    iget-object v0, p0, Lo/fii;->c:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 318
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 319
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    const-string v0, "msgId"

    iget-object v1, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    const-string v0, "msgTitle"

    iget-object v1, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    iget-object v0, p0, Lo/fii;->a:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1b

    if-ne v0, v1, :cond_0

    .line 323
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fii;->c:Landroid/content/Context;

    sget-object v2, Lo/dae;->cp:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    goto :goto_0

    .line 325
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fii;->c:Landroid/content/Context;

    sget-object v2, Lo/dae;->cv:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 328
    :cond_1
    :goto_0
    return-void
.end method
