.class public final Lcom/microblink/internal/Logger;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/Logger$LogLevel;
    }
.end annotation


# static fields
.field private static kLogLevel:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/microblink/internal/Logger$LogLevel;->LOG_WARNINGS_AND_ERRORS:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v0}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v0

    sput v0, Lcom/microblink/internal/Logger;->kLogLevel:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget v0, Lcom/microblink/internal/Logger;->kLogLevel:I

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_DEBUG:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p2}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static varargs d(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget v0, Lcom/microblink/internal/Logger;->kLogLevel:I

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_DEBUG:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p3}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static varargs e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p2}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static varargs e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p3}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method private static format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(?<!\\\\)\\{\\}"

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, v1

    if-ge v2, v4, :cond_2

    add-int/lit8 v4, v2, 0x1

    aget-object v2, v1, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v2, v1

    if-ge v4, v2, :cond_1

    array-length v2, p1

    if-ge v3, v2, :cond_0

    add-int/lit8 v2, v3, 0x1

    aget-object v3, p1, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move v3, v2

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "missing parameter for log message \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    move v2, v4

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getCurrentLogLevel()Lcom/microblink/internal/Logger$LogLevel;
    .locals 2

    invoke-static {}, Lcom/microblink/internal/Logger$LogLevel;->values()[Lcom/microblink/internal/Logger$LogLevel;

    move-result-object v0

    sget v1, Lcom/microblink/internal/Logger;->kLogLevel:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method private static getLineNumber()I
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    return v0
.end method

.method private static getTag(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/String;

    goto :goto_1

    :cond_1
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p0, Ljava/lang/Class;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".java"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/microblink/internal/Logger;->getLineNumber()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/microblink/internal/Logger;->getThreadName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getThreadName()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget v0, Lcom/microblink/internal/Logger;->kLogLevel:I

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_INFORMATION:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p2}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static varargs i(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget v0, Lcom/microblink/internal/Logger;->kLogLevel:I

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_INFORMATION:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p3}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static setLogLevel(Lcom/microblink/internal/Logger$LogLevel;)V
    .locals 0

    invoke-virtual {p0}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result p0

    sput p0, Lcom/microblink/internal/Logger;->kLogLevel:I

    return-void
.end method

.method public static varargs v(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget v0, Lcom/microblink/internal/Logger;->kLogLevel:I

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_VERBOSE:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p2}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static varargs v(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    sget v0, Lcom/microblink/internal/Logger;->kLogLevel:I

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_VERBOSE:Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v1}, Lcom/microblink/internal/Logger$LogLevel;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p3}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static varargs w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p2}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static varargs w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p3}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static varargs wtf(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p2}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x8

    if-lt p2, v0, :cond_0

    invoke-static {p0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static varargs wtf(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-static {p0}, Lcom/microblink/internal/Logger;->getTag(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p3}, Lcom/microblink/internal/Logger;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x8

    if-lt p3, v0, :cond_0

    invoke-static {p0, p2, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_0
    invoke-static {p0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
