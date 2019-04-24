.class public Lcom/scandit/base/camera/SbFocusUtils;
.super Ljava/lang/Object;
.source "SbFocusUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static curateSupportedFocusModes(Ljava/util/List;Lcom/scandit/base/camera/profiles/DeviceProfile;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/scandit/base/camera/profiles/DeviceProfile;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    invoke-static {v0}, Lcom/scandit/base/camera/SbFocusUtils;->removeContinuousVideoFocusingMode(Ljava/util/List;)V

    .line 55
    invoke-virtual {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isContinuousDisabled()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 56
    invoke-static {v0}, Lcom/scandit/base/camera/SbFocusUtils;->removeContinuousPictureFocusingMode(Ljava/util/List;)V

    .line 58
    :cond_0
    invoke-virtual {p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isMacroDisabled()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 59
    invoke-static {v0}, Lcom/scandit/base/camera/SbFocusUtils;->removeMacroFocusingMode(Ljava/util/List;)V

    :cond_1
    return-object v0
.end method

.method public static getFocusingModeBitMask(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0xe

    if-lt v0, v2, :cond_1

    const-string v0, "continuous-picture"

    .line 72
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "continuous-video"

    .line 73
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    :cond_0
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_AUTO_get()I

    move-result v0

    or-int/2addr v1, v0

    :cond_1
    const-string v0, "auto"

    .line 77
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_MANUAL_get()I

    move-result v0

    or-int/2addr v1, v0

    :cond_2
    const-string v0, "fixed"

    .line 80
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 81
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_CAMERA_FOCUS_MODE_FIXED_get()I

    move-result p0

    or-int/2addr v1, p0

    :cond_3
    return v1
.end method

.method private static removeContinuousPictureFocusingMode(Ljava/util/List;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    const-string v0, "continuous-picture"

    .line 28
    invoke-interface {p0, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private static removeContinuousVideoFocusingMode(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "continuous-video"

    .line 34
    invoke-interface {p0, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private static removeMacroFocusingMode(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "macro"

    .line 38
    invoke-interface {p0, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
