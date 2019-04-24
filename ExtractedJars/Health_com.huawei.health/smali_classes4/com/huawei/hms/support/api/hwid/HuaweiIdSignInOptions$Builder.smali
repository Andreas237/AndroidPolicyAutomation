.class public final Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->a:Ljava/util/Set;

    .line 79
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    .line 85
    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;)V
    .locals 2

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->a:Ljava/util/Set;

    .line 79
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    .line 92
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->a:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->getScopeList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 93
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->getPermissionInfos()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 94
    return-void
.end method


# virtual methods
.method public build()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;
    .locals 3

    .line 183
    new-instance v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;

    iget-object v1, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->a:Ljava/util/Set;

    iget-object v2, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-direct {v0, v1, v2}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method public requestAccessToken()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    .locals 2

    .line 144
    new-instance v1, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    invoke-direct {v1}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;-><init>()V

    .line 145
    const-string v0, "https://www.huawei.com/auth/account/base.profile/accesstoken"

    invoke-virtual {v1, v0}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->setPermissionUri(Ljava/lang/String;)Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 146
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 147
    return-object p0
.end method

.method public requestCountryCode()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    .locals 2

    .line 156
    new-instance v1, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    invoke-direct {v1}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;-><init>()V

    .line 157
    const-string v0, "https://www.huawei.com/auth/account/base.profile/servicecountrycode"

    invoke-virtual {v1, v0}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->setPermissionUri(Ljava/lang/String;)Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 158
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 159
    return-object p0
.end method

.method public requestOpenId()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-static {}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->b()Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 113
    return-object p0
.end method

.method public varargs requestScopes(Lcom/huawei/hms/support/api/entity/auth/Scope;[Lcom/huawei/hms/support/api/entity/auth/Scope;)Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 171
    if-eqz p2, :cond_0

    array-length v0, p2

    if-lez v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->a:Ljava/util/Set;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 174
    :cond_0
    return-object p0
.end method

.method public requestServerAuthCode()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    .locals 2

    .line 132
    new-instance v1, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    invoke-direct {v1}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;-><init>()V

    .line 133
    const-string v0, "https://www.huawei.com/auth/account/base.profile/serviceauthcode"

    invoke-virtual {v1, v0}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->setPermissionUri(Ljava/lang/String;)Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 134
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 135
    return-object p0
.end method

.method public requestUid()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    .locals 2

    .line 102
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-static {}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->a()Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 103
    return-object p0
.end method

.method public requestUnionId()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->b:Ljava/util/Set;

    invoke-static {}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->c()Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 123
    return-object p0
.end method
