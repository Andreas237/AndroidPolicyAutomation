.class final Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState$1;
.super Ljava/lang/Object;
.source "DiscreteSeekBar.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1059
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1059
    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState$1;->createFromParcel(Landroid/os/Parcel;)Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;

    move-result-object p1

    return-object p1
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;
    .locals 1

    .line 1068
    new-instance v0, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;

    invoke-direct {v0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1059
    invoke-virtual {p0, p1}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState$1;->newArray(I)[Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;
    .locals 0

    .line 1063
    new-array p1, p1, [Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar$CustomState;

    return-object p1
.end method
