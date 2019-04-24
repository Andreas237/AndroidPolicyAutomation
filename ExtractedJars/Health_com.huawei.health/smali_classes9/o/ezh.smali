.class public abstract Lo/ezh;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lo/eyk$e;
.implements Lo/eyp;


# static fields
.field static final synthetic i:Z


# instance fields
.field private a:Lo/eyy;

.field private b:Lo/eyp;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Lo/ezj;

.field private f:Ljava/lang/String;

.field private g:Lo/egl;

.field private h:Lo/eic;

.field private k:Lo/ejf;

.field private n:Lo/ezv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Lo/ezh;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/ezh;->i:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 78
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->b:Lo/eyp;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->g:Lo/egl;

    .line 51
    const-string v0, "default"

    iput-object v0, p0, Lo/ezh;->f:Ljava/lang/String;

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->n:Lo/ezv;

    .line 79
    invoke-direct {p0}, Lo/ezh;->p()V

    .line 80
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 83
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->b:Lo/eyp;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->g:Lo/egl;

    .line 51
    const-string v0, "default"

    iput-object v0, p0, Lo/ezh;->f:Ljava/lang/String;

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->n:Lo/ezv;

    .line 84
    invoke-direct {p0}, Lo/ezh;->p()V

    .line 85
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 88
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->b:Lo/eyp;

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->g:Lo/egl;

    .line 51
    const-string v0, "default"

    iput-object v0, p0, Lo/ezh;->f:Ljava/lang/String;

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezh;->n:Lo/ezv;

    .line 89
    invoke-direct {p0}, Lo/ezh;->p()V

    .line 90
    return-void
.end method

.method static synthetic b(Lo/ezh;)Lo/ezj;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/ezh;->e:Lo/ezj;

    return-object v0
.end method

.method static synthetic c(Lo/ezh;)Lo/egl;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/ezh;->g:Lo/egl;

    return-object v0
.end method

.method static synthetic d(Lo/ezh;)Lo/eyy;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    return-object v0
.end method

.method static synthetic e(Lo/ezh;)Lo/ezv;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/ezh;->n:Lo/ezv;

    return-object v0
.end method

.method private p()V
    .locals 5

    .line 98
    invoke-virtual {p0}, Lo/ezh;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->classified_view:I

    invoke-static {v0, v1, p0}, Lo/ezh;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 99
    sget v0, Lcom/huawei/ui/main/R$id;->jump_table_chart_container:I

    invoke-virtual {p0, v0}, Lo/ezh;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ezh;->c:Landroid/widget/LinearLayout;

    .line 100
    invoke-virtual {p0}, Lo/ezh;->e()Lo/eyy;

    move-result-object v0

    iput-object v0, p0, Lo/ezh;->a:Lo/eyy;

    .line 101
    iget-object v0, p0, Lo/ezh;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/ezh;->a:Lo/eyy;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 103
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0, p0}, Lo/eyy;->setHost(Lo/ezh;)V

    .line 104
    sget v0, Lcom/huawei/ui/main/R$id;->jump_table_chart_eye:I

    invoke-virtual {p0, v0}, Lo/ezh;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ezh;->d:Landroid/widget/LinearLayout;

    .line 107
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v4

    .line 109
    new-instance v0, Lo/ezh$5;

    invoke-direct {v0, p0, v4}, Lo/ezh$5;-><init>(Lo/ezh;Lo/eih;)V

    invoke-virtual {v4, v0}, Lo/eih;->d(Lo/eih$m;)V

    .line 119
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lo/ezh;->f:Ljava/lang/String;

    return-object v0
.end method

.method public a(ILandroid/graphics/Paint;Z)V
    .locals 2

    .line 283
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    .line 284
    invoke-virtual {v1, p1, p2, p3}, Lo/eih;->e(ILandroid/graphics/Paint;Z)V

    .line 286
    invoke-virtual {v1}, Lo/eih;->ak()V

    .line 288
    return-void
.end method

