.class public Lio/sentry/event/interfaces/ExceptionInterface;
.super Ljava/lang/Object;
.source "ExceptionInterface.java"

# interfaces
.implements Lio/sentry/event/interfaces/SentryInterface;


# static fields
.field public static final EXCEPTION_INTERFACE:Ljava/lang/String; = "sentry.interfaces.Exception"


# instance fields
.field private final exceptions:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lio/sentry/event/interfaces/SentryException;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    .line 21
    invoke-static {p1}, Lio/sentry/event/interfaces/SentryException;->extractExceptionQueue(Ljava/lang/Throwable;)Ljava/util/Deque;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/sentry/event/interfaces/ExceptionInterface;-><init>(Ljava/util/Deque;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Deque;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Deque<",
            "Lio/sentry/event/interfaces/SentryException;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lio/sentry/event/interfaces/ExceptionInterface;->exceptions:Ljava/util/Deque;

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

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 58
    :cond_1
    check-cast p1, Lio/sentry/event/interfaces/ExceptionInterface;

    .line 60
    iget-object v0, p0, Lio/sentry/event/interfaces/ExceptionInterface;->exceptions:Ljava/util/Deque;

    iget-object p1, p1, Lio/sentry/event/interfaces/ExceptionInterface;->exceptions:Ljava/util/Deque;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getExceptions()Ljava/util/Deque;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Deque<",
            "Lio/sentry/event/interfaces/SentryException;",
            ">;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lio/sentry/event/interfaces/ExceptionInterface;->exceptions:Ljava/util/Deque;

    return-object v0
.end method

.method public getInterfaceName()Ljava/lang/String;
    .locals 1

    const-string v0, "sentry.interfaces.Exception"

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 66
    iget-object v0, p0, Lio/sentry/event/interfaces/ExceptionInterface;->exceptions:Ljava/util/Deque;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExceptionInterface{exceptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/event/interfaces/ExceptionInterface;->exceptions:Ljava/util/Deque;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
