.class public Lorg/apache/commons/io/filefilter/NameFileFilter;
.super Lorg/apache/commons/io/filefilter/AbstractFileFilter;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x274470341d2745cL


# instance fields
.field private final caseSensitivity:Lorg/apache/commons/io/IOCase;

.field private final names:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 59
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/NameFileFilter;-><init>(Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V

    .line 60
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V
    .locals 2

    .line 69
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;-><init>()V

    .line 70
    if-nez p1, :cond_0

    .line 71
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The wildcard must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 73
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 74
    if-nez p2, :cond_1

    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    iput-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->caseSensitivity:Lorg/apache/commons/io/IOCase;

    .line 75
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 114
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/NameFileFilter;-><init>(Ljava/util/List;Lorg/apache/commons/io/IOCase;)V

    .line 115
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lorg/apache/commons/io/IOCase;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Lorg/apache/commons/io/IOCase;)V"
        }
    .end annotation

    .line 125
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;-><init>()V

    .line 126
    if-nez p1, :cond_0

    .line 127
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The list of names must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 130
    if-nez p2, :cond_1

    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    iput-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->caseSensitivity:Lorg/apache/commons/io/IOCase;

    .line 131
    return-void
.end method

.method public constructor <init>([Ljava/lang/String;)V
    .locals 1

    .line 87
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/filefilter/NameFileFilter;-><init>([Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V

    .line 88
    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Lorg/apache/commons/io/IOCase;)V
    .locals 4

    .line 97
    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;-><init>()V

    .line 98
    if-nez p1, :cond_0

    .line 99
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The array of names must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 101
    :cond_0
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    .line 102
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    if-nez p2, :cond_1

    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    iput-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->caseSensitivity:Lorg/apache/commons/io/IOCase;

    .line 104
    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 6

    .line 142
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 143
    iget-object v2, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 144
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->caseSensitivity:Lorg/apache/commons/io/IOCase;

    invoke-virtual {v0, v1, v5}, Lorg/apache/commons/io/IOCase;->checkEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    const/4 v0, 0x1

    return v0

    .line 143
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 148
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 5

    .line 160
    iget-object v1, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 161
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->caseSensitivity:Lorg/apache/commons/io/IOCase;

    invoke-virtual {v0, p2, v4}, Lorg/apache/commons/io/IOCase;->checkEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    const/4 v0, 0x1

    return v0

    .line 160
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 165
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    invoke-super {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    const-string v0, "("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 179
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 180
    if-lez v2, :cond_0

    .line 181
    const-string v0, ","

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/filefilter/NameFileFilter;->names:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 186
    :cond_1
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
