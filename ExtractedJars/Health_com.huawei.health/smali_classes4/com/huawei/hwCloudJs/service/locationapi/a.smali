.class public Lcom/huawei/hwCloudJs/service/locationapi/a;
.super Lcom/huawei/hwCloudJs/support/b/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/service/locationapi/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwCloudJs/support/b/c<Lcom/huawei/hwCloudJs/service/locationapi/a$a;>;"
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/hwCloudJs/service/locationapi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/service/locationapi/a;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/locationapi/a;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/service/locationapi/a;->a:Lcom/huawei/hwCloudJs/service/locationapi/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/support/b/c;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/hwCloudJs/service/locationapi/a;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/service/locationapi/a;->a:Lcom/huawei/hwCloudJs/service/locationapi/a;

    return-object v0
.end method
