.class Lcom/huawei/hms/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/b/a;


# direct methods
.method constructor <init>(Lcom/huawei/hms/b/a;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/hms/b/b;->a:Lcom/huawei/hms/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hms/b/b;->a:Lcom/huawei/hms/b/a;

    invoke-virtual {v0}, Lcom/huawei/hms/b/a;->d()V

    .line 74
    return-void
.end method
