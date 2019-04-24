.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;
.super Ljava/lang/Object;
.source "VerifyCodePresenterState.java"


# annotations
.annotation runtime Lorg/parceler/Parcel;
.end annotation


# instance fields
.field phoneNumber:Ljava/lang/String;

.field referenceId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->phoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getReferenceId()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->referenceId:Ljava/lang/String;

    return-object v0
.end method

.method public setPhoneNumber(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->phoneNumber:Ljava/lang/String;

    return-void
.end method

.method public setReferenceId(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/code/VerifyCodePresenterState;->referenceId:Ljava/lang/String;

    return-void
.end method
