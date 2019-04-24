.class Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OneofAccessor"
.end annotation


# instance fields
.field private final caseMethod:Ljava/lang/reflect/Method;

.field private final caseMethodBuilder:Ljava/lang/reflect/Method;

.field private final clearMethod:Ljava/lang/reflect/Method;

.field private final descriptor:Lcom/google/protobuf/Descriptors$Descriptor;


# direct methods
.method constructor <init>(Lcom/google/protobuf/Descriptors$Descriptor;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$Descriptor;Ljava/lang/String;Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage;>;Ljava/lang/Class<+Lcom/google/protobuf/GeneratedMessage$Builder;>;)V"
        }
    .end annotation

    .line 2195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2196
    iput-object p1, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2197
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Case"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    .line 2198
    invoke-static {p3, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1100(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->caseMethod:Ljava/lang/reflect/Method;

    .line 2199
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Case"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    .line 2200
    invoke-static {p4, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1100(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->caseMethodBuilder:Ljava/lang/reflect/Method;

    .line 2201
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "clear"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {p4, v0, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1100(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->clearMethod:Ljava/lang/reflect/Method;

    .line 2202
    return-void
.end method


# virtual methods
.method public clear(Lcom/google/protobuf/GeneratedMessage$Builder;)V
    .locals 2

    .line 2240
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->clearMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2241
    return-void
.end method

.method public get(Lcom/google/protobuf/GeneratedMessage$Builder;)Lcom/google/protobuf/Descriptors$FieldDescriptor;
    .locals 3

    .line 2232
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->caseMethodBuilder:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Internal$EnumLite;

    invoke-interface {v0}, Lcom/google/protobuf/Internal$EnumLite;->getNumber()I

    move-result v2

    .line 2233
    if-lez v2, :cond_0

    .line 2234
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    invoke-virtual {v0, v2}, Lcom/google/protobuf/Descriptors$Descriptor;->findFieldByNumber(I)Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v0

    return-object v0

    .line 2236
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public get(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/Descriptors$FieldDescriptor;
    .locals 3

    .line 2224
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->caseMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Internal$EnumLite;

    invoke-interface {v0}, Lcom/google/protobuf/Internal$EnumLite;->getNumber()I

    move-result v2

    .line 2225
    if-lez v2, :cond_0

    .line 2226
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    invoke-virtual {v0, v2}, Lcom/google/protobuf/Descriptors$Descriptor;->findFieldByNumber(I)Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v0

    return-object v0

    .line 2228
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public has(Lcom/google/protobuf/GeneratedMessage$Builder;)Z
    .locals 2

    .line 2217
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->caseMethodBuilder:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Internal$EnumLite;

    invoke-interface {v0}, Lcom/google/protobuf/Internal$EnumLite;->getNumber()I

    move-result v0

    if-nez v0, :cond_0

    .line 2218
    const/4 v0, 0x0

    return v0

    .line 2220
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public has(Lcom/google/protobuf/GeneratedMessage;)Z
    .locals 2

    .line 2210
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable$OneofAccessor;->caseMethod:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/google/protobuf/GeneratedMessage;->access$1200(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Internal$EnumLite;

    invoke-interface {v0}, Lcom/google/protobuf/Internal$EnumLite;->getNumber()I

    move-result v0

    if-nez v0, :cond_0

    .line 2211
    const/4 v0, 0x0

    return v0

    .line 2213
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
