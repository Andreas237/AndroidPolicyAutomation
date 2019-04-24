.class public Lo/euj;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/euj$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/euj$d;>;"
    }
.end annotation


# static fields
.field private static b:J

.field private static c:J


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eus;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:J

.field private i:I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 96
    const-wide/32 v0, 0x36ee80

    sput-wide v0, Lo/euj;->b:J

    .line 97
    const-wide/32 v0, 0xea60

    sput-wide v0, Lo/euj;->c:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lo/euo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/eus;>;Lo/euo;)V"
        }
    .end annotation

    .line 108
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 106
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/euj;->h:J

    .line 109
    iput-object p1, p0, Lo/euj;->d:Landroid/content/Context;

    .line 110
    iput-object p2, p0, Lo/euj;->a:Ljava/util/List;

    .line 111
    invoke-virtual {p3}, Lo/euo;->b()I

    move-result v0

    iput v0, p0, Lo/euj;->e:I

    .line 112
    invoke-virtual {p3}, Lo/euo;->d()I

    move-result v0

    iput v0, p0, Lo/euj;->k:I

    .line 113
    invoke-virtual {p3}, Lo/euo;->c()I

    move-result v0

    iput v0, p0, Lo/euj;->i:I

    .line 114
    invoke-virtual {p3}, Lo/euo;->e()I

    move-result v0

    iput v0, p0, Lo/euj;->f:I

    .line 115
    invoke-virtual {p3}, Lo/euo;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/euj;->g:Ljava/lang/String;

    .line 116
    return-void
.end method

.method static synthetic a(Lo/euj;J)J
    .locals 0

    .line 60
    iput-wide p1, p0, Lo/euj;->h:J

    return-wide p1
.end method

.method static synthetic b(Lo/euj;)Landroid/content/Context;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lo/euj;)J
    .locals 2

    .line 60
    iget-wide v0, p0, Lo/euj;->h:J

    return-wide v0
.end method

