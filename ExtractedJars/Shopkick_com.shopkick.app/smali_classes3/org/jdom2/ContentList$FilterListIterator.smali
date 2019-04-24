.class final Lorg/jdom2/ContentList$FilterListIterator;
.super Ljava/lang/Object;
.source "ContentList.java"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/ContentList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "FilterListIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F:",
        "Lorg/jdom2/Content;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "TF;>;"
    }
.end annotation


# instance fields
.field private canremove:Z

.field private canset:Z

.field private cursor:I

.field private expectedmod:I

.field private final filterlist:Lorg/jdom2/ContentList$FilterList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/ContentList$FilterList<",
            "TF;>;"
        }
    .end annotation
.end field

.field private forward:Z

.field final synthetic this$0:Lorg/jdom2/ContentList;


# direct methods
.method constructor <init>(Lorg/jdom2/ContentList;Lorg/jdom2/ContentList$FilterList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/ContentList$FilterList<",
            "TF;>;I)V"
        }
    .end annotation

    .line 1313
    iput-object p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 1294
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    .line 1296
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->canremove:Z

    .line 1298
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->canset:Z

    const/4 v1, -0x1

    .line 1301
    iput v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->expectedmod:I

    .line 1303
    iput v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    .line 1314
    iput-object p2, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    .line 1315
    invoke-static {p1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result p2

    iput p2, p0, Lorg/jdom2/ContentList$FilterListIterator;->expectedmod:I

    .line 1318
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    if-ltz p3, :cond_2

    .line 1324
    iget-object p2, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    invoke-static {p2, p3}, Lorg/jdom2/ContentList$FilterList;->access$800(Lorg/jdom2/ContentList$FilterList;I)I

    move-result p2

    .line 1326
    invoke-static {p1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result p1

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    invoke-virtual {p1}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p1

    if-gt p3, p1, :cond_0

    goto :goto_0

    .line 1329
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " Size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    invoke-virtual {p3}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1332
    :cond_1
    :goto_0
    iput p3, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    return-void

    .line 1321
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Index: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " Size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    invoke-virtual {p3}, Lorg/jdom2/ContentList$FilterList;->size()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private checkConcurrent()V
    .locals 2

    .line 1336
    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->expectedmod:I

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    .line 1337
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    const-string v1, "The ContentList supporting the FilterList this iterator is processing has been modified by something other than this Iterator."

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 1288
    check-cast p1, Lorg/jdom2/Content;

    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList$FilterListIterator;->add(Lorg/jdom2/Content;)V

    return-void
.end method

.method public add(Lorg/jdom2/Content;)V
    .locals 3

    .line 1423
    invoke-direct {p0}, Lorg/jdom2/ContentList$FilterListIterator;->checkConcurrent()V

    .line 1425
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    .line 1427
    :goto_0
    iget-object v2, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    invoke-virtual {v2, v0, p1}, Lorg/jdom2/ContentList$FilterList;->add(ILorg/jdom2/Content;)V

    .line 1429
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result p1

    iput p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->expectedmod:I

    const/4 p1, 0x0

    .line 1431
    iput-boolean p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->canset:Z

    iput-boolean p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->canremove:Z

    .line 1438
    iput v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    .line 1439
    iput-boolean v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    return-void
.end method

.method public hasNext()Z
    .locals 3

    .line 1349
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    iget-boolean v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    iget v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    :goto_0
    invoke-static {v0, v1}, Lorg/jdom2/ContentList$FilterList;->access$800(Lorg/jdom2/ContentList$FilterList;I)I

    move-result v0

    iget-object v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v1

    if-ge v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    return v2
.end method

.method public hasPrevious()Z
    .locals 2

    .line 1358
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1288
    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterListIterator;->next()Lorg/jdom2/Content;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/jdom2/Content;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TF;"
        }
    .end annotation

    .line 1385
    invoke-direct {p0}, Lorg/jdom2/ContentList$FilterListIterator;->checkConcurrent()V

    .line 1386
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    .line 1388
    :goto_0
    iget-object v2, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    invoke-static {v2, v0}, Lorg/jdom2/ContentList$FilterList;->access$800(Lorg/jdom2/ContentList$FilterList;I)I

    move-result v2

    iget-object v3, p0, Lorg/jdom2/ContentList$FilterListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v3}, Lorg/jdom2/ContentList;->access$200(Lorg/jdom2/ContentList;)I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 1392
    iput v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    .line 1393
    iput-boolean v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    .line 1394
    iput-boolean v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->canremove:Z

    .line 1395
    iput-boolean v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->canset:Z

    .line 1396
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    iget v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList$FilterList;->get(I)Lorg/jdom2/Content;

    move-result-object v0

    return-object v0

    .line 1389
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "next() is beyond the end of the Iterator"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public nextIndex()I
    .locals 1

    .line 1367
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    :goto_0
    return v0
