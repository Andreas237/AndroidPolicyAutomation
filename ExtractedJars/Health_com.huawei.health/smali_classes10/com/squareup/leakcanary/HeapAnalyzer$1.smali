.class Lcom/squareup/leakcanary/HeapAnalyzer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TObjectProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/leakcanary/HeapAnalyzer;->deduplicateGcRoots(Lcom/squareup/haha/perflib/Snapshot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/squareup/haha/trove/TObjectProcedure<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/leakcanary/HeapAnalyzer;

.field final synthetic val$gcRoots:Ljava/util/Collection;

.field final synthetic val$uniqueRootMap:Lcom/squareup/haha/trove/THashMap;


# direct methods
.method constructor <init>(Lcom/squareup/leakcanary/HeapAnalyzer;Ljava/util/Collection;Lcom/squareup/haha/trove/THashMap;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/squareup/leakcanary/HeapAnalyzer$1;->this$0:Lcom/squareup/leakcanary/HeapAnalyzer;

    iput-object p2, p0, Lcom/squareup/leakcanary/HeapAnalyzer$1;->val$gcRoots:Ljava/util/Collection;

    iput-object p3, p0, Lcom/squareup/leakcanary/HeapAnalyzer$1;->val$uniqueRootMap:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic execute(Ljava/lang/Object;)Z
    .locals 1

    .line 146
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/squareup/leakcanary/HeapAnalyzer$1;->execute(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public execute(Ljava/lang/String;)Z
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/squareup/leakcanary/HeapAnalyzer$1;->val$gcRoots:Ljava/util/Collection;

    iget-object v1, p0, Lcom/squareup/leakcanary/HeapAnalyzer$1;->val$uniqueRootMap:Lcom/squareup/haha/trove/THashMap;

    invoke-virtual {v1, p1}, Lcom/squareup/haha/trove/THashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
