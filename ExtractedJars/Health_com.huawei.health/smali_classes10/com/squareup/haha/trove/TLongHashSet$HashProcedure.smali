.class final Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TLongProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/trove/TLongHashSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "HashProcedure"
.end annotation


# instance fields
.field h:I

.field private synthetic this$0:Lcom/squareup/haha/trove/TLongHashSet;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/TLongHashSet;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;->this$0:Lcom/squareup/haha/trove/TLongHashSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    return-void
.end method


# virtual methods
.method public final execute(J)Z
    .locals 2

    .line 249
    iget v0, p0, Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;->h:I

    iget-object v1, p0, Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;->this$0:Lcom/squareup/haha/trove/TLongHashSet;

    iget-object v1, v1, Lcom/squareup/haha/trove/TLongHashSet;->_hashingStrategy:Lcom/squareup/haha/trove/TLongHashingStrategy;

    invoke-interface {v1, p1, p2}, Lcom/squareup/haha/trove/TLongHashingStrategy;->computeHashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/haha/trove/TLongHashSet$HashProcedure;->h:I

    .line 250
    const/4 v0, 0x1

    return v0
.end method
