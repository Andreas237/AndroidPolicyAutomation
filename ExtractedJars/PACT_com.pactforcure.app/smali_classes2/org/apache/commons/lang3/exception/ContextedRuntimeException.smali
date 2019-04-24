.class public Lorg/apache/commons/lang3/exception/ContextedRuntimeException;
.super Ljava/lang/RuntimeException;
.source "ContextedRuntimeException.java"

# interfaces
.implements Lorg/apache/commons/lang3/exception/ExceptionContext;


# static fields
.field private static final serialVersionUID:J = 0x132dd72L


# instance fields
.field private final exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 98
    new-instance v0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    invoke-direct {v0}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    .line 99
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 109
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 110
    new-instance v0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    invoke-direct {v0}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    .line 111
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "cause"    # Ljava/lang/Throwable;

    .prologue
    .line 134
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    new-instance v0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    invoke-direct {v0}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    .line 136
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lorg/apache/commons/lang3/exception/ExceptionContext;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "cause"    # Ljava/lang/Throwable;
    .param p3, "context"    # Lorg/apache/commons/lang3/exception/ExceptionContext;

    .prologue
    .line 146
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    if-nez p3, :cond_0

    .line 148
    new-instance p3, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    .end local p3    # "context":Lorg/apache/commons/lang3/exception/ExceptionContext;
    invoke-direct {p3}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;-><init>()V

    .line 150
    .restart local p3    # "context":Lorg/apache/commons/lang3/exception/ExceptionContext;
    :cond_0
    iput-object p3, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    .line 151
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "cause"    # Ljava/lang/Throwable;

    .prologue
    .line 121
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 122
    new-instance v0, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;

    invoke-direct {v0}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    .line 123
    return-void
.end method


# virtual methods
.method public addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ContextedRuntimeException;
    .locals 1
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 168
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    invoke-interface {v0, p1, p2}, Lorg/apache/commons/lang3/exception/ExceptionContext;->addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ExceptionContext;

    .line 169
    return-object p0
.end method

.method public bridge synthetic addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ExceptionContext;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 84
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->addContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ContextedRuntimeException;

    move-result-object v0

    return-object v0
.end method

.method public getContextEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/apache/commons/lang3/tuple/Pair",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 208
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    invoke-interface {v0}, Lorg/apache/commons/lang3/exception/ExceptionContext;->getContextEntries()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getContextLabels()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 215
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    invoke-interface {v0}, Lorg/apache/commons/lang3/exception/ExceptionContext;->getContextLabels()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getContextValues(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .param p1, "label"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 194
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    invoke-interface {v0, p1}, Lorg/apache/commons/lang3/exception/ExceptionContext;->getContextValues(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getFirstContextValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1, "label"    # Ljava/lang/String;

    .prologue
    .line 201
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    invoke-interface {v0, p1}, Lorg/apache/commons/lang3/exception/ExceptionContext;->getFirstContextValue(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getFormattedExceptionMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "baseMessage"    # Ljava/lang/String;

    .prologue
    .line 233
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    invoke-interface {v0, p1}, Lorg/apache/commons/lang3/exception/ExceptionContext;->getFormattedExceptionMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 226
    invoke-super {p0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->getFormattedExceptionMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ContextedRuntimeException;
    .locals 1
    .param p1, "label"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    .prologue
    .line 186
    iget-object v0, p0, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->exceptionContext:Lorg/apache/commons/lang3/exception/ExceptionContext;

    invoke-interface {v0, p1, p2}, Lorg/apache/commons/lang3/exception/ExceptionContext;->setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ExceptionContext;

    .line 187
    return-object p0
.end method

.method public bridge synthetic setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ExceptionContext;
    .locals 1
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # Ljava/lang/Object;

    .prologue
    .line 84
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/exception/ContextedRuntimeException;->setContextValue(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/commons/lang3/exception/ContextedRuntimeException;

    move-result-object v0

    return-object v0
.end method
