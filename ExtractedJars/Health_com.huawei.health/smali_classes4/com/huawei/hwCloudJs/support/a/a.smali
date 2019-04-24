.class public Lcom/huawei/hwCloudJs/support/a/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/Object;

.field private e:I

.field private f:I

.field private g:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/support/a/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/support/a/a;->d:Ljava/lang/Object;

    iput p4, p0, Lcom/huawei/hwCloudJs/support/a/a;->e:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/a;->g:J

    iput p3, p0, Lcom/huawei/hwCloudJs/support/a/a;->f:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/support/a/a;->f:I

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/support/a/a;->f:I

    return-void
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/hwCloudJs/support/a/a;->g:J

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/support/a/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/support/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/a;->g:J

    return-wide v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/support/a/a;->e:I

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/a/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/a/a;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/support/a/a;->e:I

    return v0
.end method
