.class public Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final ALLOW:Ljava/lang/String; = "-1"

.field private static final REJECT:Ljava/lang/String; = "-2"

.field private static final TAG:Ljava/lang/String; = "LandpageAppWhiteList"

.field private static final serialVersionUID:J = -0x16650d8f59f6220bL


# instance fields
.field private packageList:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private promptMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->type:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->packageList:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->promptMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public checkWhiteList(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "-1"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const-string v0, "-2"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->packageList:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isOpen(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->promptMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public setOpen(Ljava/lang/String;Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->promptMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public updateConfig(Ljava/lang/String;)V
    .locals 7

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "-2"

    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "-2"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->type:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string v0, "-1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->type:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v0, v2

    if-lez v0, :cond_3

    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->packageList:Ljava/util/Set;

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->packageList:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_4

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;->type:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_4
    :goto_1
    goto :goto_2

    :catch_0
    move-exception v2

    const-string v0, "LandpageAppWhiteList"

    const-string v1, "fromString RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    move-exception v2

    const-string v0, "LandpageAppWhiteList"

    const-string v1, "fromString Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method
