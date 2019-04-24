.class public Lcom/ibotta/api/model/customer/CustomerSetting;
.super Ljava/lang/Object;
.source "CustomerSetting.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/customer/CustomerSetting$FormType;
    }
.end annotation


# instance fields
.field private customerDisplay:Z

.field private displayName:Ljava/lang/String;

.field private formType:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public getFormType()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->formType:Ljava/lang/String;

    return-object v0
.end method

.method public getFormTypeEnum()Lcom/ibotta/api/model/customer/CustomerSetting$FormType;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->formType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/CustomerSetting$FormType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerSetting$FormType;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->value:Ljava/lang/String;

    return-object v0
.end method

.method public getValueBool()Z
    .locals 3

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->value:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v2, "YES"

    .line 56
    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "1"

    iget-object v2, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->value:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "TRUE"

    iget-object v2, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->value:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public isCustomerDisplay()Z
    .locals 1

    .line 77
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->customerDisplay:Z

    return v0
.end method

.method public setCustomerDisplay(Z)V
    .locals 0

    .line 81
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->customerDisplay:Z

    return-void
.end method

.method public setDisplayName(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->displayName:Ljava/lang/String;

    return-void
.end method

.method public setFormType(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->formType:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->name:Ljava/lang/String;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerSetting;->value:Ljava/lang/String;

    return-void
.end method

.method public setValueBool(Z)V
    .locals 0

    .line 61
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/customer/CustomerSetting;->setValue(Ljava/lang/String;)V

    return-void
.end method
