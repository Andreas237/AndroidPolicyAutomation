.class public Lcom/google/protobuf/TextFormatParseInfoTree$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/TextFormatParseInfoTree;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private locationsFromField:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/util/List<Lcom/google/protobuf/TextFormatParseLocation;>;>;"
        }
    .end annotation
.end field

.field private subtreeBuildersFromField:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/util/List<Lcom/google/protobuf/TextFormatParseInfoTree$Builder;>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->locationsFromField:Ljava/util/Map;

    .line 177
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->subtreeBuildersFromField:Ljava/util/Map;

    .line 178
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/TextFormatParseInfoTree$1;)V
    .locals 0

    .line 164
    invoke-direct {p0}, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/google/protobuf/TextFormatParseInfoTree;
    .locals 4

    .line 223
    new-instance v0, Lcom/google/protobuf/TextFormatParseInfoTree;

    iget-object v1, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->locationsFromField:Ljava/util/Map;

    iget-object v2, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->subtreeBuildersFromField:Ljava/util/Map;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/TextFormatParseInfoTree;-><init>(Ljava/util/Map;Ljava/util/Map;Lcom/google/protobuf/TextFormatParseInfoTree$1;)V

    return-object v0
.end method

.method public getBuilderForSubMessageField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/TextFormatParseInfoTree$Builder;
    .locals 3

    .line 207
    iget-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->subtreeBuildersFromField:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 208
    if-nez v1, :cond_0

    .line 209
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 210
    iget-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->subtreeBuildersFromField:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    :cond_0
    new-instance v2, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;

    invoke-direct {v2}, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;-><init>()V

    .line 213
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    return-object v2
.end method

.method public setLocation(Lcom/google/protobuf/Descriptors$FieldDescriptor;Lcom/google/protobuf/TextFormatParseLocation;)Lcom/google/protobuf/TextFormatParseInfoTree$Builder;
    .locals 2

    .line 188
    iget-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->locationsFromField:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    .line 189
    if-nez v1, :cond_0

    .line 190
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 191
    iget-object v0, p0, Lcom/google/protobuf/TextFormatParseInfoTree$Builder;->locationsFromField:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    :cond_0
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 194
    return-object p0
.end method
