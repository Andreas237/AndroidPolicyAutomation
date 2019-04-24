.class public Lcom/google/protobuf/MapField;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MutabilityOracle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/MapField$MutatabilityAwareMap;,
        Lcom/google/protobuf/MapField$ImmutableMessageConverter;,
        Lcom/google/protobuf/MapField$Converter;,
        Lcom/google/protobuf/MapField$StorageMode;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lcom/google/protobuf/MutabilityOracle;"
    }
.end annotation


# instance fields
.field private final converter:Lcom/google/protobuf/MapField$Converter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/MapField$Converter<TK;TV;>;"
        }
    .end annotation
.end field

.field private volatile isMutable:Z

.field private listData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/Message;>;"
        }
    .end annotation
.end field

.field private mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/MapField$MutatabilityAwareMap<TK;TV;>;"
        }
    .end annotation
.end field

.field private volatile mode:Lcom/google/protobuf/MapField$StorageMode;


# direct methods
.method private constructor <init>(Lcom/google/protobuf/MapEntry;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapEntry<TK;TV;>;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map<TK;TV;>;)V"
        }
    .end annotation

    .line 135
    new-instance v0, Lcom/google/protobuf/MapField$ImmutableMessageConverter;

    invoke-direct {v0, p1}, Lcom/google/protobuf/MapField$ImmutableMessageConverter;-><init>(Lcom/google/protobuf/MapEntry;)V

    invoke-direct {p0, v0, p2, p3}, Lcom/google/protobuf/MapField;-><init>(Lcom/google/protobuf/MapField$Converter;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    .line 136
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/MapField$Converter;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapField$Converter<TK;TV;>;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map<TK;TV;>;)V"
        }
    .end annotation

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    iput-object p1, p0, Lcom/google/protobuf/MapField;->converter:Lcom/google/protobuf/MapField$Converter;

    .line 125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/MapField;->isMutable:Z

    .line 126
    iput-object p2, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    .line 127
    new-instance v0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    invoke-direct {v0, p0, p3}, Lcom/google/protobuf/MapField$MutatabilityAwareMap;-><init>(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    .line 128
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    .line 129
    return-void
.end method

.method private convertKeyAndValueToMessage(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/protobuf/Message;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Lcom/google/protobuf/Message;"
        }
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/google/protobuf/MapField;->converter:Lcom/google/protobuf/MapField$Converter;

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/MapField$Converter;->convertKeyAndValueToMessage(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method

.method private convertListToMap(Ljava/util/List;)Lcom/google/protobuf/MapField$MutatabilityAwareMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/protobuf/Message;>;)Lcom/google/protobuf/MapField$MutatabilityAwareMap<TK;TV;>;"
        }
    .end annotation

    .line 174
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 175
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/protobuf/Message;

    .line 176
    invoke-direct {p0, v3, v1}, Lcom/google/protobuf/MapField;->convertMessageToKeyAndValue(Lcom/google/protobuf/Message;Ljava/util/Map;)V

    .line 177
    goto :goto_0

    .line 178
    :cond_0
    new-instance v0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/MapField$MutatabilityAwareMap;-><init>(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Map;)V

    return-object v0
.end method

.method private convertMapToList(Lcom/google/protobuf/MapField$MutatabilityAwareMap;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapField$MutatabilityAwareMap<TK;TV;>;)Ljava/util/List<Lcom/google/protobuf/Message;>;"
        }
    .end annotation

    .line 164
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 165
    invoke-virtual {p1}, Lcom/google/protobuf/MapField$MutatabilityAwareMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 166
    .line 168
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 167
    invoke-direct {p0, v0, v1}, Lcom/google/protobuf/MapField;->convertKeyAndValueToMessage(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/protobuf/Message;

    move-result-object v0

    .line 166
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    goto :goto_0

    .line 170
    :cond_0
    return-object v2
.end method

.method private convertMessageToKeyAndValue(Lcom/google/protobuf/Message;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Message;Ljava/util/Map<TK;TV;>;)V"
        }
    .end annotation

    .line 160
    iget-object v0, p0, Lcom/google/protobuf/MapField;->converter:Lcom/google/protobuf/MapField$Converter;

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/MapField$Converter;->convertMessageToKeyAndValue(Lcom/google/protobuf/Message;Ljava/util/Map;)V

    .line 161
    return-void
.end method

