.class Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;
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
    name = "EqualsVisitor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;
    }
.end annotation


# static fields
.field static final INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;

.field static final NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1814
    new-instance v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;

    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;-><init>()V

    sput-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->INSTANCE:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;

    .line 1816
    new-instance v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    invoke-direct {v0}, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;-><init>()V

    sput-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1818
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visitBoolean(ZZZZ)Z
    .locals 1

    .line 1823
    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    .line 1824
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1826
    :cond_1
    return p2
.end method

.method public visitBooleanList(Lcom/google/protobuf/Internal$BooleanList;Lcom/google/protobuf/Internal$BooleanList;)Lcom/google/protobuf/Internal$BooleanList;
    .locals 1

    .line 1976
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1977
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1979
    :cond_0
    return-object p1
.end method

.method public visitByteString(ZLcom/google/protobuf/ByteString;ZLcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1874
    if-ne p1, p3, :cond_0

    invoke-virtual {p2, p4}, Lcom/google/protobuf/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1875
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1877
    :cond_1
    return-object p2
.end method

.method public visitDouble(ZDZD)D
    .locals 1

    .line 1840
    if-ne p1, p4, :cond_0

    cmpl-double v0, p2, p5

    if-eqz v0, :cond_1

    .line 1841
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1843
    :cond_1
    return-wide p2
.end method

.method public visitDoubleList(Lcom/google/protobuf/Internal$DoubleList;Lcom/google/protobuf/Internal$DoubleList;)Lcom/google/protobuf/Internal$DoubleList;
    .locals 1

    .line 1992
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1993
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1995
    :cond_0
    return-object p1
.end method

.method public visitExtensions(Lcom/google/protobuf/FieldSet;Lcom/google/protobuf/FieldSet;)Lcom/google/protobuf/FieldSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;)Lcom/google/protobuf/FieldSet<Lcom/google/protobuf/GeneratedMessageLite$ExtensionDescriptor;>;"
        }
    .end annotation

    .line 2018
    invoke-virtual {p1, p2}, Lcom/google/protobuf/FieldSet;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2019
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 2021
    :cond_0
    return-object p1
.end method

.method public visitFloat(ZFZF)F
    .locals 1

    .line 1848
    if-ne p1, p3, :cond_0

    cmpl-float v0, p2, p4

    if-eqz v0, :cond_1

    .line 1849
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1851
    :cond_1
    return p2
.end method

.method public visitFloatList(Lcom/google/protobuf/Internal$FloatList;Lcom/google/protobuf/Internal$FloatList;)Lcom/google/protobuf/Internal$FloatList;
    .locals 1

    .line 2000
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2001
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 2003
    :cond_0
    return-object p1
.end method

.method public visitInt(ZIZI)I
    .locals 1

    .line 1831
    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    .line 1832
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1834
    :cond_1
    return p2
.end method

.method public visitIntList(Lcom/google/protobuf/Internal$IntList;Lcom/google/protobuf/Internal$IntList;)Lcom/google/protobuf/Internal$IntList;
    .locals 1

    .line 1984
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1985
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1987
    :cond_0
    return-object p1
.end method

.method public visitList(Lcom/google/protobuf/Internal$ProtobufList;Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lcom/google/protobuf/Internal$ProtobufList<TT;>;Lcom/google/protobuf/Internal$ProtobufList<TT;>;)Lcom/google/protobuf/Internal$ProtobufList<TT;>;"
        }
    .end annotation

    .line 1968
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1969
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1971
    :cond_0
    return-object p1
.end method

.method public visitLong(ZJZJ)J
    .locals 1

    .line 1856
    if-ne p1, p4, :cond_0

    cmp-long v0, p2, p5

    if-eqz v0, :cond_1

    .line 1857
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1859
    :cond_1
    return-wide p2
.end method

.method public visitLongList(Lcom/google/protobuf/Internal$LongList;Lcom/google/protobuf/Internal$LongList;)Lcom/google/protobuf/Internal$LongList;
    .locals 1

    .line 2008
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2009
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 2011
    :cond_0
    return-object p1
.end method

.method public visitMap(Lcom/google/protobuf/MapFieldLite;Lcom/google/protobuf/MapFieldLite;)Lcom/google/protobuf/MapFieldLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lcom/google/protobuf/MapFieldLite<TK;TV;>;Lcom/google/protobuf/MapFieldLite<TK;TV;>;)Lcom/google/protobuf/MapFieldLite<TK;TV;>;"
        }
    .end annotation

    .line 2036
    invoke-virtual {p1, p2}, Lcom/google/protobuf/MapFieldLite;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2037
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 2039
    :cond_0
    return-object p1
.end method

.method public visitMessage(Lcom/google/protobuf/MessageLite;Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/MessageLite;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::Lcom/google/protobuf/MessageLite;>(TT;TT;)TT;"
        }
    .end annotation

    .line 1953
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 1954
    const/4 v0, 0x0

    return-object v0

    .line 1957
    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_2

    .line 1958
    :cond_1
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1961
    :cond_2
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    invoke-virtual {v0, p0, p2}, Lcom/google/protobuf/GeneratedMessageLite;->equals(Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;Lcom/google/protobuf/MessageLite;)Z

    .line 1963
    return-object p1
.end method

.method public visitOneofBoolean(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1882
    if-eqz p1, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1883
    return-object p2

    .line 1885
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitOneofByteString(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1930
    if-eqz p1, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1931
    return-object p2

    .line 1933
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitOneofDouble(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1898
    if-eqz p1, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1899
    return-object p2

    .line 1901
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitOneofFloat(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1906
    if-eqz p1, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1907
    return-object p2

    .line 1909
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitOneofInt(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1890
    if-eqz p1, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1891
    return-object p2

    .line 1893
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitOneofLong(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1914
    if-eqz p1, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1915
    return-object p2

    .line 1917
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitOneofMessage(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1938
    if-eqz p1, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/protobuf/GeneratedMessageLite;

    move-object v1, p3

    check-cast v1, Lcom/google/protobuf/MessageLite;

    invoke-virtual {v0, p0, v1}, Lcom/google/protobuf/GeneratedMessageLite;->equals(Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;Lcom/google/protobuf/MessageLite;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1939
    return-object p2

    .line 1941
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitOneofNotSet(Z)V
    .locals 1

    .line 1946
    if-eqz p1, :cond_0

    .line 1947
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1949
    :cond_0
    return-void
.end method

.method public visitOneofString(ZLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1922
    if-eqz p1, :cond_0

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1923
    return-object p2

    .line 1925
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0
.end method

.method public visitString(ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1865
    if-ne p1, p3, :cond_0

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1866
    :cond_0
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 1868
    :cond_1
    return-object p2
.end method

.method public visitUnknownFields(Lcom/google/protobuf/UnknownFieldSetLite;Lcom/google/protobuf/UnknownFieldSetLite;)Lcom/google/protobuf/UnknownFieldSetLite;
    .locals 1

    .line 2028
    invoke-virtual {p1, p2}, Lcom/google/protobuf/UnknownFieldSetLite;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2029
    sget-object v0, Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor;->NOT_EQUALS:Lcom/google/protobuf/GeneratedMessageLite$EqualsVisitor$NotEqualsException;

    throw v0

    .line 2031
    :cond_0
    return-object p1
.end method
