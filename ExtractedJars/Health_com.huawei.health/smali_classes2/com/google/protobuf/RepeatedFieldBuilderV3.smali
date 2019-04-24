.class public Lcom/google/protobuf/RepeatedFieldBuilderV3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/AbstractMessage$BuilderParent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;,
        Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;,
        Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MType:Lcom/google/protobuf/AbstractMessage;BType:Lcom/google/protobuf/AbstractMessage$Builder;IType::Lcom/google/protobuf/MessageOrBuilder;>Ljava/lang/Object;Lcom/google/protobuf/AbstractMessage$BuilderParent;"
    }
.end annotation


# instance fields
.field private builders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/SingleFieldBuilderV3<TMType;TBType;TIType;>;>;"
        }
    .end annotation
.end field

.field private externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList<TMType;TBType;TIType;>;"
        }
    .end annotation
.end field

.field private externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList<TMType;TBType;TIType;>;"
        }
    .end annotation
.end field

.field private externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList<TMType;TBType;TIType;>;"
        }
    .end annotation
.end field

.field private isClean:Z

.field private isMessagesListMutable:Z

.field private messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<TMType;>;"
        }
    .end annotation
.end field

.field private parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TMType;>;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V"
        }
    .end annotation

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    .line 140
    iput-boolean p2, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isMessagesListMutable:Z

    .line 141
    iput-object p3, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    .line 142
    iput-boolean p4, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isClean:Z

    .line 143
    return-void
.end method

.method private ensureBuilders()V
    .locals 3

    .line 167
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    .line 170
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    .line 171
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 175
    :cond_0
    return-void
.end method

.method private ensureMutableMessageList()V
    .locals 2

    .line 155
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isMessagesListMutable:Z

    if-nez v0, :cond_0

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isMessagesListMutable:Z

    .line 159
    :cond_0
    return-void
.end method

.method private getMessage(IZ)Lcom/google/protobuf/AbstractMessage;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)TMType;"
        }
    .end annotation

    .line 218
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/AbstractMessage;

    return-object v0

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 226
    if-nez v1, :cond_1

    .line 230
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/AbstractMessage;

    return-object v0

    .line 233
    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private incrementModCounts()V
    .locals 1

    .line 587
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;

    if-eqz v0, :cond_0

    .line 588
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;->incrementModCount()V

    .line 590
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;

    if-eqz v0, :cond_1

    .line 591
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;->incrementModCount()V

    .line 593
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;

    if-eqz v0, :cond_2

    .line 594
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;->incrementModCount()V

    .line 596
    :cond_2
    return-void
.end method

.method private onChanged()V
    .locals 1

    .line 568
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isClean:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    if-eqz v0, :cond_0

    .line 569
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    invoke-interface {v0}, Lcom/google/protobuf/AbstractMessage$BuilderParent;->markDirty()V

    .line 572
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isClean:Z

    .line 574
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+TMType;>;)Lcom/google/protobuf/RepeatedFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 361
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/protobuf/AbstractMessage;

    .line 362
    invoke-static {v3}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    goto :goto_0

    .line 366
    :cond_0
    const/4 v2, -0x1

    .line 367
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_2

    .line 369
    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    .line 370
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 371
    return-object p0

    .line 373
    :cond_1
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v2

    .line 375
    :cond_2
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 377
    if-ltz v2, :cond_3

    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    instance-of v0, v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 378
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    .line 379
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 382
    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/protobuf/AbstractMessage;

    .line 383
    invoke-virtual {p0, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 384
    goto :goto_1

    .line 386
    :cond_4
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 387
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 388
    return-object p0
.end method

.method public addBuilder(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITMType;)TBType;"
        }
    .end annotation

    .line 420
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 421
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureBuilders()V

    .line 422
    new-instance v2, Lcom/google/protobuf/SingleFieldBuilderV3;

    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isClean:Z

    invoke-direct {v2, p2, p0, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 425
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 426
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0, p1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 427
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 428
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 429
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addBuilder(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMType;)TBType;"
        }
    .end annotation

    .line 398
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 399
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureBuilders()V

    .line 400
    new-instance v2, Lcom/google/protobuf/SingleFieldBuilderV3;

    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isClean:Z

    invoke-direct {v2, p1, p0, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 403
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 404
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 405
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 406
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 407
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITMType;)Lcom/google/protobuf/RepeatedFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 340
    invoke-static {p2}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 342
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 343
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 346
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 347
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 348
    return-object p0
