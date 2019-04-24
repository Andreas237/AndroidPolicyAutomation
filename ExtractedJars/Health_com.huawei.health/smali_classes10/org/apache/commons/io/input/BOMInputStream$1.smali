.class final Lorg/apache/commons/io/input/BOMInputStream$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/io/input/BOMInputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lorg/apache/commons/io/ByteOrderMark;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 140
    move-object v0, p1

    check-cast v0, Lorg/apache/commons/io/ByteOrderMark;

    move-object v1, p2

    check-cast v1, Lorg/apache/commons/io/ByteOrderMark;

    invoke-virtual {p0, v0, v1}, Lorg/apache/commons/io/input/BOMInputStream$1;->compare(Lorg/apache/commons/io/ByteOrderMark;Lorg/apache/commons/io/ByteOrderMark;)I

    move-result v0

    return v0
.end method

.method public compare(Lorg/apache/commons/io/ByteOrderMark;Lorg/apache/commons/io/ByteOrderMark;)I
    .locals 3

    .line 144
    invoke-virtual {p1}, Lorg/apache/commons/io/ByteOrderMark;->length()I

    move-result v1

    .line 145
    invoke-virtual {p2}, Lorg/apache/commons/io/ByteOrderMark;->length()I

    move-result v2

    .line 146
    if-le v1, v2, :cond_0

    .line 147
    const/4 v0, -0x1

    return v0

    .line 149
    :cond_0
    if-le v2, v1, :cond_1

    .line 150
    const/4 v0, 0x1

    return v0

    .line 152
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
