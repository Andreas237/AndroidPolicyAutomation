.class final Lcom/squareup/haha/trove/THashMap$HashProcedure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TObjectObjectProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/THashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "HashProcedure"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/squareup/haha/trove/TObjectObjectProcedure<TK;TV;>;"
    }
.end annotation


# instance fields
.field h:I

.field private synthetic this$0:Lcom/squareup/haha/trove/THashMap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/THashMap;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/squareup/haha/trove/THashMap$HashProcedure;->this$0:Lcom/squareup/haha/trove/THashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .line 217
    iget v0, p0, Lcom/squareup/haha/trove/THashMap$HashProcedure;->h:I

    iget-object v1, p0, Lcom/squareup/haha/trove/THashMap$HashProcedure;->this$0:Lcom/squareup/haha/trove/THashMap;

    iget-object v1, v1, Lcom/squareup/haha/trove/THashMap;->_hashingStrategy:Lcom/squareup/haha/trove/TObjectHashingStrategy;

    invoke-interface {v1, p1}, Lcom/squareup/haha/trove/TObjectHashingStrategy;->computeHashCode(Ljava/lang/Object;)I

    move-result v1

    if-nez p2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/haha/trove/THashMap$HashProcedure;->h:I

    .line 218
    const/4 v0, 0x1

    return v0
.end method
