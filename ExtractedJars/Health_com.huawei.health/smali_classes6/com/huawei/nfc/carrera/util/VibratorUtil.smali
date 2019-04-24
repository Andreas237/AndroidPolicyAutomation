.class public final Lcom/huawei/nfc/carrera/util/VibratorUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/util/VibratorUtil$VibratorUtilSAI5;,
        Lcom/huawei/nfc/carrera/util/VibratorUtil$VibratorUtilSAI4;,
        Lcom/huawei/nfc/carrera/util/VibratorUtil$VibratorUtilSAI3;,
        Lcom/huawei/nfc/carrera/util/VibratorUtil$VibratorUtilSAI2;,
        Lcom/huawei/nfc/carrera/util/VibratorUtil$VibratorUtilSAI1;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method

.method public static cancel(Landroid/content/Context;)V
    .locals 3

    .line 103
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Vibrator;

    .line 104
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 106
    const-string v0, "VibratorUtil"

    const-string v1, "vibrate. vib is null."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {v2}, Landroid/os/Vibrator;->cancel()V

    .line 112
    :goto_0
    return-void
.end method

.method public static vibrate(Landroid/content/Context;J)V
    .locals 3

    .line 33
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Vibrator;

    .line 34
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 36
    const-string v0, "VibratorUtil"

    const-string v1, "vibrate. vib is null."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v2, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 42
    :goto_0
    return-void
.end method

.method public static vibrate(Landroid/content/Context;JLandroid/media/AudioAttributes;)V
    .locals 3

    .line 53
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Vibrator;

    .line 54
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 56
    const-string v0, "VibratorUtil"

    const-string v1, "vibrate. vib is null."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v2, p1, p2, p3}, Landroid/os/Vibrator;->vibrate(JLandroid/media/AudioAttributes;)V

    .line 62
    :goto_0
    return-void
.end method

.method public static vibrateRange(Landroid/content/Context;J)V
    .locals 12

    .line 72
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Vibrator;

    .line 73
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 75
    const-string v0, "VibratorUtil"

    const-string v1, "vibrateRange. vib is null."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 80
    :cond_0
    const-wide/16 v0, 0x2

    div-long v0, p1, v0

    const-wide/16 v2, 0x3c

    add-long v5, v0, v2

    .line 82
    const-wide/16 v7, 0x32

    .line 83
    sub-long v0, p1, v5

    sub-long v9, v0, v7

    .line 84
    const-wide/16 v0, 0x0

    cmp-long v0, v9, v0

    if-gez v0, :cond_1

    .line 86
    const-wide/16 v9, 0x0

    .line 88
    :cond_1
    const/4 v0, 0x3

    new-array v11, v0, [J

    const/4 v0, 0x0

    aput-wide v5, v11, v0

    const/4 v0, 0x1

    aput-wide v7, v11, v0

    const/4 v0, 0x2

    aput-wide v9, v11, v0

    .line 91
    const/4 v0, -0x1

    invoke-virtual {v4, v11, v0}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 93
    :goto_0
    return-void
.end method
