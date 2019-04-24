.class public Lo/bmu;
.super Lo/bmy;
.source "SourceFile"


# static fields
.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const/16 v0, 0x10

    sput v0, Lo/bmu;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 35
    invoke-direct {p0, p1}, Lo/bmy;-><init>(Landroid/content/Context;)V

    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bmu;->d(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Lo/bmy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    invoke-direct {p0, p1, p2}, Lo/bmu;->d(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2, p3}, Lo/bmy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 54
    invoke-direct {p0, p1, p2}, Lo/bmu;->d(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 55
    return-void
.end method

.method private d(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 59
    invoke-static {p1}, Lo/bph;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/16 v0, 0x18

    sput v0, Lo/bmu;->c:I

    .line 64
    :cond_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    const/16 v0, 0x50

    invoke-virtual {p0, v0}, Lo/bmu;->setGravity(I)V

    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-static {p1}, Lo/bny;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    sget v0, Lo/bmu;->c:I

    int-to-float v0, v0

    invoke-static {p1, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v3

    .line 72
    :cond_1
    sget v0, Lo/bmu;->c:I

    int-to-float v0, v0

    invoke-static {p1, v0}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {p1, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lo/bmu;->setPadding(IIII)V

    .line 73
    goto :goto_0

    .line 76
    :cond_2
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lo/bmu;->setGravity(I)V

    .line 78
    :goto_0
    return-void
.end method
