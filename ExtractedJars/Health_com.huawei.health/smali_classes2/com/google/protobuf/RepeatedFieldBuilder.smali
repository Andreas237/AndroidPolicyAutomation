.class public Lcom/google/protobuf/RepeatedFieldBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/GeneratedMessage$BuilderParent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;,
        Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;,
        Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MType:Lcom/google/protobuf/GeneratedMessage;BType:Lcom/google/protobuf/GeneratedMessage$Builder;IType::Lcom/google/protobuf/MessageOrBuilder;>Ljava/lang/Object;Lcom/google/protobuf/GeneratedMessage$BuilderParent;"
    }
.end annotation


# instance fields
.field private builders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/google/protobuf/SingleFieldBuilder<TMType;TBType;TIType;>;>;"
        }
    .end annotation
.end field

.field private externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList<TMType;TBType;TIType;>;"
        }
    .end annotation
.end field

.field private externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList<TMType;TBType;TIType;>;"
        }
    .end annotation
.end field

.field private externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList<TMType;TBType;TIType;>;"
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

.field private parent:Lcom/google/protobuf/GeneratedMessage$BuilderParent;


# direct methods
.method public constructor <init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TMType;>;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V"
        }
    .end annotation

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-object p1, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    .line 138
    iput-boolean p2, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isMessagesListMutable:Z

    .line 139
    iput-object p3, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->parent:Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    .line 140
    iput-boolean p4, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isClean:Z

    .line 141
    return-void
.end method

.method private ensureBuilders()V
    .locals 3

    .line 165
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    .line 168
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    .line 169
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 173
    :cond_0
    return-void
.end method

.method private ensureMutableMessageList()V
    .locals 2

    .line 153
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isMessagesListMutable:Z

    if-nez v0, :cond_0

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    .line 155
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isMessagesListMutable:Z

    .line 157
    :cond_0
    return-void
.end method

.method private getMessage(IZ)Lcom/google/protobuf/GeneratedMessage;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ)TMType;"
        }
    .end annotation

    .line 216
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage;

    return-object v0

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilder;

    .line 224
    if-nez v1, :cond_1

    .line 228
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/GeneratedMessage;

    return-object v0

    .line 231
    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private incrementModCounts()V
    .locals 1

    .line 593
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;

    if-eqz v0, :cond_0

    .line 594
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;->incrementModCount()V

    .line 596
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;

    if-eqz v0, :cond_1

    .line 597
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;->incrementModCount()V

    .line 599
    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;

    if-eqz v0, :cond_2

    .line 600
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;->incrementModCount()V

    .line 602
    :cond_2
    return-void
.end method

.method private onChanged()V
    .locals 1

    .line 574
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isClean:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->parent:Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    if-eqz v0, :cond_0

    .line 575
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->parent:Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    invoke-interface {v0}, Lcom/google/protobuf/GeneratedMessage$BuilderParent;->markDirty()V

    .line 578
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isClean:Z

    .line 580
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+TMType;>;)Lcom/google/protobuf/RepeatedFieldBuilder<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 365
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/protobuf/GeneratedMessage;

    .line 366
    if-nez v3, :cond_0

    .line 367
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 369
    :cond_0
    goto :goto_0

    .line 372
    :cond_1
    const/4 v2, -0x1

    .line 373
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_3

    .line 375
    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    .line 376
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 377
    return-object p0

    .line 379
    :cond_2
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v2

    .line 381
    :cond_3
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 383
    if-ltz v2, :cond_4

    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    instance-of v0, v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 384
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    .line 385
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 388
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/protobuf/GeneratedMessage;

    .line 389
    invoke-virtual {p0, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 390
    goto :goto_1

    .line 392
    :cond_5
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 393
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 394
    return-object p0
.end method

.method public addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITMType;)TBType;"
        }
    .end annotation

    .line 426
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 427
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureBuilders()V

    .line 428
    new-instance v2, Lcom/google/protobuf/SingleFieldBuilder;

    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isClean:Z

    invoke-direct {v2, p2, p0, v0}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    .line 431
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 432
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0, p1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 433
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 434
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 435
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMType;)TBType;"
        }
    .end annotation

    .line 404
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 405
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureBuilders()V

    .line 406
    new-instance v2, Lcom/google/protobuf/SingleFieldBuilder;

    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isClean:Z

    invoke-direct {v2, p1, p0, v0}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    .line 409
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 410
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 412
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 413
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITMType;)Lcom/google/protobuf/RepeatedFieldBuilder<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 342
    if-nez p2, :cond_0

    .line 343
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 345
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 346
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 347
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 348
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 350
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 351
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 352
    return-object p0
.end method

.method public addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMType;)Lcom/google/protobuf/RepeatedFieldBuilder<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 318
    if-nez p1, :cond_0

    .line 319
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 321
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 322
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 324
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 327
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 328
    return-object p0
