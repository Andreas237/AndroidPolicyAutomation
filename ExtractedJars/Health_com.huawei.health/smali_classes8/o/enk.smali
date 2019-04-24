.class public Lo/enk;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/enk$c;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field b:I

.field c:I

.field d:I

.field f:I

.field g:I

.field h:Ljava/lang/Runnable;

.field i:I

.field k:I

.field l:Landroid/graphics/Paint;

.field m:F

.field n:[I

.field o:I

.field p:I

.field private final q:Ljava/lang/String;

.field private r:I

.field private s:Landroid/widget/LinearLayout;

.field private final t:Ljava/lang/String;

.field private u:Landroid/content/Context;

.field private v:Lo/enk$c;

.field private y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-class v0, Lo/enk;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/enk;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 66
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enk;->q:Ljava/lang/String;

    .line 40
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enk;->t:Ljava/lang/String;

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lo/enk;->d:I

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lo/enk;->b:I

    .line 48
    const/16 v0, 0x32

    iput v0, p0, Lo/enk;->k:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/enk;->i:I

    .line 50
    const/16 v0, 0x8

    iput v0, p0, Lo/enk;->g:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/enk;->m:F

    .line 52
    const/16 v0, 0x18

    iput v0, p0, Lo/enk;->o:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lo/enk;->r:I

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enk;->y:Ljava/util/List;

    .line 67
    invoke-direct {p0, p1}, Lo/enk;->b(Landroid/content/Context;)V

    .line 68
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 71
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enk;->q:Ljava/lang/String;

    .line 40
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enk;->t:Ljava/lang/String;

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lo/enk;->d:I

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lo/enk;->b:I

    .line 48
    const/16 v0, 0x32

    iput v0, p0, Lo/enk;->k:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/enk;->i:I

    .line 50
    const/16 v0, 0x8

    iput v0, p0, Lo/enk;->g:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/enk;->m:F

    .line 52
    const/16 v0, 0x18

    iput v0, p0, Lo/enk;->o:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lo/enk;->r:I

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enk;->y:Ljava/util/List;

    .line 72
    invoke-direct {p0, p1}, Lo/enk;->b(Landroid/content/Context;)V

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 76
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_half_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enk;->q:Ljava/lang/String;

    .line 40
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_start_track_show_distance_marathon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/enk;->t:Ljava/lang/String;

    .line 42
    const/4 v0, 0x1

    iput v0, p0, Lo/enk;->d:I

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lo/enk;->b:I

    .line 48
    const/16 v0, 0x32

    iput v0, p0, Lo/enk;->k:I

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/enk;->i:I

    .line 50
    const/16 v0, 0x8

    iput v0, p0, Lo/enk;->g:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/enk;->m:F

    .line 52
    const/16 v0, 0x18

    iput v0, p0, Lo/enk;->o:I

    .line 61
    const/4 v0, -0x1

    iput v0, p0, Lo/enk;->r:I

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enk;->y:Ljava/util/List;

    .line 77
    invoke-direct {p0, p1}, Lo/enk;->b(Landroid/content/Context;)V

    .line 78
    return-void
.end method

.method private a(I)V
    .locals 9

    .line 233
    iget v0, p0, Lo/enk;->i:I

    div-int v0, p1, v0

    iget v1, p0, Lo/enk;->d:I

    add-int v2, v0, v1

    .line 234
    iget v0, p0, Lo/enk;->i:I

    rem-int v3, p1, v0

    .line 235
    iget v0, p0, Lo/enk;->i:I

    div-int v4, p1, v0

    .line 236
    if-nez v3, :cond_0

    .line 237
    iget v0, p0, Lo/enk;->d:I

    add-int v2, v4, v0

    goto :goto_0

    .line 239
    :cond_0
    iget v0, p0, Lo/enk;->i:I

    div-int/lit8 v0, v0, 0x2

    if-le v3, v0, :cond_1

    .line 240
    iget v0, p0, Lo/enk;->d:I

    add-int/2addr v0, v4

    add-int/lit8 v2, v0, 0x1

    .line 243
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/enk;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v5

    .line 244
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_8

    .line 245
    iget-object v0, p0, Lo/enk;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 246
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 247
    return-void

    .line 249
    :cond_2
    if-ne v2, v6, :cond_3

    .line 250
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 251
    const/4 v0, 0x2

    invoke-direct {p0, v8, v0}, Lo/enk;->d(Landroid/view/View;I)V

    .line 252
    goto :goto_2

    .line 253
    :cond_3
    add-int/lit8 v0, v2, -0x1

    if-ne v6, v0, :cond_4

    .line 254
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 255
    const/4 v0, 0x1

    invoke-direct {p0, v8, v0}, Lo/enk;->d(Landroid/view/View;I)V

    .line 257
    :cond_4
    add-int/lit8 v0, v2, 0x1

    if-ne v6, v0, :cond_5

    .line 258
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 259
    const/4 v0, 0x1

    invoke-direct {p0, v8, v0}, Lo/enk;->d(Landroid/view/View;I)V

    .line 261
    :cond_5
    add-int/lit8 v0, v2, -0x2

    if-ne v6, v0, :cond_6

    .line 262
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 263
    const/4 v0, 0x0

    invoke-direct {p0, v8, v0}, Lo/enk;->d(Landroid/view/View;I)V

    .line 265
    :cond_6
    add-int/lit8 v0, v2, 0x2

    if-ne v6, v0, :cond_7

    .line 266
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 267
    const/4 v0, 0x0

    invoke-direct {p0, v8, v0}, Lo/enk;->d(Landroid/view/View;I)V

    .line 244
    :cond_7
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1

    .line 271
    :cond_8
    return-void
.end method

.method static synthetic a(Lo/enk;)[I
    .locals 1

    .line 32
    invoke-direct {p0}, Lo/enk;->b()[I

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/view/View;)I
    .locals 4

    .line 402
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 403
    const v0, 0x1fffffff

    const/high16 v1, -0x80000000

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 404
    invoke-virtual {p1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 405
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    return v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    .line 145
    iput-object p1, p0, Lo/enk;->u:Landroid/content/Context;

    .line 146
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "init: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lo/enk;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/enk;->setVerticalScrollBarEnabled(Z)V

    .line 148
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/enk;->setFadingEdgeLength(I)V

    .line 149
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/enk;->s:Landroid/widget/LinearLayout;

    .line 150
    iget-object v0, p0, Lo/enk;->s:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 151
    iget-object v0, p0, Lo/enk;->s:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lo/enk;->addView(Landroid/view/View;)V

    .line 152
    new-instance v0, Lo/enk$4;

    invoke-direct {v0, p0}, Lo/enk$4;-><init>(Lo/enk;)V

    iput-object v0, p0, Lo/enk;->h:Ljava/lang/Runnable;

    .line 189
    return-void
.end method

.method private b()[I
    .locals 4

    .line 274
    iget-object v0, p0, Lo/enk;->n:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 275
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lo/enk;->n:[I

    .line 276
    iget-object v0, p0, Lo/enk;->n:[I

    iget v1, p0, Lo/enk;->i:I

    iget v2, p0, Lo/enk;->d:I

    mul-int/2addr v1, v2

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 277
    iget-object v0, p0, Lo/enk;->n:[I

    iget v1, p0, Lo/enk;->i:I

    iget v2, p0, Lo/enk;->d:I

    add-int/lit8 v2, v2, 0x1

    mul-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lo/enk;->g:I

    int-to-float v2, v2

    iget v3, p0, Lo/enk;->m:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    float-to-int v1, v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 279
    :cond_0
    iget-object v0, p0, Lo/enk;->n:[I

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 343
    iget-object v0, p0, Lo/enk;->v:Lo/enk$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 344
    iget-object v0, p0, Lo/enk;->v:Lo/enk$c;

    iget v1, p0, Lo/enk;->b:I

    iget-object v2, p0, Lo/enk;->a:Ljava/util/List;

    iget v3, p0, Lo/enk;->b:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/enk$c;->e(ILjava/lang/String;)V

    .line 347
    :cond_0
    return-void
.end method

.method private d()V
    .locals 4

    .line 197
    iget v0, p0, Lo/enk;->d:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/enk;->c:I

    .line 198
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 199
    iget-object v0, p0, Lo/enk;->s:Landroid/widget/LinearLayout;

    invoke-direct {p0, v3}, Lo/enk;->e(Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 200
    goto :goto_0

    .line 201
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/enk;->a(I)V

    .line 202
    return-void
.end method

.method private d(Landroid/view/View;I)V
    .locals 5

    .line 414
    move-object v2, p1

    check-cast v2, Landroid/widget/TextView;

    .line 415
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    .line 416
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 417
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 419
    :pswitch_0
    const/4 v0, 0x1

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 420
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->home_track_starget_value_color_twe_alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 421
    iget v0, p0, Lo/enk;->o:I

    int-to-float v0, v0

    iget v1, p0, Lo/enk;->m:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 422
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 423
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 424
    goto :goto_0

    .line 426
    :pswitch_1
    const/4 v0, 0x1

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 427
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->home_track_show_text_black_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 428
    iget v0, p0, Lo/enk;->o:I

    int-to-float v0, v0

    iget v1, p0, Lo/enk;->m:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 429
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 430
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 431
    goto :goto_0

    .line 433
    :pswitch_2
    const/4 v0, 0x1

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 434
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->home_track_starget_value_color_whole_alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 435
    iget v0, p0, Lo/enk;->o:I

    iget v1, p0, Lo/enk;->g:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/enk;->m:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 436
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 437
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 438
    .line 442
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic d(Lo/enk;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/enk;->c()V

    return-void
.end method

.method private e(Ljava/lang/String;)Landroid/view/View;
    .locals 8

    .line 205
    iget-object v0, p0, Lo/enk;->u:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 206
    sget v0, Lcom/huawei/ui/commonui/R$layout;->track_dialog_wheel_view_item:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 207
    sget v0, Lcom/huawei/ui/commonui/R$id;->wheelview_item:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 208
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    iget v0, p0, Lo/enk;->i:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 210
    invoke-direct {p0, v5}, Lo/enk;->b(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lo/enk;->i:I

    .line 211
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lo/enk;->m:F

    .line 212
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "itemHeight: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/enk;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    iget-object v0, p0, Lo/enk;->s:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p0, Lo/enk;->i:I

    iget v3, p0, Lo/enk;->c:I

    mul-int/2addr v2, v3

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 214
    invoke-virtual {p0}, Lo/enk;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 215
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v2, p0, Lo/enk;->i:I

    iget v3, p0, Lo/enk;->c:I

    mul-int/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Lo/enk;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 217
    :cond_0
    return-object v5
.end method

.method private getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 192
    invoke-virtual {p0}, Lo/enk;->getScrollY()I

    move-result v0

    iput v0, p0, Lo/enk;->f:I

    .line 193
    iget-object v0, p0, Lo/enk;->h:Ljava/lang/Runnable;

    iget v1, p0, Lo/enk;->k:I

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Lo/enk;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 194
    return-void
.end method

.method public d(I)I
    .locals 3

    .line 128
    const/4 v1, -0x1

    .line 129
    invoke-static {}, Lo/cxh;->a()Z

    move-result v2

    .line 130
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 132
    :sswitch_0
    if-eqz v2, :cond_0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit_en:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_distance_unit:I

    .line 133
    .line 136
    :goto_0
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public fling(I)V
    .locals 1

    .line 374
    div-int/lit8 v0, p1, 0x3

    invoke-super {p0, v0}, Landroid/widget/ScrollView;->fling(I)V

    .line 375
    return-void
.end method

.method public getOnWheelViewListener()Lo/enk$c;
    .locals 1

    .line 388
    iget-object v0, p0, Lo/enk;->v:Lo/enk$c;

    return-object v0
.end method

.method public getSeletedIndex()I
    .locals 2

    .line 368
    iget v0, p0, Lo/enk;->b:I

    iget v1, p0, Lo/enk;->d:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getSeletedItem()F
    .locals 3

    .line 362
    iget-object v0, p0, Lo/enk;->y:Ljava/util/List;

    iget v1, p0, Lo/enk;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 363
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 284
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onDraw(Landroid/graphics/Canvas;)V

    .line 285
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 2

    .line 222
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    const-string v1, "onScrollChanged"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 224
    invoke-direct {p0, p2}, Lo/enk;->a(I)V

    .line 225
    if-le p2, p4, :cond_0

    .line 226
    const/4 v0, 0x1

    iput v0, p0, Lo/enk;->r:I

    goto :goto_0

    .line 228
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/enk;->r:I

    .line 230
    :goto_0
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 3

    .line 332
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    const-string v1, "onSizeChanged"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onSizeChanged(IIII)V

    .line 334
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "w: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", h: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", oldw: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", oldh: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 335
    iput p1, p0, Lo/enk;->p:I

    .line 336
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/enk;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 337
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 379
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    const-string v1, "onTouchEvent"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 380
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 382
    invoke-virtual {p0}, Lo/enk;->a()V

    .line 384
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 290
    iget v0, p0, Lo/enk;->p:I

    if-nez v0, :cond_0

    .line 291
    iget-object v0, p0, Lo/enk;->u:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lo/enk;->p:I

    .line 292
    sget-object v0, Lo/enk;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "viewWidth: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/enk;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    :cond_0
    iget-object v0, p0, Lo/enk;->l:Landroid/graphics/Paint;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 296
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/enk;->l:Landroid/graphics/Paint;

    .line 297
    iget-object v0, p0, Lo/enk;->l:Landroid/graphics/Paint;

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 298
    iget-object v0, p0, Lo/enk;->l:Landroid/graphics/Paint;

    const/16 v1, 0x19

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 299
    iget-object v0, p0, Lo/enk;->l:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 302
    :cond_1
    new-instance p1, Lo/enk$2;

    invoke-direct {p1, p0}, Lo/enk$2;-><init>(Lo/enk;)V

    .line 326
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 328
    return-void
.end method

.method public setItems(Ljava/util/List;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 85
    iput-object p1, p0, Lo/enk;->y:Ljava/util/List;

    .line 86
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/enk;->a:Ljava/util/List;

    .line 89
    :cond_0
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 90
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    const-string v1, ""

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 93
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 95
    :pswitch_0
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_min:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 96
    goto :goto_1

    .line 98
    :pswitch_1
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 99
    goto :goto_1

    .line 101
    :pswitch_2
    invoke-virtual {p0}, Lo/enk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lo/enk;->d(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 102
    goto :goto_1

    .line 104
    :goto_0
    const-string v3, ""

    .line 108
    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 109
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 110
    iget-object v0, p0, Lo/enk;->q:Ljava/lang/String;

    iget-object v1, p0, Lo/enk;->t:Ljava/lang/String;

    invoke-static {p2, v6, v0, v1}, Lo/elo;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 111
    iget-object v0, p0, Lo/enk;->q:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/enk;->t:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 112
    :cond_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 114
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    :goto_3
    goto :goto_2

    .line 117
    :cond_3
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 118
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    invoke-direct {p0}, Lo/enk;->d()V

    .line 124
    iget-object v0, p0, Lo/enk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lo/enk;->setSeletion(I)V

    .line 126
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setOffset(I)V
    .locals 0

    .line 141
    iput p1, p0, Lo/enk;->d:I

    .line 142
    return-void
.end method

.method public setOnWheelViewListener(Lo/enk$c;)V
    .locals 0

    .line 392
    iput-object p1, p0, Lo/enk;->v:Lo/enk$c;

    .line 393
    return-void
.end method

.method public setSeletion(I)V
    .locals 2

    .line 350
    move v1, p1

    .line 351
    iget v0, p0, Lo/enk;->d:I

    sub-int v0, v1, v0

    iput v0, p0, Lo/enk;->b:I

    .line 352
    new-instance v0, Lo/enk$5;

    invoke-direct {v0, p0}, Lo/enk$5;-><init>(Lo/enk;)V

    invoke-virtual {p0, v0}, Lo/enk;->post(Ljava/lang/Runnable;)Z

    .line 359
    return-void
.end method
