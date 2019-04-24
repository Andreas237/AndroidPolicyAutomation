.class Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;
.super Ljava/lang/Object;
.source "CantFindItSpecificStorePostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RetailerInfo"
.end annotation


# instance fields
.field private retailerId:I

.field private storeId:I

.field final synthetic this$0:Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall;II)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;->this$0:Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput p2, p0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;->retailerId:I

    .line 60
    iput p3, p0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;->storeId:I

    return-void
.end method


# virtual methods
.method public getRetailerId()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;->retailerId:I

    return v0
.end method

.method public getStoreId()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;->storeId:I

    return v0
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;->retailerId:I

    return-void
.end method

.method public setStoreId(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/ibotta/api/call/cantfindit/CantFindItSpecificStorePostCall$RetailerInfo;->storeId:I

    return-void
.end method
