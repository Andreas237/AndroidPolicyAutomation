.class final Lcom/squareup/haha/trove/TLongHashSet$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TLongProcedure;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/haha/trove/TLongHashSet;->equals(Ljava/lang/Object;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private synthetic val$that:Lcom/squareup/haha/trove/TLongHashSet;


# direct methods
.method constructor <init>(Lcom/squareup/haha/trove/TLongHashSet;Lcom/squareup/haha/trove/TLongHashSet;)V
    .locals 0

    .line 223
    iput-object p2, p0, Lcom/squareup/haha/trove/TLongHashSet$1;->val$that:Lcom/squareup/haha/trove/TLongHashSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(J)Z
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/squareup/haha/trove/TLongHashSet$1;->val$that:Lcom/squareup/haha/trove/TLongHashSet;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/haha/trove/TLongHashSet;->contains(J)Z

    move-result v0

    return v0
.end method
