.class public Lcom/ibotta/api/model/customer/CustomerShoppingListItem;
.super Ljava/lang/Object;
.source "CustomerShoppingListItem.java"


# instance fields
.field private action:Ljava/lang/String;

.field private categoryId:Ljava/lang/Integer;

.field private categoryName:Ljava/lang/String;

.field private checkedAt:Ljava/util/Date;

.field private id:Ljava/lang/Integer;

.field private suggestionId:Ljava/lang/Integer;

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->action:Ljava/lang/String;

    return-object v0
.end method

.method public getCategoryId()Ljava/lang/Integer;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->categoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCategoryName()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->categoryName:Ljava/lang/String;

    return-object v0
.end method

.method public getCheckedAt()Ljava/util/Date;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->checkedAt:Ljava/util/Date;

    return-object v0
.end method

.method public getId()Ljava/lang/Integer;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSuggestionId()Ljava/lang/Integer;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->suggestionId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->text:Ljava/lang/String;

    return-object v0
.end method

.method public setAction(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->action:Ljava/lang/String;

    return-void
.end method

.method public setActionEnum(Lcom/ibotta/api/model/customer/Action;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 59
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->action:Ljava/lang/String;

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Action;->toApiName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->action:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public setCategoryId(Ljava/lang/Integer;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->categoryId:Ljava/lang/Integer;

    return-void
.end method

.method public setCategoryName(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->categoryName:Ljava/lang/String;

    return-void
.end method

.method public setCheckedAt(Ljava/util/Date;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->checkedAt:Ljava/util/Date;

    return-void
.end method

.method public setId(Ljava/lang/Integer;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->id:Ljava/lang/Integer;

    return-void
.end method

.method public setSuggestionId(Ljava/lang/Integer;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->suggestionId:Ljava/lang/Integer;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerShoppingListItem;->text:Ljava/lang/String;

    return-void
.end method
