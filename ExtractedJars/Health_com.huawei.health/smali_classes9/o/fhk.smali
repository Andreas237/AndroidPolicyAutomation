.class public Lo/fhk;
.super Landroid/widget/VideoView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 3

    .line 27
    const/4 v0, 0x0

    invoke-static {v0, p1}, Lo/fhk;->getDefaultSize(II)I

    move-result v1

    .line 28
    const/4 v0, 0x0

    invoke-static {v0, p2}, Lo/fhk;->getDefaultSize(II)I

    move-result v2

    .line 29
    invoke-virtual {p0, v1, v2}, Lo/fhk;->setMeasuredDimension(II)V

    .line 30
    return-void
.end method
