.class public abstract Lnet/hockeyapp/android/CrashManagerListener;
.super Ljava/lang/Object;
.source "CrashManagerListener.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContact()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMaxRetryAttempts()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getUserID()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ignoreDefaultHandler()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public includeDeviceData()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public includeDeviceIdentifier()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public includeThreadDetails()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onConfirmedCrashesFound()V
    .locals 0

    return-void
.end method

.method public onCrashesFound()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onCrashesNotSent()V
    .locals 0

    return-void
.end method

.method public onCrashesSent()V
    .locals 0

    return-void
.end method

.method public onHandleAlertView()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onNewCrashesFound()V
    .locals 0

    return-void
.end method

.method public onUserDeniedCrashes()V
    .locals 0

    return-void
.end method

.method public shouldAutoUploadCrashes()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
