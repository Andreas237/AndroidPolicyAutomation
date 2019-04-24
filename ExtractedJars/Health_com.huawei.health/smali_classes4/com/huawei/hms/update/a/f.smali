.class Lcom/huawei/hms/update/a/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/hms/update/a/a/c;

.field final synthetic c:Lcom/huawei/hms/update/a/e;


# direct methods
.method constructor <init>(Lcom/huawei/hms/update/a/e;ILcom/huawei/hms/update/a/a/c;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/hms/update/a/f;->c:Lcom/huawei/hms/update/a/e;

    iput p2, p0, Lcom/huawei/hms/update/a/f;->a:I

    iput-object p3, p0, Lcom/huawei/hms/update/a/f;->b:Lcom/huawei/hms/update/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 92
    iget-object v0, p0, Lcom/huawei/hms/update/a/f;->c:Lcom/huawei/hms/update/a/e;

    iget-object v0, v0, Lcom/huawei/hms/update/a/e;->a:Lcom/huawei/hms/update/a/a/b;

    iget v1, p0, Lcom/huawei/hms/update/a/f;->a:I

    iget-object v2, p0, Lcom/huawei/hms/update/a/f;->b:Lcom/huawei/hms/update/a/a/c;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hms/update/a/a/b;->a(ILcom/huawei/hms/update/a/a/c;)V

    .line 93
    return-void
.end method
