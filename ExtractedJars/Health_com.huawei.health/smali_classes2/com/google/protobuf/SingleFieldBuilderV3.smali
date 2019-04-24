.class public Lcom/google/protobuf/SingleFieldBuilderV3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/AbstractMessage$BuilderParent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MType:Lcom/google/protobuf/AbstractMessage;BType:Lcom/google/protobuf/AbstractMessage$Builder;IType::Lcom/google/protobuf/MessageOrBuilder;>Ljava/lang/Object;Lcom/google/protobuf/AbstractMessage$BuilderParent;"
    }
.end annotation


# instance fields
.field private builder:Lcom/google/protobuf/AbstractMessage$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TBType;"
        }
    .end annotation
.end field

.field private isClean:Z

.field private message:Lcom/google/protobuf/AbstractMessage;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMType;"
        }
    .end annotation
.end field

.field private parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMType;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V"
        }
    .end annotation

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    invoke-static {p1}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/AbstractMessage;

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    .line 90
    iput-object p2, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    .line 91
    iput-boolean p3, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->isClean:Z

    .line 92
    return-void
.end method

.method private onChanged()V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    if-eqz v0, :cond_0

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    .line 225
    :cond_0
    iget-boolean v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->isClean:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    if-eqz v0, :cond_1

    .line 226
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    invoke-interface {v0}, Lcom/google/protobuf/AbstractMessage$BuilderParent;->markDirty()V

    .line 229
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->isClean:Z

    .line 231
    :cond_1
    return-void
.end method


# virtual methods
.method public build()Lcom/google/protobuf/AbstractMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMType;"
        }
    .end annotation

    .line 124
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->isClean:Z

    .line 125
    invoke-virtual {p0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 204
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    .line 205
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessage;->getDefaultInstanceForType()Lcom/google/protobuf/Message;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    .line 206
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/Message;

    move-result-object v0

    :goto_0
    check-cast v0, Lcom/google/protobuf/AbstractMessage;

    check-cast v0, Lcom/google/protobuf/AbstractMessage;

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    .line 207
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    if-eqz v0, :cond_1

    .line 208
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->dispose()V

    .line 209
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    .line 211
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/SingleFieldBuilderV3;->onChanged()V

    .line 212
    return-object p0
.end method

.method public dispose()V
    .locals 1

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    .line 97
    return-void
.end method

.method public getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBType;"
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/AbstractMessage;->newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/AbstractMessage$Builder;

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    .line 142
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    iget-object v1, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 143
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->markClean()V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    return-object v0
.end method

.method public getMessage()Lcom/google/protobuf/AbstractMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMType;"
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->buildPartial()Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/AbstractMessage;

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    return-object v0
.end method

.method public getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TIType;"
        }
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    if-eqz v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    return-object v0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    return-object v0
.end method

.method public markDirty()V
    .locals 0

    .line 235
    invoke-direct {p0}, Lcom/google/protobuf/SingleFieldBuilderV3;->onChanged()V

    .line 236
    return-void
.end method

.method public mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMType;)Lcom/google/protobuf/SingleFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 188
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    iget-object v1, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    invoke-virtual {v1}, Lcom/google/protobuf/AbstractMessage;->getDefaultInstanceForType()Lcom/google/protobuf/Message;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 189
    iput-object p1, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    goto :goto_0

    .line 191
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 193
    :goto_0
    invoke-direct {p0}, Lcom/google/protobuf/SingleFieldBuilderV3;->onChanged()V

    .line 194
    return-object p0
.end method

.method public setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMType;)Lcom/google/protobuf/SingleFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 171
    invoke-static {p1}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/AbstractMessage;

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->message:Lcom/google/protobuf/AbstractMessage;

    .line 172
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->dispose()V

    .line 174
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/SingleFieldBuilderV3;->builder:Lcom/google/protobuf/AbstractMessage$Builder;

    .line 176
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/SingleFieldBuilderV3;->onChanged()V

    .line 177
    return-object p0
.end method
