.class public Lo/fig;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fig$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/fig$a;>;"
    }
.end annotation


# static fields
.field private static b:J

.field private static d:J


# instance fields
.field private a:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation
.end field

.field private e:I

.field private g:I

.field private i:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 77
    const-wide/32 v0, 0x36ee80

    sput-wide v0, Lo/fig;->b:J

    .line 78
    const-wide/32 v0, 0xea60

    sput-wide v0, Lo/fig;->d:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;II)V"
        }
    .end annotation

    .line 86
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 84
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fig;->i:J

    .line 87
    iput-object p1, p0, Lo/fig;->a:Landroid/content/Context;

    .line 88
    iput-object p2, p0, Lo/fig;->c:Ljava/util/List;

    .line 89
    iput p3, p0, Lo/fig;->e:I

    .line 90
    iput p4, p0, Lo/fig;->g:I

    .line 91
    return-void
.end method

.method private a(Landroid/content/Context;F)I
    .locals 3

    .line 338
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 339
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lo/fig;II)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lo/fig;->c(II)V

    return-void
.end method

.method static synthetic c(Lo/fig;Landroid/content/Context;F)I
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2}, Lo/fig;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/fig;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    return-object v0
.end method

.method private c(II)V
    .locals 5

    .line 198
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 199
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 201
    :pswitch_0
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpUrl()Ljava/lang/String;

    move-result-object v3

    .line 202
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 204
    const-string v0, "url"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 205
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 206
    goto :goto_1

    .line 209
    :pswitch_1
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpUrl()Ljava/lang/String;

    move-result-object v4

    .line 211
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "messageCenterUrl"

    new-instance v2, Lo/fig$4;

    invoke-direct {v2, p0, v4}, Lo/fig$4;-><init>(Lo/fig;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 224
    goto :goto_1

    .line 226
    :pswitch_2
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->a(Landroid/content/Context;)V

    .line 227
    goto :goto_1

    .line 229
    :pswitch_3
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->k(Landroid/content/Context;)V

    .line 230
    goto :goto_1

    .line 232
    :pswitch_4
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 233
    goto :goto_1

    .line 235
    :pswitch_5
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->e(Landroid/content/Context;)V

    .line 236
    goto :goto_1

    .line 239
    :goto_0
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/fig$2;

    invoke-direct {v2, p0}, Lo/fig$2;-><init>(Lo/fig;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 258
    :cond_0
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private c(Lo/fig$a;I)V
    .locals 5

    .line 156
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getDescription()Ljava/lang/String;

    move-result-object v4

    .line 157
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    invoke-static {p1}, Lo/fig$a;->a(Lo/fig$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    :cond_0
    invoke-static {p1}, Lo/fig$a;->c(Lo/fig$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getBeginTime()J

    move-result-wide v1

    iget-object v3, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v1, v2, v3}, Lo/fji;->c(JLandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    invoke-static {p1}, Lo/fig$a;->c(Lo/fig$a;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 162
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p2, v0, :cond_1

    .line 163
    invoke-static {p1}, Lo/fig$a;->d(Lo/fig$a;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 165
    :cond_1
    invoke-static {p1}, Lo/fig$a;->d(Lo/fig$a;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 167
    :goto_0
    if-nez p2, :cond_2

    .line 168
    invoke-static {p1}, Lo/fig$a;->f(Lo/fig$a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 170
    :cond_2
    invoke-static {p1}, Lo/fig$a;->f(Lo/fig$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 172
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/fig;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/fig;->e(I)V

    return-void
.end method

.method static synthetic d(Lo/fig;)J
    .locals 2

    .line 43
    iget-wide v0, p0, Lo/fig;->i:J

    return-wide v0
.end method

.method static synthetic d(Lo/fig;J)J
    .locals 0

    .line 43
    iput-wide p1, p0, Lo/fig;->i:J

    return-wide p1
.end method

.method private d(Lo/fig$a;I)V
    .locals 2

    .line 180
    if-nez p2, :cond_0

    .line 181
    invoke-static {p1}, Lo/fig$a;->k(Lo/fig$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 183
    :cond_0
    invoke-static {p1}, Lo/fig$a;->k(Lo/fig$a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 185
    :goto_0
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 186
    invoke-static {p1}, Lo/fig$a;->g(Lo/fig$a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 188
    :cond_1
    invoke-static {p1}, Lo/fig$a;->g(Lo/fig$a;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 190
    :goto_1
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 265
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 266
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 268
    const-string v0, "title"

    iget-object v1, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    const-string v0, "description"

    iget-object v1, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    iget v0, p0, Lo/fig;->g:I

    const/16 v1, 0x1b

    if-ne v0, v1, :cond_0

    .line 272
    const-string v0, "jumpType"

    iget-object v1, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fig;->a:Landroid/content/Context;

    sget-object v2, Lo/dae;->cr:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    goto :goto_0

    .line 276
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fig;->a:Landroid/content/Context;

    sget-object v2, Lo/dae;->cs:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 279
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/fig$a;
    .locals 4

    .line 95
    const/4 v3, 0x0

    .line 96
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 98
    :pswitch_0
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_social_image_horizontal:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 99
    goto :goto_1

    .line 103
    :pswitch_1
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_social_image_grid:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 104
    goto :goto_1

    .line 106
    :pswitch_2
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_social_image_text_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 107
    goto :goto_1

    .line 109
    :goto_0
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_social_image_horizontal:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 113
    :goto_1
    new-instance v0, Lo/fig$a;

    invoke-direct {v0, p0, v3, p2}, Lo/fig$a;-><init>(Lo/fig;Landroid/view/View;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 294
    const/4 v4, 0x0

    .line 295
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 296
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 300
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 301
    const-string v0, "id"

    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 302
    const-string v0, "version"

    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 303
    const-string v0, "SocialMessageAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "goFitnessPage id= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " version="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 306
    const/4 v4, 0x1

    .line 307
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lo/fig$3;

    invoke-direct {v1, p0}, Lo/fig$3;-><init>(Lo/fig;)V

    invoke-virtual {v0, v6, v7, v1}, Lo/brt;->e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 331
    :cond_0
    if-nez v4, :cond_1

    .line 333
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 335
    :cond_1
    return-void
.end method

.method public e(Lo/fig$a;I)V
    .locals 5

    .line 123
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_3

    .line 126
    iget-object v0, p0, Lo/fig;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getImgUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lo/fig$a;->e(Lo/fig$a;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 127
    iget v0, p0, Lo/fig;->e:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 128
    invoke-direct {p0, p1, p2}, Lo/fig;->c(Lo/fig$a;I)V

    goto :goto_0

    .line 129
    :cond_0
    iget v0, p0, Lo/fig;->e:I

    if-eqz v0, :cond_1

    iget v0, p0, Lo/fig;->e:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_1

    iget v0, p0, Lo/fig;->e:I

    if-gez v0, :cond_2

    .line 131
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/fig;->d(Lo/fig$a;I)V

    .line 134
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpType()I

    move-result v4

    .line 135
    invoke-static {p1}, Lo/fig$a;->b(Lo/fig$a;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lo/fig$1;

    invoke-direct {v1, p0, v4, p2}, Lo/fig$1;-><init>(Lo/fig;II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    :cond_3
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 284
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lo/fig;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 287
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 118
    iget v0, p0, Lo/fig;->e:I

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 43
    move-object v0, p1

    check-cast v0, Lo/fig$a;

    invoke-virtual {p0, v0, p2}, Lo/fig;->e(Lo/fig$a;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 43
    invoke-virtual {p0, p1, p2}, Lo/fig;->a(Landroid/view/ViewGroup;I)Lo/fig$a;

    move-result-object v0

    return-object v0
.end method
