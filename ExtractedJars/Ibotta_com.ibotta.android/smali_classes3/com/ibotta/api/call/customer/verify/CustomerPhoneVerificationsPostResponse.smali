.class public Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerPhoneVerificationsPostResponse.java"


# instance fields
.field private referenceId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getReferenceId()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;->referenceId:Ljava/lang/String;

    return-object v0
.end method

.method public setReferenceId(Ljava/lang/String;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/ibotta/api/call/customer/verify/CustomerPhoneVerificationsPostResponse;->referenceId:Ljava/lang/String;

    return-void
.end method
