.class public abstract Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;
.super Ljava/lang/Object;
.source "AnimatorCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;,
        Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final create(FFLorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;)Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat;
    .locals 2

    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 56
    new-instance v0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;

    invoke-direct {v0, p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompatV11;-><init>(FFLorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;)V

    return-object v0

    .line 58
    :cond_0
    new-instance v0, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;

    invoke-direct {v0, p0, p1, p2}, Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimatorCompatBase;-><init>(FFLorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;)V

    return-object v0
.end method


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract isRunning()Z
.end method

.method public abstract setDuration(I)V
.end method

.method public abstract start()V
.end method
