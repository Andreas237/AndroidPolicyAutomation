.class public final Lcom/huawei/hwCloudJs/service/hms/f;
.super Ljava/lang/Object;


# static fields
.field private static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    sput v0, Lcom/huawei/hwCloudJs/service/hms/f;->a:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Lcom/huawei/hwCloudJs/service/hms/e;
    .locals 1

    sget v0, Lcom/huawei/hwCloudJs/service/hms/f;->a:I

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/huawei/hwCloudJs/service/hms/g;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/hms/g;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Lcom/huawei/hwCloudJs/service/hms/e;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/hms/e;-><init>()V

    return-object v0
.end method
