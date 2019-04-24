.class public Lcom/huawei/hwCloudJs/service/hms/a;
.super Lcom/huawei/hwCloudJs/support/b/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/service/hms/a$c;,
        Lcom/huawei/hwCloudJs/service/hms/a$b;,
        Lcom/huawei/hwCloudJs/service/hms/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwCloudJs/support/b/c<Lcom/huawei/hwCloudJs/service/hms/a$b;>;"
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/hwCloudJs/service/hms/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/service/hms/a;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/service/hms/a;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/service/hms/a;->a:Lcom/huawei/hwCloudJs/service/hms/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/support/b/c;-><init>()V

    return-void
.end method

.method public static a()Lcom/huawei/hwCloudJs/service/hms/a;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/service/hms/a;->a:Lcom/huawei/hwCloudJs/service/hms/a;

    return-object v0
.end method


# virtual methods
.method public a(ILcom/huawei/hwCloudJs/service/hms/a$c;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hwCloudJs/service/hms/a;->a()Lcom/huawei/hwCloudJs/service/hms/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwCloudJs/service/hms/a$a;

    invoke-direct {v1, p1, p2}, Lcom/huawei/hwCloudJs/service/hms/a$a;-><init>(ILcom/huawei/hwCloudJs/service/hms/a$c;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/service/hms/a;->a(Lcom/huawei/hwCloudJs/support/b/b;)V

    return-void
.end method

.method public a(Landroid/app/Activity;Landroid/content/Intent;ILcom/huawei/hwCloudJs/service/hms/a$c;)V
    .locals 2

    invoke-static {}, Lcom/huawei/hwCloudJs/service/hms/a;->a()Lcom/huawei/hwCloudJs/service/hms/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwCloudJs/service/hms/a$a;

    invoke-direct {v1, p3, p4}, Lcom/huawei/hwCloudJs/service/hms/a$a;-><init>(ILcom/huawei/hwCloudJs/service/hms/a$c;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/service/hms/a;->a(Lcom/huawei/hwCloudJs/support/b/b;)V

    invoke-virtual {p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
