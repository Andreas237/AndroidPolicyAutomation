.class public final Lcom/huawei/hwCloudJs/service/locationapi/a$a;
.super Lcom/huawei/hwCloudJs/support/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/locationapi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/support/b/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->a:I

    return-void
.end method

.method public a([I)V
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, [I

    iput-object v1, p0, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->b:[I

    :cond_0
    return-void
.end method

.method public b()[I
    .locals 3

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->b:[I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/a$a;->b:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [I

    return-object v2

    :cond_0
    const/4 v0, 0x0

    new-array v2, v0, [I

    return-object v2
.end method
