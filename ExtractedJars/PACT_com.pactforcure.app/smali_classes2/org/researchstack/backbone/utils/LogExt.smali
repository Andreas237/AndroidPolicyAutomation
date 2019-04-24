.class public Lorg/researchstack/backbone/utils/LogExt;
.super Ljava/lang/Object;
.source "LogExt.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 74
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 75
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 85
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 86
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1, p2}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 80
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 91
    invoke-static {p0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 92
    return-void
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 42
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 43
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 59
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 60
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1, p2}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    return-void
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/Throwable;)V
    .locals 2
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 53
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 54
    .local v0, "tag":Ljava/lang/String;
    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 48
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 65
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    return-void
.end method

.method public static i(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 16
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 17
    .local v0, "tag":Ljava/lang/String;
    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    return-void
.end method

.method public static i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 27
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 28
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1, p2}, Lorg/researchstack/backbone/utils/LogExt;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 22
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 33
    invoke-static {p0, p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 34
    return-void
.end method

.method private static tagMe(Ljava/lang/Class;)Ljava/lang/String;
    .locals 5
    .param p0, "c"    # Ljava/lang/Class;

    .prologue
    .line 136
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    .line 137
    .local v2, "threadId":J
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 139
    .local v0, "simpleName":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ":["

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "]"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static ua(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 126
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 127
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    return-void
.end method

.method public static w(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 100
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 101
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1}, Lorg/researchstack/backbone/utils/LogExt;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void
.end method

.method public static w(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0, "c"    # Ljava/lang/Class;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 111
    invoke-static {p0}, Lorg/researchstack/backbone/utils/LogExt;->tagMe(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 112
    .local v0, "tag":Ljava/lang/String;
    invoke-static {v0, p1, p2}, Lorg/researchstack/backbone/utils/LogExt;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 106
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p0, "tag"    # Ljava/lang/String;
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 117
    invoke-static {p0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 118
    return-void
.end method
