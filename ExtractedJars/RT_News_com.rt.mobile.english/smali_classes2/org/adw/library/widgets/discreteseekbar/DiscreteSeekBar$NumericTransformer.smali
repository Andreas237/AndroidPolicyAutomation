.class public abstract Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$NumericTransformer;
.super Ljava/lang/Object;
.source "DiscreteSeekBar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "NumericTransformer"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract transform(I)I
.end method

.method public transformToString(I)Ljava/lang/String;
    .locals 0

    .line 101
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public useStringTransform()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
