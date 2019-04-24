.class final Lcom/squareup/haha/trove/THashMap$ValueView$1;
.super Lcom/squareup/haha/trove/THashIterator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/haha/trove/THashMap$ValueView;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/trove/THashIterator<TV;>;"
    }
.end annotation


# instance fields
.field private synthetic this$1:Lcom/squareup/haha/trove/THashMap$ValueView;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/THashMap$ValueView;Lcom/squareup/haha/trove/TObjectHash;)V
    .locals 0

    .line 510
    iput-object p1, p0, Lcom/squareup/haha/trove/THashMap$ValueView$1;->this$1:Lcom/squareup/haha/trove/THashMap$ValueView;

    invoke-direct {p0, p2}, Lcom/squareup/haha/trove/THashIterator;-><init>(Lcom/squareup/haha/trove/TObjectHash;)V

    return-void
.end method


# virtual methods
.method protected final objectAtIndex(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .line 513
    iget-object v0, p0, Lcom/squareup/haha/trove/THashMap$ValueView$1;->this$1:Lcom/squareup/haha/trove/THashMap$ValueView;

    iget-object v0, v0, Lcom/squareup/haha/trove/THashMap$ValueView;->this$0:Lcom/squareup/haha/trove/THashMap;

    iget-object v0, v0, Lcom/squareup/haha/trove/THashMap;->_values:[Ljava/lang/Object;

    aget-object v0, v0, p1

    return-object v0
.end method
