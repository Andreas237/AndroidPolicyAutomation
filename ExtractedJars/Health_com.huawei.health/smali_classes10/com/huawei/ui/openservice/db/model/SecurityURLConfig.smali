.class public Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private module_name:Ljava/lang/String;

.field private module_type:I

.field private module_ver:Ljava/lang/String;

.field private securityURLList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURLList;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getModule_name()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->module_name:Ljava/lang/String;

    return-object v0
.end method

.method public getModule_type()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->module_type:I

    return v0
.end method

.method public getModule_ver()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->module_ver:Ljava/lang/String;

    return-object v0
.end method

.method public getSecurityURL()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->securityURLList:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->securityURLList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->securityURLList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/openservice/db/model/SecurityURLList;

    .line 57
    if-nez v3, :cond_3

    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/SecurityURLList;->getSecurityURL()Ljava/util/List;

    move-result-object v4

    .line 59
    if-eqz v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    .line 60
    :cond_4
    invoke-interface {v1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 61
    goto :goto_0

    .line 62
    :cond_5
    return-object v1
.end method

.method public getSecurityURLList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURLList;>;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->securityURLList:Ljava/util/List;

    return-object v0
.end method

.method public setModule_name(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->module_name:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public setModule_type(I)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->module_type:I

    .line 43
    return-void
.end method

.method public setModule_ver(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->module_ver:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setSecurityURLList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURLList;>;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/SecurityURLConfig;->securityURLList:Ljava/util/List;

    .line 51
    return-void
.end method
