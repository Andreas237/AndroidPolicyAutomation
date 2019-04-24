.class Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/GeneratedMessageLite$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/GeneratedMessageLite;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "HashCodeVisitor"
.end annotation


# instance fields
.field hashCode:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 2046
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2052
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    return-void
.end method


# virtual methods
.method public visitBoolean(ZZZZ)Z
    .locals 2

    .line 2057
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-static {p2}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2058
    return p2
.end method

.method public visitBooleanList(Lcom/google/protobuf/Internal$BooleanList;Lcom/google/protobuf/Internal$BooleanList;)Lcom/google/protobuf/Internal$BooleanList;
    .locals 2

    .line 2178
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2179
    return-object p1
.end method

.method public visitByteString(ZLcom/google/protobuf/ByteString;ZLcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;
    .locals 2

    .line 2096
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p2}, Lcom/google/protobuf/ByteString;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2097
    return-object p2
.end method

.method public visitDouble(ZDZD)D
    .locals 3

    .line 2070
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/protobuf/Internal;->hashLong(J)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2071
    return-wide p2
.end method

.method public visitDoubleList(Lcom/google/protobuf/Internal$DoubleList;Lcom/google/protobuf/Internal$DoubleList;)Lcom/google/protobuf/Internal$DoubleList;
    .locals 2

    .line 2190
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2191
    return-object p1
.end method

.method public visitExtensions(Lcom/google/protobuf/FieldSet;Lcom/google/protobuf/FieldSet;)Lcom/google/protobuf/FieldSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;)Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;"
        }
    .end annotation

    .line 2210
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/protobuf/FieldSet;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2211
    return-object p1
.end method

.method public visitFloat(ZFZF)F
    .locals 2

    .line 2076
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-static {p2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2077
    return p2
.end method

.method public visitFloatList(Lcom/google/protobuf/Internal$FloatList;Lcom/google/protobuf/Internal$FloatList;)Lcom/google/protobuf/Internal$FloatList;
    .locals 2

    .line 2196
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2197
    return-object p1
.end method

.method public visitInt(ZIZI)I
    .locals 2

    .line 2063
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    add-int/2addr v0, p2

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2064
    return p2
.end method

.method public visitIntList(Lcom/google/protobuf/Internal$IntList;Lcom/google/protobuf/Internal$IntList;)Lcom/google/protobuf/Internal$IntList;
    .locals 2

    .line 2184
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2185
    return-object p1
.end method

.method public visitList(Lcom/google/protobuf/Internal$ProtobufList;Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lcom/google/protobuf/Internal$ProtobufList<TT;>;Lcom/google/protobuf/Internal$ProtobufList<TT;>;)Lcom/google/protobuf/Internal$ProtobufList<TT;>;"
        }
    .end annotation

    .line 2172
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2173
    return-object p1
.end method

.method public visitLong(ZJZJ)J
    .locals 2

    .line 2082
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-static {p2, p3}, Lcom/google/protobuf/Internal;->hashLong(J)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2083
    return-wide p2
.end method

.method public visitLongList(Lcom/google/protobuf/Internal$LongList;Lcom/google/protobuf/Internal$LongList;)Lcom/google/protobuf/Internal$LongList;
    .locals 2

    .line 2202
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2203
    return-object p1
.end method

.method public visitMap(Lcom/google/protobuf/MapFieldLite;Lcom/google/protobuf/MapFieldLite;)Lcom/google/protobuf/MapFieldLite;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lcom/google/protobuf/MapFieldLite<TK;TV;>;Lcom/google/protobuf/MapFieldLite<TK;TV;>;)Lcom/google/protobuf/MapFieldLite<TK;TV;>;"
        }
    .end annotation

    .line 2224
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/protobuf/MapFieldLite;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2225
    return-object p1
.end method

.method public visitMessage(Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/MessageLite;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::Lcom/google/protobuf/MessageLite;>(TT;TT;)TT;"
        }
    .end annotation

    .line 2157
    if-eqz p1, :cond_1

    .line 2158
    instance-of v0, p1, Lcom/google/protobuf/GeneratedMessageLite;

    if-eqz v0, :cond_0

    .line 2159
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->hashCode(Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;)I

    move-result v2

    goto :goto_0

    .line 2161
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    .line 2164
    :cond_1
    const/16 v2, 0x25

    .line 2166
    :goto_0
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    add-int/2addr v0, v2

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2167
    return-object p1
.end method

.method public visitOneofBoolean(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2102
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    move-object v1, p2

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v1}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2103
    return-object p2
.end method

.method public visitOneofByteString(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2138
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2139
    return-object p2
.end method

.method public visitOneofDouble(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2114
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    move-object v1, p2

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/protobuf/Internal;->hashLong(J)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2115
    return-object p2
.end method

.method public visitOneofFloat(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2120
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    move-object v1, p2

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2121
    return-object p2
.end method

.method public visitOneofInt(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2108
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    move-object v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2109
    return-object p2
.end method

.method public visitOneofLong(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2126
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    move-object v1, p2

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/protobuf/Internal;->hashLong(J)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2127
    return-object p2
.end method

.method public visitOneofMessage(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2144
    move-object v0, p2

    check-cast v0, Lcom/google/protobuf/MessageLite;

    move-object v1, p3

    check-cast v1, Lcom/google/protobuf/MessageLite;

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->visitMessage(Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v0

    return-object v0
.end method

.method public visitOneofNotSet(Z)V
    .locals 1

    .line 2149
    if-eqz p1, :cond_0

    .line 2150
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 2152
    :cond_0
    return-void
.end method

.method public visitOneofString(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2132
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2133
    return-object p2
.end method

.method public visitString(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2089
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2090
    return-object p2
.end method

.method public visitUnknownFields(Lcom/google/protobuf/UnknownFieldSetLite;Lcom/google/protobuf/UnknownFieldSetLite;)Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 2

    .line 2218
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/protobuf/UnknownFieldSetLite;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageLite$HashCodeVisitor;->hashCode:I

    .line 2219
    return-object p1
.end method
