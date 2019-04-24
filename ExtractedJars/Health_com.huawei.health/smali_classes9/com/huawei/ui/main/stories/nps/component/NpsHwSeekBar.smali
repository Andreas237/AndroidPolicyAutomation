.class public Lcom/huawei/ui/main/stories/nps/component/NpsHwSeekBar;
.super Lhuawei/widget/HwSeekBar;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;)V

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 30
    invoke-super {p0, p1}, Lhuawei/widget/HwSeekBar;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
