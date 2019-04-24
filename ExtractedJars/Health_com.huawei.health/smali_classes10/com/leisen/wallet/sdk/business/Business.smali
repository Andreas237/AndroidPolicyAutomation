.class public Lcom/leisen/wallet/sdk/business/Business;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/leisen/wallet/sdk/business/Business$BusinessSAI6;,
        Lcom/leisen/wallet/sdk/business/Business$BusinessSAI5;,
        Lcom/leisen/wallet/sdk/business/Business$BusinessSAI4;,
        Lcom/leisen/wallet/sdk/business/Business$BusinessSAI3;,
        Lcom/leisen/wallet/sdk/business/Business$BusinessSAI2;,
        Lcom/leisen/wallet/sdk/business/Business$BusinessSAI1;
    }
.end annotation


# instance fields
.field private type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getType()I
    .locals 1

    .line 10
    iget v0, p0, Lcom/leisen/wallet/sdk/business/Business;->type:I

    return v0
.end method

.method public setType(I)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/leisen/wallet/sdk/business/Business;->type:I

    .line 15
    return-void
.end method
