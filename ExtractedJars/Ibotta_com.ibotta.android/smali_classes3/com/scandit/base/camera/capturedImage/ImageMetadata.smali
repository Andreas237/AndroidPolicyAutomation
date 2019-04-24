.class public Lcom/scandit/base/camera/capturedImage/ImageMetadata;
.super Ljava/lang/Object;
.source "ImageMetadata.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
    }
.end annotation


# instance fields
.field mAutofocusTriggered:Z

.field mBufferToNaturalOrientation:Ljava/lang/Integer;

.field mFocusDistance:Ljava/lang/Float;

.field mFocusDistanceUnit:Ljava/lang/String;

.field mFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field mFrameExposureTime:Ljava/lang/Double;

.field mFrameFNumber:Ljava/lang/Float;

.field mFrameIso:Ljava/lang/Integer;

.field mIsTorchEnabled:Ljava/lang/Boolean;

.field mRollingShutterSkew:Ljava/lang/Double;

.field mTimestamp:Ljava/lang/Long;

.field mZoom:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mTimestamp:Ljava/lang/Long;

    .line 13
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mIsTorchEnabled:Ljava/lang/Boolean;

    .line 14
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameFNumber:Ljava/lang/Float;

    .line 15
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistance:Ljava/lang/Float;

    .line 16
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistanceUnit:Ljava/lang/String;

    .line 17
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameIso:Ljava/lang/Integer;

    .line 18
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mBufferToNaturalOrientation:Ljava/lang/Integer;

    .line 19
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mZoom:Ljava/lang/Float;

    .line 20
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameExposureTime:Ljava/lang/Double;

    .line 21
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mRollingShutterSkew:Ljava/lang/Double;

    .line 23
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mAutofocusTriggered:Z

    return-void
.end method

.method public constructor <init>(Lcom/scandit/base/camera/capturedImage/ImageMetadata;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mTimestamp:Ljava/lang/Long;

    .line 13
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mIsTorchEnabled:Ljava/lang/Boolean;

    .line 14
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameFNumber:Ljava/lang/Float;

    .line 15
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistance:Ljava/lang/Float;

    .line 16
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistanceUnit:Ljava/lang/String;

    .line 17
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameIso:Ljava/lang/Integer;

    .line 18
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mBufferToNaturalOrientation:Ljava/lang/Integer;

    .line 19
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mZoom:Ljava/lang/Float;

    .line 20
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameExposureTime:Ljava/lang/Double;

    .line 21
    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mRollingShutterSkew:Ljava/lang/Double;

    .line 23
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mAutofocusTriggered:Z

    .line 39
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mTimestamp:Ljava/lang/Long;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mTimestamp:Ljava/lang/Long;

    .line 40
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mIsTorchEnabled:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mIsTorchEnabled:Ljava/lang/Boolean;

    .line 41
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameFNumber:Ljava/lang/Float;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameFNumber:Ljava/lang/Float;

    .line 42
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistance:Ljava/lang/Float;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistance:Ljava/lang/Float;

    .line 43
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistanceUnit:Ljava/lang/String;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistanceUnit:Ljava/lang/String;

    .line 44
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameIso:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameIso:Ljava/lang/Integer;

    .line 45
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mBufferToNaturalOrientation:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mBufferToNaturalOrientation:Ljava/lang/Integer;

    .line 46
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mZoom:Ljava/lang/Float;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mZoom:Ljava/lang/Float;

    .line 47
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameExposureTime:Ljava/lang/Double;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameExposureTime:Ljava/lang/Double;

    .line 48
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mRollingShutterSkew:Ljava/lang/Double;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mRollingShutterSkew:Ljava/lang/Double;

    .line 50
    iget-object v0, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    iput-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 51
    iget-boolean p1, p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mAutofocusTriggered:Z

    iput-boolean p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mAutofocusTriggered:Z

    return-void
.end method


# virtual methods
.method public getBufferToNaturalOrientation()Ljava/lang/Integer;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mBufferToNaturalOrientation:Ljava/lang/Integer;

    return-object v0
.end method

.method public getFocusDistance()Ljava/lang/Float;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistance:Ljava/lang/Float;

    return-object v0
.end method

.method public getFocusDistanceUnit()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistanceUnit:Ljava/lang/String;

    return-object v0
.end method

.method public getFocusState()Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object v0
.end method

.method public getFrameExposureTime()Ljava/lang/Double;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameExposureTime:Ljava/lang/Double;

    return-object v0
.end method

.method public getFrameFNumber()Ljava/lang/Float;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameFNumber:Ljava/lang/Float;

    return-object v0
.end method

.method public getFrameIso()Ljava/lang/Integer;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameIso:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRollingShutterSkew()Ljava/lang/Double;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mRollingShutterSkew:Ljava/lang/Double;

    return-object v0
.end method

.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public getZoom()Ljava/lang/Float;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mZoom:Ljava/lang/Float;

    return-object v0
.end method

.method public isAutoFocusTriggered()Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mAutofocusTriggered:Z

    return v0
.end method

.method public isTorchEnabled()Ljava/lang/Boolean;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mIsTorchEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setBufferToNaturalOrientation(Ljava/lang/Integer;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mBufferToNaturalOrientation:Ljava/lang/Integer;

    return-void
.end method

.method public setFocusDistance(Ljava/lang/Float;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistance:Ljava/lang/Float;

    return-void
.end method

.method public setFocusDistanceUnit(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusDistanceUnit:Ljava/lang/String;

    return-void
.end method

.method public setFocusState(Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFocusState:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-void
.end method

.method public setFrameExposureTime(Ljava/lang/Double;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameExposureTime:Ljava/lang/Double;

    return-void
.end method

.method public setFrameFNumber(Ljava/lang/Float;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameFNumber:Ljava/lang/Float;

    return-void
.end method

.method public setFrameIso(Ljava/lang/Integer;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mFrameIso:Ljava/lang/Integer;

    return-void
.end method

.method public setIsFocusTriggered(Z)V
    .locals 0

    .line 71
    iput-boolean p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mAutofocusTriggered:Z

    return-void
.end method

.method public setRollingShutterSkew(Ljava/lang/Double;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mRollingShutterSkew:Ljava/lang/Double;

    return-void
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mTimestamp:Ljava/lang/Long;

    return-void
.end method

.method public setTorchEnabled(Ljava/lang/Boolean;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mIsTorchEnabled:Ljava/lang/Boolean;

    return-void
.end method

.method public setZoom(Ljava/lang/Float;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->mZoom:Ljava/lang/Float;

    return-void
.end method
