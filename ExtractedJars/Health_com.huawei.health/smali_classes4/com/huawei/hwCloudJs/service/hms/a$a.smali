.class final Lcom/huawei/hwCloudJs/service/hms/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/support/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hwCloudJs/support/b/b<Lcom/huawei/hwCloudJs/service/hms/a$b;>;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lcom/huawei/hwCloudJs/service/hms/a$c;


# direct methods
.method public constructor <init>(ILcom/huawei/hwCloudJs/service/hms/a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/huawei/hwCloudJs/service/hms/a$a;->a:I

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/a$a;->b:Lcom/huawei/hwCloudJs/service/hms/a$c;

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/service/hms/a$b;)Z
    .locals 2

    iget v0, p0, Lcom/huawei/hwCloudJs/service/hms/a$a;->a:I

    invoke-static {p1}, Lcom/huawei/hwCloudJs/service/hms/a$b;->a(Lcom/huawei/hwCloudJs/service/hms/a$b;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/a$a;->b:Lcom/huawei/hwCloudJs/service/hms/a$c;

    invoke-interface {v0, p1}, Lcom/huawei/hwCloudJs/service/hms/a$c;->a(Lcom/huawei/hwCloudJs/service/hms/a$b;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public synthetic onReceive(Lcom/huawei/hwCloudJs/support/b/d;)Z
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/hwCloudJs/service/hms/a$b;

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/service/hms/a$a;->a(Lcom/huawei/hwCloudJs/service/hms/a$b;)Z

    move-result v0

    return v0
.end method
