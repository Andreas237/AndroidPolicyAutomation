.class public final Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FieldAccessorTable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedMessageFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularMessageFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularStringFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedEnumFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularEnumFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularFieldAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;,
        Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;
    }
.end annotation


# instance fields
.field private camelCaseNames:[Ljava/lang/String;

.field private final descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

.field private final fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

.field private volatile initialized:Z

.field private final oneofs:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V
    .locals 1

    .line 2050
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2051
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2052
    iput-object p2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    .line 2053
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$Descriptor;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    .line 2054
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$Descriptor;->getOneofs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->oneofs:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;

    .line 2055
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->initialized:Z

    .line 2056
    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage;>;Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage$Builder;>;)V"
        }
    .end annotation

    .line 2040
    invoke-direct {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;[Ljava/lang/String;)V

    .line 2041
    invoke-virtual {p0, p3, p4}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    .line 2042
    return-void
.end method

.method static synthetic access$000(Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;)Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 2023
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method static synthetic access$100(Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;
    .locals 1

    .line 2023
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->getOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1300(Lcom/google/protobuf/Descriptors$FileDescriptor;)Z
    .locals 1

    .line 2023
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->supportFieldPresence(Lcom/google/protobuf/Descriptors$FileDescriptor;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$200(Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;
    .locals 1

    .line 2023
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    move-result-object v0

    return-object v0
.end method

.method private getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;
    .locals 2

    .line 2141
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    if-eq v0, v1, :cond_0

    .line 2142
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "FieldDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2144
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isExtension()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2147
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "This type does not have extensions."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2150
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method private getOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;
    .locals 2

    .line 2155
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$OneofDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    if-eq v0, v1, :cond_0

    .line 2156
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "OneofDescriptor does not match message type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2159
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->oneofs:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;

    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$OneofDescriptor;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method private isMapFieldEnabled(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z
    .locals 2

    .line 2059
    const/4 v1, 0x1

    .line 2060
    return v1
.end method

.method private static supportFieldPresence(Lcom/google/protobuf/Descriptors$FileDescriptor;)Z
    .locals 2

    .line 2245
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$FileDescriptor;->getSyntax()Lcom/google/protobuf/Descriptors$FileDescriptor$Syntax;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FileDescriptor$Syntax;->PROTO2:Lcom/google/protobuf/Descriptors$FileDescriptor$Syntax;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage;>;Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage$Builder;>;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;"
        }
    .end annotation

    .line 2073
    iget-boolean v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->initialized:Z

    if-eqz v0, :cond_0

    return-object p0

    .line 2074
    :cond_0
    move-object v7, p0

    monitor-enter v7

    .line 2075
    :try_start_0
    iget-boolean v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->initialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit v7

    return-object p0

    .line 2076
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    array-length v8, v0

    .line 2077
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_a

    .line 2078
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 2079
    const/4 v11, 0x0

    .line 2080
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingOneof()Lcom/google/protobuf/Descriptors$OneofDescriptor;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2081
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    .line 2082
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingOneof()Lcom/google/protobuf/Descriptors$OneofDescriptor;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/protobuf/Descriptors$OneofDescriptor;->getIndex()I

    move-result v1

    add-int/2addr v1, v8

    aget-object v11, v0, v1

    .line 2084
    :cond_2
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2085
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_4

    .line 2086
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isMapField()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, v10}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->isMapFieldEnabled(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2087
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v2, v2, v9

    invoke-direct {v1, v10, v2, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$MapFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v1, v0, v9

    goto/16 :goto_1

    .line 2090
    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedMessageFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v2, v2, v9

    invoke-direct {v1, v10, v2, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedMessageFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v1, v0, v9

    goto/16 :goto_1

    .line 2093
    :cond_4
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_5

    .line 2094
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedEnumFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v2, v2, v9

    invoke-direct {v1, v10, v2, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedEnumFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v1, v0, v9

    goto/16 :goto_1

    .line 2097
    :cond_5
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v2, v2, v9

    invoke-direct {v1, v10, v2, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$RepeatedFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v1, v0, v9

    goto/16 :goto_1

    .line 2101
    :cond_6
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_7

    .line 2102
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularMessageFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v3, v2, v9

    move-object v2, v10

    move-object v4, p1

    move-object v5, p2

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularMessageFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v1, v0, v9

    goto :goto_1

    .line 2105
    :cond_7
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_8

    .line 2106
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularEnumFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v3, v2, v9

    move-object v2, v10

    move-object v4, p1

    move-object v5, p2

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularEnumFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v1, v0, v9

    goto :goto_1

    .line 2109
    :cond_8
    invoke-virtual {v10}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->STRING:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_9

    .line 2110
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularStringFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v3, v2, v9

    move-object v2, v10

    move-object v4, p1

    move-object v5, p2

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularStringFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v1, v0, v9

    goto :goto_1

    .line 2114
    :cond_9
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->fields:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$FieldAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularFieldAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    aget-object v3, v2, v9

    move-object v2, v10

    move-object v4, p1

    move-object v5, p2

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$SingularFieldAccessor;-><init>(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    aput-object v1, v0, v9

    .line 2077
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 2121
    :cond_a
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->oneofs:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;

    array-length v9, v0

    .line 2122
    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_b

    .line 2123
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->oneofs:[Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;

    new-instance v1, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;

    iget-object v2, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    iget-object v3, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;

    add-int v4, v10, v8

    aget-object v3, v3, v4

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    aput-object v1, v0, v10

    .line 2122
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 2127
    :cond_b
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->initialized:Z

    .line 2128
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->camelCaseNames:[Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2129
    monitor-exit v7

    return-object p0

    .line 2130
    :catchall_0
    move-exception v12

    monitor-exit v7

    throw v12
.end method
