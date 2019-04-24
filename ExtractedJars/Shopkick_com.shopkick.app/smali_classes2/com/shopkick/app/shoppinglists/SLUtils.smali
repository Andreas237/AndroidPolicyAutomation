.class public Lcom/shopkick/app/shoppinglists/SLUtils;
.super Ljava/lang/Object;
.source "SLUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/shoppinglists/SLUtils$CompletedEntryTileInfoComparator;,
        Lcom/shopkick/app/shoppinglists/SLUtils$EntryTileInfoComparator;,
        Lcom/shopkick/app/shoppinglists/SLUtils$ShoppingListEntryComparator;,
        Lcom/shopkick/app/shoppinglists/SLUtils$_ShoppingListEntryComparator;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isNewModificationCreatable(Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;)Z
    .locals 2

    .line 17
    invoke-virtual {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isNewRequestCreatable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const v0, 0x7f1106b0

    .line 20
    invoke-virtual {p1, v0}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1106af

    .line 21
    invoke-virtual {p1, v1}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    const/4 p0, 0x0

    return p0
.end method
