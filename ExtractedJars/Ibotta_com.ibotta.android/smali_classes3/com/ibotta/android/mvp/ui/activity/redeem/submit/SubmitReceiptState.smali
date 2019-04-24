.class public Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;
.super Ljava/lang/Object;
.source "SubmitReceiptState.java"


# annotations
.annotation runtime Lorg/parceler/Parcel;
.end annotation


# instance fields
.field submitReceiptStatus:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 11
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->submitReceiptStatus:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getSubmitReceiptStatus()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->submitReceiptStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getSubmitReceiptStatusEnum()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->submitReceiptStatus:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    move-result-object v0

    return-object v0
.end method

.method public setSubmitReceiptStatus(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->submitReceiptStatus:Ljava/lang/String;

    return-void
.end method

.method public setSubmitReceiptStatusEnum(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V
    .locals 0

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->setSubmitReceiptStatus(Ljava/lang/String;)V

    return-void
.end method
