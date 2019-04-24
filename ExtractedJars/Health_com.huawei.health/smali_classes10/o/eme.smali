.class public Lo/eme;
.super Lo/emd;
.source "SourceFile"


# instance fields
.field private c:I

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lo/emd;-><init>(Landroid/content/Context;)V

    .line 19
    iput-object p1, p0, Lo/eme;->e:Landroid/content/Context;

    .line 20
    invoke-direct {p0}, Lo/eme;->a()V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Lo/emd;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    iput-object p1, p0, Lo/eme;->e:Landroid/content/Context;

    .line 26
    invoke-direct {p0}, Lo/eme;->a()V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2, p3}, Lo/emd;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    iput-object p1, p0, Lo/eme;->e:Landroid/content/Context;

    .line 32
    invoke-direct {p0}, Lo/eme;->a()V

    .line 33
    return-void
.end method

.method private a()V
    .locals 3

    .line 36
    iget-object v0, p0, Lo/eme;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 37
    iget v2, v1, Landroid/util/DisplayMetrics;->density:F

    .line 39
    const/high16 v0, 0x43480000    # 200.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, p0, Lo/eme;->c:I

    .line 40
    return-void
.end method


# virtual methods
.method protected overScrollBy(IIIIIIIIZ)Z
    .locals 10

    .line 44
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    iget v8, p0, Lo/eme;->c:I

    move/from16 v9, p9

    invoke-super/range {v0 .. v9}, Lo/emd;->overScrollBy(IIIIIIIIZ)Z

    move-result v0

    return v0
.end method
