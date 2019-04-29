.class Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$3;
.super Ljava/lang/Object;
.source "DiscreteSeekBar.java"

# interfaces
.implements Lorg/adw/library/widgets/discreteseekbar/internal/drawable/MarkerDrawable$MarkerAnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;
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

    .line 984
    iput-object p1, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$3;->this$0:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClosingComplete()V
    .locals 1

    .line 987
    iget-object v0, p0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$3;->this$0:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    invoke-static {v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->access$200(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;)Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;

    move-result-object v0

    invoke-virtual {v0}, Lorg/adw/library/widgets/discreteseekbar/internal/drawable/ThumbDrawable;->animateToNormal()V

    return-void
.end method

.method public onOpeningComplete()V
    .locals 0

    return-void
.end method
