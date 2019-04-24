.class public Lcom/huawei/common/applog/bean/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/huawei/common/applog/bean/a;->a:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/huawei/common/applog/bean/a;->b:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lcom/huawei/common/applog/bean/a;->c:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/common/applog/bean/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/common/applog/bean/a;->a:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/common/applog/bean/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/common/applog/bean/a;->b:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/common/applog/bean/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/common/applog/bean/a;->c:Ljava/lang/String;

    .line 55
    return-void
.end method
