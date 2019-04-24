.class public Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
.super Ljava/io/ObjectInputStream;
.source "SourceFile"


# instance fields
.field private final acceptMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/apache/commons/io/serialization/ClassNameMatcher;>;"
        }
    .end annotation
.end field

.field private final rejectMatchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/apache/commons/io/serialization/ClassNameMatcher;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->acceptMatchers:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->rejectMatchers:Ljava/util/List;

    .line 60
    return-void
.end method

.method private validateClassName(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InvalidClassException;
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->rejectMatchers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/serialization/ClassNameMatcher;

    .line 69
    invoke-interface {v2, p1}, Lorg/apache/commons/io/serialization/ClassNameMatcher;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->invalidClassNameFound(Ljava/lang/String;)V

    .line 72
    :cond_0
    goto :goto_0

    .line 74
    :cond_1
    const/4 v1, 0x0

    .line 75
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->acceptMatchers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lorg/apache/commons/io/serialization/ClassNameMatcher;

    .line 76
    invoke-interface {v3, p1}, Lorg/apache/commons/io/serialization/ClassNameMatcher;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    const/4 v1, 0x1

    .line 78
    goto :goto_2

    .line 80
    :cond_2
    goto :goto_1

    .line 81
    :cond_3
    :goto_2
    if-nez v1, :cond_4

    .line 82
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->invalidClassNameFound(Ljava/lang/String;)V

    .line 84
    :cond_4
    return-void
.end method


# virtual methods
.method public accept(Ljava/util/regex/Pattern;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 2

    .line 170
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->acceptMatchers:Ljava/util/List;

    new-instance v1, Lorg/apache/commons/io/serialization/RegexpClassNameMatcher;

    invoke-direct {v1, p1}, Lorg/apache/commons/io/serialization/RegexpClassNameMatcher;-><init>(Ljava/util/regex/Pattern;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    return-object p0
.end method

.method public accept(Lorg/apache/commons/io/serialization/ClassNameMatcher;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 1

    .line 194
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->acceptMatchers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    return-object p0
.end method

.method public varargs accept([Ljava/lang/Class;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/Class<*>;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;"
        }
    .end annotation

    .line 112
    move-object v5, p1

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 113
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->acceptMatchers:Ljava/util/List;

    new-instance v1, Lorg/apache/commons/io/serialization/FullClassNameMatcher;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-direct {v1, v2}, Lorg/apache/commons/io/serialization/FullClassNameMatcher;-><init>([Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 115
    :cond_0
    return-object p0
.end method

.method public varargs accept([Ljava/lang/String;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 6

    .line 141
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 142
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->acceptMatchers:Ljava/util/List;

    new-instance v1, Lorg/apache/commons/io/serialization/WildcardClassNameMatcher;

    invoke-direct {v1, v5}, Lorg/apache/commons/io/serialization/WildcardClassNameMatcher;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 144
    :cond_0
    return-object p0
.end method

.method protected invalidClassNameFound(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InvalidClassException;
        }
    .end annotation

    .line 95
    new-instance v0, Ljava/io/InvalidClassException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Class name not accepted: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public reject(Ljava/util/regex/Pattern;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 2

    .line 182
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->rejectMatchers:Ljava/util/List;

    new-instance v1, Lorg/apache/commons/io/serialization/RegexpClassNameMatcher;

    invoke-direct {v1, p1}, Lorg/apache/commons/io/serialization/RegexpClassNameMatcher;-><init>(Ljava/util/regex/Pattern;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 183
    return-object p0
.end method

.method public reject(Lorg/apache/commons/io/serialization/ClassNameMatcher;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 1

    .line 206
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->rejectMatchers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    return-object p0
.end method

.method public varargs reject([Ljava/lang/Class;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/Class<*>;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;"
        }
    .end annotation

    .line 126
    move-object v5, p1

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 127
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->rejectMatchers:Ljava/util/List;

    new-instance v1, Lorg/apache/commons/io/serialization/FullClassNameMatcher;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-direct {v1, v2}, Lorg/apache/commons/io/serialization/FullClassNameMatcher;-><init>([Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 129
    :cond_0
    return-object p0
.end method

.method public varargs reject([Ljava/lang/String;)Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;
    .locals 6

    .line 156
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 157
    iget-object v0, p0, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->rejectMatchers:Ljava/util/List;

    new-instance v1, Lorg/apache/commons/io/serialization/WildcardClassNameMatcher;

    invoke-direct {v1, v5}, Lorg/apache/commons/io/serialization/WildcardClassNameMatcher;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 159
    :cond_0
    return-object p0
.end method

.method protected resolveClass(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/ObjectStreamClass;)Ljava/lang/Class<*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 100
    invoke-virtual {p1}, Ljava/io/ObjectStreamClass;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/apache/commons/io/serialization/ValidatingObjectInputStream;->validateClassName(Ljava/lang/String;)V

    .line 101
    invoke-super {p0, p1}, Ljava/io/ObjectInputStream;->resolveClass(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
