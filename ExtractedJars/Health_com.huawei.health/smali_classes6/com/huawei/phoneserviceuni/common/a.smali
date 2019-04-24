.class public Lcom/huawei/phoneserviceuni/common/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/huawei/phoneserviceuni/common/a;


# instance fields
.field private b:Landroid/app/Application;

.field private c:Lcom/huawei/phoneserviceuni/common/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/huawei/phoneserviceuni/common/a;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/a;-><init>()V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/a;->a:Lcom/huawei/phoneserviceuni/common/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/a;->b:Landroid/app/Application;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/a;->c:Lcom/huawei/phoneserviceuni/common/b;

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Application;
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a;->b:Landroid/app/Application;

    if-nez v0, :cond_0

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Common module app has not inited !!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a;->b:Landroid/app/Application;

    return-object v0
.end method

.method public a(Landroid/app/Application;Lcom/huawei/phoneserviceuni/common/b;)V
    .locals 2

    .line 38
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 39
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Common module init param cannot be null!!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 42
    :cond_1
    iput-object p1, p0, Lcom/huawei/phoneserviceuni/common/a;->b:Landroid/app/Application;

    .line 43
    iput-object p2, p0, Lcom/huawei/phoneserviceuni/common/a;->c:Lcom/huawei/phoneserviceuni/common/b;

    .line 44
    return-void
.end method

.method public b()Lcom/huawei/phoneserviceuni/common/b;
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a;->c:Lcom/huawei/phoneserviceuni/common/b;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Common module data has not inited !!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a;->c:Lcom/huawei/phoneserviceuni/common/b;

    return-object v0
.end method

.method public c()Lcom/huawei/phoneserviceuni/common/b;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/a;->c:Lcom/huawei/phoneserviceuni/common/b;

    return-object v0
.end method
