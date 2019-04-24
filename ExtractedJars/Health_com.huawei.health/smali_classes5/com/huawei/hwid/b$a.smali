.class final Lcom/huawei/hwid/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/UseCase$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/huawei/hwid/UseCase$a;

.field private final b:Lcom/huawei/hwid/b;


# direct methods
.method public constructor <init>(Lcom/huawei/hwid/UseCase$a;Lcom/huawei/hwid/b;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lcom/huawei/hwid/b$a;->a:Lcom/huawei/hwid/UseCase$a;

    .line 99
    iput-object p2, p0, Lcom/huawei/hwid/b$a;->b:Lcom/huawei/hwid/b;

    .line 100
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/huawei/hwid/b$a;->b:Lcom/huawei/hwid/b;

    iget-object v1, p0, Lcom/huawei/hwid/b$a;->a:Lcom/huawei/hwid/UseCase$a;

    invoke-virtual {v0, p1, v1}, Lcom/huawei/hwid/b;->a(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V

    .line 105
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/huawei/hwid/b$a;->b:Lcom/huawei/hwid/b;

    iget-object v1, p0, Lcom/huawei/hwid/b$a;->a:Lcom/huawei/hwid/UseCase$a;

    invoke-static {v0, p1, v1}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/b;Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V

    .line 110
    return-void
.end method
