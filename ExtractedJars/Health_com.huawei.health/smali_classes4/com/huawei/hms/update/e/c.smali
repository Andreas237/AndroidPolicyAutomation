.class Lcom/huawei/hms/update/e/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/update/e/b;


# direct methods
.method constructor <init>(Lcom/huawei/hms/update/e/b;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/hms/update/e/c;->a:Lcom/huawei/hms/update/e/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/hms/update/e/c;->a:Lcom/huawei/hms/update/e/b;

    invoke-virtual {v0}, Lcom/huawei/hms/update/e/b;->d()V

    .line 62
    return-void
.end method