.method public a(Lo/egl;)V
    .locals 3

    .line 122
    iput-object p1, p0, Lo/ezh;->g:Lo/egl;

    .line 123
    iget-object v0, p0, Lo/ezh;->g:Lo/egl;

    invoke-virtual {p0}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-static {v1}, Lo/egl$c;->c(Lo/eic;)Lo/egl$c;

    move-result-object v1

    iget-object v2, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v2}, Lo/eyy;->e()Lo/eih;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/egl;->b(Lo/egl$c;Lo/eih;)V

    .line 125
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    new-instance v1, Lo/ezh$1;

    invoke-direct {v1, p0}, Lo/ezh$1;-><init>(Lo/ezh;)V

    invoke-virtual {v0, v1}, Lo/eyy;->setDataTextViewOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    return-void
.end method

.method public a(Lo/ejf;)V
    .locals 2

    .line 158
    new-instance v1, Lo/ehe$a;

    invoke-direct {v1}, Lo/ehe$a;-><init>()V

    .line 159
    invoke-virtual {p0}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 160
    invoke-virtual {p0}, Lo/ezh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/ehe$a;->a(Ljava/lang/String;)Lo/ehe$a;

    .line 161
    invoke-virtual {p0, p1, v1}, Lo/ezh;->e(Lo/ejf;Lo/ehe$a;)Lo/eii;

    .line 164
    iget-object v0, p0, Lo/ezh;->e:Lo/ezj;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lo/ezh;->e:Lo/ezj;

    invoke-virtual {v0}, Lo/ezj;->b()V

    .line 167
    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    .line 148
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v3

    .line 150
    invoke-virtual {v3}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v0

    invoke-virtual {v3}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v1

    invoke-interface {v1}, Lo/eih$h;->e()I

    move-result v1

    or-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lo/eih$h;->b(I)V

    .line 152
    invoke-virtual {v3}, Lo/eih;->c()V

    .line 153
    return-void
.end method

.method public b(Lo/eii;Lo/ehe$a;)V
    .locals 2

    .line 179
    iget-object v0, p0, Lo/ezh;->k:Lo/ejf;

    iget-object v1, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v1}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lo/ejf;->a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;

    .line 180
    return-void
.end method

