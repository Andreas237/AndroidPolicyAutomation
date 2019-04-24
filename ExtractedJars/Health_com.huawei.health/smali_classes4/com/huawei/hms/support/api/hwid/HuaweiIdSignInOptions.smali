.class public Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/api/Api$ApiOptions$HasOptions;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;
    }
.end annotation


# static fields
.field public static final DEFAULT_SIGN_IN:Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;

.field private static final a:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

.field private static final b:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

.field private static final c:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;


# instance fields
.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 19
    new-instance v0, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;-><init>()V

    const-string v1, "com.huawei.android.hms.account.getUID"

    .line 20
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->setPermissionUri(Ljava/lang/String;)Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->a:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 21
    new-instance v0, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;-><init>()V

    const-string v1, "com.huawei.android.hms.account.getOpenID"

    .line 22
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->setPermissionUri(Ljava/lang/String;)Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->b:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 24
    new-instance v0, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;-><init>()V

    const-string v1, "com.huawei.android.hms.account.getUnionId"

    .line 25
    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;->setPermissionUri(Ljava/lang/String;)Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->c:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    .line 32
    new-instance v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;

    invoke-direct {v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;-><init>()V

    new-instance v1, Lcom/huawei/hms/support/api/entity/auth/Scope;

    const-string v2, "https://www.huawei.com/auth/account/base.profile"

    invoke-direct {v1, v2}, Lcom/huawei/hms/support/api/entity/auth/Scope;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/huawei/hms/support/api/entity/auth/Scope;

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->requestScopes(Lcom/huawei/hms/support/api/entity/auth/Scope;[Lcom/huawei/hms/support/api/entity/auth/Scope;)Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->requestOpenId()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->requestUnionId()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions$Builder;->build()Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->DEFAULT_SIGN_IN:Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;

    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hms/support/api/entity/auth/Scope;>;Ljava/util/ArrayList<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;)V"
        }
    .end annotation

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->d:Ljava/util/ArrayList;

    .line 55
    iput-object p2, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->e:Ljava/util/ArrayList;

    .line 56
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Lcom/huawei/hms/support/api/entity/auth/Scope;>;Ljava/util/Set<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;)V"
        }
    .end annotation

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {p0, v0, v1}, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 45
    return-void
.end method

.method static synthetic a()Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;
    .locals 1

    .line 18
    sget-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->a:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    return-object v0
.end method

.method static synthetic b()Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;
    .locals 1

    .line 18
    sget-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->b:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    return-object v0
.end method

.method static synthetic c()Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;
    .locals 1

    .line 18
    sget-object v0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->c:Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;

    return-object v0
.end method


# virtual methods
.method public getPermissionInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getScopeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/huawei/hms/support/api/hwid/HuaweiIdSignInOptions;->d:Ljava/util/ArrayList;

    return-object v0
.end method
