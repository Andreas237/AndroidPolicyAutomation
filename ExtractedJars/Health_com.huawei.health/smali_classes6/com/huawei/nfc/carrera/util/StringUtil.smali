.class public final Lcom/huawei/nfc/carrera/util/StringUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method public static isEmpty(Ljava/lang/String;Z)Z
    .locals 2

    .line 29
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 31
    const/4 v0, 0x1

    return v0

    .line 33
    :cond_0
    if-eqz p1, :cond_1

    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_2

    .line 37
    const/4 v0, 0x1

    return v0

    .line 42
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_2

    .line 44
    const/4 v0, 0x1

    return v0

    .line 47
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
