.class public Lcom/shopkick/logging/Message;
.super Ljava/lang/Object;
.source "Message.java"


# static fields
.field public static final MESSAGE_PARAM_CLASS_NAME:Ljava/lang/String; = "CLASS_NAME"

.field public static final MESSAGE_PARAM_EVENT:Ljava/lang/String; = "EVENT"

.field public static final MESSAGE_PARAM_LEVEL:Ljava/lang/String; = "LEVEL"

.field public static final MESSAGE_PARAM_LINE_NUMBER:Ljava/lang/String; = "LINE_NUMBER"

.field public static final MESSAGE_PARAM_TEXT:Ljava/lang/String; = "TEXT"

.field public static final MESSAGE_PARAM_THREAD_ID:Ljava/lang/String; = "THREAD_ID"

.field public static final MESSAGE_PARAM_THROWABLE:Ljava/lang/String; = "THROWABLE"


# instance fields
.field private final areas:J

.field private final params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final timestamp:J

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/util/Map;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v7, p3

    move-object v8, p4

    .line 97
    invoke-direct/range {v0 .. v8}, Lcom/shopkick/logging/Message;-><init>(Lcom/shopkick/logging/Level;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/logging/Level;JILjava/util/Map;Ljava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/logging/Level;",
            "JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 56
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, ""

    const/4 v0, 0x0

    move-object v6, v0

    check-cast v6, Ljava/lang/Throwable;

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/shopkick/logging/Message;-><init>(Lcom/shopkick/logging/Level;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/String;)V

    if-ltz p4, :cond_0

    .line 58
    invoke-direct {p0}, Lcom/shopkick/logging/Message;->setContextElements()V

    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'event\' cannot be less than zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Lcom/shopkick/logging/Level;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/logging/Level;",
            "J",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_3

    if-eqz p7, :cond_1

    .line 112
    invoke-interface {p7}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 113
    invoke-interface {p7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "."

    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 115
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Keys in \'params\' map cannot contain \'.\'"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :cond_1
    iput-wide p2, p0, Lcom/shopkick/logging/Message;->areas:J

    .line 121
    iput-object p8, p0, Lcom/shopkick/logging/Message;->userId:Ljava/lang/String;

    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/shopkick/logging/Message;->timestamp:J

    if-nez p7, :cond_2

    .line 126
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/logging/Message;->params:Ljava/util/Map;

    goto :goto_1

    .line 128
    :cond_2
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2, p7}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/shopkick/logging/Message;->params:Ljava/util/Map;

    :goto_1
    const-string p2, "LEVEL"

    .line 130
    invoke-direct {p0, p2, p1}, Lcom/shopkick/logging/Message;->updateParams(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "EVENT"

    .line 132
    invoke-direct {p0, p1, p4}, Lcom/shopkick/logging/Message;->updateParams(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "TEXT"

    .line 133
    invoke-direct {p0, p1, p5}, Lcom/shopkick/logging/Message;->updateParams(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "THROWABLE"

    .line 134
    invoke-direct {p0, p1, p6}, Lcom/shopkick/logging/Message;->updateParams(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 111
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'area\' cannot be less than or equal to 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcom/shopkick/logging/Level;JLjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 9

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p4

    move-object v6, p5

    move-object v8, p6

    .line 79
    invoke-direct/range {v0 .. v8}, Lcom/shopkick/logging/Message;-><init>(Lcom/shopkick/logging/Level;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    .line 81
    invoke-direct {p0}, Lcom/shopkick/logging/Message;->setContextElements()V

    return-void

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'text\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private setContextElements()V
    .locals 6

    .line 141
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    const/4 v1, 0x2

    .line 142
    :goto_0
    array-length v2, v0

    const/4 v3, 0x0

    if-ge v1, v2, :cond_2

    .line 143
    const-class v2, Lcom/shopkick/logging/Message;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-class v2, Lcom/shopkick/logging/DiagnosticLogger;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    aget-object v3, v0, v1

    .line 144
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 147
    :cond_0
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    .line 148
    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move-object v0, v3

    :goto_2
    const-string v1, "THREAD_ID"

    .line 152
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/shopkick/logging/Message;->updateParams(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "CLASS_NAME"

    if-nez v3, :cond_3

    const-string v3, ""

    .line 153
    :cond_3
    invoke-direct {p0, v1, v3}, Lcom/shopkick/logging/Message;->updateParams(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "LINE_NUMBER"

    if-nez v0, :cond_4

    const/4 v0, -0x1

    goto :goto_3

    .line 154
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/shopkick/logging/Message;->updateParams(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private updateParams(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 202
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/shopkick/logging/Message;->params:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getAreas()J
    .locals 2

    .line 158
    iget-wide v0, p0, Lcom/shopkick/logging/Message;->areas:J

    return-wide v0
.end method

.method public getParams()Ljava/util/Map;
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

    .line 164
    iget-object v0, p0, Lcom/shopkick/logging/Message;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 170
    iget-wide v0, p0, Lcom/shopkick/logging/Message;->timestamp:J

    return-wide v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/shopkick/logging/Message;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 181
    iget-object v0, p0, Lcom/shopkick/logging/Message;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 182
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public safelyExtractString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 194
    iget-object v0, p0, Lcom/shopkick/logging/Message;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
