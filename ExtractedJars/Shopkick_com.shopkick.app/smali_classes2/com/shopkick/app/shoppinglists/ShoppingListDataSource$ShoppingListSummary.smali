.class public Lcom/shopkick/app/shoppinglists/ShoppingListDataSource$ShoppingListSummary;
.super Ljava/lang/Object;
.source "ShoppingListDataSource.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ShoppingListSummary"
.end annotation


# instance fields
.field public createdTimeMs:J

.field public entryCount:I

.field public shoppingListId:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
