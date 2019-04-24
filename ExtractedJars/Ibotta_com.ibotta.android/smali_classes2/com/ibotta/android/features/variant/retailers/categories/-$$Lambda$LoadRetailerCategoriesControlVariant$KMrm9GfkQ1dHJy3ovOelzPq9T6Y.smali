.class public final synthetic Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$KMrm9GfkQ1dHJy3ovOelzPq9T6Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$KMrm9GfkQ1dHJy3ovOelzPq9T6Y;->f$0:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/features/variant/retailers/categories/-$$Lambda$LoadRetailerCategoriesControlVariant$KMrm9GfkQ1dHJy3ovOelzPq9T6Y;->f$0:Ljava/util/Set;

    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    invoke-static {v0, p1}, Lcom/ibotta/android/features/variant/retailers/categories/LoadRetailerCategoriesControlVariant;->lambda$collectRetailerIds$3(Ljava/util/Set;Lcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