.end method

.method public bridge synthetic previous()Ljava/lang/Object;
    .locals 1

    .line 1288
    invoke-virtual {p0}, Lorg/jdom2/ContentList$FilterListIterator;->previous()Lorg/jdom2/Content;

    move-result-object v0

    return-object v0
.end method

.method public previous()Lorg/jdom2/Content;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TF;"
        }
    .end annotation

    .line 1404
    invoke-direct {p0}, Lorg/jdom2/ContentList$FilterListIterator;->checkConcurrent()V

    .line 1405
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 1411
    iput v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    const/4 v0, 0x0

    .line 1412
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    .line 1413
    iput-boolean v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->canremove:Z

    .line 1414
    iput-boolean v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->canset:Z

    .line 1415
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    iget v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList$FilterList;->get(I)Lorg/jdom2/Content;

    move-result-object v0

    return-object v0

    .line 1408
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "previous() is beyond the beginning of the Iterator"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public previousIndex()I
    .locals 1

    .line 1377
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    return v0
.end method

.method public remove()V
    .locals 2

    .line 1448
    invoke-direct {p0}, Lorg/jdom2/ContentList$FilterListIterator;->checkConcurrent()V

    .line 1449
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->canremove:Z

    if-eqz v0, :cond_0

    .line 1459
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    iget v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    invoke-virtual {v0, v1}, Lorg/jdom2/ContentList$FilterList;->remove(I)Lorg/jdom2/Content;

    const/4 v0, 0x0

    .line 1460
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->forward:Z

    .line 1461
    iget-object v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {v1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result v1

    iput v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->expectedmod:I

    .line 1463
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->canremove:Z

    .line 1464
    iput-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->canset:Z

    return-void

    .line 1450
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not remove an element unless either next() or previous() has been called since the last remove()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 1288
    check-cast p1, Lorg/jdom2/Content;

    invoke-virtual {p0, p1}, Lorg/jdom2/ContentList$FilterListIterator;->set(Lorg/jdom2/Content;)V

    return-void
.end method

.method public set(Lorg/jdom2/Content;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)V"
        }
    .end annotation

    .line 1473
    invoke-direct {p0}, Lorg/jdom2/ContentList$FilterListIterator;->checkConcurrent()V

    .line 1474
    iget-boolean v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->canset:Z

    if-eqz v0, :cond_0

    .line 1480
    iget-object v0, p0, Lorg/jdom2/ContentList$FilterListIterator;->filterlist:Lorg/jdom2/ContentList$FilterList;

    iget v1, p0, Lorg/jdom2/ContentList$FilterListIterator;->cursor:I

    invoke-virtual {v0, v1, p1}, Lorg/jdom2/ContentList$FilterList;->set(ILorg/jdom2/Content;)Lorg/jdom2/Content;

    .line 1481
    iget-object p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->this$0:Lorg/jdom2/ContentList;

    invoke-static {p1}, Lorg/jdom2/ContentList;->access$100(Lorg/jdom2/ContentList;)I

    move-result p1

    iput p1, p0, Lorg/jdom2/ContentList$FilterListIterator;->expectedmod:I

    return-void

    .line 1475
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not set an element unless either next() or previous() has been called since the last remove() or set()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
