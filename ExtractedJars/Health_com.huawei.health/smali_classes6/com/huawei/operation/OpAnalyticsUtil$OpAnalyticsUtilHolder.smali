.class Lcom/huawei/operation/OpAnalyticsUtil$OpAnalyticsUtilHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/OpAnalyticsUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OpAnalyticsUtilHolder"
.end annotation


# static fields
.field private static final mInstance:Lcom/huawei/operation/OpAnalyticsUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 108
    new-instance v0, Lcom/huawei/operation/OpAnalyticsUtil;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/operation/OpAnalyticsUtil;-><init>(Lcom/huawei/operation/OpAnalyticsUtil$1;)V

    sput-object v0, Lcom/huawei/operation/OpAnalyticsUtil$OpAnalyticsUtilHolder;->mInstance:Lcom/huawei/operation/OpAnalyticsUtil;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100()Lcom/huawei/operation/OpAnalyticsUtil;
    .locals 1

    .line 107
    sget-object v0, Lcom/huawei/operation/OpAnalyticsUtil$OpAnalyticsUtilHolder;->mInstance:Lcom/huawei/operation/OpAnalyticsUtil;

    return-object v0
.end method
