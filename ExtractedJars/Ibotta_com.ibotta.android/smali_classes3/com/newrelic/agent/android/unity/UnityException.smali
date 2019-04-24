.class public Lcom/newrelic/agent/android/unity/UnityException;
.super Ljava/lang/RuntimeException;
.source "UnityException.java"


# instance fields
.field private sourceExceptionType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    .line 19
    iput-object p1, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/StackTraceElement;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    .line 28
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/unity/UnityException;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method


# virtual methods
.method public appendStackFrame(Ljava/lang/StackTraceElement;)V
    .locals 4

    .line 32
    invoke-virtual {p0}, Lcom/newrelic/agent/android/unity/UnityException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 33
    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [Ljava/lang/StackTraceElement;

    const/4 v2, 0x0

    .line 34
    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_0

    .line 35
    aget-object v3, v0, v2

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 37
    :cond_0
    array-length v0, v0

    aput-object p1, v1, v0

    .line 38
    invoke-virtual {p0, v1}, Lcom/newrelic/agent/android/unity/UnityException;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method public appendStackFrame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 42
    new-instance v0, Ljava/lang/StackTraceElement;

    invoke-direct {v0, p1, p2, p3, p4}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 43
    invoke-virtual {p0}, Lcom/newrelic/agent/android/unity/UnityException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    .line 44
    array-length p2, p1

    add-int/lit8 p2, p2, 0x1

    new-array p2, p2, [Ljava/lang/StackTraceElement;

    const/4 p3, 0x0

    .line 45
    :goto_0
    array-length p4, p1

    if-ge p3, p4, :cond_0

    .line 46
    aget-object p4, p1, p3

    aput-object p4, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 48
    :cond_0
    array-length p1, p1

    aput-object v0, p2, p1

    .line 49
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/unity/UnityException;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method public setSourceExceptionType(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/unity/UnityException;->sourceExceptionType:Ljava/lang/String;

    :goto_0
    return-object v0
.end method
