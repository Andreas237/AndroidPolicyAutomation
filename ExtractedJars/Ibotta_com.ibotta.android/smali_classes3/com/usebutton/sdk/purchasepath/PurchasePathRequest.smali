.class public Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;
.super Ljava/lang/Object;
.source "PurchasePathRequest.java"


# instance fields
.field private pubRef:Ljava/lang/String;

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getPubRef()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;->pubRef:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setPubRef(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    iput-object p1, p0, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;->pubRef:Ljava/lang/String;

    return-void
.end method
