.class public Lcom/huawei/hwid/update/d/h$d;
.super Lcom/huawei/hwid/update/d/h$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/update/d/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/d/h$a;-><init>(Lcom/huawei/hwid/update/d/h$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Landroid/app/AlertDialog;
    .locals 1

    .line 44
    invoke-super {p0}, Lcom/huawei/hwid/update/d/h$a;->a()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method protected h()I
    .locals 2

    .line 48
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/h$d;->f()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "cs_download_no_space"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
