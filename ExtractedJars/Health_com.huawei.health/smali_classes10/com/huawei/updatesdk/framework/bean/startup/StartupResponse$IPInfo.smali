.class public Lcom/huawei/updatesdk/framework/bean/startup/StartupResponse$IPInfo;
.super Lcom/huawei/updatesdk/sdk/service/storekit/bean/JsonBean;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/framework/bean/startup/StartupResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "IPInfo"
.end annotation


# instance fields
.field private uri_:Ljava/lang/String;

.field private use_:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getUri_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/framework/bean/startup/StartupResponse$IPInfo;->uri_:Ljava/lang/String;

    return-object v0
.end method

.method public getUse_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/framework/bean/startup/StartupResponse$IPInfo;->use_:I

    return v0
.end method

.method public setUri_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/framework/bean/startup/StartupResponse$IPInfo;->uri_:Ljava/lang/String;

    return-void
.end method

.method public setUse_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/framework/bean/startup/StartupResponse$IPInfo;->use_:I

    return-void
.end method
