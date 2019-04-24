.class public final Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;
.super Lcom/huawei/hwCloudJs/api/JsParam;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InvokeReq"
.end annotation


# instance fields
.field private URI:Ljava/lang/String;

.field private jsonReq:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/api/JsParam;-><init>()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;->URI:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;->jsonReq:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public getJsonReq()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;->jsonReq:Ljava/lang/String;

    return-object v0
.end method

.method public getURI()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;->URI:Ljava/lang/String;

    return-object v0
.end method

.method public setJsonReq(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;->jsonReq:Ljava/lang/String;

    return-void
.end method

.method public setURI(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$InvokeReq;->URI:Ljava/lang/String;

    return-void
.end method
