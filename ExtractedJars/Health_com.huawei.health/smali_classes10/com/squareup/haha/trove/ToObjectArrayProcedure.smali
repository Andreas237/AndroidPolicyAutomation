.class final Lcom/squareup/haha/trove/ToObjectArrayProcedure;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/haha/trove/TObjectProcedure;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Lcom/squareup/haha/trove/TObjectProcedure<TT;>;"
    }
.end annotation


# instance fields
.field private pos:I

.field private final target:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/squareup/haha/trove/ToObjectArrayProcedure;->target:[Ljava/lang/Object;

    .line 36
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/squareup/haha/trove/ToObjectArrayProcedure;->target:[Ljava/lang/Object;

    iget v1, p0, Lcom/squareup/haha/trove/ToObjectArrayProcedure;->pos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/squareup/haha/trove/ToObjectArrayProcedure;->pos:I

    aput-object p1, v0, v1

    .line 41
    const/4 v0, 0x1

    return v0
.end method
