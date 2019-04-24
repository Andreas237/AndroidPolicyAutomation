.class public final Lcom/huawei/hwCloudJs/service/hms/a$b;
.super Lcom/huawei/hwCloudJs/support/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Intent;

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/support/b/d;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/service/hms/a$b;)I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/a$b;->c:I

    return v0
.end method


# virtual methods
.method public a()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/a$b;->a:Landroid/content/Intent;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/hms/a$b;->b:I

    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/a$b;->a:Landroid/content/Intent;

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/a$b;->b:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/hms/a$b;->c:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/a$b;->c:I

    return v0
.end method
