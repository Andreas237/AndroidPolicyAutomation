.class final Lcom/squareup/haha/trove/TLongObjectHashMap$HashProcedure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TLongObjectProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/TLongObjectHashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "HashProcedure"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/squareup/haha/trove/TLongObjectProcedure<TV;>;"
    }
.end annotation


# instance fields
.field h:I

.field private synthetic this$0:Lcom/squareup/haha/trove/TLongObjectHashMap;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/TLongObjectHashMap;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lcom/squareup/haha/trove/TLongObjectHashMap$HashProcedure;->this$0:Lcom/squareup/haha/trove/TLongObjectHashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 422
    return-void
.end method


# virtual methods
.method public final execute(JLjava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTV;)Z"
        }
    .end annotation

    .line 430
    iget v0, p0, Lcom/squareup/haha/trove/TLongObjectHashMap$HashProcedure;->h:I

    iget-object v1, p0, Lcom/squareup/haha/trove/TLongObjectHashMap$HashProcedure;->this$0:Lcom/squareup/haha/trove/TLongObjectHashMap;

    iget-object v1, v1, Lcom/squareup/haha/trove/TLongObjectHashMap;->_hashingStrategy:Lcom/squareup/haha/trove/TLongHashingStrategy;

    invoke-interface {v1, p1, p2}, Lcom/squareup/haha/trove/TLongHashingStrategy;->computeHashCode(J)I

    move-result v1

    invoke-static {p3}, Lcom/squareup/haha/guava/base/Joiner;->hash(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v1, v2

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/haha/trove/TLongObjectHashMap$HashProcedure;->h:I

    .line 431
    const/4 v0, 0x1

    return v0
.end method
