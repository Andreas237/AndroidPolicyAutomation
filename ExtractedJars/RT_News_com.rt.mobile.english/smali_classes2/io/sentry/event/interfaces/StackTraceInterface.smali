.class public Lio/sentry/event/interfaces/StackTraceInterface;
.super Ljava/lang/Object;
.source "StackTraceInterface.java"

# interfaces
.implements Lio/sentry/event/interfaces/SentryInterface;


# static fields
.field public static final STACKTRACE_INTERFACE:Ljava/lang/String; = "sentry.interfaces.Stacktrace"


# instance fields
.field private final framesCommonWithEnclosing:I

.field private final stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;


# direct methods
.method public constructor <init>([Lio/sentry/event/interfaces/SentryStackTraceElement;)V
    .locals 2

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 72
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lio/sentry/event/interfaces/SentryStackTraceElement;

    iput-object p1, p0, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    .line 73
    iput v0, p0, Lio/sentry/event/interfaces/StackTraceInterface;->framesCommonWithEnclosing:I

    return-void
.end method

.method public constructor <init>([Ljava/lang/StackTraceElement;)V
    .locals 2

    const/4 v0, 0x0

    .line 24
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lio/sentry/event/interfaces/StackTraceInterface;-><init>([Ljava/lang/StackTraceElement;[Ljava/lang/StackTraceElement;[Lio/sentry/jvmti/Frame;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/StackTraceElement;[Ljava/lang/StackTraceElement;)V
    .locals 1

    const/4 v0, 0x0

    .line 38
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/event/interfaces/StackTraceInterface;-><init>([Ljava/lang/StackTraceElement;[Ljava/lang/StackTraceElement;[Lio/sentry/jvmti/Frame;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/StackTraceElement;[Ljava/lang/StackTraceElement;[Lio/sentry/jvmti/Frame;)V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-static {p1, p3}, Lio/sentry/event/interfaces/SentryStackTraceElement;->fromStackTraceElements([Ljava/lang/StackTraceElement;[Lio/sentry/jvmti/Frame;)[Lio/sentry/event/interfaces/SentryStackTraceElement;

    move-result-object p3

    iput-object p3, p0, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    .line 57
    array-length p3, p1

    add-int/lit8 p3, p3, -0x1

    .line 58
    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz p3, :cond_0

    if-ltz v0, :cond_0

    .line 59
    aget-object v1, p1, p3

    aget-object v2, p2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StackTraceElement;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 p3, p3, -0x1

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 63
    :cond_0
    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    sub-int/2addr p1, p3

    iput p1, p0, Lio/sentry/event/interfaces/StackTraceInterface;->framesCommonWithEnclosing:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 98
    :cond_1
    check-cast p1, Lio/sentry/event/interfaces/StackTraceInterface;

    .line 100
    iget-object v0, p0, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    iget-object p1, p1, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getFramesCommonWithEnclosing()I
    .locals 1

    .line 86
    iget v0, p0, Lio/sentry/event/interfaces/StackTraceInterface;->framesCommonWithEnclosing:I

    return v0
.end method

.method public getInterfaceName()Ljava/lang/String;
    .locals 1

    const-string v0, "sentry.interfaces.Stacktrace"

    return-object v0
.end method

.method public getStackTrace()[Lio/sentry/event/interfaces/SentryStackTraceElement;
    .locals 2

    .line 82
    iget-object v0, p0, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    iget-object v1, p0, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/event/interfaces/SentryStackTraceElement;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 105
    iget-object v0, p0, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StackTraceInterface{stackTrace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/event/interfaces/StackTraceInterface;->stackTrace:[Lio/sentry/event/interfaces/SentryStackTraceElement;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
