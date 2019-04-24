.class public Lcom/scandit/base/camera/profiles/StandardProfile$Settings;
.super Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;
.source "StandardProfile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/profiles/StandardProfile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Settings"
.end annotation


# instance fields
.field public useFpsRangeWithBiggestSpread:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/scandit/base/camera/profiles/DeviceProfile$Settings;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/scandit/base/camera/profiles/StandardProfile$Settings;->useFpsRangeWithBiggestSpread:Z

    return-void
.end method
