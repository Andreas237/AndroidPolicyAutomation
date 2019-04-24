.class Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$1;
.super Ljava/lang/Object;
.source "ShoppingListDataSource.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getShoppingListSummaries()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;)I
    .locals 2

    .line 245
    iget-wide v0, p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->createdTimeMs:J

    iget-wide p1, p2, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;->createdTimeMs:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 242
    check-cast p1, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;

    check-cast p2, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$1;->compare(Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;)I

    move-result p1

    return p1
.end method
