.class public Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;
.super Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;
.source "PersonalStoreRow.java"


# instance fields
.field private personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->STORE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;-><init>(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;)V

    return-void
.end method


# virtual methods
.method public getPersonalStoresItem()Lcom/ibotta/android/view/model/PersonalStoresItem;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    return-object v0
.end method

.method public setPersonalStoresItem(Lcom/ibotta/android/view/model/PersonalStoresItem;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/row/PersonalStoreRow;->personalStoresItem:Lcom/ibotta/android/view/model/PersonalStoresItem;

    return-void
.end method
