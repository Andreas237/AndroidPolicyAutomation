.class public Lo/ewo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/ewo;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method

.method public static d()Lo/ewo;
    .locals 2

    .line 15
    sget-object v0, Lo/ewo;->d:Lo/ewo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 16
    new-instance v0, Lo/ewo;

    invoke-direct {v0}, Lo/ewo;-><init>()V

    sput-object v0, Lo/ewo;->d:Lo/ewo;

    .line 18
    :cond_0
    sget-object v0, Lo/ewo;->d:Lo/ewo;

    return-object v0
.end method


# virtual methods
.method public e(Landroid/content/Context;F)I
    .locals 3

    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 22
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