.method public b(Lo/ezj;)V
    .locals 3

    .line 221
    iput-object p1, p0, Lo/ezh;->e:Lo/ezj;

    .line 222
    iget-object v0, p0, Lo/ezh;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lo/ezh;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 224
    iget-object v0, p0, Lo/ezh;->d:Landroid/widget/LinearLayout;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-virtual {v0, p1, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 225
    return-void
.end method

.method public c(Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 259
    iget-object v0, p0, Lo/ezh;->k:Lo/ejf;

    invoke-interface {v0, p1}, Lo/ejf;->c(Lo/ehe$a;)Lo/eii;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lo/ezh;->f:Ljava/lang/String;

    .line 208
    return-void
.end method

.method public c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V
    .locals 4

    .line 235
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v2

    .line 236
    if-nez v2, :cond_0

    .line 237
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "manageDataSetAsProxy chart null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 239
    :cond_0
    invoke-virtual {v2}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v3

    .line 240
    if-nez v3, :cond_1

    .line 241
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "manageDataSetAsProxy scrollAdapter null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :cond_1
    invoke-interface {v3, p1, p2, p3, p4}, Lo/eih$h;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 244
    return-void
.end method

.method public abstract d(F)Ljava/lang/String;
.end method

.method public d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;
    .locals 3

    .line 58
    if-nez p1, :cond_0

    .line 59
    const-string v0, "--"

    return-object v0

    .line 61
    :cond_0
    iget-object v0, p0, Lo/ezh;->b:Lo/eyp;

    if-nez v0, :cond_4

    .line 62
    instance-of v0, p1, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    if-eqz v0, :cond_2

    .line 63
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    invoke-static {v0}, Lo/eko;->d(Lo/ejp;)F

    move-result v2

    .line 64
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-nez v0, :cond_1

    .line 65
    const-string v0, "--"

    return-object v0

    .line 67
    :cond_1
    invoke-virtual {p0, v2}, Lo/ezh;->d(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 69
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_3

    .line 70
    const-string v0, "--"

    return-object v0

    .line 72
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    invoke-virtual {p0, v0}, Lo/ezh;->d(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 74
    :cond_4
    iget-object v0, p0, Lo/ezh;->b:Lo/eyp;

    invoke-interface {v0, p1}, Lo/eyp;->d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Lo/ezj;
    .locals 1

    .line 228
    iget-object v0, p0, Lo/ezh;->e:Lo/ezj;

    return-object v0
.end method

.method public d(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eib;>;)V"
        }
    .end annotation

    .line 309
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 311
    :cond_0
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    .line 313
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 315
    :cond_1
    invoke-virtual {v1, p1}, Lo/eih;->b(Ljava/util/List;)V

    .line 316
    return-void
.end method

.method public d(Lo/eii;)V
    .locals 2

    .line 183
    iget-object v0, p0, Lo/ezh;->k:Lo/ejf;

    iget-object v1, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v1}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lo/ejf;->c(Lo/eih;Lo/eii;)V

    .line 184
    return-void
.end method

.method public e(Lo/ejf;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 170
    iput-object p1, p0, Lo/ezh;->k:Lo/ejf;

    .line 171
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lo/ejf;->c(Lo/eih;Lo/ehe$a;)Lo/eii;

    move-result-object v0

    return-object v0
.end method

.method protected abstract e()Lo/eyy;
.end method

.method public e(Lo/egl;)V
    .locals 2

    .line 329
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 331
    :cond_0
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    .line 333
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 337
    :cond_1
    return-void
.end method

.method public e(Lo/eii;)V
    .locals 4

    .line 247
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v2

    .line 248
    if-nez v2, :cond_0

    .line 249
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unManageDataSetAsProxy chart null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 251
    :cond_0
    invoke-virtual {v2}, Lo/eih;->aa()Lo/eih$h;

    move-result-object v3

    .line 252
    if-nez v3, :cond_1

    .line 253
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unManageDataSetAsProxy scrollAdapter null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_1
    invoke-interface {v3, p1}, Lo/eih$h;->d(Lo/eii;)V

    .line 256
    return-void
.end method

.method public f()Lo/ejf;
    .locals 1

    .line 263
    iget-object v0, p0, Lo/ezh;->k:Lo/ejf;

    return-object v0
.end method

.method public g()V
    .locals 2

    .line 291
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    .line 292
    invoke-virtual {v1}, Lo/eih;->O()V

    .line 294
    invoke-virtual {v1}, Lo/eih;->ak()V

    .line 296
    return-void
.end method

.method public getStepDataType()Lo/eic;
    .locals 1

    .line 192
    iget-object v0, p0, Lo/ezh;->h:Lo/eic;

    return-object v0
.end method

.method public h()Z
    .locals 2

    .line 299
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 301
    :cond_0
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    .line 303
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 305
    :cond_1
    invoke-virtual {v1}, Lo/eih;->ac()Z

    move-result v0

    return v0
.end method

.method public i()Landroid/graphics/Bitmap;
    .locals 1

    .line 267
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 271
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()V
    .locals 2

    .line 319
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 321
    :cond_0
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0}, Lo/eyy;->e()Lo/eih;

    move-result-object v1

    .line 323
    sget-boolean v0, Lo/ezh;->i:Z

    if-nez v0, :cond_1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 325
    :cond_1
    invoke-virtual {v1}, Lo/eih;->aq()V

    .line 326
    return-void
.end method

.method public setHighlightedEntryParser(Lo/eyp;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lo/ezh;->b:Lo/eyp;

    .line 55
    return-void
.end method

.method public setOnDataShowListener(Lo/ezv;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lo/ezh;->n:Lo/ezv;

    .line 215
    return-void
.end method

.method public setStepDatatype(Lo/eic;)V
    .locals 1

    .line 196
    iput-object p1, p0, Lo/ezh;->h:Lo/eic;

    .line 197
    iget-object v0, p0, Lo/ezh;->a:Lo/eyy;

    invoke-virtual {v0, p1}, Lo/eyy;->a(Lo/eic;)V

    .line 198
    return-void
.end method
