.class public Lcom/shopkick/app/shoppinglists/SLUtils$ShoppingListEntryComparator;
.super Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;
.source "SLUtils.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/SLUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShoppingListEntryComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;",
            ">;)V"
        }
    .end annotation

    .line 91
    invoke-direct {p0}, Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;-><init>()V

    .line 92
    invoke-virtual {p0, p1}, Lcom/shopkick/app/shoppinglists/SLUtils$ShoppingListEntryComparator;->init(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I
    .locals 0

    .line 97
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLUtils$ShoppingListEntryComparator;->_compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 88
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/shoppinglists/SLUtils$ShoppingListEntryComparator;->compare(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)I

    move-result p1

    return p1
.end method
