.class public Lcom/google/protobuf/TextFormatParseInfoTree;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/TextFormatParseInfoTree$Builder;
    }
.end annotation


# instance fields
.field private locationsFromField:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/util/List<Lcom/google/protobuf/TextFormatParseLocation;>;>;"
        }
    .end annotation
.end field

.field subtreesFromField:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/util/List<Lcom/google/protobuf/TextFormatParseInfoTree;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/Map;Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/util/List<Lcom/google/protobuf/TextFormatParseLocation;>;>;Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/util/List<Lcom/google/protobuf/TextFormatParseInfoTree$Builder;>;>;)V"
        }
    .end annotation

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 76
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    .line 77
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree;->locationsFromField:Ljava/util/Map;

    .line 81
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 83
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 84
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 85
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;

    .line 86
    invoke-virtual {v8}, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->build()Lcom/google/protobuf/TextFormatParseInfoTree;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree;->subtreesFromField:Ljava/util/Map;

    .line 91
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Map;Ljava/util/Map;Lcom/google/protobuf/TextFormatParseInfoTree$1;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/TextFormatParseInfoTree;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public static builder()Lcom/google/protobuf/TextFormatParseInfoTree$Builder;
    .locals 2

    .line 150
    new-instance v0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;-><init>(Lcom/google/protobuf/TextFormatParseInfoTree$1;)V

    return-object v0
.end method

.method private static getFromList(Ljava/util/List;ILcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/util/List<TT;>;ILcom/google/protobuf/Descriptors$FieldDescriptor;)TT;"
        }
    .end annotation

    .line 154
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-gez p1, :cond_2

    .line 155
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Illegal index field: %s, index %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    if-nez p2, :cond_1

    const-string v3, "<null>"

    goto :goto_0

    .line 156
    :cond_1
    invoke-virtual {p2}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getName()Ljava/lang/String;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 155
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 158
    :cond_2
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getLocation(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Lcom/google/protobuf/TextFormatParseLocation;
    .locals 1

    .line 117
    invoke-virtual {p0, p1}, Lcom/google/protobuf/TextFormatParseInfoTree;->getLocations(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p2, p1}, Lcom/google/protobuf/TextFormatParseInfoTree;->getFromList(Ljava/util/List;ILcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/TextFormatParseLocation;

    return-object v0
.end method

.method public getLocations(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/util/List<Lcom/google/protobuf/TextFormatParseLocation;>;"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree;->locationsFromField:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 102
    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public getNestedTree(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Lcom/google/protobuf/TextFormatParseInfoTree;
    .locals 1

    .line 141
    invoke-virtual {p0, p1}, Lcom/google/protobuf/TextFormatParseInfoTree;->getNestedTrees(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p2, p1}, Lcom/google/protobuf/TextFormatParseInfoTree;->getFromList(Ljava/util/List;ILcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/TextFormatParseInfoTree;

    return-object v0
.end method

.method public getNestedTrees(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/util/List<Lcom/google/protobuf/TextFormatParseInfoTree;>;"
        }
    .end annotation

    .line 127
    iget-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree;->subtreesFromField:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 128
    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method
