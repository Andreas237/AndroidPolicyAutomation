.class public Lo/egy;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egy$b;
    }
.end annotation


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILo/egy$2;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Lo/egy;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static c(Landroid/content/Context;F)I
    .locals 3

    .line 418
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 419
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
