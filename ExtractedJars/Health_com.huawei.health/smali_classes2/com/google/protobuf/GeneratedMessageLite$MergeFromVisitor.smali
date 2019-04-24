.class public Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/GeneratedMessageLite$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessageLite;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "MergeFromVisitor"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 2234
    new-instance v0, Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;

    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;-><init>()V

    sput-object v0, Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;->INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2236
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitBoolean(ZZZZ)Z
    .locals 1

    .line 2241
    if-eqz p3, :cond_0

    move v0, p4

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    return v0
.end method

.method public visitBooleanList(Lcom/google/protobuf/Internal$BooleanList;Lcom/google/protobuf/Internal$BooleanList;)Lcom/google/protobuf/Internal$BooleanList;
    .locals 3

    .line 2351
    invoke-interface {p1}, Lcom/google/protobuf/Internal$BooleanList;->size()I

    move-result v1

    .line 2352
    invoke-interface {p2}, Lcom/google/protobuf/Internal$BooleanList;->size()I

    move-result v2

    .line 2353
    if-lez v1, :cond_1

    if-lez v2, :cond_1

    .line 2354
    invoke-interface {p1}, Lcom/google/protobuf/Internal$BooleanList;->isModifiable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2355
    add-int v0, v1, v2

    invoke-interface {p1, v0}, Lcom/google/protobuf/Internal$BooleanList;->mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$BooleanList;

    move-result-object p1

    .line 2357
    :cond_0
    invoke-interface {p1, p2}, Lcom/google/protobuf/Internal$BooleanList;->addAll(Ljava/util/Collection;)Z

    .line 2360
    :cond_1
    if-lez v1, :cond_2

    move-object v0, p1

    goto :goto_0

    :cond_2
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitByteString(ZLcom/google/protobuf/ByteString;ZLcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 2274
    if-eqz p3, :cond_0

    move-object v0, p4

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitDouble(ZDZD)D
    .locals 2

    .line 2252
    if-eqz p4, :cond_0

    move-wide v0, p5

    goto :goto_0

    :cond_0
    move-wide v0, p2

    :goto_0
    return-wide v0
.end method

.method public visitDoubleList(Lcom/google/protobuf/Internal$DoubleList;Lcom/google/protobuf/Internal$DoubleList;)Lcom/google/protobuf/Internal$DoubleList;
    .locals 3

    .line 2379
    invoke-interface {p1}, Lcom/google/protobuf/Internal$DoubleList;->size()I

    move-result v1

    .line 2380
    invoke-interface {p2}, Lcom/google/protobuf/Internal$DoubleList;->size()I

    move-result v2

    .line 2381
    if-lez v1, :cond_1

    if-lez v2, :cond_1

    .line 2382
    invoke-interface {p1}, Lcom/google/protobuf/Internal$DoubleList;->isModifiable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2383
    add-int v0, v1, v2

    invoke-interface {p1, v0}, Lcom/google/protobuf/Internal$DoubleList;->mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$DoubleList;

    move-result-object p1

    .line 2385
    :cond_0
    invoke-interface {p1, p2}, Lcom/google/protobuf/Internal$DoubleList;->addAll(Ljava/util/Collection;)Z

    .line 2388
    :cond_1
    if-lez v1, :cond_2

    move-object v0, p1

    goto :goto_0

    :cond_2
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitExtensions(Lcom/google/protobuf/FieldSet;Lcom/google/protobuf/FieldSet;)Lcom/google/protobuf/FieldSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;)Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;"
        }
    .end annotation

    .line 2423
    invoke-virtual {p1}, Lcom/google/protobuf/FieldSet;->isImmutable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2424
    invoke-virtual {p1}, Lcom/google/protobuf/FieldSet;->clone()Lcom/google/protobuf/FieldSet;

    move-result-object p1

    .line 2426
    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/protobuf/FieldSet;->mergeFrom(Lcom/google/protobuf/FieldSet;)V

    .line 2427
    return-object p1
.end method

.method public visitFloat(ZFZF)F
    .locals 1

    .line 2257
    if-eqz p3, :cond_0

    move v0, p4

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    return v0
.end method

