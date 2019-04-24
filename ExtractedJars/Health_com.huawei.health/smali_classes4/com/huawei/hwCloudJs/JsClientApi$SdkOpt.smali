.class public final Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/JsClientApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SdkOpt"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;,
        Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$Builder;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->a:Z

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_ALLOW:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    iput-object v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->a:Z

    return v0
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->a:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;->b:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-object v0
.end method
