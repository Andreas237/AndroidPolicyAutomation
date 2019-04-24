.class final Lcom/squareup/haha/trove/TIntObjectHashMap$EqProcedure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TIntObjectProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/TIntObjectHashMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "EqProcedure"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:Ljava/lang/Object;>Ljava/lang/Object;Lcom/squareup/haha/trove/TIntObjectProcedure<TV;>;"
    }
.end annotation


# instance fields
.field private final _otherMap:Lcom/squareup/haha/trove/TIntObjectHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/haha/trove/TIntObjectHashMap<TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/TIntObjectHashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/squareup/haha/trove/TIntObjectHashMap<TV;>;)V"
        }
    .end annotation

    .line 438
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 439
    iput-object p1, p0, Lcom/squareup/haha/trove/TIntObjectHashMap$EqProcedure;->_otherMap:Lcom/squareup/haha/trove/TIntObjectHashMap;

    .line 440
    return-void
.end method


# virtual methods
.method public final execute(ILjava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)Z"
        }
    .end annotation

    .line 444
    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap$EqProcedure;->_otherMap:Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->index(I)I

    move-result v0

    .line 445
    move v1, v0

    if-ltz v0, :cond_2

    iget-object v0, p0, Lcom/squareup/haha/trove/TIntObjectHashMap$EqProcedure;->_otherMap:Lcom/squareup/haha/trove/TIntObjectHashMap;

    invoke-virtual {v0, p1}, Lcom/squareup/haha/trove/TIntObjectHashMap;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 1452
    move-object v2, p2

    if-eq p2, v3, :cond_0

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 445
    :goto_0
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