.end method

.method public build()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<TMType;>;"
        }
    .end annotation

    .line 487
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isClean:Z

    .line 489
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isMessagesListMutable:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 491
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    return-object v0

    .line 494
    :cond_0
    const/4 v2, 0x1

    .line 495
    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isMessagesListMutable:Z

    if-nez v0, :cond_3

    .line 498
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 499
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/google/protobuf/Message;

    .line 500
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/protobuf/SingleFieldBuilder;

    .line 501
    if-eqz v5, :cond_1

    .line 502
    invoke-virtual {v5}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    if-eq v0, v4, :cond_1

    .line 503
    const/4 v2, 0x0

    .line 504
    goto :goto_1

    .line 498
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 508
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 510
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    return-object v0

    .line 515
    :cond_3
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 516
    const/4 v3, 0x0

    :goto_2
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 517
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    const/4 v1, 0x1

    invoke-direct {p0, v3, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(IZ)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 516
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 522
    :cond_4
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    .line 523
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isMessagesListMutable:Z

    .line 524
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    return-object v0
.end method

.method public clear()V
    .locals 3

    .line 464
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    .line 465
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isMessagesListMutable:Z

    .line 466
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 468
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/protobuf/SingleFieldBuilder;

    .line 469
    if-eqz v2, :cond_0

    .line 470
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilder;->dispose()V

    .line 472
    :cond_0
    goto :goto_0

    .line 473
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    .line 475
    :cond_2
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 476
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 477
    return-void
.end method

.method public dispose()V
    .locals 1

    .line 145
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->parent:Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    .line 146
    return-void
.end method

.method public getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TBType;"
        }
    .end annotation

    .line 244
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureBuilders()V

    .line 245
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilder;

    .line 246
    if-nez v1, :cond_0

    .line 247
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/protobuf/GeneratedMessage;

    .line 248
    new-instance v1, Lcom/google/protobuf/SingleFieldBuilder;

    iget-boolean v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->isClean:Z

    invoke-direct {v1, v2, p0, v0}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    .line 250
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 252
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

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

    .line 548
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;

    if-nez v0, :cond_0

    .line 549
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;

    invoke-direct {v0, p0}, Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;-><init>(Lcom/google/protobuf/RepeatedFieldBuilder;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;

    .line 552
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$BuilderExternalList;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getMessage(I)Lcom/google/protobuf/GeneratedMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TMType;"
        }
    .end annotation

    .line 202
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(IZ)Lcom/google/protobuf/GeneratedMessage;

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

    .line 534
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;

    if-nez v0, :cond_0

    .line 535
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;

    invoke-direct {v0, p0}, Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;-><init>(Lcom/google/protobuf/RepeatedFieldBuilder;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;

    .line 538
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageExternalList;

    return-object v0
.end method

.method public getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TIType;"
        }
    .end annotation

    .line 264
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-nez v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageOrBuilder;

    return-object v0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilder;

    .line 272
    if-nez v1, :cond_1

    .line 276
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/MessageOrBuilder;

    return-object v0

    .line 279
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

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

    .line 562
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;

    if-nez v0, :cond_0

    .line 563
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;

    invoke-direct {v0, p0}, Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;-><init>(Lcom/google/protobuf/RepeatedFieldBuilder;)V

    iput-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;

    .line 566
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->externalMessageOrBuilderList:Lcom/google/protobuf/RepeatedFieldBuilder$MessageOrBuilderExternalList;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public markDirty()V
    .locals 0

    .line 584
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 585
    return-void
.end method

.method public remove(I)V
    .locals 2

    .line 446
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 447
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 448
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    .line 450
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/protobuf/SingleFieldBuilder;

    .line 451
    if-eqz v1, :cond_0

    .line 452
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilder;->dispose()V

    .line 455
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 456
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 457
    return-void
.end method

.method public setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITMType;)Lcom/google/protobuf/RepeatedFieldBuilder<TMType;TBType;TIType;>;"
        }
    .end annotation

    .line 293
    if-nez p2, :cond_0

    .line 294
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 296
    :cond_0
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->ensureMutableMessageList()V

    .line 297
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->messages:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 298
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 299
    iget-object v0, p0, Lcom/google/protobuf/RepeatedFieldBuilder;->builders:Ljava/util/List;

    .line 300
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/google/protobuf/SingleFieldBuilder;

    .line 301
    if-eqz v2, :cond_1

    .line 302
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilder;->dispose()V

    .line 305
    :cond_1
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->onChanged()V

    .line 306
    invoke-direct {p0}, Lcom/google/protobuf/RepeatedFieldBuilder;->incrementModCounts()V

    .line 307
    return-object p0
.end method
