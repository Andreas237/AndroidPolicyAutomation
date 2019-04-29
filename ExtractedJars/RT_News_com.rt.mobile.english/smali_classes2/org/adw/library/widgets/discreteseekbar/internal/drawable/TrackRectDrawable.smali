.class public Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;
.super Lorg/adw/library/widgets/discreteseekbar/internal/drawable/StateDrawable;
.source "TrackRectDrawable.java"


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/StateDrawable;-><init>(Landroid/content/res/ColorStateList;)V

    return-void
.end method


# virtual methods
.method doDraw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 1

    .line 37
    invoke-virtual {p0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/TrackRectDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method
