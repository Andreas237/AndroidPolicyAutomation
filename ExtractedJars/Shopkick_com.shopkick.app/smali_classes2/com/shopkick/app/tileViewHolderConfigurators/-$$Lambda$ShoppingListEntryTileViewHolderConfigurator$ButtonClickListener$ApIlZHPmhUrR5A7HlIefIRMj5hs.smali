.class public final synthetic Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

.field private final synthetic f$1:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;

.field private final synthetic f$2:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;->f$1:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;

    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;->f$2:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    return-void
.end method


# virtual methods
.method public final onBtnClickListener(Ljava/lang/ref/WeakReference;)V
    .locals 3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;->f$0:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;->f$1:Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener$ApIlZHPmhUrR5A7HlIefIRMj5hs;->f$2:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    invoke-static {v0, v1, v2, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;->lambda$onDialogItemClick$255(Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator$ButtonClickListener;Lcom/shopkick/app/tileViewHolderConfigurators/ShoppingListEntryTileViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;Ljava/lang/ref/WeakReference;)V

    return-void
.end method
