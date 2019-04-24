.class Lcom/squareup/haha/perflib/Heap$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TObjectProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/haha/perflib/Heap;->getInstances()Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/squareup/haha/trove/TObjectProcedure<Lcom/squareup/haha/perflib/Instance;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/haha/perflib/Heap;

.field final synthetic val$result:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lcom/squareup/haha/perflib/Heap;Ljava/util/ArrayList;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/squareup/haha/perflib/Heap$1;->this$0:Lcom/squareup/haha/perflib/Heap;

    iput-object p2, p0, Lcom/squareup/haha/perflib/Heap$1;->val$result:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Lcom/squareup/haha/perflib/Instance;)Z
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/squareup/haha/perflib/Heap$1;->val$result:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic execute(Ljava/lang/Object;)Z
    .locals 1

    .line 195
    move-object v0, p1

    check-cast v0, Lcom/squareup/haha/perflib/Instance;

    invoke-virtual {p0, v0}, Lcom/squareup/haha/perflib/Heap$1;->execute(Lcom/squareup/haha/perflib/Instance;)Z

    move-result v0

    return v0
.end method
