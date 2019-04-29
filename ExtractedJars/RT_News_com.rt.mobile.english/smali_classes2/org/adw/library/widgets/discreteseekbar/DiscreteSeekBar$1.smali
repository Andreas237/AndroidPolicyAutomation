.class Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;
.super Ljava/lang/Object;
.source "DiscreteSeekBar.java"

# interfaces
.implements Lorg/adw/library/widgets/discreteseekbar/internal/compat/AnimatorCompat$AnimationFrameUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->animateSetProgress(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;


# direct methods
.method constructor <init>(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)V
    .locals 0

    .line 828
    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;->this$0:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationFrame(F)V
    .locals 1

    .line 831
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;->this$0:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    invoke-virtual {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setAnimationPosition(F)V

    return-void
.end method