.method public visitFloatList(Lcom/google/protobuf/Internal$FloatList;Lcom/google/protobuf/Internal$FloatList;)Lcom/google/protobuf/Internal$FloatList;
    .locals 3

    .line 2393
    invoke-interface {p1}, Lcom/google/protobuf/Internal$FloatList;->size()I

    move-result v1

    .line 2394
    invoke-interface {p2}, Lcom/google/protobuf/Internal$FloatList;->size()I

    move-result v2

    .line 2395
    if-lez v1, :cond_1

    if-lez v2, :cond_1

    .line 2396
    invoke-interface {p1}, Lcom/google/protobuf/Internal$FloatList;->isModifiable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2397
    add-int v0, v1, v2

    invoke-interface {p1, v0}, Lcom/google/protobuf/Internal$FloatList;->mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$FloatList;

    move-result-object p1

    .line 2399
    :cond_0
    invoke-interface {p1, p2}, Lcom/google/protobuf/Internal$FloatList;->addAll(Ljava/util/Collection;)Z

    .line 2402
    :cond_1
    if-lez v1, :cond_2

    move-object v0, p1

    goto :goto_0

    :cond_2
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitInt(ZIZI)I
    .locals 1

    .line 2246
    if-eqz p3, :cond_0

    move v0, p4

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    return v0
.end method

.method public visitIntList(Lcom/google/protobuf/Internal$IntList;Lcom/google/protobuf/Internal$IntList;)Lcom/google/protobuf/Internal$IntList;
    .locals 3

    .line 2365
    invoke-interface {p1}, Lcom/google/protobuf/Internal$IntList;->size()I

    move-result v1

    .line 2366
    invoke-interface {p2}, Lcom/google/protobuf/Internal$IntList;->size()I

    move-result v2

    .line 2367
    if-lez v1, :cond_1

    if-lez v2, :cond_1

    .line 2368
    invoke-interface {p1}, Lcom/google/protobuf/Internal$IntList;->isModifiable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2369
    add-int v0, v1, v2

    invoke-interface {p1, v0}, Lcom/google/protobuf/Internal$IntList;->mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$IntList;

    move-result-object p1

    .line 2371
    :cond_0
    invoke-interface {p1, p2}, Lcom/google/protobuf/Internal$IntList;->addAll(Ljava/util/Collection;)Z

    .line 2374
    :cond_1
    if-lez v1, :cond_2

    move-object v0, p1

    goto :goto_0

    :cond_2
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitList(Lcom/google/protobuf/Internal$ProtobufList;Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lcom/google/protobuf/Internal$ProtobufList<TT;>;Lcom/google/protobuf/Internal$ProtobufList<TT;>;)Lcom/google/protobuf/Internal$ProtobufList<TT;>;"
        }
    .end annotation

    .line 2337
    invoke-interface {p1}, Lcom/google/protobuf/Internal$ProtobufList;->size()I

    move-result v1

    .line 2338
    invoke-interface {p2}, Lcom/google/protobuf/Internal$ProtobufList;->size()I

    move-result v2

    .line 2339
    if-lez v1, :cond_1

    if-lez v2, :cond_1

    .line 2340
    invoke-interface {p1}, Lcom/google/protobuf/Internal$ProtobufList;->isModifiable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2341
    add-int v0, v1, v2

    invoke-interface {p1, v0}, Lcom/google/protobuf/Internal$ProtobufList;->mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$ProtobufList;

    move-result-object p1

    .line 2343
    :cond_0
    invoke-interface {p1, p2}, Lcom/google/protobuf/Internal$ProtobufList;->addAll(Ljava/util/Collection;)Z

    .line 2346
    :cond_1
    if-lez v1, :cond_2

    move-object v0, p1

    goto :goto_0

    :cond_2
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitLong(ZJZJ)J
    .locals 2

    .line 2262
    if-eqz p4, :cond_0

    move-wide v0, p5

    goto :goto_0

    :cond_0
    move-wide v0, p2

    :goto_0
    return-wide v0
.end method

