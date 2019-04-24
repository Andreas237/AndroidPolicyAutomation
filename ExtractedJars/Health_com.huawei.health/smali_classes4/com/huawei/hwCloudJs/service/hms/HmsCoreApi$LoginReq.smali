.class public final Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;
.super Lcom/huawei/hwCloudJs/api/JsParam;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LoginReq"
.end annotation


# instance fields
.field private needAuthCode:Z

.field private scope:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/api/JsParam;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;->needAuthCode:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;->scope:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;->needAuthCode:Z

    return v0
.end method


# virtual methods
.method public getScope()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;->scope:Ljava/lang/String;

    return-object v0
.end method

.method public getneedAuthCode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;->needAuthCode:Z

    return v0
.end method

.method public setScope(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;->scope:Ljava/lang/String;

    return-void
.end method

.method public setneedAuthCode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;->needAuthCode:Z

    return-void
.end method
