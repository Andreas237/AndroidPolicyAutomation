.class public Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;
.super Ljava/lang/Object;
.source "AgentDataBuilder.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static attributesMapFromAgentData(Lcom/newrelic/mobile/fbs/AgentData;)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/mobile/fbs/AgentData;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 309
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 311
    :goto_0
    invoke-virtual {p0}, Lcom/newrelic/mobile/fbs/AgentData;->stringAttributesLength()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 312
    invoke-virtual {p0, v2}, Lcom/newrelic/mobile/fbs/AgentData;->stringAttributes(I)Lcom/newrelic/mobile/fbs/StringSessionAttribute;

    move-result-object v3

    .line 313
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/StringSessionAttribute;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/StringSessionAttribute;->value()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 316
    :goto_1
    invoke-virtual {p0}, Lcom/newrelic/mobile/fbs/AgentData;->longAttributesLength()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 317
    invoke-virtual {p0, v2}, Lcom/newrelic/mobile/fbs/AgentData;->longAttributes(I)Lcom/newrelic/mobile/fbs/LongSessionAttribute;

    move-result-object v3

    .line 318
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/LongSessionAttribute;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/LongSessionAttribute;->value()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 321
    :goto_2
    invoke-virtual {p0}, Lcom/newrelic/mobile/fbs/AgentData;->doubleAttributesLength()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 322
    invoke-virtual {p0, v2}, Lcom/newrelic/mobile/fbs/AgentData;->doubleAttributes(I)Lcom/newrelic/mobile/fbs/DoubleSessionAttribute;

    move-result-object v3

    .line 323
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/DoubleSessionAttribute;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/DoubleSessionAttribute;->value()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 326
    :goto_3
    invoke-virtual {p0}, Lcom/newrelic/mobile/fbs/AgentData;->boolAttributesLength()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 327
    invoke-virtual {p0, v2}, Lcom/newrelic/mobile/fbs/AgentData;->boolAttributes(I)Lcom/newrelic/mobile/fbs/BoolSessionAttribute;

    move-result-object v3

    .line 328
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/BoolSessionAttribute;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/BoolSessionAttribute;->value()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    .line 331
    :goto_4
    invoke-virtual {p0}, Lcom/newrelic/mobile/fbs/AgentData;->handledExceptionsLength()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 332
    invoke-virtual {p0, v2}, Lcom/newrelic/mobile/fbs/AgentData;->handledExceptions(I)Lcom/newrelic/mobile/fbs/hex/HandledException;

    move-result-object v3

    const-string v4, "timestampMs"

    .line 333
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/hex/HandledException;->timestampMs()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "appUuidHigh"

    .line 334
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/hex/HandledException;->appUuidHigh()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "appUuidLow"

    .line 335
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/hex/HandledException;->appUuidLow()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "name"

    .line 336
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/hex/HandledException;->name()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "cause"

    .line 337
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/hex/HandledException;->cause()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "message"

    .line 338
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/hex/HandledException;->message()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    .line 339
    :goto_5
    invoke-virtual {v3}, Lcom/newrelic/mobile/fbs/hex/HandledException;->threadsLength()I

    move-result v5

    if-ge v4, v5, :cond_5

    .line 340
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v5

    .line 341
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v7, 0x0

    .line 342
    :goto_6
    invoke-virtual {v3, v4}, Lcom/newrelic/mobile/fbs/hex/HandledException;->threads(I)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object v8

    invoke-virtual {v8}, Lcom/newrelic/mobile/fbs/hex/Thread;->framesLength()I

    move-result v8

    if-ge v7, v8, :cond_4

    .line 343
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v9, "fileName"

    .line 344
    invoke-virtual {v3, v4}, Lcom/newrelic/mobile/fbs/hex/HandledException;->threads(I)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/newrelic/mobile/fbs/hex/Thread;->frames(I)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object v10

    invoke-virtual {v10}, Lcom/newrelic/mobile/fbs/hex/Frame;->fileName()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "lineNumber"

    .line 345
    invoke-virtual {v3, v4}, Lcom/newrelic/mobile/fbs/hex/HandledException;->threads(I)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/newrelic/mobile/fbs/hex/Thread;->frames(I)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object v10

    invoke-virtual {v10}, Lcom/newrelic/mobile/fbs/hex/Frame;->lineNumber()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "className"

    .line 346
    invoke-virtual {v3, v4}, Lcom/newrelic/mobile/fbs/hex/HandledException;->threads(I)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/newrelic/mobile/fbs/hex/Thread;->frames(I)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object v10

    invoke-virtual {v10}, Lcom/newrelic/mobile/fbs/hex/Frame;->className()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v9, "methodName"

    .line 347
    invoke-virtual {v3, v4}, Lcom/newrelic/mobile/fbs/hex/HandledException;->threads(I)Lcom/newrelic/mobile/fbs/hex/Thread;

    move-result-object v10

    invoke-virtual {v10, v7}, Lcom/newrelic/mobile/fbs/hex/Thread;->frames(I)Lcom/newrelic/mobile/fbs/hex/Frame;

    move-result-object v10

    invoke-virtual {v10}, Lcom/newrelic/mobile/fbs/hex/Frame;->methodName()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "frame "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_4
    const-string v7, "crashed"

    .line 351
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "state"

    .line 352
    invoke-virtual {v5}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Thread$State;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "threadNumber"

    .line 353
    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "threadId"

    .line 354
    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "priority"

    .line 355
    invoke-virtual {v5}, Ljava/lang/Thread;->getPriority()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "thread "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_5

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_4

    :cond_6
    return-object v0
