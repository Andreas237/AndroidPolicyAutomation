.class public Lcom/huawei/hms/update/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/a/a/c;->a:I

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/update/a/a/c;->b:Ljava/lang/String;

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/update/a/a/c;->c:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/a/a/c;->d:I

    .line 56
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/update/a/a/c;->e:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/a/a/c;->a:I

    .line 41
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/update/a/a/c;->b:Ljava/lang/String;

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/update/a/a/c;->c:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hms/update/a/a/c;->d:I

    .line 56
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hms/update/a/a/c;->e:Ljava/lang/String;

    .line 26
    iput-object p1, p0, Lcom/huawei/hms/update/a/a/c;->b:Ljava/lang/String;

    .line 27
    iput p2, p0, Lcom/huawei/hms/update/a/a/c;->a:I

    .line 28
    iput-object p3, p0, Lcom/huawei/hms/update/a/a/c;->c:Ljava/lang/String;

    .line 29
    iput p4, p0, Lcom/huawei/hms/update/a/a/c;->d:I

    .line 30
    iput-object p5, p0, Lcom/huawei/hms/update/a/a/c;->e:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/hms/update/a/a/c;->a:I

    if-lez v0, :cond_0

    iget v0, p0, Lcom/huawei/hms/update/a/a/c;->d:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/a/a/c;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hms/update/a/a/c;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
