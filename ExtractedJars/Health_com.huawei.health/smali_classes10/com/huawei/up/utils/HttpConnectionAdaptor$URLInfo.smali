.class Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/up/utils/HttpConnectionAdaptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "URLInfo"
.end annotation


# instance fields
.field host:Ljava/lang/String;

.field isHttps:Z

.field port:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 392
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->isHttps:Z

    .line 393
    const/16 v0, 0x1bb

    iput v0, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->port:I

    .line 394
    const-string v0, "api.vmall.com"

    iput-object v0, p0, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;->host:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/up/utils/HttpConnectionAdaptor$1;)V
    .locals 0

    .line 390
    invoke-direct {p0}, Lcom/huawei/up/utils/HttpConnectionAdaptor$URLInfo;-><init>()V

    return-void
.end method
