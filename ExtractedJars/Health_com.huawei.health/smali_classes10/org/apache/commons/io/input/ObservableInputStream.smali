.class public Lorg/apache/commons/io/input/ObservableInputStream;
.super Lorg/apache/commons/io/input/ProxyInputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/input/ObservableInputStream$Observer;
    }
.end annotation


# instance fields
.field private final observers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/apache/commons/io/input/ObservableInputStream$Observer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 87
    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/ProxyInputStream;-><init>(Ljava/io/InputStream;)V

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/io/input/ObservableInputStream;->observers:Ljava/util/List;

    .line 88
    return-void
.end method


# virtual methods
.method public add(Lorg/apache/commons/io/input/ObservableInputStream$Observer;)V
    .locals 1

    .line 95
    iget-object v0, p0, Lorg/apache/commons/io/input/ObservableInputStream;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    return-void
.end method

.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 238
    const/4 v1, 0x0

    .line 240
    :try_start_0
    invoke-super {p0}, Lorg/apache/commons/io/input/ProxyInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    goto :goto_0

    .line 241
    :catch_0
    move-exception v2

    .line 242
    move-object v1, v2

    .line 244
    :goto_0
    if-nez v1, :cond_0

    .line 245
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->noteClosed()V

    goto :goto_1

    .line 247
    :cond_0
    invoke-virtual {p0, v1}, Lorg/apache/commons/io/input/ObservableInputStream;->noteError(Ljava/io/IOException;)V

    .line 249
    :goto_1
    return-void
.end method

.method public consume()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 257
    const/16 v0, 0x2000

    new-array v1, v0, [B

    .line 259
    :goto_0
    invoke-virtual {p0, v1}, Lorg/apache/commons/io/input/ObservableInputStream;->read([B)I

    move-result v2

    .line 260
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    .line 261
    return-void

    .line 263
    :cond_0
    goto :goto_0
.end method

.method protected getObservers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lorg/apache/commons/io/input/ObservableInputStream$Observer;>;"
        }
    .end annotation

    .line 233
    iget-object v0, p0, Lorg/apache/commons/io/input/ObservableInputStream;->observers:Ljava/util/List;

    return-object v0
.end method

.method protected noteClosed()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 224
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->getObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/input/ObservableInputStream$Observer;

    .line 225
    invoke-virtual {v2}, Lorg/apache/commons/io/input/ObservableInputStream$Observer;->closed()V

    .line 226
    goto :goto_0

    .line 227
    :cond_0
    return-void
.end method

.method protected noteDataByte(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 201
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->getObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/input/ObservableInputStream$Observer;

    .line 202
    invoke-virtual {v2, p1}, Lorg/apache/commons/io/input/ObservableInputStream$Observer;->data(I)V

    .line 203
    goto :goto_0

    .line 204
    :cond_0
    return-void
.end method

.method protected noteDataBytes([BII)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 179
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->getObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/input/ObservableInputStream$Observer;

    .line 180
    invoke-virtual {v2, p1, p2, p3}, Lorg/apache/commons/io/input/ObservableInputStream$Observer;->data([BII)V

    .line 181
    goto :goto_0

    .line 182
    :cond_0
    return-void
.end method

.method protected noteError(Ljava/io/IOException;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 214
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->getObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/input/ObservableInputStream$Observer;

    .line 215
    invoke-virtual {v2, p1}, Lorg/apache/commons/io/input/ObservableInputStream$Observer;->error(Ljava/io/IOException;)V

    .line 216
    goto :goto_0

    .line 217
    :cond_0
    return-void
.end method

.method protected noteFinished()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 189
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->getObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/input/ObservableInputStream$Observer;

    .line 190
    invoke-virtual {v2}, Lorg/apache/commons/io/input/ObservableInputStream$Observer;->finished()V

    .line 191
    goto :goto_0

    .line 192
    :cond_0
    return-void
.end method

.method public read()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 115
    const/4 v1, 0x0

    .line 116
    const/4 v2, 0x0

    .line 118
    :try_start_0
    invoke-super {p0}, Lorg/apache/commons/io/input/ProxyInputStream;->read()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 121
    goto :goto_0

    .line 119
    :catch_0
    move-exception v3

    .line 120
    move-object v2, v3

    .line 122
    :goto_0
    if-eqz v2, :cond_0

    .line 123
    invoke-virtual {p0, v2}, Lorg/apache/commons/io/input/ObservableInputStream;->noteError(Ljava/io/IOException;)V

    goto :goto_1

    .line 124
    :cond_0
    const/4 v0, -0x1

    if-ne v1, v0, :cond_1

    .line 125
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->noteFinished()V

    goto :goto_1

    .line 127
    :cond_1
    invoke-virtual {p0, v1}, Lorg/apache/commons/io/input/ObservableInputStream;->noteDataByte(I)V

    .line 129
    :goto_1
    return v1
.end method

.method public read([B)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 134
    const/4 v1, 0x0

    .line 135
    const/4 v2, 0x0

    .line 137
    :try_start_0
    invoke-super {p0, p1}, Lorg/apache/commons/io/input/ProxyInputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 140
    goto :goto_0

    .line 138
    :catch_0
    move-exception v3

    .line 139
    move-object v2, v3

    .line 141
    :goto_0
    if-eqz v2, :cond_0

    .line 142
    invoke-virtual {p0, v2}, Lorg/apache/commons/io/input/ObservableInputStream;->noteError(Ljava/io/IOException;)V

    goto :goto_1

    .line 143
    :cond_0
    const/4 v0, -0x1

    if-ne v1, v0, :cond_1

    .line 144
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->noteFinished()V

    goto :goto_1

    .line 145
    :cond_1
    if-lez v1, :cond_2

    .line 146
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lorg/apache/commons/io/input/ObservableInputStream;->noteDataBytes([BII)V

    .line 148
    :cond_2
    :goto_1
    return v1
.end method

.method public read([BII)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 153
    const/4 v1, 0x0

    .line 154
    const/4 v2, 0x0

    .line 156
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/io/input/ProxyInputStream;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    .line 159
    goto :goto_0

    .line 157
    :catch_0
    move-exception v3

    .line 158
    move-object v2, v3

    .line 160
    :goto_0
    if-eqz v2, :cond_0

    .line 161
    invoke-virtual {p0, v2}, Lorg/apache/commons/io/input/ObservableInputStream;->noteError(Ljava/io/IOException;)V

    goto :goto_1

    .line 162
    :cond_0
    const/4 v0, -0x1

    if-ne v1, v0, :cond_1

    .line 163
    invoke-virtual {p0}, Lorg/apache/commons/io/input/ObservableInputStream;->noteFinished()V

    goto :goto_1

    .line 164
    :cond_1
    if-lez v1, :cond_2

    .line 165
    invoke-virtual {p0, p1, p2, v1}, Lorg/apache/commons/io/input/ObservableInputStream;->noteDataBytes([BII)V

    .line 167
    :cond_2
    :goto_1
    return v1
.end method

.method public remove(Lorg/apache/commons/io/input/ObservableInputStream$Observer;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lorg/apache/commons/io/input/ObservableInputStream;->observers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 104
    return-void
.end method

.method public removeAllObservers()V
    .locals 1

    .line 110
    iget-object v0, p0, Lorg/apache/commons/io/input/ObservableInputStream;->observers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 111
    return-void
.end method
