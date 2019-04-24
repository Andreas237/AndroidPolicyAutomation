.class public final enum Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

.field public static final enum b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

.field public static final enum c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

.field public static final enum d:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

.field public static final enum e:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

.field private static final synthetic f:[Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const-string v1, "REQUEST_CACHE_FIRST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const-string v1, "REQUEST_CACHE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const-string v1, "REQUEST_NETWORK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const-string v1, "REQUEST_NETWORK_REF_CACHE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->d:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const-string v1, "REQUEST_REF_CACHE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->e:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->d:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->e:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->f:[Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;
    .locals 1

    const-class v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    return-object v0
.end method

.method public static values()[Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;
    .locals 1

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->f:[Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    invoke-virtual {v0}, [Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    return-object v0
.end method
