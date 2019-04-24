.class Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall$RetailerInfo;
.super Ljava/lang/Object;
.source "CantFindItNoStorePostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RetailerInfo"
.end annotation


# instance fields
.field private retailerId:I

.field final synthetic this$0:Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;I)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall$RetailerInfo;->this$0:Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput p2, p0, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall$RetailerInfo;->retailerId:I

    return-void
.end method


# virtual methods
.method public getRetailerId()I
    .locals 1

    .line 62
    iget v0, p0, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall$RetailerInfo;->retailerId:I

    return v0
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 66
    iput p1, p0, Lcom/ibotta/api/call/cantfindit/CantFindItNoStorePostCall$RetailerInfo;->retailerId:I

    return-void
.end method
