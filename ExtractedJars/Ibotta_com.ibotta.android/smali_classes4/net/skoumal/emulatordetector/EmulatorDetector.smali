.class public Lnet/skoumal/emulatordetector/EmulatorDetector;
.super Ljava/lang/Object;
.source "EmulatorDetector.java"


# static fields
.field private static rating:I = -0x1


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static isEmulator()Z
    .locals 3

    .line 31
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    const/4 v1, 0x1

    if-gez v0, :cond_d

    .line 33
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    const-string v2, "sdk"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    const-string v2, "google_sdk"

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    const-string v2, "sdk_x86"

    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    const-string v2, "vbox86p"

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 37
    :cond_0
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    add-int/2addr v0, v1

    sput v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    .line 40
    :cond_1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "unknown"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "Genymotion"

    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 42
    :cond_2
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    add-int/2addr v0, v1

    sput v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    .line 45
    :cond_3
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v2, "generic"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v2, "generic_x86"

    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 47
    :cond_4
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    add-int/2addr v0, v1

    sput v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    .line 50
    :cond_5
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "generic"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "generic_x86"

    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v2, "vbox86p"

    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 53
    :cond_6
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    add-int/2addr v0, v1

    sput v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    .line 56
    :cond_7
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "sdk"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "google_sdk"

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "Android SDK built for x86"

    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 59
    :cond_8
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    add-int/2addr v0, v1

    sput v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    .line 62
    :cond_9
    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    const-string v2, "goldfish"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    const-string v2, "vbox86"

    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 64
    :cond_a
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    add-int/2addr v0, v1

    sput v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    .line 67
    :cond_b
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v2, "generic/sdk/generic"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v2, "generic_x86/sdk_x86/generic_x86"

    .line 68
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v2, "generic/google_sdk/generic"

    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v2, "generic/vbox86p/vbox86p"

    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 71
    :cond_c
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    add-int/2addr v0, v1

    sput v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    .line 75
    :cond_d
    sget v0, Lnet/skoumal/emulatordetector/EmulatorDetector;->rating:I

    const/4 v2, 0x4

    if-le v0, v2, :cond_e

    goto :goto_0

    :cond_e
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
