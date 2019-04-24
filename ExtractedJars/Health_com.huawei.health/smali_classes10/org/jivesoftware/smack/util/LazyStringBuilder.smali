.class public Lorg/jivesoftware/smack/util/LazyStringBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Appendable;
.implements Ljava/lang/CharSequence;


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private cache:Ljava/lang/String;

.field private final list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/CharSequence;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const-class v0, Lorg/jivesoftware/smack/util/LazyStringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->$assertionsDisabled:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    .line 35
    return-void
.end method

.method private invalidateCache()V
    .locals 1

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 23
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 23
    invoke-virtual {p0, p1}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 23
    invoke-virtual {p0, p1, p2, p3}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->append(Ljava/lang/CharSequence;II)Lorg/jivesoftware/smack/util/LazyStringBuilder;

    move-result-object v0

    return-object v0
.end method

.method public append(C)Lorg/jivesoftware/smack/util/LazyStringBuilder;
    .locals 2

    .line 61
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->invalidateCache()V

    .line 63
    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;)Lorg/jivesoftware/smack/util/LazyStringBuilder;
    .locals 1

    .line 45
    sget-boolean v0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 46
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->invalidateCache()V

    .line 48
    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;II)Lorg/jivesoftware/smack/util/LazyStringBuilder;
    .locals 2

    .line 53
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 54
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->invalidateCache()V

    .line 56
    return-object p0
.end method

.method public append(Lorg/jivesoftware/smack/util/LazyStringBuilder;)Lorg/jivesoftware/smack/util/LazyStringBuilder;
    .locals 2

    .line 38
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    iget-object v1, p1, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 39
    invoke-direct {p0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->invalidateCache()V

    .line 40
    return-object p0
.end method

.method public charAt(I)C
    .locals 3

    .line 80
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0

    .line 83
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    .line 84
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 85
    invoke-interface {v2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    return v0

    .line 87
    :cond_1
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr p1, v0

    .line 89
    goto :goto_0

    .line 90
    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public getAsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/CharSequence;>;"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 120
    :cond_0
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public length()I
    .locals 4

    .line 68
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0

    .line 71
    :cond_0
    const/4 v1, 0x0

    .line 72
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    .line 73
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/2addr v1, v0

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    return v1
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 95
    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 100
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/jivesoftware/smack/util/LazyStringBuilder;->length()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 102
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    .line 103
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 104
    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    .line 107
    :cond_1
    iget-object v0, p0, Lorg/jivesoftware/smack/util/LazyStringBuilder;->cache:Ljava/lang/String;

    return-object v0
.end method
