.class public final Lcom/myfitnesspal/shared/utils/Strings;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final equals(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 26
    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    return v0

    .line 27
    :cond_0
    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 28
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 29
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static final isEmpty(Ljava/lang/String;)Z
    .locals 1

    .line 16
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final notEmpty(Ljava/lang/String;)Z
    .locals 1

    .line 21
    invoke-static {p0}, Lcom/myfitnesspal/shared/utils/Strings;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 34
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    return-object v0
.end method
