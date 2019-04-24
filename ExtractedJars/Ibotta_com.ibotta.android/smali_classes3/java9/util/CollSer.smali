.class final Ljava9/util/CollSer;
.super Ljava/lang/Object;
.source "ImmutableCollections.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x578eabb63a1ba811L


# instance fields
.field private transient array:[Ljava/lang/Object;

.field private final tag:I


# direct methods
.method varargs constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 885
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 886
    iput p1, p0, Ljava9/util/CollSer;->tag:I

    .line 887
    iput-object p2, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    return-void
.end method

.method private static ioe(Ljava/lang/RuntimeException;)Ljava/io/InvalidObjectException;
    .locals 2

    .line 990
    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "invalid object"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 991
    invoke-virtual {v0, p0}, Ljava/io/InvalidObjectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 905
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 906
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    if-ltz v0, :cond_1

    .line 912
    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 914
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 917
    :cond_0
    iput-object v1, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    return-void

    .line 909
    :cond_1
    new-instance p1, Ljava/io/InvalidObjectException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "negative length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 960
    :try_start_0
    iget-object v0, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 966
    iget v0, p0, Ljava9/util/CollSer;->tag:I

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    .line 980
    new-instance v0, Ljava/io/InvalidObjectException;

    goto :goto_0

    .line 972
    :pswitch_0
    iget-object v0, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 973
    invoke-static {}, Ljava9/util/ImmutableCollections$Map0;->instance()Ljava9/util/ImmutableCollections$Map0;

    move-result-object v0

    return-object v0

    .line 974
    :cond_0
    iget-object v0, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    .line 975
    new-instance v0, Ljava9/util/ImmutableCollections$Map1;

    iget-object v3, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    aget-object v1, v3, v1

    iget-object v3, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    aget-object v2, v3, v2

    invoke-direct {v0, v1, v2}, Ljava9/util/ImmutableCollections$Map1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    .line 977
    :cond_1
    new-instance v0, Ljava9/util/ImmutableCollections$MapN;

    iget-object v1, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    invoke-direct {v0, v1}, Ljava9/util/ImmutableCollections$MapN;-><init>([Ljava/lang/Object;)V

    return-object v0

    .line 970
    :pswitch_1
    iget-object v0, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    invoke-static {v0}, Ljava9/util/ImmutableCollections;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 968
    :pswitch_2
    iget-object v0, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    invoke-static {v0}, Ljava9/util/ImmutableCollections;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :goto_0
    const-string v3, "invalid flags 0x%x"

    .line 980
    new-array v2, v2, [Ljava/lang/Object;

    iget v4, p0, Ljava9/util/CollSer;->tag:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v1

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 961
    :cond_2
    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "null array"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 985
    invoke-static {v0}, Ljava9/util/CollSer;->ioe(Ljava/lang/RuntimeException;)Ljava/io/InvalidObjectException;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 983
    invoke-static {v0}, Ljava9/util/CollSer;->ioe(Ljava/lang/RuntimeException;)Ljava/io/InvalidObjectException;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 933
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 934
    iget-object v0, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    array-length v0, v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    const/4 v0, 0x0

    .line 935
    :goto_0
    iget-object v1, p0, Ljava9/util/CollSer;->array:[Ljava/lang/Object;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 936
    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
