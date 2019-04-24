.class public final Lcom/huawei/hwid/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/b$a;,
        Lcom/huawei/hwid/b$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/huawei/hwid/c;


# direct methods
.method public constructor <init>(Lcom/huawei/hwid/c;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/huawei/hwid/b;->a:Lcom/huawei/hwid/c;

    .line 20
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/b;Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwid/b;->b(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V

    return-void
.end method

.method private b(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/hwid/b;->a:Lcom/huawei/hwid/c;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwid/c;->b(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V

    .line 89
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hwid/b;->a:Lcom/huawei/hwid/c;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwid/c;->a(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V

    .line 84
    return-void
.end method

.method public a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/hwid/UseCase$RequestValues;>(Lcom/huawei/hwid/UseCase<TT;>;TT;Lcom/huawei/hwid/UseCase$a;)V"
        }
    .end annotation

    .line 24
    invoke-virtual {p1, p2}, Lcom/huawei/hwid/UseCase;->a(Lcom/huawei/hwid/UseCase$RequestValues;)V

    .line 25
    new-instance v0, Lcom/huawei/hwid/b$a;

    invoke-direct {v0, p3, p0}, Lcom/huawei/hwid/b$a;-><init>(Lcom/huawei/hwid/UseCase$a;Lcom/huawei/hwid/b;)V

    invoke-virtual {p1, v0}, Lcom/huawei/hwid/UseCase;->a(Lcom/huawei/hwid/UseCase$a;)V

    .line 26
    iget-object v0, p0, Lcom/huawei/hwid/b;->a:Lcom/huawei/hwid/c;

    new-instance v1, Lcom/huawei/hwid/b$b;

    invoke-direct {v1, p1}, Lcom/huawei/hwid/b$b;-><init>(Lcom/huawei/hwid/UseCase;)V

    invoke-interface {v0, v1}, Lcom/huawei/hwid/c;->a(Ljava/lang/Runnable;)V

    .line 27
    return-void
.end method
