.class public abstract Lo/fts;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lo/fts;->a:Ljava/lang/String;

    .line 34
    return-void
.end method

.method protected static d(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ftx;
        }
    .end annotation

    .line 73
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 77
    array-length v0, v2

    const/16 v1, 0x3ff

    if-le v0, v1, :cond_0

    .line 78
    new-instance v0, Lo/ftx;

    const-string v1, "Given string is longer then 1023 bytes"

    invoke-direct {v0, p0, v1}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 79
    :cond_0
    array-length v0, v2

    if-nez v0, :cond_1

    .line 80
    new-instance v0, Lo/ftx;

    const-string v1, "Argument can\'t be the empty string"

    invoke-direct {v0, p0, v1}, Lo/ftx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_1
    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 1

    .line 43
    iget-object v0, p0, Lo/fts;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 58
    if-nez p1, :cond_0

    .line 59
    const/4 v0, 0x0

    return v0

    .line 61
    :cond_0
    if-ne p0, p1, :cond_1

    .line 62
    const/4 v0, 0x1

    return v0

    .line 64
    :cond_1
    iget-object v0, p0, Lo/fts;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 69
    iget-object v0, p0, Lo/fts;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final length()I
    .locals 1

    .line 38
    iget-object v0, p0, Lo/fts;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/fts;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lo/fts;->a:Ljava/lang/String;

    return-object v0
.end method
