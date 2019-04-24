.class final Lcom/squareup/haha/guava/collect/Iterators$11;
.super Lcom/squareup/haha/guava/collect/AbstractIndexedListIterator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/haha/guava/collect/Iterators;->forArray([Ljava/lang/Object;III)Lcom/squareup/haha/guava/collect/UnmodifiableListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractIndexedListIterator<TT;>;"
    }
.end annotation


# instance fields
.field private synthetic val$array:[Ljava/lang/Object;

.field private synthetic val$offset:I


# direct methods
.method constructor <init>(II[Ljava/lang/Object;I)V
    .locals 0

    .line 1053
    iput-object p3, p0, Lcom/squareup/haha/guava/collect/Iterators$11;->val$array:[Ljava/lang/Object;

    iput p4, p0, Lcom/squareup/haha/guava/collect/Iterators$11;->val$offset:I

    invoke-direct {p0, p1, p2}, Lcom/squareup/haha/guava/collect/AbstractIndexedListIterator;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected final get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1055
    iget-object v0, p0, Lcom/squareup/haha/guava/collect/Iterators$11;->val$array:[Ljava/lang/Object;

    iget v1, p0, Lcom/squareup/haha/guava/collect/Iterators$11;->val$offset:I

    add-int/2addr v1, p1

    aget-object v0, v0, v1

    return-object v0
.end method
