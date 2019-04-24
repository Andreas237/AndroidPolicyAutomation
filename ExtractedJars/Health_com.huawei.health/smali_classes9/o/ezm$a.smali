.class Lo/ezm$a;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 309
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 306
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm$a;->c:Landroid/widget/Button;

    .line 310
    invoke-direct {p0}, Lo/ezm$a;->d()V

    .line 311
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 314
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 306
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm$a;->c:Landroid/widget/Button;

    .line 315
    invoke-direct {p0}, Lo/ezm$a;->d()V

    .line 316
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 319
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 306
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ezm$a;->c:Landroid/widget/Button;

    .line 320
    invoke-direct {p0}, Lo/ezm$a;->d()V

    .line 321
    return-void
.end method

.method static synthetic c(Lo/ezm$a;)V
    .locals 0

    .line 303
    invoke-direct {p0}, Lo/ezm$a;->e()V

    return-void
.end method

.method static synthetic d(Lo/ezm$a;)Landroid/widget/Button;
    .locals 1

    .line 303
    iget-object v0, p0, Lo/ezm$a;->c:Landroid/widget/Button;

    return-object v0
.end method

.method private final d()V
    .locals 2

    .line 324
    invoke-virtual {p0}, Lo/ezm$a;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->focus_view_detail_warning_hr_without_data:I

    invoke-static {v0, v1, p0}, Lo/ezm$a;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 325
    sget v0, Lcom/huawei/ui/main/R$id;->view_more_data:I

    invoke-virtual {p0, v0}, Lo/ezm$a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/ezm$a;->c:Landroid/widget/Button;

    .line 326
    iget-object v0, p0, Lo/ezm$a;->c:Landroid/widget/Button;

    new-instance v1, Lo/ezm$a$1;

    invoke-direct {v1, p0}, Lo/ezm$a$1;-><init>(Lo/ezm$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    invoke-direct {p0}, Lo/ezm$a;->e()V

    .line 336
    return-void
.end method

.method private e()V
    .locals 8

    .line 340
    const-wide v6, 0x14349621000L

    .line 341
    move-object v0, p0

    move-wide v1, v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    new-instance v5, Lo/ezm$a$3;

    invoke-direct {v5, p0}, Lo/ezm$a$3;-><init>(Lo/ezm$a;)V

    const-wide v1, 0x14349621000L

    invoke-direct/range {v0 .. v5}, Lo/ezm$a;->e(JJLo/fbd$e;)V

    .line 351
    return-void
.end method

.method private e(JJLo/fbd$e;)V
    .locals 6

    .line 355
    new-instance v3, Lo/fbr;

    invoke-direct {v3}, Lo/fbr;-><init>()V

    .line 356
    invoke-virtual {v3, p1, p2, p3, p4}, Lo/fbr;->e(JJ)Lo/fbr;

    .line 360
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 361
    sget-object v0, Lo/fbr$e;->a:Lo/fbr$e;

    const-string v1, "HR_WARNING_MAX"

    const v2, 0xb79b

    invoke-virtual {v3, v0, v1, v2}, Lo/fbr;->d(Lo/fbr$e;Ljava/lang/String;I)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v5

    .line 363
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 364
    invoke-virtual {p0}, Lo/ezm$a;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ezm$a$5;

    invoke-direct {v1, p0, p5}, Lo/ezm$a$5;-><init>(Lo/ezm$a;Lo/fbd$e;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 392
    return-void
.end method
