.class final Lcom/squareup/haha/trove/SerializationProcedure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TIntObjectProcedure;
.implements Lcom/squareup/haha/trove/TLongObjectProcedure;
.implements Lcom/squareup/haha/trove/TLongProcedure;
.implements Lcom/squareup/haha/trove/TObjectObjectProcedure;
.implements Lcom/squareup/haha/trove/TObjectProcedure;


# instance fields
.field exception:Ljava/io/IOException;

.field private final stream:Ljava/io/ObjectOutputStream;


# direct methods
.method constructor <init>(Ljava/io/ObjectOutputStream;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    .line 77
    return-void
.end method


# virtual methods
.method public final execute(ILjava/lang/Object;)Z
    .locals 2

    .line 197
    :try_start_0
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 198
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    goto :goto_0

    .line 199
    :catch_0
    move-exception v1

    .line 200
    iput-object v1, p0, Lcom/squareup/haha/trove/SerializationProcedure;->exception:Ljava/io/IOException;

    .line 201
    const/4 v0, 0x0

    return v0

    .line 203
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final execute(J)Z
    .locals 2

    .line 104
    :try_start_0
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/ObjectOutputStream;->writeLong(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    goto :goto_0

    .line 105
    :catch_0
    move-exception v1

    .line 106
    iput-object v1, p0, Lcom/squareup/haha/trove/SerializationProcedure;->exception:Ljava/io/IOException;

    .line 107
    const/4 v0, 0x0

    return v0

    .line 109
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final execute(JLjava/lang/Object;)Z
    .locals 2

    .line 257
    :try_start_0
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/ObjectOutputStream;->writeLong(J)V

    .line 258
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    goto :goto_0

    .line 259
    :catch_0
    move-exception v1

    .line 260
    iput-object v1, p0, Lcom/squareup/haha/trove/SerializationProcedure;->exception:Ljava/io/IOException;

    .line 261
    const/4 v0, 0x0

    return v0

    .line 263
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final execute(Ljava/lang/Object;)Z
    .locals 2

    .line 126
    :try_start_0
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    goto :goto_0

    .line 127
    :catch_0
    move-exception v1

    .line 128
    iput-object v1, p0, Lcom/squareup/haha/trove/SerializationProcedure;->exception:Ljava/io/IOException;

    .line 129
    const/4 v0, 0x0

    return v0

    .line 131
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final execute(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 137
    :try_start_0
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 138
    iget-object v0, p0, Lcom/squareup/haha/trove/SerializationProcedure;->stream:Ljava/io/ObjectOutputStream;

    invoke-virtual {v0, p2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    goto :goto_0

    .line 139
    :catch_0
    move-exception v1

    .line 140
    iput-object v1, p0, Lcom/squareup/haha/trove/SerializationProcedure;->exception:Ljava/io/IOException;

    .line 141
    const/4 v0, 0x0

    return v0

    .line 143
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