.method public static emptyMapField(Lcom/google/protobuf/MapEntry;)Lcom/google/protobuf/MapField;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lcom/google/protobuf/MapEntry<TK;TV;>;)Lcom/google/protobuf/MapField<TK;TV;>;"
        }
    .end annotation

    .line 142
    new-instance v0, Lcom/google/protobuf/MapField;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 143
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/google/protobuf/MapField;-><init>(Lcom/google/protobuf/MapEntry;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    .line 142
    return-object v0
.end method

.method public static newMapField(Lcom/google/protobuf/MapEntry;)Lcom/google/protobuf/MapField;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lcom/google/protobuf/MapEntry<TK;TV;>;)Lcom/google/protobuf/MapField<TK;TV;>;"
        }
    .end annotation

    .line 149
    new-instance v0, Lcom/google/protobuf/MapField;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v0, p0, v1, v2}, Lcom/google/protobuf/MapField;-><init>(Lcom/google/protobuf/MapEntry;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 211
    new-instance v0, Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/MapField$MutatabilityAwareMap;-><init>(Lcom/google/protobuf/MutabilityOracle;Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    .line 212
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    .line 213
    return-void
.end method

.method public copy()Lcom/google/protobuf/MapField;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapField<TK;TV;>;"
        }
    .end annotation

    .line 232
    new-instance v0, Lcom/google/protobuf/MapField;

    iget-object v1, p0, Lcom/google/protobuf/MapField;->converter:Lcom/google/protobuf/MapField$Converter;

    sget-object v2, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    .line 233
    invoke-virtual {p0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lcom/google/protobuf/MapFieldLite;->copy(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/MapField;-><init>(Lcom/google/protobuf/MapField$Converter;Lcom/google/protobuf/MapField$StorageMode;Ljava/util/Map;)V

    .line 232
    return-object v0
.end method

.method public ensureMutable()V
    .locals 1

    .line 289
    invoke-virtual {p0}, Lcom/google/protobuf/MapField;->isMutable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 290
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 292
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 218
    instance-of v0, p1, Lcom/google/protobuf/MapField;

    if-nez v0, :cond_0

    .line 219
    const/4 v0, 0x0

    return v0

    .line 221
    :cond_0
    move-object v2, p1

    check-cast v2, Lcom/google/protobuf/MapField;

    .line 222
    invoke-virtual {p0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/protobuf/MapFieldLite;->equals(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method getList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/google/protobuf/Message;>;"
        }
    .end annotation

    .line 238
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    if-ne v0, v1, :cond_1

    .line 239
    move-object v2, p0

    monitor-enter v2

    .line 240
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    if-ne v0, v1, :cond_0

    .line 241
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    invoke-direct {p0, v0}, Lcom/google/protobuf/MapField;->convertMapToList(Lcom/google/protobuf/MapField$MutatabilityAwareMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    .line 242
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->BOTH:Lcom/google/protobuf/MapField$StorageMode;

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 244
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 246
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<TK;TV;>;"
        }
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    if-ne v0, v1, :cond_1

    .line 184
    move-object v2, p0

    monitor-enter v2

    .line 185
    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    if-ne v0, v1, :cond_0

    .line 186
    iget-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/google/protobuf/MapField;->convertListToMap(Ljava/util/List;)Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    .line 187
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->BOTH:Lcom/google/protobuf/MapField$StorageMode;

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 191
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method getMapEntryMessageDefaultInstance()Lcom/google/protobuf/Message;
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/google/protobuf/MapField;->converter:Lcom/google/protobuf/MapField$Converter;

    invoke-interface {v0}, Lcom/google/protobuf/MapField$Converter;->getMessageDefaultInstance()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method

.method getMutableList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/google/protobuf/Message;>;"
        }
    .end annotation

    .line 251
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    if-eq v0, v1, :cond_1

    .line 252
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    if-ne v0, v1, :cond_0

    .line 253
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    invoke-direct {p0, v0}, Lcom/google/protobuf/MapField;->convertMapToList(Lcom/google/protobuf/MapField$MutatabilityAwareMap;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    .line 255
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    .line 256
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    .line 258
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    return-object v0
.end method

.method public getMutableMap()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<TK;TV;>;"
        }
    .end annotation

    .line 196
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    if-eq v0, v1, :cond_1

    .line 197
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    sget-object v1, Lcom/google/protobuf/MapField$StorageMode;->LIST:Lcom/google/protobuf/MapField$StorageMode;

    if-ne v0, v1, :cond_0

    .line 198
    iget-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/google/protobuf/MapField;->convertListToMap(Ljava/util/List;)Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    .line 200
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/MapField;->listData:Ljava/util/List;

    .line 201
    sget-object v0, Lcom/google/protobuf/MapField$StorageMode;->MAP:Lcom/google/protobuf/MapField$StorageMode;

    iput-object v0, p0, Lcom/google/protobuf/MapField;->mode:Lcom/google/protobuf/MapField$StorageMode;

    .line 203
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/MapField;->mapData:Lcom/google/protobuf/MapField$MutatabilityAwareMap;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 227
    invoke-virtual {p0}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/MapFieldLite;->calculateHashCodeForMap(Ljava/util/Map;)I

    move-result v0

    return v0
.end method

.method public isMutable()Z
    .locals 1

    .line 281
    iget-boolean v0, p0, Lcom/google/protobuf/MapField;->isMutable:Z

    return v0
.end method

.method public makeImmutable()V
    .locals 1

    .line 274
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/MapField;->isMutable:Z

    .line 275
    return-void
.end method

.method public mergeFrom(Lcom/google/protobuf/MapField;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapField<TK;TV;>;)V"
        }
    .end annotation

    .line 207
    invoke-virtual {p0}, Lcom/google/protobuf/MapField;->getMutableMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lcom/google/protobuf/MapFieldLite;->copy(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 208
    return-void
.end method
