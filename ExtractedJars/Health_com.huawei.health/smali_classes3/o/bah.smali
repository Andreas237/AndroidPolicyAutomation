.class public Lo/bah;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 3

    .line 62
    const-string v0, "verifyMsgMaxLength"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maxLength:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const/16 v0, 0x64

    if-lt p0, v0, :cond_0

    const/16 v0, 0x2710

    if-gt p0, v0, :cond_0

    .line 65
    return p0

    .line 69
    :cond_0
    const/16 v0, 0x258

    return v0
.end method

.method public static b(I)I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TrulyRandom"
        }
    .end annotation

    .line 100
    const/4 v0, 0x1

    if-gt p0, v0, :cond_0

    .line 102
    const/4 v0, 0x1

    return v0

    .line 104
    :cond_0
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 105
    add-int/lit8 v0, p0, 0x1

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v2

    .line 106
    if-nez v2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0
.end method

.method public static c(I)I
    .locals 1

    .line 44
    const/16 v0, 0x3c

    if-lt p0, v0, :cond_0

    const/16 v0, 0xe10

    if-gt p0, v0, :cond_0

    .line 46
    return p0

    .line 50
    :cond_0
    const/16 v0, 0x12c

    return v0
.end method

.method public static d(I)I
    .locals 1

    .line 80
    const/16 v0, 0x3c

    if-lt p0, v0, :cond_0

    .line 82
    return p0

    .line 86
    :cond_0
    const/16 v0, 0x708

    return v0
.end method

.method public static e(I)I
    .locals 1

    .line 26
    const/16 v0, 0xa

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    .line 28
    return p0

    .line 32
    :cond_0
    const/4 v0, 0x3

    return v0
.end method
