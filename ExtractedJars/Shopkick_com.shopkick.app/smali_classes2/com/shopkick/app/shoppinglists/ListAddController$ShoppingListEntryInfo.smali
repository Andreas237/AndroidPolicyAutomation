.class public Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;
.super Ljava/lang/Object;
.source "ListAddController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/ListAddController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ShoppingListEntryInfo"
.end annotation


# instance fields
.field private previousQuantityNumber:Ljava/lang/Double;

.field private previousState:Ljava/lang/Integer;

.field private shoppingListEntryId:Ljava/lang/String;

.field private shoppingListId:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ListAddController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/shoppinglists/ListAddController;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 501
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListEntryId:Ljava/lang/String;

    .line 503
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/shoppinglists/ListAddController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V
    .locals 0

    .line 509
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 510
    iput-object p2, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListEntryId:Ljava/lang/String;

    .line 511
    iput-object p3, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListId:Ljava/lang/String;

    .line 512
    iput-object p5, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->previousQuantityNumber:Ljava/lang/Double;

    .line 513
    iput-object p4, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->previousState:Ljava/lang/Integer;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;
    .locals 0

    .line 495
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;)Ljava/lang/String;
    .locals 0

    .line 495
    iget-object p0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListEntryId:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public getPreviousQuantityNumber()Ljava/lang/Double;
    .locals 1

    .line 529
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->previousQuantityNumber:Ljava/lang/Double;

    return-object v0
.end method

.method public getPreviousState()Ljava/lang/Integer;
    .locals 1

    .line 525
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->previousState:Ljava/lang/Integer;

    return-object v0
.end method

.method public getShoppingListEntryId()Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListEntryId:Ljava/lang/String;

    return-object v0
.end method

.method public getShoppingListId()Ljava/lang/String;
    .locals 1

    .line 517
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ListAddController$ShoppingListEntryInfo;->shoppingListId:Ljava/lang/String;

    return-object v0
.end method
