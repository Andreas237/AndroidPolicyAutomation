.class public Lcom/huawei/feedback/ui/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroid/view/View;

.field private c:I

.field private d:Z

.field private e:Landroid/app/ActionBar;

.field private f:Lcom/huawei/feedback/ui/CustomActionBar;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;Lcom/huawei/feedback/ui/CustomActionBar;Landroid/app/ActionBar;)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->c:I

    .line 74
    iput-object p1, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    .line 75
    iput-object p2, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    .line 76
    iput-object p4, p0, Lcom/huawei/feedback/ui/ap;->e:Landroid/app/ActionBar;

    .line 77
    iput-object p3, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    .line 78
    if-eqz p1, :cond_0

    .line 80
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->c:I

    .line 82
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/ap;->b(Z)V

    .line 84
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 86
    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/ap;->d:Z

    .line 90
    :cond_0
    if-eqz p2, :cond_1

    .line 92
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->g:I

    .line 93
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->h:I

    .line 94
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->i:I

    .line 95
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->j:I

    .line 98
    :cond_1
    if-eqz p3, :cond_2

    .line 100
    invoke-virtual {p3}, Lcom/huawei/feedback/ui/CustomActionBar;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->k:I

    .line 101
    invoke-virtual {p3}, Lcom/huawei/feedback/ui/CustomActionBar;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->l:I

    .line 102
    invoke-virtual {p3}, Lcom/huawei/feedback/ui/CustomActionBar;->getPaddingRight()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->m:I

    .line 103
    invoke-virtual {p3}, Lcom/huawei/feedback/ui/CustomActionBar;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/ap;->n:I

    .line 105
    :cond_2
    return-void
.end method

.method private a(II)V
    .locals 3

    .line 223
    const/4 v2, 0x0

    .line 224
    const/16 v0, 0x154

    if-gt p1, v0, :cond_0

    const/16 v0, 0x14

    if-ge p1, v0, :cond_1

    .line 227
    :cond_0
    iget v0, p0, Lcom/huawei/feedback/ui/ap;->c:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    .line 229
    return-void

    .line 232
    :cond_1
    const/16 v0, 0x46

    if-le p1, v0, :cond_2

    const/16 v0, 0x6e

    if-ge p1, v0, :cond_2

    .line 235
    const/16 v2, 0x5a

    .line 236
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/ap;->d:Z

    if-nez v0, :cond_4

    iget v0, p0, Lcom/huawei/feedback/ui/ap;->c:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 238
    return-void

    .line 241
    :cond_2
    const/16 v0, 0xa0

    if-le p1, v0, :cond_3

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_3

    .line 244
    const/16 v2, 0xb4

    goto :goto_0

    .line 246
    :cond_3
    const/16 v0, 0xfa

    if-le p1, v0, :cond_4

    const/16 v0, 0x122

    if-ge p1, v0, :cond_4

    .line 249
    const/16 v2, 0x10e

    .line 250
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/ap;->d:Z

    if-nez v0, :cond_4

    iget v0, p0, Lcom/huawei/feedback/ui/ap;->c:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    .line 252
    return-void

    .line 256
    :cond_4
    :goto_0
    invoke-direct {p0, p2, v2}, Lcom/huawei/feedback/ui/ap;->b(II)V

    .line 257
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/ap;II)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/huawei/feedback/ui/ap;->a(II)V

    return-void
.end method

.method private b()V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->setVisibility(I)V

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->e:Landroid/app/ActionBar;

    if-eqz v0, :cond_1

    .line 146
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->e:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->show()V

    .line 148
    :cond_1
    return-void
.end method

.method private b(I)V
    .locals 5

    .line 301
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->k:I

    add-int/2addr v1, p1

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->l:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->m:I

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->n:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/feedback/ui/CustomActionBar;->setPadding(IIII)V

    .line 306
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    invoke-static {v0}, Lcom/huawei/feedback/ui/ar;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 308
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->g:I

    add-int/2addr v1, p1

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->h:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->i:I

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->j:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    .line 312
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->g:I

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->h:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->i:I

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->j:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 314
    :goto_0
    return-void
.end method