.method static synthetic c(Lo/euj;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lo/euj;->e(I)V

    return-void
.end method

.method static synthetic d(Lo/euj;)Ljava/util/List;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    return-object v0
.end method

.method private d(Lo/euj$d;I)V
    .locals 11

    .line 220
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->b()Ljava/lang/String;

    move-result-object v5

    .line 221
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->k()Ljava/lang/String;

    move-result-object v6

    .line 222
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->p()Ljava/lang/String;

    move-result-object v7

    .line 223
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->o()Ljava/lang/String;

    move-result-object v8

    .line 224
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->c()Ljava/lang/String;

    move-result-object v9

    .line 226
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_6

    .line 227
    iget-object v0, p1, Lo/euj$d;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 229
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 230
    iget-object v0, p1, Lo/euj$d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    const-string v0, ""

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 234
    iget-object v0, p1, Lo/euj$d;->i:Landroid/widget/TextView;

    invoke-static {v6}, Lo/fic;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    iget-object v0, p1, Lo/euj$d;->f:Landroid/widget/TextView;

    invoke-static {v7}, Lo/fic;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 238
    iget-object v0, p1, Lo/euj$d;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_people_attended:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 240
    :cond_1
    iget-object v0, p1, Lo/euj$d;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 243
    :goto_0
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OPERATION_ACTIVITY_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/euj;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 244
    invoke-static {v10, v6, v7}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 245
    iget-object v0, p1, Lo/euj$d;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_coming_soon:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    iget-object v0, p1, Lo/euj$d;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_colorAccent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 247
    :cond_2
    invoke-static {v10, v6, v7}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 248
    iget-object v0, p1, Lo/euj$d;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_in_progress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v0, p1, Lo/euj$d;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_colorAccent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 250
    :cond_3
    invoke-static {v10, v6, v7}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_4

    .line 251
    iget-object v0, p1, Lo/euj$d;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_activity_social_is_over:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    iget-object v0, p1, Lo/euj$d;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 254
    :cond_4
    :goto_1
    goto :goto_2

    .line 255
    :cond_5
    invoke-static {p1}, Lo/euj$d;->g(Lo/euj$d;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 258
    :cond_6
    invoke-static {p1}, Lo/euj$d;->g(Lo/euj$d;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 260
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 261
    iget-object v0, p1, Lo/euj$d;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    if-eqz v9, :cond_7

    const-string v0, ""

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 263
    iget-object v0, p1, Lo/euj$d;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 265
    :cond_7
    invoke-static {p1}, Lo/euj$d;->h(Lo/euj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 268
    :cond_8
    iget-object v0, p1, Lo/euj$d;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 269
    invoke-static {p1}, Lo/euj$d;->h(Lo/euj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 274
    :goto_2
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_9

    .line 275
    iget-object v0, p1, Lo/euj$d;->a:Landroid/view/View;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_white_0alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 276
    iget-object v0, p1, Lo/euj$d;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 277
    const/4 v0, 0x1

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/eyh;->b(IF)F

    move-result v0

    float-to-int v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v10, v1, v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 278
    iget-object v0, p1, Lo/euj$d;->a:Landroid/view/View;

    invoke-virtual {v0, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 279
    goto :goto_3

    .line 280
    :cond_9
    iget-object v0, p1, Lo/euj$d;->a:Landroid/view/View;

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 282
    :goto_3
    return-void
.end method

.method private e(I)V
    .locals 5

    .line 289
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 290
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    const-string v0, "pageType"

    iget v1, p0, Lo/euj;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    const-string v0, "moduleType"

    iget v1, p0, Lo/euj;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    const-string v0, "moduleName"

    iget-object v1, p0, Lo/euj;->g:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    const-string v0, "moduleId"

    iget v1, p0, Lo/euj;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    const-string v0, "name"

    iget-object v1, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eus;

    invoke-virtual {v1}, Lo/eus;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    const-string v0, "id"

    iget-object v1, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eus;

    invoke-virtual {v1}, Lo/eus;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/euj;->d:Landroid/content/Context;

    sget-object v2, Lo/dae;->cw:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 298
    return-void
.end method

.method private e(Lo/euj$d;I)V
    .locals 4

    .line 188
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->b()Ljava/lang/String;

    move-result-object v2

    .line 189
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->c()Ljava/lang/String;

    move-result-object v3

    .line 190
    if-eqz v2, :cond_3

    const-string v0, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eus;

    invoke-virtual {v0}, Lo/eus;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 191
    iget v0, p0, Lo/euj;->e:I

    const/4 v1, 0x7

    if-eq v1, v0, :cond_0

    .line 192
    invoke-static {p1}, Lo/euj$d;->a(Lo/euj$d;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 194
    :cond_0
    invoke-static {p1}, Lo/euj$d;->d(Lo/euj$d;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 196
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 197
    iget-object v0, p1, Lo/euj$d;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 200
    :cond_1
    :goto_0
    invoke-static {p1}, Lo/euj$d;->c(Lo/euj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    if-eqz v3, :cond_2

    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 202
    invoke-static {p1}, Lo/euj$d;->h(Lo/euj$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 204
    :cond_2
    invoke-static {p1}, Lo/euj$d;->h(Lo/euj$d;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 207
    :cond_3
    iget v0, p0, Lo/euj;->e:I

    const/4 v1, 0x7

    if-eq v1, v0, :cond_4

    .line 208
    invoke-static {p1}, Lo/euj$d;->a(Lo/euj$d;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 210
    :cond_4
    invoke-static {p1}, Lo/euj$d;->d(Lo/euj$d;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 214
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/euj$d;
    .locals 4

    .line 120
    const/4 v3, 0x0

    .line 122
    const/4 v0, 0x1

    if-lt p2, v0, :cond_2

    const/4 v0, 0x7

    if-gt p2, v0, :cond_2

    .line 123
    iget v0, p0, Lo/euj;->k:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    const/4 v0, 0x6

    if-ne p2, v0, :cond_0

    .line 124
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_configure_act_recycler_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    goto :goto_0

    .line 125
    :cond_0
    const/4 v0, 0x7

    if-ne v0, p2, :cond_1

    .line 126
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_configure_image_text:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    goto :goto_0

    .line 128
    :cond_1
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_configure_image_grid:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 131
    :cond_2
    :goto_0
    new-instance v0, Lo/euj$d;

    iget v1, p0, Lo/euj;->k:I

    invoke-direct {v0, p0, v3, p2, v1}, Lo/euj$d;-><init>(Lo/euj;Landroid/view/View;II)V

    return-object v0
.end method

.method public a(Lo/euj$d;I)V
    .locals 4

    .line 141
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 143
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eus;

    invoke-virtual {v1}, Lo/eus;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lo/euj$d;->b(Lo/euj$d;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lo/euj;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eus;

    invoke-virtual {v1}, Lo/eus;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lo/euj$d;->b(Lo/euj$d;)Landroid/widget/ImageView;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v0, v1, v2, v3}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 151
    :goto_0
    iget v0, p0, Lo/euj;->k:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    iget v0, p0, Lo/euj;->e:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 152
    invoke-direct {p0, p1, p2}, Lo/euj;->d(Lo/euj$d;I)V

    goto :goto_1

    .line 154
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/euj;->e(Lo/euj$d;I)V

    .line 157
    :goto_1
    invoke-static {p1}, Lo/euj$d;->e(Lo/euj$d;)Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lo/euj$2;

    invoke-direct {v1, p0, p2}, Lo/euj$2;-><init>(Lo/euj;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    :cond_2
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 302
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lo/euj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 305
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 136
    iget v0, p0, Lo/euj;->e:I

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 60
    move-object v0, p1

    check-cast v0, Lo/euj$d;

    invoke-virtual {p0, v0, p2}, Lo/euj;->a(Lo/euj$d;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 60
    invoke-virtual {p0, p1, p2}, Lo/euj;->a(Landroid/view/ViewGroup;I)Lo/euj$d;

    move-result-object v0

    return-object v0
.end method
