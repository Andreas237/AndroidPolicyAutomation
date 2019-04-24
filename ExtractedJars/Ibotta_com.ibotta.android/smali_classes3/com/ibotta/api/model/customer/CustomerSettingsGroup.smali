.class public Lcom/ibotta/api/model/customer/CustomerSettingsGroup;
.super Ljava/lang/Object;
.source "CustomerSettingsGroup.java"


# instance fields
.field private name:Ljava/lang/String;

.field private settings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/api/model/customer/CustomerSetting;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSettings()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/api/model/customer/CustomerSetting;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;->settings:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;->name:Ljava/lang/String;

    return-void
.end method

.method public setSettings(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/api/model/customer/CustomerSetting;",
            ">;)V"
        }
    .end annotation

    .line 26
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSettingsGroup;->settings:Ljava/util/ArrayList;

    return-void
.end method