.method private b(II)V
    .locals 5

    .line 267
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 270
    :sswitch_0
    iget v0, p0, Lcom/huawei/feedback/ui/ap;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 272
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->g:I

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->h:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->i:I

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->j:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 273
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->k:I

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->l:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->m:I

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->n:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/feedback/ui/CustomActionBar;->setPadding(IIII)V

    goto :goto_0

    .line 278
    :sswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/ap;->c(I)V

    .line 279
    goto :goto_0

    .line 282
    :sswitch_2
    goto :goto_0

    .line 286
    :sswitch_3
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/ap;->b(I)V

    .line 287
    .line 292
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5a -> :sswitch_1
        0xb4 -> :sswitch_2
        0x10e -> :sswitch_3
    .end sparse-switch
.end method

.method private b(Z)V
    .locals 2

    .line 114
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    .line 116
    iget v0, p0, Lcom/huawei/feedback/ui/ap;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 118
    invoke-direct {p0}, Lcom/huawei/feedback/ui/ap;->c()V

    goto :goto_0

    .line 122
    :cond_0
    if-eqz p1, :cond_1

    .line 124
    invoke-direct {p0}, Lcom/huawei/feedback/ui/ap;->b()V

    goto :goto_0

    .line 128
    :cond_1
    invoke-direct {p0}, Lcom/huawei/feedback/ui/ap;->c()V

    .line 132
    :cond_2
    :goto_0
    return-void
.end method

.method private c()V
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/at;->a(Landroid/app/Activity;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 157
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->e:Landroid/app/ActionBar;

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->e:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->hide()V

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    if-eqz v0, :cond_1

    .line 163
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->setVisibility(I)V

    .line 165
    :cond_1
    return-void
.end method

.method private c(I)V
    .locals 6

    .line 323
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    if-eqz v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->k:I

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->l:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->m:I

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->n:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/feedback/ui/CustomActionBar;->setPadding(IIII)V

    .line 327
    :cond_0
    const/4 v5, 0x0

    .line 328
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/ap;->d:Z

    if-eqz v0, :cond_1

    .line 331
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/ar;->a(Landroid/app/Activity;)Z

    move-result v5

    goto :goto_0

    .line 335
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/ar;->b(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 337
    const/4 v5, 0x1

    .line 341
    :cond_2
    :goto_0
    if-eqz v5, :cond_3

    .line 343
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->g:I

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->h:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->i:I

    add-int/2addr v3, p1

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->j:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_1

    .line 347
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    iget v1, p0, Lcom/huawei/feedback/ui/ap;->g:I

    iget v2, p0, Lcom/huawei/feedback/ui/ap;->h:I

    iget v3, p0, Lcom/huawei/feedback/ui/ap;->i:I

    iget v4, p0, Lcom/huawei/feedback/ui/ap;->j:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 349
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 188
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->f:Lcom/huawei/feedback/ui/CustomActionBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->e:Landroid/app/ActionBar;

    if-nez v0, :cond_1

    .line 190
    :cond_0
    return-void

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/ar;->b(Landroid/content/Context;)[I

    move-result-object v0

    const/4 v1, 0x1

    aget v2, v0, v1

    .line 194
    new-instance v3, Lcom/huawei/feedback/ui/aq;

    iget-object v0, p0, Lcom/huawei/feedback/ui/ap;->a:Landroid/app/Activity;

    invoke-direct {v3, p0, v0, v2}, Lcom/huawei/feedback/ui/aq;-><init>(Lcom/huawei/feedback/ui/ap;Landroid/content/Context;I)V

    .line 205
    invoke-virtual {v3}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 207
    invoke-virtual {v3}, Landroid/view/OrientationEventListener;->enable()V

    goto :goto_0

    .line 211
    :cond_2
    invoke-virtual {v3}, Landroid/view/OrientationEventListener;->disable()V

    .line 213
    :goto_0
    return-void
.end method

.method public a(I)V
    .locals 1

    .line 174
    iput p1, p0, Lcom/huawei/feedback/ui/ap;->c:I

    .line 175
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/ap;->b(Z)V

    .line 176
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 180
    iput-boolean p1, p0, Lcom/huawei/feedback/ui/ap;->d:Z

    .line 181
    return-void
.end method
