.class public Lo/bgj;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bgj$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field public c:D

.field private d:Landroid/widget/LinearLayout;

.field public e:Landroid/widget/GridView;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private h:I

.field private i:I

.field private k:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 86
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/bgj;->h:I

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/bgj;->i:I

    .line 87
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 91
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/bgj;->h:I

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/bgj;->i:I

    .line 92
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 96
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/bgj;->h:I

    .line 67
    const/4 v0, 0x0

    iput v0, p0, Lo/bgj;->i:I

    .line 97
    return-void
.end method

.method private a()V
    .locals 6

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bgj;->g:Ljava/util/ArrayList;

    .line 140
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 142
    new-instance v3, Landroid/widget/ImageView;

    iget-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 143
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_slide:I

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 144
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    const/16 v0, 0xa

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 147
    const/16 v0, 0xa

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 148
    const/16 v0, 0x8

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 149
    const/16 v0, 0x8

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 150
    iget-object v0, p0, Lo/bgj;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 151
    if-eqz v4, :cond_0

    iget-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v4, v0, :cond_1

    .line 153
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 155
    :cond_1
    const/4 v0, 0x1

    if-ne v4, v0, :cond_2

    .line 157
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_slide_press:I

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 159
    :cond_2
    iget-object v0, p0, Lo/bgj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 161
    :cond_3
    return-void
.end method

.method static synthetic b(Lo/bgj;)Ljava/util/ArrayList;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bgj;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 274
    iget-object v0, p0, Lo/bgj;->k:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lo/bgj$a;

    iget-object v2, p0, Lo/bgj;->a:Ljava/util/List;

    invoke-direct {v1, v2}, Lo/bgj$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 276
    iget-object v0, p0, Lo/bgj;->k:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 277
    const/4 v0, 0x0

    iput v0, p0, Lo/bgj;->h:I

    .line 278
    iget-object v0, p0, Lo/bgj;->k:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lo/bgj$2;

    invoke-direct {v1, p0}, Lo/bgj$2;-><init>(Lo/bgj;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 316
    return-void
.end method

.method static synthetic c(Lo/bgj;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bgj;->k:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 128
    invoke-virtual {p0}, Lo/bgj;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_face_gridview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 130
    sget v0, Lcom/huawei/android/sns/R$id;->panel_grid_view:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lo/bgj;->e:Landroid/widget/GridView;

    .line 131
    return-void
.end method

.method private d()V
    .locals 12

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    .line 170
    new-instance v4, Landroid/view/View;

    iget-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 172
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 173
    iget-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    iget-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$array;->huawei_face_image_name_array:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    int-to-double v0, v0

    iput-wide v0, p0, Lo/bgj;->c:D

    .line 176
    const-wide/high16 v5, 0x4037000000000000L    # 23.0

    .line 177
    iget-wide v0, p0, Lo/bgj;->c:D

    div-double/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v7, v0

    .line 178
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_0

    .line 180
    new-instance v9, Landroid/widget/GridView;

    iget-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    invoke-direct {v9, v0}, Landroid/widget/GridView;-><init>(Landroid/content/Context;)V

    .line 181
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/bgh;->d(I)[Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 182
    new-instance v11, Lo/bgk;

    iget-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    invoke-direct {v11, v0, v10}, Lo/bgk;-><init>(Landroid/content/Context;[Landroid/graphics/drawable/Drawable;)V

    .line 183
    invoke-virtual {v9, v11}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 184
    invoke-virtual {v9, p0}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 185
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 186
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setBackgroundColor(I)V

    .line 187
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setHorizontalSpacing(I)V

    .line 188
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setVerticalSpacing(I)V

    .line 189
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setStretchMode(I)V

    .line 190
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setCacheColorHint(I)V

    .line 191
    iget-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lo/bgj;->b:Landroid/content/Context;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v2, v1, v3}, Landroid/widget/GridView;->setPadding(IIII)V

    .line 192
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 193
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 194
    const/16 v0, 0x11

    invoke-virtual {v9, v0}, Landroid/widget/GridView;->setGravity(I)V

    .line 195
    iget-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 198
    :cond_0
    new-instance v8, Landroid/view/View;

    iget-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    invoke-direct {v8, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 200
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 201
    iget-object v0, p0, Lo/bgj;->a:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    return-void
.end method

.method static synthetic e(Lo/bgj;I)I
    .locals 0

    .line 39
    iput p1, p0, Lo/bgj;->h:I

    return p1
.end method

.method private e()V
    .locals 1

    .line 113
    invoke-direct {p0}, Lo/bgj;->c()V

    .line 114
    sget v0, Lcom/huawei/android/sns/R$id;->faces_viewpager:I

    invoke-virtual {p0, v0}, Lo/bgj;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lo/bgj;->k:Landroid/support/v4/view/ViewPager;

    .line 115
    sget v0, Lcom/huawei/android/sns/R$id;->iv_image:I

    invoke-virtual {p0, v0}, Lo/bgj;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bgj;->d:Landroid/widget/LinearLayout;

    .line 117
    invoke-direct {p0}, Lo/bgj;->d()V

    .line 118
    invoke-direct {p0}, Lo/bgj;->a()V

    .line 119
    invoke-direct {p0}, Lo/bgj;->b()V

    .line 120
    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 323
    const/4 v2, 0x1

    :goto_0
    iget-object v0, p0, Lo/bgj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 325
    if-ne p1, v2, :cond_0

    .line 327
    iget-object v0, p0, Lo/bgj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_ic_slide_press:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 331
    :cond_0
    iget-object v0, p0, Lo/bgj;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_ic_slide:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 323
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 334
    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 258
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 259
    sget v0, Lcom/huawei/android/sns/R$id;->face_image:I

    if-ne v0, v1, :cond_0

    .line 261
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 262
    iget v0, p0, Lo/bgj;->i:I

    if-eq v0, v2, :cond_0

    .line 264
    iget-object v0, p0, Lo/bgj;->k:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 267
    :cond_0
    return-void
.end method

.method protected onFinishInflate()V
    .locals 1

    .line 102
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 103
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/bgj;->b:Landroid/content/Context;

    .line 104
    invoke-direct {p0}, Lo/bgj;->e()V

    .line 105
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 339
    const-string v0, "FacesLinerLayout"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onItemClick position = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    const-string v4, ""

    .line 341
    iget v0, p0, Lo/bgj;->h:I

    mul-int/lit8 v5, v0, 0x17

    .line 342
    invoke-virtual {p0}, Lo/bgj;->getChildCount()I

    .line 343
    const/16 v0, 0x17

    if-eq p3, v0, :cond_1

    add-int v0, v5, p3

    int-to-double v0, v0

    iget-wide v2, p0, Lo/bgj;->c:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 345
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bgh;->c()[Ljava/lang/String;

    move-result-object v6

    .line 346
    add-int v7, v5, p3

    .line 347
    array-length v0, v6

    if-ge v7, v0, :cond_0

    .line 349
    aget-object v4, v6, v7

    .line 350
    const/16 v0, 0xa

    const/16 v1, 0x14

    invoke-static {v0, v1, v4}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 353
    :cond_0
    goto :goto_0

    .line 356
    :cond_1
    const/16 v0, 0xa

    const/16 v1, 0x15

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 358
    :goto_0
    return-void
.end method
