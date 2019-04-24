.class public Lcom/huawei/health/suggestion/data/DataSyncService$e;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DataSyncService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field c:Lcom/huawei/health/suggestion/data/DataSyncService$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public d()Lcom/huawei/health/suggestion/data/DataSyncService$a;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$e;->c:Lcom/huawei/health/suggestion/data/DataSyncService$a;

    return-object v0
.end method

.method public d(Lcom/huawei/health/suggestion/data/DataSyncService$a;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$e;->c:Lcom/huawei/health/suggestion/data/DataSyncService$a;

    .line 47
    return-void
.end method
