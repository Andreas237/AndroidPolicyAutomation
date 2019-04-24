.class public Lo/emg;
.super Lhuawei/widget/HwSeekBar;
.source "SourceFile"


# instance fields
.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 15
    invoke-direct {p0, p1}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;)V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emg;->d:Z

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 19
    invoke-direct {p0, p1, p2}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emg;->d:Z

    .line 20
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lhuawei/widget/HwSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/emg;->d:Z

    .line 24
    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lo/emg;->d:Z

    if-eqz v0, :cond_0

    .line 29
    invoke-super {p0, p1}, Lhuawei/widget/HwSeekBar;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setTouchable(Z)V
    .locals 0

    .line 35
    iput-boolean p1, p0, Lo/emg;->d:Z

    return-void
.end method
