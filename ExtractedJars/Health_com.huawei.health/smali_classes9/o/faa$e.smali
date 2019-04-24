.class public Lo/faa$e;
.super Landroid/view/ViewGroup$LayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/faa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public c:I

.field public d:Z

.field e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 548
    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 529
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/faa$e;->e:F

    .line 549
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 552
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 529
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lo/faa$e;->e:F

    .line 554
    sget-object v0, Lo/faa;->a:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 555
    const/4 v0, 0x0

    const/16 v1, 0x30

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lo/faa$e;->c:I

    .line 556
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 557
    return-void
.end method
