.class public final Lcom/microblink/SearchTargetResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/RecognizerResult;


# instance fields
.field private final targetMatches:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/SearchTargetResult;->targetMatches:Ljava/util/List;

    return-void
.end method

.method public static create(Ljava/util/List;)Lcom/microblink/SearchTargetResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;)",
            "Lcom/microblink/SearchTargetResult;"
        }
    .end annotation

    new-instance v0, Lcom/microblink/SearchTargetResult;

    invoke-direct {v0, p0}, Lcom/microblink/SearchTargetResult;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final targetMatches()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/SearchTargetResult;->targetMatches:Ljava/util/List;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SearchTargetResult{targetMatches="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/SearchTargetResult;->targetMatches:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