.end method

.method public addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMType;)Lcom/google/protobuf/RepeatedFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 318
    invoke-static {p1}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 320
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 321
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 325
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 326
    return-object p0
.end method

.method public build()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TMType;>;"
        }
    .end annotation

    .line 481
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isClean:Z

    .line 483
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isMessagesListMutable:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    return-object v0

    .line 488
    :cond_0
    const/4 v2, 0x1

    .line 489
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isMessagesListMutable:Z

    if-nez v0, :cond_3

    .line 492
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 493
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/protobuf/Message;

    .line 494
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 495
    if-eqz v5, :cond_1

    .line 496
    invoke-virtual {v5}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    if-eq v0, v4, :cond_1

    .line 497
    const/4 v2, 0x0

    .line 498
    goto :goto_1

    .line 492
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 502
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 504
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    return-object v0

    .line 509
    :cond_3
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 510
    const/4 v3, 0x0

    :goto_2
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 511
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    const/4 v1, 0x1

    invoke-direct {p0, v3, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(IZ)Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 510
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 516
    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    .line 517
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isMessagesListMutable:Z

    .line 518
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    return-object v0
.end method

.method public clear()V
    .locals 3

    .line 458
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    .line 459
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isMessagesListMutable:Z

    .line 460
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 462
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 463
    if-eqz v2, :cond_0

    .line 464
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 466
    :cond_0
    goto :goto_0

    .line 467
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    .line 469
    :cond_2
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 470
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 471
    return-void
.end method

.method public dispose()V
    .locals 1

    .line 147
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->parent:Lcom/google/protobuf/AbstractMessage$BuilderParent;

    .line 148
    return-void
.end method

.method public getBuilder(I)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TBType;"
        }
    .end annotation

    .line 246
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureBuilders()V

    .line 247
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 248
    if-nez v1, :cond_0

    .line 249
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/protobuf/AbstractMessage;

    .line 250
    new-instance v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isClean:Z

    invoke-direct {v1, v2, p0, v0}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 252
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 254
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TBType;>;"
        }
    .end annotation

    .line 542
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;

    if-nez v0, :cond_0

    .line 543
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;

    invoke-direct {v0, p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;-><init>(Lcom/google/protobuf/RepeatedFieldBuilderV3;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;

    .line 546
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$BuilderExternalList;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getMessage(I)Lcom/google/protobuf/AbstractMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TMType;"
        }
    .end annotation

    .line 204
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(IZ)Lcom/google/protobuf/AbstractMessage;

    move-result-object v0

    return-object v0
.end method

.method public getMessageList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TMType;>;"
        }
    .end annotation

    .line 528
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;

    if-nez v0, :cond_0

    .line 529
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;

    invoke-direct {v0, p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;-><init>(Lcom/google/protobuf/RepeatedFieldBuilderV3;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageExternalList;

    return-object v0
.end method

.method public getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TIType;"
        }
    .end annotation

    .line 266
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 270
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageOrBuilder;

    return-object v0

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 274
    if-nez v1, :cond_1

    .line 278
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageOrBuilder;

    return-object v0

    .line 281
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    return-object v0
.end method

.method public getMessageOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TIType;>;"
        }
    .end annotation

    .line 556
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;

    if-nez v0, :cond_0

    .line 557
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;

    invoke-direct {v0, p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;-><init>(Lcom/google/protobuf/RepeatedFieldBuilderV3;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;

    .line 560
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilderV3$MessageOrBuilderExternalList;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public markDirty()V
    .locals 0

    .line 578
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 579
    return-void
.end method

.method public remove(I)V
    .locals 2

    .line 440
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 441
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 442
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    .line 444
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 445
    if-eqz v1, :cond_0

    .line 446
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 449
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 450
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 451
    return-void
.end method

.method public setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITMType;)Lcom/google/protobuf/RepeatedFieldBuilderV3<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 295
    invoke-static {p2}, Lcom/google/protobuf/Internal;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->ensureMutableMessageList()V

    .line 297
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->messages:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 298
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilderV3;->builders:Ljava/util/List;

    .line 300
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 301
    if-eqz v2, :cond_0

    .line 302
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 305
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->onChanged()V

    .line 306
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->incrementModCounts()V

    .line 307
    return-object p0
.end method
