.class public final Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->a:Z

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_ALLOW:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-void
.end method


# virtual methods
.method public build()Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;
    .locals 2

    new-instance v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;

    invoke-direct {v1}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;-><init>()V

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->a:Z

    invoke-static {v1, v0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->a(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;Z)Z

    iget-object v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-static {v1, v0}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->a(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-object v1
.end method

.method public setBiType(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-object p0
.end method

.method public setShowAuthDlg(Z)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;->a:Z

    return-object p0
.end method
