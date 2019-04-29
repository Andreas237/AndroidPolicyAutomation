.class public Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;
.super Lorg/adw/library/widgets/discreteseekbar/internal/drawable/StateDrawable;
.source "ThumbDrawable.java"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field public static final DEFAULT_SIZE_DP:I = 0xc


# instance fields
.field private mOpen:Z

.field private mRunning:Z

.field private final mSize:I

.field private opener:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;I)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 50
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/StateDrawable;-><init>(Landroid/content/res/ColorStateList;)V

    .line 85
    new-instance p1, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable$1;

    invoke-direct {p1, p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable$1;-><init>(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;)V

    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->opener:Ljava/lang/Runnable;

    .line 51
    iput p2, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mSize:I

    return-void
.end method

.method static synthetic access$002(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;Z)Z
    .locals 0

    .line 42
    iput-boolean p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mOpen:Z

    return p1
.end method

.method static synthetic access$102(Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;Z)Z
    .locals 0

    .line 42
    iput-boolean p1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mRunning:Z

    return p1
.end method


# virtual methods
.method public animateToNormal()V
    .locals 1

    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mOpen:Z

    .line 80
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mRunning:Z

    .line 81
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->opener:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 82
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->invalidateSelf()V

    return-void
.end method

.method public animateToPressed()V
    .locals 7

    .line 74
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->opener:Ljava/lang/Runnable;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x64

    add-long v5, v1, v3

    invoke-virtual {p0, v0, v5, v6}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mRunning:Z

    return-void
.end method

.method public doDraw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    .line 66
    iget-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mOpen:Z

    if-nez v0, :cond_0

    .line 67
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 68
    iget v1, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mSize:I

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    .line 69
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v2, v0, v1, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 61
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mSize:I

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 56
    iget v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mSize:I

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->mRunning:Z

    return v0
.end method

.method public start()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    .line 101
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->animateToNormal()V

    return-void
.end method
