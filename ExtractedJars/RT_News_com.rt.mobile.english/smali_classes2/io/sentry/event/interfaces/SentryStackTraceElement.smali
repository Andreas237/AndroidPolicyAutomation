.class public Lio/sentry/event/interfaces/SentryStackTraceElement;
.super Ljava/lang/Object;
.source "SentryStackTraceElement.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final absPath:Ljava/lang/String;

.field private final colno:Ljava/lang/Integer;

.field private final fileName:Ljava/lang/String;

.field private final function:Ljava/lang/String;

.field private final lineno:I

.field private final locals:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Ljava/lang/String;

.field private final platform:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 36
    invoke-direct/range {v0 .. v8}, Lio/sentry/event/interfaces/SentryStackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->module:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->function:Ljava/lang/String;

    .line 57
    iput-object p3, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->fileName:Ljava/lang/String;

    .line 58
    iput p4, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->lineno:I

    .line 59
    iput-object p5, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->colno:Ljava/lang/Integer;

    .line 60
    iput-object p6, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->absPath:Ljava/lang/String;

    .line 61
    iput-object p7, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->platform:Ljava/lang/String;

    .line 62
    iput-object p8, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->locals:Ljava/util/Map;

    return-void
.end method

.method public static fromStackTraceElement(Ljava/lang/StackTraceElement;)Lio/sentry/event/interfaces/SentryStackTraceElement;
    .locals 1

    const/4 v0, 0x0

    .line 170
    invoke-static {p0, v0}, Lio/sentry/event/interfaces/SentryStackTraceElement;->fromStackTraceElement(Ljava/lang/StackTraceElement;Ljava/util/Map;)Lio/sentry/event/interfaces/SentryStackTraceElement;

    move-result-object p0

    return-object p0
.end method

.method private static fromStackTraceElement(Ljava/lang/StackTraceElement;Ljava/util/Map;)Lio/sentry/event/interfaces/SentryStackTraceElement;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StackTraceElement;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/sentry/event/interfaces/SentryStackTraceElement;"
        }
    .end annotation

    .line 175
    new-instance v9, Lio/sentry/event/interfaces/SentryStackTraceElement;

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v9

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lio/sentry/event/interfaces/SentryStackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v9
.end method

.method public static fromStackTraceElements([Ljava/lang/StackTraceElement;)[Lio/sentry/event/interfaces/SentryStackTraceElement;
    .locals 1

    const/4 v0, 0x0

    .line 105
    invoke-static {p0, v0}, Lio/sentry/event/interfaces/SentryStackTraceElement;->fromStackTraceElements([Ljava/lang/StackTraceElement;[Lio/sentry/jvmti/Frame;)[Lio/sentry/event/interfaces/SentryStackTraceElement;

    move-result-object p0

    return-object p0
.end method

.method public static fromStackTraceElements([Ljava/lang/StackTraceElement;[Lio/sentry/jvmti/Frame;)[Lio/sentry/event/interfaces/SentryStackTraceElement;
    .locals 7

    const/4 v0, 0x0

    .line 139
    array-length v1, p0

    new-array v1, v1, [Lio/sentry/event/interfaces/SentryStackTraceElement;

    move v2, v0

    .line 140
    :goto_0
    array-length v3, p0

    if-ge v0, v3, :cond_2

    .line 141
    aget-object v3, p0, v0

    const/4 v4, 0x0

    if-eqz p1, :cond_1

    .line 146
    :goto_1
    array-length v5, p1

    if-ge v2, v5, :cond_0

    aget-object v5, p1, v2

    invoke-virtual {v5}, Lio/sentry/jvmti/Frame;->getMethod()Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 152
    :cond_0
    array-length v5, p1

    if-ge v2, v5, :cond_1

    .line 153
    aget-object v4, p1, v2

    invoke-virtual {v4}, Lio/sentry/jvmti/Frame;->getLocals()Ljava/util/Map;

    move-result-object v4

    .line 157
    :cond_1
    invoke-static {v3, v4}, Lio/sentry/event/interfaces/SentryStackTraceElement;->fromStackTraceElement(Ljava/lang/StackTraceElement;Ljava/util/Map;)Lio/sentry/event/interfaces/SentryStackTraceElement;

    move-result-object v3

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 195
    :cond_1
    check-cast p1, Lio/sentry/event/interfaces/SentryStackTraceElement;

    .line 196
    iget v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->lineno:I

    iget v3, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->lineno:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->module:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->module:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->function:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->function:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->fileName:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->fileName:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->colno:Ljava/lang/Integer;

    iget-object v3, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->colno:Ljava/lang/Integer;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->absPath:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->absPath:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->platform:Ljava/lang/String;

    iget-object v3, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->platform:Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->locals:Ljava/util/Map;

    iget-object p1, p1, Lio/sentry/event/interfaces/SentryStackTraceElement;->locals:Ljava/util/Map;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public getAbsPath()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->absPath:Ljava/lang/String;

    return-object v0
.end method

.method public getColno()Ljava/lang/Integer;
    .locals 1

    .line 83
    iget-object v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->colno:Ljava/lang/Integer;

    return-object v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public getFunction()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->function:Ljava/lang/String;

    return-object v0
.end method

.method public getLineno()I
    .locals 1

    .line 79
    iget v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->lineno:I

    return v0
.end method

.method public getLocals()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 95
    iget-object v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->locals:Ljava/util/Map;

    return-object v0
.end method

.method public getModule()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->module:Ljava/lang/String;

    return-object v0
.end method

.method public getPlatform()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->platform:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x8

    .line 208
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->module:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->function:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->fileName:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->lineno:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->colno:Ljava/lang/Integer;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->absPath:Ljava/lang/String;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->platform:Ljava/lang/String;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->locals:Ljava/util/Map;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SentryStackTraceElement{module=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->module:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", function=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->function:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", fileName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->fileName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", lineno="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->lineno:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", colno="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->colno:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", absPath=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->absPath:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", platform=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->platform:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", locals=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/event/interfaces/SentryStackTraceElement;->locals:Ljava/util/Map;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
