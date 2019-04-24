.class public Lo/fio;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fio$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/fio$c;>;"
    }
.end annotation


# static fields
.field private static d:J

.field private static e:J


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:I

.field private f:I

.field private h:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 77
    const-wide/32 v0, 0x36ee80

    sput-wide v0, Lo/fio;->d:J

    .line 78
    const-wide/32 v0, 0xea60

    sput-wide v0, Lo/fio;->e:J

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

    iput-wide v0, p0, Lo/fio;->h:J

    .line 87
    iput-object p1, p0, Lo/fio;->b:Landroid/content/Context;

    .line 88
    iput-object p2, p0, Lo/fio;->a:Ljava/util/List;

    .line 89
    iput p3, p0, Lo/fio;->c:I

    .line 90
    iput p4, p0, Lo/fio;->f:I

    .line 91
    return-void
.end method

.method static synthetic a(Lo/fio;I)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Lo/fio;->e(I)V

    return-void
.end method

.method private b(Landroid/content/Context;F)I
    .locals 3

    .line 342
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 343
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic b(Lo/fio;)Landroid/content/Context;
    .locals 1

    .line 43
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    return-object v0
.end method

.method private c(Lo/fio$c;I)V
    .locals 5

    .line 161
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getDescription()Ljava/lang/String;

    move-result-object v4

    .line 162
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    invoke-static {p1}, Lo/fio$c;->d(Lo/fio$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    :cond_0
    invoke-static {p1}, Lo/fio$c;->a(Lo/fio$c;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getBeginTime()J

    move-result-wide v1

    iget-object v3, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v1, v2, v3}, Lo/fji;->c(JLandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p2, v0, :cond_1

    .line 167
    invoke-static {p1}, Lo/fio$c;->b(Lo/fio$c;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 169
    :cond_1
    invoke-static {p1}, Lo/fio$c;->b(Lo/fio$c;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 171
    :goto_0
    if-nez p2, :cond_2

    .line 172
    invoke-static {p1}, Lo/fio$c;->k(Lo/fio$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 174
    :cond_2
    invoke-static {p1}, Lo/fio$c;->k(Lo/fio$c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/fio;Landroid/content/Context;F)I
    .locals 1

    .line 43
    invoke-direct {p0, p1, p2}, Lo/fio;->b(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lo/fio;)J
    .locals 2

    .line 43
    iget-wide v0, p0, Lo/fio;->h:J

    return-wide v0
.end method

.method private d(II)V
    .locals 5

    .line 202
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 203
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 205
    :pswitch_0
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpUrl()Ljava/lang/String;

    move-result-object v3

    .line 206
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 207
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 208
    const-string v0, "url"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 209
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 210
    goto :goto_1

    .line 213
    :pswitch_1
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpUrl()Ljava/lang/String;

    move-result-object v4

    .line 215
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "messageCenterUrl"

    new-instance v2, Lo/fio$2;

    invoke-direct {v2, p0, v4}, Lo/fio$2;-><init>(Lo/fio;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 228
    goto :goto_1

    .line 230
    :pswitch_2
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->a(Landroid/content/Context;)V

    .line 231
    goto :goto_1

    .line 233
    :pswitch_3
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->k(Landroid/content/Context;)V

    .line 234
    goto :goto_1

    .line 236
    :pswitch_4
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 237
    goto :goto_1

    .line 239
    :pswitch_5
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dth;->e(Landroid/content/Context;)V

    .line 240
    goto :goto_1

    .line 243
    :goto_0
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/fio$5;

    invoke-direct {v2, p0}, Lo/fio$5;-><init>(Lo/fio;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 262
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

.method static synthetic d(Lo/fio;II)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lo/fio;->d(II)V

    return-void
.end method

.method static synthetic e(Lo/fio;J)J
    .locals 0

    .line 43
    iput-wide p1, p0, Lo/fio;->h:J

    return-wide p1
.end method

.method private e(I)V
    .locals 5

    .line 269
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 270
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 272
    const-string v0, "title"

    iget-object v1, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    const-string v0, "description"

    iget-object v1, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    iget v0, p0, Lo/fio;->f:I

    const/16 v1, 0x1b

    if-ne v0, v1, :cond_0

    .line 276
    const-string v0, "jumpType"

    iget-object v1, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fio;->b:Landroid/content/Context;

    sget-object v2, Lo/dae;->cr:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    goto :goto_0

    .line 280
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fio;->b:Landroid/content/Context;

    sget-object v2, Lo/dae;->cs:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 283
    :cond_1
    :goto_0
    return-void
.end method

.method private e(Lo/fio$c;I)V
    .locals 2

    .line 184
    if-nez p2, :cond_0

    .line 185
    invoke-static {p1}, Lo/fio$c;->h(Lo/fio$c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 187
    :cond_0
    invoke-static {p1}, Lo/fio$c;->h(Lo/fio$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    :goto_0
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 190
    invoke-static {p1}, Lo/fio$c;->f(Lo/fio$c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 192
    :cond_1
    invoke-static {p1}, Lo/fio$c;->f(Lo/fio$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 194
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 298
    const/4 v4, 0x0

    .line 299
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 300
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 302
    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 304
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 305
    const-string v0, "id"

    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 306
    const-string v0, "version"

    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 307
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

    .line 308
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 310
    const/4 v4, 0x1

    .line 311
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lo/fio$1;

    invoke-direct {v1, p0}, Lo/fio$1;-><init>(Lo/fio;)V

    invoke-virtual {v0, v6, v7, v1}, Lo/brt;->e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V

    .line 335
    :cond_0
    if-nez v4, :cond_1

    .line 337
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 339
    :cond_1
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lo/fio$c;
    .locals 4

    .line 95
    const/4 v3, 0x0

    .line 96
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 98
    :pswitch_0
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

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
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

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
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

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
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_social_image_horizontal:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 113
    :goto_1
    new-instance v0, Lo/fio$c;

    invoke-direct {v0, p0, v3, p2}, Lo/fio$c;-><init>(Lo/fio;Landroid/view/View;I)V

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

.method public d(Lo/fio$c;I)V
    .locals 5

    .line 123
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_4

    .line 126
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lo/fio;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getImgUrlDaxi()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getImgUrlDaxi()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lo/fio$c;->e(Lo/fio$c;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    goto :goto_0

    .line 130
    :cond_0
    iget-object v0, p0, Lo/fio;->b:Landroid/content/Context;

    iget-object v1, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getImgUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lo/fio$c;->e(Lo/fio$c;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 132
    :goto_0
    iget v0, p0, Lo/fio;->c:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 133
    invoke-direct {p0, p1, p2}, Lo/fio;->c(Lo/fio$c;I)V

    goto :goto_1

    .line 134
    :cond_1
    iget v0, p0, Lo/fio;->c:I

    if-eqz v0, :cond_2

    iget v0, p0, Lo/fio;->c:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_2

    iget v0, p0, Lo/fio;->c:I

    if-gez v0, :cond_3

    .line 136
    :cond_2
    invoke-direct {p0, p1, p2}, Lo/fio;->e(Lo/fio$c;I)V

    .line 139
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;->getJumpType()I

    move-result v4

    .line 140
    invoke-static {p1}, Lo/fio$c;->c(Lo/fio$c;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lo/fio$3;

    invoke-direct {v1, p0, v4, p2}, Lo/fio$3;-><init>(Lo/fio;II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    :cond_4
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 288
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lo/fio;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 291
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 118
    iget v0, p0, Lo/fio;->c:I

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 43
    move-object v0, p1

    check-cast v0, Lo/fio$c;

    invoke-virtual {p0, v0, p2}, Lo/fio;->d(Lo/fio$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 43
    invoke-virtual {p0, p1, p2}, Lo/fio;->d(Landroid/view/ViewGroup;I)Lo/fio$c;

    move-result-object v0

    return-object v0
.end method
