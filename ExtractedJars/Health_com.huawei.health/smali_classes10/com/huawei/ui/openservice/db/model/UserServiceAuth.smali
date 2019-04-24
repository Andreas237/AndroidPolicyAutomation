.class public Lcom/huawei/ui/openservice/db/model/UserServiceAuth;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private authType:I

.field private huid:Ljava/lang/String;

.field private serviceID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->huid:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->serviceID:Ljava/lang/String;

    .line 22
    iput p3, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->authType:I

    .line 23
    return-void
.end method


# virtual methods
.method public configAuthType(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->authType:I

    .line 47
    return-void
.end method

.method public configHuid(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->huid:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public configServiceID(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->serviceID:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public fetchAuthType()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->authType:I

    return v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceID()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->serviceID:Ljava/lang/String;

    return-object v0
.end method
