.class final Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TIntObjectProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/TIntObjectHashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "HashProcedure"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/squareup/haha/trove/TIntObjectProcedure<TV;>;"
    }
.end annotation


# instance fields
.field h:I

.field private synthetic this$0:Lcom/squareup/haha/trove/TIntObjectHashMap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/TIntObjectHashMap;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;->this$0:Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 422
    return-void
.end method


# virtual methods
.method public final execute(ILjava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)Z"
        }
    .end annotation

    .line 430
    iget v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;->h:I

    iget-object v1, p0, Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;->this$0:Lcom/squareup/haha/trove/TIntObjectHashMap;

    iget-object v1, v1, Lcom/squareup/haha/trove/TIntObjectHashMap;->_hashingStrategy:Lcom/squareup/haha/trove/TIntHashingStrategy;

    invoke-interface {v1, p1}, Lcom/squareup/haha/trove/TIntHashingStrategy;->computeHashCode(I)I

    move-result v1

    invoke-static {p2}, Lcom/squareup/haha/guava/base/Joiner;->hash(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap$HashProcedure;->h:I

    .line 431
    const/4 v0, 0x1

    return v0
.end method