.end method

.method protected static computeIfAbsent(Ljava/lang/String;Ljava/util/Map;Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;",
            ")V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 33
    invoke-interface {p1, p0}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    invoke-virtual {p2, p0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result p2

    .line 35
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static startAndFinishAgentData(Ljava/util/Map;Ljava/util/Set;)Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)",
            "Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;"
        }
    .end annotation

    .line 46
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 48
    new-instance v1, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;

    invoke-direct {v1}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;-><init>()V

    .line 51
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 53
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 55
    invoke-static {v4, v0, v1}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->computeIfAbsent(Ljava/lang/String;Ljava/util/Map;Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    .line 56
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    invoke-static {v3, v0, v1}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->computeIfAbsent(Ljava/lang/String;Ljava/util/Map;Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 64
    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const-string v4, "name"

    .line 65
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v0, v1}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->computeIfAbsent(Ljava/lang/String;Ljava/util/Map;Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    const-string v4, "message"

    .line 66
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v0, v1}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->computeIfAbsent(Ljava/lang/String;Ljava/util/Map;Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    const-string v4, "cause"

    .line 67
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v0, v1}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->computeIfAbsent(Ljava/lang/String;Ljava/util/Map;Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    const-string v4, "thread"

    .line 69
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_1

    .line 73
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 74
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_9

    .line 78
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    .line 79
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v7, "fileName"

    const-string v8, ""

    .line 81
    invoke-virtual {v1, v8}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 84
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 85
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    .line 87
    instance-of v10, v8, Ljava/lang/String;

    if-eqz v10, :cond_3

    .line 88
    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v8}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->createString(Ljava/lang/CharSequence;)I

    move-result v8

    .line 89
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 95
    :cond_4
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/hex/Frame;->startFrame(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    const-string v7, "className"

    .line 96
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_5

    const-string v7, "className"

    .line 97
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v1, v7}, Lcom/newrelic/mobile/fbs/hex/Frame;->addClassName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_5
    const-string v7, "methodName"

    .line 99
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_6

    const-string v7, "methodName"

    .line 100
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v1, v7}, Lcom/newrelic/mobile/fbs/hex/Frame;->addMethodName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_6
    const-string v7, "fileName"

    .line 102
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_7

    const-string v7, "fileName"

    .line 103
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v1, v6}, Lcom/newrelic/mobile/fbs/hex/Frame;->addFileName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_7
    const-string v6, "lineNumber"

    .line 105
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_8

    const-string v6, "lineNumber"

    .line 106
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-long v5, v5

    invoke-static {v1, v5, v6}, Lcom/newrelic/mobile/fbs/hex/Frame;->addLineNumber(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 109
    :cond_8
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/hex/Frame;->endFrame(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result v5

    .line 110
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 115
    :cond_9
    invoke-static {v3}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-static {v1, v2}, Lcom/newrelic/mobile/fbs/hex/Thread;->createFramesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v2

    .line 116
    invoke-static {v1, v2}, Lcom/newrelic/mobile/fbs/hex/Thread;->createThread(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)I

    move-result v2

    .line 117
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    invoke-static {v4}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-static {v1, v2}, Lcom/newrelic/mobile/fbs/hex/HandledException;->createThreadsVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v2

    .line 121
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 122
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 123
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 124
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 126
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_a
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 127
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 128
    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 129
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    .line 131
    instance-of v10, v8, Ljava/lang/String;

    if-eqz v10, :cond_b

    .line 132
    invoke-interface {v0, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v1, v9, v8}, Lcom/newrelic/mobile/fbs/StringSessionAttribute;->createStringSessionAttribute(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;II)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 136
    :cond_b
    instance-of v10, v8, Ljava/lang/Double;

    if-nez v10, :cond_e

    instance-of v10, v8, Ljava/lang/Float;

    if-eqz v10, :cond_c

    goto :goto_5

    .line 142
    :cond_c
    instance-of v10, v8, Ljava/lang/Number;

    if-eqz v10, :cond_d

    .line 143
    check-cast v8, Ljava/lang/Number;

    .line 144
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    invoke-static {v1, v9, v10, v11}, Lcom/newrelic/mobile/fbs/LongSessionAttribute;->createLongSessionAttribute(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;IJ)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 148
    :cond_d
    instance-of v10, v8, Ljava/lang/Boolean;

    if-eqz v10, :cond_a

    .line 149
    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-static {v1, v9, v8}, Lcom/newrelic/mobile/fbs/BoolSessionAttribute;->createBoolSessionAttribute(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;IZ)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 137
    :cond_e
    :goto_5
    check-cast v8, Ljava/lang/Number;

    .line 138
    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-static {v1, v9, v10, v11}, Lcom/newrelic/mobile/fbs/DoubleSessionAttribute;->createDoubleSessionAttribute(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;ID)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 156
    :cond_f
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_10

    .line 157
    invoke-static {v3}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v3

    invoke-static {v1, v3}, Lcom/newrelic/mobile/fbs/AgentData;->createStringAttributesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v3

    goto :goto_6

    :cond_10
    const/4 v3, -0x1

    .line 161
    :goto_6
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_11

    .line 162
    invoke-static {v4}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v4

    invoke-static {v1, v4}, Lcom/newrelic/mobile/fbs/AgentData;->createDoubleAttributesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v4

    goto :goto_7

    :cond_11
    const/4 v4, -0x1

    .line 166
    :goto_7
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_12

    .line 167
    invoke-static {v5}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v5

    invoke-static {v1, v5}, Lcom/newrelic/mobile/fbs/AgentData;->createLongAttributesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v5

    goto :goto_8

    :cond_12
    const/4 v5, -0x1

    .line 171
    :goto_8
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_13

    .line 172
    invoke-static {v6}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v6

    invoke-static {v1, v6}, Lcom/newrelic/mobile/fbs/AgentData;->createBoolAttributesVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v6

    goto :goto_9

    :cond_13
    const/4 v6, -0x1

    .line 176
    :goto_9
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 178
    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1a

    .line 179
    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    const-string v11, "name"

    .line 180
    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v0, v11}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->stringIndexMapOffset(Ljava/util/Map;Ljava/lang/Object;)I

    move-result v11

    const-string v12, "message"

    .line 181
    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v0, v12}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->stringIndexMapOffset(Ljava/util/Map;Ljava/lang/Object;)I

    move-result v12

    const-string v13, "cause"

    .line 182
    invoke-interface {v10, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v0, v13}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->stringIndexMapOffset(Ljava/util/Map;Ljava/lang/Object;)I

    move-result v13

    const-string v14, "timestampMs"

    .line 184
    invoke-interface {v10, v14}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_14

    const-string v14, "timestampMs"

    .line 185
    invoke-interface {v10, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    goto :goto_b

    :cond_14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    :goto_b
    check-cast v14, Ljava/lang/Long;

    .line 184
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    const-wide/16 v16, 0x0

    :try_start_0
    const-string v8, "appUuidHigh"

    .line 190
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    const-string v8, "appUuidLow"

    .line 191
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v16
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move v10, v5

    move-object/from16 p1, v9

    move-wide/from16 v8, v18

    move-wide/from16 v20, v16

    move/from16 v16, v6

    move-wide/from16 v5, v20

    goto :goto_c

    :catch_0
    move v10, v5

    move-object/from16 p1, v9

    move-wide/from16 v8, v16

    move/from16 v16, v6

    move-wide v5, v8

    .line 197
    :goto_c
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->startHandledException(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    .line 198
    invoke-static {v1, v8, v9}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addAppUuidHigh(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    .line 199
    invoke-static {v1, v5, v6}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addAppUuidLow(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    const-wide/16 v5, -0x1

    cmp-long v8, v5, v14

    if-eqz v8, :cond_15

    .line 202
    invoke-static {v1, v14, v15}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addTimestampMs(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;J)V

    const/4 v5, -0x1

    goto :goto_d

    :cond_15
    const/4 v5, -0x1

    :goto_d
    if-eq v5, v11, :cond_16

    .line 205
    invoke-static {v1, v11}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addName(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_16
    if-eq v5, v12, :cond_17

    .line 208
    invoke-static {v1, v12}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addMessage(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_17
    if-eq v5, v13, :cond_18

    .line 211
    invoke-static {v1, v13}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addCause(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 214
    :cond_18
    invoke-static {v1, v2}, Lcom/newrelic/mobile/fbs/hex/HandledException;->addThreads(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 216
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/hex/HandledException;->endHandledException(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result v5

    .line 217
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object/from16 v9, p1

    move v5, v10

    move/from16 v6, v16

    goto/16 :goto_a

    :cond_19
    move v10, v5

    move/from16 v16, v6

    goto :goto_e

    :cond_1a
    move v10, v5

    move/from16 v16, v6

    .line 224
    :goto_e
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    .line 225
    invoke-static {v7}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v0

    invoke-static {v1, v0}, Lcom/newrelic/mobile/fbs/AgentData;->createHandledExceptionsVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v8

    goto :goto_f

    :cond_1b
    const/4 v8, -0x1

    .line 228
    :goto_f
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->startApplicationInfo(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    const/4 v0, 0x0

    .line 229
    invoke-static {v1, v0}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->addPlatform(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 231
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/ApplicationInfo;->endApplicationInfo(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    .line 234
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/AgentData;->startAgentData(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    const/4 v2, -0x1

    if-eq v3, v2, :cond_1c

    .line 237
    invoke-static {v1, v3}, Lcom/newrelic/mobile/fbs/AgentData;->addStringAttributes(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_1c
    if-eq v4, v2, :cond_1d

    .line 241
    invoke-static {v1, v4}, Lcom/newrelic/mobile/fbs/AgentData;->addDoubleAttributes(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_1d
    if-eq v10, v2, :cond_1e

    .line 245
    invoke-static {v1, v10}, Lcom/newrelic/mobile/fbs/AgentData;->addLongAttributes(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    move/from16 v6, v16

    goto :goto_10

    :cond_1e
    move/from16 v6, v16

    :goto_10
    if-eq v6, v2, :cond_1f

    .line 249
    invoke-static {v1, v6}, Lcom/newrelic/mobile/fbs/AgentData;->addBoolAttributes(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    :cond_1f
    if-eq v8, v2, :cond_20

    .line 253
    invoke-static {v1, v8}, Lcom/newrelic/mobile/fbs/AgentData;->addHandledExceptions(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 256
    :cond_20
    invoke-static {v1, v0}, Lcom/newrelic/mobile/fbs/AgentData;->addApplicationInfo(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 258
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 260
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/AgentData;->endAgentData(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result v2

    .line 262
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 264
    invoke-static {v0}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->toArray(Ljava/util/Collection;)[I

    move-result-object v0

    invoke-static {v1, v0}, Lcom/newrelic/mobile/fbs/AgentDataBundle;->createAgentDataVector(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;[I)I

    move-result v0

    .line 266
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/AgentDataBundle;->startAgentDataBundle(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)V

    .line 268
    invoke-static {v1, v0}, Lcom/newrelic/mobile/fbs/AgentDataBundle;->addAgentData(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;I)V

    .line 269
    invoke-static {v1}, Lcom/newrelic/mobile/fbs/AgentDataBundle;->endAgentDataBundle(Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    .line 270
    invoke-virtual {v1, v0}, Lcom/newrelic/com/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return-object v1
.end method

.method private static stringIndexMapOffset(Ljava/util/Map;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    const/4 v0, -0x1

    .line 277
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 279
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    .line 284
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private static toArray(Ljava/util/Collection;)[I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    .line 288
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [I

    .line 289
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    .line 291
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 292
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v0, v1

    move v1, v2

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static toJsonString(Lcom/newrelic/mobile/fbs/AgentDataBundle;I)Ljava/lang/String;
    .locals 1

    .line 298
    new-instance v0, Lcom/newrelic/com/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/GsonBuilder;-><init>()V

    .line 299
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/GsonBuilder;->enableComplexMapKeySerialization()Lcom/newrelic/com/google/gson/GsonBuilder;

    move-result-object v0

    .line 300
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/GsonBuilder;->serializeNulls()Lcom/newrelic/com/google/gson/GsonBuilder;

    move-result-object v0

    .line 301
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/GsonBuilder;->setPrettyPrinting()Lcom/newrelic/com/google/gson/GsonBuilder;

    move-result-object v0

    .line 302
    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/GsonBuilder;->create()Lcom/newrelic/com/google/gson/Gson;

    move-result-object v0

    .line 304
    invoke-virtual {p0, p1}, Lcom/newrelic/mobile/fbs/AgentDataBundle;->agentData(I)Lcom/newrelic/mobile/fbs/AgentData;

    move-result-object p0

    .line 305
    invoke-static {p0}, Lcom/newrelic/agent/android/agentdata/builder/AgentDataBuilder;->attributesMapFromAgentData(Lcom/newrelic/mobile/fbs/AgentData;)Ljava/util/Map;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/newrelic/com/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
