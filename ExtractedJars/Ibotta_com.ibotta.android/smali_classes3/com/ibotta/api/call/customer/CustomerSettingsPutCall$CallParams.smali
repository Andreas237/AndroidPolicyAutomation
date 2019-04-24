.class public Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerSettingsPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/CustomerSettingsPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private customerId:I

.field private password:Ljava/lang/String;

.field private settings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerId()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->customerId:I

    return v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getSettings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->settings:Ljava/util/Map;

    return-object v0
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->customerId:I

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->password:Ljava/lang/String;

    return-void
.end method

.method public setSettings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutCall$CallParams;->settings:Ljava/util/Map;

    return-void
.end method
