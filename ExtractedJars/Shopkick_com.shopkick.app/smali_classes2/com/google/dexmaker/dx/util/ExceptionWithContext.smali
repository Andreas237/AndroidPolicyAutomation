.class public Lcom/google/dexmaker/dx/util/ExceptionWithContext;
.super Ljava/lang/RuntimeException;
.source "ExceptionWithContext.java"


# instance fields
.field private context:Ljava/lang/StringBuffer;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 78
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    instance-of p1, p2, Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    const/16 v0, 0xc8

    if-eqz p1, :cond_2

    .line 83
    check-cast p2, Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    iget-object p1, p2, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    .line 84
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-direct {p2, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object p2, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 85
    iget-object p2, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 87
    :cond_2
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    :goto_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, v0, p1}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/google/dexmaker/dx/util/ExceptionWithContext;
    .locals 1

    .line 43
    instance-of v0, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    if-eqz v0, :cond_0

    .line 44
    check-cast p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    goto :goto_0

    .line 46
    :cond_0
    new-instance v0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;-><init>(Ljava/lang/Throwable;)V

    move-object p0, v0

    .line 49
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public addContext(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 115
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "\n"

    .line 116
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 117
    iget-object p1, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_0
    return-void

    .line 112
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo v0, "str == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getContext()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public printContext(Ljava/io/PrintStream;)V
    .locals 1

    .line 136
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V

    return-void
.end method

.method public printContext(Ljava/io/PrintWriter;)V
    .locals 1

    .line 146
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    return-void
.end method

.method public printStackTrace(Ljava/io/PrintStream;)V
    .locals 1

    .line 94
    invoke-super {p0, p1}, Ljava/lang/RuntimeException;->printStackTrace(Ljava/io/PrintStream;)V

    .line 95
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method public printStackTrace(Ljava/io/PrintWriter;)V
    .locals 1

    .line 101
    invoke-super {p0, p1}, Ljava/lang/RuntimeException;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 102
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    return-void
.end method