.method public visitLongList(Lcom/google/protobuf/Internal$LongList;Lcom/google/protobuf/Internal$LongList;)Lcom/google/protobuf/Internal$LongList;
    .locals 3

    .line 2407
    invoke-interface {p1}, Lcom/google/protobuf/Internal$LongList;->size()I

    move-result v1

    .line 2408
    invoke-interface {p2}, Lcom/google/protobuf/Internal$LongList;->size()I

    move-result v2

    .line 2409
    if-lez v1, :cond_1

    if-lez v2, :cond_1

    .line 2410
    invoke-interface {p1}, Lcom/google/protobuf/Internal$LongList;->isModifiable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2411
    add-int v0, v1, v2

    invoke-interface {p1, v0}, Lcom/google/protobuf/Internal$LongList;->mutableCopyWithCapacity(I)Lcom/google/protobuf/Internal$LongList;

    move-result-object p1

    .line 2413
    :cond_0
    invoke-interface {p1, p2}, Lcom/google/protobuf/Internal$LongList;->addAll(Ljava/util/Collection;)Z

    .line 2416
    :cond_1
    if-lez v1, :cond_2

    move-object v0, p1

    goto :goto_0

    :cond_2
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitMap(Lcom/google/protobuf/MapFieldLite;Lcom/google/protobuf/MapFieldLite;)Lcom/google/protobuf/MapFieldLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lcom/google/protobuf/MapFieldLite<TK;TV;>;Lcom/google/protobuf/MapFieldLite<TK;TV;>;)Lcom/google/protobuf/MapFieldLite<TK;TV;>;"
        }
    .end annotation

    .line 2440
    invoke-virtual {p2}, Lcom/google/protobuf/MapFieldLite;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2441
    invoke-virtual {p1}, Lcom/google/protobuf/MapFieldLite;->isMutable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2442
    invoke-virtual {p1}, Lcom/google/protobuf/MapFieldLite;->mutableCopy()Lcom/google/protobuf/MapFieldLite;

    move-result-object p1

    .line 2444
    :cond_0
    invoke-virtual {p1, p2}, Lcom/google/protobuf/MapFieldLite;->mergeFrom(Lcom/google/protobuf/MapFieldLite;)V

    .line 2446
    :cond_1
    return-object p1
.end method

.method public visitMessage(Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/MessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::Lcom/google/protobuf/MessageLite;>(TT;TT;)TT;"
        }
    .end annotation

    .line 2328
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 2329
    invoke-interface {p1}, Lcom/google/protobuf/MessageLite;->toBuilder()Lcom/google/protobuf/MessageLite$Builder;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/google/protobuf/MessageLite$Builder;->mergeFrom(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/MessageLite$Builder;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/MessageLite$Builder;->build()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    return-object v0

    .line 2332
    :cond_0
    if-eqz p1, :cond_1

    move-object v0, p1

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitOneofBoolean(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2279
    return-object p3
.end method

.method public visitOneofByteString(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2309
    return-object p3
.end method

.method public visitOneofDouble(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2289
    return-object p3
.end method

.method public visitOneofFloat(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2294
    return-object p3
.end method

.method public visitOneofInt(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2284
    return-object p3
.end method

.method public visitOneofLong(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2299
    return-object p3
.end method

.method public visitOneofMessage(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2314
    if-eqz p1, :cond_0

    .line 2315
    move-object v0, p2

    check-cast v0, Lcom/google/protobuf/MessageLite;

    move-object v1, p3

    check-cast v1, Lcom/google/protobuf/MessageLite;

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/GeneratedMessageLite$MergeFromVisitor;->visitMessage(Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    return-object v0

    .line 2317
    :cond_0
    return-object p3
.end method

.method public visitOneofNotSet(Z)V
    .locals 0

    .line 2322
    return-void
.end method

.method public visitOneofString(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2304
    return-object p3
.end method

.method public visitString(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2268
    if-eqz p3, :cond_0

    move-object v0, p4

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public visitUnknownFields(Lcom/google/protobuf/UnknownFieldSetLite;Lcom/google/protobuf/UnknownFieldSetLite;)Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 1

    .line 2434
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSetLite;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSetLite;

    move-result-object v0

    if-ne p2, v0, :cond_0

    move-object v0, p1

    goto :goto_0

    .line 2435
    :cond_0
    invoke-static {p1, p2}, Lcom/google/protobuf/UnknownFieldSetLite;->mutableCopyOf(Lcom/google/protobuf/UnknownFieldSetLite;Lcom/google/protobuf/UnknownFieldSetLite;)Lcom/google/protobuf/UnknownFieldSetLite;

    move-result-object v0

    .line 2434
    :goto_0
    return-object v0
.end method
