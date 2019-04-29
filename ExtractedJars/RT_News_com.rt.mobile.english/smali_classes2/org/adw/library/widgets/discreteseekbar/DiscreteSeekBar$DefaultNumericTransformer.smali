.class Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$DefaultNumericTransformer;
.super Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;
.source "DiscreteSeekBar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DefaultNumericTransformer"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$1;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$DefaultNumericTransformer;-><init>()V

    return-void
.end method


# virtual methods
.method public transform(I)I
    .locals 0

    return p1
.end method
