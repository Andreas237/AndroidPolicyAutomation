.class final Lcom/huawei/hwid/update/d/k$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/update/d/k;->b(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/update/a/a/b;

.field final synthetic b:I

.field final synthetic c:Lcom/huawei/hwid/update/a/a/c;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/update/a/a/b;ILcom/huawei/hwid/update/a/a/c;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lcom/huawei/hwid/update/d/k$2;->a:Lcom/huawei/hwid/update/a/a/b;

    iput p2, p0, Lcom/huawei/hwid/update/d/k$2;->b:I

    iput-object p3, p0, Lcom/huawei/hwid/update/d/k$2;->c:Lcom/huawei/hwid/update/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 455
    iget-object v0, p0, Lcom/huawei/hwid/update/d/k$2;->a:Lcom/huawei/hwid/update/a/a/b;

    iget v1, p0, Lcom/huawei/hwid/update/d/k$2;->b:I

    iget-object v2, p0, Lcom/huawei/hwid/update/d/k$2;->c:Lcom/huawei/hwid/update/a/a/c;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwid/update/a/a/b;->a(ILcom/huawei/hwid/update/a/a/c;)V

    .line 456
    return-void
.end method
