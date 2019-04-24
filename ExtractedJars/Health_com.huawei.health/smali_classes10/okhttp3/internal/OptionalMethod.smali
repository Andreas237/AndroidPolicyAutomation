.class Lokhttp3/internal/OptionalMethod;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final methodName:Ljava/lang/String;

.field private final methodParams:[Ljava/lang/Class;

.field private final returnType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/Class;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lokhttp3/internal/OptionalMethod;->returnType:Ljava/lang/Class;

    .line 47
    iput-object p2, p0, Lokhttp3/internal/OptionalMethod;->methodName:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Lokhttp3/internal/OptionalMethod;->methodParams:[Ljava/lang/Class;

    .line 49
    return-void
.end method

.method private getMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 147
    const/4 v2, 0x0

    .line 148
    iget-object v0, p0, Lokhttp3/internal/OptionalMethod;->methodName:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lokhttp3/internal/OptionalMethod;->methodName:Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/internal/OptionalMethod;->methodParams:[Ljava/lang/Class;

    invoke-static {p1, v0, v1}, Lokhttp3/internal/OptionalMethod;->getPublicMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 150
    if-eqz v2, :cond_0

    iget-object v0, p0, Lokhttp3/internal/OptionalMethod;->returnType:Ljava/lang/Class;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/OptionalMethod;->returnType:Ljava/lang/Class;

    .line 152
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    const/4 v2, 0x0

    .line 158
    :cond_0
    return-object v2
.end method

.method private static getPublicMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 162
    const/4 v2, 0x0

    .line 164
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    move-object v2, v0

    .line 165
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    .line 166
    const/4 v2, 0x0

    .line 170
    :cond_0
    goto :goto_0

    .line 168
    :catch_0
    move-exception v3

    .line 171
    :goto_0
    return-object v2
.end method


# virtual methods
.method public varargs invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lokhttp3/internal/OptionalMethod;->getMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 107
    if-nez v3, :cond_0

    .line 108
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/OptionalMethod;->methodName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not supported for object "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 111
    :cond_0
    :try_start_0
    invoke-virtual {v3, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 112
    :catch_0
    move-exception v4

    .line 114
    new-instance v5, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpectedly could not call: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 115
    invoke-virtual {v5, v4}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 116
    throw v5
.end method

.method public varargs invokeOptional(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lokhttp3/internal/OptionalMethod;->getMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 67
    if-nez v1, :cond_0

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 71
    :cond_0
    :try_start_0
    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 72
    :catch_0
    move-exception v2

    .line 73
    const/4 v0, 0x0

    return-object v0
.end method

.method public varargs invokeOptionalWithoutCheckedException(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 86
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/internal/OptionalMethod;->invokeOptional(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 87
    :catch_0
    move-exception v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v2

    .line 89
    instance-of v0, v2, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    .line 90
    move-object v0, v2

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 92
    :cond_0
    new-instance v3, Ljava/lang/AssertionError;

    const-string v0, "Unexpected exception"

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 93
    invoke-virtual {v3, v2}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 94
    throw v3
.end method

.method public varargs invokeWithoutCheckedException(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 129
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lokhttp3/internal/OptionalMethod;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 130
    :catch_0
    move-exception v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v2

    .line 132
    instance-of v0, v2, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    .line 133
    move-object v0, v2

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 135
    :cond_0
    new-instance v3, Ljava/lang/AssertionError;

    const-string v0, "Unexpected exception"

    invoke-direct {v3, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 136
    invoke-virtual {v3, v2}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 137
    throw v3
.end method

.method public isSupported(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lokhttp3/internal/OptionalMethod;->getMethod(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
