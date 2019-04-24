.class public final enum Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BiType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;>;"
    }
.end annotation


# static fields
.field public static final enum PERMISSION_ALLOW:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

.field public static final enum PERMISSION_DENIED:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

.field public static final enum PERMISSION_USEREXP:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

.field private static final synthetic a:[Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    const-string v1, "PERMISSION_ALLOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_ALLOW:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    new-instance v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    const-string v1, "PERMISSION_DENIED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_DENIED:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    new-instance v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    const-string v1, "PERMISSION_USEREXP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_USEREXP:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_ALLOW:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_DENIED:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->PERMISSION_USEREXP:Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->a:[Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;
    .locals 1

    const-class v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-object v0
.end method

.method public static values()[Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->a:[Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    invoke-virtual {v0}, [Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hwCloudJs/JsClientApi$SdkOpt$BiType;

    return-object v0
.end method
