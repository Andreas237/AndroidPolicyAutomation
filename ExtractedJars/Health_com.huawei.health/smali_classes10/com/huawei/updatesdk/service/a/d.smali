.class public Lcom/huawei/updatesdk/service/a/d;
.super Ljava/lang/Object;


# static fields
.field static final a:I

.field static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lcom/huawei/updatesdk/service/a/c$a;->a:Lcom/huawei/updatesdk/service/a/c$a;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/c$a;->ordinal()I

    move-result v0

    sput v0, Lcom/huawei/updatesdk/service/a/d;->a:I

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "http://store.hispace.hicloud.com/hwmarket/api/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/updatesdk/service/a/d;->b:[Ljava/lang/String;

    return-void
.end method
